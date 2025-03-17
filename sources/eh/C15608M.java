package EH;

import JH.C15953A;
import JH.j;
import YH.C16877v;
import YH.X;
import com.adjust.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"LEH/M;", "", "", "name", "", "defaultPort", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "I", "c", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.M  reason: case insensitive filesystem */
public final class C15608M {

    /* renamed from: c  reason: collision with root package name */
    public static final a f133938c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C15608M f133939d;

    /* renamed from: e  reason: collision with root package name */
    private static final C15608M f133940e;

    /* renamed from: f  reason: collision with root package name */
    private static final C15608M f133941f;

    /* renamed from: g  reason: collision with root package name */
    private static final C15608M f133942g;

    /* renamed from: h  reason: collision with root package name */
    private static final C15608M f133943h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final Map<String, C15608M> f133944i;

    /* renamed from: a  reason: collision with root package name */
    private final String f133945a;

    /* renamed from: b  reason: collision with root package name */
    private final int f133946b;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LEH/M$a;", "", "<init>", "()V", "", "name", "LEH/M;", "a", "(Ljava/lang/String;)LEH/M;", "HTTP", "LEH/M;", "c", "()LEH/M;", "", "byName", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: EH.M$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C15608M a(String str) {
            C17542s.j(str, "name");
            String c10 = C15953A.c(str);
            C15608M m10 = C15608M.f133938c.b().get(c10);
            return m10 == null ? new C15608M(c10, 0) : m10;
        }

        public final Map<String, C15608M> b() {
            return C15608M.f133944i;
        }

        public final C15608M c() {
            return C15608M.f133939d;
        }

        private a() {
        }
    }

    static {
        C15608M m10 = new C15608M("http", 80);
        f133939d = m10;
        C15608M m11 = new C15608M(Constants.SCHEME, 443);
        f133940e = m11;
        C15608M m12 = new C15608M("ws", 80);
        f133941f = m12;
        C15608M m13 = new C15608M("wss", 443);
        f133942g = m13;
        C15608M m14 = new C15608M("socks", 1080);
        f133943h = m14;
        Iterable q10 = C16877v.q(m10, m11, m12, m13, m14);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(q10, 10)), 16));
        for (Object next : q10) {
            linkedHashMap.put(((C15608M) next).f133945a, next);
        }
        f133944i = linkedHashMap;
    }

    public C15608M(String str, int i10) {
        C17542s.j(str, "name");
        this.f133945a = str;
        this.f133946b = i10;
        int i11 = 0;
        while (i11 < str.length()) {
            if (j.a(str.charAt(i11))) {
                i11++;
            } else {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public final int c() {
        return this.f133946b;
    }

    public final String d() {
        return this.f133945a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15608M)) {
            return false;
        }
        C15608M m10 = (C15608M) obj;
        return C17542s.e(this.f133945a, m10.f133945a) && this.f133946b == m10.f133946b;
    }

    public int hashCode() {
        return (this.f133945a.hashCode() * 31) + Integer.hashCode(this.f133946b);
    }

    public String toString() {
        return "URLProtocol(name=" + this.f133945a + ", defaultPort=" + this.f133946b + ')';
    }
}
