package androidx.compose.ui.graphics;

import androidx.recyclerview.widget.RecyclerView;
import c2.f;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import o1.C5673m;
import p1.C5747v0;
import p1.I0;
import p1.Q0;
import p1.c1;
import p1.d1;
import p1.i1;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R*\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u001b\u0010\u0015R*\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R*\u0010#\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0013\"\u0004\b\u001d\u0010\u0015R*\u0010%\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\t\u0010\u0013\"\u0004\b$\u0010\u0015R0\u0010,\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020&8\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+R0\u00100\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020&8\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R*\u00103\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0012\u001a\u0004\b2\u0010\u0013\"\u0004\b1\u0010\u0015R*\u00106\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0012\u001a\u0004\b5\u0010\u0013\"\u0004\b4\u0010\u0015R*\u00108\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0012\u001a\u0004\b!\u0010\u0013\"\u0004\b7\u0010\u0015R*\u0010:\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b9\u0010\u0013\"\u0004\b-\u0010\u0015R0\u0010?\u001a\u00020;2\u0006\u0010\u0010\u001a\u00020;8\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b<\u0010(\u001a\u0004\b=\u0010)\"\u0004\b>\u0010+R*\u0010E\u001a\u00020@2\u0006\u0010\u0010\u001a\u00020@8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010A\u001a\u0004\b(\u0010B\"\u0004\bC\u0010DR*\u0010K\u001a\u00020F2\u0006\u0010\u0010\u001a\u00020F8\u0016@VX\u000e¢\u0006\u0012\n\u0004\bG\u0010C\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR0\u0010P\u001a\u00020L2\u0006\u0010\u0010\u001a\u00020L8\u0016@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bM\u0010\t\u001a\u0004\bN\u0010\u000b\"\u0004\bO\u0010\rR(\u0010S\u001a\u00020Q8\u0016@\u0016X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bO\u0010(\u001a\u0004\b\u0011\u0010)\"\u0004\bR\u0010+R\"\u0010Z\u001a\u00020T8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b5\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR.\u0010j\u001a\u0004\u0018\u00010c2\b\u0010d\u001a\u0004\u0018\u00010c8\u0000@AX\u000e¢\u0006\u0012\n\u0004\bN\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\bk\u0010\u0013R\u0014\u0010n\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\bm\u0010\u0013R.\u0010p\u001a\u0004\u0018\u00010o2\b\u0010\u0010\u001a\u0004\u0018\u00010o8\u0016@VX\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\b<\u0010t\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006u"}, d2 = {"Landroidx/compose/ui/graphics/d;", "Landroidx/compose/ui/graphics/c;", "<init>", "()V", "LXH/N;", "P", "b0", "", "a", "I", "z", "()I", "setMutatedFields$ui_release", "(I)V", "mutatedFields", "", "value", "b", "F", "()F", "g", "(F)V", "scaleX", "c", "Q", "m", "scaleY", "d", "alpha", "e", "M", "o", "translationX", "f", "L", "translationY", "G", "shadowElevation", "Lp1/v0;", "h", "J", "()J", "v", "(J)V", "ambientShadowColor", "i", "K", "C", "spotShadowColor", "j", "N", "rotationX", "k", "s", "rotationY", "l", "rotationZ", "y", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "n", "B", "L0", "transformOrigin", "Lp1/i1;", "Lp1/i1;", "()Lp1/i1;", "Z", "(Lp1/i1;)V", "shape", "", "p", "()Z", "A", "(Z)V", "clip", "Landroidx/compose/ui/graphics/a;", "q", "u", "r", "compositingStrategy", "Lo1/m;", "Y", "size", "Lc2/d;", "Lc2/d;", "w", "()Lc2/d;", "T", "(Lc2/d;)V", "graphicsDensity", "Lc2/t;", "t", "Lc2/t;", "x", "()Lc2/t;", "V", "(Lc2/t;)V", "layoutDirection", "Lp1/Q0;", "<set-?>", "Lp1/Q0;", "D", "()Lp1/Q0;", "setOutline$ui_release", "(Lp1/Q0;)V", "outline", "getDensity", "density", "D1", "fontScale", "Lp1/d1;", "renderEffect", "Lp1/d1;", "E", "()Lp1/d1;", "(Lp1/d1;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private int f18906a;

    /* renamed from: b  reason: collision with root package name */
    private float f18907b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    private float f18908c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f18909d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f18910e;

    /* renamed from: f  reason: collision with root package name */
    private float f18911f;

    /* renamed from: g  reason: collision with root package name */
    private float f18912g;

    /* renamed from: h  reason: collision with root package name */
    private long f18913h = I0.a();

    /* renamed from: i  reason: collision with root package name */
    private long f18914i = I0.a();

    /* renamed from: j  reason: collision with root package name */
    private float f18915j;

    /* renamed from: k  reason: collision with root package name */
    private float f18916k;

    /* renamed from: l  reason: collision with root package name */
    private float f18917l;

    /* renamed from: m  reason: collision with root package name */
    private float f18918m = 8.0f;

    /* renamed from: n  reason: collision with root package name */
    private long f18919n = f.f18947b.a();

    /* renamed from: o  reason: collision with root package name */
    private i1 f18920o = c1.a();

    /* renamed from: p  reason: collision with root package name */
    private boolean f18921p;

    /* renamed from: q  reason: collision with root package name */
    private int f18922q = a.f18902a.a();

    /* renamed from: r  reason: collision with root package name */
    private long f18923r = C5673m.f26722b.a();

    /* renamed from: s  reason: collision with root package name */
    private c2.d f18924s = f.b(1.0f, 0.0f, 2, (Object) null);

    /* renamed from: t  reason: collision with root package name */
    private t f18925t = t.Ltr;

    /* renamed from: u  reason: collision with root package name */
    private Q0 f18926u;

    public void A(boolean z10) {
        if (this.f18921p != z10) {
            this.f18906a |= 16384;
            this.f18921p = z10;
        }
    }

    public long B() {
        return this.f18919n;
    }

    public void C(long j10) {
        if (!C5747v0.q(this.f18914i, j10)) {
            this.f18906a |= 128;
            this.f18914i = j10;
        }
    }

    public final Q0 D() {
        return this.f18926u;
    }

    public float D1() {
        return this.f18924s.D1();
    }

    public d1 E() {
        return null;
    }

    public float F() {
        return this.f18907b;
    }

    public void G(float f10) {
        if (this.f18912g != f10) {
            this.f18906a |= 32;
            this.f18912g = f10;
        }
    }

    public float I() {
        return this.f18912g;
    }

    public i1 J() {
        return this.f18920o;
    }

    public long K() {
        return this.f18914i;
    }

    public float L() {
        return this.f18911f;
    }

    public void L0(long j10) {
        if (!f.e(this.f18919n, j10)) {
            this.f18906a |= RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.f18919n = j10;
        }
    }

    public float M() {
        return this.f18910e;
    }

    public float N() {
        return this.f18915j;
    }

    public final void P() {
        g(1.0f);
        m(1.0f);
        d(1.0f);
        o(0.0f);
        e(0.0f);
        G(0.0f);
        v(I0.a());
        C(I0.a());
        j(0.0f);
        k(0.0f);
        l(0.0f);
        i(8.0f);
        L0(f.f18947b.a());
        Z(c1.a());
        A(false);
        n((d1) null);
        r(a.f18902a.a());
        Y(C5673m.f26722b.a());
        this.f18926u = null;
        this.f18906a = 0;
    }

    public float Q() {
        return this.f18908c;
    }

    public final void T(c2.d dVar) {
        this.f18924s = dVar;
    }

    public final void V(t tVar) {
        this.f18925t = tVar;
    }

    public void Y(long j10) {
        this.f18923r = j10;
    }

    public void Z(i1 i1Var) {
        if (!C17542s.e(this.f18920o, i1Var)) {
            this.f18906a |= 8192;
            this.f18920o = i1Var;
        }
    }

    public long b() {
        return this.f18923r;
    }

    public final void b0() {
        this.f18926u = J().a(b(), this.f18925t, this.f18924s);
    }

    public float c() {
        return this.f18909d;
    }

    public void d(float f10) {
        if (this.f18909d != f10) {
            this.f18906a |= 4;
            this.f18909d = f10;
        }
    }

    public void e(float f10) {
        if (this.f18911f != f10) {
            this.f18906a |= 16;
            this.f18911f = f10;
        }
    }

    public float f() {
        return this.f18917l;
    }

    public void g(float f10) {
        if (this.f18907b != f10) {
            this.f18906a |= 1;
            this.f18907b = f10;
        }
    }

    public float getDensity() {
        return this.f18924s.getDensity();
    }

    public long h() {
        return this.f18913h;
    }

    public void i(float f10) {
        if (this.f18918m != f10) {
            this.f18906a |= RecyclerView.n.FLAG_MOVED;
            this.f18918m = f10;
        }
    }

    public void j(float f10) {
        if (this.f18915j != f10) {
            this.f18906a |= 256;
            this.f18915j = f10;
        }
    }

    public void k(float f10) {
        if (this.f18916k != f10) {
            this.f18906a |= 512;
            this.f18916k = f10;
        }
    }

    public void l(float f10) {
        if (this.f18917l != f10) {
            this.f18906a |= 1024;
            this.f18917l = f10;
        }
    }

    public void m(float f10) {
        if (this.f18908c != f10) {
            this.f18906a |= 2;
            this.f18908c = f10;
        }
    }

    public void n(d1 d1Var) {
        if (!C17542s.e((Object) null, d1Var)) {
            this.f18906a |= 131072;
        }
    }

    public void o(float f10) {
        if (this.f18910e != f10) {
            this.f18906a |= 8;
            this.f18910e = f10;
        }
    }

    public boolean p() {
        return this.f18921p;
    }

    public void r(int i10) {
        if (!a.e(this.f18922q, i10)) {
            this.f18906a |= 32768;
            this.f18922q = i10;
        }
    }

    public float s() {
        return this.f18916k;
    }

    public int u() {
        return this.f18922q;
    }

    public void v(long j10) {
        if (!C5747v0.q(this.f18913h, j10)) {
            this.f18906a |= 64;
            this.f18913h = j10;
        }
    }

    public final c2.d w() {
        return this.f18924s;
    }

    public final t x() {
        return this.f18925t;
    }

    public float y() {
        return this.f18918m;
    }

    public final int z() {
        return this.f18906a;
    }
}
