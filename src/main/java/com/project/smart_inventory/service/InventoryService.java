package com.project.smart_inventory.service;

import java.util.List;
import java.util.Optional;
import com.project.smart_inventory.model.Equipment;
import com.project.smart_inventory.model.Inventory;
import com.project.smart_inventory.model.Plant;

public interface InventoryService {

  void checkConnection();

  Optional<Plant> getPlantbyId(Integer plantId);

  List<Inventory> saveInventory(List<Inventory> inventory);

  List<Equipment> saveEquipment(List<Equipment> equipment);

}
