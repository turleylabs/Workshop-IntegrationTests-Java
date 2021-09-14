
# Stubbing
```java
wireMockServer.stubFor(get(urlEqualTo("/some/thing"))
            .willReturn(aResponse()
                .withHeader("Content-Type", "text/plain")
                .withBody("Hello world!")));
```

# Verifying
```java
wireMockServer.verify(postRequestedFor(urlPathEqualTo("/verify/this"))
        .withRequestBody(equalToJson("{ \"foo\": \"bar\" }")));
```

For more matching tips go to http://wiremock.org/docs/request-matching/
