package Ai;

import E1.I;
import Ei.C10675J;
import G1.C4504g;
import HJ.C15854t;
import Hx.c;
import J1.j;
import KJ.C15987c;
import O0.C4762x0;
import O0.H0;
import O0.J0;
import O0.L0;
import O0.e1;
import O0.g1;
import QJ.F0;
import QJ.Q;
import QJ.T;
import SC.H2;
import SC.Y2;
import U0.A1;
import U0.B;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.P;
import U0.Y0;
import XH.C16807N;
import XH.t;
import XH.y;
import android.content.Context;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import i1.C5437c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import nI.q;
import nI.r;
import ol.u;
import ol.v;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import s0.C5834E;
import s0.C5842M;
import s0.C5844O;
import s0.C5848T;
import s0.C5862h;
import t0.C5938c;
import t0.x;
import tK.C18029u;
import wi.C12272a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LAi/I1;", "viewModel", "Lkotlin/Function2;", "", "LHx/c$d$d;", "LXH/N;", "onItemClicked", "Lkotlin/Function0;", "onClose", "g", "(LAi/I1;LnI/p;LnI/a;LU0/m;I)V", "LKJ/c;", "LEi/J$b;", "invoices", "d", "(LKJ/c;LnI/p;LU0/m;I)V", "purchasehistory-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class H1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10675J.b f78471a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<String, c.d.C2666d, C16807N> f78472b;

        a(C10675J.b bVar, p<? super String, ? super c.d.C2666d, C16807N> pVar) {
            this.f78471a = bVar;
            this.f78472b = pVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(p pVar, C10675J.b bVar) {
            pVar.invoke(bVar.a(), bVar.b());
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(t0.C5938c r19, U0.C4889m r20, int r21) {
            /*
                r18 = this;
                r0 = r18
                r14 = r20
                r1 = r21
                java.lang.String r2 = "$this$item"
                r3 = r19
                kotlin.jvm.internal.C17542s.j(r3, r2)
                r2 = r1 & 17
                r3 = 16
                if (r2 != r3) goto L_0x001f
                boolean r2 = r20.l()
                if (r2 != 0) goto L_0x001a
                goto L_0x001f
            L_0x001a:
                r20.L()
                goto L_0x0099
            L_0x001f:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x002e
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.InvoicesList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowInvoiceScreen.kt:126)"
                r4 = -2121533959(0xffffffff818bf5f9, float:-5.141349E-38)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x002e:
                Ei.J$b r1 = r0.f78471a
                java.lang.String r1 = r1.a()
                SC.b1$f r6 = SC.C13569b1.f.f116152b
                SC.g1 r9 = SC.C13589g1.Large
                r2 = -1753457141(0xffffffff977c5e0b, float:-8.154429E-25)
                r14.W(r2)
                nI.p<java.lang.String, Hx.c$d$d, XH.N> r2 = r0.f78472b
                boolean r2 = r14.V(r2)
                Ei.J$b r3 = r0.f78471a
                boolean r3 = r14.F(r3)
                r2 = r2 | r3
                nI.p<java.lang.String, Hx.c$d$d, XH.N> r3 = r0.f78472b
                Ei.J$b r4 = r0.f78471a
                java.lang.Object r5 = r20.D()
                if (r2 != 0) goto L_0x005d
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r5 != r2) goto L_0x0065
            L_0x005d:
                Ai.G1 r5 = new Ai.G1
                r5.<init>(r3, r4)
                r14.u(r5)
            L_0x0065:
                r2 = r5
                nI.a r2 = (nI.C17631a) r2
                r20.P()
                int r3 = SC.C13569b1.f.f116153c
                int r3 = r3 << 15
                r4 = 100663296(0x6000000, float:2.4074124E-35)
                r15 = r3 | r4
                r16 = 6
                r17 = 6876(0x1adc, float:9.635E-42)
                r3 = 0
                r4 = 0
                r5 = 0
                r7 = 0
                r8 = 0
                r10 = 0
                r11 = 1
                r12 = 0
                r13 = 0
                r14 = r20
                SC.C13585f1.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                r6 = 0
                r7 = 7
                r1 = 0
                r2 = 0
                r3 = 0
                r5 = r20
                SC.C13643u0.c(r1, r2, r3, r5, r6, r7)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0099
                U0.C4895p.R()
            L_0x0099:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ai.H1.a.b(t0.c, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f78473a;

        b(C17631a<C16807N> aVar) {
            this.f78473a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(898241627, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.ShowInvoiceScreen.<anonymous> (ShowInvoiceScreen.kt:68)");
                }
                ol.p.c(v.BACK, this.f78473a, (androidx.compose.ui.d) null, j.b(C12272a.f105787U0, mVar, 0), (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, mVar, 6, 500);
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
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f78474a;

        c(L0 l02) {
            this.f78474a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(67587993, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.ShowInvoiceScreen.<anonymous> (ShowInvoiceScreen.kt:63)");
                }
                Y2.c(this.f78474a, (androidx.compose.ui.d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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
        final /* synthetic */ A1<C10675J.c> f78475a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<String, c.d.C2666d, C16807N> f78476b;

        d(A1<? extends C10675J.c> a12, p<? super String, ? super c.d.C2666d, C16807N> pVar) {
            this.f78475a = a12;
            this.f78476b = pVar;
        }

        public final void a(C5834E e10, C4889m mVar, int i10) {
            C17542s.j(e10, "paddingValues");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(e10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2063601008, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.ShowInvoiceScreen.<anonymous> (ShowInvoiceScreen.kt:75)");
                }
                d.a aVar = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d h10 = D.h(J.f(aVar, 0.0f, 1, (Object) null), e10);
                A1<C10675J.c> a12 = this.f78475a;
                p<String, c.d.C2666d, C16807N> pVar = this.f78476b;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar, 0);
                int a11 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e11 = androidx.compose.ui.c.e(mVar, h10);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a13 = aVar2.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a13);
                } else {
                    mVar.t();
                }
                C4889m a14 = F1.a(mVar);
                F1.c(a14, a10, aVar2.c());
                F1.c(a14, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b10 = aVar2.b();
                if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a11))) {
                    a14.u(Integer.valueOf(a11));
                    a14.w(Integer.valueOf(a11), b10);
                }
                F1.c(a14, e11, aVar2.d());
                C5862h hVar = C5862h.f28810a;
                C10675J.c value = a12.getValue();
                if (value instanceof C10675J.c.a) {
                    mVar.W(-534993354);
                    H1.d(((C10675J.c.a) value).d(), pVar, mVar, 0);
                    mVar.P();
                } else if (value instanceof C10675J.c.b) {
                    mVar.W(-534748826);
                    C18029u uVar = C18029u.f147649a;
                    H2.b(J.i(aVar, uVar.k()), false, mVar, 0, 2);
                    C5844O.a(J.i(aVar, uVar.f()), mVar, 0);
                    H2.b(J.i(aVar, uVar.k()), false, mVar, 0, 2);
                    mVar.P();
                } else {
                    mVar.W(-1956922576);
                    mVar.P();
                    throw new t();
                }
                mVar.x();
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
    @f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.ShowInvoiceScreenKt$ShowInvoiceScreen$4$1", f = "ShowInvoiceScreen.kt", l = {}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f78477c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f78478d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<C10675J.c> f78479e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f78480f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Q f78481g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ I1 f78482h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ L0 f78483i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Context f78484j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.ShowInvoiceScreenKt$ShowInvoiceScreen$4$1$1", f = "ShowInvoiceScreen.kt", l = {109}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f78485c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ L0 f78486d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C10675J.c.a f78487e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Context f78488f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(L0 l02, C10675J.c.a aVar, Context context, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f78486d = l02;
                this.f78487e = aVar;
                this.f78488f = context;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f78486d, this.f78487e, this.f78488f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f78485c;
                if (i10 == 0) {
                    y.b(obj);
                    L0 l02 = this.f78486d;
                    String b10 = this.f78487e.c().b(this.f78488f);
                    this.f78485c = 1;
                    if (L0.f(l02, b10, (String) null, false, (J0) null, this, 14, (Object) null) == f10) {
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
        e(A1<? extends C10675J.c> a12, C17631a<C16807N> aVar, Q q10, I1 i12, L0 l02, Context context, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f78479e = a12;
            this.f78480f = aVar;
            this.f78481g = q10;
            this.f78482h = i12;
            this.f78483i = l02;
            this.f78484j = context;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f78479e, this.f78480f, this.f78481g, this.f78482h, this.f78483i, this.f78484j, eVar);
            eVar2.f78478d = obj;
            return eVar2;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C15987c<C10675J.b> d10;
            C17187b.f();
            if (this.f78477c == 0) {
                y.b(obj);
                Q q10 = (Q) this.f78478d;
                C10675J.c value = this.f78479e.getValue();
                C10675J.c.a aVar = value instanceof C10675J.c.a ? (C10675J.c.a) value : null;
                if (aVar == null || (d10 = aVar.d()) == null || !d10.isEmpty()) {
                    if ((aVar != null ? aVar.c() : null) != null) {
                        F0 unused = C16314k.d(this.f78481g, (C17168i) null, (T) null, new a(this.f78483i, aVar, this.f78484j, (C17164e<? super a>) null), 3, (Object) null);
                        this.f78482h.x();
                    }
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("ShowInvoiceScreen Content has no invoices.");
                    qv.e eVar = qv.e.ERROR;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar : arrayList) {
                        if (str == null) {
                            String a10 = C11818a.a((String) null, illegalStateException);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = q10.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str4 = str2;
                        bVar.a(eVar, str4, false, illegalStateException, str3);
                        str = str3;
                        str2 = str4;
                    }
                    this.f78480f.invoke();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: nI.l} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(KJ.C15987c<Ei.C10675J.b> r17, nI.p<? super java.lang.String, ? super Hx.c.d.C2666d, XH.C16807N> r18, U0.C4889m r19, int r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = -2079902993(0xffffffff840732ef, float:-1.5892561E-36)
            r4 = r19
            U0.m r15 = r4.k(r3)
            r4 = r2 & 6
            if (r4 != 0) goto L_0x001e
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x001b
            r4 = 4
            goto L_0x001c
        L_0x001b:
            r4 = 2
        L_0x001c:
            r4 = r4 | r2
            goto L_0x001f
        L_0x001e:
            r4 = r2
        L_0x001f:
            r5 = r2 & 48
            r6 = 32
            if (r5 != 0) goto L_0x0030
            boolean r5 = r15.F(r1)
            if (r5 == 0) goto L_0x002d
            r5 = r6
            goto L_0x002f
        L_0x002d:
            r5 = 16
        L_0x002f:
            r4 = r4 | r5
        L_0x0030:
            r5 = r4 & 19
            r7 = 18
            if (r5 != r7) goto L_0x0043
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            r15.L()
            r16 = r15
            goto L_0x0098
        L_0x0043:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x004f
            r5 = -1
            java.lang.String r7 = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.InvoicesList (ShowInvoiceScreen.kt:122)"
            U0.C4895p.S(r3, r4, r5, r7)
        L_0x004f:
            r3 = -66559407(0xfffffffffc086251, float:-2.832586E36)
            r15.W(r3)
            boolean r3 = r15.F(r0)
            r4 = r4 & 112(0x70, float:1.57E-43)
            if (r4 != r6) goto L_0x005f
            r4 = 1
            goto L_0x0060
        L_0x005f:
            r4 = 0
        L_0x0060:
            r3 = r3 | r4
            java.lang.Object r4 = r15.D()
            if (r3 != 0) goto L_0x006f
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0077
        L_0x006f:
            Ai.E1 r4 = new Ai.E1
            r4.<init>(r0, r1)
            r15.u(r4)
        L_0x0077:
            r12 = r4
            nI.l r12 = (nI.C17642l) r12
            r15.P()
            r14 = 0
            r3 = 255(0xff, float:3.57E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = r15
            r16 = r15
            r15 = r3
            t0.C5937b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0098
            U0.C4895p.R()
        L_0x0098:
            U0.Y0 r3 = r16.n()
            if (r3 == 0) goto L_0x00a6
            Ai.F1 r4 = new Ai.F1
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.H1.d(KJ.c, nI.p, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C15987c cVar, p pVar, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            x.i(xVar, (Object) null, (Object) null, c1.c.c(-2121533959, true, new a((C10675J.b) it.next(), pVar)), 3, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C15987c cVar, p pVar, int i10, C4889m mVar, int i11) {
        d(cVar, pVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void g(I1 i12, p<? super String, ? super c.d.C2666d, C16807N> pVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        A1<C10675J.c> a12;
        I1 i13 = i12;
        p<? super String, ? super c.d.C2666d, C16807N> pVar2 = pVar;
        C17631a<C16807N> aVar2 = aVar;
        int i14 = i10;
        C17542s.j(i13, "viewModel");
        C17542s.j(pVar2, "onItemClicked");
        C17542s.j(aVar2, "onClose");
        C4889m k10 = mVar.k(2146468511);
        if ((i14 & 6) == 0) {
            i11 = ((i14 & 8) == 0 ? k10.V(i13) : k10.F(i13) ? 4 : 2) | i14;
        } else {
            i11 = i14;
        }
        if ((i14 & 48) == 0) {
            i11 |= k10.F(pVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i11 |= k10.F(aVar2) ? 256 : 128;
        }
        int i15 = i11;
        if ((i15 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2146468511, i15, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.ShowInvoiceScreen (ShowInvoiceScreen.kt:56)");
            }
            A1<C10675J.c> c10 = j3.a.c(i12.w(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7);
            Object D10 = k10.D();
            C4889m.a aVar3 = C4889m.f14007a;
            if (D10 == aVar3.a()) {
                B b10 = new B(P.k(C17169j.f142968a, k10));
                k10.u(b10);
                D10 = b10;
            }
            Q a10 = ((B) D10).a();
            k10.W(2104125285);
            Object D11 = k10.D();
            if (D11 == aVar3.a()) {
                D11 = new L0();
                k10.u(D11);
            }
            L0 l02 = (L0) D11;
            k10.P();
            int i16 = i15;
            C4889m mVar3 = k10;
            C4762x0.a((androidx.compose.ui.d) null, c1.c.e(898241627, true, new b(aVar2), k10, 54), (p<? super C4889m, ? super Integer, C16807N>) null, c1.c.e(67587993, true, new c(l02), k10, 54), (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, (C5848T) null, c1.c.e(2063601008, true, new d(c10, pVar2), k10, 54), mVar3, 805309488, 501);
            mVar2 = mVar3;
            Context context = (Context) mVar2.Q(AndroidCompositionLocals_androidKt.g());
            mVar2.W(2104169370);
            boolean V10 = mVar2.V(c10) | ((i16 & 896) == 256) | mVar2.F(a10) | mVar2.F(context) | ((i16 & 14) == 4 || ((i16 & 8) != 0 && mVar2.F(i13)));
            Object D12 = mVar2.D();
            if (V10 || D12 == aVar3.a()) {
                Context context2 = context;
                a12 = c10;
                e eVar = new e(c10, aVar, a10, i12, l02, context2, (C17164e<? super e>) null);
                mVar2.u(eVar);
                D12 = eVar;
            } else {
                a12 = c10;
            }
            mVar2.P();
            P.g(a12, (p) D12, mVar2, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new D1(i13, pVar2, aVar2, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h(I1 i12, p pVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        g(i12, pVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
