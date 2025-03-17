package b9;

import b9.g;
import com.google.protobuf.GeneratedMessageLite;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00178G@GX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00178G@GX\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b¨\u0006 "}, d2 = {"Lb9/c;", "", "Lb9/g$a;", "_builder", "<init>", "(Lb9/g$a;)V", "Lb9/g;", "a", "()Lb9/g;", "Lb9/g$a;", "", "value", "getProjectId", "()I", "c", "(I)V", "projectId", "getSessionNumber", "d", "sessionNumber", "getViewNumber", "f", "viewNumber", "", "getUserId", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "userId", "getErrorSource", "b", "errorSource", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: b9.c  reason: case insensitive filesystem */
public final class C7081c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f45637b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final g.a f45638a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lb9/c$a;", "", "<init>", "()V", "Lb9/g$a;", "builder", "Lb9/c;", "a", "(Lb9/g$a;)Lb9/c;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: b9.c$a */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ C7081c a(g.a aVar) {
            C17542s.j(aVar, "builder");
            return new C7081c(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C7081c(g.a aVar) {
        this.f45638a = aVar;
    }

    public final /* synthetic */ g a() {
        GeneratedMessageLite o10 = this.f45638a.g();
        C17542s.i(o10, "_builder.build()");
        return (g) o10;
    }

    public final void b(String str) {
        C17542s.j(str, "value");
        this.f45638a.E(str);
    }

    public final void c(int i10) {
        this.f45638a.G(i10);
    }

    public final void d(int i10) {
        this.f45638a.H(i10);
    }

    public final void e(String str) {
        C17542s.j(str, "value");
        this.f45638a.I(str);
    }

    public final void f(int i10) {
        this.f45638a.K(i10);
    }

    public /* synthetic */ C7081c(g.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
