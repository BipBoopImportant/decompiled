package Eh;

import Gh.b;
import KJ.C15987c;
import QJ.C16297b0;
import QJ.Q;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import XH.y;
import android.content.Context;
import android.provider.Settings;
import androidx.compose.ui.d;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import m0.C5530a;
import m0.C5548j;
import m0.C5554m;
import m0.K;
import m0.y0;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LGh/b;", "currentFeature", "LKJ/c;", "features", "", "animateProgress", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "onNextFeatureEntry", "i", "(LGh/b;LKJ/c;ZLandroidx/compose/ui/d;LnI/a;LU0/m;II)V", "", "progress", "e", "(FLandroidx/compose/ui/d;LU0/m;II)V", "Landroid/content/Context;", "context", "k", "(Landroid/content/Context;)Z", "onboarding_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class B {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.onboarding.gallery.compose.OnboardingFeatureGalleryProgressIndicatorsKt$OnboardingFeatureGalleryProgressIndicators$1$1", f = "OnboardingFeatureGalleryProgressIndicators.kt", l = {55, 57}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f60279c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f60280d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f60281e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5530a<Float, C5554m> f60282f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f60283g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z10, b bVar, C5530a<Float, C5554m> aVar, C17631a<C16807N> aVar2, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f60280d = z10;
            this.f60281e = bVar;
            this.f60282f = aVar;
            this.f60283g = aVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f60280d, this.f60281e, this.f60282f, this.f60283g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f60279c;
            if (i10 == 0) {
                y.b(obj);
                if (this.f60280d) {
                    long c10 = this.f60281e.c();
                    this.f60279c = 1;
                    if (C16297b0.b(c10, this) == f10) {
                        return f10;
                    }
                } else {
                    C5530a<Float, C5554m> aVar = this.f60282f;
                    Float d10 = kotlin.coroutines.jvm.internal.b.d(1.0f);
                    y0 j10 = C5548j.j((int) this.f60281e.c(), 0, K.o(), 2, (Object) null);
                    this.f60279c = 2;
                    if (C5530a.f(aVar, d10, j10, (Object) null, (C17642l) null, this, 12, (Object) null) == f10) {
                        return f10;
                    }
                    this.f60283g.invoke();
                    return C16807N.f139792a;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
                this.f60283g.invoke();
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16807N n10 = C16807N.f139792a;
            this.f60283g.invoke();
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void e(float r19, androidx.compose.ui.d r20, U0.C4889m r21, int r22, int r23) {
        /*
            r0 = r19
            r1 = r22
            r2 = r23
            r3 = -775142865(0xffffffffd1cc422f, float:-1.09660463E11)
            r4 = r21
            U0.m r15 = r4.k(r3)
            r4 = r2 & 1
            r5 = 4
            if (r4 == 0) goto L_0x0017
            r4 = r1 | 6
            goto L_0x0027
        L_0x0017:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x0026
            boolean r4 = r15.c(r0)
            if (r4 == 0) goto L_0x0023
            r4 = r5
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r1
            goto L_0x0027
        L_0x0026:
            r4 = r1
        L_0x0027:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x0030
            r4 = r4 | 48
        L_0x002d:
            r7 = r20
            goto L_0x0042
        L_0x0030:
            r7 = r1 & 48
            if (r7 != 0) goto L_0x002d
            r7 = r20
            boolean r8 = r15.V(r7)
            if (r8 == 0) goto L_0x003f
            r8 = 32
            goto L_0x0041
        L_0x003f:
            r8 = 16
        L_0x0041:
            r4 = r4 | r8
        L_0x0042:
            r8 = r4 & 19
            r9 = 18
            if (r8 != r9) goto L_0x0057
            boolean r8 = r15.l()
            if (r8 != 0) goto L_0x004f
            goto L_0x0057
        L_0x004f:
            r15.L()
            r3 = r7
            r16 = r15
            goto L_0x0100
        L_0x0057:
            if (r6 == 0) goto L_0x005d
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r14 = r6
            goto L_0x005e
        L_0x005d:
            r14 = r7
        L_0x005e:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x006a
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.app.onboarding.gallery.compose.LoadingLinear (OnboardingFeatureGalleryProgressIndicators.kt:106)"
            U0.C4895p.S(r3, r4, r6, r7)
        L_0x006a:
            r3 = 1954086748(0x7478ff5c, float:7.8910457E31)
            r15.W(r3)
            r3 = r4 & 14
            r4 = 0
            if (r3 != r5) goto L_0x0077
            r3 = 1
            goto L_0x0078
        L_0x0077:
            r3 = r4
        L_0x0078:
            java.lang.Object r5 = r15.D()
            if (r3 != 0) goto L_0x0086
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x008e
        L_0x0086:
            Eh.y r5 = new Eh.y
            r5.<init>(r0)
            r15.u(r5)
        L_0x008e:
            r3 = r5
            nI.a r3 = (nI.C17631a) r3
            r15.P()
            SC.l1 r5 = SC.C13609l1.f116346a
            float r6 = r5.b()
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.i(r14, r6)
            A0.f r5 = r5.a()
            androidx.compose.ui.d r5 = m1.e.a(r6, r5)
            tK.v r6 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r8 = r6.a(r15, r7)
            long r8 = r8.p0()
            tK.h r6 = r6.a(r15, r7)
            long r10 = r6.m0()
            float r4 = (float) r4
            float r12 = c2.h.B(r4)
            r4 = 1954096690(0x74792632, float:7.8958533E31)
            r15.W(r4)
            java.lang.Object r4 = r15.D()
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r4 != r6) goto L_0x00d9
            Eh.z r4 = new Eh.z
            r4.<init>()
            r15.u(r4)
        L_0x00d9:
            r13 = r4
            nI.l r13 = (nI.C17642l) r13
            r15.P()
            r16 = 1769472(0x1b0000, float:2.479558E-39)
            r17 = 16
            r18 = 0
            r4 = r3
            r6 = r8
            r8 = r10
            r10 = r18
            r11 = r12
            r12 = r13
            r13 = r15
            r3 = r14
            r14 = r16
            r16 = r15
            r15 = r17
            O0.C4747p0.b(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0100
            U0.C4895p.R()
        L_0x0100:
            U0.Y0 r4 = r16.n()
            if (r4 == 0) goto L_0x010e
            Eh.A r5 = new Eh.A
            r5.<init>(r0, r3, r1, r2)
            r4.a(r5)
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Eh.B.e(float, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(r1.f fVar) {
        C17542s.j(fVar, "$this$LinearProgressIndicator");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(float f10, d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(f10, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final float h(float f10) {
        return f10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:140:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(Gh.b r18, KJ.C15987c<Gh.b> r19, boolean r20, androidx.compose.ui.d r21, nI.C17631a<XH.C16807N> r22, U0.C4889m r23, int r24, int r25) {
        /*
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r22
            r10 = r24
            r11 = 8
            r0 = 16
            r12 = 48
            r13 = 6
            java.lang.String r1 = "currentFeature"
            kotlin.jvm.internal.C17542s.j(r6, r1)
            java.lang.String r1 = "features"
            kotlin.jvm.internal.C17542s.j(r7, r1)
            java.lang.String r1 = "onNextFeatureEntry"
            kotlin.jvm.internal.C17542s.j(r9, r1)
            r1 = 1277061737(0x4c1e6a69, float:4.1527716E7)
            r2 = r23
            U0.m r14 = r2.k(r1)
            r15 = 1
            r2 = r25 & 1
            r3 = 2
            r4 = 4
            if (r2 == 0) goto L_0x0033
            r2 = r10 | 6
            goto L_0x0043
        L_0x0033:
            r2 = r10 & 6
            if (r2 != 0) goto L_0x0042
            boolean r2 = r14.V(r6)
            if (r2 == 0) goto L_0x003f
            r2 = r4
            goto L_0x0040
        L_0x003f:
            r2 = r3
        L_0x0040:
            r2 = r2 | r10
            goto L_0x0043
        L_0x0042:
            r2 = r10
        L_0x0043:
            r5 = r25 & 2
            if (r5 == 0) goto L_0x0049
            r2 = r2 | r12
            goto L_0x0058
        L_0x0049:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x0058
            boolean r5 = r14.V(r7)
            if (r5 == 0) goto L_0x0056
            r5 = 32
            goto L_0x0057
        L_0x0056:
            r5 = r0
        L_0x0057:
            r2 = r2 | r5
        L_0x0058:
            r5 = r25 & 4
            if (r5 == 0) goto L_0x005f
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x006f
        L_0x005f:
            r5 = r10 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x006f
            boolean r5 = r14.b(r8)
            if (r5 == 0) goto L_0x006c
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x006e
        L_0x006c:
            r5 = 128(0x80, float:1.794E-43)
        L_0x006e:
            r2 = r2 | r5
        L_0x006f:
            r5 = r25 & 8
            if (r5 == 0) goto L_0x0078
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0075:
            r12 = r21
            goto L_0x008b
        L_0x0078:
            r12 = r10 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0075
            r12 = r21
            boolean r16 = r14.V(r12)
            if (r16 == 0) goto L_0x0087
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0089
        L_0x0087:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0089:
            r2 = r2 | r16
        L_0x008b:
            r0 = r25 & 16
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0094
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a3
        L_0x0094:
            r0 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x00a3
            boolean r0 = r14.F(r9)
            if (r0 == 0) goto L_0x00a0
            r0 = r15
            goto L_0x00a2
        L_0x00a0:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x00a2:
            r2 = r2 | r0
        L_0x00a3:
            r0 = r2 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r0 != r13) goto L_0x00b6
            boolean r0 = r14.l()
            if (r0 != 0) goto L_0x00b0
            goto L_0x00b6
        L_0x00b0:
            r14.L()
        L_0x00b3:
            r4 = r12
            goto L_0x02ce
        L_0x00b6:
            if (r5 == 0) goto L_0x00bb
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r12 = r0
        L_0x00bb:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00c7
            r0 = -1
            java.lang.String r5 = "com.ingka.ikea.app.onboarding.gallery.compose.OnboardingFeatureGalleryProgressIndicators (OnboardingFeatureGalleryProgressIndicators.kt:45)"
            U0.C4895p.S(r1, r2, r0, r5)
        L_0x00c7:
            r0 = -2040902140(0xffffffff865a4e04, float:-4.105856E-35)
            r14.W(r0)
            r0 = r2 & 14
            if (r0 != r4) goto L_0x00d3
            r1 = 1
            goto L_0x00d4
        L_0x00d3:
            r1 = 0
        L_0x00d4:
            java.lang.Object r5 = r14.D()
            r13 = 0
            if (r1 != 0) goto L_0x00e3
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r5 != r1) goto L_0x00eb
        L_0x00e3:
            r1 = 0
            m0.a r5 = m0.C5532b.b(r13, r13, r3, r1)
            r14.u(r5)
        L_0x00eb:
            m0.a r5 = (m0.C5530a) r5
            r14.P()
            U0.I0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r1 = r14.Q(r1)
            android.content.Context r1 = (android.content.Context) r1
            r3 = -2040898427(0xffffffff865a5c85, float:-4.1069216E-35)
            r14.W(r3)
            java.lang.Object r3 = r14.D()
            U0.m$a r17 = U0.C4889m.f14007a
            java.lang.Object r13 = r17.a()
            if (r3 != r13) goto L_0x0117
            boolean r1 = k(r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r14.u(r3)
        L_0x0117:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r13 = r3.booleanValue()
            r14.P()
            r1 = 52
            float r1 = (float) r1
            float r3 = c2.h.B(r1)
            r1 = -2040895298(0xffffffff865a68be, float:-4.1078195E-35)
            r14.W(r1)
            if (r8 == 0) goto L_0x017b
            r1 = -2040893351(0xffffffff865a7059, float:-4.1083783E-35)
            r14.W(r1)
            if (r0 != r4) goto L_0x0139
            r0 = 1
            goto L_0x013a
        L_0x0139:
            r0 = 0
        L_0x013a:
            boolean r1 = r14.F(r5)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r2
            if (r1 != r15) goto L_0x0147
            r1 = 1
            goto L_0x0148
        L_0x0147:
            r1 = 0
        L_0x0148:
            r0 = r0 | r1
            java.lang.Object r1 = r14.D()
            if (r0 != 0) goto L_0x0159
            java.lang.Object r0 = r17.a()
            if (r1 != r0) goto L_0x0156
            goto L_0x0159
        L_0x0156:
            r11 = r3
            r8 = r5
            goto L_0x0170
        L_0x0159:
            Eh.B$a r15 = new Eh.B$a
            r17 = 0
            r0 = r15
            r1 = r13
            r2 = r18
            r4 = r3
            r3 = r5
            r11 = r4
            r4 = r22
            r8 = r5
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r14.u(r15)
            r1 = r15
        L_0x0170:
            nI.p r1 = (nI.p) r1
            r14.P()
            int r0 = m0.C5530a.f25673m
            U0.P.g(r8, r1, r14, r0)
            goto L_0x017d
        L_0x017b:
            r11 = r3
            r8 = r5
        L_0x017d:
            r14.P()
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.y(r0, r11)
            androidx.compose.foundation.layout.d r1 = androidx.compose.foundation.layout.C5073d.f18068a
            r2 = 8
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$b r4 = r3.g()
            androidx.compose.foundation.layout.d$e r1 = r1.o(r2, r4)
            i1.c$c r2 = r3.l()
            r3 = 6
            E1.I r1 = androidx.compose.foundation.layout.G.b(r1, r2, r14, r3)
            r2 = 0
            int r3 = U0.C4883j.a(r14, r2)
            U0.y r2 = r14.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r14, r12)
            G1.g$a r5 = G1.C4504g.f6515W
            nI.a r11 = r5.a()
            U0.f r15 = r14.m()
            if (r15 != 0) goto L_0x01be
            U0.C4883j.c()
        L_0x01be:
            r14.I()
            boolean r15 = r14.i()
            if (r15 == 0) goto L_0x01cb
            r14.p(r11)
            goto L_0x01ce
        L_0x01cb:
            r14.t()
        L_0x01ce:
            U0.m r11 = U0.F1.a(r14)
            nI.p r15 = r5.c()
            U0.F1.c(r11, r1, r15)
            nI.p r1 = r5.e()
            U0.F1.c(r11, r2, r1)
            nI.p r1 = r5.b()
            boolean r2 = r11.i()
            if (r2 != 0) goto L_0x01f8
            java.lang.Object r2 = r11.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r15)
            if (r2 != 0) goto L_0x0206
        L_0x01f8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r11.u(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r11.w(r2, r1)
        L_0x0206:
            nI.p r1 = r5.d()
            U0.F1.c(r11, r4, r1)
            s0.N r1 = s0.C5843N.f28726a
            int r1 = r7.indexOf(r6)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 54
            if (r13 == 0) goto L_0x025c
            r4 = -1764328602(0xffffffff96d67b66, float:-3.465144E-25)
            r14.W(r4)
            java.util.Iterator r4 = r19.iterator()
            r5 = 0
        L_0x0224:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0258
            java.lang.Object r8 = r4.next()
            r11 = 1
            int r15 = r5 + 1
            if (r5 >= 0) goto L_0x0236
            YH.C16877v.x()
        L_0x0236:
            Gh.b r8 = (Gh.b) r8
            if (r5 != r1) goto L_0x0248
            r5 = 1306770667(0x4de3bceb, float:4.7760112E8)
            r14.W(r5)
            r5 = 0
            e(r2, r0, r14, r3, r5)
            r14.P()
            goto L_0x0256
        L_0x0248:
            r5 = 0
            r8 = 1306871851(0x4de5482b, float:4.80839008E8)
            r14.W(r8)
            r8 = 0
            e(r8, r0, r14, r3, r5)
            r14.P()
        L_0x0256:
            r5 = r15
            goto L_0x0224
        L_0x0258:
            r14.P()
            goto L_0x02c0
        L_0x025c:
            r4 = -1763994484(0xffffffff96db948c, float:-3.5475104E-25)
            r14.W(r4)
            java.util.Iterator r4 = r19.iterator()
            r5 = 0
        L_0x0267:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x02bd
            java.lang.Object r11 = r4.next()
            r13 = 1
            int r15 = r5 + 1
            if (r5 >= 0) goto L_0x0279
            YH.C16877v.x()
        L_0x0279:
            Gh.b r11 = (Gh.b) r11
            if (r5 >= r1) goto L_0x028e
            r5 = 1307097035(0x4de8b7cb, float:4.88044896E8)
            r14.W(r5)
            r11 = 0
            e(r2, r0, r14, r3, r11)
            r14.P()
            r2 = 48
        L_0x028c:
            r5 = 0
            goto L_0x02b9
        L_0x028e:
            r11 = 0
            if (r5 != r1) goto L_0x02aa
            r5 = 1307234520(0x4dead0d8, float:4.92444416E8)
            r14.W(r5)
            java.lang.Object r5 = r8.m()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            r2 = 48
            e(r5, r0, r14, r2, r11)
            r14.P()
            goto L_0x028c
        L_0x02aa:
            r2 = 48
            r5 = 1307415467(0x4ded93ab, float:4.9823472E8)
            r14.W(r5)
            r5 = 0
            e(r5, r0, r14, r3, r11)
            r14.P()
        L_0x02b9:
            r5 = r15
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0267
        L_0x02bd:
            r14.P()
        L_0x02c0:
            r14.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00b3
            U0.C4895p.R()
            goto L_0x00b3
        L_0x02ce:
            U0.Y0 r8 = r14.n()
            if (r8 == 0) goto L_0x02e9
            Eh.x r11 = new Eh.x
            r0 = r11
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r11)
        L_0x02e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Eh.B.i(Gh.b, KJ.c, boolean, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N j(b bVar, C15987c cVar, boolean z10, d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        i(bVar, cVar, z10, dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final boolean k(Context context) {
        float f10;
        try {
            f10 = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale");
        } catch (Settings.SettingNotFoundException unused) {
            f10 = 1.0f;
        }
        return f10 == 0.0f;
    }
}
