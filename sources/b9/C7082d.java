package b9;

import b9.h;
import com.google.protobuf.GeneratedMessageLite;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118G@GX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00178G@GX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00178G@GX\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010%\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020 8G@GX\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lb9/d;", "", "Lb9/h$a;", "_builder", "<init>", "(Lb9/h$a;)V", "Lb9/h;", "a", "()Lb9/h;", "Lb9/h$a;", "Lb9/g;", "value", "getContext", "()Lb9/g;", "b", "(Lb9/g;)V", "context", "Lb9/l;", "getOs", "()Lb9/l;", "d", "(Lb9/l;)V", "os", "", "getCrashId", "()J", "c", "(J)V", "crashId", "getRelativeTime", "e", "relativeTime", "Lb9/n;", "getThreadReport", "()Lb9/n;", "f", "(Lb9/n;)V", "threadReport", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: b9.d  reason: case insensitive filesystem */
public final class C7082d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f45639b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final h.a f45640a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lb9/d$a;", "", "<init>", "()V", "Lb9/h$a;", "builder", "Lb9/d;", "a", "(Lb9/h$a;)Lb9/d;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: b9.d$a */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ C7082d a(h.a aVar) {
            C17542s.j(aVar, "builder");
            return new C7082d(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C7082d(h.a aVar) {
        this.f45640a = aVar;
    }

    public final /* synthetic */ h a() {
        GeneratedMessageLite o10 = this.f45640a.g();
        C17542s.i(o10, "_builder.build()");
        return (h) o10;
    }

    public final void b(g gVar) {
        C17542s.j(gVar, "value");
        this.f45640a.E(gVar);
    }

    public final void c(long j10) {
        this.f45640a.G(j10);
    }

    public final void d(l lVar) {
        C17542s.j(lVar, "value");
        this.f45640a.H(lVar);
    }

    public final void e(long j10) {
        this.f45640a.I(j10);
    }

    public final void f(n nVar) {
        C17542s.j(nVar, "value");
        this.f45640a.K(nVar);
    }

    public /* synthetic */ C7082d(h.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
