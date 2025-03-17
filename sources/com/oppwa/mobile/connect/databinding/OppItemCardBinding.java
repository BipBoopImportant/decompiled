package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.oppwa.mobile.connect.R;

public final class OppItemCardBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121628a;
    public final ImageView groupedCardsItemImage;
    public final ProgressBar loadingPanel;

    private OppItemCardBinding(RelativeLayout relativeLayout, ImageView imageView, ProgressBar progressBar) {
        this.f121628a = relativeLayout;
        this.groupedCardsItemImage = imageView;
        this.loadingPanel = progressBar;
    }

    public static OppItemCardBinding bind(View view) {
        int i10 = R.id.grouped_cards_item_image;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            i10 = R.id.loading_panel;
            ProgressBar progressBar = (ProgressBar) b.a(view, i10);
            if (progressBar != null) {
                return new OppItemCardBinding((RelativeLayout) view, imageView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppItemCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppItemCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_item_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121628a;
    }
}
