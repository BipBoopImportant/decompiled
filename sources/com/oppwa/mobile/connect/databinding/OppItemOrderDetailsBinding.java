package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.oppwa.mobile.connect.R;

public final class OppItemOrderDetailsBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f121633a;
    public final TextView orderItemAmount;
    public final TextView orderItemTitle;

    private OppItemOrderDetailsBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f121633a = linearLayout;
        this.orderItemAmount = textView;
        this.orderItemTitle = textView2;
    }

    public static OppItemOrderDetailsBinding bind(View view) {
        int i10 = R.id.order_item_amount;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = R.id.order_item_title;
            TextView textView2 = (TextView) b.a(view, i10);
            if (textView2 != null) {
                return new OppItemOrderDetailsBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppItemOrderDetailsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppItemOrderDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_item_order_details, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.f121633a;
    }
}
