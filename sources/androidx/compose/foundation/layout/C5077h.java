package androidx.compose.foundation.layout;

import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import G1.C4504g;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.C5267b;
import i1.C5437c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a3\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u0018\u001a\u00020\u0017*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\"0\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001e\"0\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e\"\u0014\u0010$\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"\u001a\u0010'\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010&\"\u001a\u0010+\u001a\u0004\u0018\u00010(*\u00020\u00108BX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0018\u0010.\u001a\u00020\u0000*\u00020\u00108BX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"", "propagateMinConstraints", "Ljava/util/HashMap;", "Li1/c;", "LE1/I;", "Lkotlin/collections/HashMap;", "d", "(Z)Ljava/util/HashMap;", "alignment", "h", "(Li1/c;Z)LE1/I;", "j", "(Li1/c;ZLU0/m;I)LE1/I;", "LE1/a0$a;", "LE1/a0;", "placeable", "LE1/H;", "measurable", "Lc2/t;", "layoutDirection", "", "boxWidth", "boxHeight", "LXH/N;", "i", "(LE1/a0$a;LE1/a0;LE1/H;Lc2/t;IILi1/c;)V", "Landroidx/compose/ui/d;", "modifier", "a", "(Landroidx/compose/ui/d;LU0/m;I)V", "Ljava/util/HashMap;", "cache1", "b", "cache2", "c", "LE1/I;", "DefaultBoxMeasurePolicy", "getEmptyBoxMeasurePolicy", "()LE1/I;", "EmptyBoxMeasurePolicy", "Landroidx/compose/foundation/layout/g;", "f", "(LE1/H;)Landroidx/compose/foundation/layout/g;", "boxChildDataNode", "g", "(LE1/H;)Z", "matchesParentSize", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.h  reason: case insensitive filesystem */
public final class C5077h {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<C5437c, I> f18102a = d(true);

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<C5437c, I> f18103b = d(false);

    /* renamed from: c  reason: collision with root package name */
    private static final I f18104c = new C5078i(C5437c.f24302a.o(), false);

