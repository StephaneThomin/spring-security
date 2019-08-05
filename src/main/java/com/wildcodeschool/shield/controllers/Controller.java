package com.wildcodeschool.shield.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
  
  @GetMapping("/")
  public String welcome() {
    return "Welcome to the SHIELD";
  }

  @GetMapping("/avengers/assemble")
  public String avengers() {
    return "Avengers...Assemble";
  }

  @GetMapping("/secret-bases")
  public String secret() {
    return "Berlin, Biarritz, Bordeaux, Bruxelles, Bucarest, La Loupe, Lille, Lisbonne, Londres, Lyon, Madrid, Marseille, Nantes, Orléans, Paris, Reims, Starsbourg, Toulouse, Tours";
  }
}