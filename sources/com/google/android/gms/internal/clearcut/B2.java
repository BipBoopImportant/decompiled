package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

final class B2 extends ContentObserver {
    B2(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z10) {
        A2.f48146e.set(true);
    }
}
