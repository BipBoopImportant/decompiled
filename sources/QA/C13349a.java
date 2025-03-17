package QA;

import fI.C17220a;
import fI.C17221b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LQA/a;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "ONLINE", "STORE", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QA.a  reason: case insensitive filesystem */
public enum C13349a {
    ONLINE,
    STORE;
    
    public static final C2815a Companion = null;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LQA/a$a;", "", "<init>", "()V", "", "value", "LQA/a;", "a", "(Ljava/lang/String;)LQA/a;", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QA.a$a  reason: collision with other inner class name */
    public static final class C2815a {
        public /* synthetic */ C2815a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C13349a a(String str) {
            T t10;
            Iterator<T> it = C13349a.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (C17542s.e(((C13349a) t10).name(), str)) {
                    break;
                }
            }
            C13349a aVar = (C13349a) t10;
            return aVar == null ? C13349a.ONLINE : aVar;
        }

        private C2815a() {
        }
    }

    static {
        C13349a[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new C2815a((DefaultConstructorMarker) null);
    }

    public static C17220a<C13349a> b() {
        return $ENTRIES;
    }
}
