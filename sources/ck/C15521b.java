package CK;

import AK.g;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;

/* renamed from: CK.b  reason: case insensitive filesystem */
public final class C15521b implements C15520a {

    /* renamed from: a  reason: collision with root package name */
    public static final C15521b f133570a = new C15521b();

    /* renamed from: b  reason: collision with root package name */
    private static final int f133571b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f133572c;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f133571b = (int) timeUnit.toMillis(15);
        f133572c = (int) timeUnit.toMillis(10);
    }

    private C15521b() {
    }

    public HttpURLConnection a(Uri uri) {
        g.e(uri, "url must not be null");
        g.a(Constants.SCHEME.equals(uri.getScheme()), "only https connections are permitted");
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
        httpURLConnection.setConnectTimeout(f133571b);
        httpURLConnection.setReadTimeout(f133572c);
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }
}
