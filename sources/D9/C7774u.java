package d9;

import com.google.protobuf.GeneratedMessageLite;
import d9.S;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118G@GX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00178G@GX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Ld9/u;", "", "Ld9/S$a;", "_builder", "<init>", "(Ld9/S$a;)V", "Ld9/S;", "a", "()Ld9/S;", "Ld9/S$a;", "", "value", "getUnixTimestampMs", "()J", "d", "(J)V", "unixTimestampMs", "Ld9/S$b;", "getStartReason", "()Ld9/S$b;", "c", "(Ld9/S$b;)V", "startReason", "", "getIsNewSession", "()Z", "b", "(Z)V", "isNewSession", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d9.u  reason: case insensitive filesystem */
public final class C7774u {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50824b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final S.a f50825a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld9/u$a;", "", "<init>", "()V", "Ld9/S$a;", "builder", "Ld9/u;", "a", "(Ld9/S$a;)Ld9/u;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d9.u$a */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ C7774u a(S.a aVar) {
            C17542s.j(aVar, "builder");
            return new C7774u(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C7774u(S.a aVar) {
        this.f50825a = aVar;
    }

    public final /* synthetic */ S a() {
        GeneratedMessageLite o10 = this.f50825a.g();
        C17542s.i(o10, "_builder.build()");
        return (S) o10;
    }

    public final void b(boolean z10) {
        this.f50825a.E(z10);
    }

    public final void c(S.b bVar) {
        C17542s.j(bVar, "value");
        this.f50825a.G(bVar);
    }

    public final void d(long j10) {
        this.f50825a.H(j10);
    }

    public /* synthetic */ C7774u(S.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
