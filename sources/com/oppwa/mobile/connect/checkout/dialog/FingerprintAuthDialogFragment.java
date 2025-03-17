package com.oppwa.mobile.connect.checkout.dialog;

import android.app.KeyguardManager;
import android.content.res.Resources;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.oppwa.mobile.connect.R;

public class FingerprintAuthDialogFragment extends DialogFragment {

    /* renamed from: l  reason: collision with root package name */
    static String f120924l = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_TITLE";

    /* renamed from: a  reason: collision with root package name */
    private C14090n f120925a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ImageView f120926b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public TextView f120927c;

    /* renamed from: d  reason: collision with root package name */
    private Button f120928d;

    /* renamed from: e  reason: collision with root package name */
    private KeyguardManager f120929e;

    /* renamed from: f  reason: collision with root package name */
    private FingerprintManager f120930f;

    /* renamed from: g  reason: collision with root package name */
    private CancellationSignal f120931g;

    /* renamed from: h  reason: collision with root package name */
    private final FingerprintManager.AuthenticationCallback f120932h = new a();

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f120933i = new b();

    /* renamed from: j  reason: collision with root package name */
    private String f120934j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public boolean f120935k;

    class a extends FingerprintManager.AuthenticationCallback {
        a() {
        }

        public void onAuthenticationError(int i10, CharSequence charSequence) {
            super.onAuthenticationError(i10, charSequence);
            if (!FingerprintAuthDialogFragment.this.f120935k) {
                FingerprintAuthDialogFragment.this.a(charSequence);
            }
        }

        public void onAuthenticationFailed() {
            super.onAuthenticationFailed();
            FingerprintAuthDialogFragment.this.c();
        }

        public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            super.onAuthenticationHelp(i10, charSequence);
            FingerprintAuthDialogFragment.this.b(charSequence);
        }

        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            super.onAuthenticationSucceeded(authenticationResult);
            FingerprintAuthDialogFragment.this.d();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            if (FingerprintAuthDialogFragment.this.isAdded()) {
                FingerprintAuthDialogFragment.this.f120926b.setImageResource(R.drawable.ic_fingerprint);
                FingerprintAuthDialogFragment.this.f120927c.setText(R.string.checkout_fingerprint_touch_sensor);
                FingerprintAuthDialogFragment.this.f120927c.setTextColor(FingerprintAuthDialogFragment.this.getResources().getColor(R.color.checkout_text_color_hint, (Resources.Theme) null));
            }
        }
    }

    private void f() {
        if (this.f120930f != null) {
            this.f120931g = new CancellationSignal();
            if (getActivity().checkSelfPermission("android.permission.USE_FINGERPRINT") == 0) {
                this.f120930f.authenticate((FingerprintManager.CryptoObject) null, this.f120931g, 0, this.f120932h, (Handler) null);
            }
        }
    }

    private void g() {
        this.f120935k = true;
        this.f120931g.cancel();
        this.f120931g = null;
    }

    public static FingerprintAuthDialogFragment newInstance(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(f120924l, str);
        FingerprintAuthDialogFragment fingerprintAuthDialogFragment = new FingerprintAuthDialogFragment();
        fingerprintAuthDialogFragment.setArguments(bundle);
        return fingerprintAuthDialogFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        setCancelable(false);
        e();
        this.f120934j = getArguments().getString(f120924l);
        this.f120929e = (KeyguardManager) getActivity().getSystemService("keyguard");
        this.f120930f = (FingerprintManager) getActivity().getSystemService("fingerprint");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.opp_dialog_fingerprint_auth, viewGroup, false);
    }

    public void onPause() {
        super.onPause();
        g();
    }

    public void onResume() {
        super.onResume();
        f();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f120926b = (ImageView) view.findViewById(R.id.fingerprint_icon);
        this.f120927c = (TextView) view.findViewById(R.id.fingerprint_status);
        this.f120928d = (Button) view.findViewById(R.id.enter_pin_button);
        ((Button) view.findViewById(R.id.cancel_button)).setOnClickListener(new N1(this));
    }

    public void setListener(C14090n nVar) {
        this.f120925a = nVar;
    }

    /* access modifiers changed from: private */
    public void c() {
        this.f120926b.setImageResource(R.drawable.opp_ic_fingerprint_error);
        this.f120927c.setText(R.string.checkout_fingerprint_not_recognized);
        this.f120927c.setTextColor(getResources().getColor(R.color.checkout_helper_text_color, (Resources.Theme) null));
        this.f120927c.removeCallbacks(this.f120933i);
        this.f120927c.postDelayed(this.f120933i, 1500);
        if (this.f120928d.getVisibility() == 8) {
            this.f120928d.setVisibility(0);
            this.f120928d.setOnClickListener(new K1(this));
        }
    }

    /* access modifiers changed from: private */
    public void d() {
        this.f120926b.setImageResource(R.drawable.opp_ic_fingerprint_success);
        this.f120927c.setText(R.string.checkout_fingerprint_success);
        this.f120927c.setTextColor(getResources().getColor(R.color.success_color, (Resources.Theme) null));
        this.f120927c.removeCallbacks(this.f120933i);
        this.f120927c.postDelayed(new L1(this), 1500);
    }

    private void e() {
        setStyle(1, 16974393);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        C14090n nVar = this.f120925a;
        if (nVar != null) {
            nVar.c();
        }
        dismiss();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        getActivity().startActivityForResult(this.f120929e.createConfirmDeviceCredentialIntent(this.f120934j, getString(R.string.checkout_auth_confirm_payment)), 700);
        dismiss();
    }

    /* access modifiers changed from: private */
    public void a(CharSequence charSequence) {
        this.f120926b.setImageResource(R.drawable.opp_ic_fingerprint_error);
        this.f120927c.setText(charSequence);
        this.f120927c.setTextColor(getResources().getColor(R.color.checkout_helper_text_color, (Resources.Theme) null));
        this.f120927c.removeCallbacks(this.f120933i);
        this.f120927c.postDelayed(new M1(this), 1500);
    }

    /* access modifiers changed from: private */
    public void b(CharSequence charSequence) {
        this.f120926b.setImageResource(R.drawable.opp_ic_fingerprint_error);
        this.f120927c.setText(charSequence);
        this.f120927c.setTextColor(getResources().getColor(R.color.checkout_helper_text_color, (Resources.Theme) null));
        this.f120927c.removeCallbacks(this.f120933i);
        this.f120927c.postDelayed(this.f120933i, 1500);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        C14090n nVar = this.f120925a;
        if (nVar != null) {
            nVar.a();
            dismiss();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        C14090n nVar = this.f120925a;
        if (nVar != null) {
            nVar.b();
            dismiss();
        }
    }
}
