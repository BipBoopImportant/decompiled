package bh;

import E1.I;
import G1.C4504g;
import J1.j;
import KC.C13131a;
import KC.s;
import O0.C4725e0;
import O0.C4762x0;
import O0.F0;
import O0.G0;
import O0.H0;
import O0.J0;
import O0.L0;
import O0.e1;
import O0.g1;
import QJ.Q;
import QJ.T;
import SC.C13643u0;
import SC.Y2;
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
import XH.y;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.m;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import c2.h;
import com.google.ar.core.ImageMetadata;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import gh.C9742a;
import gh.C9743b;
import gh.i;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;
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
import s0.C5852X;
import s0.C5862h;
import xl.C12317a;
import xl.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0001\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lgh/i;", "checkGiftCardBalanceState", "Lgh/b;", "buyGiftCardUiState", "Lkp/d;", "currencyConfig", "Lkotlin/Function2;", "", "LXH/N;", "onSubmit", "Lkotlin/Function0;", "onInputChanged", "LKC/s;", "giftCardValidator", "onTopAppBarBackClicked", "Lxl/a;", "loginSignUpActions", "Lkotlin/Function1;", "onBuyGiftCards", "onResetServiceError", "onCheckAnotherCard", "e", "(Lgh/i;Lgh/b;Lkp/d;LnI/p;LnI/a;LKC/s;LnI/a;Lxl/a;LnI/l;LnI/a;LnI/a;LU0/m;II)V", "c", "(Lgh/i;Lxl/a;LU0/m;I)V", "giftcard-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: bh.B  reason: case insensitive filesystem */
public final class C9437B {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.GiftCardsScreenKt$GiftCardsScreen$1$1", f = "GiftCardsScreen.kt", l = {85}, m = "invokeSuspend")
    /* renamed from: bh.B$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f65480c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ L0 f65481d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f65482e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f65483f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(L0 l02, String str, C17631a<C16807N> aVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f65481d = l02;
            this.f65482e = str;
            this.f65483f = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f65481d, this.f65482e, this.f65483f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f65480c;
            if (i10 == 0) {
                y.b(obj);
                L0 l02 = this.f65481d;
                String str = this.f65482e;
                J0 j02 = J0.Indefinite;
                this.f65480c = 1;
                if (L0.f(l02, str, (String) null, false, j02, this, 6, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f65483f.invoke();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bh.B$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f65484a;

        b(C17631a<C16807N> aVar) {
            this.f65484a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-737202806, i10, -1, "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.GiftCardsScreen.<anonymous> (GiftCardsScreen.kt:94)");
                }
                ol.p.c(v.BACK, this.f65484a, (androidx.compose.ui.d) null, j.b(Oo.b.f84331B3, mVar, 0), (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, mVar, 6, 500);
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
    /* renamed from: bh.B$c */
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f65485a;

