package x1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0001\u0003\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Lx1/a;", "", "", "value", "d", "(I)I", "", "h", "(I)Ljava/lang/String;", "g", "other", "", "e", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
/* renamed from: x1.a  reason: case insensitive filesystem */
public final class C6240a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0491a f31827b = new C0491a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f31828c = d(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f31829d = d(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f31830a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Lx1/a$a;", "", "<init>", "()V", "Lx1/a;", "Touch", "I", "b", "()I", "Keyboard", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x1.a$a  reason: collision with other inner class name */
    public static final class C0491a {
        public /* synthetic */ C0491a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C6240a.f31829d;
        }

        public final int b() {
            return C6240a.f31828c;
        }

        private C0491a() {
        }
    }

    private /* synthetic */ C6240a(int i10) {
        this.f31830a = i10;
    }

    public static final /* synthetic */ C6240a c(int i10) {
        return new C6240a(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof C6240a) && i10 == ((C6240a) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return f(i10, f31828c) ? "Touch" : f(i10, f31829d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return e(this.f31830a, obj);
    }

    public int hashCode() {
        return g(this.f31830a);
    }

    public final /* synthetic */ int i() {
        return this.f31830a;
    }

    public String toString() {
        return h(this.f31830a);
    }
}
