package com.turleylabs.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

// http://private-23ab26-numberservice.apiary-mock.com
// {
//    "number": "1"
//}
public class FizzBuzzControllerTest {

   @Test
   public void returnsOneForOne() {
       RestTemplate restTemplateMock = mock(RestTemplate.class);
       when(restTemplateMock.getForObject(anyString(), eq(String.class)))
               .thenReturn("{ \"number\": \"1\" }");
       FizzBuzzController fizzBuzzController = new FizzBuzzController(restTemplateMock);

       String result = fizzBuzzController.fizzBuzz();

       assertEquals("{ \"result\": \"1\" }", result);
   }

   @Test
   public void returnsTwoForTwo() {
       RestTemplate restTemplateMock = mock(RestTemplate.class);
       when(restTemplateMock.getForObject(anyString(), eq(String.class)))
               .thenReturn("{ \"number\": \"2\" }");
       FizzBuzzController fizzBuzzController = new FizzBuzzController(restTemplateMock);

       String result = fizzBuzzController.fizzBuzz();

       assertEquals("{ \"result\": \"2\" }", result);
   }

   @Test
   public void returnsFizzForThree() {
       RestTemplate restTemplateMock = mock(RestTemplate.class);
       when(restTemplateMock.getForObject(anyString(), eq(String.class)))
               .thenReturn("{ \"number\": \"3\" }");
       FizzBuzzController fizzBuzzController = new FizzBuzzController(restTemplateMock);

       String result = fizzBuzzController.fizzBuzz();

       assertEquals("{ \"result\": \"Fizz\" }", result);
   }

   @Test
   public void returnsFizzForSix() {
       RestTemplate restTemplateMock = mock(RestTemplate.class);
       when(restTemplateMock.getForObject(anyString(), eq(String.class)))
               .thenReturn("{ \"number\": \"6\" }");
       FizzBuzzController fizzBuzzController = new FizzBuzzController(restTemplateMock);

       String result = fizzBuzzController.fizzBuzz();

       assertEquals("{ \"result\": \"Fizz\" }", result);
   }

   @Test
   public void returnsBuzzForFive() {
       RestTemplate restTemplateMock = mock(RestTemplate.class);
       when(restTemplateMock.getForObject(anyString(), eq(String.class)))
               .thenReturn("{ \"number\": \"5\" }");
       FizzBuzzController fizzBuzzController = new FizzBuzzController(restTemplateMock);

       String result = fizzBuzzController.fizzBuzz();

       assertEquals("{ \"result\": \"Buzz\" }", result);
   }

   @Test
   public void returnsFizzBuzzForFifteen() {
       RestTemplate restTemplateMock = mock(RestTemplate.class);
       when(restTemplateMock.getForObject(anyString(), eq(String.class)))
               .thenReturn("{ \"number\": \"15\" }");
       FizzBuzzController fizzBuzzController = new FizzBuzzController(restTemplateMock);

       String result = fizzBuzzController.fizzBuzz();

       assertEquals("{ \"result\": \"FizzBuzz\" }", result);
   }

   @Test
   public void restAnnotationsAreSetup() {
       RestController restControllerAnnotation = FizzBuzzController.class.getAnnotation(RestController.class);
       assertNotNull(restControllerAnnotation);

       RequestMapping mappingAnnotation = FizzBuzzController.class.getAnnotation(RequestMapping.class);
       assertNotNull(mappingAnnotation);
       assertEquals("api", mappingAnnotation.value()[0]);
   }
}

