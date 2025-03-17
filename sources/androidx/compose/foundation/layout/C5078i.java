package androidx.compose.foundation.layout;

import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import XH.C16807N;
import c2.C5267b;
import i1.C5437c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.M;
import nI.C17642l;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\u00020\u000e*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/i;", "LE1/I;", "Li1/c;", "alignment", "", "propagateMinConstraints", "<init>", "(Li1/c;Z)V", "LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li1/c;", "b", "Z", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.i  reason: case insensitive filesystem */
final class C5078i implements I {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C5437c f18110a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f18111b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.i$a */
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f18112c = new a();

        a() {
            super(1);
        }

        public final void a(a0.a aVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.i$b */
    static final class b extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f18113c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ H f18114d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K f18115e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f18116f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f18117g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C5078i f18118h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a0 a0Var, H h10, K k10, int i10, int i11, C5078i iVar) {
            super(1);
            this.f18113c = a0Var;
            this.f18114d = h10;
            this.f18115e = k10;
            this.f18116f = i10;
            this.f18117g = i11;
            this.f18118h = iVar;
        }

        public final void a(a0.a aVar) {
            C5077h.i(aVar, this.f18113c, this.f18114d, this.f18115e.getLayoutDirection(), this.f18116f, this.f18117g, this.f18118h.f18110a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.i$c */
    static final class c extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0[] f18119c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<H> f18120d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K f18121e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ M f18122f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ M f18123g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C5078i f18124h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a0[] a0VarArr, List<? extends H> list, K k10, M m10, M m11, C5078i iVar) {
            super(1);
            this.f18119c = a0VarArr;
            this.f18120d = list;
            this.f18121e = k10;
            this.f18122f = m10;
            this.f18123g = m11;
            this.f18124h = iVar;
        }

        public final void a(a0.a aVar) {
            a0[] a0VarArr = this.f18119c;
            List<H> list = this.f18120d;
            K k10 = this.f18121e;
            M m10 = this.f18122f;
            M m11 = this.f18123g;
            C5078i iVar = this.f18124h;
            int length = a0VarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                a0 a0Var = a0VarArr[i10];
                C17542s.h(a0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                C5077h.i(aVar, a0Var, list.get(i11), k10.getLayoutDirection(), m10.f144346a, m11.f144346a, iVar.f18110a);
                i10++;
                i11++;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public C5078i(C5437c cVar, boolean z10) {
        this.f18110a = cVar;
        this.f18111b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5078i)) {
            return false;
        }
        C5078i iVar = (C5078i) obj;
        return C17542s.e(this.f18110a, iVar.f18110a) && this.f18111b == iVar.f18111b;
    }

    public int hashCode() {
        return (this.f18110a.hashCode() * 31) + Boolean.hashCode(this.f18111b);
    }

    public J i(K k10, List<? extends H> list, long j10) {
        int n10;
        int m10;
        a0 i02;
        List<? extends H> list2 = list;
        if (list.isEmpty()) {
            return K.v0(k10, C5267b.n(j10), C5267b.m(j10), (Map) null, a.f18112c, 4, (Object) null);
        }
        long d10 = this.f18111b ? j10 : C5267b.d(j10, 0, 0, 0, 0, 10, (Object) null);
        if (list.size() == 1) {
            H h10 = (H) list2.get(0);
            if (!C5077h.g(h10)) {
                i02 = h10.i0(d10);
                n10 = Math.max(C5267b.n(j10), i02.E0());
                m10 = Math.max(C5267b.m(j10), i02.z0());
            } else {
                n10 = C5267b.n(j10);
                m10 = C5267b.m(j10);
                i02 = h10.i0(C5267b.f23024b.c(C5267b.n(j10), C5267b.m(j10)));
            }
            int i10 = n10;
            int i11 = m10;
            return K.v0(k10, i10, i11, (Map) null, new b(i02, h10, k10, i10, i11, this), 4, (Object) null);
        }
        a0[] a0VarArr = new a0[list.size()];
        M m11 = new M();
        m11.f144346a = C5267b.n(j10);
        M m12 = new M();
        m12.f144346a = C5267b.m(j10);
        int size = list.size();
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            H h11 = (H) list2.get(i12);
            if (!C5077h.g(h11)) {
                a0 i03 = h11.i0(d10);
                a0VarArr[i12] = i03;
                m11.f144346a = Math.max(m11.f144346a, i03.E0());
                m12.f144346a = Math.max(m12.f144346a, i03.z0());
            } else {
                z10 = true;
            }
        }
        if (z10) {
            int i13 = m11.f144346a;
            int i14 = i13 != Integer.MAX_VALUE ? i13 : 0;
            int i15 = m12.f144346a;
            long a10 = c2.c.a(i14, i13, i15 != Integer.MAX_VALUE ? i15 : 0, i15);
            int size2 = list.size();
            for (int i16 = 0; i16 < size2; i16++) {
                H h12 = (H) list2.get(i16);
                if (C5077h.g(h12)) {
                    a0VarArr[i16] = h12.i0(a10);
                }
            }
        }
        return K.v0(k10, m11.f144346a, m12.f144346a, (Map) null, new c(a0VarArr, list, k10, m11, m12, this), 4, (Object) null);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f18110a + ", propagateMinConstraints=" + this.f18111b + ')';
    }
}
