package com.qsp.hibernate_crud_native_query_project;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;


@Entity 
//@NamedQuery(name="Product.findAll",
//query="select p from product p"
//)

//@NamedQuery(name="Product.findProductById",
//query="select p from product p where p.pid=:pid"
//)

@NamedNativeQuery(name="product.findAll",
query="select * from product",
resultClass =Product.class
)
public class Product {
	
	@Id
	private int pid;
	private String pname;
	private double price;
	private int quantity;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