    /* renamed from: d  reason: collision with root package name */
    private static final I f18105d = b.f18108a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.h$a */
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f18106c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f18107d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, int i10) {
            super(2);
            this.f18106c = dVar;
            this.f18107d = i10;
        }

        public final void a(C4889m mVar, int i10) {
            C5077h.a(this.f18106c, mVar, M0.a(this.f18107d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LE1/K;", "", "LE1/H;", "<anonymous parameter 0>", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.h$b */
    static final class b implements I {

        /* renamed from: a  reason: collision with root package name */
        public static final b f18108a = new b();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.layout.h$b$a */
        static final class a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f18109c = new a();

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

        b() {
        }

        public final J i(K k10, List<? extends H> list, long j10) {
            return K.v0(k10, C5267b.n(j10), C5267b.m(j10), (Map) null, a.f18109c, 4, (Object) null);
        }
    }

    public static final void a(d dVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-211209833);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-211209833, i11, -1, "androidx.compose.foundation.layout.Box (Box.kt:236)");
            }
            I i12 = f18105d;
            int a10 = C4883j.a(k10, 0);
            d e10 = c.e(k10, dVar);
            C4912y s10 = k10.s();
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, i12, aVar.c());
            F1.c(a12, s10, aVar.e());
            F1.c(a12, e10, aVar.d());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new a(dVar, i10));
        }
    }

    private static final HashMap<C5437c, I> d(boolean z10) {
        HashMap<C5437c, I> hashMap = new HashMap<>(9);
        C5437c.a aVar = C5437c.f24302a;
        e(hashMap, z10, aVar.o());
        e(hashMap, z10, aVar.m());
        e(hashMap, z10, aVar.n());
        e(hashMap, z10, aVar.h());
        e(hashMap, z10, aVar.e());
        e(hashMap, z10, aVar.f());
        e(hashMap, z10, aVar.d());
        e(hashMap, z10, aVar.b());
        e(hashMap, z10, aVar.c());
        return hashMap;
    }

    private static final void e(HashMap<C5437c, I> hashMap, boolean z10, C5437c cVar) {
        hashMap.put(cVar, new C5078i(cVar, z10));
    }

    private static final C5076g f(H h10) {
        Object h11 = h10.h();
        if (h11 instanceof C5076g) {
            return (C5076g) h11;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final boolean g(H h10) {
        C5076g f10 = f(h10);
        if (f10 != null) {
            return f10.D2();
        }
        return false;
    }

    public static final I h(C5437c cVar, boolean z10) {
        I i10 = (z10 ? f18102a : f18103b).get(cVar);
        return i10 == null ? new C5078i(cVar, z10) : i10;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.C2();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(E1.a0.a r13, E1.a0 r14, E1.H r15, c2.t r16, int r17, int r18, i1.C5437c r19) {
        /*
            androidx.compose.foundation.layout.g r0 = f(r15)
            if (r0 == 0) goto L_0x000f
            i1.c r0 = r0.C2()
            if (r0 != 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r1 = r0
            goto L_0x0011
        L_0x000f:
            r1 = r19
        L_0x0011:
            int r0 = r14.E0()
            int r2 = r14.z0()
            long r2 = c2.s.a(r0, r2)
            long r4 = c2.s.a(r17, r18)
            r6 = r16
            long r8 = r1.a(r2, r4, r6)
            r11 = 2
            r12 = 0
            r10 = 0
            r6 = r13
            r7 = r14
            E1.a0.a.k(r6, r7, r8, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C5077h.i(E1.a0$a, E1.a0, E1.H, c2.t, int, int, i1.c):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: E1.I} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final E1.I j(i1.C5437c r5, boolean r6, U0.C4889m r7, int r8) {
        /*
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:113)"
            r2 = 56522820(0x35e7844, float:6.5377995E-37)
            U0.C4895p.S(r2, r8, r0, r1)
        L_0x000f:
            i1.c$a r0 = i1.C5437c.f24302a
            i1.c r0 = r0.o()
            boolean r0 = kotlin.jvm.internal.C17542s.e(r5, r0)
            if (r0 == 0) goto L_0x0029
            if (r6 != 0) goto L_0x0029
            r5 = -1710139705(0xffffffff9a1156c7, float:-3.0055395E-23)
            r7.W(r5)
            r7.P()
            E1.I r5 = f18104c
            goto L_0x0076
        L_0x0029:
            r0 = -1710100211(0xffffffff9a11f10d, float:-3.0180016E-23)
            r7.W(r0)
            r0 = r8 & 14
            r0 = r0 ^ 6
            r1 = 0
            r2 = 1
            r3 = 4
            if (r0 <= r3) goto L_0x003e
            boolean r0 = r7.V(r5)
            if (r0 != 0) goto L_0x0042
        L_0x003e:
            r0 = r8 & 6
            if (r0 != r3) goto L_0x0044
        L_0x0042:
            r0 = r2
            goto L_0x0045
        L_0x0044:
            r0 = r1
        L_0x0045:
            r3 = r8 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r4 = 32
            if (r3 <= r4) goto L_0x0053
            boolean r3 = r7.b(r6)
            if (r3 != 0) goto L_0x0057
        L_0x0053:
            r8 = r8 & 48
            if (r8 != r4) goto L_0x0058
        L_0x0057:
            r1 = r2
        L_0x0058:
            r8 = r0 | r1
            java.lang.Object r0 = r7.D()
            if (r8 != 0) goto L_0x0068
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r0 != r8) goto L_0x0070
        L_0x0068:
            androidx.compose.foundation.layout.i r0 = new androidx.compose.foundation.layout.i
            r0.<init>(r5, r6)
            r7.u(r0)
        L_0x0070:
            r5 = r0
            androidx.compose.foundation.layout.i r5 = (androidx.compose.foundation.layout.C5078i) r5
            r7.P()
        L_0x0076:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x007f
            U0.C4895p.R()
        L_0x007f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C5077h.j(i1.c, boolean, U0.m, int):E1.I");
    }
}
