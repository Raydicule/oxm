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
 * Set of elements used to indicate how to contact the party.
 * 
 * @author Anish
 * 
 */

@Entity
@Table(name = "FLX_CONTACT_DETAILS2")
public class ContactDetails2 implements Serializable {

	private static final long serialVersionUID = 1662868774102944825L;

	/**
	 * Internal identifier of the <code>ContactDetails2</code> entity.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "contact_details2_seq")
	@SequenceGenerator(name = "contact_details2_seq", sequenceName = "FLX_CONTACT_DETAILS2_SEQ")
	@Column(name = "CONTACT_DETAILS2_ID")
	private Long contactDetails2Id;

	/**
	 * Specifies the terms used to formally address a person. Should be one of
	 * <code>NamePrefix1Code</code> codes.
	 */
	@Column(name = "NAME_PREFIX", length = 4)
	@Size(min = 1, max = 4)
	private String nmPrfx;

	/**
	 * Name by which a party is known and which is usually used to identify that
	 * party.
	 */
	@Column(name = "NAME", length = 140)
	@Size(min = 1, max = 140)
	private String nm;

	/**
	 * Collection of information that identifies a phone number, as defined by
	 * telecom services.
	 */
	@Column(name = "PHONE_NUMBER", length = 30)
	@Pattern(regexp = "\\+[0-9]{1,3}-[0-9()+\\-]{1,30}")
	private String phneNb;

	/**
	 * Collection of information that identifies a mobile phone number, as
	 * defined by telecom services.
	 */
	@Column(name = "MOBILE_NUMBER", length = 30)
	@Pattern(regexp = "\\+[0-9]{1,3}-[0-9()+\\-]{1,30}")
	private String mobNb;

	/**
	 * Collection of information that identifies a FAX number, as defined by
	 * telecom services.
	 */
	@Column(name = "FAX_NUMBER", length = 30)
	@Pattern(regexp = "\\+[0-9]{1,3}-[0-9()+\\-]{1,30}")
	private String faxNb;

	/**
	 * Address for electronic mail (e-mail).
	 */
	@Column(name = "EMAIL_ADDRESS", length = 2048)
	@Size(min = 1, max = 2048)
	private String emailAdr;

	/**
	 * Contact details in an other form.
	 */
	@Column(name = "OTHER", length = 35)
	@Size(min = 1, max = 35)
	private String othr;

	public Long getContactDetails2Id() {
		return contactDetails2Id;
	}

	public void setContactDetails2Id(Long contactDetails2Id) {
		this.contactDetails2Id = contactDetails2Id;
	}

	public String getNmPrfx() {
		return nmPrfx;
	}

	public void setNmPrfx(String nmPrfx) {
		this.nmPrfx = nmPrfx;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getPhneNb() {
		return phneNb;
	}

	public void setPhneNb(String phneNb) {
		this.phneNb = phneNb;
	}

	public String getMobNb() {
		return mobNb;
	}

	public void setMobNb(String mobNb) {
		this.mobNb = mobNb;
	}

	public String getFaxNb() {
		return faxNb;
	}

	public void setFaxNb(String faxNb) {
		this.faxNb = faxNb;
	}

	public String getEmailAdr() {
		return emailAdr;
	}

	public void setEmailAdr(String emailAdr) {
		this.emailAdr = emailAdr;
	}

	public String getOthr() {
		return othr;
	}

	public void setOthr(String othr) {
		this.othr = othr;
	}

}
