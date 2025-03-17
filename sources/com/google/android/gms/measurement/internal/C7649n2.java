package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.C7459z2;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* renamed from: com.google.android.gms.measurement.internal.n2  reason: case insensitive filesystem */
public final class C7649n2 extends C7721x5 {
    public C7649n2(C7728y5 y5Var) {
        super(y5Var);
    }

    /* access modifiers changed from: private */
    public static byte[] y(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream2 = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream2.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream2.close();
                    return byteArray;
                }
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th2;
        }
    }

    public final /* bridge */ /* synthetic */ C7611i a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ E b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ C7586e2 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C7683s2 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ C7607h2 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ C7595f4 g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Q5 h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final /* bridge */ /* synthetic */ N5 l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Y5 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ C7660p n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ C2 o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ Y4 p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ J2 q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ C7714w5 r() {
        return super.r();
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    public final void w(String str, C7735z5 z5Var, C7459z2 z2Var, C7642m2 m2Var) {
        k();
        s();
        try {
            URL url = new URI(z5Var.c()).toURL();
            l();
            String str2 = str;
            q().x(new C7656o2(this, str2, url, z2Var.l(), z5Var.d(), m2Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            f().E().c("Failed to parse URL. Not uploading MeasurementBatch. appId", C7607h2.t(str), z5Var.c());
        }
    }

    public final boolean z() {
        s();
        ConnectivityManager connectivityManager = (ConnectivityManager) zza().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C7590f zzd() {
        return super.zzd();
    }
}
