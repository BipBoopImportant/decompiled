package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Iterator;

public class zzjk {
    /* access modifiers changed from: private */
    public final String zza;

    /* synthetic */ zzjk(zzjk zzjk, zzjj zzjj) {
        this.zza = zzjk.zza;
    }

    public static zzjk zzb(String str) {
        return new zzjk(str);
    }

    static final CharSequence zzf(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public Appendable zza(Appendable appendable, Iterator it) {
        if (it.hasNext()) {
            appendable.append(zzf(it.next()));
            while (it.hasNext()) {
                appendable.append(this.zza);
                appendable.append(zzf(it.next()));
            }
        }
        return appendable;
    }

    public final zzjk zzc() {
        return new zzjh(this, this);
    }

    public final String zze(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb2 = new StringBuilder();
        try {
            zza(sb2, it);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    private zzjk(String str) {
        this.zza = str;
    }
}
