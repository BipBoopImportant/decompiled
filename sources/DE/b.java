package De;

import HJ.C15854t;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17604b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0001\u0003\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"LDe/b;", "LDe/a;", "", "value", "b", "(Ljava/lang/String;)Ljava/lang/String;", "e", "", "d", "(Ljava/lang/String;)I", "", "other", "", "c", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C17604b
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final String f59156a;

    private /* synthetic */ b(String str) {
        this.f59156a = str;
    }

    public static final /* synthetic */ b a(String str) {
        return new b(str);
    }

    public static String b(String str) {
        C17542s.j(str, "value");
        if (C15854t.v0(str)) {
            b a10 = a(str);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str + " should not be an empty string");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a11 = C11818a.a((String) null, illegalArgumentException);
                    if (a11 == null) {
                        break;
                    }
                    str2 = C11820c.a(a11);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = a10.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalArgumentException, str4);
                str2 = str4;
                str3 = str5;
            }
        }
        return str;
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof b) && C17542s.e(str, ((b) obj).f());
    }

    public static int d(String str) {
        return str.hashCode();
    }

    public static String e(String str) {
        return "AnalyticsComponentImpl(value=" + str + ")";
    }

    public boolean equals(Object obj) {
        return c(this.f59156a, obj);
    }

    public final /* synthetic */ String f() {
        return this.f59156a;
    }

    public String getValue() {
        return this.f59156a;
    }

    public int hashCode() {
        return d(this.f59156a);
    }

    public String toString() {
        return e(this.f59156a);
    }
}
