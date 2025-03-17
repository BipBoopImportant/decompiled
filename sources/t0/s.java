package t0;

import E1.a0;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.b;
import c2.n;
import c2.o;
import c2.t;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import s1.C5905c;
import tI.C17978n;
import v0.z;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0015\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020%2\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u00020%2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b1\u00102J\u001d\u00106\u001a\u00020%2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\b¢\u0006\u0004\b6\u00107R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010?R\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u00109R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u00109R\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u00109R\u001a\u0010\u0015\u001a\u00020\u00148\u0002X\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010K\u001a\u0004\bN\u0010MR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR \u0010\u001c\u001a\u00020\u001b8\u0016X\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bQ\u0010J\u001a\u0004\b<\u0010RR$\u0010U\u001a\u00020\u00032\u0006\u0010S\u001a\u00020\u00038\u0016@RX\u000e¢\u0006\f\n\u0004\bT\u00109\u001a\u0004\b>\u0010;R\u001a\u0010W\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\bV\u00109\u001a\u0004\b8\u0010;R\u001a\u0010X\u001a\u00020\u00038\u0016XD¢\u0006\f\n\u0004\b6\u00109\u001a\u0004\bO\u0010;R\u001a\u0010Y\u001a\u00020\u00038\u0016XD¢\u0006\f\n\u0004\b(\u00109\u001a\u0004\bF\u0010;R\u001a\u0010Z\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b+\u00109\u001a\u0004\bI\u0010;R\u0017\u0010\\\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b[\u00109\u001a\u0004\bH\u0010;R\"\u0010_\u001a\u00020\b8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\bV\u0010A\"\u0004\bD\u0010^R\u0016\u0010*\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b`\u00109R\u0016\u0010b\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\ba\u00109R\u0016\u0010d\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bc\u00109R\u0014\u0010h\u001a\u00020e8\u0002X\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010j\u001a\u00020\u0003*\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010iR\u0018\u0010l\u001a\u00020\u0003*\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bT\u0010kR\u0014\u0010m\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\bB\u0010;\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006n"}, d2 = {"Lt0/s;", "Lt0/k;", "Lv0/z;", "", "index", "", "LE1/a0;", "placeables", "", "isVertical", "Li1/c$b;", "horizontalAlignment", "Li1/c$c;", "verticalAlignment", "Lc2/t;", "layoutDirection", "reverseLayout", "beforeContentPadding", "afterContentPadding", "spacing", "Lc2/n;", "visualOffset", "", "key", "contentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Lc2/b;", "constraints", "<init>", "(ILjava/util/List;ZLi1/c$b;Li1/c$c;Lc2/t;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "l", "(I)Ljava/lang/Object;", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "LXH/N;", "j", "(IIII)V", "s", "(III)V", "mainAxisLayoutSize", "t", "(I)V", "m", "(I)J", "delta", "updateAnimations", "g", "(IZ)V", "LE1/a0$a;", "scope", "isLookingAhead", "r", "(LE1/a0$a;Z)V", "a", "I", "getIndex", "()I", "b", "Ljava/util/List;", "c", "Z", "h", "()Z", "d", "Li1/c$b;", "e", "Li1/c$c;", "f", "Lc2/t;", "i", "k", "J", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "getContentType", "n", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "o", "()J", "<set-?>", "p", "offset", "q", "size", "lane", "span", "mainAxisSizeWithSpacings", "u", "crossAxisSize", "v", "(Z)V", "nonScrollableItem", "w", "x", "minMainAxisOffset", "y", "maxMainAxisOffset", "", "z", "[I", "placeableOffsets", "(J)I", "mainAxis", "(LE1/a0;)I", "mainAxisSize", "placeablesCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s implements k, z {

    /* renamed from: a  reason: collision with root package name */
    private final int f29280a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a0> f29281b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f29282c;

    /* renamed from: d  reason: collision with root package name */
    private final C5437c.b f29283d;

    /* renamed from: e  reason: collision with root package name */
    private final C5437c.C0386c f29284e;

    /* renamed from: f  reason: collision with root package name */
    private final t f29285f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f29286g;

    /* renamed from: h  reason: collision with root package name */
    private final int f29287h;

    /* renamed from: i  reason: collision with root package name */
    private final int f29288i;

    /* renamed from: j  reason: collision with root package name */
    private final int f29289j;

    /* renamed from: k  reason: collision with root package name */
    private final long f29290k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f29291l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f29292m;

    /* renamed from: n  reason: collision with root package name */
    private final LazyLayoutItemAnimator<s> f29293n;

    /* renamed from: o  reason: collision with root package name */
    private final long f29294o;

    /* renamed from: p  reason: collision with root package name */
    private int f29295p;

    /* renamed from: q  reason: collision with root package name */
    private final int f29296q;

    /* renamed from: r  reason: collision with root package name */
    private final int f29297r;

    /* renamed from: s  reason: collision with root package name */
    private final int f29298s;

    /* renamed from: t  reason: collision with root package name */
    private final int f29299t;

    /* renamed from: u  reason: collision with root package name */
    private final int f29300u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f29301v;

    /* renamed from: w  reason: collision with root package name */
    private int f29302w;

    /* renamed from: x  reason: collision with root package name */
    private int f29303x;

    /* renamed from: y  reason: collision with root package name */
    private int f29304y;

    /* renamed from: z  reason: collision with root package name */
    private final int[] f29305z;

    public /* synthetic */ s(int i10, List list, boolean z10, C5437c.b bVar, C5437c.C0386c cVar, t tVar, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, list, z10, bVar, cVar, tVar, z11, i11, i12, i13, j10, obj, obj2, lazyLayoutItemAnimator, j11);
    }

    private final int o(long j10) {
        return h() ? n.i(j10) : n.h(j10);
    }

    private final int p(a0 a0Var) {
        return h() ? a0Var.z0() : a0Var.E0();
    }

    public int a() {
        return this.f29296q;
    }

    public long b() {
        return this.f29294o;
    }

    public int c() {
        return this.f29295p;
    }

    public int d() {
        return this.f29281b.size();
    }

    public void e(boolean z10) {
        this.f29301v = z10;
    }

    public int f() {
        return this.f29298s;
    }

    public final void g(int i10, boolean z10) {
        if (!q()) {
            this.f29295p = c() + i10;
            int length = this.f29305z.length;
            for (int i11 = 0; i11 < length; i11++) {
                if ((h() && i11 % 2 == 1) || (!h() && i11 % 2 == 0)) {
                    int[] iArr = this.f29305z;
                    iArr[i11] = iArr[i11] + i10;
                }
            }
            if (z10) {
                int d10 = d();
                for (int i12 = 0; i12 < d10; i12++) {
                    b e10 = this.f29293n.e(getKey(), i12);
                    if (e10 != null) {
                        long s10 = e10.s();
                        int h10 = h() ? n.h(s10) : Integer.valueOf(n.h(s10) + i10).intValue();
                        boolean h11 = h();
                        int i13 = n.i(s10);
                        if (h11) {
                            i13 += i10;
                        }
                        e10.J(o.a(h10, i13));
                    }
                }
            }
        }
    }

    public int getIndex() {
        return this.f29280a;
    }

    public Object getKey() {
        return this.f29291l;
    }

    public boolean h() {
        return this.f29282c;
    }

    public final int i() {
        return this.f29300u;
    }

    public void j(int i10, int i11, int i12, int i13) {
        s(i10, i12, i13);
    }

    public int k() {
        return this.f29299t;
    }

    public Object l(int i10) {
        return this.f29281b.get(i10).h();
    }

    public long m(int i10) {
        int[] iArr = this.f29305z;
        int i11 = i10 * 2;
        return o.a(iArr[i11], iArr[i11 + 1]);
    }

    public int n() {
        return this.f29297r;
    }

    public boolean q() {
        return this.f29301v;
    }

    public final void r(a0.a aVar, boolean z10) {
        C5905c cVar;
        int i10;
        int i11;
        if (this.f29302w != Integer.MIN_VALUE) {
            int d10 = d();
            for (int i12 = 0; i12 < d10; i12++) {
                a0 a0Var = this.f29281b.get(i12);
                int p10 = this.f29303x - p(a0Var);
                int i13 = this.f29304y;
                long m10 = m(i12);
                b e10 = this.f29293n.e(getKey(), i12);
                if (e10 != null) {
                    if (z10) {
                        e10.F(m10);
                    } else {
                        if (!n.g(e10.q(), b.f18292s.a())) {
                            m10 = e10.q();
                        }
                        long l10 = n.l(m10, e10.r());
                        if ((o(m10) <= p10 && o(l10) <= p10) || (o(m10) >= i13 && o(l10) >= i13)) {
                            e10.n();
                        }
                        m10 = l10;
                    }
                    cVar = e10.p();
                } else {
                    cVar = null;
                }
                if (this.f29286g) {
                    if (h()) {
                        i10 = n.h(m10);
                    } else {
                        i10 = (this.f29302w - n.h(m10)) - p(a0Var);
                    }
                    if (h()) {
                        i11 = (this.f29302w - n.i(m10)) - p(a0Var);
                    } else {
                        i11 = n.i(m10);
                    }
                    m10 = o.a(i10, i11);
                }
                long l11 = n.l(m10, this.f29290k);
                if (!z10 && e10 != null) {
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

    public final void s(int i10, int i11, int i12) {
        int E02;
        this.f29295p = i10;
        this.f29302w = h() ? i12 : i11;
        List<a0> list = this.f29281b;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            a0 a0Var = list.get(i13);
            int i14 = i13 * 2;
            if (h()) {
                int[] iArr = this.f29305z;
                C5437c.b bVar = this.f29283d;
                if (bVar != null) {
                    iArr[i14] = bVar.a(a0Var.E0(), i11, this.f29285f);
                    this.f29305z[i14 + 1] = i10;
                    E02 = a0Var.z0();
                } else {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
                }
            } else {
                int[] iArr2 = this.f29305z;
                iArr2[i14] = i10;
                int i15 = i14 + 1;
                C5437c.C0386c cVar = this.f29284e;
                if (cVar != null) {
                    iArr2[i15] = cVar.a(a0Var.z0(), i12);
                    E02 = a0Var.E0();
                } else {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false");
                }
            }
            i10 += E02;
        }
        this.f29303x = -this.f29287h;
        this.f29304y = this.f29302w + this.f29288i;
    }

    public final void t(int i10) {
        this.f29302w = i10;
        this.f29304y = i10 + this.f29288i;
    }

    private s(int i10, List<? extends a0> list, boolean z10, C5437c.b bVar, C5437c.C0386c cVar, t tVar, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, LazyLayoutItemAnimator<s> lazyLayoutItemAnimator, long j11) {
        this.f29280a = i10;
        this.f29281b = list;
        this.f29282c = z10;
        this.f29283d = bVar;
        this.f29284e = cVar;
        this.f29285f = tVar;
        this.f29286g = z11;
        this.f29287h = i11;
        this.f29288i = i12;
        this.f29289j = i13;
        this.f29290k = j10;
        this.f29291l = obj;
        this.f29292m = obj2;
        this.f29293n = lazyLayoutItemAnimator;
        this.f29294o = j11;
        this.f29298s = 1;
        this.f29302w = Integer.MIN_VALUE;
        int size = list.size();
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            a0 a0Var = (a0) list.get(i16);
            i14 += h() ? a0Var.z0() : a0Var.E0();
            i15 = Math.max(i15, !h() ? a0Var.z0() : a0Var.E0());
        }
        this.f29296q = i14;
        this.f29299t = C17978n.e(a() + this.f29289j, 0);
        this.f29300u = i15;
        this.f29305z = new int[(this.f29281b.size() * 2)];
    }
}
