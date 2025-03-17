package com.ingka.ikea.core.android.activities;

import android.content.Context;
import f.C5297b;
import mH.C17600c;
import mH.C17602e;

public abstract class Hilt_NavigationHostActivity extends BaseLocaleActivity {

    /* renamed from: G  reason: collision with root package name */
    private boolean f94828G = false;

    class a implements C5297b {
        a() {
        }

        public void a(Context context) {
            Hilt_NavigationHostActivity.this.u0();
        }
    }

    Hilt_NavigationHostActivity() {
        q0();
    }

    private void q0() {
        addOnContextAvailableListener(new a());
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f94828G) {
            this.f94828G = true;
            ((c) ((C17600c) C17602e.a(this)).g0()).d((NavigationHostActivity) C17602e.a(this));
        }
    }
}
