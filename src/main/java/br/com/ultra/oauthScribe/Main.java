package br.com.ultra.oauthScribe;

import br.com.ultra.oauthClientGoogle.Order;
import br.com.ultra.oauthClientGoogle.Product;
import br.com.ultra.oauthScribe.resources.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.scribe.builder.ServiceBuilder;
import org.scribe.model.*;
import org.scribe.oauth.OAuthService;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by mzimpel on 28.08.14.
 */
public class Main {

    public static void main(String[] args) {
        final String MAGENTO_API_KEY_2_0 = "5bjgv0mwaxxy7p0b9cw7prih4gnpa5d8";
        final String MAGENTO_API_SECRET_2_0 = "squl2txc25tx5hybk3nnwoi6bbonhujr";
        final String MAGENTO_REST_API_URL_2_0 = "http://localhost:81/magento/rest/V1";
        final String MAGENTO_API_TOKEN_2_0 = "d3wmj8khucjvjup9ld9d2xv2ks8r0xrk";
        final String MAGENTO_API_TOKEN_SECRET_2_0 = "l2o51e6gnmat74w6djd0nhrh9ee61j0c";

        final String MAGENTO_API_KEY_2_1 = "tqr80vptaey0op9x0f2npc7b9mecq2ls";
        final String MAGENTO_API_SECRET_2_1 = "delykbjrwi7v2lejg9pmj0lhf8uxcy6o";
        final String MAGENTO_REST_API_URL_2_1 = "http://localhost:82/magento/rest/V1";
        final String MAGENTO_API_TOKEN_2_1 = "7dpe3lasborlw1chpgfpj2wwq3lvm1df";
        final String MAGENTO_API_TOKEN_SECRET_2_1 = "9p7uvthq9itgwy4hwkgcmm6hciv027qq";


        OAuthService service = new ServiceBuilder()
                .provider(MagentoThreeLeggedOAuth.class)
                .apiKey(MAGENTO_API_KEY_2_0)
                .apiSecret(MAGENTO_API_SECRET_2_0)
                .debug()
                .build();

        Token permanentToken = new Token(MAGENTO_API_TOKEN_2_0, MAGENTO_API_TOKEN_SECRET_2_0);
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
            OAuthRequest request = new OAuthRequest(Verb.GET, MAGENTO_REST_API_URL_2_0 + "/products?searchCriteria[page_size]=1000");
//            OAuthRequest request = new OAuthRequest(Verb.GET, MAGENTO_REST_API_URL + "/products/P1");
            service.signRequest(permanentToken, request);
            Response response = request.send();

            System.out.println();
            System.out.println(response.getCode());
            System.out.println(response.getMessage());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());
            System.out.println();

//            request = new OAuthRequest(Verb.GET, MAGENTO_REST_API_URL + "/configurable-products/98456466678/children?searchCriteria[page_size]=1000");
//            service.signRequest(permanentToken, request);
//            System.out.println(request.getOauthParameters());
//            response = request.send();
//
//            System.out.println();
//            System.out.println(response.getCode());
//            System.out.println(response.getMessage());
//            System.out.println(response.getBody());
//            System.out.println(response.getHeaders());
//            System.out.println();



