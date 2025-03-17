package com.oppwa.mobile.connect.utils;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public final /* synthetic */ class w implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f122245a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f122246b;

    public /* synthetic */ w(AtomicInteger atomicInteger, Bundle bundle) {
        this.f122245a = atomicInteger;
        this.f122246b = bundle;
    }

    public final void accept(Object obj) {
        this.f122245a.addAndGet(Objects.hash(new Object[]{(String) obj, this.f122246b.get((String) obj)}));
    }
}
