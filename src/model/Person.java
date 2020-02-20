package model;

import java.sql.Date;

public class Person {

	private String sPerson;
	private byte cDocumentType;
	private String sDocument;
	private String sName;
	private String sLastName;
	private boolean biAccountType;
	private String sAccountNumber;
	private String mDato;
	private Date dCreatedAt;
	private Date dUpdatedAt;
	private boolean isActive;
	
	
	
	
//	public Person() {
//		super();
//		this.sPerson = sPerson;
//		this.cDocumentType = cDocumentType;
//		this.sDocument = sDocument;
//		this.sName = sName;
//		this.sLastName = sLastName;
//		this.biAccountType = biAccountType;
//		this.sAccountNumber = sAccountNumber;
//		this.mDato = mDato;
//		this.dCreatedAt = dCreatedAt;
//		this.dUpdatedAt = dUpdatedAt;
//		this.isActive = isActive;
//	}




	public String getsPerson() {
		return sPerson;
	}


	public void setsPerson(String sPerson) {
		this.sPerson = sPerson;
	}




	public byte getcDocumentType() {
		return cDocumentType;
	}




	public void setcDocumentType(byte cDocumentType) {
		this.cDocumentType = cDocumentType;
	}




	public String getsDocument() {
		return sDocument;
	}




	public void setsDocument(String sDocument) {
		this.sDocument = sDocument;
	}




	public String getsName() {
		return sName;
	}




	public void setsName(String sName) {
		this.sName = sName;
	}




	public String getsLastName() {
		return sLastName;
	}




	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}




	public boolean getbiAccountType() {
		return biAccountType;
	}




	public void setcAccountType(boolean biAccountType) {
		this.biAccountType = biAccountType;
	}




	public String getsAccountNumber() {
		return sAccountNumber;
	}




	public void setsAccountNumber(String sAccountNumber) {
		this.sAccountNumber = sAccountNumber;
	}




	public String getmDato() {
		return mDato;
	}




	public void setmDato(String mDato) {
		this.mDato = mDato;
	}




	public Date getdCreatedAt() {
		return dCreatedAt;
	}




	public void setdCreatedAt(Date dCreatedAt) {
		this.dCreatedAt = dCreatedAt;
	}




	public Date getdUpdatedAt() {
		return dUpdatedAt;
	}




	public void setdUpdatedAt(Date dUpdatedAt) {
		this.dUpdatedAt = dUpdatedAt;
	}




	public boolean getIsActive() {
		return isActive;
	}




	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}




	@Override
	public String toString() {
		return "Person [sPerson=" + sPerson + ", cTypeDocument=" + cDocumentType + ", sDocument=" + sDocument
				+ ", sName=" + sName + ", sLastName=" + sLastName + ", biAccountType=" + biAccountType
				+ ", sAccountNumber=" + sAccountNumber + ", mDato=" + mDato + ", dCreatedAt=" + dCreatedAt
				+ ", dUpdatedAt=" + dUpdatedAt + ", isActive=" + isActive + "]";
	}
	
	
	
	
	
	
}
