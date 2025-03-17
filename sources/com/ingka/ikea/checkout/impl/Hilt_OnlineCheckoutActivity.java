package com.ingka.ikea.checkout.impl;

import android.content.Context;
import com.ingka.ikea.core.android.activities.BaseLocaleActivity;
import f.C5297b;
import mH.C17600c;
import mH.C17602e;

public abstract class Hilt_OnlineCheckoutActivity extends BaseLocaleActivity {

    /* renamed from: G  reason: collision with root package name */
    private boolean f94292G = false;

    class a implements C5297b {
        a() {
        }

        public void a(Context context) {
            Hilt_OnlineCheckoutActivity.this.u0();
        }
    }

    Hilt_OnlineCheckoutActivity() {
        q0();
    }

    private void q0() {
        addOnContextAvailableListener(new a());
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f94292G) {
            this.f94292G = true;
            ((i0) ((C17600c) C17602e.a(this)).g0()).u((OnlineCheckoutActivity) C17602e.a(this));
        }
    }
}
