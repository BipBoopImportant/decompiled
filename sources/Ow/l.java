package Ow;

import HJ.C15854t;
import J1.j;
import KC.s;
import Qw.C13453C;
import Qw.C13454D;
import Qw.C13455E;
import Qw.C13463a;
import Tw.C13695h;
import Tw.C13710m;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.animation.k;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.lifecycle.U;
import com.oppwa.mobile.connect.checkout.meta.CheckoutActivityResult;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.provider.AsyncPaymentActivity;
import com.sugarcube.core.logger.DslKt;
import e.C5281d;
import e.C5286i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l0.C5507b;
import l0.e;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qw.i;
import rv.C11849b;
import sl.C11865e;
import x4.C8935A;
import x4.C8948l;
import x4.y;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0001\u0010\u0015\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052$\u0010\u000e\u001a \u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010$\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%\u001a!\u0010(\u001a\u00020\u0007*\u00020\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070&H\u0000¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lx4/y;", "Lx4/A;", "navController", "LTw/h;", "paymentViewModel", "Lkotlin/Function1;", "LQw/a;", "LXH/N;", "onActivityEvent", "Lkotlin/Function2;", "LTw/m$a;", "Le/i;", "Lcom/oppwa/mobile/connect/checkout/meta/CheckoutSettings;", "Lcom/oppwa/mobile/connect/checkout/meta/CheckoutActivityResult;", "startAci", "LTw/m$c;", "startSwish", "LTw/m$b;", "startExternalPayment", "", "reassuranceRoute", "o", "(Lx4/y;Lx4/A;LTw/h;LnI/l;LnI/p;LnI/l;LnI/l;Ljava/lang/String;)V", "LQw/E;", "event", "l", "(Lx4/A;LTw/h;LQw/E;)V", "LQw/E$b;", "m", "(Lx4/A;LQw/E$b;)V", "n", "(Lx4/A;LTw/h;)V", "LKC/s;", "giftCardValidator", "LYg/a;", "giftCardComposable", "h", "(Lx4/y;Lx4/A;LKC/s;LYg/a;)V", "Lkotlin/Function0;", "onDismiss", "j", "(Lx4/y;LnI/a;)V", "onlinepayment-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements r<e, C8948l, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f113606a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Yg.a f113607b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8935A f113608c;

        a(s sVar, Yg.a aVar, C8935A a10) {
            this.f113606a = sVar;
            this.f113607b = aVar;
            this.f113608c = a10;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C8935A a10, C13454D d10) {
            U h10;
            C17542s.j(d10, "result");
            C8948l P10 = a10.P();
            if (!(P10 == null || (h10 = P10.h()) == null)) {
                h10.m("GiftCardFragmentResultBundleKey", d10);
            }
            a10.k0();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C8935A a10) {
            a10.i0();
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(l0.e r9, x4.C8948l r10, U0.C4889m r11, int r12) {
            /*
                r8 = this;
                java.lang.String r0 = "$this$modalNavigationComposable"
                kotlin.jvm.internal.C17542s.j(r9, r0)
                java.lang.String r9 = "it"
                kotlin.jvm.internal.C17542s.j(r10, r9)
                boolean r9 = U0.C4895p.J()
                if (r9 == 0) goto L_0x0019
                r9 = -1
                java.lang.String r10 = "com.ingka.ikea.onlinepayment.impl.navigation.addGiftCardScreen.<anonymous> (PaymentInternalNavigation.kt:184)"
                r0 = -1140100733(0xffffffffbc0b7183, float:-0.00851095)
                U0.C4895p.S(r0, r12, r9, r10)
            L_0x0019:
                r9 = 1890788296(0x70b323c8, float:4.435286E29)
                r11.C(r9)
                m3.a r9 = m3.a.f26247a
                int r10 = m3.a.f26249c
                androidx.lifecycle.k0 r1 = r9.a(r11, r10)
                if (r1 == 0) goto L_0x00c0
                r9 = 0
                androidx.lifecycle.i0$c r3 = f3.a.a(r1, r11, r9)
                r9 = 1729797275(0x671a9c9b, float:7.301333E23)
                r11.C(r9)
                boolean r9 = r1 instanceof androidx.lifecycle.C5212o
                if (r9 == 0) goto L_0x0041
                r9 = r1
                androidx.lifecycle.o r9 = (androidx.lifecycle.C5212o) r9
                l3.a r9 = r9.getDefaultViewModelCreationExtras()
            L_0x003f:
                r4 = r9
                goto L_0x0044
            L_0x0041:
                l3.a$a r9 = l3.a.C0407a.f25486b
                goto L_0x003f
            L_0x0044:
                r6 = 36936(0x9048, float:5.1758E-41)
                r7 = 0
                java.lang.Class<Tw.b> r0 = Tw.C13689b.class
                r2 = 0
                r5 = r11
                androidx.lifecycle.f0 r9 = m3.c.b(r0, r1, r2, r3, r4, r5, r6, r7)
                r11.U()
                r11.U()
                r0 = r9
                Tw.b r0 = (Tw.C13689b) r0
                KC.s r1 = r8.f113606a
                Yg.a r2 = r8.f113607b
                r9 = 631859973(0x25a96b05, float:2.9389346E-16)
                r11.W(r9)
                x4.A r9 = r8.f113608c
                boolean r9 = r11.F(r9)
                x4.A r10 = r8.f113608c
                java.lang.Object r12 = r11.D()
                if (r9 != 0) goto L_0x0079
                U0.m$a r9 = U0.C4889m.f14007a
                java.lang.Object r9 = r9.a()
                if (r12 != r9) goto L_0x0081
            L_0x0079:
                Ow.j r12 = new Ow.j
                r12.<init>(r10)
                r11.u(r12)
            L_0x0081:
                r3 = r12
                nI.l r3 = (nI.C17642l) r3
                r11.P()
                r9 = 631871158(0x25a996b6, float:2.9418952E-16)
                r11.W(r9)
                x4.A r9 = r8.f113608c
                boolean r9 = r11.F(r9)
                x4.A r10 = r8.f113608c
                java.lang.Object r12 = r11.D()
                if (r9 != 0) goto L_0x00a3
                U0.m$a r9 = U0.C4889m.f14007a
                java.lang.Object r9 = r9.a()
                if (r12 != r9) goto L_0x00ab
            L_0x00a3:
                Ow.k r12 = new Ow.k
                r12.<init>(r10)
                r11.u(r12)
            L_0x00ab:
                r4 = r12
                nI.a r4 = (nI.C17631a) r4
                r11.P()
                r6 = 0
                r5 = r11
                Qw.P.e(r0, r1, r2, r3, r4, r5, r6)
                boolean r9 = U0.C4895p.J()
                if (r9 == 0) goto L_0x00bf
                U0.C4895p.R()
            L_0x00bf:
                return
            L_0x00c0:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Ow.l.a.c(l0.e, x4.l, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            c((e) obj, (C8948l) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements r<e, C8948l, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f113609a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f113610a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f113611b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f113612c;

            a(String str, String str2, C17631a<C16807N> aVar) {
                this.f113610a = str;
                this.f113611b = str2;
                this.f113612c = aVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1249592662, i10, -1, "com.ingka.ikea.onlinepayment.impl.navigation.fatalErrorScreen.<anonymous>.<anonymous> (PaymentInternalNavigation.kt:216)");
                    }
                    d a10 = C5116k1.a(d.f18749a, "ErrorDialog");
                    C11865e.i(this.f113610a, this.f113611b, j.b(C11849b.f102170C, mVar, 0), a10, this.f113612c, mVar, 3072, 0);
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

        b(C17631a<C16807N> aVar) {
            this.f113609a = aVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17631a aVar) {
            aVar.invoke();
            return C16807N.f139792a;
        }

        public final void b(e eVar, C8948l lVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$modalNavigationComposable");
            C17542s.j(lVar, "it");
            if (C4895p.J()) {
                C4895p.S(549402748, i10, -1, "com.ingka.ikea.onlinepayment.impl.navigation.fatalErrorScreen.<anonymous> (PaymentInternalNavigation.kt:208)");
            }
            Bundle c10 = lVar.c();
            String str = null;
            String string = c10 != null ? c10.getString("title") : null;
            if (string != null) {
                Bundle c11 = lVar.c();
                if (c11 != null) {
                    str = c11.getString("description");
                }
                if (str != null) {
                    mVar.W(-514600442);
                    boolean V10 = mVar.V(this.f113609a);
                    C17631a<C16807N> aVar = this.f113609a;
                    Object D10 = mVar.D();
                    if (V10 || D10 == C4889m.f14007a.a()) {
                        D10 = new m(aVar);
                        mVar.u(D10);
                    }
                    mVar.P();
                    C5281d.a(false, (C17631a) D10, mVar, 0, 1);
                    TC.e.e(false, c1.c.e(1249592662, true, new a(string, str, this.f113609a), mVar, 54), mVar, 48, 1);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            b((e) obj, (C8948l) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements r<C5507b, C8948l, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13695h f113613a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<C13710m.a, C5286i<CheckoutSettings, CheckoutActivityResult>, C16807N> f113614b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<C13710m.b, C16807N> f113615c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C13710m.c, C16807N> f113616d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8935A f113617e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<C13463a, C16807N> f113618f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f113619a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    Qw.D[] r0 = Qw.C13454D.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Qw.D r1 = Qw.C13454D.FATAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    Qw.D r1 = Qw.C13454D.GIFT_CARD_ADDED     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f113619a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Ow.l.c.a.<clinit>():void");
            }
        }

        c(C13695h hVar, p<? super C13710m.a, ? super C5286i<CheckoutSettings, CheckoutActivityResult>, C16807N> pVar, C17642l<? super C13710m.b, C16807N> lVar, C17642l<? super C13710m.c, C16807N> lVar2, C8935A a10, C17642l<? super C13463a, C16807N> lVar3) {
            this.f113613a = hVar;
            this.f113614b = pVar;
            this.f113615c = lVar;
            this.f113616d = lVar2;
            this.f113617e = a10;
            this.f113618f = lVar3;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C13695h hVar, CheckoutActivityResult checkoutActivityResult) {
            C17542s.g(checkoutActivityResult);
            hVar.m0(checkoutActivityResult);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(C5507b bVar, p pVar, C5286i iVar, C17642l lVar, C17642l lVar2, C13710m mVar) {
            C13710m mVar2 = mVar;
            C17542s.j(mVar2, "startPaymentAction");
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Start payment action: " + mVar2, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = bVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar2.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            if (mVar2 instanceof C13710m.a) {
                p pVar2 = pVar;
                C5286i iVar2 = iVar;
                pVar.invoke(mVar2, iVar);
            } else if (mVar2 instanceof C13710m.b) {
                lVar.invoke(mVar2);
            } else if (mVar2 instanceof C13710m.c) {
                lVar2.invoke(mVar);
            } else {
                throw new t();
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(C5507b bVar, C8935A a10, C13695h hVar, C17642l lVar, C17642l lVar2, C13453C c10) {
            C13453C c11 = c10;
            C17542s.j(c11, "event");
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList) {
                if (str == null) {
                    String a11 = C11818a.a("PaymentScreen event: " + c11, (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str = C11820c.a(a11);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = bVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar2.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            if (c11 instanceof C13455E) {
                C8935A a12 = a10;
                C13695h hVar2 = hVar;
                l.l(a10, hVar, (C13455E) c11);
            } else if (c11 instanceof C13463a) {
                lVar.invoke(c11);
            } else if (c11 instanceof C13453C.a) {
                lVar2.invoke(((C13453C.a) c11).a());
            } else {
                throw new t();
            }
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: Ow.o} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: Ow.p} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: Ow.o} */
        /* JADX WARNING: type inference failed for: r0v12 */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ae, code lost:
            if (r0 == U0.C4889m.f14007a.a()) goto L_0x00b0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f8, code lost:
            if (r1 == U0.C4889m.f14007a.a()) goto L_0x00fa;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(l0.C5507b r9, x4.C8948l r10, U0.C4889m r11, int r12) {
            /*
                r8 = this;
                java.lang.String r0 = "$this$composable"
                kotlin.jvm.internal.C17542s.j(r9, r0)
                java.lang.String r0 = "entry"
                kotlin.jvm.internal.C17542s.j(r10, r0)
                boolean r0 = U0.C4895p.J()
                r1 = -1
                if (r0 == 0) goto L_0x0019
                r0 = -231533894(0xfffffffff23312ba, float:-3.5469092E30)
                java.lang.String r2 = "com.ingka.ikea.onlinepayment.impl.navigation.paymentScreen.<anonymous> (PaymentInternalNavigation.kt:93)"
                U0.C4895p.S(r0, r12, r1, r2)
            L_0x0019:
                androidx.lifecycle.U r10 = r10.h()
                java.lang.String r12 = "GiftCardFragmentResultBundleKey"
                java.lang.Object r10 = r10.f(r12)
                Qw.D r10 = (Qw.C13454D) r10
                if (r10 != 0) goto L_0x0029
                r10 = r1
                goto L_0x0031
            L_0x0029:
                int[] r12 = Ow.l.c.a.f113619a
                int r10 = r10.ordinal()
                r10 = r12[r10]
            L_0x0031:
                if (r10 == r1) goto L_0x0045
                r12 = 1
                if (r10 == r12) goto L_0x0040
                r12 = 2
                if (r10 != r12) goto L_0x003a
                goto L_0x0045
            L_0x003a:
                XH.t r9 = new XH.t
                r9.<init>()
                throw r9
            L_0x0040:
                Tw.h r10 = r8.f113613a
                r10.A0()
            L_0x0045:
                com.oppwa.mobile.connect.checkout.meta.CheckoutActivityResultContract r10 = new com.oppwa.mobile.connect.checkout.meta.CheckoutActivityResultContract
                r10.<init>()
                r12 = -546322772(0xffffffffdf6fc6ac, float:-1.7277686E19)
                r11.W(r12)
                Tw.h r12 = r8.f113613a
                boolean r12 = r11.F(r12)
                Tw.h r0 = r8.f113613a
                java.lang.Object r1 = r11.D()
                if (r12 != 0) goto L_0x0066
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r1 != r12) goto L_0x006e
            L_0x0066:
                Ow.n r1 = new Ow.n
                r1.<init>(r0)
                r11.u(r1)
            L_0x006e:
                nI.l r1 = (nI.C17642l) r1
                r11.P()
                r12 = 0
                e.i r5 = e.C5280c.a(r10, r1, r11, r12)
                r10 = -546317934(0xffffffffdf6fd992, float:-1.7283006E19)
                r11.W(r10)
                boolean r10 = r11.F(r9)
                nI.p<Tw.m$a, e.i<com.oppwa.mobile.connect.checkout.meta.CheckoutSettings, com.oppwa.mobile.connect.checkout.meta.CheckoutActivityResult>, XH.N> r0 = r8.f113614b
                boolean r0 = r11.V(r0)
                r10 = r10 | r0
                boolean r0 = r11.F(r5)
                r10 = r10 | r0
                nI.l<Tw.m$b, XH.N> r0 = r8.f113615c
                boolean r0 = r11.V(r0)
                r10 = r10 | r0
                nI.l<Tw.m$c, XH.N> r0 = r8.f113616d
                boolean r0 = r11.V(r0)
                r10 = r10 | r0
                nI.p<Tw.m$a, e.i<com.oppwa.mobile.connect.checkout.meta.CheckoutSettings, com.oppwa.mobile.connect.checkout.meta.CheckoutActivityResult>, XH.N> r4 = r8.f113614b
                nI.l<Tw.m$b, XH.N> r6 = r8.f113615c
                nI.l<Tw.m$c, XH.N> r7 = r8.f113616d
                java.lang.Object r0 = r11.D()
                if (r10 != 0) goto L_0x00b0
                U0.m$a r10 = U0.C4889m.f14007a
                java.lang.Object r10 = r10.a()
                if (r0 != r10) goto L_0x00ba
            L_0x00b0:
                Ow.o r0 = new Ow.o
                r2 = r0
                r3 = r9
                r2.<init>(r3, r4, r5, r6, r7)
                r11.u(r0)
            L_0x00ba:
                r6 = r0
                nI.l r6 = (nI.C17642l) r6
                r11.P()
                Tw.h r10 = r8.f113613a
                r0 = -546297837(0xffffffffdf702813, float:-1.7305102E19)
                r11.W(r0)
                boolean r0 = r11.F(r9)
                x4.A r1 = r8.f113617e
                boolean r1 = r11.F(r1)
                r0 = r0 | r1
                Tw.h r1 = r8.f113613a
                boolean r1 = r11.F(r1)
                r0 = r0 | r1
                nI.l<Qw.a, XH.N> r1 = r8.f113618f
                boolean r1 = r11.V(r1)
                r0 = r0 | r1
                boolean r1 = r11.V(r6)
                r0 = r0 | r1
                x4.A r3 = r8.f113617e
                Tw.h r4 = r8.f113613a
                nI.l<Qw.a, XH.N> r5 = r8.f113618f
                java.lang.Object r1 = r11.D()
                if (r0 != 0) goto L_0x00fa
                U0.m$a r0 = U0.C4889m.f14007a
                java.lang.Object r0 = r0.a()
                if (r1 != r0) goto L_0x0104
            L_0x00fa:
                Ow.p r0 = new Ow.p
                r1 = r0
                r2 = r9
                r1.<init>(r2, r3, r4, r5, r6)
                r11.u(r0)
            L_0x0104:
                nI.l r1 = (nI.C17642l) r1
                r11.P()
                Qw.w0.G(r10, r1, r11, r12)
                boolean r9 = U0.C4895p.J()
                if (r9 == 0) goto L_0x0115
                U0.C4895p.R()
            L_0x0115:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ow.l.c.e(l0.b, x4.l, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            e((C5507b) obj, (C8948l) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void h(y yVar, C8935A a10, s sVar, Yg.a aVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(a10, "navController");
        C17542s.j(sVar, "giftCardValidator");
        C17542s.j(aVar, "giftCardComposable");
        i.t(yVar, "payment/refundCards?checkout_id={checkout_id}", (List) null, C16877v.e(x4.t.b(new C13327e())), c1.c.c(-1140100733, true, new a(sVar, aVar, a10)), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N i(x4.s sVar) {
        C17542s.j(sVar, "$this$navDeepLink");
        sVar.d("ikea://navigation/payment/refundCards?checkout_id={checkout_id}");
        return C16807N.f139792a;
    }

    public static final void j(y yVar, C17631a<C16807N> aVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(aVar, "onDismiss");
        i.t(yVar, "payment/fatal?title={title}&description={description}", (List) null, C16877v.e(x4.t.b(new C13326d())), c1.c.c(549402748, true, new b(aVar)), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N k(x4.s sVar) {
        C17542s.j(sVar, "$this$navDeepLink");
        sVar.d("ikea://navigation/payment/fatal?title={title}&description={description}");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void l(C8935A a10, C13695h hVar, C13455E e10) {
        if (C17542s.e(e10, C13455E.a.f114770a)) {
            n(a10, hVar);
        } else if (e10 instanceof C13455E.b) {
            m(a10, (C13455E.b) e10);
        } else {
            throw new t();
        }
    }

    private static final void m(C8935A a10, C13455E.b bVar) {
        Uri parse = Uri.parse("ikea://navigation/payment/fatal?title={title}&description={description}");
        C17542s.i(parse, "parse(...)");
        Uri build = ow.c.a(parse).buildUpon().appendQueryParameter("title", bVar.b()).appendQueryParameter("description", bVar.a()).build();
        C17542s.i(build, "build(...)");
        a10.X(build);
    }

    private static final void n(C8935A a10, C13695h hVar) {
        Uri parse = Uri.parse("ikea://navigation/payment/refundCards?checkout_id={checkout_id}");
        C17542s.i(parse, "parse(...)");
        Uri build = ow.c.a(parse).buildUpon().appendQueryParameter(AsyncPaymentActivity.EXTRA_CHECKOUT_ID, hVar.e0()).build();
        C17542s.i(build, "build(...)");
        a10.X(build);
    }

    public static final void o(y yVar, C8935A a10, C13695h hVar, C17642l<? super C13463a, C16807N> lVar, p<? super C13710m.a, ? super C5286i<CheckoutSettings, CheckoutActivityResult>, C16807N> pVar, C17642l<? super C13710m.c, C16807N> lVar2, C17642l<? super C13710m.b, C16807N> lVar3, String str) {
        String str2 = str;
        y yVar2 = yVar;
        C17542s.j(yVar2, "<this>");
        C8935A a11 = a10;
        C17542s.j(a11, "navController");
        C13695h hVar2 = hVar;
        C17542s.j(hVar2, "paymentViewModel");
        C17642l<? super C13463a, C16807N> lVar4 = lVar;
        C17542s.j(lVar4, "onActivityEvent");
        p<? super C13710m.a, ? super C5286i<CheckoutSettings, CheckoutActivityResult>, C16807N> pVar2 = pVar;
        C17542s.j(pVar2, "startAci");
        C17642l<? super C13710m.c, C16807N> lVar5 = lVar2;
        C17542s.j(lVar5, "startSwish");
        C17642l<? super C13710m.b, C16807N> lVar6 = lVar3;
        C17542s.j(lVar6, "startExternalPayment");
        C17542s.j(str2, "reassuranceRoute");
        List q10 = C16877v.q(str2, "payment/refundCards?checkout_id={checkout_id}", "payment/fatal?title={title}&description={description}");
        z4.l.b(yVar2, "payment/options", (List) null, (List) null, new C13328f(q10), new C13329g(q10), new C13330h(q10), new i(q10), (C17642l) null, c1.c.c(-231533894, true, new c(hVar2, pVar2, lVar6, lVar5, a11, lVar4)), 134, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i p(List list, androidx.compose.animation.d dVar) {
        C17542s.j(dVar, "$this$composable");
        return C16877v.l0(list, ((C8948l) dVar.g()).e().C()) ? androidx.compose.animation.i.f17449a.a() : i.m().invoke(dVar);
    }

    /* access modifiers changed from: private */
    public static final k q(List list, androidx.compose.animation.d dVar) {
        C17542s.j(dVar, "$this$composable");
        return C16877v.l0(list, ((C8948l) dVar.a()).e().C()) ? k.f17452a.a() : i.n().invoke(dVar);
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i r(List list, androidx.compose.animation.d dVar) {
        C17542s.j(dVar, "$this$composable");
        return C16877v.l0(list, ((C8948l) dVar.g()).e().C()) ? androidx.compose.animation.i.f17449a.a() : i.o().invoke(dVar);
    }

    /* access modifiers changed from: private */
    public static final k s(List list, androidx.compose.animation.d dVar) {
        C17542s.j(dVar, "$this$composable");
        return C16877v.l0(list, ((C8948l) dVar.a()).e().C()) ? k.f17452a.a() : i.p().invoke(dVar);
    }
}
