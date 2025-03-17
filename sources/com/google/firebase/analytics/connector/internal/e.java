package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import ra.a;

final class e implements a.C0905a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ b f68171a;

    public e(b bVar) {
        this.f68171a = bVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j10) {
        if (this.f68171a.f68158a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", c.c(str2));
            this.f68171a.f68159b.a(2, bundle2);
        }
    }
}
