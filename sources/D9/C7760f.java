package d9;

import com.google.protobuf.GeneratedMessageLite;
import d9.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ld9/f;", "", "Ld9/D$a;", "_builder", "<init>", "(Ld9/D$a;)V", "Ld9/D;", "a", "()Ld9/D;", "Ld9/D$a;", "", "value", "getUnixTimestampMs", "()J", "b", "(J)V", "unixTimestampMs", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d9.f  reason: case insensitive filesystem */
public final class C7760f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50782b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final D.a f50783a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld9/f$a;", "", "<init>", "()V", "Ld9/D$a;", "builder", "Ld9/f;", "a", "(Ld9/D$a;)Ld9/f;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d9.f$a */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ C7760f a(D.a aVar) {
            C17542s.j(aVar, "builder");
            return new C7760f(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C7760f(D.a aVar) {
        this.f50783a = aVar;
    }

    public final /* synthetic */ D a() {
        GeneratedMessageLite o10 = this.f50783a.g();
        C17542s.i(o10, "_builder.build()");
        return (D) o10;
    }

    public final void b(long j10) {
        this.f50783a.E(j10);
    }

    public /* synthetic */ C7760f(D.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
