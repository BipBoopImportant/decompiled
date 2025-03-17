package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.S3;
import com.google.android.gms.internal.measurement.T3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class S3<MessageType extends T3<MessageType, BuilderType>, BuilderType extends S3<MessageType, BuilderType>> implements C7430v5 {
    protected static <T> void m(Iterable<T> iterable, List<? super T> list) {
        O4.e(iterable);
        if (iterable instanceof C7268c5) {
            List<?> zza = ((C7268c5) iterable).zza();
            C7268c5 c5Var = (C7268c5) list;
            int size = list.size();
            for (Object next : zza) {
                if (next == null) {
                    String str = "Element at index " + (c5Var.size() - size) + " is null.";
                    for (int size2 = c5Var.size() - 1; size2 >= size; size2--) {
                        c5Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                } else if (next instanceof C7276d4) {
                    c5Var.p0((C7276d4) next);
                } else if (next instanceof byte[]) {
                    c5Var.p0(C7276d4.q((byte[]) next));
                } else {
                    c5Var.add((String) next);
                }
            }
        } else if (iterable instanceof D5) {
            list.addAll((Collection) iterable);
        } else {
            if (iterable instanceof Collection) {
                int size3 = ((Collection) iterable).size();
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(list.size() + size3);
                } else if (list instanceof J5) {
                    ((J5) list).i(list.size() + size3);
                }
            }
            int size4 = list.size();
            if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
                for (T next2 : iterable) {
                    if (next2 == null) {
                        n(list, size4);
                    }
                    list.add(next2);
                }
                return;
            }
            List list2 = (List) iterable;
            int size5 = list2.size();
            for (int i10 = 0; i10 < size5; i10++) {
                Object obj = list2.get(i10);
                if (obj == null) {
                    n(list, size4);
                }
                list.add(obj);
            }
        }
    }

    private static void n(List<?> list, int i10) {
        String str = "Element at index " + (list.size() - i10) + " is null.";
        for (int size = list.size() - 1; size >= i10; size--) {
            list.remove(size);
        }
        throw new NullPointerException(str);
    }

    public final /* synthetic */ C7430v5 W1(byte[] bArr, C7445x4 x4Var) {
        return l(bArr, 0, bArr.length, x4Var);
    }

    public abstract /* synthetic */ Object clone();

    public abstract BuilderType k(byte[] bArr, int i10, int i11);

    public abstract BuilderType l(byte[] bArr, int i10, int i11, C7445x4 x4Var);

    public final /* synthetic */ C7430v5 t0(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }
}
