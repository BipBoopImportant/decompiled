package com.oppwa.mobile.connect.provider;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.exception.PaymentError;

public class AsyncPaymentActivity extends AppCompatActivity {
    public static final String EXTRA_CHECKOUT_ID = "checkout_id";
    public static final String EXTRA_PARAM_CUSTOM_SCHEME_URL = "custom_scheme_url";
    public static final String EXTRA_PAYMENT_ERROR = "payment_error";
    public static final String EXTRA_REDIRECT_URL = "redirect_url";
    public static final String EXTRA_THREEDS_METHOD_REDIRECT_URL = "threeds_method_redirect_url";
    public static final String REQUEST_KEY_ASYNC_RESULT = "async_result";

    public AsyncPaymentActivity() {
        super(R.layout.async_payment_activity);
    }

    private void a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_REDIRECT_URL, str);
        bundle.putString(EXTRA_THREEDS_METHOD_REDIRECT_URL, str2);
        getSupportFragmentManager().s().B(true).d(R.id.content_view, ThreeDSWebFragment.class, bundle).j();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().l();
        }
        if (bundle == null) {
            Intent intent = getIntent();
            if (intent.hasExtra(EXTRA_REDIRECT_URL) && intent.hasExtra(EXTRA_THREEDS_METHOD_REDIRECT_URL)) {
                a(intent.getStringExtra(EXTRA_REDIRECT_URL), intent.getStringExtra(EXTRA_THREEDS_METHOD_REDIRECT_URL));
            }
        }
        a();
    }

    private void a() {
        getSupportFragmentManager().R1(REQUEST_KEY_ASYNC_RESULT, this, new C14156f(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Bundle bundle) {
        OppPaymentProvider b10 = C14152b.a().b();
        if (b10 != null) {
            b10.a((PaymentError) bundle.getParcelable(EXTRA_PAYMENT_ERROR), bundle.getString(EXTRA_PARAM_CUSTOM_SCHEME_URL));
        }
        finish();
    }
}
