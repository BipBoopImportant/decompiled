package y9;

import X9.i;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: y9.a  reason: case insensitive filesystem */
public final class C8995a {
    public static final void a(String str) {
        HttpURLConnection httpURLConnection;
        try {
            i.b(263);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 65);
                sb2.append("Received non-success response code ");
                sb2.append(responseCode);
                sb2.append(" from pinging URL: ");
                sb2.append(str);
                Log.w("HttpUrlPinger", sb2.toString());
            }
            httpURLConnection.disconnect();
            i.a();
        } catch (IndexOutOfBoundsException e10) {
            String message = e10.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
            sb3.append("Error while parsing ping URL: ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(message);
            Log.w("HttpUrlPinger", sb3.toString(), e10);
            i.a();
        } catch (IOException | RuntimeException e11) {
            String message2 = e11.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message2).length());
            sb4.append("Error while pinging URL: ");
            sb4.append(str);
            sb4.append(". ");
            sb4.append(message2);
            Log.w("HttpUrlPinger", sb4.toString(), e11);
            i.a();
        } catch (Throwable th2) {
            i.a();
            throw th2;
        }
    }
}
