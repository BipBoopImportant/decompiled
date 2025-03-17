package a9;

import com.contentsquare.android.sdk.C7153u;
import java.util.List;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.z3  reason: case insensitive filesystem */
public abstract class C6984z3 {

    /* renamed from: a9.z3$a */
    public static final class a extends C6984z3 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f42983a = new a();
    }

    /* renamed from: a9.z3$b */
    public static final class b extends C6984z3 {

        /* renamed from: a  reason: collision with root package name */
        public final List<C7153u> f42984a;

        public b(List<C7153u> list) {
            C17542s.j(list, "children");
            this.f42984a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f42984a, ((b) obj).f42984a);
        }

        public final int hashCode() {
            return this.f42984a.hashCode();
        }

        public final String toString() {
            return "ScreenGraphNodes(children=" + this.f42984a + ')';
        }
    }
}
