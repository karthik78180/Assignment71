package com.karthik.hibernate.Assignment71;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "FLOWER")
@Data
public class Flower {

	//public FlowerShop name;
	
	@Id
	@Column(name = "FID", nullable=false)
	private String flowerId;
	
	@Column(name = "FLOWERTYPE", nullable=false)
	private String flowerType;
	
	@Column(name = "WEEKLYSALES", nullable=false)
	private String weeklySales;
		
}
