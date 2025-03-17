package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.oppwa.mobile.connect.R;

public final class AsyncPaymentActivityBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f121603a;
    public final FragmentContainerView contentView;

    private AsyncPaymentActivityBinding(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView) {
        this.f121603a = constraintLayout;
        this.contentView = fragmentContainerView;
    }

    public static AsyncPaymentActivityBinding bind(View view) {
        int i10 = R.id.content_view;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) b.a(view, i10);
        if (fragmentContainerView != null) {
            return new AsyncPaymentActivityBinding((ConstraintLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AsyncPaymentActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static AsyncPaymentActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.async_payment_activity, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.f121603a;
    }
}
