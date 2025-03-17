package Jg;

import D4.C6445t;
import D4.C6447v;
import D4.M;
import E1.I;
import G1.C4504g;
import J1.j;
import Kg.a;
import O0.C4747p0;
import O0.C4762x0;
import O0.e1;
import O0.f1;
import O0.g1;
import O0.h1;
import QJ.Q;
import SC.C13593h1;
import SC.C13597i1;
import SC.C13605k1;
import SC.I1;
import SC.J1;
import SC.K0;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.app.inspire.b;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import m0.C5546i;
import m0.C5570z;
import mp.C11588a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import ol.k;
import ol.u;
import ol.v;
import r0.m;
import s0.C5834E;
import s0.C5842M;
import s0.C5848T;
import s0.C5862h;
import t0.C5934A;
import t0.C5938c;
import t0.x;
import uI.C18059h;
import z1.C6272b;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aS\u0010\u000f\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aU\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a9\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a1\u0010\u001a\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LKg/b;", "inspireViewModel", "Lkotlin/Function1;", "Lcom/ingka/ikea/app/inspire/b;", "LXH/N;", "screenUiEvent", "v", "(LKg/b;LnI/l;LU0/m;I)V", "LE4/a;", "LKg/a;", "pagingData", "", "onFilterSelected", "Lkotlin/Function0;", "onViewAllFilterClicked", "u", "(LE4/a;LnI/l;LnI/l;LnI/a;LU0/m;I)V", "LO0/g1;", "scrollBehavior", "onBackClicked", "z", "(LO0/g1;LnI/a;LE4/a;LnI/l;LnI/a;LU0/m;I)V", "LKg/a$a;", "filters", "l", "(LKg/a$a;LnI/a;LnI/l;LU0/m;I)V", "p", "(LE4/a;LnI/l;LU0/m;I)V", "inspire-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.C1021a f61357a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f61358b;

        a(a.C1021a aVar, C17631a<C16807N> aVar2) {
            this.f61357a = aVar;
            this.f61358b = aVar2;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            boolean z10;
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1648450683, i10, -1, "com.ingka.ikea.app.inspire.ui.FilterBar.<anonymous>.<anonymous>.<anonymous> (InspireScreen.kt:208)");
                }
                String b10 = j.b(Fg.d.f60507a, mVar, 0);
                J1 j12 = J1.Medium;
                Iterable a10 = this.f61357a.a();
                if (!(a10 instanceof Collection) || !((Collection) a10).isEmpty()) {
                    Iterator it = a10.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((zr.d) it.next()).d()) {
                                z10 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z10 = true;
                I1.h(b10, (androidx.compose.ui.d) null, false, (Integer) null, j12, z10, (K0) null, (m) null, this.f61358b, mVar, 24576, 206);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.C1021a f61359a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f61360b;

        b(a.C1021a aVar, C17642l<? super String, C16807N> lVar) {
            this.f61359a = aVar;
            this.f61360b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, zr.d dVar) {
            lVar.invoke(dVar.c());
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(t0.C5938c r15, int r16, U0.C4889m r17, int r18) {
            /*
                r14 = this;
                r0 = r14
                r1 = r16
                r10 = r17
                java.lang.String r2 = "$this$items"
                r3 = r15
                kotlin.jvm.internal.C17542s.j(r15, r2)
                r2 = r18 & 48
                if (r2 != 0) goto L_0x001d
                boolean r2 = r10.d(r1)
                if (r2 == 0) goto L_0x0018
                r2 = 32
                goto L_0x001a
            L_0x0018:
                r2 = 16
            L_0x001a:
                r2 = r18 | r2
                goto L_0x001f
            L_0x001d:
                r2 = r18
            L_0x001f:
                r3 = r2 & 145(0x91, float:2.03E-43)
                r4 = 144(0x90, float:2.02E-43)
                if (r3 != r4) goto L_0x0031
                boolean r3 = r17.l()
                if (r3 != 0) goto L_0x002c
                goto L_0x0031
            L_0x002c:
                r17.L()
                goto L_0x00a2
            L_0x0031:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x0040
                r3 = -1
                java.lang.String r4 = "com.ingka.ikea.app.inspire.ui.FilterBar.<anonymous>.<anonymous>.<anonymous> (InspireScreen.kt:220)"
                r5 = 253340420(0xf19ab04, float:7.576419E-30)
                U0.C4895p.S(r5, r2, r3, r4)
            L_0x0040:
                Kg.a$a r2 = r0.f61359a
                java.util.List r2 = r2.a()
                java.lang.Object r1 = r2.get(r1)
                zr.d r1 = (zr.d) r1
                java.lang.String r2 = r1.e()
                SC.J1 r5 = SC.J1.Medium
                boolean r6 = r1.d()
                r3 = 317891185(0x12f2a271, float:1.5312392E-27)
                r10.W(r3)
                nI.l<java.lang.String, XH.N> r3 = r0.f61360b
                boolean r3 = r10.V(r3)
                boolean r4 = r10.F(r1)
                r3 = r3 | r4
                nI.l<java.lang.String, XH.N> r4 = r0.f61360b
                java.lang.Object r7 = r17.D()
                if (r3 != 0) goto L_0x0077
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r7 != r3) goto L_0x007f
            L_0x0077:
                Jg.p r7 = new Jg.p
                r7.<init>(r4, r1)
                r10.u(r7)
            L_0x007f:
                r9 = r7
                nI.a r9 = (nI.C17631a) r9
                r17.P()
                r11 = 24576(0x6000, float:3.4438E-41)
                r12 = 206(0xce, float:2.89E-43)
                r3 = 0
                r4 = 0
                r7 = 0
                r8 = 0
                r13 = 0
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r7
                r7 = r8
                r8 = r13
                r10 = r17
                SC.I1.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x00a2
                U0.C4895p.R()
            L_0x00a2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Jg.o.b.b(t0.c, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            b((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.inspire.ui.InspireScreenKt$FilterBar$2$1", f = "InspireScreen.kt", l = {237}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f61361c;

        /* renamed from: d  reason: collision with root package name */
        int f61362d;

        /* renamed from: e  reason: collision with root package name */
        int f61363e;

        /* renamed from: f  reason: collision with root package name */
        Object f61364f;

        /* renamed from: g  reason: collision with root package name */
        Object f61365g;

        /* renamed from: h  reason: collision with root package name */
        int f61366h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a.C1021a f61367i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C5934A f61368j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a.C1021a aVar, C5934A a10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f61367i = aVar;
            this.f61368j = a10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f61367i, this.f61368j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            int i10;
            Object f10 = C17187b.f();
            int i11 = this.f61366h;
            if (i11 == 0) {
                y.b(obj);
                List<zr.d> a10 = this.f61367i.a();
                Iterator<zr.d> it = a10.iterator();
                int i12 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i10 = -1;
                        break;
                    } else if (it.next().d()) {
                        i10 = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i10 != -1) {
                    this.f61364f = a10;
                    this.f61365g = it;
                    this.f61361c = i10;
                    this.f61362d = 0;
                    this.f61363e = i12;
                    this.f61366h = 1;
                    if (C5934A.L(this.f61368j, i10 + 1, 0, this, 2, (Object) null) == f10) {
                        return f10;
                    }
                }
            } else if (i11 == 1) {
                Iterator it2 = (Iterator) this.f61365g;
                List list = (List) this.f61364f;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements r<w0.m, Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E4.a<Kg.a> f61369a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<com.ingka.ikea.app.inspire.b, C16807N> f61370b;

        d(E4.a<Kg.a> aVar, C17642l<? super com.ingka.ikea.app.inspire.b, C16807N> lVar) {
            this.f61369a = aVar;
            this.f61370b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(C17642l lVar, Kg.a aVar, kp.g gVar) {
            C17542s.j(gVar, "productCategory");
            lVar.invoke(new b.e(gVar.a(), gVar.c(), ((a.f) aVar).a().b()));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(C17642l lVar, Kg.a aVar, kp.i iVar) {
            C17542s.j(iVar, "referenceMedia");
            lVar.invoke(new b.c(iVar, ((a.f) aVar).a().b()));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(C17642l lVar, Kg.a aVar, String str) {
            C17542s.j(str, "it");
            String b10 = ((a.e) aVar).b();
            if (b10 == null) {
                b10 = "";
            }
            lVar.invoke(new b.d(str, b10));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(C17642l lVar, Kg.a aVar, C11588a aVar2) {
            C17542s.j(aVar2, "it");
            a.c cVar = (a.c) aVar;
            lVar.invoke(new b.C1235b(cVar.a().e().getUrl(), cVar.a().f(), cVar.a().h()));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void f(w0.m r9, int r10, U0.C4889m r11, int r12) {
            /*
                r8 = this;
                java.lang.String r0 = "$this$items"
                kotlin.jvm.internal.C17542s.j(r9, r0)
                r9 = r12 & 48
                r0 = 32
                if (r9 != 0) goto L_0x0016
                boolean r9 = r11.d(r10)
                if (r9 == 0) goto L_0x0013
                r9 = r0
                goto L_0x0015
            L_0x0013:
                r9 = 16
            L_0x0015:
                r12 = r12 | r9
            L_0x0016:
                r9 = r12 & 145(0x91, float:2.03E-43)
                r1 = 144(0x90, float:2.02E-43)
                if (r9 != r1) goto L_0x0028
                boolean r9 = r11.l()
                if (r9 != 0) goto L_0x0023
                goto L_0x0028
            L_0x0023:
                r11.L()
                goto L_0x01df
            L_0x0028:
                boolean r9 = U0.C4895p.J()
                if (r9 == 0) goto L_0x0037
                r9 = -1
                java.lang.String r1 = "com.ingka.ikea.app.inspire.ui.InspireLoadedContent.<anonymous>.<anonymous>.<anonymous> (InspireScreen.kt:259)"
                r2 = 919685968(0x36d14b50, float:6.237453E-6)
                U0.C4895p.S(r2, r12, r9, r1)
            L_0x0037:
                E4.a<Kg.a> r9 = r8.f61369a
                java.lang.Object r9 = r9.f(r10)
                Kg.a r9 = (Kg.a) r9
                boolean r10 = r9 instanceof Kg.a.C1021a
                if (r10 != 0) goto L_0x01cd
                boolean r10 = r9 instanceof Kg.a.b
                if (r10 != 0) goto L_0x01cd
                if (r9 != 0) goto L_0x004b
                goto L_0x01cd
            L_0x004b:
                boolean r10 = r9 instanceof Kg.a.d
                r12 = 0
                if (r10 == 0) goto L_0x0066
                r10 = -528984789(0xffffffffe078552b, float:-7.1577024E19)
                r11.W(r10)
                Kg.a$d r9 = (Kg.a.d) r9
                KJ.c r9 = r9.a()
                r10 = 0
                r0 = 2
                HC.r.h(r9, r12, r11, r10, r0)
                r11.P()
                goto L_0x01d6
            L_0x0066:
                boolean r10 = r9 instanceof Kg.a.f
                if (r10 == 0) goto L_0x00f2
                r10 = -528776252(0xffffffffe07b83c4, float:-7.249418E19)
                r11.W(r10)
                r10 = r9
                Kg.a$f r10 = (Kg.a.f) r10
                kp.m r1 = r10.a()
                r10 = 537136104(0x20040be8, float:1.1184774E-19)
                r11.W(r10)
                nI.l<com.ingka.ikea.app.inspire.b, XH.N> r10 = r8.f61370b
                boolean r10 = r11.V(r10)
                boolean r2 = r11.V(r9)
                r10 = r10 | r2
                nI.l<com.ingka.ikea.app.inspire.b, XH.N> r2 = r8.f61370b
                java.lang.Object r3 = r11.D()
                if (r10 != 0) goto L_0x0098
                U0.m$a r10 = U0.C4889m.f14007a
                java.lang.Object r10 = r10.a()
                if (r3 != r10) goto L_0x00a0
            L_0x0098:
                Jg.q r3 = new Jg.q
                r3.<init>(r2, r9)
                r11.u(r3)
            L_0x00a0:
                r2 = r3
                nI.l r2 = (nI.C17642l) r2
                r11.P()
                r10 = 537152181(0x20044ab5, float:1.1205553E-19)
                r11.W(r10)
                nI.l<com.ingka.ikea.app.inspire.b, XH.N> r10 = r8.f61370b
                boolean r10 = r11.V(r10)
                boolean r3 = r11.V(r9)
                r10 = r10 | r3
                nI.l<com.ingka.ikea.app.inspire.b, XH.N> r3 = r8.f61370b
                java.lang.Object r4 = r11.D()
                if (r10 != 0) goto L_0x00c7
                U0.m$a r10 = U0.C4889m.f14007a
                java.lang.Object r10 = r10.a()
                if (r4 != r10) goto L_0x00cf
            L_0x00c7:
                Jg.r r4 = new Jg.r
                r4.<init>(r3, r9)
                r11.u(r4)
            L_0x00cf:
                r3 = r4
                nI.l r3 = (nI.C17642l) r3
                r11.P()
                androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
                float r10 = (float) r0
                float r10 = c2.h.B(r10)
                r0 = 0
                r4 = 1
                androidx.compose.ui.d r9 = androidx.compose.foundation.layout.D.k(r9, r0, r10, r4, r12)
                androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r9, r0, r4, r12)
                r6 = 3072(0xc00, float:4.305E-42)
                r7 = 0
                r5 = r11
                HC.T.g(r1, r2, r3, r4, r5, r6, r7)
                r11.P()
                goto L_0x01d6
            L_0x00f2:
                boolean r10 = r9 instanceof Kg.a.e
                if (r10 == 0) goto L_0x0142
                r10 = -527536562(0xffffffffe08e6e4e, float:-8.210581E19)
                r11.W(r10)
                r10 = r9
                Kg.a$e r10 = (Kg.a.e) r10
                java.lang.String r0 = r10.b()
                KJ.c r1 = r10.a()
                r10 = 537177249(0x2004aca1, float:1.1237953E-19)
                r11.W(r10)
                nI.l<com.ingka.ikea.app.inspire.b, XH.N> r10 = r8.f61370b
                boolean r10 = r11.V(r10)
                boolean r12 = r11.V(r9)
                r10 = r10 | r12
                nI.l<com.ingka.ikea.app.inspire.b, XH.N> r12 = r8.f61370b
                java.lang.Object r2 = r11.D()
                if (r10 != 0) goto L_0x0128
                U0.m$a r10 = U0.C4889m.f14007a
                java.lang.Object r10 = r10.a()
                if (r2 != r10) goto L_0x0130
            L_0x0128:
                Jg.s r2 = new Jg.s
                r2.<init>(r12, r9)
                r11.u(r2)
            L_0x0130:
                nI.l r2 = (nI.C17642l) r2
                r11.P()
                r5 = 0
                r6 = 8
                r3 = 0
                r4 = r11
                HC.K.g(r0, r1, r2, r3, r4, r5, r6)
                r11.P()
                goto L_0x01d6
            L_0x0142:
                boolean r10 = r9 instanceof Kg.a.c
                if (r10 == 0) goto L_0x01be
                r10 = -526944772(0xffffffffe09775fc, float:-8.731125E19)
                r11.W(r10)
                r10 = r9
                Kg.a$c r10 = (Kg.a.c) r10
                mp.a r0 = r10.a()
                LC.b$a r1 = LC.C13178b.a.f111818a
                r2 = 537197159(0x2004fa67, float:1.1263686E-19)
                r11.W(r2)
                nI.l<com.ingka.ikea.app.inspire.b, XH.N> r2 = r8.f61370b
                boolean r2 = r11.V(r2)
                boolean r3 = r11.V(r9)
                r2 = r2 | r3
                nI.l<com.ingka.ikea.app.inspire.b, XH.N> r3 = r8.f61370b
                java.lang.Object r4 = r11.D()
                if (r2 != 0) goto L_0x0176
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r4 != r2) goto L_0x017e
            L_0x0176:
                Jg.t r4 = new Jg.t
                r4.<init>(r3, r9)
                r11.u(r4)
            L_0x017e:
                r2 = r4
                nI.l r2 = (nI.C17642l) r2
                r11.P()
                androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
                r3 = 4
                float r3 = (float) r3
                float r3 = c2.h.B(r3)
                androidx.compose.ui.d r9 = androidx.compose.foundation.layout.D.i(r9, r3)
                r3 = 6
                float r3 = (float) r3
                float r3 = c2.h.B(r3)
                A0.f r3 = A0.g.e(r3)
                androidx.compose.ui.d r3 = m1.e.a(r9, r3)
                mp.a r9 = r10.a()
                float r9 = r9.d()
                r10 = 1065353216(0x3f800000, float:1.0)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 != 0) goto L_0x01b0
                java.lang.Float r12 = java.lang.Float.valueOf(r10)
            L_0x01b0:
                r4 = r12
                int r9 = LC.C13178b.a.f111819b
                int r6 = r9 << 3
                r7 = 0
                r5 = r11
                MC.C13203i.c(r0, r1, r2, r3, r4, r5, r6, r7)
                r11.P()
                goto L_0x01d6
            L_0x01be:
                r9 = 537121467(0x2003d2bb, float:1.1165856E-19)
                r11.W(r9)
                r11.P()
                XH.t r9 = new XH.t
                r9.<init>()
                throw r9
            L_0x01cd:
                r9 = -529090189(0xffffffffe076b973, float:-7.111347E19)
                r11.W(r9)
                r11.P()
            L_0x01d6:
                boolean r9 = U0.C4895p.J()
                if (r9 == 0) goto L_0x01df
                U0.C4895p.R()
            L_0x01df:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Jg.o.d.f(w0.m, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            f((w0.m) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends C17540p implements C17642l<String, C16807N> {
        e(Object obj) {
            super(1, obj, Kg.b.class, "selectFilter", "selectFilter(Ljava/lang/String;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((String) obj);
            return C16807N.f139792a;
        }

        public final void t(String str) {
            C17542s.j(str, "p0");
            ((Kg.b) this.receiver).E(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f extends C17540p implements C17631a<C16807N> {
        f(Object obj) {
            super(0, obj, Kg.b.class, "viewAllRooms", "viewAllRooms()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((Kg.b) this.receiver).F();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g1 f61371a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<com.ingka.ikea.app.inspire.b, C16807N> f61372b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ E4.a<Kg.a> f61373c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f61374d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f61375e;

        g(g1 g1Var, C17642l<? super com.ingka.ikea.app.inspire.b, C16807N> lVar, E4.a<Kg.a> aVar, C17642l<? super String, C16807N> lVar2, C17631a<C16807N> aVar2) {
            this.f61371a = g1Var;
            this.f61372b = lVar;
            this.f61373c = aVar;
            this.f61374d = lVar2;
            this.f61375e = aVar2;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar) {
            lVar.invoke(b.a.f72009a);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r11, int r12) {
            /*
                r10 = this;
                r0 = r12 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0010
                boolean r0 = r11.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0010
            L_0x000c:
                r11.L()
                goto L_0x0062
            L_0x0010:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x001f
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.app.inspire.ui.InspireScreen.<anonymous> (InspireScreen.kt:85)"
                r2 = -1078151688(0xffffffffbfbcb5f8, float:-1.4743032)
                U0.C4895p.S(r2, r12, r0, r1)
            L_0x001f:
                O0.g1 r3 = r10.f61371a
                r12 = 1969423563(0x756304cb, float:2.8778042E32)
                r11.W(r12)
                nI.l<com.ingka.ikea.app.inspire.b, XH.N> r12 = r10.f61372b
                boolean r12 = r11.V(r12)
                nI.l<com.ingka.ikea.app.inspire.b, XH.N> r0 = r10.f61372b
                java.lang.Object r1 = r11.D()
                if (r12 != 0) goto L_0x003d
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r1 != r12) goto L_0x0045
            L_0x003d:
                Jg.u r1 = new Jg.u
                r1.<init>(r0)
                r11.u(r1)
            L_0x0045:
                r4 = r1
                nI.a r4 = (nI.C17631a) r4
                r11.P()
                E4.a<Kg.a> r5 = r10.f61373c
                nI.l<java.lang.String, XH.N> r6 = r10.f61374d
                nI.a<XH.N> r7 = r10.f61375e
                int r12 = E4.a.f34837h
                int r9 = r12 << 6
                r8 = r11
                Jg.o.z(r3, r4, r5, r6, r7, r8, r9)
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x0062
                U0.C4895p.R()
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Jg.o.g.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E4.a<Kg.a> f61376a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<com.ingka.ikea.app.inspire.b, C16807N> f61377b;

        h(E4.a<Kg.a> aVar, C17642l<? super com.ingka.ikea.app.inspire.b, C16807N> lVar) {
            this.f61376a = aVar;
            this.f61377b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(E4.a aVar) {
            aVar.l();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(E4.a aVar) {
            aVar.l();
            return C16807N.f139792a;
        }

        public final void c(C5834E e10, C4889m mVar, int i10) {
            int i11;
            C5834E e11 = e10;
            C4889m mVar2 = mVar;
            C17542s.j(e11, "contentPadding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(e11) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(288261197, i11, -1, "com.ingka.ikea.app.inspire.ui.InspireScreen.<anonymous> (InspireScreen.kt:96)");
                }
                d.a aVar = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d h10 = D.h(J.f(aVar, 0.0f, 1, (Object) null), e11);
                E4.a<Kg.a> aVar2 = this.f61376a;
                C17642l<com.ingka.ikea.app.inspire.b, C16807N> lVar = this.f61377b;
                C5437c.a aVar3 = C5437c.f24302a;
                I h11 = C5077h.h(aVar3.o(), false);
                int a10 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e12 = androidx.compose.ui.c.e(mVar2, h10);
                C4504g.a aVar4 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar4.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a12 = F1.a(mVar);
                F1.c(a12, h11, aVar4.c());
                F1.c(a12, s10, aVar4.e());
                p<C4504g, Integer, C16807N> b10 = aVar4.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b10);
                }
                F1.c(a12, e12, aVar4.d());
                C5079j jVar = C5079j.f18125a;
                C6447v d10 = aVar2.i().d();
                if (d10 instanceof C6447v.a) {
                    mVar2.W(-248214078);
                    mVar2.W(1931657678);
                    boolean F10 = mVar2.F(aVar2);
                    Object D10 = mVar.D();
                    if (F10 || D10 == C4889m.f14007a.a()) {
                        D10 = new v(aVar2);
                        mVar2.u(D10);
                    }
                    mVar.P();
                    c.c((C17631a) D10, jVar.a(TC.e.i(J.h(aVar, 0.0f, 1, (Object) null)), aVar3.e()), mVar2, 0, 0);
                    mVar.P();
                } else if (C17542s.e(d10, C6447v.b.f34456b)) {
                    mVar2.W(-247851502);
                    C13605k1.b(jVar.a(J.h(aVar, 0.0f, 1, (Object) null), aVar3.e()), (C13597i1) null, C13593h1.Large, mVar, 384, 2);
                    mVar.P();
                } else if (d10 instanceof C6447v.c) {
                    mVar2.W(-247531985);
                    o.p(aVar2, lVar, mVar2, E4.a.f34837h);
                    mVar.P();
                } else {
                    mVar2.W(1931653953);
                    mVar.P();
                    throw new t();
                }
                C6447v a13 = aVar2.i().a();
                if (a13 instanceof C6447v.c) {
                    mVar2.W(-247245080);
                    mVar.P();
                } else if (C17542s.e(a13, C6447v.b.f34456b)) {
                    mVar2.W(-247198208);
                    C4747p0.c(jVar.a(J.h(aVar, 0.0f, 1, (Object) null), aVar3.b()), 0, 0, 0, 0.0f, mVar, 0, 30);
                    mVar.P();
                } else if (a13 instanceof C6447v.a) {
                    mVar2.W(-246923269);
                    mVar2.W(1931699630);
                    boolean F11 = mVar2.F(aVar2);
                    Object D11 = mVar.D();
                    if (F11 || D11 == C4889m.f14007a.a()) {
                        D11 = new w(aVar2);
                        mVar2.u(D11);
                    }
                    mVar.P();
                    c.e((C17631a) D11, jVar.a(D.i(J.h(aVar, 0.0f, 1, (Object) null), c2.h.B((float) 16)), aVar3.b()), mVar2, 0, 0);
                    mVar.P();
                } else {
                    mVar2.W(1931685183);
                    mVar.P();
                    throw new t();
                }
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E4.a<Kg.a> f61378a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f61379b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f61380c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f61381d;

        i(E4.a<Kg.a> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17642l<? super String, C16807N> lVar) {
            this.f61378a = aVar;
            this.f61379b = aVar2;
            this.f61380c = aVar3;
            this.f61381d = lVar;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1942006248, i11, -1, "com.ingka.ikea.app.inspire.ui.TopBar.<anonymous> (InspireScreen.kt:165)");
                }
                E4.a<Kg.a> aVar = this.f61378a;
                C17631a<C16807N> aVar2 = this.f61379b;
                C17631a<C16807N> aVar3 = this.f61380c;
                C17642l<String, C16807N> lVar = this.f61381d;
                d.a aVar4 = androidx.compose.ui.d.f18749a;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, aVar4);
                C4504g.a aVar5 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar5.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar5.c());
                F1.c(a13, s10, aVar5.e());
                p<C4504g, Integer, C16807N> b10 = aVar5.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar5.d());
                C5862h hVar = C5862h.f28810a;
                C6445t<Kg.a> h10 = aVar.h();
                ArrayList arrayList = new ArrayList();
                for (Kg.a next : h10) {
                    if (next instanceof a.b) {
                        arrayList.add(next);
                    }
                }
                a.b bVar = (a.b) C16877v.y0(arrayList);
                String a14 = bVar != null ? bVar.a() : null;
                v vVar = v.BACK;
                if (a14 == null) {
                    a14 = "";
                }
                C17642l<String, C16807N> lVar2 = lVar;
                ol.p.c(vVar, aVar2, (androidx.compose.ui.d) null, a14, (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, mVar, 6, 500);
                C6445t<Kg.a> h11 = aVar.h();
                ArrayList arrayList2 = new ArrayList();
                for (Kg.a next2 : h11) {
                    if (next2 instanceof a.C1021a) {
                        arrayList2.add(next2);
                    }
                }
                a.C1021a aVar6 = (a.C1021a) C16877v.y0(arrayList2);
                mVar2.W(-974528208);
                if (aVar6 != null) {
                    o.l(aVar6, aVar3, lVar2, mVar2, 0);
                }
                mVar.P();
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(g1 g1Var, C17631a aVar, E4.a aVar2, C17642l lVar, C17631a aVar3, int i10, C4889m mVar, int i11) {
        z(g1Var, aVar, aVar2, lVar, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: nI.l} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(Kg.a.C1021a r23, nI.C17631a<XH.C16807N> r24, nI.C17642l<? super java.lang.String, XH.C16807N> r25, U0.C4889m r26, int r27) {
        /*
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r27
            r4 = -1872036647(0xffffffff906afcd9, float:-4.634315E-29)
            r5 = r26
            U0.m r15 = r5.k(r4)
            r5 = r3 & 6
            if (r5 != 0) goto L_0x0020
            boolean r5 = r15.F(r0)
            if (r5 == 0) goto L_0x001d
            r5 = 4
            goto L_0x001e
        L_0x001d:
            r5 = 2
        L_0x001e:
            r5 = r5 | r3
            goto L_0x0021
        L_0x0020:
            r5 = r3
        L_0x0021:
            r6 = r3 & 48
            r7 = 16
            r8 = 32
            if (r6 != 0) goto L_0x0033
            boolean r6 = r15.F(r1)
            if (r6 == 0) goto L_0x0031
            r6 = r8
            goto L_0x0032
        L_0x0031:
            r6 = r7
        L_0x0032:
            r5 = r5 | r6
        L_0x0033:
            r6 = r3 & 384(0x180, float:5.38E-43)
            r9 = 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L_0x0044
            boolean r6 = r15.F(r2)
            if (r6 == 0) goto L_0x0041
            r6 = r9
            goto L_0x0043
        L_0x0041:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r5 = r5 | r6
        L_0x0044:
            r6 = r5 & 147(0x93, float:2.06E-43)
            r10 = 146(0x92, float:2.05E-43)
            if (r6 != r10) goto L_0x0057
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x0051
            goto L_0x0057
        L_0x0051:
            r15.L()
            r7 = r15
            goto L_0x0122
        L_0x0057:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0063
            r6 = -1
            java.lang.String r10 = "com.ingka.ikea.app.inspire.ui.FilterBar (InspireScreen.kt:194)"
            U0.C4895p.S(r4, r5, r6, r10)
        L_0x0063:
            r4 = 3
            r6 = 0
            t0.A r4 = t0.C5935B.c(r6, r6, r15, r6, r4)
            androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r10 = z0.C6270a.a(r10)
            float r7 = (float) r7
            float r16 = c2.h.B(r7)
            float r18 = c2.h.B(r7)
            r7 = 8
            float r7 = (float) r7
            float r19 = c2.h.B(r7)
            r20 = 2
            r21 = 0
            r17 = 0
            s0.E r11 = androidx.compose.foundation.layout.D.e(r16, r17, r18, r19, r20, r21)
            androidx.compose.foundation.layout.d r12 = androidx.compose.foundation.layout.C5073d.f18068a
            float r7 = c2.h.B(r7)
            androidx.compose.foundation.layout.d$f r12 = r12.n(r7)
            r7 = 253883832(0xf21f5b8, float:7.9852366E-30)
            r15.W(r7)
            boolean r7 = r15.F(r0)
            r13 = r5 & 112(0x70, float:1.57E-43)
            r14 = 1
            if (r13 != r8) goto L_0x00a4
            r8 = r14
            goto L_0x00a5
        L_0x00a4:
            r8 = r6
        L_0x00a5:
            r7 = r7 | r8
            r5 = r5 & 896(0x380, float:1.256E-42)
            if (r5 != r9) goto L_0x00ab
            r6 = r14
        L_0x00ab:
            r5 = r7 | r6
            java.lang.Object r6 = r15.D()
            if (r5 != 0) goto L_0x00bb
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00c3
        L_0x00bb:
            Jg.m r6 = new Jg.m
            r6.<init>(r0, r1, r2)
            r15.u(r6)
        L_0x00c3:
            r13 = r6
            nI.l r13 = (nI.C17642l) r13
            r15.P()
            r16 = 24966(0x6186, float:3.4985E-41)
            r17 = 232(0xe8, float:3.25E-43)
            r8 = 0
            r14 = 0
            r18 = 0
            r19 = 0
            r5 = r10
            r6 = r4
            r7 = r11
            r9 = r12
            r10 = r14
            r11 = r18
            r12 = r19
            r14 = r15
            r22 = r15
            r15 = r16
            r16 = r17
            t0.C5937b.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            XH.N r5 = XH.C16807N.f139792a
            r6 = 253910188(0xf225cac, float:8.0050646E-30)
            r7 = r22
            r7.W(r6)
            boolean r6 = r7.F(r0)
            boolean r8 = r7.V(r4)
            r6 = r6 | r8
            java.lang.Object r8 = r7.D()
            if (r6 != 0) goto L_0x0107
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x0110
        L_0x0107:
            Jg.o$c r8 = new Jg.o$c
            r6 = 0
            r8.<init>(r0, r4, r6)
            r7.u(r8)
        L_0x0110:
            nI.p r8 = (nI.p) r8
            r7.P()
            r4 = 6
            U0.P.g(r5, r8, r7, r4)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0122
            U0.C4895p.R()
        L_0x0122:
            U0.Y0 r4 = r7.n()
            if (r4 == 0) goto L_0x0130
            Jg.n r5 = new Jg.n
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Jg.o.l(Kg.a$a, nI.a, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N m(a.C1021a aVar, C17631a aVar2, C17642l lVar, int i10, C4889m mVar, int i11) {
        l(aVar, aVar2, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(a.C1021a aVar, C17631a aVar2, C17642l lVar, x xVar) {
        C17542s.j(xVar, "$this$LazyRow");
        x xVar2 = xVar;
        x.i(xVar2, (Object) null, (Object) null, c1.c.c(1648450683, true, new a(aVar, aVar2)), 3, (Object) null);
        x.a(xVar2, aVar.a().size(), new e(aVar), (C17642l) null, c1.c.c(253340420, true, new b(aVar, lVar)), 4, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Object o(a.C1021a aVar, int i10) {
        return aVar.a().get(i10).c();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: nI.l} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void p(E4.a<Kg.a> r18, nI.C17642l<? super com.ingka.ikea.app.inspire.b, XH.C16807N> r19, U0.C4889m r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = -692327099(0xffffffffd6bbed45, float:-1.0331387E14)
            r4 = r20
            U0.m r15 = r4.k(r3)
            r4 = r2 & 6
            r5 = 2
            r6 = 4
            if (r4 != 0) goto L_0x0029
            r4 = r2 & 8
            if (r4 != 0) goto L_0x001e
            boolean r4 = r15.V(r0)
            goto L_0x0022
        L_0x001e:
            boolean r4 = r15.F(r0)
        L_0x0022:
            if (r4 == 0) goto L_0x0026
            r4 = r6
            goto L_0x0027
        L_0x0026:
            r4 = r5
        L_0x0027:
            r4 = r4 | r2
            goto L_0x002a
        L_0x0029:
            r4 = r2
        L_0x002a:
            r7 = r2 & 48
            r8 = 32
            if (r7 != 0) goto L_0x003b
            boolean r7 = r15.F(r1)
            if (r7 == 0) goto L_0x0038
            r7 = r8
            goto L_0x003a
        L_0x0038:
            r7 = 16
        L_0x003a:
            r4 = r4 | r7
        L_0x003b:
            r7 = r4 & 19
            r9 = 18
            if (r7 != r9) goto L_0x004e
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            r15.L()
            r3 = r15
            goto L_0x00bc
        L_0x004e:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x005a
            r7 = -1
            java.lang.String r9 = "com.ingka.ikea.app.inspire.ui.InspireLoadedContent (InspireScreen.kt:245)"
            U0.C4895p.S(r3, r4, r7, r9)
        L_0x005a:
            w0.H$a r3 = new w0.H$a
            r3.<init>(r5)
            r5 = 1542850705(0x5bf60891, float:1.38504526E17)
            r15.W(r5)
            r5 = r4 & 14
            r7 = 1
            r9 = 0
            if (r5 == r6) goto L_0x0078
            r5 = r4 & 8
            if (r5 == 0) goto L_0x0076
            boolean r5 = r15.F(r0)
            if (r5 == 0) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r5 = r9
            goto L_0x0079
        L_0x0078:
            r5 = r7
        L_0x0079:
            r4 = r4 & 112(0x70, float:1.57E-43)
            if (r4 != r8) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r7 = r9
        L_0x007f:
            r4 = r5 | r7
            java.lang.Object r5 = r15.D()
            if (r4 != 0) goto L_0x008f
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x0097
        L_0x008f:
            Jg.h r5 = new Jg.h
            r5.<init>(r0, r1)
            r15.u(r5)
        L_0x0097:
            r13 = r5
            nI.l r13 = (nI.C17642l) r13
            r15.P()
            r16 = 0
            r17 = 510(0x1fe, float:7.15E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r4 = r3
            r14 = r15
            r3 = r15
            r15 = r16
            r16 = r17
            w0.C6199f.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00bc
            U0.C4895p.R()
        L_0x00bc:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x00ca
            Jg.i r4 = new Jg.i
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Jg.o.p(E4.a, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N q(E4.a aVar, C17642l lVar, w0.y yVar) {
        C17542s.j(yVar, "$this$LazyVerticalStaggeredGrid");
        w0.y.g(yVar, aVar.g(), (C17642l) null, new k(aVar), new l(aVar), c1.c.c(919685968, true, new d(aVar, lVar)), 2, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Object r(E4.a aVar, int i10) {
        Kg.a aVar2 = (Kg.a) aVar.f(i10);
        if (aVar2 != null) {
            return aVar2.getClass().getName();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final w0.I s(E4.a aVar, int i10) {
        return ((Kg.a) aVar.f(i10)) instanceof a.c ? w0.I.f31173b.b() : w0.I.f31173b.a();
    }

    /* access modifiers changed from: private */
    public static final C16807N t(E4.a aVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        p(aVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void u(E4.a<Kg.a> aVar, C17642l<? super com.ingka.ikea.app.inspire.b, C16807N> lVar, C17642l<? super String, C16807N> lVar2, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        E4.a<Kg.a> aVar3 = aVar;
        C17642l<? super com.ingka.ikea.app.inspire.b, C16807N> lVar3 = lVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-1172310724);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(aVar3) : k10.F(aVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar3) ? 32 : 16;
        }
        C17642l<? super String, C16807N> lVar4 = lVar2;
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar4) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        } else {
            C17631a<C16807N> aVar4 = aVar2;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1172310724, i11, -1, "com.ingka.ikea.app.inspire.ui.InspireScreen (InspireScreen.kt:79)");
            }
            g1 b10 = f1.f10774a.b((h1) null, (C17631a<Boolean>) null, (C5546i<Float>) null, (C5570z<Float>) null, k10, f1.f10780g << 12, 15);
            C4889m mVar3 = k10;
            mVar2 = mVar3;
            C4762x0.a(androidx.compose.ui.input.nestedscroll.a.b(androidx.compose.ui.d.f18749a, b10.a(), (C6272b) null, 2, (Object) null), c1.c.e(-1078151688, true, new g(b10, lVar, aVar, lVar2, aVar2), mVar3, 54), (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, (C5848T) null, c1.c.e(288261197, true, new h(aVar3, lVar3), mVar3, 54), mVar2, 805306416, 508);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new g(aVar, lVar, lVar2, aVar2, i10));
        }
    }

    public static final void v(Kg.b bVar, C17642l<? super com.ingka.ikea.app.inspire.b, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(bVar, "inspireViewModel");
        C17542s.j(lVar, "screenUiEvent");
        C4889m k10 = mVar.k(1821837515);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1821837515, i11, -1, "com.ingka.ikea.app.inspire.ui.InspireScreen (InspireScreen.kt:58)");
            }
            boolean z10 = false;
            E4.a<M<Kg.a>> b10 = E4.b.b(bVar.C(), (C17168i) null, k10, 0, 1);
            k10.W(1031775875);
            boolean F10 = k10.F(bVar);
            if ((i11 & 112) == 32) {
                z10 = true;
            }
            boolean z11 = F10 | z10;
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                D10 = new d(bVar, lVar);
                k10.u(D10);
            }
            C17642l lVar2 = (C17642l) D10;
            k10.P();
            k10.W(1031780088);
            boolean F11 = k10.F(bVar);
            Object D11 = k10.D();
            if (F11 || D11 == C4889m.f14007a.a()) {
                D11 = new e(bVar);
                k10.u(D11);
            }
            k10.P();
            C17642l lVar3 = (C17642l) ((C18059h) D11);
            k10.W(1031782168);
            boolean F12 = k10.F(bVar);
            Object D12 = k10.D();
            if (F12 || D12 == C4889m.f14007a.a()) {
                D12 = new f(bVar);
                k10.u(D12);
            }
            k10.P();
            u(b10, lVar2, lVar3, (C17631a) ((C18059h) D12), k10, E4.a.f34837h);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new f(bVar, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N w(Kg.b bVar, C17642l lVar, com.ingka.ikea.app.inspire.b bVar2) {
        C17542s.j(bVar2, "event");
        bVar.D(bVar2);
        lVar.invoke(bVar2);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(Kg.b bVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        v(bVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(E4.a aVar, C17642l lVar, C17642l lVar2, C17631a aVar2, int i10, C4889m mVar, int i11) {
        u(aVar, lVar, lVar2, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void z(g1 g1Var, C17631a<C16807N> aVar, E4.a<Kg.a> aVar2, C17642l<? super String, C16807N> lVar, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(310024303);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(g1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? k10.V(aVar2) : k10.F(aVar2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= k10.F(lVar) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= k10.F(aVar3) ? 16384 : 8192;
        }
        if ((i11 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(310024303, i11, -1, "com.ingka.ikea.app.inspire.ui.TopBar (InspireScreen.kt:161)");
            }
            k.e((androidx.compose.ui.d) null, (ol.e) null, g1Var, c1.c.e(1942006248, true, new i(aVar2, aVar, aVar3, lVar), k10, 54), k10, ((i11 << 6) & 896) | 3072, 3);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new j(g1Var, aVar, aVar2, lVar, aVar3, i10));
        }
    }
}
