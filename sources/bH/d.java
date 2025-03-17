package Bh;

import M6.n;
import YH.C16877v;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"LBh/d;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "AREA", "METERWARE", "MULTIPACK", "PIECE", "VOLUME", "WEIGHT", "WEIGHTWARE", "UNKNOWN__", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum d {
    AREA("AREA"),
    METERWARE("METERWARE"),
    MULTIPACK("MULTIPACK"),
    PIECE("PIECE"),
    VOLUME("VOLUME"),
    WEIGHT("WEIGHT"),
    WEIGHTWARE("WEIGHTWARE"),
    UNKNOWN__("UNKNOWN__");
    
    public static final a Companion = null;
    private static final n type = null;
    private final String rawValue;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LBh/d$a;", "", "<init>", "()V", "", "rawValue", "LBh/d;", "a", "(Ljava/lang/String;)LBh/d;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(String str) {
            d dVar;
            C17542s.j(str, "rawValue");
            d[] values = d.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    dVar = null;
                    break;
                }
                dVar = values[i10];
                if (C17542s.e(dVar.b(), str)) {
                    break;
                }
                i10++;
            }
            return dVar == null ? d.UNKNOWN__ : dVar;
        }

        private a() {
        }
    }

    static {
        d[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
        type = new n("UnitType", C16877v.q("AREA", "METERWARE", "MULTIPACK", "PIECE", "VOLUME", "WEIGHT", "WEIGHTWARE"));
    }

    private d(String str) {
        this.rawValue = str;
    }

    public final String b() {
        return this.rawValue;
    }
}
