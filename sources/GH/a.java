package Gh;

import fI.C17220a;
import fI.C17221b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"LGh/a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "CIRCLE", "HOUSE", "HALF_PILL", "SQUARE", "UNKNOWN", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum a {
    CIRCLE("CIRCLE"),
    HOUSE("HOUSE"),
    HALF_PILL("HALF_PILL"),
    SQUARE("SQUARE"),
    UNKNOWN("UNKNOWN");
    
    public static final C0997a Companion = null;
    private final String value;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LGh/a$a;", "", "<init>", "()V", "", "value", "LGh/a;", "a", "(Ljava/lang/String;)LGh/a;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Gh.a$a  reason: collision with other inner class name */
    public static final class C0997a {
        public /* synthetic */ C0997a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String str) {
            T t10;
            C17542s.j(str, "value");
            Iterator<T> it = a.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (C17542s.e(((a) t10).j(), str)) {
                    break;
                }
            }
            a aVar = (a) t10;
            return aVar == null ? a.UNKNOWN : aVar;
        }

        private C0997a() {
        }
    }

    static {
        a[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new C0997a((DefaultConstructorMarker) null);
    }

    private a(String str) {
        this.value = str;
    }

    public static C17220a<a> b() {
        return $ENTRIES;
    }

    public final String j() {
        return this.value;
    }
}
