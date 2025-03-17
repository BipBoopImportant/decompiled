package d9;

import com.google.protobuf.GeneratedMessageLite;
import d9.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"Ld9/t;", "", "Ld9/P$c$a;", "_builder", "<init>", "(Ld9/P$c$a;)V", "Ld9/P$c;", "a", "()Ld9/P$c;", "Ld9/P$c$a;", "Ld9/Q;", "value", "getPrevious", "()Ld9/Q;", "c", "(Ld9/Q;)V", "previous", "getCurrent", "b", "current", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d9.t  reason: case insensitive filesystem */
public final class C7773t {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50822b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final P.c.a f50823a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld9/t$a;", "", "<init>", "()V", "Ld9/P$c$a;", "builder", "Ld9/t;", "a", "(Ld9/P$c$a;)Ld9/t;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d9.t$a */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ C7773t a(P.c.a aVar) {
            C17542s.j(aVar, "builder");
            return new C7773t(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C7773t(P.c.a aVar) {
        this.f50823a = aVar;
    }

    public final /* synthetic */ P.c a() {
        GeneratedMessageLite o10 = this.f50823a.g();
        C17542s.i(o10, "_builder.build()");
        return (P.c) o10;
    }

    public final void b(Q q10) {
        C17542s.j(q10, "value");
        this.f50823a.E(q10);
    }

    public final void c(Q q10) {
        C17542s.j(q10, "value");
        this.f50823a.G(q10);
    }

    public /* synthetic */ C7773t(P.c.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
