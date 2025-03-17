package com.google.android.gms.internal.vision;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import ya.d;

public abstract class M2<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f49223a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f49224b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final String f49225c;

    /* renamed from: d  reason: collision with root package name */
    private final String f49226d;

    /* renamed from: e  reason: collision with root package name */
    private final String f49227e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f49228f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f49229g = false;

    /* renamed from: h  reason: collision with root package name */
    private T f49230h;

    public M2(Context context, String str, String str2) {
        this.f49223a = context;
        this.f49225c = str;
        String valueOf = String.valueOf(str2);
        this.f49226d = valueOf.length() != 0 ? "com.google.android.gms.vision.dynamite.".concat(valueOf) : new String("com.google.android.gms.vision.dynamite.");
        this.f49227e = str2;
    }

    /* access modifiers changed from: protected */
    public abstract T a(DynamiteModule dynamiteModule, Context context);

    /* access modifiers changed from: protected */
    public abstract void b();

    public final boolean c() {
        return e() != null;
    }

    public final void d() {
        synchronized (this.f49224b) {
            if (this.f49230h != null) {
                try {
                    b();
                } catch (RemoteException e10) {
                    Log.e(this.f49225c, "Could not finalize native handle", e10);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final T e() {
        DynamiteModule dynamiteModule;
        synchronized (this.f49224b) {
            T t10 = this.f49230h;
            if (t10 != null) {
                return t10;
            }
            try {
                dynamiteModule = DynamiteModule.e(this.f49223a, DynamiteModule.f48098g, this.f49226d);
            } catch (DynamiteModule.a unused) {
                String format = String.format("%s.%s", new Object[]{"com.google.android.gms.vision", this.f49227e});
                d.a("Cannot load thick client module, fall back to load optional module %s", format);
                try {
                    dynamiteModule = DynamiteModule.e(this.f49223a, DynamiteModule.f48093b, format);
                } catch (DynamiteModule.a e10) {
                    d.c(e10, "Error loading optional module %s", format);
                    if (!this.f49228f) {
                        d.a("Broadcasting download intent for dependency %s", this.f49227e);
                        String str = this.f49227e;
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", str);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.f49223a.sendBroadcast(intent);
                        this.f49228f = true;
                    }
                    dynamiteModule = null;
                }
            }
            if (dynamiteModule != null) {
                try {
                    this.f49230h = a(dynamiteModule, this.f49223a);
                } catch (RemoteException | DynamiteModule.a e11) {
                    Log.e(this.f49225c, "Error creating remote native handle", e11);
                }
            }
            boolean z10 = this.f49229g;
            if (!z10 && this.f49230h == null) {
                Log.w(this.f49225c, "Native handle not yet available. Reverting to no-op handle.");
                this.f49229g = true;
            } else if (z10 && this.f49230h != null) {
                Log.w(this.f49225c, "Native handle is now available.");
            }
            T t11 = this.f49230h;
            return t11;
        }
    }
}
