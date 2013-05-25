package com.evolvus.training.oxm.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Information that locates and identifies a specific address, as defined by
 * postal services.
 * 
 * @author Anish
 * 
 */
@Entity
@Table(name = "FLX_POSTAL_ADDRESS6")
public class PostalAddress6 implements Serializable {

	private static final long serialVersionUID = 8754410137408745089L;

	/**
	 * Internal identifier of the <code>PostalAddress6</code> entity.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "postal_address6_seq")
	@SequenceGenerator(name = "postal_address6_seq", sequenceName = "FLX_POSTAL_ADDRESS6_SEQ")
	@Column(name = "POSTAL_ADDRESS6_ID")
	private Long postalAddress6Id;

	/**
	 * Identifies the nature of the postal address. Should be one of
	 * <code>AddressType2Code</code> instances.
	 */
	@Column(name = "ADDRESS_TYPE", length = 4)
	@Size(min = 1, max = 4)
	private String addressType;

	/**
	 * Identification of a division of a large organisation or building.
	 */
	@Column(name = "DEPARTMENT", length = 70)
	@Size(min = 1, max = 70)
	private String department;

	/**
	 * Identification of a sub-division of a large organisation or building.
	 */
	@Column(name = "SUB_DEPARTMENT", length = 70)
	@Size(min = 1, max = 70)
	private String subDepartment;

	/**
	 * Name of a street or thoroughfare.
	 */
	@Column(name = "STREET_NAME", length = 70)
	@Size(min = 1, max = 70)
	private String streetName;

	/**
	 * Number that identifies the position of a building on a street.
	 */
	@Column(name = "BUILDING_NUMBER", length = 16)
	@Size(min = 1, max = 16)
	private String buildingNumber;

	/**
	 * Identifier consisting of a group of letters and/or numbers that is added
	 * to a postal address to assist the sorting of mail.
	 */
	@Column(name = "POST_CODE", length = 16)
	@Size(min = 1, max = 16)
	private String postCode;

	/**
	 * Name of a built-up area, with defined boundaries, and a local government.
	 */
	@Column(name = "TOWN_NAME", length = 35)
	@Size(min = 1, max = 35)
	private String townName;

	/**
	 * Identifies a subdivision of a country such as state, region, county.
	 */
	@Column(name = "COUNTRY_SUB_DIVISION", length = 35)
	@Size(min = 1, max = 35)
	private String countrySubDivision;

	/**
	 * Nation with its own government.
	 */
	@Column(name = "COUNTRY", length = 2)
	@Pattern(regexp = "[A-Z]{2,2}")
	private String country;

	/**
	 * Line 1 of Information that locates and identifies a specific address, as
	 * defined by postal services, presented in free format text.
	 */
	@Column(name = "ADDRESS_LINE1", length = 70)
	@Size(min = 1, max = 70)
	private String addressLine1;

	/**
	 * Line 2 of Information that locates and identifies a specific address, as
	 * defined by postal services, presented in free format text.
	 */
	@Column(name = "ADDRESS_LINE2", length = 70)
	@Size(min = 1, max = 70)
	private String addressLine2;
	
	
	/**
	 * Line 3 of Information that locates and identifies a specific address, as
	 * defined by postal services, presented in free format text.
	 */
	@Column(name = "ADDRESS_LINE3", length = 70)
	@Size(min = 1, max = 70)
	private String addressLine3;
	
	/**
	 * Line 4 of Information that locates and identifies a specific address, as
	 * defined by postal services, presented in free format text.
	 */
	@Column(name = "ADDRESS_LINE4", length = 70)
	@Size(min = 1, max = 70)
	private String addressLine4;
	
	/**
	 * Line 5 of Information that locates and identifies a specific address, as
	 * defined by postal services, presented in free format text.
	 */
	@Column(name = "ADDRESS_LINE5", length = 70)
	@Size(min = 1, max = 70)
	private String addressLine5;
	
	/**
	 * Line 6 of Information that locates and identifies a specific address, as
	 * defined by postal services, presented in free format text.
	 */
	@Column(name = "ADDRESS_LINE6", length = 70)
	@Size(min = 1, max = 70)
	private String addressLine6;
	
	/**
	 * Line 7 of Information that locates and identifies a specific address, as
	 * defined by postal services, presented in free format text.
	 */
	@Column(name = "ADDRESS_LINE7", length = 70)
	@Size(min = 1, max = 70)
	private String addressLine7;

	public Long getPostalAddress6Id() {
		return postalAddress6Id;
	}

	public void setPostalAddress6Id(Long postalAddress6Id) {
		this.postalAddress6Id = postalAddress6Id;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSubDepartment() {
		return subDepartment;
	}

	public void setSubDepartment(String subDepartment) {
		this.subDepartment = subDepartment;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getTownName() {
		return townName;
	}

	public void setTownName(String townName) {
		this.townName = townName;
	}

	public String getCountrySubDivision() {
		return countrySubDivision;
	}

	public void setCountrySubDivision(String countrySubDivision) {
		this.countrySubDivision = countrySubDivision;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getAddressLine4() {
		return addressLine4;
	}

	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}

	public String getAddressLine5() {
		return addressLine5;
	}

	public void setAddressLine5(String addressLine5) {
		this.addressLine5 = addressLine5;
	}

	public String getAddressLine6() {
		return addressLine6;
	}

	public void setAddressLine6(String addressLine6) {
		this.addressLine6 = addressLine6;
	}

	public String getAddressLine7() {
		return addressLine7;
	}

	public void setAddressLine7(String addressLine7) {
		this.addressLine7 = addressLine7;
	}
}
