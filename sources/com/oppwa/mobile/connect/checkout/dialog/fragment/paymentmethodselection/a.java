package com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection;

import X4.a;
import com.oppwa.mobile.connect.checkout.dialog.BaseRecyclerViewAdapter;
import com.oppwa.mobile.connect.checkout.dialog.ImageLoader;
import com.oppwa.mobile.connect.checkout.meta.PaymentMethod;

abstract class a<T extends X4.a> extends BaseRecyclerViewAdapter<PaymentMethod, T> implements ImageLoader.Listener {
    public a(PaymentMethod[] paymentMethodArr, BaseRecyclerViewAdapter.OnItemSelectedListener<PaymentMethod> onItemSelectedListener) {
        super(paymentMethodArr, onItemSelectedListener);
    }

    public void onImageLoaded(String str) {
        PaymentMethod[] paymentMethodArr = (PaymentMethod[]) this.f120831a;
        int length = paymentMethodArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            if (paymentMethodArr[i10].getBrand().equals(str)) {
                notifyItemChanged(i11);
                return;
            } else {
                i11++;
                i10++;
            }
        }
    }
}
