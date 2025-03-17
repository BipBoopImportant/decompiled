package com.oppwa.mobile.connect.checkout.dialog;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.ImageLoader;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.token.Token;
import java.util.Optional;

public abstract class PaymentInfoFragment extends BaseFragment implements ImageLoader.Listener {

    /* renamed from: d  reason: collision with root package name */
    protected CheckoutViewModel f121051d;

    /* renamed from: e  reason: collision with root package name */
    protected CheckoutSettings f121052e;

    /* renamed from: f  reason: collision with root package name */
    protected CheckoutInfo f121053f;

    /* renamed from: g  reason: collision with root package name */
    protected BrandsValidation f121054g;

    /* renamed from: h  reason: collision with root package name */
    protected String f121055h;

    /* renamed from: i  reason: collision with root package name */
    protected Token f121056i;

    /* renamed from: j  reason: collision with root package name */
    protected String f121057j;

    /* renamed from: k  reason: collision with root package name */
    protected TextView f121058k;

    /* renamed from: l  reason: collision with root package name */
    protected ImageView f121059l;

    /* renamed from: m  reason: collision with root package name */
    protected Button f121060m;

    /* renamed from: n  reason: collision with root package name */
    protected ProgressBar f121061n;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f121062o;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        requireActivity().onBackPressed();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        PaymentParams b10 = b();
        if (b10 != null) {
            getParentFragmentManager().Q1(PaymentInfoFragment.class.getName(), a(b10, this.f121056i != null));
        }
    }

    private String d() {
        return (!this.f121052e.isTotalAmountRequired() || this.f121053f.getCurrencyCode() == null || this.f121053f == null) ? getString(R.string.checkout_layout_text_pay) : String.format(getString(R.string.checkout_layout_text_pay_amount), new Object[]{Utils.getFormattedAmount(this.f121053f.getAmount(), this.f121053f.getCurrencyCode())});
    }

    /* access modifiers changed from: protected */
    public abstract PaymentParams b();

    /* access modifiers changed from: protected */
    public void b(int i10) {
        TextView textView = this.f121058k;
        if (textView == null) {
            a(i10);
        } else {
            textView.setText(i10);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f121051d = (CheckoutViewModel) new i0((k0) requireActivity()).a(CheckoutViewModel.class);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f121055h = arguments.getString(CheckoutActivity.EXTRA_PAYMENT_BRAND);
            this.f121056i = (Token) arguments.getParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_TOKEN");
            this.f121057j = arguments.getString("com.oppwa.mobile.connect.checkout.dialog.EXTRA_PROVIDER_MODE");
            this.f121062o = arguments.getBoolean("com.oppwa.mobile.connect.checkout.dialog.EXTRA_SKIP_PAYMENT_METHOD_SELECTION_SCREEN");
        }
    }

    public void onImageLoaded(String str) {
        if (this.f121055h.equals(str)) {
            this.f121059l.setImageBitmap(ImageCache.getInstance().a(str));
            this.f121061n.setVisibility(8);
        }
    }

    public void onStart() {
        super.onStart();
        ImageLoader.getInstance(requireActivity()).addListener(this);
    }

    public void onStop() {
        super.onStop();
        ImageLoader.getInstance(requireActivity()).removeListener(this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Bitmap image;
        super.onViewCreated(view, bundle);
        this.f121052e = this.f121051d.requireCheckoutSettings();
        this.f121053f = this.f121051d.requireCheckoutInfo();
        this.f121054g = this.f121051d.requireBrandsValidation();
        a(R.string.checkout_payment_details);
        b(view);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading_panel_payment_info_header);
        this.f121061n = progressBar;
        progressBar.setVisibility(0);
        this.f121058k = (TextView) view.findViewById(R.id.payment_info_title);
        ImageView imageView = (ImageView) view.findViewById(R.id.logo);
        this.f121059l = imageView;
        if (!(imageView == null || (image = ImageLoader.getInstance(requireActivity()).getImage(this.f121055h)) == null)) {
            this.f121059l.setImageBitmap(image);
            this.f121061n.setVisibility(8);
        }
        if (!this.f121062o) {
            this.f120829b.setVisibility(0);
            this.f120829b.setOnClickListener(new C14059c2(this));
        }
    }

    private Bundle a(PaymentParams paymentParams, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("PAYMENT_PARAMS_RESULT_KEY", paymentParams);
        bundle.putBoolean("TOKENIZED_RESULT_KEY", z10);
        return bundle;
    }

    private void b(View view) {
        this.f121060m = (Button) view.findViewById(R.id.payment_button);
        String d10 = d();
        this.f121060m.setText(d10);
        this.f121060m.setContentDescription(d10);
        this.f121060m.setOnClickListener(new d2(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(C5191t tVar, View view) {
        ((InputMethodManager) tVar.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        view.clearFocus();
    }

    /* access modifiers changed from: protected */
    public void c() {
        C5191t activity = getActivity();
        Optional.ofNullable(activity).map(new C14051a2()).ifPresent(new C14055b2(activity));
    }
}
