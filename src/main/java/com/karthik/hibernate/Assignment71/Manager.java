package com.karthik.hibernate.Assignment71;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "MANAGER")
@Embeddable
@Data
public class Manager {
	
	@Id
	@Column(name = "MID", nullable=false)
//	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String managerId;
	
	@Column(name = "MANAGERNAME", nullable=false)
	private String managerName;
	
}