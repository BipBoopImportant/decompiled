package EH;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\f¨\u0006\u001a"}, d2 = {"LEH/v;", "", "", "name", "", "major", "minor", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "I", "getMajor", "c", "getMinor", "d", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.v  reason: case insensitive filesystem */
public final class C15637v {

    /* renamed from: d  reason: collision with root package name */
    public static final a f134150d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C15637v f134151e = new C15637v("HTTP", 2, 0);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C15637v f134152f = new C15637v("HTTP", 1, 1);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C15637v f134153g = new C15637v("HTTP", 1, 0);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final C15637v f134154h = new C15637v("SPDY", 3, 0);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final C15637v f134155i = new C15637v("QUIC", 1, 0);

    /* renamed from: a  reason: collision with root package name */
    private final String f134156a;

    /* renamed from: b  reason: collision with root package name */
    private final int f134157b;

    /* renamed from: c  reason: collision with root package name */
    private final int f134158c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"LEH/v$a;", "", "<init>", "()V", "LEH/v;", "HTTP_2_0", "LEH/v;", "c", "()LEH/v;", "HTTP_1_1", "b", "HTTP_1_0", "a", "SPDY_3", "e", "QUIC", "d", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: EH.v$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C15637v a() {
            return C15637v.f134153g;
        }

        public final C15637v b() {
            return C15637v.f134152f;
        }

        public final C15637v c() {
            return C15637v.f134151e;
        }

        public final C15637v d() {
            return C15637v.f134155i;
        }

        public final C15637v e() {
            return C15637v.f134154h;
        }

        private a() {
        }
    }

    public C15637v(String str, int i10, int i11) {
        C17542s.j(str, "name");
        this.f134156a = str;
        this.f134157b = i10;
        this.f134158c = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15637v)) {
            return false;
        }
        C15637v vVar = (C15637v) obj;
        return C17542s.e(this.f134156a, vVar.f134156a) && this.f134157b == vVar.f134157b && this.f134158c == vVar.f134158c;
    }

    public int hashCode() {
        return (((this.f134156a.hashCode() * 31) + Integer.hashCode(this.f134157b)) * 31) + Integer.hashCode(this.f134158c);
    }

    public String toString() {
        return this.f134156a + '/' + this.f134157b + '.' + this.f134158c;
    }
}
