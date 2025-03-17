package com.ingka.ikea.onlinepayment.impl.presentation;

import android.content.Context;
import com.ingka.ikea.core.android.activities.BaseLocaleActivity;
import f.C5297b;
import mH.C17600c;
import mH.C17602e;

abstract class i extends BaseLocaleActivity {

    /* renamed from: G  reason: collision with root package name */
    private boolean f119325G = false;

    class a implements C5297b {
        a() {
        }

        public void a(Context context) {
            i.this.u0();
        }
    }

    i() {
        q0();
    }

    private void q0() {
        addOnContextAvailableListener(new a());
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f119325G) {
            this.f119325G = true;
            ((f) ((C17600c) C17602e.a(this)).g0()).i((BasePaymentActivity) C17602e.a(this));
        }
    }
}
