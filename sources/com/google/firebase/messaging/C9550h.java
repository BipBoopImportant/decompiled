package com.google.firebase.messaging;

import K4.m;
import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.k0;
import java.util.concurrent.ExecutorService;
import xa.C8971l;
import xa.C8972m;
import xa.C8974o;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: com.google.firebase.messaging.h  reason: case insensitive filesystem */
public abstract class C9550h extends Service {

    /* renamed from: a  reason: collision with root package name */
    final ExecutorService f68447a = C9556n.d();

    /* renamed from: b  reason: collision with root package name */
    private Binder f68448b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f68449c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private int f68450d;

    /* renamed from: e  reason: collision with root package name */
    private int f68451e = 0;

    /* renamed from: com.google.firebase.messaging.h$a */
    class a implements k0.a {
        a() {
        }

        public C8971l<Void> a(Intent intent) {
            return C9550h.this.j(intent);
        }
    }

    private void d(Intent intent) {
        if (intent != null) {
            i0.c(intent);
        }
        synchronized (this.f68449c) {
            try {
                int i10 = this.f68451e - 1;
                this.f68451e = i10;
                if (i10 == 0) {
                    k(this.f68450d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(Intent intent, C8971l lVar) {
        d(intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(Intent intent, C8972m mVar) {
        try {
            f(intent);
        } finally {
            mVar.c(null);
        }
    }

    /* access modifiers changed from: private */
    public C8971l<Void> j(Intent intent) {
        if (g(intent)) {
            return C8974o.f(null);
        }
        C8972m mVar = new C8972m();
        this.f68447a.execute(new C9549g(this, intent, mVar));
        return mVar.a();
    }

    /* access modifiers changed from: protected */
    public Intent e(Intent intent) {
        return intent;
    }

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean k(int i10) {
        return stopSelfResult(i10);
    }

    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f68448b == null) {
                this.f68448b = new k0(new a());
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f68448b;
    }

    public void onDestroy() {
        this.f68447a.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.f68449c) {
            this.f68450d = i11;
            this.f68451e++;
        }
        Intent e10 = e(intent);
        if (e10 == null) {
            d(intent);
            return 2;
        }
        C8971l<Void> j10 = j(e10);
        if (j10.p()) {
            d(intent);
            return 2;
        }
        j10.b(new m(), new C9548f(this, intent));
        return 3;
    }
}
