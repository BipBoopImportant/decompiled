package b9;

import b9.n;
import com.google.protobuf.GeneratedMessageLite;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lb9/p;", "", "Lb9/n$a;", "_builder", "<init>", "(Lb9/n$a;)V", "Lb9/n;", "a", "()Lb9/n;", "Lb9/n$a;", "Lb9/j;", "value", "getFlutter", "()Lb9/j;", "b", "(Lb9/j;)V", "flutter", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p {

    /* renamed from: b  reason: collision with root package name */
    public static final a f45643b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final n.a f45644a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lb9/p$a;", "", "<init>", "()V", "Lb9/n$a;", "builder", "Lb9/p;", "a", "(Lb9/n$a;)Lb9/p;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final /* synthetic */ p a(n.a aVar) {
            C17542s.j(aVar, "builder");
            return new p(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private p(n.a aVar) {
        this.f45644a = aVar;
    }

    public final /* synthetic */ n a() {
        GeneratedMessageLite o10 = this.f45644a.g();
        C17542s.i(o10, "_builder.build()");
        return (n) o10;
    }

    public final void b(j jVar) {
        C17542s.j(jVar, "value");
        this.f45644a.G(jVar);
    }

    public /* synthetic */ p(n.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
