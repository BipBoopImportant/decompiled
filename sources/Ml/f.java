package Ml;

import Rl.a;
import Rl.e;
import Rl.g;
import Rl.h;
import YH.C16877v;
import com.ingka.ikea.appconfig.model.GiftCardConfiguration;
import com.ingka.ikea.appconfig.model.MapServiceData;
import com.ingka.ikea.appconfig.model.PostalCodePickerConfig;
import com.ingka.ikea.appconfig.model.RemoteMedia;
import com.ingka.ikea.appconfig.model.UrlConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LMl/e;", "LRl/e;", "b", "(LMl/e;)LRl/e;", "LMl/a;", "Lkp/d;", "a", "(LMl/a;)Lkp/d;", "appconfig-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    private static final C11522d a(a aVar) {
        return new C11522d(aVar.o(), aVar.g(), aVar.b(), aVar.l(), aVar.m(), aVar.i(), aVar.j(), aVar.k(), aVar.n(), aVar.c(), aVar.h().m(), aVar.f().m(), aVar.e().m(), aVar.d().m(), aVar.a());
    }

    public static final e b(e eVar) {
        C17542s.j(eVar, "<this>");
        String n10 = eVar.n();
        String k10 = eVar.k();
        String b10 = eVar.b();
        C11522d a10 = a(eVar.c());
        String d10 = eVar.d();
        h q10 = eVar.q();
        String e10 = eVar.e();
        g o10 = eVar.o();
        List<UrlConfig> t10 = eVar.t();
        a i10 = eVar.i();
        a j10 = eVar.j();
        boolean u10 = eVar.u();
        boolean s10 = eVar.s();
        MapServiceData m10 = eVar.m();
        String l10 = eVar.l();
        PostalCodePickerConfig p10 = eVar.p();
        List<String> r10 = eVar.r();
        GiftCardConfiguration h10 = eVar.h();
        boolean f10 = eVar.f();
        boolean g10 = eVar.g();
        List<RemoteMedia> a11 = eVar.a();
        if (a11 == null) {
            a11 = C16877v.n();
        }
        return new e(n10, k10, b10, a10, d10, q10, e10, o10, t10, i10, j10, u10, s10, m10, l10, p10, r10, h10, f10, g10, a11);
    }
}
