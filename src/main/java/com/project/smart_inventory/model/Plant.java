package com.project.smart_inventory.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_plant")
public class Plant {

  @Id
  @Column(name="plant_id")
  private Integer plantId;
  
  @Column(name="plant_name")
  private String plantName;
  
  @Column(name="location")
  private String location;
  
  @Column(name="cust_id")
  private Integer custId;
  
  @Column(name="manager_id")
  private Integer managerId;
  
  @OneToMany(mappedBy = "plant", cascade = CascadeType.ALL)
  private List<Equipment> equipment;

  @OneToMany(mappedBy = "plant", cascade = CascadeType.ALL)
  private List<Inventory> inventory;
  
  public List<Inventory> getInventory() {
    return inventory;
  }

  public void setInventory(List<Inventory> inventory) {
    this.inventory = inventory;
  }

  public List<Equipment> getEquipment() {
    return equipment;
  }

  public void setEquipment(List<Equipment> equipment) {
    this.equipment = equipment;
  }

  public Integer getPlantId() {
    return plantId;
  }

  public void setPlantId(Integer plantId) {
    this.plantId = plantId;
  }

  public String getPlantName() {
    return plantName;
  }

  public void setPlantName(String plantName) {
    this.plantName = plantName;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Integer getCustId() {
    return custId;
  }

  public void setCustId(Integer custId) {
    this.custId = custId;
  }

  public Integer getManagerId() {
    return managerId;
  }

  public void setManagerId(Integer managerId) {
    this.managerId = managerId;
  }

  
    
}
