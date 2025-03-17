package kotlin.jvm.internal;

import XH.C16814e;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"", "collection", "", "", "a", "(Ljava/util/Collection;)[Ljava/lang/Object;", "b", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "[Ljava/lang/Object;", "EMPTY", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.j  reason: case insensitive filesystem */
public final class C17534j {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f144383a = new Object[0];

    @C16814e
    public static final Object[] a(Collection<?> collection) {
        C17542s.j(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    objArr[i10] = it.next();
                    if (i11 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            i12 = 2147483645;
                            if (i11 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i12);
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i11);
                        C17542s.i(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i10 = i11;
                }
            }
        }
        return f144383a;
    }

    @C16814e
    public static final Object[] b(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        C17542s.j(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i10 = 0;
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    C17542s.h(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i11 = i10 + 1;
                    objArr2[i10] = it.next();
                    if (i11 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            i12 = 2147483645;
                            if (i11 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i12);
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i11] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i11);
                        C17542s.i(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i10 = i11;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }
}
