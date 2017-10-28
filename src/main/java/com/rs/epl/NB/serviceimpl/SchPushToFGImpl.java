package com.rs.epl.NB.serviceimpl;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.fa.component.policy.Iicoverage;
import com.fa.component.policy.Payment;
import com.fa.component.policy.Policy;
import com.fa.component.policy.Policycoverage;
import com.fa.component.policy.Policyitem;
import com.firstapex.rs.epl.NB.common.ENEplProperties;
import com.firstapex.rs.uw.webservices.policymovements.ChequeVO;
import com.firstapex.rs.uw.webservices.policymovements.ClientVO;
import com.firstapex.rs.uw.webservices.policymovements.CoverageVO;
import com.firstapex.rs.uw.webservices.policymovements.CreditCardVO;
import com.firstapex.rs.uw.webservices.policymovements.DoMotorNewBusinessPortTypeProxy;
import com.firstapex.rs.uw.webservices.policymovements.ErrorDetailVO;
import com.firstapex.rs.uw.webservices.policymovements.FguwPolicyVO;
import com.firstapex.rs.uw.webservices.policymovements.FguwResponseVO;
import com.firstapex.rs.uw.webservices.policymovements.MandateVO;
import com.firstapex.rs.uw.webservices.policymovements.OldPolicyVO;
import com.firstapex.rs.uw.webservices.policymovements.PolicyCoverageVO;
import com.firstapex.rs.uw.webservices.policymovements.RsItemSectionVO;
import com.firstapex.rs.uw.webservices.policymovements.RsUserTextVO;
import com.firstapex.rs.uw.webservices.policymovements.RsVehicleVO;
import com.firstapex.rs.uw.webservices.policymovements.SettlementVO;
import com.rs.epl.NB.oementity.FristgenErrors;
import com.rs.epl.NB.oemrepository.Policyinfo;
import com.rs.epl.NB.policyrepository.FgError;
import com.rs.epl.NB.policyrepository.PolicyRepository;
import com.rs.epl.NB.policyrepository.Status;
import com.rs.epl.NB.service.SchedulPushToFG;

@Service
public class SchPushToFGImpl implements SchedulPushToFG {
	protected final Logger logger = Logger.getLogger(getClass());
	
	@Resource
	PolicyRepository polrepo;
		
//	@Resource
//	Policyerrorsrepo errorrepo;
	
//	@Resource
//	ReceiptFaStatusRepository reciptstatus;
	
	@Resource
	public  Policyinfo  Omepolicyrepo1;
	
    @Resource
    FgError FGPolicyerror;
	
	FguwResponseVO respVo=null;
	
		@Override
		public void NewBussinessPushToFg(Policy eplpolicy,Status policustatus) throws Exception {
//			TtrnPolicy OmePolicy1=Omepolicyrepo1.findOne(polno);
//			try {
//				if(OmePolicy1.getWebserviceStatus().equalsIgnoreCase("Retry With Valid Data")){
//					return;
//				}				
//			} catch (Exception e) {
//					
//		}

			Long k=eplpolicy.getPolid();
			String stx5=null;
			Set<Payment> paym = eplpolicy.getPayments();
			Payment ppay = paym.iterator().next();
			Long payid=ppay.getId();
			String respXMLup=null;
			String polno=eplpolicy.getPolno();
			   try {
					FguwPolicyVO policyVo1 =new FguwPolicyVO();
					policyVo1=loadPolicyData(eplpolicy,polno);
					respVo = pushToFG(policyVo1,payid,k,eplpolicy,polno);
		            FGObjToXML convertxml=new FGObjToXML();
		            StringWriter inputxml=convertxml.policyobjtoXML(policyVo1);
		            stx5=inputxml.toString();
		            logger.info(stx5);	
		            if(respVo!=null){
				    commonstatus(stx5,respVo,eplpolicy);
		            	
		              if(null!=respVo.getStatus() && respVo.getStatus().equalsIgnoreCase("FAIL")){
		            	  failstatus(stx5,respVo,eplpolicy);         	  
		              }else if(null == respVo.getStatus()){
		            	  respXMLup = responseToXML(respVo,polno);	            	  
		            	  String Mfgcode=eplpolicy.getMfgcode().toUpperCase();
			      			switch (Mfgcode) {
			      			case "ADITHYA":
			      				Omepolicyrepo1.MasterAbiblFail(polno);
			      				Omepolicyrepo1.UpateForFailedPolicy("FAIL","N/A","Y",polno);	
			      				break;
			      			case "FORD":
			      				Omepolicyrepo1.MasterFordFail(polno);
			      				Omepolicyrepo1.UpateForFailedPolicy("FAIL","N/A","Y",polno);
			      				break;
			      			case "HON":
			      				Omepolicyrepo1.MasterHondaFail(polno);
			      				Omepolicyrepo1.UpateForFailedPolicy("FAIL","N/A","Y",polno);
			      				break;
			      			case "MAHINDRA":
			      				Omepolicyrepo1.MasterMahindraFail(polno);
			      				Omepolicyrepo1.UpateForFailedPolicy("FAIL","N/A","Y",polno);						
			      				break;
			      			case "MARUTI":
			      				Omepolicyrepo1.MasterMarutiFail(polno);
			      				Omepolicyrepo1.UpateForFailedPolicy("FAIL","N/A","Y",polno);	
			      				break;
			      			case "TATA":
			      				Omepolicyrepo1.MasterTataFail(polno);
			      				Omepolicyrepo1.UpateForFailedPolicy("FAIL","N/A","Y",polno);
			      				break;
			      			default:	            	  
			      		} 
			      			
			      			polrepo.Updatefail(stx5,respXMLup,"N/A",polno);
		            }		              
		       }	
			
			} catch (Exception e) {		
                StringWriter errors = new StringWriter();
                
               e.printStackTrace(new PrintWriter(errors));
                
               String err =errors.toString();
               
	      	    polrepo.Updatefail(err,"N/A",e.toString(),polno);
              	Omepolicyrepo1.UpateForPolicy("Retry Policy With Valid Data",e.getMessage(),"N",polno);
			}
	     }

