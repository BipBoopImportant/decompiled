package b9;

import b9.f;
import com.google.protobuf.GeneratedMessageLite;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lb9/a;", "", "Lb9/f$c$a;", "_builder", "<init>", "(Lb9/f$c$a;)V", "Lb9/f$c;", "a", "()Lb9/f$c;", "Lb9/f$c$a;", "Lb9/f$d;", "value", "getJavaFrame", "()Lb9/f$d;", "b", "(Lb9/f$d;)V", "javaFrame", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: b9.a  reason: case insensitive filesystem */
public final class C7079a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0787a f45633b = new C0787a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final f.c.a f45634a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lb9/a$a;", "", "<init>", "()V", "Lb9/f$c$a;", "builder", "Lb9/a;", "a", "(Lb9/f$c$a;)Lb9/a;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: b9.a$a  reason: collision with other inner class name */
    public static final class C0787a {
        private C0787a() {
        }

        public final /* synthetic */ C7079a a(f.c.a aVar) {
            C17542s.j(aVar, "builder");
            return new C7079a(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C0787a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C7079a(f.c.a aVar) {
        this.f45634a = aVar;
    }

    public final /* synthetic */ f.c a() {
        GeneratedMessageLite o10 = this.f45634a.g();
        C17542s.i(o10, "_builder.build()");
        return (f.c) o10;
    }

    public final void b(f.d dVar) {
        C17542s.j(dVar, "value");
        this.f45634a.E(dVar);
    }

    public /* synthetic */ C7079a(f.c.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
