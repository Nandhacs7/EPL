package com.rs.epl.NB.dtoresponse;

public class ChartDto {
////////////////Policy  ////////////////////
    private Integer TodayNoOfReceiptStatusSuccessRecords;
    private Integer TodayNoOfReceiptStatusFailedRecords ;
    
    private Integer WeeklyNoOfReceiptStatusSuccessRecords;
    private Integer WeeklyNoOfReceiptStatusFailedRecords;
    
    private Integer MonthlyNoOfReceiptStatusSuccessRecords;

	private Integer MonthlyNoOfReceiptStatusFailedRecords;
    
////////////////    Policy  ////////////////////  
    private Integer TodayNoOfPolicySuccessRecords;
    private Integer TodayNoOfPolicyFailedRecords ;
    
    private Integer WeeklyNoOfPolicySuccessRecords;
    private Integer WeeklyNoOfPolicyFailedRecords;
    
    private Integer MonthlyNoOfPolicySuccessRecords;
    private Integer MonthlyNoOfPolicyFailedRecords;
    
    public Integer getTodayNoOfReceiptStatusSuccessRecords() {
        return TodayNoOfReceiptStatusSuccessRecords;
    }
    public void setTodayNoOfReceiptStatusSuccessRecords(Integer todayNoOfReceiptStatusSuccessRecords) {
        TodayNoOfReceiptStatusSuccessRecords = todayNoOfReceiptStatusSuccessRecords;
    }
    public Integer getTodayNoOfReceiptStatusFailedRecords() {
        return TodayNoOfReceiptStatusFailedRecords;
    }
    public void setTodayNoOfReceiptStatusFailedRecords(Integer todayNoOfReceiptStatusFailedRecords) {
        TodayNoOfReceiptStatusFailedRecords = todayNoOfReceiptStatusFailedRecords;
    }
    public Integer getWeeklyNoOfReceiptStatusSuccessRecords() {
        return WeeklyNoOfReceiptStatusSuccessRecords;
    }
    public void setWeeklyNoOfReceiptStatusSuccessRecords(
            Integer weeklyNoOfReceiptStatusSuccessRecords) {
        WeeklyNoOfReceiptStatusSuccessRecords = weeklyNoOfReceiptStatusSuccessRecords;
    }
    public Integer getWeeklyNoOfReceiptStatusFailedRecords() {
        return WeeklyNoOfReceiptStatusFailedRecords;
    }
    public void setWeeklyNoOfReceiptStatusFailedRecords(Integer weeklyNoOfReceiptStatusFailedRecords) {
        WeeklyNoOfReceiptStatusFailedRecords = weeklyNoOfReceiptStatusFailedRecords;
    }
    public Integer getMonthlyNoOfReceiptStatusSuccessRecords() {
        return MonthlyNoOfReceiptStatusSuccessRecords;
    }
    public void setMonthlyNoOfReceiptStatusSuccessRecords(
            Integer monthlyNoOfReceiptStatusSuccessRecords) {
        MonthlyNoOfReceiptStatusSuccessRecords = monthlyNoOfReceiptStatusSuccessRecords;
    }
    public Integer getMonthlyNoOfReceiptStatusFailedRecords() {
        return MonthlyNoOfReceiptStatusFailedRecords;
    }
    public void setMonthlyNoOfReceiptStatusFailedRecords(
            Integer monthlyNoOfReceiptStatusFailedRecords) {
        MonthlyNoOfReceiptStatusFailedRecords = monthlyNoOfReceiptStatusFailedRecords;
    }
    public Integer getTodayNoOfPolicySuccessRecords() {
        return TodayNoOfPolicySuccessRecords;
    }
    public void setTodayNoOfPolicySuccessRecords(Integer todayNoOfPolicySuccessRecords) {
        TodayNoOfPolicySuccessRecords = todayNoOfPolicySuccessRecords;
    }
    public Integer getTodayNoOfPolicyFailedRecords() {
        return TodayNoOfPolicyFailedRecords;
    }
    public void setTodayNoOfPolicyFailedRecords(Integer todayNoOfPolicyFailedRecords) {
        TodayNoOfPolicyFailedRecords = todayNoOfPolicyFailedRecords;
    }
    public Integer getWeeklyNoOfPolicySuccessRecords() {
        return WeeklyNoOfPolicySuccessRecords;
    }
    public void setWeeklyNoOfPolicySuccessRecords(Integer weeklyNoOfPolicySuccessRecords) {
        WeeklyNoOfPolicySuccessRecords = weeklyNoOfPolicySuccessRecords;
    }
    public Integer getWeeklyNoOfPolicyFailedRecords() {
        return WeeklyNoOfPolicyFailedRecords;
    }
    public void setWeeklyNoOfPolicyFailedRecords(Integer weeklyNoOfPolicyFailedRecords) {
        WeeklyNoOfPolicyFailedRecords = weeklyNoOfPolicyFailedRecords;
    }
    public Integer getMonthlyNoOfPolicySuccessRecords() {
        return MonthlyNoOfPolicySuccessRecords;
    }
    public void setMonthlyNoOfPolicySuccessRecords(Integer monthlyNoOfPolicySuccessRecords) {
        MonthlyNoOfPolicySuccessRecords = monthlyNoOfPolicySuccessRecords;
    }
    public Integer getMonthlyNoOfPolicyFailedRecords() {
        return MonthlyNoOfPolicyFailedRecords;
    }
    public void setMonthlyNoOfPolicyFailedRecords(Integer monthlyNoOfPolicyFailedRecords) {
        MonthlyNoOfPolicyFailedRecords = monthlyNoOfPolicyFailedRecords;
    }
    @Override
	public String toString() {
		return "ChartDto [TodayNoOfReceiptStatusSuccessRecords=" + TodayNoOfReceiptStatusSuccessRecords
				+ ", TodayNoOfReceiptStatusFailedRecords=" + TodayNoOfReceiptStatusFailedRecords
				+ ", WeeklyNoOfReceiptStatusSuccessRecords=" + WeeklyNoOfReceiptStatusSuccessRecords
				+ ", WeeklyNoOfReceiptStatusFailedRecords=" + WeeklyNoOfReceiptStatusFailedRecords
				+ ", MonthlyNoOfReceiptStatusSuccessRecords=" + MonthlyNoOfReceiptStatusSuccessRecords
				+ ", MonthlyNoOfReceiptStatusFailedRecords=" + MonthlyNoOfReceiptStatusFailedRecords
				+ ", TodayNoOfPolicySuccessRecords=" + TodayNoOfPolicySuccessRecords + ", TodayNoOfPolicyFailedRecords="
				+ TodayNoOfPolicyFailedRecords + ", WeeklyNoOfPolicySuccessRecords=" + WeeklyNoOfPolicySuccessRecords
				+ ", WeeklyNoOfPolicyFailedRecords=" + WeeklyNoOfPolicyFailedRecords
				+ ", MonthlyNoOfPolicySuccessRecords=" + MonthlyNoOfPolicySuccessRecords
				+ ", MonthlyNoOfPolicyFailedRecords=" + MonthlyNoOfPolicyFailedRecords + "]";
	}
}
