package com.oppwa.mobile.connect.utils;

import android.os.Bundle;
import java.util.Map;
import java.util.function.Consumer;

public final /* synthetic */ class v implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f122243a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f122244b;

    public /* synthetic */ v(Map map, Bundle bundle) {
        this.f122243a = map;
        this.f122244b = bundle;
    }

    public final void accept(Object obj) {
        this.f122243a.put((String) obj, this.f122244b.getParcelable((String) obj));
    }
}
