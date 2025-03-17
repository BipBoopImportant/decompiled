package MJ;

import YH.C16870n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"", "index", "shift", "e", "(II)I", "K", "V", "", "", "keyIndex", "key", "value", "f", "([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "nodeIndex", "LMJ/t;", "newNode", "i", "([Ljava/lang/Object;IILMJ/t;)[Ljava/lang/Object;", "g", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "h", "kotlinx-collections-immutable"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class x {
    public static final int e(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    /* access modifiers changed from: private */
    public static final <K, V> Object[] f(Object[] objArr, int i10, K k10, V v10) {
        Object[] objArr2 = new Object[(objArr.length + 2)];
        C16870n.r(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        C16870n.n(objArr, objArr2, i10 + 2, i10, objArr.length);
        objArr2[i10] = k10;
        objArr2[i10 + 1] = v10;
        return objArr2;
    }

    /* access modifiers changed from: private */
    public static final Object[] g(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[(objArr.length - 2)];
        C16870n.r(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        C16870n.n(objArr, objArr2, i10, i10 + 2, objArr.length);
        return objArr2;
    }

    /* access modifiers changed from: private */
    public static final Object[] h(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[(objArr.length - 1)];
        C16870n.r(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        C16870n.n(objArr, objArr2, i10, i10 + 1, objArr.length);
        return objArr2;
    }

    /* access modifiers changed from: private */
    public static final Object[] i(Object[] objArr, int i10, int i11, t<?, ?> tVar) {
        Object[] objArr2 = new Object[(objArr.length - 1)];
        C16870n.r(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        C16870n.n(objArr, objArr2, i10, i10 + 2, i11);
        objArr2[i11 - 2] = tVar;
        C16870n.n(objArr, objArr2, i11 - 1, i11, objArr.length);
        return objArr2;
    }
}
