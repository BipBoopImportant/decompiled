package d9;

import com.google.protobuf.GeneratedMessageLite;
import d9.J;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148G@GX\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u001a8G@GX\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Ld9/n;", "", "Ld9/J$a;", "_builder", "<init>", "(Ld9/J$a;)V", "Ld9/J;", "a", "()Ld9/J;", "Ld9/J$a;", "", "value", "getUnixTimestampMs", "()J", "d", "(J)V", "unixTimestampMs", "getParentViewId", "c", "parentViewId", "", "getIndexInParent", "()I", "b", "(I)V", "indexInParent", "Ld9/Y;", "getView", "()Ld9/Y;", "e", "(Ld9/Y;)V", "view", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d9.n  reason: case insensitive filesystem */
public final class C7768n {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50809b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final J.a f50810a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld9/n$a;", "", "<init>", "()V", "Ld9/J$a;", "builder", "Ld9/n;", "a", "(Ld9/J$a;)Ld9/n;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d9.n$a */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ C7768n a(J.a aVar) {
            C17542s.j(aVar, "builder");
            return new C7768n(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C7768n(J.a aVar) {
        this.f50810a = aVar;
    }

    public final /* synthetic */ J a() {
        GeneratedMessageLite o10 = this.f50810a.g();
        C17542s.i(o10, "_builder.build()");
        return (J) o10;
    }

    public final void b(int i10) {
        this.f50810a.E(i10);
    }

    public final void c(long j10) {
        this.f50810a.G(j10);
    }

    public final void d(long j10) {
        this.f50810a.H(j10);
    }

    public final void e(Y y10) {
        C17542s.j(y10, "value");
        this.f50810a.I(y10);
    }

    public /* synthetic */ C7768n(J.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
