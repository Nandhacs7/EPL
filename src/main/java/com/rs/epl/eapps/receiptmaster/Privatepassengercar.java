/*package com.rs.epl.eapps.receiptmaster;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name="PRIVATEPASSENGERCAR")
public class Privatepassengercar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, precision=19)
	private long id;

	@Column(length=4000)
	private String additionalcomments;

	@Column(name="ADEQUACY_OF_INFO", length=255)
	private String adequacyOfInfo;

	@Column(length=255)
	private String aggravationplan;

	@Column(precision=1)
	private BigDecimal antiquevehicle;

	@Column(name="APPRECIATED_INVOICE_PRICE", precision=22)
	private BigDecimal appreciatedInvoicePrice;

	@Column(length=255)
	private String areaofoperation;

	@Column(length=255)
	private String autoassoicationmembershipno;

	@Column(length=255)
	private String autoassoicationname;

	@Column(name="BII_LOADINGPERCENTAGE", precision=126)
	private double biiLoadingpercentage;

	@Column(length=255)
	private String bodytype;

	@Column(precision=15)
	private double bodyvalue;

	@Column(length=255)
	private String campaigncode;

	@Column(length=255)
	private String campaignname;

	@Column(precision=1)
	private BigDecimal caravantrailertowingfacility;

	@Column(length=255)
	private String chassisno;

	@Column(precision=15)
	private double chassisvalue;

	@Column(length=255)
	private String citycode;

	@Column(name="CLAIM_AMOUNT", length=20)
	private String claimAmount;

	@Column(name="CLAIMS_MADE_PREVIOUS_POLICY", length=3)
	private String claimsMadePreviousPolicy;

	@Column(precision=10)
	private BigDecimal claimsfreeyears;

	@Column(length=255)
	private String classofvehicle;

	@Column(precision=126)
	private double compulsarydeductible;

	@Column(length=255)
	private String contractnumber;

	@Column(length=255)
	private String countrydetails;

	@Column(precision=22)
	private BigDecimal customdutypaid;

	@Column(length=255)
	private String dateofregistration;

	@Column(length=255)
	private String dayparking;

	@Column(length=255)
	private String depreciatedchassisvalue;

	@Column(precision=1)
	private BigDecimal designedforhandicapped;

	@Column(length=255)
	private String detailscaravantrailer;

	@Column(length=255)
	private String detailsofdamage;

	@Column(precision=126)
	private double discountfactor;

	@Column(length=255)
	private String domicile;

	@Column(precision=126)
	private double enginecapacity;

	@Column(length=255)
	private String engineno;

	@Column(length=255)
	private String expirydate;

	@Column(precision=1)
	private BigDecimal fibreglasstank;

	@Column(precision=126)
	private double finaldiscount;

	@Column(length=255)
	private String financierdetails;

	@Column(name="FRAUD_INDICATOR", length=255)
	private String fraudIndicator;

	@Column(name="FRAUD_REASON", length=255)
	private String fraudReason;

	@Column(length=255)
	private String fueltype;

	@Column(precision=1)
	private BigDecimal generatencdletter;

	@Column(precision=1)
	private BigDecimal geographicalareaextension;

	@Column(length=255)
	private String geographygroup;

	@Column(length=255)
	private String hypothecatedto;

	@Column(precision=22)
	private BigDecimal idvdeviation;

	@Column(precision=1)
	private BigDecimal importedvehicle;

	@Column(precision=126)
	private double imposeddeductible;

	@Column(length=255)
	private String imtnumber;

	@Column(name="INSPECTION_TIME", length=255)
	private String inspectionTime;

	@Column(length=255)
	private String inspectiondate;

	@Column(precision=1)
	private BigDecimal isaggravationcver;

	@Column(precision=1)
	private BigDecimal isdepreciationwaiver;

	@Column(precision=1)
	private BigDecimal isinvoiceprice;

	@Column(precision=1)
	private BigDecimal iskeyreplacementcover;

	@Column(precision=1)
	private BigDecimal islossofbaggage;

	@Column(precision=22)
	private BigDecimal isncbprotectorcover;

	@Column(precision=1)
	private BigDecimal isroadtax;

	@Column(length=20)
	private String issecoundhandvehicle;

	@Column(precision=1)
	private BigDecimal issparecar;

	@Column(precision=1)
	private BigDecimal iswindshieldglass;

	@Column(length=255)
	private String keyreplacementcoverplan;

	@Column(precision=126)
	private double listprice;

	@Temporal(TemporalType.DATE)
	private Date listpricedate;

	@Column(precision=126)
	private double loadingpercentage;

	@Column(length=255)
	private String make;

	@Column(length=255)
	private String makecode;

	@Column(length=255)
	private String makemodelcaravantrailer;

	@Column(precision=1)
	private BigDecimal memberofautoassociation;

	@Column(length=255)
	private String model;

	@Column(name="MODEL_STATUS", length=255)
	private String modelStatus;

	@Column(length=50)
	private String modelcode;

	@Column(precision=10)
	private BigDecimal monthlymileagerun;

	@Column(length=255)
	private String ncbplan;

	@Column(precision=1)
	private BigDecimal newvehicle;

	@Column(length=255)
	private String nightparking;

	@Column(precision=10)
	private BigDecimal noofvehiclesownedbyproposer;

	@Column(length=255)
	private String numofpeopledrivingthecar;

	@Column(name="ODOMETER_READING", length=255)
	private String odometerReading;

	@Column(name="ODOMETER_READINGDATE", length=255)
	private String odometerReadingdate;

	@Column(precision=126)
	private double oldimposeddeductible;

	@Column(precision=126)
	private double oldloadingpercentage;

	@Column(name="OLDODOMETER_READING", length=255)
	private String oldodometerReading;

	@Column(name="OLDODOMETER_READINGDATE", length=255)
	private String oldodometerReadingdate;

	@Column(name="OWNER_TYPE", length=20)
	private String ownerType;

	@Column(name="OWNER_VALUE", length=20)
	private String ownerValue;

	@Column(precision=22)
	private BigDecimal payout;

	@Column(precision=22)
	private BigDecimal payouteligible;

	@Column(length=255)
	private String periodicserviceofvehicle;

	@Column(precision=1)
	private BigDecimal photouploadingdone;

	@Column(length=255)
	private String pincode;

	@Column(precision=1)
	private BigDecimal preexistingdamage;

	@Column(precision=1)
	private BigDecimal premiumadjustmentfactor;

	@Column(precision=126)
	private double premiumadjustmentpercentage;

	@Column(length=10)
	private String prepolicydepreciationwaiver;

	@Column(length=10)
	private String prepolicyinvoiceprice;

	@Column(length=10)
	private String prepolicylossofbaggage;

	@Column(length=10)
	private String prepolicyncbplan;

	@Column(length=10)
	private String prepolicyroadtax;

	@Column(length=10)
	private String prepolicysparecar;

	@Column(length=10)
	private String prepolicywindshieldglass;

	@Column(name="PREVIOUS_ODCELIGIBLE", precision=1)
	private BigDecimal previousOdceligible;

	@Column(name="PREVIOUS_POLICY_IDV", precision=16)
	private double previousPolicyIdv;

	@Column(name="PREVIOUS_POLICY_TYPE", length=25)
	private String previousPolicyType;

	@Column(length=255)
	private String previousinsurer;

	@Column(length=255)
	private String previousinsureraddress;

	@Column(length=255)
	private String previousinsureraddress2;

	@Column(length=255)
	private String previousinsureraddress3;

	@Column(length=255)
	private String previousinsureraddress4;

	@Column(length=10)
	private String previouspolicyaggravationplan;

	@Column(length=10)
	private String previouspolicykeyrepcoverplans;

	@Column(precision=126)
	private double previouspolicyncd;

	@Column(length=255)
	private String previouspolicyno;

	@Column(precision=1)
	private BigDecimal proposerspremises;

	@Column(length=255)
	private String purchasewith;

	@Column(length=255)
	private String registeringauthority;

	@Column(length=255)
	private String registeringlocation;

	@Column(length=255)
	private String registrationaddressline1;

	@Column(length=255)
	private String registrationaddressline2;

	@Column(length=255)
	private String registrationaddressline3;

	@Column(length=255)
	private String registrationaddressline4;

	@Column(length=255)
	private String registrationnumber;

	@Column(length=255)
	private String registrationregion;

	@Column(length=255)
	private String registrationstate;

	@Column(length=255)
	private String registrationzone;

	@Column(name="ROADTAX_SUMINSURED", precision=22)
	private double roadtaxSuminsured;

	@Column(length=255)
	private String safetyfeatures;

	@Column(precision=1)
	private BigDecimal sameasmailingaddress;

	@Column(precision=10)
	private BigDecimal seatingcapacity;

	@Column(name="SERVICE_PROVIDERNAME", length=255)
	private String serviceProvidername;

	@Column(precision=10)
	private BigDecimal servicewiththeproposer;

	@Column(precision=126)
	private double slnumberofcaravantrailer;

	@Column(precision=22)
	private double sparecarlimit;

	@Column(precision=126)
	private double statedvalueofvehicle;

	@Column(name="SYS_GEN_IMT_NUMBERS", length=4000)
	private String sysGenImtNumbers;

	@Column(name="SYS_GEN_RSMOAC_NUMBERS", length=4000)
	private String sysGenRsmoacNumbers;

	@Column(precision=22)
	private double sysgenbenefitperday;

	@Column(precision=22)
	private double sysgeninvoiceprice;

	@Column(precision=22)
	private double sysgenunexpiredroadtax;

	@Column(precision=126)
	private double technicaldiscount;

	@Column(precision=22)
	private BigDecimal technicalpricingage;

	@Column(name="TRANSFER_OF_NCB", length=3)
	private String transferOfNcb;

	@Column(length=255)
	private String typeofregistration;

	@Column(precision=10)
	private BigDecimal vehicleage;

	@Column(length=255)
	private String vehiclecolor;

	@Column(length=255)
	private String vehiclecondition;

	@Column(precision=1)
	private BigDecimal vehiclefittedwithantitheft;

	@Column(precision=1)
	private BigDecimal vehicleinspectionreport;

	@Column(length=255)
	private String vehiclemostlydrivenby;

	@Column(length=255)
	private String vehiclemostlydrivenon;

	@Column(length=255)
	private String vehicleownership;

	@Column(length=255)
	private String vehicleusage;

	@Column(length=255)
	private String vinnumber;

	@Column(precision=1)
	private BigDecimal vintagecar;

	@Column(name="VIR_NUMBER", length=255)
	private String virNumber;

	@Column(precision=10)
	private BigDecimal yearofmanufacture;

	public Privatepassengercar() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdditionalcomments() {
		return this.additionalcomments;
	}

	public void setAdditionalcomments(String additionalcomments) {
		this.additionalcomments = additionalcomments;
	}

	public String getAdequacyOfInfo() {
		return this.adequacyOfInfo;
	}

	public void setAdequacyOfInfo(String adequacyOfInfo) {
		this.adequacyOfInfo = adequacyOfInfo;
	}

	public String getAggravationplan() {
		return this.aggravationplan;
	}

	public void setAggravationplan(String aggravationplan) {
		this.aggravationplan = aggravationplan;
	}

	public BigDecimal getAntiquevehicle() {
		return this.antiquevehicle;
	}

	public void setAntiquevehicle(BigDecimal antiquevehicle) {
		this.antiquevehicle = antiquevehicle;
	}

	public BigDecimal getAppreciatedInvoicePrice() {
		return this.appreciatedInvoicePrice;
	}

	public void setAppreciatedInvoicePrice(BigDecimal appreciatedInvoicePrice) {
		this.appreciatedInvoicePrice = appreciatedInvoicePrice;
	}

	public String getAreaofoperation() {
		return this.areaofoperation;
	}

	public void setAreaofoperation(String areaofoperation) {
		this.areaofoperation = areaofoperation;
	}

	public String getAutoassoicationmembershipno() {
		return this.autoassoicationmembershipno;
	}

	public void setAutoassoicationmembershipno(String autoassoicationmembershipno) {
		this.autoassoicationmembershipno = autoassoicationmembershipno;
	}

	public String getAutoassoicationname() {
		return this.autoassoicationname;
	}

	public void setAutoassoicationname(String autoassoicationname) {
		this.autoassoicationname = autoassoicationname;
	}

	public double getBiiLoadingpercentage() {
		return this.biiLoadingpercentage;
	}

	public void setBiiLoadingpercentage(double biiLoadingpercentage) {
		this.biiLoadingpercentage = biiLoadingpercentage;
	}

	public String getBodytype() {
		return this.bodytype;
	}

	public void setBodytype(String bodytype) {
		this.bodytype = bodytype;
	}

	public double getBodyvalue() {
		return this.bodyvalue;
	}

	public void setBodyvalue(double bodyvalue) {
		this.bodyvalue = bodyvalue;
	}

	public String getCampaigncode() {
		return this.campaigncode;
	}

	public void setCampaigncode(String campaigncode) {
		this.campaigncode = campaigncode;
	}

	public String getCampaignname() {
		return this.campaignname;
	}

	public void setCampaignname(String campaignname) {
		this.campaignname = campaignname;
	}

	public BigDecimal getCaravantrailertowingfacility() {
		return this.caravantrailertowingfacility;
	}

	public void setCaravantrailertowingfacility(BigDecimal caravantrailertowingfacility) {
		this.caravantrailertowingfacility = caravantrailertowingfacility;
	}

	public String getChassisno() {
		return this.chassisno;
	}

	public void setChassisno(String chassisno) {
		this.chassisno = chassisno;
	}

	public double getChassisvalue() {
		return this.chassisvalue;
	}

	public void setChassisvalue(double chassisvalue) {
		this.chassisvalue = chassisvalue;
	}

	public String getCitycode() {
		return this.citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getClaimAmount() {
		return this.claimAmount;
	}

	public void setClaimAmount(String claimAmount) {
		this.claimAmount = claimAmount;
	}

	public String getClaimsMadePreviousPolicy() {
		return this.claimsMadePreviousPolicy;
	}

	public void setClaimsMadePreviousPolicy(String claimsMadePreviousPolicy) {
		this.claimsMadePreviousPolicy = claimsMadePreviousPolicy;
	}

	public BigDecimal getClaimsfreeyears() {
		return this.claimsfreeyears;
	}

	public void setClaimsfreeyears(BigDecimal claimsfreeyears) {
		this.claimsfreeyears = claimsfreeyears;
	}

	public String getClassofvehicle() {
		return this.classofvehicle;
	}

	public void setClassofvehicle(String classofvehicle) {
		this.classofvehicle = classofvehicle;
	}

	public double getCompulsarydeductible() {
		return this.compulsarydeductible;
	}

	public void setCompulsarydeductible(double compulsarydeductible) {
		this.compulsarydeductible = compulsarydeductible;
	}

	public String getContractnumber() {
		return this.contractnumber;
	}

	public void setContractnumber(String contractnumber) {
		this.contractnumber = contractnumber;
	}

	public String getCountrydetails() {
		return this.countrydetails;
	}

	public void setCountrydetails(String countrydetails) {
		this.countrydetails = countrydetails;
	}

	public BigDecimal getCustomdutypaid() {
		return this.customdutypaid;
	}

	public void setCustomdutypaid(BigDecimal customdutypaid) {
		this.customdutypaid = customdutypaid;
	}

	public String getDateofregistration() {
		return this.dateofregistration;
	}

	public void setDateofregistration(String dateofregistration) {
		this.dateofregistration = dateofregistration;
	}

	public String getDayparking() {
		return this.dayparking;
	}

	public void setDayparking(String dayparking) {
		this.dayparking = dayparking;
	}

	public String getDepreciatedchassisvalue() {
		return this.depreciatedchassisvalue;
	}

	public void setDepreciatedchassisvalue(String depreciatedchassisvalue) {
		this.depreciatedchassisvalue = depreciatedchassisvalue;
	}

	public BigDecimal getDesignedforhandicapped() {
		return this.designedforhandicapped;
	}

	public void setDesignedforhandicapped(BigDecimal designedforhandicapped) {
		this.designedforhandicapped = designedforhandicapped;
	}

	public String getDetailscaravantrailer() {
		return this.detailscaravantrailer;
	}

	public void setDetailscaravantrailer(String detailscaravantrailer) {
		this.detailscaravantrailer = detailscaravantrailer;
	}

	public String getDetailsofdamage() {
		return this.detailsofdamage;
	}

	public void setDetailsofdamage(String detailsofdamage) {
		this.detailsofdamage = detailsofdamage;
	}

	public double getDiscountfactor() {
		return this.discountfactor;
	}

	public void setDiscountfactor(double discountfactor) {
		this.discountfactor = discountfactor;
	}

	public String getDomicile() {
		return this.domicile;
	}

	public void setDomicile(String domicile) {
		this.domicile = domicile;
	}

	public double getEnginecapacity() {
		return this.enginecapacity;
	}

	public void setEnginecapacity(double enginecapacity) {
		this.enginecapacity = enginecapacity;
	}

	public String getEngineno() {
		return this.engineno;
	}

	public void setEngineno(String engineno) {
		this.engineno = engineno;
	}

	public String getExpirydate() {
		return this.expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	public BigDecimal getFibreglasstank() {
		return this.fibreglasstank;
	}

	public void setFibreglasstank(BigDecimal fibreglasstank) {
		this.fibreglasstank = fibreglasstank;
	}

	public double getFinaldiscount() {
		return this.finaldiscount;
	}

	public void setFinaldiscount(double finaldiscount) {
		this.finaldiscount = finaldiscount;
	}

	public String getFinancierdetails() {
		return this.financierdetails;
	}

	public void setFinancierdetails(String financierdetails) {
		this.financierdetails = financierdetails;
	}

	public String getFraudIndicator() {
		return this.fraudIndicator;
	}

	public void setFraudIndicator(String fraudIndicator) {
		this.fraudIndicator = fraudIndicator;
	}

	public String getFraudReason() {
		return this.fraudReason;
	}

	public void setFraudReason(String fraudReason) {
		this.fraudReason = fraudReason;
	}

	public String getFueltype() {
		return this.fueltype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}

	public BigDecimal getGeneratencdletter() {
		return this.generatencdletter;
	}

	public void setGeneratencdletter(BigDecimal generatencdletter) {
		this.generatencdletter = generatencdletter;
	}

	public BigDecimal getGeographicalareaextension() {
		return this.geographicalareaextension;
	}

	public void setGeographicalareaextension(BigDecimal geographicalareaextension) {
		this.geographicalareaextension = geographicalareaextension;
	}

	public String getGeographygroup() {
		return this.geographygroup;
	}

	public void setGeographygroup(String geographygroup) {
		this.geographygroup = geographygroup;
	}

	public String getHypothecatedto() {
		return this.hypothecatedto;
	}

	public void setHypothecatedto(String hypothecatedto) {
		this.hypothecatedto = hypothecatedto;
	}

	public BigDecimal getIdvdeviation() {
		return this.idvdeviation;
	}

	public void setIdvdeviation(BigDecimal idvdeviation) {
		this.idvdeviation = idvdeviation;
	}

	public BigDecimal getImportedvehicle() {
		return this.importedvehicle;
	}

	public void setImportedvehicle(BigDecimal importedvehicle) {
		this.importedvehicle = importedvehicle;
	}

	public double getImposeddeductible() {
		return this.imposeddeductible;
	}

	public void setImposeddeductible(double imposeddeductible) {
		this.imposeddeductible = imposeddeductible;
	}

	public String getImtnumber() {
		return this.imtnumber;
	}

	public void setImtnumber(String imtnumber) {
		this.imtnumber = imtnumber;
	}

	public String getInspectionTime() {
		return this.inspectionTime;
	}

	public void setInspectionTime(String inspectionTime) {
		this.inspectionTime = inspectionTime;
	}

	public String getInspectiondate() {
		return this.inspectiondate;
	}

	public void setInspectiondate(String inspectiondate) {
		this.inspectiondate = inspectiondate;
	}

	public BigDecimal getIsaggravationcver() {
		return this.isaggravationcver;
	}

	public void setIsaggravationcver(BigDecimal isaggravationcver) {
		this.isaggravationcver = isaggravationcver;
	}

	public BigDecimal getIsdepreciationwaiver() {
		return this.isdepreciationwaiver;
	}

	public void setIsdepreciationwaiver(BigDecimal isdepreciationwaiver) {
		this.isdepreciationwaiver = isdepreciationwaiver;
	}

	public BigDecimal getIsinvoiceprice() {
		return this.isinvoiceprice;
	}

	public void setIsinvoiceprice(BigDecimal isinvoiceprice) {
		this.isinvoiceprice = isinvoiceprice;
	}

	public BigDecimal getIskeyreplacementcover() {
		return this.iskeyreplacementcover;
	}

	public void setIskeyreplacementcover(BigDecimal iskeyreplacementcover) {
		this.iskeyreplacementcover = iskeyreplacementcover;
	}

	public BigDecimal getIslossofbaggage() {
		return this.islossofbaggage;
	}

	public void setIslossofbaggage(BigDecimal islossofbaggage) {
		this.islossofbaggage = islossofbaggage;
	}

	public BigDecimal getIsncbprotectorcover() {
		return this.isncbprotectorcover;
	}

	public void setIsncbprotectorcover(BigDecimal isncbprotectorcover) {
		this.isncbprotectorcover = isncbprotectorcover;
	}

	public BigDecimal getIsroadtax() {
		return this.isroadtax;
	}

	public void setIsroadtax(BigDecimal isroadtax) {
		this.isroadtax = isroadtax;
	}

	public String getIssecoundhandvehicle() {
		return this.issecoundhandvehicle;
	}

	public void setIssecoundhandvehicle(String issecoundhandvehicle) {
		this.issecoundhandvehicle = issecoundhandvehicle;
	}

	public BigDecimal getIssparecar() {
		return this.issparecar;
	}

	public void setIssparecar(BigDecimal issparecar) {
		this.issparecar = issparecar;
	}

	public BigDecimal getIswindshieldglass() {
		return this.iswindshieldglass;
	}

	public void setIswindshieldglass(BigDecimal iswindshieldglass) {
		this.iswindshieldglass = iswindshieldglass;
	}

	public String getKeyreplacementcoverplan() {
		return this.keyreplacementcoverplan;
	}

	public void setKeyreplacementcoverplan(String keyreplacementcoverplan) {
		this.keyreplacementcoverplan = keyreplacementcoverplan;
	}

	public double getListprice() {
		return this.listprice;
	}

	public void setListprice(double listprice) {
		this.listprice = listprice;
	}

	public Date getListpricedate() {
		return this.listpricedate;
	}

	public void setListpricedate(Date listpricedate) {
		this.listpricedate = listpricedate;
	}

	public double getLoadingpercentage() {
		return this.loadingpercentage;
	}

	public void setLoadingpercentage(double loadingpercentage) {
		this.loadingpercentage = loadingpercentage;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMakecode() {
		return this.makecode;
	}

	public void setMakecode(String makecode) {
		this.makecode = makecode;
	}

	public String getMakemodelcaravantrailer() {
		return this.makemodelcaravantrailer;
	}

	public void setMakemodelcaravantrailer(String makemodelcaravantrailer) {
		this.makemodelcaravantrailer = makemodelcaravantrailer;
	}

	public BigDecimal getMemberofautoassociation() {
		return this.memberofautoassociation;
	}

	public void setMemberofautoassociation(BigDecimal memberofautoassociation) {
		this.memberofautoassociation = memberofautoassociation;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModelStatus() {
		return this.modelStatus;
	}

	public void setModelStatus(String modelStatus) {
		this.modelStatus = modelStatus;
	}

	public String getModelcode() {
		return this.modelcode;
	}

	public void setModelcode(String modelcode) {
		this.modelcode = modelcode;
	}

	public BigDecimal getMonthlymileagerun() {
		return this.monthlymileagerun;
	}

	public void setMonthlymileagerun(BigDecimal monthlymileagerun) {
		this.monthlymileagerun = monthlymileagerun;
	}

	public String getNcbplan() {
		return this.ncbplan;
	}

	public void setNcbplan(String ncbplan) {
		this.ncbplan = ncbplan;
	}

	public BigDecimal getNewvehicle() {
		return this.newvehicle;
	}

	public void setNewvehicle(BigDecimal newvehicle) {
		this.newvehicle = newvehicle;
	}

	public String getNightparking() {
		return this.nightparking;
	}

	public void setNightparking(String nightparking) {
		this.nightparking = nightparking;
	}

	public BigDecimal getNoofvehiclesownedbyproposer() {
		return this.noofvehiclesownedbyproposer;
	}

	public void setNoofvehiclesownedbyproposer(BigDecimal noofvehiclesownedbyproposer) {
		this.noofvehiclesownedbyproposer = noofvehiclesownedbyproposer;
	}

	public String getNumofpeopledrivingthecar() {
		return this.numofpeopledrivingthecar;
	}

	public void setNumofpeopledrivingthecar(String numofpeopledrivingthecar) {
		this.numofpeopledrivingthecar = numofpeopledrivingthecar;
	}

	public String getOdometerReading() {
		return this.odometerReading;
	}

	public void setOdometerReading(String odometerReading) {
		this.odometerReading = odometerReading;
	}

	public String getOdometerReadingdate() {
		return this.odometerReadingdate;
	}

	public void setOdometerReadingdate(String odometerReadingdate) {
		this.odometerReadingdate = odometerReadingdate;
	}

	public double getOldimposeddeductible() {
		return this.oldimposeddeductible;
	}

	public void setOldimposeddeductible(double oldimposeddeductible) {
		this.oldimposeddeductible = oldimposeddeductible;
	}

	public double getOldloadingpercentage() {
		return this.oldloadingpercentage;
	}

	public void setOldloadingpercentage(double oldloadingpercentage) {
		this.oldloadingpercentage = oldloadingpercentage;
	}

	public String getOldodometerReading() {
		return this.oldodometerReading;
	}

	public void setOldodometerReading(String oldodometerReading) {
		this.oldodometerReading = oldodometerReading;
	}

	public String getOldodometerReadingdate() {
		return this.oldodometerReadingdate;
	}

	public void setOldodometerReadingdate(String oldodometerReadingdate) {
		this.oldodometerReadingdate = oldodometerReadingdate;
	}

	public String getOwnerType() {
		return this.ownerType;
	}

	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getOwnerValue() {
		return this.ownerValue;
	}

	public void setOwnerValue(String ownerValue) {
		this.ownerValue = ownerValue;
	}

	public BigDecimal getPayout() {
		return this.payout;
	}

	public void setPayout(BigDecimal payout) {
		this.payout = payout;
	}

	public BigDecimal getPayouteligible() {
		return this.payouteligible;
	}

	public void setPayouteligible(BigDecimal payouteligible) {
		this.payouteligible = payouteligible;
	}

	public String getPeriodicserviceofvehicle() {
		return this.periodicserviceofvehicle;
	}

	public void setPeriodicserviceofvehicle(String periodicserviceofvehicle) {
		this.periodicserviceofvehicle = periodicserviceofvehicle;
	}

	public BigDecimal getPhotouploadingdone() {
		return this.photouploadingdone;
	}

	public void setPhotouploadingdone(BigDecimal photouploadingdone) {
		this.photouploadingdone = photouploadingdone;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public BigDecimal getPreexistingdamage() {
		return this.preexistingdamage;
	}

	public void setPreexistingdamage(BigDecimal preexistingdamage) {
		this.preexistingdamage = preexistingdamage;
	}

	public BigDecimal getPremiumadjustmentfactor() {
		return this.premiumadjustmentfactor;
	}

	public void setPremiumadjustmentfactor(BigDecimal premiumadjustmentfactor) {
		this.premiumadjustmentfactor = premiumadjustmentfactor;
	}

	public double getPremiumadjustmentpercentage() {
		return this.premiumadjustmentpercentage;
	}

	public void setPremiumadjustmentpercentage(double premiumadjustmentpercentage) {
		this.premiumadjustmentpercentage = premiumadjustmentpercentage;
	}

	public String getPrepolicydepreciationwaiver() {
		return this.prepolicydepreciationwaiver;
	}

	public void setPrepolicydepreciationwaiver(String prepolicydepreciationwaiver) {
		this.prepolicydepreciationwaiver = prepolicydepreciationwaiver;
	}

	public String getPrepolicyinvoiceprice() {
		return this.prepolicyinvoiceprice;
	}

	public void setPrepolicyinvoiceprice(String prepolicyinvoiceprice) {
		this.prepolicyinvoiceprice = prepolicyinvoiceprice;
	}

	public String getPrepolicylossofbaggage() {
		return this.prepolicylossofbaggage;
	}

	public void setPrepolicylossofbaggage(String prepolicylossofbaggage) {
		this.prepolicylossofbaggage = prepolicylossofbaggage;
	}

	public String getPrepolicyncbplan() {
		return this.prepolicyncbplan;
	}

	public void setPrepolicyncbplan(String prepolicyncbplan) {
		this.prepolicyncbplan = prepolicyncbplan;
	}

	public String getPrepolicyroadtax() {
		return this.prepolicyroadtax;
	}

	public void setPrepolicyroadtax(String prepolicyroadtax) {
		this.prepolicyroadtax = prepolicyroadtax;
	}

	public String getPrepolicysparecar() {
		return this.prepolicysparecar;
	}

	public void setPrepolicysparecar(String prepolicysparecar) {
		this.prepolicysparecar = prepolicysparecar;
	}

	public String getPrepolicywindshieldglass() {
		return this.prepolicywindshieldglass;
	}

	public void setPrepolicywindshieldglass(String prepolicywindshieldglass) {
		this.prepolicywindshieldglass = prepolicywindshieldglass;
	}

	public BigDecimal getPreviousOdceligible() {
		return this.previousOdceligible;
	}

	public void setPreviousOdceligible(BigDecimal previousOdceligible) {
		this.previousOdceligible = previousOdceligible;
	}

	public double getPreviousPolicyIdv() {
		return this.previousPolicyIdv;
	}

	public void setPreviousPolicyIdv(double previousPolicyIdv) {
		this.previousPolicyIdv = previousPolicyIdv;
	}

	public String getPreviousPolicyType() {
		return this.previousPolicyType;
	}

	public void setPreviousPolicyType(String previousPolicyType) {
		this.previousPolicyType = previousPolicyType;
	}

	public String getPreviousinsurer() {
		return this.previousinsurer;
	}

	public void setPreviousinsurer(String previousinsurer) {
		this.previousinsurer = previousinsurer;
	}

	public String getPreviousinsureraddress() {
		return this.previousinsureraddress;
	}

	public void setPreviousinsureraddress(String previousinsureraddress) {
		this.previousinsureraddress = previousinsureraddress;
	}

	public String getPreviousinsureraddress2() {
		return this.previousinsureraddress2;
	}

	public void setPreviousinsureraddress2(String previousinsureraddress2) {
		this.previousinsureraddress2 = previousinsureraddress2;
	}

	public String getPreviousinsureraddress3() {
		return this.previousinsureraddress3;
	}

	public void setPreviousinsureraddress3(String previousinsureraddress3) {
		this.previousinsureraddress3 = previousinsureraddress3;
	}

	public String getPreviousinsureraddress4() {
		return this.previousinsureraddress4;
	}

	public void setPreviousinsureraddress4(String previousinsureraddress4) {
		this.previousinsureraddress4 = previousinsureraddress4;
	}

	public String getPreviouspolicyaggravationplan() {
		return this.previouspolicyaggravationplan;
	}

	public void setPreviouspolicyaggravationplan(String previouspolicyaggravationplan) {
		this.previouspolicyaggravationplan = previouspolicyaggravationplan;
	}

	public String getPreviouspolicykeyrepcoverplans() {
		return this.previouspolicykeyrepcoverplans;
	}

	public void setPreviouspolicykeyrepcoverplans(String previouspolicykeyrepcoverplans) {
		this.previouspolicykeyrepcoverplans = previouspolicykeyrepcoverplans;
	}

	public double getPreviouspolicyncd() {
		return this.previouspolicyncd;
	}

	public void setPreviouspolicyncd(double previouspolicyncd) {
		this.previouspolicyncd = previouspolicyncd;
	}

	public String getPreviouspolicyno() {
		return this.previouspolicyno;
	}

	public void setPreviouspolicyno(String previouspolicyno) {
		this.previouspolicyno = previouspolicyno;
	}

	public BigDecimal getProposerspremises() {
		return this.proposerspremises;
	}

	public void setProposerspremises(BigDecimal proposerspremises) {
		this.proposerspremises = proposerspremises;
	}

	public String getPurchasewith() {
		return this.purchasewith;
	}

	public void setPurchasewith(String purchasewith) {
		this.purchasewith = purchasewith;
	}

	public String getRegisteringauthority() {
		return this.registeringauthority;
	}

	public void setRegisteringauthority(String registeringauthority) {
		this.registeringauthority = registeringauthority;
	}

	public String getRegisteringlocation() {
		return this.registeringlocation;
	}

	public void setRegisteringlocation(String registeringlocation) {
		this.registeringlocation = registeringlocation;
	}

	public String getRegistrationaddressline1() {
		return this.registrationaddressline1;
	}

	public void setRegistrationaddressline1(String registrationaddressline1) {
		this.registrationaddressline1 = registrationaddressline1;
	}

	public String getRegistrationaddressline2() {
		return this.registrationaddressline2;
	}

	public void setRegistrationaddressline2(String registrationaddressline2) {
		this.registrationaddressline2 = registrationaddressline2;
	}

	public String getRegistrationaddressline3() {
		return this.registrationaddressline3;
	}

	public void setRegistrationaddressline3(String registrationaddressline3) {
		this.registrationaddressline3 = registrationaddressline3;
	}

	public String getRegistrationaddressline4() {
		return this.registrationaddressline4;
	}

	public void setRegistrationaddressline4(String registrationaddressline4) {
		this.registrationaddressline4 = registrationaddressline4;
	}

	public String getRegistrationnumber() {
		return this.registrationnumber;
	}

	public void setRegistrationnumber(String registrationnumber) {
		this.registrationnumber = registrationnumber;
	}

	public String getRegistrationregion() {
		return this.registrationregion;
	}

	public void setRegistrationregion(String registrationregion) {
		this.registrationregion = registrationregion;
	}

	public String getRegistrationstate() {
		return this.registrationstate;
	}

	public void setRegistrationstate(String registrationstate) {
		this.registrationstate = registrationstate;
	}

	public String getRegistrationzone() {
		return this.registrationzone;
	}

	public void setRegistrationzone(String registrationzone) {
		this.registrationzone = registrationzone;
	}

	public double getRoadtaxSuminsured() {
		return this.roadtaxSuminsured;
	}

	public void setRoadtaxSuminsured(double roadtaxSuminsured) {
		this.roadtaxSuminsured = roadtaxSuminsured;
	}

	public String getSafetyfeatures() {
		return this.safetyfeatures;
	}

	public void setSafetyfeatures(String safetyfeatures) {
		this.safetyfeatures = safetyfeatures;
	}

	public BigDecimal getSameasmailingaddress() {
		return this.sameasmailingaddress;
	}

	public void setSameasmailingaddress(BigDecimal sameasmailingaddress) {
		this.sameasmailingaddress = sameasmailingaddress;
	}

	public BigDecimal getSeatingcapacity() {
		return this.seatingcapacity;
	}

	public void setSeatingcapacity(BigDecimal seatingcapacity) {
		this.seatingcapacity = seatingcapacity;
	}

	public String getServiceProvidername() {
		return this.serviceProvidername;
	}

	public void setServiceProvidername(String serviceProvidername) {
		this.serviceProvidername = serviceProvidername;
	}

	public BigDecimal getServicewiththeproposer() {
		return this.servicewiththeproposer;
	}

	public void setServicewiththeproposer(BigDecimal servicewiththeproposer) {
		this.servicewiththeproposer = servicewiththeproposer;
	}

	public double getSlnumberofcaravantrailer() {
		return this.slnumberofcaravantrailer;
	}

	public void setSlnumberofcaravantrailer(double slnumberofcaravantrailer) {
		this.slnumberofcaravantrailer = slnumberofcaravantrailer;
	}

	public double getSparecarlimit() {
		return this.sparecarlimit;
	}

	public void setSparecarlimit(double sparecarlimit) {
		this.sparecarlimit = sparecarlimit;
	}

	public double getStatedvalueofvehicle() {
		return this.statedvalueofvehicle;
	}

	public void setStatedvalueofvehicle(double statedvalueofvehicle) {
		this.statedvalueofvehicle = statedvalueofvehicle;
	}

	public String getSysGenImtNumbers() {
		return this.sysGenImtNumbers;
	}

	public void setSysGenImtNumbers(String sysGenImtNumbers) {
		this.sysGenImtNumbers = sysGenImtNumbers;
	}

	public String getSysGenRsmoacNumbers() {
		return this.sysGenRsmoacNumbers;
	}

	public void setSysGenRsmoacNumbers(String sysGenRsmoacNumbers) {
		this.sysGenRsmoacNumbers = sysGenRsmoacNumbers;
	}

	public double getSysgenbenefitperday() {
		return this.sysgenbenefitperday;
	}

	public void setSysgenbenefitperday(double sysgenbenefitperday) {
		this.sysgenbenefitperday = sysgenbenefitperday;
	}

	public double getSysgeninvoiceprice() {
		return this.sysgeninvoiceprice;
	}

	public void setSysgeninvoiceprice(double sysgeninvoiceprice) {
		this.sysgeninvoiceprice = sysgeninvoiceprice;
	}

	public double getSysgenunexpiredroadtax() {
		return this.sysgenunexpiredroadtax;
	}

	public void setSysgenunexpiredroadtax(double sysgenunexpiredroadtax) {
		this.sysgenunexpiredroadtax = sysgenunexpiredroadtax;
	}

	public double getTechnicaldiscount() {
		return this.technicaldiscount;
	}

	public void setTechnicaldiscount(double technicaldiscount) {
		this.technicaldiscount = technicaldiscount;
	}

	public BigDecimal getTechnicalpricingage() {
		return this.technicalpricingage;
	}

	public void setTechnicalpricingage(BigDecimal technicalpricingage) {
		this.technicalpricingage = technicalpricingage;
	}

	public String getTransferOfNcb() {
		return this.transferOfNcb;
	}

	public void setTransferOfNcb(String transferOfNcb) {
		this.transferOfNcb = transferOfNcb;
	}

	public String getTypeofregistration() {
		return this.typeofregistration;
	}

	public void setTypeofregistration(String typeofregistration) {
		this.typeofregistration = typeofregistration;
	}

	public BigDecimal getVehicleage() {
		return this.vehicleage;
	}

	public void setVehicleage(BigDecimal vehicleage) {
		this.vehicleage = vehicleage;
	}

	public String getVehiclecolor() {
		return this.vehiclecolor;
	}

	public void setVehiclecolor(String vehiclecolor) {
		this.vehiclecolor = vehiclecolor;
	}

	public String getVehiclecondition() {
		return this.vehiclecondition;
	}

	public void setVehiclecondition(String vehiclecondition) {
		this.vehiclecondition = vehiclecondition;
	}

	public BigDecimal getVehiclefittedwithantitheft() {
		return this.vehiclefittedwithantitheft;
	}

	public void setVehiclefittedwithantitheft(BigDecimal vehiclefittedwithantitheft) {
		this.vehiclefittedwithantitheft = vehiclefittedwithantitheft;
	}

	public BigDecimal getVehicleinspectionreport() {
		return this.vehicleinspectionreport;
	}

	public void setVehicleinspectionreport(BigDecimal vehicleinspectionreport) {
		this.vehicleinspectionreport = vehicleinspectionreport;
	}

	public String getVehiclemostlydrivenby() {
		return this.vehiclemostlydrivenby;
	}

	public void setVehiclemostlydrivenby(String vehiclemostlydrivenby) {
		this.vehiclemostlydrivenby = vehiclemostlydrivenby;
	}

	public String getVehiclemostlydrivenon() {
		return this.vehiclemostlydrivenon;
	}

	public void setVehiclemostlydrivenon(String vehiclemostlydrivenon) {
		this.vehiclemostlydrivenon = vehiclemostlydrivenon;
	}

	public String getVehicleownership() {
		return this.vehicleownership;
	}

	public void setVehicleownership(String vehicleownership) {
		this.vehicleownership = vehicleownership;
	}

	public String getVehicleusage() {
		return this.vehicleusage;
	}

	public void setVehicleusage(String vehicleusage) {
		this.vehicleusage = vehicleusage;
	}

	public String getVinnumber() {
		return this.vinnumber;
	}

	public void setVinnumber(String vinnumber) {
		this.vinnumber = vinnumber;
	}

	public BigDecimal getVintagecar() {
		return this.vintagecar;
	}

	public void setVintagecar(BigDecimal vintagecar) {
		this.vintagecar = vintagecar;
	}

	public String getVirNumber() {
		return this.virNumber;
	}

	public void setVirNumber(String virNumber) {
		this.virNumber = virNumber;
	}

	public BigDecimal getYearofmanufacture() {
		return this.yearofmanufacture;
	}

	public void setYearofmanufacture(BigDecimal yearofmanufacture) {
		this.yearofmanufacture = yearofmanufacture;
	}

}*/