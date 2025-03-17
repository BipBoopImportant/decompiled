package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView;

public final class OppFragmentProcessingBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121625a;
    public final CheckoutTextView connectCheckoutTransactionExecuteHint;
    public final ProgressBar connectCheckoutTransactionExecuteIndicator;

    private OppFragmentProcessingBinding(RelativeLayout relativeLayout, CheckoutTextView checkoutTextView, ProgressBar progressBar) {
        this.f121625a = relativeLayout;
        this.connectCheckoutTransactionExecuteHint = checkoutTextView;
        this.connectCheckoutTransactionExecuteIndicator = progressBar;
    }

    public static OppFragmentProcessingBinding bind(View view) {
        int i10 = R.id.connect_checkout_transaction_execute_hint;
        CheckoutTextView checkoutTextView = (CheckoutTextView) b.a(view, i10);
        if (checkoutTextView != null) {
            i10 = R.id.connect_checkout_transaction_execute_indicator;
            ProgressBar progressBar = (ProgressBar) b.a(view, i10);
            if (progressBar != null) {
                return new OppFragmentProcessingBinding((RelativeLayout) view, checkoutTextView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppFragmentProcessingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppFragmentProcessingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_fragment_processing, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121625a;
    }
}
