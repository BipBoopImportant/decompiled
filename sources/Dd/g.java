package Dd;

import Jd.i;
import N1.P;
import N1.Y;
import O0.C4740m;
import O0.C4742n;
import O0.C4744o;
import O0.d1;
import QJ.F0;
import QJ.Q;
import QJ.T;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.y;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import bI.C17035a;
import c2.h;
import com.ikea.kompassmap.model.store.map.Floor;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import n0.C5601g;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.i1;
import r0.m;
import s0.C5842M;
import tK.C18030v;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LJd/i;", "storeViewModel", "Landroidx/compose/ui/d;", "modifier", "Li1/c;", "contentAlignment", "LXH/N;", "f", "(LJd/i;Landroidx/compose/ui/d;Li1/c;LU0/m;II)V", "", "text", "", "isSelected", "Lkotlin/Function0;", "onClick", "d", "(Ljava/lang/String;ZLnI/a;LU0/m;II)V", "KompassMap_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class g {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f59111a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f59112b;

        a(String str, long j10) {
            this.f59111a = str;
            this.f59112b = j10;
        }

        public final void a(C5842M m10, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(m10, "$this$Button");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(137593647, i11, -1, "com.ikea.kompassmap.ui.components.FloorButton.<anonymous> (FloorSwitcher.kt:84)");
                }
                d1.b(this.f59111a, (androidx.compose.ui.d) null, this.f59112b, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, (Y) null, mVar, 0, 0, 131066);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class b<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(((Floor) t11).getOrdinal()), Integer.valueOf(((Floor) t10).getOrdinal()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.ikea.kompassmap.ui.components.FloorSwitcherKt$FloorSwitcher$1$1$1$1$1$1$1", f = "FloorSwitcher.kt", l = {60}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f59113c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Floor f59114d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<Floor> f59115e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f59116f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Floor floor, List<Floor> list, i iVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f59114d = floor;
            this.f59115e = list;
            this.f59116f = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f59114d, this.f59115e, this.f59116f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f59113c;
            if (i10 == 0) {
                y.b(obj);
                List<Floor> list = this.f59115e;
                i iVar = this.f59116f;
                int ordinal = this.f59114d.getOrdinal();
                this.f59113c = 1;
                if (g.g(list, iVar, ordinal, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @f(c = "com.ikea.kompassmap.ui.components.FloorSwitcherKt", f = "FloorSwitcher.kt", l = {38}, m = "FloorSwitcher$changeFloor")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f59117c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f59118d;

        /* renamed from: e  reason: collision with root package name */
        int f59119e;

        d(C17164e<? super d> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f59118d = obj;
            this.f59119e |= Integer.MIN_VALUE;
            return g.g((List<Floor>) null, (i) null, 0, this);
        }
    }

    private static final void d(String str, boolean z10, C17631a<C16807N> aVar, C4889m mVar, int i10, int i11) {
        int i12;
        String str2;
        String str3;
        long U10;
        boolean z11 = z10;
        int i13 = i10;
        C4889m k10 = mVar.k(-611001537);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i13 | 6;
            str2 = str;
        } else if ((i13 & 6) == 0) {
            str2 = str;
            i12 = (k10.V(str2) ? 4 : 2) | i13;
        } else {
            str2 = str;
            i12 = i13;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i13 & 48) == 0) {
            i12 |= k10.b(z11) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
            C17631a<C16807N> aVar2 = aVar;
        } else {
            C17631a<C16807N> aVar3 = aVar;
            if ((i13 & 384) == 0) {
                i12 |= k10.F(aVar3) ? 256 : 128;
            }
        }
        int i15 = i12;
        if ((i15 & 147) != 146 || !k10.l()) {
            str3 = i14 != 0 ? "" : str2;
            if (C4895p.J()) {
                C4895p.S(-611001537, i15, -1, "com.ikea.kompassmap.ui.components.FloorButton (FloorSwitcher.kt:72)");
            }
            if (z11) {
                k10.W(-1997936491);
                U10 = C18030v.f147664a.a(k10, C18030v.f147665b).N();
            } else {
                k10.W(-1997934764);
                U10 = C18030v.f147664a.a(k10, C18030v.f147665b).U();
            }
            k10.P();
            long j10 = U10;
            k10.W(-1997933127);
            long a10 = z11 ? Id.b.f61037a.a() : C18030v.f147664a.a(k10, C18030v.f147665b).G0();
            k10.P();
            C4744o.a(aVar, J.t(androidx.compose.ui.d.f18749a, h.B((float) 36)), false, (i1) null, C4740m.f11185a.b(j10, 0, 0, 0, k10, C4740m.f11199o << 12, 14), (C4742n) null, (C5601g) null, D.a(h.B((float) 0)), (m) null, c1.c.e(137593647, true, new a(str3, a10), k10, 54), k10, ((i15 >> 6) & 14) | 817889328, 364);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            str3 = str2;
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new f(str3, z10, aVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(String str, boolean z10, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        d(str, z10, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(Jd.i r26, androidx.compose.ui.d r27, i1.C5437c r28, U0.C4889m r29, int r30, int r31) {
        /*
            r1 = r26
            r4 = r30
            r0 = 4
            java.lang.String r2 = "storeViewModel"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            r2 = 1146138082(0x4450ade2, float:834.7169)
            r3 = r29
            U0.m r3 = r3.k(r2)
            r11 = 1
            r5 = r31 & 1
            r6 = 2
            if (r5 == 0) goto L_0x001c
            r5 = r4 | 6
            goto L_0x002c
        L_0x001c:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x002b
            boolean r5 = r3.F(r1)
            if (r5 == 0) goto L_0x0028
            r5 = r0
            goto L_0x0029
        L_0x0028:
            r5 = r6
        L_0x0029:
            r5 = r5 | r4
            goto L_0x002c
        L_0x002b:
            r5 = r4
        L_0x002c:
            r7 = r31 & 2
            if (r7 == 0) goto L_0x0035
            r5 = r5 | 48
        L_0x0032:
            r8 = r27
            goto L_0x0047
        L_0x0035:
            r8 = r4 & 48
            if (r8 != 0) goto L_0x0032
            r8 = r27
            boolean r9 = r3.V(r8)
            if (r9 == 0) goto L_0x0044
            r9 = 32
            goto L_0x0046
        L_0x0044:
            r9 = 16
        L_0x0046:
            r5 = r5 | r9
        L_0x0047:
            r0 = r31 & 4
            if (r0 == 0) goto L_0x0050
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r9 = r28
            goto L_0x0062
        L_0x0050:
            r9 = r4 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004d
            r9 = r28
            boolean r10 = r3.V(r9)
            if (r10 == 0) goto L_0x005f
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r5 = r5 | r10
        L_0x0062:
            r10 = r5 & 147(0x93, float:2.06E-43)
            r12 = 146(0x92, float:2.05E-43)
            if (r10 != r12) goto L_0x0077
            boolean r10 = r3.l()
            if (r10 != 0) goto L_0x006f
            goto L_0x0077
        L_0x006f:
            r3.L()
            r2 = r8
            r16 = r9
            goto L_0x0315
        L_0x0077:
            if (r7 == 0) goto L_0x007d
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r12 = r7
            goto L_0x007e
        L_0x007d:
            r12 = r8
        L_0x007e:
            if (r0 == 0) goto L_0x0087
            i1.c$a r0 = i1.C5437c.f24302a
            i1.c r0 = r0.c()
            goto L_0x0088
        L_0x0087:
            r0 = r9
        L_0x0088:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0094
            r7 = -1
            java.lang.String r8 = "com.ikea.kompassmap.ui.components.FloorSwitcher (FloorSwitcher.kt:29)"
            U0.C4895p.S(r2, r5, r7, r8)
        L_0x0094:
            TJ.B r2 = r26.T()
            r5 = 0
            r13 = 0
            U0.A1 r2 = U0.p1.b(r2, r5, r3, r13, r11)
            java.lang.Object r5 = r2.getValue()
            Jd.e r5 = (Jd.e) r5
            java.util.List r5 = r5.n()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            Dd.g$b r7 = new Dd.g$b
            r7.<init>()
            java.util.List r14 = YH.C16877v.g1(r5, r7)
            java.lang.Object r5 = r3.D()
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r5 != r7) goto L_0x00ce
            dI.j r5 = dI.C17169j.f142968a
            QJ.Q r5 = U0.P.k(r5, r3)
            U0.B r7 = new U0.B
            r7.<init>(r5)
            r3.u(r7)
            r5 = r7
        L_0x00ce:
            U0.B r5 = (U0.B) r5
            QJ.Q r15 = r5.a()
            int r5 = r14.size()
            if (r5 <= r11) goto L_0x0308
            E1.I r5 = androidx.compose.foundation.layout.C5077h.h(r0, r13)
            int r7 = U0.C4883j.a(r3, r13)
            U0.y r8 = r3.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r3, r12)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r11 = r10.a()
            U0.f r16 = r3.m()
            if (r16 != 0) goto L_0x00f9
            U0.C4883j.c()
        L_0x00f9:
            r3.I()
            boolean r16 = r3.i()
            if (r16 == 0) goto L_0x0106
            r3.p(r11)
            goto L_0x0109
        L_0x0106:
            r3.t()
        L_0x0109:
            U0.m r11 = U0.F1.a(r3)
            nI.p r13 = r10.c()
            U0.F1.c(r11, r5, r13)
            nI.p r5 = r10.e()
            U0.F1.c(r11, r8, r5)
            nI.p r5 = r10.b()
            boolean r8 = r11.i()
            if (r8 != 0) goto L_0x0133
            java.lang.Object r8 = r11.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r13)
            if (r8 != 0) goto L_0x0141
        L_0x0133:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r11.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11.w(r7, r5)
        L_0x0141:
            nI.p r5 = r10.d()
            U0.F1.c(r11, r9, r5)
            androidx.compose.foundation.layout.j r5 = androidx.compose.foundation.layout.C5079j.f18125a
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            float r6 = (float) r6
            float r17 = c2.h.B(r6)
            r7 = 50
            A0.f r18 = A0.g.a(r7)
            r24 = 28
            r25 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r16 = r5
            androidx.compose.ui.d r8 = m1.m.b(r16, r17, r18, r19, r20, r22, r24, r25)
            tK.v r9 = tK.C18030v.f147664a
            int r11 = tK.C18030v.f147665b
            tK.h r9 = r9.a(r3, r11)
            r13 = r12
            long r11 = r9.U()
            A0.f r7 = A0.g.a(r7)
            androidx.compose.ui.d r7 = androidx.compose.foundation.b.c(r8, r11, r7)
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.i(r7, r6)
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c r8 = r7.e()
            r9 = 0
            E1.I r8 = androidx.compose.foundation.layout.C5077h.h(r8, r9)
            int r11 = U0.C4883j.a(r3, r9)
            U0.y r9 = r3.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r3, r6)
            nI.a r12 = r10.a()
            U0.f r16 = r3.m()
            if (r16 != 0) goto L_0x01a8
            U0.C4883j.c()
        L_0x01a8:
            r3.I()
            boolean r16 = r3.i()
            if (r16 == 0) goto L_0x01b5
            r3.p(r12)
            goto L_0x01b8
        L_0x01b5:
            r3.t()
        L_0x01b8:
            U0.m r12 = U0.F1.a(r3)
            r16 = r0
            nI.p r0 = r10.c()
            U0.F1.c(r12, r8, r0)
            nI.p r0 = r10.e()
            U0.F1.c(r12, r9, r0)
            nI.p r0 = r10.b()
            boolean r8 = r12.i()
            if (r8 != 0) goto L_0x01e4
            java.lang.Object r8 = r12.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r9)
            if (r8 != 0) goto L_0x01f2
        L_0x01e4:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r12.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r12.w(r8, r0)
        L_0x01f2:
            nI.p r0 = r10.d()
            U0.F1.c(r12, r6, r0)
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r0 = r0.g()
            i1.c$b r6 = r7.k()
            r11 = 0
            E1.I r0 = androidx.compose.foundation.layout.C5080k.a(r0, r6, r3, r11)
            int r6 = U0.C4883j.a(r3, r11)
            U0.y r7 = r3.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r3, r5)
            nI.a r8 = r10.a()
            U0.f r9 = r3.m()
            if (r9 != 0) goto L_0x0221
            U0.C4883j.c()
        L_0x0221:
            r3.I()
            boolean r9 = r3.i()
            if (r9 == 0) goto L_0x022e
            r3.p(r8)
            goto L_0x0231
        L_0x022e:
            r3.t()
        L_0x0231:
            U0.m r8 = U0.F1.a(r3)
            nI.p r9 = r10.c()
            U0.F1.c(r8, r0, r9)
            nI.p r0 = r10.e()
            U0.F1.c(r8, r7, r0)
            nI.p r0 = r10.b()
            boolean r7 = r8.i()
            if (r7 != 0) goto L_0x025b
            java.lang.Object r7 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r9)
            if (r7 != 0) goto L_0x0269
        L_0x025b:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.w(r6, r0)
        L_0x0269:
            nI.p r0 = r10.d()
            U0.F1.c(r8, r5, r0)
            s0.h r0 = s0.C5862h.f28810a
            r0 = -550303828(0xffffffffdf3307ac, float:-1.2900469E19)
            r3.W(r0)
            r0 = r14
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r12 = new java.util.ArrayList
            r5 = 10
            int r5 = YH.C16877v.y(r0, r5)
            r12.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x028a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x02fb
            java.lang.Object r5 = r0.next()
            com.ikea.kompassmap.model.store.map.Floor r5 = (com.ikea.kompassmap.model.store.map.Floor) r5
            int r6 = r5.getOrdinal()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Object r7 = r2.getValue()
            Jd.e r7 = (Jd.e) r7
            com.ikea.kompassmap.model.store.map.Floor r7 = r7.m()
            if (r7 == 0) goto L_0x02b6
            int r7 = r7.getOrdinal()
            int r8 = r5.getOrdinal()
            if (r7 != r8) goto L_0x02b6
            r7 = 1
            goto L_0x02b7
        L_0x02b6:
            r7 = r11
        L_0x02b7:
            r8 = -710575977(0xffffffffd5a57897, float:-2.27421685E13)
            r3.W(r8)
            boolean r8 = r3.F(r15)
            boolean r9 = r3.F(r14)
            r8 = r8 | r9
            boolean r9 = r3.F(r1)
            r8 = r8 | r9
            boolean r9 = r3.F(r5)
            r8 = r8 | r9
            java.lang.Object r9 = r3.D()
            if (r8 != 0) goto L_0x02de
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x02e6
        L_0x02de:
            Dd.d r9 = new Dd.d
            r9.<init>(r15, r5, r14, r1)
            r3.u(r9)
        L_0x02e6:
            r8 = r9
            nI.a r8 = (nI.C17631a) r8
            r3.P()
            r9 = 0
            r10 = 0
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r3
            d(r5, r6, r7, r8, r9, r10)
            XH.N r5 = XH.C16807N.f139792a
            r12.add(r5)
            goto L_0x028a
        L_0x02fb:
            r3.P()
            r3.x()
            r3.x()
            r3.x()
            goto L_0x030b
        L_0x0308:
            r16 = r0
            r13 = r12
        L_0x030b:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0314
            U0.C4895p.R()
        L_0x0314:
            r2 = r13
        L_0x0315:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x032c
            Dd.e r7 = new Dd.e
            r0 = r7
            r1 = r26
            r3 = r16
            r4 = r30
            r5 = r31
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x032c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dd.g.f(Jd.i, androidx.compose.ui.d, i1.c, U0.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: Jd.i} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object g(java.util.List<com.ikea.kompassmap.model.store.map.Floor> r4, Jd.i r5, int r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            boolean r0 = r7 instanceof Dd.g.d
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Dd.g$d r0 = (Dd.g.d) r0
            int r1 = r0.f59119e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f59119e = r1
            goto L_0x0018
        L_0x0013:
            Dd.g$d r0 = new Dd.g$d
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f59118d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f59119e
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r4 = r0.f59117c
            r5 = r4
            Jd.i r5 = (Jd.i) r5
            XH.y.b(r7)
            goto L_0x0063
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            XH.y.b(r7)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x003f:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0053
            java.lang.Object r7 = r4.next()
            r2 = r7
            com.ikea.kompassmap.model.store.map.Floor r2 = (com.ikea.kompassmap.model.store.map.Floor) r2
            int r2 = r2.getOrdinal()
            if (r2 != r6) goto L_0x003f
            goto L_0x0054
        L_0x0053:
            r7 = 0
        L_0x0054:
            com.ikea.kompassmap.model.store.map.Floor r7 = (com.ikea.kompassmap.model.store.map.Floor) r7
            if (r7 == 0) goto L_0x0066
            r0.f59117c = r5
            r0.f59119e = r3
            java.lang.Object r4 = r5.c0(r7, r0)
            if (r4 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r5.J()
        L_0x0066:
            XH.N r4 = XH.C16807N.f139792a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Dd.g.g(java.util.List, Jd.i, int, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(Q q10, Floor floor, List list, i iVar) {
        F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new c(floor, list, iVar, (C17164e<? super c>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(i iVar, androidx.compose.ui.d dVar, C5437c cVar, int i10, int i11, C4889m mVar, int i12) {
        f(iVar, dVar, cVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
