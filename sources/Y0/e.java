package Y0;

import U0.C0;
import YH.C16870n;
import b1.C5254a;
import b1.C5257d;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import tI.C17978n;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJE\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J5\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010#JA\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b%\u0010&J?\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010)JA\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0001\u0010+J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b,\u0010-J%\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b,\u0010.J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u00100J)\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020201H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0016¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00028\u0000092\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b<\u0010=J%\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b>\u0010.R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010\u000eR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010C¨\u0006E"}, d2 = {"LY0/e;", "E", "LX0/e;", "LY0/b;", "", "", "root", "tail", "", "size", "rootShift", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "D", "()I", "filledTail", "newTail", "x", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)LY0/e;", "shift", "A", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "tailIndex", "element", "q", "([Ljava/lang/Object;ILjava/lang/Object;)LY0/e;", "index", "LY0/d;", "elementCarry", "p", "([Ljava/lang/Object;IILjava/lang/Object;LY0/d;)[Ljava/lang/Object;", "rootSize", "C", "([Ljava/lang/Object;III)LX0/e;", "t", "([Ljava/lang/Object;II)LX0/e;", "tailCarry", "s", "([Ljava/lang/Object;IILY0/d;)[Ljava/lang/Object;", "B", "k", "(I)[Ljava/lang/Object;", "e", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", "add", "(Ljava/lang/Object;)LX0/e;", "(ILjava/lang/Object;)LX0/e;", "o0", "(I)LX0/e;", "Lkotlin/Function1;", "", "predicate", "r3", "(LnI/l;)LX0/e;", "LY0/f;", "m", "()LY0/f;", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "b", "[Ljava/lang/Object;", "c", "d", "I", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e<E> extends b<E> implements X0.e<E> {

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f14708b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f14709c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14710d;

    /* renamed from: e  reason: collision with root package name */
    private final int f14711e;

    public e(Object[] objArr, Object[] objArr2, int i10, int i11) {
        this.f14708b = objArr;
        this.f14709c = objArr2;
        this.f14710d = i10;
        this.f14711e = i11;
        boolean z10 = false;
        if (!(size() > 32)) {
            C0.a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        C5254a.a(size() - l.d(size()) <= C17978n.i(objArr2.length, 32) ? true : z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r4 == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] A(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + -1
            int r0 = Y0.l.a(r0, r5)
            r1 = 32
            if (r4 == 0) goto L_0x0019
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
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
            java.lang.Object[] r5 = r3.A(r2, r5, r6)
            r4[r0] = r5
        L_0x002c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.e.A(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    private final Object[] B(Object[] objArr, int i10, int i11, d dVar) {
        Object[] objArr2;
        int a10 = l.a(i11, i10);
        int i12 = 31;
        if (i10 == 0) {
            if (a10 == 0) {
                objArr2 = new Object[32];
            } else {
                objArr2 = Arrays.copyOf(objArr, 32);
                C17542s.i(objArr2, "copyOf(this, newSize)");
            }
            C16870n.n(objArr, objArr2, a10, a10 + 1, 32);
            objArr2[31] = dVar.a();
            dVar.b(objArr[a10]);
            return objArr2;
        }
        if (objArr[31] == null) {
            i12 = l.a(D() - 1, i10);
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        C17542s.i(copyOf, "copyOf(this, newSize)");
        int i13 = i10 - 5;
        int i14 = a10 + 1;
        if (i14 <= i12) {
            while (true) {
                Object obj = copyOf[i12];
                C17542s.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf[i12] = B((Object[]) obj, i13, 0, dVar);
                if (i12 == i14) {
                    break;
                }
                i12--;
            }
        }
        Object obj2 = copyOf[a10];
        C17542s.h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf[a10] = B((Object[]) obj2, i13, i11, dVar);
        return copyOf;
    }

    private final X0.e<E> C(Object[] objArr, int i10, int i11, int i12) {
        int size = size() - i10;
        C5254a.a(i12 < size);
        if (size == 1) {
            return t(objArr, i10, i11);
        }
        Object[] copyOf = Arrays.copyOf(this.f14709c, 32);
        C17542s.i(copyOf, "copyOf(this, newSize)");
        int i13 = size - 1;
        if (i12 < i13) {
            C16870n.n(this.f14709c, copyOf, i12, i12 + 1, size);
        }
        copyOf[i13] = null;
        return new e(objArr, copyOf, (i10 + size) - 1, i11);
    }

    private final int D() {
        return l.d(size());
    }

    private final Object[] E(Object[] objArr, int i10, int i11, Object obj) {
        int a10 = l.a(i11, i10);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        C17542s.i(copyOf, "copyOf(this, newSize)");
        if (i10 == 0) {
            copyOf[a10] = obj;
        } else {
            Object obj2 = copyOf[a10];
            C17542s.h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[a10] = E((Object[]) obj2, i10 - 5, i11, obj);
        }
        return copyOf;
    }

    private final Object[] k(int i10) {
        if (D() <= i10) {
            return this.f14709c;
        }
        Object[] objArr = this.f14708b;
        for (int i11 = this.f14711e; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[l.a(i10, i11)];
            C17542s.h(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] p(Object[] objArr, int i10, int i11, Object obj, d dVar) {
        Object[] objArr2;
        Object[] objArr3 = objArr;
        int i12 = i10;
        int a10 = l.a(i11, i12);
        if (i12 == 0) {
            if (a10 == 0) {
                objArr2 = new Object[32];
            } else {
                objArr2 = Arrays.copyOf(objArr3, 32);
                C17542s.i(objArr2, "copyOf(this, newSize)");
            }
            C16870n.n(objArr3, objArr2, a10 + 1, a10, 31);
            dVar.b(objArr3[31]);
            objArr2[a10] = obj;
            return objArr2;
        }
        d dVar2 = dVar;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        C17542s.i(copyOf, "copyOf(this, newSize)");
        int i13 = i12 - 5;
        Object obj2 = objArr3[a10];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        C17542s.h(obj2, str);
        copyOf[a10] = p((Object[]) obj2, i13, i11, obj, dVar);
        int i14 = a10 + 1;
        while (i14 < 32 && copyOf[i14] != null) {
            Object obj3 = objArr3[i14];
            C17542s.h(obj3, str);
            Object[] objArr4 = copyOf;
            objArr4[i14] = p((Object[]) obj3, i13, 0, dVar.a(), dVar);
            i14++;
            copyOf = objArr4;
            str = str;
        }
        return copyOf;
    }

    private final e<E> q(Object[] objArr, int i10, Object obj) {
        int size = size() - D();
        Object[] copyOf = Arrays.copyOf(this.f14709c, 32);
        C17542s.i(copyOf, "copyOf(this, newSize)");
        if (size < 32) {
            C16870n.n(this.f14709c, copyOf, i10 + 1, i10, size);
            copyOf[i10] = obj;
            return new e<>(objArr, copyOf, size() + 1, this.f14711e);
        }
        Object[] objArr2 = this.f14709c;
        Object obj2 = objArr2[31];
        C16870n.n(objArr2, copyOf, i10 + 1, i10, size - 1);
        copyOf[i10] = obj;
        return x(objArr, copyOf, l.c(obj2));
    }

    private final Object[] s(Object[] objArr, int i10, int i11, d dVar) {
        Object[] objArr2;
        int a10 = l.a(i11, i10);
        if (i10 == 5) {
            dVar.b(objArr[a10]);
            objArr2 = null;
        } else {
            Object[] objArr3 = objArr[a10];
            C17542s.h(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = s(objArr3, i10 - 5, i11, dVar);
        }
        if (objArr2 == null && a10 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        C17542s.i(copyOf, "copyOf(this, newSize)");
        copyOf[a10] = objArr2;
        return copyOf;
    }

    private final X0.e<E> t(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                C17542s.i(objArr, "copyOf(this, newSize)");
            }
            return new j(objArr);
        }
        d dVar = new d((Object) null);
        Object[] s10 = s(objArr, i11, i10 - 1, dVar);
        C17542s.g(s10);
        Object a10 = dVar.a();
        C17542s.h(a10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a10;
        if (s10[1] != null) {
            return new e(s10, objArr2, i10, i11);
        }
        Object obj = s10[0];
        C17542s.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj, objArr2, i10, i11 - 5);
    }

    private final e<E> x(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f14711e;
        if (size <= (1 << i10)) {
            return new e<>(A(objArr, i10, objArr2), objArr3, size() + 1, this.f14711e);
        }
        Object[] c10 = l.c(objArr);
        int i11 = this.f14711e + 5;
        return new e<>(A(c10, i11, objArr2), objArr3, size() + 1, i11);
    }

    public int a() {
        return this.f14710d;
    }

    public X0.e<E> add(E e10) {
        int size = size() - D();
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(this.f14709c, 32);
            C17542s.i(copyOf, "copyOf(this, newSize)");
            copyOf[size] = e10;
            return new e(this.f14708b, copyOf, size() + 1, this.f14711e);
        }
        return x(this.f14708b, this.f14709c, l.c(e10));
    }

    public E get(int i10) {
        C5257d.a(i10, size());
        return k(i10)[i10 & 31];
    }

    public ListIterator<E> listIterator(int i10) {
        C5257d.b(i10, size());
        return new g(this.f14708b, this.f14709c, i10, size(), (this.f14711e / 5) + 1);
    }

    /* renamed from: m */
    public f<E> e() {
        return new f<>(this, this.f14708b, this.f14709c, this.f14711e);
    }

    public X0.e<E> o0(int i10) {
        C5257d.a(i10, size());
        int D10 = D();
        return i10 >= D10 ? C(this.f14708b, D10, this.f14711e, i10 - D10) : C(B(this.f14708b, this.f14711e, i10, new d(this.f14709c[0])), D10, this.f14711e, 0);
    }

    public X0.e<E> r3(C17642l<? super E, Boolean> lVar) {
        f m10 = e();
        m10.T(lVar);
        return m10.g();
    }

    public X0.e<E> set(int i10, E e10) {
        C5257d.a(i10, size());
        if (D() > i10) {
            return new e(E(this.f14708b, this.f14711e, i10, e10), this.f14709c, size(), this.f14711e);
        }
        Object[] copyOf = Arrays.copyOf(this.f14709c, 32);
        C17542s.i(copyOf, "copyOf(this, newSize)");
        copyOf[i10 & 31] = e10;
        return new e(this.f14708b, copyOf, size(), this.f14711e);
    }

    public X0.e<E> add(int i10, E e10) {
        C5257d.b(i10, size());
        if (i10 == size()) {
            return add(e10);
        }
        int D10 = D();
        if (i10 >= D10) {
            return q(this.f14708b, i10 - D10, e10);
        }
        d dVar = new d((Object) null);
        return q(p(this.f14708b, this.f14711e, i10, e10, dVar), 0, dVar.a());
    }
}
