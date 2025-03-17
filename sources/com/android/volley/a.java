package com.android.volley;

import android.content.Intent;

public class a extends u {

    /* renamed from: c  reason: collision with root package name */
    private Intent f46190c;

    public a(k kVar) {
        super(kVar);
    }

    public String getMessage() {
        return this.f46190c != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
