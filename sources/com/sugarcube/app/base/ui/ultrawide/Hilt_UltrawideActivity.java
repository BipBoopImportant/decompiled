package com.sugarcube.app.base.ui.ultrawide;

import android.content.Context;
import com.sugarcube.app.base.ui.BaseLocaleActivity;
import f.C5297b;
import mH.C17600c;
import mH.C17602e;

public abstract class Hilt_UltrawideActivity extends BaseLocaleActivity {

    /* renamed from: A  reason: collision with root package name */
    private boolean f125217A = false;

    class a implements C5297b {
        a() {
        }

        public void a(Context context) {
            Hilt_UltrawideActivity.this.u0();
        }
    }

    Hilt_UltrawideActivity() {
        q0();
    }

    private void q0() {
        addOnContextAvailableListener(new a());
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f125217A) {
            this.f125217A = true;
            ((UltrawideActivity_GeneratedInjector) ((C17600c) C17602e.a(this)).g0()).injectUltrawideActivity((UltrawideActivity) C17602e.a(this));
        }
    }
}
