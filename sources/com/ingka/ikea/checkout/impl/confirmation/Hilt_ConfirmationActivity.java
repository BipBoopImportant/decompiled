package com.ingka.ikea.checkout.impl.confirmation;

import android.content.Context;
import com.ingka.ikea.core.android.activities.BaseLocaleActivity;
import f.C5297b;
import mH.C17600c;
import mH.C17602e;

public abstract class Hilt_ConfirmationActivity extends BaseLocaleActivity {

    /* renamed from: G  reason: collision with root package name */
    private boolean f94431G = false;

    class a implements C5297b {
        a() {
        }

        public void a(Context context) {
            Hilt_ConfirmationActivity.this.u0();
        }
    }

    Hilt_ConfirmationActivity() {
        q0();
    }

    private void q0() {
        addOnContextAvailableListener(new a());
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f94431G) {
            this.f94431G = true;
            ((k) ((C17600c) C17602e.a(this)).g0()).e((ConfirmationActivity) C17602e.a(this));
        }
    }
}
