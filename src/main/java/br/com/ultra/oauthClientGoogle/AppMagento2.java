//package br.com.ultra.oauthClientGoogle;
//
//import com.google.api.client.auth.oauth.*;
//import com.google.api.client.http.*;
//import com.google.api.client.http.javanet.NetHttpTransport;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.reflect.TypeToken;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
///**
// * Created by Jhoni on 12/07/2016.
// */
//public class AppMagento2 {
//
//
//    private static final String MAGENTO4AW = "http://204.197.244.106/~magentows4aw/";
//    private static final String MAGENTO_API_KEY_4AW = "be03747fa0f1670b6055b0d2ba4744c1";
//    private static final String MAGENTO_API_SECRET_4AW = "3c6c40c8aea93add2095acd24f8d32e2";
//
//    private static final String MAGENTOLOCALHOST = "http://192.168.254.10/magento/";
//    private static final String MAGENTO_API_KEY_LOCALHOST = "1609ed562defde9b45b781352b2a7eb5";
//    private static final String MAGENTO_API_SECRET_LOCALHOST = "a9709572fec4138b2fc35b767937332b";
//
//    private static final String MAGENTO2_LOCALHOST = "http://192.168.254.10:81/magento/";
//    private static final String MAGENTO2_API_KEY_LOCALHOST = "mqqq3a6q3ol9beq8i5dx9dde64yl1r09";
//    private static final String MAGENTO2_API_SECRET_LOCALHOST = "jfa4b2ialwnudxrtqcw02pqj6e20br84";
//
//
//    private static final String CALLBACK = MAGENTO2_LOCALHOST;
//
//    private static final String BASE_URL = MAGENTO2_LOCALHOST;
//    private static final String INITIATE = BASE_URL + "oauth/initiate";
//    private static final String AUTHORIZE = BASE_URL + "admin/oauth_authorize";
//    private static final String TOKEN = BASE_URL + "oauth/token";
//    private static final String MAGENTO_REST_API_URL = BASE_URL + "api/rest";
//    private static final String MAGENTO2_REST_API_URL = BASE_URL + "/rest/V1";
//
//    public static void main(String[] args) {
//        final String MAGENTO_API_KEY = MAGENTO2_API_KEY_LOCALHOST;
//        final String MAGENTO_API_SECRET = MAGENTO2_API_SECRET_LOCALHOST;
//
//        HttpTransport transport = new NetHttpTransport();
//
//        //
//        try {
//
//            // The OAuthHmasSigner will be used to create the oauth_signature
//            // Using HMAC-SHAl as the oauth_signature_method
//            // The signer needs the secret key to sign requests
//            OAuthHmacSigner signer = new OAuthHmacSigner();
//            signer.clientSharedSecret = MAGENTO_API_SECRET;
//
//
//            // Step 1: Get a request token
//            // -------------------------------
//            // We need to provide our application key
//            // We also need to provide an HTTP transport object
//            // And the signer which will sign the request
//            OAuthGetTemporaryToken temporaryToken = new OAuthGetTemporaryToken(INITIATE);
////            temporaryToken.
//
//            temporaryToken.callback = CALLBACK;
//            temporaryToken.consumerKey = MAGENTO_API_KEY;
//            temporaryToken.transport = transport;
//            temporaryToken.signer = signer;
//
//            // Get back our request token
//            OAuthCredentialsResponse requestTokenResponse = temporaryToken.execute();
//
//            System.out.println("Request Token: ");
//            System.out.println("- oauth_token    = " + requestTokenResponse.token);
//            System.out.println("-oauth_token_secret = " + requestTokenResponse.tokenSecret);
//
//            // Update the signer to also include the request token
//            signer.tokenSharedSecret = requestTokenResponse.tokenSecret;
//
//            // Step 2: User grants access
//            // ----------------------------------------------
//
//            // Construct an authorization URL using the temporary request token
//            OAuthAuthorizeTemporaryTokenUrl authorizeTemporaryTokenUrl = new OAuthAuthorizeTemporaryTokenUrl(AUTHORIZE);
//            authorizeTemporaryTokenUrl.temporaryToken = requestTokenResponse.token;
//
//            System.out.println(authorizeTemporaryTokenUrl.buildAuthority());
//
//            // We ask the user to open this URL and grant access
//            // Magento includes an extra safety measure, asks the user to
//            // provide PIN
//            String pin = null;
//            System.out.println("Go to the following link:\n" + authorizeTemporaryTokenUrl.build());
//            InputStreamReader converter = new InputStreamReader(System.in, "UTF-8");
//            BufferedReader in = new BufferedReader(converter);
//            while (pin == null) {
//                System.out.println("Enter the verification PIN provided by Magento:");
//                pin = in.readLine();
//            }
//
//            //AuthorizationCodeFlow flow = new AuthorizationCodeFlow.Builder()
//
//            // step 3: Request the access token the user has approved
//            // ---------------------------------------------------------------
//
//            // Get the access token
//            // We need to provide our application key
//            // The signer, the transport objects
//            // The temporary request token
//            // And a verifier string ( the PIN number provided by Twitter)
//            OAuthGetAccessToken accessToken = new OAuthGetAccessToken(TOKEN);
//            accessToken.consumerKey = MAGENTO_API_KEY;
//            accessToken.signer = signer;
//            accessToken.transport = transport;
//            accessToken.temporaryToken = requestTokenResponse.token;
//            accessToken.verifier = pin;
//
//            // Get back our access token
//            OAuthCredentialsResponse accessTokenResponse = accessToken.execute();
//
//            System.out.println("Access Token: ");
//            System.out.println("-oauth_token = " + accessTokenResponse.token);
//            System.out.println("-oauth_token_secret = " + accessTokenResponse.tokenSecret);
////			OAuthAuthorizeTemporaryTokenUrl
//            // Update the signer again
//            // We now replace the temporary request token with the final access
//            // token
//            signer.tokenSharedSecret = accessTokenResponse.tokenSecret;
//
//            // Set up OAuth parameters which can now be used in authenticated
//            // requests
//            OAuthParameters parameters = new OAuthParameters();
//            parameters.consumerKey = MAGENTO_API_KEY;
//            parameters.token = accessTokenResponse.token;
//            parameters.signer = signer;
//
//            // OAuth steps finished, we can now start accessing the service
//            // --------------------------------------------------------------
//            HttpRequestFactory factory = transport.createRequestFactory(parameters);
//            GenericUrl url = new GenericUrl(MAGENTO_REST_API_URL + "/orders");
//            HttpRequest req = factory.buildGetRequest(url);
//            HttpResponse resp = req.execute();
//
////            Gson gson = new Gson();
//            Gson gson = new GsonBuilder().setPrettyPrinting().create();
////            String jsonOutput = gson.toJson(employee);
//
////            System.out.println(resp.parseAsString());
//
//            String responseOrder = resp.parseAsString();
//            resp.disconnect();
//
////            gson.
//
////            ProductBootstrap pb = new ProductBootstrap();
//            System.out.println(responseOrder);
//
//            // Order order = gson.fromJson(responseOrder, Order.class);
//
//            //System.out.println(order.shipping_description);
//
//            System.out.println(gson.fromJson(responseOrder, Order.class));
//
//            HashMap<String, Order> orderMaps = gson.fromJson(responseOrder, new TypeToken<HashMap<String, Order>>() {
//            }.getType());
//
//            System.out.println(orderMaps.get("1").entity_id);
//            System.out.println(orderMaps.get("1").base_discount_amount);
//
//            String status = orderMaps.get("1").status.toString();
//            System.out.println(status);
//
////            Type collectionType = new TypeToken<Collection<Order>>(){}.getType();
////            Collection<Order> orders = gson.fromJson(responseOrder, collectionType);
//
//            List<Order> orders = new ArrayList<Order>();
//
//
//            for (HashMap.Entry<String, Order> entry : orderMaps.entrySet()) {
//                if (entry.getValue().status.toString().equals("complete")) {
//                    orders.add(entry.getValue());
//                }
//
//            }
//
//            for (Order order : orders) {
//                System.out.println("Order");
//                System.out.println("-------------------------------");
//                System.out.println("Name: " + order.entity_id);
//                System.out.println("Name: " + order.status);
//                System.out.println("-------------------------------");
//                System.out.println("Items");
//                System.out.println("-------------------------------");
//                for (OrderItem orderItem : order.order_items) {
//                    System.out.println("Name: " + orderItem.name);
//                    System.out.println("Sku: " + orderItem.sku);
//                    System.out.println("Price: " + orderItem.price);
//                }
//
//                for (OrderComment orderComment : order.order_comments) {
//                    System.out.println("Comment: " + orderComment.comment);
//                    System.out.println("Created at: " + orderComment.created_at);
//                }
//            }
//
//            GenericUrl urlCustomers = new GenericUrl(MAGENTO_REST_API_URL + "/customers");
//            HttpRequest reqCustomers = factory.buildGetRequest(urlCustomers);
//            HttpResponse respCustomers = reqCustomers.execute();
//            String customers = respCustomers.parseAsString();
//            System.out.println(customers);
//
//            HashMap<String, Customer> customersMap = gson.fromJson(customers, new TypeToken<HashMap<String, Customer>>() {
//            }.getType());
//
//            System.out.println("Customer");
//            for (HashMap.Entry<String, Customer> entry : customersMap.entrySet()) {
//                System.out.println("------------------------------");
//                System.out.println(entry.getValue().entity_id);
//                System.out.println(entry.getValue().firstname);
//                System.out.println(entry.getValue().lastname);
//                System.out.println(entry.getValue().email);
//                System.out.println("------------------------------");
//            }
//
//            factory = transport.createRequestFactory(parameters);
//            url = new GenericUrl(MAGENTO_REST_API_URL + "/products/9");
//            req = factory.buildGetRequest(url);
//            resp = req.execute();
//
//            String response = resp.parseAsString();
//            resp.disconnect();
//
//            System.out.println(response);
//
////            HashMap<String, Product> maps = gson.fromJson(response, new TypeToken<HashMap<String, Product>>() {
////            }.getType());
////
////            System.out.println(maps.get("4").description);
////
////            List<Product> products = new ArrayList<Product>();
//
//
////            for (HashMap.Entry<String, Product> entry : maps.entrySet())
////            {
////                products.add(entry.getValue());
////                System.out.println(gson.toJson(entry.getValue()));
////            }
////
////            for(Product product: products){
////                System.out.println(product.name);
////            }
////
//            ProductBootstrap productBootstrap = new ProductBootstrap();
//            Product productToMagento = productBootstrap.generateProduct();
//
//            System.out.println(gson.toJson(productToMagento));
//
//            /*
//            Trecho de código que realiza o POST dos produtos
//             */
//            productToMagento.price = Double.toString(15.85);
//
//            HttpRequestFactory requestFactory = transport.createRequestFactory(parameters);
//            HttpRequest request = requestFactory.buildPutRequest(url, ByteArrayContent.fromString("application/json", gson.toJson(productToMagento)));
//            HttpResponse responsePost = request.execute();
//            System.out.println(responsePost.getStatusCode());
//            System.out.println(responsePost.getStatusMessage());
//
////            CustomerBootstrap customerBootstrap = new CustomerBootstrap();
////            Customer customer = customerBootstrap.generateCustomer();
////
////            System.out.println(gson.toJson(customer));
//
////            GenericUrl customersUrl = new GenericUrl(MAGENTO_REST_API_URL + "/customers/");
////            HttpRequestFactory requestFactory = transport.createRequestFactory(parameters);
////            HttpRequest request = requestFactory.buildPutRequest(customersUrl, ByteArrayContent.fromString("application/json", gson.toJson(customer)));
////            HttpResponse responsePost = request.execute();
////            System.out.println(responsePost.getStatusCode());
////            System.out.println(responsePost.getStatusMessage());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
