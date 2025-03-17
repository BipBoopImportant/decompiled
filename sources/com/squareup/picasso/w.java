package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.t;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class w {

    /* renamed from: u  reason: collision with root package name */
    private static final long f122634u = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a  reason: collision with root package name */
    int f122635a;

    /* renamed from: b  reason: collision with root package name */
    long f122636b;

    /* renamed from: c  reason: collision with root package name */
    int f122637c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f122638d;

    /* renamed from: e  reason: collision with root package name */
    public final int f122639e;

    /* renamed from: f  reason: collision with root package name */
    public final String f122640f;

    /* renamed from: g  reason: collision with root package name */
    public final List<E> f122641g;

    /* renamed from: h  reason: collision with root package name */
    public final int f122642h;

    /* renamed from: i  reason: collision with root package name */
    public final int f122643i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f122644j;

    /* renamed from: k  reason: collision with root package name */
    public final int f122645k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f122646l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f122647m;

    /* renamed from: n  reason: collision with root package name */
    public final float f122648n;

    /* renamed from: o  reason: collision with root package name */
    public final float f122649o;

    /* renamed from: p  reason: collision with root package name */
    public final float f122650p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f122651q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f122652r;

    /* renamed from: s  reason: collision with root package name */
    public final Bitmap.Config f122653s;

    /* renamed from: t  reason: collision with root package name */
    public final t.f f122654t;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Uri f122655a;

        /* renamed from: b  reason: collision with root package name */
        private int f122656b;

        /* renamed from: c  reason: collision with root package name */
        private String f122657c;

        /* renamed from: d  reason: collision with root package name */
        private int f122658d;

        /* renamed from: e  reason: collision with root package name */
        private int f122659e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f122660f;

        /* renamed from: g  reason: collision with root package name */
        private int f122661g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f122662h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f122663i;

        /* renamed from: j  reason: collision with root package name */
        private float f122664j;

        /* renamed from: k  reason: collision with root package name */
        private float f122665k;

        /* renamed from: l  reason: collision with root package name */
        private float f122666l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f122667m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f122668n;

        /* renamed from: o  reason: collision with root package name */
        private List<E> f122669o;

        /* renamed from: p  reason: collision with root package name */
        private Bitmap.Config f122670p;

        /* renamed from: q  reason: collision with root package name */
        private t.f f122671q;

        b(Uri uri, int i10, Bitmap.Config config) {
            this.f122655a = uri;
            this.f122656b = i10;
            this.f122670p = config;
        }

        public w a() {
            boolean z10 = this.f122662h;
            if (z10 && this.f122660f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f122660f && this.f122658d == 0 && this.f122659e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (z10 && this.f122658d == 0 && this.f122659e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.f122671q == null) {
                    this.f122671q = t.f.NORMAL;
                }
                w wVar = r2;
                w wVar2 = new w(this.f122655a, this.f122656b, this.f122657c, this.f122669o, this.f122658d, this.f122659e, this.f122660f, this.f122662h, this.f122661g, this.f122663i, this.f122664j, this.f122665k, this.f122666l, this.f122667m, this.f122668n, this.f122670p, this.f122671q);
                return wVar;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return (this.f122655a == null && this.f122656b == 0) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return (this.f122658d == 0 && this.f122659e == 0) ? false : true;
        }

        public b d(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i11 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i11 == 0 && i10 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f122658d = i10;
                this.f122659e = i11;
                return this;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public String a() {
        Uri uri = this.f122638d;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.f122639e);
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.f122641g != null;
    }

    public boolean c() {
        return (this.f122642h == 0 && this.f122643i == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        long nanoTime = System.nanoTime() - this.f122636b;
        if (nanoTime > f122634u) {
            return g() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return g() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return c() || this.f122648n != 0.0f;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return e() || b();
    }

    /* access modifiers changed from: package-private */
    public String g() {
        return "[R" + this.f122635a + ']';
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request{");
        int i10 = this.f122639e;
        if (i10 > 0) {
            sb2.append(i10);
        } else {
            sb2.append(this.f122638d);
        }
        List<E> list = this.f122641g;
        if (list != null && !list.isEmpty()) {
            for (E a10 : this.f122641g) {
                sb2.append(' ');
                sb2.append(a10.a());
            }
        }
        if (this.f122640f != null) {
            sb2.append(" stableKey(");
            sb2.append(this.f122640f);
            sb2.append(')');
        }
        if (this.f122642h > 0) {
            sb2.append(" resize(");
            sb2.append(this.f122642h);
            sb2.append(',');
            sb2.append(this.f122643i);
            sb2.append(')');
        }
        if (this.f122644j) {
            sb2.append(" centerCrop");
        }
        if (this.f122646l) {
            sb2.append(" centerInside");
        }
        if (this.f122648n != 0.0f) {
            sb2.append(" rotation(");
            sb2.append(this.f122648n);
            if (this.f122651q) {
                sb2.append(" @ ");
                sb2.append(this.f122649o);
                sb2.append(',');
                sb2.append(this.f122650p);
            }
            sb2.append(')');
        }
        if (this.f122652r) {
            sb2.append(" purgeable");
        }
        if (this.f122653s != null) {
            sb2.append(' ');
            sb2.append(this.f122653s);
        }
        sb2.append('}');
        return sb2.toString();
    }

    private w(Uri uri, int i10, String str, List<E> list, int i11, int i12, boolean z10, boolean z11, int i13, boolean z12, float f10, float f11, float f12, boolean z13, boolean z14, Bitmap.Config config, t.f fVar) {
        this.f122638d = uri;
        this.f122639e = i10;
        this.f122640f = str;
        if (list == null) {
            this.f122641g = null;
        } else {
            this.f122641g = Collections.unmodifiableList(list);
        }
        this.f122642h = i11;
        this.f122643i = i12;
        this.f122644j = z10;
        this.f122646l = z11;
        this.f122645k = i13;
        this.f122647m = z12;
        this.f122648n = f10;
        this.f122649o = f11;
        this.f122650p = f12;
        this.f122651q = z13;
        this.f122652r = z14;
        this.f122653s = config;
        this.f122654t = fVar;
    }
}
