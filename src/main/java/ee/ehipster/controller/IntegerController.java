package ee.ehipster.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by eriti on 03.11.2016.
 */
@RestController
@RequestMapping("/api")
public class IntegerController {
  @RequestMapping("ping")
  public String ping() {
    return "Hello World";
  }
}
