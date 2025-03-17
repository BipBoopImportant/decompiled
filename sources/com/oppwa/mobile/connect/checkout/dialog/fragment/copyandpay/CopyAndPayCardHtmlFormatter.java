package com.oppwa.mobile.connect.checkout.dialog.fragment.copyandpay;

import android.content.Context;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutHelper;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSkipCVVMode;
import com.oppwa.mobile.connect.checkout.meta.WpwlOptions;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import java.util.Map;

public class CopyAndPayCardHtmlFormatter extends a {
    public static final String ON_BEFORE_SUBMIT_CARD_TEMPLATE = "function() {\n           $(\"button#cp_submit_button\").hide();\n           return true;\n           }";
    public static final String ON_READY_TEMPLATE = "function() {\n            // Show or hide token form\n            if ({isTokenForm}) {\n                $(\"div.wpwl-container-card\").hide();\n            } else {\n                $(\"div#wpwl-registrations\").hide();\n            }\n            \n            $(\"button#cp_submit_button\").click(function() {\n            // Submit token or card form\n            if ({isTokenForm}) {\n                wpwl.executePayment(\"wpwl-container-registration\");\n            } else {\n                wpwl.executePayment(\"wpwl-container-card\");\n            }\n           });\n           }";

    /* renamed from: d  reason: collision with root package name */
    private final BrandsValidation f121199d;

    /* renamed from: e  reason: collision with root package name */
    private final String[] f121200e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f121201f;

    public CopyAndPayCardHtmlFormatter(Context context, CheckoutSettings checkoutSettings, BrandsValidation brandsValidation, String[] strArr, boolean z10) {
        super(context, checkoutSettings, "CARD");
        this.f121199d = brandsValidation;
        this.f121200e = strArr;
        this.f121201f = z10;
    }

    private String d() {
        return "#" + Integer.toHexString(this.f121206a.getResources().getColor(R.color.checkout_color_accent) & 16777215);
    }

    private WpwlOptions f() {
        WpwlOptions wpwlOptions = new WpwlOptions();
        wpwlOptions.addValue("cardNumberError", "Card number entered is not valid");
        wpwlOptions.addValue("cardHolderError", "Card holder name is not valid");
        wpwlOptions.addValue("expiryMonthError", "Card expiration date is not valid, use MM/YY format");
        wpwlOptions.addValue("expiryYearError", "Card expiration date is not valid, use MM/YY format");
        wpwlOptions.addValue("cvvError", "Security code must contain 3 or 4 digits");
        return wpwlOptions;
    }

    private WpwlOptions g() {
        WpwlOptions wpwlOptions = new WpwlOptions();
        wpwlOptions.addValue("cardNumber", "Credit Card Number");
        wpwlOptions.addValue("cardHolder", "Name of Card Holder");
        wpwlOptions.addValue("expiryDate", "Expiration Date");
        wpwlOptions.addValue("cvv", "Security Code or CVV");
        return wpwlOptions;
    }

    private String h() {
        return ON_BEFORE_SUBMIT_CARD_TEMPLATE;
    }

    private String i() {
        return ON_READY_TEMPLATE;
    }

    private WpwlOptions j() {
        WpwlOptions wpwlOptions = new WpwlOptions();
        wpwlOptions.addValue("cardNumberPlaceholder", "Long number on the front of your card");
        wpwlOptions.addValue("cardHolderPlaceholder", "Name as it appears on card");
        wpwlOptions.addValue("expiryDatePlaceholder", "Use MM/YY format");
        wpwlOptions.addValue("cvvPlaceholder", "Use 3 or 4 digit code");
        return wpwlOptions;
    }

    private WpwlOptions k() {
        WpwlOptions wpwlOptions = new WpwlOptions();
        Boolean bool = Boolean.FALSE;
        wpwlOptions.addValue("hideInitialPaymentForms", bool);
        wpwlOptions.addValue("requireCvv", bool);
        return wpwlOptions;
    }

    private boolean l() {
        CheckoutSkipCVVMode skipCVVMode = this.f121207b.getSkipCVVMode();
        return skipCVVMode == CheckoutSkipCVVMode.NEVER || skipCVVMode == CheckoutSkipCVVMode.FOR_STORED_CARDS;
    }

    private boolean m() {
        return this.f121207b.getSkipCVVMode() == CheckoutSkipCVVMode.NEVER;
    }

    /* access modifiers changed from: protected */
    public String a(String str) {
        if (str == null) {
            str = CheckoutHelper.getSystemLocale(this.f121206a);
        }
        if (str.length() > 2) {
            str = str.substring(0, 2);
        }
        return str.toLowerCase();
    }

