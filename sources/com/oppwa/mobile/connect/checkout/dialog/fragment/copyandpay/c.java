package com.oppwa.mobile.connect.checkout.dialog.fragment.copyandpay;

import a5.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.lifecycle.K;
import com.oppwa.mobile.connect.checkout.dialog.BaseFragment;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutHelper;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.provider.AsyncPaymentWebViewClient;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.TransactionType;
import com.oppwa.mobile.connect.utils.Logger;
import com.oppwa.mobile.connect.utils.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@SuppressLint({"ViewConstructor"})
class c extends WebView {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final CheckoutSettings f121211a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f121212b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final BrandsValidation f121213c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String[] f121214d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final boolean f121215e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final K<Bundle> f121216f;

    private class b extends AsyncPaymentWebViewClient {

        /* renamed from: b  reason: collision with root package name */
        private final a5.c f121217b;

        public b(a5.c cVar) {
            super(c.this.f121216f);
            this.f121217b = cVar;
        }

        private TransactionType c(String str) {
            return str.startsWith(CheckoutHelper.getShopperResultUrl()) ? TransactionType.SYNC : TransactionType.ASYNC;
        }

        /* access modifiers changed from: protected */
        public Bundle a(String str) {
            Bundle bundle = new Bundle();
            TransactionType c10 = c(str);
            try {
                Transaction transaction = new Transaction(new PaymentParams(c.this.f121211a.getCheckoutId(), "CARD"));
                transaction.setTransactionType(c10);
                bundle.putParcelable(BaseFragment.TRANSACTION_RESULT_KEY, transaction);
            } catch (PaymentException e10) {
                Logger.error((Throwable) e10);
            }
            return bundle;
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return this.f121217b.a(webResourceRequest.getUrl());
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.fragment.copyandpay.c$c  reason: collision with other inner class name */
    private class C3012c implements c.C0731c {

        /* renamed from: a  reason: collision with root package name */
        private final c.a f121219a;

        private C3012c() {
            this.f121219a = new c.a(c.this.getContext());
        }

        private a a() {
            return c.this.f121214d != null ? new CopyAndPayCardHtmlFormatter(c.this.getContext(), c.this.f121211a, c.this.f121213c, c.this.f121214d, c.this.f121215e) : new a(c.this.getContext(), c.this.f121211a, c.this.f121212b);
        }

        public WebResourceResponse handle(String str) {
            WebResourceResponse handle = this.f121219a.handle(str);
            if (!str.equals("copyAndPay.html")) {
                return handle;
            }
            try {
                return new WebResourceResponse(handle.getMimeType(), handle.getEncoding(), new ByteArrayInputStream(a().formatHtml(StringUtils.inputStreamToString(handle.getData())).getBytes(StandardCharsets.UTF_8)));
            } catch (IOException e10) {
                Logger.error((Throwable) e10);
                return null;
            }
        }
    }

    public c(Context context, Bundle bundle, K<Bundle> k10) {
        super(context);
        this.f121211a = (CheckoutSettings) bundle.getParcelable("checkoutSettings");
        this.f121212b = bundle.getString(CopyAndPayFragment.BRAND_KEY);
        this.f121213c = (BrandsValidation) bundle.getParcelable("brandsValidation");
        this.f121214d = bundle.getStringArray(CopyAndPayFragment.CARD_BRANDS_KEY);
        this.f121215e = bundle.getBoolean(CopyAndPayFragment.IS_TOKEN_KEY);
        this.f121216f = k10;
        a();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a() {
        a5.c b10 = new c.b().a("/assets/", new C3012c()).b();
        getSettings().setJavaScriptEnabled(true);
        setWebViewClient(new b(b10));
    }

    public void b() {
        loadUrl("https://appassets.androidplatform.net/assets/copyAndPay.html");
    }
}