            Gson gson = new GsonBuilder().setPrettyPrinting().create();

//            ProductResource[] products = gson.fromJson(response.getBody(), ProductResource[].class);

//            ProductResource productResource = gson.fromJson(response.getBody(), ProductResource.class);
//            List<Product> products = gson.fromJson(response.getBody(), List<>.class);
//            InputStream inputStream = new InputStream(response.getBody());
//            JsonReader reader = new JsonReader(new InputStreamReader(response.getBody()));
//            HashMap<String,ProductResource> productsMap = gson.fromJson(response.getBody(), new TypeToken<HashMap<String,ProductResource>>() {}.getType());
//            System.out.println(productsMap.get("1").entity_id);
//
//            List<Product> products = new ArrayList<Product>();
//
//            for (HashMap.Entry<String, Product> entry : productsMap.entrySet())
//            {
//                products.add(entry.getValue());
//            }
//            System.out.println("Produtos importados do Magento");
//            System.out.println("---------------------------------------------");
//            for(ItemProductResource item : productResource.getItems()){
//                System.out.println("Sku: " + item.getSku());
//                System.out.println("Name: " + item.getName());
//                System.out.println("---------------------------------------------");
//                System.out.println("Custom Attributes");
//                System.out.println("------------------------------------");
//                for(CustomAttributeProduct customAttribute: item.getCustomAttributes()){
//                    System.out.println("Attribute Code: " + customAttribute.getAttributeCode());
//                    System.out.println("Value: " + customAttribute.getValue());
//                    System.out.println("------------------------------------");
//                }
//            }

//            ProductResourceBootstrap productBootstrap = new ProductResourceBootstrap();

//            String productJson = gson.toJson(productBootstrap.generateProduct());

//            System.out.println(productJson);
//            request = new OAuthRequest(Verb.POST, MAGENTO_REST_API_URL + "/products?searchCriteria[page_size]=1000");
//            request.addHeader("Content-Type", "application/json;charset=UTF-8");
//            request.addPayload(productJson);
//            service.signRequest(permanentToken, request);
//            response = request.send();
//
//            System.out.println();
//            System.out.println(response.getCode());
//            System.out.println(response.getMessage());

            ConfigurableProductBootstrap configurableProduct = new ConfigurableProductBootstrap();
//            System.out.println(gson.toJson(configurableProduct.generateConfigurableProduct("PFROMJAVATESTESKU", "Product Test Config From Java")));

//            System.out.println("Generating Configurable Product");
//            request = new OAuthRequest(Verb.POST, MAGENTO_REST_API_URL_2_0 + "/products");
//            request.addHeader("Content-Type", "application/json;charset=UTF-8");
//            request.addPayload(gson.toJson(configurableProduct.generateConfigurableProduct("PJAVASKU", "Product Config From Java")));
//            service.signRequest(permanentToken, request);
//            response = request.send();
//
//            System.out.println(gson.toJson(configurableProduct.generateConfigurableProduct("PJAVASKU", "Product Config From Java")));
//
//            System.out.println();
//            System.out.println(response.getCode());
//            System.out.println(response.getMessage());
//
            System.out.println("Generating Simple Product");
            request = new OAuthRequest(Verb.PUT, MAGENTO_REST_API_URL_2_0 + "/products/PJAVASKU-BM");
            request.addHeader("Content-Type", "application/json;charset=UTF-8");

            ProductResource configurableProductSimple = configurableProduct.generateSimpleProduct("PJAVASKU-BM", "Product Config From Java - Branco Médio");

            configurableProductSimple.getProduct().setPrice(Double.toString(55.50));
            configurableProductSimple.getProduct().getExtensionAttribute().getStockItem().setQty(800);

            request.addPayload(gson.toJson(configurableProductSimple));
            service.signRequest(permanentToken, request);
            response = request.send();

            System.out.println(gson.toJson(configurableProduct.generateSimpleProduct("PJAVASKU-BM", "Product Config From Java - Branco Médio")));

            System.out.println();
            System.out.println(response.getCode());
            System.out.println(response.getMessage());

//            System.out.println(gson.toJson(configurableProductSimple));

//            System.out.println("Linking Simple Product to Configurable Product");
//            request = new OAuthRequest(Verb.POST, MAGENTO_REST_API_URL_2_0 + "/configurable-products/PJAVASKU/child");
//            request.addHeader("Content-Type", "application/json;charset=UTF-8");
//            request.addPayload(gson.toJson(configurableProduct.generateChild("PJAVASKU-BM")));
//            service.signRequest(permanentToken, request);
//            response = request.send();
//
//            System.out.println();
//            System.out.println(response.getCode());
//            System.out.println(response.getMessage());

        }catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
