package d9;

import com.google.protobuf.GeneratedMessageLite;
import d9.O;
import java.util.List;
import jd.C9898a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ld9/q;", "", "Ld9/O$a;", "_builder", "<init>", "(Ld9/O$a;)V", "Ld9/O;", "a", "()Ld9/O;", "Ljd/a;", "", "value", "LXH/N;", "b", "(Ljd/a;Ljava/lang/String;)V", "Ld9/O$a;", "c", "()Ljd/a;", "urls", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d9.q  reason: case insensitive filesystem */
public final class C7771q {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50815b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final O.a f50816a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld9/q$a;", "", "<init>", "()V", "Ld9/O$a;", "builder", "Ld9/q;", "a", "(Ld9/O$a;)Ld9/q;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d9.q$a */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ C7771q a(O.a aVar) {
            C17542s.j(aVar, "builder");
            return new C7771q(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C7771q(O.a aVar) {
        this.f50816a = aVar;
    }

    public final /* synthetic */ O a() {
        GeneratedMessageLite o10 = this.f50816a.g();
        C17542s.i(o10, "_builder.build()");
        return (O) o10;
    }

    public final /* synthetic */ void b(C9898a aVar, String str) {
        C17542s.j(aVar, "<this>");
        C17542s.j(str, "value");
        this.f50816a.E(str);
    }

    public final C9898a<String, Object> c() {
        List<String> G10 = this.f50816a.G();
        C17542s.i(G10, "_builder.getUrlsList()");
        return new C9898a<>(G10);
    }

    public /* synthetic */ C7771q(O.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
