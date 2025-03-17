package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.bankaccount.IdealPaymentParams;
import java.util.ArrayList;
import java.util.List;

public class KlarnaPaymentInfoFragment extends PaymentInfoFragment implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: p  reason: collision with root package name */
    private List<CheckBox> f121015p;

    private void a(String str, C14107t tVar, ViewGroup viewGroup) {
        View inflate = ((LayoutInflater) getActivity().getSystemService("layout_inflater")).inflate(R.layout.opp_layout_terms_agreement, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.agreement_text);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.agreement_checkbox);
        Utils.formatHtmlTextView(getContext(), (TextView) inflate.findViewById(R.id.agreement_link), Utils.createHtmlLinkTag(tVar.b(), b(tVar, str)));
        if (tVar.c() == null) {
            textView.setVisibility(8);
            checkBox.setVisibility(8);
        } else if (this.f121052e.getKlarnaCountry().equals(IdealPaymentParams.DEFAULT_COUNTRY)) {
            ImageView imageView = (ImageView) inflate.findViewById(R.id.agreement_image);
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.klarna_credit_warning);
            textView.setVisibility(8);
            checkBox.setVisibility(8);
        } else {
            Utils.formatHtmlTextView(getContext(), textView, a(tVar, str));
            checkBox.setOnCheckedChangeListener(this);
            a(checkBox);
        }
        viewGroup.addView(inflate);
    }

    private String e() {
        return C14069g.a(getContext(), this.f121055h.equals(CheckoutConstants.PaymentBrands.KLARNA_INVOICE) ? R.raw.klarna_invoice_settings : R.raw.klarna_installments_settings);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f121060m.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public PaymentParams b() {
        try {
            return new PaymentParams(this.f121052e.getCheckoutId(), this.f121055h);
        } catch (PaymentException unused) {
            return null;
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        List<CheckBox> list = this.f121015p;
        if (list != null && list.size() != 0) {
            for (CheckBox isChecked : this.f121015p) {
                if (!isChecked.isChecked()) {
                    this.f121060m.setEnabled(false);
                    this.f121060m.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.opp_hide_button));
                    new Handler(Looper.getMainLooper()).postDelayed(new W1(this), (long) getResources().getInteger(R.integer.button_anim_time));
                    return;
                }
            }
            this.f121060m.setEnabled(true);
            this.f121060m.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.opp_show_button));
            this.f121060m.setVisibility(0);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.opp_fragment_klarna_payment_info, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C14107t a10;
        super.onViewCreated(view, bundle);
        String[] klarnaMerchantIds = this.f121053f.getKlarnaMerchantIds();
        if (klarnaMerchantIds != null && klarnaMerchantIds.length != 0 && (a10 = C14104s.a(e(), this.f121052e.getKlarnaCountry())) != null) {
            ((TextView) view.findViewById(R.id.klarna_title)).setText(a10.d());
            for (String a11 : klarnaMerchantIds) {
                a(a11, a10, (ViewGroup) view.findViewById(R.id.payment_info));
            }
            List<CheckBox> list = this.f121015p;
            if (list != null && list.size() > 0) {
                this.f121060m.setVisibility(8);
            }
        }
    }

    private String b(C14107t tVar, String str) {
        String str2 = tVar.a().replace("{EID}", str) + "?fee=";
        if (this.f121055h.equals(CheckoutConstants.PaymentBrands.KLARNA_INVOICE)) {
            return str2 + this.f121052e.getKlarnaInvoiceFee();
        }
        return str2 + this.f121052e.getKlarnaInstallmentsFee();
    }

    private String a(C14107t tVar, String str) {
        String c10 = tVar.c();
        if (c10 != null) {
            return c10.replace("{EID}", str);
        }
        return null;
    }

    private void a(CheckBox checkBox) {
        if (this.f121015p == null) {
            this.f121015p = new ArrayList();
        }
        this.f121015p.add(checkBox);
    }
}
