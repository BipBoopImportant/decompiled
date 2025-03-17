package Y0;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0015\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LY0/k;", "E", "LY0/a;", "", "", "root", "", "index", "size", "height", "<init>", "([Ljava/lang/Object;III)V", "startLevel", "LXH/N;", "l", "(II)V", "indexPredicate", "m", "(I)V", "k", "()Ljava/lang/Object;", "n", "next", "previous", "c", "I", "d", "[Ljava/lang/Object;", "path", "", "e", "Z", "isInRightEdge", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k<E> extends a<E> {

    /* renamed from: c  reason: collision with root package name */
    private int f14732c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f14733d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14734e;

    public k(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f14732c = i12;
        Object[] objArr2 = new Object[i12];
        this.f14733d = objArr2;
        boolean z10 = i10 == i11;
        this.f14734e = z10;
        objArr2[0] = objArr;
        l(i10 - (z10 ? 1 : 0), 1);
    }

    private final E k() {
        Object obj = this.f14733d[this.f14732c - 1];
        C17542s.h(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[f() & 31];
    }

    private final void l(int i10, int i11) {
        int i12 = (this.f14732c - i11) * 5;
        while (i11 < this.f14732c) {
            Object[] objArr = this.f14733d;
            Object[] objArr2 = objArr[i11 - 1];
            C17542s.h(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = objArr2[l.a(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    private final void m(int i10) {
        int i11 = 0;
        while (l.a(f(), i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            l(f(), ((this.f14732c - 1) - (i11 / 5)) + 1);
        }
    }

    public final void n(Object[] objArr, int i10, int i11, int i12) {
        h(i10);
        i(i11);
        this.f14732c = i12;
        if (this.f14733d.length < i12) {
            this.f14733d = new Object[i12];
        }
        boolean z10 = false;
        this.f14733d[0] = objArr;
        if (i10 == i11) {
            z10 = true;
        }
        this.f14734e = z10;
        l(i10 - (z10 ? 1 : 0), 1);
    }

    public E next() {
        if (hasNext()) {
            E k10 = k();
            h(f() + 1);
            if (f() == a()) {
                this.f14734e = true;
                return k10;
            }
            m(0);
            return k10;
        }
        throw new NoSuchElementException();
    }

    public E previous() {
        if (hasPrevious()) {
            h(f() - 1);
            if (this.f14734e) {
                this.f14734e = false;
                return k();
            }
            m(31);
            return k();
        }
        throw new NoSuchElementException();
    }
}
