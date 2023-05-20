package com.pporzuczek.web.rooms.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Account {
    @GeneratedValue
    @Id
    private Long id;
    
    @NotNull
    @Size(min = 3, max = 100, message = "Username must have at least 3 characters.")
    private String userName;
    
    @NotNull
    @Size(min = 3, max = 100, message = "Password must have at least 3 characters.")
    private String password;
    
    @Transient
    private String confirmPassword;
    
    @Email(message = "Email address is not valid.")
    @NotNull
    private String email;
    
    private String token;
    
    private String role = "ROLE_USER";
    
    private String firstName;
    
    private String lastName;
    
    private String address;
    
    private String companyName;
    
    private String lastLogin;
    
    @NotNull
    @ManyToOne
    private Organization organization;
    
    public Boolean isAdmin() {
        return this.role.equals("ROLE_ADMIN");
    }
    
    public Boolean isMatchingPasswords() {
        return this.password.equals(this.confirmPassword);
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Account(Long id, String userName, String password, String confirmPassword, String email, String token,
			String role, String firstName, String lastName, String address, String companyName, String lastLogin,
			Organization organization) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.email = email;
		this.token = token;
		this.role = role;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.companyName = companyName;
		this.lastLogin = lastLogin;
		this.organization = organization;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
