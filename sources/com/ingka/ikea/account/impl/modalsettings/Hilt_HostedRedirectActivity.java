package com.ingka.ikea.account.impl.modalsettings;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.i0;
import f.C5297b;
import iH.C17354a;
import jH.C17404a;
import jH.C17411h;
import mH.C17599b;
import mH.C17600c;
import mH.C17602e;

public abstract class Hilt_HostedRedirectActivity extends AppCompatActivity implements C17600c {

    /* renamed from: v  reason: collision with root package name */
    private C17411h f69585v;

    /* renamed from: w  reason: collision with root package name */
    private volatile C17404a f69586w;

    /* renamed from: x  reason: collision with root package name */
    private final Object f69587x = new Object();

    /* renamed from: y  reason: collision with root package name */
    private boolean f69588y = false;

    class a implements C5297b {
        a() {
        }

        public void a(Context context) {
            Hilt_HostedRedirectActivity.this.u0();
        }
    }

    Hilt_HostedRedirectActivity() {
        q0();
    }

    private void q0() {
        addOnContextAvailableListener(new a());
    }

    private void t0() {
        if (getApplication() instanceof C17599b) {
            C17411h b10 = r0().b();
            this.f69585v = b10;
            if (b10.b()) {
                this.f69585v.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    public final Object g0() {
        return r0().g0();
    }

    public i0.c getDefaultViewModelProviderFactory() {
        return C17354a.a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t0();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C17411h hVar = this.f69585v;
        if (hVar != null) {
            hVar.a();
        }
    }

    public final C17404a r0() {
        if (this.f69586w == null) {
            synchronized (this.f69587x) {
                try {
                    if (this.f69586w == null) {
                        this.f69586w = s0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f69586w;
    }

    /* access modifiers changed from: protected */
    public C17404a s0() {
        return new C17404a(this);
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f69588y) {
            this.f69588y = true;
            ((D) g0()).k((HostedRedirectActivity) C17602e.a(this));
        }
    }
}
