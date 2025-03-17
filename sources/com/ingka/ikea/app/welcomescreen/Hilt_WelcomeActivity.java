package com.ingka.ikea.app.welcomescreen;

import android.content.Context;
import com.ingka.ikea.core.android.activities.BaseLocaleActivity;
import f.C5297b;
import mH.C17600c;
import mH.C17602e;

public abstract class Hilt_WelcomeActivity extends BaseLocaleActivity {

    /* renamed from: G  reason: collision with root package name */
    private boolean f92763G = false;

    class a implements C5297b {
        a() {
        }

        public void a(Context context) {
            Hilt_WelcomeActivity.this.u0();
        }
    }

    Hilt_WelcomeActivity() {
        q0();
    }

    private void q0() {
        addOnContextAvailableListener(new a());
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f92763G) {
            this.f92763G = true;
            ((o) ((C17600c) C17602e.a(this)).g0()).q((WelcomeActivity) C17602e.a(this));
        }
    }
}
