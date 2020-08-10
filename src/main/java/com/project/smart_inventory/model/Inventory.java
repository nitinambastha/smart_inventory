package com.project.smart_inventory.model;

import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="t_inventory")
public class Inventory {

  @Id
  @Column(name="serial_id")
  private String serialId;

  @Column(name="location")
  private String location;
  
  @Column(name="tech")
  private String tech;
  
  @Column(name="component")
  private String component;
  
  @Column(name="Repair_cycle")
  private String repairCycle;
  
  @Column(name="plant_id")
  Integer plantId;
  
  @Column(name="FFH")
  Integer ffh;
  
  @Column(name="updated_on")
  Date updatedOn;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "plant_id", insertable = false, updatable = false)
  Plant plant;
  
  @JsonIgnore
  public Plant getPlant() {
    return plant;
  }

  public void setPlant(Plant plant) {
    this.plant = plant;
  }

  
  public Integer getPlantId() {
    return plantId;
  }

  public void setPlantId(Integer plantId) {
    this.plantId = plantId;
  }

  public String getSerialId() {
    return serialId;
  }

  public void setSerialId(String serialId) {
    this.serialId = serialId;
  }


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getTech() {
    return tech;
  }

  public void setTech(String tech) {
    this.tech = tech;
  }

  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }

  public String getRepairCycle() {
    return repairCycle;
  }

  public void setRepairCycle(String repairCycle) {
    this.repairCycle = repairCycle;
  }

  public Integer getFfh() {
    return ffh;
  }

  public void setFfh(Integer ffh) {
    this.ffh = ffh;
  }

  public Date getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(Date updatedOn) {
    this.updatedOn = updatedOn;
  }

  
  
  
}
