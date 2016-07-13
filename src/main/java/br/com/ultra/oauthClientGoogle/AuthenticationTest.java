package br.com.ultra.oauthClientGoogle;

import com.google.api.client.auth.oauth.OAuthParameters;
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
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Jhoni on 11/07/2016.
 */
public class AuthenticationTest {
    private static FileDataStoreFactory DATA_STORE_FACTORY;
    private static final String SCOPE = "read";
    private static final String TOKEN_SERVER_URL = "http://192.168.254.10:81/magento/oauth/token";
    private static final String AUTHORIZATION_SERVER_URL = "http://192.168.254.10:81/magento/oauth/authorize";

    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    static final JsonFactory JSON_FACTORY = new JacksonFactory();

    private static final java.io.File DATA_STORE_DIR =
            new java.io.File(System.getProperty("user.home"), ".store/magento");

    private static Credential authorize() throws Exception {
        //OAuthClientCredentials.errorIfNotSpecified();
        // set up authorization code flow
//        new ClientParametersAuthentication(
//                "1609ed562defde9b45b781352b2a7eb5", "a9709572fec4138b2fc35b767937332b"),
//                "1609ed562defde9b45b781352b2a7eb5",

        AuthorizationCodeFlow flow = new AuthorizationCodeFlow.Builder(BearerToken
                .authorizationHeaderAccessMethod(),
                HTTP_TRANSPORT,
                JSON_FACTORY,
                new GenericUrl(TOKEN_SERVER_URL),
                new ClientParametersAuthentication(
                        "5bjgv0mwaxxy7p0b9cw7prih4gnpa5d8", "squl2txc25tx5hybk3nnwoi6bbonhujr"),
                "5bjgv0mwaxxy7p0b9cw7prih4gnpa5d8",
                AUTHORIZATION_SERVER_URL).setScopes(Arrays.asList(SCOPE))
                .setDataStoreFactory(DATA_STORE_FACTORY).build();
        // authorize
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setHost(
                OAuthClientCredentials.DOMAIN).setPort(OAuthClientCredentials.PORT).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
    }

    private static void run(HttpRequestFactory requestFactory) throws IOException {

        final String BASE_URL = "http://192.168.254.10/magento/";
        GenericUrl url = new GenericUrl(BASE_URL + "api/rest/orders");
        HttpRequest req = requestFactory.buildGetRequest(url);
        HttpResponse resp = req.execute();

//            Gson gson = new Gson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//            String jsonOutput = gson.toJson(employee);

//            System.out.println(resp.parseAsString());

        String responseOrder = resp.parseAsString();
        resp.disconnect();

//            gson.

//            ProductBootstrap pb = new ProductBootstrap();
        System.out.println(responseOrder);


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
