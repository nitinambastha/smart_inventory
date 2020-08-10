package com.project.smart_inventory.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.project.smart_inventory.exception.AuthorizationException;
import com.project.smart_inventory.model.Equipment;
import com.project.smart_inventory.model.Inventory;
import com.project.smart_inventory.model.Plant;
import com.project.smart_inventory.model.User;
import com.project.smart_inventory.repository.UserRepository;
import com.project.smart_inventory.service.InventoryService;
import com.project.smart_inventory.util.AuthorizationUtil;

@RestController
@RequestMapping("/v1")
public class InventoryController {

  
  @Autowired
  UserRepository userRepository;
  @Autowired
  InventoryService inventoryService;
  
  @Autowired
  private AuthorizationUtil authUtil;
  
  @GetMapping("/hello")
  String checkAPi() {
    return "HEllo";
  }
  
  @PostMapping("/user")
  public User createUser(@RequestBody User user) {
    return userRepository.save(user);
  }
  
  @GetMapping("/user/{id}")
  public User getUser(@RequestParam("id") Long id) {
    return userRepository.findById(id).get();
  }
  
  @GetMapping("/check")
  public String checkConncetion() {
    inventoryService.checkConnection();
    return "Success";
  }
  
  @GetMapping("/login")
  public ResponseEntity<User> ping(@RequestHeader(value = "Authorization") String auth) {
    try {
      return ResponseEntity.of(Optional.of(authUtil.getUserDetails(auth)));
    } catch (AuthorizationException e) {
      throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, e.getMessage(), e);
    }
  }
  
  @GetMapping("/getplantDetails")
  public ResponseEntity<Plant> getPlantDetails(@RequestParam("plantId") Integer plantId) {
    Optional<Plant> plantbyId = inventoryService.getPlantbyId(plantId);
    if(plantbyId.isPresent()) {
      return new ResponseEntity<>(plantbyId.get(),HttpStatus.OK);
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
  
  @PostMapping("/equipment")
  public ResponseEntity<List<Equipment>> saveEquipment(@RequestBody List<Equipment> equipment) {
    return new ResponseEntity<>(inventoryService.saveEquipment(equipment),HttpStatus.OK);
  }
  
  @PostMapping("/inventory")
  public ResponseEntity<List<Inventory>> saveInventory(@RequestBody List<Inventory> inventory) {
    return new ResponseEntity<>(inventoryService.saveInventory(inventory),HttpStatus.OK);
  }
}
