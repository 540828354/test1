package com.mygroup.util;

import javax.net.ssl.*;
import java.io.IOException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class HttpsUtil {

    private static class DefaultTrustManager implements X509TrustManager {
        @Override
        public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        }

        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }

    public static HttpsURLConnection getHttpsURLConnection(String uri) throws IOException {
        SSLContext ctx = null;
        try {
            ctx = SSLContext.getInstance("TLS");
            ctx.init(new KeyManager[0], new TrustManager[] { new DefaultTrustManager() }, new SecureRandom());
        } catch (KeyManagementException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        SSLSocketFactory ssf = ctx.getSocketFactory();

        URL url = new URL(uri);
        HttpsURLConnection httpsConn = (HttpsURLConnection) url.openConnection();
        httpsConn.setSSLSocketFactory(ssf);
        httpsConn.setHostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(String arg0, SSLSession arg1) {
                return true;
            }
        });
        httpsConn.setDoInput(true);
        httpsConn.setDoOutput(true);
        return httpsConn;
    }

    public static void main(String args[]) {
        try {
            HttpsURLConnection httpsURLConnection = getHttpsURLConnection("https://m.lvmama.com/client-service/router/rest.do?method=api.com.flight.city.getCitys&version=1.0.0&city=%E4%B8%8A%E6%B5%B7");
            System.out.println("1");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("1");
        }
    }
}
