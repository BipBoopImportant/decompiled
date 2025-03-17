package com.google.android.libraries.places.internal;

import com.google.gson.Gson;
import com.google.gson.c;
import com.google.gson.f;
import com.google.gson.p;

public final class zzfs {
    private final Gson zza = new f().g(c.LOWER_CASE_WITH_UNDERSCORES).b();

    public final Object zza(String str, Class cls) {
        try {
            return this.zza.n(str, cls);
        } catch (p unused) {
            String name = cls.getName();
            throw new zzeo("Could not convert JSON string to " + name + " due to syntax errors.");
        }
    }
}
