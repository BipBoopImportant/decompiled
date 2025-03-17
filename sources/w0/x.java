package w0;

import E1.a0;
import YH.C16877v;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.b;
import c2.n;
import c2.o;
import c2.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import s1.C5905c;
import tI.C17978n;
import v0.z;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"J/\u0010'\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010-\u001a\u00020 2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020 2\u0006\u00101\u001a\u00020\u0003¢\u0006\u0004\b2\u00100J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\r\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\bD\u00107\u001a\u0004\bE\u00109R\u001a\u0010\u000e\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\bF\u00107\u001a\u0004\bF\u00109R\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00107R\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u00107R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\bG\u0010;\u001a\u0004\bH\u0010=R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010IR \u0010\u0015\u001a\u00020\u00148\u0016X\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\b:\u0010LR\"\u0010P\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010A\u001a\u0004\bM\u0010C\"\u0004\bN\u0010OR\u0017\u0010R\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u00107\u001a\u0004\bQ\u00109R\u001a\u0010S\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\bE\u00107\u001a\u0004\bJ\u00109R\u0017\u0010V\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bT\u00107\u001a\u0004\bU\u00109R\u0016\u0010\u001f\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u00107R\u0016\u0010X\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u00107R\u0016\u0010Y\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u00107R\"\u0010Z\u001a\u00020\n8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b!\u0010A\u001a\u0004\bW\u0010C\"\u0004\bD\u0010OR \u0010\\\u001a\u00020[8\u0016X\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bN\u0010K\u001a\u0004\b6\u0010LR*\u0010^\u001a\u00020\u001a2\u0006\u0010]\u001a\u00020\u001a8\u0016@RX\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b/\u0010K\u001a\u0004\b>\u0010LR\u0018\u0010\u001d\u001a\u00020\u0003*\u00020\u001a8BX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010_R\u0014\u0010`\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b@\u00109R\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bT\u00109\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006a"}, d2 = {"Lw0/x;", "Lw0/i;", "Lv0/z;", "", "index", "", "key", "", "LE1/a0;", "placeables", "", "isVertical", "spacing", "lane", "span", "beforeContentPadding", "afterContentPadding", "contentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "animator", "Lc2/b;", "constraints", "<init>", "(ILjava/lang/Object;Ljava/util/List;ZIIIIILjava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "l", "(I)Ljava/lang/Object;", "Lc2/n;", "m", "(I)J", "mainAxis", "crossAxis", "mainAxisLayoutSize", "LXH/N;", "s", "(III)V", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "j", "(IIII)V", "LE1/a0$a;", "scope", "Lw0/r;", "context", "r", "(LE1/a0$a;Lw0/r;)V", "u", "(I)V", "delta", "g", "", "toString", "()Ljava/lang/String;", "a", "I", "getIndex", "()I", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "c", "Ljava/util/List;", "d", "Z", "h", "()Z", "e", "n", "f", "i", "getContentType", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "k", "J", "()J", "q", "t", "(Z)V", "isVisible", "getMainAxisSize", "mainAxisSize", "mainAxisSizeWithSpacings", "o", "getCrossAxisSize", "crossAxisSize", "p", "minMainAxisOffset", "maxMainAxisOffset", "nonScrollableItem", "Lc2/r;", "size", "<set-?>", "offset", "(J)I", "placeablesCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x implements C6202i, z {

    /* renamed from: a  reason: collision with root package name */
    private final int f31298a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f31299b;

    /* renamed from: c  reason: collision with root package name */
    private final List<a0> f31300c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f31301d;

    /* renamed from: e  reason: collision with root package name */
    private final int f31302e;

    /* renamed from: f  reason: collision with root package name */
    private final int f31303f;

    /* renamed from: g  reason: collision with root package name */
    private final int f31304g;

    /* renamed from: h  reason: collision with root package name */
    private final int f31305h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f31306i;

    /* renamed from: j  reason: collision with root package name */
    private final LazyLayoutItemAnimator<x> f31307j;

    /* renamed from: k  reason: collision with root package name */
    private final long f31308k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f31309l;

    /* renamed from: m  reason: collision with root package name */
    private final int f31310m;

    /* renamed from: n  reason: collision with root package name */
    private final int f31311n;

    /* renamed from: o  reason: collision with root package name */
    private final int f31312o;

    /* renamed from: p  reason: collision with root package name */
    private int f31313p;

    /* renamed from: q  reason: collision with root package name */
    private int f31314q;

    /* renamed from: r  reason: collision with root package name */
    private int f31315r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f31316s;

    /* renamed from: t  reason: collision with root package name */
    private final long f31317t;

    /* renamed from: u  reason: collision with root package name */
    private long f31318u;

    public /* synthetic */ x(int i10, Object obj, List list, boolean z10, int i11, int i12, int i13, int i14, int i15, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, obj, list, z10, i11, i12, i13, i14, i15, obj2, lazyLayoutItemAnimator, j10);
    }

    private final int i(long j10) {
        return h() ? n.i(j10) : n.h(j10);
    }

    public long a() {
        return this.f31317t;
    }

    public long b() {
        return this.f31308k;
    }

    public long c() {
        return this.f31318u;
    }

    public int d() {
        return this.f31300c.size();
    }

    public void e(boolean z10) {
        this.f31316s = z10;
    }

    public int f() {
        return this.f31303f;
    }

    public final void g(int i10) {
        if (!p()) {
            long c10 = c();
            int h10 = h() ? n.h(c10) : n.h(c10) + i10;
            boolean h11 = h();
            int i11 = n.i(c10);
            if (h11) {
                i11 += i10;
            }
            this.f31318u = o.a(h10, i11);
            int d10 = d();
            for (int i12 = 0; i12 < d10; i12++) {
                b e10 = this.f31307j.e(getKey(), i12);
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

    public int getIndex() {
        return this.f31298a;
    }

    public Object getKey() {
        return this.f31299b;
    }

    public boolean h() {
        return this.f31301d;
    }

    public void j(int i10, int i11, int i12, int i13) {
        if (h()) {
            i12 = i13;
        }
        s(i10, i11, i12);
    }

    public int k() {
        return this.f31311n;
    }

    public Object l(int i10) {
        return this.f31300c.get(i10).h();
    }

    public long m(int i10) {
        return c();
    }

    public int n() {
        return this.f31302e;
    }

    public final int o() {
        return !h() ? n.h(c()) : n.i(c());
    }

    public boolean p() {
        return this.f31316s;
    }

    public final boolean q() {
        return this.f31309l;
    }

    public final void r(a0.a aVar, r rVar) {
        C5905c cVar;
        int i10;
        int i11;
        if (this.f31313p != -1) {
            List<a0> list = this.f31300c;
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                a0 a0Var = list.get(i12);
                int z02 = this.f31314q - (h() ? a0Var.z0() : a0Var.E0());
                int i13 = this.f31315r;
                long c10 = c();
                b e10 = this.f31307j.e(getKey(), i12);
                if (e10 != null) {
                    long l10 = n.l(c10, e10.r());
                    if ((i(c10) <= z02 && i(l10) <= z02) || (i(c10) >= i13 && i(l10) >= i13)) {
                        e10.n();
                    }
                    cVar = e10.p();
                    c10 = l10;
                } else {
                    cVar = null;
                }
                if (rVar.p()) {
                    if (h()) {
                        i10 = n.h(c10);
                    } else {
                        i10 = (this.f31313p - n.h(c10)) - (h() ? a0Var.z0() : a0Var.E0());
                    }
                    if (h()) {
                        i11 = (this.f31313p - n.i(c10)) - (h() ? a0Var.z0() : a0Var.E0());
                    } else {
                        i11 = n.i(c10);
                    }
                    c10 = o.a(i10, i11);
                }
                long l11 = n.l(c10, rVar.d());
                if (e10 != null) {
                    e10.E(l11);
                }
                if (cVar != null) {
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
        this.f31313p = i12;
        this.f31314q = -this.f31304g;
        this.f31315r = i12 + this.f31305h;
        this.f31318u = h() ? o.a(i11, i10) : o.a(i10, i11);
    }

    public final void t(boolean z10) {
        this.f31309l = z10;
    }

    public String toString() {
        return super.toString();
    }

    public final void u(int i10) {
        this.f31313p = i10;
        this.f31315r = i10 + this.f31305h;
    }

    private x(int i10, Object obj, List<? extends a0> list, boolean z10, int i11, int i12, int i13, int i14, int i15, Object obj2, LazyLayoutItemAnimator<x> lazyLayoutItemAnimator, long j10) {
        Integer num;
        long j11;
        this.f31298a = i10;
        this.f31299b = obj;
        this.f31300c = list;
        this.f31301d = z10;
        this.f31302e = i12;
        this.f31303f = i13;
        this.f31304g = i14;
        this.f31305h = i15;
        this.f31306i = obj2;
        this.f31307j = lazyLayoutItemAnimator;
        this.f31308k = j10;
        int i16 = 1;
        this.f31309l = true;
        Integer num2 = null;
        int i17 = 0;
        if (list.isEmpty()) {
            num = null;
        } else {
            a0 a0Var = (a0) list.get(0);
            num = Integer.valueOf(h() ? a0Var.z0() : a0Var.E0());
            int p10 = C16877v.p(list);
            if (1 <= p10) {
                int i18 = 1;
                while (true) {
                    a0 a0Var2 = (a0) list.get(i18);
                    Integer valueOf = Integer.valueOf(h() ? a0Var2.z0() : a0Var2.E0());
                    num = valueOf.compareTo(num) > 0 ? valueOf : num;
                    if (i18 == p10) {
                        break;
                    }
                    i18++;
                }
            }
        }
        int intValue = num != null ? num.intValue() : 0;
        this.f31310m = intValue;
        this.f31311n = C17978n.e(intValue + i11, 0);
        List<a0> list2 = this.f31300c;
        if (!list2.isEmpty()) {
            a0 a0Var3 = list2.get(0);
            Integer valueOf2 = Integer.valueOf(h() ? a0Var3.E0() : a0Var3.z0());
            int p11 = C16877v.p(list2);
            if (1 <= p11) {
                while (true) {
                    a0 a0Var4 = list2.get(i16);
                    Integer valueOf3 = Integer.valueOf(h() ? a0Var4.E0() : a0Var4.z0());
                    valueOf2 = valueOf3.compareTo(valueOf2) > 0 ? valueOf3 : valueOf2;
                    if (i16 == p11) {
                        break;
                    }
                    i16++;
                }
            }
            num2 = valueOf2;
        }
        i17 = num2 != null ? num2.intValue() : i17;
        this.f31312o = i17;
        this.f31313p = -1;
        if (h()) {
            j11 = s.a(i17, this.f31310m);
        } else {
            j11 = s.a(this.f31310m, i17);
        }
        this.f31317t = j11;
        this.f31318u = n.f23044b.a();
    }
}
