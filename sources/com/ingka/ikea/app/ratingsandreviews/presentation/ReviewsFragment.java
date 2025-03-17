package com.ingka.ikea.app.ratingsandreviews.presentation;

import Ni.C10796b;
import Qi.C10903b;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.app.ratingsandreviews.navigation.ReviewsRoute;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import rw.f;
import x4.C8951o;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0014XD¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00078\u0014XD¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u00078\u0014XD¢\u0006\f\n\u0004\b\t\u0010\t\u001a\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/ingka/ikea/app/ratingsandreviews/presentation/ReviewsFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "<init>", "()V", "LXH/N;", "D0", "(LU0/m;I)V", "", "X", "Z", "v0", "()Z", "drawUnderStatusBar", "Y", "u0", "drawUnderNavigationBar", "t0", "drawUnderDisplayCutout", "", "y0", "I", "destId", "LNi/b;", "z0", "LNi/b;", "N0", "()LNi/b;", "setReviewsNavigation", "(LNi/b;)V", "reviewsNavigation", "LRd/a;", "A0", "LRd/a;", "M0", "()LRd/a;", "setAccountNavigation", "(LRd/a;)V", "accountNavigation", "LQi/b;", "B0", "LXH/o;", "O0", "()LQi/b;", "reviewsViewModel", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReviewsFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    public Rd.a f91131A0;

    /* renamed from: B0  reason: collision with root package name */
    private final C16824o f91132B0;

    /* renamed from: X  reason: collision with root package name */
    private final boolean f91133X;

    /* renamed from: Y  reason: collision with root package name */
    private final boolean f91134Y;

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f91135Z;

    /* renamed from: y0  reason: collision with root package name */
    private final int f91136y0 = ReviewsRoute.Companion.a();

    /* renamed from: z0  reason: collision with root package name */
    public C10796b f91137z0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91138c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5187o oVar) {
            super(0);
            this.f91138c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f91138c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91139c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17631a aVar) {
            super(0);
            this.f91139c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f91139c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f91140c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C16824o oVar) {
            super(0);
            this.f91140c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f91140c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91141c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91142d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar, C16824o oVar) {
            super(0);
            this.f91141c = aVar;
            this.f91142d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f91141c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f91142d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91143c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91144d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f91143c = oVar;
            this.f91144d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f91144d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f91143c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ReviewsFragment() {
        C16824o a10 = C16825p.a(s.NONE, new b(new a(this)));
        this.f91132B0 = W.b(this, P.b(C10903b.class), new c(a10), new d((C17631a) null, a10), new e(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C16807N J0(ReviewsFragment reviewsFragment) {
        C8951o f10 = f.f(reviewsFragment, Integer.valueOf(reviewsFragment.f91136y0), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            f10.k0();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K0(ReviewsFragment reviewsFragment) {
        Rd.a M02 = reviewsFragment.M0();
        C5191t requireActivity = reviewsFragment.requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        M02.d(requireActivity);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L0(ReviewsFragment reviewsFragment, String str) {
        C17542s.j(str, "itemNo");
        C8951o f10 = f.f(reviewsFragment, Integer.valueOf(reviewsFragment.f91136y0), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            reviewsFragment.N0().a(f10, str);
        }
        return C16807N.f139792a;
    }

    private final C10903b O0() {
        return (C10903b) this.f91132B0.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: nI.l} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D0(U0.C4889m r10, int r11) {
        /*
            r9 = this;
            r0 = 1394938637(0x5325130d, float:7.0898922E11)
            r10.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.ratingsandreviews.presentation.ReviewsFragment.FragmentContent (ReviewsFragment.kt:36)"
            U0.C4895p.S(r0, r11, r1, r2)
        L_0x0012:
            Qi.b r3 = r9.O0()
            r11 = -1554611475(0xffffffffa35682ed, float:-1.1628688E-17)
            r10.W(r11)
            boolean r11 = r10.F(r9)
            java.lang.Object r0 = r10.D()
            if (r11 != 0) goto L_0x002e
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x0036
        L_0x002e:
            Oi.a r0 = new Oi.a
            r0.<init>(r9)
            r10.u(r0)
        L_0x0036:
            r4 = r0
            nI.a r4 = (nI.C17631a) r4
            r10.P()
            r11 = -1554609262(0xffffffffa3568b92, float:-1.1630518E-17)
            r10.W(r11)
            boolean r11 = r10.F(r9)
            java.lang.Object r0 = r10.D()
            if (r11 != 0) goto L_0x0054
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x005c
        L_0x0054:
            Oi.b r0 = new Oi.b
            r0.<init>(r9)
            r10.u(r0)
        L_0x005c:
            r5 = r0
            nI.a r5 = (nI.C17631a) r5
            r10.P()
            r11 = -1554606498(0xffffffffa356965e, float:-1.1632805E-17)
            r10.W(r11)
            boolean r11 = r10.F(r9)
            java.lang.Object r0 = r10.D()
            if (r11 != 0) goto L_0x007a
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x0082
        L_0x007a:
            Oi.c r0 = new Oi.c
            r0.<init>(r9)
            r10.u(r0)
        L_0x0082:
            r6 = r0
            nI.l r6 = (nI.C17642l) r6
            r10.P()
            r8 = 0
            r7 = r10
            Pi.C10897v.y(r3, r4, r5, r6, r7, r8)
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x0096
            U0.C4895p.R()
        L_0x0096:
            r10.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.ratingsandreviews.presentation.ReviewsFragment.D0(U0.m, int):void");
    }

    public final Rd.a M0() {
        Rd.a aVar = this.f91131A0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("accountNavigation");
        return null;
    }

    public final C10796b N0() {
        C10796b bVar = this.f91137z0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("reviewsNavigation");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f91135Z;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f91134Y;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f91133X;
    }
}
