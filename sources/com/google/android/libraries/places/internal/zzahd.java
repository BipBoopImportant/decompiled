package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzahd extends zzafh implements RandomAccess, zzahe {
    @Deprecated
    public static final zzahe zza;
    private static final zzahd zzb;
    private final List zzc;

    static {
        zzahd zzahd = new zzahd(false);
        zzb = zzahd;
        zza = zzahd;
    }

    public zzahd() {
        this(10);
    }

    private static String zzi(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzaft ? ((zzaft) obj).zzl(zzagx.zzb) : zzagx.zzd((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zza();
        this.zzc.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i10, Collection collection) {
        zza();
        if (collection instanceof zzahe) {
            collection = ((zzahe) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zza();
        this.zzc.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        Object remove = this.zzc.remove(i10);
        this.modCount++;
        return zzi(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zza();
        return zzi(this.zzc.set(i10, (String) obj));
    }

    public final int size() {
        return this.zzc.size();
    }

    public final zzahe zzd() {
        return zzc() ? new zzajd(this) : this;
    }

    public final Object zze(int i10) {
        return this.zzc.get(i10);
    }

    public final /* bridge */ /* synthetic */ zzagw zzf(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.zzc);
            return new zzahd(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: zzg */
    public final String get(int i10) {
        Object obj = this.zzc.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzaft) {
            zzaft zzaft = (zzaft) obj;
            String zzl = zzaft.zzl(zzagx.zzb);
            if (zzaft.zzi()) {
                this.zzc.set(i10, zzl);
            }
            return zzl;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzagx.zzd(bArr);
        if (zzajm.zzd(bArr)) {
            this.zzc.set(i10, zzd);
        }
        return zzd;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzahd(int i10) {
        super(true);
        ArrayList arrayList = new ArrayList(i10);
        this.zzc = arrayList;
    }

    private zzahd(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzahd(boolean z10) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
