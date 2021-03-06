package com.myspace.carbonabatementprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class abatementData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("GovernmentProjectID")
	private java.lang.String govtProjectId;
	@org.kie.api.definition.type.Label("Customer Name")
	private java.lang.String customerName;
	@org.kie.api.definition.type.Label("Status")
	private java.lang.String status;
	@org.kie.api.definition.type.Label("Abatement Number")
	private java.lang.Integer abatementNumber;

	@org.kie.api.definition.type.Label(value = "Approve")
	private boolean approve;

	public abatementData() {
	}

	public java.lang.String getGovtProjectId() {
		return this.govtProjectId;
	}

	public void setGovtProjectId(java.lang.String govtProjectId) {
		this.govtProjectId = govtProjectId;
	}

	public java.lang.String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(java.lang.String customerName) {
		this.customerName = customerName;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.Integer getAbatementNumber() {
		return this.abatementNumber;
	}

	public void setAbatementNumber(java.lang.Integer abatementNumber) {
		this.abatementNumber = abatementNumber;
	}

	public boolean isApprove() {
		return this.approve;
	}

	public void setApprove(boolean approve) {
		this.approve = approve;
	}

	public abatementData(java.lang.String govtProjectId,
			java.lang.String customerName, java.lang.String status,
			java.lang.Integer abatementNumber, boolean approve) {
		this.govtProjectId = govtProjectId;
		this.customerName = customerName;
		this.status = status;
		this.abatementNumber = abatementNumber;
		this.approve = approve;
	}

}