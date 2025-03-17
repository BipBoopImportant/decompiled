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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0001\b\u0001\u00020\u0007¨\u0006-"}, d2 = {"LXH/L;", "", "LXH/K;", "", "size", "i", "(I)[S", "", "storage", "k", "([S)[S", "index", "t", "([SI)S", "value", "LXH/N;", "D", "([SIS)V", "", "C", "([S)Ljava/util/Iterator;", "element", "", "p", "([SS)Z", "elements", "q", "([SLjava/util/Collection;)Z", "B", "([S)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "[S", "getStorage$annotations", "()V", "x", "([S)I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: XH.L  reason: case insensitive filesystem */
public final class C16805L implements Collection<C16804K>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final short[] f139789a;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LXH/L$a;", "", "LXH/K;", "", "array", "<init>", "([S)V", "", "hasNext", "()Z", "c", "()S", "a", "[S", "", "b", "I", "index", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: XH.L$a */
    private static final class a implements Iterator<C16804K>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final short[] f139790a;

        /* renamed from: b  reason: collision with root package name */
        private int f139791b;

        public a(short[] sArr) {
            C17542s.j(sArr, "array");
            this.f139790a = sArr;
        }

        public short c() {
            int i10 = this.f139791b;
            short[] sArr = this.f139790a;
            if (i10 < sArr.length) {
                this.f139791b = i10 + 1;
                return C16804K.b(sArr[i10]);
            }
            throw new NoSuchElementException(String.valueOf(this.f139791b));
        }

        public boolean hasNext() {
            return this.f139791b < this.f139790a.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return C16804K.a(c());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C16805L(short[] sArr) {
        this.f139789a = sArr;
    }

    public static int A(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean B(short[] sArr) {
        return sArr.length == 0;
    }

    public static Iterator<C16804K> C(short[] sArr) {
        return new a(sArr);
    }

    public static final void D(short[] sArr, int i10, short s10) {
        sArr[i10] = s10;
    }

    public static String E(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public static final /* synthetic */ C16805L b(short[] sArr) {
        return new C16805L(sArr);
    }

    public static short[] i(int i10) {
        return k(new short[i10]);
    }

    public static short[] k(short[] sArr) {
        C17542s.j(sArr, PlaceTypes.STORAGE);
        return sArr;
    }

    public static boolean p(short[] sArr, short s10) {
        return C16870n.b0(sArr, s10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean q(short[] r3, java.util.Collection<XH.C16804K> r4) {
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
            boolean r2 = r0 instanceof XH.C16804K
            if (r2 == 0) goto L_0x0031
            XH.K r0 = (XH.C16804K) r0
            short r0 = r0.v()
            boolean r0 = YH.C16870n.b0(r3, r0)
            if (r0 == 0) goto L_0x0031
            goto L_0x0016
        L_0x0031:
            r1 = 0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: XH.C16805L.q(short[], java.util.Collection):boolean");
    }

    public static boolean s(short[] sArr, Object obj) {
        return (obj instanceof C16805L) && C17542s.e(sArr, ((C16805L) obj).F());
    }

    public static final short t(short[] sArr, int i10) {
        return C16804K.b(sArr[i10]);
    }

    public static int x(short[] sArr) {
        return sArr.length;
    }

    public final /* synthetic */ short[] F() {
        return this.f139789a;
    }

    /* renamed from: a */
    public int size() {
        return x(this.f139789a);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C16804K> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C16804K)) {
            return false;
        }
        return m(((C16804K) obj).v());
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        return q(this.f139789a, collection);
    }

    public boolean equals(Object obj) {
        return s(this.f139789a, obj);
    }

    public int hashCode() {
        return A(this.f139789a);
    }

    public boolean isEmpty() {
        return B(this.f139789a);
    }

    public Iterator<C16804K> iterator() {
        return C(this.f139789a);
    }

    public boolean m(short s10) {
        return p(this.f139789a, s10);
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
        return E(this.f139789a);
    }

    public <T> T[] toArray(T[] tArr) {
        C17542s.j(tArr, "array");
        return C17534j.b(this, tArr);
    }
}
