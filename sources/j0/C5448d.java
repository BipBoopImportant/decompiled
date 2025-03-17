package j0;

import java.util.ConcurrentModificationException;
import k0.C5489a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"E", "Lj0/b;", "", "hash", "b", "(Lj0/b;I)I", "", "key", "c", "(Lj0/b;Ljava/lang/Object;I)I", "d", "(Lj0/b;)I", "size", "LXH/N;", "a", "(Lj0/b;I)V", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: j0.d  reason: case insensitive filesystem */
public final class C5448d {
    public static final <E> void a(C5446b<E> bVar, int i10) {
        C17542s.j(bVar, "<this>");
        bVar.s(new int[i10]);
        bVar.q(new Object[i10]);
    }

    public static final <E> int b(C5446b<E> bVar, int i10) {
        C17542s.j(bVar, "<this>");
        try {
            return C5489a.a(bVar.k(), bVar.m(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> int c(C5446b<E> bVar, Object obj, int i10) {
        C17542s.j(bVar, "<this>");
        int m10 = bVar.m();
        if (m10 == 0) {
            return -1;
        }
        int b10 = b(bVar, i10);
        if (b10 < 0 || C17542s.e(obj, bVar.i()[b10])) {
            return b10;
        }
        int i11 = b10 + 1;
        while (i11 < m10 && bVar.k()[i11] == i10) {
            if (C17542s.e(obj, bVar.i()[i11])) {
                return i11;
            }
            i11++;
        }
        int i12 = b10 - 1;
        while (i12 >= 0 && bVar.k()[i12] == i10) {
            if (C17542s.e(obj, bVar.i()[i12])) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public static final <E> int d(C5446b<E> bVar) {
        C17542s.j(bVar, "<this>");
        return c(bVar, (Object) null, 0);
    }
}
