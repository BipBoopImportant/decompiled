package d9;

import com.google.protobuf.GeneratedMessageLite;
import d9.I;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"Ld9/m;", "", "Ld9/I$a;", "_builder", "<init>", "(Ld9/I$a;)V", "Ld9/I;", "a", "()Ld9/I;", "Ld9/I$a;", "", "value", "getClassName", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)V", "className", "getIncrementalPath", "c", "incrementalPath", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d9.m  reason: case insensitive filesystem */
public final class C7767m {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50807b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final I.a f50808a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld9/m$a;", "", "<init>", "()V", "Ld9/I$a;", "builder", "Ld9/m;", "a", "(Ld9/I$a;)Ld9/m;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d9.m$a */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ C7767m a(I.a aVar) {
            C17542s.j(aVar, "builder");
            return new C7767m(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C7767m(I.a aVar) {
        this.f50808a = aVar;
    }

    public final /* synthetic */ I a() {
        GeneratedMessageLite o10 = this.f50808a.g();
        C17542s.i(o10, "_builder.build()");
        return (I) o10;
    }

    public final void b(String str) {
        C17542s.j(str, "value");
        this.f50808a.E(str);
    }

    public final void c(String str) {
        C17542s.j(str, "value");
        this.f50808a.G(str);
    }

    public /* synthetic */ C7767m(I.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
