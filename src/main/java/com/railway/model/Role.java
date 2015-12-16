package com.railway.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Администратор on 31.10.2015.
 */

@Entity
@Table(name="roles")
public class Role implements Serializable {
    @Id
   // @GeneratedValue
    private String username;

    private String role;

  //  @OneToMany( mappedBy = "role")
 //   private Set<User> userRoles;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


  //  public Set<User> getUserRoles() {
  //      return userRoles;
   // }

   // public void setUserRoles(Set userRoles) {
  //      this.userRoles = userRoles;
  //  }
}
