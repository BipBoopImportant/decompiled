package d9;

import com.google.protobuf.GeneratedMessageLite;
import d9.C7778y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118G@GX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ld9/a;", "", "Ld9/y$a;", "_builder", "<init>", "(Ld9/y$a;)V", "Ld9/y;", "a", "()Ld9/y;", "Ld9/y$a;", "", "value", "getUnixTimestampMs", "()J", "c", "(J)V", "unixTimestampMs", "Ld9/y$b;", "getStateTransition", "()Ld9/y$b;", "b", "(Ld9/y$b;)V", "stateTransition", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d9.a  reason: case insensitive filesystem */
public final class C7755a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0829a f50772b = new C0829a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C7778y.a f50773a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld9/a$a;", "", "<init>", "()V", "Ld9/y$a;", "builder", "Ld9/a;", "a", "(Ld9/y$a;)Ld9/a;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d9.a$a  reason: collision with other inner class name */
    public static final class C0829a {
        private C0829a() {
        }

        public final /* synthetic */ C7755a a(C7778y.a aVar) {
            C17542s.j(aVar, "builder");
            return new C7755a(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C0829a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C7755a(C7778y.a aVar) {
        this.f50773a = aVar;
    }

    public final /* synthetic */ C7778y a() {
        GeneratedMessageLite o10 = this.f50773a.g();
        C17542s.i(o10, "_builder.build()");
        return (C7778y) o10;
    }

    public final void b(C7778y.b bVar) {
        C17542s.j(bVar, "value");
        this.f50773a.E(bVar);
    }

    public final void c(long j10) {
        this.f50773a.G(j10);
    }

    public /* synthetic */ C7755a(C7778y.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
