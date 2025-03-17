package F6;

import I6.d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final HttpURLConnection f35463a;

    public a(HttpURLConnection httpURLConnection) {
        this.f35463a = httpURLConnection;
    }

    private String c(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }

    public String C0() {
        return this.f35463a.getContentType();
    }

    public InputStream L0() {
        return this.f35463a.getInputStream();
    }

    public void close() {
        this.f35463a.disconnect();
    }

    public boolean e1() {
        try {
            return this.f35463a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    public String s2() {
        try {
            if (e1()) {
                return null;
            }
            return "Unable to fetch " + this.f35463a.getURL() + ". Failed with " + this.f35463a.getResponseCode() + "\n" + c(this.f35463a);
        } catch (IOException e10) {
            d.d("get error failed ", e10);
            return e10.getMessage();
        }
    }
}
