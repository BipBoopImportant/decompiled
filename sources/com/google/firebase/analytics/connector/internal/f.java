package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import ra.a;

final class f implements a.C0905a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ d f68172a;

    public f(d dVar) {
        this.f68172a = dVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j10) {
        if (str != null && c.i(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j10);
            bundle2.putBundle("params", bundle);
            this.f68172a.f68168a.a(3, bundle2);
        }
    }
}
