package com.oppwa.mobile.connect.checkout.meta;

import com.samsung.android.sdk.samsungpay.v2.payment.sheet.SheetControl;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public final /* synthetic */ class t implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f121461a;

    public /* synthetic */ t(AtomicInteger atomicInteger) {
        this.f121461a = atomicInteger;
    }

    public final void accept(Object obj) {
        this.f121461a.addAndGet(Objects.hash(new Object[]{((SheetControl) obj).getControlId(), ((SheetControl) obj).getControltype()}));
    }
}
