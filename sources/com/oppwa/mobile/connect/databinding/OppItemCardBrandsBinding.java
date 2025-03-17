package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.oppwa.mobile.connect.R;

public final class OppItemCardBrandsBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f121629a;
    public final RelativeLayout cardBrandBorder;
    public final ImageView cardBrandLogo;
    public final ImageView expandBrandSelectionImageview;
    public final ProgressBar loadingPanelItemCardBrands;

    private OppItemCardBrandsBinding(FrameLayout frameLayout, RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ProgressBar progressBar) {
        this.f121629a = frameLayout;
        this.cardBrandBorder = relativeLayout;
        this.cardBrandLogo = imageView;
        this.expandBrandSelectionImageview = imageView2;
        this.loadingPanelItemCardBrands = progressBar;
    }

    public static OppItemCardBrandsBinding bind(View view) {
        int i10 = R.id.card_brand_border;
        RelativeLayout relativeLayout = (RelativeLayout) b.a(view, i10);
        if (relativeLayout != null) {
            i10 = R.id.card_brand_logo;
            ImageView imageView = (ImageView) b.a(view, i10);
            if (imageView != null) {
                i10 = R.id.expand_brand_selection_imageview;
                ImageView imageView2 = (ImageView) b.a(view, i10);
                if (imageView2 != null) {
                    i10 = R.id.loading_panel_item_card_brands;
                    ProgressBar progressBar = (ProgressBar) b.a(view, i10);
                    if (progressBar != null) {
                        return new OppItemCardBrandsBinding((FrameLayout) view, relativeLayout, imageView, imageView2, progressBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppItemCardBrandsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppItemCardBrandsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_item_card_brands, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.f121629a;
    }
}
