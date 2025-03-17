package y5;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17604b;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u0006*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0001\u0001\b¨\u0006\t"}, d2 = {"Ly5/b;", "T", "", "getValue", "()Ljava/lang/Object;", "value", "a", "b", "Ly5/b$b;", "runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y5.b  reason: case insensitive filesystem */
public interface C8979b<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f57830a = a.f57831a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Ly5/b$a;", "", "<init>", "()V", "Ly5/b$b;", "LXH/N;", "b", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "Unit", "runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y5.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f57831a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Object f57832b = C0933b.b(C16807N.f139792a);

        private a() {
        }

        public final Object a() {
            return f57832b;
        }
    }

    @C17604b
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b@\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00028\u00018\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0001\u0003\u0001\u00028\u0001¨\u0006\u0014"}, d2 = {"Ly5/b$b;", "T", "Ly5/b;", "value", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "e", "(Ljava/lang/Object;)Ljava/lang/String;", "", "d", "(Ljava/lang/Object;)I", "", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y5.b$b  reason: collision with other inner class name */
    public static final class C0933b<T> implements C8979b<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T f57833b;

        private /* synthetic */ C0933b(Object obj) {
            this.f57833b = obj;
        }

        public static final /* synthetic */ C0933b a(Object obj) {
            return new C0933b(obj);
        }

        public static <T> Object b(T t10) {
            return t10;
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof C0933b) && C17542s.e(obj, ((C0933b) obj2).f());
        }

        public static int d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static String e(Object obj) {
            return "Value(value=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return c(this.f57833b, obj);
        }

        public final /* synthetic */ Object f() {
            return this.f57833b;
        }

        public T getValue() {
            return this.f57833b;
        }

        public int hashCode() {
            return d(this.f57833b);
        }

        public String toString() {
            return e(this.f57833b);
        }
    }

    T getValue();
}
