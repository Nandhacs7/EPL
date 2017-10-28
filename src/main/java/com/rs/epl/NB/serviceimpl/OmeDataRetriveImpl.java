package com.rs.epl.NB.serviceimpl;
/*package com.fa.component.policy.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fa.component.OEM.entity.TtrnDriver;
import com.fa.component.OEM.entity.TtrnPolicy;
import com.fa.component.OEM.entity.TtrnInscovered;
import com.fa.component.OEM.entity.TtrnInsured;
import com.fa.component.policy.repository.DriverInfo;
import com.fa.component.policy.repository.InsCovered;
import com.fa.component.policy.repository.Insuredinfo;
import com.fa.component.policy.repository.Policyinfo;

@Service
@Transactional(value = "transactionManager")
public class OmeDataRetriveImpl implements com.fa.component.policy.service.OmeDataRetrive {
	@Resource
	DriverInfo DriverRepo;
	@Resource
    InsCovered InsCoveredRepo;
	@Resource
    Insuredinfo InsuredRepo;
	@Resource
    Policyinfo  Omepolicyrepo;
	public OmeDataRetriveImpl() {
		
	}
	public OmeDataRetriveImpl(DriverInfo driverRepo) {
		super();
		this.DriverRepo = driverRepo;
	}
	
	@Override
	public List<TtrnDriver> DriverDetails() {
//		TtrnDriver driv=DriverRepo.findOne("MOP4163853");
//		System.out.println("------Loading Driver---"+driv.getXgenPolicyno());
		List<TtrnDriver> Omedrivers=DriverRepo.findAll();
//		Omedrivers.add(driv);
		return Omedrivers;
	}

	@Override
	public List<TtrnInscovered> CoverageDeatails() {
//		TtrnInscovered cov=InsCoveredRepo.findOne("MOP4163853");
//		System.out.println("------Loading TtrnInscovered---"+cov.getXgenPolicyno());
		List<TtrnInscovered> OmeInsCovs=InsCoveredRepo.findAll();
//		OmeInsCovs.add(cov);
		return OmeInsCovs;
	}

	@Override
	public List<TtrnInsured> InsuredDeatails() {
//		TtrnInsured insured=InsuredRepo.findOne("MOP4163853");
//		System.out.println("------Loading TtrnInsured---"+insured.getXgenPolicyno());
		List<TtrnInsured> OmeInsuredinfo=InsuredRepo.findAll();
//		OmeInsuredinfo.add(insured);
		return OmeInsuredinfo;
	}

	@Override
	public List<TtrnPolicy> PolicyDeatails() {
//		TtrnPolicy pol=Omepolicyrepo.findOne("MOP4163853");
//		System.out.println("------Loading TtrnPolicy---"+pol.getXgenPolicyno());
		List<TtrnPolicy> OmePolicyinfo=Omepolicyrepo.findAll();
//		OmePolicyinfo.add(pol);
		return OmePolicyinfo;
	}

}
*/