package com.android.volley.toolbox;

import com.adjust.sdk.Constants;
import com.android.volley.g;
import com.android.volley.n;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public class h extends a {

    /* renamed from: a  reason: collision with root package name */
    private final SSLSocketFactory f46276a;

    static class a extends FilterInputStream {

        /* renamed from: a  reason: collision with root package name */
        private final HttpURLConnection f46277a;

        a(HttpURLConnection httpURLConnection) {
            super(h.j(httpURLConnection));
            this.f46277a = httpURLConnection;
        }

        public void close() {
            super.close();
            this.f46277a.disconnect();
        }
    }

    public interface b {
    }

    public h() {
        this((b) null);
    }

    private void c(HttpURLConnection httpURLConnection, n<?> nVar, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", nVar.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(h(nVar, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    private void d(HttpURLConnection httpURLConnection, n<?> nVar) {
        byte[] body = nVar.getBody();
        if (body != null) {
            c(httpURLConnection, nVar, body);
        }
    }

    static List<g> e(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                for (String gVar : (List) next.getValue()) {
                    arrayList.add(new g((String) next.getKey(), gVar));
                }
            }
        }
        return arrayList;
    }

    private static boolean i(int i10, int i11) {
        return (i10 == 4 || (100 <= i11 && i11 < 200) || i11 == 204 || i11 == 304) ? false : true;
    }

    /* access modifiers changed from: private */
    public static InputStream j(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private HttpURLConnection k(URL url, n<?> nVar) {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection f10 = f(url);
        int timeoutMs = nVar.getTimeoutMs();
        f10.setConnectTimeout(timeoutMs);
        f10.setReadTimeout(timeoutMs);
        f10.setUseCaches(false);
        f10.setDoInput(true);
        if (Constants.SCHEME.equals(url.getProtocol()) && (sSLSocketFactory = this.f46276a) != null) {
            ((HttpsURLConnection) f10).setSSLSocketFactory(sSLSocketFactory);
        }
        return f10;
    }

    public f a(n<?> nVar, Map<String, String> map) {
        String url = nVar.getUrl();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(nVar.getHeaders());
        HttpURLConnection k10 = k(new URL(url), nVar);
        boolean z10 = false;
        try {
            for (String str : hashMap.keySet()) {
                k10.setRequestProperty(str, (String) hashMap.get(str));
            }
            l(k10, nVar);
            int responseCode = k10.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            } else if (!i(nVar.getMethod(), responseCode)) {
                f fVar = new f(responseCode, e(k10.getHeaderFields()));
                k10.disconnect();
                return fVar;
            } else {
                z10 = true;
                return new f(responseCode, e(k10.getHeaderFields()), k10.getContentLength(), g(nVar, k10));
            }
        } catch (Throwable th2) {
            if (!z10) {
                k10.disconnect();
            }
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public HttpURLConnection f(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    /* access modifiers changed from: protected */
    public InputStream g(n<?> nVar, HttpURLConnection httpURLConnection) {
        return new a(httpURLConnection);
    }

    /* access modifiers changed from: protected */
    public OutputStream h(n<?> nVar, HttpURLConnection httpURLConnection, int i10) {
        return httpURLConnection.getOutputStream();
    }

    /* access modifiers changed from: package-private */
    public void l(HttpURLConnection httpURLConnection, n<?> nVar) {
        switch (nVar.getMethod()) {
            case -1:
                byte[] postBody = nVar.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod("POST");
                    c(httpURLConnection, nVar, postBody);
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                d(httpURLConnection, nVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                d(httpURLConnection, nVar);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                d(httpURLConnection, nVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    public h(b bVar) {
        this(bVar, (SSLSocketFactory) null);
    }

    public h(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f46276a = sSLSocketFactory;
    }
}
