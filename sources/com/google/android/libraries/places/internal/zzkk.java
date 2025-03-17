package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public abstract class zzkk implements Map, Serializable {
    private transient zzkl zza;
    private transient zzkl zzb;
    private transient zzke zzc;

    zzkk() {
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public final int hashCode() {
        return zzlb.zza(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        zzkl zzkl = this.zzb;
        if (zzkl != null) {
            return zzkl;
        }
        zzkl zzd = zzd();
        this.zzb = zzd;
        return zzd;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
            sb2.append('{');
            boolean z10 = true;
            for (Map.Entry entry : entrySet()) {
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                sb2.append(entry.getValue());
                z10 = false;
            }
            sb2.append('}');
            return sb2.toString();
        }
        throw new IllegalArgumentException("size cannot be negative but was: " + size);
    }

    /* access modifiers changed from: package-private */
    public abstract zzke zza();

    /* renamed from: zzb */
    public final zzke values() {
        zzke zzke = this.zzc;
        if (zzke != null) {
            return zzke;
        }
        zzke zza2 = zza();
        this.zzc = zza2;
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public abstract zzkl zzc();

    /* access modifiers changed from: package-private */
    public abstract zzkl zzd();

    /* renamed from: zze */
    public final zzkl entrySet() {
        zzkl zzkl = this.zza;
        if (zzkl != null) {
            return zzkl;
        }
        zzkl zzc2 = zzc();
        this.zza = zzc2;
        return zzc2;
    }
}
