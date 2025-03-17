package com.sugarcube.app.base.ui.capturev2;

import android.content.Context;
import f.C5297b;
import mH.C17600c;
import mH.C17602e;

public abstract class Hilt_CaptureLandscapeActivity extends CaptureActivity {

    /* renamed from: I  reason: collision with root package name */
    private boolean f123469I = false;

    class a implements C5297b {
        a() {
        }

        public void a(Context context) {
            Hilt_CaptureLandscapeActivity.this.u0();
        }
    }

    Hilt_CaptureLandscapeActivity() {
        q0();
    }

    private void q0() {
        addOnContextAvailableListener(new a());
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f123469I) {
            this.f123469I = true;
            ((CaptureLandscapeActivity_GeneratedInjector) ((C17600c) C17602e.a(this)).g0()).injectCaptureLandscapeActivity((CaptureLandscapeActivity) C17602e.a(this));
        }
    }
}
