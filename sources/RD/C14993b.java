package rD;

import fI.C17220a;
import fI.C17221b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"LrD/b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "PUBLISHED", "ORDER_RECEIVED_WAITING_FOR_PAYMENT", "ORDER_RECEIVED", "STARTED", "COMPLETED", "CANCELLED", "CANCELLED_NO_SHOW", "NO_SHOW", "UNKNOWN", "userappointments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rD.b  reason: case insensitive filesystem */
public enum C14993b {
    PUBLISHED("PUBLISHED"),
    ORDER_RECEIVED_WAITING_FOR_PAYMENT("ORDER_RECEIVED_WAITING_FOR_PAYMENT"),
    ORDER_RECEIVED("ORDER_RECEIVED"),
    STARTED("STARTED"),
    COMPLETED("COMPLETED"),
    CANCELLED("CANCELLED"),
    CANCELLED_NO_SHOW("CANCELLED_NO_SHOW"),
    NO_SHOW("NO_SHOW"),
    UNKNOWN("UNKNOWN");
    
    public static final a Companion = null;
    private final String value;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LrD/b$a;", "", "<init>", "()V", "", "value", "LrD/b;", "a", "(Ljava/lang/String;)LrD/b;", "userappointments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rD.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C14993b a(String str) {
            T t10;
            C17542s.j(str, "value");
            Iterator<T> it = C14993b.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (C17542s.e(((C14993b) t10).j(), str)) {
                    break;
                }
            }
            C14993b bVar = (C14993b) t10;
            return bVar == null ? C14993b.UNKNOWN : bVar;
        }

        private a() {
        }
    }

    static {
        C14993b[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }

    private C14993b(String str) {
        this.value = str;
    }

    public static C17220a<C14993b> b() {
        return $ENTRIES;
    }

    public final String j() {
        return this.value;
    }
}
