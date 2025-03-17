package rI;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17974j;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0007\u001a\u00020\u0000*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", "seed", "LrI/c;", "a", "(I)LrI/c;", "LtI/j;", "range", "e", "(LrI/c;LtI/j;)I", "value", "d", "(I)I", "bitCount", "f", "(II)I", "from", "until", "LXH/N;", "c", "(II)V", "", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: rI.d  reason: case insensitive filesystem */
public final class C17854d {
    public static final C17853c a(int i10) {
        return new C17855e(i10, i10 >> 31);
    }

    public static final String b(Object obj, Object obj2) {
        C17542s.j(obj, "from");
        C17542s.j(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void c(int i10, int i11) {
        if (i11 <= i10) {
            throw new IllegalArgumentException(b(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    public static final int d(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static final int e(C17853c cVar, C17974j jVar) {
        C17542s.j(cVar, "<this>");
        C17542s.j(jVar, "range");
        if (!jVar.isEmpty()) {
            return jVar.q() < Integer.MAX_VALUE ? cVar.f(jVar.p(), jVar.q() + 1) : jVar.p() > Integer.MIN_VALUE ? cVar.f(jVar.p() - 1, jVar.q()) + 1 : cVar.d();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + jVar);
    }

    public static final int f(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
