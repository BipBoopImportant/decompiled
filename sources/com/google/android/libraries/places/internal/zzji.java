package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

public final class zzji {
    public static final Appendable zza(Appendable appendable, Iterator it, zzjk zzjk, String str) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            appendable.append(zzjk.zzf(entry.getKey()));
            appendable.append("=");
            appendable.append(zzjk.zzf(entry.getValue()));
            while (it.hasNext()) {
                appendable.append(zzjk.zza);
                Map.Entry entry2 = (Map.Entry) it.next();
                appendable.append(zzjk.zzf(entry2.getKey()));
                appendable.append("=");
                appendable.append(zzjk.zzf(entry2.getValue()));
            }
        }
        return appendable;
    }
}