		private void commonstatus(String stx5, FguwResponseVO respVo2, Policy eplpolicy) {	
			String polno=eplpolicy.getPolno();
//			polstatus.setPolicyno(polno);
//			polstatus.setPolicy_requestxml(stx5);	
//			polstatus.setPolicy_responsexml("N/A");	
//			polstatus.setPolicy_errordeatils("N/A");		
//			polstatus.setPolicy_attempt_time(new Date());				
			if(null!=respVo2 && null!=respVo2.getStatus() &&
					respVo2.getStatus().equalsIgnoreCase("SUCCESS")){
				String Mfgcode=eplpolicy.getMfgcode().toUpperCase();
				switch (Mfgcode) {
				case "ADITHYA":
					Omepolicyrepo1.MasterAbibl(polno);
					Omepolicyrepo1.UpateForPolicy("SUCCESS","N/A","Y",polno);
					break;
				case "FORD":						
					Omepolicyrepo1.MasterFord(polno);
					Omepolicyrepo1.UpateForPolicy("SUCCESS","N/A","Y",polno);
					break;
				case "HON":
					Omepolicyrepo1.MasterHonda(polno);
					Omepolicyrepo1.UpateForPolicy("SUCCESS","N/A","Y",polno);
					break;
				case "MAHINDRA":
					Omepolicyrepo1.MasterMahindra(polno);
					Omepolicyrepo1.UpateForPolicy("SUCCESS","N/A","Y",polno);
					break;
				case "MARUTI":
					Omepolicyrepo1.MasterMaruti(polno);
					Omepolicyrepo1.UpateForPolicy("SUCCESS","N/A","Y",polno);
					break;
				case "TATA":
					Omepolicyrepo1.MasterTata(polno);
					Omepolicyrepo1.UpateForPolicy("SUCCESS","N/A","Y",polno);
					break;
				default:
				}

				polrepo.Updatesuccess(stx5,new Date(),eplpolicy.getPolno());
			}		
		}
	private void failstatus(String stx5, FguwResponseVO respVo2, Policy eplpolicy) {
		String respXML = responseToXML(respVo,eplpolicy.getPolno());
		StringBuilder completeError = new StringBuilder();									
		try {	
			  int g=respXML.indexOf("<errorMsg>");
			  int h=respXML.indexOf("</errorMsg>");
			  String erroemessage=respXML.substring(g,h).replaceAll("<errorMsg>", "");
			   if(!erroemessage.equalsIgnoreCase("null")){
                if(erroemessage.contains(" | ")){
                   String [] erercodes=erroemessage.split(" | ");			                            
                   List<String> list = new ArrayList<String>(Arrays.asList(erercodes));
                   list.removeAll(Collections.singleton("|"));
                   erercodes=list.toArray(new String[0]);			                          
                   for(String error:erercodes){
                   	FristgenErrors errdetails=FGPolicyerror.findOne(error);
                   	String details=errdetails.getErrorDetails();
                   	String code=errdetails.getErrorcode();
                   	completeError.append(code+"========>"+details+"\r\n ");
                   }

             }else{
               	FristgenErrors errdetails=FGPolicyerror.findOne(erroemessage);
               	String details=errdetails.getErrorDetails();
               	String code=errdetails.getErrorcode();
               	completeError.append(code+"========>"+details+"\r\n ");				                    	  
             }
				
			}else if(respXML.contains("<ErrorDetail>")){
				int i=respXML.indexOf("<ErrorDetail>");
				int j=respXML.lastIndexOf("</ErrorDetail>");
				String stx2=respXML.substring(i, j);										
                String ram=stx2.replaceAll("<.*?>", "  ").trim().replace("  " , "=>").replaceAll("=>=>=>=>null=>=>null", "");	
               completeError.append(ram);
		
			}

		} catch (Exception e){
			completeError.append("Unable To Capture ErrorDetails Please Refer Status Table");			
		}	
		String polno=eplpolicy.getPolno();
  	  String Mfgcode=eplpolicy.getMfgcode().toUpperCase();
			switch (Mfgcode) {
			case "ADITHYA":
				Omepolicyrepo1.MasterAbiblFail(polno);
				Omepolicyrepo1.UpateForFailedPolicy("FAIL",completeError.toString(),"Y",polno);	
				break;
			case "FORD":
				Omepolicyrepo1.MasterFordFail(polno);
				Omepolicyrepo1.UpateForFailedPolicy("FAIL",completeError.toString(),"Y",polno);
				break;
			case "HON":
				Omepolicyrepo1.MasterHondaFail(polno);
				Omepolicyrepo1.UpateForFailedPolicy("FAIL",completeError.toString(),"Y",polno);
				break;
			case "MAHINDRA":
				Omepolicyrepo1.MasterMahindraFail(polno);
				Omepolicyrepo1.UpateForFailedPolicy("FAIL",completeError.toString(),"Y",polno);						
				break;
			case "MARUTI":
				Omepolicyrepo1.MasterMarutiFail(polno);
				Omepolicyrepo1.UpateForFailedPolicy("FAIL",completeError.toString(),"Y",polno);	
				break;
			case "TATA":
				Omepolicyrepo1.MasterTataFail(polno);
				Omepolicyrepo1.UpateForFailedPolicy("FAIL",completeError.toString(),"Y",polno);
				break;
			default:	            	  
		} 	
			
			polrepo.Updatefail(stx5,respXML,completeError.toString(),eplpolicy.getPolno());
//		polstatus.setPolicy_responsexml(respXML);	
//		polstatus.setPolicy_errordeatils(completeError.toString());
    }
//	private List<ErrorDetailVO> geterrorcode(FguwResponseVO respVo) {
//			List<ErrorDetailVO> errorvodes = new ArrayList<ErrorDetailVO>();
//			if(respVo != null){
//				ErrorDetailVO[] errDtlsList1 = respVo.getErrorDetailVOList();
//				if (null != errDtlsList1 && errDtlsList1.length > 0) {
//					for (ErrorDetailVO errDtl1 : errDtlsList1) {
//						errDtl1.getErrorCode();
//						errorvodes.add(errDtl1);
//					}
//				}else{
//					if(respVo.getErrorMsg()!=null){
//						ErrorDetailVO errvo=new ErrorDetailVO();
//						errvo.setErrorCode(respVo.getErrorMsg());
//						errorvodes.add(errvo);
//					}else{
//						ErrorDetailVO errvo=new ErrorDetailVO();
//						if(respVo.getStatus()!=null && respVo.getStatus().equalsIgnoreCase("SUCCESS")){
//							errvo.setErrorCode("SUCCESS");
//						}else{
//							errvo.setErrorCode("No Error From FG Response VO");
//						}
//						errorvodes.add(errvo);
//					}
//				}
//			}
//			return errorvodes;
//		}

