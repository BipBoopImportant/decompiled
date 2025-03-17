package wh;

import M6.n;
import YH.C16877v;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lwh/e;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "STANDARD", "STANDARD_RD", "EXPRESS", "EXPRESS_RD", "CURBSIDE", "CURBSIDE_RD", "EXPRESS_CURBSIDE", "EXPRESS_CURBSIDE_RD", "LOCKER", "UNKNOWN__", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wh.e  reason: case insensitive filesystem */
public enum C10374e {
    STANDARD("STANDARD"),
    STANDARD_RD("STANDARD_RD"),
    EXPRESS("EXPRESS"),
    EXPRESS_RD("EXPRESS_RD"),
    CURBSIDE("CURBSIDE"),
    CURBSIDE_RD("CURBSIDE_RD"),
    EXPRESS_CURBSIDE("EXPRESS_CURBSIDE"),
    EXPRESS_CURBSIDE_RD("EXPRESS_CURBSIDE_RD"),
    LOCKER("LOCKER"),
    UNKNOWN__("UNKNOWN__");
    
    public static final a Companion = null;
    private static final n type = null;
    private final String rawValue;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwh/e$a;", "", "<init>", "()V", "", "rawValue", "Lwh/e;", "a", "(Ljava/lang/String;)Lwh/e;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wh.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C10374e a(String str) {
            C10374e eVar;
            C17542s.j(str, "rawValue");
            C10374e[] values = C10374e.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    eVar = null;
                    break;
                }
                eVar = values[i10];
                if (C17542s.e(eVar.b(), str)) {
                    break;
                }
                i10++;
            }
            return eVar == null ? C10374e.UNKNOWN__ : eVar;
        }

        private a() {
        }
    }

    static {
        C10374e[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
        type = new n("DeliveryServiceFullfillmentServiceType", C16877v.q("STANDARD", "STANDARD_RD", "EXPRESS", "EXPRESS_RD", "CURBSIDE", "CURBSIDE_RD", "EXPRESS_CURBSIDE", "EXPRESS_CURBSIDE_RD", "LOCKER"));
    }

    private C10374e(String str) {
        this.rawValue = str;
    }

    public final String b() {
        return this.rawValue;
    }
}
