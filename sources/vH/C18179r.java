package vH;

import EH.C15636u;
import EH.C15638w;
import MH.C16039a;
import YH.g0;
import java.util.Set;
import kotlin.Metadata;
import org.slf4j.Logger;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0018\u0010\r\u001a\u00060\tj\u0002`\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LEH/w;", "", "d", "(LEH/w;)Z", "", "LEH/u;", "a", "Ljava/util/Set;", "ALLOWED_FOR_REDIRECT", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "b", "Lorg/slf4j/Logger;", "LOGGER", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: vH.r  reason: case insensitive filesystem */
public final class C18179r {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Set<C15636u> f148985a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f148986b = C16039a.a("io.ktor.client.plugins.HttpRedirect");

    static {
        C15636u.a aVar = C15636u.f134140b;
        f148985a = g0.h(aVar.a(), aVar.b());
    }

    /* access modifiers changed from: private */
    public static final boolean d(C15638w wVar) {
        int x02 = wVar.x0();
        C15638w.a aVar = C15638w.f134189c;
        return x02 == aVar.r().x0() || x02 == aVar.j().x0() || x02 == aVar.R().x0() || x02 == aVar.E().x0() || x02 == aVar.N().x0();
    }
}
