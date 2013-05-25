package com.evolvus.training.oxm.domain;

/**
 * Specifies the terms used to formally address a person.
 * 
 * @author Anish
 * 
 */
public enum NamePrefix1Code {
	DOCT("DOCT", "Doctor"), MIST("MIST","Mister"), MISS("MISS","Miss"), MADM("MADM", "Madam");

	/**
	 * Code specified by the ISO20022 format.
	 */
	private String code;
	
	/**
	 * User friendly description of the code.
	 */
	private String value;

	
	private NamePrefix1Code(String code, String value) {
		this.code = code;
		this.value = value;
	}

	@Override
	public String toString() {
		return code;
	}
	
	public String getValue() {
		return value;
	}
}
