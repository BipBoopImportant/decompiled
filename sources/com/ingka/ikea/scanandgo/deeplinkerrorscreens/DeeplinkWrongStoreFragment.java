package com.ingka.ikea.scanandgo.deeplinkerrorscreens;

import Ez.f;
import IC.C13023e;
import IC.C13026h;
import Oo.b;
import SC.C13651w0;
import SC.W1;
import SC.Z1;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import androidx.compose.ui.d;
import c1.c;
import cp.C11176a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import uz.C15123a;
import uz.g;
import uz.h;
import uz.i;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001b\u0010'\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\fR\u001b\u0010*\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010\f¨\u0006+"}, d2 = {"Lcom/ingka/ikea/scanandgo/deeplinkerrorscreens/DeeplinkWrongStoreFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeDialogFragment;", "", "<init>", "()V", "LXH/N;", "u0", "(LU0/m;I)V", "", "Q", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "Lkotlin/Function0;", "R", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "LZs/a;", "S", "LZs/a;", "E0", "()LZs/a;", "setInStoreNavigation", "(LZs/a;)V", "inStoreNavigation", "Lcp/a;", "T", "Lcp/a;", "H0", "()Lcp/a;", "setUriDecoder", "(Lcp/a;)V", "uriDecoder", "U", "LXH/o;", "F0", "newStoreName", "X", "G0", "oldStoreName", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeeplinkWrongStoreFragment extends h {

    /* renamed from: Q  reason: collision with root package name */
    private final String f120169Q = "scanandgo/dialog/wrongStore?oldStore={oldStore}&newStore={newStore}";

    /* renamed from: R  reason: collision with root package name */
    private final C17631a<C16807N> f120170R = new g();

    /* renamed from: S  reason: collision with root package name */
    public Zs.a f120171S;

    /* renamed from: T  reason: collision with root package name */
    public C11176a f120172T;

    /* renamed from: U  reason: collision with root package name */
    private final C16824o f120173U = C16825p.b(new h(this));

    /* renamed from: X  reason: collision with root package name */
    private final C16824o f120174X = C16825p.b(new i(this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DeeplinkWrongStoreFragment f120175a;

        a(DeeplinkWrongStoreFragment deeplinkWrongStoreFragment) {
            this.f120175a = deeplinkWrongStoreFragment;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(DeeplinkWrongStoreFragment deeplinkWrongStoreFragment) {
            deeplinkWrongStoreFragment.E0().b(androidx.navigation.fragment.a.a(deeplinkWrongStoreFragment));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(DeeplinkWrongStoreFragment deeplinkWrongStoreFragment) {
            deeplinkWrongStoreFragment.dismiss();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(DeeplinkWrongStoreFragment deeplinkWrongStoreFragment) {
            deeplinkWrongStoreFragment.dismiss();
            return C16807N.f139792a;
        }

        public final void e(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-264332163, i10, -1, "com.ingka.ikea.scanandgo.deeplinkerrorscreens.DeeplinkWrongStoreFragment.DialogContent.<anonymous> (DeeplinkWrongStoreFragment.kt:55)");
                }
                C13023e f10 = C13026h.f(f.f109722r0, C16877v.q(this.f120175a.G0(), this.f120175a.F0()));
                int i11 = C13023e.f110931a;
                String a10 = f10.a(mVar, i11);
                String a11 = C13026h.a(f.f109726t0).a(mVar, i11);
                mVar.W(513276961);
                boolean F10 = mVar.F(this.f120175a);
                DeeplinkWrongStoreFragment deeplinkWrongStoreFragment = this.f120175a;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new d(deeplinkWrongStoreFragment);
                    mVar.u(D10);
                }
                mVar.P();
                W1 w12 = new W1(a11, (C17631a) D10);
                String a12 = C13026h.a(b.f84518U0).a(mVar, i11);
                mVar.W(513285365);
                boolean F11 = mVar.F(this.f120175a);
                DeeplinkWrongStoreFragment deeplinkWrongStoreFragment2 = this.f120175a;
                Object D11 = mVar.D();
                if (F11 || D11 == C4889m.f14007a.a()) {
                    D11 = new e(deeplinkWrongStoreFragment2);
                    mVar.u(D11);
                }
                mVar.P();
                W1 w13 = new W1(a12, (C17631a) D11);
                C13651w0 w0Var = C13651w0.Stacked;
                mVar.W(513296589);
                boolean F12 = mVar.F(this.f120175a);
                DeeplinkWrongStoreFragment deeplinkWrongStoreFragment3 = this.f120175a;
                Object D12 = mVar.D();
                if (F12 || D12 == C4889m.f14007a.a()) {
                    D12 = new f(deeplinkWrongStoreFragment3);
                    mVar.u(D12);
                }
                mVar.P();
                p<C4889m, Integer, C16807N> a13 = C15123a.f131395a.a();
                int i12 = W1.f116045c;
                Z1.c(a10, w12, w13, (C17631a) D12, (d) null, w0Var, (androidx.compose.ui.window.h) null, a13, mVar, (i12 << 3) | 12779520 | (i12 << 6), 80);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            e((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N D0() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final String F0() {
        return (String) this.f120173U.getValue();
    }

    /* access modifiers changed from: private */
    public final String G0() {
        return (String) this.f120174X.getValue();
    }

    /* access modifiers changed from: private */
    public static final String I0(DeeplinkWrongStoreFragment deeplinkWrongStoreFragment) {
        C11176a H02 = deeplinkWrongStoreFragment.H0();
        String string = deeplinkWrongStoreFragment.requireArguments().getString("newStore");
        if (string != null) {
            return H02.a(string);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final String J0(DeeplinkWrongStoreFragment deeplinkWrongStoreFragment) {
        C11176a H02 = deeplinkWrongStoreFragment.H0();
        String string = deeplinkWrongStoreFragment.requireArguments().getString("oldStore");
        if (string != null) {
            return H02.a(string);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final Zs.a E0() {
        Zs.a aVar = this.f120171S;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("inStoreNavigation");
        return null;
    }

    public final C11176a H0() {
        C11176a aVar = this.f120172T;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("uriDecoder");
        return null;
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(-78919785);
        if (C4895p.J()) {
            C4895p.S(-78919785, i10, -1, "com.ingka.ikea.scanandgo.deeplinkerrorscreens.DeeplinkWrongStoreFragment.DialogContent (DeeplinkWrongStoreFragment.kt:53)");
        }
        e.e(false, c.e(-264332163, true, new a(this), mVar, 54), mVar, 48, 1);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}
