package e9;

import com.google.protobuf.C9575h;
import com.google.protobuf.GeneratedMessageLite;
import e9.C7812c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118G@GX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006\u001a"}, d2 = {"Le9/f;", "", "Le9/c$a;", "_builder", "<init>", "(Le9/c$a;)V", "Le9/c;", "a", "()Le9/c;", "Le9/c$a;", "", "value", "getHash", "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "hash", "Lcom/google/protobuf/h;", "getResource", "()Lcom/google/protobuf/h;", "d", "(Lcom/google/protobuf/h;)V", "resource", "getContentType", "b", "contentType", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e9.f  reason: case insensitive filesystem */
public final class C7815f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50895b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C7812c.a f50896a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Le9/f$a;", "", "<init>", "()V", "Le9/c$a;", "builder", "Le9/f;", "a", "(Le9/c$a;)Le9/f;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: e9.f$a */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ C7815f a(C7812c.a aVar) {
            C17542s.j(aVar, "builder");
            return new C7815f(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C7815f(C7812c.a aVar) {
        this.f50896a = aVar;
    }

    public final /* synthetic */ C7812c a() {
        GeneratedMessageLite o10 = this.f50896a.g();
        C17542s.i(o10, "_builder.build()");
        return (C7812c) o10;
    }

    public final void b(String str) {
        C17542s.j(str, "value");
        this.f50896a.E(str);
    }

    public final void c(String str) {
        C17542s.j(str, "value");
        this.f50896a.G(str);
    }

    public final void d(C9575h hVar) {
        C17542s.j(hVar, "value");
        this.f50896a.H(hVar);
    }

    public /* synthetic */ C7815f(C7812c.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
