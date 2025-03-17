package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class zzagi {
    private static final zzagi zzb = new zzagi(true);
    final zzaiu zza = new zzaik(16);
    private boolean zzc;
    private boolean zzd;

    private zzagi() {
    }

    public static zzagi zza() {
        throw null;
    }

    private static final void zzd(zzagh zzagh, Object obj) {
        boolean z10;
        zzajn zzb2 = zzagh.zzb();
        byte[] bArr = zzagx.zzd;
        obj.getClass();
        zzajn zzajn = zzajn.DOUBLE;
        zzajo zzajo = zzajo.INT;
        switch (zzb2.zza().ordinal()) {
            case 0:
                z10 = obj instanceof Integer;
                break;
            case 1:
                z10 = obj instanceof Long;
                break;
            case 2:
                z10 = obj instanceof Float;
                break;
            case 3:
                z10 = obj instanceof Double;
                break;
            case 4:
                z10 = obj instanceof Boolean;
                break;
            case 5:
                z10 = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzaft) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzagq)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzahw) || (obj instanceof zzahb)) {
                    return;
                }
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzagh.zza()), zzagh.zzb().zza(), obj.getClass().getName()}));
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzagi zzagi = new zzagi();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzagi.zzc((zzagh) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzagi.zzc((zzagh) entry.getKey(), entry.getValue());
        }
        zzagi.zzd = this.zzd;
        return zzagi;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzagi)) {
            return false;
        }
        return this.zza.equals(((zzagi) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (!this.zzc) {
            for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
                Map.Entry zzg = this.zza.zzg(i10);
                if (zzg.getValue() instanceof zzago) {
                    ((zzago) zzg.getValue()).zzG();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzc(zzagh zzagh, Object obj) {
        if (!zzagh.zzc()) {
            zzd(zzagh, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                zzd(zzagh, arrayList.get(i10));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzahb) {
            this.zzd = true;
        }
        this.zza.put(zzagh, obj);
    }

    private zzagi(boolean z10) {
        zzb();
        zzb();
    }
}
