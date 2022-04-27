package com.apiumhub.articles.gitsubmodules;

import com.apiumhub.articles.gitsubmodules.api.client.ApiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(produces = APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class Controller {

    private static final String MSS1_SERVER = "http://localhost:8081";

    private final ApiClient apiClient;

    @GetMapping("/bank/info")
    public String bankInfo() {
        return " {" +
                "  \"name\": \"User bank\"," +
                "  \"accounts\": []" +
                "}";
    }

    @GetMapping("/user/info")
    public String callMss1() {
        return apiClient.get(MSS1_SERVER + "/user/info", String.class);
    }

    @GetMapping("/api/client/exception")
    public String apiClientException() {
        return apiClient.get(MSS1_SERVER + "/non/existent", String.class);
    }

}
