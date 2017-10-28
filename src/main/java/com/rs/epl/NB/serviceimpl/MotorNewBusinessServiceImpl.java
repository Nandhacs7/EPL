package com.rs.epl.NB.serviceimpl;

//import java.io.StringWriter;
//import java.io.File;
//	import java.io.InputStream;
//import java.math.BigDecimal;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.rmi.RemoteException;
//	import java.text.Format;
//	import java.text.SimpleDateFormat;
/*import java.util.ArrayList;*/
/*import java.util.List;*/
//	import java.util.Properties;
//import java.util.Set;

/*import com.rs.epl.NB.dtoresponse.DataTableDto;
//import com.rs.epl.NB.dtoresponse.NewBussinessresponeseDto;
import com.rs.epl.NB.oementity.PolicyerrorData;
import com.rs.epl.NB.policyrepository.Policyerrorsrepo;
//import com.rs.epl.NB.policyentity.Iicoverage;
//import com.rs.epl.NB.policyentity.Payment;
//import com.rs.epl.NB.policyentity.Policy;
//import com.rs.epl.NB.policyentity.Policycoverage;
//import com.rs.epl.NB.policyentity.Policyitem;
//import com.rs.epl.NB.policyrepository.PolicyRepository;
import com.rs.epl.NB.service.*;

//
//import oracle.sql.DATE;

import javax.annotation.Resource;
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Marshaller;
//import javax.xml.namespace.QName;
//import javax.xml.rpc.ServiceException;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
*/
//import com.firstapex.rs.epl.cn.common.EplConstants;
//import com.firstapex.rs.uw.webservices.policymovements.ChequeVO;
//import com.firstapex.rs.uw.webservices.policymovements.ClientVO;
//import com.firstapex.rs.uw.webservices.policymovements.CoverageVO;
//import com.firstapex.rs.uw.webservices.policymovements.DoMotorNewBusiness;
//import com.firstapex.rs.uw.webservices.policymovements.DoMotorNewBusinessPortType;
//import com.firstapex.rs.uw.webservices.policymovements.DoMotorNewBusinessLocator;
//import com.firstapex.rs.uw.webservices.policymovements.DriverVO;
//import com.firstapex.rs.uw.webservices.policymovements.ErrorDetailVO;
//import com.firstapex.rs.uw.webservices.policymovements.FguwPolicyVO;
//import com.firstapex.rs.uw.webservices.policymovements.FguwResponseVO;
//	import com.firstapex.rs.uw.webservices.policymovements.ItemSectionVO;
//import com.firstapex.rs.uw.webservices.policymovements.PolicyCoverageVO;
//import com.firstapex.rs.uw.webservices.policymovements.RsItemSectionVO;
//	import com.firstapex.rs.uw.webservices.policymovements.RsUserTextVO;
//import com.firstapex.rs.uw.webservices.policymovements.RsVehicleVO;
//import com.firstapex.rs.uw.webservices.policymovements.SettlementVO;