		public FguwPolicyVO loadPolicyData(Policy polic,String polno) throws Exception {

			FguwPolicyVO policyVo = new FguwPolicyVO();
			ClientVO cliVO = new ClientVO();

			// InputStream input =
			// getClass().getClassLoader().getResourceAsStream("configuration/enepl.properties");
			// Properties prop = new Properties();
			// prop.load(input);
			ENEplProperties prop = ENEplProperties.getEnEplProperties();
//			java.util.Properties properties = new Properties();
//			properties.load(new FileInputStream("D://EPL-NB-PROPS//connection.properties"));
			policyVo.setOprId(prop.getOperatorid());
			if(polno.length()>=16){
				policyVo.setPolNo(polno);
			}else{
				policyVo.setPolNo(polno+"000100");				
			}
			policyVo.setEndtNo("000");
			policyVo.setIUWP1_ENDT_REAS("00");
			policyVo.setIUWP1_PRD_CD(polic.getProductcode());
			policyVo.setIUWP1_ACC_CD(polic.getAgentcode());
			
/*			if(polno.startsWith("FOP") || polno.startsWith("FOQ")){
				policyVo.setIUWP1_POL_WARR(polic.getProposalno());				
			}else{
				if(polic.getProposalno()!=null){
					policyVo.setIUWP1_POL_WARR(polic.getProposalno());					
				}else{
					policyVo.setIUWP1_POL_WARR(polno);
				}
			}*/
			
			policyVo.setIUWP1_CAT_CD("D");
			policyVo.setIUWP1_BR_CD(polic.getBranchcode());
			policyVo.setIsNewAgent("N");
			policyVo.setIUWP1_OLD_POL_NO(polic.getPreviouspolno());
			if(polic.getPolicyclient().getIsexistingclient()){
			policyVo.setIsNewClient("Y");
			policyVo.setClientUpdateFlag("N");
//			policyVo.setIsNewClient("N");
			}else{
				policyVo.setClientUpdateFlag("Y");
				policyVo.setIsNewClient("N");
			}
			policyVo.setIUWP1_CLI_CD(polic.getPolicyclient().getCode());
			policyVo.setIUWP1_POL_NO_GEN_ID("S");
			Set<Policyitem> politems = polic.getPolicyitems();
			Policyitem politem = politems.iterator().next();
			policyVo.setIUWP1_DOM(politem.getPrivatecaritem().getDomicile());
			policyVo.setIUWP1_TERR(politem.getPrivatecaritem().getRegstatecode());
			policyVo.setIUWP1_UWYR(polic.getUwyr());
			policyVo.setIUWP1_BUS_TP("DR");
			
			policyVo.setIUWP1_ORACC_CD(polic.getOacode());
			policyVo.setIUWP1_TERM("01");
			
			policyVo.setIUWP1_OTH_INT_PTY_CD1(polic.getAgentcode());
			policyVo.setIUWP1_OTH_INT_PTY_CD2(polic.getBdocode());
			Set<Payment> spay = polic.getPayments();
			Payment pay = spay.iterator().next();
			if(polic.getSETTLEMENT_TYPE().equalsIgnoreCase("CD")){
				
			}else{
				
				policyVo.setIUWP1_METH_PAY(pay.getPaymenttype());	
				
			}
			policyVo.setIUWP1_INSTL_MODE("A");
		    policyVo.setIUWP1_RN_CD("Y");
			///// Double.toString(polic.getPolicypremium()
			policyVo.setIUWP1_PRM_CUR("INR");
//			Double d = polic.getPolicysuminsuredamount();
			policyVo.setPrimeIUWP1_INCR_SI(new BigDecimal(polic.getPolicysuminsuredamount()));
//			policyVo.setIUWP1_COV_NOTE_NO(polic.getCovernoteno());
			// Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			// policyVo.setIUWP1_COV_NOTE_DT(formatter.format(polic.getCovernotedate()));
			policyVo.setIUWP1_ICP_DT(polic.getPolstartdate());
			policyVo.setIUWP1_EXP_DT(polic.getPolexpirydate());
			policyVo.setIUWP1_ISS_DT(polic.getCreationdate());
			policyVo.setIUWP1_ACC_DT(polic.getAccountDate());
			policyVo.setIUWP1_EFF_DT(polic.getEffectivedate());
			policyVo.setIUWP1_PROPOSAL_DT(polic.getProposalDate());
			policyVo.setStrIUWP1_ICP_TM(polic.getPolStartTime());
			policyVo.setStrIUWP1_EXP_TM(polic.getPolExpTime());
			
			if(polic.getPolicyclient().getAddress1() != null && polic.getPolicyclient().getAddress1().length()>40){
				policyVo.setIUWP1_CLI_ADDR_1(polic.getPolicyclient().getAddress1().substring(0, 40));				
			}
			else if(polic.getPolicyclient().getAddress1() != null){
				policyVo.setIUWP1_CLI_ADDR_1(polic.getPolicyclient().getAddress1());
			}
			if(polic.getPolicyclient().getAddress2()!=null && polic.getPolicyclient().getAddress2().length()>40){
			policyVo.setIUWP1_CLI_ADDR_2(polic.getPolicyclient().getAddress2().substring(0, 40));
			}
			else if(polic.getPolicyclient().getAddress2()!=null){
				policyVo.setIUWP1_CLI_ADDR_2(polic.getPolicyclient().getAddress2());
			}
			if(polic.getPolicyclient().getAddress3()!=null && polic.getPolicyclient().getAddress3().length()>40){
				policyVo.setIUWP1_CLI_ADDR_3(polic.getPolicyclient().getAddress3().substring(0, 40));				
			}
			else if(polic.getPolicyclient().getAddress3()!=null){
				policyVo.setIUWP1_CLI_ADDR_3(polic.getPolicyclient().getAddress3());
			}
			if(polic.getPolicyclient().getAddress4()!=null && polic.getPolicyclient().getAddress4().length()>40){
				policyVo.setIUWP1_CLI_ADDR_4(polic.getPolicyclient().getAddress4().substring(0, 40));				
			}
			else if(polic.getPolicyclient().getAddress4()!=null){
				policyVo.setIUWP1_CLI_ADDR_4(polic.getPolicyclient().getAddress4());
			}
			if(polic.getSETTLEMENT_TYPE().equalsIgnoreCase("CD")){
				
				policyVo.setBankCode(pay.getDepositingBankCode());

				
			}else{
				policyVo.setReceiptNumber(pay.getCBC());
				policyVo.setVoucherAmount(new BigDecimal(pay.getPaymentamount()));
				policyVo.setCardType(pay.getInstrumenttype());
				policyVo.setBankCode(pay.getDepositingBankCode());
			}
			
			// policyVo.setVipFlag(Boolean.toString(polic.getPolicyclient().getIsvip()));
			policyVo.setPanNo(polic.getPolicyclient().getPannumber());
			policyVo.setIsNewNominee("N");
			policyVo.setIUWP1_SI_CUR("INR");

			///////////// Client Data Set////////////////////////
			cliVO.setIUWPC_FIRSTNAME2(polic.getPolicyclient().getFirstname());
			cliVO.setIUWPC_STATE_CD(polic.getPolicyclient().getStatecode());
			if (polic.getPolicyclient().getIscorporateclient()) {
				cliVO.setIUWPC_CLI_TP("O");
			} else {
				cliVO.setIUWPC_CLI_TP("I");
				if(polic.getPolicyclient().getMiddlename()!=null){
					String middle=polic.getPolicyclient().getMiddlename()+" "+polic.getPolicyclient().getLastname();
					if(middle.length()>30){
						cliVO.setIUWPC_SURNAME2(middle.substring(0, 30));
					}else{						
						cliVO.setIUWPC_SURNAME2(middle);
					}
				}else{
					cliVO.setIUWPC_SURNAME2(polic.getPolicyclient().getLastname());
				}
			}
			cliVO.setIUWPC_2ND_ZIP(polic.getPolicyclient().getPincode().toString());
			cliVO.setIUWPC_CON_CD("IND");//LOKESH
			policyVo.setClientVO(cliVO);
			Set<Policycoverage> spolCovera = polic.getPolicycoverages();
			PolicyCoverageVO[] arrpolcov;
			List<PolicyCoverageVO> listpolcovVO = new ArrayList<PolicyCoverageVO>();
			List<String> polcoverexeclusions= new ArrayList<>();
			polcoverexeclusions.add("Zcmtx");
			polcoverexeclusions.add("ZCMTX");
			polcoverexeclusions.add("ZCM");
			for (Policycoverage polcov : spolCovera) {
				if(polcoverexeclusions.contains(polcov.getCode())){
					continue;				
				}				
				PolicyCoverageVO polcovVO = new PolicyCoverageVO();
				polcovVO.setIUWP4_COVG_CD(polcov.getCode());
				polcovVO.setPrimeIUWP4_NEW_INCR_PREM(new BigDecimal(polcov.getPremium()==null?"0":polcov.getPremium()));
				polcovVO.setIUWP4_PREM_CURR_RATE(new BigDecimal(1));
				polcovVO.setIUWP4_PREM_CURR("INR");
				listpolcovVO.add(polcovVO);
			}
//			 String[] arr = list.toArray(new String[list.size()]);
			arrpolcov = listpolcovVO.toArray(new PolicyCoverageVO[listpolcovVO.size()]);
			policyVo.setPolicyCoverageVOList(arrpolcov);
			Set<Iicoverage> setiicoverage = politem.getIicoverages();
//			RsItemSectionVO[] Rsiitems = new RsItemSectionVO[200000000];
			List<RsItemSectionVO> listrsitems = new ArrayList<RsItemSectionVO>();
			RsItemSectionVO onersitem = new RsItemSectionVO();
			OldPolicyVO old=new OldPolicyVO();			
			old.setIUWP2_OLD_EXP_DT(polic.getLineofbusiness());
			old.setIUWP2_OLD_INS_CD(polic.getModeofbusiness());
			if(null!=old){
				onersitem.setOldPolicyVO(old);				
			}
		    onersitem.setIUWP2_ITEM_NO("00001");
			onersitem.setIUWP2_SECT_NO("01");
			onersitem.setIUWP2_DESC12(politem.getPrivatecaritem().getMostlydrivenarea());
			onersitem.setIUWP2_DESC1(politem.getPrivatecaritem().getHypothecatedto());
			onersitem.setPrimeIUWP2_INCR_SI(new BigDecimal(polic.getPolicysuminsuredamount()));
			onersitem.setIUWP2_COVER_CD(politem.getPrivatecaritem().getFgCoverCode());
			onersitem.setIUWP2_EMLX(new BigDecimal(politem.getPrivatecaritem().getEML()));
			onersitem.setIUWP2_ZIP_CD(String.valueOf(politem.getPrivatecaritem().getPincode()));
			onersitem.setIUWP2_TERR_CD(politem.getPrivatecaritem().getRegstatecode());
			onersitem.setIUWP2_DED_CODE(polic.getPolicystatus());//"V05"
			///// Set Driver To Vehicle////////
			RsVehicleVO rsvehicle = new RsVehicleVO();
//			DriverVO driver = new DriverVO();
//			driver.setIUWP2DRVNO("01");
//			DriverVO[] arrdrivers = { driver };
//			rsvehicle.setDriverVOList(arrdrivers);
			/////////// Driver array seted to vehicle//////
			rsvehicle.setIUWP2_MR_TERR(politem.getPrivatecaritem().getZone());
			rsvehicle.setIUWP2_MR_USG_CD(politem.getPrivatecaritem().getTypeofusage());
			if(politem.getPrivatecaritem().getColorofvehicle()!=null){
			rsvehicle.setIUWP2_MR_COLOR(/*"000"+*/politem.getPrivatecaritem().getColorofvehicle());
			}else{
				rsvehicle.setIUWP2_MR_COLOR("0001");
			}
			rsvehicle.setIUWP2_MR_CAP_CC(Integer.valueOf(String.valueOf((politem.getPrivatecaritem().getEnginecapacity()))));
			rsvehicle.setIUWP2_MR_MODEL(politem.getPrivatecaritem().getModelcode());
			rsvehicle.setIUWP2_MR_YR_MFR(politem.getPrivatecaritem().getYom());
			rsvehicle.setStrIUWP2_MR_1ST_REG_DT(politem.getPrivatecaritem().getRegdate());
			rsvehicle.setIUWP2_MR_REGN_NUM(politem.getPrivatecaritem().getRegnum());
			rsvehicle.setIUWP2_MR_CHAS_NUM(politem.getPrivatecaritem().getChassisnumber());
			rsvehicle.setIUWP2_MR_ENG_NUM(politem.getPrivatecaritem().getEnginenumber());
			rsvehicle.setIUWP2_MR_LOG_BOOK(politem.getPrivatecaritem().getImtNumbers());
			rsvehicle.setIUWP2_MR_SEAT_CAP(
					Integer.valueOf(String.valueOf(politem.getPrivatecaritem().getSeatingcapacity())));
			////////// Set one vehicle to rsitem////////////
			onersitem.setRsVehicleVO(rsvehicle);

			List<CoverageVO> listCoverageVo = new ArrayList<CoverageVO>();
//			List<String> Itemcoverexeclusions= new ArrayList<>();
//			Itemcoverexeclusions.add("VPCEXL");
//			Itemcoverexeclusions.add("VPCNCB");
//			Itemcoverexeclusions.add("VPCVPR");
//			Itemcoverexeclusions.add("VPCVTP");
//			Itemcoverexeclusions.add("VPCVVE");
//			Itemcoverexeclusions.add("VPCVLL");
//			Itemcoverexeclusions.add("VPCVTM");
//			Itemcoverexeclusions.add("VPCVEA");
//			Itemcoverexeclusions.add("VPCVFG");
//			Itemcoverexeclusions.add("VPCVWS");
//			Itemcoverexeclusions.add("VPCVOP");
//			Itemcoverexeclusions.add("VPCVGS");
//			Itemcoverexeclusions.add("VPCVDE");
//			Itemcoverexeclusions.add("VPCVNP");
//			Itemcoverexeclusions.add("VPCVNE");
//			Itemcoverexeclusions.add("VPCVPN");
//			Itemcoverexeclusions.add("VPCVLW");
//			Itemcoverexeclusions.add("VPCVAT");
//			Itemcoverexeclusions.add("VPCVLP");
//			Itemcoverexeclusions.add("VPCVCN");
//			Itemcoverexeclusions.add("VPCVXG");
//			Itemcoverexeclusions.add("VPCVNC");
//			Itemcoverexeclusions.add("VPCVNF");
//			Itemcoverexeclusions.add("VPCVLD");
//			Itemcoverexeclusions.add("VPCVFD");
//			Itemcoverexeclusions.add("VPCVXL");
//			Itemcoverexeclusions.add("VPCVFO");
//			Itemcoverexeclusions.add("VPCVM1");
//			Itemcoverexeclusions.add("VPCVDT");
			if(polic.getProductcode().equalsIgnoreCase("VPC")){
				for (Iicoverage iicov : setiicoverage) {					
//					if(Itemcoverexeclusions.contains(iicov.getCode())){
//						continue;				
//					}

					    CoverageVO covvo = new CoverageVO();				    						
						covvo.setIUWP3_COVG_CD(iicov.getCode());
						covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(iicov.getPremium()==null?"0":iicov.getPremium()));
						covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
						covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));
						if(iicov.getCode().equalsIgnoreCase("VPCNCD")){
							covvo.setIUWP3_RT_U(String.valueOf(politem.getPrivatecaritem().getNcbpercentage()));
						}else{
							covvo.setIUWP3_RT_U("0");						
						}											
					listCoverageVo.add(covvo);
				}								
			}
			else if(polic.getProductcode().equalsIgnoreCase("VPCV")){
				for (Iicoverage iicov : setiicoverage) {
					
//					if(iicov.getCode().equalsIgnoreCase("VPCEXL") || iicov.getCode().equalsIgnoreCase("VPCNCB") || iicov.getCode().equalsIgnoreCase("VPCCM1")
//							
//							/*|| iicov.getCode().equalsIgnoreCase("VPCVXL")*/){
//						continue;
//					}					 
//						if(Itemcoverexeclusions.contains(iicov.getCode())){
					
							CoverageVO covvo = new CoverageVO();
							if(iicov.getCode().equalsIgnoreCase("VPCVNC")){
								covvo.setIUWP3_COVG_CD(iicov.getCode());
								covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(iicov.getPremium()==null?"0":iicov.getPremium()));
								covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
								covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));
								covvo.setIUWP3_RT_U(String.valueOf(politem.getPrivatecaritem().getNcbpercentage()));
							}else{
								covvo.setIUWP3_COVG_CD(iicov.getCode());
								covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(iicov.getPremium()==null?"0":iicov.getPremium()));
								covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
								covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));
								covvo.setIUWP3_RT_U("0");							
							}
							listCoverageVo.add(covvo);				
				}
				
			}
			else if(polic.getProductcode().equalsIgnoreCase("VGC")){
				for (Iicoverage iicov : setiicoverage) {

					    CoverageVO covvo = new CoverageVO();

						
							if(iicov.getCode().equalsIgnoreCase("VGCNCD")){
								covvo.setIUWP3_COVG_CD(iicov.getCode());
								covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(iicov.getPremium()==null?"0":iicov.getPremium()));
								covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
								covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));	
								covvo.setIUWP3_RT_U(String.valueOf(politem.getPrivatecaritem().getNcbpercentage()));
							}else{
								covvo.setIUWP3_COVG_CD(iicov.getCode());
								covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(iicov.getPremium()==null?"0":iicov.getPremium()));
								covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
								covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));	
								covvo.setIUWP3_RT_U("0");	
							}
							
						
						
						listCoverageVo.add(covvo);					
				}				
			}
			else if(polic.getProductcode().equalsIgnoreCase("VOC")){
				for (Iicoverage iicov : setiicoverage) {
					    CoverageVO covvo = new CoverageVO();
                     
							if(iicov.getCode().equalsIgnoreCase("VOCNCD")){
								covvo.setIUWP3_COVG_CD(iicov.getCode());
								covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(iicov.getPremium()==null?"0":iicov.getPremium()));
								covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
								covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));
								covvo.setIUWP3_RT_U(String.valueOf(politem.getPrivatecaritem().getNcbpercentage()));
							}else{
								covvo.setIUWP3_COVG_CD(iicov.getCode());
								covvo.setPrimeIUWP3_INCR_PREM(new BigDecimal(iicov.getPremium()==null?"0":iicov.getPremium()));
								covvo.setIUWP3_DEDUCTIBLE_AMT(new BigDecimal(iicov.getDeductibleamount()==null?"0":iicov.getDeductibleamount()));
								covvo.setPrimeIUWP3_INCR_SI(new BigDecimal(iicov.getSuminsuredamount()==null?"0":iicov.getSuminsuredamount()));	
								covvo.setIUWP3_RT_U("0");     	                      
							}							
						
						listCoverageVo.add(covvo);					
				}				
			}
			
		     CoverageVO [] arrpolcov1 = listCoverageVo.toArray(new CoverageVO[listCoverageVo.size()]);
			onersitem.setCoverageVOList(arrpolcov1);
			listrsitems.add(onersitem);
			RsItemSectionVO[] Rsiitems = listrsitems.toArray(new RsItemSectionVO[(listrsitems.size())]);
			policyVo.setItemSectionVOList(Rsiitems);

			List<SettlementVO> listSettelVo = new ArrayList<SettlementVO>();
			SettlementVO onesettelvo = new SettlementVO();
			onesettelvo.setIUWP1_ACC_CD(polic.getAgentcode());
			onesettelvo.setIUWP1_STL_REF(pay.getCBC());
			if(polic.getSETTLEMENT_TYPE().equalsIgnoreCase("CD")){				
				onesettelvo.setIUWP1_STL_TYPE(polic.getSETTLEMENT_TYPE());
				onesettelvo.setIUWP1_STL_SRC(polic.getSETTLEMENT_TYPE());				
			}else{			
				onesettelvo.setIUWP1_STL_TYPE("EXISTINGRECT");
				onesettelvo.setIUWP1_STL_SRC("RECT");
			}
			listSettelVo.add(onesettelvo);
			SettlementVO[] arrsettelVo = listSettelVo.toArray(new SettlementVO[listSettelVo.size()]);
			policyVo.setSettlementVOList(arrsettelVo);
			if(polic.getSETTLEMENT_TYPE().equalsIgnoreCase("CD")){}else{			
			  if (pay.getPaymenttype().equalsIgnoreCase("CHQ")){
					ChequeVO chequevo = new ChequeVO();//LOKESH
					chequevo.setIUWCHQ_CHQ_NO(new BigDecimal(pay.getInstrumentnumber()));
					chequevo.setIUWCHQ_CHQ_AMT(new BigDecimal(pay.getPaymentamount()));
					chequevo.setIUWCHQ_CHQ_ISSUE_DT(pay.getPaymentdate());
					chequevo.setIUWCHQ_BANK_AC_NO("0");
					chequevo.setIUWCHQ_ISSUING_BANK(pay.getInstrumentbank());
					chequevo.setIUWCHQ_BANK_BR_CD(polic.getBranchcode());
					chequevo.setIUWCHQ_PAY_TO("RSAIC Limited");
					policyVo.setIUWP1_METH_PAY("CHQ");//LOKESH
					policyVo.setChequeVO(chequevo);
				}
				else if(pay.getPaymenttype().equalsIgnoreCase("Card")){
					CreditCardVO creditcard=new CreditCardVO();
					creditcard.setIUWCR_CARD_NUM(pay.getInstrumentnumber());
					creditcard.setIUWCR_CARD_ISSUER(pay.getInstrumentbank());
					creditcard.setIUWCR_AUTH_NUM(pay.getTRANSCATION_NO());
					creditcard.setIUWCR_CARD_EXP_DT(pay.getInstrumentexpdt());//TO be change on UAT
					creditcard.setIUWCR_CARD_VER_TEXT("CARD MODE PAYMENT");
					policyVo.setCreditCardVO(creditcard);
				}
				else{
					MandateVO bankdebit=new MandateVO();
					bankdebit.setIUWMD_AC_HOLD_NM1(pay.getPayeename());
					bankdebit.setIUWMD_BANK_CD(pay.getDepositingBankCode());
					bankdebit.setIUWMD_BD_AMOUNT(new BigDecimal(pay.getPaymentamount()));
					bankdebit.setIUWMD_BD_CHARGES(new BigDecimal(0) );
					bankdebit.setIUWMD_BD_CURRENCY("INR");
					bankdebit.setIUWMD_BD_DT(pay.getPaymentdate());
					bankdebit.setIUWMD_BD_IFSC_CD(pay.getIfsccode());
					bankdebit.setIUWMD_BD_MICRO_CD(pay.getMicrcode());
					bankdebit.setIUWMD_MANDT_NO(pay.getCBC());
					bankdebit.setIUWMD_BD_TRANS_NO(pay.getTRANSCATION_NO());
					policyVo.setMandateVO(bankdebit);
				}
				
			}
			
			//Lokesh -- Implement Card payment
			RsUserTextVO usrTxt = new RsUserTextVO();
			usrTxt.setIUWP1_ATEXT1(politem.getPrivatecaritem().getRto());//Lokesh Car.RTO
