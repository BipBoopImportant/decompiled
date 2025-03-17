package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.G6;
import java.util.Map;

final class I2 implements G6 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f49658a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2 f49659b;

    I2(C2 c22, String str) {
        this.f49658a = str;
        this.f49659b = c22;
    }

    public final String zza(String str) {
        Map map = (Map) this.f49659b.f49548d.get(this.f49658a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
