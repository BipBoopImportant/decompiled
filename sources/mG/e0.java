package mg;

import aA.C13909a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import up.C12073c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001a\u0010\u000f\u001a\u00020\t8\u0016XD¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lmg/e0;", "Lup/c;", "LaA/a;", "sessionManager", "<init>", "(LaA/a;)V", "", "isLoggedIn", "()Z", "", "a", "()Ljava/lang/String;", "LaA/a;", "b", "Ljava/lang/String;", "appVersion", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e0 implements C12073c {

    /* renamed from: a  reason: collision with root package name */
    private final C13909a f75405a;

    /* renamed from: b  reason: collision with root package name */
    private final String f75406b = "4.11.0";

    public e0(C13909a aVar) {
        C17542s.j(aVar, "sessionManager");
        this.f75405a = aVar;
    }

    public String a() {
        String a10 = this.f75405a.a();
        if (this.f75405a.isLoggedIn()) {
            return a10;
        }
        return null;
    }

    public String b() {
        return this.f75406b;
    }

    public boolean isLoggedIn() {
        return this.f75405a.isLoggedIn();
    }
}
