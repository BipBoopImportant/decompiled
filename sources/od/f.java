package Od;

import HJ.C15854t;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LOd/f;", "", "<init>", "()V", "LIE/f;", "decision", "LOd/f$a;", "a", "(LIE/f;)LOd/f$a;", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LOd/f$a;", "", "b", "a", "LOd/f$a$a;", "LOd/f$a$b;", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LOd/f$a$a;", "LOd/f$a;", "", "reason", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Od.f$a$a  reason: collision with other inner class name */
        public static final class C1054a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f62149a;

            public C1054a(String str) {
                C17542s.j(str, "reason");
                this.f62149a = str;
            }

            public final String a() {
                return this.f62149a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1054a) && C17542s.e(this.f62149a, ((C1054a) obj).f62149a);
            }

            public int hashCode() {
                return this.f62149a.hashCode();
            }

            public String toString() {
                String str = this.f62149a;
                return "Failure(reason=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"LOd/f$a$b;", "LOd/f$a;", "", "flagKey", "ruleKey", "variationKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f62150a;

            /* renamed from: b  reason: collision with root package name */
            private final String f62151b;

            /* renamed from: c  reason: collision with root package name */
            private final String f62152c;

            public b(String str, String str2, String str3) {
                C17542s.j(str, "flagKey");
                C17542s.j(str2, "ruleKey");
                C17542s.j(str3, "variationKey");
                this.f62150a = str;
                this.f62151b = str2;
                this.f62152c = str3;
            }

            public final String a() {
                return this.f62150a;
            }

            public final String b() {
                return this.f62151b;
            }

            public final String c() {
                return this.f62152c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f62150a, bVar.f62150a) && C17542s.e(this.f62151b, bVar.f62151b) && C17542s.e(this.f62152c, bVar.f62152c);
            }

            public int hashCode() {
                return (((this.f62150a.hashCode() * 31) + this.f62151b.hashCode()) * 31) + this.f62152c.hashCode();
            }

            public String toString() {
                String str = this.f62150a;
                String str2 = this.f62151b;
                String str3 = this.f62152c;
                return "Success(flagKey=" + str + ", ruleKey=" + str2 + ", variationKey=" + str3 + ")";
            }
        }
    }

    public final a a(IE.f fVar) {
        C17542s.j(fVar, "decision");
        String c10 = fVar.c();
        C17542s.i(c10, "getFlagKey(...)");
        String e10 = fVar.e();
        String h10 = fVar.h();
        if (h10 == null) {
            return new a.C1054a("No variant key available");
        }
        if (e10 == null) {
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("A/B test with flag " + c10 + " and variant " + h10 + " is missing a rule key", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = f.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
        }
        if (e10 == null) {
            e10 = "";
        }
        return new a.b(c10, e10, h10);
    }
}
