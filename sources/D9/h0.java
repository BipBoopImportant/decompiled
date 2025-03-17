package d9;

import com.google.protobuf.GeneratedMessageLite;
import d9.X;
import java.util.List;
import jd.C9898a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0011\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ-\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001b"}, d2 = {"Ld9/h0;", "", "Ld9/X$a;", "_builder", "<init>", "(Ld9/X$a;)V", "Ld9/X;", "a", "()Ld9/X;", "Ljd/a;", "", "", "values", "LXH/N;", "b", "(Ljd/a;Ljava/lang/Iterable;)V", "", "c", "d", "Ld9/X$a;", "e", "()Ljd/a;", "unixTimestampsMs", "f", "xPositions", "g", "yPositions", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50790b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final X.a f50791a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld9/h0$a;", "", "<init>", "()V", "Ld9/X$a;", "builder", "Ld9/h0;", "a", "(Ld9/X$a;)Ld9/h0;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final /* synthetic */ h0 a(X.a aVar) {
            C17542s.j(aVar, "builder");
            return new h0(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private h0(X.a aVar) {
        this.f50791a = aVar;
    }

    public final /* synthetic */ X a() {
        GeneratedMessageLite o10 = this.f50791a.g();
        C17542s.i(o10, "_builder.build()");
        return (X) o10;
    }

    public final /* synthetic */ void b(C9898a aVar, Iterable iterable) {
        C17542s.j(aVar, "<this>");
        C17542s.j(iterable, "values");
        this.f50791a.E(iterable);
    }

    public final /* synthetic */ void c(C9898a aVar, Iterable iterable) {
        C17542s.j(aVar, "<this>");
        C17542s.j(iterable, "values");
        this.f50791a.G(iterable);
    }

    public final /* synthetic */ void d(C9898a aVar, Iterable iterable) {
        C17542s.j(aVar, "<this>");
        C17542s.j(iterable, "values");
        this.f50791a.H(iterable);
    }

    public final /* synthetic */ C9898a e() {
        List<Long> I10 = this.f50791a.I();
        C17542s.i(I10, "_builder.getUnixTimestampsMsList()");
        return new C9898a(I10);
    }

    public final /* synthetic */ C9898a f() {
        List<Integer> K10 = this.f50791a.K();
        C17542s.i(K10, "_builder.getXPositionsList()");
        return new C9898a(K10);
    }

    public final /* synthetic */ C9898a g() {
        List<Integer> L10 = this.f50791a.L();
        C17542s.i(L10, "_builder.getYPositionsList()");
        return new C9898a(L10);
    }

    public /* synthetic */ h0(X.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
