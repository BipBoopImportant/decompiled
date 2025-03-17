package VH;

import YH.X;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001b"}, d2 = {"LVH/a;", "", "", "code", "", "message", "<init>", "(SLjava/lang/String;)V", "LVH/a$a;", "(LVH/a$a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "S", "()S", "b", "Ljava/lang/String;", "c", "()LVH/a$a;", "knownReason", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: VH.a  reason: case insensitive filesystem */
public final class C16654a {

    /* renamed from: a  reason: collision with root package name */
    private final short f139301a;

    /* renamed from: b  reason: collision with root package name */
    private final String f139302b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\n\n\u0002\b\u0015\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"LVH/a$a;", "", "", "code", "<init>", "(Ljava/lang/String;IS)V", "S", "j", "()S", "Companion", "a", "NORMAL", "GOING_AWAY", "PROTOCOL_ERROR", "CANNOT_ACCEPT", "CLOSED_ABNORMALLY", "NOT_CONSISTENT", "VIOLATED_POLICY", "TOO_BIG", "NO_EXTENSION", "INTERNAL_ERROR", "SERVICE_RESTART", "TRY_AGAIN_LATER", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: VH.a$a  reason: collision with other inner class name */
    public enum C3409a {
        NORMAL(1000),
        GOING_AWAY(1001),
        PROTOCOL_ERROR(1002),
        CANNOT_ACCEPT(1003),
        CLOSED_ABNORMALLY(1006),
        NOT_CONSISTENT(1007),
        VIOLATED_POLICY(1008),
        TOO_BIG(1009),
        NO_EXTENSION(1010),
        INTERNAL_ERROR(1011),
        SERVICE_RESTART(1012),
        TRY_AGAIN_LATER(1013);
        
        public static final C3410a Companion = null;
        public static final C3409a UNEXPECTED_CONDITION = null;
        /* access modifiers changed from: private */
        public static final Map<Short, C3409a> byCodeMap = null;
        private final short code;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LVH/a$a$a;", "", "<init>", "()V", "", "code", "LVH/a$a;", "a", "(S)LVH/a$a;", "", "byCodeMap", "Ljava/util/Map;", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: VH.a$a$a  reason: collision with other inner class name */
        public static final class C3410a {
            public /* synthetic */ C3410a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C3409a a(short s10) {
                return (C3409a) C3409a.byCodeMap.get(Short.valueOf(s10));
            }

            private C3410a() {
            }
        }

        static {
            int i10;
            Companion = new C3410a((DefaultConstructorMarker) null);
            C3409a[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(values.length), 16));
            for (C3409a aVar : values) {
                linkedHashMap.put(Short.valueOf(aVar.code), aVar);
            }
            byCodeMap = linkedHashMap;
            UNEXPECTED_CONDITION = INTERNAL_ERROR;
        }

        private C3409a(short s10) {
            this.code = s10;
        }

        public final short j() {
            return this.code;
        }
    }

    public C16654a(short s10, String str) {
        C17542s.j(str, "message");
        this.f139301a = s10;
        this.f139302b = str;
    }

    public final short a() {
        return this.f139301a;
    }

    public final C3409a b() {
        return C3409a.Companion.a(this.f139301a);
    }

    public final String c() {
        return this.f139302b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16654a)) {
            return false;
        }
        C16654a aVar = (C16654a) obj;
        return this.f139301a == aVar.f139301a && C17542s.e(this.f139302b, aVar.f139302b);
    }

    public int hashCode() {
        return (Short.hashCode(this.f139301a) * 31) + this.f139302b.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CloseReason(reason=");
        Object b10 = b();
        if (b10 == null) {
            b10 = Short.valueOf(this.f139301a);
        }
        sb2.append(b10);
        sb2.append(", message=");
        sb2.append(this.f139302b);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C16654a(C3409a aVar, String str) {
        this(aVar.j(), str);
        C17542s.j(aVar, "code");
        C17542s.j(str, "message");
    }
}
