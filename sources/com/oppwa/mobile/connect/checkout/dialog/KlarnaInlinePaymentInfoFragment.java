package com.oppwa.mobile.connect.checkout.dialog;

import android.animation.Animator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.klarna.mobile.sdk.api.payments.KlarnaPaymentView;
import com.klarna.mobile.sdk.api.payments.KlarnaPaymentViewCallback;
import com.klarna.mobile.sdk.api.payments.KlarnaPaymentsSDKError;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.ErrorCode;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.klarna.KlarnaInlinePaymentParams;
import com.oppwa.mobile.connect.provider.HttpUtils;
import com.oppwa.mobile.connect.provider.Transaction;
import java.util.Map;

public class KlarnaInlinePaymentInfoFragment extends PaymentInfoFragment {

    /* renamed from: A  reason: collision with root package name */
    private View f120997A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public boolean f120998B;

    /* renamed from: C  reason: collision with root package name */
    private final KlarnaPaymentViewCallback f120999C = new a();

    /* renamed from: p  reason: collision with root package name */
    private Transaction f121000p;

    /* renamed from: q  reason: collision with root package name */
    private String f121001q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public String f121002r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public String f121003s;

    /* renamed from: t  reason: collision with root package name */
    private String f121004t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public Button f121005u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public ScrollView f121006v;

    /* renamed from: w  reason: collision with root package name */
    private RelativeLayout f121007w;

    /* renamed from: x  reason: collision with root package name */
    private KlarnaPaymentView f121008x;

    /* renamed from: y  reason: collision with root package name */
    private RelativeLayout f121009y;

    /* renamed from: z  reason: collision with root package name */
    private View f121010z;

    class a implements KlarnaPaymentViewCallback {
        a() {
        }

        public void onAuthorized(KlarnaPaymentView klarnaPaymentView, boolean z10, String str, Boolean bool) {
            if (!z10 || str == null) {
                KlarnaInlinePaymentInfoFragment klarnaInlinePaymentInfoFragment = KlarnaInlinePaymentInfoFragment.this;
                klarnaInlinePaymentInfoFragment.a(klarnaInlinePaymentInfoFragment.f121003s, "Authorization error.");
                return;
            }
            KlarnaInlinePaymentInfoFragment.this.a(KlarnaInlinePaymentInfoFragment.this.f121002r.replace("{{authorization_token}}", str), (String) null);
        }

        public void onErrorOccurred(KlarnaPaymentView klarnaPaymentView, KlarnaPaymentsSDKError klarnaPaymentsSDKError) {
            KlarnaInlinePaymentInfoFragment klarnaInlinePaymentInfoFragment = KlarnaInlinePaymentInfoFragment.this;
            klarnaInlinePaymentInfoFragment.a(klarnaInlinePaymentInfoFragment.f121003s, klarnaPaymentsSDKError.getMessage());
        }

        public void onFinalized(KlarnaPaymentView klarnaPaymentView, boolean z10, String str) {
        }

        public void onInitialized(KlarnaPaymentView klarnaPaymentView) {
            if (KlarnaInlinePaymentInfoFragment.this.f120998B) {
                klarnaPaymentView.load((String) null);
            }
        }

        public void onLoadPaymentReview(KlarnaPaymentView klarnaPaymentView, boolean z10) {
        }

        public void onLoaded(KlarnaPaymentView klarnaPaymentView) {
            if (KlarnaInlinePaymentInfoFragment.this.f120998B) {
                KlarnaInlinePaymentInfoFragment.this.f();
                KlarnaInlinePaymentInfoFragment.this.f121005u.setVisibility(0);
            }
        }

        public void onReauthorized(KlarnaPaymentView klarnaPaymentView, boolean z10, String str) {
        }
    }

    class b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f121012a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f121013b;

