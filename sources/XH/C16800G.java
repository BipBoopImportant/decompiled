package XH;

import YH.C16870n;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17534j;
import kotlin.jvm.internal.C17542s;
import mI.C17604b;
import oI.C17693a;

@C17604b
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0001\b\u0001\u00020\u0007¨\u0006-"}, d2 = {"LXH/G;", "", "LXH/F;", "", "size", "i", "(I)[I", "", "storage", "k", "([I)[I", "index", "t", "([II)I", "value", "LXH/N;", "D", "([III)V", "", "C", "([I)Ljava/util/Iterator;", "element", "", "p", "([II)Z", "elements", "q", "([ILjava/util/Collection;)Z", "B", "([I)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "[I", "getStorage$annotations", "()V", "x", "([I)I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: XH.G  reason: case insensitive filesystem */
public final class C16800G implements Collection<C16799F>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f139778a;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LXH/G$a;", "", "LXH/F;", "", "array", "<init>", "([I)V", "", "hasNext", "()Z", "c", "()I", "a", "[I", "", "b", "I", "index", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: XH.G$a */
    private static final class a implements Iterator<C16799F>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f139779a;

        /* renamed from: b  reason: collision with root package name */
        private int f139780b;

        public a(int[] iArr) {
            C17542s.j(iArr, "array");
            this.f139779a = iArr;
        }

        public int c() {
            int i10 = this.f139780b;
            int[] iArr = this.f139779a;
            if (i10 < iArr.length) {
                this.f139780b = i10 + 1;
                return C16799F.b(iArr[i10]);
            }
            throw new NoSuchElementException(String.valueOf(this.f139780b));
        }

        public boolean hasNext() {
            return this.f139780b < this.f139779a.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return C16799F.a(c());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C16800G(int[] iArr) {
        this.f139778a = iArr;
    }

    public static int A(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean B(int[] iArr) {
        return iArr.length == 0;
    }

    public static Iterator<C16799F> C(int[] iArr) {
        return new a(iArr);
    }

    public static final void D(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    public static String E(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public static final /* synthetic */ C16800G b(int[] iArr) {
        return new C16800G(iArr);
    }

    public static int[] i(int i10) {
        return k(new int[i10]);
    }

    public static int[] k(int[] iArr) {
        C17542s.j(iArr, PlaceTypes.STORAGE);
        return iArr;
    }

    public static boolean p(int[] iArr, int i10) {
        return C16870n.Y(iArr, i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean q(int[] r3, java.util.Collection<XH.C16799F> r4) {
        /*
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x0012
            goto L_0x0032
        L_0x0012:
            java.util.Iterator r4 = r4.iterator()
        L_0x0016:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r4.next()
            boolean r2 = r0 instanceof XH.C16799F
            if (r2 == 0) goto L_0x0031
            XH.F r0 = (XH.C16799F) r0
            int r0 = r0.v()
            boolean r0 = YH.C16870n.Y(r3, r0)
            if (r0 == 0) goto L_0x0031
            goto L_0x0016
        L_0x0031:
            r1 = 0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: XH.C16800G.q(int[], java.util.Collection):boolean");
    }

    public static boolean s(int[] iArr, Object obj) {
        return (obj instanceof C16800G) && C17542s.e(iArr, ((C16800G) obj).F());
    }

    public static final int t(int[] iArr, int i10) {
        return C16799F.b(iArr[i10]);
    }

    public static int x(int[] iArr) {
        return iArr.length;
    }

    public final /* synthetic */ int[] F() {
        return this.f139778a;
    }

    /* renamed from: a */
    public int size() {
        return x(this.f139778a);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C16799F> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C16799F)) {
            return false;
        }
        return m(((C16799F) obj).v());
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        return q(this.f139778a, collection);
    }

    public boolean equals(Object obj) {
        return s(this.f139778a, obj);
    }

    public int hashCode() {
        return A(this.f139778a);
    }

    public boolean isEmpty() {
        return B(this.f139778a);
    }

    public Iterator<C16799F> iterator() {
        return C(this.f139778a);
    }

    public boolean m(int i10) {
        return p(this.f139778a, i10);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray() {
        return C17534j.a(this);
    }

    public String toString() {
        return E(this.f139778a);
    }

    public <T> T[] toArray(T[] tArr) {
        C17542s.j(tArr, "array");
        return C17534j.b(this, tArr);
    }
}
