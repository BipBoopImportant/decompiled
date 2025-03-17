package com.ingka.ikea.scanandgo.cart.impl.dialog;

import D2.d;
import Gy.b;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import android.os.Bundle;
import android.view.View;
import com.ingka.ikea.app.uicomponents.fragment.DelegateBottomSheet;
import dl.C11205j;
import dl.C11206k;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/scanandgo/cart/impl/dialog/CartErrorBottomSheet;", "Lcom/ingka/ikea/app/uicomponents/fragment/DelegateBottomSheet;", "<init>", "()V", "LLg/d;", "y0", "()LLg/d;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ldl/k;", "Q", "LXH/o;", "H0", "()Ldl/k;", "errorFeedback", "R", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CartErrorBottomSheet extends DelegateBottomSheet {

    /* renamed from: R  reason: collision with root package name */
    public static final a f119837R = new a((DefaultConstructorMarker) null);

    /* renamed from: S  reason: collision with root package name */
    public static final int f119838S = 8;

    /* renamed from: Q  reason: collision with root package name */
    private final C16824o f119839Q = C16825p.b(new Gy.a(this));

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/scanandgo/cart/impl/dialog/CartErrorBottomSheet$a;", "", "<init>", "()V", "", "title", "body", "Lcom/ingka/ikea/scanandgo/cart/impl/dialog/CartErrorBottomSheet;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ingka/ikea/scanandgo/cart/impl/dialog/CartErrorBottomSheet;", "CART_ERROR_INFORMATION", "Ljava/lang/String;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CartErrorBottomSheet a(String str, String str2) {
            C17542s.j(str2, "body");
            CartErrorBottomSheet cartErrorBottomSheet = new CartErrorBottomSheet();
            cartErrorBottomSheet.setArguments(d.b(C16796C.a("cart_error_information", new C11206k(str, str2))));
            return cartErrorBottomSheet;
        }

        private a() {
        }
    }

    /* access modifiers changed from: private */
    public static final C11206k F0(CartErrorBottomSheet cartErrorBottomSheet) {
        Serializable serializable = cartErrorBottomSheet.requireArguments().getSerializable("cart_error_information");
        C17542s.h(serializable, "null cannot be cast to non-null type com.ingka.ikea.app.uicomponents.delegates.ErrorFeedbackResource");
        return (C11206k) serializable;
    }

    /* access modifiers changed from: private */
    public static final C16807N G0(CartErrorBottomSheet cartErrorBottomSheet) {
        cartErrorBottomSheet.dismiss();
        return C16807N.f139792a;
    }

    private final C11206k H0() {
        return (C11206k) this.f119839Q.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Lg.d.q(A0(), C16877v.e(H0()), false, (C17642l) null, 6, (Object) null);
    }

    /* access modifiers changed from: protected */
    public Lg.d y0() {
        return new Lg.d((Lg.a<?>[]) new Lg.a[]{new C11205j(new b(this))});
    }
}
