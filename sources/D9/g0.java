package d9;

import com.google.protobuf.GeneratedMessageLite;
import d9.W;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148G@GX\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Ld9/g0;", "", "Ld9/W$a;", "_builder", "<init>", "(Ld9/W$a;)V", "Ld9/W;", "a", "()Ld9/W;", "Ld9/W$a;", "", "value", "getUnixTimestampMs", "()J", "c", "(J)V", "unixTimestampMs", "getViewId", "d", "viewId", "Ld9/b0;", "getStyleChanges", "()Ld9/b0;", "b", "(Ld9/b0;)V", "styleChanges", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50786b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final W.a f50787a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld9/g0$a;", "", "<init>", "()V", "Ld9/W$a;", "builder", "Ld9/g0;", "a", "(Ld9/W$a;)Ld9/g0;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final /* synthetic */ g0 a(W.a aVar) {
            C17542s.j(aVar, "builder");
            return new g0(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private g0(W.a aVar) {
        this.f50787a = aVar;
    }

    public final /* synthetic */ W a() {
        GeneratedMessageLite o10 = this.f50787a.g();
        C17542s.i(o10, "_builder.build()");
        return (W) o10;
    }

    public final void b(b0 b0Var) {
        C17542s.j(b0Var, "value");
        this.f50787a.E(b0Var);
    }

    public final void c(long j10) {
        this.f50787a.G(j10);
    }

    public final void d(long j10) {
        this.f50787a.H(j10);
    }

    public /* synthetic */ g0(W.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
