/**
 * 
 */
package com.project.smart_inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.project.smart_inventory.model.User;


/**
 * @author 212758632
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  
  User findByEmail(@Param("email") String email);

}
