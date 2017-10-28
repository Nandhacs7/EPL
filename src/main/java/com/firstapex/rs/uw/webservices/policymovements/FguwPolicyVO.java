/**
 * FguwPolicyVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.uw.webservices.policymovements;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={"oprId", "polNo", "IUWP1_POL_WARR",
		"endtNo","IUWP1_PRD_CD","collationID","IUWP1_ENDT_REAS","IUWP1_CAT_CD","IUWP1_ACC_CD",
		"IUWP1_BR_CD","isNewAgent","isNewClient","IUWP1_CLI_CD","IUWP1_POL_NO_GEN_ID","IUWP1_DOM","IUWP1_TERR",
		"IUWP1_UWYR","IUWP1_BUS_TP","IUWP1_ORACC_CD","IUWP1_TERM","IUWP1_METH_PAY","IUWP1_INSTL_MODE",
		"IUWP1_RN_CD","IUWP1_OLD_POL_NO","IUWP1_SI_CUR","IUWP1_PRM_CUR","primeIUWP1_INCR_SI","IUWP1_POL_CREF_NO","IUWP1_PLAN_NO","IUWP1_DECLN_NO",
		"IUWP1_COV_NOTE_NO","IUWP1_COV_NOTE_DT","IUWP1_ICP_DT","IUWP1_EXP_DT","IUWP1_ISS_DT","IUWP1_ACC_DT","IUWP1_EFF_DT","IUWP1_PROPOSAL_DT",
		"strIUWP1_ICP_TM","strIUWP1_EXP_TM","clientUpdateFlag","IUWP1_OTH_INT_PTY_CD1","IUWP1_OTH_INT_PTY_CD2","IUWP1_OTH_INT_PTY_CD3","IUWP1_OTH_INT_PTY_CD4","IUWP1_CLI_ADDR_1",
		"IUWP1_CLI_ADDR_2","IUWP1_CLI_ADDR_3","IUWP1_CLI_ADDR_4","receiptNumber","voucherAmount","bankCode","cardType","vipFlag",
		"panNo","vipFlag2","panNo2","isNewNominee","nomineeCode","nomineeDesc","relationWithProposer",
		"relationWithProposerDesc","nomineeDOB","nomineeSex","nomineeMinorFlag","guardianCode",
		"guardianDesc","guardianAge","relationWithNominee","relationWithNomineeDesc","nomineeAddr1",
		"nomineeAddr2","nomineeAddr3","nomineeAddr4","clientVO","creditCardVO","chequeVO","userTextVO",
		"settlementVOList","mandateVO","policyCoverageVOList","itemSectionVOList"})
public class FguwPolicyVO  implements java.io.Serializable {
	
    private java.lang.String oprId;

    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_001::MaxLength=16::ErrorLength=E_FICUW_WS_002 */
    private java.lang.String polNo;

    /* MaxLength=10::ErrorLength=E_FICUW_WS_180::Auxiliary=FIC_COLLATION_VIEW */
    private java.lang.String collationID;

    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_003::MaxLength=3::ErrorLength=E_FICUW_WS_004 */
    private java.lang.String endtNo;

    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_005::MaxLength=4::ErrorLength=E_FICUW_WS_006::Auxiliary=Iaxmprod::ErrorAux=E_FICUW_AUX_001 */
    private java.lang.String IUWP1_PRD_CD;

    /* MaxLength=2::ErrorLength=E_FICUW_WS_007 */
    private java.lang.String IUWP1_ENDT_REAS;

    /* MaxLength=1::ErrorLength=E_FICUW_WS_008 */
    private java.lang.String IUWP1_CAT_CD;

    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_009::MaxLength=8::ErrorLength=E_FICUW_WS_010 */
    private java.lang.String IUWP1_ACC_CD;

    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_011::MaxLength=2::ErrorLength=E_FICUW_WS_012::Auxiliary=Iaxmbrch::ErrorAux=E_FICUW_AUX_002 */
    private java.lang.String IUWP1_BR_CD;

    /* MaxLength=1::ErrorLength=E_FICUW_WS_181 */
    private java.lang.String isNewAgent;

    /* MaxLength=1::ErrorLength=E_FICUW_WS_182 */
    private java.lang.String isNewClient;

    /* MaxLength=8::ErrorLength=E_FICUW_WS_013 */
    private java.lang.String IUWP1_CLI_CD;

    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_014::MaxLength=1::ErrorLength=E_FICUW_WS_015 */
    private java.lang.String IUWP1_POL_NO_GEN_ID;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_016::Auxiliary=Iaxmmccd:DOMC::ErrorAux=E_FICUW_AUX_003 */
    private java.lang.String IUWP1_DOM;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_017::Auxiliary=Iaxmmccd:TERR::ErrorAux=E_FICUW_AUX_004 */
    private java.lang.String IUWP1_TERR;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_018 */
    private java.lang.String IUWP1_UWYR;

    /* MaxLength=2::ErrorLength=E_FICUW_WS_019 */
    private java.lang.String IUWP1_BUS_TP;

    /* MaxLength=8::ErrorLength=E_FICUW_WS_020::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_005 */
    private java.lang.String IUWP1_ORACC_CD;

    /* MaxLength=2::ErrorLength=E_FICUW_WS_021::Auxiliary=Iaxmmccd:TERM::ErrorAux=E_FICUW_AUX_006 */
    private java.lang.String IUWP1_TERM;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_022::Auxiliary=Iaxmmccd:MTHD::ErrorAux=E_FICUW_AUX_007 */
    private java.lang.String IUWP1_METH_PAY;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_023::Auxiliary=Iaxmmccd:MODE::ErrorAux=E_FICUW_AUX_008 */
    private java.lang.String IUWP1_INSTL_MODE;

    /* MaxLength=2::ErrorLength=E_FICUW_WS_024 */
    private java.lang.String IUWP1_RN_CD;

    /* MaxLength=20::ErrorLength=E_FICUW_WS_130 */
    private java.lang.String IUWP1_OLD_POL_NO;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_025 */
    private java.lang.String IUWP1_SI_CUR;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_026 */
    private java.lang.String IUWP1_PRM_CUR;

    /* preDecimalPrecision=15::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_027 */
    private java.math.BigDecimal primeIUWP1_INCR_SI;

    /* MaxLength=20::ErrorLength=E_FICUW_WS_028 */
    private java.lang.String IUWP1_POL_CREF_NO;

    /* MaxLength=3::ErrorLength=E_FICUW_WS_029 */
    private java.lang.String IUWP1_PLAN_NO;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_030 */
    private java.lang.String IUWP1_DECLN_NO;

    /* MaxLength=10::ErrorLength=E_FICUW_WS_031 */
    private java.lang.String IUWP1_COV_NOTE_NO;

    private java.lang.String IUWP1_COV_NOTE_DT;

    private java.lang.String IUWP1_ICP_DT;

    private java.lang.String IUWP1_EXP_DT;

    private java.lang.String IUWP1_ISS_DT;

    private java.lang.String IUWP1_ACC_DT;

    private java.lang.String IUWP1_EFF_DT;

    private java.lang.String IUWP1_PROPOSAL_DT;

    /* MaxLength=6::ErrorLength=E_FICUW_WS_032 */
    private java.lang.String strIUWP1_ICP_TM;

    /* MaxLength=6::ErrorLength=E_FICUW_WS_033 */
    private java.lang.String strIUWP1_EXP_TM;

    /* MaxLength=1::ErrorLength=E_FICUW_WS_034 */
    private java.lang.String clientUpdateFlag;

    /* MaxLength=8::ErrorLength=E_FICUW_WS_035::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_011 */
    private java.lang.String IUWP1_OTH_INT_PTY_CD1;

    /* MaxLength=8::ErrorLength=E_FICUW_WS_036::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_012 */
    private java.lang.String IUWP1_OTH_INT_PTY_CD2;

    /* MaxLength=8::ErrorLength=E_FICUW_WS_037::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_013 */
    private java.lang.String IUWP1_OTH_INT_PTY_CD3;

    /* MaxLength=8::ErrorLength=E_FICUW_WS_038::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_014 */
    private java.lang.String IUWP1_OTH_INT_PTY_CD4;

    /* MaxLength=40::ErrorLength=E_FICUW_WS_039 */
    private java.lang.String IUWP1_CLI_ADDR_1;

    /* MaxLength=40::ErrorLength=E_FICUW_WS_040 */
    private java.lang.String IUWP1_CLI_ADDR_2;

    /* MaxLength=40::ErrorLength=E_FICUW_WS_041 */
    private java.lang.String IUWP1_CLI_ADDR_3;

    /* MaxLength=40::ErrorLength=E_FICUW_WS_042 */
    private java.lang.String IUWP1_CLI_ADDR_4;

    /* MaxLength=10::ErrorLength=E_FICUW_WS_043 */
    private java.lang.String receiptNumber;
    
    private java.lang.String IUWP1_POL_WARR;

	/* preDecimalPrecision=15::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_044 */
    private java.math.BigDecimal voucherAmount;

    /* MaxLength=8::ErrorLength=E_FICUW_WS_045 */
    private java.lang.String bankCode;

    /* MaxLength=15::ErrorLength=E_FICUW_WS_046 */
    private java.lang.String cardType;

    /* MaxLength=1::ErrorLength= */
    private java.lang.String vipFlag;

    /* MaxLength=20::ErrorLength= */
    private java.lang.String panNo;

    /* MaxLength=1::ErrorLength=E_FICUW_WS_183 */
    private java.lang.String vipFlag2;

    /* MaxLength=20::ErrorLength=E_FICUW_WS_184 */
    private java.lang.String panNo2;

    /* MaxLength=1::ErrorLength=E_FICUW_WS_185 */
    private java.lang.String isNewNominee;

    /* MaxLength=8::ErrorLength=E_FICUW_WS_186 */
    private java.lang.String nomineeCode;

    private java.lang.String nomineeDesc;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_187::Auxiliary=Iaxmmccd:PART::ErrorAux=E_FICUW_AUX_029 */
    private java.lang.String relationWithProposer;

    private java.lang.String relationWithProposerDesc;

    /* MaxLength=10::ErrorLength=E_FICUW_WS_189 */
    private java.lang.String nomineeDOB;

    private java.lang.String nomineeSex;

    private java.lang.String nomineeMinorFlag;

    /* MaxLength=8::ErrorLength=E_FICUW_WS_190 */
    private java.lang.String guardianCode;

    private java.lang.String guardianDesc;

    /* preDecimalPrecision=3::postDecimalPrecision=2::ErrorPrecision=E_FICUW_WS_191 */
    private java.math.BigDecimal guardianAge;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_192::Auxiliary=Iaxmmccd:PART::ErrorAux=E_FICUW_AUX_030 */
    private java.lang.String relationWithNominee;

    private java.lang.String relationWithNomineeDesc;

    /* MaxLength=40::ErrorLength=E_FICUW_WS_193 */
    private java.lang.String nomineeAddr1;

    /* MaxLength=40::ErrorLength=E_FICUW_WS_194 */
    private java.lang.String nomineeAddr2;

    /* MaxLength=40::ErrorLength=E_FICUW_WS_195 */
    private java.lang.String nomineeAddr3;

    /* MaxLength=40::ErrorLength=E_FICUW_WS_196 */
    private java.lang.String nomineeAddr4;

    private com.firstapex.rs.uw.webservices.policymovements.ClientVO clientVO;

    private com.firstapex.rs.uw.webservices.policymovements.PolicyCoverageVO[] policyCoverageVOList;

    private com.firstapex.rs.uw.webservices.policymovements.RsItemSectionVO[] itemSectionVOList;

    private com.firstapex.rs.uw.webservices.policymovements.SettlementVO[] settlementVOList;

    private com.firstapex.rs.uw.webservices.policymovements.RsUserTextVO userTextVO;

    private com.firstapex.rs.uw.webservices.policymovements.CreditCardVO creditCardVO;

    private com.firstapex.rs.uw.webservices.policymovements.ChequeVO chequeVO;

    private com.firstapex.rs.uw.webservices.policymovements.MandateVO mandateVO;
    
