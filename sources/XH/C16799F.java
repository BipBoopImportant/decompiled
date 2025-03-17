package XH;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@C17604b
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b@\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013\u0001\u0003\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"LXH/F;", "", "", "data", "b", "(I)I", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "n", "(I)Ljava/lang/String;", "a", "I", "getData$annotations", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: XH.F  reason: case insensitive filesystem */
public final class C16799F implements Comparable<C16799F> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f139776b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f139777a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"LXH/F$a;", "", "<init>", "()V", "LXH/F;", "MIN_VALUE", "I", "MAX_VALUE", "", "SIZE_BYTES", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: XH.F$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ C16799F(int i10) {
        this.f139777a = i10;
    }

    public static final /* synthetic */ C16799F a(int i10) {
        return new C16799F(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean j(int i10, Object obj) {
        return (obj instanceof C16799F) && i10 == ((C16799F) obj).v();
    }

    public static int m(int i10) {
        return Integer.hashCode(i10);
    }

    public static String n(int i10) {
        return String.valueOf(((long) i10) & 4294967295L);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C16809P.a(v(), ((C16799F) obj).v());
    }

    public boolean equals(Object obj) {
        return j(this.f139777a, obj);
    }

    public int hashCode() {
        return m(this.f139777a);
    }

    public String toString() {
        return n(this.f139777a);
    }

    public final /* synthetic */ int v() {
        return this.f139777a;
    }
}
