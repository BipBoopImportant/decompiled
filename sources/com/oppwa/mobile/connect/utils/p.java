package com.oppwa.mobile.connect.utils;

import android.os.Bundle;
import java.util.function.BiConsumer;

public final /* synthetic */ class p implements BiConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bundle f122238a;

    public /* synthetic */ p(Bundle bundle) {
        this.f122238a = bundle;
    }

    public final void accept(Object obj, Object obj2) {
        this.f122238a.putString((String) obj, (String) obj2);
    }
}
