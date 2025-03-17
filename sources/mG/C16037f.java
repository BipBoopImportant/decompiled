package MG;

import QJ.C16297b0;
import QJ.Q;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import l0.e;
import nI.C17631a;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "", "shouldShow", "LMG/b;", "state", "Lkotlin/Function0;", "LXH/N;", "onFinishedHiding", "b", "(Landroidx/compose/ui/d;ZLMG/b;LnI/a;LU0/m;II)V", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: MG.f  reason: case insensitive filesystem */
public final class C16037f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: MG.f$a */
    static final class a implements q<e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f136246a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f136247b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f136248c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f136249d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f136250e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C16033b f136251f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.decorate.v2.internal.ui.status.StatusDialogKt$StatusDialog$1$1$3$1", f = "StatusDialog.kt", l = {150}, m = "invokeSuspend")
        /* renamed from: MG.f$a$a  reason: collision with other inner class name */
        static final class C3350a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            long f136252c;

            /* renamed from: d  reason: collision with root package name */
            int f136253d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C16033b f136254e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f136255f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3350a(C16033b bVar, C17631a<C16807N> aVar, C17164e<? super C3350a> eVar) {
                super(2, eVar);
                this.f136254e = bVar;
                this.f136255f = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C3350a(this.f136254e, this.f136255f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C3350a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f136253d;
                if (i10 == 0) {
                    y.b(obj);
                    long max = Math.max(this.f136254e.a(), 2000);
                    this.f136252c = max;
                    this.f136253d = 1;
                    if (C16297b0.b(max, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f136255f.invoke();
                return C16807N.f139792a;
            }
        }

        a(d dVar, String str, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, boolean z10, C16033b bVar) {
            this.f136246a = dVar;
            this.f136247b = str;
            this.f136248c = aVar;
            this.f136249d = aVar2;
            this.f136250e = z10;
            this.f136251f = bVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17631a aVar, C17631a aVar2) {
            aVar.invoke();
            aVar2.invoke();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17631a aVar) {
            aVar.invoke();
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(l0.e r34, U0.C4889m r35, int r36) {
            /*
                r33 = this;
                r0 = r33
                r1 = r35
                java.lang.String r2 = "$this$AnimatedVisibility"
                r3 = r34
                kotlin.jvm.internal.C17542s.j(r3, r2)
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x001c
                r2 = -1
                java.lang.String r3 = "com.sugarcube.decorate.v2.internal.ui.status.StatusDialog.<anonymous> (StatusDialog.kt:89)"
                r4 = 540255698(0x2033a5d2, float:1.5216755E-19)
                r5 = r36
                U0.C4895p.S(r4, r5, r2, r3)
            L_0x001c:
                androidx.compose.ui.d r2 = r0.f136246a
                androidx.compose.ui.d$a r14 = androidx.compose.ui.d.f18749a
                tK.v r9 = tK.C18030v.f147664a
                int r10 = tK.C18030v.f147665b
                tK.h r3 = r9.a(r1, r10)
                long r3 = r3.x0()
                r5 = 4
                float r15 = (float) r5
                float r5 = c2.h.B(r15)
                A0.f r5 = A0.g.e(r5)
                androidx.compose.ui.d r3 = androidx.compose.foundation.b.c(r14, r3, r5)
                r4 = 32
                float r4 = (float) r4
                float r4 = c2.h.B(r4)
                r5 = 24
                float r5 = (float) r5
                float r6 = c2.h.B(r5)
                r7 = 16
                float r7 = (float) r7
                float r7 = c2.h.B(r7)
                float r5 = c2.h.B(r5)
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.l(r3, r4, r6, r7, r5)
                r4 = 400(0x190, float:5.6E-43)
                float r4 = (float) r4
                float r4 = c2.h.B(r4)
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.y(r3, r4)
                androidx.compose.ui.d r2 = r2.s(r3)
                java.lang.String r13 = r0.f136247b
                nI.a<XH.N> r12 = r0.f136248c
                nI.a<XH.N> r11 = r0.f136249d
                boolean r8 = r0.f136250e
                MG.b r7 = r0.f136251f
                androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$e r3 = r3.f()
                i1.c$a r26 = i1.C5437c.f24302a
                i1.c$c r4 = r26.l()
                r6 = 0
                E1.I r3 = androidx.compose.foundation.layout.G.b(r3, r4, r1, r6)
                int r4 = U0.C4883j.a(r1, r6)
                U0.y r5 = r35.s()
                androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r1, r2)
                G1.g$a r16 = G1.C4504g.f6515W
                nI.a r6 = r16.a()
                U0.f r17 = r35.m()
                if (r17 != 0) goto L_0x009c
                U0.C4883j.c()
            L_0x009c:
                r35.I()
                boolean r17 = r35.i()
                if (r17 == 0) goto L_0x00a9
                r1.p(r6)
                goto L_0x00ac
            L_0x00a9:
                r35.t()
            L_0x00ac:
                U0.m r6 = U0.F1.a(r35)
                nI.p r0 = r16.c()
                U0.F1.c(r6, r3, r0)
                nI.p r0 = r16.e()
                U0.F1.c(r6, r5, r0)
                nI.p r0 = r16.b()
                boolean r3 = r6.i()
                if (r3 != 0) goto L_0x00d6
                java.lang.Object r3 = r6.D()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r5)
                if (r3 != 0) goto L_0x00e4
            L_0x00d6:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r6.u(r3)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r6.w(r3, r0)
            L_0x00e4:
                nI.p r0 = r16.d()
                U0.F1.c(r6, r2, r0)
                s0.N r0 = s0.C5843N.f28726a
                r2 = 2
                r16 = 0
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 0
                r3 = r0
                r4 = r14
                r27 = r7
                r7 = r2
                r28 = r8
                r8 = r16
                androidx.compose.ui.d r2 = s0.C5842M.e(r3, r4, r5, r6, r7, r8)
                i1.c$c r3 = r26.i()
                androidx.compose.ui.d r2 = r0.c(r2, r3)
                tK.w r3 = r9.b(r1, r10)
                tK.c r3 = r3.a()
                N1.Y r21 = r3.c()
                tK.h r3 = r9.a(r1, r10)
                long r3 = r3.F0()
                r24 = 0
                r25 = 65528(0xfff8, float:9.1824E-41)
                r5 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r16 = 0
                r29 = r11
                r10 = r16
                r16 = 0
                r30 = r12
                r12 = r16
                r22 = r13
                r13 = r16
                r16 = 0
                r31 = r14
                r32 = r15
                r14 = r16
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r23 = 0
                r1 = r22
                r22 = r35
                O0.d1.b(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                float r1 = c2.h.B(r32)
                r2 = r31
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.i(r2, r1)
                r3 = 6
                r14 = r35
                s0.C5844O.a(r1, r14, r3)
                r1 = r30
                if (r1 == 0) goto L_0x01b3
                r0 = 1584622613(0x5e736c15, float:4.38510443E18)
                r14.W(r0)
                r0 = -1472902341(0xffffffffa8354b3b, float:-1.0063831E-14)
                r14.W(r0)
                boolean r0 = r14.V(r1)
                r15 = r29
                boolean r2 = r14.V(r15)
                r0 = r0 | r2
                java.lang.Object r2 = r35.D()
                if (r0 != 0) goto L_0x018a
                U0.m$a r0 = U0.C4889m.f14007a
                java.lang.Object r0 = r0.a()
                if (r2 != r0) goto L_0x0192
            L_0x018a:
                MG.d r2 = new MG.d
                r2.<init>(r1, r15)
                r14.u(r2)
            L_0x0192:
                r1 = r2
                nI.a r1 = (nI.C17631a) r1
                r35.P()
                MG.a r0 = MG.C16032a.f136222a
                nI.q r10 = r0.a()
                r12 = 805306368(0x30000000, float:4.656613E-10)
                r13 = 510(0x1fe, float:7.15E-43)
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r11 = r35
                O0.C4744o.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r35.P()
                goto L_0x01fd
            L_0x01b3:
                r15 = r29
                r1 = 1585203026(0x5e7c4752, float:4.54464715E18)
                r14.W(r1)
                i1.c$c r1 = r26.i()
                androidx.compose.ui.d r2 = r0.c(r2, r1)
                r0 = -1472881261(0xffffffffa8359d93, float:-1.0081687E-14)
                r14.W(r0)
                boolean r0 = r14.V(r15)
                java.lang.Object r1 = r35.D()
                if (r0 != 0) goto L_0x01db
                U0.m$a r0 = U0.C4889m.f14007a
                java.lang.Object r0 = r0.a()
                if (r1 != r0) goto L_0x01e3
            L_0x01db:
                MG.e r1 = new MG.e
                r1.<init>(r15)
                r14.u(r1)
            L_0x01e3:
                nI.a r1 = (nI.C17631a) r1
                r35.P()
                MG.a r0 = MG.C16032a.f136222a
                nI.p r6 = r0.b()
                r8 = 196608(0x30000, float:2.75506E-40)
                r9 = 28
                r3 = 0
                r4 = 0
                r5 = 0
                r7 = r35
                O0.U.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r35.P()
            L_0x01fd:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r28)
                r1 = -1472865247(0xffffffffa835dc21, float:-1.0095251E-14)
                r14.W(r1)
                r1 = r27
                boolean r2 = r14.V(r1)
                boolean r3 = r14.V(r15)
                r2 = r2 | r3
                java.lang.Object r3 = r35.D()
                if (r2 != 0) goto L_0x0220
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L_0x0229
            L_0x0220:
                MG.f$a$a r3 = new MG.f$a$a
                r2 = 0
                r3.<init>(r1, r15, r2)
                r14.u(r3)
            L_0x0229:
                nI.p r3 = (nI.p) r3
                r35.P()
                r1 = 0
                U0.P.g(r0, r3, r14, r1)
                r35.x()
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x023e
                U0.C4895p.R()
            L_0x023e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: MG.C16037f.a.c(l0.e, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.ui.d r20, boolean r21, MG.C16033b r22, nI.C17631a<XH.C16807N> r23, U0.C4889m r24, int r25, int r26) {
        /*
            r7 = r22
            r8 = r23
            r9 = r25
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "onFinishedHiding"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            r0 = -1104095318(0xffffffffbe30d7aa, float:-0.1726977)
            r1 = r24
            U0.m r15 = r1.k(r0)
            r1 = r26 & 1
            if (r1 == 0) goto L_0x0023
            r2 = r9 | 6
            r3 = r2
            r2 = r20
            goto L_0x0037
        L_0x0023:
            r2 = r9 & 6
            if (r2 != 0) goto L_0x0034
            r2 = r20
            boolean r3 = r15.V(r2)
            if (r3 == 0) goto L_0x0031
            r3 = 4
            goto L_0x0032
        L_0x0031:
            r3 = 2
        L_0x0032:
            r3 = r3 | r9
            goto L_0x0037
        L_0x0034:
            r2 = r20
            r3 = r9
        L_0x0037:
            r4 = r26 & 2
            if (r4 == 0) goto L_0x0040
            r3 = r3 | 48
            r14 = r21
            goto L_0x0052
        L_0x0040:
            r4 = r9 & 48
            r14 = r21
            if (r4 != 0) goto L_0x0052
            boolean r4 = r15.b(r14)
            if (r4 == 0) goto L_0x004f
            r4 = 32
            goto L_0x0051
        L_0x004f:
            r4 = 16
        L_0x0051:
            r3 = r3 | r4
        L_0x0052:
            r4 = r26 & 4
            if (r4 == 0) goto L_0x0059
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0069
        L_0x0059:
            r4 = r9 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0069
            boolean r4 = r15.V(r7)
            if (r4 == 0) goto L_0x0066
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r3 = r3 | r4
        L_0x0069:
            r4 = r26 & 8
            if (r4 == 0) goto L_0x0070
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x0070:
            r4 = r9 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0080
            boolean r4 = r15.F(r8)
            if (r4 == 0) goto L_0x007d
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r3 = r3 | r4
        L_0x0080:
            r4 = r3 & 1171(0x493, float:1.641E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r4 != r5) goto L_0x0093
            boolean r4 = r15.l()
            if (r4 != 0) goto L_0x008d
            goto L_0x0093
        L_0x008d:
            r15.L()
            r1 = r15
            goto L_0x01af
        L_0x0093:
            if (r1 == 0) goto L_0x009a
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r19 = r1
            goto L_0x009c
        L_0x009a:
            r19 = r2
        L_0x009c:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00a8
            r1 = -1
            java.lang.String r2 = "com.sugarcube.decorate.v2.internal.ui.status.StatusDialog (StatusDialog.kt:56)"
            U0.C4895p.S(r0, r3, r1, r2)
        L_0x00a8:
            r0 = -1323136650(0xffffffffb1228976, float:-2.365224E-9)
            r15.W(r0)
            java.lang.Object r0 = r15.D()
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x00c4
            m0.d0 r0 = new m0.d0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r1)
            r15.u(r0)
        L_0x00c4:
            r13 = r0
            m0.d0 r13 = (m0.C5537d0) r13
            r15.P()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r21)
            r13.i(r0)
            boolean r0 = r7 instanceof MG.C16033b.c
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x00ed
            r0 = -1323128756(0xffffffffb122a84c, float:-2.3669768E-9)
            r15.W(r0)
            r0 = r7
            MG.b$c r0 = (MG.C16033b.c) r0
            int r0 = r0.b()
            java.lang.String r0 = J1.j.b(r0, r15, r1)
            r15.P()
        L_0x00eb:
            r3 = r0
            goto L_0x0146
        L_0x00ed:
            boolean r0 = r7 instanceof MG.C16033b.C3349b
            if (r0 == 0) goto L_0x0102
            r0 = -1323125421(0xffffffffb122b553, float:-2.3677174E-9)
            r15.W(r0)
            r15.P()
            r0 = r7
            MG.b$b r0 = (MG.C16033b.C3349b) r0
            java.lang.String r0 = r0.b()
            goto L_0x00eb
        L_0x0102:
            boolean r0 = r7 instanceof MG.C16033b.e
            if (r0 == 0) goto L_0x011b
            r0 = -1323122868(0xffffffffb122bf4c, float:-2.3682842E-9)
            r15.W(r0)
            r0 = r7
            MG.b$e r0 = (MG.C16033b.e) r0
            int r0 = r0.b()
            java.lang.String r0 = J1.j.b(r0, r15, r1)
            r15.P()
            goto L_0x00eb
        L_0x011b:
            boolean r0 = r7 instanceof MG.C16033b.d
            if (r0 == 0) goto L_0x01ca
            r0 = 1932945429(0x73366815, float:1.4451737E31)
            r15.W(r0)
            r0 = r7
            MG.b$d r0 = (MG.C16033b.d) r0
            java.lang.Integer r3 = r0.c()
            if (r3 != 0) goto L_0x0130
            r1 = r2
            goto L_0x0138
        L_0x0130:
            int r3 = r3.intValue()
            java.lang.String r1 = J1.j.b(r3, r15, r1)
        L_0x0138:
            if (r1 != 0) goto L_0x0142
            java.lang.String r1 = r0.b()
            if (r1 != 0) goto L_0x0142
            java.lang.String r1 = ""
        L_0x0142:
            r15.P()
            r3 = r1
        L_0x0146:
            boolean r0 = r7 instanceof MG.C16033b.e
            if (r0 == 0) goto L_0x0153
            r0 = r7
            MG.b$e r0 = (MG.C16033b.e) r0
            nI.a r0 = r0.c()
            r4 = r0
            goto L_0x0154
        L_0x0153:
            r4 = r2
        L_0x0154:
            r0 = 0
            r1 = 3
            androidx.compose.animation.i r12 = androidx.compose.animation.g.o(r2, r0, r1, r2)
            androidx.compose.animation.k r16 = androidx.compose.animation.g.q(r2, r0, r1, r2)
            MG.f$a r10 = new MG.f$a
            r0 = r10
            r1 = r19
            r2 = r3
            r3 = r4
            r4 = r23
            r5 = r21
            r6 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 54
            r1 = 540255698(0x2033a5d2, float:1.5216755E-19)
            r2 = 1
            c1.a r0 = c1.c.e(r1, r2, r10, r15, r0)
            r1 = 200064(0x30d80, float:2.8035E-40)
            int r2 = m0.C5537d0.f25738d
            r17 = r2 | r1
            r18 = 18
            r11 = 0
            r1 = 0
            r10 = r13
            r2 = r13
            r13 = r16
            r14 = r1
            r1 = r15
            r15 = r0
            r16 = r1
            l0.d.d(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r2.b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x01a4
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x01a4
            r23.invoke()
        L_0x01a4:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01ad
            U0.C4895p.R()
        L_0x01ad:
            r2 = r19
        L_0x01af:
            U0.Y0 r10 = r1.n()
            if (r10 == 0) goto L_0x01c9
            MG.c r11 = new MG.c
            r0 = r11
            r1 = r2
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r25
            r6 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.a(r11)
        L_0x01c9:
            return
        L_0x01ca:
            r1 = r15
            r0 = -1323130870(0xffffffffb122a00a, float:-2.3665074E-9)
            r1.W(r0)
            r1.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: MG.C16037f.b(androidx.compose.ui.d, boolean, MG.b, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(d dVar, boolean z10, C16033b bVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        b(dVar, z10, bVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
