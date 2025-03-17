package ki;

import IC.C13023e;
import Kf.C9133b;
import N1.P;
import O0.J0;
import O0.L0;
import QJ.Q;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.y;
import Y1.f;
import Y1.j;
import Y1.k;
import androidx.compose.ui.d;
import dI.C17164e;
import eI.C17187b;
import ji.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Loi/a;", "messageState", "Lkotlin/Function1;", "Lji/c;", "LXH/N;", "screenUiEvent", "LO0/L0;", "snackbarHostState", "i", "(Loi/a;LnI/l;LO0/L0;LU0/m;I)V", "", "message", "Lkotlin/Function0;", "onSnackbarShown", "q", "(LO0/L0;Ljava/lang/String;LnI/a;LU0/m;I)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.l  reason: case insensitive filesystem */
public final class C9992l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ki.l$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C9133b.a f75167a;

        a(C9133b.a aVar) {
            this.f75167a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1884909434, i11, -1, "com.ingka.ikea.app.productinformationpage.v3.compose.MessageHandler.<anonymous> (MessageHandler.kt:63)");
                }
                C13607l.i(((C9133b.a.C1018a) this.f75167a).a(), C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, C13023e.f110931a | 48, 0, 262140);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v3.compose.MessageHandlerKt$ShowSnackbar$1$1", f = "MessageHandler.kt", l = {91}, m = "invokeSuspend")
    /* renamed from: ki.l$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f75168c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ L0 f75169d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f75170e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f75171f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(L0 l02, String str, C17631a<C16807N> aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f75169d = l02;
            this.f75170e = str;
            this.f75171f = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f75169d, this.f75170e, this.f75171f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f75168c;
            if (i10 == 0) {
                y.b(obj);
                L0 l02 = this.f75169d;
                String str = this.f75170e;
                J0 j02 = J0.Short;
                this.f75168c = 1;
                if (L0.f(l02, str, (String) null, false, j02, this, 6, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f75171f.invoke();
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(oi.a r10, nI.C17642l<? super ji.c, XH.C16807N> r11, O0.L0 r12, U0.C4889m r13, int r14) {
        /*
            java.lang.String r0 = "messageState"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "screenUiEvent"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "snackbarHostState"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = -990172512(0xffffffffc4fb2aa0, float:-2009.332)
            U0.m r13 = r13.k(r0)
            r1 = r14 & 6
            if (r1 != 0) goto L_0x002e
            r1 = r14 & 8
            if (r1 != 0) goto L_0x0023
            boolean r1 = r13.V(r10)
            goto L_0x0027
        L_0x0023:
            boolean r1 = r13.F(r10)
        L_0x0027:
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r14
            goto L_0x002f
        L_0x002e:
            r1 = r14
        L_0x002f:
            r2 = r14 & 48
            r3 = 32
            if (r2 != 0) goto L_0x0040
            boolean r2 = r13.F(r11)
            if (r2 == 0) goto L_0x003d
            r2 = r3
            goto L_0x003f
        L_0x003d:
            r2 = 16
        L_0x003f:
            r1 = r1 | r2
        L_0x0040:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0050
            boolean r2 = r13.V(r12)
            if (r2 == 0) goto L_0x004d
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x004f
        L_0x004d:
            r2 = 128(0x80, float:1.794E-43)
        L_0x004f:
            r1 = r1 | r2
        L_0x0050:
            r2 = r1 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r2 != r4) goto L_0x0062
            boolean r2 = r13.l()
            if (r2 != 0) goto L_0x005d
            goto L_0x0062
        L_0x005d:
            r13.L()
            goto L_0x0240
        L_0x0062:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x006e
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.app.productinformationpage.v3.compose.MessageHandler (MessageHandler.kt:27)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x006e:
            oi.a$b r0 = oi.a.b.f75760a
            boolean r0 = kotlin.jvm.internal.C17542s.e(r10, r0)
            r2 = 196608(0x30000, float:2.75506E-40)
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x00fa
            r0 = 1138160077(0x43d6f1cd, float:429.88907)
            r13.W(r0)
            int r0 = Oo.b.f84812v3
            java.lang.String r0 = J1.j.b(r0, r13, r5)
            int r6 = Oo.b.f84616d5
            java.lang.String r6 = J1.j.b(r6, r13, r5)
            r7 = -101824871(0xfffffffff9ee4699, float:-1.5464982E35)
            r13.W(r7)
            r1 = r1 & 112(0x70, float:1.57E-43)
            if (r1 != r3) goto L_0x0098
            r7 = r4
            goto L_0x0099
        L_0x0098:
            r7 = r5
        L_0x0099:
            java.lang.Object r8 = r13.D()
            if (r7 != 0) goto L_0x00a7
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x00af
        L_0x00a7:
            ki.d r8 = new ki.d
            r8.<init>(r11)
            r13.u(r8)
        L_0x00af:
            nI.a r8 = (nI.C17631a) r8
            r13.P()
            SC.W1 r7 = new SC.W1
            r7.<init>(r6, r8)
            r6 = -101821511(0xfffffffff9ee53b9, float:-1.5468309E35)
            r13.W(r6)
            if (r1 != r3) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r4 = r5
        L_0x00c3:
            java.lang.Object r1 = r13.D()
            if (r4 != 0) goto L_0x00d1
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r1 != r3) goto L_0x00d9
        L_0x00d1:
            ki.e r1 = new ki.e
            r1.<init>(r11)
            r13.u(r1)
        L_0x00d9:
            r3 = r1
            nI.a r3 = (nI.C17631a) r3
            r13.P()
            ki.a r1 = ki.C9981a.f75133a
            nI.p r6 = r1.a()
            int r1 = SC.W1.f116045c
            int r1 = r1 << 3
            r8 = r1 | r2
            r9 = 24
            r4 = 0
            r5 = 0
            r1 = r0
            r2 = r7
            r7 = r13
            SC.Z1.d(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r13.P()
            goto L_0x0237
        L_0x00fa:
            boolean r0 = r10 instanceof oi.a.c
            if (r0 == 0) goto L_0x0149
            r0 = 1138659425(0x43de9061, float:445.12796)
            r13.W(r0)
            hk.g$a r0 = new hk.g$a
            r2 = r10
            oi.a$c r2 = (oi.a.c) r2
            java.lang.String r6 = r2.a()
            java.lang.String r7 = r2.c()
            java.lang.String r2 = r2.b()
            r0.<init>(r6, r7, r2)
            r2 = -101807015(0xfffffffff9ee8c59, float:-1.5482666E35)
            r13.W(r2)
            r1 = r1 & 112(0x70, float:1.57E-43)
            if (r1 != r3) goto L_0x0123
            goto L_0x0124
        L_0x0123:
            r4 = r5
        L_0x0124:
            java.lang.Object r1 = r13.D()
            if (r4 != 0) goto L_0x0132
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x013a
        L_0x0132:
            ki.f r1 = new ki.f
            r1.<init>(r11)
            r13.u(r1)
        L_0x013a:
            nI.a r1 = (nI.C17631a) r1
            r13.P()
            int r2 = hk.g.a.f98073e
            hk.f.e(r0, r1, r13, r2)
            r13.P()
            goto L_0x0237
        L_0x0149:
            boolean r0 = r10 instanceof oi.a.C1387a
            if (r0 == 0) goto L_0x025e
            r0 = 1139103965(0x43e558dd, float:458.69424)
            r13.W(r0)
            r0 = r10
            oi.a$a r0 = (oi.a.C1387a) r0
            Kf.b$a r0 = r0.a()
            boolean r6 = r0 instanceof Kf.C9133b.a.C1018a
            if (r6 == 0) goto L_0x01ed
            r6 = 1139206761(0x43e6ea69, float:461.83133)
            r13.W(r6)
            r6 = r0
            Kf.b$a$a r6 = (Kf.C9133b.a.C1018a) r6
            IC.e r7 = r6.c()
            int r8 = IC.C13023e.f110931a
            java.lang.String r7 = r7.a(r13, r8)
            int r6 = r6.b()
            java.lang.String r6 = J1.j.b(r6, r13, r5)
            r8 = -101790887(0xfffffffff9eecb59, float:-1.5498638E35)
            r13.W(r8)
            r1 = r1 & 112(0x70, float:1.57E-43)
            if (r1 != r3) goto L_0x0185
            r8 = r4
            goto L_0x0186
        L_0x0185:
            r8 = r5
        L_0x0186:
            java.lang.Object r9 = r13.D()
            if (r8 != 0) goto L_0x0194
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x019c
        L_0x0194:
            ki.g r9 = new ki.g
            r9.<init>(r11)
            r13.u(r9)
        L_0x019c:
            nI.a r9 = (nI.C17631a) r9
            r13.P()
            SC.W1 r8 = new SC.W1
            r8.<init>(r6, r9)
            r6 = -101787015(0xfffffffff9eeda79, float:-1.5502473E35)
            r13.W(r6)
            if (r1 != r3) goto L_0x01af
            r5 = r4
        L_0x01af:
            java.lang.Object r1 = r13.D()
            if (r5 != 0) goto L_0x01bd
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r1 != r3) goto L_0x01c5
        L_0x01bd:
            ki.h r1 = new ki.h
            r1.<init>(r11)
            r13.u(r1)
        L_0x01c5:
            r3 = r1
            nI.a r3 = (nI.C17631a) r3
            r13.P()
            ki.l$a r1 = new ki.l$a
            r1.<init>(r0)
            r0 = 54
            r5 = 1884909434(0x70596f7a, float:2.6917206E29)
            c1.a r6 = c1.c.e(r5, r4, r1, r13, r0)
            int r0 = SC.W1.f116045c
            int r0 = r0 << 3
            r0 = r0 | r2
            r9 = 24
            r4 = 0
            r5 = 0
            r1 = r7
            r2 = r8
            r7 = r13
            r8 = r0
            SC.Z1.d(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r13.P()
            goto L_0x0234
        L_0x01ed:
            boolean r2 = r0 instanceof Kf.C9133b.a.C1019b
            if (r2 == 0) goto L_0x024f
            r2 = 1139966199(0x43f280f7, float:485.00754)
            r13.W(r2)
            Kf.b$a$b r0 = (Kf.C9133b.a.C1019b) r0
            IC.e r0 = r0.a()
            int r2 = IC.C13023e.f110931a
            java.lang.String r0 = r0.a(r13, r2)
            r2 = -101768039(0xfffffffff9ef2499, float:-1.5521265E35)
            r13.W(r2)
            r2 = r1 & 112(0x70, float:1.57E-43)
            if (r2 != r3) goto L_0x020e
            goto L_0x020f
        L_0x020e:
            r4 = r5
        L_0x020f:
            java.lang.Object r2 = r13.D()
            if (r4 != 0) goto L_0x021d
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x0225
        L_0x021d:
            ki.i r2 = new ki.i
            r2.<init>(r11)
            r13.u(r2)
        L_0x0225:
            nI.a r2 = (nI.C17631a) r2
            r13.P()
            int r1 = r1 >> 6
            r1 = r1 & 14
            q(r12, r0, r2, r13, r1)
            r13.P()
        L_0x0234:
            r13.P()
        L_0x0237:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0240
            U0.C4895p.R()
        L_0x0240:
            U0.Y0 r13 = r13.n()
            if (r13 == 0) goto L_0x024e
            ki.j r0 = new ki.j
            r0.<init>(r10, r11, r12, r14)
            r13.a(r0)
        L_0x024e:
            return
        L_0x024f:
            r10 = -101801619(0xfffffffff9eea16d, float:-1.5488009E35)
            r13.W(r10)
            r13.P()
            XH.t r10 = new XH.t
            r10.<init>()
            throw r10
        L_0x025e:
            r10 = -101832820(0xfffffffff9ee278c, float:-1.5457109E35)
            r13.W(r10)
            r13.P()
            XH.t r10 = new XH.t
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.C9992l.i(oi.a, nI.l, O0.L0, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C17642l lVar) {
        lVar.invoke(c.f.f74851a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C17642l lVar) {
        lVar.invoke(c.f.f74851a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(oi.a aVar, C17642l lVar, L0 l02, int i10, C4889m mVar, int i11) {
        i(aVar, lVar, l02, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C17642l lVar) {
        lVar.invoke(c.f.f74851a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C17642l lVar) {
        lVar.invoke(c.f.f74851a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C17642l lVar) {
        lVar.invoke(c.f.f74851a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C17642l lVar) {
        lVar.invoke(c.f.f74851a);
        return C16807N.f139792a;
    }

    private static final void q(L0 l02, String str, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(1459905065);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(l02) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1459905065, i11, -1, "com.ingka.ikea.app.productinformationpage.v3.compose.ShowSnackbar (MessageHandler.kt:88)");
            }
            k10.W(1039408616);
            int i12 = i11 & 14;
            boolean z10 = false;
            boolean z11 = (i12 == 4) | ((i11 & 112) == 32);
            if ((i11 & 896) == 256) {
                z10 = true;
            }
            boolean z12 = z11 | z10;
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new b(l02, str, aVar, (C17164e<? super b>) null);
                k10.u(D10);
            }
            k10.P();
            U0.P.g(l02, (p) D10, k10, i12);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C9991k(l02, str, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N r(L0 l02, String str, C17631a aVar, int i10, C4889m mVar, int i11) {
        q(l02, str, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
