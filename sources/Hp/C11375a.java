package hp;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lhp/a;", "", "Lhp/a$a;", "type", "", "reason", "<init>", "(Lhp/a$a;Ljava/lang/String;)V", "a", "Lhp/a$a;", "getType", "()Lhp/a$a;", "b", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hp.a  reason: case insensitive filesystem */
public final class C11375a extends Throwable {

    /* renamed from: a  reason: collision with root package name */
    private final C2209a f98144a;

    /* renamed from: b  reason: collision with root package name */
    private final String f98145b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lhp/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "ITEM_NOT_FOUND", "UNKNOWN", "core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hp.a$a  reason: collision with other inner class name */
    public enum C2209a {
        ITEM_NOT_FOUND,
        UNKNOWN;

        static {
            C2209a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11375a(C2209a aVar, String str) {
        super(str);
        C17542s.j(aVar, "type");
        C17542s.j(str, "reason");
        this.f98144a = aVar;
        this.f98145b = str;
    }
}
