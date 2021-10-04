package com.be.netflix.data.controller;

import com.be.netflix.NetflixApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {


    private static final Logger log = LoggerFactory.getLogger(NetflixApplication.class);

    @GetMapping(value="/movie")
    private String getMovies(){
			String movieUrl = "https://streaming-availability.p.rapidapi.com/search/basic?country=us&service=netflix&type=movie&genre=18&page=1&language=en";

			HttpHeaders headers = new HttpHeaders();
			headers.add("x-rapidapi-host", "streaming-availability.p.rapidapi.com");
			headers.add("x-rapidapi-key", "f4bb25fad4mshd060cc1d877c8f2p1bc525jsn89de5522868a");

			HttpEntity request = new HttpEntity(headers);

			ResponseEntity<String> response = new RestTemplate().exchange(movieUrl, HttpMethod.GET, request, String.class);

			String json = response.getBody();

			log.info(json);
			return json;
    }


}
