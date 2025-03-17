package Oq;

import fI.C17220a;
import fI.C17221b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"LOq/a;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "DELIVERY", "DRINK", "COLLECT", "REMOVAL", "DISCOUNT", "FOOD", "DESIGN", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum a {
    DELIVERY("DELIVERY"),
    DRINK("DRINK"),
    COLLECT("COLLECT"),
    REMOVAL("REMOVAL"),
    DISCOUNT("DISCOUNT"),
    FOOD("FOOD"),
    DESIGN("DESIGN");
    
    public static final C1722a Companion = null;
    private final String rawValue;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LOq/a$a;", "", "<init>", "()V", "", "string", "LOq/a;", "a", "(Ljava/lang/String;)LOq/a;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Oq.a$a  reason: collision with other inner class name */
    public static final class C1722a {
        public /* synthetic */ C1722a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String str) {
            T t10;
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
            return (a) t10;
        }

        private C1722a() {
        }
    }

    static {
        a[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new C1722a((DefaultConstructorMarker) null);
    }

    private a(String str) {
        this.rawValue = str;
    }

    public static C17220a<a> b() {
        return $ENTRIES;
    }

    public final String j() {
        return this.rawValue;
    }
}
