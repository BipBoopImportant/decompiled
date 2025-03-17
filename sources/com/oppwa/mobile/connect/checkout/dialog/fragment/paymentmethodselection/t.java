package com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection;

import android.graphics.Bitmap;
import com.oppwa.mobile.connect.checkout.dialog.BaseRecyclerViewAdapter;
import java.util.function.Consumer;

public final /* synthetic */ class t implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseRecyclerViewAdapter.ViewHolder f121238a;

    public /* synthetic */ t(BaseRecyclerViewAdapter.ViewHolder viewHolder) {
        this.f121238a = viewHolder;
    }

    public final void accept(Object obj) {
        d.a(this.f121238a, (Bitmap) obj);
    }
}
