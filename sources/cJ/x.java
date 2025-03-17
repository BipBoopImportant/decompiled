package Cj;

import E1.I;
import G1.C4504g;
import HJ.C15854t;
import KJ.C15987c;
import N1.P;
import Oo.b;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13573c1;
import SC.C13607l;
import SC.C13627q;
import SC.C13634s;
import SC.C13643u0;
import SC.U1;
import SC.V1;
import TC.C13679b;
import TC.e;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import Y1.f;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import com.ingka.ikea.core.model.product.PackageDetailsItem;
import com.ingka.ikea.core.model.product.PackageDimension;
import com.ingka.ikea.core.model.product.PackageInformation;
import f1.C5301c;
import f1.C5309k;
import i1.C5437c;
import il.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.r;
import r0.m;
import s0.C5844O;
import s0.C5862h;
import t0.C5938c;
import tK.C18029u;
import tK.C18030v;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00072\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000b\u001a\u00020\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\r\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001a\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u0002"}, d2 = {"LKJ/c;", "Lcom/ingka/ikea/core/model/product/PackageInformation;", "productMeasurements", "Lcom/ingka/ikea/core/model/product/PackageDetailsItem;", "packageMeasurements", "LCj/o;", "actions", "LXH/N;", "t", "(LKJ/c;LKJ/c;LCj/o;LU0/m;I)V", "packageInformation", "p", "(LKJ/c;LU0/m;I)V", "j", "(LKJ/c;LCj/o;LU0/m;I)V", "", "itemNo", "h", "(Ljava/lang/String;LU0/m;I)V", "name", "value", "Landroidx/compose/ui/d;", "modifier", "r", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/d;LU0/m;II)V", "suffix", "x", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "isAccordionOpen", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<PackageDetailsItem> f79546a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        /* renamed from: Cj.x$a$a  reason: collision with other inner class name */
        public static final class C1479a extends C17544u implements C17642l {

            /* renamed from: c  reason: collision with root package name */
            public static final C1479a f79547c = new C1479a();

            public C1479a() {
                super(1);
            }

            /* renamed from: a */
            public final Void invoke(PackageDetailsItem packageDetailsItem) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class b extends C17544u implements C17642l<Integer, Object> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l f79548c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f79549d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(C17642l lVar, List list) {
                super(1);
                this.f79548c = lVar;
                this.f79549d = list;
            }

            public final Object a(int i10) {
                return this.f79548c.invoke(this.f79549d.get(i10));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
        public static final class c extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List f79550c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(List list) {
                super(4);
                this.f79550c = list;
            }

            public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
                int i12;
                int i13 = i10;
                C4889m mVar2 = mVar;
                if ((i11 & 6) == 0) {
                    i12 = i11 | (mVar2.V(cVar) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= mVar2.d(i13) ? 32 : 16;
                }
                if ((i12 & 147) != 146 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                    }
                    mVar2.W(-1566033149);
                    List<PackageDimension> d10 = ((PackageDetailsItem) this.f79550c.get(i13)).d();
                    mVar2.W(-1713084502);
                    if (d10 != null) {
                        for (PackageDimension packageDimension : d10) {
                            d.a aVar = d.f18749a;
                            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar2, 0);
                            int a11 = C4883j.a(mVar2, 0);
                            C4912y s10 = mVar.s();
                            d e10 = androidx.compose.ui.c.e(mVar2, aVar);
                            C4504g.a aVar2 = C4504g.f6515W;
                            C17631a<C4504g> a12 = aVar2.a();
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
                            F1.c(a13, a10, aVar2.c());
                            F1.c(a13, s10, aVar2.e());
                            p<C4504g, Integer, C16807N> b10 = aVar2.b();
                            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                                a13.u(Integer.valueOf(a11));
                                a13.w(Integer.valueOf(a11), b10);
                            }
                            F1.c(a13, e10, aVar2.d());
                            C5862h hVar = C5862h.f28810a;
                            d a14 = C5116k1.a(aVar, "ProductMeasurementsSection.TestTag.PackageDimensions.ProductName");
                            String e11 = packageDimension.e();
                            C18030v vVar = C18030v.f147664a;
                            int i14 = C18030v.f147665b;
                            C4889m mVar3 = mVar;
                            C13607l.j(e11, C13679b.C2857b.c.f116685a, a14, vVar.a(mVar2, i14).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 0, 262128);
                            d.a aVar3 = aVar;
                            C13607l.j(packageDimension.f(), C13679b.a.C2856b.f116680a, C5116k1.a(aVar3, "ProductMeasurementsSection.TestTag.PackageDimensions.ProductType"), vVar.a(mVar, i14).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 0, 262128);
                            C18029u uVar = C18029u.f147649a;
                            d.a aVar4 = aVar3;
                            C4889m mVar4 = mVar;
                            C5844O.a(J.t(aVar4, uVar.j()), mVar4, 0);
                            x.h(packageDimension.d(), mVar4, 0);
                            C5844O.a(J.t(aVar4, uVar.a()), mVar4, 0);
                            List<PackageInformation> c10 = packageDimension.c();
                            mVar4.W(774327762);
                            if (c10 != null) {
                                for (PackageInformation packageInformation : c10) {
                                    x.r(packageInformation.a(), packageInformation.b(), (d) null, mVar, 0, 4);
                                }
                            }
                            mVar.P();
                            x.r(J1.j.b(Ez.f.f109690b0, mVar4, 0), packageDimension.b(), (d) null, mVar, 0, 4);
                            C5844O.a(J.t(d.f18749a, C18029u.f147649a.e()), mVar4, 0);
                            mVar.x();
                            mVar2 = mVar4;
                        }
                    }
                    C4889m mVar5 = mVar2;
                    mVar.P();
                    mVar.P();
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
                a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
                return C16807N.f139792a;
            }
        }

        a(C15987c<PackageDetailsItem> cVar) {
            this.f79546a = cVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C15987c cVar, t0.x xVar) {
            C17542s.j(xVar, "$this$LazyColumn");
            xVar.e(cVar.size(), (C17642l<? super Integer, ? extends Object>) null, new b(C1479a.f79547c, cVar), c1.c.c(-632812321, true, new c(cVar)));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r13, int r14) {
            /*
                r12 = this;
                r1 = r14 & 3
                r2 = 2
                if (r1 != r2) goto L_0x0010
                boolean r1 = r13.l()
                if (r1 != 0) goto L_0x000c
                goto L_0x0010
            L_0x000c:
                r13.L()
                goto L_0x0061
            L_0x0010:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x001f
                r1 = -1
                java.lang.String r2 = "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.composable.sections.PackageDimensions.<anonymous> (ProductMeasurementsSection.kt:118)"
                r3 = -24044949(0xfffffffffe911a6b, float:-9.643761E37)
                U0.C4895p.S(r3, r14, r1, r2)
            L_0x001f:
                r0 = 466944933(0x1bd503a5, float:3.524025E-22)
                r13.W(r0)
                KJ.c<com.ingka.ikea.core.model.product.PackageDetailsItem> r0 = r12.f79546a
                boolean r0 = r13.F(r0)
                KJ.c<com.ingka.ikea.core.model.product.PackageDetailsItem> r1 = r12.f79546a
                java.lang.Object r2 = r13.D()
                if (r0 != 0) goto L_0x003b
                U0.m$a r0 = U0.C4889m.f14007a
                java.lang.Object r0 = r0.a()
                if (r2 != r0) goto L_0x0043
            L_0x003b:
                Cj.w r2 = new Cj.w
                r2.<init>(r1)
                r13.u(r2)
            L_0x0043:
                r8 = r2
                nI.l r8 = (nI.C17642l) r8
                r13.P()
                r10 = 0
                r11 = 255(0xff, float:3.57E-43)
                r0 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r9 = r13
                t0.C5937b.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0061
                U0.C4895p.R()
            L_0x0061:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Cj.x.a.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final void h(String str, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        int i12 = i10;
        C4889m k10 = mVar.k(1712897265);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(str2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1712897265, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.composable.sections.ArticleNumber (ProductMeasurementsSection.kt:162)");
            }
            d.a aVar = d.f18749a;
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, aVar);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            mVar2 = k10;
            C13607l.j(J1.j.b(Ez.f.f109705j, k10, 0), C13679b.a.c.f116681a, C5116k1.a(aVar, "ProductMeasurementsSection.TestTag.ArticleNumber.Title."), C18030v.f147664a.a(k10, C18030v.f147665b).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 432, 0, 262128);
            U1.b(g.f98371a.a(str2), C5116k1.a(aVar, "ProductMeasurementsSection.TestTag.ArticleNumber.Value"), (String) null, (V1) null, mVar2, 48, 12);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new v(str2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N i(String str, int i10, C4889m mVar, int i11) {
        h(str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void j(C15987c<PackageDetailsItem> cVar, o oVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C15987c<PackageDetailsItem> cVar2 = cVar;
        o oVar2 = oVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-1652517033);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= (i12 & 64) == 0 ? k10.V(oVar2) : k10.F(oVar2) ? 32 : 16;
        }
        int i13 = i11;
        if ((i13 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1652517033, i13, -1, "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.composable.sections.PackageDimensions (ProductMeasurementsSection.kt:96)");
            }
            boolean z10 = false;
            Object[] objArr = new Object[0];
            k10.W(221182509);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new q();
                k10.u(D10);
            }
            k10.P();
            C4899r0 r0Var = (C4899r0) C5301c.e(objArr, (C5309k) null, (String) null, (C17631a) D10, k10, 3072, 6);
            d a10 = C5116k1.a(d.f18749a, "ProductMeasurementsSection.TestTag.PackageDimensions.Accordion");
            String b10 = J1.j.b(b.f84781s5, k10, 0);
            SC.r rVar = SC.r.Medium;
            boolean k11 = k(r0Var);
            int i14 = Ez.f.f109696e0;
            int i15 = 0;
            for (PackageDetailsItem c10 : cVar) {
                Integer c11 = c10.c();
                i15 += c11 != null ? c11.intValue() : 0;
            }
            String c12 = J1.j.c(i14, new Object[]{Integer.valueOf(i15)}, k10, 0);
            k10.W(221193345);
            boolean V10 = k10.V(r0Var);
            if ((i13 & 112) == 32 || ((i13 & 64) != 0 && k10.F(oVar2))) {
                z10 = true;
            }
            boolean z11 = z10 | V10;
            Object D11 = k10.D();
            if (z11 || D11 == C4889m.f14007a.a()) {
                D11 = new r(oVar2, r0Var);
                k10.u(D11);
            }
            k10.P();
            mVar2 = k10;
            C13627q.b(b10, (C17642l) D11, a10, (C13573c1) null, c12, k11, rVar, (C13634s) null, false, 0.0f, false, (m) null, c1.c.e(-24044949, true, new a(cVar2), k10, 54), mVar2, 102236544, 384, 3720);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new s(cVar2, oVar2, i12));
        }
    }

    private static final boolean k(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void l(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N m(o oVar, C4899r0 r0Var, boolean z10) {
        l(r0Var, !k(r0Var));
        oVar.a(k(r0Var));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C15987c cVar, o oVar, int i10, C4889m mVar, int i11) {
        j(cVar, oVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C4899r0 o() {
        return u1.e(Boolean.TRUE, (o1) null, 2, (Object) null);
    }

    private static final void p(C15987c<PackageInformation> cVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C15987c<PackageInformation> cVar2 = cVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-786021169);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-786021169, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.composable.sections.ProductDimensions (ProductMeasurementsSection.kt:75)");
            }
            d.a aVar = d.f18749a;
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, aVar);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            C4889m mVar3 = k10;
            C13607l.j(J1.j.b(b.f84344C6, k10, 0), C13679b.C2857b.c.f116685a, C5116k1.a(aVar, "ProductMeasurementsSection.TestTag.ProductDimensions.Title"), C18030v.f147664a.a(k10, C18030v.f147665b).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 0, 262128);
            mVar2 = mVar3;
            C5844O.a(J.t(aVar, C18029u.f147649a.j()), mVar2, 0);
            mVar2.W(-1290278176);
            if (cVar2 != null) {
                for (PackageInformation packageInformation : cVar) {
                    r(packageInformation.a(), packageInformation.b(), (d) null, mVar2, 0, 4);
                }
            }
            mVar2.P();
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new t(cVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C15987c cVar, int i10, C4889m mVar, int i11) {
        p(cVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void r(java.lang.String r34, java.lang.String r35, androidx.compose.ui.d r36, U0.C4889m r37, int r38, int r39) {
        /*
            r1 = r34
            r4 = r38
            r0 = 2
            r2 = 4
            r3 = 2089923113(0x7c91b229, float:6.0519725E36)
            r5 = r37
            U0.m r15 = r5.k(r3)
            r5 = 1
            r6 = r39 & 1
            if (r6 == 0) goto L_0x0017
            r6 = r4 | 6
            goto L_0x0027
        L_0x0017:
            r6 = r4 & 6
            if (r6 != 0) goto L_0x0026
            boolean r6 = r15.V(r1)
            if (r6 == 0) goto L_0x0023
            r6 = r2
            goto L_0x0024
        L_0x0023:
            r6 = r0
        L_0x0024:
            r6 = r6 | r4
            goto L_0x0027
        L_0x0026:
            r6 = r4
        L_0x0027:
            r0 = r39 & 2
            if (r0 == 0) goto L_0x0030
            r6 = r6 | 48
        L_0x002d:
            r0 = r35
            goto L_0x0042
        L_0x0030:
            r0 = r4 & 48
            if (r0 != 0) goto L_0x002d
            r0 = r35
            boolean r7 = r15.V(r0)
            if (r7 == 0) goto L_0x003f
            r7 = 32
            goto L_0x0041
        L_0x003f:
            r7 = 16
        L_0x0041:
            r6 = r6 | r7
        L_0x0042:
            r2 = r39 & 4
            if (r2 == 0) goto L_0x004c
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0048:
            r7 = r36
        L_0x004a:
            r14 = r6
            goto L_0x005f
        L_0x004c:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0048
            r7 = r36
            boolean r8 = r15.V(r7)
            if (r8 == 0) goto L_0x005b
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r6 = r6 | r8
            goto L_0x004a
        L_0x005f:
            r6 = r14 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r6 != r8) goto L_0x0072
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x006c
            goto L_0x0072
        L_0x006c:
            r15.L()
            r3 = r15
            goto L_0x01ac
        L_0x0072:
            if (r2 == 0) goto L_0x0077
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x0078
        L_0x0077:
            r2 = r7
        L_0x0078:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0084
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.composable.sections.ProductMeasurementRow (ProductMeasurementsSection.kt:186)"
            U0.C4895p.S(r3, r14, r6, r7)
        L_0x0084:
            r3 = 0
            r6 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r2, r3, r5, r6)
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$c r5 = r5.i()
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r6 = r6.d()
            r7 = 54
            E1.I r5 = androidx.compose.foundation.layout.G.b(r6, r5, r15, r7)
            r6 = 0
            int r6 = U0.C4883j.a(r15, r6)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x00b8
            U0.C4883j.c()
        L_0x00b8:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x00c5
            r15.p(r9)
            goto L_0x00c8
        L_0x00c5:
            r15.t()
        L_0x00c8:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r5, r10)
            nI.p r5 = r8.e()
            U0.F1.c(r9, r7, r5)
            nI.p r5 = r8.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x00f2
            java.lang.Object r7 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x0100
        L_0x00f2:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r5)
        L_0x0100:
            nI.p r5 = r8.d()
            U0.F1.c(r9, r3, r5)
            s0.N r3 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "ProductMeasurementsSection.TestTag.ProductMeasurementRow.ItemName."
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r3, r5)
            java.lang.String r5 = ":"
            java.lang.String r5 = x(r1, r5)
            tK.v r13 = tK.C18030v.f147664a
            int r12 = tK.C18030v.f147665b
            tK.h r6 = r13.a(r15, r12)
            long r8 = r6.G0()
            TC.b$b$f r6 = TC.C13679b.C2857b.f.f116688a
            r29 = 0
            r30 = 262128(0x3fff0, float:3.6732E-40)
            r10 = 0
            r16 = 0
            r31 = r12
            r12 = r16
            r32 = r13
            r13 = r16
            r33 = r14
            r14 = r16
            r16 = 0
            r36 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 48
            r27 = r36
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "ProductMeasurementsSection.TestTag.ProductMeasurementRow.ItemValue."
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r3, r5)
            r3 = r36
            r6 = r31
            r5 = r32
            tK.h r5 = r5.a(r3, r6)
            long r8 = r5.G0()
            TC.b$a$b r6 = TC.C13679b.a.C2856b.f116680a
            int r5 = r33 >> 3
            r5 = r5 & 14
            r28 = r5 | 48
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r5 = r35
            r27 = r3
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r3.x()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x01ab
            U0.C4895p.R()
        L_0x01ab:
            r7 = r2
        L_0x01ac:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x01c4
            Cj.u r8 = new Cj.u
            r0 = r8
            r1 = r34
            r2 = r35
            r3 = r7
            r4 = r38
            r5 = r39
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r8)
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Cj.x.r(java.lang.String, java.lang.String, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N s(String str, String str2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        r(str, str2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void t(C15987c<PackageInformation> cVar, C15987c<PackageDetailsItem> cVar2, o oVar, C4889m mVar, int i10) {
        int i11;
        int i12;
        C15987c<PackageInformation> cVar3 = cVar;
        C15987c<PackageDetailsItem> cVar4 = cVar2;
        o oVar2 = oVar;
        int i13 = i10;
        C17542s.j(oVar2, "actions");
        C4889m k10 = mVar.k(-423609165);
        if ((i13 & 6) == 0) {
            i11 = (k10.F(cVar3) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.F(cVar4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= (i13 & 512) == 0 ? k10.V(oVar2) : k10.F(oVar2) ? 256 : 128;
        }
        int i14 = i11;
        if ((i14 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-423609165, i14, -1, "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.composable.sections.ProductMeasurementsSection (ProductMeasurementsSection.kt:49)");
            }
            d.a aVar = d.f18749a;
            d h10 = J.h(aVar, 0.0f, 1, (Object) null);
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar2 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar2.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, h10);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar3.c());
            F1.c(a13, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b10 = aVar3.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar3.d());
            C5862h hVar = C5862h.f28810a;
            d i15 = e.i(aVar);
            I a14 = C5080k.a(dVar.g(), aVar2.k(), k10, 0);
            int a15 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e11 = c.e(k10, i15);
            C17631a<C4504g> a16 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a16);
            } else {
                k10.t();
            }
            C4889m a17 = F1.a(k10);
            F1.c(a17, a14, aVar3.c());
            F1.c(a17, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b11 = aVar3.b();
            if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.w(Integer.valueOf(a15), b11);
            }
            F1.c(a17, e11, aVar3.d());
            k10.W(-178612940);
            if (cVar3 == null) {
                i12 = 0;
            } else {
                i12 = 0;
                p(cVar3, k10, 0);
            }
            k10.P();
            k10.x();
            C5844O.a(J.t(aVar, C18029u.f147649a.g()), k10, i12);
            k10.W(1696240096);
            if (cVar4 != null) {
                C13643u0.c((d) null, 0.0f, 0, k10, 0, 7);
                j(cVar4, oVar2, k10, (i14 >> 3) & 112);
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new p(cVar3, cVar4, oVar2, i13));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C15987c cVar, C15987c cVar2, o oVar, int i10, C4889m mVar, int i11) {
        t(cVar, cVar2, oVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final String x(String str, String str2) {
        if (C15854t.G(str, str2, false, 2, (Object) null)) {
            return str;
        }
        return str + str2;
    }
}
