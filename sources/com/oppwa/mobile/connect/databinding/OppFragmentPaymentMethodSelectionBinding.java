package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.oppwa.mobile.connect.R;

public final class OppFragmentPaymentMethodSelectionBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f121624a;
    public final TextView paymentBrandSectionTitle;
    public final RecyclerView paymentBrandsRecyclerView;
    public final TextView paymentCardsBrandSectionTitle;
    public final RecyclerView paymentCardsBrandsRecyclerView;
    public final LinearLayout paymentMethodSelectionLayout;
    public final RecyclerView paymentTokensRecyclerView;
    public final TextView paymentTokensSectionTitle;
    public final TextView totalAmountHeader;
    public final TextView totalAmountValue;
    public final LinearLayout totalAmountView;

    private OppFragmentPaymentMethodSelectionBinding(FrameLayout frameLayout, TextView textView, RecyclerView recyclerView, TextView textView2, RecyclerView recyclerView2, LinearLayout linearLayout, RecyclerView recyclerView3, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout2) {
        this.f121624a = frameLayout;
        this.paymentBrandSectionTitle = textView;
        this.paymentBrandsRecyclerView = recyclerView;
        this.paymentCardsBrandSectionTitle = textView2;
        this.paymentCardsBrandsRecyclerView = recyclerView2;
        this.paymentMethodSelectionLayout = linearLayout;
        this.paymentTokensRecyclerView = recyclerView3;
        this.paymentTokensSectionTitle = textView3;
        this.totalAmountHeader = textView4;
        this.totalAmountValue = textView5;
        this.totalAmountView = linearLayout2;
    }

    public static OppFragmentPaymentMethodSelectionBinding bind(View view) {
        int i10 = R.id.payment_brand_section_title;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = R.id.payment_brands_recycler_view;
            RecyclerView recyclerView = (RecyclerView) b.a(view, i10);
            if (recyclerView != null) {
                i10 = R.id.payment_cards_brand_section_title;
                TextView textView2 = (TextView) b.a(view, i10);
                if (textView2 != null) {
                    i10 = R.id.payment_cards_brands_recycler_view;
                    RecyclerView recyclerView2 = (RecyclerView) b.a(view, i10);
                    if (recyclerView2 != null) {
                        i10 = R.id.payment_method_selection_layout;
                        LinearLayout linearLayout = (LinearLayout) b.a(view, i10);
                        if (linearLayout != null) {
                            i10 = R.id.payment_tokens_recycler_view;
                            RecyclerView recyclerView3 = (RecyclerView) b.a(view, i10);
                            if (recyclerView3 != null) {
                                i10 = R.id.payment_tokens_section_title;
                                TextView textView3 = (TextView) b.a(view, i10);
                                if (textView3 != null) {
                                    i10 = R.id.total_amount_header;
                                    TextView textView4 = (TextView) b.a(view, i10);
                                    if (textView4 != null) {
                                        i10 = R.id.total_amount_value;
                                        TextView textView5 = (TextView) b.a(view, i10);
                                        if (textView5 != null) {
                                            i10 = R.id.total_amount_view;
                                            LinearLayout linearLayout2 = (LinearLayout) b.a(view, i10);
                                            if (linearLayout2 != null) {
                                                return new OppFragmentPaymentMethodSelectionBinding((FrameLayout) view, textView, recyclerView, textView2, recyclerView2, linearLayout, recyclerView3, textView3, textView4, textView5, linearLayout2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppFragmentPaymentMethodSelectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppFragmentPaymentMethodSelectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_fragment_payment_method_selection, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.f121624a;
    }
}
