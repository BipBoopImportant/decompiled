package com.oppwa.mobile.connect.utils;

import android.os.Bundle;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

public final /* synthetic */ class t implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bundle f122240a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f122241b;

    public /* synthetic */ t(Bundle bundle, Map map) {
        this.f122240a = bundle;
        this.f122241b = map;
    }

    public final void accept(Object obj) {
        this.f122241b.put((String) obj, (Integer) Optional.ofNullable(this.f122240a.getString((String) obj)).map(new h()).orElse((Object) null));
    }
}
