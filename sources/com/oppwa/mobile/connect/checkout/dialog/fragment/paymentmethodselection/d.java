package com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.BaseRecyclerViewAdapter;
import com.oppwa.mobile.connect.checkout.dialog.ImageLoader;
import com.oppwa.mobile.connect.checkout.dialog.Utils;
import com.oppwa.mobile.connect.checkout.meta.PaymentMethod;
import com.oppwa.mobile.connect.databinding.OppwaPaymentMethodTokenListItemBinding;
import com.oppwa.mobile.connect.payment.token.Token;
import java.util.Optional;

class d extends a<OppwaPaymentMethodTokenListItemBinding> {
    public d(PaymentMethod[] paymentMethodArr, BaseRecyclerViewAdapter.OnItemSelectedListener<PaymentMethod> onItemSelectedListener) {
        super(paymentMethodArr, onItemSelectedListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public OppwaPaymentMethodTokenListItemBinding a(ViewGroup viewGroup) {
        return OppwaPaymentMethodTokenListItemBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
    }

    /* renamed from: a */
    public void onBindViewHolder(BaseRecyclerViewAdapter.ViewHolder<OppwaPaymentMethodTokenListItemBinding> viewHolder, int i10) {
        PaymentMethod paymentMethod = ((PaymentMethod[]) this.f120831a)[i10];
        Context context = viewHolder.itemView.getContext();
        Optional.ofNullable(ImageLoader.getInstance(context).getImage(paymentMethod.getBrand())).ifPresent(new t(viewHolder));
        String a10 = a(paymentMethod);
        if (a(paymentMethod.getToken())) {
            viewHolder.getBinding().paymentTokenErroredTitle.setText(a10);
            viewHolder.getBinding().paymentTokenErroredTitle.setVisibility(0);
            viewHolder.getBinding().paymentTokenTitle.setVisibility(8);
        } else {
            viewHolder.getBinding().paymentTokenTitle.setText(a10);
            viewHolder.getBinding().paymentTokenTitle.setVisibility(0);
            viewHolder.getBinding().paymentTokenErroredTitle.setVisibility(8);
        }
        viewHolder.itemView.setContentDescription(a(context, paymentMethod));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(BaseRecyclerViewAdapter.ViewHolder viewHolder, Bitmap bitmap) {
        ((OppwaPaymentMethodTokenListItemBinding) viewHolder.getBinding()).paymentTokenImage.setImageBitmap(bitmap);
        ((OppwaPaymentMethodTokenListItemBinding) viewHolder.getBinding()).loadingPanel.setVisibility(8);
    }

    private String a(PaymentMethod paymentMethod) {
        return (String) Optional.ofNullable(paymentMethod.getToken()).map(new u(paymentMethod)).orElse(paymentMethod.getDisplayableName());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(PaymentMethod paymentMethod, Token token) {
        if (token.getCard() != null) {
            return Utils.maskCardNumber(token.getCard().getLast4Digits()) + " " + Utils.getFormattedCardExpirationDate(token.getCard());
        } else if (token.getBankAccount() != null) {
            return Utils.maskIban(token.getBankAccount().getIban());
        } else {
            if (token.getVirtualAccount() != null) {
                return Utils.maskEmail(token.getVirtualAccount().getAccountId());
            }
            return paymentMethod.getDisplayableName();
        }
    }

    private String a(Context context, PaymentMethod paymentMethod) {
        return String.format(context.getString(R.string.checkout_layout_text_pay_with_stored_payment_method), new Object[]{paymentMethod.getDisplayableName()});
    }

    private boolean a(Token token) {
        return ((Boolean) Optional.ofNullable(token).map(new r()).map(new s()).orElse(Boolean.FALSE)).booleanValue();
    }
}
