package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.t;
import com.squareup.picasso.w;
import java.util.concurrent.atomic.AtomicInteger;

public class x {

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicInteger f122672m = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    private final t f122673a;

    /* renamed from: b  reason: collision with root package name */
    private final w.b f122674b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f122675c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f122676d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f122677e = true;

    /* renamed from: f  reason: collision with root package name */
    private int f122678f;

    /* renamed from: g  reason: collision with root package name */
    private int f122679g;

    /* renamed from: h  reason: collision with root package name */
    private int f122680h;

    /* renamed from: i  reason: collision with root package name */
    private int f122681i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f122682j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f122683k;

    /* renamed from: l  reason: collision with root package name */
    private Object f122684l;

    x(t tVar, Uri uri, int i10) {
        if (!tVar.f122610n) {
            this.f122673a = tVar;
            this.f122674b = new w.b(uri, i10, tVar.f122607k);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    private w b(long j10) {
        int andIncrement = f122672m.getAndIncrement();
        w a10 = this.f122674b.a();
        a10.f122635a = andIncrement;
        a10.f122636b = j10;
        boolean z10 = this.f122673a.f122609m;
        if (z10) {
            F.t("Main", "created", a10.g(), a10.toString());
        }
        w r10 = this.f122673a.r(a10);
        if (r10 != a10) {
            r10.f122635a = andIncrement;
            r10.f122636b = j10;
            if (z10) {
                String d10 = r10.d();
                F.t("Main", "changed", d10, "into " + r10);
            }
        }
        return r10;
    }

    private Drawable c() {
        int i10 = this.f122678f;
        return i10 != 0 ? this.f122673a.f122600d.getDrawable(i10) : this.f122682j;
    }

    /* access modifiers changed from: package-private */
    public x a() {
        this.f122684l = null;
        return this;
    }

    public void d(ImageView imageView) {
        e(imageView, (C14194e) null);
    }

    public void e(ImageView imageView, C14194e eVar) {
        Bitmap o10;
        ImageView imageView2 = imageView;
        C14194e eVar2 = eVar;
        long nanoTime = System.nanoTime();
        F.c();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f122674b.b()) {
            this.f122673a.b(imageView2);
            if (this.f122677e) {
                u.d(imageView2, c());
            }
        } else {
            if (this.f122676d) {
                if (!this.f122674b.c()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f122677e) {
                            u.d(imageView2, c());
                        }
                        this.f122673a.e(imageView2, new h(this, imageView2, eVar2));
                        return;
                    }
                    this.f122674b.d(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            w b10 = b(nanoTime);
            String f10 = F.f(b10);
            if (!p.a(this.f122680h) || (o10 = this.f122673a.o(f10)) == null) {
                if (this.f122677e) {
                    u.d(imageView2, c());
                }
                this.f122673a.g(new l(this.f122673a, imageView, b10, this.f122680h, this.f122681i, this.f122679g, this.f122683k, f10, this.f122684l, eVar, this.f122675c));
                return;
            }
            this.f122673a.b(imageView2);
            t tVar = this.f122673a;
            Context context = tVar.f122600d;
            t.e eVar3 = t.e.MEMORY;
            u.c(imageView, context, o10, eVar3, this.f122675c, tVar.f122608l);
            if (this.f122673a.f122609m) {
                String g10 = b10.g();
                F.t("Main", "completed", g10, "from " + eVar3);
            }
            if (eVar2 != null) {
                eVar.onSuccess();
            }
        }
    }

    public void f(C c10) {
        Bitmap o10;
        long nanoTime = System.nanoTime();
        F.c();
        if (c10 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f122676d) {
            Drawable drawable = null;
            if (!this.f122674b.b()) {
                this.f122673a.c(c10);
                if (this.f122677e) {
                    drawable = c();
                }
                c10.c(drawable);
                return;
            }
            w b10 = b(nanoTime);
            String f10 = F.f(b10);
            if (!p.a(this.f122680h) || (o10 = this.f122673a.o(f10)) == null) {
                if (this.f122677e) {
                    drawable = c();
                }
                c10.c(drawable);
                this.f122673a.g(new D(this.f122673a, c10, b10, this.f122680h, this.f122681i, this.f122683k, f10, this.f122684l, this.f122679g));
                return;
            }
            this.f122673a.c(c10);
            c10.a(o10, t.e.MEMORY);
        } else {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
    }

    public x g(p pVar, p... pVarArr) {
        if (pVar != null) {
            this.f122680h = pVar.index | this.f122680h;
            if (pVarArr != null) {
                if (pVarArr.length > 0) {
                    int length = pVarArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        p pVar2 = pVarArr[i10];
                        if (pVar2 != null) {
                            this.f122680h = pVar2.index | this.f122680h;
                            i10++;
                        } else {
                            throw new IllegalArgumentException("Memory policy cannot be null.");
                        }
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        throw new IllegalArgumentException("Memory policy cannot be null.");
    }

    public x h() {
        if (this.f122678f != 0) {
            throw new IllegalStateException("Placeholder resource already set.");
        } else if (this.f122682j == null) {
            this.f122677e = false;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public x i(int i10) {
        if (!this.f122677e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (i10 == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        } else if (this.f122682j == null) {
            this.f122678f = i10;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public x j(int i10, int i11) {
        this.f122674b.d(i10, i11);
        return this;
    }

    /* access modifiers changed from: package-private */
    public x k() {
        this.f122676d = false;
        return this;
    }
}
