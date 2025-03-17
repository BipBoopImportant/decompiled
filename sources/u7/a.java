package U7;

import C7.f;
import C7.h;
import C7.i;
import C7.m;
import E7.j;
import L7.k;
import L7.r;
import U7.a;
import X7.c;
import Y7.b;
import Y7.l;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.g;
import com.google.ar.core.ImageMetadata;
import java.util.Map;

public abstract class a<T extends a<T>> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private int f40300a;

    /* renamed from: b  reason: collision with root package name */
    private float f40301b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    private j f40302c = j.f35111e;

    /* renamed from: d  reason: collision with root package name */
    private g f40303d = g.NORMAL;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f40304e;

    /* renamed from: f  reason: collision with root package name */
    private int f40305f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f40306g;

    /* renamed from: h  reason: collision with root package name */
    private int f40307h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f40308i = true;

    /* renamed from: j  reason: collision with root package name */
    private int f40309j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f40310k = -1;

    /* renamed from: l  reason: collision with root package name */
    private f f40311l = c.c();

    /* renamed from: m  reason: collision with root package name */
    private boolean f40312m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f40313n = true;

    /* renamed from: o  reason: collision with root package name */
    private Drawable f40314o;

    /* renamed from: p  reason: collision with root package name */
    private int f40315p;

    /* renamed from: q  reason: collision with root package name */
    private i f40316q = new i();

    /* renamed from: r  reason: collision with root package name */
    private Map<Class<?>, m<?>> f40317r = new b();

    /* renamed from: s  reason: collision with root package name */
    private Class<?> f40318s = Object.class;

    /* renamed from: t  reason: collision with root package name */
    private boolean f40319t;

    /* renamed from: u  reason: collision with root package name */
    private Resources.Theme f40320u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f40321v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f40322w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f40323x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f40324y = true;

    /* renamed from: z  reason: collision with root package name */
    private boolean f40325z;

    private boolean P(int i10) {
        return Q(this.f40300a, i10);
    }

    private static boolean Q(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [C7.m<android.graphics.Bitmap>, C7.m] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private T a0(L7.m r2, C7.m<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            r0 = 0
            U7.a r2 = r1.g0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.a.a0(L7.m, C7.m):U7.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [C7.m<android.graphics.Bitmap>, C7.m] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private T g0(L7.m r1, C7.m<android.graphics.Bitmap> r2, boolean r3) {
        /*
            r0 = this;
            if (r3 == 0) goto L_0x0007
            U7.a r1 = r0.r0(r1, r2)
            goto L_0x000b
        L_0x0007:
            U7.a r1 = r0.b0(r1, r2)
        L_0x000b:
            r2 = 1
            r1.f40324y = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.a.g0(L7.m, C7.m, boolean):U7.a");
    }

    private T h0() {
        return this;
    }

    public final Class<?> A() {
        return this.f40318s;
    }

    public final f C() {
        return this.f40311l;
    }

    public final float D() {
        return this.f40301b;
    }

    public final Resources.Theme E() {
        return this.f40320u;
    }

    public final Map<Class<?>, m<?>> G() {
        return this.f40317r;
    }

    public final boolean H() {
        return this.f40325z;
    }

    public final boolean I() {
        return this.f40322w;
    }

    /* access modifiers changed from: protected */
    public final boolean K() {
        return this.f40321v;
    }

    public final boolean L(a<?> aVar) {
        return Float.compare(aVar.f40301b, this.f40301b) == 0 && this.f40305f == aVar.f40305f && l.d(this.f40304e, aVar.f40304e) && this.f40307h == aVar.f40307h && l.d(this.f40306g, aVar.f40306g) && this.f40315p == aVar.f40315p && l.d(this.f40314o, aVar.f40314o) && this.f40308i == aVar.f40308i && this.f40309j == aVar.f40309j && this.f40310k == aVar.f40310k && this.f40312m == aVar.f40312m && this.f40313n == aVar.f40313n && this.f40322w == aVar.f40322w && this.f40323x == aVar.f40323x && this.f40302c.equals(aVar.f40302c) && this.f40303d == aVar.f40303d && this.f40316q.equals(aVar.f40316q) && this.f40317r.equals(aVar.f40317r) && this.f40318s.equals(aVar.f40318s) && l.d(this.f40311l, aVar.f40311l) && l.d(this.f40320u, aVar.f40320u);
    }

    public final boolean M() {
        return this.f40308i;
    }

    public final boolean N() {
        return P(8);
    }

    /* access modifiers changed from: package-private */
    public boolean O() {
        return this.f40324y;
    }

    public final boolean R() {
        return this.f40313n;
    }

    public final boolean S() {
        return this.f40312m;
    }

    public final boolean T() {
        return P(RecyclerView.n.FLAG_MOVED);
    }

    public final boolean V() {
        return l.u(this.f40310k, this.f40309j);
    }

    public T W() {
        this.f40319t = true;
        return h0();
    }

    public T X() {
        return b0(L7.m.f38400e, new L7.j());
    }

    public T Y() {
        return a0(L7.m.f38399d, new k());
    }

    public T Z() {
        return a0(L7.m.f38398c, new r());
    }

    public T a(a<?> aVar) {
        if (this.f40321v) {
            return clone().a(aVar);
        }
        if (Q(aVar.f40300a, 2)) {
            this.f40301b = aVar.f40301b;
        }
        if (Q(aVar.f40300a, 262144)) {
            this.f40322w = aVar.f40322w;
        }
        if (Q(aVar.f40300a, ImageMetadata.SHADING_MODE)) {
            this.f40325z = aVar.f40325z;
        }
        if (Q(aVar.f40300a, 4)) {
            this.f40302c = aVar.f40302c;
        }
        if (Q(aVar.f40300a, 8)) {
            this.f40303d = aVar.f40303d;
        }
        if (Q(aVar.f40300a, 16)) {
            this.f40304e = aVar.f40304e;
            this.f40305f = 0;
            this.f40300a &= -33;
        }
        if (Q(aVar.f40300a, 32)) {
            this.f40305f = aVar.f40305f;
            this.f40304e = null;
            this.f40300a &= -17;
        }
        if (Q(aVar.f40300a, 64)) {
            this.f40306g = aVar.f40306g;
            this.f40307h = 0;
            this.f40300a &= -129;
        }
        if (Q(aVar.f40300a, 128)) {
            this.f40307h = aVar.f40307h;
            this.f40306g = null;
            this.f40300a &= -65;
        }
        if (Q(aVar.f40300a, 256)) {
            this.f40308i = aVar.f40308i;
        }
        if (Q(aVar.f40300a, 512)) {
            this.f40310k = aVar.f40310k;
            this.f40309j = aVar.f40309j;
        }
        if (Q(aVar.f40300a, 1024)) {
            this.f40311l = aVar.f40311l;
        }
        if (Q(aVar.f40300a, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            this.f40318s = aVar.f40318s;
        }
        if (Q(aVar.f40300a, 8192)) {
            this.f40314o = aVar.f40314o;
            this.f40315p = 0;
            this.f40300a &= -16385;
        }
        if (Q(aVar.f40300a, 16384)) {
            this.f40315p = aVar.f40315p;
            this.f40314o = null;
            this.f40300a &= -8193;
        }
        if (Q(aVar.f40300a, 32768)) {
            this.f40320u = aVar.f40320u;
        }
        if (Q(aVar.f40300a, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE)) {
            this.f40313n = aVar.f40313n;
        }
        if (Q(aVar.f40300a, 131072)) {
            this.f40312m = aVar.f40312m;
        }
        if (Q(aVar.f40300a, RecyclerView.n.FLAG_MOVED)) {
            this.f40317r.putAll(aVar.f40317r);
            this.f40324y = aVar.f40324y;
        }
        if (Q(aVar.f40300a, ImageMetadata.LENS_APERTURE)) {
            this.f40323x = aVar.f40323x;
        }
        if (!this.f40313n) {
            this.f40317r.clear();
            int i10 = this.f40300a;
            this.f40312m = false;
            this.f40300a = i10 & -133121;
            this.f40324y = true;
        }
        this.f40300a |= aVar.f40300a;
        this.f40316q.d(aVar.f40316q);
        return i0();
    }

    public T b() {
        if (!this.f40319t || this.f40321v) {
            this.f40321v = true;
            return W();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [C7.m<android.graphics.Bitmap>, C7.m] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T b0(L7.m r2, C7.m<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f40321v
            if (r0 == 0) goto L_0x000d
            U7.a r0 = r1.clone()
            U7.a r2 = r0.b0(r2, r3)
            return r2
        L_0x000d:
            r1.f(r2)
            r2 = 0
            U7.a r2 = r1.q0(r3, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.a.b0(L7.m, C7.m):U7.a");
    }

    /* renamed from: c */
    public T clone() {
        try {
            T t10 = (a) super.clone();
            i iVar = new i();
            t10.f40316q = iVar;
            iVar.d(this.f40316q);
            b bVar = new b();
            t10.f40317r = bVar;
            bVar.putAll(this.f40317r);
            t10.f40319t = false;
            t10.f40321v = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public T c0(int i10, int i11) {
        if (this.f40321v) {
            return clone().c0(i10, i11);
        }
        this.f40310k = i10;
        this.f40309j = i11;
        this.f40300a |= 512;
        return i0();
    }

    public T d(Class<?> cls) {
        if (this.f40321v) {
            return clone().d(cls);
        }
        this.f40318s = (Class) Y7.k.d(cls);
        this.f40300a |= RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
        return i0();
    }

    public T d0(Drawable drawable) {
        if (this.f40321v) {
            return clone().d0(drawable);
        }
        this.f40306g = drawable;
        this.f40307h = 0;
        this.f40300a = (this.f40300a | 64) & -129;
        return i0();
    }

    public T e(j jVar) {
        if (this.f40321v) {
            return clone().e(jVar);
        }
        this.f40302c = (j) Y7.k.d(jVar);
        this.f40300a |= 4;
        return i0();
    }

    public T e0(g gVar) {
        if (this.f40321v) {
            return clone().e0(gVar);
        }
        this.f40303d = (g) Y7.k.d(gVar);
        this.f40300a |= 8;
        return i0();
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return L((a) obj);
        }
        return false;
    }

    public T f(L7.m mVar) {
        return j0(L7.m.f38403h, Y7.k.d(mVar));
    }

    /* access modifiers changed from: package-private */
    public T f0(h<?> hVar) {
        if (this.f40321v) {
            return clone().f0(hVar);
        }
        this.f40316q.e(hVar);
        return i0();
    }

    public int hashCode() {
        return l.p(this.f40320u, l.p(this.f40311l, l.p(this.f40318s, l.p(this.f40317r, l.p(this.f40316q, l.p(this.f40303d, l.p(this.f40302c, l.q(this.f40323x, l.q(this.f40322w, l.q(this.f40313n, l.q(this.f40312m, l.o(this.f40310k, l.o(this.f40309j, l.q(this.f40308i, l.p(this.f40314o, l.o(this.f40315p, l.p(this.f40306g, l.o(this.f40307h, l.p(this.f40304e, l.o(this.f40305f, l.l(this.f40301b)))))))))))))))))))));
    }

    /* access modifiers changed from: protected */
    public final T i0() {
        if (!this.f40319t) {
            return h0();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public T j(int i10) {
        if (this.f40321v) {
            return clone().j(i10);
        }
        this.f40305f = i10;
        this.f40304e = null;
        this.f40300a = (this.f40300a | 32) & -17;
        return i0();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [C7.h, C7.h<Y>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T j0(C7.h<Y> r2, Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.f40321v
            if (r0 == 0) goto L_0x000d
            U7.a r0 = r1.clone()
            U7.a r2 = r0.j0(r2, r3)
            return r2
        L_0x000d:
            Y7.k.d(r2)
            Y7.k.d(r3)
            C7.i r0 = r1.f40316q
            r0.f(r2, r3)
            U7.a r2 = r1.i0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.a.j0(C7.h, java.lang.Object):U7.a");
    }

    public final j k() {
        return this.f40302c;
    }

    public T k0(f fVar) {
        if (this.f40321v) {
            return clone().k0(fVar);
        }
        this.f40311l = (f) Y7.k.d(fVar);
        this.f40300a |= 1024;
        return i0();
    }

    public final int l() {
        return this.f40305f;
    }

    public T l0(float f10) {
        if (this.f40321v) {
            return clone().l0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f40301b = f10;
        this.f40300a |= 2;
        return i0();
    }

    public final Drawable m() {
        return this.f40304e;
    }

    public T m0(boolean z10) {
        if (this.f40321v) {
            return clone().m0(true);
        }
        this.f40308i = !z10;
        this.f40300a |= 256;
        return i0();
    }

    public final Drawable n() {
        return this.f40314o;
    }

    public T n0(Resources.Theme theme) {
        if (this.f40321v) {
            return clone().n0(theme);
        }
        this.f40320u = theme;
        if (theme != null) {
            this.f40300a |= 32768;
            return j0(N7.j.f39162b, theme);
        }
        this.f40300a &= -32769;
        return f0(N7.j.f39162b);
    }

    public final int o() {
        return this.f40315p;
    }

    public T o0(int i10) {
        return j0(J7.a.f37378b, Integer.valueOf(i10));
    }

    public final boolean p() {
        return this.f40323x;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [C7.m<android.graphics.Bitmap>, C7.m] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T p0(C7.m<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 1
            U7.a r2 = r1.q0(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.a.p0(C7.m):U7.a");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [C7.m<android.graphics.Bitmap>, C7.m] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T q0(C7.m<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f40321v
            if (r0 == 0) goto L_0x000d
            U7.a r0 = r2.clone()
            U7.a r3 = r0.q0(r3, r4)
            return r3
        L_0x000d:
            L7.p r0 = new L7.p
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.s0(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.s0(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            C7.m r0 = r0.c()
            r2.s0(r1, r0, r4)
            P7.f r0 = new P7.f
            r0.<init>(r3)
            java.lang.Class<P7.c> r3 = P7.c.class
            r2.s0(r3, r0, r4)
            U7.a r3 = r2.i0()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.a.q0(C7.m, boolean):U7.a");
    }

    public final i r() {
        return this.f40316q;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [C7.m<android.graphics.Bitmap>, C7.m] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T r0(L7.m r2, C7.m<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f40321v
            if (r0 == 0) goto L_0x000d
            U7.a r0 = r1.clone()
            U7.a r2 = r0.r0(r2, r3)
            return r2
        L_0x000d:
            r1.f(r2)
            U7.a r2 = r1.p0(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.a.r0(L7.m, C7.m):U7.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [C7.m<Y>, java.lang.Object, C7.m] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T s0(java.lang.Class<Y> r2, C7.m<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.f40321v
            if (r0 == 0) goto L_0x000d
            U7.a r0 = r1.clone()
            U7.a r2 = r0.s0(r2, r3, r4)
            return r2
        L_0x000d:
            Y7.k.d(r2)
            Y7.k.d(r3)
            java.util.Map<java.lang.Class<?>, C7.m<?>> r0 = r1.f40317r
            r0.put(r2, r3)
            int r2 = r1.f40300a
            r3 = 1
            r1.f40313n = r3
            r0 = 67584(0x10800, float:9.4705E-41)
            r0 = r0 | r2
            r1.f40300a = r0
            r0 = 0
            r1.f40324y = r0
            if (r4 == 0) goto L_0x0030
            r4 = 198656(0x30800, float:2.78376E-40)
            r2 = r2 | r4
            r1.f40300a = r2
            r1.f40312m = r3
        L_0x0030:
            U7.a r2 = r1.i0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.a.s0(java.lang.Class, C7.m, boolean):U7.a");
    }

    public final int u() {
        return this.f40309j;
    }

    public T u0(boolean z10) {
        if (this.f40321v) {
            return clone().u0(z10);
        }
        this.f40325z = z10;
        this.f40300a |= ImageMetadata.SHADING_MODE;
        return i0();
    }

    public final int v() {
        return this.f40310k;
    }

    public final Drawable w() {
        return this.f40306g;
    }

    public final int y() {
        return this.f40307h;
    }

    public final g z() {
        return this.f40303d;
    }
}
