package com.bancosantander.likeu.model;

/**
 * This class was automatically generated by the data modeler tool.
 */
public class Data implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String contractkey;
	private java.lang.String activationdate;
	private java.lang.String type;
	private java.lang.String status;
	private java.lang.String lastevaluationdate;
	private java.lang.String cutofdate;
	private com.bancosantander.likeu.model.CardDetail card;

	public Data() {
	}

	public java.lang.String getContractkey() {
		return this.contractkey;
	}

	public void setContractkey(java.lang.String contractkey) {
		this.contractkey = contractkey;
	}

	public java.lang.String getActivationdate() {
		return this.activationdate;
	}

	public void setActivationdate(java.lang.String activationdate) {
		this.activationdate = activationdate;
	}

	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getLastevaluationdate() {
		return this.lastevaluationdate;
	}

	public void setLastevaluationdate(java.lang.String lastevaluationdate) {
		this.lastevaluationdate = lastevaluationdate;
	}

	public java.lang.String getCutofdate() {
		return this.cutofdate;
	}

	public void setCutofdate(java.lang.String cutofdate) {
		this.cutofdate = cutofdate;
	}

	public com.bancosantander.likeu.model.CardDetail getCard() {
		return this.card;
	}

	public void setCard(com.bancosantander.likeu.model.CardDetail card) {
		this.card = card;
	}

	public Data(java.lang.String contractkey, java.lang.String activationdate,
			java.lang.String type, java.lang.String status,
			java.lang.String lastevaluationdate, java.lang.String cutofdate,
			com.bancosantander.likeu.model.CardDetail card) {
		this.contractkey = contractkey;
		this.activationdate = activationdate;
		this.type = type;
		this.status = status;
		this.lastevaluationdate = lastevaluationdate;
		this.cutofdate = cutofdate;
		this.card = card;
	}

}