/**
 * RsVehicleVO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.firstapex.rs.uw.webservices.policymovements;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RsVehicleVO  implements java.io.Serializable {
    /* MaxLength=4::ErrorLength=E_FICUW_WS_131::Auxiliary=Iaxmmccd:TERR::ErrorAux=E_FICUW_AUX_004 */
    private java.lang.String IUWP2_MR_TERR;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_132::Auxiliary=Iaxmmccd:MOUS::ErrorAux=E_FICUW_AUX_019 */
    private java.lang.String IUWP2_MR_USG_CD;

    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_133::MaxLength=20::ErrorLength=E_FICUW_WS_134::Auxiliary=Iaxmmodl::ErrorAux=E_FICUW_AUX_020 */
    private java.lang.String IUWP2_MR_MODEL;

    /* Mandatory=Y::ErrorMandatory=E_FICUW_WS_135::MaxLength=20::ErrorLength=E_FICUW_WS_136::Auxiliary=Iaxmmccd:COL::ErrorAux=E_FICUW_AUX_021 */
    private java.lang.String IUWP2_MR_COLOR;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_137::Auxiliary=Iaxmmccd:MOCL::ErrorAux=E_FICUW_AUX_022 */
    private java.lang.String IUWP2_MR_VEH_CL;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_138 */
    private java.lang.String IUWP2_MR_YR_MFR;

    private java.lang.String strIUWP2_MR_1ST_REG_DT;

    /* MaxLength=30::ErrorLength=E_FICUW_WS_139 */
    private java.lang.String IUWP2_MR_REGN_NUM;

    /* MaxLength=30::ErrorLength=E_FICUW_WS_140 */
    private java.lang.String IUWP2_MR_CHAS_NUM;

    /* MaxLength=30::ErrorLength=E_FICUW_WS_141 */
    private java.lang.String IUWP2_MR_ENG_NUM;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_142::preDecimalPrecision=6::postDecimalPrecision=0::ErrorPrecision=E_FICUW_WS_143 */
    private Integer IUWP2_MR_CAP_CC =new Integer(0);

    /* preDecimalPrecision=3::postDecimalPrecision=2::ErrorPrecision=E_FICUW_WS_144 */
    private java.math.BigDecimal IUWP2_MR_GVW_TON=new BigDecimal(0);

    /* preDecimalPrecision=3::postDecimalPrecision=0::ErrorPrecision=E_FICUW_WS_145 */
    private Integer IUWP2_MR_SEAT_CAP=new Integer(0);

    /* MaxLength=30::ErrorLength=E_FICUW_WS_146 */
    private java.lang.String IUWP2_MR_LOG_BOOK;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_147::Auxiliary=Iaxmmccd:FUEL::ErrorAux=E_FICUW_AUX_023 */
    private java.lang.String IUWP2V_MR_FUEL_TYPE;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_148::Auxiliary=Iaxmmccd:ROAD::ErrorAux=E_FICUW_AUX_024 */
    private java.lang.String IUWP2V_MR_ROADS_TYPE;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_149::Auxiliary=Iaxmmccd:SFTY::ErrorAux=E_FICUW_AUX_025 */
    private java.lang.String IUWP2V_MR_SAFETY_FEATURE;

    /* MaxLength=4::ErrorLength=E_FICUW_WS_150::Auxiliary=Iaxmmccd:PRKD::ErrorAux=E_FICUW_AUX_026 */
    private java.lang.String IUWP2V_MR_DAY_PARKING;

    /* preDecimalPrecision=6::postDecimalPrecision=0::ErrorPrecision=E_FICUW_WS_151 */
    private Integer IUWP2V_MR_MONTHLY_MILAGE=new Integer(0);

    /* preDecimalPrecision=6::postDecimalPrecision=0::ErrorPrecision=E_FICUW_WS_152 */
    private Integer IUWP2_MR_MIL_USE=new Integer(0);

    private com.firstapex.rs.uw.webservices.policymovements.DriverVO[] driverVOList;

    public RsVehicleVO() {
    }

    public RsVehicleVO(
           java.lang.String IUWP2_MR_TERR,
           java.lang.String IUWP2_MR_USG_CD,
           java.lang.String IUWP2_MR_MODEL,
           java.lang.String IUWP2_MR_COLOR,
           java.lang.String IUWP2_MR_VEH_CL,
           java.lang.String IUWP2_MR_YR_MFR,
           java.lang.String strIUWP2_MR_1ST_REG_DT,
           java.lang.String IUWP2_MR_REGN_NUM,
           java.lang.String IUWP2_MR_CHAS_NUM,
           java.lang.String IUWP2_MR_ENG_NUM,
           Integer IUWP2_MR_CAP_CC,
           java.math.BigDecimal IUWP2_MR_GVW_TON,
           Integer IUWP2_MR_SEAT_CAP,
           java.lang.String IUWP2_MR_LOG_BOOK,
           java.lang.String IUWP2V_MR_FUEL_TYPE,
           java.lang.String IUWP2V_MR_ROADS_TYPE,
           java.lang.String IUWP2V_MR_SAFETY_FEATURE,
           java.lang.String IUWP2V_MR_DAY_PARKING,
           Integer IUWP2V_MR_MONTHLY_MILAGE,
           Integer IUWP2_MR_MIL_USE,
           com.firstapex.rs.uw.webservices.policymovements.DriverVO[] driverVOList) {
           this.IUWP2_MR_TERR = IUWP2_MR_TERR;
           this.IUWP2_MR_USG_CD = IUWP2_MR_USG_CD;
           this.IUWP2_MR_MODEL = IUWP2_MR_MODEL;
           this.IUWP2_MR_COLOR = IUWP2_MR_COLOR;
           this.IUWP2_MR_VEH_CL = IUWP2_MR_VEH_CL;
           this.IUWP2_MR_YR_MFR = IUWP2_MR_YR_MFR;
           this.strIUWP2_MR_1ST_REG_DT = strIUWP2_MR_1ST_REG_DT;
           this.IUWP2_MR_REGN_NUM = IUWP2_MR_REGN_NUM;
           this.IUWP2_MR_CHAS_NUM = IUWP2_MR_CHAS_NUM;
           this.IUWP2_MR_ENG_NUM = IUWP2_MR_ENG_NUM;
           this.IUWP2_MR_CAP_CC = IUWP2_MR_CAP_CC;
           this.IUWP2_MR_GVW_TON = IUWP2_MR_GVW_TON;
           this.IUWP2_MR_SEAT_CAP = IUWP2_MR_SEAT_CAP;
           this.IUWP2_MR_LOG_BOOK = IUWP2_MR_LOG_BOOK;
           this.IUWP2V_MR_FUEL_TYPE = IUWP2V_MR_FUEL_TYPE;
           this.IUWP2V_MR_ROADS_TYPE = IUWP2V_MR_ROADS_TYPE;
           this.IUWP2V_MR_SAFETY_FEATURE = IUWP2V_MR_SAFETY_FEATURE;
           this.IUWP2V_MR_DAY_PARKING = IUWP2V_MR_DAY_PARKING;
           this.IUWP2V_MR_MONTHLY_MILAGE = IUWP2V_MR_MONTHLY_MILAGE;
           this.IUWP2_MR_MIL_USE = IUWP2_MR_MIL_USE;
           this.driverVOList = driverVOList;
    }


    /**
     * Gets the IUWP2_MR_TERR value for this RsVehicleVO.
     * 
     * @return IUWP2_MR_TERR   * MaxLength=4::ErrorLength=E_FICUW_WS_131::Auxiliary=Iaxmmccd:TERR::ErrorAux=E_FICUW_AUX_004
     */
    public java.lang.String getIUWP2_MR_TERR() {
        return IUWP2_MR_TERR;
    }


    /**
     * Sets the IUWP2_MR_TERR value for this RsVehicleVO.
     * 
     * @param IUWP2_MR_TERR   * MaxLength=4::ErrorLength=E_FICUW_WS_131::Auxiliary=Iaxmmccd:TERR::ErrorAux=E_FICUW_AUX_004
     */
    public void setIUWP2_MR_TERR(java.lang.String IUWP2_MR_TERR) {
        this.IUWP2_MR_TERR = IUWP2_MR_TERR;
    }


    /**
     * Gets the IUWP2_MR_USG_CD value for this RsVehicleVO.
     * 
     * @return IUWP2_MR_USG_CD   * MaxLength=4::ErrorLength=E_FICUW_WS_132::Auxiliary=Iaxmmccd:MOUS::ErrorAux=E_FICUW_AUX_019
     */
    public java.lang.String getIUWP2_MR_USG_CD() {
        return IUWP2_MR_USG_CD;
    }


    /**
     * Sets the IUWP2_MR_USG_CD value for this RsVehicleVO.
     * 
     * @param IUWP2_MR_USG_CD   * MaxLength=4::ErrorLength=E_FICUW_WS_132::Auxiliary=Iaxmmccd:MOUS::ErrorAux=E_FICUW_AUX_019
     */
    public void setIUWP2_MR_USG_CD(java.lang.String IUWP2_MR_USG_CD) {
        this.IUWP2_MR_USG_CD = IUWP2_MR_USG_CD;
    }


    /**
     * Gets the IUWP2_MR_MODEL value for this RsVehicleVO.
     * 
     * @return IUWP2_MR_MODEL   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_133::MaxLength=20::ErrorLength=E_FICUW_WS_134::Auxiliary=Iaxmmodl::ErrorAux=E_FICUW_AUX_020
     */
    public java.lang.String getIUWP2_MR_MODEL() {
        return IUWP2_MR_MODEL;
    }


    /**
     * Sets the IUWP2_MR_MODEL value for this RsVehicleVO.
     * 
     * @param IUWP2_MR_MODEL   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_133::MaxLength=20::ErrorLength=E_FICUW_WS_134::Auxiliary=Iaxmmodl::ErrorAux=E_FICUW_AUX_020
     */
    public void setIUWP2_MR_MODEL(java.lang.String IUWP2_MR_MODEL) {
        this.IUWP2_MR_MODEL = IUWP2_MR_MODEL;
    }


    /**
     * Gets the IUWP2_MR_COLOR value for this RsVehicleVO.
     * 
     * @return IUWP2_MR_COLOR   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_135::MaxLength=20::ErrorLength=E_FICUW_WS_136::Auxiliary=Iaxmmccd:COL::ErrorAux=E_FICUW_AUX_021
     */
    public java.lang.String getIUWP2_MR_COLOR() {
        return IUWP2_MR_COLOR;
    }


    /**
     * Sets the IUWP2_MR_COLOR value for this RsVehicleVO.
     * 
     * @param IUWP2_MR_COLOR   * Mandatory=Y::ErrorMandatory=E_FICUW_WS_135::MaxLength=20::ErrorLength=E_FICUW_WS_136::Auxiliary=Iaxmmccd:COL::ErrorAux=E_FICUW_AUX_021
     */
    public void setIUWP2_MR_COLOR(java.lang.String IUWP2_MR_COLOR) {
        this.IUWP2_MR_COLOR = IUWP2_MR_COLOR;
    }


    /**
     * Gets the IUWP2_MR_VEH_CL value for this RsVehicleVO.
     * 
     * @return IUWP2_MR_VEH_CL   * MaxLength=4::ErrorLength=E_FICUW_WS_137::Auxiliary=Iaxmmccd:MOCL::ErrorAux=E_FICUW_AUX_022
     */
    public java.lang.String getIUWP2_MR_VEH_CL() {
        return IUWP2_MR_VEH_CL;
    }


    /**
     * Sets the IUWP2_MR_VEH_CL value for this RsVehicleVO.
     * 
     * @param IUWP2_MR_VEH_CL   * MaxLength=4::ErrorLength=E_FICUW_WS_137::Auxiliary=Iaxmmccd:MOCL::ErrorAux=E_FICUW_AUX_022
     */
    public void setIUWP2_MR_VEH_CL(java.lang.String IUWP2_MR_VEH_CL) {
        this.IUWP2_MR_VEH_CL = IUWP2_MR_VEH_CL;
    }


    /**
     * Gets the IUWP2_MR_YR_MFR value for this RsVehicleVO.
     * 
     * @return IUWP2_MR_YR_MFR   * MaxLength=4::ErrorLength=E_FICUW_WS_138
     */
    public java.lang.String getIUWP2_MR_YR_MFR() {
        return IUWP2_MR_YR_MFR;
    }


    /**
     * Sets the IUWP2_MR_YR_MFR value for this RsVehicleVO.
     * 
     * @param IUWP2_MR_YR_MFR   * MaxLength=4::ErrorLength=E_FICUW_WS_138
     */
    public void setIUWP2_MR_YR_MFR(java.lang.String IUWP2_MR_YR_MFR) {
        this.IUWP2_MR_YR_MFR = IUWP2_MR_YR_MFR;
    }


    /**
     * Gets the strIUWP2_MR_1ST_REG_DT value for this RsVehicleVO.
     * 
     * @return strIUWP2_MR_1ST_REG_DT
     */
    public java.lang.String getStrIUWP2_MR_1ST_REG_DT() {
        return strIUWP2_MR_1ST_REG_DT;
    }


    /**
     * Sets the strIUWP2_MR_1ST_REG_DT value for this RsVehicleVO.
     * 
     * @param strIUWP2_MR_1ST_REG_DT
     */
    public void setStrIUWP2_MR_1ST_REG_DT(java.lang.String strIUWP2_MR_1ST_REG_DT) {
        this.strIUWP2_MR_1ST_REG_DT = strIUWP2_MR_1ST_REG_DT;
    }


    /**
     * Gets the IUWP2_MR_REGN_NUM value for this RsVehicleVO.
     * 
     * @return IUWP2_MR_REGN_NUM   * MaxLength=30::ErrorLength=E_FICUW_WS_139
     */
    public java.lang.String getIUWP2_MR_REGN_NUM() {
        return IUWP2_MR_REGN_NUM;
    }


    /**
     * Sets the IUWP2_MR_REGN_NUM value for this RsVehicleVO.
     * 
     * @param IUWP2_MR_REGN_NUM   * MaxLength=30::ErrorLength=E_FICUW_WS_139
     */
    public void setIUWP2_MR_REGN_NUM(java.lang.String IUWP2_MR_REGN_NUM) {
        this.IUWP2_MR_REGN_NUM = IUWP2_MR_REGN_NUM;
    }


    /**
     * Gets the IUWP2_MR_CHAS_NUM value for this RsVehicleVO.
     * 
     * @return IUWP2_MR_CHAS_NUM   * MaxLength=30::ErrorLength=E_FICUW_WS_140
     */
    public java.lang.String getIUWP2_MR_CHAS_NUM() {
        return IUWP2_MR_CHAS_NUM;
    }


    /**
     * Sets the IUWP2_MR_CHAS_NUM value for this RsVehicleVO.
     * 
     * @param IUWP2_MR_CHAS_NUM   * MaxLength=30::ErrorLength=E_FICUW_WS_140
     */
    public void setIUWP2_MR_CHAS_NUM(java.lang.String IUWP2_MR_CHAS_NUM) {
        this.IUWP2_MR_CHAS_NUM = IUWP2_MR_CHAS_NUM;
    }


    /**
     * Gets the IUWP2_MR_ENG_NUM value for this RsVehicleVO.
     * 
     * @return IUWP2_MR_ENG_NUM   * MaxLength=30::ErrorLength=E_FICUW_WS_141
     */
    public java.lang.String getIUWP2_MR_ENG_NUM() {
        return IUWP2_MR_ENG_NUM;
    }


    /**
     * Sets the IUWP2_MR_ENG_NUM value for this RsVehicleVO.
     * 
     * @param IUWP2_MR_ENG_NUM   * MaxLength=30::ErrorLength=E_FICUW_WS_141
     */
    public void setIUWP2_MR_ENG_NUM(java.lang.String IUWP2_MR_ENG_NUM) {
        this.IUWP2_MR_ENG_NUM = IUWP2_MR_ENG_NUM;
    }


    /**
     * Gets the IUWP2_MR_CAP_CC value for this RsVehicleVO.
     * 
     * @return IUWP2_MR_CAP_CC   * MaxLength=4::ErrorLength=E_FICUW_WS_142::preDecimalPrecision=6::postDecimalPrecision=0::ErrorPrecision=E_FICUW_WS_143
     */
    public Integer getIUWP2_MR_CAP_CC() {
        return IUWP2_MR_CAP_CC;
    }


    /**
     * Sets the IUWP2_MR_CAP_CC value for this RsVehicleVO.
     * 
     * @param IUWP2_MR_CAP_CC   * MaxLength=4::ErrorLength=E_FICUW_WS_142::preDecimalPrecision=6::postDecimalPrecision=0::ErrorPrecision=E_FICUW_WS_143
     */
    public void setIUWP2_MR_CAP_CC(Integer IUWP2_MR_CAP_CC) {
        this.IUWP2_MR_CAP_CC = IUWP2_MR_CAP_CC;
    }


    /**
     * Gets the IUWP2_MR_GVW_TON value for this RsVehicleVO.
     * 
     * @return IUWP2_MR_GVW_TON   * preDecimalPrecision=3::postDecimalPrecision=2::ErrorPrecision=E_FICUW_WS_144
     */
    public java.math.BigDecimal getIUWP2_MR_GVW_TON() {
        return IUWP2_MR_GVW_TON;
    }


    /**
     * Sets the IUWP2_MR_GVW_TON value for this RsVehicleVO.
     * 
     * @param IUWP2_MR_GVW_TON   * preDecimalPrecision=3::postDecimalPrecision=2::ErrorPrecision=E_FICUW_WS_144
     */
    public void setIUWP2_MR_GVW_TON(java.math.BigDecimal IUWP2_MR_GVW_TON) {
        this.IUWP2_MR_GVW_TON = IUWP2_MR_GVW_TON;
    }


    /**
     * Gets the IUWP2_MR_SEAT_CAP value for this RsVehicleVO.
     * 
     * @return IUWP2_MR_SEAT_CAP   * preDecimalPrecision=3::postDecimalPrecision=0::ErrorPrecision=E_FICUW_WS_145
     */
    public Integer getIUWP2_MR_SEAT_CAP() {
        return IUWP2_MR_SEAT_CAP;
    }


    /**
     * Sets the IUWP2_MR_SEAT_CAP value for this RsVehicleVO.
     * 
     * @param IUWP2_MR_SEAT_CAP   * preDecimalPrecision=3::postDecimalPrecision=0::ErrorPrecision=E_FICUW_WS_145
     */
    public void setIUWP2_MR_SEAT_CAP(Integer IUWP2_MR_SEAT_CAP) {
        this.IUWP2_MR_SEAT_CAP = IUWP2_MR_SEAT_CAP;
    }


    /**
     * Gets the IUWP2_MR_LOG_BOOK value for this RsVehicleVO.
     * 
     * @return IUWP2_MR_LOG_BOOK   * MaxLength=30::ErrorLength=E_FICUW_WS_146
     */
    public java.lang.String getIUWP2_MR_LOG_BOOK() {
        return IUWP2_MR_LOG_BOOK;
    }


    /**
     * Sets the IUWP2_MR_LOG_BOOK value for this RsVehicleVO.
     * 
     * @param IUWP2_MR_LOG_BOOK   * MaxLength=30::ErrorLength=E_FICUW_WS_146
     */
    public void setIUWP2_MR_LOG_BOOK(java.lang.String IUWP2_MR_LOG_BOOK) {
        this.IUWP2_MR_LOG_BOOK = IUWP2_MR_LOG_BOOK;
    }


    /**
     * Gets the IUWP2V_MR_FUEL_TYPE value for this RsVehicleVO.
     * 
     * @return IUWP2V_MR_FUEL_TYPE   * MaxLength=4::ErrorLength=E_FICUW_WS_147::Auxiliary=Iaxmmccd:FUEL::ErrorAux=E_FICUW_AUX_023
     */
    public java.lang.String getIUWP2V_MR_FUEL_TYPE() {
        return IUWP2V_MR_FUEL_TYPE;
    }


    /**
     * Sets the IUWP2V_MR_FUEL_TYPE value for this RsVehicleVO.
     * 
     * @param IUWP2V_MR_FUEL_TYPE   * MaxLength=4::ErrorLength=E_FICUW_WS_147::Auxiliary=Iaxmmccd:FUEL::ErrorAux=E_FICUW_AUX_023
     */
    public void setIUWP2V_MR_FUEL_TYPE(java.lang.String IUWP2V_MR_FUEL_TYPE) {
        this.IUWP2V_MR_FUEL_TYPE = IUWP2V_MR_FUEL_TYPE;
    }


    /**
     * Gets the IUWP2V_MR_ROADS_TYPE value for this RsVehicleVO.
     * 
     * @return IUWP2V_MR_ROADS_TYPE   * MaxLength=4::ErrorLength=E_FICUW_WS_148::Auxiliary=Iaxmmccd:ROAD::ErrorAux=E_FICUW_AUX_024
     */
    public java.lang.String getIUWP2V_MR_ROADS_TYPE() {
        return IUWP2V_MR_ROADS_TYPE;
    }


    /**
     * Sets the IUWP2V_MR_ROADS_TYPE value for this RsVehicleVO.
     * 
     * @param IUWP2V_MR_ROADS_TYPE   * MaxLength=4::ErrorLength=E_FICUW_WS_148::Auxiliary=Iaxmmccd:ROAD::ErrorAux=E_FICUW_AUX_024
     */
    public void setIUWP2V_MR_ROADS_TYPE(java.lang.String IUWP2V_MR_ROADS_TYPE) {
        this.IUWP2V_MR_ROADS_TYPE = IUWP2V_MR_ROADS_TYPE;
    }


    /**
     * Gets the IUWP2V_MR_SAFETY_FEATURE value for this RsVehicleVO.
     * 
     * @return IUWP2V_MR_SAFETY_FEATURE   * MaxLength=4::ErrorLength=E_FICUW_WS_149::Auxiliary=Iaxmmccd:SFTY::ErrorAux=E_FICUW_AUX_025
     */
    public java.lang.String getIUWP2V_MR_SAFETY_FEATURE() {
        return IUWP2V_MR_SAFETY_FEATURE;
    }


    /**
     * Sets the IUWP2V_MR_SAFETY_FEATURE value for this RsVehicleVO.
     * 
     * @param IUWP2V_MR_SAFETY_FEATURE   * MaxLength=4::ErrorLength=E_FICUW_WS_149::Auxiliary=Iaxmmccd:SFTY::ErrorAux=E_FICUW_AUX_025
     */
    public void setIUWP2V_MR_SAFETY_FEATURE(java.lang.String IUWP2V_MR_SAFETY_FEATURE) {
        this.IUWP2V_MR_SAFETY_FEATURE = IUWP2V_MR_SAFETY_FEATURE;
    }


    /**
     * Gets the IUWP2V_MR_DAY_PARKING value for this RsVehicleVO.
     * 
     * @return IUWP2V_MR_DAY_PARKING   * MaxLength=4::ErrorLength=E_FICUW_WS_150::Auxiliary=Iaxmmccd:PRKD::ErrorAux=E_FICUW_AUX_026
     */
    public java.lang.String getIUWP2V_MR_DAY_PARKING() {
        return IUWP2V_MR_DAY_PARKING;
    }


    /**
     * Sets the IUWP2V_MR_DAY_PARKING value for this RsVehicleVO.
     * 
     * @param IUWP2V_MR_DAY_PARKING   * MaxLength=4::ErrorLength=E_FICUW_WS_150::Auxiliary=Iaxmmccd:PRKD::ErrorAux=E_FICUW_AUX_026
     */
    public void setIUWP2V_MR_DAY_PARKING(java.lang.String IUWP2V_MR_DAY_PARKING) {
        this.IUWP2V_MR_DAY_PARKING = IUWP2V_MR_DAY_PARKING;
    }


    /**
     * Gets the IUWP2V_MR_MONTHLY_MILAGE value for this RsVehicleVO.
     * 
     * @return IUWP2V_MR_MONTHLY_MILAGE   * preDecimalPrecision=6::postDecimalPrecision=0::ErrorPrecision=E_FICUW_WS_151
     */
    public Integer getIUWP2V_MR_MONTHLY_MILAGE() {
        return IUWP2V_MR_MONTHLY_MILAGE;
    }


    /**
     * Sets the IUWP2V_MR_MONTHLY_MILAGE value for this RsVehicleVO.
     * 
     * @param IUWP2V_MR_MONTHLY_MILAGE   * preDecimalPrecision=6::postDecimalPrecision=0::ErrorPrecision=E_FICUW_WS_151
     */
    public void setIUWP2V_MR_MONTHLY_MILAGE(Integer IUWP2V_MR_MONTHLY_MILAGE) {
        this.IUWP2V_MR_MONTHLY_MILAGE = IUWP2V_MR_MONTHLY_MILAGE;
    }


    /**
     * Gets the IUWP2_MR_MIL_USE value for this RsVehicleVO.
     * 
     * @return IUWP2_MR_MIL_USE   * preDecimalPrecision=6::postDecimalPrecision=0::ErrorPrecision=E_FICUW_WS_152
     */
    public Integer getIUWP2_MR_MIL_USE() {
        return IUWP2_MR_MIL_USE;
    }


    /**
     * Sets the IUWP2_MR_MIL_USE value for this RsVehicleVO.
     * 
     * @param IUWP2_MR_MIL_USE   * preDecimalPrecision=6::postDecimalPrecision=0::ErrorPrecision=E_FICUW_WS_152
     */
    public void setIUWP2_MR_MIL_USE(Integer IUWP2_MR_MIL_USE) {
        this.IUWP2_MR_MIL_USE = IUWP2_MR_MIL_USE;
    }


    /**
     * Gets the driverVOList value for this RsVehicleVO.
     * 
     * @return driverVOList
     */
    public com.firstapex.rs.uw.webservices.policymovements.DriverVO[] getDriverVOList() {
        return driverVOList;
    }


    /**
     * Sets the driverVOList value for this RsVehicleVO.
     * 
     * @param driverVOList
     */
    public void setDriverVOList(com.firstapex.rs.uw.webservices.policymovements.DriverVO[] driverVOList) {
        this.driverVOList = driverVOList;
    }

    public com.firstapex.rs.uw.webservices.policymovements.DriverVO getDriverVOList(int i) {
        return this.driverVOList[i];
    }

    public void setDriverVOList(int i, com.firstapex.rs.uw.webservices.policymovements.DriverVO _value) {
        this.driverVOList[i] = _value;
    }
    public DriverVO addDriverVO(){
    	DriverVO driverVO = new DriverVO();
    	List<DriverVO> newList = new ArrayList<DriverVO>();
    	if(getDriverVOList() == null) {
    		newList = new ArrayList<DriverVO>();
    	} else {
    		DriverVO[] driverVOs = getDriverVOList();
    		for (int i = 0; i < driverVOs.length; i++) {
				newList.add(driverVOs[i]);
			}
    	}
    	newList.add(driverVO);
    	setDriverVOList(newList.toArray(new DriverVO[newList.size()])); ;
    	return driverVO;
    }
    	
    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RsVehicleVO)) return false;
        RsVehicleVO other = (RsVehicleVO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IUWP2_MR_TERR==null && other.getIUWP2_MR_TERR()==null) || 
             (this.IUWP2_MR_TERR!=null &&
              this.IUWP2_MR_TERR.equals(other.getIUWP2_MR_TERR()))) &&
            ((this.IUWP2_MR_USG_CD==null && other.getIUWP2_MR_USG_CD()==null) || 
             (this.IUWP2_MR_USG_CD!=null &&
              this.IUWP2_MR_USG_CD.equals(other.getIUWP2_MR_USG_CD()))) &&
            ((this.IUWP2_MR_MODEL==null && other.getIUWP2_MR_MODEL()==null) || 
             (this.IUWP2_MR_MODEL!=null &&
              this.IUWP2_MR_MODEL.equals(other.getIUWP2_MR_MODEL()))) &&
            ((this.IUWP2_MR_COLOR==null && other.getIUWP2_MR_COLOR()==null) || 
             (this.IUWP2_MR_COLOR!=null &&
              this.IUWP2_MR_COLOR.equals(other.getIUWP2_MR_COLOR()))) &&
            ((this.IUWP2_MR_VEH_CL==null && other.getIUWP2_MR_VEH_CL()==null) || 
             (this.IUWP2_MR_VEH_CL!=null &&
              this.IUWP2_MR_VEH_CL.equals(other.getIUWP2_MR_VEH_CL()))) &&
            ((this.IUWP2_MR_YR_MFR==null && other.getIUWP2_MR_YR_MFR()==null) || 
             (this.IUWP2_MR_YR_MFR!=null &&
              this.IUWP2_MR_YR_MFR.equals(other.getIUWP2_MR_YR_MFR()))) &&
            ((this.strIUWP2_MR_1ST_REG_DT==null && other.getStrIUWP2_MR_1ST_REG_DT()==null) || 
             (this.strIUWP2_MR_1ST_REG_DT!=null &&
              this.strIUWP2_MR_1ST_REG_DT.equals(other.getStrIUWP2_MR_1ST_REG_DT()))) &&
            ((this.IUWP2_MR_REGN_NUM==null && other.getIUWP2_MR_REGN_NUM()==null) || 
             (this.IUWP2_MR_REGN_NUM!=null &&
              this.IUWP2_MR_REGN_NUM.equals(other.getIUWP2_MR_REGN_NUM()))) &&
            ((this.IUWP2_MR_CHAS_NUM==null && other.getIUWP2_MR_CHAS_NUM()==null) || 
             (this.IUWP2_MR_CHAS_NUM!=null &&
              this.IUWP2_MR_CHAS_NUM.equals(other.getIUWP2_MR_CHAS_NUM()))) &&
            ((this.IUWP2_MR_ENG_NUM==null && other.getIUWP2_MR_ENG_NUM()==null) || 
             (this.IUWP2_MR_ENG_NUM!=null &&
              this.IUWP2_MR_ENG_NUM.equals(other.getIUWP2_MR_ENG_NUM()))) &&
            ((this.IUWP2_MR_CAP_CC==null && other.getIUWP2_MR_CAP_CC()==null) || 
             (this.IUWP2_MR_CAP_CC!=null &&
              this.IUWP2_MR_CAP_CC.equals(other.getIUWP2_MR_CAP_CC()))) &&
            ((this.IUWP2_MR_GVW_TON==null && other.getIUWP2_MR_GVW_TON()==null) || 
             (this.IUWP2_MR_GVW_TON!=null &&
              this.IUWP2_MR_GVW_TON.equals(other.getIUWP2_MR_GVW_TON()))) &&
            ((this.IUWP2_MR_SEAT_CAP==null && other.getIUWP2_MR_SEAT_CAP()==null) || 
             (this.IUWP2_MR_SEAT_CAP!=null &&
              this.IUWP2_MR_SEAT_CAP.equals(other.getIUWP2_MR_SEAT_CAP()))) &&
            ((this.IUWP2_MR_LOG_BOOK==null && other.getIUWP2_MR_LOG_BOOK()==null) || 
             (this.IUWP2_MR_LOG_BOOK!=null &&
              this.IUWP2_MR_LOG_BOOK.equals(other.getIUWP2_MR_LOG_BOOK()))) &&
            ((this.IUWP2V_MR_FUEL_TYPE==null && other.getIUWP2V_MR_FUEL_TYPE()==null) || 
             (this.IUWP2V_MR_FUEL_TYPE!=null &&
              this.IUWP2V_MR_FUEL_TYPE.equals(other.getIUWP2V_MR_FUEL_TYPE()))) &&
            ((this.IUWP2V_MR_ROADS_TYPE==null && other.getIUWP2V_MR_ROADS_TYPE()==null) || 
             (this.IUWP2V_MR_ROADS_TYPE!=null &&
              this.IUWP2V_MR_ROADS_TYPE.equals(other.getIUWP2V_MR_ROADS_TYPE()))) &&
            ((this.IUWP2V_MR_SAFETY_FEATURE==null && other.getIUWP2V_MR_SAFETY_FEATURE()==null) || 
             (this.IUWP2V_MR_SAFETY_FEATURE!=null &&
              this.IUWP2V_MR_SAFETY_FEATURE.equals(other.getIUWP2V_MR_SAFETY_FEATURE()))) &&
            ((this.IUWP2V_MR_DAY_PARKING==null && other.getIUWP2V_MR_DAY_PARKING()==null) || 
             (this.IUWP2V_MR_DAY_PARKING!=null &&
              this.IUWP2V_MR_DAY_PARKING.equals(other.getIUWP2V_MR_DAY_PARKING()))) &&
            ((this.IUWP2V_MR_MONTHLY_MILAGE==null && other.getIUWP2V_MR_MONTHLY_MILAGE()==null) || 
             (this.IUWP2V_MR_MONTHLY_MILAGE!=null &&
              this.IUWP2V_MR_MONTHLY_MILAGE.equals(other.getIUWP2V_MR_MONTHLY_MILAGE()))) &&
            ((this.IUWP2_MR_MIL_USE==null && other.getIUWP2_MR_MIL_USE()==null) || 
             (this.IUWP2_MR_MIL_USE!=null &&
              this.IUWP2_MR_MIL_USE.equals(other.getIUWP2_MR_MIL_USE()))) &&
            ((this.driverVOList==null && other.getDriverVOList()==null) || 
             (this.driverVOList!=null &&
              java.util.Arrays.equals(this.driverVOList, other.getDriverVOList())));
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
        if (getIUWP2_MR_TERR() != null) {
            _hashCode += getIUWP2_MR_TERR().hashCode();
        }
        if (getIUWP2_MR_USG_CD() != null) {
            _hashCode += getIUWP2_MR_USG_CD().hashCode();
        }
        if (getIUWP2_MR_MODEL() != null) {
            _hashCode += getIUWP2_MR_MODEL().hashCode();
        }
        if (getIUWP2_MR_COLOR() != null) {
            _hashCode += getIUWP2_MR_COLOR().hashCode();
        }
        if (getIUWP2_MR_VEH_CL() != null) {
            _hashCode += getIUWP2_MR_VEH_CL().hashCode();
        }
        if (getIUWP2_MR_YR_MFR() != null) {
            _hashCode += getIUWP2_MR_YR_MFR().hashCode();
        }
        if (getStrIUWP2_MR_1ST_REG_DT() != null) {
            _hashCode += getStrIUWP2_MR_1ST_REG_DT().hashCode();
        }
        if (getIUWP2_MR_REGN_NUM() != null) {
            _hashCode += getIUWP2_MR_REGN_NUM().hashCode();
        }
        if (getIUWP2_MR_CHAS_NUM() != null) {
            _hashCode += getIUWP2_MR_CHAS_NUM().hashCode();
        }
        if (getIUWP2_MR_ENG_NUM() != null) {
            _hashCode += getIUWP2_MR_ENG_NUM().hashCode();
        }
        if (getIUWP2_MR_CAP_CC() != null) {
            _hashCode += getIUWP2_MR_CAP_CC().hashCode();
        }
        if (getIUWP2_MR_GVW_TON() != null) {
            _hashCode += getIUWP2_MR_GVW_TON().hashCode();
        }
        if (getIUWP2_MR_SEAT_CAP() != null) {
            _hashCode += getIUWP2_MR_SEAT_CAP().hashCode();
        }
        if (getIUWP2_MR_LOG_BOOK() != null) {
            _hashCode += getIUWP2_MR_LOG_BOOK().hashCode();
        }
        if (getIUWP2V_MR_FUEL_TYPE() != null) {
            _hashCode += getIUWP2V_MR_FUEL_TYPE().hashCode();
        }
        if (getIUWP2V_MR_ROADS_TYPE() != null) {
            _hashCode += getIUWP2V_MR_ROADS_TYPE().hashCode();
        }
        if (getIUWP2V_MR_SAFETY_FEATURE() != null) {
            _hashCode += getIUWP2V_MR_SAFETY_FEATURE().hashCode();
        }
        if (getIUWP2V_MR_DAY_PARKING() != null) {
            _hashCode += getIUWP2V_MR_DAY_PARKING().hashCode();
        }
        if (getIUWP2V_MR_MONTHLY_MILAGE() != null) {
            _hashCode += getIUWP2V_MR_MONTHLY_MILAGE().hashCode();
        }
        if (getIUWP2_MR_MIL_USE() != null) {
            _hashCode += getIUWP2_MR_MIL_USE().hashCode();
        }
        if (getDriverVOList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDriverVOList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDriverVOList(), i);
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
        new org.apache.axis.description.TypeDesc(RsVehicleVO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "rsVehicleVO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_MR_TERR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_MR_TERR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_MR_USG_CD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_MR_USG_CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_MR_MODEL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_MR_MODEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_MR_COLOR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_MR_COLOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_MR_VEH_CL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_MR_VEH_CL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_MR_YR_MFR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_MR_YR_MFR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strIUWP2_MR_1ST_REG_DT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strIUWP2_MR_1ST_REG_DT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_MR_REGN_NUM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_MR_REGN_NUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_MR_CHAS_NUM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_MR_CHAS_NUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_MR_ENG_NUM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_MR_ENG_NUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_MR_CAP_CC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_MR_CAP_CC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_MR_GVW_TON");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_MR_GVW_TON"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_MR_SEAT_CAP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_MR_SEAT_CAP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_MR_LOG_BOOK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_MR_LOG_BOOK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2V_MR_FUEL_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2V_MR_FUEL_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2V_MR_ROADS_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2V_MR_ROADS_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2V_MR_SAFETY_FEATURE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2V_MR_SAFETY_FEATURE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2V_MR_DAY_PARKING");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2V_MR_DAY_PARKING"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2V_MR_MONTHLY_MILAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2V_MR_MONTHLY_MILAGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IUWP2_MR_MIL_USE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IUWP2_MR_MIL_USE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driverVOList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "driverVOList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://policymovements.webservices.uw.rs.firstapex.com/", "driverVO"));
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
