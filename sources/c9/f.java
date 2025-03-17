package C9;

import H9.C6544s;
import K9.C6620s;
import N9.a;
import Z9.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class f implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    private static final a f33782c = new a("RevokeAccessOperation", new String[0]);

    /* renamed from: a  reason: collision with root package name */
    private final String f33783a;

    /* renamed from: b  reason: collision with root package name */
    private final C6544s f33784b = new C6544s((g) null);

    public f(String str) {
        this.f33783a = C6620s.f(str);
    }

    public static i a(String str) {
        if (str == null) {
            return j.a(new Status(4), (g) null);
        }
        f fVar = new f(str);
        new Thread(fVar).start();
        return fVar.f33784b;
    }

    public final void run() {
        Status status = Status.f47985h;
        try {
            String str = this.f33783a;
            URL url = new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str);
            int i10 = c.f41424a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f47983f;
            } else {
                f33782c.b("Unable to revoke access!", new Object[0]);
            }
            a aVar = f33782c;
            aVar.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            f33782c.b("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            f33782c.b("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f33784b.f(status);
    }
}
