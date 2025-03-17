package j0;

import k0.C5489a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"E", "Lj0/c0;", "", "key", "c", "(Lj0/c0;I)Ljava/lang/Object;", "LXH/N;", "d", "(Lj0/c0;)V", "", "a", "Ljava/lang/Object;", "DELETED", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Object f24605a = new Object();

    public static final <E> E c(c0<E> c0Var, int i10) {
        E e10;
        C17542s.j(c0Var, "<this>");
        int a10 = C5489a.a(c0Var.f24602b, c0Var.f24604d, i10);
        if (a10 < 0 || (e10 = c0Var.f24603c[a10]) == f24605a) {
            return null;
        }
        return e10;
    }

    /* access modifiers changed from: private */
    public static final <E> void d(c0<E> c0Var) {
        int i10 = c0Var.f24604d;
        int[] iArr = c0Var.f24602b;
        Object[] objArr = c0Var.f24603c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f24605a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        c0Var.f24601a = false;
        c0Var.f24604d = i11;
    }
}
