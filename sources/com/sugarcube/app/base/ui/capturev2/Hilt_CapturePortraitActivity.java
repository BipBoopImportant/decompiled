package com.sugarcube.app.base.ui.capturev2;

import android.content.Context;
import f.C5297b;
import mH.C17600c;
import mH.C17602e;

public abstract class Hilt_CapturePortraitActivity extends CaptureActivity {

    /* renamed from: I  reason: collision with root package name */
    private boolean f123471I = false;

    class a implements C5297b {
        a() {
        }

        public void a(Context context) {
            Hilt_CapturePortraitActivity.this.u0();
        }
    }

    Hilt_CapturePortraitActivity() {
        q0();
    }

    private void q0() {
        addOnContextAvailableListener(new a());
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f123471I) {
            this.f123471I = true;
            ((CapturePortraitActivity_GeneratedInjector) ((C17600c) C17602e.a(this)).g0()).injectCapturePortraitActivity((CapturePortraitActivity) C17602e.a(this));
        }
    }
}
