package com.ott.recommend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Value("${test.bestottinfo}")
    private String testBestOTTInfo;

    @GetMapping("bestott/{id}")
    public String getMember(@PathVariable String id) {
        log.info("### Received: {}", id);

        String msg = id + " => " + testBestOTTInfo;
        log.info("### Sent: {}", msg);
        return msg;
    }
}
