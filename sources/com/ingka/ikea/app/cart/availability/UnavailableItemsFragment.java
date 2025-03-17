package com.ingka.ikea.app.cart.availability;

import Ae.e;
import Bx.a;
import HJ.C15854t;
import IC.C13026h;
import Kf.C9132a;
import MB.C13194a;
import O0.J0;
import QJ.Q;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16534i;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import YH.C16877v;
import Zf.k;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.cart.availability.b;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.ingka.ikea.store.datalayer.StorageType;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import hg.C9800i;
import hg.K;
import hg.q;
import hg.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import lm.C11550a;
import lm.c;
import lm.d;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import x4.C;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J/\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b!\u0010\u0011J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J)\u0010,\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u000e2\u0006\u0010+\u001a\u00020\u000eH\u0002¢\u0006\u0004\b,\u0010-J9\u00101\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J+\u0010>\u001a\u00020=2\u0006\u00108\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0007H\u0016¢\u0006\u0004\b@\u0010\u0004R\"\u0010H\u001a\u00020A8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010p\u001a\u00020i8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010x\u001a\u00020q8\u0006@\u0006X.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u001a\u0010}\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R$\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070~8\u0016X\u0004¢\u0006\u000f\n\u0005\b\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R!\u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R!\u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001¨\u0006\u0001²\u0006\u000e\u0010\u0001\u001a\u00030\u00018\nX\u0002²\u0006\u000e\u0010\u0001\u001a\u00030\u00018\nX\u0002"}, d2 = {"Lcom/ingka/ikea/app/cart/availability/UnavailableItemsFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseFragment;", "", "<init>", "()V", "Lhg/i$b;", "message", "LXH/N;", "h1", "(Lhg/i$b;)V", "Lhg/i$c;", "event", "k1", "(Lhg/i$c;)V", "", "itemNo", "S0", "(Ljava/lang/String;)V", "l1", "r1", "m1", "o1", "Llm/a$c;", "fulfilmentOption", "productTitle", "itemType", "p1", "(Llm/a$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "n1", "Lcom/ingka/ikea/app/cart/f;", "result", "g1", "(Lcom/ingka/ikea/app/cart/f;)V", "s1", "Llm/d;", "f1", "(Llm/d;)V", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b;", "j1", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b;)V", "Landroid/content/Context;", "context", "productName", "listName", "d1", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "textResId", "fallbackTextResId", "c1", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Ljava/lang/String;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "q1", "(Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "LAe/e;", "R", "LAe/e;", "U0", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "LBx/a;", "S", "LBx/a;", "T0", "()LBx/a;", "setAccountApi", "(LBx/a;)V", "accountApi", "Llm/e;", "T", "Llm/e;", "V0", "()Llm/e;", "setBackInStockNavigation", "(Llm/e;)V", "backInStockNavigation", "LZw/a;", "U", "LZw/a;", "b1", "()LZw/a;", "setPipNavigation", "(LZw/a;)V", "pipNavigation", "LMB/a;", "X", "LMB/a;", "e1", "()LMB/a;", "setStorePickerNavigation", "(LMB/a;)V", "storePickerNavigation", "LZf/k;", "Y", "LZf/k;", "X0", "()LZf/k;", "setCartNavigation", "(LZf/k;)V", "cartNavigation", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "Z", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "a1", "()Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "setListPickerNavigation", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;)V", "listPickerNavigation", "y0", "Ljava/lang/String;", "Z0", "()Ljava/lang/String;", "destId", "Lkotlin/Function0;", "z0", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "Lhg/v;", "A0", "LXH/o;", "Y0", "()Lhg/v;", "cartViewModel", "Lhg/i;", "B0", "W0", "()Lhg/i;", "cartItemsAvailabilityViewModel", "LKf/a;", "C0", "LKf/a;", "cartActionsHandler", "Lhg/i$d;", "state", "Lhg/q;", "cartState", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnavailableItemsFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    private final C16824o f71706A0;

    /* renamed from: B0  reason: collision with root package name */
    private final C16824o f71707B0;

    /* renamed from: C0  reason: collision with root package name */
    private final C9132a f71708C0;

    /* renamed from: R  reason: collision with root package name */
    public Ae.e f71709R;

    /* renamed from: S  reason: collision with root package name */
    public Bx.a f71710S;

    /* renamed from: T  reason: collision with root package name */
    public lm.e f71711T;

    /* renamed from: U  reason: collision with root package name */
    public Zw.a f71712U;

    /* renamed from: X  reason: collision with root package name */
    public C13194a f71713X;

    /* renamed from: Y  reason: collision with root package name */
    public Zf.k f71714Y;

    /* renamed from: Z  reason: collision with root package name */
    public ListPickerNavigation f71715Z;

    /* renamed from: y0  reason: collision with root package name */
    private final String f71716y0 = "cart/unavailableItems";

    /* renamed from: z0  reason: collision with root package name */
    private final C17631a<C16807N> f71717z0 = new Mf.b(this);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f71718a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f71719b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
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
                f71718a = r0
                com.ingka.ikea.app.cart.UnavailabilityItemActionsBottomSheet$b[] r0 = com.ingka.ikea.app.cart.UnavailabilityItemActionsBottomSheet.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.app.cart.UnavailabilityItemActionsBottomSheet$b r3 = com.ingka.ikea.app.cart.UnavailabilityItemActionsBottomSheet.b.MOVE_TO_SHOPPING_LIST     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.ingka.ikea.app.cart.UnavailabilityItemActionsBottomSheet$b r1 = com.ingka.ikea.app.cart.UnavailabilityItemActionsBottomSheet.b.CHANGE_STORE     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                com.ingka.ikea.app.cart.UnavailabilityItemActionsBottomSheet$b r1 = com.ingka.ikea.app.cart.UnavailabilityItemActionsBottomSheet.b.OPEN_PRODUCT     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f71719b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.cart.availability.UnavailableItemsFragment.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.availability.UnavailableItemsFragment$observeNavigationResult$$inlined$consumeResult$1", f = "UnavailableItemsFragment.kt", l = {}, m = "invokeSuspend")
    public static final class b extends kotlin.coroutines.jvm.internal.l implements p<ListPickerNavigation.b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f71720c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f71721d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f71722e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f71723f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ UnavailableItemsFragment f71724g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C8948l lVar, String str, C17164e eVar, UnavailableItemsFragment unavailableItemsFragment) {
            super(2, eVar);
            this.f71722e = lVar;
            this.f71723f = str;
            this.f71724g = unavailableItemsFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f71722e, this.f71723f, eVar, this.f71724g);
            bVar.f71721d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(ListPickerNavigation.b bVar, C17164e<? super C16807N> eVar) {
            return ((b) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f71720c == 0) {
                y.b(obj);
                Object obj2 = this.f71721d;
                if (obj2 != null) {
                    ListPickerNavigation.b bVar = (ListPickerNavigation.b) obj2;
                    UnavailableItemsFragment unavailableItemsFragment = this.f71724g;
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
                            String a10 = C11818a.a("Choose list fragment result: " + bVar, (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = unavailableItemsFragment.getClass().getName();
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
                    this.f71724g.j1(bVar);
                    this.f71722e.h().m(this.f71723f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.availability.UnavailableItemsFragment$observeNavigationResult$$inlined$consumeResult$2", f = "UnavailableItemsFragment.kt", l = {}, m = "invokeSuspend")
    public static final class c extends kotlin.coroutines.jvm.internal.l implements p<com.ingka.ikea.app.cart.f, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f71725c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f71726d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f71727e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f71728f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ UnavailableItemsFragment f71729g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C8948l lVar, String str, C17164e eVar, UnavailableItemsFragment unavailableItemsFragment) {
            super(2, eVar);
            this.f71727e = lVar;
            this.f71728f = str;
            this.f71729g = unavailableItemsFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f71727e, this.f71728f, eVar, this.f71729g);
            cVar.f71726d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(com.ingka.ikea.app.cart.f fVar, C17164e<? super C16807N> eVar) {
            return ((c) create(fVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f71725c == 0) {
                y.b(obj);
                Object obj2 = this.f71726d;
                if (obj2 != null) {
                    this.f71729g.g1((com.ingka.ikea.app.cart.f) obj2);
                    this.f71727e.h().m(this.f71728f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.availability.UnavailableItemsFragment$observeNavigationResult$$inlined$consumeResult$3", f = "UnavailableItemsFragment.kt", l = {}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.l implements p<lm.d, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f71730c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f71731d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f71732e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f71733f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ UnavailableItemsFragment f71734g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C8948l lVar, String str, C17164e eVar, UnavailableItemsFragment unavailableItemsFragment) {
            super(2, eVar);
            this.f71732e = lVar;
            this.f71733f = str;
            this.f71734g = unavailableItemsFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f71732e, this.f71733f, eVar, this.f71734g);
            dVar.f71731d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(lm.d dVar, C17164e<? super C16807N> eVar) {
            return ((d) create(dVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f71730c == 0) {
                y.b(obj);
                Object obj2 = this.f71731d;
                if (obj2 != null) {
                    this.f71734g.f1((lm.d) obj2);
                    this.f71732e.h().m(this.f71733f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.availability.UnavailableItemsFragment$observeNavigationResult$$inlined$consumeResult$4", f = "UnavailableItemsFragment.kt", l = {}, m = "invokeSuspend")
    public static final class e extends kotlin.coroutines.jvm.internal.l implements p<lm.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f71735c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f71736d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f71737e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f71738f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ UnavailableItemsFragment f71739g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C8948l lVar, String str, C17164e eVar, UnavailableItemsFragment unavailableItemsFragment) {
            super(2, eVar);
            this.f71737e = lVar;
            this.f71738f = str;
            this.f71739g = unavailableItemsFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f71737e, this.f71738f, eVar, this.f71739g);
            eVar2.f71736d = obj;
            return eVar2;
        }

        /* renamed from: i */
        public final Object invoke(lm.c cVar, C17164e<? super C16807N> eVar) {
            return ((e) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f71735c == 0) {
                y.b(obj);
                Object obj2 = this.f71736d;
                if (obj2 != null) {
                    lm.c cVar = (lm.c) obj2;
                    if (cVar instanceof c.a) {
                        String b10 = ((c.a) cVar).b();
                        Ln.d C02 = this.f71739g.Y0().C0(b10);
                        if (C02 != null) {
                            this.f71739g.W0().U(new C9800i.a.C1288a(C02));
                        } else {
                            UnavailableItemsFragment unavailableItemsFragment = this.f71739g;
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to find item: " + b10);
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
                                    String a10 = C11818a.a((String) null, illegalArgumentException);
                                    if (a10 == null) {
                                        break;
                                    }
                                    str = C11820c.a(a10);
                                }
                                String str3 = str;
                                if (str2 == null) {
                                    String name = unavailableItemsFragment.getClass().getName();
                                    C17542s.g(name);
                                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                    if (o12.length() != 0) {
                                        name = C15854t.P0(o12, "Kt");
                                    }
                                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                                }
                                String str4 = str2;
                                bVar.a(eVar, str4, false, illegalArgumentException, str3);
                                str = str3;
                                str2 = str4;
                            }
                        }
                        this.f71737e.h().m(this.f71738f, null);
                    } else {
                        throw new t();
                    }
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UnavailableItemsFragment f71740a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ComposeView f71741b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ UnavailableItemsFragment f71742a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ComposeView f71743b;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.availability.UnavailableItemsFragment$onCreateView$1$1$1$1$1", f = "UnavailableItemsFragment.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.ingka.ikea.app.cart.availability.UnavailableItemsFragment$f$a$a  reason: collision with other inner class name */
            static final class C1227a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f71744c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C9800i.c f71745d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ UnavailableItemsFragment f71746e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C1227a(C9800i.c cVar, UnavailableItemsFragment unavailableItemsFragment, C17164e<? super C1227a> eVar) {
                    super(2, eVar);
                    this.f71745d = cVar;
                    this.f71746e = unavailableItemsFragment;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C1227a(this.f71745d, this.f71746e, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C1227a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    C17187b.f();
                    if (this.f71744c == 0) {
                        y.b(obj);
                        C9800i.c cVar = this.f71745d;
                        if (cVar != null) {
                            this.f71746e.k1(cVar);
                        }
                        return C16807N.f139792a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.availability.UnavailableItemsFragment$onCreateView$1$1$1$2$1", f = "UnavailableItemsFragment.kt", l = {}, m = "invokeSuspend")
            static final class b extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f71747c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C9800i.b f71748d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ UnavailableItemsFragment f71749e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(C9800i.b bVar, UnavailableItemsFragment unavailableItemsFragment, C17164e<? super b> eVar) {
                    super(2, eVar);
                    this.f71748d = bVar;
                    this.f71749e = unavailableItemsFragment;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new b(this.f71748d, this.f71749e, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    C17187b.f();
                    if (this.f71747c == 0) {
                        y.b(obj);
                        C9800i.b bVar = this.f71748d;
                        if (bVar != null) {
                            this.f71749e.h1(bVar);
                        }
                        return C16807N.f139792a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* synthetic */ class c extends C17540p implements C17631a<C16807N> {
                c(Object obj) {
                    super(0, obj, v.class, "clearMessage", "clearMessage()V", 0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    t();
                    return C16807N.f139792a;
                }

                public final void t() {
                    ((v) this.receiver).j0();
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* synthetic */ class d extends C17540p implements C17631a<C16807N> {
                d(Object obj) {
                    super(0, obj, v.class, "clearMessage", "clearMessage()V", 0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    t();
                    return C16807N.f139792a;
                }

                public final void t() {
                    ((v) this.receiver).j0();
                }
            }

            a(UnavailableItemsFragment unavailableItemsFragment, ComposeView composeView) {
                this.f71742a = unavailableItemsFragment;
                this.f71743b = composeView;
            }

            private static final C9800i.d k(A1<C9800i.d> a12) {
                return a12.getValue();
            }

            /* access modifiers changed from: private */
            public static final C16807N m(UnavailableItemsFragment unavailableItemsFragment, String str) {
                C17542s.j(str, "itemNo");
                unavailableItemsFragment.q1(str, Interaction$Component.CART_DETAILS);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N n(UnavailableItemsFragment unavailableItemsFragment, String str) {
                C17542s.j(str, "itemNo");
                unavailableItemsFragment.o1(str);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N p(UnavailableItemsFragment unavailableItemsFragment) {
                unavailableItemsFragment.n1();
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N q(UnavailableItemsFragment unavailableItemsFragment, ComposeView composeView, String str) {
                C17542s.j(str, "itemNo");
                Ln.d C02 = unavailableItemsFragment.Y0().C0(str);
                if (C02 != null) {
                    unavailableItemsFragment.W0().U(new C9800i.a.C1288a(C02));
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to find item: " + str);
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
                            String a10 = C11818a.a((String) null, illegalArgumentException);
                            if (a10 == null) {
                                break;
                            }
                            str2 = C11820c.a(a10);
                        }
                        String str4 = str2;
                        if (str3 == null) {
                            String name = composeView.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str5 = str3;
                        bVar.a(eVar, str5, false, illegalArgumentException, str4);
                        str2 = str4;
                        str3 = str5;
                    }
                }
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N s(UnavailableItemsFragment unavailableItemsFragment, String str) {
                C17542s.j(str, "itemNo");
                unavailableItemsFragment.S0(str);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N t(UnavailableItemsFragment unavailableItemsFragment, String str) {
                C17542s.j(str, "itemNo");
                unavailableItemsFragment.r1(str);
                return C16807N.f139792a;
            }

            private static final q u(A1<q> a12) {
                return a12.getValue();
            }

            /* access modifiers changed from: private */
            public static final C16807N v(UnavailableItemsFragment unavailableItemsFragment) {
                C8951o f10 = rw.f.f(unavailableItemsFragment, unavailableItemsFragment.Z0(), (C17642l) null, 2, (Object) null);
                if (f10 != null) {
                    f10.k0();
                }
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                j((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: nI.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: nI.l} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: nI.l} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: nI.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: nI.l} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: nI.l} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: nI.l} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void j(U0.C4889m r22, int r23) {
                /*
                    r21 = this;
                    r0 = r21
                    r7 = r22
                    r1 = r23
                    r2 = r1 & 3
                    r8 = 2
                    if (r2 != r8) goto L_0x0017
                    boolean r2 = r22.l()
                    if (r2 != 0) goto L_0x0012
                    goto L_0x0017
                L_0x0012:
                    r22.L()
                    goto L_0x03bc
                L_0x0017:
                    boolean r2 = U0.C4895p.J()
                    if (r2 == 0) goto L_0x0026
                    r2 = -1
                    java.lang.String r3 = "com.ingka.ikea.app.cart.availability.UnavailableItemsFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (UnavailableItemsFragment.kt:112)"
                    r4 = -2044655699(0xffffffff862107ad, float:-3.0286374E-35)
                    U0.C4895p.S(r4, r1, r2, r3)
                L_0x0026:
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r1 = r0.f71742a
                    hg.i r1 = r1.W0()
                    TJ.P r1 = r1.N()
                    r9 = 0
                    r2 = 0
                    r10 = 1
                    U0.A1 r11 = U0.p1.b(r1, r9, r7, r2, r10)
                    java.lang.Object r1 = r22.D()
                    U0.m$a r3 = U0.C4889m.f14007a
                    java.lang.Object r4 = r3.a()
                    if (r1 != r4) goto L_0x0052
                    dI.j r1 = dI.C17169j.f142968a
                    QJ.Q r1 = U0.P.k(r1, r7)
                    U0.B r4 = new U0.B
                    r4.<init>(r1)
                    r7.u(r4)
                    r1 = r4
                L_0x0052:
                    U0.B r1 = (U0.B) r1
                    QJ.Q r4 = r1.a()
                    hg.i$d r1 = k(r11)
                    hg.i$c r1 = r1.d()
                    r5 = 985488371(0x3abd5bf3, float:0.0014446959)
                    r7.W(r5)
                    boolean r5 = r7.V(r1)
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r6 = r0.f71742a
                    boolean r6 = r7.F(r6)
                    r5 = r5 | r6
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r6 = r0.f71742a
                    java.lang.Object r12 = r22.D()
                    if (r5 != 0) goto L_0x007f
                    java.lang.Object r5 = r3.a()
                    if (r12 != r5) goto L_0x0087
                L_0x007f:
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment$f$a$a r12 = new com.ingka.ikea.app.cart.availability.UnavailableItemsFragment$f$a$a
                    r12.<init>(r1, r6, r9)
                    r7.u(r12)
                L_0x0087:
                    nI.p r12 = (nI.p) r12
                    r22.P()
                    U0.P.g(r1, r12, r7, r2)
                    hg.i$d r1 = k(r11)
                    hg.i$b r1 = r1.g()
                    r5 = 985495663(0x3abd786f, float:0.0014455448)
                    r7.W(r5)
                    boolean r5 = r7.F(r1)
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r6 = r0.f71742a
                    boolean r6 = r7.F(r6)
                    r5 = r5 | r6
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r6 = r0.f71742a
                    java.lang.Object r12 = r22.D()
                    if (r5 != 0) goto L_0x00b6
                    java.lang.Object r5 = r3.a()
                    if (r12 != r5) goto L_0x00be
                L_0x00b6:
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment$f$a$b r12 = new com.ingka.ikea.app.cart.availability.UnavailableItemsFragment$f$a$b
                    r12.<init>(r1, r6, r9)
                    r7.u(r12)
                L_0x00be:
                    nI.p r12 = (nI.p) r12
                    r22.P()
                    int r5 = IC.C13023e.f110931a
                    U0.P.g(r1, r12, r7, r5)
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r1 = r0.f71742a
                    hg.v r1 = r1.Y0()
                    TJ.P r1 = r1.E0()
                    U0.A1 r1 = U0.p1.b(r1, r9, r7, r2, r10)
                    r2 = 985503468(0x3abd96ec, float:0.0014464534)
                    r7.W(r2)
                    java.lang.Object r2 = r22.D()
                    java.lang.Object r6 = r3.a()
                    if (r2 != r6) goto L_0x00ee
                    O0.L0 r2 = new O0.L0
                    r2.<init>()
                    r7.u(r2)
                L_0x00ee:
                    r12 = r2
                    O0.L0 r12 = (O0.L0) r12
                    r22.P()
                    hg.q r1 = u(r1)
                    hg.K r1 = r1.c()
                    boolean r2 = r1 instanceof hg.K.b
                    if (r2 == 0) goto L_0x0146
                    r2 = 485989206(0x1cf79b56, float:1.6385242E-21)
                    r7.W(r2)
                    r2 = r1
                    hg.K$b r2 = (hg.K.b) r2
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r1 = r0.f71742a
                    hg.v r1 = r1.Y0()
                    r6 = 985516903(0x3abdcb67, float:0.0014480174)
                    r7.W(r6)
                    boolean r6 = r7.F(r1)
                    java.lang.Object r13 = r22.D()
                    if (r6 != 0) goto L_0x0125
                    java.lang.Object r3 = r3.a()
                    if (r13 != r3) goto L_0x012d
                L_0x0125:
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment$f$a$c r13 = new com.ingka.ikea.app.cart.availability.UnavailableItemsFragment$f$a$c
                    r13.<init>(r1)
                    r7.u(r13)
                L_0x012d:
                    uI.h r13 = (uI.C18059h) r13
                    r22.P()
                    r6 = r13
                    nI.a r6 = (nI.C17631a) r6
                    int r1 = r5 << 3
                    r13 = r1 | 6
                    r1 = r12
                    r3 = r4
                    r4 = r6
                    r5 = r22
                    r6 = r13
                    Of.K1.b(r1, r2, r3, r4, r5, r6)
                    r22.P()
                    goto L_0x018f
                L_0x0146:
                    boolean r2 = r1 instanceof hg.K.a
                    if (r2 == 0) goto L_0x0184
                    r2 = 486383681(0x1cfda041, float:1.678356E-21)
                    r7.W(r2)
                    hg.K$a r1 = (hg.K.a) r1
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r2 = r0.f71742a
                    hg.v r2 = r2.Y0()
                    r4 = 985525319(0x3abdec47, float:0.0014489972)
                    r7.W(r4)
                    boolean r4 = r7.F(r2)
                    java.lang.Object r6 = r22.D()
                    if (r4 != 0) goto L_0x016e
                    java.lang.Object r3 = r3.a()
                    if (r6 != r3) goto L_0x0176
                L_0x016e:
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment$f$a$d r6 = new com.ingka.ikea.app.cart.availability.UnavailableItemsFragment$f$a$d
                    r6.<init>(r2)
                    r7.u(r6)
                L_0x0176:
                    uI.h r6 = (uI.C18059h) r6
                    r22.P()
                    nI.a r6 = (nI.C17631a) r6
                    Of.C9180i0.P(r1, r6, r7, r5)
                    r22.P()
                    goto L_0x018f
                L_0x0184:
                    if (r1 != 0) goto L_0x03bd
                    r1 = 985529360(0x3abdfc10, float:0.0014494676)
                    r7.W(r1)
                    r22.P()
                L_0x018f:
                    hg.i$d r1 = k(r11)
                    boolean r1 = r1.e()
                    if (r1 == 0) goto L_0x0252
                    androidx.compose.ui.platform.ComposeView r1 = r0.f71743b
                    qv.e r2 = qv.e.DEBUG
                    qv.d r3 = qv.d.f102012a
                    java.util.List r3 = r3.a()
                    java.lang.Iterable r3 = (java.lang.Iterable) r3
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r4.<init>()
                    java.util.Iterator r3 = r3.iterator()
                L_0x01ae:
                    boolean r5 = r3.hasNext()
                    r6 = 0
                    if (r5 == 0) goto L_0x01c6
                    java.lang.Object r5 = r3.next()
                    r13 = r5
                    qv.b r13 = (qv.C11819b) r13
                    boolean r6 = r13.b(r2, r6)
                    if (r6 == 0) goto L_0x01ae
                    r4.add(r5)
                    goto L_0x01ae
                L_0x01c6:
                    java.util.Iterator r3 = r4.iterator()
                    r4 = r9
                    r5 = r4
                L_0x01cc:
                    boolean r13 = r3.hasNext()
                    if (r13 == 0) goto L_0x0243
                    java.lang.Object r13 = r3.next()
                    qv.b r13 = (qv.C11819b) r13
                    r15 = 0
                    if (r4 != 0) goto L_0x01e8
                    java.lang.String r4 = "Pop back stack"
                    java.lang.String r4 = qv.C11818a.a(r4, r15)
                    if (r4 != 0) goto L_0x01e4
                    goto L_0x0243
                L_0x01e4:
                    java.lang.String r4 = qv.C11820c.a(r4)
                L_0x01e8:
                    if (r5 != 0) goto L_0x0237
                    java.lang.Class r5 = r1.getClass()
                    java.lang.String r5 = r5.getName()
                    kotlin.jvm.internal.C17542s.g(r5)
                    r14 = 36
                    java.lang.String r14 = HJ.C15854t.s1(r5, r14, r9, r8, r9)
                    r15 = 46
                    java.lang.String r14 = HJ.C15854t.o1(r14, r15, r9, r8, r9)
                    int r15 = r14.length()
                    if (r15 != 0) goto L_0x0208
                    goto L_0x020e
                L_0x0208:
                    java.lang.String r5 = "Kt"
                    java.lang.String r5 = HJ.C15854t.P0(r14, r5)
                L_0x020e:
                    java.lang.Thread r14 = java.lang.Thread.currentThread()
                    java.lang.String r14 = r14.getName()
                    java.lang.String r15 = "main"
                    boolean r14 = HJ.C15854t.b0(r14, r15, r10)
                    if (r14 == 0) goto L_0x0221
                    java.lang.String r14 = "m"
                    goto L_0x0223
                L_0x0221:
                    java.lang.String r14 = "b"
                L_0x0223:
                    java.lang.StringBuilder r15 = new java.lang.StringBuilder
                    r15.<init>()
                    r15.append(r14)
                    java.lang.String r14 = "|"
                    r15.append(r14)
                    r15.append(r5)
                    java.lang.String r5 = r15.toString()
                L_0x0237:
                    r14 = r2
                    r17 = 0
                    r15 = r5
                    r16 = r6
                    r18 = r4
                    r13.a(r14, r15, r16, r17, r18)
                    goto L_0x01cc
                L_0x0243:
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r1 = r0.f71742a
                    java.lang.String r2 = r1.Z0()
                    x4.o r1 = rw.f.f(r1, r2, r9, r8, r9)
                    if (r1 == 0) goto L_0x0252
                    r1.k0()
                L_0x0252:
                    hg.i$d r1 = k(r11)
                    boolean r1 = r1.f()
                    hg.i$d r2 = k(r11)
                    boolean r2 = r2.c()
                    hg.i$d r3 = k(r11)
                    java.util.List r3 = r3.b()
                    java.lang.Iterable r3 = (java.lang.Iterable) r3
                    KJ.c r3 = KJ.C15985a.h(r3)
                    r4 = 985555373(0x3abe61ad, float:0.0014524959)
                    r7.W(r4)
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r4 = r0.f71742a
                    boolean r4 = r7.F(r4)
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r5 = r0.f71742a
                    java.lang.Object r6 = r22.D()
                    if (r4 != 0) goto L_0x028c
                    U0.m$a r4 = U0.C4889m.f14007a
                    java.lang.Object r4 = r4.a()
                    if (r6 != r4) goto L_0x0294
                L_0x028c:
                    com.ingka.ikea.app.cart.availability.c r6 = new com.ingka.ikea.app.cart.availability.c
                    r6.<init>(r5)
                    r7.u(r6)
                L_0x0294:
                    r14 = r6
                    nI.a r14 = (nI.C17631a) r14
                    r22.P()
                    r4 = 985546521(0x3abe3f19, float:0.0014514654)
                    r7.W(r4)
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r4 = r0.f71742a
                    boolean r4 = r7.F(r4)
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r5 = r0.f71742a
                    java.lang.Object r6 = r22.D()
                    if (r4 != 0) goto L_0x02b6
                    U0.m$a r4 = U0.C4889m.f14007a
                    java.lang.Object r4 = r4.a()
                    if (r6 != r4) goto L_0x02be
                L_0x02b6:
                    com.ingka.ikea.app.cart.availability.d r6 = new com.ingka.ikea.app.cart.availability.d
                    r6.<init>(r5)
                    r7.u(r6)
                L_0x02be:
                    r15 = r6
                    nI.l r15 = (nI.C17642l) r15
                    r22.P()
                    r4 = 985560051(0x3abe73f3, float:0.0014530405)
                    r7.W(r4)
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r4 = r0.f71742a
                    boolean r4 = r7.F(r4)
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r5 = r0.f71742a
                    java.lang.Object r6 = r22.D()
                    if (r4 != 0) goto L_0x02e0
                    U0.m$a r4 = U0.C4889m.f14007a
                    java.lang.Object r4 = r4.a()
                    if (r6 != r4) goto L_0x02e8
                L_0x02e0:
                    com.ingka.ikea.app.cart.availability.e r6 = new com.ingka.ikea.app.cart.availability.e
                    r6.<init>(r5)
                    r7.u(r6)
                L_0x02e8:
                    r16 = r6
                    nI.l r16 = (nI.C17642l) r16
                    r22.P()
                    r4 = 985565121(0x3abe87c1, float:0.0014536307)
                    r7.W(r4)
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r4 = r0.f71742a
                    boolean r4 = r7.F(r4)
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r5 = r0.f71742a
                    java.lang.Object r6 = r22.D()
                    if (r4 != 0) goto L_0x030b
                    U0.m$a r4 = U0.C4889m.f14007a
                    java.lang.Object r4 = r4.a()
                    if (r6 != r4) goto L_0x0313
                L_0x030b:
                    com.ingka.ikea.app.cart.availability.f r6 = new com.ingka.ikea.app.cart.availability.f
                    r6.<init>(r5)
                    r7.u(r6)
                L_0x0313:
                    r17 = r6
                    nI.a r17 = (nI.C17631a) r17
                    r22.P()
                    r4 = 985569991(0x3abe9ac7, float:0.0014541977)
                    r7.W(r4)
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r4 = r0.f71742a
                    boolean r4 = r7.F(r4)
                    androidx.compose.ui.platform.ComposeView r5 = r0.f71743b
                    boolean r5 = r7.F(r5)
                    r4 = r4 | r5
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r5 = r0.f71742a
                    androidx.compose.ui.platform.ComposeView r6 = r0.f71743b
                    java.lang.Object r8 = r22.D()
                    if (r4 != 0) goto L_0x033f
                    U0.m$a r4 = U0.C4889m.f14007a
                    java.lang.Object r4 = r4.a()
                    if (r8 != r4) goto L_0x0347
                L_0x033f:
                    com.ingka.ikea.app.cart.availability.g r8 = new com.ingka.ikea.app.cart.availability.g
                    r8.<init>(r5, r6)
                    r7.u(r8)
                L_0x0347:
                    r18 = r8
                    nI.l r18 = (nI.C17642l) r18
                    r22.P()
                    r4 = 985591177(0x3abeed89, float:0.0014566641)
                    r7.W(r4)
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r4 = r0.f71742a
                    boolean r4 = r7.F(r4)
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r5 = r0.f71742a
                    java.lang.Object r6 = r22.D()
                    if (r4 != 0) goto L_0x036a
                    U0.m$a r4 = U0.C4889m.f14007a
                    java.lang.Object r4 = r4.a()
                    if (r6 != r4) goto L_0x0372
                L_0x036a:
                    com.ingka.ikea.app.cart.availability.h r6 = new com.ingka.ikea.app.cart.availability.h
                    r6.<init>(r5)
                    r7.u(r6)
                L_0x0372:
                    r19 = r6
                    nI.l r19 = (nI.C17642l) r19
                    r22.P()
                    r4 = 985596125(0x3abf00dd, float:0.0014572401)
                    r7.W(r4)
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r4 = r0.f71742a
                    boolean r4 = r7.F(r4)
                    com.ingka.ikea.app.cart.availability.UnavailableItemsFragment r5 = r0.f71742a
                    java.lang.Object r6 = r22.D()
                    if (r4 != 0) goto L_0x0395
                    U0.m$a r4 = U0.C4889m.f14007a
                    java.lang.Object r4 = r4.a()
                    if (r6 != r4) goto L_0x039d
                L_0x0395:
                    com.ingka.ikea.app.cart.availability.i r6 = new com.ingka.ikea.app.cart.availability.i
                    r6.<init>(r5)
                    r7.u(r6)
                L_0x039d:
                    r20 = r6
                    nI.l r20 = (nI.C17642l) r20
                    r22.P()
                    Of.R1 r4 = new Of.R1
                    r13 = r4
                    r13.<init>(r14, r15, r16, r17, r18, r19, r20)
                    r8 = 24576(0x6000, float:3.4438E-41)
                    r5 = r12
                    r6 = r22
                    r7 = r8
                    Of.b2.o(r1, r2, r3, r4, r5, r6, r7)
                    boolean r1 = U0.C4895p.J()
                    if (r1 == 0) goto L_0x03bc
                    U0.C4895p.R()
                L_0x03bc:
                    return
                L_0x03bd:
                    r1 = 985505787(0x3abd9ffb, float:0.0014467234)
                    r7.W(r1)
                    r22.P()
                    XH.t r1 = new XH.t
                    r1.<init>()
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.cart.availability.UnavailableItemsFragment.f.a.j(U0.m, int):void");
            }
        }

        f(UnavailableItemsFragment unavailableItemsFragment, ComposeView composeView) {
            this.f71740a = unavailableItemsFragment;
            this.f71741b = composeView;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(192939719, i10, -1, "com.ingka.ikea.app.cart.availability.UnavailableItemsFragment.onCreateView.<anonymous>.<anonymous> (UnavailableItemsFragment.kt:111)");
                }
                TC.e.e(false, c1.c.e(-2044655699, true, new a(this.f71740a, this.f71741b), mVar, 54), mVar, 48, 1);
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
    public static final class g implements C17631a<C8948l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f71750a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f71751b;

        public g(C5187o oVar, String str) {
            this.f71750a = oVar;
            this.f71751b = str;
        }

        /* renamed from: a */
        public final C8948l invoke() {
            return androidx.navigation.fragment.a.a(this.f71750a).E(this.f71751b);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class h implements C17631a<j0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16824o f71752a;

        public h(C16824o oVar) {
            this.f71752a = oVar;
        }

        /* renamed from: a */
        public final j0 invoke() {
            return rw.a.c(this.f71752a).getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class i implements C17631a<i0.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f71753a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16824o f71754b;

        public i(C5187o oVar, C16824o oVar2) {
            this.f71753a = oVar;
            this.f71754b = oVar2;
        }

        /* renamed from: a */
        public final i0.c invoke() {
            C5191t requireActivity = this.f71753a.requireActivity();
            C17542s.i(requireActivity, "requireActivity(...)");
            return e3.a.b(requireActivity, rw.a.c(this.f71754b));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class j extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f71755c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(C5187o oVar) {
            super(0);
            this.f71755c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f71755c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class k extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f71756c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(C17631a aVar) {
            super(0);
            this.f71756c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f71756c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class l extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f71757c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(C16824o oVar) {
            super(0);
            this.f71757c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f71757c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class m extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f71758c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f71759d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(C17631a aVar, C16824o oVar) {
            super(0);
            this.f71758c = aVar;
            this.f71759d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f71758c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f71759d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class n extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f71760c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f71761d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f71760c = oVar;
            this.f71761d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f71761d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f71760c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public UnavailableItemsFragment() {
        C16824o b10 = C16825p.b(new g(this, "cart"));
        this.f71706A0 = W.c(this, P.b(v.class), new h(b10), (C17631a) null, new i(this, b10), 4, (Object) null);
        C16824o a10 = C16825p.a(s.NONE, new k(new j(this)));
        this.f71707B0 = W.b(this, P.b(C9800i.class), new l(a10), new m((C17631a) null, a10), new n(this, a10));
        this.f71708C0 = new C9132a();
    }

    /* access modifiers changed from: private */
    public static final C16807N R0(UnavailableItemsFragment unavailableItemsFragment) {
        unavailableItemsFragment.m1();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void S0(String str) {
        v Y02 = Y0();
        String string = getString(Oo.b.f84602c2);
        C17542s.i(string, "getString(...)");
        Y02.m0(str, string, Ae.k.OVERFLOW, "cart_unavailable_item");
    }

    /* access modifiers changed from: private */
    public final C9800i W0() {
        return (C9800i) this.f71707B0.getValue();
    }

    /* access modifiers changed from: private */
    public final v Y0() {
        return (v) this.f71706A0.getValue();
    }

    private final String c1(Context context, String str, String str2, int i10, int i11) {
        if (str == null || str.length() == 0 || str2.length() == 0) {
            String string = context.getString(i11);
            C17542s.i(string, "getString(...)");
            return string;
        }
        String string2 = context.getString(i10, new Object[]{str, "\"" + str2 + "\""});
        C17542s.i(string2, "getString(...)");
        return string2;
    }

    private final String d1(Context context, String str, String str2) {
        return c1(context, str, str2, Oo.b.f84442M4, Oo.b.f84452N4);
    }

    /* access modifiers changed from: private */
    public final void f1(lm.d dVar) {
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
                String a10 = C11818a.a("Back in stock notifications fragment result: " + dVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = UnavailableItemsFragment.class.getName();
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
        if (dVar instanceof d.a) {
            s1(((d.a) dVar).a());
        } else if (dVar instanceof d.b) {
            v.s0(Y0(), C13026h.a(((d.b) dVar).a()), (J0) null, (K.b.a) null, 6, (Object) null);
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public final void g1(com.ingka.ikea.app.cart.f fVar) {
        int i10 = a.f71719b[fVar.b().ordinal()];
        if (i10 == 1) {
            l1(fVar.a());
        } else if (i10 == 2) {
            s1(fVar.a());
        } else if (i10 == 3) {
            q1(fVar.a(), Interaction$Component.CART_DETAILS);
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public final void h1(C9800i.b bVar) {
        K.b.a aVar;
        C9800i.b.a a10 = bVar.a();
        if (a10 instanceof C9800i.b.a.C1289a) {
            aVar = new K.b.a(((C9800i.b.a.C1289a) a10).c(), new Mf.a(this, a10));
        } else if (a10 == null) {
            aVar = null;
        } else {
            throw new t();
        }
        Y0().r0(bVar.c(), bVar.b(), aVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N i1(UnavailableItemsFragment unavailableItemsFragment, C9800i.b.a aVar) {
        C9800i.b.a.C1289a aVar2 = (C9800i.b.a.C1289a) aVar;
        unavailableItemsFragment.q1(aVar2.b(), aVar2.a());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void j1(ListPickerNavigation.b bVar) {
        if (bVar instanceof ListPickerNavigation.b.d) {
            ListPickerNavigation.b.d dVar = (ListPickerNavigation.b.d) bVar;
            ListPickerNavigation.b.c cVar = (ListPickerNavigation.b.c) C16877v.w0(dVar.d());
            Context requireContext = requireContext();
            C17542s.i(requireContext, "requireContext(...)");
            Y0().O0(dVar.b(), cVar.a(), cVar.c(), d1(requireContext, cVar.b(), dVar.c()));
        } else if (!(bVar instanceof ListPickerNavigation.b.a)) {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public final void k1(C9800i.c cVar) {
        if (cVar instanceof C9800i.c.C1290c) {
            C8951o f10 = rw.f.f(this, Z0(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                T0().b(f10, a.C2584a.BACK_IN_STOCK_NOTIFICATIONS);
            }
        } else if (cVar instanceof C9800i.c.a) {
            C8951o f11 = rw.f.f(this, Z0(), (C17642l) null, 2, (Object) null);
            if (f11 != null) {
                C9800i.c.a aVar = (C9800i.c.a) cVar;
                V0().a(f11, aVar.a(), aVar.b().getProductNo(), aVar.b().getProductType());
            }
        } else if (cVar instanceof C9800i.c.b) {
            C9800i.c.b bVar = (C9800i.c.b) cVar;
            p1(bVar.a(), bVar.c(), bVar.b().getProductNo(), bVar.b().getProductType());
        } else {
            throw new t();
        }
        W0().V();
    }

    private final void l1(String str) {
        this.f71708C0.b(rw.f.f(this, Z0(), (C17642l) null, 2, (Object) null), a1(), Y0(), str, Ae.k.OVERFLOW, Interaction$Component.CART_DETAILS);
    }

    private final void m1() {
        C8948l E10 = androidx.navigation.fragment.a.a(this).E(Z0());
        C16519P i10 = E10.h().i("ChooseListBottomSheet.RequestKey", null);
        r lifecycle = E10.getLifecycle();
        r.b bVar = r.b.RESUMED;
        C16532g R10 = C16534i.R(C5208k.a(i10, lifecycle, bVar), new b(E10, "ChooseListBottomSheet.RequestKey", (C17164e) null, this));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
        C8948l E11 = androidx.navigation.fragment.a.a(this).E(Z0());
        C16532g R11 = C16534i.R(C5208k.a(E11.h().i("CartItemAvailabilityActionsBottomSheetRequestKey", null), E11.getLifecycle(), bVar), new c(E11, "CartItemAvailabilityActionsBottomSheetRequestKey", (C17164e) null, this));
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C16534i.M(R11, C5222z.a(viewLifecycleOwner2));
        C8948l E12 = androidx.navigation.fragment.a.a(this).E(Z0());
        C16532g R12 = C16534i.R(C5208k.a(E12.h().i("BackInStockNotificationsRequestKey", null), E12.getLifecycle(), bVar), new d(E12, "BackInStockNotificationsRequestKey", (C17164e) null, this));
        C5221y viewLifecycleOwner3 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C16534i.M(R12, C5222z.a(viewLifecycleOwner3));
        C8948l E13 = androidx.navigation.fragment.a.a(this).E(Z0());
        C16532g R13 = C16534i.R(C5208k.a(E13.h().i("BackInStockExplanationFragmentRequestKey", null), E13.getLifecycle(), bVar), new e(E13, "BackInStockExplanationFragmentRequestKey", (C17164e) null, this));
        C5221y viewLifecycleOwner4 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C16534i.M(R13, C5222z.a(viewLifecycleOwner4));
    }

    /* access modifiers changed from: private */
    public final void n1() {
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
                String a10 = C11818a.a("onContinueToCheckoutClicked", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = UnavailableItemsFragment.class.getName();
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
        e.c.b(U0(), Interaction$Component.CART_CONTINUE_CHECK_AVAILABILITY_IN_CHECKOUT, (String) null, (Map) null, (e.b) null, 14, (Object) null);
        rw.d.a(this, b.a.f71765a, "UnavailableItemsDialogRequestKey");
        C8951o f10 = rw.f.f(this, Z0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            f10.k0();
        }
    }

    /* access modifiers changed from: private */
    public final void o1(String str) {
        String str2;
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str3 = null;
        String str4 = null;
        while (true) {
            if (!it.hasNext()) {
                String str5 = str;
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str3 == null) {
                String a10 = C11818a.a("onProductClicked: " + str, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str3 = C11820c.a(a10);
            } else {
                String str6 = str;
            }
            String str7 = str3;
            if (str4 == null) {
                String name = UnavailableItemsFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str8 = str4;
            bVar.a(eVar, str8, false, (Throwable) null, str7);
            str3 = str7;
            str4 = str8;
        }
        C8951o f10 = rw.f.f(this, Z0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            Zf.k X02 = X0();
            int i10 = a.f71718a[Y0().J0().getValue().ordinal()];
            if (i10 == 1) {
                str2 = "HOME_DELIVERY";
            } else if (i10 == 2) {
                str2 = "CLICK_AND_COLLECT";
            } else {
                throw new t();
            }
            k.b.a(X02, f10, str2, str, (C) null, 8, (Object) null);
        }
    }

    private final void p1(C11550a.c cVar, String str, String str2, String str3) {
        C8951o f10 = rw.f.f(this, Z0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            V0().b(f10, cVar, str, str2, str3);
        }
    }

    /* access modifiers changed from: private */
    public final void q1(String str, Interaction$Component interaction$Component) {
        C8951o f10 = rw.f.f(this, Z0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            b1().a(f10, str, interaction$Component);
        }
    }

    /* access modifiers changed from: private */
    public final void r1(String str) {
        C8951o f10 = rw.f.f(this, Z0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            X0().f(f10, str);
        }
    }

    private final void s1(String str) {
        C8951o f10 = rw.f.f(this, Z0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            C13194a.C2742a.a(e1(), f10, StorageType.LOCAL, str, false, (String) null, (C) null, 56, (Object) null);
        }
    }

    public final Bx.a T0() {
        Bx.a aVar = this.f71710S;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("accountApi");
        return null;
    }

    public final Ae.e U0() {
        Ae.e eVar = this.f71709R;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public final lm.e V0() {
        lm.e eVar = this.f71711T;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("backInStockNavigation");
        return null;
    }

    public final Zf.k X0() {
        Zf.k kVar = this.f71714Y;
        if (kVar != null) {
            return kVar;
        }
        C17542s.z("cartNavigation");
        return null;
    }

    public String Z0() {
        return this.f71716y0;
    }

    public final ListPickerNavigation a1() {
        ListPickerNavigation listPickerNavigation = this.f71715Z;
        if (listPickerNavigation != null) {
            return listPickerNavigation;
        }
        C17542s.z("listPickerNavigation");
        return null;
    }

    public final Zw.a b1() {
        Zw.a aVar = this.f71712U;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("pipNavigation");
        return null;
    }

    public final C13194a e1() {
        C13194a aVar = this.f71713X;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("storePickerNavigation");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        if (rw.a.b(this)) {
            m1();
        }
        composeView.setViewCompositionStrategy(s1.d.f19581b);
        composeView.setContent(c1.c.c(192939719, true, new f(this, composeView)));
        return composeView;
    }

    public void onResume() {
        super.onResume();
        U0().o((Map<String, ? extends Object>) null, Interaction$Component.CART_MANAGE_UNAVAILABLE_ITEMS);
    }
}
