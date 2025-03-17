package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView;

public final class OppLayoutStorePaymentInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f121644a;
    public final AppCompatCheckBox storePaymentInfoCheckbox;
    public final CheckoutTextView storePaymentInfoText;

    private OppLayoutStorePaymentInfoBinding(LinearLayout linearLayout, AppCompatCheckBox appCompatCheckBox, CheckoutTextView checkoutTextView) {
        this.f121644a = linearLayout;
        this.storePaymentInfoCheckbox = appCompatCheckBox;
        this.storePaymentInfoText = checkoutTextView;
    }

    public static OppLayoutStorePaymentInfoBinding bind(View view) {
        int i10 = R.id.store_payment_info_checkbox;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) b.a(view, i10);
        if (appCompatCheckBox != null) {
            i10 = R.id.store_payment_info_text;
            CheckoutTextView checkoutTextView = (CheckoutTextView) b.a(view, i10);
            if (checkoutTextView != null) {
                return new OppLayoutStorePaymentInfoBinding((LinearLayout) view, appCompatCheckBox, checkoutTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppLayoutStorePaymentInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppLayoutStorePaymentInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_layout_store_payment_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.f121644a;
    }
}
