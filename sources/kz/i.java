package kz;

import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.a0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\tJ4\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkz/i;", "", "", "storeId", "listId", "", "", "quantityInCardMap", "Lkz/i$a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface i {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lkz/i$a;", "", "a", "c", "b", "Lkz/i$a$a;", "Lkz/i$a$b;", "Lkz/i$a$c;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkz/i$a$a;", "Lkz/i$a;", "Lrz/a0;", "products", "<init>", "(Lrz/a0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrz/a0;", "()Lrz/a0;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: kz.i$a$a  reason: collision with other inner class name */
        public static final class C3174a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final a0 f128888a;

            public C3174a(a0 a0Var) {
                C17542s.j(a0Var, "products");
                this.f128888a = a0Var;
            }

            public final a0 a() {
                return this.f128888a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3174a) && C17542s.e(this.f128888a, ((C3174a) obj).f128888a);
            }

            public int hashCode() {
                return this.f128888a.hashCode();
            }

            public String toString() {
                a0 a0Var = this.f128888a;
                return "Success(products=" + a0Var + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkz/i$a$b;", "Lkz/i$a;", "<init>", "()V", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f128889a = new b();

            private b() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkz/i$a$c;", "Lkz/i$a;", "<init>", "()V", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f128890a = new c();

            private c() {
            }
        }
    }

    Object a(String str, String str2, Map<String, Integer> map, C17164e<? super a> eVar);
}
