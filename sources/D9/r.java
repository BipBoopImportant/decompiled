package d9;

import com.google.protobuf.GeneratedMessageLite;
import d9.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ld9/r;", "", "<init>", "()V", "a", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f50817a = new r();

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118G@GX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00178G@GX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u001d8G@GX\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Ld9/r$a;", "", "Ld9/P$a;", "_builder", "<init>", "(Ld9/P$a;)V", "Ld9/P;", "a", "()Ld9/P;", "Ld9/P$a;", "", "value", "getUnixTimestampMs", "()J", "e", "(J)V", "unixTimestampMs", "Ld9/P$d;", "getReason", "()Ld9/P$d;", "d", "(Ld9/P$d;)V", "reason", "Ld9/P$c;", "getQualityLevels", "()Ld9/P$c;", "c", "(Ld9/P$c;)V", "qualityLevels", "Ld9/P$b;", "getNetworkValues", "()Ld9/P$b;", "b", "(Ld9/P$b;)V", "networkValues", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0831a f50818b = new C0831a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final P.a f50819a;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld9/r$a$a;", "", "<init>", "()V", "Ld9/P$a;", "builder", "Ld9/r$a;", "a", "(Ld9/P$a;)Ld9/r$a;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: d9.r$a$a  reason: collision with other inner class name */
        public static final class C0831a {
            private C0831a() {
            }

            public final /* synthetic */ a a(P.a aVar) {
                C17542s.j(aVar, "builder");
                return new a(aVar, (DefaultConstructorMarker) null);
            }

            public /* synthetic */ C0831a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private a(P.a aVar) {
            this.f50819a = aVar;
        }

        public final /* synthetic */ P a() {
            GeneratedMessageLite o10 = this.f50819a.g();
            C17542s.i(o10, "_builder.build()");
            return (P) o10;
        }

        public final void b(P.b bVar) {
            C17542s.j(bVar, "value");
            this.f50819a.E(bVar);
        }

        public final void c(P.c cVar) {
            C17542s.j(cVar, "value");
            this.f50819a.G(cVar);
        }

        public final void d(P.d dVar) {
            C17542s.j(dVar, "value");
            this.f50819a.H(dVar);
        }

        public final void e(long j10) {
            this.f50819a.I(j10);
        }

        public /* synthetic */ a(P.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar);
        }
    }

    private r() {
    }
}
