package com.turleylabs.subscription.renewal;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class RenewalNotificationServiceTest {

    WireMockServer wireMockServer = new WireMockServer(options().port(8001));

    @BeforeEach
    public void beforeEach() {
        wireMockServer.start();

    }

    @AfterEach
    public void afterEach() {
        wireMockServer.stop();
    }

    @Test
    public void renewalNotificationIntegration() throws IOException, InterruptedException {
        LocalDate currentDate = LocalDate.of(2049, 12, 1);
        /*
            TODO: #1
             Look at the README and note the response format that the Retrieve Subscribers service returns.
             Create a JSON array of 3 subscribers, give two of them an expiration date within 3 months of the date above.
             Give the third a date greater than 3 months.
         */
        String json = "";

        /*
            TODO: #2
                Create a WireMock stub for the subscribers service.
                Note the URL path and HTTP verb from the README.
                Use your json string as the body of the response.
         */

        /*
            TODO: #3
                Create a WireMock stub for the email service.
                Note the URL path and HTTP verb from the README.
                Set the body of the response to 'OK'.
         */

        RenewalNotificationService renewalNotificationService = new RenewalNotificationService();
        renewalNotificationService.notifyAtRiskSubscribers(currentDate);

        /*
            TODO: #4
                Refer to the README for the expected response payload for the email service.
                Using WireMock, verify the mail service was called with the correct HTTP verb and response body.
                The 'to' array must contain the email addresses of the two subscribers with an expiration date within 3 months.
                See the json you created above.
                You have now built a high-level integration tests for the full behavior.
         */

    }

    @Test
    public void getSubscribers() throws IOException, InterruptedException {
        /*
            TODO: #5
                Write a focused integration test for calling the subscribers service.
                Create a WireMock stub for the subscribers service similar to what you did in the previous test.
                Expect that 'SubscriberRetriever.getSubscribers' will return the json from your WireMock stub.
                Once your test is written and fails for the right reason, implement the method.
         */

        String subscribers = SubscriberRetriever.getSubscribers();
        assertEquals(1,0);
    }

    @Test
    public void parseSubscriberJson() throws JsonProcessingException {
        /*
            TODO: #6
                Write a unit test for deserializing the subscriber json into an array of Subscribers.
                This json should be the same as from your WireMock stub.
                Modify the assertion to expect the correct array.
                Once your test is written and fails for the right reason, implement the method.
         */

        String json = null;
        Subscriber[] subscribers = SubscriberRetriever.parseSubscriberJson(json);
        assertEquals(1,0);
    }

    @Test
    public void findSubscribersExpiringSoon() {
        /*
            TODO: #7
                Write a unit test for filtering the array of Subscribers.
                Any subscriber who's expiration date is between the current date and 3 months after the current date
                    should be returned.
                Modify the assertion to expect the correct list of Subscribers.
                Once your test is written and fails for the right reason, implement the method.
         */

        LocalDate currentDate = null;
        Subscriber[] subscribers = null;
        List<Subscriber> subscribersExpiringSoon = Subscriber.findSubscribersExpiringSoon(currentDate, subscribers);
        assertEquals(1,0);
    }

    @Test
    public void createEmailJsonPayloadWithSubscriberEmails() throws JsonProcessingException {
        /*
            TODO: #8
                Write a unit test for creating the request payload required by the email service.
                This should populate the 'to' field with the emails from the subscriber list passed as a parameter.
                The other fields in the json object should be hard-coded with the values specified in the README.
                Modify the assertion to expect the correct json.
                Once your test is written and fails for the right reason, implement the method.
         */
        List<Subscriber> subscriberList = null;
        String emailJson = EmailSender.createEmailJson(subscriberList);
        assertEquals(1,0);
    }

    @Test
    public void sendPendingExpirationEmail() throws IOException, InterruptedException {
        /*
            TODO: #9
                Write a focused integration test for calling the email service.
                Create a WireMock stub for the email service similar to what you did in the first test.
                Using WireMock, verify the mail service was called with the correct HTTP verb and response body.
                Once your test is written and fails for the right reason, implement the method.
                To create the json, your method should call the method you implemented for the previous test
         */
        List<Subscriber> subscriberList = null;
        EmailSender.notifyPendingExpiration(subscriberList);
        assertEquals(1,0);
    }

    /*
        TODO: #10
            Use the functions you have developed to implement RenewalNotificationService.notifyAtRiskSubscribers.
            Congratulations! Your first test should now be passing and you've completed the feature!
            Notice how the logic is segmented away from IO?
            How do these tests look compared to tests using Mockito where IO is mixed with logic?
     */
}