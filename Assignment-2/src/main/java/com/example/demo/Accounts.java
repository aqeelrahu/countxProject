package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Accounts {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    
    private String catagorey;
    private String balance;
    private String credit;
    private String currency;
    private String duedays;
    private String telephone;
    private String mobile;
    private String ntngst;
    private String price;
    private String address;
    private String city;
    private String country;
    private String email;
    private String password;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatagorey() {
		return catagorey;
	}

	public void setCatagorey(String catagorey) {
		this.catagorey = catagorey;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDuedays() {
		return duedays;
	}

	public void setDuedays(String duedays) {
		this.duedays = duedays;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNtngst() {
		return ntngst;
	}

	public void setNtngst(String ntngst) {
		this.ntngst = ntngst;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", catagorey=" + catagorey + ", balance=" + balance + ", credit="
				+ credit + ", currency=" + currency + ", duedays=" + duedays + ", telephone=" + telephone + ", mobile="
				+ mobile + ", ntngst=" + ntngst + ", price=" + price + ", address=" + address + ", city=" + city
				+ ", country=" + country + ", email=" + email + ", password=" + password + "]";
	}



}