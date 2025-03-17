package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.i;
import com.oppwa.mobile.connect.R;

public class BillingAddressLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f120856a;

    public BillingAddressLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void a() {
        this.f120856a = (TextView) findViewById(R.id.billing_address_text_view);
    }

    public void changeStyleOfBillingAddress(int i10) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{i10});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        i.p(this.f120856a, resourceId);
    }

    public void showBillingAddress(String str) {
        this.f120856a.setText(str);
    }

    public BillingAddressLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater != null) {
            layoutInflater.inflate(R.layout.opp_layout_billing_address, this, true);
            a();
        }
    }
}
