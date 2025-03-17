package u0;

import E1.a0;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.b;
import c2.n;
import c2.o;
import c2.s;
import c2.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import s1.C5905c;
import tI.C17978n;
import v0.z;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J/\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J=\u0010+\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020&2\u0006\u0010-\u001a\u00020\u0003¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020&2\u0006\u00100\u001a\u00020\u0003¢\u0006\u0004\b1\u0010/J\u0015\u00104\u001a\u00020&2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bB\u00107\u001a\u0004\bC\u00109R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u00107R\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u00107R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010\u0014\u001a\u00020\u00138\u0002X\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b'\u0010JR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\bK\u0010;\u001a\u0004\bL\u0010=R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010MR \u0010\u0019\u001a\u00020\u00188\u0016X\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b \u0010J\u001a\u0004\b:\u0010NR\u001a\u0010\u001a\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\bO\u00107\u001a\u0004\bO\u00109R\u001a\u0010\u001b\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\bE\u00109R\u0017\u0010R\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bP\u00107\u001a\u0004\bQ\u00109R\u001a\u0010S\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\bQ\u00107\u001a\u0004\bK\u00109R\u0016\u0010-\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bT\u00107R\u0016\u0010V\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bU\u00107R\u0016\u0010W\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00107R \u0010Y\u001a\u00020X8\u0016X\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b+\u0010J\u001a\u0004\b6\u0010NR*\u0010[\u001a\u00020\u00132\u0006\u0010Z\u001a\u00020\u00138\u0016@RX\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b.\u0010J\u001a\u0004\b>\u0010NR$\u0010)\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020\u00038\u0016@RX\u000e¢\u0006\f\n\u0004\b\\\u00107\u001a\u0004\bG\u00109R$\u0010*\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020\u00038\u0016@RX\u000e¢\u0006\f\n\u0004\b]\u00107\u001a\u0004\bH\u00109R\"\u0010`\u001a\u00020\u00078\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b^\u0010?\u001a\u0004\bU\u0010A\"\u0004\bD\u0010_R\u0018\u0010b\u001a\u00020\u0003*\u00020\u00138BX\u0004¢\u0006\u0006\u001a\u0004\bP\u0010aR\u0018\u0010R\u001a\u00020\u0003*\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\bT\u0010cR\u0014\u0010d\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\bB\u00109\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006e"}, d2 = {"Lu0/v;", "Lu0/k;", "Lv0/z;", "", "index", "", "key", "", "isVertical", "crossAxisSize", "mainAxisSpacing", "reverseLayout", "Lc2/t;", "layoutDirection", "beforeContentPadding", "afterContentPadding", "", "LE1/a0;", "placeables", "Lc2/n;", "visualOffset", "contentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Lc2/b;", "constraints", "lane", "span", "<init>", "(ILjava/lang/Object;ZIIZLc2/t;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "l", "(I)Ljava/lang/Object;", "m", "(I)J", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "LXH/N;", "j", "(IIII)V", "row", "column", "u", "(IIIIII)V", "mainAxisLayoutSize", "v", "(I)V", "delta", "o", "LE1/a0$a;", "scope", "t", "(LE1/a0$a;)V", "a", "I", "getIndex", "()I", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "c", "Z", "h", "()Z", "d", "getCrossAxisSize", "e", "f", "Lc2/t;", "g", "i", "Ljava/util/List;", "J", "k", "getContentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "()J", "n", "p", "q", "mainAxisSize", "mainAxisSizeWithSpacings", "r", "s", "minMainAxisOffset", "maxMainAxisOffset", "Lc2/r;", "size", "<set-?>", "offset", "w", "x", "y", "(Z)V", "nonScrollableItem", "(J)I", "mainAxis", "(LE1/a0;)I", "placeablesCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.v  reason: case insensitive filesystem */
public final class C5998v implements C5987k, z {

    /* renamed from: a  reason: collision with root package name */
    private final int f29757a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f29758b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f29759c;