//			usrTxt.setIUWP1_ATEXT2(polic.getPolno()+"000100");//Lokesh polocy No
//			usrTxt.setIUWP1_ATEXT3(politem.getPrivatecaritem().getChassisnumber());//Lokesh
//			usrTxt.setIUWP1_ATEXT4(politem.getPrivatecaritem().getRegcitycode());
			policyVo.setUserTextVO(usrTxt);
			if(polno.length()>=16){
				usrTxt.setIUWP1_ATEXT2(polno);
			}else{
				usrTxt.setIUWP1_ATEXT2(polno+"000100");				
			}
			
			policyVo.setIUWP1_POL_WARR(polic.getProposalno());	
			return policyVo;
		}

		public FguwResponseVO pushToFG(FguwPolicyVO policyVo, Long payid, Long k, Policy pol, String polno) {
			FguwResponseVO respVo = null;
//			DoMotorNewBusinessLocator loc = new DoMotorNewBusinessLocator(pol.getTransactiontype());
			DoMotorNewBusinessPortTypeProxy prox =new DoMotorNewBusinessPortTypeProxy("NB");
			try {
//				respVo = loc.getdoMotorNewBusinessSoapBinding().performMotorNewBusiness(policyVo);
				respVo=prox.performMotorNewBusiness(policyVo);
			} catch (RemoteException /*| ServiceException*/ e) {}
			
			
//			DoMotorNewBusinessLocator loc = new DoMotorNewBusinessLocator();
//			try {
//				respVo = loc.getdoMotorNewBusinessSoapBinding().performMotorNewBusiness(policyVo);
//			} catch (RemoteException | ServiceException e) {
//				try{		
//					PolicyerrorData errset3 = new PolicyerrorData();
//					errset3.setPolicyno(polno);
//					errset3.setReciptno(policyVo.getReceiptNumber());
//					errset3.setPolicyid((long) k);
//					errset3.setReciptid(payid);
//					errset3.setProductCode(pol.getProductcode());
//		            FGObjToXML convertxml1=new FGObjToXML();
//		            StringWriter inputxml=convertxml1.policyobjtoXML(policyVo);
//		            String stx6=inputxml.toString();
//					errset3.setInputXml(stx6);
//					errset3.setMfgcode(pol.getMfgcode());
//					errset3.setMfgname(pol.getMfgname());
//					errset3.setProductId(pol.getProductid());
//					errset3.setAttempttime(new Date());
//					errset3.setStatus("Retry Policy With Valid Data");
//					errset3.setAttempt(1);
//					errset3.setErrorcode(e.getMessage().toString());
//					errset3.setResponsexml("Policy Did not push to FG Refer errorcode");	
//					errset3.setFromsystem("OEM");
//					errorrepo.save(errset3);
//					Omepolicyrepo1.UpateForPolicy("FAIL",e.getMessage(),"N",polno);
//					
//				}
//				catch(Exception e1){
//					logger.info(e1.toString()+" From Recipt Module");
//				}
//				
//			}
			return respVo;
		}

		public String responseToXML(FguwResponseVO respVo, String polno) {
			StringBuffer responseBuffer = new StringBuffer();
			responseBuffer.append("<PolicyResponseVO>");
			responseBuffer.append("<status>" + respVo.getStatus() + "</status>");
			responseBuffer.append("<oprId>" + respVo.getOprId() + "</oprId>");
			responseBuffer.append("<polNo>" + polno + "</polNo>");
			responseBuffer.append("<endtNo>" + respVo.getEndtNo() + "</endtNo>");
			responseBuffer.append("<prdCd>" + respVo.getPrdCd() + "</prdCd>");
			responseBuffer.append("<errorMsg>" + respVo.getErrorMsg() + "</errorMsg>");
			responseBuffer.append("<successMsg>" + respVo.getSuccessMsg() + "</successMsg>");

			ErrorDetailVO[] errDtlsList = respVo.getErrorDetailVOList();
			if (errDtlsList != null && errDtlsList.length > 0) {
				responseBuffer.append("<ErrorDetails>");
				for (ErrorDetailVO errDtl : errDtlsList) {
					responseBuffer.append("<ErrorDetail>");
//					String s = errDtl.getErrorCode();
					responseBuffer.append("<ErrorCode>" + errDtl.getErrorCode() + "</ErrorCode>");
					responseBuffer.append("<ErrorDesc>" + errDtl.getErrorDesc() + "</ErrorDesc>");
					responseBuffer.append("</ErrorDetail>");
				}
			}
			responseBuffer.append("</ErrorDetails>");
			responseBuffer.append("</PolicyResponseVO>");

			logger.info("Response:: " + responseBuffer.toString());
			return responseBuffer.toString();
		}	
}

