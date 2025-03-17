package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import com.oppwa.mobile.connect.R;

public final class OppLayoutInstallmentsDropdownBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f121642a;
    public final AppCompatSpinner numberOfInstallmentsSpinner;
    public final TextView spinnerTitle;

    private OppLayoutInstallmentsDropdownBinding(LinearLayout linearLayout, AppCompatSpinner appCompatSpinner, TextView textView) {
        this.f121642a = linearLayout;
        this.numberOfInstallmentsSpinner = appCompatSpinner;
        this.spinnerTitle = textView;
    }

    public static OppLayoutInstallmentsDropdownBinding bind(View view) {
        int i10 = R.id.number_of_installments_spinner;
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) b.a(view, i10);
        if (appCompatSpinner != null) {
            i10 = R.id.spinner_title;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                return new OppLayoutInstallmentsDropdownBinding((LinearLayout) view, appCompatSpinner, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppLayoutInstallmentsDropdownBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppLayoutInstallmentsDropdownBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_layout_installments_dropdown, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.f121642a;
    }
}
