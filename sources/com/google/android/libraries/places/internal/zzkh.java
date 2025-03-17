package com.google.android.libraries.places.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class zzkh extends zzke implements List, RandomAccess {
    private static final zzlf zza = new zzkf(zzkv.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    zzkh() {
    }

    static zzkh zzi(Object[] objArr, int i10) {
        return i10 == 0 ? zzkv.zza : new zzkv(objArr, i10);
    }

    public static zzkh zzj(Collection collection) {
        if (collection instanceof zzke) {
            zzkh zzd2 = ((zzke) collection).zzd();
            if (!zzd2.zzf()) {
                return zzd2;
            }
            Object[] array = zzd2.toArray();
            return zzi(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzkr.zza(array2, length);
        return zzi(array2, length);
    }

    public static zzkh zzk(Object[] objArr) {
        if (objArr.length == 0) {
            return zzkv.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzkr.zza(objArr2, length);
        return zzi(objArr2, length);
    }

    public static zzkh zzl() {
        return zzkv.zza;
    }

    public static zzkh zzm(Object obj) {
        Object[] objArr = {obj};
        zzkr.zza(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzkh zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzkr.zza(objArr, 2);
        return zzi(objArr, 2);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.libraries.places.internal.zzkh zzo(java.util.Comparator r1, java.lang.Iterable r2) {
        /*
            java.lang.Object[] r2 = r2.toArray()
            int r0 = r2.length
            com.google.android.libraries.places.internal.zzkr.zza(r2, r0)
            java.util.Arrays.sort(r2, r1)
            com.google.android.libraries.places.internal.zzkh r1 = zzi(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkh.zzo(java.util.Comparator, java.lang.Iterable):com.google.android.libraries.places.internal.zzkh");
    }

    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i10 = 0;
                    while (i10 < size) {
                        if (zzjl.zza(get(i10), list.get(i10))) {
                            i10++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzjl.zza(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Deprecated
    public final zzkh zzd() {
        return this;
    }

    public final zzle zze() {
        return listIterator(0);
    }

    /* renamed from: zzh */
    public zzkh subList(int i10, int i11) {
        zzjp.zzi(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? zzkv.zza : new zzkg(this, i10, i12);
    }

    /* renamed from: zzp */
    public final zzlf listIterator(int i10) {
        zzjp.zzb(i10, size(), "index");
        return isEmpty() ? zza : new zzkf(this, i10);
    }
}
