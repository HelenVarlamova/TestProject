package com.railway.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Past;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Администратор on 24.10.2015.
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long userl_id;

    @Column(name = "username")
    private String username;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;


    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String last_name;

    @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    @Column(name = "birth_date")
    private Date birth_date;

   /* @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="role_id")
    private Role role;*/


    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Date getBirth_date() {
        return birth_date;
    }
    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public User() {
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getUserl_id() {
        return userl_id;
    }

    public void setUserl_id(Long userl_id) {
        this.userl_id = userl_id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
