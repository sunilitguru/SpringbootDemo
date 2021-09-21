package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import com.sun.istack.NotNull;

@Entity
@Table(name="addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private long addressId;
    
    @NotNull
    @Column
	private String  addressDetails;
    
    @NotNull
    @Column
	private String landmark;
    
    @NotNull
    @Column
    private String city;
    
    @NotNull
    @Column
    private int pin;

    @ManyToOne
	@JoinColumn( name = "address", nullable = true)
	private User user ;
    
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(long addressId, String addressDetails, String landmark, String city, int pin) {
		super();
		this.addressId = addressId;
		this.addressDetails = addressDetails;
		this.landmark = landmark;
		this.city = city;
		this.pin = pin;
	}

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressDetails=" + addressDetails + ", landmark=" + landmark
				+ ", city=" + city + ", pin=" + pin + "]";
	}
    
    
}
