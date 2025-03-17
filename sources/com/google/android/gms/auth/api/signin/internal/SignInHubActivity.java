package com.google.android.gms.auth.api.signin.internal;

import C9.p;
import C9.x;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.C5191t;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;

@KeepName
public class SignInHubActivity extends C5191t {

    /* renamed from: A  reason: collision with root package name */
    private static boolean f47956A = false;

    /* renamed from: v  reason: collision with root package name */
    private boolean f47957v = false;

    /* renamed from: w  reason: collision with root package name */
    private SignInConfiguration f47958w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f47959x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public int f47960y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public Intent f47961z;

    private final void q0() {
        getSupportLoaderManager().c(0, (Bundle) null, new a(this, (x) null));
        f47956A = false;
    }

    private final void r0(int i10) {
        Status status = new Status(i10);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f47956A = false;
    }

    private final void s0(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.f47958w);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f47957v = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            r0(17);
        }
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.f47957v) {
            setResult(0);
            if (i10 == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.x() != null) {
                        GoogleSignInAccount x10 = signInAccount.x();
                        if (x10 == null) {
                            Log.e("AuthSignInClient", "Google account is null");
                            r0(12500);
                            return;
                        }
                        p.a(this).c(this.f47958w.x(), x10);
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", x10);
                        this.f47959x = true;
                        this.f47960y = i11;
                        this.f47961z = intent;
                        q0();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        r0(intExtra);
                        return;
                    }
                }
                r0(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            r0(12500);
        } else if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            r0(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            if (bundleExtra == null) {
                Log.e("AuthSignInClient", "Activity started with no configuration.");
                setResult(0);
                finish();
                return;
            }
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.f47958w = signInConfiguration;
            if (bundle != null) {
                boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
                this.f47959x = z10;
                if (z10) {
                    this.f47960y = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    if (intent2 == null) {
                        Log.e("AuthSignInClient", "Sign in result data cannot be null");
                        setResult(0);
                        finish();
                        return;
                    }
                    this.f47961z = intent2;
                    q0();
                }
            } else if (f47956A) {
                setResult(0);
                r0(12502);
            } else {
                f47956A = true;
                s0(action);
            }
        } else {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        f47956A = false;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f47959x);
        if (this.f47959x) {
            bundle.putInt("signInResultCode", this.f47960y);
            bundle.putParcelable("signInResultData", this.f47961z);
        }
    }
}
