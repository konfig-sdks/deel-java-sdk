package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api.letsdeel.com/rest/v2";
        
        // Configure HTTP bearer authorization: deelToken
        configuration.token = "BEARER TOKEN";
        
        // Configure OAuth2 access token for authorization: oauth2
        configuration.accessToken = "YOUR ACCESS TOKEN";
        Deel client = new Deel(configuration);
        assertNotNull(client);
    }
}
