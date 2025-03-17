package net.openid.appauth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class s {
    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String b(InputStream inputStream) {
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            char[] cArr = new char[1024];
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read == -1) {
                    return sb2.toString();
                }
                sb2.append(cArr, 0, read);
            }
        } else {
            throw new IOException("Input stream must not be null");
        }
    }
}
