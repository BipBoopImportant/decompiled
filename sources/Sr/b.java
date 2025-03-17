package Sr;

import Il.d;
import Rl.e;
import Sr.a;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.x;
import XH.y;
import com.ingka.ikea.appconfig.model.LocationLatLngBounds;
import com.ingka.ikea.appconfig.model.MapServiceData;
import dI.C17164e;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LSr/b;", "LSr/a;", "LIl/d;", "marketConfigRepository", "<init>", "(LIl/d;)V", "LTJ/g;", "LSr/a$a;", "invoke", "()LTJ/g;", "a", "LIl/d;", "google-maps_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final d f87327a;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRl/e;", "marketConfig", "LSr/a$a;", "<anonymous>", "(LRl/e;)LSr/a$a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.googlemaps.domain.GetMarketSpecificMapConfigUseCaseImpl$invoke$1$1", f = "GetMarketSpecificMapConfigUseCase.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<e, C17164e<? super a.C1810a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f87328c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f87329d;

        a(C17164e<? super a> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(eVar);
            aVar.f87329d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(e eVar, C17164e<? super a.C1810a> eVar2) {
            return ((a) create(eVar, eVar2)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Integer d10;
            C17187b.f();
            if (this.f87328c == 0) {
                y.b(obj);
                e eVar = (e) this.f87329d;
                String str = null;
                MapServiceData m10 = eVar != null ? eVar.m() : null;
                LocationLatLngBounds c10 = m10 != null ? m10.c() : null;
                boolean z10 = c10 == null;
                a.C1810a.C1811a aVar = c10 != null ? new a.C1810a.C1811a(new a.C1810a.c(c10.a().a(), c10.a().b()), new a.C1810a.c(c10.b().a(), c10.b().b())) : null;
                Float d11 = (m10 == null || (d10 = m10.d()) == null) ? null : kotlin.coroutines.jvm.internal.b.d((float) d10.intValue());
                if (m10 != null) {
                    str = m10.b();
                }
                return new a.C1810a(z10, aVar, d11, str);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public b(d dVar) {
        C17542s.j(dVar, "marketConfigRepository");
        this.f87327a = dVar;
    }

    public C16532g<a.C1810a> invoke() {
        Object obj;
        try {
            x.a aVar = x.f139812b;
            obj = x.b(C16534i.N(this.f87327a.d(), new a((C17164e<? super a>) null)));
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            x.a aVar2 = x.f139812b;
            obj = x.b(y.a(th2));
        }
        if (x.e(obj) != null) {
            obj = C16534i.J(new a.C1810a(false, (a.C1810a.C1811a) null, (Float) null, (String) null));
        }
        return (C16532g) obj;
    }
}
