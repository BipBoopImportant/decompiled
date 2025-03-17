package com.google.android.gms.wallet;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;
import ma.e;
import xa.C8965f;
import xa.C8971l;

@Deprecated
final class d implements C8965f, Runnable {

    /* renamed from: d  reason: collision with root package name */
    static final Handler f50628d = new e(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    static final SparseArray f50629e = new SparseArray(2);

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicInteger f50630f = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    int f50631a;

    /* renamed from: b  reason: collision with root package name */
    private zzd f50632b;

    /* renamed from: c  reason: collision with root package name */
    private C8971l f50633c;

    d() {
    }

    public static d a(C8971l lVar) {
        d dVar = new d();
        int incrementAndGet = f50630f.incrementAndGet();
        dVar.f50631a = incrementAndGet;
        f50629e.put(incrementAndGet, dVar);
        f50628d.postDelayed(dVar, a.f50603a);
        lVar.c(dVar);
        return dVar;
    }

    private final void d() {
        if (this.f50633c != null && this.f50632b != null) {
            f50629e.delete(this.f50631a);
            f50628d.removeCallbacks(this);
            zzd zzd = this.f50632b;
            if (zzd != null) {
                zzd.b(this.f50633c);
            }
        }
    }

    public final void b(zzd zzd) {
        if (this.f50632b == zzd) {
            this.f50632b = null;
        }
    }

    public final void c(zzd zzd) {
        this.f50632b = zzd;
        d();
    }

    public final void onComplete(C8971l lVar) {
        this.f50633c = lVar;
        d();
    }

    public final void run() {
        f50629e.delete(this.f50631a);
    }
}
