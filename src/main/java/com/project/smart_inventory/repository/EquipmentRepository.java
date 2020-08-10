package com.project.smart_inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.smart_inventory.model.Equipment;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, String>{

}
