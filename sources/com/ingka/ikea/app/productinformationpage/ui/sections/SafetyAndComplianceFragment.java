package com.ingka.ikea.app.productinformationpage.ui.sections;

import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import Xh.l;
import Y1.f;
import Y1.j;
import Y1.k;
import YH.C16877v;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import c1.c;
import c2.h;
import com.ingka.ikea.core.model.product.MoreInfo;
import com.ingka.ikea.core.model.product.ProductLarge;
import com.ingka.ikea.core.model.product.SafetyAndCompliance;
import com.optimizely.ab.config.FeatureVariable;
import java.util.List;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import nI.r;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/ui/sections/SafetyAndComplianceFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "I0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "LkK/c;", "R", "LkK/c;", "H0", "()LkK/c;", "setJson", "(LkK/c;)V", "json", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "S", "LXH/o;", "G0", "()Lcom/ingka/ikea/core/model/product/ProductLarge;", "argProductLarge", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafetyAndComplianceFragment extends d {

    /* renamed from: R  reason: collision with root package name */
    public C17514c f72125R;

    /* renamed from: S  reason: collision with root package name */
    private final C16824o f72126S = C16825p.b(new l(this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SafetyAndComplianceFragment f72127a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.productinformationpage.ui.sections.SafetyAndComplianceFragment$a$a  reason: collision with other inner class name */
        static final class C1236a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SafetyAndComplianceFragment f72128a;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
            /* renamed from: com.ingka.ikea.app.productinformationpage.ui.sections.SafetyAndComplianceFragment$a$a$a  reason: collision with other inner class name */
            public static final class C1237a extends C17544u implements C17642l {

                /* renamed from: c  reason: collision with root package name */
                public static final C1237a f72129c = new C1237a();

                public C1237a() {
                    super(1);
                }

                /* renamed from: a */
                public final Void invoke(SafetyAndCompliance safetyAndCompliance) {
                    return null;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
            /* renamed from: com.ingka.ikea.app.productinformationpage.ui.sections.SafetyAndComplianceFragment$a$a$b */
            public static final class b extends C17544u implements C17642l<Integer, Object> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C17642l f72130c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ List f72131d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public b(C17642l lVar, List list) {
                    super(1);
                    this.f72130c = lVar;
                    this.f72131d = list;
                }

                public final Object a(int i10) {
                    return this.f72130c.invoke(this.f72131d.get(i10));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return a(((Number) obj).intValue());
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
            /* renamed from: com.ingka.ikea.app.productinformationpage.ui.sections.SafetyAndComplianceFragment$a$a$c */
            public static final class c extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ List f72132c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public c(List list) {
                    super(4);
                    this.f72132c = list;
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
                        SafetyAndCompliance safetyAndCompliance = (SafetyAndCompliance) this.f72132c.get(i13);
                        mVar2.W(102010687);
                        mVar2.W(834574305);
                        if (safetyAndCompliance.a().length() > 0) {
                            C13607l.j(safetyAndCompliance.a(), C13679b.C2857b.f.f116688a, D.k(e.i(d.f18749a), 0.0f, h.B((float) 8), 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262136);
                        }
                        mVar.P();
                        C13607l.j(safetyAndCompliance.b(), C13679b.a.C2856b.f116680a, D.k(e.i(d.f18749a), 0.0f, h.B((float) 8), 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262136);
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

            C1236a(SafetyAndComplianceFragment safetyAndComplianceFragment) {
                this.f72128a = safetyAndComplianceFragment;
            }

            /* access modifiers changed from: private */
            public static final C16807N e(SafetyAndComplianceFragment safetyAndComplianceFragment) {
                androidx.navigation.fragment.a.a(safetyAndComplianceFragment).k0();
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N f(SafetyAndComplianceFragment safetyAndComplianceFragment, x xVar) {
                List<SafetyAndCompliance> list;
                MoreInfo m10;
                C17542s.j(xVar, "$this$LazyColumn");
                ProductLarge E02 = safetyAndComplianceFragment.G0();
                if (E02 == null || (m10 = E02.m()) == null || (list = m10.j()) == null) {
                    list = C16877v.n();
                }
                xVar.e(list.size(), (C17642l<? super Integer, ? extends Object>) null, new b(C1237a.f72129c, list), c1.c.c(-632812321, true, new c(list)));
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: nI.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: nI.l} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void c(U0.C4889m r16, int r17) {
                /*
                    r15 = this;
                    r12 = r16
                    r0 = r17
                    r1 = r0 & 3
                    r2 = 2
                    if (r1 != r2) goto L_0x0016
                    boolean r1 = r16.l()
                    if (r1 != 0) goto L_0x0010
                    goto L_0x0016
                L_0x0010:
                    r16.L()
                    r13 = r15
                    goto L_0x0125
                L_0x0016:
                    boolean r1 = U0.C4895p.J()
                    if (r1 == 0) goto L_0x0025
                    r1 = -1
                    java.lang.String r2 = "com.ingka.ikea.app.productinformationpage.ui.sections.SafetyAndComplianceFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (SafetyAndComplianceFragment.kt:58)"
                    r3 = 1128527700(0x4343f754, float:195.96613)
                    U0.C4895p.S(r3, r0, r1, r2)
                L_0x0025:
                    r13 = r15
                    com.ingka.ikea.app.productinformationpage.ui.sections.SafetyAndComplianceFragment r14 = r13.f72128a
                    androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
                    androidx.compose.foundation.layout.d r1 = androidx.compose.foundation.layout.C5073d.f18068a
                    androidx.compose.foundation.layout.d$m r1 = r1.g()
                    i1.c$a r2 = i1.C5437c.f24302a
                    i1.c$b r2 = r2.k()
                    r3 = 0
                    E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r2, r12, r3)
                    int r2 = U0.C4883j.a(r12, r3)
                    U0.y r4 = r16.s()
                    androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r12, r0)
                    G1.g$a r5 = G1.C4504g.f6515W
                    nI.a r6 = r5.a()
                    U0.f r7 = r16.m()
                    if (r7 != 0) goto L_0x0056
                    U0.C4883j.c()
                L_0x0056:
                    r16.I()
                    boolean r7 = r16.i()
                    if (r7 == 0) goto L_0x0063
                    r12.p(r6)
                    goto L_0x0066
                L_0x0063:
                    r16.t()
                L_0x0066:
                    U0.m r6 = U0.F1.a(r16)
                    nI.p r7 = r5.c()
                    U0.F1.c(r6, r1, r7)
                    nI.p r1 = r5.e()
                    U0.F1.c(r6, r4, r1)
                    nI.p r1 = r5.b()
                    boolean r4 = r6.i()
                    if (r4 != 0) goto L_0x0090
                    java.lang.Object r4 = r6.D()
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
                    boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
                    if (r4 != 0) goto L_0x009e
                L_0x0090:
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                    r6.u(r4)
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r6.w(r2, r1)
                L_0x009e:
                    nI.p r1 = r5.d()
                    U0.F1.c(r6, r0, r1)
                    s0.h r0 = s0.C5862h.f28810a
                    int r0 = Oo.b.f84365E7
                    java.lang.String r3 = J1.j.b(r0, r12, r3)
                    ol.v r0 = ol.v.BACK
                    r1 = -148974482(0xfffffffff71ed46e, float:-3.221451E33)
                    r12.W(r1)
                    boolean r1 = r12.F(r14)
                    java.lang.Object r2 = r16.D()
                    if (r1 != 0) goto L_0x00c7
                    U0.m$a r1 = U0.C4889m.f14007a
                    java.lang.Object r1 = r1.a()
                    if (r2 != r1) goto L_0x00cf
                L_0x00c7:
                    com.ingka.ikea.app.productinformationpage.ui.sections.e r2 = new com.ingka.ikea.app.productinformationpage.ui.sections.e
                    r2.<init>(r14)
                    r12.u(r2)
                L_0x00cf:
                    r1 = r2
                    nI.a r1 = (nI.C17631a) r1
                    r16.P()
                    r10 = 6
                    r11 = 500(0x1f4, float:7.0E-43)
                    r2 = 0
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = r16
                    ol.p.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    r0 = -148970476(0xfffffffff71ee414, float:-3.222691E33)
                    r12.W(r0)
                    boolean r0 = r12.F(r14)
                    java.lang.Object r1 = r16.D()
                    if (r0 != 0) goto L_0x00fb
                    U0.m$a r0 = U0.C4889m.f14007a
                    java.lang.Object r0 = r0.a()
                    if (r1 != r0) goto L_0x0103
                L_0x00fb:
                    com.ingka.ikea.app.productinformationpage.ui.sections.f r1 = new com.ingka.ikea.app.productinformationpage.ui.sections.f
                    r1.<init>(r14)
                    r12.u(r1)
                L_0x0103:
                    r8 = r1
                    nI.l r8 = (nI.C17642l) r8
                    r16.P()
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
                    r9 = r16
                    t0.C5937b.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    r16.x()
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x0125
                    U0.C4895p.R()
                L_0x0125:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.productinformationpage.ui.sections.SafetyAndComplianceFragment.a.C1236a.c(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                c((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        a(SafetyAndComplianceFragment safetyAndComplianceFragment) {
            this.f72127a = safetyAndComplianceFragment;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1891693330, i10, -1, "com.ingka.ikea.app.productinformationpage.ui.sections.SafetyAndComplianceFragment.onCreateView.<anonymous>.<anonymous> (SafetyAndComplianceFragment.kt:57)");
                }
                e.e(false, c.e(1128527700, true, new C1236a(this.f72127a), mVar, 54), mVar, 48, 1);
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
    public static final ProductLarge F0(SafetyAndComplianceFragment safetyAndComplianceFragment) {
        String string = safetyAndComplianceFragment.requireArguments().getString("productLarge");
        if (string == null) {
            return null;
        }
        C17514c H02 = safetyAndComplianceFragment.H0();
        H02.a();
        return (ProductLarge) H02.c(ProductLarge.Companion.serializer(), string);
    }

    /* access modifiers changed from: private */
    public final ProductLarge G0() {
        return (ProductLarge) this.f72126S.getValue();
    }

    public final C17514c H0() {
        C17514c cVar = this.f72125R;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z(FeatureVariable.JSON_TYPE);
        return null;
    }

    /* renamed from: I0 */
    public ComposeView onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(s1.d.f19581b);
        composeView.setContent(c.c(-1891693330, true, new a(this)));
        return composeView;
    }
}
