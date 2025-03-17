package com.oppwa.mobile.connect.checkout.dialog;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.oppwa.mobile.connect.R;
import java.util.LinkedHashMap;

public class OrderSummaryFragment extends BaseFragment {

    /* renamed from: d  reason: collision with root package name */
    private LayoutInflater f121042d;

    /* renamed from: e  reason: collision with root package name */
    private OrderSummary f121043e;

    /* renamed from: f  reason: collision with root package name */
    private String f121044f;

    @SuppressLint({"InflateParams"})
    private View a(String str, String str2) {
        LinearLayout linearLayout = (LinearLayout) this.f121042d.inflate(R.layout.opp_item_order_details, (ViewGroup) null);
        ((TextView) linearLayout.findViewById(R.id.order_item_title)).setText(str);
        ((TextView) linearLayout.findViewById(R.id.order_item_amount)).setText(str2);
        return linearLayout;
    }

    private void b(View view) {
        ((TextView) view.findViewById(R.id.total_amount_value)).setText(Utils.getFormattedAmount(this.f121043e.getOrderTotal().doubleValue(), this.f121044f));
        LinkedHashMap<String, Double> orderItems = this.f121043e.getOrderItems();
        if (orderItems.isEmpty()) {
            view.findViewById(R.id.total_amount_divider).setVisibility(8);
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.order_details_layout);
        for (String next : orderItems.keySet()) {
            Double d10 = orderItems.get(next);
            if (d10 != null) {
                linearLayout.addView(a(next, Utils.getFormattedAmount(d10.doubleValue(), this.f121044f)));
            }
        }
    }

    private void c(View view) {
        ((TextView) view.findViewById(R.id.card_description)).setText(this.f121043e.getPaymentDetails());
        ((ImageView) view.findViewById(R.id.brand_logo)).setImageBitmap(ImageLoader.getInstance(getContext()).getImage(this.f121043e.getPaymentBrand()));
    }

    private void d(View view) {
        Button button = (Button) view.findViewById(R.id.payment_button);
        button.setText(R.string.checkout_layout_text_pay);
        button.setOnClickListener(new Z1(this));
    }

    private void e(View view) {
        if (TextUtils.isEmpty(this.f121043e.getShippingInfo())) {
            view.findViewById(R.id.shipping_address_layout).setVisibility(8);
        } else {
            ((TextView) view.findViewById(R.id.shipping_address)).setText(this.f121043e.getShippingInfo());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        getParentFragmentManager().Q1(OrderSummaryFragment.class.getName(), new Bundle());
    }

    public static OrderSummaryFragment newInstance(OrderSummary orderSummary, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CheckoutActivity.EXTRA_ORDER_SUMMARY, orderSummary);
        bundle.putString("com.oppwa.mobile.connect.checkout.dialog.EXTRA_CURRENCY", str);
        OrderSummaryFragment orderSummaryFragment = new OrderSummaryFragment();
        orderSummaryFragment.setArguments(bundle);
        return orderSummaryFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f121043e = (OrderSummary) arguments.getParcelable(CheckoutActivity.EXTRA_ORDER_SUMMARY);
            this.f121044f = arguments.getString("com.oppwa.mobile.connect.checkout.dialog.EXTRA_CURRENCY");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f121042d = layoutInflater;
        return layoutInflater.inflate(R.layout.opp_fragment_order_summary, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f120828a.setText(R.string.checkout_order_review);
        c(view);
        e(view);
        b(view);
        d(view);
    }
}
