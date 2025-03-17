package com.google.ar.core;

import com.google.ar.core.ArCoreApk;
import java.util.function.Consumer;

final class H implements F {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Consumer f67670a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ J f67671b;

    H(J j10, Consumer consumer) {
        this.f67670a = consumer;
        this.f67671b = j10;
    }

    public final void a(ArCoreApk.Availability availability) {
        this.f67671b.e().post(new I(this, availability));
    }
}
