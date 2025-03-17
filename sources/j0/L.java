package j0;

import YH.C16870n;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0006J\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0012\u001a\u00028\u00002\b\b\u0001\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lj0/L;", "E", "Lj0/T;", "", "initialCapacity", "<init>", "(I)V", "element", "", "g", "(Ljava/lang/Object;)Z", "LXH/N;", "h", "()V", "capacity", "i", "j", "index", "k", "(I)Ljava/lang/Object;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class L<E> extends T<E> {
    public L() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public final boolean g(E e10) {
        i(this.f24558b + 1);
        Object[] objArr = this.f24557a;
        int i10 = this.f24558b;
        objArr[i10] = e10;
        this.f24558b = i10 + 1;
        return true;
    }

    public final void h() {
        C16870n.x(this.f24557a, null, 0, this.f24558b);
        this.f24558b = 0;
    }

    public final void i(int i10) {
        Object[] objArr = this.f24557a;
        if (objArr.length < i10) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i10, (objArr.length * 3) / 2));
            C17542s.i(copyOf, "copyOf(this, newSize)");
            this.f24557a = copyOf;
        }
    }

    public final boolean j(E e10) {
        int b10 = b(e10);
        if (b10 < 0) {
            return false;
        }
        k(b10);
        return true;
    }

    public final E k(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f24558b)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Index ");
            sb2.append(i10);
            sb2.append(" must be in 0..");
            sb2.append(this.f24558b - 1);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        E[] eArr = this.f24557a;
        E e10 = eArr[i10];
        if (i10 != i11 - 1) {
            C16870n.n(eArr, eArr, i10, i10 + 1, i11);
        }
        int i12 = this.f24558b - 1;
        this.f24558b = i12;
        eArr[i12] = null;
        return e10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public L(int i10) {
        super(i10, (DefaultConstructorMarker) null);
    }
}
