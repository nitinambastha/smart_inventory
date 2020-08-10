package com.project.smart_inventory.service.impl;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.smart_inventory.model.Equipment;
import com.project.smart_inventory.model.Inventory;
import com.project.smart_inventory.model.Plant;
import com.project.smart_inventory.repository.EquipmentRepository;
import com.project.smart_inventory.repository.InventoryRepository;
import com.project.smart_inventory.repository.PlantRepository;
import com.project.smart_inventory.service.InventoryService;

@Transactional
@Service
public class InventoryServiceImpl implements InventoryService{

  
  @Autowired
  PlantRepository plantRepository;
  
  @Autowired
  EquipmentRepository equipmentRepository;
  
  @Autowired
  InventoryRepository inventoryRepository;
  
  @Override
  public  void checkConnection() {
    List<Plant> plantList = plantRepository.findAll();
    List<Equipment> equipmentList = equipmentRepository.findAll();
    List<Inventory> InventoryList = inventoryRepository.findAll();
    System.out.println("Details: "+plantList+equipmentList+InventoryList);
  }
  
  @Override
  public Optional<Plant> getPlantbyId(Integer plantId) {
    return plantRepository.findById(plantId);
  }
  
  @Override
  public List<Equipment> saveEquipment(List<Equipment> equipment) {
    return equipmentRepository.saveAll(equipment);
  }
  
  @Override
  public List<Inventory> saveInventory(List<Inventory> inventory) {
    return inventoryRepository.saveAll(inventory);
  }
}
