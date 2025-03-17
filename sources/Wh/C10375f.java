package wh;

import M6.n;
import YH.C16877v;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lwh/f;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "HOME_DELIVERY", "PUP", "PUOP", "CLICK_COLLECT", "CLICK_COLLECT_STORE", "LOCKER", "UNKNOWN__", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wh.f  reason: case insensitive filesystem */
public enum C10375f {
    HOME_DELIVERY("HOME_DELIVERY"),
    PUP("PUP"),
    PUOP("PUOP"),
    CLICK_COLLECT("CLICK_COLLECT"),
    CLICK_COLLECT_STORE("CLICK_COLLECT_STORE"),
    LOCKER("LOCKER"),
    UNKNOWN__("UNKNOWN__");
    
    public static final a Companion = null;
    private static final n type = null;
    private final String rawValue;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwh/f$a;", "", "<init>", "()V", "", "rawValue", "Lwh/f;", "a", "(Ljava/lang/String;)Lwh/f;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wh.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C10375f a(String str) {
            C10375f fVar;
            C17542s.j(str, "rawValue");
            C10375f[] values = C10375f.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    fVar = null;
                    break;
                }
                fVar = values[i10];
                if (C17542s.e(fVar.b(), str)) {
                    break;
                }
                i10++;
            }
            return fVar == null ? C10375f.UNKNOWN__ : fVar;
        }

        private a() {
        }
    }

    static {
        C10375f[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
        type = new n("DeliveryServiceFullfillmentType", C16877v.q("HOME_DELIVERY", "PUP", "PUOP", "CLICK_COLLECT", "CLICK_COLLECT_STORE", "LOCKER"));
    }

    private C10375f(String str) {
        this.rawValue = str;
    }

    public final String b() {
        return this.rawValue;
    }
}
