/**
 * 
 */
package com.project.smart_inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * @author 212758632
 *
 */
@Entity
@Table(name = "t_user")
@NamedQuery(name = "User.findByEmail", query ="select u from User u where u.email= :email")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class User {
  
  @Id
  @Column(name = "user_id")
  private String userId;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "email")
  private String email;
  
  @Column(name = "type")
  private String type;
  
  @Column(name = "password")
  private char[] password;
  
  @Column(name = "userCreatedOn")
  private String userCreatedOn;
  
  private String userUpdatedOn;
  
  /**
   * @return the userId
   */
  public String getUserId() {
    return userId;
  }
  /**
   * @param userId the userId to set
   */
  public void setUserId(String userId) {
    this.userId = userId;
  }
  /**
   * @return the name
   */
  public String getName() {
    return name;
  }
  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }
  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }
  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }
  /**
   * @return the type
   */
  public String getType() {
    return type;
  }
  /**
   * @param type the type to set
   */
  public void setType(String type) {
    this.type = type;
  }
  /**
   * @return the password
   */
  public char[] getPassword() {
    return password;
  }
  /**
   * @param password the password to set
   */
  public void setPassword(char[] password) {
    this.password = password;
  }
  /**
   * @return the userCreatedOn
   */
  public String getUserCreatedOn() {
    return userCreatedOn;
  }
  /**
   * @param userCreatedOn the userCreatedOn to set
   */
  public void setUserCreatedOn(String userCreatedOn) {
    this.userCreatedOn = userCreatedOn;
  }
  /**
   * @return the userUpdatedOn
   */
  public String getUserUpdatedOn() {
    return userUpdatedOn;
  }
  /**
   * @param userUpdatedOn the userUpdatedOn to set
   */
  public void setUserUpdatedOn(String userUpdatedOn) {
    this.userUpdatedOn = userUpdatedOn;
  }
  
  

}
