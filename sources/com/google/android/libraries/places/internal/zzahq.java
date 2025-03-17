package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzahq extends LinkedHashMap {
    private static final zzahq zza;
    private boolean zzb = true;

    static {
        zzahq zzahq = new zzahq();
        zza = zzahq;
        zzahq.zzb = false;
    }

    private zzahq() {
    }

    private static int zze(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = zzagx.zzd;
            int length = bArr.length;
            int zzb2 = zzagx.zzb(length, bArr, 0, length);
            if (zzb2 == 0) {
                return 1;
            }
            return zzb2;
        } else if (!(obj instanceof zzagq)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private final void zzf() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        zzf();
        super.clear();
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z10 = value.equals(obj2);
                continue;
            } else {
                z10 = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry entry : entrySet()) {
            i10 += zze(entry.getValue()) ^ zze(entry.getKey());
        }
        return i10;
    }

    public final Object put(Object obj, Object obj2) {
        zzf();
        byte[] bArr = zzagx.zzd;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        zzf();
        for (Object next : map.keySet()) {
            byte[] bArr = zzagx.zzd;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        zzf();
        return super.remove(obj);
    }

    public final zzahq zza() {
        return isEmpty() ? new zzahq() : new zzahq(this);
    }

    public final void zzb() {
        this.zzb = false;
    }

    public final void zzc(zzahq zzahq) {
        zzf();
        if (!zzahq.isEmpty()) {
            putAll(zzahq);
        }
    }

    public final boolean zzd() {
        return this.zzb;
    }

    private zzahq(Map map) {
        super(map);
    }
}
