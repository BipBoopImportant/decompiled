package com.google.ar.core;

import com.google.ar.core.ArCoreApk;
import java.util.function.Consumer;

final /* synthetic */ class K implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Consumer f67689a;

    /* synthetic */ K(Consumer consumer) {
        this.f67689a = consumer;
    }

    public final /* synthetic */ void run() {
        int i10 = ArCoreApkJniAdapter.f67665b;
        this.f67689a.accept(ArCoreApk.Availability.UNKNOWN_ERROR);
    }
}
