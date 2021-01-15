package health.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author created by hsz 2021/1/14 18:29
 */
@RestController
@RequestMapping(value = "/health")
public class HealthController {
    @GetMapping("/index")
    public String index() {
        return "health ok!";
    }
 }
