package com.zac.springboot.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ZacController {
  private static final String VIEW_FOLDER = "zac";
  private static final String VIEW_FILE = "index";

  @GetMapping(path = "/zac")
  String zac(LoginForm loginForm) throws Exception {
    loginForm.setErrHiddenFlg(true);
    return VIEW_FOLDER + "/" + VIEW_FILE;
  }
}