//respXML = responseToXML(respVo,polno);
//List<ErrorDetailVO> errorcodelist = geterrorcode(respVo);
//Iterator<ErrorDetailVO> it=errorcodelist.iterator();
//StringBuilder listerrorcode = new StringBuilder();
//while(it.hasNext()){
//	ErrorDetailVO errobj=it.next();
//	listerrorcode.append("   "+errobj.getErrorCode()+"   ");	            	
//}
//String errorcode=listerrorcode.toString();
//	   if(respVo.getStatus().equalsIgnoreCase("SUCCESS")) {
//		   try {
//			   PolicyerrorData errset2 = new PolicyerrorData();
//				errset2.setPolicyno(polno);
//				errset2.setReciptno(ppay.getCBC());
//				errset2.setPolicyid((long) k);
//				errset2.setInputXml(stx5);
//				errset2.setProductCode(eplpolicy.getProductcode());
//				errset2.setAttempttime(new Date());
//				errset2.setReciptid(payid);
//				errset2.setProductId(eplpolicy.getProductid());
//				errset2.setMfgcode(eplpolicy.getMfgcode());
//				errset2.setMfgname(eplpolicy.getMfgname());
//				errset2.setStatus(respVo.getStatus());
//				errset2.setAttempt(1);
//				errset2.setErrorcode("N/A");
//				errset2.setResponsexml(respXML);
//				errset2.setFromsystem("OEM");
//				errorrepo.save(errset2);
//				String Mfgcode=eplpolicy.getMfgcode().toUpperCase();
//				switch (Mfgcode) {
//				case "ADITHYA":
//					Omepolicyrepo1.MasterAbibl(polno);
//					Omepolicyrepo1.UpateForPolicy("SUCCESS","N/A","Y",polno);
//					break;
//				case "FORD":						
//					Omepolicyrepo1.MasterFord(polno);
//					Omepolicyrepo1.UpateForPolicy("SUCCESS","N/A","Y",polno);
//					break;
//				case "HON":
//					Omepolicyrepo1.MasterHonda(polno);
//					Omepolicyrepo1.UpateForPolicy("SUCCESS","N/A","Y",polno);
//					break;
//				case "MAHINDRA":
//					Omepolicyrepo1.MasterMahindra(polno);
//					Omepolicyrepo1.UpateForPolicy("SUCCESS","N/A","Y",polno);
//					break;
//				case "MARUTI":
//					Omepolicyrepo1.MasterMaruti(polno);
//					Omepolicyrepo1.UpateForPolicy("SUCCESS","N/A","Y",polno);
//					break;
//				case "TATA":
//					Omepolicyrepo1.MasterTata(polno);
//					Omepolicyrepo1.UpateForPolicy("SUCCESS","N/A","Y",polno);
//					break;
//				default:
//				}
//		} catch (Exception e) {
//			
//		}
// }
//	else if(respVo.getStatus().equalsIgnoreCase("FAIL")){
//		try {
//			PolicyerrorData errset3 = new PolicyerrorData();
//			errset3.setPolicyno(polno);
//			errset3.setReciptno(ppay.getCBC());
//			errset3.setProductId(eplpolicy.getProductid());
//			errset3.setMfgcode(eplpolicy.getMfgcode());
//			errset3.setProductCode(eplpolicy.getProductcode());
//			errset3.setMfgname(eplpolicy.getMfgname());
//			errset3.setStatus(respVo.getStatus());
//			errset3.setInputXml(stx5);
//			errset3.setPolicyid((long) k);
//			errset3.setReciptid(payid);
//			errset3.setAttempttime(new Date());
//			errset3.setAttempt(1);
//			errset3.setFromsystem("OEM");
//			errset3.setStatus(respVo.getStatus());
//			errset3.setErrorcode(errorcode);
//			errset3.setResponsexml(respXML);
//			errorrepo.save(errset3);
//			
//			StringBuilder completeError = new StringBuilder();									
//			try {	
//				  int g=respXML.indexOf("<errorMsg>");
//				  int h=respXML.indexOf("</errorMsg>");
//				  String erroemessage=respXML.substring(g,h).replaceAll("<errorMsg>", "");
//				   if(!erroemessage.equalsIgnoreCase("null")){
//                    if(erroemessage.contains(" | ")){
//                       String [] erercodes=erroemessage.split(" | ");			                            
//                       List<String> list = new ArrayList<String>(Arrays.asList(erercodes));
//                       list.removeAll(Collections.singleton("|"));
//                       erercodes=list.toArray(new String[0]);			                          
//                       for(String error:erercodes){
//                       	FristgenErrors errdetails=FGPolicyerror.findOne(error);
//                       	String details=errdetails.getErrorDetails();
//                       	String code=errdetails.getErrorcode();
//                       	completeError.append(code+"========>"+details+"\r\n ");
//                       }
//
//                 }else{
//                   	FristgenErrors errdetails=FGPolicyerror.findOne(erroemessage);
//                   	String details=errdetails.getErrorDetails();
//                   	String code=errdetails.getErrorcode();
//                   	completeError.append(code+"========>"+details+"\r\n ");				                    	  
//                 }
//					
//				}else if(respXML.contains("<ErrorDetail>")){
//					int i=respXML.indexOf("<ErrorDetail>");
//					int j=respXML.lastIndexOf("</ErrorDetail>");
//					String stx2=respXML.substring(i, j);										
//String ram=stx2.replaceAll("<.*?>", "  ").trim().replace("  " , "=>").replaceAll("=>=>=>=>null=>=>null", "");	
//                   completeError.append(ram);
//			
//				}
//
//			} catch (Exception e) {
//				completeError.append("Unable To Capture ErrorDetails Please Refer Status Table");
//				
//			}					
//								
//			
//			String Mfgcode=eplpolicy.getMfgcode().toUpperCase();
//			switch (Mfgcode) {
//			case "ADITHYA":
//				Omepolicyrepo1.MasterAbiblFail(polno);
//				Omepolicyrepo1.UpateForFailedPolicy("FAIL",completeError.toString(),"Y",polno);	
//				break;
//			case "FORD":
//				Omepolicyrepo1.MasterFordFail(polno);
//				Omepolicyrepo1.UpateForFailedPolicy("FAIL",completeError.toString(),"Y",polno);
//				break;
//			case "HON":
//				Omepolicyrepo1.MasterHondaFail(polno);
//				Omepolicyrepo1.UpateForFailedPolicy("FAIL",completeError.toString(),"Y",polno);
//				break;
//			case "MAHINDRA":
//				Omepolicyrepo1.MasterMahindraFail(polno);
//				Omepolicyrepo1.UpateForFailedPolicy("FAIL",completeError.toString(),"Y",polno);						
//				break;
//			case "MARUTI":
//				Omepolicyrepo1.MasterMarutiFail(polno);
//				Omepolicyrepo1.UpateForFailedPolicy("FAIL",completeError.toString(),"Y",polno);	
//				break;
//			case "TATA":
//				Omepolicyrepo1.MasterTataFail(polno);
//				Omepolicyrepo1.UpateForFailedPolicy("FAIL",completeError.toString(),"Y",polno);
//				break;
//			default:
//			}		 		  	
//		} catch (Exception e) {
//			
//		}
//		
//		
//	}


