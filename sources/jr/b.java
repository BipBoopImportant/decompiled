package Jr;

import TJ.C16519P;
import com.sugarcube.app.base.external.config.a;
import ip.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import up.C12071a;
import up.C12074d;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"LJr/b;", "Lcom/sugarcube/app/base/external/config/a;", "LIl/a;", "appConfigApi", "Lup/d;", "userConsentRepository", "<init>", "(LIl/a;Lup/d;)V", "f", "LIl/a;", "g", "Lup/d;", "", "h", "Z", "getDebug", "()Z", "debug", "LTJ/P;", "i", "LTJ/P;", "a", "()LTJ/P;", "trackingEnabledFlow", "", "getCountry", "()Ljava/lang/String;", "country", "getLanguage", "language", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends a {

    /* renamed from: f  reason: collision with root package name */
    private final Il.a f82716f;

    /* renamed from: g  reason: collision with root package name */
    private final C12074d f82717g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f82718h;

    /* renamed from: i  reason: collision with root package name */
    private final C16519P<Boolean> f82719i;

    public b(Il.a aVar, C12074d dVar) {
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(dVar, "userConsentRepository");
        this.f82716f = aVar;
        this.f82717g = dVar;
        this.f82719i = n.b(new a(this), dVar.c(C12071a.b.f103980e));
    }

    /* access modifiers changed from: private */
    public static final boolean c(b bVar) {
        return bVar.f82717g.b(C12071a.b.f103980e);
    }

    /* renamed from: a */
    public C16519P<Boolean> getTrackingEnabledFlow() {
        return this.f82719i;
    }

    public String getCountry() {
        return this.f82716f.i();
    }

    public boolean getDebug() {
        return this.f82718h;
    }

    public String getLanguage() {
        return this.f82716f.a();
    }
}
