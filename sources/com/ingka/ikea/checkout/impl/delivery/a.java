package com.ingka.ikea.checkout.impl.delivery;

import android.content.Context;
import com.ingka.ikea.core.android.activities.BaseLocaleActivity;
import f.C5297b;
import mH.C17600c;
import mH.C17602e;

abstract class a extends BaseLocaleActivity {

    /* renamed from: G  reason: collision with root package name */
    private boolean f94460G = false;

    /* renamed from: com.ingka.ikea.checkout.impl.delivery.a$a  reason: collision with other inner class name */
    class C2102a implements C5297b {
        C2102a() {
        }

        public void a(Context context) {
            a.this.u0();
        }
    }

    a() {
        q0();
    }

    private void q0() {
        addOnContextAvailableListener(new C2102a());
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f94460G) {
            this.f94460G = true;
            ((d) ((C17600c) C17602e.a(this)).g0()).r((PickupPointDetailsActivity) C17602e.a(this));
        }
    }
}
