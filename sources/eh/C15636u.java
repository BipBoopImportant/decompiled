package EH;

import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0013"}, d2 = {"LEH/u;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.u  reason: case insensitive filesystem */
public final class C15636u {

    /* renamed from: b  reason: collision with root package name */
    public static final a f134140b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C15636u f134141c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C15636u f134142d;

    /* renamed from: e  reason: collision with root package name */
    private static final C15636u f134143e;

    /* renamed from: f  reason: collision with root package name */
    private static final C15636u f134144f;

    /* renamed from: g  reason: collision with root package name */
    private static final C15636u f134145g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final C15636u f134146h;

    /* renamed from: i  reason: collision with root package name */
    private static final C15636u f134147i;

    /* renamed from: j  reason: collision with root package name */
    private static final List<C15636u> f134148j;

    /* renamed from: a  reason: collision with root package name */
    private final String f134149a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"LEH/u$a;", "", "<init>", "()V", "LEH/u;", "Get", "LEH/u;", "a", "()LEH/u;", "Post", "c", "Head", "b", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: EH.u$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C15636u a() {
            return C15636u.f134141c;
        }

        public final C15636u b() {
            return C15636u.f134146h;
        }

        public final C15636u c() {
            return C15636u.f134142d;
        }

        private a() {
        }
    }

    static {
        C15636u uVar = new C15636u("GET");
        f134141c = uVar;
        C15636u uVar2 = new C15636u("POST");
        f134142d = uVar2;
        C15636u uVar3 = new C15636u("PUT");
        f134143e = uVar3;
        C15636u uVar4 = new C15636u("PATCH");
        f134144f = uVar4;
        C15636u uVar5 = new C15636u("DELETE");
        f134145g = uVar5;
        C15636u uVar6 = new C15636u("HEAD");
        f134146h = uVar6;
        C15636u uVar7 = new C15636u("OPTIONS");
        f134147i = uVar7;
        f134148j = C16877v.q(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7);
    }

    public C15636u(String str) {
        C17542s.j(str, "value");
        this.f134149a = str;
    }

    public final String d() {
        return this.f134149a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15636u) && C17542s.e(this.f134149a, ((C15636u) obj).f134149a);
    }

    public int hashCode() {
        return this.f134149a.hashCode();
    }

    public String toString() {
        return "HttpMethod(value=" + this.f134149a + ')';
    }
}
