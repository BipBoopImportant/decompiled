package com.ingka.ikea.account.impl.upgrade;

import android.content.Context;
import com.ingka.ikea.core.android.activities.NavigationHostActivity;
import f.C5297b;
import mH.C17600c;
import mH.C17602e;

public abstract class Hilt_UpgradeActivity extends NavigationHostActivity {

    /* renamed from: Q  reason: collision with root package name */
    private boolean f69839Q = false;

    class a implements C5297b {
        a() {
        }

        public void a(Context context) {
            Hilt_UpgradeActivity.this.u0();
        }
    }

    Hilt_UpgradeActivity() {
        q0();
    }

    private void q0() {
        addOnContextAvailableListener(new a());
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f69839Q) {
            this.f69839Q = true;
            ((C9607i) ((C17600c) C17602e.a(this)).g0()).h((UpgradeActivity) C17602e.a(this));
        }
    }
}
