package Hx;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"LHx/f;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "ORDER", "RECEIPT", "RETURN", "UNKNOWN", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum f {
    ORDER("ORDER"),
    RECEIPT("RECEIPT"),
    RETURN("RETURN"),
    UNKNOWN("UNKNOWN");
    
    public static final a Companion = null;
    private final String rawValue;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LHx/f$a;", "", "<init>", "()V", "", "value", "LHx/f;", "a", "(Ljava/lang/String;)LHx/f;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(String str) {
            C17542s.j(str, "value");
            f fVar = f.ORDER;
            if (!C17542s.e(str, fVar.b())) {
                fVar = f.RECEIPT;
                if (!C17542s.e(str, fVar.b())) {
                    fVar = f.RETURN;
                    if (!C17542s.e(str, fVar.b())) {
                        fVar = f.UNKNOWN;
                        if (!C17542s.e(str, fVar.b())) {
                            throw new IllegalArgumentException("Unknown value: " + str);
                        }
                    }
                }
            }
            return fVar;
        }

        private a() {
        }
    }

    static {
        f[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }

    private f(String str) {
        this.rawValue = str;
    }

    public final String b() {
        return this.rawValue;
    }
}
