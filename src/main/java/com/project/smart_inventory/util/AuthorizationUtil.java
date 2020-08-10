package com.project.smart_inventory.util;

import java.util.Arrays;
import java.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.project.smart_inventory.exception.AuthorizationException;
import com.project.smart_inventory.model.User;
import com.project.smart_inventory.repository.UserRepository;

@Component
public class AuthorizationUtil {

  @Autowired
  private UserRepository userRepo;

  public User getUserDetails(String auth) {

    Base64.Decoder dec = Base64.getDecoder();
    String encodedString = auth.replace("Basic ", "");
    String decoded = new String(dec.decode(encodedString));
    String[] userPass = decoded.split(":");
    User userDetails;

    User user = userRepo.findByEmail(userPass[0]);
    if (null != user && Arrays.equals(userPass[1].toCharArray(), user.getPassword())) {
      userDetails = user;
      userDetails.setPassword(null);
    } else
      throw new AuthorizationException("Invalid Credentials");

    return userDetails;

  }

}
