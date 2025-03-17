package com.oppwa.mobile.connect.checkout.dialog;

import G9.C6522c;
import G9.d;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.fragment.app.C5187o;
import com.google.android.gms.security.ProviderInstaller;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.checkout.dialog.ImageLoader;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSecurityPolicyMode;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.exception.ErrorCode;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.ImagesRequest;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.provider.IPaymentProvider;
import com.oppwa.mobile.connect.provider.ITransactionListener;
import com.oppwa.mobile.connect.provider.OppPaymentProvider;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.utils.LibraryHelper;
import com.oppwa.mobile.connect.utils.Logger;
import g.C5314c;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.c  reason: case insensitive filesystem */
class C14056c implements ITransactionListener, ImageLoader.Listener {

    /* renamed from: n  reason: collision with root package name */
    private static final String f121136n = "com.oppwa.mobile.connect.checkout.dialog.c";

    /* renamed from: a  reason: collision with root package name */
    private final C5187o f121137a;

    /* renamed from: b  reason: collision with root package name */
    protected Activity f121138b;

    /* renamed from: c  reason: collision with root package name */
    protected C14053b0 f121139c;

    /* renamed from: d  reason: collision with root package name */
    protected IPaymentProvider f121140d;

    /* renamed from: e  reason: collision with root package name */
    private C5314c<CheckoutSettings> f121141e;

    /* renamed from: f  reason: collision with root package name */
    private String f121142f;

    /* renamed from: g  reason: collision with root package name */
    private ImageButton f121143g;

    /* renamed from: h  reason: collision with root package name */
    private ProgressBar f121144h;

    /* renamed from: i  reason: collision with root package name */
    private View f121145i;

    /* renamed from: j  reason: collision with root package name */
    private String f121146j;

    /* renamed from: k  reason: collision with root package name */
    private PaymentButtonIntegrationMode f121147k = PaymentButtonIntegrationMode.STANDALONE;

    /* renamed from: l  reason: collision with root package name */
    private CheckoutSettings f121148l;

    /* renamed from: m  reason: collision with root package name */
    private ImageLoader f121149m;

    C14056c(C5187o oVar) {
        this.f121137a = oVar;
    }

    private void c() {
        this.f121145i.setVisibility(0);
        this.f121143g.setVisibility(8);
        this.f121143g.setBackground((Drawable) null);
        this.f121145i.setOnClickListener(new m2(this));
    }

    private Activity d() {
        return this.f121137a.getActivity();
    }

    private void l() {
        IPaymentProvider iPaymentProvider = this.f121140d;
        if (iPaymentProvider != null) {
            try {
                iPaymentProvider.requestImages(new String[]{this.f121142f}, this);
            } catch (PaymentException e10) {
                Log.e(f121136n, e10.getMessage());
            }
        }
    }

    private void m() {
        Bitmap image = this.f121149m.getImage(this.f121142f);
        if (image == null) {
            this.f121143g.setClickable(false);
            if (!this.f121149m.d(this.f121142f)) {
                l();
                return;
            }
            return;
        }
        b(image);
    }

    private void n() {
        this.f121137a.setRetainInstance(true);
    }

