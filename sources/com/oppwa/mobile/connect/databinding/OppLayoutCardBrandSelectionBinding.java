package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView;

public final class OppLayoutCardBrandSelectionBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121639a;
    public final RecyclerView cardBrandsRecyclerView;
    public final CheckoutTextView chooseCardType;

    private OppLayoutCardBrandSelectionBinding(RelativeLayout relativeLayout, RecyclerView recyclerView, CheckoutTextView checkoutTextView) {
        this.f121639a = relativeLayout;
        this.cardBrandsRecyclerView = recyclerView;
        this.chooseCardType = checkoutTextView;
    }

    public static OppLayoutCardBrandSelectionBinding bind(View view) {
        int i10 = R.id.card_brands_recycler_view;
        RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
        if (recyclerView != null) {
            i10 = R.id.choose_card_type;
            CheckoutTextView checkoutTextView = (CheckoutTextView) b.a(view, i10);
            if (checkoutTextView != null) {
                return new OppLayoutCardBrandSelectionBinding((RelativeLayout) view, recyclerView, checkoutTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppLayoutCardBrandSelectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppLayoutCardBrandSelectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_layout_card_brand_selection, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121639a;
    }
}
