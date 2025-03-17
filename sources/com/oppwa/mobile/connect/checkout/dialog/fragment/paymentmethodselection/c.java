package com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.oppwa.mobile.connect.checkout.dialog.BaseRecyclerViewAdapter;
import com.oppwa.mobile.connect.checkout.dialog.ImageLoader;
import com.oppwa.mobile.connect.checkout.meta.PaymentMethod;
import com.oppwa.mobile.connect.databinding.OppwaPaymentMethodListItemBinding;
import java.util.Optional;

class c extends a<OppwaPaymentMethodListItemBinding> {
    public c(PaymentMethod[] paymentMethodArr, BaseRecyclerViewAdapter.OnItemSelectedListener<PaymentMethod> onItemSelectedListener) {
        super(paymentMethodArr, onItemSelectedListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public OppwaPaymentMethodListItemBinding a(ViewGroup viewGroup) {
        return OppwaPaymentMethodListItemBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
    }

    /* renamed from: a */
    public void onBindViewHolder(BaseRecyclerViewAdapter.ViewHolder<OppwaPaymentMethodListItemBinding> viewHolder, int i10) {
        PaymentMethod paymentMethod = ((PaymentMethod[]) this.f120831a)[i10];
        Optional.ofNullable(ImageLoader.getInstance(viewHolder.itemView.getContext()).getImage(paymentMethod.getBrand())).ifPresent(new q(viewHolder));
        viewHolder.getBinding().paymentBrandTitle.setText(paymentMethod.getDisplayableName());
        viewHolder.itemView.setContentDescription(paymentMethod.getDisplayableName());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(BaseRecyclerViewAdapter.ViewHolder viewHolder, Bitmap bitmap) {
        ((OppwaPaymentMethodListItemBinding) viewHolder.getBinding()).paymentBrandImage.setImageBitmap(bitmap);
        ((OppwaPaymentMethodListItemBinding) viewHolder.getBinding()).loadingPanel.setVisibility(8);
    }
}
