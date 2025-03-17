package LJ;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LLJ/i;", "E", "LLJ/a;", "element", "", "index", "<init>", "(Ljava/lang/Object;I)V", "next", "()Ljava/lang/Object;", "previous", "c", "Ljava/lang/Object;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: LJ.i  reason: case insensitive filesystem */
public final class C16025i<E> extends C16017a<E> {

    /* renamed from: c  reason: collision with root package name */
    private final E f136111c;

    public C16025i(E e10, int i10) {
        super(i10, 1);
        this.f136111c = e10;
    }

    public E next() {
        c();
        h(f() + 1);
        return this.f136111c;
    }

    public E previous() {
        d();
        h(f() - 1);
        return this.f136111c;
    }
}
