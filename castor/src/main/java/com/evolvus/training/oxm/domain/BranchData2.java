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
import javax.validation.constraints.Size;

/**
 * Identifies a specific branch of a financial institution.
 * 
 * @author Anish
 * 
 */
@Entity
@Table(name = "FLX_BRANCH_DATA2")
public class BranchData2 implements Serializable {

	private static final long serialVersionUID = 8679210696201062700L;
	/**
	 * Internal identifier of the <code>BranchData2</code> entity.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "branch_data2_seq")
	@SequenceGenerator(name = "branch_data2_seq", sequenceName = "FLX_BRANCH_DATA2_SEQ")
	@Column(name = "BRANCH_DATA2_ID")
	private Long branchData2Id;

	/**
	 * Unique and unambiguous identification of a branch of a financial
	 * institution.
	 */
	@Column(name = "IDENTIFICATION", length = 35)
	@Size(min = 1, max = 35)
	private String identification;

	/**
	 * Name by which an agent is known and which is usually used to identify
	 * that agent.
	 */
	@Column(name = "NAME", length = 140)
	@Size(min = 1, max = 140)
	private String name;

	/**
	 * Information that locates and identifies a specific address, as defined by
	 * postal services.
	 */
	@OneToOne
	@JoinColumn(name = "PSTL_ADR_ID", nullable = true)
	private PostalAddress6 postalAddress;

	public Long getBranchData2Id() {
		return branchData2Id;
	}

	public void setBranchData2Id(Long branchData2Id) {
		this.branchData2Id = branchData2Id;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PostalAddress6 getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(PostalAddress6 postalAddress) {
		this.postalAddress = postalAddress;
	}

}
