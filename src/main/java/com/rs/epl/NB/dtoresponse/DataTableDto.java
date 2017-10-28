/**
 * 
 */
package com.rs.epl.NB.dtoresponse;

/**
 * @author Nandhu
 *
 */
public class DataTableDto<T> {
	private T tableValue;
	private long recordsTotal;
	private long recordsFiltered;
	public T getTableValue() {
		return tableValue;
	}
	public void setTableValue(T tableValue) {
		this.tableValue = tableValue;
	}
	public long getRecordsTotal() {
		return recordsTotal;
	}
	public void setRecordsTotal(long recordsTotal) {
		this.recordsTotal = recordsTotal;
	}
	public long getRecordsFiltered() {
		return recordsFiltered;
	}
	public void setRecordsFiltered(long recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}
	
	
}
