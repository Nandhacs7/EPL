/**
 * ItemSectionVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.uw.webservices.policymovements;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ItemSectionVO  implements java.io.Serializable {
    /* MaxLength=5::ErrorLength=E_FICUW_WS_064 */
    private java.lang.String IUWP2_ITEM_NO;

    /* MaxLength=6::ErrorLength=E_FICUW_WS_198 */
    private java.lang.String IUWP2_MAP_REF_NO;

    /* MaxLength=2::ErrorLength=E_FICUW_WS_065 */
    private java.lang.String IUWP2_SECT_NO;

    /* MaxLength=60::ErrorLength=E_FICUW_WS_066 */
    private java.lang.String IUWP2_DESC1;

    /* MaxLength=60::ErrorLength=E_FICUW_WS_066 */
    private java.lang.String IUWP2_DESC2;

    /* MaxLength=60::ErrorLength=E_FICUW_WS_066 */
    private java.lang.String IUWP2_DESC3;

    /* preDecimalPrecision=14::postDecimalPrecision=2::ErrorPrecision=E_FICUW_WS_067 */
    private java.math.BigDecimal primeIUWP2_INCR_SI=new BigDecimal(0);;

    /* MaxLength=8::ErrorLength=E_FICUW_WS_068 */
    private java.lang.String IUWP2_OTH_INT_PTY_CD;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_069::Auxiliary=Iaxmmccd:COVR::ErrorAux=E_FICUW_AUX_015 */
    private java.lang.String IUWP2_COVER_CD;

    /* MaxLength=30::ErrorLength=E_FICUW_WS_070 */
    private java.lang.String IUWP2_RSK_BLK_CD;

    /* MaxLength=30::ErrorLength=E_FICUW_WS_071 */
    private java.lang.String IUWP2_WAR;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_072::Auxiliary=Iaxmmccd:RSCT::ErrorAux=E_FICUW_AUX_016 */
    private java.lang.String IUWP2_RSK_CAT;

    /* preDecimalPrecision=3::postDecimalPrecision=2::ErrorPrecision=E_FICUW_WS_073 */
    private java.math.BigDecimal IUWP2_EMLX;

    /* MaxLength=10::ErrorLength=E_FICUW_WS_074 */
    private java.lang.String IUWP2_ZIP_CD;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_075::Auxiliary=Iaxmmccd:TERR::ErrorAux=E_FICUW_AUX_004 */
    private java.lang.String IUWP2_TERR_CD;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_076 */
    private java.lang.String IUWP2_DED_CODE;

    private java.lang.String IUWP2_SI_TP;
    
    private com.firstapex.rs.uw.webservices.policymovements.RsVehicleVO rsVehicleVO;

    private com.firstapex.rs.uw.webservices.policymovements.RsPaVO rsPaVO;

    private com.firstapex.rs.uw.webservices.policymovements.OldPolicyVO oldPolicyVO;

    private com.firstapex.rs.uw.webservices.policymovements.CoverageVO[] coverageVOList;

    public ItemSectionVO() {
    }

    public ItemSectionVO(
           java.lang.String IUWP2_ITEM_NO,
           java.lang.String IUWP2_MAP_REF_NO,
           java.lang.String IUWP2_SECT_NO,
           java.lang.String IUWP2_DESC1,
           java.lang.String IUWP2_DESC2,
           java.lang.String IUWP2_DESC3,
           java.math.BigDecimal primeIUWP2_INCR_SI,
           java.lang.String IUWP2_OTH_INT_PTY_CD,
           java.lang.String IUWP2_COVER_CD,
           java.lang.String IUWP2_RSK_BLK_CD,
           java.lang.String IUWP2_WAR,
           java.lang.String IUWP2_RSK_CAT,
           java.math.BigDecimal IUWP2_EMLX,
           java.lang.String IUWP2_ZIP_CD,
           java.lang.String IUWP2_TERR_CD,
           java.lang.String IUWP2_DED_CODE,
           java.lang.String IUWP2_SI_TP,
           com.firstapex.rs.uw.webservices.policymovements.RsVehicleVO rsVehicleVO,
           com.firstapex.rs.uw.webservices.policymovements.RsPaVO rsPaVO,
           com.firstapex.rs.uw.webservices.policymovements.OldPolicyVO oldPolicyVO,
           com.firstapex.rs.uw.webservices.policymovements.CoverageVO[] coverageVOList) {
           this.IUWP2_ITEM_NO = IUWP2_ITEM_NO;
           this.IUWP2_MAP_REF_NO = IUWP2_MAP_REF_NO;
           this.IUWP2_SECT_NO = IUWP2_SECT_NO;
           this.IUWP2_DESC1 = IUWP2_DESC1;
           this.IUWP2_DESC2 = IUWP2_DESC2;
           this.IUWP2_DESC3 = IUWP2_DESC3;
           this.primeIUWP2_INCR_SI = primeIUWP2_INCR_SI;
           this.IUWP2_OTH_INT_PTY_CD = IUWP2_OTH_INT_PTY_CD;
           this.IUWP2_COVER_CD = IUWP2_COVER_CD;
           this.IUWP2_RSK_BLK_CD = IUWP2_RSK_BLK_CD;
           this.IUWP2_WAR = IUWP2_WAR;
           this.IUWP2_RSK_CAT = IUWP2_RSK_CAT;
           this.IUWP2_EMLX = IUWP2_EMLX;
           this.IUWP2_ZIP_CD = IUWP2_ZIP_CD;
           this.IUWP2_TERR_CD = IUWP2_TERR_CD;
           this.IUWP2_DED_CODE = IUWP2_DED_CODE;
           this.IUWP2_SI_TP = IUWP2_SI_TP;
           this.rsPaVO = rsPaVO;
           this.oldPolicyVO = oldPolicyVO;
           this.coverageVOList = coverageVOList;
           this.rsVehicleVO = rsVehicleVO;
    }


    /**
     * Gets the IUWP2_ITEM_NO value for this ItemSectionVO.
     * 
     * @return IUWP2_ITEM_NO   * MaxLength=5::ErrorLength=E_FICUW_WS_064
     */
    public java.lang.String getIUWP2_ITEM_NO() {
        return IUWP2_ITEM_NO;
    }


    /**
     * Sets the IUWP2_ITEM_NO value for this ItemSectionVO.
     * 
     * @param IUWP2_ITEM_NO   * MaxLength=5::ErrorLength=E_FICUW_WS_064
     */
    public void setIUWP2_ITEM_NO(java.lang.String IUWP2_ITEM_NO) {
        this.IUWP2_ITEM_NO = IUWP2_ITEM_NO;
    }


    public com.firstapex.rs.uw.webservices.policymovements.RsVehicleVO getRsVehicleVO() {
		return rsVehicleVO;
	}

	public void setRsVehicleVO(
			com.firstapex.rs.uw.webservices.policymovements.RsVehicleVO rsVehicleVO) {
		this.rsVehicleVO = rsVehicleVO;
	}

	/**
     * Gets the IUWP2_MAP_REF_NO value for this ItemSectionVO.
     * 
     * @return IUWP2_MAP_REF_NO   * MaxLength=6::ErrorLength=E_FICUW_WS_198
     */
    public java.lang.String getIUWP2_MAP_REF_NO() {
        return IUWP2_MAP_REF_NO;
    }


    /**
     * Sets the IUWP2_MAP_REF_NO value for this ItemSectionVO.
     * 
     * @param IUWP2_MAP_REF_NO   * MaxLength=6::ErrorLength=E_FICUW_WS_198
     */
    public void setIUWP2_MAP_REF_NO(java.lang.String IUWP2_MAP_REF_NO) {
        this.IUWP2_MAP_REF_NO = IUWP2_MAP_REF_NO;
    }


    /**
     * Gets the IUWP2_SECT_NO value for this ItemSectionVO.
     * 
     * @return IUWP2_SECT_NO   * MaxLength=2::ErrorLength=E_FICUW_WS_065
     */
    public java.lang.String getIUWP2_SECT_NO() {
        return IUWP2_SECT_NO;
    }


    /**
     * Sets the IUWP2_SECT_NO value for this ItemSectionVO.
     * 
     * @param IUWP2_SECT_NO   * MaxLength=2::ErrorLength=E_FICUW_WS_065
     */
    public void setIUWP2_SECT_NO(java.lang.String IUWP2_SECT_NO) {
        this.IUWP2_SECT_NO = IUWP2_SECT_NO;
    }


    /**
     * Gets the IUWP2_DESC1 value for this ItemSectionVO.
     * 
     * @return IUWP2_DESC1   * MaxLength=60::ErrorLength=E_FICUW_WS_066
     */
    public java.lang.String getIUWP2_DESC1() {
        return IUWP2_DESC1;
    }


    /**
     * Sets the IUWP2_DESC1 value for this ItemSectionVO.
     * 
     * @param IUWP2_DESC1   * MaxLength=60::ErrorLength=E_FICUW_WS_066
     */
    public void setIUWP2_DESC1(java.lang.String IUWP2_DESC1) {
        this.IUWP2_DESC1 = IUWP2_DESC1;
    }


    /**
     * Gets the IUWP2_DESC2 value for this ItemSectionVO.
     * 
     * @return IUWP2_DESC2   * MaxLength=60::ErrorLength=E_FICUW_WS_066
     */
    public java.lang.String getIUWP2_DESC2() {
        return IUWP2_DESC2;
    }


    /**
     * Sets the IUWP2_DESC2 value for this ItemSectionVO.
     * 
     * @param IUWP2_DESC2   * MaxLength=60::ErrorLength=E_FICUW_WS_066
     */
    public void setIUWP2_DESC2(java.lang.String IUWP2_DESC2) {
        this.IUWP2_DESC2 = IUWP2_DESC2;
    }


    /**
     * Gets the IUWP2_DESC3 value for this ItemSectionVO.
     * 
     * @return IUWP2_DESC3   * MaxLength=60::ErrorLength=E_FICUW_WS_066
     */
    public java.lang.String getIUWP2_DESC3() {
        return IUWP2_DESC3;
    }


    /**
     * Sets the IUWP2_DESC3 value for this ItemSectionVO.
     * 
     * @param IUWP2_DESC3   * MaxLength=60::ErrorLength=E_FICUW_WS_066
     */
    public void setIUWP2_DESC3(java.lang.String IUWP2_DESC3) {
        this.IUWP2_DESC3 = IUWP2_DESC3;
    }


    /**
     * Gets the primeIUWP2_INCR_SI value for this ItemSectionVO.
     * 
     * @return primeIUWP2_INCR_SI   * preDecimalPrecision=14::postDecimalPrecision=2::ErrorPrecision=E_FICUW_WS_067
     */
    public java.math.BigDecimal getPrimeIUWP2_INCR_SI() {
        return primeIUWP2_INCR_SI;
    }


    /**
     * Sets the primeIUWP2_INCR_SI value for this ItemSectionVO.
     * 
     * @param primeIUWP2_INCR_SI   * preDecimalPrecision=14::postDecimalPrecision=2::ErrorPrecision=E_FICUW_WS_067
     */
    public void setPrimeIUWP2_INCR_SI(java.math.BigDecimal primeIUWP2_INCR_SI) {
        this.primeIUWP2_INCR_SI = primeIUWP2_INCR_SI;
    }


    /**
     * Gets the IUWP2_OTH_INT_PTY_CD value for this ItemSectionVO.
     * 
     * @return IUWP2_OTH_INT_PTY_CD   * MaxLength=8::ErrorLength=E_FICUW_WS_068
     */
    public java.lang.String getIUWP2_OTH_INT_PTY_CD() {
        return IUWP2_OTH_INT_PTY_CD;
    }


    /**
     * Sets the IUWP2_OTH_INT_PTY_CD value for this ItemSectionVO.
     * 
     * @param IUWP2_OTH_INT_PTY_CD   * MaxLength=8::ErrorLength=E_FICUW_WS_068
     */
    public void setIUWP2_OTH_INT_PTY_CD(java.lang.String IUWP2_OTH_INT_PTY_CD) {
        this.IUWP2_OTH_INT_PTY_CD = IUWP2_OTH_INT_PTY_CD;
    }


    /**
     * Gets the IUWP2_COVER_CD value for this ItemSectionVO.
     * 
     * @return IUWP2_COVER_CD   * MaxLength=4::ErrorLength=E_FICUW_WS_069::Auxiliary=Iaxmmccd:COVR::ErrorAux=E_FICUW_AUX_015
     */
    public java.lang.String getIUWP2_COVER_CD() {
        return IUWP2_COVER_CD;
    }


    /**
     * Sets the IUWP2_COVER_CD value for this ItemSectionVO.
     * 
     * @param IUWP2_COVER_CD   * MaxLength=4::ErrorLength=E_FICUW_WS_069::Auxiliary=Iaxmmccd:COVR::ErrorAux=E_FICUW_AUX_015
     */
    public void setIUWP2_COVER_CD(java.lang.String IUWP2_COVER_CD) {
        this.IUWP2_COVER_CD = IUWP2_COVER_CD;
    }


    /**
     * Gets the IUWP2_RSK_BLK_CD value for this ItemSectionVO.
     * 
     * @return IUWP2_RSK_BLK_CD   * MaxLength=30::ErrorLength=E_FICUW_WS_070
     */
    public java.lang.String getIUWP2_RSK_BLK_CD() {
        return IUWP2_RSK_BLK_CD;
    }


    /**
     * Sets the IUWP2_RSK_BLK_CD value for this ItemSectionVO.
     * 
     * @param IUWP2_RSK_BLK_CD   * MaxLength=30::ErrorLength=E_FICUW_WS_070
     */
    public void setIUWP2_RSK_BLK_CD(java.lang.String IUWP2_RSK_BLK_CD) {
        this.IUWP2_RSK_BLK_CD = IUWP2_RSK_BLK_CD;
    }


    /**
     * Gets the IUWP2_WAR value for this ItemSectionVO.
     * 
     * @return IUWP2_WAR   * MaxLength=30::ErrorLength=E_FICUW_WS_071
     */
    public java.lang.String getIUWP2_WAR() {
        return IUWP2_WAR;
    }


    /**
     * Sets the IUWP2_WAR value for this ItemSectionVO.
     * 
     * @param IUWP2_WAR   * MaxLength=30::ErrorLength=E_FICUW_WS_071
     */
    public void setIUWP2_WAR(java.lang.String IUWP2_WAR) {
        this.IUWP2_WAR = IUWP2_WAR;
    }


    /**
     * Gets the IUWP2_RSK_CAT value for this ItemSectionVO.
     * 
     * @return IUWP2_RSK_CAT   * MaxLength=4::ErrorLength=E_FICUW_WS_072::Auxiliary=Iaxmmccd:RSCT::ErrorAux=E_FICUW_AUX_016
     */
    public java.lang.String getIUWP2_RSK_CAT() {
        return IUWP2_RSK_CAT;
    }


    /**
     * Sets the IUWP2_RSK_CAT value for this ItemSectionVO.
     * 
     * @param IUWP2_RSK_CAT   * MaxLength=4::ErrorLength=E_FICUW_WS_072::Auxiliary=Iaxmmccd:RSCT::ErrorAux=E_FICUW_AUX_016
     */
    public void setIUWP2_RSK_CAT(java.lang.String IUWP2_RSK_CAT) {
        this.IUWP2_RSK_CAT = IUWP2_RSK_CAT;
    }


    /**
     * Gets the IUWP2_EMLX value for this ItemSectionVO.
     * 
     * @return IUWP2_EMLX   * preDecimalPrecision=3::postDecimalPrecision=2::ErrorPrecision=E_FICUW_WS_073
     */
    public java.math.BigDecimal getIUWP2_EMLX() {
        return IUWP2_EMLX;
    }


    /**
     * Sets the IUWP2_EMLX value for this ItemSectionVO.
     * 
     * @param IUWP2_EMLX   * preDecimalPrecision=3::postDecimalPrecision=2::ErrorPrecision=E_FICUW_WS_073
     */
    public void setIUWP2_EMLX(java.math.BigDecimal IUWP2_EMLX) {
        this.IUWP2_EMLX = IUWP2_EMLX;
    }


    /**
     * Gets the IUWP2_ZIP_CD value for this ItemSectionVO.
     * 
     * @return IUWP2_ZIP_CD   * MaxLength=10::ErrorLength=E_FICUW_WS_074
     */
    public java.lang.String getIUWP2_ZIP_CD() {
        return IUWP2_ZIP_CD;
    }


    /**
     * Sets the IUWP2_ZIP_CD value for this ItemSectionVO.
     * 
     * @param IUWP2_ZIP_CD   * MaxLength=10::ErrorLength=E_FICUW_WS_074
     */
    public void setIUWP2_ZIP_CD(java.lang.String IUWP2_ZIP_CD) {
        this.IUWP2_ZIP_CD = IUWP2_ZIP_CD;
    }


    /**
     * Gets the IUWP2_TERR_CD value for this ItemSectionVO.
     * 
     * @return IUWP2_TERR_CD   * MaxLength=4::ErrorLength=E_FICUW_WS_075::Auxiliary=Iaxmmccd:TERR::ErrorAux=E_FICUW_AUX_004
     */
    public java.lang.String getIUWP2_TERR_CD() {
        return IUWP2_TERR_CD;
    }


    /**
     * Sets the IUWP2_TERR_CD value for this ItemSectionVO.
     * 
     * @param IUWP2_TERR_CD   * MaxLength=4::ErrorLength=E_FICUW_WS_075::Auxiliary=Iaxmmccd:TERR::ErrorAux=E_FICUW_AUX_004
     */
    public void setIUWP2_TERR_CD(java.lang.String IUWP2_TERR_CD) {
        this.IUWP2_TERR_CD = IUWP2_TERR_CD;
    }


    /**
     * Gets the IUWP2_DED_CODE value for this ItemSectionVO.
     * 
     * @return IUWP2_DED_CODE   * MaxLength=4::ErrorLength=E_FICUW_WS_076
     */
    public java.lang.String getIUWP2_DED_CODE() {
        return IUWP2_DED_CODE;
    }


    /**
     * Sets the IUWP2_DED_CODE value for this ItemSectionVO.
     * 
     * @param IUWP2_DED_CODE   * MaxLength=4::ErrorLength=E_FICUW_WS_076
     */
    public void setIUWP2_DED_CODE(java.lang.String IUWP2_DED_CODE) {
        this.IUWP2_DED_CODE = IUWP2_DED_CODE;
    }


    /**
     * Gets the IUWP2_SI_TP value for this ItemSectionVO.
     * 
     * @return IUWP2_SI_TP
     */
    public java.lang.String getIUWP2_SI_TP() {
        return IUWP2_SI_TP;
    }


    /**
     * Sets the IUWP2_SI_TP value for this ItemSectionVO.
     * 
     * @param IUWP2_SI_TP
     */
    public void setIUWP2_SI_TP(java.lang.String IUWP2_SI_TP) {
        this.IUWP2_SI_TP = IUWP2_SI_TP;
    }


    /**
     * Gets the rsPaVO value for this ItemSectionVO.
     * 
     * @return rsPaVO
     */
    public com.firstapex.rs.uw.webservices.policymovements.RsPaVO getRsPaVO() {
        return rsPaVO;
    }


    /**
     * Sets the rsPaVO value for this ItemSectionVO.
     * 
     * @param rsPaVO
     */
    public void setRsPaVO(com.firstapex.rs.uw.webservices.policymovements.RsPaVO rsPaVO) {
        this.rsPaVO = rsPaVO;
    }


    /**
     * Gets the oldPolicyVO value for this ItemSectionVO.
     * 
     * @return oldPolicyVO
     */
    public com.firstapex.rs.uw.webservices.policymovements.OldPolicyVO getOldPolicyVO() {
        return oldPolicyVO;
    }


    /**
     * Sets the oldPolicyVO value for this ItemSectionVO.
     * 
     * @param oldPolicyVO
     */
    public void setOldPolicyVO(com.firstapex.rs.uw.webservices.policymovements.OldPolicyVO oldPolicyVO) {
        this.oldPolicyVO = oldPolicyVO;
    }


    /**
     * Gets the coverageVOList value for this ItemSectionVO.
     * 
     * @return coverageVOList
     */
    public com.firstapex.rs.uw.webservices.policymovements.CoverageVO[] getCoverageVOList() {
        return coverageVOList;
    }


    /**
     * Sets the coverageVOList value for this ItemSectionVO.
     * 
     * @param coverageVOList
     */
    public void setCoverageVOList(com.firstapex.rs.uw.webservices.policymovements.CoverageVO[] coverageVOList) {
        this.coverageVOList = coverageVOList;
    }

    public com.firstapex.rs.uw.webservices.policymovements.CoverageVO getCoverageVOList(int i) {
        return this.coverageVOList[i];
    }

    public void setCoverageVOList(int i, com.firstapex.rs.uw.webservices.policymovements.CoverageVO _value) {
        this.coverageVOList[i] = _value;
    }

    public CoverageVO addCoverageVO(){
    	CoverageVO coverageVO = new CoverageVO();
    	List<CoverageVO> newList = new ArrayList<CoverageVO>();
    	if(getCoverageVOList() == null) {
    		newList = new ArrayList<CoverageVO>();
    	} else {
    		CoverageVO[] coverageVOs = getCoverageVOList();
    		for (int i = 0; i < coverageVOs.length; i++) {
				newList.add(coverageVOs[i]);
			}
    	}
    	newList.add(coverageVO);
    	setCoverageVOList(newList.toArray(new CoverageVO[newList.size()])); ;
    	return coverageVO;
    }
    public CoverageVO addcoverageVO(){
    	CoverageVO coverageVO = new CoverageVO();
    	List<CoverageVO> newList = new ArrayList<CoverageVO>();
    	if(getCoverageVOList() == null) {
    		newList = new ArrayList<CoverageVO>();
    	} else {
    		CoverageVO[] coverageVOs = getCoverageVOList();
    		for (int i = 0; i < coverageVOs.length; i++) {
				newList.add(coverageVOs[i]);
			}
    	}
    	newList.add(coverageVO);
    	setCoverageVOList(newList.toArray(new CoverageVO[newList.size()])); ;
    	return coverageVO;
    }
    
    
    
    public OldPolicyVO addOldPolicyVO(){
    	OldPolicyVO oldPolicyVO = new OldPolicyVO();
    	this.oldPolicyVO = oldPolicyVO;
    	return oldPolicyVO;
    }
    public OldPolicyVO addoldPolicyVO(){
    	OldPolicyVO oldPolicyVO = new OldPolicyVO();
    	this.oldPolicyVO = oldPolicyVO;
    	return oldPolicyVO;
    }
    
    
    public RsVehicleVO addRsVehicleVO(){
    	RsVehicleVO rsVehicleVO = new RsVehicleVO();
    	this.rsVehicleVO = rsVehicleVO;
    	return rsVehicleVO;
    }
    public RsPaVO addRsPaVO(){
    	RsPaVO rsPaVO = new RsPaVO();
    	this.rsPaVO = rsPaVO;
    	return rsPaVO;
    }
    public RsPaVO addrsPaVO(){
    	RsPaVO rsPaVO = new RsPaVO();
    	this.rsPaVO = rsPaVO;
    	return rsPaVO;
    }
    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemSectionVO)) return false;
        ItemSectionVO other = (ItemSectionVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IUWP2_ITEM_NO==null && other.getIUWP2_ITEM_NO()==null) || 
             (this.IUWP2_ITEM_NO!=null &&
              this.IUWP2_ITEM_NO.equals(other.getIUWP2_ITEM_NO()))) &&
            ((this.IUWP2_MAP_REF_NO==null && other.getIUWP2_MAP_REF_NO()==null) || 
             (this.IUWP2_MAP_REF_NO!=null &&
              this.IUWP2_MAP_REF_NO.equals(other.getIUWP2_MAP_REF_NO()))) &&
            ((this.IUWP2_SECT_NO==null && other.getIUWP2_SECT_NO()==null) || 
             (this.IUWP2_SECT_NO!=null &&
              this.IUWP2_SECT_NO.equals(other.getIUWP2_SECT_NO()))) &&
            ((this.IUWP2_DESC1==null && other.getIUWP2_DESC1()==null) || 
             (this.IUWP2_DESC1!=null &&
              this.IUWP2_DESC1.equals(other.getIUWP2_DESC1()))) &&
            ((this.IUWP2_DESC2==null && other.getIUWP2_DESC2()==null) || 
             (this.IUWP2_DESC2!=null &&
              this.IUWP2_DESC2.equals(other.getIUWP2_DESC2()))) &&
            ((this.IUWP2_DESC3==null && other.getIUWP2_DESC3()==null) || 
             (this.IUWP2_DESC3!=null &&
              this.IUWP2_DESC3.equals(other.getIUWP2_DESC3()))) &&
            ((this.primeIUWP2_INCR_SI==null && other.getPrimeIUWP2_INCR_SI()==null) || 
             (this.primeIUWP2_INCR_SI!=null &&
              this.primeIUWP2_INCR_SI.equals(other.getPrimeIUWP2_INCR_SI()))) &&
            ((this.IUWP2_OTH_INT_PTY_CD==null && other.getIUWP2_OTH_INT_PTY_CD()==null) || 
             (this.IUWP2_OTH_INT_PTY_CD!=null &&
              this.IUWP2_OTH_INT_PTY_CD.equals(other.getIUWP2_OTH_INT_PTY_CD()))) &&
            ((this.IUWP2_COVER_CD==null && other.getIUWP2_COVER_CD()==null) || 
             (this.IUWP2_COVER_CD!=null &&
              this.IUWP2_COVER_CD.equals(other.getIUWP2_COVER_CD()))) &&
            ((this.IUWP2_RSK_BLK_CD==null && other.getIUWP2_RSK_BLK_CD()==null) || 
             (this.IUWP2_RSK_BLK_CD!=null &&
              this.IUWP2_RSK_BLK_CD.equals(other.getIUWP2_RSK_BLK_CD()))) &&
            ((this.IUWP2_WAR==null && other.getIUWP2_WAR()==null) || 
             (this.IUWP2_WAR!=null &&
              this.IUWP2_WAR.equals(other.getIUWP2_WAR()))) &&
            ((this.IUWP2_RSK_CAT==null && other.getIUWP2_RSK_CAT()==null) || 
             (this.IUWP2_RSK_CAT!=null &&
              this.IUWP2_RSK_CAT.equals(other.getIUWP2_RSK_CAT()))) &&
            ((this.IUWP2_EMLX==null && other.getIUWP2_EMLX()==null) || 
             (this.IUWP2_EMLX!=null &&
              this.IUWP2_EMLX.equals(other.getIUWP2_EMLX()))) &&
            ((this.IUWP2_ZIP_CD==null && other.getIUWP2_ZIP_CD()==null) || 
             (this.IUWP2_ZIP_CD!=null &&
              this.IUWP2_ZIP_CD.equals(other.getIUWP2_ZIP_CD()))) &&
            ((this.IUWP2_TERR_CD==null && other.getIUWP2_TERR_CD()==null) || 
             (this.IUWP2_TERR_CD!=null &&
              this.IUWP2_TERR_CD.equals(other.getIUWP2_TERR_CD()))) &&
            ((this.IUWP2_DED_CODE==null && other.getIUWP2_DED_CODE()==null) || 
             (this.IUWP2_DED_CODE!=null &&
              this.IUWP2_DED_CODE.equals(other.getIUWP2_DED_CODE()))) &&
            ((this.IUWP2_SI_TP==null && other.getIUWP2_SI_TP()==null) || 
             (this.IUWP2_SI_TP!=null &&
              this.IUWP2_SI_TP.equals(other.getIUWP2_SI_TP()))) &&
            ((this.rsPaVO==null && other.getRsPaVO()==null) || 
             (this.rsPaVO!=null &&
              this.rsPaVO.equals(other.getRsPaVO()))) &&
            ((this.oldPolicyVO==null && other.getOldPolicyVO()==null) || 
             (this.oldPolicyVO!=null &&
              this.oldPolicyVO.equals(other.getOldPolicyVO()))) &&
            ((this.coverageVOList==null && other.getCoverageVOList()==null) || 
             (this.coverageVOList!=null &&
              java.util.Arrays.equals(this.coverageVOList, other.getCoverageVOList())));
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
        if (getIUWP2_ITEM_NO() != null) {
            _hashCode += getIUWP2_ITEM_NO().hashCode();
        }
        if (getIUWP2_MAP_REF_NO() != null) {
            _hashCode += getIUWP2_MAP_REF_NO().hashCode();
        }
        if (getIUWP2_SECT_NO() != null) {
            _hashCode += getIUWP2_SECT_NO().hashCode();
        }
        if (getIUWP2_DESC1() != null) {
            _hashCode += getIUWP2_DESC1().hashCode();
        }
        if (getIUWP2_DESC2() != null) {
            _hashCode += getIUWP2_DESC2().hashCode();
        }
        if (getIUWP2_DESC3() != null) {
            _hashCode += getIUWP2_DESC3().hashCode();
        }
        if (getPrimeIUWP2_INCR_SI() != null) {
            _hashCode += getPrimeIUWP2_INCR_SI().hashCode();
        }
        if (getIUWP2_OTH_INT_PTY_CD() != null) {
            _hashCode += getIUWP2_OTH_INT_PTY_CD().hashCode();
        }
        if (getIUWP2_COVER_CD() != null) {
            _hashCode += getIUWP2_COVER_CD().hashCode();
        }
        if (getIUWP2_RSK_BLK_CD() != null) {
            _hashCode += getIUWP2_RSK_BLK_CD().hashCode();
        }
        if (getIUWP2_WAR() != null) {
            _hashCode += getIUWP2_WAR().hashCode();
        }
        if (getIUWP2_RSK_CAT() != null) {
            _hashCode += getIUWP2_RSK_CAT().hashCode();
        }
        if (getIUWP2_EMLX() != null) {
            _hashCode += getIUWP2_EMLX().hashCode();
        }
        if (getIUWP2_ZIP_CD() != null) {
            _hashCode += getIUWP2_ZIP_CD().hashCode();
        }
        if (getIUWP2_TERR_CD() != null) {
            _hashCode += getIUWP2_TERR_CD().hashCode();
        }
        if (getIUWP2_DED_CODE() != null) {
            _hashCode += getIUWP2_DED_CODE().hashCode();
        }
        if (getIUWP2_SI_TP() != null) {
            _hashCode += getIUWP2_SI_TP().hashCode();
        }
        if (getRsPaVO() != null) {
            _hashCode += getRsPaVO().hashCode();
        }
        if (getOldPolicyVO() != null) {
            _hashCode += getOldPolicyVO().hashCode();
        }
        if (getCoverageVOList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCoverageVOList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCoverageVOList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemSectionVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "itemSectionVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_ITEM_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_ITEM_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_MAP_REF_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_MAP_REF_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_SECT_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_SECT_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_DESC1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_DESC1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_DESC2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_DESC2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_DESC3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_DESC3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primeIUWP2_INCR_SI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primeIUWP2_INCR_SI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_OTH_INT_PTY_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_OTH_INT_PTY_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_COVER_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_COVER_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_RSK_BLK_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_RSK_BLK_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_WAR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_WAR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_RSK_CAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_RSK_CAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_EMLX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_EMLX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_ZIP_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_ZIP_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_TERR_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_TERR_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_DED_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_DED_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_SI_TP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_SI_TP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsPaVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsPaVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "rsPaVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPolicyVO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldPolicyVO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "oldPolicyVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageVOList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coverageVOList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "coverageVO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
