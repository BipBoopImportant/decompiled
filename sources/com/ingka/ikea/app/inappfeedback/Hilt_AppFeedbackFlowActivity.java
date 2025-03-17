package com.ingka.ikea.app.inappfeedback;

import android.content.Context;
import com.ingka.ikea.core.android.activities.BaseLocaleActivity;
import f.C5297b;
import mH.C17600c;
import mH.C17602e;

public abstract class Hilt_AppFeedbackFlowActivity extends BaseLocaleActivity {

    /* renamed from: G  reason: collision with root package name */
    private boolean f71926G = false;

    class a implements C5297b {
        a() {
        }

        public void a(Context context) {
            Hilt_AppFeedbackFlowActivity.this.u0();
        }
    }

    Hilt_AppFeedbackFlowActivity() {
        q0();
    }

    private void q0() {
        addOnContextAvailableListener(new a());
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f71926G) {
            this.f71926G = true;
            ((c) ((C17600c) C17602e.a(this)).g0()).j((AppFeedbackFlowActivity) C17602e.a(this));
        }
    }
}
