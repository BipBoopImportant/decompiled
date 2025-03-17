package P7;

import C7.f;
import C7.m;
import E7.j;
import F7.d;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

class g {

    /* renamed from: a  reason: collision with root package name */
    private final A7.a f39409a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f39410b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b> f39411c;

    /* renamed from: d  reason: collision with root package name */
    final l f39412d;

    /* renamed from: e  reason: collision with root package name */
    private final d f39413e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f39414f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f39415g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f39416h;

    /* renamed from: i  reason: collision with root package name */
    private k<Bitmap> f39417i;

    /* renamed from: j  reason: collision with root package name */
    private a f39418j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f39419k;

    /* renamed from: l  reason: collision with root package name */
    private a f39420l;

    /* renamed from: m  reason: collision with root package name */
    private Bitmap f39421m;

    /* renamed from: n  reason: collision with root package name */
    private m<Bitmap> f39422n;

    /* renamed from: o  reason: collision with root package name */
    private a f39423o;

    /* renamed from: p  reason: collision with root package name */
    private int f39424p;

    /* renamed from: q  reason: collision with root package name */
    private int f39425q;

    /* renamed from: r  reason: collision with root package name */
    private int f39426r;

    static class a extends V7.c<Bitmap> {

        /* renamed from: d  reason: collision with root package name */
        private final Handler f39427d;

        /* renamed from: e  reason: collision with root package name */
        final int f39428e;

        /* renamed from: f  reason: collision with root package name */
        private final long f39429f;

        /* renamed from: g  reason: collision with root package name */
        private Bitmap f39430g;

        a(Handler handler, int i10, long j10) {
            this.f39427d = handler;
            this.f39428e = i10;
            this.f39429f = j10;
        }

        /* access modifiers changed from: package-private */
        public Bitmap a() {
            return this.f39430g;
        }

        /* renamed from: d */
        public void j(Bitmap bitmap, W7.d<? super Bitmap> dVar) {
            this.f39430g = bitmap;
            this.f39427d.sendMessageAtTime(this.f39427d.obtainMessage(1, this), this.f39429f);
        }

        public void f(Drawable drawable) {
            this.f39430g = null;
        }
    }

    public interface b {
        void a();
    }

    private class c implements Handler.Callback {
        c() {
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.m((a) message.obj);
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                g.this.f39412d.o((a) message.obj);
                return false;
            }
        }
    }

    g(com.bumptech.glide.b bVar, A7.a aVar, int i10, int i11, m<Bitmap> mVar, Bitmap bitmap) {
        this(bVar.f(), com.bumptech.glide.b.t(bVar.h()), aVar, (Handler) null, i(com.bumptech.glide.b.t(bVar.h()), i10, i11), mVar, bitmap);
    }

    private static f g() {
        return new X7.d(Double.valueOf(Math.random()));
    }

    private static k<Bitmap> i(l lVar, int i10, int i11) {
        return lVar.d().a(((U7.g) ((U7.g) U7.g.w0(j.f35108b).u0(true)).m0(true)).c0(i10, i11));
    }

    private void l() {
        if (this.f39414f && !this.f39415g) {
            if (this.f39416h) {
                Y7.k.a(this.f39423o == null, "Pending target must be null when starting from the first frame");
                this.f39409a.f();
                this.f39416h = false;
            }
            a aVar = this.f39423o;
            if (aVar != null) {
                this.f39423o = null;
                m(aVar);
                return;
            }
            this.f39415g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f39409a.e());
            this.f39409a.b();
            this.f39420l = new a(this.f39410b, this.f39409a.g(), uptimeMillis);
            this.f39417i.a(U7.g.x0(g())).L0(this.f39409a).F0(this.f39420l);
        }
    }

    private void n() {
        Bitmap bitmap = this.f39421m;
        if (bitmap != null) {
            this.f39413e.c(bitmap);
            this.f39421m = null;
        }
    }

    private void p() {
        if (!this.f39414f) {
            this.f39414f = true;
            this.f39419k = false;
            l();
        }
    }

    private void q() {
        this.f39414f = false;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f39411c.clear();
        n();
        q();
        a aVar = this.f39418j;
        if (aVar != null) {
            this.f39412d.o(aVar);
            this.f39418j = null;
        }
        a aVar2 = this.f39420l;
        if (aVar2 != null) {
            this.f39412d.o(aVar2);
            this.f39420l = null;
        }
        a aVar3 = this.f39423o;
        if (aVar3 != null) {
            this.f39412d.o(aVar3);
            this.f39423o = null;
        }
        this.f39409a.clear();
        this.f39419k = true;
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer b() {
        return this.f39409a.getData().asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    public Bitmap c() {
        a aVar = this.f39418j;
        return aVar != null ? aVar.a() : this.f39421m;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        a aVar = this.f39418j;
        if (aVar != null) {
            return aVar.f39428e;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public Bitmap e() {
        return this.f39421m;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f39409a.c();
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f39426r;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f39409a.h() + this.f39424p;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f39425q;
    }

    /* access modifiers changed from: package-private */
    public void m(a aVar) {
        this.f39415g = false;
        if (this.f39419k) {
            this.f39410b.obtainMessage(2, aVar).sendToTarget();
        } else if (this.f39414f) {
            if (aVar.a() != null) {
                n();
                a aVar2 = this.f39418j;
                this.f39418j = aVar;
                for (int size = this.f39411c.size() - 1; size >= 0; size--) {
                    this.f39411c.get(size).a();
                }
                if (aVar2 != null) {
                    this.f39410b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            l();
        } else if (this.f39416h) {
            this.f39410b.obtainMessage(2, aVar).sendToTarget();
        } else {
            this.f39423o = aVar;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [C7.m<android.graphics.Bitmap>, java.lang.Object, C7.m] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(C7.m<android.graphics.Bitmap> r3, android.graphics.Bitmap r4) {
        /*
            r2 = this;
            java.lang.Object r0 = Y7.k.d(r3)
            C7.m r0 = (C7.m) r0
            r2.f39422n = r0
            java.lang.Object r0 = Y7.k.d(r4)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r2.f39421m = r0
            com.bumptech.glide.k<android.graphics.Bitmap> r0 = r2.f39417i
            U7.g r1 = new U7.g
            r1.<init>()
            U7.a r3 = r1.p0(r3)
            com.bumptech.glide.k r3 = r0.a(r3)
            r2.f39417i = r3
            int r3 = Y7.l.h(r4)
            r2.f39424p = r3
            int r3 = r4.getWidth()
            r2.f39425q = r3
            int r3 = r4.getHeight()
            r2.f39426r = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P7.g.o(C7.m, android.graphics.Bitmap):void");
    }

    /* access modifiers changed from: package-private */
    public void r(b bVar) {
        if (this.f39419k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.f39411c.contains(bVar)) {
            boolean isEmpty = this.f39411c.isEmpty();
            this.f39411c.add(bVar);
            if (isEmpty) {
                p();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: package-private */
    public void s(b bVar) {
        this.f39411c.remove(bVar);
        if (this.f39411c.isEmpty()) {
            q();
        }
    }

    g(d dVar, l lVar, A7.a aVar, Handler handler, k<Bitmap> kVar, m<Bitmap> mVar, Bitmap bitmap) {
        this.f39411c = new ArrayList();
        this.f39412d = lVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f39413e = dVar;
        this.f39410b = handler;
        this.f39417i = kVar;
        this.f39409a = aVar;
        o(mVar, bitmap);
    }
}
