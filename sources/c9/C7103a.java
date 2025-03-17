package c9;

import c9.C7105c;
import com.google.protobuf.GeneratedMessageLite;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118G@GX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR$\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u001d8G@GX\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lc9/a;", "", "Lc9/c$a;", "_builder", "<init>", "(Lc9/c$a;)V", "Lc9/c;", "a", "()Lc9/c;", "Lc9/c$a;", "", "value", "getProjectId", "()I", "c", "(I)V", "projectId", "", "getVisitorId", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "visitorId", "getSessionNumber", "e", "sessionNumber", "getPageviewNumber", "b", "pageviewNumber", "", "getRelativeTimeMs", "()J", "d", "(J)V", "relativeTimeMs", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: c9.a  reason: case insensitive filesystem */
public final class C7103a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0803a f45769b = new C0803a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C7105c.a f45770a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc9/a$a;", "", "<init>", "()V", "Lc9/c$a;", "builder", "Lc9/a;", "a", "(Lc9/c$a;)Lc9/a;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: c9.a$a  reason: collision with other inner class name */
    public static final class C0803a {
        private C0803a() {
        }

        public final /* synthetic */ C7103a a(C7105c.a aVar) {
            C17542s.j(aVar, "builder");
            return new C7103a(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C0803a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C7103a(C7105c.a aVar) {
        this.f45770a = aVar;
    }

    public final /* synthetic */ C7105c a() {
        GeneratedMessageLite o10 = this.f45770a.g();
        C17542s.i(o10, "_builder.build()");
        return (C7105c) o10;
    }

    public final void b(int i10) {
        this.f45770a.E(i10);
    }

    public final void c(int i10) {
        this.f45770a.G(i10);
    }

    public final void d(long j10) {
        this.f45770a.H(j10);
    }

    public final void e(int i10) {
        this.f45770a.I(i10);
    }

    public final void f(String str) {
        C17542s.j(str, "value");
        this.f45770a.K(str);
    }

    public /* synthetic */ C7103a(C7105c.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
