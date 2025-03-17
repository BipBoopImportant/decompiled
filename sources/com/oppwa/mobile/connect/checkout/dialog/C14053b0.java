package com.oppwa.mobile.connect.checkout.dialog;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import androidx.appcompat.app.AppCompatActivity;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSecurityPolicyMode;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.b0  reason: case insensitive filesystem */
class C14053b0 implements C14090n {

    /* renamed from: a  reason: collision with root package name */
    private final KeyguardManager f121131a;

    /* renamed from: b  reason: collision with root package name */
    private final CheckoutSettings f121132b;

    /* renamed from: c  reason: collision with root package name */
    private a f121133c;

    @FunctionalInterface
    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.b0$a */
    interface a {
        void a(boolean z10);
    }

    C14053b0(Context context, CheckoutSettings checkoutSettings) {
        this.f121131a = (KeyguardManager) context.getSystemService("keyguard");
        this.f121132b = checkoutSettings;
    }

    /* access modifiers changed from: package-private */
    public boolean a(String str, boolean z10) {
        CheckoutSecurityPolicyMode checkoutSecurityPolicyMode;
        if (z10) {
            checkoutSecurityPolicyMode = this.f121132b.getSecurityPolicyModeForTokens();
        } else if (str == null) {
            return false;
        } else {
            checkoutSecurityPolicyMode = this.f121132b.getSecurityPolicyModeForBrand(str);
        }
        return a(checkoutSecurityPolicyMode);
    }

    public void b() {
        this.f121133c.a(true);
    }

    public void c() {
        this.f121133c.a(false);
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f121131a.isKeyguardSecure();
    }

    /* access modifiers changed from: package-private */
    public void a(AppCompatActivity appCompatActivity, a aVar) {
        FingerprintManager fingerprintManager;
        if (d()) {
            this.f121133c = aVar;
            if (appCompatActivity.checkSelfPermission("android.permission.USE_FINGERPRINT") != 0 || (fingerprintManager = (FingerprintManager) appCompatActivity.getSystemService("fingerprint")) == null || !fingerprintManager.isHardwareDetected() || !fingerprintManager.hasEnrolledFingerprints()) {
                appCompatActivity.startActivityForResult(this.f121131a.createConfirmDeviceCredentialIntent((CharSequence) null, appCompatActivity.getString(R.string.checkout_auth_confirm_payment)), 700);
            } else {
                a(appCompatActivity, (C14090n) this);
            }
        }
    }

    private void a(AppCompatActivity appCompatActivity, C14090n nVar) {
        FingerprintAuthDialogFragment newInstance = FingerprintAuthDialogFragment.newInstance((String) null);
        newInstance.setListener(nVar);
        newInstance.show(appCompatActivity.getSupportFragmentManager(), (String) null);
    }

    private boolean a(CheckoutSecurityPolicyMode checkoutSecurityPolicyMode) {
        if (checkoutSecurityPolicyMode == CheckoutSecurityPolicyMode.DEVICE_AUTH_REQUIRED) {
            return true;
        }
        if (checkoutSecurityPolicyMode == CheckoutSecurityPolicyMode.DEVICE_AUTH_REQUIRED_IF_AVAILABLE) {
            return d();
        }
        return false;
    }

    public void a() {
        this.f121133c.a(false);
    }
}
