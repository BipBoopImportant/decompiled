package com.oppwa.mobile.connect.checkout.dialog.fragment.copyandpay;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import l3.a;
import uI.C18055d;

class b implements i0.c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f121209a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f121210b;

    public b(Context context, Bundle bundle) {
        this.f121209a = context;
        this.f121210b = bundle;
    }

    public /* bridge */ /* synthetic */ f0 create(Class cls, a aVar) {
        return super.create(cls, aVar);
    }

    public /* bridge */ /* synthetic */ f0 create(C18055d dVar, a aVar) {
        return super.create(dVar, aVar);
    }

    public <T extends f0> T create(Class<T> cls) {
        return new CopyAndPayViewModel(this.f121209a, this.f121210b);
    }
}
