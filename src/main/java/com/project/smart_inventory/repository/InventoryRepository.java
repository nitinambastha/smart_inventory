package com.project.smart_inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.smart_inventory.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, String>{

}
