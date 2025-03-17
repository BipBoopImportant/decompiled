package LJ;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\bX\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LLJ/c;", "T", "LLJ/a;", "", "buffer", "", "index", "size", "<init>", "([Ljava/lang/Object;II)V", "next", "()Ljava/lang/Object;", "previous", "c", "[Ljava/lang/Object;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: LJ.c  reason: case insensitive filesystem */
public final class C16019c<T> extends C16017a<T> {

    /* renamed from: c  reason: collision with root package name */
    private final T[] f136092c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16019c(T[] tArr, int i10, int i11) {
        super(i10, i11);
        C17542s.j(tArr, "buffer");
        this.f136092c = tArr;
    }

    public T next() {
        if (hasNext()) {
            T[] tArr = this.f136092c;
            int f10 = f();
            h(f10 + 1);
            return tArr[f10];
        }
        throw new NoSuchElementException();
    }

    public T previous() {
        if (hasPrevious()) {
            T[] tArr = this.f136092c;
            h(f() - 1);
            return tArr[f()];
        }
        throw new NoSuchElementException();
    }
}
