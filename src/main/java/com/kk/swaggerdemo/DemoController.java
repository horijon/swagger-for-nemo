package com.kk.swaggerdemo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
@Tag(name = "API to get allergy codes",
        description = "This API provides the capability to get allergy codes")
public class DemoController {
    @GetMapping
    @Operation(summary = "Select all allergy codes")
    public String getMeSomething() {
        return "Hello kshitij";
    }

    @PostMapping
    @Operation(summary = "Post all allergy codes")
    public ResponseEntity<?> postMeSomething(@RequestBody ResourceActivity resourceActivity) {
        return ResponseEntity.ok(resourceActivity);
    }
}
