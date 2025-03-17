package com.auth0.android.provider;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.f;
import com.auth0.android.request.internal.k;
import hb.l;
import ib.C9832a;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import t7.C8837b;
import u7.C8885b;

class h extends e {

    /* renamed from: j  reason: collision with root package name */
    static final String f46335j = "h";

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f46336b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<f> f46337c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private final CountDownLatch f46338d = new CountDownLatch(1);

    /* renamed from: e  reason: collision with root package name */
    private final String f46339e;

    /* renamed from: f  reason: collision with root package name */
    private final l f46340f;

    /* renamed from: g  reason: collision with root package name */
    private final i f46341g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f46342h;

    /* renamed from: i  reason: collision with root package name */
    boolean f46343i;

    h(Context context, i iVar, l lVar) {
        this.f46336b = new WeakReference<>(context);
        this.f46341g = iVar;
        this.f46339e = iVar.a(context.getPackageManager());
        this.f46340f = lVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(boolean z10, Context context, Uri uri, k kVar, C8885b bVar) {
        if (z10) {
            try {
                this.f46343i = true;
                this.f46340f.q(this.f46341g.e(context, uri), (b) null, (C9832a) null, (Runnable) null, l.f73535i);
            } catch (ActivityNotFoundException unused) {
                Log.e(f46335j, "Could not find any Browser application installed in this device to handle the intent.");
            } catch (SecurityException e10) {
                kVar.b(new g(bVar, new C8837b("a0.browser_not_available", "Error launching browser for authentication", e10)));
            }
        } else {
            h(context, uri);
        }
    }

    private void h(Context context, Uri uri) {
        boolean z10;
        e();
        try {
            z10 = this.f46338d.await(this.f46339e == null ? 0 : 1, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z10 = false;
        }
        String str = f46335j;
        Log.d(str, "Launching URI. Custom Tabs available: " + z10);
        Intent d10 = this.f46341g.d(context, this.f46337c.get());
        d10.setData(uri);
        context.startActivity(d10);
    }

    public void a(ComponentName componentName, c cVar) {
        Log.d(f46335j, "CustomTabs Service connected");
        cVar.h(0);
        this.f46337c.set(cVar.e((b) null));
        this.f46338d.countDown();
    }

    public void e() {
        String str;
        String str2 = f46335j;
        Log.v(str2, "Trying to bind the service");
        Context context = this.f46336b.get();
        boolean z10 = false;
        this.f46342h = false;
        if (!(context == null || (str = this.f46339e) == null)) {
            this.f46342h = true;
            z10 = c.a(context, str, this);
        }
        Log.v(str2, String.format("Bind request result (%s): %s", new Object[]{this.f46339e, Boolean.valueOf(z10)}));
    }

    public void i(Uri uri, boolean z10, k kVar, C8885b<C8837b> bVar) {
        Context context = this.f46336b.get();
        if (context == null) {
            Log.v(f46335j, "Custom Tab Context was no longer valid.");
        } else {
            kVar.a(new f(this, z10, context, uri, kVar, bVar));
        }
    }

    public void j() {
        Log.v(f46335j, "Trying to unbind the service");
        Context context = this.f46336b.get();
        if (this.f46342h && context != null) {
            context.unbindService(this);
            this.f46342h = false;
        }
        this.f46340f.k();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Log.d(f46335j, "CustomTabs Service disconnected");
        this.f46337c.set((Object) null);
    }
}
