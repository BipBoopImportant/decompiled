package com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.oppwa.mobile.connect.checkout.dialog.BaseRecyclerViewAdapter;
import com.oppwa.mobile.connect.checkout.dialog.ImageLoader;
import com.oppwa.mobile.connect.checkout.meta.PaymentMethod;
import com.oppwa.mobile.connect.databinding.OppwaPaymentMethodGridItemBinding;
import java.util.Optional;

class b extends a<OppwaPaymentMethodGridItemBinding> {
    public b(PaymentMethod[] paymentMethodArr, BaseRecyclerViewAdapter.OnItemSelectedListener<PaymentMethod> onItemSelectedListener) {
        super(paymentMethodArr, onItemSelectedListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public OppwaPaymentMethodGridItemBinding a(ViewGroup viewGroup) {
        return OppwaPaymentMethodGridItemBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
    }

    /* renamed from: a */
    public void onBindViewHolder(BaseRecyclerViewAdapter.ViewHolder<OppwaPaymentMethodGridItemBinding> viewHolder, int i10) {
        Optional.ofNullable(ImageLoader.getInstance(viewHolder.itemView.getContext()).getImage(((PaymentMethod[]) this.f120831a)[i10].getBrand())).ifPresent(new p(viewHolder));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(BaseRecyclerViewAdapter.ViewHolder viewHolder, Bitmap bitmap) {
        ((OppwaPaymentMethodGridItemBinding) viewHolder.getBinding()).logo.setImageBitmap(bitmap);
        ((OppwaPaymentMethodGridItemBinding) viewHolder.getBinding()).progress.setVisibility(8);
    }
}
