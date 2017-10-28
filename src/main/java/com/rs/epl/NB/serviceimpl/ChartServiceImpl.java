/*package com.rs.epl.NB.serviceimpl;

import java.util.List;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rs.epl.NB.dtoresponse.ChartDto;
import com.rs.epl.NB.policyrepository.PolicyErrorDataRepository;
import com.rs.epl.NB.policyrepository.ReceiptFaStatusRepository;
import com.rs.epl.NB.service.ChartService;

@Service
public class ChartServiceImpl implements ChartService{
    
    @Resource
    ReceiptFaStatusRepository receiptFaStatusRepository;
    
    @Resource
    PolicyErrorDataRepository policyErrorDataRepository;
    
    
  
    @Override
    public int getNoOfSuccessReceipts2DaysBefore() {
        int noOfSuccessReceipts = 0;
        List<Object> receiptFaStatusList = receiptFaStatusRepository.findAll2DaysBeforeReceiptSuccessRecords();
        noOfSuccessReceipts = receiptFaStatusList.size();
        return noOfSuccessReceipts;
    }

    @Override
    public int getNoOfFailedReceipts2DaysBefore() {
        int noOfFailReceipts = 0;
        List<Object> receiptFaStatusList = receiptFaStatusRepository.findAll2DaysBeforeReceiptFailRecords();
        noOfFailReceipts = receiptFaStatusList.size();
        return noOfFailReceipts;
    }

    @Override
    public int getNoOfSuccessReceipts1WeekBefore() {
        int noOfFailReceipts = 0;
        List<Object> receiptFaStatusList = receiptFaStatusRepository.findAll1WeekBeforeReceiptSuccessRecords();
        noOfFailReceipts = receiptFaStatusList.size();
        return noOfFailReceipts;
    }

    @Override
    public int getNoOfFailedReceipts1WeekBefore() {
        int noOfFailReceipts = 0;
        List<Object> receiptFaStatusList = receiptFaStatusRepository.findAll1WeekBeforeReceiptFailRecords();
        noOfFailReceipts = receiptFaStatusList.size();
        return noOfFailReceipts;
    }

    @Override
    public int getNoOfSuccessReceipts1MonthBefore() {
        int noOfFailReceipts = 0;
        List<Object> receiptFaStatusList = receiptFaStatusRepository.findAll1MonthBeforeReceiptSuccessRecords();
        noOfFailReceipts = receiptFaStatusList.size();
        return noOfFailReceipts;
    }

    @Override
    public int getNoOfFailedReceipts1MonthBefore() {
        int noOfFailReceipts = 0;
        List<Object> receiptFaStatusList = receiptFaStatusRepository.findAll1MonthBeforeReceiptFailRecords();
        noOfFailReceipts = receiptFaStatusList.size();
        return noOfFailReceipts;
    }
/////////////////////////Policy Info//////////////////////////////
    @Override
    public int getNoOfSuccessPolicies2DaysBefore() {
        int noOfFailReceipts = 0;
        List<Object> receiptFaStatusList = policyErrorDataRepository.findAll2DaysBeforePolicyErrorDataSuccessRecords();
//        System.out.println("returned by native query method receiptFaStatusList : "+receiptFaStatusList);
        noOfFailReceipts = receiptFaStatusList.size();
        return noOfFailReceipts;
    }

    @Override
    public int getNoOfFailedPolicies2DaysBefore() {
        int noOfFailReceipts = 0;
        Date currentDate = new Date();
        Calendar cal=Calendar.getInstance();
        cal.setTime(currentDate);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        currentDate = cal.getTime();
        
        Calendar cal2 = Calendar.getInstance();
        cal2.add(Calendar.DATE, -7);
//        System.out.println("cal2.getTime() : "+cal2.getTime());
        
        
//        List<PolicyerrorData> receiptFaStatusList = policyErrorDataRepository.findTodayPolicySuccessRecords("SUCCESS",currentDate);
        List<Object> receiptFaStatusList = policyErrorDataRepository.findAll2DaysBeforePolicyErrorDataFailRecords();
//        System.out.println("receiptFaStatusList : "+receiptFaStatusList);
        noOfFailReceipts = receiptFaStatusList.size();
        return noOfFailReceipts;
    }

    @Override
    public int getNoOfSuccessPolicies1WeekBefore() {
        int noOfFailReceipts = 0;
        
        List<Object> receiptFaStatusList = policyErrorDataRepository.findAll1WeekBeforePolicyErrorDataSuccessRecords();
//        System.out.println("getNoOfSuccessPolicies1WeekBefore : "+receiptFaStatusList);
        noOfFailReceipts = receiptFaStatusList.size();
        return noOfFailReceipts;
    }

    @Override
    public int getNoOfFailedPolicies1WeekBefore() {
        int noOfFailReceipts = 0;
        List<Object> receiptFaStatusList = policyErrorDataRepository.findAll1WeekBeforePolicyErrorDataFailRecords();
        noOfFailReceipts = receiptFaStatusList.size();
        return noOfFailReceipts;
    }

    @Override
    public int getNoOfSuccessPolicies1MonthBefore() {
        int noOfFailReceipts = 0;
        List<Object> receiptFaStatusList = policyErrorDataRepository.findAll1MonthBeforePolicyErrorDataSuccessRecords();
        noOfFailReceipts = receiptFaStatusList.size();
        return noOfFailReceipts;
    }

    @Override
    public int getNoOfFailedPolicies1MonthBefore() {
        int noOfFailReceipts = 0;
        List<Object> receiptFaStatusList = policyErrorDataRepository.findAll1MonthBeforePolicyErrorDataFailRecords();
        noOfFailReceipts = receiptFaStatusList.size();
        return noOfFailReceipts;
    }
    public ChartDto getChart() {
        ChartDto chartDto = new ChartDto();
        
        chartDto.setTodayNoOfPolicyFailedRecords(getNoOfFailedPolicies2DaysBefore());
        chartDto.setTodayNoOfPolicySuccessRecords(getNoOfSuccessPolicies2DaysBefore());
        chartDto.setWeeklyNoOfPolicyFailedRecords(getNoOfFailedPolicies1WeekBefore());
        chartDto.setWeeklyNoOfPolicySuccessRecords(getNoOfSuccessPolicies1WeekBefore());
        chartDto.setMonthlyNoOfPolicyFailedRecords(getNoOfFailedPolicies1MonthBefore());
        chartDto.setMonthlyNoOfPolicySuccessRecords(getNoOfSuccessPolicies1MonthBefore());
        
        
        chartDto.setTodayNoOfReceiptStatusFailedRecords(getNoOfFailedReceipts2DaysBefore());
        chartDto.setTodayNoOfReceiptStatusSuccessRecords(getNoOfSuccessReceipts2DaysBefore());;
        chartDto.setWeeklyNoOfReceiptStatusFailedRecords(getNoOfFailedReceipts1WeekBefore());
        chartDto.setWeeklyNoOfReceiptStatusSuccessRecords(getNoOfSuccessReceipts1WeekBefore());
        chartDto.setMonthlyNoOfReceiptStatusFailedRecords(getNoOfFailedReceipts1MonthBefore());
        chartDto.setMonthlyNoOfReceiptStatusSuccessRecords(getNoOfSuccessReceipts1MonthBefore());
        return chartDto;
    }
}
*/