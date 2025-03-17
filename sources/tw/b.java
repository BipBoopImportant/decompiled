package tw;

import GK.C15776D;
import GK.C15804w;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ltw/b;", "LGK/w;", "", "applicationVersionCode", "", "userAgent", "<init>", "(ILjava/lang/String;)V", "LGK/w$a;", "chain", "LGK/D;", "intercept", "(LGK/w$a;)LGK/D;", "a", "I", "b", "Ljava/lang/String;", "networkservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C15804w {

    /* renamed from: a  reason: collision with root package name */
    private final int f56765a;

    /* renamed from: b  reason: collision with root package name */
    private final String f56766b;

    public b(int i10, String str) {
        C17542s.j(str, "userAgent");
        this.f56765a = i10;
        this.f56766b = str;
    }

    public C15776D intercept(C15804w.a aVar) {
        C17542s.j(aVar, "chain");
        return aVar.b(aVar.t().i().a("Android-Version-Code", String.valueOf(this.f56765a)).a("User-Agent", this.f56766b).b());
    }
}
