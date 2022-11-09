package com.kelderos.string_controller;

import com.kelderos.requests.ConcatenationRequest;
import com.kelderos.requests.RepeatRequest;
import com.kelderos.service.StringService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final StringService service;
    @PostMapping("/concatenate")
    public String concatenate(@RequestBody ConcatenationRequest concatenationRequest)
    {
        return service.concatenate(concatenationRequest.getString1(),concatenationRequest.getString2());
    }
    @PostMapping("/repeat")
    public String repeatString(@RequestBody RepeatRequest repeatRequest)
    {
        return service.repeatString(repeatRequest.getString(),repeatRequest.getCount());
    }
}
