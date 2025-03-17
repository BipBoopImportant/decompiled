package com.ingka.ikea.scanandgo.cart.impl.dialog;

import Ar.j;
import By.C12671j;
import By.C12674m;
import Gy.d;
import Gy.e;
import Gy.f;
import Gy.g;
import Gy.h;
import Gy.i;
import HJ.C15854t;
import Nd.a;
import Nd.c;
import Nd.h;
import Oo.b;
import Sy.a;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C5197z;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.navigation.NavigationView;
import com.ingka.ikea.scanandgo.cart.impl.dialog.a;
import com.sugarcube.core.logger.DslKt;
import il.C11402b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rz.C15031y;
import tK.C18010a;
import u2.C6012a;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 P2\u00020\u0001:\u0001QB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0003R\"\u0010%\u001a\u00020\u001e8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010\u000b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001b\u0010@\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u001b\u0010\n\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=R\u001b\u0010G\u001a\u00020C8BX\u0002¢\u0006\f\n\u0004\bD\u0010;\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0002¢\u0006\f\n\u0004\bI\u0010;\u001a\u0004\bJ\u0010KR\u0014\u0010O\u001a\u0002068BX\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006R"}, d2 = {"Lcom/ingka/ikea/scanandgo/cart/impl/dialog/CartOverflowMenuBottomSheet;", "Lcom/ingka/ikea/core/android/fragments/BaseBottomSheetDialogFragment;", "<init>", "()V", "Lcom/google/android/material/navigation/NavigationView;", "navigationView", "LXH/N;", "T0", "(Lcom/google/android/material/navigation/NavigationView;)V", "", "productName", "barcode", "V0", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "result", "S0", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "LAr/j;", "O", "LAr/j;", "I0", "()LAr/j;", "setFeedback$cart_implementation_release", "(LAr/j;)V", "feedback", "LSy/a;", "P", "LSy/a;", "L0", "()LSy/a;", "setScanAndGoAnalytics$cart_implementation_release", "(LSy/a;)V", "scanAndGoAnalytics", "LNd/c;", "Q", "LNd/c;", "F0", "()LNd/c;", "setAbTesting$cart_implementation_release", "(LNd/c;)V", "abTesting", "LEy/a;", "R", "LEy/a;", "_binding", "S", "LXH/o;", "G0", "()Ljava/lang/String;", "T", "J0", "productAssortmentType", "U", "K0", "", "X", "N0", "()Z", "showMarkAsCollected", "LNd/a$a;", "Y", "M0", "()LNd/a$a;", "scanAndGoMarkAsCollected", "H0", "()LEy/a;", "binding", "Z", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CartOverflowMenuBottomSheet extends c {

    /* renamed from: Z  reason: collision with root package name */
    public static final a f119840Z = new a((DefaultConstructorMarker) null);

    /* renamed from: y0  reason: collision with root package name */
    public static final int f119841y0 = 8;

    /* renamed from: O  reason: collision with root package name */
    public j f119842O;

    /* renamed from: P  reason: collision with root package name */
    public Sy.a f119843P;

    /* renamed from: Q  reason: collision with root package name */
    public c f119844Q;

    /* renamed from: R  reason: collision with root package name */
    private Ey.a f119845R;

    /* renamed from: S  reason: collision with root package name */
    private final C16824o f119846S = C16825p.b(new d(this));

    /* renamed from: T  reason: collision with root package name */
    private final C16824o f119847T = C16825p.b(new e(this));

    /* renamed from: U  reason: collision with root package name */
    private final C16824o f119848U = C16825p.b(new f(this));

    /* renamed from: X  reason: collision with root package name */
    private final C16824o f119849X = C16825p.b(new g(this));

    /* renamed from: Y  reason: collision with root package name */
    private final C16824o f119850Y = C16825p.b(new h(this));

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/scanandgo/cart/impl/dialog/CartOverflowMenuBottomSheet$a;", "", "<init>", "()V", "", "isCollected", "isSkipped", "Lrz/y;", "pickupType", "b", "(ZZLrz/y;)Z", "", "barcode", "productTitle", "productAssortmentType", "Lcom/ingka/ikea/scanandgo/cart/impl/dialog/CartOverflowMenuBottomSheet;", "a", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lrz/y;)Lcom/ingka/ikea/scanandgo/cart/impl/dialog/CartOverflowMenuBottomSheet;", "BARCODE", "Ljava/lang/String;", "PRODUCT_TITLE", "SHOW_MARK_AS_COLLECTED", "PRODUCT_ASSORTMENT_TYPE", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(boolean z10, boolean z11, C15031y yVar) {
            return !z11 && !z10 && yVar != C15031y.FULL_SERVE;
        }

        public final CartOverflowMenuBottomSheet a(String str, String str2, boolean z10, boolean z11, String str3, C15031y yVar) {
            C17542s.j(str, "barcode");
            C17542s.j(str2, "productTitle");
            C17542s.j(str3, "productAssortmentType");
            C17542s.j(yVar, "pickupType");
            CartOverflowMenuBottomSheet cartOverflowMenuBottomSheet = new CartOverflowMenuBottomSheet();
            cartOverflowMenuBottomSheet.setArguments(D2.d.b(C16796C.a("barcode", str), C16796C.a("product_title", str2), C16796C.a("show_mark_as_collected", Boolean.valueOf(CartOverflowMenuBottomSheet.f119840Z.b(z10, z11, yVar))), C16796C.a("product_assortment_type", str3)));
            return cartOverflowMenuBottomSheet;
        }

        private a() {
        }
    }

    /* access modifiers changed from: private */
    public static final String E0(CartOverflowMenuBottomSheet cartOverflowMenuBottomSheet) {
        String string = cartOverflowMenuBottomSheet.requireArguments().getString("barcode");
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final String G0() {
        return (String) this.f119846S.getValue();
    }

    private final Ey.a H0() {
        Ey.a aVar = this.f119845R;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final String J0() {
        return (String) this.f119847T.getValue();
    }

    private final String K0() {
        return (String) this.f119848U.getValue();
    }

    private final a.C1042a M0() {
        return (a.C1042a) this.f119850Y.getValue();
    }

    private final boolean N0() {
        return ((Boolean) this.f119849X.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final boolean O0(CartOverflowMenuBottomSheet cartOverflowMenuBottomSheet, MenuItem menuItem) {
        C17542s.j(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == C12671j.f108231e) {
            cartOverflowMenuBottomSheet.L0().U();
            cartOverflowMenuBottomSheet.S0(D2.d.b(C16796C.a("CartOverflowMenuBottomSheetBundleKey", new a.C2994a(cartOverflowMenuBottomSheet.G0()))));
            cartOverflowMenuBottomSheet.dismiss();
        } else {
            T t10 = null;
            if (itemId == C12671j.f108233g) {
                Sy.a L02 = cartOverflowMenuBottomSheet.L0();
                String G02 = cartOverflowMenuBottomSheet.G0();
                Iterator<T> it = a.c.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (C17542s.e(((a.c) next).j(), cartOverflowMenuBottomSheet.J0())) {
                        t10 = next;
                        break;
                    }
                }
                a.c cVar = (a.c) t10;
                if (cVar == null) {
                    cVar = a.c.UNKNOWN;
                }
                L02.O(G02, cVar);
                cartOverflowMenuBottomSheet.S0(D2.d.b(C16796C.a("CartOverflowMenuBottomSheetBundleKey", new a.c(cartOverflowMenuBottomSheet.G0()))));
                cartOverflowMenuBottomSheet.dismiss();
            } else if (itemId == C12671j.f108232f) {
                cartOverflowMenuBottomSheet.V0(cartOverflowMenuBottomSheet.K0(), cartOverflowMenuBottomSheet.G0());
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown menu action, menu: " + menuItem);
                qv.e eVar = qv.e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar, false)) {
                        arrayList.add(next2);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    if (str2 == null) {
                        String name = cartOverflowMenuBottomSheet.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str3 = str2;
                    bVar.a(eVar, str3, false, illegalArgumentException, str);
                    str2 = str3;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final String P0(CartOverflowMenuBottomSheet cartOverflowMenuBottomSheet) {
        String string = cartOverflowMenuBottomSheet.requireArguments().getString("product_assortment_type");
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final String Q0(CartOverflowMenuBottomSheet cartOverflowMenuBottomSheet) {
        String string = cartOverflowMenuBottomSheet.requireArguments().getString("product_title");
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final Nd.h R0(CartOverflowMenuBottomSheet cartOverflowMenuBottomSheet) {
        Nd.h hVar = (Nd.h) cartOverflowMenuBottomSheet.F0().c(Nd.g.f62014a, true);
        qv.e eVar = qv.e.DEBUG;
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
                String a10 = C11818a.a("A/B Test: Mark As Collected enabled: " + hVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = CartOverflowMenuBottomSheet.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        return hVar;
    }

    private final void S0(Bundle bundle) {
        C5197z.c(this, "CartOverflowMenuBottomSheetRequestKey", bundle);
    }

    private final void T0(NavigationView navigationView) {
        if (!N0()) {
            navigationView.getMenu().removeItem(C12671j.f108231e);
            navigationView.getMenu().removeItem(C12671j.f108233g);
        } else if (M0() instanceof h.b) {
            navigationView.getMenu().removeItem(C12671j.f108231e);
        } else {
            navigationView.getMenu().removeItem(C12671j.f108233g);
        }
    }

    /* access modifiers changed from: private */
    public static final boolean U0(CartOverflowMenuBottomSheet cartOverflowMenuBottomSheet) {
        return cartOverflowMenuBottomSheet.requireArguments().getBoolean("show_mark_as_collected", false);
    }

    private final void V0(String str, String str2) {
        j I02 = I0();
        Context context = getContext();
        String string = getString(C12674m.f108243C);
        C17542s.i(string, "getString(...)");
        j.a.k(I02, context, string, getString(C12674m.f108283i, str), false, C12674m.f108243C, new i(this, str2), getString(b.f84518U0), (C17631a) null, (C17631a) null, 392, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N W0(CartOverflowMenuBottomSheet cartOverflowMenuBottomSheet, String str) {
        cartOverflowMenuBottomSheet.S0(D2.d.b(C16796C.a("CartOverflowMenuBottomSheetBundleKey", new a.b(str))));
        cartOverflowMenuBottomSheet.dismiss();
        return C16807N.f139792a;
    }

    public final c F0() {
        c cVar = this.f119844Q;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("abTesting");
        return null;
    }

    public final j I0() {
        j jVar = this.f119842O;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final Sy.a L0() {
        Sy.a aVar = this.f119843P;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("scanAndGoAnalytics");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Ey.a c10 = Ey.a.c(layoutInflater);
        this.f119845R = c10;
        NavigationView b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f119845R = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        NavigationView navigationView = H0().f109483b;
        C17542s.i(navigationView, "cartNavigationView");
        View childAt = navigationView.getChildAt(0);
        C17542s.h(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        ((RecyclerView) childAt).j(new C11402b(0, C6012a.c(navigationView.getContext(), C18010a.f147421e), 0, (Drawable) null, 13, (DefaultConstructorMarker) null));
        T0(navigationView);
        navigationView.setNavigationItemSelectedListener(new Gy.c(this));
    }
}
