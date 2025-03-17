package d9;

import com.google.protobuf.GeneratedMessageLite;
import d9.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118G@GX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ld9/k0;", "", "Ld9/d0$a;", "_builder", "<init>", "(Ld9/d0$a;)V", "Ld9/d0;", "a", "()Ld9/d0;", "Ld9/d0$a;", "", "value", "getWebviewId", "()J", "c", "(J)V", "webviewId", "", "getEvent", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)V", "event", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50803b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final d0.a f50804a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld9/k0$a;", "", "<init>", "()V", "Ld9/d0$a;", "builder", "Ld9/k0;", "a", "(Ld9/d0$a;)Ld9/k0;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final /* synthetic */ k0 a(d0.a aVar) {
            C17542s.j(aVar, "builder");
            return new k0(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private k0(d0.a aVar) {
        this.f50804a = aVar;
    }

    public final /* synthetic */ d0 a() {
        GeneratedMessageLite o10 = this.f50804a.g();
        C17542s.i(o10, "_builder.build()");
        return (d0) o10;
    }

    public final void b(String str) {
        C17542s.j(str, "value");
        this.f50804a.E(str);
    }

    public final void c(long j10) {
        this.f50804a.G(j10);
    }

    public /* synthetic */ k0(d0.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
