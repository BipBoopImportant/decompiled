package com.ingka.ikea.onlinepayment.impl.presentation;

import android.content.Context;
import f.C5297b;
import mH.C17600c;
import mH.C17602e;

abstract class j extends BasePaymentActivity {

    /* renamed from: J  reason: collision with root package name */
    private boolean f119327J = false;

    class a implements C5297b {
        a() {
        }

        public void a(Context context) {
            j.this.u0();
        }
    }

    j() {
        q0();
    }

    private void q0() {
        addOnContextAvailableListener(new a());
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f119327J) {
            this.f119327J = true;
            ((n) ((C17600c) C17602e.a(this)).g0()).n((PaymentOptionsActivity) C17602e.a(this));
        }
    }
}
