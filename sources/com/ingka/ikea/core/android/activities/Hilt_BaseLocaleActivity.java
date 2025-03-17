package com.ingka.ikea.core.android.activities;

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

public abstract class Hilt_BaseLocaleActivity extends AppCompatActivity implements C17600c {

    /* renamed from: v  reason: collision with root package name */
    private C17411h f94823v;

    /* renamed from: w  reason: collision with root package name */
    private volatile C17404a f94824w;

    /* renamed from: x  reason: collision with root package name */
    private final Object f94825x = new Object();

    /* renamed from: y  reason: collision with root package name */
    private boolean f94826y = false;

    class a implements C5297b {
        a() {
        }

        public void a(Context context) {
            Hilt_BaseLocaleActivity.this.u0();
        }
    }

    Hilt_BaseLocaleActivity() {
        q0();
    }

    private void q0() {
        addOnContextAvailableListener(new a());
    }

    private void t0() {
        if (getApplication() instanceof C17599b) {
            C17411h b10 = r0().b();
            this.f94823v = b10;
            if (b10.b()) {
                this.f94823v.c(getDefaultViewModelCreationExtras());
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
        C17411h hVar = this.f94823v;
        if (hVar != null) {
            hVar.a();
        }
    }

    public final C17404a r0() {
        if (this.f94824w == null) {
            synchronized (this.f94825x) {
                try {
                    if (this.f94824w == null) {
                        this.f94824w = s0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f94824w;
    }

    /* access modifiers changed from: protected */
    public C17404a s0() {
        return new C17404a(this);
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f94826y) {
            this.f94826y = true;
            ((a) g0()).b((BaseLocaleActivity) C17602e.a(this));
        }
    }
}
