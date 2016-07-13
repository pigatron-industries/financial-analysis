package com.pigatron.finance.client;

import org.springframework.web.client.RestTemplate;

public abstract class AbstractApiClient implements DataApiClient {

    protected RestTemplate restTemplate;

    protected AbstractApiClient() {
        restTemplate = new RestTemplate();
    }

}