        b(boolean z10, int i10) {
            this.f121012a = z10;
            this.f121013b = i10;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f121012a) {
                KlarnaInlinePaymentInfoFragment.this.f121006v.setBackgroundColor(this.f121013b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            if (this.f121012a) {
                KlarnaInlinePaymentInfoFragment.this.f121006v.setBackgroundColor(this.f121013b);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.f121008x.authorize(true, (String) null);
        f();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.f121008x.initialize(this.f121001q, CheckoutHelper.getShopperResultUrl());
    }

    public void continueWithPayment(Transaction transaction, PaymentError paymentError) {
        if (!this.f120998B) {
            return;
        }
        if (paymentError != null) {
            a(this.f121003s, paymentError.getErrorMessage());
        } else if (transaction != null) {
            b(transaction);
            e();
        } else {
            a(this.f121003s, "Unexpected PA transaction failure");
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f120998B = true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            Transaction transaction = (Transaction) arguments.getParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_TRANSACTION");
            this.f121000p = transaction;
            if (transaction != null) {
                b(transaction);
            }
        }
        return layoutInflater.inflate(R.layout.opp_fragment_klarna_inline_info, viewGroup, false);
    }

    public void onDetach() {
        super.onDetach();
        this.f120998B = false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f121006v = (ScrollView) view.findViewById(R.id.payment_info_scroll_view);
        this.f121009y = (RelativeLayout) view.findViewById(R.id.progress_view);
        this.f121007w = (RelativeLayout) view.findViewById(R.id.payment_info);
        this.f121005u = (Button) view.findViewById(R.id.payment_button);
        this.f121010z = view.findViewById(R.id.overlap_view);
        this.f120997A = view.findViewById(R.id.progress_text);
        b(this.f121055h);
        this.f121005u.setVisibility(8);
    }

    private void e() {
        getActivity().runOnUiThread(new T1(this));
    }

    /* access modifiers changed from: private */
    public void f() {
        this.f121009y.setVisibility(8);
        this.f121010z.setVisibility(8);
        KlarnaPaymentView klarnaPaymentView = this.f121008x;
        if (klarnaPaymentView != null && klarnaPaymentView.getAlpha() < 1.0f) {
            a(true);
        }
    }

    /* access modifiers changed from: protected */
    public PaymentParams b() {
        this.f121005u.setVisibility(8);
        b(true);
        try {
            KlarnaInlinePaymentParams klarnaInlinePaymentParams = new KlarnaInlinePaymentParams(this.f121052e.getCheckoutId(), this.f121055h);
            klarnaInlinePaymentParams.setInitialTransactionId(this.f121004t);
            return klarnaInlinePaymentParams;
        } catch (PaymentException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public String a(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1476381498:
                if (str.equals(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_PAYNOW)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1465676676:
                if (str.equals(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_PAYLATER)) {
                    c10 = 1;
                    break;
                }
                break;
            case 41759150:
                if (str.equals(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_ONE)) {
                    c10 = 2;
                    break;
                }
                break;
            case 144164229:
                if (str.equals(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_SLICEIT)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "pay_now";
            case 1:
                return "pay_later";
            case 2:
                return "klarna";
            case 3:
                return "pay_over_time";
            default:
                return null;
        }
    }

    private void b(String str) {
        String a10 = a(str);
        if (a10 != null) {
            KlarnaPaymentView klarnaPaymentView = new KlarnaPaymentView(getContext(), a10, this.f120999C);
            this.f121008x = klarnaPaymentView;
            klarnaPaymentView.setAlpha(0.0f);
            this.f121007w.addView(this.f121008x);
            requireActivity().runOnUiThread(new U1(this));
        }
    }

    private void a(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        KlarnaPaymentView klarnaPaymentView = this.f121008x;
        if (klarnaPaymentView != null && klarnaPaymentView.getAlpha() != f10) {
            this.f121008x.animate().alpha(f10).setDuration(500).setListener(new b(z10, z10 ? getResources().getColor(R.color.checkout_background_color_light) : 0));
        }
    }

    private void b(Transaction transaction) {
        Map<String, String> brandSpecificInfo = transaction.getBrandSpecificInfo();
        this.f121001q = brandSpecificInfo.get("clientToken");
        this.f121002r = brandSpecificInfo.get("callbackUrl");
        this.f121004t = brandSpecificInfo.get(Transaction.KLARNA_INLINE_INITIAL_TRANSACTION_ID);
        String str = brandSpecificInfo.get("failureCallbackUrl");
        if (!TextUtils.isEmpty(str)) {
            this.f121003s = str;
        }
    }

    /* access modifiers changed from: private */
    public void a(String str, String str2) {
        b(false);
        if (this.f120998B && getContext() != null) {
            new Thread(new V1(this, str, str2)).start();
        }
    }

    private void b(boolean z10) {
        this.f121009y.setVisibility(0);
        if (z10) {
            this.f121010z.setVisibility(0);
            this.f120997A.setVisibility(8);
            return;
        }
        this.f120997A.setVisibility(0);
        a(false);
    }

    private void a(boolean z10, String str) {
        if (!z10) {
            a(this.f121000p, new PaymentError(ErrorCode.ERROR_CODE_KLARNA_INLINE, "Error sending request to callbackUrl/failureCallbackUrl."));
        } else if (str == null) {
            a(this.f121000p);
        } else {
            a(this.f121000p, new PaymentError(ErrorCode.ERROR_CODE_KLARNA_INLINE, str));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2) {
        a(HttpUtils.sendCallbackRequestToPaypipe(str, CheckoutHelper.getShopperResultUrl()).booleanValue(), str2);
    }
}