//PolicyerrorData errset3 = new PolicyerrorData();
//errset3.setPolicyno(polno);
//errset3.setReciptno(ppay.getCBC());
//errset3.setProductId(eplpolicy.getProductid());
//errset3.setMfgcode(eplpolicy.getMfgcode());
//errset3.setProductCode(eplpolicy.getProductcode());
//errset3.setMfgname(eplpolicy.getMfgname());
//errset3.setStatus("Retry Policy With Valid Data");
//errset3.setInputXml("Before Push To FirstGen Handled By Invalid Data Exception");
//errset3.setPolicyid((long) k);
//errset3.setReciptid(payid);
//errset3.setAttempttime(new Date());
//errset3.setAttempt(1);
//errset3.setErrorcode("Invalid Request For Policy Creation");
//errset3.setResponsexml(e.toString());
//errset3.setFromsystem("OEM");
//errorrepo.save(errset3);






//List<ErrorDetailVO> errorcodelist = geterrorcode(respVo2);
//Iterator<ErrorDetailVO> it=errorcodelist.iterator();
//StringBuilder listerrorcode = new StringBuilder();
//while(it.hasNext()){
//	ErrorDetailVO errobj=it.next();
//	listerrorcode.append("   "+errobj.getErrorCode()+"   ");	            	
//}
//String errorcode=listerrorcode.toString();
//