/*@Service
public class MotorNewBusinessServiceImpl implements NewMotorBusinessService {
	@Resource
	Policyerrorsrepo errorrepo1;

	@Override
	public DataTableDto<List<NewBussinessresponeseDto>> NewMotorBusinessService1(Integer pageNumber, Integer pageSize,
			Integer sortColumnIndex, String sortOrder, String searchKey, String startDateStr, String endDateStr
			,String searchType) throws Exception {
		DataTableDto<List<NewBussinessresponeseDto>> dt = new DataTableDto<List<NewBussinessresponeseDto>>();
		Page<PolicyerrorData> policyerrorDataPage = null;
		List<PolicyerrorData> policyerrorDataDatas = null;
		PageRequest pageRequest = null;
		List<NewBussinessresponeseDto> NewBussintesserrorDtos = new ArrayList<NewBussinessresponeseDto>();
		pageRequest = sortingPolicyDataChequeCancelData(pageNumber, pageSize, sortColumnIndex, sortOrder);

		if (!searchKey.isEmpty()) {
			if (searchType.equalsIgnoreCase("policyno")) {
				policyerrorDataPage = errorrepo1.findPolicyNoDataSearchDetailsPaging(searchKey, pageRequest);
			} else if (searchType.equalsIgnoreCase("receiptno")) {
				policyerrorDataPage = errorrepo1.findPolicyReceiptDataSearchDetailsPaging(searchKey, pageRequest);
			}
			policyerrorDataDatas = policyerrorDataPage.getContent();
			if (policyerrorDataDatas.size() != 0) {
				if (null != policyerrorDataDatas && !policyerrorDataDatas.isEmpty()) {
					for (PolicyerrorData polerrordata : policyerrorDataDatas) {
						NewBussinessresponeseDto newbussinesserrrorsDto = convertToDto(polerrordata);
						NewBussintesserrorDtos.add(newbussinesserrrorsDto);
					}
				}
			}
		} else {
			policyerrorDataPage = errorrepo1.findAll(pageRequest);
			policyerrorDataDatas = policyerrorDataPage.getContent();
			if (policyerrorDataDatas.size() != 0) {
				if (null != policyerrorDataDatas && !policyerrorDataDatas.isEmpty()) {
					for (PolicyerrorData polerrordata : policyerrorDataDatas) {
						NewBussinessresponeseDto newbussinesserrrorsDto = convertToDto(polerrordata);
						NewBussintesserrorDtos.add(newbussinesserrrorsDto);
					}
				}
			}
		}

		dt.setTableValue(NewBussintesserrorDtos);
		dt.setRecordsFiltered(policyerrorDataPage.getTotalPages());
		dt.setRecordsTotal(policyerrorDataPage.getTotalElements());
		return dt;
	}
	
	@Override
	public DataTableDto<List<NewBussinessresponeseDto>> newMotorBusinessServiceSearching(Integer pageNumber, Integer pageSize,
			Integer sortColumnIndex, String sortOrder, String searchvalue, String startDateStr, String endDateStr
			,String searchType) throws Exception {
		DataTableDto<List<NewBussinessresponeseDto>> dt = new DataTableDto<List<NewBussinessresponeseDto>>();
		Page<PolicyerrorData> policyerrorDataPage = null;
		List<PolicyerrorData> policyerrorDataDatas = null;
		PageRequest pageRequest = null;
		List<NewBussinessresponeseDto> NewBussintesserrorDtos = new ArrayList<NewBussinessresponeseDto>();
		pageRequest = sortingPolicyDataChequeCancelData(pageNumber, pageSize, sortColumnIndex, sortOrder);

		if (!searchvalue.isEmpty()) {
			if (searchType.equalsIgnoreCase("policyno")) {
				policyerrorDataPage = errorrepo1.findPolicyNoDataSearchDetailsPaging(searchvalue, pageRequest);
			} else if (searchType.equalsIgnoreCase("receiptno")) {
				policyerrorDataPage = errorrepo1.findPolicyReceiptDataSearchDetailsPaging(searchvalue, pageRequest);
			}
			policyerrorDataDatas = policyerrorDataPage.getContent();
			if (policyerrorDataDatas.size() != 0) {
				if (null != policyerrorDataDatas && !policyerrorDataDatas.isEmpty()) {
					for (PolicyerrorData polerrordata : policyerrorDataDatas) {
						NewBussinessresponeseDto newbussinesserrrorsDto = convertToDto(polerrordata);
						NewBussintesserrorDtos.add(newbussinesserrrorsDto);
					}
				}
			}
		} 

		dt.setTableValue(NewBussintesserrorDtos);
		dt.setRecordsFiltered(policyerrorDataPage.getTotalPages());
		dt.setRecordsTotal(policyerrorDataPage.getTotalElements());
		return dt;
	}
	
 private NewBussinessresponeseDto convertToDto(PolicyerrorData polerrordata) {
		NewBussinessresponeseDto newfinalresponse = new NewBussinessresponeseDto();
		newfinalresponse.setAttempts(String.valueOf(polerrordata.getAttempt()));
		newfinalresponse.setErrorCode(polerrordata.getErrorcode());
		newfinalresponse.setPolicyId(String.valueOf(polerrordata.getPolicyid()));
		newfinalresponse.setPolicyNo(polerrordata.getPolicyno());
		newfinalresponse.setReceiptId(String.valueOf(polerrordata.getReciptid()));
		newfinalresponse.setReceiptNo(polerrordata.getReciptno());
		newfinalresponse.setResponseXml(polerrordata.getResponsexml());
		newfinalresponse.setStatus(polerrordata.getStatus());
		return newfinalresponse;

	}

 public PageRequest sortingPolicyDataChequeCancelData(Integer pageNumber, Integer pageSize, Integer sortColumnIndex,
			String sortOrder) {

		PageRequest pageRequest = null;

		if (sortColumnIndex == 0 && sortOrder.equals("asc")) {

			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "policyno");

		} else if (sortColumnIndex == 0 && sortOrder.equals("desc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "policyno");

		}  else if (sortColumnIndex == 1 && sortOrder.equals("asc")) {

			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "reciptno");

		} else if (sortColumnIndex == 1 && sortOrder.equals("desc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "reciptno");
		} else if (sortColumnIndex == 2 && sortOrder.equals("asc")) {

			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "policyid");

		} else if (sortColumnIndex == 2 && sortOrder.equals("desc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "policyid");
		}else if (sortColumnIndex == 3 && sortOrder.equals("asc")) {

			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "reciptid");

		} else if (sortColumnIndex == 3 && sortOrder.equals("desc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "reciptid");
		}  else if (sortColumnIndex == 5 && sortOrder.equals("asc")) {

			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "attempt");

		} else if (sortColumnIndex == 5 && sortOrder.equals("desc")) {
			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "attempt");
		} 
//			else if (sortColumnIndex == 7 && sortOrder.equals("asc")) {
//
//			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "errorcode");
//
//		} else if (sortColumnIndex == 7 && sortOrder.equals("desc")) {
//			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "errorcode");
//		} else if (sortColumnIndex == 8 && sortOrder.equals("asc")) {
//
//			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.ASC, "responsexml");
//
//		} else if (sortColumnIndex == 8 && sortOrder.equals("asc")) {
//
//			pageRequest = new PageRequest(pageNumber, pageSize, Sort.Direction.DESC, "responsexml");
//		}
		return pageRequest;
	}	
 
 
 

}*/
