package com.be.netflix.data.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GenreController {
    @GetMapping(value="/genre")
    private String getGenre(){
        String seriesUrl = "https://streaming-availability.p.rapidapi.com/genres";

        HttpHeaders headers = new HttpHeaders();
        headers.add("x-rapidapi-host", "streaming-availability.p.rapidapi.com");
        headers.add("x-rapidapi-key", "f4bb25fad4mshd060cc1d877c8f2p1bc525jsn89de5522868a");
        headers.add("Access-Control-Allow-Origin", "*");
        header.add("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE");
        header.add("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization, X-Request-With");
        HttpEntity request = new HttpEntity(headers);

        ResponseEntity<String> response = new RestTemplate().exchange(seriesUrl, HttpMethod.GET, request, String.class);

        String json = response.getBody();

        return json;
    }
}
