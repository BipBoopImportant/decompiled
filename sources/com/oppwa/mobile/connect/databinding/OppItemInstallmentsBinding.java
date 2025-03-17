package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.oppwa.mobile.connect.R;

public final class OppItemInstallmentsBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f121632a;

    private OppItemInstallmentsBinding(TextView textView) {
        this.f121632a = textView;
    }

    public static OppItemInstallmentsBinding bind(View view) {
        if (view != null) {
            return new OppItemInstallmentsBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static OppItemInstallmentsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppItemInstallmentsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_item_installments, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public TextView getRoot() {
        return this.f121632a;
    }
}