        c(L0 l02) {
            this.f65485a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1665079880, i10, -1, "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.GiftCardsScreen.<anonymous> (GiftCardsScreen.kt:100)");
                }
                Y2.c(this.f65485a, (androidx.compose.ui.d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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
    /* renamed from: bh.B$d */
    static final class d implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ F0 f65486a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f65487b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C12317a f65488c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C9743b f65489d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f65490e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ s f65491f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C11522d f65492g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f65493h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p<String, String, C16807N> f65494i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f65495j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Q f65496k;

        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R,\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0010"}, d2 = {"bh/B$d$a", "LKC/a;", "Lkotlin/Function2;", "", "LXH/N;", "a", "LnI/p;", "c", "()LnI/p;", "onSubmit", "Lkotlin/Function0;", "b", "LnI/a;", "()LnI/a;", "onCardNumberInfoClicked", "onInputChanged", "giftcard-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bh.B$d$a */
        public static final class a implements C13131a {

            /* renamed from: a  reason: collision with root package name */
            private final p<String, String, C16807N> f65497a;

            /* renamed from: b  reason: collision with root package name */
            private final C17631a<C16807N> f65498b;

            /* renamed from: c  reason: collision with root package name */
            private final C17631a<C16807N> f65499c;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
            @f(c = "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.GiftCardsScreenKt$GiftCardsScreen$4$1$1$onCardNumberInfoClicked$1$1", f = "GiftCardsScreen.kt", l = {137}, m = "invokeSuspend")
            /* renamed from: bh.B$d$a$a  reason: collision with other inner class name */
            static final class C1153a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f65500c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ F0 f65501d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C1153a(F0 f02, C17164e<? super C1153a> eVar) {
                    super(2, eVar);
                    this.f65501d = f02;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C1153a(this.f65501d, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C1153a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f65500c;
                    if (i10 == 0) {
                        y.b(obj);
                        F0 f02 = this.f65501d;
                        this.f65500c = 1;
                        if (f02.p(this) == f10) {
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

            a(p<? super String, ? super String, C16807N> pVar, C17631a<C16807N> aVar, Q q10, F0 f02) {
                this.f65497a = pVar;
                this.f65498b = new C9438C(q10, f02);
                this.f65499c = aVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N e(Q q10, F0 f02) {
                QJ.F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new C1153a(f02, (C17164e<? super C1153a>) null), 3, (Object) null);
                return C16807N.f139792a;
            }

            public C17631a<C16807N> a() {
                return this.f65498b;
            }

            public C17631a<C16807N> b() {
                return this.f65499c;
            }

            public p<String, String, C16807N> c() {
                return this.f65497a;
            }
        }

        d(F0 f02, i iVar, C12317a aVar, C9743b bVar, C17642l<? super String, C16807N> lVar, s sVar, C11522d dVar, C17631a<C16807N> aVar2, p<? super String, ? super String, C16807N> pVar, C17631a<C16807N> aVar3, Q q10) {
            this.f65486a = f02;
            this.f65487b = iVar;
            this.f65488c = aVar;
            this.f65489d = bVar;
            this.f65490e = lVar;
            this.f65491f = sVar;
            this.f65492g = dVar;
            this.f65493h = aVar2;
            this.f65494i = pVar;
            this.f65495j = aVar3;
            this.f65496k = q10;
        }

        public final void a(C5834E e10, C4889m mVar, int i10) {
            int i11;
            F0 f02;
            C5834E e11 = e10;
            C4889m mVar2 = mVar;
            C17542s.j(e11, "paddingValues");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(e11) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1533118175, i11, -1, "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.GiftCardsScreen.<anonymous> (GiftCardsScreen.kt:102)");
                }
                d.a aVar = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d b10 = C5852X.b(m.f(D.h(aVar, e11), m.c(0, mVar2, 0, 1), false, (p0.s) null, false, 14, (Object) null));
                i iVar = this.f65487b;
                C12317a aVar2 = this.f65488c;
                C9743b bVar = this.f65489d;
                C17642l<String, C16807N> lVar = this.f65490e;
                s sVar = this.f65491f;
                C11522d dVar = this.f65492g;
                C17631a<C16807N> aVar3 = this.f65493h;
                p<String, String, C16807N> pVar = this.f65494i;
                C17631a<C16807N> aVar4 = this.f65495j;
                Q q10 = this.f65496k;
                F0 f03 = this.f65486a;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e12 = androidx.compose.ui.c.e(mVar2, b10);
                C4504g.a aVar5 = C4504g.f6515W;
                C17631a<C16807N> aVar6 = aVar3;
                C17631a<C4504g> a12 = aVar5.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                C11522d dVar2 = dVar;
                F1.c(a13, a10, aVar5.c());
                F1.c(a13, s10, aVar5.e());
                p<C4504g, Integer, C16807N> b11 = aVar5.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b11);
                }
                F1.c(a13, e12, aVar5.d());
                C5862h hVar = C5862h.f28810a;
                C9437B.c(iVar, aVar2, mVar2, 0);
                s.g(bVar, lVar, mVar2, 0);
                mVar2.W(-1080505090);
                if (C17542s.e(bVar, C9743b.C1276b.f73104a) || C17542s.e(iVar, i.e.f73121a)) {
                    f02 = f03;
                } else {
                    float f10 = (float) 24;
                    f02 = f03;
                    C13643u0.c(D.l(aVar, h.B(f10), h.B((float) 16), h.B(f10), h.B((float) 12)), 0.0f, 0, mVar, 0, 6);
                }
                mVar.P();
                x.d(sVar, iVar, dVar2, new a(pVar, aVar4, q10, f02), aVar6, mVar, 0);
                mVar.x();
                C9445e.g(this.f65486a, mVar2, 0);
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

    /* access modifiers changed from: private */
    public static final void c(i iVar, C12317a aVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(504308770);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(iVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(504308770, i11, -1, "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.GiftCardLoginSignupComposable (GiftCardsScreen.kt:153)");
            }
            if (C17542s.e(iVar, i.e.f73121a)) {
                e.d(Zg.c.f65262p, Zg.c.f65261o, Oo.b.f84824w4, Oo.b.f84376F8, aVar, (androidx.compose.ui.d) null, k10, (i11 << 9) & 57344, 32);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C9436A(iVar, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(i iVar, C12317a aVar, int i10, C4889m mVar, int i11) {
        c(iVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void e(i iVar, C9743b bVar, C11522d dVar, p<? super String, ? super String, C16807N> pVar, C17631a<C16807N> aVar, s sVar, C17631a<C16807N> aVar2, C12317a aVar3, C17642l<? super String, C16807N> lVar, C17631a<C16807N> aVar4, C17631a<C16807N> aVar5, C4889m mVar, int i10, int i11) {
        int i12;
        int i13;
        C4889m mVar2;
        i iVar2 = iVar;
        C9743b bVar2 = bVar;
        C11522d dVar2 = dVar;
        p<? super String, ? super String, C16807N> pVar2 = pVar;
        C17631a<C16807N> aVar6 = aVar;
        s sVar2 = sVar;
        C17631a<C16807N> aVar7 = aVar2;
        C12317a aVar8 = aVar3;
        C17642l<? super String, C16807N> lVar2 = lVar;
        C17631a<C16807N> aVar9 = aVar4;
        C17631a<C16807N> aVar10 = aVar5;
        int i14 = i10;
        C17542s.j(iVar2, "checkGiftCardBalanceState");
        C17542s.j(bVar2, "buyGiftCardUiState");
        C17542s.j(dVar2, "currencyConfig");
        C17542s.j(pVar2, "onSubmit");
        C17542s.j(aVar6, "onInputChanged");
        C17542s.j(sVar2, "giftCardValidator");
        C17542s.j(aVar7, "onTopAppBarBackClicked");
        C17542s.j(aVar8, "loginSignUpActions");
        C17542s.j(lVar2, "onBuyGiftCards");
        C17542s.j(aVar9, "onResetServiceError");
        C17542s.j(aVar10, "onCheckAnotherCard");
        C4889m k10 = mVar.k(-587683634);
        if ((i14 & 6) == 0) {
            i12 = (k10.V(iVar2) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        if ((i14 & 48) == 0) {
            i12 |= k10.V(bVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i12 |= k10.F(dVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i12 |= k10.F(pVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i14 & 24576) == 0) {
            i12 |= k10.F(aVar6) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i12 |= k10.F(sVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i14) == 0) {
            i12 |= k10.F(aVar7) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i14) == 0) {
            i12 |= k10.F(aVar8) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i12 |= k10.F(lVar2) ? 67108864 : 33554432;
        }
        if ((805306368 & i14) == 0) {
            i12 |= k10.F(aVar9) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (k10.F(aVar10) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i12 & 306783379) == 306783378 && (i13 & 3) == 2 && k10.l()) {
            k10.L();
            mVar2 = k10;
        } else {
            if (C4895p.J()) {
                C4895p.S(-587683634, i12, i13, "com.ingka.ikea.app.mcommerce.giftcard.impl.compose.GiftCardsScreen (GiftCardsScreen.kt:66)");
            }
            Object D10 = k10.D();
            C4889m.a aVar11 = C4889m.f14007a;
            if (D10 == aVar11.a()) {
                B b10 = new B(P.k(C17169j.f142968a, k10));
                k10.u(b10);
                D10 = b10;
            }
            Q a10 = ((B) D10).a();
            k10.W(2055600291);
            Object D11 = k10.D();
            if (D11 == aVar11.a()) {
                D11 = new L0();
                k10.u(D11);
            }
            L0 l02 = (L0) D11;
            k10.P();
            F0 l10 = C4725e0.l(true, (C17642l<? super G0, Boolean>) null, k10, 6, 2);
            C9742a b11 = iVar2 instanceof i.c ? ((i.c) iVar2).b() : null;
            k10.W(2055611294);
            if (C17542s.e(b11, C9742a.b.f73100a)) {
                String b12 = j.b(Oo.b.f84321A3, k10, 0);
                k10.W(2055616837);
                boolean V10 = ((i12 & 1879048192) == 536870912) | k10.V(b12);
                Object D12 = k10.D();
                if (V10 || D12 == aVar11.a()) {
                    D12 = new a(l02, b12, aVar9, (C17164e<? super a>) null);
                    k10.u(D12);
                }
                k10.P();
                P.g(b11, (p) D12, k10, 0);
            }
            k10.P();
            C5264a e10 = c1.c.e(-737202806, true, new b(aVar7), k10, 54);
            C5264a e11 = c1.c.e(1665079880, true, new c(l02), k10, 54);
            mVar2 = k10;
            d dVar3 = r0;
            d dVar4 = new d(l10, iVar, aVar3, bVar, lVar, sVar, dVar, aVar5, pVar, aVar, a10);
            C4762x0.a((androidx.compose.ui.d) null, e10, (p<? super C4889m, ? super Integer, C16807N>) null, e11, (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, (C5848T) null, c1.c.e(1533118175, true, dVar3, mVar2, 54), mVar2, 805309488, 501);
            if (C4895p.J()) {
                C4895p.R();
            }
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new z(iVar, bVar, dVar, pVar, aVar, sVar, aVar2, aVar3, lVar, aVar4, aVar5, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(i iVar, C9743b bVar, C11522d dVar, p pVar, C17631a aVar, s sVar, C17631a aVar2, C12317a aVar3, C17642l lVar, C17631a aVar4, C17631a aVar5, int i10, int i11, C4889m mVar, int i12) {
        e(iVar, bVar, dVar, pVar, aVar, sVar, aVar2, aVar3, lVar, aVar4, aVar5, mVar, M0.a(i10 | 1), M0.a(i11));
        return C16807N.f139792a;
    }
}
