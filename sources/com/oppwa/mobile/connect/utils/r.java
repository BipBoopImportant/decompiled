package com.oppwa.mobile.connect.utils;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.function.BiConsumer;

public final /* synthetic */ class r implements BiConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bundle f122239a;

    public /* synthetic */ r(Bundle bundle) {
        this.f122239a = bundle;
    }

    public final void accept(Object obj, Object obj2) {
        this.f122239a.putParcelable((String) obj, (Parcelable) obj2);
    }
}
