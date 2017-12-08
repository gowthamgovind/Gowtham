package com.mcis.store.stock;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="item_tbl")
public class Item {
	@Id
	@GeneratedValue
	@Column(name="item_id",nullable=false,length=11)
	private Integer id;
	@Column(name="name",unique=true,nullable=false,length=20)
	private String name;
	@Column(name="price",nullable=false)
	private Double price;
	@Column(name="qty",nullable=false,length=11)
	private Integer quantity;
	@Column(name="exp_date",nullable=false)
	private Date expiryDate;
	public Item()
	{
		super();
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

}

