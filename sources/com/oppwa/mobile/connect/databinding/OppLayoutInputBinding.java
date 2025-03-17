package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.view.CheckoutEditText;
import com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView;

public final class OppLayoutInputBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f121641a;
    public final CheckoutEditText editText;
    public final CheckoutTextView helperTextView;
    public final TextInputLayout textInputLayout;

    private OppLayoutInputBinding(LinearLayout linearLayout, CheckoutEditText checkoutEditText, CheckoutTextView checkoutTextView, TextInputLayout textInputLayout2) {
        this.f121641a = linearLayout;
        this.editText = checkoutEditText;
        this.helperTextView = checkoutTextView;
        this.textInputLayout = textInputLayout2;
    }

    public static OppLayoutInputBinding bind(View view) {
        int i10 = R.id.edit_text;
        CheckoutEditText checkoutEditText = (CheckoutEditText) b.a(view, i10);
        if (checkoutEditText != null) {
            i10 = R.id.helper_text_view;
            CheckoutTextView checkoutTextView = (CheckoutTextView) b.a(view, i10);
            if (checkoutTextView != null) {
                i10 = R.id.text_input_layout;
                TextInputLayout textInputLayout2 = (TextInputLayout) b.a(view, i10);
                if (textInputLayout2 != null) {
                    return new OppLayoutInputBinding((LinearLayout) view, checkoutEditText, checkoutTextView, textInputLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppLayoutInputBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppLayoutInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_layout_input, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.f121641a;
    }
}
