package de;

import IC.C13023e;
import J1.j;
import O0.C4762x0;
import O0.H0;
import O0.J0;
import O0.L0;
import QJ.Q;
import SC.Y2;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.P;
import U0.Y0;
import XH.C16807N;
import XH.y;
import androidx.compose.foundation.layout.D;
import c1.C5264a;
import ce.C9454b;
import com.ingka.ikea.account.impl.modalsettings.deleteaccount.b;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import s0.C5834E;
import s0.C5848T;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lce/b;", "uiState", "Lkotlin/Function1;", "Lcom/ingka/ikea/account/impl/modalsettings/deleteaccount/b;", "LXH/N;", "onEvent", "i", "(Lce/b;LnI/l;LU0/m;I)V", "Landroidx/compose/ui/d;", "modifier", "e", "(Lce/b;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "", "l", "(LU0/m;I)Ljava/lang/String;", "account-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.account.impl.modalsettings.deleteaccount.compose.DeleteAccountScreenKt$DeleteAccountScreen$1$1", f = "DeleteAccountScreen.kt", l = {59}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f72404c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f72405d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ L0 f72406e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, L0 l02, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f72405d = str;
            this.f72406e = l02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f72405d, this.f72406e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f72404c;
            if (i10 == 0) {
                y.b(obj);
                String str = this.f72405d;
                if (str != null) {
                    L0 l02 = this.f72406e;
                    J0 j02 = J0.Indefinite;
                    this.f72404c = 1;
                    if (L0.f(l02, str, (String) null, false, j02, this, 6, (Object) null) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<com.ingka.ikea.account.impl.modalsettings.deleteaccount.b, C16807N> f72407a;

        b(C17642l<? super com.ingka.ikea.account.impl.modalsettings.deleteaccount.b, C16807N> lVar) {
            this.f72407a = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar) {
            lVar.invoke(b.C1204b.f69704a);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: nI.a} */
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
                goto L_0x006a
            L_0x0010:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x001f
                r1 = -1
                java.lang.String r2 = "com.ingka.ikea.account.impl.modalsettings.deleteaccount.compose.DeleteAccountScreen.<anonymous> (DeleteAccountScreen.kt:70)"
                r3 = -80288758(0xfffffffffb36e40a, float:-9.496232E35)
                U0.C4895p.S(r3, r14, r1, r2)
            L_0x001f:
                androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
                int r0 = Sd.f.f63370j
                r1 = 0
                java.lang.String r3 = J1.j.b(r0, r13, r1)
                ol.v r0 = ol.v.BACK
                r1 = 2074317317(0x7ba39205, float:1.698612E36)
                r13.W(r1)
                nI.l<com.ingka.ikea.account.impl.modalsettings.deleteaccount.b, XH.N> r1 = r12.f72407a
                boolean r1 = r13.V(r1)
                nI.l<com.ingka.ikea.account.impl.modalsettings.deleteaccount.b, XH.N> r4 = r12.f72407a
                java.lang.Object r5 = r13.D()
                if (r1 != 0) goto L_0x0046
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r5 != r1) goto L_0x004e
            L_0x0046:
                de.f r5 = new de.f
                r5.<init>(r4)
                r13.u(r5)
            L_0x004e:
                r1 = r5
                nI.a r1 = (nI.C17631a) r1
                r13.P()
                r10 = 390(0x186, float:5.47E-43)
                r11 = 496(0x1f0, float:6.95E-43)
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = r13
                ol.p.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x006a
                U0.C4895p.R()
            L_0x006a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: de.e.b.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f72408a;

        c(L0 l02) {
            this.f72408a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2019449672, i10, -1, "com.ingka.ikea.account.impl.modalsettings.deleteaccount.compose.DeleteAccountScreen.<anonymous> (DeleteAccountScreen.kt:67)");
                }
                Y2.c(this.f72408a, (androidx.compose.ui.d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C9454b f72409a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<com.ingka.ikea.account.impl.modalsettings.deleteaccount.b, C16807N> f72410b;

        d(C9454b bVar, C17642l<? super com.ingka.ikea.account.impl.modalsettings.deleteaccount.b, C16807N> lVar) {
            this.f72409a = bVar;
            this.f72410b = lVar;
        }

        public final void a(C5834E e10, C4889m mVar, int i10) {
            C17542s.j(e10, "contentPadding");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(e10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1767659745, i10, -1, "com.ingka.ikea.account.impl.modalsettings.deleteaccount.compose.DeleteAccountScreen.<anonymous> (DeleteAccountScreen.kt:78)");
                }
                e.e(this.f72409a, this.f72410b, D.h(androidx.compose.ui.d.f18749a, e10), mVar, 0, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: androidx.compose.ui.d$a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(ce.C9454b r44, nI.C17642l<? super com.ingka.ikea.account.impl.modalsettings.deleteaccount.b, XH.C16807N> r45, androidx.compose.ui.d r46, U0.C4889m r47, int r48, int r49) {
        /*
            r1 = r44
            r2 = r45
            r4 = r48
            r0 = 31460980(0x1e00e74, float:8.2305344E-38)
            r3 = r47
            U0.m r3 = r3.k(r0)
            r5 = r49 & 1
            if (r5 == 0) goto L_0x0016
            r5 = r4 | 6
            goto L_0x002f
        L_0x0016:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x002e
            r5 = r4 & 8
            if (r5 != 0) goto L_0x0023
            boolean r5 = r3.V(r1)
            goto L_0x0027
        L_0x0023:
            boolean r5 = r3.F(r1)
        L_0x0027:
            if (r5 == 0) goto L_0x002b
            r5 = 4
            goto L_0x002c
        L_0x002b:
            r5 = 2
        L_0x002c:
            r5 = r5 | r4
            goto L_0x002f
        L_0x002e:
            r5 = r4
        L_0x002f:
            r6 = r49 & 2
            r15 = 32
            if (r6 == 0) goto L_0x0038
            r5 = r5 | 48
            goto L_0x0047
        L_0x0038:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x0047
            boolean r6 = r3.F(r2)
            if (r6 == 0) goto L_0x0044
            r6 = r15
            goto L_0x0046
        L_0x0044:
            r6 = 16
        L_0x0046:
            r5 = r5 | r6
        L_0x0047:
            r6 = r49 & 4
            if (r6 == 0) goto L_0x0051
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r8 = r46
        L_0x004f:
            r14 = r5
            goto L_0x0064
        L_0x0051:
            r8 = r4 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004d
            r8 = r46
            boolean r9 = r3.V(r8)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r5 = r5 | r9
            goto L_0x004f
        L_0x0064:
            r5 = r14 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r5 != r9) goto L_0x0076
            boolean r5 = r3.l()
            if (r5 != 0) goto L_0x0071
            goto L_0x0076
        L_0x0071:
            r3.L()
            goto L_0x039d
        L_0x0076:
            if (r6 == 0) goto L_0x007c
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r13 = r5
            goto L_0x007d
        L_0x007c:
            r13 = r8
        L_0x007d:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0089
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.account.impl.modalsettings.deleteaccount.compose.DeleteAccountContent (DeleteAccountScreen.kt:91)"
            U0.C4895p.S(r0, r14, r5, r6)
        L_0x0089:
            r0 = 0
            r12 = 1
            r10 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.f(r13, r0, r12, r10)
            androidx.compose.foundation.layout.d r11 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r11.g()
            i1.c$a r31 = i1.C5437c.f24302a
            i1.c$b r8 = r31.k()
            r9 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r8, r3, r9)
            int r8 = U0.C4883j.a(r3, r9)
            U0.y r7 = r3.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r3, r5)
            G1.g$a r32 = G1.C4504g.f6515W
            nI.a r9 = r32.a()
            U0.f r16 = r3.m()
            if (r16 != 0) goto L_0x00bc
            U0.C4883j.c()
        L_0x00bc:
            r3.I()
            boolean r16 = r3.i()
            if (r16 == 0) goto L_0x00c9
            r3.p(r9)
            goto L_0x00cc
        L_0x00c9:
            r3.t()
        L_0x00cc:
            U0.m r9 = U0.F1.a(r3)
            nI.p r0 = r32.c()
            U0.F1.c(r9, r6, r0)
            nI.p r0 = r32.e()
            U0.F1.c(r9, r7, r0)
            nI.p r0 = r32.b()
            boolean r6 = r9.i()
            if (r6 != 0) goto L_0x00f6
            java.lang.Object r6 = r9.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r7)
            if (r6 != 0) goto L_0x0104
        L_0x00f6:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r9.u(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r9.w(r6, r0)
        L_0x0104:
            nI.p r0 = r32.d()
            U0.F1.c(r9, r5, r0)
            s0.h r16 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            float r5 = (float) r15
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r0, r5)
            r8 = 6
            s0.C5844O.a(r5, r3, r8)
            androidx.compose.ui.d r5 = TC.e.i(r0)
            r6 = 0
            androidx.compose.ui.d r17 = androidx.compose.foundation.layout.J.h(r5, r6, r12, r10)
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            androidx.compose.ui.d r22 = s0.C5861g.c(r16, r17, r18, r19, r20, r21)
            r5 = 0
            androidx.compose.foundation.o r23 = androidx.compose.foundation.m.c(r5, r3, r5, r12)
            r27 = 14
            r28 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.m.f(r22, r23, r24, r25, r26, r27, r28)
            r6 = 16
            float r9 = (float) r6
            float r6 = c2.h.B(r9)
            androidx.compose.foundation.layout.d$f r6 = r11.n(r6)
            i1.c$b r7 = r31.k()
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r3, r8)
            r7 = 0
            int r16 = U0.C4883j.a(r3, r7)
            U0.y r7 = r3.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r3, r5)
            nI.a r8 = r32.a()
            U0.f r17 = r3.m()
            if (r17 != 0) goto L_0x0171
            U0.C4883j.c()
        L_0x0171:
            r3.I()
            boolean r17 = r3.i()
            if (r17 == 0) goto L_0x017e
            r3.p(r8)
            goto L_0x0181
        L_0x017e:
            r3.t()
        L_0x0181:
            U0.m r8 = U0.F1.a(r3)
            nI.p r10 = r32.c()
            U0.F1.c(r8, r6, r10)
            nI.p r6 = r32.e()
            U0.F1.c(r8, r7, r6)
            nI.p r6 = r32.b()
            boolean r7 = r8.i()
            if (r7 != 0) goto L_0x01ab
            java.lang.Object r7 = r8.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x01b9
        L_0x01ab:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)
            r8.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)
            r8.w(r7, r6)
        L_0x01b9:
            nI.p r6 = r32.d()
            U0.F1.c(r8, r5, r6)
            java.lang.String r5 = r44.b()
            TC.b$b$a r6 = TC.C13679b.C2857b.a.f116683a
            java.lang.String r7 = "DeleteAccountScreenTestTag-Title"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r0, r7)
            r8 = 0
            r29 = 0
            r30 = 262136(0x3fff8, float:3.67331E-40)
            r18 = 0
            r10 = r8
            r33 = r9
            r8 = r18
            r34 = r11
            r10 = r18
            r16 = 0
            r12 = r16
            r35 = r13
            r13 = r16
            r36 = r14
            r14 = r16
            r16 = 0
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
            r28 = 432(0x1b0, float:6.05E-43)
            r27 = r3
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            int r5 = Sd.f.f63366f
            r15 = 0
            java.lang.String r5 = J1.j.b(r5, r3, r15)
            TC.b$a$b r6 = TC.C13679b.a.C2856b.f116680a
            java.lang.String r7 = "DeleteAccountScreenTestTag-Body"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r0, r7)
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r15 = r16
            r17 = 0
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r3.x()
            androidx.compose.ui.d r37 = TC.e.i(r0)
            float r39 = c2.h.B(r33)
            r5 = 40
            float r5 = (float) r5
            float r41 = c2.h.B(r5)
            r42 = 5
            r43 = 0
            r38 = 0
            r40 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.m(r37, r38, r39, r40, r41, r42, r43)
            float r6 = c2.h.B(r33)
            r7 = r34
            androidx.compose.foundation.layout.d$f r6 = r7.n(r6)
            i1.c$b r7 = r31.k()
            r8 = 6
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r3, r8)
            r15 = 0
            int r7 = U0.C4883j.a(r3, r15)
            U0.y r8 = r3.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r3, r5)
            nI.a r9 = r32.a()
            U0.f r10 = r3.m()
            if (r10 != 0) goto L_0x0270
            U0.C4883j.c()
        L_0x0270:
            r3.I()
            boolean r10 = r3.i()
            if (r10 == 0) goto L_0x027d
            r3.p(r9)
            goto L_0x0280
        L_0x027d:
            r3.t()
        L_0x0280:
            U0.m r9 = U0.F1.a(r3)
            nI.p r10 = r32.c()
            U0.F1.c(r9, r6, r10)
            nI.p r6 = r32.e()
            U0.F1.c(r9, r8, r6)
            nI.p r6 = r32.b()
            boolean r8 = r9.i()
            if (r8 != 0) goto L_0x02aa
            java.lang.Object r8 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
            if (r8 != 0) goto L_0x02b8
        L_0x02aa:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.w(r7, r6)
        L_0x02b8:
            nI.p r6 = r32.d()
            U0.F1.c(r9, r5, r6)
            r5 = 1201307422(0x479a7f1e, float:79102.234)
            r3.W(r5)
            boolean r5 = r44.e()
            if (r5 == 0) goto L_0x032f
            java.lang.String r5 = l(r3, r15)
            SC.N r8 = SC.N.Secondary
            int r6 = uK.C18146a.f147996C6
            r7 = 0
            r13 = 0
            r14 = 1
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.h(r0, r7, r14, r13)
            java.lang.String r7 = "DeleteAccountScreenTestTag-CustomerServiceButton"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r9, r7)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r6 = 1201321060(0x479ab464, float:79208.78)
            r3.W(r6)
            r6 = r36 & 112(0x70, float:1.57E-43)
            r12 = 32
            if (r6 != r12) goto L_0x02f2
            r6 = r14
            goto L_0x02f3
        L_0x02f2:
            r6 = r15
        L_0x02f3:
            java.lang.Object r9 = r3.D()
            if (r6 != 0) goto L_0x0301
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r9 != r6) goto L_0x0309
        L_0x0301:
            de.b r9 = new de.b
            r9.<init>(r2)
            r3.u(r9)
        L_0x0309:
            r16 = r9
            nI.a r16 = (nI.C17631a) r16
            r3.P()
            r17 = 3120(0xc30, float:4.372E-42)
            r18 = 436(0x1b4, float:6.11E-43)
            r9 = 0
            r10 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r6 = r7
            r7 = r9
            r9 = r10
            r10 = r19
            r12 = r20
            r13 = r21
            r14 = r16
            r15 = r3
            r16 = r17
            r17 = r18
            SC.L.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x032f:
            r3.P()
            int r5 = Sd.f.f63371k
            r6 = 0
            java.lang.String r5 = J1.j.b(r5, r3, r6)
            boolean r10 = r44.g()
            boolean r7 = r44.f()
            SC.N r8 = SC.N.Danger
            int r9 = uK.C18146a.f147996C6
            r11 = 0
            r12 = 1
            r13 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r0, r11, r12, r13)
            java.lang.String r11 = "DeleteAccountScreenTestTag-DeleteAccountButton"
            androidx.compose.ui.d r0 = androidx.compose.ui.platform.C5116k1.a(r0, r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r9 = 1201338562(0x479af8c2, float:79345.516)
            r3.W(r9)
            r9 = r36 & 112(0x70, float:1.57E-43)
            r13 = 32
            if (r9 != r13) goto L_0x0363
            goto L_0x0364
        L_0x0363:
            r12 = r6
        L_0x0364:
            java.lang.Object r6 = r3.D()
            if (r12 != 0) goto L_0x0372
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r6 != r9) goto L_0x037a
        L_0x0372:
            de.c r6 = new de.c
            r6.<init>(r2)
            r3.u(r6)
        L_0x037a:
            r14 = r6
            nI.a r14 = (nI.C17631a) r14
            r3.P()
            r16 = 3120(0xc30, float:4.372E-42)
            r17 = 400(0x190, float:5.6E-43)
            r9 = 0
            r12 = 0
            r13 = 0
            r6 = r0
            r15 = r3
            SC.L.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3.x()
            r3.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x039b
            U0.C4895p.R()
        L_0x039b:
            r8 = r35
        L_0x039d:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x03b5
            de.d r7 = new de.d
            r0 = r7
            r1 = r44
            r2 = r45
            r3 = r8
            r4 = r48
            r5 = r49
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x03b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.e.e(ce.b, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C9454b bVar, C17642l lVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(bVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C17642l lVar) {
        lVar.invoke(b.c.f69705a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17642l lVar) {
        lVar.invoke(b.d.f69706a);
        return C16807N.f139792a;
    }

    public static final void i(C9454b bVar, C17642l<? super com.ingka.ikea.account.impl.modalsettings.deleteaccount.b, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C9454b bVar2 = bVar;
        C17642l<? super com.ingka.ikea.account.impl.modalsettings.deleteaccount.b, C16807N> lVar2 = lVar;
        int i12 = i10;
        C17542s.j(bVar2, "uiState");
        C17542s.j(lVar2, "onEvent");
        C4889m k10 = mVar.k(-768976306);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(bVar2) : k10.F(bVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-768976306, i11, -1, "com.ingka.ikea.account.impl.modalsettings.deleteaccount.compose.DeleteAccountScreen (DeleteAccountScreen.kt:52)");
            }
            k10.W(-1179563672);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = new L0();
                k10.u(D10);
            }
            L0 l02 = (L0) D10;
            k10.P();
            C13023e c10 = bVar.c();
            k10.W(-1179561486);
            String a10 = c10 == null ? null : c10.a(k10, C13023e.f110931a);
            k10.P();
            k10.W(-1179560051);
            boolean V10 = k10.V(a10);
            Object D11 = k10.D();
            if (V10 || D11 == aVar.a()) {
                D11 = new a(a10, l02, (C17164e<? super a>) null);
                k10.u(D11);
            }
            k10.P();
            P.g(a10, (p) D11, k10, 0);
            C5264a e10 = c1.c.e(-80288758, true, new b(lVar2), k10, 54);
            C5264a e11 = c1.c.e(2019449672, true, new c(l02), k10, 54);
            mVar2 = k10;
            C4762x0.a((androidx.compose.ui.d) null, e10, (p<? super C4889m, ? super Integer, C16807N>) null, e11, (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, (C5848T) null, c1.c.e(-1767659745, true, new d(bVar2, lVar2), k10, 54), mVar2, 805309488, 501);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C9620a(bVar2, lVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C9454b bVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        i(bVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final String l(C4889m mVar, int i10) {
        mVar.W(460857498);
        if (C4895p.J()) {
            C4895p.S(460857498, i10, -1, "com.ingka.ikea.account.impl.modalsettings.deleteaccount.compose.getCustomerServiceLabel (DeleteAccountScreen.kt:152)");
        }
        String obj = G2.b.a(j.b(Sd.f.f63369i, mVar, 0), 0).toString();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return obj;
    }
}
