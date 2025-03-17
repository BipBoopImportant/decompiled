package com.ingka.ikea.app;

import android.content.Context;
import com.ingka.ikea.core.android.activities.BaseLocaleActivity;
import f.C5297b;
import mH.C17600c;
import mH.C17602e;

abstract class e extends BaseLocaleActivity {

    /* renamed from: G  reason: collision with root package name */
    private boolean f71888G = false;

    class a implements C5297b {
        a() {
        }

        public void a(Context context) {
            e.this.u0();
        }
    }

    e() {
        q0();
    }

    private void q0() {
        addOnContextAvailableListener(new a());
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f71888G) {
            this.f71888G = true;
            ((a) ((C17600c) C17602e.a(this)).g0()).l((BlockingMessageActivity) C17602e.a(this));
        }
    }
}
