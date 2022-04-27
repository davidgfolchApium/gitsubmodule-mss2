package com.apiumhub.articles.gitsubmodules.controller;

import com.apiumhub.articles.gitsubmodules.api.client.ApiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final ApiClient apiClient;

    @GetMapping
    public String callMss2() {
        return apiClient.get("http://localhost:8081/", String.class);
    }

}
