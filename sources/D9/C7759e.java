package d9;

import com.google.protobuf.GeneratedMessageLite;
import d9.C;
import java.util.Map;
import jd.C9899b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u000e\u001a\u00020\r*\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R$\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178G@GX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR#\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R$\u0010%\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178G@GX\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001b¨\u0006&"}, d2 = {"Ld9/e;", "", "Ld9/C$a;", "_builder", "<init>", "(Ld9/C$a;)V", "Ld9/C;", "a", "()Ld9/C;", "Ljd/b;", "", "", "map", "LXH/N;", "c", "(Ljd/b;Ljava/util/Map;)V", "Ld9/C$a;", "value", "getMessage", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "message", "", "getRelativeTime", "()J", "f", "(J)V", "relativeTime", "b", "()Ljd/b;", "customAttributes", "getErrorSource", "d", "errorSource", "getUnixTimestampMs", "g", "unixTimestampMs", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d9.e  reason: case insensitive filesystem */
public final class C7759e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50780b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C.a f50781a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld9/e$a;", "", "<init>", "()V", "Ld9/C$a;", "builder", "Ld9/e;", "a", "(Ld9/C$a;)Ld9/e;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d9.e$a */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ C7759e a(C.a aVar) {
            C17542s.j(aVar, "builder");
            return new C7759e(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C7759e(C.a aVar) {
        this.f50781a = aVar;
    }

    public final /* synthetic */ C a() {
        GeneratedMessageLite o10 = this.f50781a.g();
        C17542s.i(o10, "_builder.build()");
        return (C) o10;
    }

    public final /* synthetic */ C9899b b() {
        Map<String, String> E10 = this.f50781a.E();
        C17542s.i(E10, "_builder.getCustomAttributesMap()");
        return new C9899b(E10);
    }

    public final /* synthetic */ void c(C9899b bVar, Map map) {
        C17542s.j(bVar, "<this>");
        C17542s.j(map, "map");
        this.f50781a.G(map);
    }

    public final void d(String str) {
        C17542s.j(str, "value");
        this.f50781a.H(str);
    }

    public final void e(String str) {
        C17542s.j(str, "value");
        this.f50781a.I(str);
    }

    public final void f(long j10) {
        this.f50781a.K(j10);
    }

    public final void g(long j10) {
        this.f50781a.L(j10);
    }

    public /* synthetic */ C7759e(C.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
