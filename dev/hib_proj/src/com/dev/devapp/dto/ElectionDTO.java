package com.dev.devapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="election_table")
public class ElectionDTO implements Serializable
{
	
	@Id
	@GenericGenerator(name="ref",strategy="increment")
	@GeneratedValue(generator="ref")
	@Column(name="election_id")
	private int id;
	@Column(name="party_name")
	private String partyName;
	@Column(name="candidate_name")
	private String candidateName;
	@Column(name="area")
	private String area;
	
	public ElectionDTO() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "ElectionDTO [id=" + id + ", partyName=" + partyName + ", candidateName=" + candidateName + ", area="
				+ area + "]";
	}


	

}
