package com.project.smart_inventory.model;

public enum UserType {

  MANAGER("MANAGER"), INSPECTOR("INSPECTOR"), CUSTOMER("CUSTOMER");

  String userType;

  UserType(String userType) {
    this.userType=userType;
  }

  public String getUserType() {
    return userType;
  }

}
