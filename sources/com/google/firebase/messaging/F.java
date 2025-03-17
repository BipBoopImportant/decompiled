package com.google.firebase.messaging;

import K9.C6620s;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import xa.C8971l;
import xa.C8972m;

public class F implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final URL f68312a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Future<?> f68313b;

    /* renamed from: c  reason: collision with root package name */
    private C8971l<Bitmap> f68314c;

    private F(URL url) {
        this.f68312a = url;
    }

    private byte[] e() {
        URLConnection openConnection = this.f68312a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d10 = C9544b.d(C9544b.b(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + d10.length + " bytes from " + this.f68312a);
                }
                if (d10.length <= 1048576) {
                    return d10;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public static F f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new F(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(C8972m mVar) {
        try {
            mVar.c(d());
        } catch (Exception e10) {
            mVar.b(e10);
        }
    }

    public void close() {
        this.f68313b.cancel(true);
    }

    public Bitmap d() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f68312a);
        }
        byte[] e10 = e();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(e10, 0, e10.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f68312a);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f68312a);
    }

    public C8971l<Bitmap> g() {
        return (C8971l) C6620s.l(this.f68314c);
    }

    public void i(ExecutorService executorService) {
        C8972m mVar = new C8972m();
        this.f68313b = executorService.submit(new E(this, mVar));
        this.f68314c = mVar.a();
    }
}
