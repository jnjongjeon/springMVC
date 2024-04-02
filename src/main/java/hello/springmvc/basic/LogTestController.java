package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogTestController {

    @GetMapping("/log-test")
    public String logTest() {
        String name = "spring";

        log.info("info log={}", name);
        return "ok";
    }
}
