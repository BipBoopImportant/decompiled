package Ht;

import fI.C17220a;
import fI.C17221b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"LHt/h;", "", "", "action", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "OPEN_STORE_PAGE", "OPEN_STORE_MAP", "OPEN_SCANNER_FROM_SHORTCUT", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum h {
    OPEN_STORE_PAGE("store_page"),
    OPEN_STORE_MAP("store_map"),
    OPEN_SCANNER_FROM_SHORTCUT("scanner_from_shortcut");
    
    public static final a Companion = null;
    private final String action;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LHt/h$a;", "", "<init>", "()V", "", "value", "LHt/h;", "a", "(Ljava/lang/String;)LHt/h;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(String str) {
            T t10;
            Iterator<T> it = h.j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (C17542s.e(((h) t10).b(), str)) {
                    break;
                }
            }
            h hVar = (h) t10;
            return hVar == null ? h.OPEN_STORE_PAGE : hVar;
        }

        private a() {
        }
    }

    static {
        h[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }

    private h(String str) {
        this.action = str;
    }

    public static C17220a<h> j() {
        return $ENTRIES;
    }

    public final String b() {
        return this.action;
    }
}
