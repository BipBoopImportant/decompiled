package LJ;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B=\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\bX\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LLJ/g;", "T", "LLJ/a;", "", "", "root", "tail", "", "index", "size", "trieHeight", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;III)V", "next", "()Ljava/lang/Object;", "previous", "c", "[Ljava/lang/Object;", "LLJ/k;", "d", "LLJ/k;", "trieIterator", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: LJ.g  reason: case insensitive filesystem */
public final class C16023g<T> extends C16017a<T> {

    /* renamed from: c  reason: collision with root package name */
    private final T[] f136105c;

    /* renamed from: d  reason: collision with root package name */
    private final C16027k<T> f136106d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16023g(Object[] objArr, T[] tArr, int i10, int i11, int i12) {
        super(i10, i11);
        C17542s.j(objArr, "root");
        C17542s.j(tArr, "tail");
        this.f136105c = tArr;
        int d10 = C16028l.d(i11);
        this.f136106d = new C16027k<>(objArr, C17978n.i(i10, d10), d10, i12);
    }

    public T next() {
        c();
        if (this.f136106d.hasNext()) {
            h(f() + 1);
            return this.f136106d.next();
        }
        T[] tArr = this.f136105c;
        int f10 = f();
        h(f10 + 1);
        return tArr[f10 - this.f136106d.a()];
    }

    public T previous() {
        d();
        if (f() > this.f136106d.a()) {
            T[] tArr = this.f136105c;
            h(f() - 1);
            return tArr[f() - this.f136106d.a()];
        }
        h(f() - 1);
        return this.f136106d.previous();
    }
}
