package j0;

import YH.C16870n;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lj0/D;", "Lj0/m;", "", "initialCapacity", "<init>", "(I)V", "element", "", "i", "(I)Z", "index", "LXH/N;", "h", "(II)V", "", "elements", "j", "(I[I)Z", "l", "([I)V", "capacity", "k", "m", "n", "(I)I", "o", "(II)I", "p", "()V", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class D extends C5457m {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final void h(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f24631b)) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f24631b);
        }
        k(i12 + 1);
        int[] iArr = this.f24630a;
        int i13 = this.f24631b;
        if (i10 != i13) {
            C16870n.l(iArr, iArr, i10 + 1, i10, i13);
        }
        iArr[i10] = i11;
        this.f24631b++;
    }

    public final boolean i(int i10) {
        k(this.f24631b + 1);
        int[] iArr = this.f24630a;
        int i11 = this.f24631b;
        iArr[i11] = i10;
        this.f24631b = i11 + 1;
        return true;
    }

    public final boolean j(int i10, int[] iArr) {
        int i11;
        C17542s.j(iArr, "elements");
        if (i10 < 0 || i10 > (i11 = this.f24631b)) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f24631b);
        } else if (iArr.length == 0) {
            return false;
        } else {
            k(i11 + iArr.length);
            int[] iArr2 = this.f24630a;
            int i12 = this.f24631b;
            if (i10 != i12) {
                C16870n.l(iArr2, iArr2, iArr.length + i10, i10, i12);
            }
            C16870n.q(iArr, iArr2, i10, 0, 0, 12, (Object) null);
            this.f24631b += iArr.length;
            return true;
        }
    }

    public final void k(int i10) {
        int[] iArr = this.f24630a;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            C17542s.i(copyOf, "copyOf(this, newSize)");
            this.f24630a = copyOf;
        }
    }

    public final void l(int[] iArr) {
        C17542s.j(iArr, "elements");
        j(this.f24631b, iArr);
    }

    public final boolean m(int i10) {
        int c10 = c(i10);
        if (c10 < 0) {
            return false;
        }
        n(c10);
        return true;
    }

    public final int n(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f24631b)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Index ");
            sb2.append(i10);
            sb2.append(" must be in 0..");
            sb2.append(this.f24631b - 1);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int[] iArr = this.f24630a;
        int i12 = iArr[i10];
        if (i10 != i11 - 1) {
            C16870n.l(iArr, iArr, i10, i10 + 1, i11);
        }
        this.f24631b--;
        return i12;
    }

    public final int o(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f24631b) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("set index ");
            sb2.append(i10);
            sb2.append(" must be between 0 .. ");
            sb2.append(this.f24631b - 1);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int[] iArr = this.f24630a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    public final void p() {
        int i10 = this.f24631b;
        if (i10 != 0) {
            C16870n.J(this.f24630a, 0, i10);
        }
    }

    public D(int i10) {
        super(i10, (DefaultConstructorMarker) null);
    }
}
