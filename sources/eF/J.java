package eF;

import I0.C4567k0;
import I0.C4569l0;
import I0.C4571m0;
import I0.C4592x0;
import I0.C4596z0;
import I0.G;
import I0.G0;
import I0.H;
import OE.n;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.B;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.L;
import U0.M;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.y;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import i1.C5437c;
import iF.C14577q;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5747v0;
import p1.i1;
import s0.C5834E;
import s0.C5861g;
import s0.C5872r;
import tF.C15083h;
import tF.C15091p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\u0006\u001a!\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\u0006\u001a\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a!\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a9\u0010!\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b!\u0010\"\u001aC\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\n2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00142\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b%\u0010&\u001a]\u0010,\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\n2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\b\u0010)\u001a\u0004\u0018\u00010\n2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b,\u0010-\"\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"LtF/h;", "dialogUIModel", "", "isPreview", "LXH/N;", "S", "(LtF/h;ZLU0/m;II)V", "P", "dialog", "N", "", "title", "body", "bodyTextHyperLink", "checkBoxLabel", "positiveButtonText", "negativeButtonText", "Lkotlin/Function0;", "onPositiveAction", "onNegativeAction", "Lkotlin/Function1;", "onCheckboxAction", "onHyperlinkAction", "isLoading", "Landroidx/compose/ui/d;", "modifier", "G", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LnI/a;LnI/a;LnI/l;LnI/a;ZLandroidx/compose/ui/d;LU0/m;III)V", "titleText", "U", "(Ljava/lang/String;Landroidx/compose/ui/d;LU0/m;II)V", "bodyText", "hyperlinkAction", "D", "(Ljava/lang/String;Ljava/lang/String;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "text", "onCheckedChanged", "z", "(Ljava/lang/String;LnI/l;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "negativeText", "negativeAction", "positiveText", "positiveAction", "positiveButtonEnabled", "x", "(Ljava/lang/String;LnI/a;Ljava/lang/String;LnI/a;ZZLandroidx/compose/ui/d;LU0/m;II)V", "LtF/h$b;", "a", "LtF/h$b;", "getSampleDialog", "()LtF/h$b;", "sampleDialog", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class J {

    /* renamed from: a  reason: collision with root package name */
    private static final C15083h.b f126645a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5872r, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f126646a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f126647b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f126648c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f126649d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f126650e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f126651f;

        a(String str, String str2, C17631a<C16807N> aVar, boolean z10, boolean z11, C17631a<C16807N> aVar2) {
            this.f126646a = str;
            this.f126647b = str2;
            this.f126648c = aVar;
            this.f126649d = z10;
            this.f126650e = z11;
            this.f126651f = aVar2;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17631a aVar) {
            if (aVar != null) {
                aVar.invoke();
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17631a aVar) {
            if (aVar != null) {
                aVar.invoke();
            }
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(s0.C5872r r22, U0.C4889m r23, int r24) {
            /*
                r21 = this;
                r0 = r21
                r7 = r22
                r15 = r23
                java.lang.String r1 = "$this$FlowRow"
                kotlin.jvm.internal.C17542s.j(r7, r1)
                r1 = r24 & 6
                if (r1 != 0) goto L_0x001b
                boolean r1 = r15.V(r7)
                if (r1 == 0) goto L_0x0017
                r1 = 4
                goto L_0x0018
            L_0x0017:
                r1 = 2
            L_0x0018:
                r1 = r24 | r1
                goto L_0x001d
            L_0x001b:
                r1 = r24
            L_0x001d:
                r2 = r1 & 19
                r3 = 18
                if (r2 != r3) goto L_0x002f
                boolean r2 = r23.l()
                if (r2 != 0) goto L_0x002a
                goto L_0x002f
            L_0x002a:
                r23.L()
                goto L_0x0110
            L_0x002f:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x003e
                r2 = -1
                java.lang.String r3 = "com.sugarcube.app.base.ui.capture.ButtonsRow.<anonymous> (PrivacyPolicyConsentDialog.kt:364)"
                r4 = -468649847(0xffffffffe410f889, float:-1.069696E22)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x003e:
                java.lang.String r1 = r0.f126646a
                r2 = 774192229(0x2e253c65, float:3.7570298E-11)
                r15.W(r2)
                r14 = 0
                r13 = 1
                r12 = 0
                if (r1 != 0) goto L_0x004f
                r1 = r12
                r2 = r13
                r3 = r14
                goto L_0x00a9
            L_0x004f:
                java.lang.String r8 = r0.f126646a
                nI.a<XH.N> r9 = r0.f126648c
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r1, r12, r13, r14)
                r5 = 2
                r6 = 0
                r3 = 1065353216(0x3f800000, float:1.0)
                r4 = 0
                r1 = r22
                androidx.compose.ui.d r1 = s0.C5842M.e(r1, r2, r3, r4, r5, r6)
                wK.l0$f r11 = wK.C18390l0.f.f151159b
                r2 = 1467675925(0x577af515, float:2.75930526E14)
                r15.W(r2)
                boolean r2 = r15.V(r9)
                java.lang.Object r3 = r23.D()
                if (r2 != 0) goto L_0x007e
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L_0x0086
            L_0x007e:
                eF.H r3 = new eF.H
                r3.<init>(r9)
                r15.u(r3)
            L_0x0086:
                r17 = r3
                nI.a r17 = (nI.C17631a) r17
                r23.P()
                int r2 = wK.C18390l0.f.f151160c
                int r19 = r2 << 9
                r20 = 500(0x1f4, float:7.0E-43)
                r10 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r16 = 0
                r9 = r1
                r1 = r12
                r12 = r2
                r2 = r13
                r13 = r3
                r3 = r14
                r14 = r4
                r15 = r5
                r18 = r23
                wK.C18342h0.f(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                XH.N r4 = XH.C16807N.f139792a
            L_0x00a9:
                r23.P()
                java.lang.String r8 = r0.f126647b
                if (r8 != 0) goto L_0x00b1
                goto L_0x0107
            L_0x00b1:
                boolean r9 = r0.f126649d
                boolean r10 = r0.f126650e
                nI.a<XH.N> r11 = r0.f126651f
                androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r4, r1, r2, r3)
                r5 = 2
                r6 = 0
                r3 = 1065353216(0x3f800000, float:1.0)
                r4 = 0
                r1 = r22
                r12 = r23
                androidx.compose.ui.d r2 = s0.C5842M.e(r1, r2, r3, r4, r5, r6)
                r1 = 1467687349(0x577b21b5, float:2.76122189E14)
                r12.W(r1)
                boolean r1 = r12.V(r11)
                java.lang.Object r3 = r23.D()
                if (r1 != 0) goto L_0x00e2
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r3 != r1) goto L_0x00ea
            L_0x00e2:
                eF.I r3 = new eF.I
                r3.<init>(r11)
                r12.u(r3)
            L_0x00ea:
                r11 = r3
                nI.a r11 = (nI.C17631a) r11
                r23.P()
                r13 = 0
                r14 = 472(0x1d8, float:6.61E-43)
                r4 = 0
                r5 = 0
                r7 = 0
                r15 = 0
                r16 = 0
                r1 = r8
                r3 = r9
                r6 = r10
                r8 = r15
                r9 = r16
                r10 = r11
                r11 = r23
                r12 = r13
                r13 = r14
                wK.C18342h0.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            L_0x0107:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0110
                U0.C4895p.R()
            L_0x0110:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: eF.J.a.c(s0.r, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((C5872r) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15083h f126652a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Q f126653b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4596z0 f126654c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.capture.PrivacyPolicyConsentDialogKt$LandscapePrivacyPolicyConsentDialog$1$1$2$1$1", f = "PrivacyPolicyConsentDialog.kt", l = {209}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f126655c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C4596z0 f126656d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C4596z0 z0Var, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f126656d = z0Var;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f126656d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f126655c;
                if (i10 == 0) {
                    y.b(obj);
                    G a10 = this.f126656d.a();
                    this.f126655c = 1;
                    if (a10.b(this) == f10) {
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

        b(C15083h hVar, Q q10, C4596z0 z0Var) {
            this.f126652a = hVar;
            this.f126653b = q10;
            this.f126654c = z0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(C15083h hVar) {
            C17631a<C16807N> k10 = ((C15083h.b) hVar).k();
            if (k10 != null) {
                k10.invoke();
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(C15083h hVar, Q q10, C4596z0 z0Var) {
            C17631a<C16807N> h10 = ((C15083h.b) hVar).h();
            if (h10 != null) {
                h10.invoke();
            }
            F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new a(z0Var, (C17164e<? super a>) null), 3, (Object) null);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(C15083h hVar, boolean z10) {
            C17642l<Boolean, C16807N> a10 = ((C15083h.b) hVar).a();
            if (a10 != null) {
                a10.invoke(Boolean.valueOf(z10));
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(C15083h hVar) {
            C17631a<C16807N> d10 = ((C15083h.b) hVar).d();
            if (d10 != null) {
                d10.invoke();
            }
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void f(U0.C4889m r23, int r24) {
            /*
                r22 = this;
                r0 = r22
                r15 = r23
                r1 = r24
                r2 = r1 & 3
                r3 = 2
                if (r2 != r3) goto L_0x0017
                boolean r2 = r23.l()
                if (r2 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r23.L()
                goto L_0x01cf
            L_0x0017:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x0026
                r2 = -1
                java.lang.String r3 = "com.sugarcube.app.base.ui.capture.LandscapePrivacyPolicyConsentDialog.<anonymous> (PrivacyPolicyConsentDialog.kt:191)"
                r4 = 1117610690(0x429d62c2, float:78.69289)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x0026:
                tF.h r1 = r0.f126652a
                QJ.Q r2 = r0.f126653b
                I0.z0 r3 = r0.f126654c
                androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
                androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$m r5 = r5.g()
                i1.c$a r6 = i1.C5437c.f24302a
                i1.c$b r6 = r6.k()
                r7 = 0
                E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r6, r15, r7)
                int r6 = U0.C4883j.a(r15, r7)
                U0.y r8 = r23.s()
                androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r15, r4)
                G1.g$a r10 = G1.C4504g.f6515W
                nI.a r11 = r10.a()
                U0.f r12 = r23.m()
                if (r12 != 0) goto L_0x005a
                U0.C4883j.c()
            L_0x005a:
                r23.I()
                boolean r12 = r23.i()
                if (r12 == 0) goto L_0x0067
                r15.p(r11)
                goto L_0x006a
            L_0x0067:
                r23.t()
            L_0x006a:
                U0.m r11 = U0.F1.a(r23)
                nI.p r12 = r10.c()
                U0.F1.c(r11, r5, r12)
                nI.p r5 = r10.e()
                U0.F1.c(r11, r8, r5)
                nI.p r5 = r10.b()
                boolean r8 = r11.i()
                if (r8 != 0) goto L_0x0094
                java.lang.Object r8 = r11.D()
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
                boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r12)
                if (r8 != 0) goto L_0x00a2
            L_0x0094:
                java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
                r11.u(r8)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r11.w(r6, r5)
            L_0x00a2:
                nI.p r5 = r10.d()
                U0.F1.c(r11, r9, r5)
                s0.h r16 = s0.C5862h.f28810a
                r5 = 1058306785(0x3f147ae1, float:0.58)
                androidx.compose.ui.d r17 = androidx.compose.foundation.layout.J.g(r4, r5)
                r20 = 2
                r21 = 0
                r18 = 1065353216(0x3f800000, float:1.0)
                r19 = 0
                androidx.compose.ui.d r12 = s0.C5861g.c(r16, r17, r18, r19, r20, r21)
                java.lang.String r4 = "null cannot be cast to non-null type com.sugarcube.app.base.ui.dialog.DialogUIModel.PrivacyPolicyConsent"
                kotlin.jvm.internal.C17542s.h(r1, r4)
                r4 = r1
                tF.h$b r4 = (tF.C15083h.b) r4
                tF.p r5 = r4.l()
                java.lang.String r5 = tF.C15084i.a(r5, r15, r7)
                tF.p r6 = r4.e()
                java.lang.String r6 = tF.C15084i.a(r6, r15, r7)
                tF.p r8 = r4.f()
                java.lang.String r8 = tF.C15084i.a(r8, r15, r7)
                tF.p r9 = r4.b()
                java.lang.String r9 = tF.C15084i.a(r9, r15, r7)
                tF.p r10 = r4.j()
                java.lang.String r10 = tF.C15084i.a(r10, r15, r7)
                tF.p r11 = r4.g()
                java.lang.String r7 = tF.C15084i.a(r11, r15, r7)
                U0.r0 r4 = r4.m()
                java.lang.Object r4 = r4.getValue()
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r11 = r4.booleanValue()
                r4 = -880349178(0xffffffffcb86f006, float:-1.768654E7)
                r15.W(r4)
                boolean r4 = r15.V(r1)
                java.lang.Object r13 = r23.D()
                if (r4 != 0) goto L_0x011c
                U0.m$a r4 = U0.C4889m.f14007a
                java.lang.Object r4 = r4.a()
                if (r13 != r4) goto L_0x0124
            L_0x011c:
                eF.K r13 = new eF.K
                r13.<init>(r1)
                r15.u(r13)
            L_0x0124:
                nI.a r13 = (nI.C17631a) r13
                r23.P()
                r4 = -880345607(0xffffffffcb86fdf9, float:-1.7693682E7)
                r15.W(r4)
                boolean r4 = r15.V(r1)
                boolean r14 = r15.F(r2)
                r4 = r4 | r14
                boolean r14 = r15.V(r3)
                r4 = r4 | r14
                java.lang.Object r14 = r23.D()
                if (r4 != 0) goto L_0x014b
                U0.m$a r4 = U0.C4889m.f14007a
                java.lang.Object r4 = r4.a()
                if (r14 != r4) goto L_0x0153
            L_0x014b:
                eF.L r14 = new eF.L
                r14.<init>(r1, r2, r3)
                r15.u(r14)
            L_0x0153:
                nI.a r14 = (nI.C17631a) r14
                r23.P()
                r2 = -880338584(0xffffffffcb871968, float:-1.7707728E7)
                r15.W(r2)
                boolean r2 = r15.V(r1)
                java.lang.Object r3 = r23.D()
                if (r2 != 0) goto L_0x0170
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L_0x0178
            L_0x0170:
                eF.M r3 = new eF.M
                r3.<init>(r1)
                r15.u(r3)
            L_0x0178:
                r16 = r3
                nI.l r16 = (nI.C17642l) r16
                r23.P()
                r2 = -880335033(0xffffffffcb872747, float:-1.771483E7)
                r15.W(r2)
                boolean r2 = r15.V(r1)
                java.lang.Object r3 = r23.D()
                if (r2 != 0) goto L_0x0197
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L_0x019f
            L_0x0197:
                eF.N r3 = new eF.N
                r3.<init>(r1)
                r15.u(r3)
            L_0x019f:
                r17 = r3
                nI.a r17 = (nI.C17631a) r17
                r23.P()
                r18 = 0
                r19 = 0
                r20 = 0
                r1 = r5
                r2 = r6
                r3 = r8
                r4 = r9
                r5 = r10
                r6 = r7
                r7 = r13
                r8 = r14
                r9 = r16
                r10 = r17
                r13 = r23
                r14 = r20
                r15 = r18
                r16 = r19
                eF.J.G(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                r23.x()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x01cf
                U0.C4895p.R()
            L_0x01cf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: eF.J.b.f(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            f((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.capture.PrivacyPolicyConsentDialogKt$PortraitPrivacyPolicyConsentDialog$1$1", f = "PrivacyPolicyConsentDialog.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f126657c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15083h f126658d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Q f126659e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4569l0 f126660f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.capture.PrivacyPolicyConsentDialogKt$PortraitPrivacyPolicyConsentDialog$1$1$1", f = "PrivacyPolicyConsentDialog.kt", l = {116}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f126661c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C4569l0 f126662d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C4569l0 l0Var, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f126662d = l0Var;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f126662d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f126661c;
                if (i10 == 0) {
                    y.b(obj);
                    C4569l0 l0Var = this.f126662d;
                    this.f126661c = 1;
                    if (l0Var.i(this) == f10) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.capture.PrivacyPolicyConsentDialogKt$PortraitPrivacyPolicyConsentDialog$1$1$2", f = "PrivacyPolicyConsentDialog.kt", l = {117}, m = "invokeSuspend")
        static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f126663c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C4569l0 f126664d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C4569l0 l0Var, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f126664d = l0Var;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f126664d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f126663c;
                if (i10 == 0) {
                    y.b(obj);
                    C4569l0 l0Var = this.f126664d;
                    this.f126663c = 1;
                    if (l0Var.l(this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C15083h hVar, Q q10, C4569l0 l0Var, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f126658d = hVar;
            this.f126659e = q10;
            this.f126660f = l0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f126658d, this.f126659e, this.f126660f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f126657c == 0) {
                y.b(obj);
                if (this.f126658d instanceof C15083h.a) {
                    F0 unused = C16314k.d(this.f126659e, (C17168i) null, (T) null, new a(this.f126660f, (C17164e<? super a>) null), 3, (Object) null);
                } else {
                    F0 unused2 = C16314k.d(this.f126659e, (C17168i) null, (T) null, new b(this.f126660f, (C17164e<? super b>) null), 3, (Object) null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15083h f126665a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4569l0 f126666b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Q f126667c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements q<C5834E, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C15083h f126668a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C4569l0 f126669b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Q f126670c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: eF.J$d$a$a  reason: collision with other inner class name */
            static final class C3099a implements q<C5861g, C4889m, Integer, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C15083h f126671a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Q f126672b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C4569l0 f126673c;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
                @f(c = "com.sugarcube.app.base.ui.capture.PrivacyPolicyConsentDialogKt$PortraitPrivacyPolicyConsentDialog$2$1$2$1$2$1$1", f = "PrivacyPolicyConsentDialog.kt", l = {154}, m = "invokeSuspend")
                /* renamed from: eF.J$d$a$a$a  reason: collision with other inner class name */
                static final class C3100a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    int f126674c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ C4569l0 f126675d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C3100a(C4569l0 l0Var, C17164e<? super C3100a> eVar) {
                        super(2, eVar);
                        this.f126675d = l0Var;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        return new C3100a(this.f126675d, eVar);
                    }

                    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                        return ((C3100a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object f10 = C17187b.f();
                        int i10 = this.f126674c;
                        if (i10 == 0) {
                            y.b(obj);
                            C4569l0 l0Var = this.f126675d;
                            this.f126674c = 1;
                            if (l0Var.i(this) == f10) {
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

                C3099a(C15083h hVar, Q q10, C4569l0 l0Var) {
                    this.f126671a = hVar;
                    this.f126672b = q10;
                    this.f126673c = l0Var;
                }

                /* access modifiers changed from: private */
                public static final C16807N h(C15083h.b bVar) {
                    C17631a<C16807N> k10 = bVar.k();
                    if (k10 != null) {
                        k10.invoke();
                    }
                    return C16807N.f139792a;
                }

                /* access modifiers changed from: private */
                public static final C16807N i(C15083h hVar, Q q10, C4569l0 l0Var) {
                    C17631a<C16807N> h10 = ((C15083h.b) hVar).h();
                    if (h10 != null) {
                        h10.invoke();
                    }
                    F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new C3100a(l0Var, (C17164e<? super C3100a>) null), 3, (Object) null);
                    return C16807N.f139792a;
                }

                /* access modifiers changed from: private */
                public static final C16807N j(C15083h hVar, boolean z10) {
                    C17642l<Boolean, C16807N> a10 = ((C15083h.b) hVar).a();
                    if (a10 != null) {
                        a10.invoke(Boolean.valueOf(z10));
                    }
                    return C16807N.f139792a;
                }

                /* access modifiers changed from: private */
                public static final C16807N k(C15083h hVar) {
                    C17631a<C16807N> d10 = ((C15083h.b) hVar).d();
                    if (d10 != null) {
                        d10.invoke();
                    }
                    return C16807N.f139792a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: nI.a} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: nI.l} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: nI.a} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void f(s0.C5861g r22, U0.C4889m r23, int r24) {
                    /*
                        r21 = this;
                        r0 = r21
                        r13 = r23
                        r1 = r24
                        java.lang.String r2 = "$this$ModalBottomSheetLayout"
                        r3 = r22
                        kotlin.jvm.internal.C17542s.j(r3, r2)
                        r2 = r1 & 17
                        r3 = 16
                        if (r2 != r3) goto L_0x001f
                        boolean r2 = r23.l()
                        if (r2 != 0) goto L_0x001a
                        goto L_0x001f
                    L_0x001a:
                        r23.L()
                        goto L_0x014a
                    L_0x001f:
                        boolean r2 = U0.C4895p.J()
                        if (r2 == 0) goto L_0x002e
                        r2 = -1
                        java.lang.String r3 = "com.sugarcube.app.base.ui.capture.PortraitPrivacyPolicyConsentDialog.<anonymous>.<anonymous>.<anonymous> (PrivacyPolicyConsentDialog.kt:138)"
                        r4 = -1120564276(0xffffffffbd358bcc, float:-0.044322774)
                        U0.C4895p.S(r4, r1, r2, r3)
                    L_0x002e:
                        tF.h r1 = r0.f126671a
                        QJ.Q r2 = r0.f126672b
                        I0.l0 r3 = r0.f126673c
                        r4 = r1
                        tF.h$b r4 = (tF.C15083h.b) r4
                        androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
                        r6 = 3
                        r7 = 0
                        r8 = 0
                        androidx.compose.ui.d r12 = androidx.compose.foundation.layout.J.C(r5, r7, r8, r6, r7)
                        tF.p r5 = r4.l()
                        java.lang.String r5 = tF.C15084i.a(r5, r13, r8)
                        tF.p r6 = r4.e()
                        java.lang.String r6 = tF.C15084i.a(r6, r13, r8)
                        tF.p r7 = r4.f()
                        java.lang.String r7 = tF.C15084i.a(r7, r13, r8)
                        tF.p r9 = r4.b()
                        java.lang.String r9 = tF.C15084i.a(r9, r13, r8)
                        tF.p r10 = r4.j()
                        java.lang.String r10 = tF.C15084i.a(r10, r13, r8)
                        tF.p r11 = r4.g()
                        java.lang.String r8 = tF.C15084i.a(r11, r13, r8)
                        r11 = r1
                        tF.h$b r11 = (tF.C15083h.b) r11
                        U0.r0 r11 = r11.m()
                        java.lang.Object r11 = r11.getValue()
                        java.lang.Boolean r11 = (java.lang.Boolean) r11
                        boolean r11 = r11.booleanValue()
                        r14 = 1088915417(0x40e787d9, float:7.235333)
                        r13.W(r14)
                        boolean r14 = r13.F(r4)
                        java.lang.Object r15 = r23.D()
                        if (r14 != 0) goto L_0x0099
                        U0.m$a r14 = U0.C4889m.f14007a
                        java.lang.Object r14 = r14.a()
                        if (r15 != r14) goto L_0x00a1
                    L_0x0099:
                        eF.P r15 = new eF.P
                        r15.<init>(r4)
                        r13.u(r15)
                    L_0x00a1:
                        r14 = r15
                        nI.a r14 = (nI.C17631a) r14
                        r23.P()
                        r4 = 1088919945(0x40e79989, float:7.237492)
                        r13.W(r4)
                        boolean r4 = r13.V(r1)
                        boolean r15 = r13.F(r2)
                        r4 = r4 | r15
                        boolean r15 = r13.F(r3)
                        r4 = r4 | r15
                        java.lang.Object r15 = r23.D()
                        if (r4 != 0) goto L_0x00c9
                        U0.m$a r4 = U0.C4889m.f14007a
                        java.lang.Object r4 = r4.a()
                        if (r15 != r4) goto L_0x00d1
                    L_0x00c9:
                        eF.Q r15 = new eF.Q
                        r15.<init>(r1, r2, r3)
                        r13.u(r15)
                    L_0x00d1:
                        nI.a r15 = (nI.C17631a) r15
                        r23.P()
                        r2 = 1088928809(0x40e7bc29, float:7.241719)
                        r13.W(r2)
                        boolean r2 = r13.V(r1)
                        java.lang.Object r3 = r23.D()
                        if (r2 != 0) goto L_0x00ee
                        U0.m$a r2 = U0.C4889m.f14007a
                        java.lang.Object r2 = r2.a()
                        if (r3 != r2) goto L_0x00f6
                    L_0x00ee:
                        eF.S r3 = new eF.S
                        r3.<init>(r1)
                        r13.u(r3)
                    L_0x00f6:
                        r16 = r3
                        nI.l r16 = (nI.C17642l) r16
                        r23.P()
                        r2 = 1088933736(0x40e7cf68, float:7.244068)
                        r13.W(r2)
                        boolean r2 = r13.V(r1)
                        java.lang.Object r3 = r23.D()
                        if (r2 != 0) goto L_0x0115
                        U0.m$a r2 = U0.C4889m.f14007a
                        java.lang.Object r2 = r2.a()
                        if (r3 != r2) goto L_0x011d
                    L_0x0115:
                        eF.T r3 = new eF.T
                        r3.<init>(r1)
                        r13.u(r3)
                    L_0x011d:
                        r17 = r3
                        nI.a r17 = (nI.C17631a) r17
                        r23.P()
                        r18 = 48
                        r19 = 0
                        r20 = 0
                        r1 = r5
                        r2 = r6
                        r3 = r7
                        r4 = r9
                        r5 = r10
                        r6 = r8
                        r7 = r14
                        r8 = r15
                        r9 = r16
                        r10 = r17
                        r13 = r23
                        r14 = r20
                        r15 = r18
                        r16 = r19
                        eF.J.G(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                        boolean r1 = U0.C4895p.J()
                        if (r1 == 0) goto L_0x014a
                        U0.C4895p.R()
                    L_0x014a:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: eF.J.d.a.C3099a.f(s0.g, U0.m, int):void");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    f((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
                    return C16807N.f139792a;
                }
            }

            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"eF/J$d$a$b", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class b implements L {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C15083h f126676a;

                public b(C15083h hVar) {
                    this.f126676a = hVar;
                }

                public void b() {
                    C17631a<C16807N> c10 = ((C15083h.b) this.f126676a).c();
                    if (c10 != null) {
                        c10.invoke();
                    }
                }
            }

            a(C15083h hVar, C4569l0 l0Var, Q q10) {
                this.f126668a = hVar;
                this.f126669b = l0Var;
                this.f126670c = q10;
            }

            /* access modifiers changed from: private */
            public static final L c(C15083h hVar, M m10) {
                C17542s.j(m10, "$this$DisposableEffect");
                return new b(hVar);
            }

            public final void b(C5834E e10, C4889m mVar, int i10) {
                int i11;
                C5834E e11 = e10;
                C4889m mVar2 = mVar;
                C17542s.j(e11, "padding");
                if ((i10 & 6) == 0) {
                    i11 = i10 | (mVar2.V(e11) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) != 18 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1479765318, i11, -1, "com.sugarcube.app.base.ui.capture.PortraitPrivacyPolicyConsentDialog.<anonymous>.<anonymous> (PrivacyPolicyConsentDialog.kt:124)");
                    }
                    C15083h hVar = this.f126668a;
                    C17542s.h(hVar, "null cannot be cast to non-null type com.sugarcube.app.base.ui.dialog.DialogUIModel.PrivacyPolicyConsent");
                    C17631a<C16807N> i12 = ((C15083h.b) hVar).i();
                    if (i12 != null) {
                        i12.invoke();
                    }
                    mVar2.W(-326892487);
                    if (this.f126669b.e() != C4571m0.Hidden) {
                        C16807N n10 = C16807N.f139792a;
                        mVar2.W(-326889494);
                        boolean V10 = mVar2.V(this.f126668a);
                        C15083h hVar2 = this.f126668a;
                        Object D10 = mVar.D();
                        if (V10 || D10 == C4889m.f14007a.a()) {
                            D10 = new O(hVar2);
                            mVar2.u(D10);
                        }
                        mVar.P();
                        P.c(n10, (C17642l) D10, mVar2, 6);
                    }
                    mVar.P();
                    C4567k0.b(c1.c.e(-1120564276, true, new C3099a(this.f126668a, this.f126670c, this.f126669b), mVar2, 54), D.h(androidx.compose.foundation.layout.J.C(androidx.compose.ui.d.f18749a, (C5437c.C0386c) null, false, 3, (Object) null), e11), this.f126669b, false, (i1) null, 0.0f, 0, 0, 0, C14419j.f126721a.a(), mVar, (C4569l0.f8232e << 6) | 805309446, 496);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        d(C15083h hVar, C4569l0 l0Var, Q q10) {
            this.f126665a = hVar;
            this.f126666b = l0Var;
            this.f126667c = q10;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2015341752, i11, -1, "com.sugarcube.app.base.ui.capture.PortraitPrivacyPolicyConsentDialog.<anonymous> (PrivacyPolicyConsentDialog.kt:121)");
                }
                C4592x0.a((androidx.compose.ui.d) null, (C4596z0) null, (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, (q<? super G0, ? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, 0, false, (q<? super C5861g, ? super C4889m, ? super Integer, C16807N>) null, false, (i1) null, 0.0f, 0, 0, 0, C5747v0.f27350b.h(), 0, c1.c.e(-1479765318, true, new a(this.f126665a, this.f126666b, this.f126667c), mVar, 54), mVar, 0, 12779520, 98303);
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

    static {
        C15091p pVar = r0;
        C15091p pVar2 = new C15091p(Integer.valueOf(n.f113325a1), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar3 = r10;
        C15091p pVar4 = new C15091p(Integer.valueOf(n.f113318Z0), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar5 = r0;
        C15091p pVar6 = new C15091p(Integer.valueOf(n.f113337c), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar7 = r15;
        C15091p pVar8 = new C15091p(Integer.valueOf(n.f113197F), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C15091p pVar9 = r0;
        C15091p pVar10 = new C15091p(Integer.valueOf(n.f113306X0), (List) null, (String) null, 6, (DefaultConstructorMarker) null);
        C4899r0 j10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
        C14420k kVar = r1;
        C14420k kVar2 = new C14420k();
        v vVar = r1;
        v vVar2 = new v();
        z zVar = r1;
        z zVar2 = new z();
        C14401A a10 = r1;
        C14401A a11 = new C14401A();
        C14402B b10 = r1;
        C14402B b11 = new C14402B();
        C14403C c10 = r1;
        C14403C c11 = new C14403C();
        f126645a = new C15083h.b("privacy_disclaimer", pVar, pVar3, (C15091p) null, (C17631a) null, pVar5, kVar, pVar7, vVar, zVar, pVar9, (C15091p) null, false, a10, b10, c10, j10, 6168, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N A(C4899r0 r0Var, C17642l lVar, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
        lVar.invoke(Boolean.valueOf(z10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B(C17631a aVar, String str) {
        C17542s.j(str, "it");
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(String str, C17642l lVar, C17631a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        z(str, lVar, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void D(java.lang.String r16, java.lang.String r17, nI.C17631a<XH.C16807N> r18, androidx.compose.ui.d r19, U0.C4889m r20, int r21, int r22) {
        /*
            r2 = r17
            r3 = r18
            r5 = r21
            r0 = 586582377(0x22f68969, float:6.6823922E-18)
            r1 = r20
            U0.m r1 = r1.k(r0)
            r4 = r22 & 1
            if (r4 == 0) goto L_0x0019
            r4 = r5 | 6
            r6 = r4
            r4 = r16
            goto L_0x002d
        L_0x0019:
            r4 = r5 & 6
            if (r4 != 0) goto L_0x002a
            r4 = r16
            boolean r6 = r1.V(r4)
            if (r6 == 0) goto L_0x0027
            r6 = 4
            goto L_0x0028
        L_0x0027:
            r6 = 2
        L_0x0028:
            r6 = r6 | r5
            goto L_0x002d
        L_0x002a:
            r4 = r16
            r6 = r5
        L_0x002d:
            r7 = r22 & 2
            if (r7 == 0) goto L_0x0034
            r6 = r6 | 48
            goto L_0x0044
        L_0x0034:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x0044
            boolean r7 = r1.V(r2)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r6 = r6 | r7
        L_0x0044:
            r7 = r22 & 4
            r8 = 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x004d
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x004d:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005c
            boolean r7 = r1.F(r3)
            if (r7 == 0) goto L_0x0059
            r7 = r8
            goto L_0x005b
        L_0x0059:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r6 = r6 | r7
        L_0x005c:
            r7 = r22 & 8
            if (r7 == 0) goto L_0x0065
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r9 = r19
            goto L_0x0077
        L_0x0065:
            r9 = r5 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0062
            r9 = r19
            boolean r10 = r1.V(r9)
            if (r10 == 0) goto L_0x0074
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r6 = r6 | r10
        L_0x0077:
            r10 = r6 & 1171(0x493, float:1.641E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x0089
            boolean r10 = r1.l()
            if (r10 != 0) goto L_0x0084
            goto L_0x0089
        L_0x0084:
            r1.L()
            goto L_0x00f1
        L_0x0089:
            if (r7 == 0) goto L_0x008f
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r15 = r7
            goto L_0x0090
        L_0x008f:
            r15 = r9
        L_0x0090:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x009c
            r7 = -1
            java.lang.String r9 = "com.sugarcube.app.base.ui.capture.Description (PrivacyPolicyConsentDialog.kt:304)"
            U0.C4895p.S(r0, r6, r7, r9)
        L_0x009c:
            if (r2 != 0) goto L_0x00a1
            java.lang.String r0 = ""
            goto L_0x00a2
        L_0x00a1:
            r0 = r2
        L_0x00a2:
            r7 = -787919190(0xffffffffd1094eaa, float:-3.6858143E10)
            r1.W(r7)
            r7 = r6 & 896(0x380, float:1.256E-42)
            if (r7 != r8) goto L_0x00ae
            r7 = 1
            goto L_0x00af
        L_0x00ae:
            r7 = 0
        L_0x00af:
            java.lang.Object r8 = r1.D()
            if (r7 != 0) goto L_0x00bd
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x00c5
        L_0x00bd:
            eF.x r8 = new eF.x
            r8.<init>(r3)
            r1.u(r8)
        L_0x00c5:
            nI.l r8 = (nI.C17642l) r8
            r1.P()
            kF.q r9 = new kF.q
            r9.<init>(r0, r8)
            int r0 = r6 >> 9
            r0 = r0 & 14
            int r6 = r6 << 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            r13 = r0 | r6
            r14 = 56
            r0 = 0
            r10 = 0
            r11 = 0
            r6 = r15
            r7 = r16
            r8 = r9
            r9 = r0
            r12 = r1
            kF.C14724t.c(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00f0
            U0.C4895p.R()
        L_0x00f0:
            r9 = r15
        L_0x00f1:
            U0.Y0 r7 = r1.n()
            if (r7 == 0) goto L_0x010b
            eF.y r8 = new eF.y
            r0 = r8
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r9
            r5 = r21
            r6 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eF.J.D(java.lang.String, java.lang.String, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N E(C17631a aVar, String str) {
        C17542s.j(str, "it");
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F(String str, String str2, C17631a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        D(str, str2, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v8, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v14, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void G(java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, nI.C17631a<XH.C16807N> r53, nI.C17631a<XH.C16807N> r54, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r55, nI.C17631a<XH.C16807N> r56, boolean r57, androidx.compose.ui.d r58, U0.C4889m r59, int r60, int r61, int r62) {
        /*
            r1 = r47
            r9 = r48
            r10 = r50
            r11 = r53
            r12 = r54
            r13 = r55
            r14 = r56
            r15 = r60
            r0 = r62
            r8 = 128(0x80, float:1.794E-43)
            r3 = 32
            r7 = 16
            r6 = 6
            java.lang.String r4 = "title"
            kotlin.jvm.internal.C17542s.j(r1, r4)
            java.lang.String r4 = "body"
            kotlin.jvm.internal.C17542s.j(r9, r4)
            java.lang.String r4 = "checkBoxLabel"
            kotlin.jvm.internal.C17542s.j(r10, r4)
            java.lang.String r4 = "onPositiveAction"
            kotlin.jvm.internal.C17542s.j(r11, r4)
            java.lang.String r4 = "onNegativeAction"
            kotlin.jvm.internal.C17542s.j(r12, r4)
            java.lang.String r4 = "onCheckboxAction"
            kotlin.jvm.internal.C17542s.j(r13, r4)
            java.lang.String r4 = "onHyperlinkAction"
            kotlin.jvm.internal.C17542s.j(r14, r4)
            r4 = -1160328877(0xffffffffbad6c953, float:-0.0016386904)
            r5 = r59
            U0.m r5 = r5.k(r4)
            r4 = 1
            r26 = r0 & 1
            r27 = 4
            r4 = 2
            if (r26 == 0) goto L_0x0050
            r26 = r15 | 6
            goto L_0x0064
        L_0x0050:
            r26 = r15 & 6
            if (r26 != 0) goto L_0x0062
            boolean r26 = r5.V(r1)
            if (r26 == 0) goto L_0x005d
            r26 = r27
            goto L_0x005f
        L_0x005d:
            r26 = r4
        L_0x005f:
            r26 = r15 | r26
            goto L_0x0064
        L_0x0062:
            r26 = r15
        L_0x0064:
            r28 = r0 & 2
            if (r28 == 0) goto L_0x006d
            r26 = r26 | 48
        L_0x006a:
            r4 = r26
            goto L_0x007f
        L_0x006d:
            r28 = r15 & 48
            if (r28 != 0) goto L_0x006a
            boolean r28 = r5.V(r9)
            if (r28 == 0) goto L_0x007a
            r28 = r3
            goto L_0x007c
        L_0x007a:
            r28 = r7
        L_0x007c:
            r26 = r26 | r28
            goto L_0x006a
        L_0x007f:
            r26 = r0 & 4
            if (r26 == 0) goto L_0x0088
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0085:
            r6 = r49
            goto L_0x009b
        L_0x0088:
            r6 = r15 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0085
            r6 = r49
            boolean r26 = r5.V(r6)
            if (r26 == 0) goto L_0x0097
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x0099
        L_0x0097:
            r26 = r8
        L_0x0099:
            r4 = r4 | r26
        L_0x009b:
            r26 = r0 & 8
            if (r26 == 0) goto L_0x00a2
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x00b2
        L_0x00a2:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x00b2
            boolean r2 = r5.V(r10)
            if (r2 == 0) goto L_0x00af
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x00b1
        L_0x00af:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x00b1:
            r4 = r4 | r2
        L_0x00b2:
            r2 = r0 & 16
            if (r2 == 0) goto L_0x00bb
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x00b8:
            r2 = r51
            goto L_0x00ce
        L_0x00bb:
            r2 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00b8
            r2 = r51
            boolean r29 = r5.V(r2)
            if (r29 == 0) goto L_0x00ca
            r29 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00cc
        L_0x00ca:
            r29 = 8192(0x2000, float:1.14794E-41)
        L_0x00cc:
            r4 = r4 | r29
        L_0x00ce:
            r29 = r0 & 32
            r30 = 196608(0x30000, float:2.75506E-40)
            if (r29 == 0) goto L_0x00d9
            r4 = r4 | r30
            r7 = r52
            goto L_0x00ec
        L_0x00d9:
            r29 = r15 & r30
            r7 = r52
            if (r29 != 0) goto L_0x00ec
            boolean r30 = r5.V(r7)
            if (r30 == 0) goto L_0x00e8
            r30 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ea
        L_0x00e8:
            r30 = 65536(0x10000, float:9.18355E-41)
        L_0x00ea:
            r4 = r4 | r30
        L_0x00ec:
            r30 = r0 & 64
            r36 = 1572864(0x180000, float:2.204052E-39)
            if (r30 == 0) goto L_0x00f5
            r4 = r4 | r36
            goto L_0x0106
        L_0x00f5:
            r30 = r15 & r36
            if (r30 != 0) goto L_0x0106
            boolean r30 = r5.F(r11)
            if (r30 == 0) goto L_0x0102
            r30 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0104
        L_0x0102:
            r30 = 524288(0x80000, float:7.34684E-40)
        L_0x0104:
            r4 = r4 | r30
        L_0x0106:
            r8 = r8 & r0
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            if (r8 == 0) goto L_0x0110
            r4 = r4 | r30
        L_0x010d:
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0121
        L_0x0110:
            r8 = r15 & r30
            if (r8 != 0) goto L_0x010d
            boolean r8 = r5.F(r12)
            if (r8 == 0) goto L_0x011d
            r8 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x011f
        L_0x011d:
            r8 = 4194304(0x400000, float:5.877472E-39)
        L_0x011f:
            r4 = r4 | r8
            goto L_0x010d
        L_0x0121:
            r8 = r8 & r0
            if (r8 == 0) goto L_0x0128
            r8 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0126:
            r4 = r4 | r8
            goto L_0x0139
        L_0x0128:
            r8 = 100663296(0x6000000, float:2.4074124E-35)
            r8 = r8 & r15
            if (r8 != 0) goto L_0x0139
            boolean r8 = r5.F(r13)
            if (r8 == 0) goto L_0x0136
            r8 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0126
        L_0x0136:
            r8 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0126
        L_0x0139:
            r8 = r0 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x0144
            r8 = 805306368(0x30000000, float:4.656613E-10)
        L_0x013f:
            r4 = r4 | r8
        L_0x0140:
            r8 = r4
            r4 = 1024(0x400, float:1.435E-42)
            goto L_0x0155
        L_0x0144:
            r8 = 805306368(0x30000000, float:4.656613E-10)
            r8 = r8 & r15
            if (r8 != 0) goto L_0x0140
            boolean r8 = r5.F(r14)
            if (r8 == 0) goto L_0x0152
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013f
        L_0x0152:
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x013f
        L_0x0155:
            r4 = r4 & r0
            if (r4 == 0) goto L_0x0160
            r4 = 6
            r22 = r61 | 6
            r4 = r57
        L_0x015d:
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0176
        L_0x0160:
            r4 = 6
            r22 = r61 & 6
            r4 = r57
            if (r22 != 0) goto L_0x0173
            boolean r22 = r5.b(r4)
            if (r22 == 0) goto L_0x016e
            goto L_0x0170
        L_0x016e:
            r27 = 2
        L_0x0170:
            r22 = r61 | r27
            goto L_0x015d
        L_0x0173:
            r22 = r61
            goto L_0x015d
        L_0x0176:
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0180
            r22 = r22 | 48
            r9 = r58
        L_0x017d:
            r0 = r22
            goto L_0x0194
        L_0x0180:
            r23 = r61 & 48
            r9 = r58
            if (r23 != 0) goto L_0x017d
            boolean r24 = r5.V(r9)
            if (r24 == 0) goto L_0x018f
            r24 = 32
            goto L_0x0191
        L_0x018f:
            r24 = 16
        L_0x0191:
            r22 = r22 | r24
            goto L_0x017d
        L_0x0194:
            r22 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r8 & r22
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r4) goto L_0x01b5
            r2 = 19
            r4 = r0 & 19
            r2 = 18
            if (r4 != r2) goto L_0x01b5
            boolean r2 = r5.l()
            if (r2 != 0) goto L_0x01ad
            goto L_0x01b5
        L_0x01ad:
            r5.L()
            r2 = r5
            r35 = r9
            goto L_0x0516
        L_0x01b5:
            if (r3 == 0) goto L_0x01ba
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r9 = r2
        L_0x01ba:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x01c8
            java.lang.String r2 = "com.sugarcube.app.base.ui.capture.DialogContent (PrivacyPolicyConsentDialog.kt:237)"
            r3 = -1160328877(0xffffffffbad6c953, float:-0.0016386904)
            U0.C4895p.S(r3, r8, r0, r2)
        L_0x01c8:
            r2 = -135626703(0xfffffffff7ea8031, float:-9.5124804E33)
            r5.W(r2)
            java.lang.Object r2 = r5.D()
            U0.m$a r22 = U0.C4889m.f14007a
            java.lang.Object r3 = r22.a()
            if (r2 != r3) goto L_0x01e5
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r3 = 2
            r4 = 0
            U0.r0 r2 = U0.u1.e(r2, r4, r3, r4)
            r5.u(r2)
        L_0x01e5:
            r4 = r2
            U0.r0 r4 = (U0.C4899r0) r4
            r5.P()
            r3 = 0
            r2 = 1
            androidx.compose.foundation.o r19 = androidx.compose.foundation.m.c(r3, r5, r3, r2)
            r2 = 32
            float r2 = (float) r2
            float r41 = c2.h.B(r2)
            r3 = 19
            float r3 = (float) r3
            float r38 = c2.h.B(r3)
            r42 = 6
            r43 = 0
            r39 = 0
            r40 = 0
            r37 = r9
            androidx.compose.ui.d r37 = androidx.compose.foundation.layout.D.m(r37, r38, r39, r40, r41, r42, r43)
            r42 = 14
            r39 = 0
            r40 = 0
            r41 = 0
            r38 = r19
            androidx.compose.ui.d r25 = androidx.compose.foundation.m.f(r37, r38, r39, r40, r41, r42, r43)
            r3 = 16
            float r3 = (float) r3
            float r32 = c2.h.B(r3)
            r34 = 1572864(0x180000, float:2.204052E-39)
            r35 = 30
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r26 = r19
            r33 = r5
            androidx.compose.ui.d r37 = kF.C14694O.b(r25, r26, r27, r29, r30, r31, r32, r33, r34, r35)
            r41 = 6
            r42 = 0
            r39 = 0
            r40 = 0
            androidx.compose.ui.d r24 = sF.C15049e.f(r37, r38, r39, r40, r41, r42)
            p1.v0$a r19 = p1.C5747v0.f27350b
            long r25 = r19.h()
            r28 = 2
            r29 = 0
            r27 = 0
            r19 = r2
            androidx.compose.ui.d r2 = androidx.compose.foundation.b.d(r24, r25, r27, r28, r29)
            androidx.compose.foundation.layout.d r20 = androidx.compose.foundation.layout.C5073d.f18068a
            r24 = r3
            androidx.compose.foundation.layout.d$f r3 = r20.d()
            i1.c$a r25 = i1.C5437c.f24302a
            r26 = r4
            i1.c$b r4 = r25.k()
            r6 = 6
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r4, r5, r6)
            r4 = 0
            int r6 = U0.C4883j.a(r5, r4)
            U0.y r4 = r5.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r5, r2)
            G1.g$a r27 = G1.C4504g.f6515W
            nI.a r7 = r27.a()
            U0.f r28 = r5.m()
            if (r28 != 0) goto L_0x0285
            U0.C4883j.c()
        L_0x0285:
            r5.I()
            boolean r28 = r5.i()
            if (r28 == 0) goto L_0x0292
            r5.p(r7)
            goto L_0x0295
        L_0x0292:
            r5.t()
        L_0x0295:
            U0.m r7 = U0.F1.a(r5)
            r35 = r9
            nI.p r9 = r27.c()
            U0.F1.c(r7, r3, r9)
            nI.p r3 = r27.e()
            U0.F1.c(r7, r4, r3)
            nI.p r3 = r27.b()
            boolean r4 = r7.i()
            if (r4 != 0) goto L_0x02c1
            java.lang.Object r4 = r7.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r9)
            if (r4 != 0) goto L_0x02cf
        L_0x02c1:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r7.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r7.w(r4, r3)
        L_0x02cf:
            nI.p r3 = r27.d()
            U0.F1.c(r7, r2, r3)
            s0.h r2 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r7 = 9
            float r2 = (float) r7
            float r29 = c2.h.B(r2)
            r3 = 40
            float r3 = (float) r3
            float r30 = c2.h.B(r3)
            float r31 = c2.h.B(r2)
            r33 = 8
            r34 = 0
            r32 = 0
            r28 = r9
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r28, r29, r30, r31, r32, r33, r34)
            androidx.compose.foundation.layout.d$f r3 = r20.d()
            i1.c$b r4 = r25.k()
            r6 = 6
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r4, r5, r6)
            r4 = 0
            int r18 = U0.C4883j.a(r5, r4)
            U0.y r4 = r5.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r5, r2)
            nI.a r6 = r27.a()
            U0.f r20 = r5.m()
            if (r20 != 0) goto L_0x031f
            U0.C4883j.c()
        L_0x031f:
            r5.I()
            boolean r20 = r5.i()
            if (r20 == 0) goto L_0x032c
            r5.p(r6)
            goto L_0x032f
        L_0x032c:
            r5.t()
        L_0x032f:
            U0.m r6 = U0.F1.a(r5)
            nI.p r7 = r27.c()
            U0.F1.c(r6, r3, r7)
            nI.p r3 = r27.e()
            U0.F1.c(r6, r4, r3)
            nI.p r3 = r27.b()
            boolean r4 = r6.i()
            if (r4 != 0) goto L_0x0359
            java.lang.Object r4 = r6.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r18)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r4 != 0) goto L_0x0367
        L_0x0359:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
            r6.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
            r6.w(r4, r3)
        L_0x0367:
            nI.p r3 = r27.d()
            U0.F1.c(r6, r2, r3)
            r2 = 20
            float r2 = (float) r2
            float r32 = c2.h.B(r2)
            r33 = 7
            r34 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r28 = r9
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r28, r29, r30, r31, r32, r33, r34)
            r4 = r8 & 14
            r4 = r4 | 48
            r6 = 0
            U(r1, r3, r5, r4, r6)
            r3 = -905720213(0xffffffffca03ce6b, float:-2159514.8)
            r5.W(r3)
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r7 = r8 & r3
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            if (r7 != r3) goto L_0x039d
            r4 = 1
            goto L_0x039e
        L_0x039d:
            r4 = r6
        L_0x039e:
            java.lang.Object r3 = r5.D()
            if (r4 != 0) goto L_0x03aa
            java.lang.Object r4 = r22.a()
            if (r3 != r4) goto L_0x03b2
        L_0x03aa:
            eF.l r3 = new eF.l
            r3.<init>(r14)
            r5.u(r3)
        L_0x03b2:
            r4 = r3
            nI.a r4 = (nI.C17631a) r4
            r5.P()
            float r32 = c2.h.B(r2)
            r33 = 7
            r34 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r28 = r9
            androidx.compose.ui.d r18 = androidx.compose.foundation.layout.D.m(r28, r29, r30, r31, r32, r33, r34)
            int r2 = r8 >> 3
            r3 = r2 & 14
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r2 = r2 & 112(0x70, float:1.57E-43)
            r25 = r3 | r2
            r27 = 0
            r28 = r19
            r19 = 1
            r2 = r48
            r21 = r6
            r6 = 1048576(0x100000, float:1.469368E-39)
            r3 = r49
            r44 = r26
            r58 = r5
            r5 = r18
            r16 = 6
            r6 = r58
            r1 = r7
            r10 = 67108864(0x4000000, float:1.5046328E-36)
            r17 = 9
            r7 = r25
            r18 = r17
            r17 = r8
            r8 = r27
            D(r2, r3, r4, r5, r6, r7, r8)
            r2 = -905712891(0xffffffffca03eb05, float:-2161345.2)
            r8 = r58
            r8.W(r2)
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r17 & r2
            if (r2 != r10) goto L_0x040f
            r4 = r19
            goto L_0x0411
        L_0x040f:
            r4 = r21
        L_0x0411:
            java.lang.Object r2 = r8.D()
            if (r4 != 0) goto L_0x0421
            java.lang.Object r3 = r22.a()
            if (r2 != r3) goto L_0x041e
            goto L_0x0421
        L_0x041e:
            r10 = r44
            goto L_0x042b
        L_0x0421:
            eF.m r2 = new eF.m
            r10 = r44
            r2.<init>(r13, r10)
            r8.u(r2)
        L_0x042b:
            r3 = r2
            nI.l r3 = (nI.C17642l) r3
            r8.P()
            r2 = -905707989(0xffffffffca03fe2b, float:-2162570.8)
            r8.W(r2)
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 != r2) goto L_0x043e
            r4 = r19
            goto L_0x0440
        L_0x043e:
            r4 = r21
        L_0x0440:
            java.lang.Object r1 = r8.D()
            if (r4 != 0) goto L_0x044c
            java.lang.Object r2 = r22.a()
            if (r1 != r2) goto L_0x0454
        L_0x044c:
            eF.n r1 = new eF.n
            r1.<init>(r14)
            r8.u(r1)
        L_0x0454:
            r4 = r1
            nI.a r4 = (nI.C17631a) r4
            r8.P()
            int r1 = r17 >> 9
            r7 = r1 & 14
            r1 = 8
            r5 = 0
            r2 = r50
            r6 = r8
            r58 = r8
            r8 = r1
            z(r2, r3, r4, r5, r6, r7, r8)
            r58.x()
            float r30 = c2.h.B(r28)
            float r31 = c2.h.B(r24)
            r33 = 9
            r34 = 0
            r29 = 0
            r32 = 0
            r28 = r9
            androidx.compose.ui.d r31 = androidx.compose.foundation.layout.D.m(r28, r29, r30, r31, r32, r33, r34)
            java.lang.Object r1 = r10.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r29 = r1.booleanValue()
            r1 = 597281963(0x2399ccab, float:1.6674973E-17)
            r2 = r58
            r2.W(r1)
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r17 & r1
            r3 = 8388608(0x800000, float:1.17549435E-38)
            if (r1 != r3) goto L_0x04a0
            r4 = r19
            goto L_0x04a2
        L_0x04a0:
            r4 = r21
        L_0x04a2:
            java.lang.Object r1 = r2.D()
            if (r4 != 0) goto L_0x04ae
            java.lang.Object r3 = r22.a()
            if (r1 != r3) goto L_0x04b6
        L_0x04ae:
            eF.o r1 = new eF.o
            r1.<init>(r12)
            r2.u(r1)
        L_0x04b6:
            r26 = r1
            nI.a r26 = (nI.C17631a) r26
            r2.P()
            r1 = 597285387(0x2399da0b, float:1.6680638E-17)
            r2.W(r1)
            r1 = 3670016(0x380000, float:5.142788E-39)
            r1 = r17 & r1
            r3 = 1048576(0x100000, float:1.469368E-39)
            if (r1 != r3) goto L_0x04ce
            r4 = r19
            goto L_0x04d0
        L_0x04ce:
            r4 = r21
        L_0x04d0:
            java.lang.Object r1 = r2.D()
            if (r4 != 0) goto L_0x04dc
            java.lang.Object r3 = r22.a()
            if (r1 != r3) goto L_0x04e4
        L_0x04dc:
            eF.p r1 = new eF.p
            r1.<init>(r11)
            r2.u(r1)
        L_0x04e4:
            r28 = r1
            nI.a r28 = (nI.C17631a) r28
            r2.P()
            int r1 = r17 >> 15
            r1 = r1 & 14
            r1 = r1 | r36
            int r3 = r17 >> 6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r1 = r1 | r3
            int r0 = r0 << 15
            r3 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r3
            r33 = r1 | r0
            r34 = 0
            r25 = r52
            r27 = r51
            r30 = r57
            r32 = r2
            x(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r2.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0516
            U0.C4895p.R()
        L_0x0516:
            U0.Y0 r10 = r2.n()
            if (r10 == 0) goto L_0x054f
            eF.q r9 = new eF.q
            r0 = r9
            r1 = r47
            r2 = r48
            r3 = r49
            r4 = r50
            r5 = r51
            r6 = r52
            r7 = r53
            r8 = r54
            r12 = r9
            r9 = r55
            r13 = r10
            r10 = r56
            r11 = r57
            r14 = r12
            r12 = r35
            r45 = r13
            r13 = r60
            r15 = r14
            r14 = r61
            r46 = r15
            r15 = r62
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r45
            r1 = r46
            r0.a(r1)
        L_0x054f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eF.J.G(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, nI.a, nI.a, nI.l, nI.a, boolean, androidx.compose.ui.d, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N H(C17642l lVar, C4899r0 r0Var, boolean z10) {
        lVar.invoke(Boolean.valueOf(z10));
        r0Var.setValue(Boolean.valueOf(z10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N I(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N J(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M(String str, String str2, String str3, String str4, String str5, String str6, C17631a aVar, C17631a aVar2, C17642l lVar, C17631a aVar3, boolean z10, androidx.compose.ui.d dVar, int i10, int i11, int i12, C4889m mVar, int i13) {
        G(str, str2, str3, str4, str5, str6, aVar, aVar2, lVar, aVar3, z10, dVar, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    private static final void N(C15083h hVar, boolean z10, C4889m mVar, int i10, int i11) {
        int i12;
        C4596z0 z0Var;
        C4889m k10 = mVar.k(-2005231174);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.b(z10) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                z10 = false;
            }
            if (C4895p.J()) {
                C4895p.S(-2005231174, i12, -1, "com.sugarcube.app.base.ui.capture.LandscapePrivacyPolicyConsentDialog (PrivacyPolicyConsentDialog.kt:182)");
            }
            if (z10) {
                k10.W(-62580273);
                z0Var = C4592x0.g(new G(H.Open, (C17642l) null, 2, (DefaultConstructorMarker) null), (G0) null, k10, 0, 2);
                k10.P();
            } else {
                k10.W(-62494310);
                z0Var = C4592x0.g((G) null, (G0) null, k10, 0, 3);
                k10.P();
            }
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                B b10 = new B(P.k(C17169j.f142968a, k10));
                k10.u(b10);
                D10 = b10;
            }
            C14577q.e(z0Var, c1.c.e(1117610690, true, new b(hVar, ((B) D10).a(), z0Var), k10, 54), k10, 48, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C14407G(hVar, z10, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N O(C15083h hVar, boolean z10, int i10, int i11, C4889m mVar, int i12) {
        N(hVar, z10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void P(tF.C15083h r17, boolean r18, U0.C4889m r19, int r20, int r21) {
        /*
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = 903392566(0x35d8ad36, float:1.6143665E-6)
            r4 = r19
            U0.m r11 = r4.k(r3)
            r4 = r2 & 1
            r12 = 4
            if (r4 == 0) goto L_0x0017
            r4 = r1 | 6
            goto L_0x0027
        L_0x0017:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x0026
            boolean r4 = r11.V(r0)
            if (r4 == 0) goto L_0x0023
            r4 = r12
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r1
            goto L_0x0027
        L_0x0026:
            r4 = r1
        L_0x0027:
            r5 = r2 & 2
            if (r5 == 0) goto L_0x0031
            r4 = r4 | 48
        L_0x002d:
            r6 = r18
        L_0x002f:
            r13 = r4
            goto L_0x0044
        L_0x0031:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x002d
            r6 = r18
            boolean r7 = r11.b(r6)
            if (r7 == 0) goto L_0x0040
            r7 = 32
            goto L_0x0042
        L_0x0040:
            r7 = 16
        L_0x0042:
            r4 = r4 | r7
            goto L_0x002f
        L_0x0044:
            r4 = r13 & 19
            r7 = 18
            if (r4 != r7) goto L_0x0057
            boolean r4 = r11.l()
            if (r4 != 0) goto L_0x0051
            goto L_0x0057
        L_0x0051:
            r11.L()
            r15 = r6
            goto L_0x0115
        L_0x0057:
            r14 = 0
            if (r5 == 0) goto L_0x005c
            r15 = r14
            goto L_0x005d
        L_0x005c:
            r15 = r6
        L_0x005d:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0069
            r4 = -1
            java.lang.String r5 = "com.sugarcube.app.base.ui.capture.PortraitPrivacyPolicyConsentDialog (PrivacyPolicyConsentDialog.kt:98)"
            U0.C4895p.S(r3, r13, r4, r5)
        L_0x0069:
            r3 = -1142129061(0xffffffffbbec7e5b, float:-0.007217211)
            r11.W(r3)
            java.lang.Object r3 = r11.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r4 = r16.a()
            if (r3 != r4) goto L_0x0083
            eF.E r3 = new eF.E
            r3.<init>()
            r11.u(r3)
        L_0x0083:
            r6 = r3
            nI.l r6 = (nI.C17642l) r6
            r11.P()
            if (r15 == 0) goto L_0x008f
            I0.m0 r3 = I0.C4571m0.Expanded
        L_0x008d:
            r4 = r3
            goto L_0x0092
        L_0x008f:
            I0.m0 r3 = I0.C4571m0.Hidden
            goto L_0x008d
        L_0x0092:
            r9 = 3456(0xd80, float:4.843E-42)
            r10 = 2
            r5 = 0
            r7 = 1
            r8 = r11
            I0.l0 r3 = I0.C4567k0.j(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r4 = r11.D()
            java.lang.Object r5 = r16.a()
            if (r4 != r5) goto L_0x00b5
            dI.j r4 = dI.C17169j.f142968a
            QJ.Q r4 = U0.P.k(r4, r11)
            U0.B r5 = new U0.B
            r5.<init>(r4)
            r11.u(r5)
            r4 = r5
        L_0x00b5:
            U0.B r4 = (U0.B) r4
            QJ.Q r4 = r4.a()
            r5 = -1142115985(0xffffffffbbecb16f, float:-0.0072233)
            r11.W(r5)
            r5 = r13 & 14
            r6 = 1
            if (r5 != r12) goto L_0x00c8
            r7 = r6
            goto L_0x00c9
        L_0x00c8:
            r7 = r14
        L_0x00c9:
            boolean r8 = r11.F(r4)
            r7 = r7 | r8
            boolean r8 = r11.F(r3)
            r7 = r7 | r8
            java.lang.Object r8 = r11.D()
            if (r7 != 0) goto L_0x00df
            java.lang.Object r7 = r16.a()
            if (r8 != r7) goto L_0x00e8
        L_0x00df:
            eF.J$c r8 = new eF.J$c
            r7 = 0
            r8.<init>(r0, r4, r3, r7)
            r11.u(r8)
        L_0x00e8:
            nI.p r8 = (nI.p) r8
            r11.P()
            U0.P.g(r0, r8, r11, r5)
            boolean r5 = n0.C5607m.a(r11, r14)
            eF.J$d r7 = new eF.J$d
            r7.<init>(r0, r3, r4)
            r3 = 54
            r4 = 2015341752(0x781facb8, float:1.2954349E34)
            c1.a r6 = c1.c.e(r4, r6, r7, r11, r3)
            r8 = 384(0x180, float:5.38E-43)
            r9 = 2
            r3 = 0
            r4 = r5
            r5 = r3
            r7 = r11
            tK.Z.g(r4, r5, r6, r7, r8, r9)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0115
            U0.C4895p.R()
        L_0x0115:
            U0.Y0 r3 = r11.n()
            if (r3 == 0) goto L_0x0123
            eF.F r4 = new eF.F
            r4.<init>(r0, r15, r1, r2)
            r3.a(r4)
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eF.J.P(tF.h, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final boolean Q(C4571m0 m0Var) {
        C17542s.j(m0Var, "it");
        return false;
    }

    /* access modifiers changed from: private */
    public static final C16807N R(C15083h hVar, boolean z10, int i10, int i11, C4889m mVar, int i12) {
        P(hVar, z10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void S(C15083h hVar, boolean z10, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(hVar, "dialogUIModel");
        C4889m k10 = mVar.k(-273778501);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.b(z10) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                z10 = false;
            }
            if (C4895p.J()) {
                C4895p.S(-273778501, i12, -1, "com.sugarcube.app.base.ui.capture.PrivacyPolicyConsentDialog (PrivacyPolicyConsentDialog.kt:77)");
            }
            if (((Configuration) k10.Q(AndroidCompositionLocals_androidKt.f())).orientation == 2) {
                k10.W(1244342435);
                N(hVar, z10, k10, i12 & 126, 0);
                k10.P();
            } else {
                k10.W(1244444580);
                P(hVar, z10, k10, i12 & 126, 0);
                k10.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C14404D(hVar, z10, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N T(C15083h hVar, boolean z10, int i10, int i11, C4889m mVar, int i12) {
        S(hVar, z10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void U(java.lang.String r27, androidx.compose.ui.d r28, U0.C4889m r29, int r30, int r31) {
        /*
            r1 = r27
            r0 = -1649255272(0xffffffff9db25c98, float:-4.7211947E-21)
            r2 = r29
            U0.m r15 = r2.k(r0)
            r2 = r31 & 1
            if (r2 == 0) goto L_0x0012
            r2 = r30 | 6
            goto L_0x0024
        L_0x0012:
            r2 = r30 & 6
            if (r2 != 0) goto L_0x0022
            boolean r2 = r15.V(r1)
            if (r2 == 0) goto L_0x001e
            r2 = 4
            goto L_0x001f
        L_0x001e:
            r2 = 2
        L_0x001f:
            r2 = r30 | r2
            goto L_0x0024
        L_0x0022:
            r2 = r30
        L_0x0024:
            r3 = r31 & 2
            if (r3 == 0) goto L_0x002d
            r2 = r2 | 48
        L_0x002a:
            r4 = r28
            goto L_0x003f
        L_0x002d:
            r4 = r30 & 48
            if (r4 != 0) goto L_0x002a
            r4 = r28
            boolean r5 = r15.V(r4)
            if (r5 == 0) goto L_0x003c
            r5 = 32
            goto L_0x003e
        L_0x003c:
            r5 = 16
        L_0x003e:
            r2 = r2 | r5
        L_0x003f:
            r5 = r2 & 19
            r6 = 18
            if (r5 != r6) goto L_0x0052
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x004c
            goto L_0x0052
        L_0x004c:
            r15.L()
            r26 = r15
            goto L_0x00ab
        L_0x0052:
            if (r3 == 0) goto L_0x0059
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r25 = r3
            goto L_0x005b
        L_0x0059:
            r25 = r4
        L_0x005b:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0067
            r3 = -1
            java.lang.String r4 = "com.sugarcube.app.base.ui.capture.Title (PrivacyPolicyConsentDialog.kt:290)"
            U0.C4895p.S(r0, r2, r3, r4)
        L_0x0067:
            tK.v r0 = tK.C18030v.f147664a
            int r3 = tK.C18030v.f147665b
            tK.w r0 = r0.b(r15, r3)
            tK.r r0 = r0.c()
            N1.Y r20 = r0.a()
            r22 = r2 & 126(0x7e, float:1.77E-43)
            r23 = 0
            r24 = 65532(0xfffc, float:9.183E-41)
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r0 = 0
            r26 = r15
            r15 = r0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r0 = r27
            r1 = r25
            r21 = r26
            I0.b1.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00a9
            U0.C4895p.R()
        L_0x00a9:
            r4 = r25
        L_0x00ab:
            U0.Y0 r0 = r26.n()
            if (r0 == 0) goto L_0x00bf
            eF.r r1 = new eF.r
            r2 = r27
            r3 = r30
            r5 = r31
            r1.<init>(r2, r4, r3, r5)
            r0.a(r1)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eF.J.U(java.lang.String, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N V(String str, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        U(str, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N W() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N X() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Z(boolean z10) {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N a0() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N b0() {
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void x(java.lang.String r20, nI.C17631a<XH.C16807N> r21, java.lang.String r22, nI.C17631a<XH.C16807N> r23, boolean r24, boolean r25, androidx.compose.ui.d r26, U0.C4889m r27, int r28, int r29) {
        /*
            r8 = r28
            r0 = 1828989284(0x6d042964, float:2.5563787E27)
            r1 = r27
            U0.m r1 = r1.k(r0)
            r2 = r29 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r8 | 6
            r3 = r2
            r2 = r20
            goto L_0x0029
        L_0x0015:
            r2 = r8 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r20
            boolean r3 = r1.V(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r8
            goto L_0x0029
        L_0x0026:
            r2 = r20
            r3 = r8
        L_0x0029:
            r4 = r29 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r4 = r21
            goto L_0x0044
        L_0x0032:
            r4 = r8 & 48
            if (r4 != 0) goto L_0x002f
            r4 = r21
            boolean r5 = r1.F(r4)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r3 = r3 | r5
        L_0x0044:
            r5 = r29 & 4
            if (r5 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r5 = r22
            goto L_0x005f
        L_0x004d:
            r5 = r8 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r22
            boolean r6 = r1.V(r5)
            if (r6 == 0) goto L_0x005c
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r6
        L_0x005f:
            r6 = r29 & 8
            if (r6 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r6 = r23
            goto L_0x007a
        L_0x0068:
            r6 = r8 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0065
            r6 = r23
            boolean r7 = r1.F(r6)
            if (r7 == 0) goto L_0x0077
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r7
        L_0x007a:
            r7 = r29 & 16
            if (r7 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r7 = r24
            goto L_0x0095
        L_0x0083:
            r7 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x0080
            r7 = r24
            boolean r9 = r1.b(r7)
            if (r9 == 0) goto L_0x0092
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r9
        L_0x0095:
            r9 = r29 & 32
            r10 = 196608(0x30000, float:2.75506E-40)
            if (r9 == 0) goto L_0x009f
            r3 = r3 | r10
            r15 = r25
            goto L_0x00b1
        L_0x009f:
            r9 = r8 & r10
            r15 = r25
            if (r9 != 0) goto L_0x00b1
            boolean r9 = r1.b(r15)
            if (r9 == 0) goto L_0x00ae
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ae:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r3 = r3 | r9
        L_0x00b1:
            r9 = r29 & 64
            r10 = 1572864(0x180000, float:2.204052E-39)
            if (r9 == 0) goto L_0x00bb
            r3 = r3 | r10
        L_0x00b8:
            r10 = r26
            goto L_0x00cc
        L_0x00bb:
            r10 = r10 & r8
            if (r10 != 0) goto L_0x00b8
            r10 = r26
            boolean r11 = r1.V(r10)
            if (r11 == 0) goto L_0x00c9
            r11 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cb
        L_0x00c9:
            r11 = 524288(0x80000, float:7.34684E-40)
        L_0x00cb:
            r3 = r3 | r11
        L_0x00cc:
            r11 = 599187(0x92493, float:8.3964E-40)
            r11 = r11 & r3
            r12 = 599186(0x92492, float:8.39638E-40)
            if (r11 != r12) goto L_0x00e1
            boolean r11 = r1.l()
            if (r11 != 0) goto L_0x00dc
            goto L_0x00e1
        L_0x00dc:
            r1.L()
            goto L_0x0154
        L_0x00e1:
            if (r9 == 0) goto L_0x00e8
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r19 = r9
            goto L_0x00ea
        L_0x00e8:
            r19 = r10
        L_0x00ea:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00f6
            r9 = -1
            java.lang.String r10 = "com.sugarcube.app.base.ui.capture.ButtonsRow (PrivacyPolicyConsentDialog.kt:358)"
            U0.C4895p.S(r0, r3, r9, r10)
        L_0x00f6:
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            r9 = 15
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            androidx.compose.foundation.layout.d$f r16 = r0.n(r9)
            r9 = 20
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            i1.c$a r10 = i1.C5437c.f24302a
            i1.c$c r10 = r10.l()
            androidx.compose.foundation.layout.d$m r0 = r0.p(r9, r10)
            eF.J$a r14 = new eF.J$a
            r9 = r14
            r10 = r20
            r11 = r22
            r12 = r21
            r13 = r24
            r2 = r14
            r14 = r25
            r15 = r23
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r9 = 54
            r10 = -468649847(0xffffffffe410f889, float:-1.069696E22)
            r11 = 1
            c1.a r15 = c1.c.e(r10, r11, r2, r1, r9)
            int r2 = r3 >> 18
            r2 = r2 & 14
            r3 = 1573296(0x1801b0, float:2.204657E-39)
            r17 = r2 | r3
            r18 = 56
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = r19
            r10 = r16
            r11 = r0
            r16 = r1
            androidx.compose.foundation.layout.p.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0152
            U0.C4895p.R()
        L_0x0152:
            r10 = r19
        L_0x0154:
            U0.Y0 r11 = r1.n()
            if (r11 == 0) goto L_0x0174
            eF.w r12 = new eF.w
            r0 = r12
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r10
            r8 = r28
            r9 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.a(r12)
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eF.J.x(java.lang.String, nI.a, java.lang.String, nI.a, boolean, boolean, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N y(String str, C17631a aVar, String str2, C17631a aVar2, boolean z10, boolean z11, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        x(str, aVar, str2, aVar2, z10, z11, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void z(java.lang.String r21, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r22, nI.C17631a<XH.C16807N> r23, androidx.compose.ui.d r24, U0.C4889m r25, int r26, int r27) {
        /*
            r2 = r22
            r3 = r23
            r5 = r26
            r0 = 8
            r1 = 4
            r4 = 48
            r6 = -959589628(0xffffffffc6cdd304, float:-26345.508)
            r7 = r25
            U0.m r15 = r7.k(r6)
            r16 = 1
            r7 = r27 & 1
            r8 = 2
            if (r7 == 0) goto L_0x0020
            r7 = r5 | 6
            r14 = r21
            goto L_0x0032
        L_0x0020:
            r7 = r5 & 6
            r14 = r21
            if (r7 != 0) goto L_0x0031
            boolean r7 = r15.V(r14)
            if (r7 == 0) goto L_0x002e
            r7 = r1
            goto L_0x002f
        L_0x002e:
            r7 = r8
        L_0x002f:
            r7 = r7 | r5
            goto L_0x0032
        L_0x0031:
            r7 = r5
        L_0x0032:
            r9 = r27 & 2
            r10 = 32
            if (r9 == 0) goto L_0x003a
            r7 = r7 | r4
            goto L_0x0049
        L_0x003a:
            r9 = r5 & 48
            if (r9 != 0) goto L_0x0049
            boolean r9 = r15.F(r2)
            if (r9 == 0) goto L_0x0046
            r9 = r10
            goto L_0x0048
        L_0x0046:
            r9 = 16
        L_0x0048:
            r7 = r7 | r9
        L_0x0049:
            r1 = r27 & 4
            if (r1 == 0) goto L_0x0050
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0060
        L_0x0050:
            r1 = r5 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0060
            boolean r1 = r15.F(r3)
            if (r1 == 0) goto L_0x005d
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r1 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r7 = r7 | r1
        L_0x0060:
            r1 = r27 & 8
            if (r1 == 0) goto L_0x006a
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0066:
            r9 = r24
        L_0x0068:
            r11 = r7
            goto L_0x007d
        L_0x006a:
            r9 = r5 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0066
            r9 = r24
            boolean r11 = r15.V(r9)
            if (r11 == 0) goto L_0x0079
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r7 = r7 | r11
            goto L_0x0068
        L_0x007d:
            r7 = r11 & 1171(0x493, float:1.641E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r7 != r12) goto L_0x0091
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x008a
            goto L_0x0091
        L_0x008a:
            r15.L()
            r4 = r9
            r6 = r15
            goto L_0x01f5
        L_0x0091:
            if (r1 == 0) goto L_0x0096
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            goto L_0x0097
        L_0x0096:
            r1 = r9
        L_0x0097:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x00a3
            r7 = -1
            java.lang.String r9 = "com.sugarcube.app.base.ui.capture.ConsentCheckbox (PrivacyPolicyConsentDialog.kt:320)"
            U0.C4895p.S(r6, r11, r7, r9)
        L_0x00a3:
            r6 = -1272104611(0xffffffffb42d395d, float:-1.6132749E-7)
            r15.W(r6)
            java.lang.Object r6 = r15.D()
            U0.m$a r17 = U0.C4889m.f14007a
            java.lang.Object r7 = r17.a()
            if (r6 != r7) goto L_0x00bf
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r7 = 0
            U0.r0 r6 = U0.u1.e(r6, r7, r8, r7)
            r15.u(r6)
        L_0x00bf:
            U0.r0 r6 = (U0.C4899r0) r6
            r15.P()
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$c r7 = r7.i()
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r8 = r8.f()
            E1.I r4 = androidx.compose.foundation.layout.G.b(r8, r7, r15, r4)
            r12 = 0
            int r7 = U0.C4883j.a(r15, r12)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r15, r1)
            G1.g$a r18 = G1.C4504g.f6515W
            nI.a r12 = r18.a()
            U0.f r19 = r15.m()
            if (r19 != 0) goto L_0x00f0
            U0.C4883j.c()
        L_0x00f0:
            r15.I()
            boolean r19 = r15.i()
            if (r19 == 0) goto L_0x00fd
            r15.p(r12)
            goto L_0x0100
        L_0x00fd:
            r15.t()
        L_0x0100:
            U0.m r12 = U0.F1.a(r15)
            nI.p r13 = r18.c()
            U0.F1.c(r12, r4, r13)
            nI.p r4 = r18.e()
            U0.F1.c(r12, r8, r4)
            nI.p r4 = r18.b()
            boolean r8 = r12.i()
            if (r8 != 0) goto L_0x012a
            java.lang.Object r8 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r13)
            if (r8 != 0) goto L_0x0138
        L_0x012a:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r12.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12.w(r7, r4)
        L_0x0138:
            nI.p r4 = r18.d()
            U0.F1.c(r12, r9, r4)
            s0.N r4 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            java.lang.String r7 = "checkbox"
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r4, r7)
            java.lang.Object r7 = r6.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r9 = 533670809(0x1fcf2b99, float:8.7740036E-20)
            r15.W(r9)
            r9 = r11 & 112(0x70, float:1.57E-43)
            if (r9 != r10) goto L_0x0160
            r9 = r16
            goto L_0x0161
        L_0x0160:
            r9 = 0
        L_0x0161:
            java.lang.Object r10 = r15.D()
            if (r9 != 0) goto L_0x016d
            java.lang.Object r9 = r17.a()
            if (r10 != r9) goto L_0x0175
        L_0x016d:
            eF.s r10 = new eF.s
            r10.<init>(r6, r2)
            r15.u(r10)
        L_0x0175:
            r12 = r10
            nI.l r12 = (nI.C17642l) r12
            r15.P()
            r6 = 48
            r18 = 28
            r9 = 0
            r10 = 0
            r13 = 0
            r20 = r11
            r11 = r13
            r13 = 256(0x100, float:3.59E-43)
            r0 = 16
            r13 = r15
            r14 = r6
            r6 = r15
            r15 = r18
            wK.C18415n1.p(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            r7 = 8
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.j(r4, r0, r7)
            int r0 = OE.n.f113312Y0
            r4 = 0
            java.lang.String r0 = J1.j.b(r0, r6, r4)
            r8 = 533686354(0x1fcf6852, float:8.7840494E-20)
            r6.W(r8)
            r8 = r20
            r9 = r8 & 896(0x380, float:1.256E-42)
            r10 = 256(0x100, float:3.59E-43)
            if (r9 != r10) goto L_0x01b7
            goto L_0x01b9
        L_0x01b7:
            r16 = r4
        L_0x01b9:
            java.lang.Object r4 = r6.D()
            if (r16 != 0) goto L_0x01c5
            java.lang.Object r9 = r17.a()
            if (r4 != r9) goto L_0x01cd
        L_0x01c5:
            eF.t r4 = new eF.t
            r4.<init>(r3)
            r6.u(r4)
        L_0x01cd:
            nI.l r4 = (nI.C17642l) r4
            r6.P()
            kF.q r9 = new kF.q
            r9.<init>(r0, r4)
            int r0 = r8 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r14 = r0 | 6
            r15 = 56
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r21
            r13 = r6
            kF.C14724t.c(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r6.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01f4
            U0.C4895p.R()
        L_0x01f4:
            r4 = r1
        L_0x01f5:
            U0.Y0 r7 = r6.n()
            if (r7 == 0) goto L_0x020e
            eF.u r8 = new eF.u
            r0 = r8
            r1 = r21
            r2 = r22
            r3 = r23
            r5 = r26
            r6 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x020e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eF.J.z(java.lang.String, nI.l, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }
}
