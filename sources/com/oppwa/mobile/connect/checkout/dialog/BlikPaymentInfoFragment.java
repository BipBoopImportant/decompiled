package com.oppwa.mobile.connect.checkout.dialog;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.BlikPaymentInfoViewModel;
import com.oppwa.mobile.connect.databinding.OppFragmentBlikPaymentInfoBinding;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.blik.BlikPaymentParams;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.TransactionType;
import java.util.Optional;
import java.util.regex.Pattern;

public class BlikPaymentInfoFragment extends PaymentInfoFragment {

    /* renamed from: u  reason: collision with root package name */
    private static Pattern f120857u;

    /* renamed from: p  reason: collision with root package name */
    private OppFragmentBlikPaymentInfoBinding f120858p;

    /* renamed from: q  reason: collision with root package name */
    private BlikPaymentInfoViewModel f120859q;

    /* renamed from: r  reason: collision with root package name */
    private Transaction f120860r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f120861s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f120862t;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Bitmap bitmap) {
        m().blikLogo.setImageBitmap(bitmap);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Transaction c(Bundle bundle) {
        this.f120860r = (Transaction) bundle.getParcelable("transaction");
        this.f120861s = bundle.getBoolean("isProcessing");
        this.f120862t = bundle.getBoolean("isBlikCodeValid");
        return this.f120860r;
    }

    private void e() {
        m().blikHelperTextView.setVisibility(4);
    }

    private String f() {
        return (String) Optional.ofNullable(m().blikCode.getText()).map(new L0()).orElse((Object) null);
    }

    private Pattern g() {
        if (f120857u == null) {
            f120857u = Pattern.compile("[0-9]{6}");
        }
        return f120857u;
    }

    private void h() {
        if (m().header.backButton.getVisibility() == 0) {
            m().header.backButton.setVisibility(8);
        }
    }

    private void i() {
        q();
        m().header.closeButton.setVisibility(0);
        m().overlapView.setVisibility(8);
        m().progressBar.setVisibility(8);
        m().progressText.setVisibility(8);
    }

    private void j() {
        Optional.ofNullable(this.f121052e.getLocale()).ifPresent(new P0(this));
        i();
        k();
        m().paymentInfoHeader.logo.setVisibility(8);
        m().blikHelperTextView.setVisibility(4);
        m().blikTermsAndConditionsTextView.setMovementMethod(LinkMovementMethod.getInstance());
        o();
        if (this.f120861s) {
            s();
        }
    }

    private void k() {
        Optional.ofNullable(ImageLoader.getInstance(requireActivity()).getImage(this.f121055h)).ifPresent(new U0(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException l() {
        return new IllegalStateException("Binding is null");
    }

    private OppFragmentBlikPaymentInfoBinding m() {
        return (OppFragmentBlikPaymentInfoBinding) Optional.ofNullable(this.f120858p).orElseThrow(new M0());
    }

    private void n() {
        m().progressText.setText(R.string.checkout_layout_text_blik_complete_payment);
        m().paymentInfoScrollView.setVisibility(8);
    }

    private void o() {
        m().blikCode.setOnFocusChangeListener(new W0(this));
        m().blikCode.setOnEditorActionListener(new X0(this));
    }

    private void p() {
        BlikPaymentInfoViewModel blikPaymentInfoViewModel = (BlikPaymentInfoViewModel) new i0((k0) this, (i0.c) new BlikPaymentInfoViewModel.Factory(requireContext())).a(BlikPaymentInfoViewModel.class);
        this.f120859q = blikPaymentInfoViewModel;
        blikPaymentInfoViewModel.a().observe(getViewLifecycleOwner(), new Q0(this));
    }

    private void q() {
        if (!this.f121062o) {
            m().header.backButton.setVisibility(0);
        }
    }

    private void r() {
        m().blikHelperTextView.setVisibility(0);
    }

    private void s() {
        this.f120861s = true;
        this.f121060m.setVisibility(8);
        h();
        m().header.closeButton.setVisibility(8);
        c();
        m().overlapView.setVisibility(0);
        m().progressBar.setVisibility(0);
        m().progressText.setVisibility(0);
        if (this.f120862t) {
            n();
        }
        m().progressText.setVisibility(0);
    }

    private boolean t() {
        return ((Boolean) Optional.ofNullable(f()).map(new N0(this)).map(new O0(this)).orElse(Boolean.FALSE)).booleanValue();
    }

    /* access modifiers changed from: protected */
    public void b(Bundle bundle) {
        if (bundle != null) {
            i();
            this.f120861s = false;
            Transaction transaction = this.f120860r;
            if (transaction != null) {
                transaction.setTransactionType(TransactionType.SYNC);
                a(this.f120860r);
                return;
            }
            a((Transaction) null, PaymentError.getPaymentProviderInternalError("Transaction is null."));
        }
    }

    public void continueWithPayment(Transaction transaction) {
        this.f120860r = transaction;
        if (transaction.getTransactionType() != TransactionType.ASYNC || transaction.getRedirectUrl() == null) {
            i();
            this.f121060m.setVisibility(0);
            this.f120861s = false;
            r();
            return;
        }
        c(transaction.getRedirectUrl());
        n();
        this.f120862t = true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OppFragmentBlikPaymentInfoBinding inflate = OppFragmentBlikPaymentInfoBinding.inflate(layoutInflater, viewGroup, false);
        this.f120858p = inflate;
        return inflate.getRoot();
    }

    public void onImageLoaded(String str) {
        super.onImageLoaded(str);
        if (this.f121055h.equals(str)) {
            m().blikLogo.setImageBitmap(ImageCache.getInstance().a(str));
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("transaction", this.f120860r);
        bundle.putBoolean("isProcessing", this.f120861s);
        bundle.putBoolean("isBlikCodeValid", this.f120862t);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        p();
        Optional.ofNullable(bundle).map(new R0(this)).map(new S0()).ifPresent(new T0(this));
        j();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        CheckoutHelper.setLocale(requireActivity(), str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        m().paymentButtonLayout.paymentButton.callOnClick();
        return true;
    }

    /* access modifiers changed from: private */
    public void a(View view, boolean z10) {
        if (!z10) {
            t();
        } else {
            e();
        }
    }

    /* access modifiers changed from: private */
    public void c(String str) {
        Optional.ofNullable(this.f120859q).ifPresent(new V0(str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean a(Boolean bool) {
        if (bool.booleanValue()) {
            e();
        } else {
            r();
        }
        return bool;
    }

    /* access modifiers changed from: protected */
    public PaymentParams b() {
        if (!t()) {
            return null;
        }
        s();
        try {
            return new BlikPaymentParams(this.f121052e.getCheckoutId(), f());
        } catch (PaymentException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean b(String str) {
        return Boolean.valueOf(g().matcher(str).matches());
    }
}
