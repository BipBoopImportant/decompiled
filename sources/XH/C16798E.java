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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0001\b\u0001\u00020\u0007¨\u0006-"}, d2 = {"LXH/E;", "", "LXH/D;", "", "size", "i", "(I)[B", "", "storage", "k", "([B)[B", "index", "t", "([BI)B", "value", "LXH/N;", "D", "([BIB)V", "", "C", "([B)Ljava/util/Iterator;", "element", "", "p", "([BB)Z", "elements", "q", "([BLjava/util/Collection;)Z", "B", "([B)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "[B", "getStorage$annotations", "()V", "x", "([B)I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: XH.E  reason: case insensitive filesystem */
public final class C16798E implements Collection<C16797D>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f139773a;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LXH/E$a;", "", "LXH/D;", "", "array", "<init>", "([B)V", "", "hasNext", "()Z", "c", "()B", "a", "[B", "", "b", "I", "index", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: XH.E$a */
    private static final class a implements Iterator<C16797D>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f139774a;

        /* renamed from: b  reason: collision with root package name */
        private int f139775b;

        public a(byte[] bArr) {
            C17542s.j(bArr, "array");
            this.f139774a = bArr;
        }

        public byte c() {
            int i10 = this.f139775b;
            byte[] bArr = this.f139774a;
            if (i10 < bArr.length) {
                this.f139775b = i10 + 1;
                return C16797D.b(bArr[i10]);
            }
            throw new NoSuchElementException(String.valueOf(this.f139775b));
        }

        public boolean hasNext() {
            return this.f139775b < this.f139774a.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return C16797D.a(c());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C16798E(byte[] bArr) {
        this.f139773a = bArr;
    }

    public static int A(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean B(byte[] bArr) {
        return bArr.length == 0;
    }

    public static Iterator<C16797D> C(byte[] bArr) {
        return new a(bArr);
    }

    public static final void D(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    public static String E(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    public static final /* synthetic */ C16798E b(byte[] bArr) {
        return new C16798E(bArr);
    }

    public static byte[] i(int i10) {
        return k(new byte[i10]);
    }

    public static byte[] k(byte[] bArr) {
        C17542s.j(bArr, PlaceTypes.STORAGE);
        return bArr;
    }

    public static boolean p(byte[] bArr, byte b10) {
        return C16870n.W(bArr, b10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean q(byte[] r3, java.util.Collection<XH.C16797D> r4) {
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
            boolean r2 = r0 instanceof XH.C16797D
            if (r2 == 0) goto L_0x0031
            XH.D r0 = (XH.C16797D) r0
            byte r0 = r0.v()
            boolean r0 = YH.C16870n.W(r3, r0)
            if (r0 == 0) goto L_0x0031
            goto L_0x0016
        L_0x0031:
            r1 = 0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: XH.C16798E.q(byte[], java.util.Collection):boolean");
    }

    public static boolean s(byte[] bArr, Object obj) {
        return (obj instanceof C16798E) && C17542s.e(bArr, ((C16798E) obj).F());
    }

    public static final byte t(byte[] bArr, int i10) {
        return C16797D.b(bArr[i10]);
    }

    public static int x(byte[] bArr) {
        return bArr.length;
    }

    public final /* synthetic */ byte[] F() {
        return this.f139773a;
    }

    /* renamed from: a */
    public int size() {
        return x(this.f139773a);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C16797D> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C16797D)) {
            return false;
        }
        return m(((C16797D) obj).v());
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        return q(this.f139773a, collection);
    }

    public boolean equals(Object obj) {
        return s(this.f139773a, obj);
    }

    public int hashCode() {
        return A(this.f139773a);
    }

    public boolean isEmpty() {
        return B(this.f139773a);
    }

    public Iterator<C16797D> iterator() {
        return C(this.f139773a);
    }

    public boolean m(byte b10) {
        return p(this.f139773a, b10);
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
        return E(this.f139773a);
    }

    public <T> T[] toArray(T[] tArr) {
        C17542s.j(tArr, "array");
        return C17534j.b(this, tArr);
    }
}
