package br.com.ultra.oauthClientGoogle;

import com.google.api.client.auth.oauth2.AuthorizationCodeFlow;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.ClientParametersAuthentication;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Jhoni on 11/07/2016.
 */
public class AuthenticationTest {
    private static FileDataStoreFactory DATA_STORE_FACTORY;
    private static final String SCOPE = "read";
    private static final String TOKEN_SERVER_URL = "http://192.168.254.10/magento/oauth/token";
    private static final String AUTHORIZATION_SERVER_URL = "http://192.168.254.10/magento/oauth/authorize";

    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    static final JsonFactory JSON_FACTORY = new JacksonFactory();

    private static final java.io.File DATA_STORE_DIR =
            new java.io.File(System.getProperty("user.home"), ".store/dailymotion_sample");

    private static Credential authorize() throws Exception {
        OAuthClientCredentials.errorIfNotSpecified();
        // set up authorization code flow
        AuthorizationCodeFlow flow = new AuthorizationCodeFlow.Builder(BearerToken
                .authorizationHeaderAccessMethod(),
                HTTP_TRANSPORT,
                JSON_FACTORY,
                new GenericUrl(TOKEN_SERVER_URL),
                new ClientParametersAuthentication(
                        OAuthClientCredentials.API_KEY, OAuthClientCredentials.API_SECRET),
                OAuthClientCredentials.API_KEY,
                AUTHORIZATION_SERVER_URL).setScopes(Arrays.asList(SCOPE))
                .setDataStoreFactory(DATA_STORE_FACTORY).build();
        // authorize
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setHost(
                OAuthClientCredentials.DOMAIN).setPort(OAuthClientCredentials.PORT).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
    }

    private static void run(HttpRequestFactory requestFactory) throws IOException {

//        HttpRequest request = requestFactory.buildGetRequest(url);
//        VideoFeed videoFeed = request.execute().parseAs(VideoFeed.class);
//        if (videoFeed.list.isEmpty()) {
//            System.out.println("No favorite videos found.");
//        } else {
//            if (videoFeed.hasMore) {
//                System.out.print("First ");
//            }
//            System.out.println(videoFeed.list.size() + " favorite videos found:");
//            for (Video video : videoFeed.list) {
//                System.out.println();
//                System.out.println("-----------------------------------------------");
//                System.out.println("ID: " + video.id);
//                System.out.println("Title: " + video.title);
//                System.out.println("Tags: " + video.tags);
//                System.out.println("URL: " + video.url);
//            }
//        }
    }

    public static void main(String[] args) {
        try {
            DATA_STORE_FACTORY = new FileDataStoreFactory(DATA_STORE_DIR);
            final Credential credential = authorize();
            HttpRequestFactory requestFactory =
                    HTTP_TRANSPORT.createRequestFactory(new HttpRequestInitializer() {
                        public void initialize(HttpRequest request) throws IOException {
                            credential.initialize(request);
                            request.setParser(new JsonObjectParser(JSON_FACTORY));
                        }
                    });
            run(requestFactory);
            // Success!
            return;
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (Throwable t) {
            t.printStackTrace();
        }
        System.exit(1);
    }


}
