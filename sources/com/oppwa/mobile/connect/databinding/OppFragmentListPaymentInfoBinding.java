package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView;

public final class OppFragmentListPaymentInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121620a;
    public final OppLayoutActionbarBinding header;
    public final RelativeLayout listPaymentInfoView;
    public final ListView listView;
    public final OppLayoutCheckoutPaybuttonBinding paymentButtonLayout;
    public final FrameLayout paymentInfoHeader;
    public final ProgressBar progressBar;
    public final CheckoutTextView progressText;
    public final RelativeLayout progressView;

    private OppFragmentListPaymentInfoBinding(RelativeLayout relativeLayout, OppLayoutActionbarBinding oppLayoutActionbarBinding, RelativeLayout relativeLayout2, ListView listView2, OppLayoutCheckoutPaybuttonBinding oppLayoutCheckoutPaybuttonBinding, FrameLayout frameLayout, ProgressBar progressBar2, CheckoutTextView checkoutTextView, RelativeLayout relativeLayout3) {
        this.f121620a = relativeLayout;
        this.header = oppLayoutActionbarBinding;
        this.listPaymentInfoView = relativeLayout2;
        this.listView = listView2;
        this.paymentButtonLayout = oppLayoutCheckoutPaybuttonBinding;
        this.paymentInfoHeader = frameLayout;
        this.progressBar = progressBar2;
        this.progressText = checkoutTextView;
        this.progressView = relativeLayout3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        r0 = com.oppwa.mobile.connect.R.id.payment_button_layout;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.oppwa.mobile.connect.databinding.OppFragmentListPaymentInfoBinding bind(android.view.View r12) {
        /*
            int r0 = com.oppwa.mobile.connect.R.id.header
            android.view.View r1 = X4.b.a(r12, r0)
            if (r1 == 0) goto L_0x0064
            com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding r4 = com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.list_payment_info_view
            android.view.View r1 = X4.b.a(r12, r0)
            r5 = r1
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            if (r5 == 0) goto L_0x0064
            int r0 = com.oppwa.mobile.connect.R.id.list_view
            android.view.View r1 = X4.b.a(r12, r0)
            r6 = r1
            android.widget.ListView r6 = (android.widget.ListView) r6
            if (r6 == 0) goto L_0x0064
            int r0 = com.oppwa.mobile.connect.R.id.payment_button_layout
            android.view.View r1 = X4.b.a(r12, r0)
            if (r1 == 0) goto L_0x0064
            com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding r7 = com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_header
            android.view.View r1 = X4.b.a(r12, r0)
            r8 = r1
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            if (r8 == 0) goto L_0x0064
            int r0 = com.oppwa.mobile.connect.R.id.progress_bar
            android.view.View r1 = X4.b.a(r12, r0)
            r9 = r1
            android.widget.ProgressBar r9 = (android.widget.ProgressBar) r9
            if (r9 == 0) goto L_0x0064
            int r0 = com.oppwa.mobile.connect.R.id.progress_text
            android.view.View r1 = X4.b.a(r12, r0)
            r10 = r1
            com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView r10 = (com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView) r10
            if (r10 == 0) goto L_0x0064
            int r0 = com.oppwa.mobile.connect.R.id.progress_view
            android.view.View r1 = X4.b.a(r12, r0)
            r11 = r1
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            if (r11 == 0) goto L_0x0064
            com.oppwa.mobile.connect.databinding.OppFragmentListPaymentInfoBinding r0 = new com.oppwa.mobile.connect.databinding.OppFragmentListPaymentInfoBinding
            r3 = r12
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0064:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.databinding.OppFragmentListPaymentInfoBinding.bind(android.view.View):com.oppwa.mobile.connect.databinding.OppFragmentListPaymentInfoBinding");
    }

    public static OppFragmentListPaymentInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppFragmentListPaymentInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_fragment_list_payment_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121620a;
    }
}