    private void o() {
        Logger.info(this.f121142f + " Drop-in Button");
        String str = this.f121146j;
        if (str != null) {
            Logger.error(str);
        }
        if (this.f121141e != null) {
            String str2 = this.f121142f;
            if (str2 != null) {
                if (CheckoutConstants.PaymentBrands.GOOGLEPAY.equals(str2)) {
                    p();
                } else if (CheckoutConstants.PaymentBrands.SAMSUNGPAY.equals(this.f121142f)) {
                    r();
                } else {
                    s();
                    if (CheckoutConstants.PaymentBrands.KLARNA_INSTALLMENTS.equals(this.f121142f) || CheckoutConstants.PaymentBrands.KLARNA_INVOICE.equals(this.f121142f)) {
                        q();
                    }
                }
                a(this.f121148l);
                this.f121148l.setPaymentButtonBrand(this.f121142f);
                this.f121141e.a(this.f121148l);
                return;
            }
            throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_PAYMENT_BRAND_INVALID, "The payment brand is null."));
        }
        throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_UNEXPECTED_EXCEPTION, "ActivityResultLauncher is null."));
    }

    private void p() {
        if (!LibraryHelper.isPlayServicesWalletAvailable) {
            throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_METHOD_NOT_AVAILABLE, "The play-services-wallet library is not available."));
        }
    }

    private void q() {
        String klarnaCountry = this.f121148l.getKlarnaCountry();
        if (klarnaCountry != null && !C14104s.a(klarnaCountry)) {
            throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_METHOD_NOT_AVAILABLE, "Klarna country is not supported."));
        }
    }

    private void r() {
        if (!LibraryHelper.isSamsungPayAvailable) {
            throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_METHOD_NOT_AVAILABLE, "Samsung Pay SDK is not available."));
        }
    }

    private void s() {
        CheckoutSecurityPolicyMode securityPolicyModeForBrand = this.f121148l.getSecurityPolicyModeForBrand(this.f121142f);
        if (this.f121139c == null) {
            this.f121139c = new C14053b0(this.f121138b, this.f121148l);
        }
        if (securityPolicyModeForBrand == CheckoutSecurityPolicyMode.DEVICE_AUTH_REQUIRED && !this.f121139c.d()) {
            throw new PaymentException(PaymentError.getPaymentMethodNotAvailableError());
        }
    }

    public String e() {
        return this.f121142f;
    }

    public ImageButton f() {
        return this.f121143g;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.f121138b = d();
    }

    /* access modifiers changed from: package-private */
    public void h() {
        n();
        a(d());
        this.f121149m = ImageLoader.getInstance(this.f121138b);
    }

    /* access modifiers changed from: package-private */
    public void i() {
        this.f121138b = null;
    }

    public void imagesRequestFailed() {
        a((ImagesRequest) null);
    }

    public void imagesRequestSucceeded(ImagesRequest imagesRequest) {
        if (imagesRequest.containsPaymentBrand(this.f121142f)) {
            a(imagesRequest);
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        Activity activity = this.f121138b;
        if (activity != null) {
            ImageLoader.getInstance(activity).addListener(this);
            if (this.f121140d == null) {
                Connect.ProviderMode providerMode = Connect.ProviderMode.LIVE;
                CheckoutSettings checkoutSettings = this.f121148l;
                if (checkoutSettings != null) {
                    providerMode = checkoutSettings.getProviderMode();
                }
                this.f121140d = new OppPaymentProvider(this.f121138b, providerMode);
            }
            if (this.f121142f != null && !a(this.f121143g)) {
                m();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        Activity activity = this.f121138b;
        if (activity != null) {
            ImageLoader.getInstance(activity).removeListener(this);
        }
    }

    public void onImageLoaded(String str) {
        if (TextUtils.equals(this.f121142f, str)) {
            b(ImageCache.getInstance().a(str));
        }
    }

    public void transactionCompleted(Transaction transaction) {
    }

    public void transactionFailed(Transaction transaction, PaymentError paymentError) {
    }

    public void a(C5314c<CheckoutSettings> cVar) {
        this.f121141e = cVar;
    }

    /* access modifiers changed from: package-private */
    public void b(View view) {
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading_panel);
        this.f121144h = progressBar;
        progressBar.setVisibility(8);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.payment_button);
        this.f121143g = imageButton;
        imageButton.setBackground((Drawable) null);
        this.f121145i = view.findViewById(R.id.googlepay_layout);
    }

    private void a(Activity activity) {
        if (LibraryHelper.isPlayServicesBaseAvailable) {
            try {
                ProviderInstaller.a(activity);
            } catch (C6522c | d e10) {
                this.f121146j = e10.getMessage();
            }
        }
    }

    public void c(CheckoutSettings checkoutSettings) {
        b(checkoutSettings);
    }

    /* access modifiers changed from: package-private */
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.opp_fragment_payment_button, viewGroup, false);
    }

    private void a() {
        this.f121143g.setVisibility(0);
        this.f121145i.setVisibility(8);
        this.f121145i.setOnClickListener((View.OnClickListener) null);
        this.f121143g.setBackgroundResource(R.drawable.opp_btn_background_payment);
    }

    public void b(String str) {
        this.f121142f = str;
        if (CheckoutConstants.PaymentBrands.GOOGLEPAY.equals(str)) {
            b();
            return;
        }
        m();
        a(str);
        a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f121143g.callOnClick();
    }

    public void a(PaymentButtonIntegrationMode paymentButtonIntegrationMode) {
        this.f121147k = paymentButtonIntegrationMode;
    }

    private void a(CheckoutSettings checkoutSettings) {
        Set<String> paymentBrands = checkoutSettings.getPaymentBrands();
        if (paymentBrands == null || paymentBrands.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (!this.f121142f.equals("CARD")) {
                linkedHashSet.add(this.f121142f);
            }
            checkoutSettings.setPaymentBrands(linkedHashSet);
        }
    }

    private void b() {
        if (this.f121147k.equals(PaymentButtonIntegrationMode.STANDALONE)) {
            c();
            return;
        }
        a();
        this.f121143g.setBackground((Drawable) null);
    }

    private void b(CheckoutSettings checkoutSettings) {
        this.f121148l = checkoutSettings;
        o();
    }

    private void a(ImagesRequest imagesRequest) {
        ImageLoader.getInstance(this.f121138b).a(imagesRequest);
        b(ImageLoader.getInstance(this.f121138b).getImage(this.f121142f));
    }

    private void b(Bitmap bitmap) {
        try {
            this.f121138b.runOnUiThread(new l2(this, bitmap));
        } catch (Exception e10) {
            Log.e(f121136n, e10.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Bitmap bitmap) {
        this.f121143g.setClickable(true);
        if (bitmap != null) {
            this.f121143g.setImageBitmap(bitmap);
            this.f121144h.setVisibility(8);
        }
    }

    private boolean a(ImageButton imageButton) {
        if (CheckoutConstants.PaymentBrands.GOOGLEPAY.equals(this.f121142f) && this.f121147k.equals(PaymentButtonIntegrationMode.STANDALONE)) {
            return true;
        }
        Drawable drawable = imageButton.getDrawable();
        boolean z10 = drawable != null;
        if (!z10 || !(drawable instanceof BitmapDrawable)) {
            return z10;
        }
        if (((BitmapDrawable) drawable).getBitmap() != null) {
            return true;
        }
        return false;
    }

    private void a(String str) {
        Activity d10 = d();
        if (d10 != null) {
            String b10 = C14069g.b(d10, str);
            ImageButton imageButton = this.f121143g;
            imageButton.setContentDescription(d().getString(R.string.checkout_layout_text_pay_with) + " " + b10);
        }
    }
}
