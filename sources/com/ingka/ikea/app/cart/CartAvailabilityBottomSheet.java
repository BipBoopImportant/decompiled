package com.ingka.ikea.app.cart;

import IC.C13023e;
import IC.C13026h;
import Kf.C9136e;
import Of.C9183j;
import QJ.Q;
import Qf.a;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import XH.y;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import com.ingka.ikea.app.cart.a;
import com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment;
import dI.C17164e;
import eI.C17187b;
import hg.v;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.p;
import sf.C10243d;
import x4.C8948l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0015¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/ingka/ikea/app/cart/CartAvailabilityBottomSheet;", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;", "<init>", "()V", "LOf/j;", "O0", "()LOf/j;", "LOf/j$a;", "action", "LXH/N;", "P0", "(LOf/j$a;)V", "u0", "(LU0/m;I)V", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "D0", "()Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "Lhg/v;", "U", "LXH/o;", "N0", "()Lhg/v;", "cartViewModel", "LQf/a;", "X", "M0", "()LQf/a;", "availabilityModel", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CartAvailabilityBottomSheet extends c {

    /* renamed from: U  reason: collision with root package name */
    private final C16824o f71590U;

    /* renamed from: X  reason: collision with root package name */
    private final C16824o f71591X = C16825p.b(new C9136e(this));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.CartAvailabilityBottomSheet$BottomSheetContent$2$1", f = "CartAvailabilityBottomSheet.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f71592c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CartAvailabilityBottomSheet f71593d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(CartAvailabilityBottomSheet cartAvailabilityBottomSheet, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f71593d = cartAvailabilityBottomSheet;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f71593d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f71592c == 0) {
                y.b(obj);
                this.f71593d.x0();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f71594a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f71595b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        static {
            /*
                sf.d[] r0 = sf.C10243d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                sf.d r2 = sf.C10243d.HOME     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                sf.d r3 = sf.C10243d.CLICK_AND_COLLECT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f71594a = r0
                Of.j$a[] r0 = Of.C9183j.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Of.j$a r3 = Of.C9183j.a.HOME_DELIVERY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                Of.j$a r1 = Of.C9183j.a.COLLECT_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                Of.j$a r1 = Of.C9183j.a.EXPLAIN_DISCREPANCY     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                Of.j$a r1 = Of.C9183j.a.CHANGE_STORE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                Of.j$a r1 = Of.C9183j.a.CHANGE_POSTAL_CODE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                f71595b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.cart.CartAvailabilityBottomSheet.b.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C17631a<C8948l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f71596a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f71597b;

        public c(C5187o oVar, String str) {
            this.f71596a = oVar;
            this.f71597b = str;
        }

        /* renamed from: a */
        public final C8948l invoke() {
            return androidx.navigation.fragment.a.a(this.f71596a).E(this.f71597b);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d implements C17631a<j0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16824o f71598a;

        public d(C16824o oVar) {
            this.f71598a = oVar;
        }

        /* renamed from: a */
        public final j0 invoke() {
            return rw.a.c(this.f71598a).getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e implements C17631a<i0.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f71599a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16824o f71600b;

        public e(C5187o oVar, C16824o oVar2) {
            this.f71599a = oVar;
            this.f71600b = oVar2;
        }

        /* renamed from: a */
        public final i0.c invoke() {
            C5191t requireActivity = this.f71599a.requireActivity();
            C17542s.i(requireActivity, "requireActivity(...)");
            return e3.a.b(requireActivity, rw.a.c(this.f71600b));
        }
    }

    public CartAvailabilityBottomSheet() {
        C16824o b10 = C16825p.b(new c(this, "cart"));
        this.f71590U = W.c(this, P.b(v.class), new d(b10), (C17631a) null, new e(this, b10), 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N J0(CartAvailabilityBottomSheet cartAvailabilityBottomSheet, C9183j.a aVar) {
        C17542s.j(aVar, "it");
        cartAvailabilityBottomSheet.P0(aVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Qf.a L0(CartAvailabilityBottomSheet cartAvailabilityBottomSheet) {
        Qf.a B02 = cartAvailabilityBottomSheet.N0().B0();
        if (B02 != null) {
            return B02;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final Qf.a M0() {
        return (Qf.a) this.f71591X.getValue();
    }

    private final v N0() {
        return (v) this.f71590U.getValue();
    }

    private final C9183j O0() {
        String str;
        C9183j.a aVar;
        C10243d j10 = M0().j();
        int[] iArr = b.f71594a;
        int i10 = iArr[j10.ordinal()];
        boolean z10 = true;
        if (i10 == 1) {
            str = getString(Oo.b.f84667i1);
        } else if (i10 == 2) {
            str = getString(Oo.b.f84678j1);
        } else {
            throw new t();
        }
        C17542s.g(str);
        C13023e c10 = C13026h.c(str);
        int i11 = iArr[M0().j().ordinal()];
        if (i11 == 1) {
            aVar = C9183j.a.CHANGE_POSTAL_CODE;
        } else if (i11 == 2) {
            aVar = C9183j.a.CHANGE_STORE;
        } else {
            throw new t();
        }
        C9183j.c cVar = new C9183j.c(c10, aVar);
        String i12 = M0().i();
        C9183j.b bVar = new C9183j.b(M0().h(), M0().j() == C10243d.HOME);
        a.b.C1070a g10 = M0().g();
        if (M0().j() != C10243d.CLICK_AND_COLLECT) {
            z10 = false;
        }
        return new C9183j((C13023e) null, (C13023e) null, (C13023e) null, cVar, i12, bVar, new C9183j.b(g10, z10), M0().q(), 7, (DefaultConstructorMarker) null);
    }

    private final void P0(C9183j.a aVar) {
        a.C1226a aVar2;
        int i10 = b.f71595b[aVar.ordinal()];
        if (i10 == 1) {
            aVar2 = a.C1226a.SELECT_HOME;
        } else if (i10 == 2) {
            aVar2 = a.C1226a.SELECT_CLICK_COLLECT;
        } else if (i10 == 3) {
            aVar2 = a.C1226a.EXPLAIN_DISCREPANCY;
        } else if (i10 == 4) {
            aVar2 = a.C1226a.CHANGE_STORE;
        } else if (i10 == 5) {
            aVar2 = a.C1226a.CHANGE_POSTAL_CODE;
        } else {
            throw new t();
        }
        rw.d.a(this, new a(aVar2), "CartAvailabilityBottomSheetSheetRequestKey");
        dismiss();
    }

    /* access modifiers changed from: protected */
    public BottomSheetComposeDialogFragment.a D0() {
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: nI.l} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u0(U0.C4889m r10, int r11) {
        /*
            r9 = this;
            r0 = -334785929(0xffffffffec0b9277, float:-6.749294E26)
            r10.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.cart.CartAvailabilityBottomSheet.BottomSheetContent (CartAvailabilityBottomSheet.kt:35)"
            U0.C4895p.S(r0, r11, r1, r2)
        L_0x0012:
            Of.j r3 = r9.O0()
            r11 = 324388298(0x1355c5ca, float:2.6981897E-27)
            r10.W(r11)
            boolean r11 = r10.F(r9)
            java.lang.Object r0 = r10.D()
            if (r11 != 0) goto L_0x002e
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x0036
        L_0x002e:
            Kf.d r0 = new Kf.d
            r0.<init>(r9)
            r10.u(r0)
        L_0x0036:
            r4 = r0
            nI.l r4 = (nI.C17642l) r4
            r10.P()
            int r7 = IC.C13023e.f110931a
            r8 = 4
            r5 = 0
            r6 = r10
            Of.C9167e.d(r3, r4, r5, r6, r7, r8)
            XH.N r11 = XH.C16807N.f139792a
            r0 = 324391545(0x1355d279, float:2.698815E-27)
            r10.W(r0)
            boolean r0 = r10.F(r9)
            java.lang.Object r1 = r10.D()
            if (r0 != 0) goto L_0x005e
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0067
        L_0x005e:
            com.ingka.ikea.app.cart.CartAvailabilityBottomSheet$a r1 = new com.ingka.ikea.app.cart.CartAvailabilityBottomSheet$a
            r0 = 0
            r1.<init>(r9, r0)
            r10.u(r1)
        L_0x0067:
            nI.p r1 = (nI.p) r1
            r10.P()
            r0 = 6
            U0.P.g(r11, r1, r10, r0)
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x0079
            U0.C4895p.R()
        L_0x0079:
            r10.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.cart.CartAvailabilityBottomSheet.u0(U0.m, int):void");
    }
}
