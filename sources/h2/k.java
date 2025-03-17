package H2;

import android.util.SparseArray;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "Landroid/util/SparseArray;", "", "key", "value", "", "a", "(Landroid/util/SparseArray;ILjava/lang/Object;)Z", "", "b", "(Landroid/util/SparseArray;)Ljava/util/Iterator;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k {

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00018\u00008\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"H2/k$a", "", "", "hasNext", "()Z", "kotlin.jvm.PlatformType", "next", "()Ljava/lang/Object;", "", "a", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Iterator<T>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private int f7067a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SparseArray<T> f7068b;

        a(SparseArray<T> sparseArray) {
            this.f7068b = sparseArray;
        }

        public boolean hasNext() {
            return this.f7067a < this.f7068b.size();
        }

        public T next() {
            SparseArray<T> sparseArray = this.f7068b;
            int i10 = this.f7067a;
            this.f7067a = i10 + 1;
            return sparseArray.valueAt(i10);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(SparseArray<T> sparseArray, int i10, T t10) {
        int indexOfKey = sparseArray.indexOfKey(i10);
        if (indexOfKey < 0 || !C17542s.e(t10, sparseArray.valueAt(indexOfKey))) {
            return false;
        }
        sparseArray.removeAt(indexOfKey);
        return true;
    }

    public static final <T> Iterator<T> b(SparseArray<T> sparseArray) {
        return new a(sparseArray);
    }
}
