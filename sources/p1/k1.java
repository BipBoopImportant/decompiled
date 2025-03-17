package p1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0001\u0003\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Lp1/k1;", "", "", "value", "e", "(I)I", "", "i", "(I)Ljava/lang/String;", "h", "other", "", "f", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
public final class k1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f27320b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f27321c = e(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f27322d = e(1);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f27323e = e(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f27324a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lp1/k1$a;", "", "<init>", "()V", "Lp1/k1;", "Butt", "I", "a", "()I", "Round", "b", "Square", "c", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return k1.f27321c;
        }

        public final int b() {
            return k1.f27322d;
        }

        public final int c() {
            return k1.f27323e;
        }

        private a() {
        }
    }

    private /* synthetic */ k1(int i10) {
        this.f27324a = i10;
    }

    public static final /* synthetic */ k1 d(int i10) {
        return new k1(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof k1) && i10 == ((k1) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        return g(i10, f27321c) ? "Butt" : g(i10, f27322d) ? "Round" : g(i10, f27323e) ? "Square" : "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.f27324a, obj);
    }

    public int hashCode() {
        return h(this.f27324a);
    }

    public final /* synthetic */ int j() {
        return this.f27324a;
    }

    public String toString() {
        return i(this.f27324a);
    }
}
