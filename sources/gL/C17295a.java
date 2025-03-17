package gL;

import XH.C16807N;
import XH.v;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lL.C17595a;
import nL.C17684a;
import nL.C17686c;
import oL.C17722a;
import oL.C17723b;
import rL.C17880a;
import rL.C17881b;
import rL.C17882c;
import vL.C18206a;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0003R \u0010\u0013\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0019\u001a\u00020\u00148\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0015\u0010\u0017R \u0010 \u001a\u00020\u001a8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001d\u0010\u001eR \u0010&\u001a\u00020!8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\"\u0012\u0004\b%\u0010\u0003\u001a\u0004\b#\u0010$R*\u0010,\u001a\u00020'2\u0006\u0010(\u001a\u00020'8\u0006@BX\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010)\u0012\u0004\b+\u0010\u0003\u001a\u0004\b\u001b\u0010*¨\u0006-"}, d2 = {"LgL/a;", "", "<init>", "()V", "", "LoL/a;", "modules", "", "allowOverride", "createEagerInstances", "LXH/N;", "e", "(Ljava/util/List;ZZ)V", "a", "LrL/c;", "LrL/c;", "d", "()LrL/c;", "getScopeRegistry$annotations", "scopeRegistry", "LrL/a;", "b", "LrL/a;", "()LrL/a;", "getInstanceRegistry$annotations", "instanceRegistry", "LrL/b;", "c", "LrL/b;", "getPropertyRegistry", "()LrL/b;", "getPropertyRegistry$annotations", "propertyRegistry", "LlL/a;", "LlL/a;", "getExtensionManager", "()LlL/a;", "getExtensionManager$annotations", "extensionManager", "LnL/c;", "<set-?>", "LnL/c;", "()LnL/c;", "getLogger$annotations", "logger", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gL.a  reason: case insensitive filesystem */
public final class C17295a {

    /* renamed from: a  reason: collision with root package name */
    private final C17882c f143336a = new C17882c(this);

    /* renamed from: b  reason: collision with root package name */
    private final C17880a f143337b = new C17880a(this);

    /* renamed from: c  reason: collision with root package name */
    private final C17881b f143338c = new C17881b(this);

    /* renamed from: d  reason: collision with root package name */
    private final C17595a f143339d = new C17595a(this);

    /* renamed from: e  reason: collision with root package name */
    private C17686c f143340e = new C17684a();

    public final void a() {
        this.f143340e.a("Create eager instances ...");
        C18206a aVar = C18206a.f149084a;
        long a10 = aVar.a();
        this.f143337b.b();
        double doubleValue = ((Number) new v(C16807N.f139792a, Double.valueOf(((double) (aVar.a() - a10)) / 1000000.0d)).d()).doubleValue();
        C17686c cVar = this.f143340e;
        cVar.a("Created eager instances in " + doubleValue + " ms");
    }

    public final C17880a b() {
        return this.f143337b;
    }

    public final C17686c c() {
        return this.f143340e;
    }

    public final C17882c d() {
        return this.f143336a;
    }

    public final void e(List<C17722a> list, boolean z10, boolean z11) {
        C17542s.j(list, "modules");
        Set<C17722a> a10 = C17723b.a(list);
        this.f143337b.e(a10, z10);
        this.f143336a.d(a10);
        if (z11) {
            a();
        }
    }
}