//    private com.firstapex.rs.uw.webservices.policymovements.OldPolicyVO OldPolicyVO;
    
	public FguwPolicyVO() {
    }

    public FguwPolicyVO(
           java.lang.String oprId,
           java.lang.String polNo,
           java.lang.String collationID,
           java.lang.String IUWP1_POL_WARR,
           java.lang.String endtNo,
           java.lang.String IUWP1_PRD_CD,
           java.lang.String IUWP1_ENDT_REAS,
           java.lang.String IUWP1_CAT_CD,
           java.lang.String IUWP1_ACC_CD,
           java.lang.String IUWP1_BR_CD,
           java.lang.String isNewAgent,
           java.lang.String isNewClient,
           java.lang.String IUWP1_CLI_CD,
           java.lang.String IUWP1_POL_NO_GEN_ID,
           java.lang.String IUWP1_DOM,
           java.lang.String IUWP1_TERR,
           java.lang.String IUWP1_UWYR,
           java.lang.String IUWP1_BUS_TP,
           java.lang.String IUWP1_ORACC_CD,
           java.lang.String IUWP1_TERM,
           java.lang.String IUWP1_METH_PAY,
           java.lang.String IUWP1_INSTL_MODE,
           java.lang.String IUWP1_RN_CD,
           java.lang.String IUWP1_OLD_POL_NO,
           java.lang.String IUWP1_SI_CUR,
           java.lang.String IUWP1_PRM_CUR,
           java.math.BigDecimal primeIUWP1_INCR_SI,
           java.lang.String IUWP1_POL_CREF_NO,
           java.lang.String IUWP1_PLAN_NO,
           java.lang.String IUWP1_DECLN_NO,
           java.lang.String IUWP1_COV_NOTE_NO,
           java.lang.String IUWP1_COV_NOTE_DT,
           java.lang.String IUWP1_ICP_DT,
           java.lang.String IUWP1_EXP_DT,
           java.lang.String IUWP1_ISS_DT,
           java.lang.String IUWP1_ACC_DT,
           java.lang.String IUWP1_EFF_DT,
           java.lang.String IUWP1_PROPOSAL_DT,
           java.lang.String strIUWP1_ICP_TM,
           java.lang.String strIUWP1_EXP_TM,
           java.lang.String clientUpdateFlag,
           java.lang.String IUWP1_OTH_INT_PTY_CD1,
           java.lang.String IUWP1_OTH_INT_PTY_CD2,
           java.lang.String IUWP1_OTH_INT_PTY_CD3,
           java.lang.String IUWP1_OTH_INT_PTY_CD4,
           java.lang.String IUWP1_CLI_ADDR_1,
           java.lang.String IUWP1_CLI_ADDR_2,
           java.lang.String IUWP1_CLI_ADDR_3,
           java.lang.String IUWP1_CLI_ADDR_4,
           java.lang.String receiptNumber,
           java.math.BigDecimal voucherAmount,
           java.lang.String bankCode,
           java.lang.String cardType,
           java.lang.String vipFlag,
           java.lang.String panNo,
           java.lang.String vipFlag2,
           java.lang.String panNo2,
           java.lang.String isNewNominee,
           java.lang.String nomineeCode,
           java.lang.String nomineeDesc,
           java.lang.String relationWithProposer,
           java.lang.String relationWithProposerDesc,
           java.lang.String nomineeDOB,
           java.lang.String nomineeSex,
           java.lang.String nomineeMinorFlag,
           java.lang.String guardianCode,
           java.lang.String guardianDesc,
           java.math.BigDecimal guardianAge,
           java.lang.String relationWithNominee,
           java.lang.String relationWithNomineeDesc,
           java.lang.String nomineeAddr1,
           java.lang.String nomineeAddr2,
           java.lang.String nomineeAddr3,
           java.lang.String nomineeAddr4,
           com.firstapex.rs.uw.webservices.policymovements.ClientVO clientVO,
           com.firstapex.rs.uw.webservices.policymovements.PolicyCoverageVO[] policyCoverageVOList,
           com.firstapex.rs.uw.webservices.policymovements.RsItemSectionVO[] itemSectionVOList,
           com.firstapex.rs.uw.webservices.policymovements.SettlementVO[] settlementVOList,
           com.firstapex.rs.uw.webservices.policymovements.RsUserTextVO userTextVO,
           com.firstapex.rs.uw.webservices.policymovements.CreditCardVO creditCardVO,
           com.firstapex.rs.uw.webservices.policymovements.ChequeVO chequeVO,
           com.firstapex.rs.uw.webservices.policymovements.MandateVO mandateVO) {
           this.oprId = oprId;
           this.polNo = polNo;
           this.collationID = collationID;
           this.endtNo = endtNo;
           this.IUWP1_PRD_CD = IUWP1_PRD_CD;
           this.IUWP1_ENDT_REAS = IUWP1_ENDT_REAS;
           this.IUWP1_CAT_CD = IUWP1_CAT_CD;
           this.IUWP1_ACC_CD = IUWP1_ACC_CD;
           this.IUWP1_BR_CD = IUWP1_BR_CD;
           this.isNewAgent = isNewAgent;
           this.isNewClient = isNewClient;
           this.IUWP1_CLI_CD = IUWP1_CLI_CD;
           this.IUWP1_POL_NO_GEN_ID = IUWP1_POL_NO_GEN_ID;
           this.IUWP1_DOM = IUWP1_DOM;
           this.IUWP1_TERR = IUWP1_TERR;
           this.IUWP1_UWYR = IUWP1_UWYR;
           this.IUWP1_BUS_TP = IUWP1_BUS_TP;
           this.IUWP1_ORACC_CD = IUWP1_ORACC_CD;
           this.IUWP1_TERM = IUWP1_TERM;
           this.IUWP1_METH_PAY = IUWP1_METH_PAY;
           this.IUWP1_INSTL_MODE = IUWP1_INSTL_MODE;
           this.IUWP1_RN_CD = IUWP1_RN_CD;
           this.IUWP1_OLD_POL_NO = IUWP1_OLD_POL_NO;
           this.IUWP1_SI_CUR = IUWP1_SI_CUR;
           this.IUWP1_PRM_CUR = IUWP1_PRM_CUR;
           this.primeIUWP1_INCR_SI = primeIUWP1_INCR_SI;
           this.IUWP1_POL_CREF_NO = IUWP1_POL_CREF_NO;
           this.IUWP1_PLAN_NO = IUWP1_PLAN_NO;
           this.IUWP1_DECLN_NO = IUWP1_DECLN_NO;
           this.IUWP1_COV_NOTE_NO = IUWP1_COV_NOTE_NO;
           this.IUWP1_COV_NOTE_DT = IUWP1_COV_NOTE_DT;
           this.IUWP1_ICP_DT = IUWP1_ICP_DT;
           this.IUWP1_EXP_DT = IUWP1_EXP_DT;
           this.IUWP1_ISS_DT = IUWP1_ISS_DT;
           this.IUWP1_ACC_DT = IUWP1_ACC_DT;
           this.IUWP1_EFF_DT = IUWP1_EFF_DT;
           this.IUWP1_PROPOSAL_DT = IUWP1_PROPOSAL_DT;
           this.strIUWP1_ICP_TM = strIUWP1_ICP_TM;
           this.strIUWP1_EXP_TM = strIUWP1_EXP_TM;
           this.clientUpdateFlag = clientUpdateFlag;
           this.IUWP1_OTH_INT_PTY_CD1 = IUWP1_OTH_INT_PTY_CD1;
           this.IUWP1_OTH_INT_PTY_CD2 = IUWP1_OTH_INT_PTY_CD2;
           this.IUWP1_OTH_INT_PTY_CD3 = IUWP1_OTH_INT_PTY_CD3;
           this.IUWP1_OTH_INT_PTY_CD4 = IUWP1_OTH_INT_PTY_CD4;
           this.IUWP1_CLI_ADDR_1 = IUWP1_CLI_ADDR_1;
           this.IUWP1_CLI_ADDR_2 = IUWP1_CLI_ADDR_2;
           this.IUWP1_CLI_ADDR_3 = IUWP1_CLI_ADDR_3;
           this.IUWP1_CLI_ADDR_4 = IUWP1_CLI_ADDR_4;
           this.receiptNumber = receiptNumber;
           this.IUWP1_POL_WARR=IUWP1_POL_WARR;
           this.voucherAmount = voucherAmount;
           this.bankCode = bankCode;
           this.cardType = cardType;
           this.vipFlag = vipFlag;
           this.panNo = panNo;
           this.vipFlag2 = vipFlag2;
           this.panNo2 = panNo2;
           this.isNewNominee = isNewNominee;
           this.nomineeCode = nomineeCode;
           this.nomineeDesc = nomineeDesc;
           this.relationWithProposer = relationWithProposer;
           this.relationWithProposerDesc = relationWithProposerDesc;
           this.nomineeDOB = nomineeDOB;
           this.nomineeSex = nomineeSex;
           this.nomineeMinorFlag = nomineeMinorFlag;
           this.guardianCode = guardianCode;
           this.guardianDesc = guardianDesc;
           this.guardianAge = guardianAge;
           this.relationWithNominee = relationWithNominee;
           this.relationWithNomineeDesc = relationWithNomineeDesc;
           this.nomineeAddr1 = nomineeAddr1;
           this.nomineeAddr2 = nomineeAddr2;
           this.nomineeAddr3 = nomineeAddr3;
           this.nomineeAddr4 = nomineeAddr4;
           this.clientVO = clientVO;
           this.policyCoverageVOList = policyCoverageVOList;
           this.itemSectionVOList = itemSectionVOList;
           this.settlementVOList = settlementVOList;
           this.userTextVO = userTextVO;
           this.creditCardVO = creditCardVO;
           this.chequeVO = chequeVO;
           this.mandateVO = mandateVO;
    }


    /**
     * Gets the oprId value for this FguwPolicyVO.
     * 
     * @return oprId
     */
    public java.lang.String getOprId() {
        return oprId;
    }


    /**
     * Sets the oprId value for this FguwPolicyVO.
     * 
     * @param oprId
     */
    public void setOprId(java.lang.String oprId) {
        this.oprId = oprId;
    }


    /**
     * Gets the polNo value for this FguwPolicyVO.
     * 
     * @return polNo   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_001::MaxLength=16::ErrorLength=E_FICUW_WS_002
     */
    public java.lang.String getPolNo() {
        return polNo;
    }


    /**
     * Sets the polNo value for this FguwPolicyVO.
     * 
     * @param polNo   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_001::MaxLength=16::ErrorLength=E_FICUW_WS_002
     */
    public void setPolNo(java.lang.String polNo) {
        this.polNo = polNo;
    }


    /**
     * Gets the collationID value for this FguwPolicyVO.
     * 
     * @return collationID   * MaxLength=10::ErrorLength=E_FICUW_WS_180::Auxiliary=FIC_COLLATION_VIEW
     */
    public java.lang.String getCollationID() {
        return collationID;
    }


    /**
     * Sets the collationID value for this FguwPolicyVO.
     * 
     * @param collationID   * MaxLength=10::ErrorLength=E_FICUW_WS_180::Auxiliary=FIC_COLLATION_VIEW
     */
    public void setCollationID(java.lang.String collationID) {
        this.collationID = collationID;
    }


    /**
     * Gets the endtNo value for this FguwPolicyVO.
     * 
     * @return endtNo   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_003::MaxLength=3::ErrorLength=E_FICUW_WS_004
     */
    public java.lang.String getEndtNo() {
        return endtNo;
    }


    /**
     * Sets the endtNo value for this FguwPolicyVO.
     * 
     * @param endtNo   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_003::MaxLength=3::ErrorLength=E_FICUW_WS_004
     */
    public void setEndtNo(java.lang.String endtNo) {
        this.endtNo = endtNo;
    }


    /**
     * Gets the IUWP1_PRD_CD value for this FguwPolicyVO.
     * 
     * @return IUWP1_PRD_CD   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_005::MaxLength=4::ErrorLength=E_FICUW_WS_006::Auxiliary=Iaxmprod::ErrorAux=E_FICUW_AUX_001
     */
    public java.lang.String getIUWP1_PRD_CD() {
        return IUWP1_PRD_CD;
    }


    /**
     * Sets the IUWP1_PRD_CD value for this FguwPolicyVO.
     * 
     * @param IUWP1_PRD_CD   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_005::MaxLength=4::ErrorLength=E_FICUW_WS_006::Auxiliary=Iaxmprod::ErrorAux=E_FICUW_AUX_001
     */
    public void setIUWP1_PRD_CD(java.lang.String IUWP1_PRD_CD) {
        this.IUWP1_PRD_CD = IUWP1_PRD_CD;
    }


    /**
     * Gets the IUWP1_ENDT_REAS value for this FguwPolicyVO.
     * 
     * @return IUWP1_ENDT_REAS   * MaxLength=2::ErrorLength=E_FICUW_WS_007
     */
    public java.lang.String getIUWP1_ENDT_REAS() {
        return IUWP1_ENDT_REAS;
    }


    /**
     * Sets the IUWP1_ENDT_REAS value for this FguwPolicyVO.
     * 
     * @param IUWP1_ENDT_REAS   * MaxLength=2::ErrorLength=E_FICUW_WS_007
     */
    public void setIUWP1_ENDT_REAS(java.lang.String IUWP1_ENDT_REAS) {
        this.IUWP1_ENDT_REAS = IUWP1_ENDT_REAS;
    }


    /**
     * Gets the IUWP1_CAT_CD value for this FguwPolicyVO.
     * 
     * @return IUWP1_CAT_CD   * MaxLength=1::ErrorLength=E_FICUW_WS_008
     */
    public java.lang.String getIUWP1_CAT_CD() {
        return IUWP1_CAT_CD;
    }


    /**
     * Sets the IUWP1_CAT_CD value for this FguwPolicyVO.
     * 
     * @param IUWP1_CAT_CD   * MaxLength=1::ErrorLength=E_FICUW_WS_008
     */
    public void setIUWP1_CAT_CD(java.lang.String IUWP1_CAT_CD) {
        this.IUWP1_CAT_CD = IUWP1_CAT_CD;
    }


    /**
     * Gets the IUWP1_ACC_CD value for this FguwPolicyVO.
     * 
     * @return IUWP1_ACC_CD   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_009::MaxLength=8::ErrorLength=E_FICUW_WS_010
     */
    public java.lang.String getIUWP1_ACC_CD() {
        return IUWP1_ACC_CD;
    }


    /**
     * Sets the IUWP1_ACC_CD value for this FguwPolicyVO.
     * 
     * @param IUWP1_ACC_CD   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_009::MaxLength=8::ErrorLength=E_FICUW_WS_010
     */
    public void setIUWP1_ACC_CD(java.lang.String IUWP1_ACC_CD) {
        this.IUWP1_ACC_CD = IUWP1_ACC_CD;
    }


    /**
     * Gets the IUWP1_BR_CD value for this FguwPolicyVO.
     * 
     * @return IUWP1_BR_CD   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_011::MaxLength=2::ErrorLength=E_FICUW_WS_012::Auxiliary=Iaxmbrch::ErrorAux=E_FICUW_AUX_002
     */
    public java.lang.String getIUWP1_BR_CD() {
        return IUWP1_BR_CD;
    }


    /**
     * Sets the IUWP1_BR_CD value for this FguwPolicyVO.
     * 
     * @param IUWP1_BR_CD   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_011::MaxLength=2::ErrorLength=E_FICUW_WS_012::Auxiliary=Iaxmbrch::ErrorAux=E_FICUW_AUX_002
     */
    public void setIUWP1_BR_CD(java.lang.String IUWP1_BR_CD) {
        this.IUWP1_BR_CD = IUWP1_BR_CD;
    }


    /**
     * Gets the isNewAgent value for this FguwPolicyVO.
     * 
     * @return isNewAgent   * MaxLength=1::ErrorLength=E_FICUW_WS_181
     */
    public java.lang.String getIsNewAgent() {
        return isNewAgent;
    }


    /**
     * Sets the isNewAgent value for this FguwPolicyVO.
     * 
     * @param isNewAgent   * MaxLength=1::ErrorLength=E_FICUW_WS_181
     */
    public void setIsNewAgent(java.lang.String isNewAgent) {
        this.isNewAgent = isNewAgent;
    }


    /**
     * Gets the isNewClient value for this FguwPolicyVO.
     * 
     * @return isNewClient   * MaxLength=1::ErrorLength=E_FICUW_WS_182
     */
    public java.lang.String getIsNewClient() {
        return isNewClient;
    }


    /**
     * Sets the isNewClient value for this FguwPolicyVO.
     * 
     * @param isNewClient   * MaxLength=1::ErrorLength=E_FICUW_WS_182
     */
    public void setIsNewClient(java.lang.String isNewClient) {
        this.isNewClient = isNewClient;
    }


    /**
     * Gets the IUWP1_CLI_CD value for this FguwPolicyVO.
     * 
     * @return IUWP1_CLI_CD   * MaxLength=8::ErrorLength=E_FICUW_WS_013
     */
    public java.lang.String getIUWP1_CLI_CD() {
        return IUWP1_CLI_CD;
    }


    /**
     * Sets the IUWP1_CLI_CD value for this FguwPolicyVO.
     * 
     * @param IUWP1_CLI_CD   * MaxLength=8::ErrorLength=E_FICUW_WS_013
     */
    public void setIUWP1_CLI_CD(java.lang.String IUWP1_CLI_CD) {
        this.IUWP1_CLI_CD = IUWP1_CLI_CD;
    }


    /**
     * Gets the IUWP1_POL_NO_GEN_ID value for this FguwPolicyVO.
     * 
     * @return IUWP1_POL_NO_GEN_ID   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_014::MaxLength=1::ErrorLength=E_FICUW_WS_015
     */
    public java.lang.String getIUWP1_POL_NO_GEN_ID() {
        return IUWP1_POL_NO_GEN_ID;
    }


    /**
     * Sets the IUWP1_POL_NO_GEN_ID value for this FguwPolicyVO.
     * 
     * @param IUWP1_POL_NO_GEN_ID   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_014::MaxLength=1::ErrorLength=E_FICUW_WS_015
     */
    public void setIUWP1_POL_NO_GEN_ID(java.lang.String IUWP1_POL_NO_GEN_ID) {
        this.IUWP1_POL_NO_GEN_ID = IUWP1_POL_NO_GEN_ID;
    }


    /**
     * Gets the IUWP1_DOM value for this FguwPolicyVO.
     * 
     * @return IUWP1_DOM   * MaxLength=4::ErrorLength=E_FICUW_WS_016::Auxiliary=Iaxmmccd:DOMC::ErrorAux=E_FICUW_AUX_003
     */
    public java.lang.String getIUWP1_DOM() {
        return IUWP1_DOM;
    }


    /**
     * Sets the IUWP1_DOM value for this FguwPolicyVO.
     * 
     * @param IUWP1_DOM   * MaxLength=4::ErrorLength=E_FICUW_WS_016::Auxiliary=Iaxmmccd:DOMC::ErrorAux=E_FICUW_AUX_003
     */
    public void setIUWP1_DOM(java.lang.String IUWP1_DOM) {
        this.IUWP1_DOM = IUWP1_DOM;
    }


    /**
     * Gets the IUWP1_TERR value for this FguwPolicyVO.
     * 
     * @return IUWP1_TERR   * MaxLength=4::ErrorLength=E_FICUW_WS_017::Auxiliary=Iaxmmccd:TERR::ErrorAux=E_FICUW_AUX_004
     */
    public java.lang.String getIUWP1_TERR() {
        return IUWP1_TERR;
    }


    /**
     * Sets the IUWP1_TERR value for this FguwPolicyVO.
     * 
     * @param IUWP1_TERR   * MaxLength=4::ErrorLength=E_FICUW_WS_017::Auxiliary=Iaxmmccd:TERR::ErrorAux=E_FICUW_AUX_004
     */
    public void setIUWP1_TERR(java.lang.String IUWP1_TERR) {
        this.IUWP1_TERR = IUWP1_TERR;
    }


    /**
     * Gets the IUWP1_UWYR value for this FguwPolicyVO.
     * 
     * @return IUWP1_UWYR   * MaxLength=4::ErrorLength=E_FICUW_WS_018
     */
    public java.lang.String getIUWP1_UWYR() {
        return IUWP1_UWYR;
    }


    /**
     * Sets the IUWP1_UWYR value for this FguwPolicyVO.
     * 
     * @param IUWP1_UWYR   * MaxLength=4::ErrorLength=E_FICUW_WS_018
     */
    public void setIUWP1_UWYR(java.lang.String IUWP1_UWYR) {
        this.IUWP1_UWYR = IUWP1_UWYR;
    }


    /**
     * Gets the IUWP1_BUS_TP value for this FguwPolicyVO.
     * 
     * @return IUWP1_BUS_TP   * MaxLength=2::ErrorLength=E_FICUW_WS_019
     */
    public java.lang.String getIUWP1_BUS_TP() {
        return IUWP1_BUS_TP;
    }


    /**
     * Sets the IUWP1_BUS_TP value for this FguwPolicyVO.
     * 
     * @param IUWP1_BUS_TP   * MaxLength=2::ErrorLength=E_FICUW_WS_019
     */
    public void setIUWP1_BUS_TP(java.lang.String IUWP1_BUS_TP) {
        this.IUWP1_BUS_TP = IUWP1_BUS_TP;
    }


    /**
     * Gets the IUWP1_ORACC_CD value for this FguwPolicyVO.
     * 
     * @return IUWP1_ORACC_CD   * MaxLength=8::ErrorLength=E_FICUW_WS_020::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_005
     */
    public java.lang.String getIUWP1_ORACC_CD() {
        return IUWP1_ORACC_CD;
    }


    /**
     * Sets the IUWP1_ORACC_CD value for this FguwPolicyVO.
     * 
     * @param IUWP1_ORACC_CD   * MaxLength=8::ErrorLength=E_FICUW_WS_020::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_005
     */
    public void setIUWP1_ORACC_CD(java.lang.String IUWP1_ORACC_CD) {
        this.IUWP1_ORACC_CD = IUWP1_ORACC_CD;
    }


    /**
     * Gets the IUWP1_TERM value for this FguwPolicyVO.
     * 
     * @return IUWP1_TERM   * MaxLength=2::ErrorLength=E_FICUW_WS_021::Auxiliary=Iaxmmccd:TERM::ErrorAux=E_FICUW_AUX_006
     */
    public java.lang.String getIUWP1_TERM() {
        return IUWP1_TERM;
    }


    /**
     * Sets the IUWP1_TERM value for this FguwPolicyVO.
     * 
     * @param IUWP1_TERM   * MaxLength=2::ErrorLength=E_FICUW_WS_021::Auxiliary=Iaxmmccd:TERM::ErrorAux=E_FICUW_AUX_006
     */
    public void setIUWP1_TERM(java.lang.String IUWP1_TERM) {
        this.IUWP1_TERM = IUWP1_TERM;
    }


    /**
     * Gets the IUWP1_METH_PAY value for this FguwPolicyVO.
     * 
     * @return IUWP1_METH_PAY   * MaxLength=4::ErrorLength=E_FICUW_WS_022::Auxiliary=Iaxmmccd:MTHD::ErrorAux=E_FICUW_AUX_007
     */
    public java.lang.String getIUWP1_METH_PAY() {
        return IUWP1_METH_PAY;
    }


    /**
     * Sets the IUWP1_METH_PAY value for this FguwPolicyVO.
     * 
     * @param IUWP1_METH_PAY   * MaxLength=4::ErrorLength=E_FICUW_WS_022::Auxiliary=Iaxmmccd:MTHD::ErrorAux=E_FICUW_AUX_007
     */
    public void setIUWP1_METH_PAY(java.lang.String IUWP1_METH_PAY) {
        this.IUWP1_METH_PAY = IUWP1_METH_PAY;
    }


    /**
     * Gets the IUWP1_INSTL_MODE value for this FguwPolicyVO.
     * 
     * @return IUWP1_INSTL_MODE   * MaxLength=4::ErrorLength=E_FICUW_WS_023::Auxiliary=Iaxmmccd:MODE::ErrorAux=E_FICUW_AUX_008
     */
    public java.lang.String getIUWP1_INSTL_MODE() {
        return IUWP1_INSTL_MODE;
    }


    /**
     * Sets the IUWP1_INSTL_MODE value for this FguwPolicyVO.
     * 
     * @param IUWP1_INSTL_MODE   * MaxLength=4::ErrorLength=E_FICUW_WS_023::Auxiliary=Iaxmmccd:MODE::ErrorAux=E_FICUW_AUX_008
     */
    public void setIUWP1_INSTL_MODE(java.lang.String IUWP1_INSTL_MODE) {
        this.IUWP1_INSTL_MODE = IUWP1_INSTL_MODE;
    }


    /**
     * Gets the IUWP1_RN_CD value for this FguwPolicyVO.
     * 
     * @return IUWP1_RN_CD   * MaxLength=2::ErrorLength=E_FICUW_WS_024
     */
    public java.lang.String getIUWP1_RN_CD() {
        return IUWP1_RN_CD;
    }


    /**
     * Sets the IUWP1_RN_CD value for this FguwPolicyVO.
     * 
     * @param IUWP1_RN_CD   * MaxLength=2::ErrorLength=E_FICUW_WS_024
     */
    public void setIUWP1_RN_CD(java.lang.String IUWP1_RN_CD) {
        this.IUWP1_RN_CD = IUWP1_RN_CD;
    }


    /**
     * Gets the IUWP1_OLD_POL_NO value for this FguwPolicyVO.
     * 
     * @return IUWP1_OLD_POL_NO   * MaxLength=20::ErrorLength=E_FICUW_WS_130
     */
    public java.lang.String getIUWP1_OLD_POL_NO() {
        return IUWP1_OLD_POL_NO;
    }


    /**
     * Sets the IUWP1_OLD_POL_NO value for this FguwPolicyVO.
     * 
     * @param IUWP1_OLD_POL_NO   * MaxLength=20::ErrorLength=E_FICUW_WS_130
     */
    public void setIUWP1_OLD_POL_NO(java.lang.String IUWP1_OLD_POL_NO) {
        this.IUWP1_OLD_POL_NO = IUWP1_OLD_POL_NO;
    }


    /**
     * Gets the IUWP1_SI_CUR value for this FguwPolicyVO.
     * 
     * @return IUWP1_SI_CUR   * MaxLength=4::ErrorLength=E_FICUW_WS_025
     */
    public java.lang.String getIUWP1_SI_CUR() {
        return IUWP1_SI_CUR;
    }


    /**
     * Sets the IUWP1_SI_CUR value for this FguwPolicyVO.
     * 
     * @param IUWP1_SI_CUR   * MaxLength=4::ErrorLength=E_FICUW_WS_025
     */
    public void setIUWP1_SI_CUR(java.lang.String IUWP1_SI_CUR) {
        this.IUWP1_SI_CUR = IUWP1_SI_CUR;
    }


    /**
     * Gets the IUWP1_PRM_CUR value for this FguwPolicyVO.
     * 
     * @return IUWP1_PRM_CUR   * MaxLength=4::ErrorLength=E_FICUW_WS_026
     */
    public java.lang.String getIUWP1_PRM_CUR() {
        return IUWP1_PRM_CUR;
    }


    /**
     * Sets the IUWP1_PRM_CUR value for this FguwPolicyVO.
     * 
     * @param IUWP1_PRM_CUR   * MaxLength=4::ErrorLength=E_FICUW_WS_026
     */
    public void setIUWP1_PRM_CUR(java.lang.String IUWP1_PRM_CUR) {
        this.IUWP1_PRM_CUR = IUWP1_PRM_CUR;
    }


    /**
     * Gets the primeIUWP1_INCR_SI value for this FguwPolicyVO.
     * 
     * @return primeIUWP1_INCR_SI   * preDecimalPrecision=15::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_027
     */
    public java.math.BigDecimal getPrimeIUWP1_INCR_SI() {
        return primeIUWP1_INCR_SI;
    }


    /**
     * Sets the primeIUWP1_INCR_SI value for this FguwPolicyVO.
     * 
     * @param primeIUWP1_INCR_SI   * preDecimalPrecision=15::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_027
     */
    public void setPrimeIUWP1_INCR_SI(java.math.BigDecimal primeIUWP1_INCR_SI) {
        this.primeIUWP1_INCR_SI = primeIUWP1_INCR_SI;
    }


    /**
     * Gets the IUWP1_POL_CREF_NO value for this FguwPolicyVO.
     * 
     * @return IUWP1_POL_CREF_NO   * MaxLength=20::ErrorLength=E_FICUW_WS_028
     */
    public java.lang.String getIUWP1_POL_CREF_NO() {
        return IUWP1_POL_CREF_NO;
    }


    /**
     * Sets the IUWP1_POL_CREF_NO value for this FguwPolicyVO.
     * 
     * @param IUWP1_POL_CREF_NO   * MaxLength=20::ErrorLength=E_FICUW_WS_028
     */
    public void setIUWP1_POL_CREF_NO(java.lang.String IUWP1_POL_CREF_NO) {
        this.IUWP1_POL_CREF_NO = IUWP1_POL_CREF_NO;
    }


    /**
     * Gets the IUWP1_PLAN_NO value for this FguwPolicyVO.
     * 
     * @return IUWP1_PLAN_NO   * MaxLength=3::ErrorLength=E_FICUW_WS_029
     */
    public java.lang.String getIUWP1_PLAN_NO() {
        return IUWP1_PLAN_NO;
    }


    /**
     * Sets the IUWP1_PLAN_NO value for this FguwPolicyVO.
     * 
     * @param IUWP1_PLAN_NO   * MaxLength=3::ErrorLength=E_FICUW_WS_029
     */
    public void setIUWP1_PLAN_NO(java.lang.String IUWP1_PLAN_NO) {
        this.IUWP1_PLAN_NO = IUWP1_PLAN_NO;
    }


    /**
     * Gets the IUWP1_DECLN_NO value for this FguwPolicyVO.
     * 
     * @return IUWP1_DECLN_NO   * MaxLength=4::ErrorLength=E_FICUW_WS_030
     */
    public java.lang.String getIUWP1_DECLN_NO() {
        return IUWP1_DECLN_NO;
    }


    /**
     * Sets the IUWP1_DECLN_NO value for this FguwPolicyVO.
     * 
     * @param IUWP1_DECLN_NO   * MaxLength=4::ErrorLength=E_FICUW_WS_030
     */
    public void setIUWP1_DECLN_NO(java.lang.String IUWP1_DECLN_NO) {
        this.IUWP1_DECLN_NO = IUWP1_DECLN_NO;
    }


    /**
     * Gets the IUWP1_COV_NOTE_NO value for this FguwPolicyVO.
     * 
     * @return IUWP1_COV_NOTE_NO   * MaxLength=10::ErrorLength=E_FICUW_WS_031
     */
    public java.lang.String getIUWP1_COV_NOTE_NO() {
        return IUWP1_COV_NOTE_NO;
    }


    /**
     * Sets the IUWP1_COV_NOTE_NO value for this FguwPolicyVO.
     * 
     * @param IUWP1_COV_NOTE_NO   * MaxLength=10::ErrorLength=E_FICUW_WS_031
     */
    public void setIUWP1_COV_NOTE_NO(java.lang.String IUWP1_COV_NOTE_NO) {
        this.IUWP1_COV_NOTE_NO = IUWP1_COV_NOTE_NO;
    }


    /**
     * Gets the IUWP1_COV_NOTE_DT value for this FguwPolicyVO.
     * 
     * @return IUWP1_COV_NOTE_DT
     */
    public java.lang.String getIUWP1_COV_NOTE_DT() {
        return IUWP1_COV_NOTE_DT;
    }


    /**
     * Sets the IUWP1_COV_NOTE_DT value for this FguwPolicyVO.
     * 
     * @param IUWP1_COV_NOTE_DT
     */
    public void setIUWP1_COV_NOTE_DT(java.lang.String IUWP1_COV_NOTE_DT) {
        this.IUWP1_COV_NOTE_DT = IUWP1_COV_NOTE_DT;
    }


    /**
     * Gets the IUWP1_ICP_DT value for this FguwPolicyVO.
     * 
     * @return IUWP1_ICP_DT
     */
    public java.lang.String getIUWP1_ICP_DT() {
        return IUWP1_ICP_DT;
    }


    /**
     * Sets the IUWP1_ICP_DT value for this FguwPolicyVO.
     * 
     * @param IUWP1_ICP_DT
     */
    public void setIUWP1_ICP_DT(java.lang.String IUWP1_ICP_DT) {
        this.IUWP1_ICP_DT = IUWP1_ICP_DT;
    }


    /**
     * Gets the IUWP1_EXP_DT value for this FguwPolicyVO.
     * 
     * @return IUWP1_EXP_DT
     */
    public java.lang.String getIUWP1_EXP_DT() {
        return IUWP1_EXP_DT;
    }


    /**
     * Sets the IUWP1_EXP_DT value for this FguwPolicyVO.
     * 
     * @param IUWP1_EXP_DT
     */
    public void setIUWP1_EXP_DT(java.lang.String IUWP1_EXP_DT) {
        this.IUWP1_EXP_DT = IUWP1_EXP_DT;
    }


    /**
     * Gets the IUWP1_ISS_DT value for this FguwPolicyVO.
     * 
     * @return IUWP1_ISS_DT
     */
    public java.lang.String getIUWP1_ISS_DT() {
        return IUWP1_ISS_DT;
    }


    /**
     * Sets the IUWP1_ISS_DT value for this FguwPolicyVO.
     * 
     * @param IUWP1_ISS_DT
     */
    public void setIUWP1_ISS_DT(java.lang.String IUWP1_ISS_DT) {
        this.IUWP1_ISS_DT = IUWP1_ISS_DT;
    }


    /**
     * Gets the IUWP1_ACC_DT value for this FguwPolicyVO.
     * 
     * @return IUWP1_ACC_DT
     */
    public java.lang.String getIUWP1_ACC_DT() {
        return IUWP1_ACC_DT;
    }


    /**
     * Sets the IUWP1_ACC_DT value for this FguwPolicyVO.
     * 
     * @param IUWP1_ACC_DT
     */
    public void setIUWP1_ACC_DT(java.lang.String IUWP1_ACC_DT) {
        this.IUWP1_ACC_DT = IUWP1_ACC_DT;
    }


    /**
     * Gets the IUWP1_EFF_DT value for this FguwPolicyVO.
     * 
     * @return IUWP1_EFF_DT
     */
    public java.lang.String getIUWP1_EFF_DT() {
        return IUWP1_EFF_DT;
    }


    /**
     * Sets the IUWP1_EFF_DT value for this FguwPolicyVO.
     * 
     * @param IUWP1_EFF_DT
     */
    public void setIUWP1_EFF_DT(java.lang.String IUWP1_EFF_DT) {
        this.IUWP1_EFF_DT = IUWP1_EFF_DT;
    }


    /**
     * Gets the IUWP1_PROPOSAL_DT value for this FguwPolicyVO.
     * 
     * @return IUWP1_PROPOSAL_DT
     */
    public java.lang.String getIUWP1_PROPOSAL_DT() {
        return IUWP1_PROPOSAL_DT;
    }


    /**
     * Sets the IUWP1_PROPOSAL_DT value for this FguwPolicyVO.
     * 
     * @param IUWP1_PROPOSAL_DT
     */
    public void setIUWP1_PROPOSAL_DT(java.lang.String IUWP1_PROPOSAL_DT) {
        this.IUWP1_PROPOSAL_DT = IUWP1_PROPOSAL_DT;
    }


    /**
     * Gets the strIUWP1_ICP_TM value for this FguwPolicyVO.
     * 
     * @return strIUWP1_ICP_TM   * MaxLength=6::ErrorLength=E_FICUW_WS_032
     */
    public java.lang.String getStrIUWP1_ICP_TM() {
        return strIUWP1_ICP_TM;
    }


    /**
     * Sets the strIUWP1_ICP_TM value for this FguwPolicyVO.
     * 
     * @param strIUWP1_ICP_TM   * MaxLength=6::ErrorLength=E_FICUW_WS_032
     */
    public void setStrIUWP1_ICP_TM(java.lang.String strIUWP1_ICP_TM) {
        this.strIUWP1_ICP_TM = strIUWP1_ICP_TM;
    }


    /**
     * Gets the strIUWP1_EXP_TM value for this FguwPolicyVO.
     * 
     * @return strIUWP1_EXP_TM   * MaxLength=6::ErrorLength=E_FICUW_WS_033
     */
    public java.lang.String getStrIUWP1_EXP_TM() {
        return strIUWP1_EXP_TM;
    }


    /**
     * Sets the strIUWP1_EXP_TM value for this FguwPolicyVO.
     * 
     * @param strIUWP1_EXP_TM   * MaxLength=6::ErrorLength=E_FICUW_WS_033
     */
    public void setStrIUWP1_EXP_TM(java.lang.String strIUWP1_EXP_TM) {
        this.strIUWP1_EXP_TM = strIUWP1_EXP_TM;
    }


    /**
     * Gets the clientUpdateFlag value for this FguwPolicyVO.
     * 
     * @return clientUpdateFlag   * MaxLength=1::ErrorLength=E_FICUW_WS_034
     */
    public java.lang.String getClientUpdateFlag() {
        return clientUpdateFlag;
    }


    /**
     * Sets the clientUpdateFlag value for this FguwPolicyVO.
     * 
     * @param clientUpdateFlag   * MaxLength=1::ErrorLength=E_FICUW_WS_034
     */
    public void setClientUpdateFlag(java.lang.String clientUpdateFlag) {
        this.clientUpdateFlag = clientUpdateFlag;
    }


    /**
     * Gets the IUWP1_OTH_INT_PTY_CD1 value for this FguwPolicyVO.
     * 
     * @return IUWP1_OTH_INT_PTY_CD1   * MaxLength=8::ErrorLength=E_FICUW_WS_035::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_011
     */
    public java.lang.String getIUWP1_OTH_INT_PTY_CD1() {
        return IUWP1_OTH_INT_PTY_CD1;
    }


    /**
     * Sets the IUWP1_OTH_INT_PTY_CD1 value for this FguwPolicyVO.
     * 
     * @param IUWP1_OTH_INT_PTY_CD1   * MaxLength=8::ErrorLength=E_FICUW_WS_035::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_011
     */
    public void setIUWP1_OTH_INT_PTY_CD1(java.lang.String IUWP1_OTH_INT_PTY_CD1) {
        this.IUWP1_OTH_INT_PTY_CD1 = IUWP1_OTH_INT_PTY_CD1;
    }


    /**
     * Gets the IUWP1_OTH_INT_PTY_CD2 value for this FguwPolicyVO.
     * 
     * @return IUWP1_OTH_INT_PTY_CD2   * MaxLength=8::ErrorLength=E_FICUW_WS_036::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_012
     */
    public java.lang.String getIUWP1_OTH_INT_PTY_CD2() {
        return IUWP1_OTH_INT_PTY_CD2;
    }


    /**
     * Sets the IUWP1_OTH_INT_PTY_CD2 value for this FguwPolicyVO.
     * 
     * @param IUWP1_OTH_INT_PTY_CD2   * MaxLength=8::ErrorLength=E_FICUW_WS_036::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_012
     */
    public void setIUWP1_OTH_INT_PTY_CD2(java.lang.String IUWP1_OTH_INT_PTY_CD2) {
        this.IUWP1_OTH_INT_PTY_CD2 = IUWP1_OTH_INT_PTY_CD2;
    }


    /**
     * Gets the IUWP1_OTH_INT_PTY_CD3 value for this FguwPolicyVO.
     * 
     * @return IUWP1_OTH_INT_PTY_CD3   * MaxLength=8::ErrorLength=E_FICUW_WS_037::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_013
     */
    public java.lang.String getIUWP1_OTH_INT_PTY_CD3() {
        return IUWP1_OTH_INT_PTY_CD3;
    }


    /**
     * Sets the IUWP1_OTH_INT_PTY_CD3 value for this FguwPolicyVO.
     * 
     * @param IUWP1_OTH_INT_PTY_CD3   * MaxLength=8::ErrorLength=E_FICUW_WS_037::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_013
     */
    public void setIUWP1_OTH_INT_PTY_CD3(java.lang.String IUWP1_OTH_INT_PTY_CD3) {
        this.IUWP1_OTH_INT_PTY_CD3 = IUWP1_OTH_INT_PTY_CD3;
    }


    /**
     * Gets the IUWP1_OTH_INT_PTY_CD4 value for this FguwPolicyVO.
     * 
     * @return IUWP1_OTH_INT_PTY_CD4   * MaxLength=8::ErrorLength=E_FICUW_WS_038::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_014
     */
    public java.lang.String getIUWP1_OTH_INT_PTY_CD4() {
        return IUWP1_OTH_INT_PTY_CD4;
    }


    /**
     * Sets the IUWP1_OTH_INT_PTY_CD4 value for this FguwPolicyVO.
     * 
     * @param IUWP1_OTH_INT_PTY_CD4   * MaxLength=8::ErrorLength=E_FICUW_WS_038::Auxiliary=PARTY_HIST::ErrorAux=E_FICUW_AUX_014
     */
    public void setIUWP1_OTH_INT_PTY_CD4(java.lang.String IUWP1_OTH_INT_PTY_CD4) {
        this.IUWP1_OTH_INT_PTY_CD4 = IUWP1_OTH_INT_PTY_CD4;
    }


    /**
     * Gets the IUWP1_CLI_ADDR_1 value for this FguwPolicyVO.
     * 
     * @return IUWP1_CLI_ADDR_1   * MaxLength=40::ErrorLength=E_FICUW_WS_039
     */
    public java.lang.String getIUWP1_CLI_ADDR_1() {
        return IUWP1_CLI_ADDR_1;
    }


    /**
     * Sets the IUWP1_CLI_ADDR_1 value for this FguwPolicyVO.
     * 
     * @param IUWP1_CLI_ADDR_1   * MaxLength=40::ErrorLength=E_FICUW_WS_039
     */
    public void setIUWP1_CLI_ADDR_1(java.lang.String IUWP1_CLI_ADDR_1) {
        this.IUWP1_CLI_ADDR_1 = IUWP1_CLI_ADDR_1;
    }


    /**
     * Gets the IUWP1_CLI_ADDR_2 value for this FguwPolicyVO.
     * 
     * @return IUWP1_CLI_ADDR_2   * MaxLength=40::ErrorLength=E_FICUW_WS_040
     */
    public java.lang.String getIUWP1_CLI_ADDR_2() {
        return IUWP1_CLI_ADDR_2;
    }


    /**
     * Sets the IUWP1_CLI_ADDR_2 value for this FguwPolicyVO.
     * 
     * @param IUWP1_CLI_ADDR_2   * MaxLength=40::ErrorLength=E_FICUW_WS_040
     */
    public void setIUWP1_CLI_ADDR_2(java.lang.String IUWP1_CLI_ADDR_2) {
        this.IUWP1_CLI_ADDR_2 = IUWP1_CLI_ADDR_2;
    }


    /**
     * Gets the IUWP1_CLI_ADDR_3 value for this FguwPolicyVO.
     * 
     * @return IUWP1_CLI_ADDR_3   * MaxLength=40::ErrorLength=E_FICUW_WS_041
     */
    public java.lang.String getIUWP1_CLI_ADDR_3() {
        return IUWP1_CLI_ADDR_3;
    }


    /**
     * Sets the IUWP1_CLI_ADDR_3 value for this FguwPolicyVO.
     * 
     * @param IUWP1_CLI_ADDR_3   * MaxLength=40::ErrorLength=E_FICUW_WS_041
     */
    public void setIUWP1_CLI_ADDR_3(java.lang.String IUWP1_CLI_ADDR_3) {
        this.IUWP1_CLI_ADDR_3 = IUWP1_CLI_ADDR_3;
    }


    /**
     * Gets the IUWP1_CLI_ADDR_4 value for this FguwPolicyVO.
     * 
     * @return IUWP1_CLI_ADDR_4   * MaxLength=40::ErrorLength=E_FICUW_WS_042
     */
    public java.lang.String getIUWP1_CLI_ADDR_4() {
        return IUWP1_CLI_ADDR_4;
    }


    /**
     * Sets the IUWP1_CLI_ADDR_4 value for this FguwPolicyVO.
     * 
     * @param IUWP1_CLI_ADDR_4   * MaxLength=40::ErrorLength=E_FICUW_WS_042
     */
    public void setIUWP1_CLI_ADDR_4(java.lang.String IUWP1_CLI_ADDR_4) {
        this.IUWP1_CLI_ADDR_4 = IUWP1_CLI_ADDR_4;
    }


    /**
     * Gets the receiptNumber value for this FguwPolicyVO.
     * 
     * @return receiptNumber   * MaxLength=10::ErrorLength=E_FICUW_WS_043
     */
    public java.lang.String getReceiptNumber() {
        return receiptNumber;
    }


    /**
     * Sets the receiptNumber value for this FguwPolicyVO.
     * 
     * @param receiptNumber   * MaxLength=10::ErrorLength=E_FICUW_WS_043
     */
    public void setReceiptNumber(java.lang.String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }


    /**
     * Gets the voucherAmount value for this FguwPolicyVO.
     * 
     * @return voucherAmount   * preDecimalPrecision=15::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_044
     */
    public java.math.BigDecimal getVoucherAmount() {
        return voucherAmount;
    }


    /**
     * Sets the voucherAmount value for this FguwPolicyVO.
     * 
     * @param voucherAmount   * preDecimalPrecision=15::postDecimalPrecision=6::ErrorPrecision=E_FICUW_WS_044
     */
    public void setVoucherAmount(java.math.BigDecimal voucherAmount) {
        this.voucherAmount = voucherAmount;
    }


    /**
     * Gets the bankCode value for this FguwPolicyVO.
     * 
     * @return bankCode   * MaxLength=8::ErrorLength=E_FICUW_WS_045
     */
    public java.lang.String getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this FguwPolicyVO.
     * 
     * @param bankCode   * MaxLength=8::ErrorLength=E_FICUW_WS_045
     */
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the cardType value for this FguwPolicyVO.
     * 
     * @return cardType   * MaxLength=15::ErrorLength=E_FICUW_WS_046
     */
    public java.lang.String getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this FguwPolicyVO.
     * 
     * @param cardType   * MaxLength=15::ErrorLength=E_FICUW_WS_046
     */
    public void setCardType(java.lang.String cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the vipFlag value for this FguwPolicyVO.
     * 
     * @return vipFlag   * MaxLength=1::ErrorLength=
     */
    public java.lang.String getVipFlag() {
        return vipFlag;
    }


    /**
     * Sets the vipFlag value for this FguwPolicyVO.
     * 
     * @param vipFlag   * MaxLength=1::ErrorLength=
     */
    public void setVipFlag(java.lang.String vipFlag) {
        this.vipFlag = vipFlag;
    }


    /**
     * Gets the panNo value for this FguwPolicyVO.
     * 
     * @return panNo   * MaxLength=20::ErrorLength=
     */
    public java.lang.String getPanNo() {
        return panNo;
    }


    /**
     * Sets the panNo value for this FguwPolicyVO.
     * 
     * @param panNo   * MaxLength=20::ErrorLength=
     */
    public void setPanNo(java.lang.String panNo) {
        this.panNo = panNo;
    }


    /**
     * Gets the vipFlag2 value for this FguwPolicyVO.
     * 
     * @return vipFlag2   * MaxLength=1::ErrorLength=E_FICUW_WS_183
     */
    public java.lang.String getVipFlag2() {
        return vipFlag2;
    }


    /**
     * Sets the vipFlag2 value for this FguwPolicyVO.
     * 
     * @param vipFlag2   * MaxLength=1::ErrorLength=E_FICUW_WS_183
     */
    public void setVipFlag2(java.lang.String vipFlag2) {
        this.vipFlag2 = vipFlag2;
    }


    /**
     * Gets the panNo2 value for this FguwPolicyVO.
     * 
     * @return panNo2   * MaxLength=20::ErrorLength=E_FICUW_WS_184
     */
    public java.lang.String getPanNo2() {
        return panNo2;
    }


    /**
     * Sets the panNo2 value for this FguwPolicyVO.
     * 
     * @param panNo2   * MaxLength=20::ErrorLength=E_FICUW_WS_184
     */
    public void setPanNo2(java.lang.String panNo2) {
        this.panNo2 = panNo2;
    }


    /**
     * Gets the isNewNominee value for this FguwPolicyVO.
     * 
     * @return isNewNominee   * MaxLength=1::ErrorLength=E_FICUW_WS_185
     */
    public java.lang.String getIsNewNominee() {
        return isNewNominee;
    }


    /**
     * Sets the isNewNominee value for this FguwPolicyVO.
     * 
     * @param isNewNominee   * MaxLength=1::ErrorLength=E_FICUW_WS_185
     */
    public void setIsNewNominee(java.lang.String isNewNominee) {
        this.isNewNominee = isNewNominee;
    }


    /**
     * Gets the nomineeCode value for this FguwPolicyVO.
     * 
     * @return nomineeCode   * MaxLength=8::ErrorLength=E_FICUW_WS_186
     */
    public java.lang.String getNomineeCode() {
        return nomineeCode;
    }


    /**
     * Sets the nomineeCode value for this FguwPolicyVO.
     * 
     * @param nomineeCode   * MaxLength=8::ErrorLength=E_FICUW_WS_186
     */
    public void setNomineeCode(java.lang.String nomineeCode) {
        this.nomineeCode = nomineeCode;
    }


    /**
     * Gets the nomineeDesc value for this FguwPolicyVO.
     * 
     * @return nomineeDesc
     */
    public java.lang.String getNomineeDesc() {
        return nomineeDesc;
    }


    /**
     * Sets the nomineeDesc value for this FguwPolicyVO.
     * 
     * @param nomineeDesc
     */
    public void setNomineeDesc(java.lang.String nomineeDesc) {
        this.nomineeDesc = nomineeDesc;
    }


    /**
     * Gets the relationWithProposer value for this FguwPolicyVO.
     * 
     * @return relationWithProposer   * MaxLength=4::ErrorLength=E_FICUW_WS_187::Auxiliary=Iaxmmccd:PART::ErrorAux=E_FICUW_AUX_029
     */
    public java.lang.String getRelationWithProposer() {
        return relationWithProposer;
    }


    /**
     * Sets the relationWithProposer value for this FguwPolicyVO.
     * 
     * @param relationWithProposer   * MaxLength=4::ErrorLength=E_FICUW_WS_187::Auxiliary=Iaxmmccd:PART::ErrorAux=E_FICUW_AUX_029
     */
    public void setRelationWithProposer(java.lang.String relationWithProposer) {
        this.relationWithProposer = relationWithProposer;
    }


    /**
     * Gets the relationWithProposerDesc value for this FguwPolicyVO.
     * 
     * @return relationWithProposerDesc
     */
    public java.lang.String getRelationWithProposerDesc() {
        return relationWithProposerDesc;
    }


    /**
     * Sets the relationWithProposerDesc value for this FguwPolicyVO.
     * 
     * @param relationWithProposerDesc
     */
    public void setRelationWithProposerDesc(java.lang.String relationWithProposerDesc) {
        this.relationWithProposerDesc = relationWithProposerDesc;
    }


    /**
     * Gets the nomineeDOB value for this FguwPolicyVO.
     * 
     * @return nomineeDOB   * MaxLength=10::ErrorLength=E_FICUW_WS_189
     */
    public java.lang.String getNomineeDOB() {
        return nomineeDOB;
    }


    /**
     * Sets the nomineeDOB value for this FguwPolicyVO.
     * 
     * @param nomineeDOB   * MaxLength=10::ErrorLength=E_FICUW_WS_189
     */
    public void setNomineeDOB(java.lang.String nomineeDOB) {
        this.nomineeDOB = nomineeDOB;
    }


    /**
     * Gets the nomineeSex value for this FguwPolicyVO.
     * 
     * @return nomineeSex
     */
    public java.lang.String getNomineeSex() {
        return nomineeSex;
    }


    /**
     * Sets the nomineeSex value for this FguwPolicyVO.
     * 
     * @param nomineeSex
     */
    public void setNomineeSex(java.lang.String nomineeSex) {
        this.nomineeSex = nomineeSex;
    }


    /**
     * Gets the nomineeMinorFlag value for this FguwPolicyVO.
     * 
     * @return nomineeMinorFlag
     */
    public java.lang.String getNomineeMinorFlag() {
        return nomineeMinorFlag;
    }


    /**
     * Sets the nomineeMinorFlag value for this FguwPolicyVO.
     * 
     * @param nomineeMinorFlag
     */
    public void setNomineeMinorFlag(java.lang.String nomineeMinorFlag) {
        this.nomineeMinorFlag = nomineeMinorFlag;
    }


    /**
     * Gets the guardianCode value for this FguwPolicyVO.
     * 
     * @return guardianCode   * MaxLength=8::ErrorLength=E_FICUW_WS_190
     */
    public java.lang.String getGuardianCode() {
        return guardianCode;
    }


    /**
     * Sets the guardianCode value for this FguwPolicyVO.
     * 
     * @param guardianCode   * MaxLength=8::ErrorLength=E_FICUW_WS_190
     */
    public void setGuardianCode(java.lang.String guardianCode) {
        this.guardianCode = guardianCode;
    }


    /**
     * Gets the guardianDesc value for this FguwPolicyVO.
     * 
     * @return guardianDesc
     */
    public java.lang.String getGuardianDesc() {
        return guardianDesc;
    }


    /**
     * Sets the guardianDesc value for this FguwPolicyVO.
     * 
     * @param guardianDesc
     */
    public void setGuardianDesc(java.lang.String guardianDesc) {
        this.guardianDesc = guardianDesc;
    }


    /**
     * Gets the guardianAge value for this FguwPolicyVO.
     * 
     * @return guardianAge   * preDecimalPrecision=3::postDecimalPrecision=2::ErrorPrecision=E_FICUW_WS_191
     */
    public java.math.BigDecimal getGuardianAge() {
        return guardianAge;
    }


    /**
     * Sets the guardianAge value for this FguwPolicyVO.
     * 
     * @param guardianAge   * preDecimalPrecision=3::postDecimalPrecision=2::ErrorPrecision=E_FICUW_WS_191
     */
    public void setGuardianAge(java.math.BigDecimal guardianAge) {
        this.guardianAge = guardianAge;
    }


    /**
     * Gets the relationWithNominee value for this FguwPolicyVO.
     * 
     * @return relationWithNominee   * MaxLength=4::ErrorLength=E_FICUW_WS_192::Auxiliary=Iaxmmccd:PART::ErrorAux=E_FICUW_AUX_030
     */
    public java.lang.String getRelationWithNominee() {
        return relationWithNominee;
    }


    /**
     * Sets the relationWithNominee value for this FguwPolicyVO.
     * 
     * @param relationWithNominee   * MaxLength=4::ErrorLength=E_FICUW_WS_192::Auxiliary=Iaxmmccd:PART::ErrorAux=E_FICUW_AUX_030
     */
    public void setRelationWithNominee(java.lang.String relationWithNominee) {
        this.relationWithNominee = relationWithNominee;
    }


    /**
     * Gets the relationWithNomineeDesc value for this FguwPolicyVO.
     * 
     * @return relationWithNomineeDesc
     */
    public java.lang.String getRelationWithNomineeDesc() {
        return relationWithNomineeDesc;
    }


    /**
     * Sets the relationWithNomineeDesc value for this FguwPolicyVO.
     * 
     * @param relationWithNomineeDesc
     */
    public void setRelationWithNomineeDesc(java.lang.String relationWithNomineeDesc) {
        this.relationWithNomineeDesc = relationWithNomineeDesc;
    }


    /**
     * Gets the nomineeAddr1 value for this FguwPolicyVO.
     * 
     * @return nomineeAddr1   * MaxLength=40::ErrorLength=E_FICUW_WS_193
     */
    public java.lang.String getNomineeAddr1() {
        return nomineeAddr1;
    }


    /**
     * Sets the nomineeAddr1 value for this FguwPolicyVO.
     * 
     * @param nomineeAddr1   * MaxLength=40::ErrorLength=E_FICUW_WS_193
     */
    public void setNomineeAddr1(java.lang.String nomineeAddr1) {
        this.nomineeAddr1 = nomineeAddr1;
    }


    /**
     * Gets the nomineeAddr2 value for this FguwPolicyVO.
     * 
     * @return nomineeAddr2   * MaxLength=40::ErrorLength=E_FICUW_WS_194
     */
    public java.lang.String getNomineeAddr2() {
        return nomineeAddr2;
    }


    /**
     * Sets the nomineeAddr2 value for this FguwPolicyVO.
     * 
     * @param nomineeAddr2   * MaxLength=40::ErrorLength=E_FICUW_WS_194
     */
    public void setNomineeAddr2(java.lang.String nomineeAddr2) {
        this.nomineeAddr2 = nomineeAddr2;
    }


    /**
     * Gets the nomineeAddr3 value for this FguwPolicyVO.
     * 
     * @return nomineeAddr3   * MaxLength=40::ErrorLength=E_FICUW_WS_195
     */
    public java.lang.String getNomineeAddr3() {
        return nomineeAddr3;
    }


    /**
     * Sets the nomineeAddr3 value for this FguwPolicyVO.
     * 
     * @param nomineeAddr3   * MaxLength=40::ErrorLength=E_FICUW_WS_195
     */
    public void setNomineeAddr3(java.lang.String nomineeAddr3) {
        this.nomineeAddr3 = nomineeAddr3;
    }


    /**
     * Gets the nomineeAddr4 value for this FguwPolicyVO.
     * 
     * @return nomineeAddr4   * MaxLength=40::ErrorLength=E_FICUW_WS_196
     */
    public java.lang.String getNomineeAddr4() {
        return nomineeAddr4;
    }


    /**
     * Sets the nomineeAddr4 value for this FguwPolicyVO.
     * 
     * @param nomineeAddr4   * MaxLength=40::ErrorLength=E_FICUW_WS_196
     */
    public void setNomineeAddr4(java.lang.String nomineeAddr4) {
        this.nomineeAddr4 = nomineeAddr4;
    }


    /**
     * Gets the clientVO value for this FguwPolicyVO.
     * 
     * @return clientVO
     */
    public com.firstapex.rs.uw.webservices.policymovements.ClientVO getClientVO() {
        return clientVO;
    }


    /**
     * Sets the clientVO value for this FguwPolicyVO.
     * 
     * @param clientVO
     */
    public void setClientVO(com.firstapex.rs.uw.webservices.policymovements.ClientVO clientVO) {
        this.clientVO = clientVO;
    }


    /**
     * Gets the policyCoverageVOList value for this FguwPolicyVO.
     * 
     * @return policyCoverageVOList
     */
    public com.firstapex.rs.uw.webservices.policymovements.PolicyCoverageVO[] getPolicyCoverageVOList() {
        return policyCoverageVOList;
    }


    /**
     * Sets the policyCoverageVOList value for this FguwPolicyVO.
     * 
     * @param policyCoverageVOList
     */
    public void setPolicyCoverageVOList(com.firstapex.rs.uw.webservices.policymovements.PolicyCoverageVO[] policyCoverageVOList) {
        this.policyCoverageVOList = policyCoverageVOList;
    }

    public com.firstapex.rs.uw.webservices.policymovements.PolicyCoverageVO getPolicyCoverageVOList(int i) {
        return this.policyCoverageVOList[i];
    }

    public void setPolicyCoverageVOList(int i, com.firstapex.rs.uw.webservices.policymovements.PolicyCoverageVO _value) {
        this.policyCoverageVOList[i] = _value;
    }


    /**
     * Gets the itemSectionVOList value for this FguwPolicyVO.
     * 
     * @return itemSectionVOList
     */
    public com.firstapex.rs.uw.webservices.policymovements.RsItemSectionVO[] getItemSectionVOList() {
        return itemSectionVOList;
    }


    /**
     * Sets the itemSectionVOList value for this FguwPolicyVO.
     * 
     * @param itemSectionVOList
     */
    public void setItemSectionVOList(com.firstapex.rs.uw.webservices.policymovements.RsItemSectionVO[] itemSectionVOList) {
        this.itemSectionVOList = itemSectionVOList;
    }

    public com.firstapex.rs.uw.webservices.policymovements.RsItemSectionVO getItemSectionVOList(int i) {
        return this.itemSectionVOList[i];
    }

    public void setItemSectionVOList(int i, com.firstapex.rs.uw.webservices.policymovements.RsItemSectionVO _value) {
        this.itemSectionVOList[i] = _value;
    }


    /**
     * Gets the settlementVOList value for this FguwPolicyVO.
     * 
     * @return settlementVOList
     */
    public com.firstapex.rs.uw.webservices.policymovements.SettlementVO[] getSettlementVOList() {
        return settlementVOList;
    }


    /**
     * Sets the settlementVOList value for this FguwPolicyVO.
     * 
     * @param settlementVOList
     */
    public void setSettlementVOList(com.firstapex.rs.uw.webservices.policymovements.SettlementVO[] settlementVOList) {
        this.settlementVOList = settlementVOList;
    }

    public com.firstapex.rs.uw.webservices.policymovements.SettlementVO getSettlementVOList(int i) {
        return this.settlementVOList[i];
    }

    public void setSettlementVOList(int i, com.firstapex.rs.uw.webservices.policymovements.SettlementVO _value) {
        this.settlementVOList[i] = _value;
    }


    /**
     * Gets the userTextVO value for this FguwPolicyVO.
     * 
     * @return userTextVO
     */
    public com.firstapex.rs.uw.webservices.policymovements.RsUserTextVO getUserTextVO() {
        return userTextVO;
    }


    /**
     * Sets the userTextVO value for this FguwPolicyVO.
     * 
     * @param userTextVO
     */
    public void setUserTextVO(com.firstapex.rs.uw.webservices.policymovements.RsUserTextVO userTextVO) {
        this.userTextVO = userTextVO;
    }


    /**
     * Gets the creditCardVO value for this FguwPolicyVO.
     * 
     * @return creditCardVO
     */
    public com.firstapex.rs.uw.webservices.policymovements.CreditCardVO getCreditCardVO() {
        return creditCardVO;
    }


    /**
     * Sets the creditCardVO value for this FguwPolicyVO.
     * 
     * @param creditCardVO
     */
    public void setCreditCardVO(com.firstapex.rs.uw.webservices.policymovements.CreditCardVO creditCardVO) {
        this.creditCardVO = creditCardVO;
    }


    /**
     * Gets the chequeVO value for this FguwPolicyVO.
     * 
     * @return chequeVO
     */
    public com.firstapex.rs.uw.webservices.policymovements.ChequeVO getChequeVO() {
        return chequeVO;
    }


    /**
     * Sets the chequeVO value for this FguwPolicyVO.
     * 
     * @param chequeVO
     */
    public void setChequeVO(com.firstapex.rs.uw.webservices.policymovements.ChequeVO chequeVO) {
        this.chequeVO = chequeVO;
    }


    /**
     * Gets the mandateVO value for this FguwPolicyVO.
     * 
     * @return mandateVO
     */
    public com.firstapex.rs.uw.webservices.policymovements.MandateVO getMandateVO() {
        return mandateVO;
    }


    /**
     * Sets the mandateVO value for this FguwPolicyVO.
     * 
     * @param mandateVO
     */
    public void setMandateVO(com.firstapex.rs.uw.webservices.policymovements.MandateVO mandateVO) {
        this.mandateVO = mandateVO;
    }
    
    public java.lang.String getIUWP1_POL_WARR() {
		return IUWP1_POL_WARR;
	}

	public void setIUWP1_POL_WARR(java.lang.String iUWP1_POL_WARR) {
		IUWP1_POL_WARR = iUWP1_POL_WARR;
	}
	
//    public com.firstapex.rs.uw.webservices.policymovements.OldPolicyVO getOldPolicyVO() {
//		return OldPolicyVO;
//	}
//
//	public void setOldPolicyVO(com.firstapex.rs.uw.webservices.policymovements.OldPolicyVO oldPolicyVO) {
//		OldPolicyVO = oldPolicyVO;
//	}

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FguwPolicyVO)) return false;
        FguwPolicyVO other = (FguwPolicyVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oprId==null && other.getOprId()==null) || 
             (this.oprId!=null &&
              this.oprId.equals(other.getOprId()))) &&
            ((this.polNo==null && other.getPolNo()==null) || 
             (this.polNo!=null &&
              this.polNo.equals(other.getPolNo()))) &&
            ((this.collationID==null && other.getCollationID()==null) || 
             (this.collationID!=null &&
              this.collationID.equals(other.getCollationID()))) &&
            ((this.endtNo==null && other.getEndtNo()==null) || 
             (this.endtNo!=null &&
              this.endtNo.equals(other.getEndtNo()))) &&
            ((this.IUWP1_PRD_CD==null && other.getIUWP1_PRD_CD()==null) || 
             (this.IUWP1_PRD_CD!=null &&
              this.IUWP1_PRD_CD.equals(other.getIUWP1_PRD_CD()))) &&
            ((this.IUWP1_ENDT_REAS==null && other.getIUWP1_ENDT_REAS()==null) || 
             (this.IUWP1_ENDT_REAS!=null &&
              this.IUWP1_ENDT_REAS.equals(other.getIUWP1_ENDT_REAS()))) &&
            ((this.IUWP1_CAT_CD==null && other.getIUWP1_CAT_CD()==null) || 
             (this.IUWP1_CAT_CD!=null &&
              this.IUWP1_CAT_CD.equals(other.getIUWP1_CAT_CD()))) &&
            ((this.IUWP1_ACC_CD==null && other.getIUWP1_ACC_CD()==null) || 
             (this.IUWP1_ACC_CD!=null &&
              this.IUWP1_ACC_CD.equals(other.getIUWP1_ACC_CD()))) &&
            ((this.IUWP1_BR_CD==null && other.getIUWP1_BR_CD()==null) || 
             (this.IUWP1_BR_CD!=null &&
              this.IUWP1_BR_CD.equals(other.getIUWP1_BR_CD()))) &&
            ((this.isNewAgent==null && other.getIsNewAgent()==null) || 
             (this.isNewAgent!=null &&
              this.isNewAgent.equals(other.getIsNewAgent()))) &&
            ((this.isNewClient==null && other.getIsNewClient()==null) || 
             (this.isNewClient!=null &&
              this.isNewClient.equals(other.getIsNewClient()))) &&
            ((this.IUWP1_CLI_CD==null && other.getIUWP1_CLI_CD()==null) || 
             (this.IUWP1_CLI_CD!=null &&
              this.IUWP1_CLI_CD.equals(other.getIUWP1_CLI_CD()))) &&
            ((this.IUWP1_POL_NO_GEN_ID==null && other.getIUWP1_POL_NO_GEN_ID()==null) || 
             (this.IUWP1_POL_NO_GEN_ID!=null &&
              this.IUWP1_POL_NO_GEN_ID.equals(other.getIUWP1_POL_NO_GEN_ID()))) &&
            ((this.IUWP1_DOM==null && other.getIUWP1_DOM()==null) || 
             (this.IUWP1_DOM!=null &&
              this.IUWP1_DOM.equals(other.getIUWP1_DOM()))) &&
            ((this.IUWP1_TERR==null && other.getIUWP1_TERR()==null) || 
             (this.IUWP1_TERR!=null &&
              this.IUWP1_TERR.equals(other.getIUWP1_TERR()))) &&
            ((this.IUWP1_UWYR==null && other.getIUWP1_UWYR()==null) || 
             (this.IUWP1_UWYR!=null &&
              this.IUWP1_UWYR.equals(other.getIUWP1_UWYR()))) &&
            ((this.IUWP1_BUS_TP==null && other.getIUWP1_BUS_TP()==null) || 
             (this.IUWP1_BUS_TP!=null &&
              this.IUWP1_BUS_TP.equals(other.getIUWP1_BUS_TP()))) &&
            ((this.IUWP1_ORACC_CD==null && other.getIUWP1_ORACC_CD()==null) || 
             (this.IUWP1_ORACC_CD!=null &&
              this.IUWP1_ORACC_CD.equals(other.getIUWP1_ORACC_CD()))) &&
            ((this.IUWP1_TERM==null && other.getIUWP1_TERM()==null) || 
             (this.IUWP1_TERM!=null &&
              this.IUWP1_TERM.equals(other.getIUWP1_TERM()))) &&
            ((this.IUWP1_METH_PAY==null && other.getIUWP1_METH_PAY()==null) || 
             (this.IUWP1_METH_PAY!=null &&
              this.IUWP1_METH_PAY.equals(other.getIUWP1_METH_PAY()))) &&
            ((this.IUWP1_INSTL_MODE==null && other.getIUWP1_INSTL_MODE()==null) || 
             (this.IUWP1_INSTL_MODE!=null &&
              this.IUWP1_INSTL_MODE.equals(other.getIUWP1_INSTL_MODE()))) &&
            ((this.IUWP1_RN_CD==null && other.getIUWP1_RN_CD()==null) || 
             (this.IUWP1_RN_CD!=null &&
              this.IUWP1_RN_CD.equals(other.getIUWP1_RN_CD()))) &&
            ((this.IUWP1_OLD_POL_NO==null && other.getIUWP1_OLD_POL_NO()==null) || 
             (this.IUWP1_OLD_POL_NO!=null &&
              this.IUWP1_OLD_POL_NO.equals(other.getIUWP1_OLD_POL_NO()))) &&
            ((this.IUWP1_SI_CUR==null && other.getIUWP1_SI_CUR()==null) || 
             (this.IUWP1_SI_CUR!=null &&
              this.IUWP1_SI_CUR.equals(other.getIUWP1_SI_CUR()))) &&
            ((this.IUWP1_PRM_CUR==null && other.getIUWP1_PRM_CUR()==null) || 
             (this.IUWP1_PRM_CUR!=null &&
              this.IUWP1_PRM_CUR.equals(other.getIUWP1_PRM_CUR()))) &&
            ((this.primeIUWP1_INCR_SI==null && other.getPrimeIUWP1_INCR_SI()==null) || 
             (this.primeIUWP1_INCR_SI!=null &&
              this.primeIUWP1_INCR_SI.equals(other.getPrimeIUWP1_INCR_SI()))) &&
            ((this.IUWP1_POL_CREF_NO==null && other.getIUWP1_POL_CREF_NO()==null) || 
             (this.IUWP1_POL_CREF_NO!=null &&
              this.IUWP1_POL_CREF_NO.equals(other.getIUWP1_POL_CREF_NO()))) &&
            ((this.IUWP1_PLAN_NO==null && other.getIUWP1_PLAN_NO()==null) || 
             (this.IUWP1_PLAN_NO!=null &&
              this.IUWP1_PLAN_NO.equals(other.getIUWP1_PLAN_NO()))) &&
            ((this.IUWP1_DECLN_NO==null && other.getIUWP1_DECLN_NO()==null) || 
             (this.IUWP1_DECLN_NO!=null &&
              this.IUWP1_DECLN_NO.equals(other.getIUWP1_DECLN_NO()))) &&
            ((this.IUWP1_COV_NOTE_NO==null && other.getIUWP1_COV_NOTE_NO()==null) || 
             (this.IUWP1_COV_NOTE_NO!=null &&
              this.IUWP1_COV_NOTE_NO.equals(other.getIUWP1_COV_NOTE_NO()))) &&
            ((this.IUWP1_COV_NOTE_DT==null && other.getIUWP1_COV_NOTE_DT()==null) || 
             (this.IUWP1_COV_NOTE_DT!=null &&
              this.IUWP1_COV_NOTE_DT.equals(other.getIUWP1_COV_NOTE_DT()))) &&
            ((this.IUWP1_ICP_DT==null && other.getIUWP1_ICP_DT()==null) || 
             (this.IUWP1_ICP_DT!=null &&
              this.IUWP1_ICP_DT.equals(other.getIUWP1_ICP_DT()))) &&
            ((this.IUWP1_EXP_DT==null && other.getIUWP1_EXP_DT()==null) || 
             (this.IUWP1_EXP_DT!=null &&
              this.IUWP1_EXP_DT.equals(other.getIUWP1_EXP_DT()))) &&
            ((this.IUWP1_ISS_DT==null && other.getIUWP1_ISS_DT()==null) || 
             (this.IUWP1_ISS_DT!=null &&
              this.IUWP1_ISS_DT.equals(other.getIUWP1_ISS_DT()))) &&
            ((this.IUWP1_ACC_DT==null && other.getIUWP1_ACC_DT()==null) || 
             (this.IUWP1_ACC_DT!=null &&
              this.IUWP1_ACC_DT.equals(other.getIUWP1_ACC_DT()))) &&
            ((this.IUWP1_EFF_DT==null && other.getIUWP1_EFF_DT()==null) || 
             (this.IUWP1_EFF_DT!=null &&
              this.IUWP1_EFF_DT.equals(other.getIUWP1_EFF_DT()))) &&
            ((this.IUWP1_PROPOSAL_DT==null && other.getIUWP1_PROPOSAL_DT()==null) || 
             (this.IUWP1_PROPOSAL_DT!=null &&
              this.IUWP1_PROPOSAL_DT.equals(other.getIUWP1_PROPOSAL_DT()))) &&
            ((this.strIUWP1_ICP_TM==null && other.getStrIUWP1_ICP_TM()==null) || 
             (this.strIUWP1_ICP_TM!=null &&
              this.strIUWP1_ICP_TM.equals(other.getStrIUWP1_ICP_TM()))) &&
            ((this.strIUWP1_EXP_TM==null && other.getStrIUWP1_EXP_TM()==null) || 
             (this.strIUWP1_EXP_TM!=null &&
              this.strIUWP1_EXP_TM.equals(other.getStrIUWP1_EXP_TM()))) &&
            ((this.clientUpdateFlag==null && other.getClientUpdateFlag()==null) || 
             (this.clientUpdateFlag!=null &&
              this.clientUpdateFlag.equals(other.getClientUpdateFlag()))) &&
            ((this.IUWP1_OTH_INT_PTY_CD1==null && other.getIUWP1_OTH_INT_PTY_CD1()==null) || 
             (this.IUWP1_OTH_INT_PTY_CD1!=null &&
              this.IUWP1_OTH_INT_PTY_CD1.equals(other.getIUWP1_OTH_INT_PTY_CD1()))) &&
            ((this.IUWP1_OTH_INT_PTY_CD2==null && other.getIUWP1_OTH_INT_PTY_CD2()==null) || 
             (this.IUWP1_OTH_INT_PTY_CD2!=null &&
              this.IUWP1_OTH_INT_PTY_CD2.equals(other.getIUWP1_OTH_INT_PTY_CD2()))) &&
            ((this.IUWP1_OTH_INT_PTY_CD3==null && other.getIUWP1_OTH_INT_PTY_CD3()==null) || 
             (this.IUWP1_OTH_INT_PTY_CD3!=null &&
              this.IUWP1_OTH_INT_PTY_CD3.equals(other.getIUWP1_OTH_INT_PTY_CD3()))) &&
            ((this.IUWP1_OTH_INT_PTY_CD4==null && other.getIUWP1_OTH_INT_PTY_CD4()==null) || 
             (this.IUWP1_OTH_INT_PTY_CD4!=null &&
              this.IUWP1_OTH_INT_PTY_CD4.equals(other.getIUWP1_OTH_INT_PTY_CD4()))) &&
            ((this.IUWP1_CLI_ADDR_1==null && other.getIUWP1_CLI_ADDR_1()==null) || 
             (this.IUWP1_CLI_ADDR_1!=null &&
              this.IUWP1_CLI_ADDR_1.equals(other.getIUWP1_CLI_ADDR_1()))) &&
            ((this.IUWP1_CLI_ADDR_2==null && other.getIUWP1_CLI_ADDR_2()==null) || 
             (this.IUWP1_CLI_ADDR_2!=null &&
              this.IUWP1_CLI_ADDR_2.equals(other.getIUWP1_CLI_ADDR_2()))) &&
            ((this.IUWP1_CLI_ADDR_3==null && other.getIUWP1_CLI_ADDR_3()==null) || 
             (this.IUWP1_CLI_ADDR_3!=null &&
              this.IUWP1_CLI_ADDR_3.equals(other.getIUWP1_CLI_ADDR_3()))) &&
            ((this.IUWP1_CLI_ADDR_4==null && other.getIUWP1_CLI_ADDR_4()==null) || 
             (this.IUWP1_CLI_ADDR_4!=null &&
              this.IUWP1_CLI_ADDR_4.equals(other.getIUWP1_CLI_ADDR_4()))) &&
            ((this.receiptNumber==null && other.getReceiptNumber()==null) || 
             (this.receiptNumber!=null &&
              this.receiptNumber.equals(other.getReceiptNumber()))) &&
            ((this.voucherAmount==null && other.getVoucherAmount()==null) || 
             (this.voucherAmount!=null &&
              this.voucherAmount.equals(other.getVoucherAmount()))) &&
            ((this.bankCode==null && other.getBankCode()==null) || 
             (this.bankCode!=null &&
              this.bankCode.equals(other.getBankCode()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.vipFlag==null && other.getVipFlag()==null) || 
             (this.vipFlag!=null &&
              this.vipFlag.equals(other.getVipFlag()))) &&
            ((this.panNo==null && other.getPanNo()==null) || 
             (this.panNo!=null &&
              this.panNo.equals(other.getPanNo()))) &&
            ((this.vipFlag2==null && other.getVipFlag2()==null) || 
             (this.vipFlag2!=null &&
              this.vipFlag2.equals(other.getVipFlag2()))) &&
            ((this.panNo2==null && other.getPanNo2()==null) || 
             (this.panNo2!=null &&
              this.panNo2.equals(other.getPanNo2()))) &&
            ((this.isNewNominee==null && other.getIsNewNominee()==null) || 
             (this.isNewNominee!=null &&
              this.isNewNominee.equals(other.getIsNewNominee()))) &&
            ((this.nomineeCode==null && other.getNomineeCode()==null) || 
             (this.nomineeCode!=null &&
              this.nomineeCode.equals(other.getNomineeCode()))) &&
            ((this.nomineeDesc==null && other.getNomineeDesc()==null) || 
             (this.nomineeDesc!=null &&
              this.nomineeDesc.equals(other.getNomineeDesc()))) &&
            ((this.relationWithProposer==null && other.getRelationWithProposer()==null) || 
             (this.relationWithProposer!=null &&
              this.relationWithProposer.equals(other.getRelationWithProposer()))) &&
            ((this.relationWithProposerDesc==null && other.getRelationWithProposerDesc()==null) || 
             (this.relationWithProposerDesc!=null &&
              this.relationWithProposerDesc.equals(other.getRelationWithProposerDesc()))) &&
            ((this.nomineeDOB==null && other.getNomineeDOB()==null) || 
             (this.nomineeDOB!=null &&
              this.nomineeDOB.equals(other.getNomineeDOB()))) &&
            ((this.nomineeSex==null && other.getNomineeSex()==null) || 
             (this.nomineeSex!=null &&
              this.nomineeSex.equals(other.getNomineeSex()))) &&
            ((this.nomineeMinorFlag==null && other.getNomineeMinorFlag()==null) || 
             (this.nomineeMinorFlag!=null &&
              this.nomineeMinorFlag.equals(other.getNomineeMinorFlag()))) &&
            ((this.guardianCode==null && other.getGuardianCode()==null) || 
             (this.guardianCode!=null &&
              this.guardianCode.equals(other.getGuardianCode()))) &&
            ((this.guardianDesc==null && other.getGuardianDesc()==null) || 
             (this.guardianDesc!=null &&
              this.guardianDesc.equals(other.getGuardianDesc()))) &&
            ((this.guardianAge==null && other.getGuardianAge()==null) || 
             (this.guardianAge!=null &&
              this.guardianAge.equals(other.getGuardianAge()))) &&
            ((this.relationWithNominee==null && other.getRelationWithNominee()==null) || 
             (this.relationWithNominee!=null &&
              this.relationWithNominee.equals(other.getRelationWithNominee()))) &&
            ((this.relationWithNomineeDesc==null && other.getRelationWithNomineeDesc()==null) || 
             (this.relationWithNomineeDesc!=null &&
              this.relationWithNomineeDesc.equals(other.getRelationWithNomineeDesc()))) &&
            ((this.nomineeAddr1==null && other.getNomineeAddr1()==null) || 
             (this.nomineeAddr1!=null &&
              this.nomineeAddr1.equals(other.getNomineeAddr1()))) &&
            ((this.nomineeAddr2==null && other.getNomineeAddr2()==null) || 
             (this.nomineeAddr2!=null &&
              this.nomineeAddr2.equals(other.getNomineeAddr2()))) &&
            ((this.nomineeAddr3==null && other.getNomineeAddr3()==null) || 
             (this.nomineeAddr3!=null &&
              this.nomineeAddr3.equals(other.getNomineeAddr3()))) &&
            ((this.nomineeAddr4==null && other.getNomineeAddr4()==null) || 
             (this.nomineeAddr4!=null &&
              this.nomineeAddr4.equals(other.getNomineeAddr4()))) &&
            ((this.IUWP1_POL_WARR==null && other.getIUWP1_POL_WARR()==null) || 
              (this.IUWP1_POL_WARR!=null &&
               this.IUWP1_POL_WARR.equals(other.getIUWP1_POL_WARR()))) &&
            ((this.clientVO==null && other.getClientVO()==null) || 
             (this.clientVO!=null &&
              this.clientVO.equals(other.getClientVO()))) &&
            ((this.policyCoverageVOList==null && other.getPolicyCoverageVOList()==null) || 
             (this.policyCoverageVOList!=null &&
              java.util.Arrays.equals(this.policyCoverageVOList, other.getPolicyCoverageVOList()))) &&
            ((this.itemSectionVOList==null && other.getItemSectionVOList()==null) || 
             (this.itemSectionVOList!=null &&
              java.util.Arrays.equals(this.itemSectionVOList, other.getItemSectionVOList()))) &&
            ((this.settlementVOList==null && other.getSettlementVOList()==null) || 
             (this.settlementVOList!=null &&
              java.util.Arrays.equals(this.settlementVOList, other.getSettlementVOList()))) &&
            ((this.userTextVO==null && other.getUserTextVO()==null) || 
             (this.userTextVO!=null &&
              this.userTextVO.equals(other.getUserTextVO()))) &&
            ((this.creditCardVO==null && other.getCreditCardVO()==null) || 
             (this.creditCardVO!=null &&
              this.creditCardVO.equals(other.getCreditCardVO()))) &&
            ((this.chequeVO==null && other.getChequeVO()==null) || 
             (this.chequeVO!=null &&
              this.chequeVO.equals(other.getChequeVO()))) &&
            ((this.mandateVO==null && other.getMandateVO()==null) || 
             (this.mandateVO!=null &&
              this.mandateVO.equals(other.getMandateVO())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOprId() != null) {
            _hashCode += getOprId().hashCode();
        }
        if (getPolNo() != null) {
            _hashCode += getPolNo().hashCode();
        }
        if (getCollationID() != null) {
            _hashCode += getCollationID().hashCode();
        }
        if (getEndtNo() != null) {
            _hashCode += getEndtNo().hashCode();
        }
        if (getIUWP1_PRD_CD() != null) {
            _hashCode += getIUWP1_PRD_CD().hashCode();
        }
        if (getIUWP1_ENDT_REAS() != null) {
            _hashCode += getIUWP1_ENDT_REAS().hashCode();
        }
        if (getIUWP1_CAT_CD() != null) {
            _hashCode += getIUWP1_CAT_CD().hashCode();
        }
        if (getIUWP1_ACC_CD() != null) {
            _hashCode += getIUWP1_ACC_CD().hashCode();
        }
        if (getIUWP1_BR_CD() != null) {
            _hashCode += getIUWP1_BR_CD().hashCode();
        }
        if (getIsNewAgent() != null) {
            _hashCode += getIsNewAgent().hashCode();
        }
        if (getIsNewClient() != null) {
            _hashCode += getIsNewClient().hashCode();
        }
        if (getIUWP1_CLI_CD() != null) {
            _hashCode += getIUWP1_CLI_CD().hashCode();
        }
        if (getIUWP1_POL_NO_GEN_ID() != null) {
            _hashCode += getIUWP1_POL_NO_GEN_ID().hashCode();
        }
        if (getIUWP1_DOM() != null) {
            _hashCode += getIUWP1_DOM().hashCode();
        }
        if (getIUWP1_TERR() != null) {
            _hashCode += getIUWP1_TERR().hashCode();
        }
        if (getIUWP1_UWYR() != null) {
            _hashCode += getIUWP1_UWYR().hashCode();
        }
        if (getIUWP1_BUS_TP() != null) {
            _hashCode += getIUWP1_BUS_TP().hashCode();
        }
        if (getIUWP1_ORACC_CD() != null) {
            _hashCode += getIUWP1_ORACC_CD().hashCode();
        }
        if (getIUWP1_TERM() != null) {
            _hashCode += getIUWP1_TERM().hashCode();
        }
        if (getIUWP1_METH_PAY() != null) {
            _hashCode += getIUWP1_METH_PAY().hashCode();
        }
        if (getIUWP1_INSTL_MODE() != null) {
            _hashCode += getIUWP1_INSTL_MODE().hashCode();
        }
        if (getIUWP1_RN_CD() != null) {
            _hashCode += getIUWP1_RN_CD().hashCode();
        }
        if (getIUWP1_OLD_POL_NO() != null) {
            _hashCode += getIUWP1_OLD_POL_NO().hashCode();
        }
        if (getIUWP1_SI_CUR() != null) {
            _hashCode += getIUWP1_SI_CUR().hashCode();
        }
        if (getIUWP1_PRM_CUR() != null) {
            _hashCode += getIUWP1_PRM_CUR().hashCode();
        }
        if (getPrimeIUWP1_INCR_SI() != null) {
            _hashCode += getPrimeIUWP1_INCR_SI().hashCode();
        }
        if (getIUWP1_POL_CREF_NO() != null) {
            _hashCode += getIUWP1_POL_CREF_NO().hashCode();
        }
        if (getIUWP1_PLAN_NO() != null) {
            _hashCode += getIUWP1_PLAN_NO().hashCode();
        }
        if (getIUWP1_DECLN_NO() != null) {
            _hashCode += getIUWP1_DECLN_NO().hashCode();
        }
        if (getIUWP1_COV_NOTE_NO() != null) {
            _hashCode += getIUWP1_COV_NOTE_NO().hashCode();
        }
        if (getIUWP1_COV_NOTE_DT() != null) {
            _hashCode += getIUWP1_COV_NOTE_DT().hashCode();
        }
        if (getIUWP1_ICP_DT() != null) {
            _hashCode += getIUWP1_ICP_DT().hashCode();
        }
        if (getIUWP1_EXP_DT() != null) {
            _hashCode += getIUWP1_EXP_DT().hashCode();
        }
        if (getIUWP1_ISS_DT() != null) {
            _hashCode += getIUWP1_ISS_DT().hashCode();
        }
        if (getIUWP1_ACC_DT() != null) {
            _hashCode += getIUWP1_ACC_DT().hashCode();
        }
        if (getIUWP1_EFF_DT() != null) {
            _hashCode += getIUWP1_EFF_DT().hashCode();
        }
        if (getIUWP1_PROPOSAL_DT() != null) {
            _hashCode += getIUWP1_PROPOSAL_DT().hashCode();
        }
        if (getStrIUWP1_ICP_TM() != null) {
            _hashCode += getStrIUWP1_ICP_TM().hashCode();
        }
        if (getStrIUWP1_EXP_TM() != null) {
            _hashCode += getStrIUWP1_EXP_TM().hashCode();
        }
        if (getClientUpdateFlag() != null) {
            _hashCode += getClientUpdateFlag().hashCode();
        }
        if (getIUWP1_OTH_INT_PTY_CD1() != null) {
            _hashCode += getIUWP1_OTH_INT_PTY_CD1().hashCode();
        }
        if (getIUWP1_OTH_INT_PTY_CD2() != null) {
            _hashCode += getIUWP1_OTH_INT_PTY_CD2().hashCode();
        }
        if (getIUWP1_OTH_INT_PTY_CD3() != null) {
            _hashCode += getIUWP1_OTH_INT_PTY_CD3().hashCode();
        }
        if (getIUWP1_OTH_INT_PTY_CD4() != null) {
            _hashCode += getIUWP1_OTH_INT_PTY_CD4().hashCode();
        }
        if (getIUWP1_CLI_ADDR_1() != null) {
            _hashCode += getIUWP1_CLI_ADDR_1().hashCode();
        }
        if (getIUWP1_CLI_ADDR_2() != null) {
            _hashCode += getIUWP1_CLI_ADDR_2().hashCode();
        }
        if (getIUWP1_CLI_ADDR_3() != null) {
            _hashCode += getIUWP1_CLI_ADDR_3().hashCode();
        }
        if (getIUWP1_CLI_ADDR_4() != null) {
            _hashCode += getIUWP1_CLI_ADDR_4().hashCode();
        }
        if (getReceiptNumber() != null) {
            _hashCode += getReceiptNumber().hashCode();
        }
        if (getVoucherAmount() != null) {
            _hashCode += getVoucherAmount().hashCode();
        }
        if (getBankCode() != null) {
            _hashCode += getBankCode().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getVipFlag() != null) {
            _hashCode += getVipFlag().hashCode();
        }
        if (getPanNo() != null) {
            _hashCode += getPanNo().hashCode();
        }
        if (getVipFlag2() != null) {
            _hashCode += getVipFlag2().hashCode();
        }
        if (getPanNo2() != null) {
            _hashCode += getPanNo2().hashCode();
        }
        if (getIsNewNominee() != null) {
            _hashCode += getIsNewNominee().hashCode();
        }
        if (getNomineeCode() != null) {
            _hashCode += getNomineeCode().hashCode();
        }
        if (getNomineeDesc() != null) {
            _hashCode += getNomineeDesc().hashCode();
        }
        if (getRelationWithProposer() != null) {
            _hashCode += getRelationWithProposer().hashCode();
        }
        if (getRelationWithProposerDesc() != null) {
            _hashCode += getRelationWithProposerDesc().hashCode();
        }
        if (getNomineeDOB() != null) {
            _hashCode += getNomineeDOB().hashCode();
        }
        if (getNomineeSex() != null) {
            _hashCode += getNomineeSex().hashCode();
        }
        if (getNomineeMinorFlag() != null) {
            _hashCode += getNomineeMinorFlag().hashCode();
        }
        if (getGuardianCode() != null) {
            _hashCode += getGuardianCode().hashCode();
        }
        if (getGuardianDesc() != null) {
            _hashCode += getGuardianDesc().hashCode();
        }
        if (getGuardianAge() != null) {
            _hashCode += getGuardianAge().hashCode();
        }
        if (getRelationWithNominee() != null) {
            _hashCode += getRelationWithNominee().hashCode();
        }
        if (getRelationWithNomineeDesc() != null) {
            _hashCode += getRelationWithNomineeDesc().hashCode();
        }
        if (getNomineeAddr1() != null) {
            _hashCode += getNomineeAddr1().hashCode();
        }
        if (getNomineeAddr2() != null) {
            _hashCode += getNomineeAddr2().hashCode();
        }
        if (getNomineeAddr3() != null) {
            _hashCode += getNomineeAddr3().hashCode();
        }
        if (getNomineeAddr4() != null) {
            _hashCode += getNomineeAddr4().hashCode();
        }
        if (getIUWP1_POL_WARR() != null) {
            _hashCode += getIUWP1_POL_WARR().hashCode();
        }
        if (getClientVO() != null) {
            _hashCode += getClientVO().hashCode();
        }
        if (getPolicyCoverageVOList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyCoverageVOList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyCoverageVOList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemSectionVOList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemSectionVOList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemSectionVOList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSettlementVOList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSettlementVOList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSettlementVOList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserTextVO() != null) {
            _hashCode += getUserTextVO().hashCode();
        }
        if (getCreditCardVO() != null) {
            _hashCode += getCreditCardVO().hashCode();
        }
        if (getChequeVO() != null) {
            _hashCode += getChequeVO().hashCode();
        }
        if (getMandateVO() != null) {
            _hashCode += getMandateVO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FguwPolicyVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "fguwPolicyVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oprId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oprId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("polNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "polNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collationID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endtNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endtNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_PRD_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_PRD_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_ENDT_REAS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_ENDT_REAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_CAT_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_CAT_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_ACC_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_ACC_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_BR_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_BR_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNewAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isNewAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNewClient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isNewClient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_CLI_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_CLI_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_POL_NO_GEN_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_POL_NO_GEN_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_DOM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_DOM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_TERR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_TERR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_UWYR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_UWYR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_BUS_TP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_BUS_TP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_ORACC_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_ORACC_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_TERM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_TERM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_METH_PAY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_METH_PAY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_INSTL_MODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_INSTL_MODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_RN_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_RN_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_OLD_POL_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_OLD_POL_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_SI_CUR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_SI_CUR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_PRM_CUR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_PRM_CUR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primeIUWP1_INCR_SI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primeIUWP1_INCR_SI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_POL_CREF_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_POL_CREF_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_PLAN_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_PLAN_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_DECLN_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_DECLN_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_COV_NOTE_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_COV_NOTE_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_COV_NOTE_DT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_COV_NOTE_DT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_ICP_DT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_ICP_DT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_EXP_DT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_EXP_DT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_ISS_DT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_ISS_DT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_ACC_DT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_ACC_DT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_EFF_DT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_EFF_DT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_PROPOSAL_DT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_PROPOSAL_DT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strIUWP1_ICP_TM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StrIUWP1_ICP_TM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strIUWP1_EXP_TM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StrIUWP1_EXP_TM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientUpdateFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientUpdateFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_OTH_INT_PTY_CD1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_OTH_INT_PTY_CD1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_OTH_INT_PTY_CD2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_OTH_INT_PTY_CD2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_OTH_INT_PTY_CD3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_OTH_INT_PTY_CD3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_OTH_INT_PTY_CD4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_OTH_INT_PTY_CD4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_CLI_ADDR_1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_CLI_ADDR_1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_CLI_ADDR_2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_CLI_ADDR_2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_CLI_ADDR_3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_CLI_ADDR_3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_CLI_ADDR_4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_CLI_ADDR_4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "voucherAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);

        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP1_POL_WARR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP1_POL_WARR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "IUWP1_POL_WARR"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        
        
        
        
        
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vipFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vipFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("panNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "panNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vipFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vipFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("panNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "panNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNewNominee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isNewNominee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomineeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomineeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomineeDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomineeDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationWithProposer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationWithProposer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationWithProposerDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationWithProposerDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomineeDOB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomineeDOB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomineeSex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomineeSex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomineeMinorFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomineeMinorFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guardianCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guardianCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guardianDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guardianDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guardianAge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guardianAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationWithNominee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationWithNominee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationWithNomineeDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationWithNomineeDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomineeAddr1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomineeAddr1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomineeAddr2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomineeAddr2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomineeAddr3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomineeAddr3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomineeAddr4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomineeAddr4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "clientVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyCoverageVOList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyCoverageVOList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "policyCoverageVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSectionVOList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemSectionVOList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "rsItemSectionVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settlementVOList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "settlementVOList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "settlementVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userTextVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userTextVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "rsUserTextVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditCardVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "creditCardVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chequeVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "chequeVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandateVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mandateVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "mandateVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
