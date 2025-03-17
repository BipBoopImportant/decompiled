package com.ingka.ikea.app.cart.interactor;

import D2.d;
import XH.C16796C;
import XH.C16807N;
import Xo.f;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ingka.ikea.core.android.fragments.BaseBottomSheetDialogFragment;
import gg.C9740b;
import gg.C9741c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00178BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/ingka/ikea/app/cart/interactor/ConfirmationBottomSheetDialog;", "Lcom/ingka/ikea/core/android/fragments/BaseBottomSheetDialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LXH/N;", "onDestroyView", "Lkotlin/Function0;", "L", "LnI/a;", "getConfirmationLambda", "()LnI/a;", "C0", "(LnI/a;)V", "confirmationLambda", "LRf/a;", "M", "LRf/a;", "_binding", "z0", "()LRf/a;", "binding", "N", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfirmationBottomSheetDialog extends BaseBottomSheetDialogFragment {

    /* renamed from: N  reason: collision with root package name */
    public static final a f71863N = new a((DefaultConstructorMarker) null);

    /* renamed from: O  reason: collision with root package name */
    public static final int f71864O = 8;

    /* renamed from: L  reason: collision with root package name */
    private C17631a<C16807N> f71865L;

    /* renamed from: M  reason: collision with root package name */
    private Rf.a f71866M;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/app/cart/interactor/ConfirmationBottomSheetDialog$a;", "", "<init>", "()V", "", "title", "message", "buttonString", "Lcom/ingka/ikea/app/cart/interactor/ConfirmationBottomSheetDialog;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ingka/ikea/app/cart/interactor/ConfirmationBottomSheetDialog;", "TAG", "Ljava/lang/String;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ConfirmationBottomSheetDialog a(String str, String str2, String str3) {
            C17542s.j(str2, "message");
            C17542s.j(str3, "buttonString");
            ConfirmationBottomSheetDialog confirmationBottomSheetDialog = new ConfirmationBottomSheetDialog();
            confirmationBottomSheetDialog.setArguments(d.b(C16796C.a("dialog_title", str), C16796C.a("dialog_message", str2), C16796C.a("dialog_button_string", str3)));
            return confirmationBottomSheetDialog;
        }

        private a() {
        }
    }

    /* access modifiers changed from: private */
    public static final void A0(ConfirmationBottomSheetDialog confirmationBottomSheetDialog, View view) {
        C17631a<C16807N> aVar = confirmationBottomSheetDialog.f71865L;
        if (aVar != null) {
            aVar.invoke();
        }
        confirmationBottomSheetDialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void B0(ConfirmationBottomSheetDialog confirmationBottomSheetDialog, View view) {
        confirmationBottomSheetDialog.dismiss();
    }

    private final Rf.a z0() {
        Rf.a aVar = this.f71866M;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void C0(C17631a<C16807N> aVar) {
        this.f71865L = aVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        this.f71866M = Rf.a.c(layoutInflater);
        Bundle arguments = getArguments();
        String str = null;
        String string = arguments != null ? arguments.getString("dialog_title") : null;
        TextView textView = z0().f63197f;
        int i10 = 0;
        textView.setVisibility((string == null || string.length() == 0) ? 8 : 0);
        textView.setText(string);
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("dialog_message") : null;
        TextView textView2 = z0().f63196e;
        if (string2 == null || string2.length() == 0) {
            i10 = 8;
        }
        textView2.setVisibility(i10);
        textView2.setText(f.a(string2));
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str = arguments3.getString("dialog_button_string");
        }
        Button button = z0().f63195d;
        button.setText(str);
        button.setOnClickListener(new C9740b(this));
        z0().f63194c.setOnClickListener(new C9741c(this));
        LinearLayout b10 = z0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        this.f71866M = null;
        super.onDestroyView();
    }
}
