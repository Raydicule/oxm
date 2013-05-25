package com.evolvus.training.oxm.domain;

/**
 * Identifies the nature of the postal address.
 * 
 * @author Anish
 * 
 */
public enum AddressType2Code {
	ADDR("ADDR", "Postal", "Address is the complete postal address."), BIZZ(
			"BIZZ", "Business", "Address is the business address."), DLVY(
			"DLVY", "DeliveryTo",
			"Address is the address to which delivery is to take place."), HOME(
			"HOME", "Residential", "Address is the home address."), MLTO(
			"MLTO", "MailTo", "Address is the address to which mail is sent."), PBOX(
			"PBOX", "POBox", "POBox");

	/**
	 * Code specified by the ISO20022 format.
	 */
	private String code;

	/**
	 * User friendly name of the code.
	 */
	private String name;

	/**
	 * Definition of the code
	 */
	private String definition;

	/**
	 * Private constructor for the <code>AddressType2Code</code>.
	 * 
	 * @param code
	 *            ISO 20022 code used in the message.
	 * @param name
	 *            User friendly name of the code.
	 * @param definition
	 *            Definition of the code.
	 */
	private AddressType2Code(String code, String name, String definition) {
		this.code = code;
		this.name = name;
		this.definition = definition;
	}

	@Override
	public String toString() {
		return code;
	}

	/**
	 * Getter method for the name.
	 * 
	 * @return User friendly name of the <code>AddressType2Code</code>.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter method for the definition.
	 * 
	 * @return Definition of the <code>AddressType2Code</code>.
	 */
	public String getDefinition() {
		return definition;
	}
}
