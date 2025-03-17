package w0;

import c2.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0007J#\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lw0/H;", "", "Lc2/d;", "", "availableSize", "spacing", "", "a", "(Lc2/d;II)[I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface H {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lw0/H$a;", "Lw0/H;", "", "count", "<init>", "(I)V", "Lc2/d;", "availableSize", "spacing", "", "a", "(Lc2/d;II)[I", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements H {

        /* renamed from: a  reason: collision with root package name */
        private final int f31172a;

        public a(int i10) {
            this.f31172a = i10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("grid with no rows/columns");
            }
        }

        public int[] a(d dVar, int i10, int i11) {
            return C6198e.b(i10, this.f31172a, i11);
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.f31172a == ((a) obj).f31172a;
        }

        public int hashCode() {
            return -this.f31172a;
        }
    }

    int[] a(d dVar, int i10, int i11);
}
