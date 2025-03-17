package D5;

import L5.c;
import N5.h;
import android.graphics.ColorSpace;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"LD5/a;", "a", "LD5/a;", "()LD5/a;", "DefaultModelEqualityDelegate", "coil-compose-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final a f34467a = new a();

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"D5/b$a", "LD5/a;", "", "self", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "b", "(Ljava/lang/Object;)I", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements a {
        a() {
        }

        public int b(Object obj) {
            int i10 = 0;
            if (obj instanceof h) {
                h hVar = (h) obj;
                int hashCode = ((hVar.l().hashCode() * 31) + hVar.m().hashCode()) * 31;
                c.b G10 = hVar.G();
                int hashCode2 = (hashCode + (G10 != null ? G10.hashCode() : 0)) * 31;
                c.b B10 = hVar.B();
                int hashCode3 = (hashCode2 + (B10 != null ? B10.hashCode() : 0)) * 31;
                String r10 = hVar.r();
                int hashCode4 = (((hashCode3 + (r10 != null ? r10.hashCode() : 0)) * 31) + hVar.j().hashCode()) * 31;
                ColorSpace k10 = hVar.k();
                if (k10 != null) {
                    i10 = k10.hashCode();
                }
                return ((((((((((((((((((((((((((hashCode4 + i10) * 31) + hVar.O().hashCode()) * 31) + hVar.x().hashCode()) * 31) + Boolean.hashCode(hVar.g())) * 31) + Boolean.hashCode(hVar.h())) * 31) + Boolean.hashCode(hVar.i())) * 31) + Boolean.hashCode(hVar.I())) * 31) + hVar.C().hashCode()) * 31) + hVar.s().hashCode()) * 31) + hVar.D().hashCode()) * 31) + hVar.K().hashCode()) * 31) + hVar.J().hashCode()) * 31) + hVar.H().hashCode()) * 31) + hVar.E().hashCode();
            } else if (obj != null) {
                return obj.hashCode();
            } else {
                return 0;
            }
        }

        public boolean c(Object obj, Object obj2) {
            if (obj == obj2) {
                return true;
            }
            if (!(obj instanceof h) || !(obj2 instanceof h)) {
                return C17542s.e(obj, obj2);
            }
            h hVar = (h) obj;
            h hVar2 = (h) obj2;
            return C17542s.e(hVar.l(), hVar2.l()) && C17542s.e(hVar.m(), hVar2.m()) && C17542s.e(hVar.G(), hVar2.G()) && C17542s.e(hVar.B(), hVar2.B()) && C17542s.e(hVar.r(), hVar2.r()) && hVar.j() == hVar2.j() && C17542s.e(hVar.k(), hVar2.k()) && C17542s.e(hVar.O(), hVar2.O()) && C17542s.e(hVar.x(), hVar2.x()) && hVar.g() == hVar2.g() && hVar.h() == hVar2.h() && hVar.i() == hVar2.i() && hVar.I() == hVar2.I() && hVar.C() == hVar2.C() && hVar.s() == hVar2.s() && hVar.D() == hVar2.D() && C17542s.e(hVar.K(), hVar2.K()) && hVar.J() == hVar2.J() && hVar.H() == hVar2.H() && C17542s.e(hVar.E(), hVar2.E());
        }
    }

    public static final a a() {
        return f34467a;
    }
}
