package com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection;

import android.graphics.Bitmap;
import com.oppwa.mobile.connect.checkout.dialog.BaseRecyclerViewAdapter;
import java.util.function.Consumer;

public final /* synthetic */ class p implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseRecyclerViewAdapter.ViewHolder f121236a;

    public /* synthetic */ p(BaseRecyclerViewAdapter.ViewHolder viewHolder) {
        this.f121236a = viewHolder;
    }

    public final void accept(Object obj) {
        b.a(this.f121236a, (Bitmap) obj);
    }
}