    /* access modifiers changed from: protected */
    public Map<String, String> b() {
        Map<String, String> b10 = super.b();
        b10.put("{checkout_color_accent}", d());
        b10.put("{locale}", a(this.f121207b.getLocale()));
        b10.put("{brandDetectionPriority}", e());
        b10.put("{brands}", String.join(" ", this.f121200e));
        b10.put("{isTokenForm}", String.valueOf(this.f121201f));
        b10.put("{requireCvv}", String.valueOf(l()));
        b10.put("{registrations.requireCvv}", String.valueOf(m()));
        b10.put("{checkout_layout_hint_card_number}", this.f121206a.getString(R.string.checkout_layout_hint_card_number));
        b10.put("{checkout_layout_hint_card_holder}", this.f121206a.getString(R.string.checkout_layout_hint_card_holder));
        b10.put("{checkout_layout_hint_card_expiration_date}", this.f121206a.getString(R.string.checkout_layout_hint_card_expiration_date));
        b10.put("{checkout_layout_hint_card_cvv}", this.f121206a.getString(R.string.checkout_layout_hint_card_cvv));
        b10.put("{checkout_helper_card_number}", this.f121206a.getString(R.string.checkout_helper_card_number));
        b10.put("{checkout_helper_card_holder}", this.f121206a.getString(R.string.checkout_helper_card_holder));
        b10.put("{checkout_helper_expiry_date}", this.f121206a.getString(R.string.checkout_helper_expiry_date));
        b10.put("{checkout_helper_cvv}", this.f121206a.getString(R.string.checkout_helper_cvv));
        b10.put("{checkout_error_card_number_invalid}", this.f121206a.getString(R.string.checkout_error_card_number_invalid));
        b10.put("{checkout_error_card_holder_invalid}", this.f121206a.getString(R.string.checkout_error_card_holder_invalid));
        b10.put("{checkout_error_expiry_date_invalid}", this.f121206a.getString(R.string.checkout_error_expiry_date_invalid));
        b10.put("{checkout_error_cvv_invalid}", this.f121206a.getString(R.string.checkout_error_cvv_invalid));
        b10.put("{payNow}", this.f121206a.getString(R.string.checkout_layout_text_pay));
        return b10;
    }

    /* access modifiers changed from: protected */
    public String c() {
        WpwlOptions wpwlOptions = new WpwlOptions();
        wpwlOptions.addValue("style", "plain");
        Boolean bool = Boolean.TRUE;
        wpwlOptions.addValue("enableSAQACompliance", bool);
        wpwlOptions.addValue("requireCvv", bool);
        wpwlOptions.addValue("locale", "en");
        wpwlOptions.addValue("brandDetection", bool);
        wpwlOptions.addValue("brandDetectionType", "binlist");
        wpwlOptions.addValue("brandDetectionPriority", new String[]{"VISA", "MAESTRO", "MASTER", CheckoutConstants.PaymentBrands.AMEX});
        wpwlOptions.addValue("labels", g());
        wpwlOptions.addValue("placeholders", j());
        wpwlOptions.addValue("errorMessages", f());
        wpwlOptions.addJSFunction("onReady", i());
        wpwlOptions.addJSFunction("onBeforeSubmitCard", h());
        wpwlOptions.addValue("registrations", k());
        return wpwlOptions.getWpwlConfigurations() + ";";
    }

    /* access modifiers changed from: protected */
    public String e() {
        String[] strArr = this.f121199d.getBrandDetectionPriority() != null ? (String[]) this.f121199d.getBrandDetectionPriority().toArray(new String[0]) : this.f121200e;
        return "[\"" + String.join("\",\"", strArr) + "\"]";
    }

    public String formatHtml(String str) {
        return super.formatHtml(str.replace("{css}", "body {\n                background-color: #ffffff;\n                font-family: sans-serif;\n            }\n\n            .cp_submit_button {\n                width: 100%;\n                background-color: {checkout_color_accent};\n                color: white;\n                border: 0;\n                padding: 20px;\n                font-size: large;\n            }\n\n            .wpwl-control {\n                background: transparent;\n                border: none;\n                border-bottom: 1px solid #000000;\n            }\n\n            .wpwl-wrapper {\n                margin: 20px auto;\n            }").replace("{wpwl}", c()).replace("{submitButton}", "<button id=\"cp_submit_button\" class=\"cp_submit_button\">{payNow}</button>"));
    }
}
