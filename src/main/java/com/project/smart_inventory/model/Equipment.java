package com.project.smart_inventory.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="t_equipment")
public class Equipment {

  @Id
  @Column(name="equipment_id")
  private String equipmentId;
  
  @Column(name="tech")
  private String tech;
  
  @Column(name="total_hour")
  private Integer totalHour;
  
  @Column(name="total_start")
  private Integer totalStart;
  
  @Column(name="fired_hour")
  private Integer firedHour;
  
  @Column(name="fired_start")
  private Integer firedStart;
  
  @Column(name="updated_on")
  private Date updatedOn;
  
  @Column(name="plant_id")
  private Integer plantId;
  
  @ManyToOne
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

  public String getEquipmentId() {
    return equipmentId;
  }

  public void setEquipmentId(String equipmentId) {
    this.equipmentId = equipmentId;
  }

  public String getTech() {
    return tech;
  }

  public void setTech(String tech) {
    this.tech = tech;
  }

  public Integer getTotalHour() {
    return totalHour;
  }

  public void setTotalHour(Integer totalHour) {
    this.totalHour = totalHour;
  }

  public Integer getTotalStart() {
    return totalStart;
  }

  public void setTotalStart(Integer totalStart) {
    this.totalStart = totalStart;
  }

  public Integer getFiredHour() {
    return firedHour;
  }

  public void setFiredHour(Integer firedHour) {
    this.firedHour = firedHour;
  }

  public Integer getFiredStart() {
    return firedStart;
  }

  public void setFiredStart(Integer firedStart) {
    this.firedStart = firedStart;
  }

  public Date getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(Date updatedOn) {
    this.updatedOn = updatedOn;
  }
  
  
  
}
