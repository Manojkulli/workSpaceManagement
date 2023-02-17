package com.ty.workSpaceManagement.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Owner {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ownerId;
	private String ownerName;
	private String ownerEmail;
	private long ownerPhone;
	
}
