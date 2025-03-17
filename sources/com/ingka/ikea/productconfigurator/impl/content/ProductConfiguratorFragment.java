package com.ingka.ikea.productconfigurator.impl.content;

import HJ.C15854t;
import Kf.C9133b;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.x;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.C5197z;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.uicomponents.view.LoadingMaterialButton;
import com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView;
import com.ingka.ikea.core.android.view.IkeaToolBar;
import com.sugarcube.core.logger.DslKt;
import ds.C11239c;
import il.C11401a;
import ip.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rx.C15004a;
import tK.C18010a;
import tf.C10253a;
import tx.C15095b;
import tx.h;
import tx.i;
import tx.k;
import tx.l;
import tx.m;
import tx.n;
import tx.o;
import tx.p;
import tx.q;
import tx.r;
import tx.w;
import u2.C6012a;
import uK.C18146a;
import ux.C15120a;
import vg.g;
import wx.C15193a;
import xx.C15269a;
import xx.C15270b;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020!2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u0004R\u001a\u0010,\u001a\u00020\u00078\u0016XD¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\u00078\u0002@\u0002X.¢\u0006\u0006\n\u0004\b9\u0010)R\"\u0010B\u001a\u00020;8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001b\u0010X\u001a\u00020S8BX\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001b\u0010[\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\bY\u0010U\u001a\u0004\bZ\u0010+R\u001b\u0010`\u001a\u00020\\8BX\u0002¢\u0006\f\n\u0004\b]\u0010U\u001a\u0004\b^\u0010_R\u0014\u0010c\u001a\u00020-8BX\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010f\u001a\u0002018BX\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010i\u001a\u0002058BX\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006j"}, d2 = {"Lcom/ingka/ikea/productconfigurator/impl/content/ProductConfiguratorFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "", "<init>", "()V", "LXH/N;", "j1", "", "price", "f1", "(Ljava/lang/String;)V", "Lxx/a;", "addToCartData", "g1", "(Lxx/a;)V", "itemNo", "U0", "", "throwable", "R0", "(Ljava/lang/Throwable;)V", "S0", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "P", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "Lux/a;", "Q", "Lux/a;", "_configBinding", "Ltx/b;", "R", "Ltx/b;", "_facetsAdapter", "Ltx/w;", "S", "Ltx/w;", "_valuesAdapter", "T", "selectedItemNo", "LKf/b;", "U", "LKf/b;", "I0", "()LKf/b;", "setCartApi", "(LKf/b;)V", "cartApi", "Ltf/a;", "X", "Ltf/a;", "N0", "()Ltf/a;", "setKillSwitchRepository", "(Ltf/a;)V", "killSwitchRepository", "Lds/c;", "Y", "Lds/c;", "L0", "()Lds/c;", "setImageLoader", "(Lds/c;)V", "imageLoader", "Lxx/b;", "Z", "LXH/o;", "Q0", "()Lxx/b;", "viewModel", "y0", "M0", "initialItemNo", "Lrx/a;", "z0", "O0", "()Lrx/a;", "productConfiguratorMode", "J0", "()Lux/a;", "configBinding", "K0", "()Ltx/b;", "facetsAdapter", "P0", "()Ltx/w;", "valuesAdapter", "productconfigurator-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductConfiguratorFragment extends a {

    /* renamed from: P  reason: collision with root package name */
    private final String f119372P = "productConfigurator?itemNo={itemNo}&productConfiguratorMode={productConfiguratorMode}";

    /* renamed from: Q  reason: collision with root package name */
    private C15120a f119373Q;

    /* renamed from: R  reason: collision with root package name */
    private C15095b f119374R;

    /* renamed from: S  reason: collision with root package name */
    private w f119375S;

    /* renamed from: T  reason: collision with root package name */
    private String f119376T;

    /* renamed from: U  reason: collision with root package name */
    public C9133b f119377U;

    /* renamed from: X  reason: collision with root package name */
    public C10253a f119378X;

    /* renamed from: Y  reason: collision with root package name */
    public C11239c f119379Y;

    /* renamed from: Z  reason: collision with root package name */
    private final C16824o f119380Z;

    /* renamed from: y0  reason: collision with root package name */
    private final C16824o f119381y0;

    /* renamed from: z0  reason: collision with root package name */
    private final C16824o f119382z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f119383a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                rx.a[] r0 = rx.C15004a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                rx.a r1 = rx.C15004a.MODIFY_ITEM_WITH_RESULT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                rx.a r1 = rx.C15004a.LIST_CART_ACTIONS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f119383a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.productconfigurator.impl.content.ProductConfiguratorFragment.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f119384c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f119384c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f119384c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f119385c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f119385c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f119385c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f119386c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f119386c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f119386c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f119387c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f119388d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f119387c = aVar;
            this.f119388d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f119387c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f119388d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f119389c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f119390d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f119389c = oVar;
            this.f119390d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f119390d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f119389c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ProductConfiguratorFragment() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f119380Z = W.b(this, P.b(C15270b.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
        this.f119381y0 = C16825p.b(new r(this));
        this.f119382z0 = C16825p.b(new tx.f(this));
    }

    private final C15120a J0() {
        C15120a aVar = this.f119373Q;
        C17542s.g(aVar);
        return aVar;
    }

    private final C15095b K0() {
        C15095b bVar = this.f119374R;
        C17542s.g(bVar);
        return bVar;
    }

    private final String M0() {
        return (String) this.f119381y0.getValue();
    }

    private final C15004a O0() {
        return (C15004a) this.f119382z0.getValue();
    }

    private final w P0() {
        w wVar = this.f119375S;
        C17542s.g(wVar);
        return wVar;
    }

    private final C15270b Q0() {
        return (C15270b) this.f119380Z.getValue();
    }

    private final void R0(Throwable th2) {
        Context context = getContext();
        if (context != null) {
            C9133b I02 = I0();
            String value = Q0().R().getValue();
            if (value == null) {
                value = "";
            }
            CoordinatorLayout coordinatorLayout = J0().f131387i;
            C17542s.i(coordinatorLayout, "snackbarParent");
            I02.showAddToCartException(context, coordinatorLayout, th2, value);
        }
    }

    private final void S0() {
        C15270b Q02 = Q0();
        String str = this.f119376T;
        String str2 = null;
        if (str == null) {
            C17542s.z("selectedItemNo");
            str = null;
        }
        if (Q02.S(str)) {
            String str3 = this.f119376T;
            if (str3 == null) {
                C17542s.z("selectedItemNo");
            } else {
                str2 = str3;
            }
            C5197z.c(this, "ProductConfiguratorResultRequestKey", D2.d.b(C16796C.a("ProductConfiguratorResultItemNo", str2)));
        }
    }

    /* access modifiers changed from: private */
    public static final String T0(ProductConfiguratorFragment productConfiguratorFragment) {
        return productConfiguratorFragment.Q0().N();
    }

    private final void U0(String str) {
        Q0().T(str);
        this.f119376T = str;
    }

    /* access modifiers changed from: private */
    public static final C16807N V0(ProductConfiguratorFragment productConfiguratorFragment, String str) {
        C17542s.j(str, "productTitle");
        C5191t activity = productConfiguratorFragment.getActivity();
        C17542s.h(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.appcompat.app.a supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A(str);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N W0(ProductConfiguratorFragment productConfiguratorFragment, boolean z10) {
        HorizontalProgressView horizontalProgressView = productConfiguratorFragment.J0().f131385g;
        C17542s.i(horizontalProgressView, "progress");
        horizontalProgressView.setVisibility(z10 ? 0 : 8);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N X0(ProductConfiguratorFragment productConfiguratorFragment, String str) {
        C17542s.j(str, "imageUrl");
        C11239c L02 = productConfiguratorFragment.L0();
        ImageView imageView = productConfiguratorFragment.J0().f131384f;
        C17542s.i(imageView, "image");
        C11239c.a.d(L02, imageView, str, (g.b) null, (C17642l) null, 12, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y0(ProductConfiguratorFragment productConfiguratorFragment, C15269a aVar) {
        C17542s.j(aVar, "addToCartData");
        productConfiguratorFragment.g1(aVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Z0(ProductConfiguratorFragment productConfiguratorFragment, x xVar) {
        boolean z10;
        Object j10 = xVar.j();
        Throwable e10 = x.e(j10);
        if (e10 == null) {
            ((Boolean) j10).booleanValue();
            z10 = true;
        } else {
            productConfiguratorFragment.R0(e10);
            z10 = false;
        }
        productConfiguratorFragment.J0().f131380b.p(z10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N a1(ProductConfiguratorFragment productConfiguratorFragment, List list) {
        C17542s.j(list, "facets");
        if (!productConfiguratorFragment.K0().i(list)) {
            String str = productConfiguratorFragment.f119376T;
            if (str == null) {
                C17542s.z("selectedItemNo");
                str = null;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Facet missing: " + str + " !");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = ProductConfiguratorFragment.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalStateException, str4);
                str2 = str4;
                str3 = str5;
            }
            productConfiguratorFragment.S0();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N b1(ProductConfiguratorFragment productConfiguratorFragment, List list) {
        C17542s.j(list, "values");
        productConfiguratorFragment.P0().i(list);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N c1(ProductConfiguratorFragment productConfiguratorFragment, wx.c cVar) {
        C17542s.j(cVar, "value");
        productConfiguratorFragment.U0(cVar.c());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N d1(ProductConfiguratorFragment productConfiguratorFragment, String str) {
        C17542s.j(str, "price");
        productConfiguratorFragment.f1(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C15004a e1(ProductConfiguratorFragment productConfiguratorFragment) {
        return productConfiguratorFragment.Q0().P();
    }

    private final void f1(String str) {
        int i10;
        C15004a O02 = O0();
        int[] iArr = a.f119383a;
        int i11 = iArr[O02.ordinal()];
        if (i11 == 1) {
            i10 = Oo.b.f84767r2;
        } else if (i11 == 2) {
            i10 = Oo.b.f84487R;
        } else {
            throw new t();
        }
        String str2 = getString(i10) + " " + str;
        Context context = getContext();
        SpannableString spannableString = new SpannableString(str2);
        int length = C15854t.t1(str2, str, (String) null, 2, (Object) null).length();
        int length2 = str2.length();
        if (str2.length() == length || context == null || length + 1 == length2) {
            J0().f131382d.setText(str2);
            return;
        }
        spannableString.setSpan(new ForegroundColorSpan(C6012a.c(context, C18010a.f147429m)), length, length2, 33);
        int i12 = iArr[O0().ordinal()];
        if (i12 == 1) {
            J0().f131382d.setText(spannableString);
        } else if (i12 == 2) {
            J0().f131380b.setText(spannableString.toString());
        } else {
            throw new t();
        }
    }

    private final void g1(C15269a aVar) {
        boolean z10 = aVar.b() && N0().b();
        int i10 = a.f119383a[O0().ordinal()];
        if (i10 == 1) {
            MaterialButton materialButton = J0().f131382d;
            materialButton.setVisibility(0);
            materialButton.setOnClickListener(new h(this));
            J0().f131380b.setVisibility(8);
            J0().f131381c.setVisibility(8);
        } else if (i10 == 2) {
            J0().f131382d.setVisibility(8);
            J0().f131380b.setVisibility(8);
            J0().f131381c.setVisibility(8);
            if (z10) {
                LoadingMaterialButton loadingMaterialButton = J0().f131380b;
                loadingMaterialButton.setVisibility(0);
                loadingMaterialButton.setOnClickListener(new i(loadingMaterialButton, this));
                String a10 = aVar.a();
                if (a10 != null) {
                    TextView textView = J0().f131381c;
                    textView.setVisibility(0);
                    textView.setText(a10);
                }
            }
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public static final void h1(ProductConfiguratorFragment productConfiguratorFragment, View view) {
        productConfiguratorFragment.S0();
        productConfiguratorFragment.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void i1(LoadingMaterialButton loadingMaterialButton, ProductConfiguratorFragment productConfiguratorFragment, View view) {
        if (!loadingMaterialButton.j()) {
            loadingMaterialButton.o();
            C15270b Q02 = productConfiguratorFragment.Q0();
            String str = productConfiguratorFragment.f119376T;
            if (str == null) {
                C17542s.z("selectedItemNo");
                str = null;
            }
            Q02.I(str, Interaction$Component.PRODUCT_CONFIGURATOR);
        }
    }

    private final void j1() {
        IkeaToolBar ikeaToolBar = J0().f131388j;
        ikeaToolBar.setNavigationIcon(C18146a.f148142M2);
        ikeaToolBar.setNavigationContentDescription((CharSequence) getString(Oo.b.f84665i));
        ikeaToolBar.setNavigationOnClickListener(new tx.g(this));
    }

    /* access modifiers changed from: private */
    public static final void k1(ProductConfiguratorFragment productConfiguratorFragment, View view) {
        productConfiguratorFragment.dismiss();
    }

    public final C9133b I0() {
        C9133b bVar = this.f119377U;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("cartApi");
        return null;
    }

    public final C11239c L0() {
        C11239c cVar = this.f119379Y;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("imageLoader");
        return null;
    }

    public final C10253a N0() {
        C10253a aVar = this.f119378X;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("killSwitchRepository");
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, lg.f.f75301m);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        WindowManager.LayoutParams attributes;
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C17542s.i(onCreateDialog, "onCreateDialog(...)");
        Window window = onCreateDialog.getWindow();
        if (!(window == null || (attributes = window.getAttributes()) == null)) {
            attributes.windowAnimations = lg.f.f75299k;
        }
        return onCreateDialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f119376T = M0();
        this.f119373Q = C15120a.c(layoutInflater);
        this.f119374R = new C15095b();
        this.f119375S = new w(L0());
        ConstraintLayout b10 = J0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        this.f119373Q = null;
        this.f119374R = null;
        this.f119375S = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        j1();
        RecyclerView recyclerView = J0().f131383e;
        recyclerView.setAdapter(K0());
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(new C11401a());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        RecyclerView recyclerView2 = J0().f131386h;
        recyclerView2.setAdapter(P0());
        recyclerView2.setNestedScrollingEnabled(false);
        recyclerView2.setItemAnimator(new C11401a());
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 0, false));
        U0(M0());
        F<List<C15193a>> L10 = Q0().L();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        j.a(L10, viewLifecycleOwner, new tx.e(this));
        F<List<wx.c>> e10 = K0().e();
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        j.a(e10, viewLifecycleOwner2, new tx.j(this));
        F<wx.c> d10 = P0().d();
        C5221y viewLifecycleOwner3 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        j.a(d10, viewLifecycleOwner3, new k(this));
        F<String> K10 = Q0().K();
        C5221y viewLifecycleOwner4 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        j.a(K10, viewLifecycleOwner4, new l(this));
        F<String> R10 = Q0().R();
        C5221y viewLifecycleOwner5 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        j.a(R10, viewLifecycleOwner5, new m(this));
        F<Boolean> Q10 = Q0().Q();
        C5221y viewLifecycleOwner6 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        j.a(Q10, viewLifecycleOwner6, new n(this));
        F<String> M10 = Q0().M();
        C5221y viewLifecycleOwner7 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        j.a(M10, viewLifecycleOwner7, new o(this));
        F<C15269a> J10 = Q0().J();
        C5221y viewLifecycleOwner8 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner8, "getViewLifecycleOwner(...)");
        j.a(J10, viewLifecycleOwner8, new p(this));
        F<x<Boolean>> O10 = Q0().O();
        C5221y viewLifecycleOwner9 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner9, "getViewLifecycleOwner(...)");
        j.a(O10, viewLifecycleOwner9, new q(this));
    }
}
