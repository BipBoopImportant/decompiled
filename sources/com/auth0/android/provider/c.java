package com.auth0.android.provider;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;

class c {

    /* renamed from: d  reason: collision with root package name */
    private static final String f46319d = "c";

    /* renamed from: a  reason: collision with root package name */
    private final int f46320a = -100;

    /* renamed from: b  reason: collision with root package name */
    private final int f46321b;

    /* renamed from: c  reason: collision with root package name */
    private final Intent f46322c;

    public c(Intent intent) {
        this.f46322c = intent;
        this.f46321b = a() != null ? -1 : 0;
    }

    public Uri a() {
        Intent intent = this.f46322c;
        if (intent == null) {
            return null;
        }
        return intent.getData();
    }

    public boolean b() {
        return this.f46321b == 0 && this.f46322c != null && a() == null;
    }

    public boolean c(int i10) {
        int i11 = this.f46320a;
        boolean z10 = i11 == -100 || i11 == i10;
        boolean z11 = b() || this.f46321b == -1;
        if (z10 && z11) {
            return true;
        }
        Log.d(f46319d, "Result is invalid: Either the received Intent is null or the Request Code doesn't match the expected one.");
        return false;
    }
}