    /* renamed from: d  reason: collision with root package name */
    private final int f29760d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f29761e;

    /* renamed from: f  reason: collision with root package name */
    private final t f29762f;

    /* renamed from: g  reason: collision with root package name */
    private final int f29763g;

    /* renamed from: h  reason: collision with root package name */
    private final int f29764h;

    /* renamed from: i  reason: collision with root package name */
    private final List<a0> f29765i;

    /* renamed from: j  reason: collision with root package name */
    private final long f29766j;

    /* renamed from: k  reason: collision with root package name */
    private final Object f29767k;

    /* renamed from: l  reason: collision with root package name */
    private final LazyLayoutItemAnimator<C5998v> f29768l;

    /* renamed from: m  reason: collision with root package name */
    private final long f29769m;

    /* renamed from: n  reason: collision with root package name */
    private final int f29770n;

    /* renamed from: o  reason: collision with root package name */
    private final int f29771o;

    /* renamed from: p  reason: collision with root package name */
    private final int f29772p;

    /* renamed from: q  reason: collision with root package name */
    private final int f29773q;

    /* renamed from: r  reason: collision with root package name */
    private int f29774r;

    /* renamed from: s  reason: collision with root package name */
    private int f29775s;

    /* renamed from: t  reason: collision with root package name */
    private int f29776t;

    /* renamed from: u  reason: collision with root package name */
    private final long f29777u;

    /* renamed from: v  reason: collision with root package name */
    private long f29778v;

    /* renamed from: w  reason: collision with root package name */
    private int f29779w;

    /* renamed from: x  reason: collision with root package name */
    private int f29780x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f29781y;

