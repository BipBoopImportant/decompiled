package Bj;

import Cj.n;
import Cj.x;
import E1.I;
import G1.C4504g;
import KJ.C15985a;
import KJ.C15987c;
import QJ.Q;
import U0.A1;
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
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.ui.d;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import com.ingka.ikea.core.model.product.CustomerCare;
import com.ingka.ikea.core.model.product.CustomerMaterial;
import com.ingka.ikea.core.model.product.GoodToKnow;
import com.ingka.ikea.core.model.product.PackageDetailsItem;
import com.ingka.ikea.core.model.product.PackageInformation;
import com.ingka.ikea.core.model.product.SafetyAndCompliance;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import yj.C12347a;
import zj.C12520a;
import zj.C12521b;
import zj.C12522c;
import zj.C12524e;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u0002"}, d2 = {"Lyj/a;", "viewModel", "LBj/i;", "actions", "LXH/N;", "h", "(Lyj/a;LBj/i;LU0/m;I)V", "Lzj/e;", "uiState", "i", "(Lzj/e;LBj/i;LU0/m;I)V", "Lzj/c;", "uiData", "f", "(Lzj/c;LBj/i;LU0/m;I)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Bj/o$a", "LCj/o;", "", "expanded", "LXH/N;", "a", "(Z)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Cj.o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f79230a;

        a(i iVar) {
            this.f79230a = iVar;
        }

        public void a(boolean z10) {
            this.f79230a.b(new C12521b.c(z10));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.composable.screen.ProductDetailsSectionScreenKt$ProductDetailsSectionScreen$2$1", f = "ProductDetailsSectionScreen.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f79231c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12524e f79232d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f79233e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C12524e eVar, i iVar, C17164e<? super b> eVar2) {
            super(2, eVar2);
            this.f79232d = eVar;
            this.f79233e = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f79232d, this.f79233e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f79231c == 0) {
                y.b(obj);
                C12520a a10 = this.f79232d.a();
                i iVar = this.f79233e;
                iVar.a(a10);
                iVar.b(C12521b.C2562b.f107368a);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f79234a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                Op.h1[] r0 = Op.h1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Op.h1 r1 = Op.h1.DETAILS_AND_SIZING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Op.h1 r1 = Op.h1.GOOD_TO_KNOW     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Op.h1 r1 = Op.h1.MATERIALS_AND_CARE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Op.h1 r1 = Op.h1.SAFETY_AND_COMPLIANCE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                Op.h1 r1 = Op.h1.ASSEMBLY_AND_DOCUMENTS     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                Op.h1 r1 = Op.h1.REVIEWS     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                Op.h1 r1 = Op.h1.TECHNICAL_INFORMATION     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f79234a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Bj.o.c.<clinit>():void");
        }
    }

    private static final void f(C12522c cVar, i iVar, C4889m mVar, int i10) {
        int i11;
        C15987c cVar2;
        C4889m k10 = mVar.k(1194297939);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? k10.V(iVar) : k10.F(iVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1194297939, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.composable.screen.ProductDetailsSection (ProductDetailsSectionScreen.kt:97)");
            }
            C15987c cVar3 = null;
            switch (c.f79234a[cVar.d().ordinal()]) {
                case 1:
                    k10.W(-1455841283);
                    List<PackageInformation> c10 = cVar.c();
                    C15987c h10 = c10 != null ? C15985a.h(c10) : null;
                    List<PackageDetailsItem> b10 = cVar.b();
                    if (b10 != null) {
                        cVar3 = C15985a.h(b10);
                    }
                    x.t(h10, cVar3, new a(iVar), k10, 0);
                    k10.P();
                    break;
                case 2:
                    k10.W(-1455820719);
                    List<GoodToKnow> i12 = cVar.a().i();
                    if (i12 == null || (cVar2 = C15985a.h(i12)) == null) {
                        cVar2 = C15985a.a();
                    }
                    Cj.l.c(cVar2, (d) null, k10, 0, 2);
                    k10.P();
                    break;
                case 3:
                    k10.W(-1455815052);
                    List<CustomerMaterial> g10 = cVar.a().g();
                    C15987c h11 = g10 != null ? C15985a.h(g10) : null;
                    List<CustomerCare> e10 = cVar.a().e();
                    C15987c h12 = e10 != null ? C15985a.h(e10) : null;
                    List<SafetyAndCompliance> j10 = cVar.a().j();
                    if (j10 != null) {
                        cVar3 = C15985a.h(j10);
                    }
                    n.b(h11, h12, cVar3, k10, 0);
                    k10.P();
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    k10.W(-1455798952);
                    d.a aVar = d.f18749a;
                    I h13 = C5077h.h(C5437c.f24302a.o(), false);
                    int a10 = C4883j.a(k10, 0);
                    C4912y s10 = k10.s();
                    d e11 = androidx.compose.ui.c.e(k10, aVar);
                    C4504g.a aVar2 = C4504g.f6515W;
                    C17631a<C4504g> a11 = aVar2.a();
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
                    F1.c(a12, h13, aVar2.c());
                    F1.c(a12, s10, aVar2.e());
                    p<C4504g, Integer, C16807N> b11 = aVar2.b();
                    if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                        a12.u(Integer.valueOf(a10));
                        a12.w(Integer.valueOf(a10), b11);
                    }
                    F1.c(a12, e11, aVar2.d());
                    C5079j jVar = C5079j.f18125a;
                    k10.x();
                    k10.P();
                    break;
                default:
                    k10.W(-1455842749);
                    k10.P();
                    throw new t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new n(cVar, iVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C12522c cVar, i iVar, int i10, C4889m mVar, int i11) {
        f(cVar, iVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void h(C12347a aVar, i iVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(aVar, "viewModel");
        C17542s.j(iVar, "actions");
        C4889m k10 = mVar.k(-1649294293);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? k10.V(iVar) : k10.F(iVar) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1649294293, i12, -1, "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.composable.screen.ProductDetailsSectionScreen (ProductDetailsSectionScreen.kt:42)");
            }
            i(j(j3.a.c(aVar.getState(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7)), iVar, k10, i12 & 112);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new j(aVar, iVar, i10));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(zj.C12524e r26, Bj.i r27, U0.C4889m r28, int r29) {
        /*
            r0 = r26
            r1 = r27
            r2 = r29
            java.lang.String r3 = "uiState"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r3 = "actions"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            r3 = 1417349616(0x547b09f0, float:4.31281406E12)
            r4 = r28
            U0.m r15 = r4.k(r3)
            r4 = r2 & 6
            r5 = 4
            if (r4 != 0) goto L_0x0029
            boolean r4 = r15.V(r0)
            if (r4 == 0) goto L_0x0026
            r4 = r5
            goto L_0x0027
        L_0x0026:
            r4 = 2
        L_0x0027:
            r4 = r4 | r2
            goto L_0x002a
        L_0x0029:
            r4 = r2
        L_0x002a:
            r6 = r2 & 48
            r14 = 32
            if (r6 != 0) goto L_0x0044
            r6 = r2 & 64
            if (r6 != 0) goto L_0x0039
            boolean r6 = r15.V(r1)
            goto L_0x003d
        L_0x0039:
            boolean r6 = r15.F(r1)
        L_0x003d:
            if (r6 == 0) goto L_0x0041
            r6 = r14
            goto L_0x0043
        L_0x0041:
            r6 = 16
        L_0x0043:
            r4 = r4 | r6
        L_0x0044:
            r13 = r4
            r4 = r13 & 19
            r6 = 18
            if (r4 != r6) goto L_0x0058
            boolean r4 = r15.l()
            if (r4 != 0) goto L_0x0052
            goto L_0x0058
        L_0x0052:
            r15.L()
            r2 = r15
            goto L_0x029f
        L_0x0058:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0064
            r4 = -1
            java.lang.String r6 = "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.composable.screen.ProductDetailsSectionScreen (ProductDetailsSectionScreen.kt:56)"
            U0.C4895p.S(r3, r13, r4, r6)
        L_0x0064:
            zj.a r3 = r26.a()
            r4 = 492210684(0x1d5689fc, float:2.8394E-21)
            r15.W(r4)
            r4 = r13 & 14
            r16 = 1
            r12 = 0
            if (r4 != r5) goto L_0x0078
            r4 = r16
            goto L_0x0079
        L_0x0078:
            r4 = r12
        L_0x0079:
            r11 = r13 & 112(0x70, float:1.57E-43)
            if (r11 == r14) goto L_0x008a
            r5 = r13 & 64
            if (r5 == 0) goto L_0x0088
            boolean r5 = r15.F(r1)
            if (r5 == 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r5 = r12
            goto L_0x008c
        L_0x008a:
            r5 = r16
        L_0x008c:
            r4 = r4 | r5
            java.lang.Object r5 = r15.D()
            r6 = 0
            if (r4 != 0) goto L_0x009c
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x00a4
        L_0x009c:
            Bj.o$b r5 = new Bj.o$b
            r5.<init>(r0, r1, r6)
            r15.u(r5)
        L_0x00a4:
            nI.p r5 = (nI.p) r5
            r15.P()
            U0.P.g(r3, r5, r15, r12)
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r4 = r4.g()
            i1.c$a r17 = i1.C5437c.f24302a
            i1.c$b r5 = r17.k()
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r5, r15, r12)
            int r5 = U0.C4883j.a(r15, r12)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r18 = G1.C4504g.f6515W
            nI.a r9 = r18.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x00d9
            U0.C4883j.c()
        L_0x00d9:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x00e6
            r15.p(r9)
            goto L_0x00e9
        L_0x00e6:
            r15.t()
        L_0x00e9:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r18.c()
            U0.F1.c(r9, r4, r10)
            nI.p r4 = r18.e()
            U0.F1.c(r9, r7, r4)
            nI.p r4 = r18.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x0113
            java.lang.Object r7 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x0121
        L_0x0113:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r9.u(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.w(r5, r4)
        L_0x0121:
            nI.p r4 = r18.d()
            U0.F1.c(r9, r8, r4)
            s0.h r4 = s0.C5862h.f28810a
            boolean r10 = r0 instanceof zj.C12524e.c
            if (r10 == 0) goto L_0x0132
            r4 = r0
            zj.e$c r4 = (zj.C12524e.c) r4
            goto L_0x0133
        L_0x0132:
            r4 = r6
        L_0x0133:
            r5 = 1921121674(0x7281fd8a, float:5.14945E30)
            r15.W(r5)
            if (r4 != 0) goto L_0x013c
            goto L_0x014c
        L_0x013c:
            zj.c r4 = r4.b()
            Op.h1 r4 = r4.d()
            int r4 = r4.j()
            java.lang.String r6 = J1.j.b(r4, r15, r12)
        L_0x014c:
            r15.P()
            if (r6 != 0) goto L_0x0155
            java.lang.String r4 = ""
            r7 = r4
            goto L_0x0156
        L_0x0155:
            r7 = r6
        L_0x0156:
            ol.v r4 = ol.v.BACK
            androidx.compose.ui.d r6 = s0.C5852X.e(r3)
            r5 = 1921129183(0x72821adf, float:5.1539887E30)
            r15.W(r5)
            if (r11 == r14) goto L_0x0171
            r5 = r13 & 64
            if (r5 == 0) goto L_0x016f
            boolean r5 = r15.F(r1)
            if (r5 == 0) goto L_0x016f
            goto L_0x0171
        L_0x016f:
            r5 = r12
            goto L_0x0173
        L_0x0171:
            r5 = r16
        L_0x0173:
            java.lang.Object r8 = r15.D()
            if (r5 != 0) goto L_0x0181
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r8 != r5) goto L_0x0189
        L_0x0181:
            Bj.k r8 = new Bj.k
            r8.<init>(r1)
            r15.u(r8)
        L_0x0189:
            r5 = r8
            nI.a r5 = (nI.C17631a) r5
            r15.P()
            r19 = 6
            r20 = 496(0x1f0, float:6.95E-43)
            r8 = 0
            r9 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = r10
            r10 = r21
            r25 = r11
            r11 = r22
            r12 = r23
            r21 = r13
            r13 = r15
            r14 = r19
            r2 = r15
            r15 = r20
            ol.p.c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            i1.c r4 = r17.o()
            r5 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5077h.h(r4, r5)
            int r6 = U0.C4883j.a(r2, r5)
            U0.y r7 = r2.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r2, r3)
            nI.a r8 = r18.a()
            U0.f r9 = r2.m()
            if (r9 != 0) goto L_0x01d2
            U0.C4883j.c()
        L_0x01d2:
            r2.I()
            boolean r9 = r2.i()
            if (r9 == 0) goto L_0x01df
            r2.p(r8)
            goto L_0x01e2
        L_0x01df:
            r2.t()
        L_0x01e2:
            U0.m r8 = U0.F1.a(r2)
            nI.p r9 = r18.c()
            U0.F1.c(r8, r4, r9)
            nI.p r4 = r18.e()
            U0.F1.c(r8, r7, r4)
            nI.p r4 = r18.b()
            boolean r7 = r8.i()
            if (r7 != 0) goto L_0x020c
            java.lang.Object r7 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r9)
            if (r7 != 0) goto L_0x021a
        L_0x020c:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.w(r6, r4)
        L_0x021a:
            nI.p r4 = r18.d()
            U0.F1.c(r8, r3, r4)
            androidx.compose.foundation.layout.j r3 = androidx.compose.foundation.layout.C5079j.f18125a
            boolean r3 = r0 instanceof zj.C12524e.b
            if (r3 == 0) goto L_0x0234
            r3 = -237830893(0xfffffffff1d2fd13, float:-2.0895296E30)
            r2.W(r3)
            Aj.i.b(r2, r5)
            r2.P()
            goto L_0x0290
        L_0x0234:
            boolean r3 = r0 instanceof zj.C12524e.a
            if (r3 == 0) goto L_0x0279
            r3 = -237828839(0xfffffffff1d30519, float:-2.08984E30)
            r2.W(r3)
            r3 = -237827060(0xfffffffff1d30c0c, float:-2.0901088E30)
            r2.W(r3)
            r4 = r25
            r3 = 32
            if (r4 == r3) goto L_0x0257
            r3 = r21 & 64
            if (r3 == 0) goto L_0x0255
            boolean r3 = r2.F(r1)
            if (r3 == 0) goto L_0x0255
            goto L_0x0257
        L_0x0255:
            r16 = r5
        L_0x0257:
            java.lang.Object r3 = r2.D()
            if (r16 != 0) goto L_0x0265
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r3 != r4) goto L_0x026d
        L_0x0265:
            Bj.l r3 = new Bj.l
            r3.<init>(r1)
            r2.u(r3)
        L_0x026d:
            nI.a r3 = (nI.C17631a) r3
            r2.P()
            Aj.g.b(r3, r2, r5)
            r2.P()
            goto L_0x0290
        L_0x0279:
            r4 = r25
            if (r24 == 0) goto L_0x02b0
            r3 = -237822570(0xfffffffff1d31d96, float:-2.0907873E30)
            r2.W(r3)
            r3 = r0
            zj.e$c r3 = (zj.C12524e.c) r3
            zj.c r3 = r3.b()
            f(r3, r1, r2, r4)
            r2.P()
        L_0x0290:
            r2.x()
            r2.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x029f
            U0.C4895p.R()
        L_0x029f:
            U0.Y0 r2 = r2.n()
            if (r2 == 0) goto L_0x02af
            Bj.m r3 = new Bj.m
            r4 = r29
            r3.<init>(r0, r1, r4)
            r2.a(r3)
        L_0x02af:
            return
        L_0x02b0:
            r0 = r2
            r1 = -237832228(0xfffffffff1d2f7dc, float:-2.0893279E30)
            r0.W(r1)
            r0.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Bj.o.i(zj.e, Bj.i, U0.m, int):void");
    }

    private static final C12524e j(A1<? extends C12524e> a12) {
        return (C12524e) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C12347a aVar, i iVar, int i10, C4889m mVar, int i11) {
        h(aVar, iVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C12524e eVar, i iVar, int i10, C4889m mVar, int i11) {
        i(eVar, iVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(i iVar) {
        iVar.a(C12520a.C2561a.f107365a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(i iVar) {
        iVar.b(C12521b.d.f107370a);
        return C16807N.f139792a;
    }
}
