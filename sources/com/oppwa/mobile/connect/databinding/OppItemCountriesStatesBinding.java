package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.oppwa.mobile.connect.R;

public final class OppItemCountriesStatesBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f121630a;

    private OppItemCountriesStatesBinding(TextView textView) {
        this.f121630a = textView;
    }

    public static OppItemCountriesStatesBinding bind(View view) {
        if (view != null) {
            return new OppItemCountriesStatesBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static OppItemCountriesStatesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppItemCountriesStatesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_item_countries_states, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public TextView getRoot() {
        return this.f121630a;
    }
}
