package U5;

import k6.C8441h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u0005J#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"LU5/c;", "", "self", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "b", "(Ljava/lang/Object;)I", "a", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c {

    /* renamed from: a  reason: collision with root package name */
    public static final C0657c f40185a = C0657c.f40188a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f40186b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final c f40187c = new a();

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"U5/c$a", "LU5/c;", "", "self", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "b", "(Ljava/lang/Object;)I", "", "toString", "()Ljava/lang/String;", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements c {
        a() {
        }

        public int b(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean c(Object obj, Object obj2) {
            return C17542s.e(obj, obj2);
        }

        public String toString() {
            return "AsyncImageModelEqualityDelegate.AllProperties";
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"U5/c$b", "LU5/c;", "", "self", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "b", "(Ljava/lang/Object;)I", "", "toString", "()Ljava/lang/String;", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements c {
        b() {
        }

        public int b(Object obj) {
            int i10 = 0;
            if (obj instanceof C8441h) {
                C8441h hVar = (C8441h) obj;
                int hashCode = ((hVar.c().hashCode() * 31) + hVar.d().hashCode()) * 31;
                String q10 = hVar.q();
                int hashCode2 = (((hashCode + (q10 != null ? q10.hashCode() : 0)) * 31) + hVar.r().hashCode()) * 31;
                String i11 = hVar.i();
                if (i11 != null) {
                    i10 = i11.hashCode();
                }
                return ((((((hashCode2 + i10) * 31) + hVar.x().hashCode()) * 31) + hVar.w().hashCode()) * 31) + hVar.v().hashCode();
            } else if (obj != null) {
                return obj.hashCode();
            } else {
                return 0;
            }
        }

        public boolean c(Object obj, Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj instanceof C8441h) || !(obj2 instanceof C8441h)) {
                return C17542s.e(obj, obj2);
            }
            C8441h hVar = (C8441h) obj;
            C8441h hVar2 = (C8441h) obj2;
            return C17542s.e(hVar.c(), hVar2.c()) && C17542s.e(hVar.d(), hVar2.d()) && C17542s.e(hVar.q(), hVar2.q()) && C17542s.e(hVar.r(), hVar2.r()) && C17542s.e(hVar.i(), hVar2.i()) && C17542s.e(hVar.x(), hVar2.x()) && hVar.w() == hVar2.w() && hVar.v() == hVar2.v();
        }

        public String toString() {
            return "AsyncImageModelEqualityDelegate.Default";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001R\u0017\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\u0001¨\u0006\b"}, d2 = {"LU5/c$c;", "", "<init>", "()V", "LU5/c;", "Default", "LU5/c;", "AllProperties", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: U5.c$c  reason: collision with other inner class name */
    public static final class C0657c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0657c f40188a = new C0657c();

        private C0657c() {
        }
    }

    int b(Object obj);

    boolean c(Object obj, Object obj2);
}
