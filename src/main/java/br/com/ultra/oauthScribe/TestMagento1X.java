package br.com.ultra.oauthScribe;

import org.scribe.builder.ServiceBuilder;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

/**
 * Created by Jhoni on 19/07/2016.
 */
public class TestMagento1X {
    public static void main(String[] args) {
        final String MAGENTO_API_KEY = "1609ed562defde9b45b781352b2a7eb5";
        final String MAGENTO_API_SECRET = "a9709572fec4138b2fc35b767937332b";
        final String MAGENTO_REST_API_URL = "http://localhost/magento/api/rest";

        OAuthService service = new ServiceBuilder()
                .provider(MagentoThreeLeggedOAuth.class)
                .apiKey(MAGENTO_API_KEY)
                .apiSecret(MAGENTO_API_SECRET)
                .debug()
                .build();

        Token permanentToken = new Token("36f329866cd3782d9c553d33bcac6937", "34a97d6c6bae82426874fc0380bbba7e");

        try {
            OAuthRequest request = new OAuthRequest(Verb.GET, MAGENTO_REST_API_URL + "/products");
            service.signRequest(permanentToken, request);
            Response response = request.send();

            System.out.println();
            System.out.println(response.getCode());
            System.out.println(response.getMessage());
            System.out.println(response.getBody());
            System.out.println();


            System.out.println("Linking Simple Product to Configurable Product");
            request = new OAuthRequest(Verb.POST, MAGENTO_REST_API_URL + "/configurable-products/4658498498/children");
            response = request.send();

            System.out.println();
            System.out.println(response.getCode());
            System.out.println(response.getMessage());
            System.out.println(response.getBody());
            System.out.println();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
