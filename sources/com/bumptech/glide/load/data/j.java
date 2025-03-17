package com.bumptech.glide.load.data;

import C7.e;
import I7.h;
import Y7.c;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class j implements d<InputStream> {

    /* renamed from: g  reason: collision with root package name */
    static final b f46588g = new a();

    /* renamed from: a  reason: collision with root package name */
    private final h f46589a;

    /* renamed from: b  reason: collision with root package name */
    private final int f46590b;

    /* renamed from: c  reason: collision with root package name */
    private final b f46591c;

    /* renamed from: d  reason: collision with root package name */
    private HttpURLConnection f46592d;

    /* renamed from: e  reason: collision with root package name */
    private InputStream f46593e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f46594f;

    private static class a implements b {
        a() {
        }

        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    interface b {
        HttpURLConnection a(URL url);
    }

    public j(h hVar, int i10) {
        this(hVar, i10, f46588g);
    }

    private HttpURLConnection c(URL url, Map<String, String> map) {
        try {
            HttpURLConnection a10 = this.f46591c.a(url);
            for (Map.Entry next : map.entrySet()) {
                a10.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            a10.setConnectTimeout(this.f46590b);
            a10.setReadTimeout(this.f46590b);
            a10.setUseCaches(false);
            a10.setDoInput(true);
            a10.setInstanceFollowRedirects(false);
            return a10;
        } catch (IOException e10) {
            throw new e("URL.openConnection threw", 0, e10);
        }
    }

    private static int e(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f46593e = c.d(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f46593e = httpURLConnection.getInputStream();
            }
            return this.f46593e;
        } catch (IOException e10) {
            throw new e("Failed to obtain InputStream", e(httpURLConnection), e10);
        }
    }

    private static boolean h(int i10) {
        return i10 / 100 == 2;
    }

    private static boolean i(int i10) {
        return i10 / 100 == 3;
    }

    private InputStream j(URL url, int i10, URL url2, Map<String, String> map) {
        if (i10 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new e("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection c10 = c(url, map);
            this.f46592d = c10;
            try {
                c10.connect();
                this.f46593e = this.f46592d.getInputStream();
                if (this.f46594f) {
                    return null;
                }
                int e10 = e(this.f46592d);
                if (h(e10)) {
                    return g(this.f46592d);
                }
                if (i(e10)) {
                    String headerField = this.f46592d.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            b();
                            return j(url3, i10 + 1, url, map);
                        } catch (MalformedURLException e11) {
                            throw new e("Bad redirect url: " + headerField, e10, e11);
                        }
                    } else {
                        throw new e("Received empty or null redirect url", e10);
                    }
                } else if (e10 == -1) {
                    throw new e(e10);
                } else {
                    try {
                        throw new e(this.f46592d.getResponseMessage(), e10);
                    } catch (IOException e12) {
                        throw new e("Failed to get a response message", e10, e12);
                    }
                }
            } catch (IOException e13) {
                throw new e("Failed to connect or obtain data", e(this.f46592d), e13);
            }
        } else {
            throw new e("Too many (> 5) redirects!", -1);
        }
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void b() {
        InputStream inputStream = this.f46593e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f46592d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f46592d = null;
    }

    public void cancel() {
        this.f46594f = true;
    }

    public C7.a d() {
        return C7.a.REMOTE;
    }

    public void f(g gVar, d.a<? super InputStream> aVar) {
        StringBuilder sb2;
        long b10 = Y7.g.b();
        try {
            aVar.e(j(this.f46589a.i(), 0, (URL) null, this.f46589a.e()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(Y7.g.a(b10));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
            }
            aVar.c(e10);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + Y7.g.a(b10));
            }
            throw th2;
        }
    }

    j(h hVar, int i10, b bVar) {
        this.f46589a = hVar;
        this.f46590b = i10;
        this.f46591c = bVar;
    }
}
