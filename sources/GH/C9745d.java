package gh;

import HJ.C15854t;
import QJ.F0;
import QJ.Q;
import QJ.T;
import Rl.b;
import SC.N;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import aA.C13909a;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import gh.C9743b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00158FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lgh/d;", "Landroidx/lifecycle/f0;", "LaA/a;", "sessionManager", "LIl/a;", "marketConfigApi", "<init>", "(LaA/a;LIl/a;)V", "", "loggedIn", "Lgh/b;", "E", "(Z)Lgh/b;", "m", "LaA/a;", "n", "LIl/a;", "LTJ/B;", "o", "LTJ/B;", "_buyGiftCardState", "LTJ/P;", "p", "LXH/o;", "D", "()LTJ/P;", "buyGiftCardState", "giftcard-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gh.d  reason: case insensitive filesystem */
public final class C9745d extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C13909a f73106m;

    /* renamed from: n  reason: collision with root package name */
    private final Il.a f73107n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C16505B<C9743b> f73108o;

    /* renamed from: p  reason: collision with root package name */
    private final C16824o f73109p = C16825p.b(new C9744c(this));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.mcommerce.giftcard.impl.viewmodel.BuyGiftCardsViewModel$buyGiftCardState$2$1", f = "BuyGiftCardsViewModel.kt", l = {32}, m = "invokeSuspend")
    /* renamed from: gh.d$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73110c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C9745d f73111d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gh.d$a$a  reason: collision with other inner class name */
        static final class C1277a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C9745d f73112a;

            C1277a(C9745d dVar) {
                this.f73112a = dVar;
            }

            public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                e.b(this.f73112a.f73108o, this.f73112a.E(z10));
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C9745d dVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f73111d = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f73111d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f73110c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<Boolean> n10 = this.f73111d.f73106m.n();
                C1277a aVar = new C1277a(this.f73111d);
                this.f73110c = 1;
                if (n10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public C9745d(C13909a aVar, Il.a aVar2) {
        C17542s.j(aVar, "sessionManager");
        C17542s.j(aVar2, "marketConfigApi");
        this.f73106m = aVar;
        this.f73107n = aVar2;
        this.f73108o = C16521S.a(E(aVar.isLoggedIn()));
    }

    /* access modifiers changed from: private */
    public static final C16519P C(C9745d dVar) {
        F0 unused = C16314k.d(g0.a(dVar), (C17168i) null, (T) null, new a(dVar, (C17164e<? super a>) null), 3, (Object) null);
        return C16534i.c(dVar.f73108o);
    }

    /* access modifiers changed from: private */
    public final C9743b E(boolean z10) {
        String str;
        Object obj;
        Iterator it = this.f73107n.B().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((b) obj).b(), "BuyGiftCardsLink")) {
                break;
            }
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return C9743b.C1276b.f73104a;
        }
        if (C15854t.v0(bVar.c())) {
            return C9743b.C1276b.f73104a;
        }
        String c10 = bVar.c();
        String a10 = bVar.a();
        if (!C15854t.v0(a10)) {
            str = a10;
        }
        return new C9743b.a(c10, str, z10 ? N.Secondary : N.Primary);
    }

    public final C16519P<C9743b> D() {
        return (C16519P) this.f73109p.getValue();
    }
}
