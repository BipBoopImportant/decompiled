package jb;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public final class n {

    private static class b<T> implements m<T>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final List<? extends m<? super T>> f74795a;

        public boolean apply(T t10) {
            for (int i10 = 0; i10 < this.f74795a.size(); i10++) {
                if (!((m) this.f74795a.get(i10)).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f74795a.equals(((b) obj).f74795a);
            }
            return false;
        }

        public int hashCode() {
            return this.f74795a.hashCode() + 306654252;
        }

        public String toString() {
            return n.d("and", this.f74795a);
        }

        private b(List<? extends m<? super T>> list) {
            this.f74795a = list;
        }
    }

    public static <T> m<T> b(m<? super T> mVar, m<? super T> mVar2) {
        return new b(c((m) l.j(mVar), (m) l.j(mVar2)));
    }

    private static <T> List<m<? super T>> c(m<? super T> mVar, m<? super T> mVar2) {
        return Arrays.asList(new m[]{mVar, mVar2});
    }

    /* access modifiers changed from: private */
    public static String d(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object next : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(next);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
