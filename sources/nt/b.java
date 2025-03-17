package Nt;

import Am.a;
import Mm.g;
import Nt.a;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kD.o;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import lD.C14763e;
import nI.q;
import pu.C11780d;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LNt/b;", "LNt/a;", "LlD/e;", "getUserInfoUseCase", "Lpu/d;", "storeModeIntegration", "LLt/a;", "storeBenefitMapper", "LAm/a;", "benefitsRepository", "<init>", "(LlD/e;Lpu/d;LLt/a;LAm/a;)V", "LTJ/g;", "LNt/a$a;", "invoke", "()LTJ/g;", "a", "LlD/e;", "b", "Lpu/d;", "c", "LLt/a;", "d", "LAm/a;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final C14763e f84265a;

    /* renamed from: b  reason: collision with root package name */
    private final C11780d f84266b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Lt.a f84267c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Am.a f84268d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LkD/o;", "userInfo", "", "storeModeEnabled", "LNt/a$a;", "<anonymous>", "(LkD/o;Z)LNt/a$a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.storebenefits.usecase.GetStoreBenefitsUseCaseImpl$invoke$1", f = "GetStoreBenefitsUseCase.kt", l = {36}, m = "invokeSuspend")
    static final class a extends l implements q<o, Boolean, C17164e<? super a.C1716a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        boolean f84269c;

        /* renamed from: d  reason: collision with root package name */
        int f84270d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f84271e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f84272f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f84273g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(3, eVar);
            this.f84273g = bVar;
        }

        public final Object i(o oVar, boolean z10, C17164e<? super a.C1716a> eVar) {
            a aVar = new a(this.f84273g, eVar);
            aVar.f84271e = oVar;
            aVar.f84272f = z10;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((o) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z10;
            boolean z11;
            Object f10 = C17187b.f();
            int i10 = this.f84270d;
            if (i10 == 0) {
                y.b(obj);
                o oVar = (o) this.f84271e;
                z10 = this.f84272f;
                boolean a10 = oVar.a();
                Am.a a11 = this.f84273g.f84268d;
                g gVar = g.FREE_BEVERAGE;
                this.f84271e = oVar;
                this.f84272f = z10;
                this.f84269c = a10;
                this.f84270d = 1;
                obj = a11.b(gVar, a10, this);
                if (obj == f10) {
                    return f10;
                }
                z11 = a10;
            } else if (i10 == 1) {
                z11 = this.f84269c;
                z10 = this.f84272f;
                o oVar2 = (o) this.f84271e;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.b bVar = (a.b) obj;
            if (bVar instanceof a.b.C1460a) {
                return new a.C1716a(this.f84273g.f84267c.a(((a.b.C1460a) bVar).a(), z11, z10));
            }
            if (bVar instanceof a.b.C1461b) {
                return null;
            }
            throw new t();
        }
    }

    public b(C14763e eVar, C11780d dVar, Lt.a aVar, Am.a aVar2) {
        C17542s.j(eVar, "getUserInfoUseCase");
        C17542s.j(dVar, "storeModeIntegration");
        C17542s.j(aVar, "storeBenefitMapper");
        C17542s.j(aVar2, "benefitsRepository");
        this.f84265a = eVar;
        this.f84266b = dVar;
        this.f84267c = aVar;
        this.f84268d = aVar2;
    }

    public C16532g<a.C1716a> invoke() {
        return C16534i.n(this.f84265a.invoke(), this.f84266b.isEnabled(), new a(this, (C17164e<? super a>) null));
    }
}
