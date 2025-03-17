package NK;

import GK.C15802u;
import WK.C16772g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0013"}, d2 = {"LNK/a;", "", "LWK/g;", "source", "<init>", "(LWK/g;)V", "", "b", "()Ljava/lang/String;", "LGK/u;", "a", "()LGK/u;", "LWK/g;", "getSource", "()LWK/g;", "", "J", "headerLimit", "c", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: NK.a  reason: case insensitive filesystem */
public final class C16124a {

    /* renamed from: c  reason: collision with root package name */
    public static final C3358a f136620c = new C3358a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C16772g f136621a;

    /* renamed from: b  reason: collision with root package name */
    private long f136622b = 262144;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LNK/a$a;", "", "<init>", "()V", "", "HEADER_LIMIT", "I", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: NK.a$a  reason: collision with other inner class name */
    public static final class C3358a {
        public /* synthetic */ C3358a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3358a() {
        }
    }

    public C16124a(C16772g gVar) {
        C17542s.j(gVar, "source");
        this.f136621a = gVar;
    }

    public final C15802u a() {
        C15802u.a aVar = new C15802u.a();
        while (true) {
            String b10 = b();
            if (b10.length() == 0) {
                return aVar.f();
            }
            aVar.c(b10);
        }
    }

    public final String b() {
        String r02 = this.f136621a.r0(this.f136622b);
        this.f136622b -= (long) r02.length();
        return r02;
    }
}
