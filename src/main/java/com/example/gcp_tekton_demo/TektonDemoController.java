package com.example.gcp_tekton_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TektonDemoController {

    @GetMapping
    public String getInfo(){
        return "GCP TekTon Demo !";
    }
}
