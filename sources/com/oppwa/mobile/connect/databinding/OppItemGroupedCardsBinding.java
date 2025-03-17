package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.oppwa.mobile.connect.R;

public final class OppItemGroupedCardsBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121631a;
    public final RecyclerView cardBrandsRecyclerView;
    public final ImageView listDisclosureImage;

    private OppItemGroupedCardsBinding(RelativeLayout relativeLayout, RecyclerView recyclerView, ImageView imageView) {
        this.f121631a = relativeLayout;
        this.cardBrandsRecyclerView = recyclerView;
        this.listDisclosureImage = imageView;
    }

    public static OppItemGroupedCardsBinding bind(View view) {
        int i10 = R.id.card_brands_recycler_view;
        RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
        if (recyclerView != null) {
            i10 = R.id.list_disclosure_image;
            ImageView imageView = (ImageView) b.a(view, i10);
            if (imageView != null) {
                return new OppItemGroupedCardsBinding((RelativeLayout) view, recyclerView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppItemGroupedCardsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppItemGroupedCardsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_item_grouped_cards, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121631a;
    }
}
