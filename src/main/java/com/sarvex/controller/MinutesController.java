package com.sarvex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Sarvex on 11/20/2015.
 */

@Controller
public class MinutesController {

  @RequestMapping(value = "/addMinutes")
  public String addMinutes() {
    return "addMinutes";
  }
}
