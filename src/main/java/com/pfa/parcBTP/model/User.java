package com.pfa.parcBTP.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.NaturalId;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Inheritance(strategy =InheritanceType.JOINED)
@DiscriminatorColumn(name="role")
// @NamedQuery(name="user.findAll", query="SELECT u FROM user u")
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;


    @NotBlank
    @Size(min=3, max = 50)
    private String firstName;

    @NotBlank
    @Size(min=3, max = 50)
    private String lastName;


    @NotBlank
    @Size(min=3, max = 50)
    private String username;

    @NotBlank
    @Size(min=7, max = 20)
    private String phoneNumber;

    @NaturalId
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;


    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date dateOfBirth;

    @NotBlank
    @Size(min=6, max = 100)
    private String password;



    @ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;







    public User() {
    }

    public User(User users) {
        this.firstName = users.getFirstName();
        this.lastName = users.getLastName();
        this.username = users.getUsername();
        this.phoneNumber = users.getPhoneNumber();
        this.email = users.getEmail();
        this.dateOfBirth =users.getDateOfBirth();
        this.password = users.getPassword();
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
