package com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection;

import android.graphics.Bitmap;
import com.oppwa.mobile.connect.checkout.dialog.BaseRecyclerViewAdapter;
import java.util.function.Consumer;

public final /* synthetic */ class q implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseRecyclerViewAdapter.ViewHolder f121237a;

    public /* synthetic */ q(BaseRecyclerViewAdapter.ViewHolder viewHolder) {
        this.f121237a = viewHolder;
    }

    public final void accept(Object obj) {
        c.a(this.f121237a, (Bitmap) obj);
    }
}
