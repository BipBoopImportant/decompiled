package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.t;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.a  reason: case insensitive filesystem */
abstract class C14190a<T> {

    /* renamed from: a  reason: collision with root package name */
    final t f122504a;

    /* renamed from: b  reason: collision with root package name */
    final w f122505b;

    /* renamed from: c  reason: collision with root package name */
    final WeakReference<T> f122506c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f122507d;

    /* renamed from: e  reason: collision with root package name */
    final int f122508e;

    /* renamed from: f  reason: collision with root package name */
    final int f122509f;

    /* renamed from: g  reason: collision with root package name */
    final int f122510g;

    /* renamed from: h  reason: collision with root package name */
    final Drawable f122511h;

    /* renamed from: i  reason: collision with root package name */
    final String f122512i;

    /* renamed from: j  reason: collision with root package name */
    final Object f122513j;

    /* renamed from: k  reason: collision with root package name */
    boolean f122514k;

    /* renamed from: l  reason: collision with root package name */
    boolean f122515l;

    /* renamed from: com.squareup.picasso.a$a  reason: collision with other inner class name */
    static class C3020a<M> extends WeakReference<M> {

        /* renamed from: a  reason: collision with root package name */
        final C14190a f122516a;

        C3020a(C14190a aVar, M m10, ReferenceQueue<? super M> referenceQueue) {
            super(m10, referenceQueue);
            this.f122516a = aVar;
        }
    }

    C14190a(t tVar, T t10, w wVar, int i10, int i11, int i12, Drawable drawable, String str, Object obj, boolean z10) {
        this.f122504a = tVar;
        this.f122505b = wVar;
        this.f122506c = t10 == null ? null : new C3020a(this, t10, tVar.f122606j);
        this.f122508e = i10;
        this.f122509f = i11;
        this.f122507d = z10;
        this.f122510g = i12;
        this.f122511h = drawable;
        this.f122512i = str;
        this.f122513j = obj == null ? this : obj;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f122515l = true;
    }

    /* access modifiers changed from: package-private */
    public abstract void b(Bitmap bitmap, t.e eVar);

    /* access modifiers changed from: package-private */
    public abstract void c(Exception exc);

    /* access modifiers changed from: package-private */
    public String d() {
        return this.f122512i;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f122508e;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f122509f;
    }

    /* access modifiers changed from: package-private */
    public t g() {
        return this.f122504a;
    }

    /* access modifiers changed from: package-private */
    public t.f h() {
        return this.f122505b.f122654t;
    }

    /* access modifiers changed from: package-private */
    public w i() {
        return this.f122505b;
    }

    /* access modifiers changed from: package-private */
    public Object j() {
        return this.f122513j;
    }

    /* access modifiers changed from: package-private */
    public T k() {
        WeakReference<T> weakReference = this.f122506c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f122515l;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f122514k;
    }
}
