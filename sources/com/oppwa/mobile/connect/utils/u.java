package com.oppwa.mobile.connect.utils;

import android.os.Bundle;
import java.util.Optional;
import java.util.function.BiConsumer;

public final /* synthetic */ class u implements BiConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bundle f122242a;

    public /* synthetic */ u(Bundle bundle) {
        this.f122242a = bundle;
    }

    public final void accept(Object obj, Object obj2) {
        this.f122242a.putString((String) obj, (String) Optional.ofNullable((Integer) obj2).map(new q()).orElse((Object) null));
    }
}
