package com.evolvus.training.oxm.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "FLX_PI43")
public class PartyIdentification43 implements Serializable {

	private static final long serialVersionUID = 6364183646543882699L;

	/**
	 * Internal identifier of the <code>PartyIdentification43</code> entity.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "pi43_seq")
	@SequenceGenerator(name = "pi43_seq", sequenceName = "FLX_PI43_SEQ")
	@Column(name = "PI43_ID")
	private Long partyIdentification43Id;

	/**
	 * Name of the party.
	 */
	@Column(name = "NAME", length = 140)
	private String nm;

	/**
	 * Postal Address of the party.
	 */
	@OneToOne
    @JoinColumn(name = "PSTL_ADR_ID", nullable = true)
	private PostalAddress6 pstlAdr;

	private String id;
	
	/**
	 * Country of Residence of the party.
	 */
	@Column(name = "CTRY_OF_RES", length = 10)
	private String ctryOfRes;
	
	/**
	 * Contact details
	 *  of the party.
	 */
	@OneToOne
    @JoinColumn(name = "CTCT_DTLS_ID", nullable = true)
	private ContactDetails2 ctctDtls;
}
