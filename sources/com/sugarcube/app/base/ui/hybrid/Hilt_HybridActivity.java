package com.sugarcube.app.base.ui.hybrid;

import android.content.Context;
import com.sugarcube.app.base.ui.BaseLocaleActivity;
import f.C5297b;
import mH.C17600c;
import mH.C17602e;

public abstract class Hilt_HybridActivity extends BaseLocaleActivity {

    /* renamed from: A  reason: collision with root package name */
    private boolean f124690A = false;

    class a implements C5297b {
        a() {
        }

        public void a(Context context) {
            Hilt_HybridActivity.this.u0();
        }
    }

    Hilt_HybridActivity() {
        q0();
    }

    private void q0() {
        addOnContextAvailableListener(new a());
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f124690A) {
            this.f124690A = true;
            ((HybridActivity_GeneratedInjector) ((C17600c) C17602e.a(this)).g0()).injectHybridActivity((HybridActivity) C17602e.a(this));
        }
    }
}
