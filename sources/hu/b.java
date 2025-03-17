package Hu;

import Hu.a;
import QJ.F0;
import QJ.Q;
import QJ.T;
import Sl.e;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.core.model.Media;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import sp.C11880b;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00118\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LHu/b;", "Landroidx/lifecycle/f0;", "", "LSl/e;", "staticImageUseCase", "<init>", "(LSl/e;)V", "LXH/N;", "C", "()V", "m", "LSl/e;", "LTJ/B;", "LHu/a;", "n", "LTJ/B;", "viewModelState", "LTJ/P;", "o", "LTJ/P;", "getState", "()LTJ/P;", "state", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends f0 implements C11880b {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final e f81742m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C16505B<a> f81743n;

    /* renamed from: o  reason: collision with root package name */
    private final C16519P<a> f81744o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.wayfinding.impl.onboarding.presentation.WayfindingOnboardingViewModelImpl$collectStates$1", f = "WayfindingOnboardingViewModelImpl.kt", l = {41}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81745c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f81746d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f81746d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f81746d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f81745c;
            if (i10 == 0) {
                y.b(obj);
                e h10 = this.f81746d.f81742m;
                this.f81745c = 1;
                obj = h10.a("wayfindingKompassOnboarding", this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Media.Image image = (Media.Image) obj;
            C16505B i11 = this.f81746d.f81743n;
            do {
                value = i11.getValue();
                a aVar = (a) value;
            } while (!i11.e(value, new a.C1600a(image)));
            return C16807N.f139792a;
        }
    }

    public b(e eVar) {
        C17542s.j(eVar, "staticImageUseCase");
        this.f81742m = eVar;
        C16505B<a> a10 = C16521S.a(a.b.f81741a);
        this.f81743n = a10;
        this.f81744o = C16534i.c0(C16534i.c(a10), g0.a(this), ip.f.a(), a10.getValue());
        C();
    }

    private final void C() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }

    public C16519P<a> getState() {
        return this.f81744o;
    }
}
