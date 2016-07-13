package br.com.ultra.oauthScribe;

import br.com.ultra.oauthClientGoogle.Order;
import br.com.ultra.oauthClientGoogle.Product;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.scribe.builder.ServiceBuilder;
import org.scribe.model.*;
import org.scribe.oauth.OAuthService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mzimpel on 28.08.14.
 */
public class Main {


    public static void main(String[] args) {
        final String MAGENTO_API_KEY = "5bjgv0mwaxxy7p0b9cw7prih4gnpa5d8";
        final String MAGENTO_API_SECRET = "squl2txc25tx5hybk3nnwoi6bbonhujr";
        final String MAGENTO_REST_API_URL = "http://localhost:81/magento/rest/V1";

        OAuthService service = new ServiceBuilder()
                .provider(MagentoThreeLeggedOAuth.class)
                .apiKey(MAGENTO_API_KEY)
                .apiSecret(MAGENTO_API_SECRET)
                .debug()
                .build();

        Token permanentToken = new Token("ttufxu5frvg1s9tokf5n0rjm9pkbk1rm", "ryntcbarrut2nkikkxwwarhh4xd95wl5");
        /**
        Scanner in = new Scanner(System.in);
        System.out.println("Magento'srkflow");
        System.out.println();

        System.out.println("FetchingRequest Token...");
        Token requestToken = service.getRequestToken();
        System.out.println("GotRequest Token!");
        System.out.println();

        // Obtain the Authorization URL
        System.out.println("FetchingAuthorization URL...");
        String authorizationUrl = service.getAuthorizationUrl(requestToken);
        System.out.println("GotAuthorization URL!");
        System.out.println("Nownd authorize Main here:");
        System.out.println(authorizationUrl);
        System.out.println("Ande the authorization code here");
        System.out.print(">>");
        Verifier verifier = new Verifier(in.nextLine());
        System.out.println();

        // Trade the Request Token and Verfier for the Access Token
        System.out.println("TradingRequest Token for an Access Token...");
        Token accessToken = service.getAccessToken(requestToken, verifier);
        System.out.println("GotAccess Token!");
        System.out.println("(if curious it looks like this: "
                + accessToken + " )");
        System.out.println();

//        Token permanentToken = new Token("c653163ebf219c51c0451224efe87b55", "6a3587e0c77195c4980a54a5ce765c8a");
        */
        // Now let's go and ask for a protected resource!
        try {
            OAuthRequest request = new OAuthRequest(Verb.GET, MAGENTO_REST_API_URL + "/products?searchCriteria[page_size]=1000");
            service.signRequest(permanentToken, request);
            System.out.println(request.getOauthParameters());
            Response response = request.send();

            System.out.println();
            System.out.println(response.getCode());
            System.out.println(response.getMessage());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());
            System.out.println();

            request = new OAuthRequest(Verb.GET, MAGENTO_REST_API_URL + "/products/attributes?searchCriteria[page_size]=1000");
            service.signRequest(permanentToken, request);
            System.out.println(request.getOauthParameters());
            response = request.send();

            System.out.println();
            System.out.println(response.getCode());
            System.out.println(response.getMessage());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());
            System.out.println();



//            Gson gson = new Gson();

//            HashMap<String, Product> productsMap = gson.fromJson(response.getBody(), new TypeToken<HashMap<String, Product>>() {}.getType());
//            System.out.println(productsMap.get("1").entity_id);
//
//            List<Product> products = new ArrayList<Product>();
//
//
//            for (HashMap.Entry<String, Product> entry : productsMap.entrySet())
//            {
//                products.add(entry.getValue());
//            }


        }catch(Exception e)
        {
            e.printStackTrace();
        }



    }
}