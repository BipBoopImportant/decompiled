package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.oppwa.mobile.connect.R;

public final class OppLayoutBillingAddressBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121638a;
    public final TextView billingAddressHeader;
    public final TextView billingAddressTextView;
    public final ImageView listDisclosureImage;

    private OppLayoutBillingAddressBinding(RelativeLayout relativeLayout, TextView textView, TextView textView2, ImageView imageView) {
        this.f121638a = relativeLayout;
        this.billingAddressHeader = textView;
        this.billingAddressTextView = textView2;
        this.listDisclosureImage = imageView;
    }

    public static OppLayoutBillingAddressBinding bind(View view) {
        int i10 = R.id.billing_address_header;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = R.id.billing_address_text_view;
            TextView textView2 = (TextView) b.a(view, i10);
            if (textView2 != null) {
                i10 = R.id.list_disclosure_image;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    return new OppLayoutBillingAddressBinding((RelativeLayout) view, textView, textView2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppLayoutBillingAddressBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppLayoutBillingAddressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_layout_billing_address, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121638a;
    }
}
