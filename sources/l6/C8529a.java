package l6;

import kotlin.Metadata;
import mI.C17604b;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Ll6/a;", "", "a", "b", "Ll6/a$a;", "Ll6/a$b;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: l6.a  reason: case insensitive filesystem */
public interface C8529a {

    @C17604b
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n\u0001\u0003\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Ll6/a$a;", "Ll6/a;", "", "px", "b", "(I)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getPx", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: l6.a$a  reason: collision with other inner class name */
    public static final class C0868a implements C8529a {

        /* renamed from: a  reason: collision with root package name */
        private final int f54760a;

        private /* synthetic */ C0868a(int i10) {
            this.f54760a = i10;
        }

        public static final /* synthetic */ C0868a a(int i10) {
            return new C0868a(i10);
        }

        public static int b(int i10) {
            if (i10 > 0) {
                return i10;
            }
            throw new IllegalArgumentException("px must be > 0.");
        }

        public static boolean c(int i10, Object obj) {
            return (obj instanceof C0868a) && i10 == ((C0868a) obj).f();
        }

        public static int d(int i10) {
            return Integer.hashCode(i10);
        }

        public static String e(int i10) {
            return "Pixels(px=" + i10 + ')';
        }

        public boolean equals(Object obj) {
            return c(this.f54760a, obj);
        }

        public final /* synthetic */ int f() {
            return this.f54760a;
        }

        public int hashCode() {
            return d(this.f54760a);
        }

        public String toString() {
            return e(this.f54760a);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll6/a$b;", "Ll6/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: l6.a$b */
    public static final class b implements C8529a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f54761a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -2093724603;
        }

        public String toString() {
            return "Undefined";
        }
    }
}
