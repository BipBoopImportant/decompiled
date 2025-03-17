package ko;

import Nn.C10803f;
import Nn.K;
import Nn.x;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.ingka.ikea.mcomsettings.MComConfig;
import dI.C17164e;
import eI.C17187b;
import ko.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import sv.C11892a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lko/d;", "Lko/c;", "LNn/x;", "checkoutRepository", "Lsv/a;", "mCommerceConfigRepository", "<init>", "(LNn/x;Lsv/a;)V", "", "checkoutId", "LTJ/g;", "Lko/c$a;", "a", "(Ljava/lang/String;)LTJ/g;", "LNn/x;", "b", "Lsv/a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final x f98980a;

    /* renamed from: b  reason: collision with root package name */
    private final C11892a f98981b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig;", "config", "LNn/f;", "checkout", "Lko/c$a;", "<anonymous>", "(Lcom/ingka/ikea/mcomsettings/MComConfig;LNn/f;)Lko/c$a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.checkout.impl.delivery.usecase.GetDeliveryOptionsUseCaseImpl$getDeliveryPrices$1", f = "GetDeliveryOptionsUseCase.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements q<MComConfig, C10803f, C17164e<? super c.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f98982c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f98983d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f98984e;

        a(C17164e<? super a> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(MComConfig mComConfig, C10803f fVar, C17164e<? super c.a> eVar) {
            a aVar = new a(eVar);
            aVar.f98983d = mComConfig;
            aVar.f98984e = fVar;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f98982c == 0) {
                y.b(obj);
                MComConfig mComConfig = (MComConfig) this.f98983d;
                C10803f fVar = (C10803f) this.f98984e;
                if (fVar == null) {
                    return null;
                }
                boolean r10 = mComConfig != null ? mComConfig.r() : false;
                K i10 = fVar.i();
                return new c.a(r10, C16877v.V0(Co.c.t(Co.c.r(fVar.f(), i10), r10), Co.c.s(Co.c.p(fVar.d(), i10), r10)));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public d(x xVar, C11892a aVar) {
        C17542s.j(xVar, "checkoutRepository");
        C17542s.j(aVar, "mCommerceConfigRepository");
        this.f98980a = xVar;
        this.f98981b = aVar;
    }

    public C16532g<c.a> a(String str) {
        C17542s.j(str, "checkoutId");
        return C16534i.n(C11892a.C2450a.a(this.f98981b, false, 1, (Object) null), this.f98980a.q(str), new a((C17164e<? super a>) null));
    }
}
