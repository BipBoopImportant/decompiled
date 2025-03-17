package om;

import J1.j;
import O0.C4762x0;
import O0.H0;
import O0.J0;
import O0.L0;
import O0.N0;
import O0.e1;
import O0.g1;
import QJ.F0;
import QJ.Q;
import QJ.T;
import SC.Y2;
import U0.A1;
import U0.B;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.recyclerview.widget.RecyclerView;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import lm.C11550a;
import mf.C10040b;
import mm.C11580b;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import ol.u;
import ol.v;
import s0.C5834E;
import s0.C5842M;
import s0.C5848T;
import uI.C18059h;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001aA\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aO\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u0012\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u0002"}, d2 = {"Lmm/b;", "viewModel", "Lkotlin/Function0;", "LXH/N;", "onCloseClicked", "requestPermission", "openSettings", "l", "(Lmm/b;LnI/a;LnI/a;LnI/a;LU0/m;I)V", "Lmm/b$a;", "uiState", "onGetNotified", "i", "(Lmm/b$a;LnI/a;LnI/a;LnI/a;LnI/a;LU0/m;I)V", "Lkotlin/Function1;", "onClickGetNotified", "Landroidx/compose/ui/d;", "modifier", "f", "(LnI/a;Lmm/b$a;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "Llm/a$c;", "", "q", "(Llm/a$c;LU0/m;I)Ljava/lang/String;", "", "p", "(Llm/a$c;)I", "backinstock-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f100614a;

        a(C17631a<C16807N> aVar) {
            this.f100614a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1788456849, i11, -1, "com.ingka.ikea.backinstock.notification.compose.BackInStockExplanationScaffold.<anonymous> (BackInStockExplanationScreen.kt:117)");
                }
                ol.p.c(v.CLOSE, this.f100614a, (androidx.compose.ui.d) null, "", (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, mVar, 3078, 500);
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
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f100615a;

        b(L0 l02) {
            this.f100615a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2019436721, i10, -1, "com.ingka.ikea.backinstock.notification.compose.BackInStockExplanationScaffold.<anonymous> (BackInStockExplanationScreen.kt:112)");
                }
                Y2.c(this.f100615a, (androidx.compose.ui.d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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
    static final class c implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f100616a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C11580b.a f100617b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<C11580b.a, C16807N> f100618c;

        c(C17631a<C16807N> aVar, C11580b.a aVar2, C17642l<? super C11580b.a, C16807N> lVar) {
            this.f100616a = aVar;
            this.f100617b = aVar2;
            this.f100618c = lVar;
        }

        public final void a(C5834E e10, C4889m mVar, int i10) {
            C17542s.j(e10, "it");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(e10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1260556954, i10, -1, "com.ingka.ikea.backinstock.notification.compose.BackInStockExplanationScaffold.<anonymous> (BackInStockExplanationScreen.kt:124)");
                }
                f.f(this.f100616a, this.f100617b, this.f100618c, D.h(J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), e10), mVar, 0, 0);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.backinstock.notification.compose.BackInStockExplanationScreenKt$BackInStockExplanationScaffold$onClickGetNotified$1$1$1", f = "BackInStockExplanationScreen.kt", l = {100}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100619c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ L0 f100620d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f100621e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f100622f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f100623g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(L0 l02, String str, String str2, C17631a<C16807N> aVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f100620d = l02;
            this.f100621e = str;
            this.f100622f = str2;
            this.f100623g = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f100620d, this.f100621e, this.f100622f, this.f100623g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f100619c;
            if (i10 == 0) {
                y.b(obj);
                L0 l02 = this.f100620d;
                String str = this.f100621e;
                String str2 = this.f100622f;
                this.f100619c = 1;
                obj = L0.f(l02, str, str2, false, (J0) null, this, 12, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((N0) obj) == N0.ActionPerformed) {
                this.f100623g.invoke();
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends C17540p implements C17631a<C16807N> {
        e(Object obj) {
            super(0, obj, C11580b.class, "setExplanationAcknowledged", "setExplanationAcknowledged()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((C11580b) this.receiver).F();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: androidx.compose.ui.d$a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(nI.C17631a<XH.C16807N> r40, mm.C11580b.a r41, nI.C17642l<? super mm.C11580b.a, XH.C16807N> r42, androidx.compose.ui.d r43, U0.C4889m r44, int r45, int r46) {
        /*
            r2 = r41
            r3 = r42
            r5 = r45
            r0 = 364620406(0x15bbaa76, float:7.579764E-26)
            r1 = r44
            U0.m r1 = r1.k(r0)
            r4 = r46 & 1
            r6 = 2
            if (r4 == 0) goto L_0x001a
            r4 = r5 | 6
            r7 = r4
            r4 = r40
            goto L_0x002e
        L_0x001a:
            r4 = r5 & 6
            if (r4 != 0) goto L_0x002b
            r4 = r40
            boolean r7 = r1.F(r4)
            if (r7 == 0) goto L_0x0028
            r7 = 4
            goto L_0x0029
        L_0x0028:
            r7 = r6
        L_0x0029:
            r7 = r7 | r5
            goto L_0x002e
        L_0x002b:
            r4 = r40
            r7 = r5
        L_0x002e:
            r8 = r46 & 2
            if (r8 == 0) goto L_0x0035
            r7 = r7 | 48
            goto L_0x0045
        L_0x0035:
            r8 = r5 & 48
            if (r8 != 0) goto L_0x0045
            boolean r8 = r1.F(r2)
            if (r8 == 0) goto L_0x0042
            r8 = 32
            goto L_0x0044
        L_0x0042:
            r8 = 16
        L_0x0044:
            r7 = r7 | r8
        L_0x0045:
            r8 = r46 & 4
            if (r8 == 0) goto L_0x004c
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x004c:
            r8 = r5 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x005c
            boolean r8 = r1.F(r3)
            if (r8 == 0) goto L_0x0059
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r7 = r7 | r8
        L_0x005c:
            r8 = r46 & 8
            if (r8 == 0) goto L_0x0066
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r10 = r43
        L_0x0064:
            r13 = r7
            goto L_0x0079
        L_0x0066:
            r10 = r5 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0062
            r10 = r43
            boolean r11 = r1.V(r10)
            if (r11 == 0) goto L_0x0075
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r7 = r7 | r11
            goto L_0x0064
        L_0x0079:
            r7 = r13 & 1171(0x493, float:1.641E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r7 != r11) goto L_0x008c
            boolean r7 = r1.l()
            if (r7 != 0) goto L_0x0086
            goto L_0x008c
        L_0x0086:
            r1.L()
            r4 = r10
            goto L_0x0450
        L_0x008c:
            if (r8 == 0) goto L_0x0092
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r11 = r7
            goto L_0x0093
        L_0x0092:
            r11 = r10
        L_0x0093:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x009f
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.backinstock.notification.compose.BackInStockExplanationContent (BackInStockExplanationScreen.kt:141)"
            U0.C4895p.S(r0, r13, r7, r8)
        L_0x009f:
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r7 = r0.g()
            i1.c$a r32 = i1.C5437c.f24302a
            i1.c$b r8 = r32.k()
            r12 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r7, r8, r1, r12)
            int r8 = U0.C4883j.a(r1, r12)
            U0.y r10 = r1.s()
            androidx.compose.ui.d r14 = androidx.compose.ui.c.e(r1, r11)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r15 = r16.a()
            U0.f r18 = r1.m()
            if (r18 != 0) goto L_0x00cb
            U0.C4883j.c()
        L_0x00cb:
            r1.I()
            boolean r18 = r1.i()
            if (r18 == 0) goto L_0x00d8
            r1.p(r15)
            goto L_0x00db
        L_0x00d8:
            r1.t()
        L_0x00db:
            U0.m r15 = U0.F1.a(r1)
            nI.p r9 = r16.c()
            U0.F1.c(r15, r7, r9)
            nI.p r7 = r16.e()
            U0.F1.c(r15, r10, r7)
            nI.p r7 = r16.b()
            boolean r9 = r15.i()
            if (r9 != 0) goto L_0x0105
            java.lang.Object r9 = r15.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r10)
            if (r9 != 0) goto L_0x0113
        L_0x0105:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r15.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r15.w(r8, r7)
        L_0x0113:
            nI.p r7 = r16.d()
            U0.F1.c(r15, r14, r7)
            s0.h r33 = s0.C5862h.f28810a
            r7 = 447923618(0x1ab2c5a2, float:7.393837E-23)
            r1.W(r7)
            lm.a$c r15 = r41.a()
            r14 = 0
            r9 = 1
            if (r15 != 0) goto L_0x01e5
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = "FulfilmentOption must not be null"
            r0.<init>(r7)
            qv.e r7 = qv.e.ERROR
            qv.d r8 = qv.d.f102012a
            java.util.List r8 = r8.a()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0144:
            boolean r12 = r8.hasNext()
            r13 = 0
            if (r12 == 0) goto L_0x015c
            java.lang.Object r12 = r8.next()
            r15 = r12
            qv.b r15 = (qv.C11819b) r15
            boolean r13 = r15.b(r7, r13)
            if (r13 == 0) goto L_0x0144
            r10.add(r12)
            goto L_0x0144
        L_0x015c:
            java.util.Iterator r8 = r10.iterator()
            r10 = r14
            r12 = r10
        L_0x0162:
            boolean r15 = r8.hasNext()
            if (r15 == 0) goto L_0x01db
            java.lang.Object r15 = r8.next()
            r19 = r15
            qv.b r19 = (qv.C11819b) r19
            if (r10 != 0) goto L_0x017d
            java.lang.String r10 = qv.C11818a.a(r14, r0)
            if (r10 != 0) goto L_0x0179
            goto L_0x01db
        L_0x0179:
            java.lang.String r10 = qv.C11820c.a(r10)
        L_0x017d:
            if (r12 != 0) goto L_0x01cc
            java.lang.Class r12 = r33.getClass()
            java.lang.String r12 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            r15 = 36
            java.lang.String r15 = HJ.C15854t.s1(r12, r15, r14, r6, r14)
            r13 = 46
            java.lang.String r13 = HJ.C15854t.o1(r15, r13, r14, r6, r14)
            int r15 = r13.length()
            if (r15 != 0) goto L_0x019d
            goto L_0x01a3
        L_0x019d:
            java.lang.String r12 = "Kt"
            java.lang.String r12 = HJ.C15854t.P0(r13, r12)
        L_0x01a3:
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            java.lang.String r13 = r13.getName()
            java.lang.String r15 = "main"
            boolean r13 = HJ.C15854t.b0(r13, r15, r9)
            if (r13 == 0) goto L_0x01b6
            java.lang.String r13 = "m"
            goto L_0x01b8
        L_0x01b6:
            java.lang.String r13 = "b"
        L_0x01b8:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r13)
            java.lang.String r13 = "|"
            r15.append(r13)
            r15.append(r12)
            java.lang.String r12 = r15.toString()
        L_0x01cc:
            r20 = r7
            r21 = r12
            r13 = 0
            r22 = r13
            r23 = r0
            r24 = r10
            r19.a(r20, r21, r22, r23, r24)
            goto L_0x0162
        L_0x01db:
            r40.invoke()
            r1.P()
            r36 = r11
            goto L_0x0442
        L_0x01e5:
            androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
            r7 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.f(r10, r7, r9, r14)
            androidx.compose.ui.d r19 = TC.e.i(r6)
            androidx.compose.foundation.o r20 = androidx.compose.foundation.m.c(r12, r1, r12, r9)
            r24 = 14
            r25 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.m.f(r19, r20, r21, r22, r23, r24, r25)
            androidx.compose.foundation.layout.d$m r0 = r0.g()
            i1.c$b r8 = r32.k()
            E1.I r0 = androidx.compose.foundation.layout.C5080k.a(r0, r8, r1, r12)
            int r8 = U0.C4883j.a(r1, r12)
            U0.y r7 = r1.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r1, r6)
            nI.a r9 = r16.a()
            U0.f r20 = r1.m()
            if (r20 != 0) goto L_0x0227
            U0.C4883j.c()
        L_0x0227:
            r1.I()
            boolean r20 = r1.i()
            if (r20 == 0) goto L_0x0234
            r1.p(r9)
            goto L_0x0237
        L_0x0234:
            r1.t()
        L_0x0237:
            U0.m r9 = U0.F1.a(r1)
            nI.p r14 = r16.c()
            U0.F1.c(r9, r0, r14)
            nI.p r0 = r16.e()
            U0.F1.c(r9, r7, r0)
            nI.p r0 = r16.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x0261
            java.lang.Object r7 = r9.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r14)
            if (r7 != 0) goto L_0x026f
        L_0x0261:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r9.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r9.w(r7, r0)
        L_0x026f:
            nI.p r0 = r16.d()
            U0.F1.c(r9, r6, r0)
            r0 = 16
            float r0 = (float) r0
            float r24 = c2.h.B(r0)
            r27 = 13
            r28 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r22 = r10
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.m(r22, r23, r24, r25, r26, r27, r28)
            java.lang.String r6 = q(r15, r1, r12)
            TC.b$b$a r7 = TC.C13679b.C2857b.a.f116683a
            r14 = 0
            r30 = 0
            r31 = 262136(0x3fff8, float:3.67331E-40)
            r21 = 0
            r35 = r10
            r9 = r21
            r18 = 0
            r36 = r11
            r11 = r18
            r16 = 0
            r37 = r13
            r13 = r16
            r14 = r16
            r38 = r15
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 432(0x1b0, float:6.05E-43)
            r28 = r1
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r13 = r35
            r12 = 0
            r14 = 1
            r15 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.h(r13, r12, r14, r15)
            r6 = 24
            float r6 = (float) r6
            float r18 = c2.h.B(r6)
            r6 = 32
            float r11 = (float) r6
            float r20 = c2.h.B(r11)
            r21 = 5
            r22 = 0
            r17 = 0
            r19 = 0
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            i1.c r9 = r32.e()
            int r6 = mf.C10039a.f75357a
            r10 = 0
            t1.c r6 = J1.e.c(r6, r1, r10)
            r16 = 3504(0xdb0, float:4.91E-42)
            r17 = 112(0x70, float:1.57E-43)
            r7 = 0
            r18 = 0
            r20 = 0
            r10 = r18
            r32 = r11
            r11 = r19
            r12 = r20
            r13 = r1
            r14 = r16
            r4 = r15
            r15 = r17
            n0.C5583F.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            int r6 = p(r38)
            IC.e r6 = IC.C13026h.a(r6)
            int r34 = IC.C13023e.f110931a
            r29 = r34
            r31 = 262142(0x3fffe, float:3.67339E-40)
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r25 = 0
            r26 = 0
            Bl.c.c(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            float r24 = c2.h.B(r0)
            float r26 = c2.h.B(r32)
            r27 = 5
            r28 = 0
            r23 = 0
            r25 = 0
            r22 = r35
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r22, r23, r24, r25, r26, r27, r28)
            int r6 = mf.C10040b.f75377t
            IC.e r6 = IC.C13026h.a(r6)
            r29 = r34 | 48
            r31 = 262140(0x3fffc, float:3.67336E-40)
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = r1
            Bl.c.c(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r23 = 2
            r24 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r19 = r33
            r20 = r35
            androidx.compose.ui.d r6 = s0.C5861g.c(r19, r20, r21, r22, r23, r24)
            r15 = 0
            s0.C5844O.a(r6, r1, r15)
            boolean r6 = r2 instanceof mm.C11580b.a.c
            if (r6 != 0) goto L_0x0396
            boolean r6 = r2 instanceof mm.C11580b.a.C2291a
            if (r6 == 0) goto L_0x0385
            goto L_0x0396
        L_0x0385:
            boolean r6 = r2 instanceof mm.C11580b.a.C2292b
            if (r6 == 0) goto L_0x0390
            int r6 = mf.C10040b.f75372o
        L_0x038b:
            r13 = r35
            r12 = 0
            r14 = 1
            goto L_0x0399
        L_0x0390:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0396:
            int r6 = mf.C10040b.f75368k
            goto L_0x038b
        L_0x0399:
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.h(r13, r12, r14, r4)
            float r20 = c2.h.B(r0)
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r6 = J1.j.b(r6, r1, r15)
            r8 = 1530017181(0x5b32359d, float:5.0161494E16)
            r1.W(r8)
            r11 = r37
            r8 = r11 & 896(0x380, float:1.256E-42)
            r9 = 256(0x100, float:3.59E-43)
            if (r8 != r9) goto L_0x03c3
            r8 = r14
            goto L_0x03c4
        L_0x03c3:
            r8 = r15
        L_0x03c4:
            boolean r9 = r1.F(r2)
            r8 = r8 | r9
            java.lang.Object r9 = r1.D()
            if (r8 != 0) goto L_0x03d7
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x03df
        L_0x03d7:
            om.d r9 = new om.d
            r9.<init>(r3, r2)
            r1.u(r9)
        L_0x03df:
            r16 = r9
            nI.a r16 = (nI.C17631a) r16
            r1.P()
            r17 = 48
            r18 = 508(0x1fc, float:7.12E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = r11
            r11 = r19
            r12 = r20
            r39 = r13
            r13 = r21
            r14 = r22
            r15 = r16
            r16 = r1
            SC.L.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r7 = r39
            r6 = 1
            r8 = 0
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.h(r7, r8, r6, r4)
            float r13 = c2.h.B(r0)
            r14 = 7
            r15 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r9, r10, r11, r12, r13, r14, r15)
            int r0 = Oo.b.f84522U4
            r4 = 0
            java.lang.String r6 = J1.j.b(r0, r1, r4)
            SC.N r9 = SC.N.Tertiary
            int r0 = r23 << 27
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r4
            r0 = r0 | 3120(0xc30, float:4.372E-42)
            r18 = 500(0x1f4, float:7.0E-43)
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = r40
            r17 = r0
            SC.L.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.x()
            r1.P()
        L_0x0442:
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x044e
            U0.C4895p.R()
        L_0x044e:
            r4 = r36
        L_0x0450:
            U0.Y0 r7 = r1.n()
            if (r7 == 0) goto L_0x0469
            om.e r8 = new om.e
            r0 = r8
            r1 = r40
            r2 = r41
            r3 = r42
            r5 = r45
            r6 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0469:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: om.f.f(nI.a, mm.b$a, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C17642l lVar, C11580b.a aVar) {
        lVar.invoke(aVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17631a aVar, C11580b.a aVar2, C17642l lVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        f(aVar, aVar2, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void i(C11580b.a aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17631a<C16807N> aVar4, C17631a<C16807N> aVar5, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        L0 l02;
        C11580b.a aVar6 = aVar;
        C17631a<C16807N> aVar7 = aVar2;
        C17631a<C16807N> aVar8 = aVar3;
        C17631a<C16807N> aVar9 = aVar4;
        C17631a<C16807N> aVar10 = aVar5;
        int i12 = i10;
        C17542s.j(aVar6, "uiState");
        C17542s.j(aVar7, "onCloseClicked");
        C17542s.j(aVar8, "requestPermission");
        C17542s.j(aVar9, "openSettings");
        C17542s.j(aVar10, "onGetNotified");
        C4889m k10 = mVar.k(-20802347);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar6) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar7) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar8) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar9) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(aVar10) ? 16384 : 8192;
        }
        if ((i11 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-20802347, i11, -1, "com.ingka.ikea.backinstock.notification.compose.BackInStockExplanationScaffold (BackInStockExplanationScreen.kt:77)");
            }
            Object D10 = k10.D();
            C4889m.a aVar11 = C4889m.f14007a;
            if (D10 == aVar11.a()) {
                B b10 = new B(P.k(C17169j.f142968a, k10));
                k10.u(b10);
                D10 = b10;
            }
            Q a10 = ((B) D10).a();
            k10.W(-31655917);
            Object D11 = k10.D();
            if (D11 == aVar11.a()) {
                D11 = new L0();
                k10.u(D11);
            }
            L0 l03 = (L0) D11;
            k10.P();
            String b11 = j.b(Oo.b.f84406I8, k10, 0);
            String b12 = j.b(Oo.b.f84416J8, k10, 0);
            k10.W(-31644992);
            boolean F10 = ((i11 & 896) == 256) | ((57344 & i11) == 16384) | k10.F(a10) | k10.V(b11) | k10.V(b12) | ((i11 & 7168) == 2048);
            Object D12 = k10.D();
            if (F10 || D12 == aVar11.a()) {
                b bVar = r3;
                l02 = l03;
                b bVar2 = new b(aVar5, aVar3, a10, l03, b11, b12, aVar4);
                k10.u(bVar);
                D12 = bVar;
            } else {
                l02 = l03;
            }
            k10.P();
            mVar2 = k10;
            C4762x0.a((androidx.compose.ui.d) null, c1.c.e(1788456849, true, new a(aVar7), k10, 54), (p<? super C4889m, ? super Integer, C16807N>) null, c1.c.e(-2019436721, true, new b(l02), k10, 54), (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, (C5848T) null, c1.c.e(-1260556954, true, new c(aVar7, aVar6, (C17642l) D12), k10, 54), mVar2, 805309488, 501);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new c(aVar, aVar2, aVar3, aVar4, aVar5, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C17631a aVar, C17631a aVar2, Q q10, L0 l02, String str, String str2, C17631a aVar3, C11580b.a aVar4) {
        C17542s.j(aVar4, "state");
        if (aVar4 instanceof C11580b.a.C2292b) {
            aVar.invoke();
        } else if (aVar4 instanceof C11580b.a.C2291a) {
            aVar2.invoke();
        } else if (aVar4 instanceof C11580b.a.c) {
            F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new d(l02, str, str2, aVar3, (C17164e<? super d>) null), 3, (Object) null);
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C11580b.a aVar, C17631a aVar2, C17631a aVar3, C17631a aVar4, C17631a aVar5, int i10, C4889m mVar, int i11) {
        i(aVar, aVar2, aVar3, aVar4, aVar5, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void l(C11580b bVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        C17542s.j(bVar, "viewModel");
        C17542s.j(aVar, "onCloseClicked");
        C17542s.j(aVar2, "requestPermission");
        C17542s.j(aVar3, "openSettings");
        C4889m k10 = mVar.k(-319440329);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= k10.F(aVar3) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-319440329, i11, -1, "com.ingka.ikea.backinstock.notification.compose.BackInStockExplanationScreen (BackInStockExplanationScreen.kt:57)");
            }
            C11580b.a m10 = m(p1.b(bVar.m(), (C17168i) null, k10, 0, 1));
            k10.W(-180132274);
            boolean F10 = k10.F(bVar);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new e(bVar);
                k10.u(D10);
            }
            k10.P();
            i(m10, aVar, aVar2, aVar3, (C17631a) ((C18059h) D10), k10, i11 & 8176);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11685a(bVar, aVar, aVar2, aVar3, i10));
        }
    }

    private static final C11580b.a m(A1<? extends C11580b.a> a12) {
        return (C11580b.a) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C11580b bVar, C17631a aVar, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        l(bVar, aVar, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final int p(C11550a.c cVar) {
        if ((cVar instanceof C11550a.c.C2255a) || (cVar instanceof C11550a.c.b)) {
            return C10040b.f75376s;
        }
        if (cVar instanceof C11550a.c.C2258c) {
            return C10040b.f75363f;
        }
        throw new t();
    }

    private static final String q(C11550a.c cVar, C4889m mVar, int i10) {
        String str;
        mVar.W(1097641644);
        if (C4895p.J()) {
            C4895p.S(1097641644, i10, -1, "com.ingka.ikea.backinstock.notification.compose.getExplanationDialogTitle (BackInStockExplanationScreen.kt:222)");
        }
        if (cVar instanceof C11550a.c.C2255a) {
            mVar.W(339051735);
            str = j.c(C10040b.f75379v, new Object[]{((C11550a.c.C2255a) cVar).c()}, mVar, 0);
            mVar.P();
        } else if (cVar instanceof C11550a.c.b) {
            mVar.W(339253111);
            str = j.c(C10040b.f75379v, new Object[]{((C11550a.c.b) cVar).c()}, mVar, 0);
            mVar.P();
        } else if (cVar instanceof C11550a.c.C2258c) {
            mVar.W(339451542);
            str = j.c(C10040b.f75364g, new Object[]{((C11550a.c.C2258c) cVar).c()}, mVar, 0);
            mVar.P();
        } else {
            mVar.W(-1790180018);
            mVar.P();
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return str;
    }
}
