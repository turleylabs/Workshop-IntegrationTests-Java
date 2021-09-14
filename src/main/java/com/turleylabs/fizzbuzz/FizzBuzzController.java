package com.turleylabs.fizzbuzz;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api")
public class FizzBuzzController {
   private RestTemplate restTemplate;

   public FizzBuzzController(RestTemplate restTemplate) {
       this.restTemplate = restTemplate;
   }

   public String fizzBuzz() {
       String json = this.restTemplate.getForObject("http://numberservice.com", String.class);
       JSONObject jsonObject = new JSONObject(json);
       String value = jsonObject.getString("number");
       int number = Integer.parseInt(value);
       String result = String.valueOf(number);

       if (number % 3 == 0 && number % 5 == 0) {
           result = "FizzBuzz";
       } else if (number % 3 == 0) {
           result = "Fizz";
       } else if(number % 5 == 0) {
           result = "Buzz";
       }
       return "{ \"result\": \"" + result + "\" }";
   }

}
