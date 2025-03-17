package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.oppwa.mobile.connect.R;

public final class OppwaPaymentMethodGridItemBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f121655a;
    public final ImageView logo;
    public final ProgressBar progress;

    private OppwaPaymentMethodGridItemBinding(ConstraintLayout constraintLayout, ImageView imageView, ProgressBar progressBar) {
        this.f121655a = constraintLayout;
        this.logo = imageView;
        this.progress = progressBar;
    }

    public static OppwaPaymentMethodGridItemBinding bind(View view) {
        int i10 = R.id.logo;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            i10 = R.id.progress;
            ProgressBar progressBar = (ProgressBar) b.a(view, i10);
            if (progressBar != null) {
                return new OppwaPaymentMethodGridItemBinding((ConstraintLayout) view, imageView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppwaPaymentMethodGridItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppwaPaymentMethodGridItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.oppwa_payment_method_grid_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.f121655a;
    }
}
