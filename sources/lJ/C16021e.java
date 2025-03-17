package LJ;

import KJ.C15990f;
import PJ.C16207a;
import PJ.C16210d;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJE\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000eR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010(¨\u0006+"}, d2 = {"LLJ/e;", "E", "LKJ/f;", "LLJ/b;", "", "", "root", "tail", "", "size", "rootShift", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "s", "()I", "filledTail", "newTail", "p", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)LLJ/e;", "shift", "q", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "index", "k", "(I)[Ljava/lang/Object;", "element", "add", "(Ljava/lang/Object;)LKJ/f;", "LLJ/f;", "m", "()LLJ/f;", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "b", "[Ljava/lang/Object;", "c", "d", "I", "a", "e", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: LJ.e  reason: case insensitive filesystem */
public final class C16021e<E> extends C16018b<E> implements C15990f<E> {

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f136094b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f136095c;

    /* renamed from: d  reason: collision with root package name */
    private final int f136096d;

    /* renamed from: e  reason: collision with root package name */
    private final int f136097e;

    public C16021e(Object[] objArr, Object[] objArr2, int i10, int i11) {
        C17542s.j(objArr, "root");
        C17542s.j(objArr2, "tail");
        this.f136094b = objArr;
        this.f136095c = objArr2;
        this.f136096d = i10;
        this.f136097e = i11;
        if (size() > 32) {
            C16207a.a(size() - C16028l.d(size()) <= C17978n.i(objArr2.length, 32));
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
    }

    private final Object[] k(int i10) {
        if (s() <= i10) {
            return this.f136095c;
        }
        Object[] objArr = this.f136094b;
        for (int i11 = this.f136097e; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[C16028l.a(i10, i11)];
            C17542s.h(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final C16021e<E> p(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f136097e;
        if (size <= (1 << i10)) {
            return new C16021e<>(q(objArr, i10, objArr2), objArr3, size() + 1, this.f136097e);
        }
        Object[] c10 = C16028l.c(objArr);
        int i11 = this.f136097e + 5;
        return new C16021e<>(q(c10, i11, objArr2), objArr3, size() + 1, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r4 == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] q(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + -1
            int r0 = LJ.C16028l.a(r0, r5)
            r1 = 32
            if (r4 == 0) goto L_0x0019
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.C17542s.i(r4, r2)
            if (r4 != 0) goto L_0x001b
        L_0x0019:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L_0x001b:
            r1 = 5
            if (r5 != r1) goto L_0x0021
            r4[r0] = r6
            goto L_0x002c
        L_0x0021:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.q(r2, r5, r6)
            r4[r0] = r5
        L_0x002c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: LJ.C16021e.q(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    private final int s() {
        return C16028l.d(size());
    }

    public int a() {
        return this.f136096d;
    }

    public C15990f<E> add(E e10) {
        int size = size() - s();
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(this.f136095c, 32);
            C17542s.i(copyOf, "copyOf(...)");
            copyOf[size] = e10;
            return new C16021e(this.f136094b, copyOf, size() + 1, this.f136097e);
        }
        return p(this.f136094b, this.f136095c, C16028l.c(e10));
    }

    public E get(int i10) {
        C16210d.a(i10, size());
        return k(i10)[i10 & 31];
    }

    public ListIterator<E> listIterator(int i10) {
        C16210d.b(i10, size());
        return new C16023g(this.f136094b, this.f136095c, i10, size(), (this.f136097e / 5) + 1);
    }

    /* renamed from: m */
    public C16022f<E> e() {
        return new C16022f<>(this, this.f136094b, this.f136095c, this.f136097e);
    }
}
