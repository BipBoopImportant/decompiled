package ni;

import Il.d;
import Rl.e;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import com.ingka.ikea.killswitch.model.KillSwitchConfig;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import tf.C10253a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lni/b;", "Lni/a;", "LIl/d;", "marketConfigRepository", "Ltf/a;", "killSwitchRepository", "<init>", "(LIl/d;Ltf/a;)V", "LTJ/g;", "Lni/g;", "get", "()LTJ/g;", "a", "LIl/d;", "b", "Ltf/a;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final d f75626a;

    /* renamed from: b  reason: collision with root package name */
    private final C10253a f75627b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LRl/e;", "marketConfig", "Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;", "killSwitchConfig", "Lni/g;", "<anonymous>", "(LRl/e;Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;)Lni/g;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.productinformationpage.v3.usecase.GetPipConfigUseCaseImpl$get$1", f = "GetPipConfigUseCase.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements q<e, KillSwitchConfig, C17164e<? super g>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f75628c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f75629d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f75630e;

        a(C17164e<? super a> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(e eVar, KillSwitchConfig killSwitchConfig, C17164e<? super g> eVar2) {
            a aVar = new a(eVar2);
            aVar.f75629d = eVar;
            aVar.f75630e = killSwitchConfig;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f75628c == 0) {
                y.b(obj);
                e eVar = (e) this.f75629d;
                KillSwitchConfig killSwitchConfig = (KillSwitchConfig) this.f75630e;
                boolean z10 = false;
                if (killSwitchConfig != null && killSwitchConfig.j()) {
                    z10 = true;
                }
                return new g(eVar, z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public b(d dVar, C10253a aVar) {
        C17542s.j(dVar, "marketConfigRepository");
        C17542s.j(aVar, "killSwitchRepository");
        this.f75626a = dVar;
        this.f75627b = aVar;
    }

    public C16532g<g> get() {
        return C16534i.n(this.f75626a.d(), this.f75627b.I(), new a((C17164e<? super a>) null));
    }
}