    public /* synthetic */ C5998v(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, t tVar, int i13, int i14, List list, long j10, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, obj, z10, i11, i12, z11, tVar, i13, i14, list, j10, obj2, lazyLayoutItemAnimator, j11, i15, i16);
    }

    private final int p(long j10) {
        return h() ? n.i(j10) : n.h(j10);
    }

    private final int r(a0 a0Var) {
        return h() ? a0Var.z0() : a0Var.E0();
    }

    public long a() {
        return this.f29777u;
    }

    public long b() {
        return this.f29769m;
    }

    public long c() {
        return this.f29778v;
    }

    public int d() {
        return this.f29765i.size();
    }

    public void e(boolean z10) {
        this.f29781y = z10;
    }

    public int f() {
        return this.f29771o;
    }

    public int g() {
        return this.f29779w;
    }

    public int getIndex() {
        return this.f29757a;
    }

    public Object getKey() {
        return this.f29758b;
    }

    public boolean h() {
        return this.f29759c;
    }

    public int i() {
        return this.f29780x;
    }

    public void j(int i10, int i11, int i12, int i13) {
        u(i10, i11, i12, i13, -1, -1);
    }

    public int k() {
        return this.f29773q;
    }

    public Object l(int i10) {
        return this.f29765i.get(i10).h();
    }

    public long m(int i10) {
        return c();
    }

    public int n() {
        return this.f29770n;
    }

    public final void o(int i10) {
        if (!s()) {
            long c10 = c();
            int h10 = h() ? n.h(c10) : n.h(c10) + i10;
            boolean h11 = h();
            int i11 = n.i(c10);
            if (h11) {
                i11 += i10;
            }
            this.f29778v = o.a(h10, i11);
            int d10 = d();
            for (int i12 = 0; i12 < d10; i12++) {
                b e10 = this.f29768l.e(getKey(), i12);
                if (e10 != null) {
                    long s10 = e10.s();
                    int h12 = h() ? n.h(s10) : Integer.valueOf(n.h(s10) + i10).intValue();
                    boolean h13 = h();
                    int i13 = n.i(s10);
                    if (h13) {
                        i13 += i10;
                    }
                    e10.J(o.a(h12, i13));
                }
            }
        }
    }

    public final int q() {
        return this.f29772p;
    }

    public boolean s() {
        return this.f29781y;
    }

    public final void t(a0.a aVar) {
        C5905c cVar;
        int i10;
        int i11;
        if (this.f29774r != Integer.MIN_VALUE) {
            int d10 = d();
            for (int i12 = 0; i12 < d10; i12++) {
                a0 a0Var = this.f29765i.get(i12);
                int r10 = this.f29775s - r(a0Var);
                int i13 = this.f29776t;
                long c10 = c();
                b e10 = this.f29768l.e(getKey(), i12);
                if (e10 != null) {
                    long l10 = n.l(c10, e10.r());
                    if ((p(c10) <= r10 && p(l10) <= r10) || (p(c10) >= i13 && p(l10) >= i13)) {
                        e10.n();
                    }
                    cVar = e10.p();
                    c10 = l10;
                } else {
                    cVar = null;
                }
                if (this.f29761e) {
                    if (h()) {
                        i10 = n.h(c10);
                    } else {
                        i10 = (this.f29774r - n.h(c10)) - r(a0Var);
                    }
                    if (h()) {
                        i11 = (this.f29774r - n.i(c10)) - r(a0Var);
                    } else {
                        i11 = n.i(c10);
                    }
                    c10 = o.a(i10, i11);
                }
                long l11 = n.l(c10, this.f29766j);
                if (e10 != null) {
                    e10.E(l11);
                }
                if (h()) {
                    if (cVar != null) {
                        a0.a.A(aVar, a0Var, l11, cVar, 0.0f, 4, (Object) null);
                    } else {
                        a0.a.z(aVar, a0Var, l11, 0.0f, (C17642l) null, 6, (Object) null);
                    }
                } else if (cVar != null) {
                    a0.a.u(aVar, a0Var, l11, cVar, 0.0f, 4, (Object) null);
                } else {
                    a0.a.t(aVar, a0Var, l11, 0.0f, (C17642l) null, 6, (Object) null);
                }
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first");
    }

    public final void u(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f29774r = h() ? i13 : i12;
        if (!h()) {
            i12 = i13;
        }
        if (h() && this.f29762f == t.Rtl) {
            i11 = (i12 - i11) - this.f29760d;
        }
        this.f29778v = h() ? o.a(i11, i10) : o.a(i10, i11);
        this.f29779w = i14;
        this.f29780x = i15;
        this.f29775s = -this.f29763g;
        this.f29776t = this.f29774r + this.f29764h;
    }

    public final void v(int i10) {
        this.f29774r = i10;
        this.f29776t = i10 + this.f29764h;
    }

    private C5998v(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, t tVar, int i13, int i14, List<? extends a0> list, long j10, Object obj2, LazyLayoutItemAnimator<C5998v> lazyLayoutItemAnimator, long j11, int i15, int i16) {
        long j12;
        List<? extends a0> list2 = list;
        this.f29757a = i10;
        this.f29758b = obj;
        this.f29759c = z10;
        this.f29760d = i11;
        this.f29761e = z11;
        this.f29762f = tVar;
        this.f29763g = i13;
        this.f29764h = i14;
        this.f29765i = list2;
        this.f29766j = j10;
        this.f29767k = obj2;
        this.f29768l = lazyLayoutItemAnimator;
        this.f29769m = j11;
        this.f29770n = i15;
        this.f29771o = i16;
        this.f29774r = Integer.MIN_VALUE;
        int size = list.size();
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            a0 a0Var = (a0) list2.get(i18);
            i17 = Math.max(i17, h() ? a0Var.z0() : a0Var.E0());
        }
        this.f29772p = i17;
        this.f29773q = C17978n.e(i17 + i12, 0);
        if (h()) {
            j12 = s.a(this.f29760d, i17);
        } else {
            j12 = s.a(i17, this.f29760d);
        }
        this.f29777u = j12;
        this.f29778v = n.f23044b.a();
        this.f29779w = -1;
        this.f29780x = -1;
    }
}
