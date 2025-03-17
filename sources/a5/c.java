package a5;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import b5.C7066h;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<d> f41439a;

    public static final class a implements C0731c {

        /* renamed from: a  reason: collision with root package name */
        private final C7066h f41440a;

        public a(Context context) {
            this.f41440a = new C7066h(context);
        }

        public WebResourceResponse handle(String str) {
            try {
                return new WebResourceResponse(C7066h.a(str), (String) null, this.f41440a.c(str));
            } catch (IOException e10) {
                Log.e("WebViewAssetLoader", "Error opening asset path: " + str, e10);
                return new WebResourceResponse((String) null, (String) null, (InputStream) null);
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f41441a;

        /* renamed from: b  reason: collision with root package name */
        private String f41442b = "appassets.androidplatform.net";

        /* renamed from: c  reason: collision with root package name */
        private final List<H2.d<String, C0731c>> f41443c = new ArrayList();

        public b a(String str, C0731c cVar) {
            this.f41443c.add(H2.d.a(str, cVar));
            return this;
        }

        public c b() {
            ArrayList arrayList = new ArrayList();
            for (H2.d next : this.f41443c) {
                arrayList.add(new d(this.f41442b, (String) next.f7052a, this.f41441a, (C0731c) next.f7053b));
            }
            return new c(arrayList);
        }
    }

    /* renamed from: a5.c$c  reason: collision with other inner class name */
    public interface C0731c {
        WebResourceResponse handle(String str);
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        final boolean f41444a;

        /* renamed from: b  reason: collision with root package name */
        final String f41445b;

        /* renamed from: c  reason: collision with root package name */
        final String f41446c;

        /* renamed from: d  reason: collision with root package name */
        final C0731c f41447d;

        d(String str, String str2, boolean z10, C0731c cVar) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            } else if (str2.endsWith("/")) {
                this.f41445b = str;
                this.f41446c = str2;
                this.f41444a = z10;
                this.f41447d = cVar;
            } else {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
        }

        public String a(String str) {
            return str.replaceFirst(this.f41446c, "");
        }

        public C0731c b(Uri uri) {
            if (uri.getScheme().equals("http") && !this.f41444a) {
                return null;
            }
            if ((uri.getScheme().equals("http") || uri.getScheme().equals(Constants.SCHEME)) && uri.getAuthority().equals(this.f41445b) && uri.getPath().startsWith(this.f41446c)) {
                return this.f41447d;
            }
            return null;
        }
    }

    c(List<d> list) {
        this.f41439a = list;
    }

    public WebResourceResponse a(Uri uri) {
        WebResourceResponse handle;
        for (d next : this.f41439a) {
            C0731c b10 = next.b(uri);
            if (b10 != null && (handle = b10.handle(next.a(uri.getPath()))) != null) {
                return handle;
            }
        }
        return null;
    }
}
