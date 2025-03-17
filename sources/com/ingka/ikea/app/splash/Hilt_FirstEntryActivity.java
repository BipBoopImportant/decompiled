package com.ingka.ikea.app.splash;

import android.content.Context;
import com.ingka.ikea.core.android.activities.NavigationHostActivity;
import f.C5297b;
import mH.C17600c;
import mH.C17602e;

public abstract class Hilt_FirstEntryActivity extends NavigationHostActivity {

    /* renamed from: Q  reason: collision with root package name */
    private boolean f92420Q = false;

    class a implements C5297b {
        a() {
        }

        public void a(Context context) {
            Hilt_FirstEntryActivity.this.u0();
        }
    }

    Hilt_FirstEntryActivity() {
        q0();
    }

    private void q0() {
        addOnContextAvailableListener(new a());
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f92420Q) {
            this.f92420Q = true;
            ((h) ((C17600c) C17602e.a(this)).g0()).m((FirstEntryActivity) C17602e.a(this));
        }
    }
}
