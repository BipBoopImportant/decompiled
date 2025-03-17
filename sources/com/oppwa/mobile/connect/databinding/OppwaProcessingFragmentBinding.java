package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView;

public final class OppwaProcessingFragmentBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f121659a;
    public final OppLayoutActionbarBinding header;
    public final CheckoutTextView processingText;
    public final ProgressBar progressBar;

    private OppwaProcessingFragmentBinding(ConstraintLayout constraintLayout, OppLayoutActionbarBinding oppLayoutActionbarBinding, CheckoutTextView checkoutTextView, ProgressBar progressBar2) {
        this.f121659a = constraintLayout;
        this.header = oppLayoutActionbarBinding;
        this.processingText = checkoutTextView;
        this.progressBar = progressBar2;
    }

    public static OppwaProcessingFragmentBinding bind(View view) {
        int i10 = R.id.header;
        View a10 = b.a(view, i10);
        if (a10 != null) {
            OppLayoutActionbarBinding bind = OppLayoutActionbarBinding.bind(a10);
            int i11 = R.id.processing_text;
            CheckoutTextView checkoutTextView = (CheckoutTextView) b.a(view, i11);
            if (checkoutTextView != null) {
                i11 = R.id.progress_bar;
                ProgressBar progressBar2 = (ProgressBar) b.a(view, i11);
                if (progressBar2 != null) {
                    return new OppwaProcessingFragmentBinding((ConstraintLayout) view, bind, checkoutTextView, progressBar2);
                }
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppwaProcessingFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppwaProcessingFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.oppwa_processing_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.f121659a;
    }
}
