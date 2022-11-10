package com.java.springboot.test.springbootbackend.model;

import javax.persistence.*;
@Entity
@Table(name = "angelhelper")
public class AngelUser{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id")
    private String emailId;
    
    @Column(name = "contact")
	private Long contact;
    @Column(name = "address")
	private String address;
    @Column(name = "pincode")
   	private Long pincode;
    @Column(name = "area_of_interest")
	private String areaofinterest;
    public AngelUser() 
    {
    	  
    }
 
    public AngelUser(String firstName, String lastName, String emailId ,long contact,String address,long pincode, String areaofinterest) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.contact=contact;
        this.address=address;
        this.pincode=pincode;
        this.areaofinterest=areaofinterest;
    }
 
    @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public long getId() {
      return id;
   }
    public void setId(long id) {
    	
        this.id = id;
    }
 
    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "email_address", nullable = false)
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public long getcontact() {
		return contact;
	}

	public void setcontact(Long contact) {
		this.contact = contact;
	}
	 @Column(name = "address", nullable = false)
	    public String getAddress() {
	        return address;
	    }
	    public void setAddress(String address) {
	        this.address = address;
	    }
	    public long getPincode() {
			return pincode;
		}

		public void setPincode(Long Pincode) {
			this.pincode= Pincode;
		}
		@Column(name = "area_of_interest", nullable = false)
	    public String getinterestarea() {
	        return address;
	    }
	    public void setinterestarea(String interestarea) {
	        this.areaofinterest = interestarea;
	    }

    @Override
    public String toString() {
        return "angel [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
    + ",contact="+ contact +"address="+address+",pincode="+pincode+",areaofinterest="+areaofinterest+"]";
    }
	
}
