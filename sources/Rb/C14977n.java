package rB;

import Bx.a;
import HJ.C15854t;
import QJ.Q;
import RA.C13502a;
import U0.A1;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import XH.t;
import XH.y;
import android.content.Context;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import pB.C14906b;
import qB.C14934a;
import qB.C14935b;
import qB.C14936c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import x4.C8948l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ac\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u0002"}, d2 = {"Lx4/l;", "navBackStackEntry", "", "buttonOffset", "Lkotlin/Function0;", "LXH/N;", "onShowLoginPromotion", "onCloseClicked", "Lkotlin/Function1;", "LqB/b$c;", "onListUpdated", "Landroidx/compose/ui/d;", "modifier", "LpB/b;", "viewModel", "g", "(Lx4/l;ILnI/a;LnI/a;LnI/l;Landroidx/compose/ui/d;LpB/b;LU0/m;II)V", "LqB/b;", "state", "listpicker-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: rB.n  reason: case insensitive filesystem */
public final class C14977n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.shoppinglist.listpicker.impl.ui.ListPickerDestinationKt$ListPickerDestination$3$1", f = "ListPickerDestination.kt", l = {}, m = "invokeSuspend")
    /* renamed from: rB.n$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f130562c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f130563d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<C14935b> f130564e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17631a<C16807N> aVar, A1<C14935b> a12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f130563d = aVar;
            this.f130564e = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f130563d, this.f130564e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f130562c == 0) {
                y.b(obj);
                if (C17542s.e(C14977n.h(this.f130564e).i(), kotlin.coroutines.jvm.internal.b.a(false))) {
                    this.f130563d.invoke();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.shoppinglist.listpicker.impl.ui.ListPickerDestinationKt$ListPickerDestination$4$1", f = "ListPickerDestination.kt", l = {}, m = "invokeSuspend")
    /* renamed from: rB.n$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f130565c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14935b.a f130566d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f130567e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C14906b f130568f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C14935b.a aVar, Context context, C14906b bVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f130566d = aVar;
            this.f130567e = context;
            this.f130568f = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f130566d, this.f130567e, this.f130568f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f130565c == 0) {
                y.b(obj);
                C14935b.a aVar = this.f130566d;
                if (aVar instanceof C14935b.a.C3222b) {
                    C13502a.f115114a.b(this.f130567e, ((C14935b.a.C3222b) aVar).a());
                    this.f130568f.I(C14934a.b.f130377a);
                } else if (!(aVar instanceof C14935b.a.C3221a) && aVar != null) {
                    throw new t();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.shoppinglist.listpicker.impl.ui.ListPickerDestinationKt$ListPickerDestination$7$1", f = "ListPickerDestination.kt", l = {}, m = "invokeSuspend")
    /* renamed from: rB.n$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f130569c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14935b.c f130570d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<C14935b.c, C16807N> f130571e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C14935b.c cVar, C17642l<? super C14935b.c, C16807N> lVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f130570d = cVar;
            this.f130571e = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f130570d, this.f130571e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f130569c == 0) {
                y.b(obj);
                C14935b.c cVar = this.f130570d;
                if (cVar != null) {
                    this.f130571e.invoke(cVar);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: androidx.compose.ui.d$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(x4.C8948l r21, int r22, nI.C17631a<XH.C16807N> r23, nI.C17631a<XH.C16807N> r24, nI.C17642l<? super qB.C14935b.c, XH.C16807N> r25, androidx.compose.ui.d r26, pB.C14906b r27, U0.C4889m r28, int r29, int r30) {
        /*
            r1 = r21
            r3 = r23
            r13 = r24
            r14 = r25
            r15 = r29
            java.lang.String r0 = "navBackStackEntry"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onShowLoginPromotion"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "onCloseClicked"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "onListUpdated"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = 1913923100(0x7214261c, float:2.9343906E30)
            r2 = r28
            U0.m r2 = r2.k(r0)
            r4 = r30 & 1
            if (r4 == 0) goto L_0x002e
            r4 = r15 | 6
            goto L_0x003e
        L_0x002e:
            r4 = r15 & 6
            if (r4 != 0) goto L_0x003d
            boolean r4 = r2.F(r1)
            if (r4 == 0) goto L_0x003a
            r4 = 4
            goto L_0x003b
        L_0x003a:
            r4 = 2
        L_0x003b:
            r4 = r4 | r15
            goto L_0x003e
        L_0x003d:
            r4 = r15
        L_0x003e:
            r5 = r30 & 2
            if (r5 == 0) goto L_0x0047
            r4 = r4 | 48
            r12 = r22
            goto L_0x0059
        L_0x0047:
            r5 = r15 & 48
            r12 = r22
            if (r5 != 0) goto L_0x0059
            boolean r5 = r2.d(r12)
            if (r5 == 0) goto L_0x0056
            r5 = 32
            goto L_0x0058
        L_0x0056:
            r5 = 16
        L_0x0058:
            r4 = r4 | r5
        L_0x0059:
            r5 = r30 & 4
            r11 = 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x0062
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0071
        L_0x0062:
            r5 = r15 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0071
            boolean r5 = r2.F(r3)
            if (r5 == 0) goto L_0x006e
            r5 = r11
            goto L_0x0070
        L_0x006e:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0070:
            r4 = r4 | r5
        L_0x0071:
            r5 = r30 & 8
            r10 = 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x007a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x007a:
            r5 = r15 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0089
            boolean r5 = r2.F(r13)
            if (r5 == 0) goto L_0x0086
            r5 = r10
            goto L_0x0088
        L_0x0086:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0088:
            r4 = r4 | r5
        L_0x0089:
            r5 = r30 & 16
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L_0x0092
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a1
        L_0x0092:
            r5 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x00a1
            boolean r5 = r2.F(r14)
            if (r5 == 0) goto L_0x009e
            r5 = r9
            goto L_0x00a0
        L_0x009e:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r4 = r4 | r5
        L_0x00a1:
            r5 = r30 & 32
            r6 = 196608(0x30000, float:2.75506E-40)
            if (r5 == 0) goto L_0x00ab
            r4 = r4 | r6
        L_0x00a8:
            r6 = r26
            goto L_0x00bc
        L_0x00ab:
            r6 = r6 & r15
            if (r6 != 0) goto L_0x00a8
            r6 = r26
            boolean r7 = r2.V(r6)
            if (r7 == 0) goto L_0x00b9
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r7 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r4 = r4 | r7
        L_0x00bc:
            r7 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 & r15
            if (r7 != 0) goto L_0x00d8
            r7 = r30 & 64
            if (r7 != 0) goto L_0x00d0
            r7 = r27
            boolean r8 = r2.F(r7)
            if (r8 == 0) goto L_0x00d2
            r8 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d4
        L_0x00d0:
            r7 = r27
        L_0x00d2:
            r8 = 524288(0x80000, float:7.34684E-40)
        L_0x00d4:
            r4 = r4 | r8
        L_0x00d5:
            r16 = r4
            goto L_0x00db
        L_0x00d8:
            r7 = r27
            goto L_0x00d5
        L_0x00db:
            r4 = 599187(0x92493, float:8.3964E-40)
            r4 = r16 & r4
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r4 != r8) goto L_0x00f2
            boolean r4 = r2.l()
            if (r4 != 0) goto L_0x00ec
            goto L_0x00f2
        L_0x00ec:
            r2.L()
            r5 = r1
            goto L_0x0384
        L_0x00f2:
            r2.G()
            r4 = r15 & 1
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r4 == 0) goto L_0x0112
            boolean r4 = r2.O()
            if (r4 == 0) goto L_0x0103
            goto L_0x0112
        L_0x0103:
            r2.L()
            r4 = r30 & 64
            if (r4 == 0) goto L_0x010c
            r16 = r16 & r17
        L_0x010c:
            r18 = r6
        L_0x010e:
            r11 = r7
        L_0x010f:
            r10 = r16
            goto L_0x0164
        L_0x0112:
            if (r5 == 0) goto L_0x0119
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r18 = r4
            goto L_0x011b
        L_0x0119:
            r18 = r6
        L_0x011b:
            r4 = r30 & 64
            if (r4 == 0) goto L_0x010e
            r4 = 1729797275(0x671a9c9b, float:7.301333E23)
            r2.C(r4)
            m3.a r4 = m3.a.f26247a
            r5 = 6
            androidx.lifecycle.k0 r5 = r4.a(r2, r5)
            if (r5 == 0) goto L_0x015c
            boolean r4 = r5 instanceof androidx.lifecycle.C5212o
            if (r4 == 0) goto L_0x013b
            r4 = r5
            androidx.lifecycle.o r4 = (androidx.lifecycle.C5212o) r4
            l3.a r4 = r4.getDefaultViewModelCreationExtras()
        L_0x0139:
            r8 = r4
            goto L_0x013e
        L_0x013b:
            l3.a$a r4 = l3.a.C0407a.f25486b
            goto L_0x0139
        L_0x013e:
            java.lang.Class<pB.b> r4 = pB.C14906b.class
            uI.d r4 = kotlin.jvm.internal.P.b(r4)
            r19 = 0
            r20 = 0
            r6 = 0
            r7 = 0
            r9 = r2
            r10 = r19
            r11 = r20
            androidx.lifecycle.f0 r4 = m3.c.c(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.U()
            pB.b r4 = (pB.C14906b) r4
            r16 = r16 & r17
            r11 = r4
            goto L_0x010f
        L_0x015c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x0164:
            r2.y()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0173
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.shoppinglist.listpicker.impl.ui.ListPickerDestination (ListPickerDestination.kt:33)"
            U0.C4895p.S(r0, r10, r4, r5)
        L_0x0173:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r2.Q(r0)
            android.content.Context r0 = (android.content.Context) r0
            TJ.P r4 = r11.getState()
            r9 = 0
            r16 = 7
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = r2
            r12 = r10
            r10 = r16
            U0.A1 r10 = j3.a.c(r4, r5, r6, r7, r8, r9, r10)
            r4 = 814488978(0x308c1d92, float:1.0194745E-9)
            r2.W(r4)
            qB.b r4 = h(r10)
            boolean r4 = r4.f()
            if (r4 == 0) goto L_0x0210
            qB.b r4 = h(r10)
            r5 = 814498228(0x308c41b4, float:1.0205015E-9)
            r2.W(r5)
            boolean r5 = r2.F(r11)
            java.lang.Object r6 = r2.D()
            if (r5 != 0) goto L_0x01bb
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x01c3
        L_0x01bb:
            rB.h r6 = new rB.h
            r6.<init>(r11)
            r2.u(r6)
        L_0x01c3:
            r7 = r6
            nI.l r7 = (nI.C17642l) r7
            r2.P()
            r5 = 814495028(0x308c3534, float:1.0201462E-9)
            r2.W(r5)
            boolean r5 = r2.F(r11)
            java.lang.Object r6 = r2.D()
            if (r5 != 0) goto L_0x01e1
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x01e9
        L_0x01e1:
            rB.i r6 = new rB.i
            r6.<init>(r11)
            r2.u(r6)
        L_0x01e9:
            r8 = r6
            nI.a r8 = (nI.C17631a) r8
            r2.P()
            r5 = r12 & 112(0x70, float:1.57E-43)
            int r6 = r12 >> 3
            r6 = r6 & 896(0x380, float:1.256E-42)
            r5 = r5 | r6
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r12
            r16 = r5 | r6
            r17 = 0
            r5 = r22
            r6 = r24
            r9 = r18
            r26 = r10
            r10 = r2
            r15 = r11
            r11 = r16
            r1 = r12
            r12 = r17
            rB.C14987x.p(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0214
        L_0x0210:
            r26 = r10
            r15 = r11
            r1 = r12
        L_0x0214:
            r2.P()
            qB.b r4 = h(r26)
            java.lang.Boolean r4 = r4.i()
            r5 = 814504366(0x308c59ae, float:1.0211829E-9)
            r2.W(r5)
            r10 = r26
            boolean r5 = r2.V(r10)
            r6 = r1 & 896(0x380, float:1.256E-42)
            r11 = 0
            r7 = 256(0x100, float:3.59E-43)
            if (r6 != r7) goto L_0x0234
            r6 = 1
            goto L_0x0235
        L_0x0234:
            r6 = r11
        L_0x0235:
            r5 = r5 | r6
            java.lang.Object r6 = r2.D()
            r9 = 0
            if (r5 != 0) goto L_0x0245
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x024d
        L_0x0245:
            rB.n$a r6 = new rB.n$a
            r6.<init>(r3, r10, r9)
            r2.u(r6)
        L_0x024d:
            nI.p r6 = (nI.p) r6
            r2.P()
            U0.P.g(r4, r6, r2, r11)
            qB.b r4 = h(r10)
            qB.b$a r4 = r4.c()
            r5 = 814510619(0x308c721b, float:1.0218771E-9)
            r2.W(r5)
            boolean r5 = r2.F(r4)
            boolean r6 = r2.F(r0)
            r5 = r5 | r6
            boolean r6 = r2.F(r15)
            r5 = r5 | r6
            java.lang.Object r6 = r2.D()
            if (r5 != 0) goto L_0x027f
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0287
        L_0x027f:
            rB.n$b r6 = new rB.n$b
            r6.<init>(r4, r0, r15, r9)
            r2.u(r6)
        L_0x0287:
            nI.p r6 = (nI.p) r6
            r2.P()
            U0.P.g(r4, r6, r2, r11)
            r0 = 814526653(0x308cb0bd, float:1.0236573E-9)
            r2.W(r0)
            boolean r0 = r4 instanceof qB.C14935b.a.C3221a
            if (r0 == 0) goto L_0x0305
            r0 = 814530523(0x308cbfdb, float:1.0240869E-9)
            r2.W(r0)
            boolean r0 = r2.F(r15)
            java.lang.Object r5 = r2.D()
            if (r0 != 0) goto L_0x02b1
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r5 != r0) goto L_0x02b9
        L_0x02b1:
            rB.j r5 = new rB.j
            r5.<init>(r15)
            r2.u(r5)
        L_0x02b9:
            r0 = r5
            nI.l r0 = (nI.C17642l) r0
            r2.P()
            r5 = 814535254(0x308cd256, float:1.0246122E-9)
            r2.W(r5)
            boolean r5 = r2.F(r15)
            boolean r6 = r2.F(r4)
            r5 = r5 | r6
            r6 = r1 & 7168(0x1c00, float:1.0045E-41)
            r8 = 2048(0x800, float:2.87E-42)
            if (r6 != r8) goto L_0x02d6
            r6 = 1
            goto L_0x02d7
        L_0x02d6:
            r6 = r11
        L_0x02d7:
            r5 = r5 | r6
            java.lang.Object r6 = r2.D()
            if (r5 != 0) goto L_0x02e6
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x02ee
        L_0x02e6:
            rB.k r6 = new rB.k
            r6.<init>(r15, r4, r13)
            r2.u(r6)
        L_0x02ee:
            r5 = r6
            nI.a r5 = (nI.C17631a) r5
            r2.P()
            r16 = 0
            r17 = 4
            r6 = 0
            r4 = r0
            r7 = r2
            r0 = r8
            r8 = r16
            r12 = r9
            r9 = r17
            uB.C15104b.b(r4, r5, r6, r7, r8, r9)
            goto L_0x0308
        L_0x0305:
            r12 = r9
            r0 = 2048(0x800, float:2.87E-42)
        L_0x0308:
            r2.P()
            qB.b r4 = h(r10)
            qB.b$c r4 = r4.h()
            r5 = 814548852(0x308d0774, float:1.0261219E-9)
            r2.W(r5)
            boolean r5 = r2.F(r4)
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r1
            r7 = 16384(0x4000, float:2.2959E-41)
            if (r6 != r7) goto L_0x0327
            r6 = 1
            goto L_0x0328
        L_0x0327:
            r6 = r11
        L_0x0328:
            r5 = r5 | r6
            java.lang.Object r6 = r2.D()
            if (r5 != 0) goto L_0x0337
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x033f
        L_0x0337:
            rB.n$c r6 = new rB.n$c
            r6.<init>(r4, r14, r12)
            r2.u(r6)
        L_0x033f:
            nI.p r6 = (nI.p) r6
            r2.P()
            U0.P.g(r4, r6, r2, r11)
            r4 = 814557001(0x308d2749, float:1.0270266E-9)
            r2.W(r4)
            r4 = r1 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != r0) goto L_0x0352
            r11 = 1
        L_0x0352:
            java.lang.Object r0 = r2.D()
            if (r11 != 0) goto L_0x0360
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r0 != r4) goto L_0x0368
        L_0x0360:
            rB.l r0 = new rB.l
            r0.<init>(r13)
            r2.u(r0)
        L_0x0368:
            nI.l r0 = (nI.C17642l) r0
            r2.P()
            r1 = r1 & 14
            r1 = r1 | 48
            java.lang.String r4 = "login_signup_promotion_signup"
            r5 = r21
            qw.l.c(r5, r4, r0, r2, r1)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0381
            U0.C4895p.R()
        L_0x0381:
            r7 = r15
            r6 = r18
        L_0x0384:
            U0.Y0 r10 = r2.n()
            if (r10 == 0) goto L_0x03a1
            rB.m r11 = new rB.m
            r0 = r11
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r8 = r29
            r9 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x03a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rB.C14977n.g(x4.l, int, nI.a, nI.a, nI.l, androidx.compose.ui.d, pB.b, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C14935b h(A1<C14935b> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C14906b bVar, C14935b.a aVar, C17631a aVar2) {
        bVar.I(C14934a.b.f130377a);
        if (((C14935b.a.C3221a) aVar).a()) {
            aVar2.invoke();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C17631a aVar, a.b bVar) {
        String str;
        char c10;
        int i10;
        a.b bVar2 = bVar;
        C17542s.j(bVar2, "loginResult");
        e eVar = e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            c10 = '$';
            i10 = 2;
            if (!hasNext) {
                break;
            }
            C11819b bVar3 = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("Login fragment result: " + bVar2, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = bVar.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str3 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar3.a(eVar, str5, false, (Throwable) null, str4);
            str3 = str5;
            str2 = str4;
        }
        if (!C17542s.e(bVar2, a.b.d.f108193a) && !C17542s.e(bVar2, a.b.c.f108192a)) {
            if (C17542s.e(bVar2, a.b.C2585a.f108190a) || C17542s.e(bVar2, a.b.C2587b.f108191a)) {
                e eVar2 = e.DEBUG;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str6 = null;
                String str7 = null;
                for (C11819b bVar4 : arrayList2) {
                    if (str6 == null) {
                        String a11 = C11818a.a("Login / Signup dismissed, close choose list sheet", (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str6 = C11820c.a(a11);
                    }
                    if (str7 == null) {
                        String name2 = bVar.getClass().getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, c10, (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar4.a(eVar2, str7, false, (Throwable) null, str6);
                    i10 = 2;
                    c10 = '$';
                }
                aVar.invoke();
            } else {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C8948l lVar, int i10, C17631a aVar, C17631a aVar2, C17642l lVar2, androidx.compose.ui.d dVar, C14906b bVar, int i11, int i12, C4889m mVar, int i13) {
        g(lVar, i10, aVar, aVar2, lVar2, dVar, bVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C14906b bVar, C14936c cVar) {
        C17542s.j(cVar, "listModel");
        bVar.I(new C14934a.d(cVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C14906b bVar) {
        bVar.I(C14934a.C3220a.f130376a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C14906b bVar, String str) {
        C17542s.j(str, "listName");
        bVar.I(new C14934a.c(C15854t.z1(str).toString()));
        return C16807N.f139792a;
    }
}
