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
import android.widget.TextView;
import com.google.ar.core.ImageMetadata;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.ikanooi.IkanoOiPaymentParams;

public class IkanoOiPaymentInfoFragment extends PaymentInfoFragment implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: p  reason: collision with root package name */
    private InputLayout f120960p;

    /* renamed from: q  reason: collision with root package name */
    private CheckBox f120961q;

    /* renamed from: r  reason: collision with root package name */
    private TextView f120962r;

    private String a(String str, String str2) {
        return "https://terms.bank.ikano/" + str + "/" + str2 + "/ikea/openinvoice/toc.pdf";
    }

    private void d(View view) {
        Utils.formatHtmlTextView(getContext(), this.f120962r, h());
        ((TextView) view.findViewById(R.id.agreement_text)).setText(R.string.checkout_layout_text_terms_and_conditions_agreement);
        this.f120961q.setOnCheckedChangeListener(this);
    }

    private void e(View view) {
        this.f120960p = (InputLayout) view.findViewById(R.id.national_id_input_layout);
        this.f120961q = (CheckBox) view.findViewById(R.id.agreement_checkbox);
        this.f120962r = (TextView) view.findViewById(R.id.agreement_link);
        this.f121060m.setVisibility(8);
        f();
        d(view);
    }

    private void f() {
        this.f120960p.getEditText().setInputType(ImageMetadata.LENS_FILTER_DENSITY);
        this.f120960p.setHint(getString(R.string.checkout_layout_hint_national_identifier));
        this.f120960p.setHelperText(getString(R.string.checkout_helper_national_identifier));
        this.f120960p.setInputValidator(C14099q.a(this.f121055h));
        this.f120960p.getEditText().setImeOptions(6);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.f121060m.setVisibility(8);
    }

    private String h() {
        String string = getString(R.string.checkout_layout_text_terms_and_conditions);
        String str = this.f121055h;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 580579304:
                if (str.equals(CheckoutConstants.PaymentBrands.IKANOOI_FI)) {
                    c10 = 0;
                    break;
                }
                break;
            case 580579558:
                if (str.equals(CheckoutConstants.PaymentBrands.IKANOOI_NO)) {
                    c10 = 1;
                    break;
                }
                break;
            case 580579703:
                if (str.equals(CheckoutConstants.PaymentBrands.IKANOOI_SE)) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                String createHtmlLinkTag = Utils.createHtmlLinkTag(getString(R.string.checkout_layout_text_finnish), a("fi", "fi"));
                String createHtmlLinkTag2 = Utils.createHtmlLinkTag(getString(R.string.checkout_layout_text_swedish), a("fi", "sv"));
                return string + " (" + createHtmlLinkTag2 + " | " + createHtmlLinkTag + ")";
            case 1:
                return Utils.createHtmlLinkTag(string, a("no", "no"));
            case 2:
                return Utils.createHtmlLinkTag(string, a("se", "sv"));
            default:
                return "";
        }
    }

    /* access modifiers changed from: protected */
    public PaymentParams b() {
        return e();
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        if (z10) {
            this.f121060m.setEnabled(true);
            this.f121060m.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.opp_show_button));
            this.f121060m.setVisibility(0);
            return;
        }
        this.f121060m.setEnabled(false);
        this.f121060m.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.opp_hide_button));
        new Handler(Looper.getMainLooper()).postDelayed(new R1(this), (long) getResources().getInteger(R.integer.button_anim_time));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.opp_fragment_ikano_payment_info, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        e(view);
    }

    private PaymentParams e() {
        if (!this.f120960p.validate()) {
            return null;
        }
        try {
            return new IkanoOiPaymentParams(this.f121052e.getCheckoutId(), this.f121055h, this.f120960p.getText());
        } catch (PaymentException unused) {
            return null;
        }
    }
}
