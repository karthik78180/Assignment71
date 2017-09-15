package com.karthik.hibernate.Assignment71;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "FLOWERSHOP")
@Data
public class FlowerShop {
	
	@Id
	@Column(name = "FSID", nullable=false)
//	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String flowerShopId;
	
	@Column(name = "SHOPNAME", nullable=false)
	private String flowerShopName;
//	private String typesOfFlowers;	
//	@JoinTable
//	  (
//	      name="FLOWER_TYPE",
//	      joinColumns={ @JoinColumn(name="EMP_ID", referencedColumnName="FSID") },
//	      inverseJoinColumns={ @JoinColumn(name="PHONE_ID", referencedColumnName="FID", unique=true) }
//	  )
	@OneToMany
	@CollectionTable(name="FLOWERSHOP_FLOWER")
	private List<Flower> flowers = new ArrayList<Flower>();
	
	@OneToMany
	@CollectionTable(name="FLOWERSHOP_SHOPMANAGERS")
	private List<Manager> managers = new ArrayList<Manager>();
}