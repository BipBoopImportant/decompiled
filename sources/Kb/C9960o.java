package kb;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: kb.o  reason: case insensitive filesystem */
final class C9960o<T> extends C9935O<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final Comparator<? super T>[] f74999a;

    C9960o(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.f74999a = new Comparator[]{comparator, comparator2};
    }

    public int compare(T t10, T t11) {
        int i10 = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.f74999a;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i10].compare(t10, t11);
            if (compare != 0) {
                return compare;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9960o) {
            return Arrays.equals(this.f74999a, ((C9960o) obj).f74999a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f74999a);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f74999a) + ")";
    }
}
