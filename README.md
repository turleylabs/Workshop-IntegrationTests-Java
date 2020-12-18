# Subscription Renewal

## Goal

You are tasked to write a program that will email subscribers that are within three months of their subscription expiring with the message "Please renew your subscription."

## Instructions
Design a solution that leverages the concept of Logical Core, Collaborative Shell to successfully notify these customers that they need to renew their subscriptions. The two APIs that you will interact with are provided below. Maintain a proper separation in your design so that the logic can be tested with unit tests, and API collaboration can be tested with integration tests. Use the WireMock library to stand-in for the APIs during your integration tests.

## APIs

### Retrieve Subscribers
**URL**: `http://example.domain/subscribers`

**Method**: `GET`

**Sample Response**
```json
[
  { "name": "", "email": "", "expirationDate":  "2050-01-15" },
  { "name": "", "email": "", "expirationDate":  "2050-03-27" }
]
```

### Send Email

**URL**: `http://example.domain/mail`

**Method**: `POST`

**Sample Request Payload**
```json
{
  "subject": "An Important Message",
  "body": "Please renew your subscription", 
  "to": ["someone@email.com", "another@domain.com"], 
  "from": "sales@example.com"
}
```
