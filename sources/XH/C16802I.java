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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0001\b\u0001\u00020\u0007¨\u0006-"}, d2 = {"LXH/I;", "", "LXH/H;", "", "size", "i", "(I)[J", "", "storage", "k", "([J)[J", "index", "t", "([JI)J", "value", "LXH/N;", "D", "([JIJ)V", "", "C", "([J)Ljava/util/Iterator;", "element", "", "p", "([JJ)Z", "elements", "q", "([JLjava/util/Collection;)Z", "B", "([J)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "[J", "getStorage$annotations", "()V", "x", "([J)I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: XH.I  reason: case insensitive filesystem */
public final class C16802I implements Collection<C16801H>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f139783a;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LXH/I$a;", "", "LXH/H;", "", "array", "<init>", "([J)V", "", "hasNext", "()Z", "c", "()J", "a", "[J", "", "b", "I", "index", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: XH.I$a */
    private static final class a implements Iterator<C16801H>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final long[] f139784a;

        /* renamed from: b  reason: collision with root package name */
        private int f139785b;

        public a(long[] jArr) {
            C17542s.j(jArr, "array");
            this.f139784a = jArr;
        }

        public long c() {
            int i10 = this.f139785b;
            long[] jArr = this.f139784a;
            if (i10 < jArr.length) {
                this.f139785b = i10 + 1;
                return C16801H.b(jArr[i10]);
            }
            throw new NoSuchElementException(String.valueOf(this.f139785b));
        }

        public boolean hasNext() {
            return this.f139785b < this.f139784a.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return C16801H.a(c());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C16802I(long[] jArr) {
        this.f139783a = jArr;
    }

    public static int A(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean B(long[] jArr) {
        return jArr.length == 0;
    }

    public static Iterator<C16801H> C(long[] jArr) {
        return new a(jArr);
    }

    public static final void D(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    public static String E(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    public static final /* synthetic */ C16802I b(long[] jArr) {
        return new C16802I(jArr);
    }

    public static long[] i(int i10) {
        return k(new long[i10]);
    }

    public static long[] k(long[] jArr) {
        C17542s.j(jArr, PlaceTypes.STORAGE);
        return jArr;
    }

    public static boolean p(long[] jArr, long j10) {
        return C16870n.Z(jArr, j10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean q(long[] r4, java.util.Collection<XH.C16801H> r5) {
        /*
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x0012
            goto L_0x0032
        L_0x0012:
            java.util.Iterator r5 = r5.iterator()
        L_0x0016:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r5.next()
            boolean r2 = r0 instanceof XH.C16801H
            if (r2 == 0) goto L_0x0031
            XH.H r0 = (XH.C16801H) r0
            long r2 = r0.B()
            boolean r0 = YH.C16870n.Z(r4, r2)
            if (r0 == 0) goto L_0x0031
            goto L_0x0016
        L_0x0031:
            r1 = 0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: XH.C16802I.q(long[], java.util.Collection):boolean");
    }

    public static boolean s(long[] jArr, Object obj) {
        return (obj instanceof C16802I) && C17542s.e(jArr, ((C16802I) obj).F());
    }

    public static final long t(long[] jArr, int i10) {
        return C16801H.b(jArr[i10]);
    }

    public static int x(long[] jArr) {
        return jArr.length;
    }

    public final /* synthetic */ long[] F() {
        return this.f139783a;
    }

    /* renamed from: a */
    public int size() {
        return x(this.f139783a);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C16801H> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C16801H)) {
            return false;
        }
        return m(((C16801H) obj).B());
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        return q(this.f139783a, collection);
    }

    public boolean equals(Object obj) {
        return s(this.f139783a, obj);
    }

    public int hashCode() {
        return A(this.f139783a);
    }

    public boolean isEmpty() {
        return B(this.f139783a);
    }

    public Iterator<C16801H> iterator() {
        return C(this.f139783a);
    }

    public boolean m(long j10) {
        return p(this.f139783a, j10);
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
        return E(this.f139783a);
    }

    public <T> T[] toArray(T[] tArr) {
        C17542s.j(tArr, "array");
        return C17534j.b(this, tArr);
    }
}
