package com.project.smart_inventory.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthorizationException extends RuntimeException {
  
  public static final Logger LOGGER = LoggerFactory.getLogger(AuthorizationException.class);

  public AuthorizationException(String message) {
    super(message);
    LOGGER.error("Authorization Exception", this);
  }
  
}
