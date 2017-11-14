package org.dummy.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_details")
public class Emp {

	public Emp(int empid, long phno, String name, String emailid) {
		this.empid = empid;
		this.emailid = emailid;
		this.phno = phno;
		this.name = name;
	}

	@Id
	@GeneratedValue
	private int empid;
	@Column(name = "name", length = 150, nullable = false)
	private long phno;
	@Column(name = "phone")
	private String name;
	private String emailid;
	@Column(name = "EID")
	private double houseRentAllowance;
	@Column(name = "HRA")
	private float netSalary;
	@Column(name = "NS")
	private double basicSalary;
	@Column(name = "BS")
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public double getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(double houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public float getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(float netSalary) {
		this.netSalary = netSalary;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

}
