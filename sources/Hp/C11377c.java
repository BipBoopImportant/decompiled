package hp;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhp/c;", "", "Lhp/c$a;", "type", "", "reason", "<init>", "(Lhp/c$a;Ljava/lang/String;)V", "a", "Lhp/c$a;", "()Lhp/c$a;", "b", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hp.c  reason: case insensitive filesystem */
public final class C11377c extends Throwable {

    /* renamed from: a  reason: collision with root package name */
    private final a f98147a;

    /* renamed from: b  reason: collision with root package name */
    private final String f98148b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lhp/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "CANCELLED", "TIMEOUT", "NO_NETWORK", "UNKNOWN", "RESPONSE", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hp.c$a */
    public enum a {
        CANCELLED,
        TIMEOUT,
        NO_NETWORK,
        UNKNOWN,
        RESPONSE;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11377c(a aVar, String str) {
        super(str);
        C17542s.j(aVar, "type");
        C17542s.j(str, "reason");
        this.f98147a = aVar;
        this.f98148b = str;
    }

    public final a a() {
        return this.f98147a;
    }
}
