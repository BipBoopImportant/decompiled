package com.sugarcube.app.base.ui.capturev2;

import android.content.Context;
import com.sugarcube.app.base.ui.BaseLocaleActivity;
import f.C5297b;
import mH.C17600c;
import mH.C17602e;

public abstract class Hilt_CaptureActivity extends BaseLocaleActivity {

    /* renamed from: A  reason: collision with root package name */
    private boolean f123467A = false;

    class a implements C5297b {
        a() {
        }

        public void a(Context context) {
            Hilt_CaptureActivity.this.u0();
        }
    }

    Hilt_CaptureActivity() {
        q0();
    }

    private void q0() {
        addOnContextAvailableListener(new a());
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f123467A) {
            this.f123467A = true;
            ((CaptureActivity_GeneratedInjector) ((C17600c) C17602e.a(this)).g0()).injectCaptureActivity((CaptureActivity) C17602e.a(this));
        }
    }
}
