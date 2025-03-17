package d9;

import com.google.protobuf.GeneratedMessageLite;
import d9.Y;
import java.util.List;
import jd.C9898a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR$\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f8G@GX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00158G@GX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u001b8G@GX\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001d\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R$\u0010)\u001a\u00020$2\u0006\u0010\n\u001a\u00020$8G@GX\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006*"}, d2 = {"Ld9/i0;", "", "Ld9/Y$a;", "_builder", "<init>", "(Ld9/Y$a;)V", "Ld9/Y;", "a", "()Ld9/Y;", "Ljd/a;", "value", "LXH/N;", "b", "(Ljd/a;Ld9/Y;)V", "Ld9/Y$a;", "Ld9/Y$b;", "getFormat", "()Ld9/Y$b;", "d", "(Ld9/Y$b;)V", "format", "", "getRecordingId", "()J", "f", "(J)V", "recordingId", "Ld9/b0;", "getStyle", "()Ld9/b0;", "g", "(Ld9/b0;)V", "style", "c", "()Ljd/a;", "children", "Ld9/I;", "getMetadata", "()Ld9/I;", "e", "(Ld9/I;)V", "metadata", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50795b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Y.a f50796a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld9/i0$a;", "", "<init>", "()V", "Ld9/Y$a;", "builder", "Ld9/i0;", "a", "(Ld9/Y$a;)Ld9/i0;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final /* synthetic */ i0 a(Y.a aVar) {
            C17542s.j(aVar, "builder");
            return new i0(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private i0(Y.a aVar) {
        this.f50796a = aVar;
    }

    public final /* synthetic */ Y a() {
        GeneratedMessageLite o10 = this.f50796a.g();
        C17542s.i(o10, "_builder.build()");
        return (Y) o10;
    }

    public final /* synthetic */ void b(C9898a aVar, Y y10) {
        C17542s.j(aVar, "<this>");
        C17542s.j(y10, "value");
        this.f50796a.E(y10);
    }

    public final /* synthetic */ C9898a c() {
        List<Y> G10 = this.f50796a.G();
        C17542s.i(G10, "_builder.getChildrenList()");
        return new C9898a(G10);
    }

    public final void d(Y.b bVar) {
        C17542s.j(bVar, "value");
        this.f50796a.H(bVar);
    }

    public final void e(I i10) {
        C17542s.j(i10, "value");
        this.f50796a.I(i10);
    }

    public final void f(long j10) {
        this.f50796a.K(j10);
    }

    public final void g(b0 b0Var) {
        C17542s.j(b0Var, "value");
        this.f50796a.L(b0Var);
    }

    public /* synthetic */ i0(Y.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
