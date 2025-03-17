package hg;

import EB.C12832d;
import Lf.b;
import Ln.d;
import Mn.c;
import Qf.a;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import dI.C17164e;
import eI.C17187b;
import hg.E;
import hg.J;
import ig.C9845a;
import ig.i;
import ip.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import nI.p;
import sf.C10242c;
import sf.C10243d;
import tf.C10253a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u0015*\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00120\u00182\u001a\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00120\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010 \u001a\u0004\u0018\u00010\u001f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001c0\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J;\u0010(\u001a\u0004\u0018\u00010'2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001c0\f2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010)J/\u0010-\u001a\u0014\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\f0*2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001c0\fH\u0016¢\u0006\u0004\b-\u0010.J%\u00101\u001a\u00020\u00152\u0006\u00100\u001a\u00020/2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00106R(\u00109\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012078\u0002X\u0004¢\u0006\u0006\n\u0004\b \u00108R\u0014\u0010<\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0014\u0010A\u001a\u00020/8VX\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lhg/b;", "Lhg/a;", "Ltf/a;", "killSwitchRepository", "Lsf/c;", "appUserDataRepository", "Lig/i;", "getDeliveryOptionDetailsUseCase", "LLf/b;", "cartAnalytics", "<init>", "(Ltf/a;Lsf/c;Lig/i;LLf/b;)V", "", "LKf/y;", "cartItems", "", "k", "(Ljava/util/List;)Z", "Lip/l;", "Lig/a$a;", "", "LXH/N;", "l", "(Lip/l;)V", "LTJ/g;", "availabilityFlow", "c", "(LTJ/g;)LTJ/g;", "LLn/d;", "", "storeId", "LMn/c$d;", "e", "(Ljava/util/List;Ljava/lang/String;)LMn/c$d;", "LEB/d;", "selectedStore", "Lhg/E;", "checkoutState", "showPricesExclTax", "LQf/a;", "b", "(Ljava/util/List;LEB/d;Lhg/E;Z)LQf/a;", "", "Lhg/J$a;", "Lhg/h;", "a", "(Ljava/util/List;)Ljava/util/Map;", "Lsf/d;", "option", "d", "(Lsf/d;Ljava/util/List;)V", "Ltf/a;", "Lsf/c;", "Lig/i;", "LLf/b;", "LTJ/B;", "LTJ/B;", "availability", "i", "()Z", "cartAvailabilitySupported", "j", "showItemAvailability", "f", "()Lsf/d;", "preferredDelivery", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hg.b  reason: case insensitive filesystem */
public final class C9793b implements C9792a {

    /* renamed from: a  reason: collision with root package name */
    private final C10253a f73626a;

    /* renamed from: b  reason: collision with root package name */
    private final C10242c f73627b;

    /* renamed from: c  reason: collision with root package name */
    private final i f73628c;

    /* renamed from: d  reason: collision with root package name */
    private final b f73629d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C16505B<l<C9845a.C1326a, Throwable>> f73630e = C16521S.a(null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.b$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f73631a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                sf.d[] r0 = sf.C10243d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                sf.d r1 = sf.C10243d.HOME     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                sf.d r1 = sf.C10243d.CLICK_AND_COLLECT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f73631a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.C9793b.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lip/l;", "Lig/a$a;", "", "value", "LXH/N;", "<anonymous>", "(Lip/l;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.viewmodel.CartAvailabilityHandlerImpl$getAvailabilityState$1", f = "CartAvailabilityHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hg.b$b  reason: collision with other inner class name */
    static final class C1286b extends kotlin.coroutines.jvm.internal.l implements p<l<C9845a.C1326a, Throwable>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73632c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f73633d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C9793b f73634e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1286b(C9793b bVar, C17164e<? super C1286b> eVar) {
            super(2, eVar);
            this.f73634e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C1286b bVar = new C1286b(this.f73634e, eVar);
            bVar.f73633d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(l<C9845a.C1326a, Throwable> lVar, C17164e<? super C16807N> eVar) {
            return ((C1286b) create(lVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f73632c == 0) {
                y.b(obj);
                l lVar = (l) this.f73633d;
                C16505B g10 = this.f73634e.f73630e;
                do {
                    value = g10.getValue();
                    l lVar2 = (l) value;
                } while (!g10.e(value, lVar));
                this.f73634e.l(lVar);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C9793b(C10253a aVar, C10242c cVar, i iVar, b bVar) {
        C17542s.j(aVar, "killSwitchRepository");
        C17542s.j(cVar, "appUserDataRepository");
        C17542s.j(iVar, "getDeliveryOptionDetailsUseCase");
        C17542s.j(bVar, "cartAnalytics");
        this.f73626a = aVar;
        this.f73627b = cVar;
        this.f73628c = iVar;
        this.f73629d = bVar;
    }

    private final boolean i() {
        return this.f73626a.v();
    }

    private final boolean k(List<Kf.y> list) {
        Iterable<Kf.y> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (Kf.y yVar : iterable) {
            if (C9794c.q(this.f73630e.getValue(), j(), f(), yVar.a(), yVar.b())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void l(l<C9845a.C1326a, Throwable> lVar) {
        if (lVar != null && !(lVar instanceof l.a) && !(lVar instanceof l.b)) {
            if (lVar instanceof l.c) {
                C10243d f10 = f();
                Iterable<d> b10 = ((C9845a.C1326a) ((l.c) lVar).a()).b();
                ArrayList arrayList = new ArrayList(C16877v.y(b10, 10));
                for (d dVar : b10) {
                    arrayList.add(new Kf.y(dVar.j(), dVar.l()));
                }
                d(f10, arrayList);
                return;
            }
            throw new t();
        }
    }

    public Map<J.a, List<C9799h>> a(List<d> list) {
        C17542s.j(list, "cartItems");
        return C9794c.p(list, this.f73630e.getValue(), j(), f());
    }

    public Qf.a b(List<d> list, C12832d dVar, E e10, boolean z10) {
        i.a aVar;
        List<d> list2 = list;
        E e11 = e10;
        C17542s.j(list2, "cartItems");
        a.c cVar = null;
        if (!i()) {
            return null;
        }
        C16505B<l<C9845a.C1326a, Throwable>> b10 = this.f73630e;
        Map<J.a, List<C9799h>> p10 = C9794c.p(list2, b10.getValue(), j(), C10243d.HOME);
        Map<J.a, List<C9799h>> p11 = C9794c.p(list2, b10.getValue(), j(), C10243d.CLICK_AND_COLLECT);
        UserPostalCodeAddress l10 = this.f73627b.l();
        String d10 = l10 != null ? l10.d() : null;
        boolean z11 = d10 == null || d10.length() == 0;
        if (e11 == null || (e11 instanceof E.b) || (e11 instanceof E.a)) {
            aVar = null;
        } else if (e11 instanceof E.c) {
            aVar = this.f73628c.a(((E.c) e11).a(), z10);
        } else {
            throw new t();
        }
        C10243d f10 = f();
        boolean z12 = !this.f73626a.K();
        boolean z13 = !z11 && C9794c.d(b10.getValue());
        a.b.C1070a c10 = C9794c.i(p11, dVar != null ? dVar.e() : null, dVar != null ? dVar.getName() : null, aVar != null ? aVar.a() : null);
        if (aVar != null) {
            cVar = aVar.b();
        }
        return new Qf.a(d10, f10, C9794c.g(p10, cVar), c10, z12, z13, b10.getValue() instanceof l.b, e11 instanceof E.b);
    }

    public C16532g<l<C9845a.C1326a, Throwable>> c(C16532g<? extends l<C9845a.C1326a, Throwable>> gVar) {
        C17542s.j(gVar, "availabilityFlow");
        return C16534i.R(C16534i.s(gVar), new C1286b(this, (C17164e<? super C1286b>) null));
    }

    public void d(C10243d dVar, List<Kf.y> list) {
        C17542s.j(dVar, "option");
        C17542s.j(list, "cartItems");
        this.f73629d.h(dVar, k(list));
    }

    public c.d e(List<d> list, String str) {
        c.d dVar;
        C17542s.j(list, "cartItems");
        if (!j() || !i()) {
            return null;
        }
        l value = this.f73630e.getValue();
        int i10 = a.f73631a[f().ordinal()];
        boolean z10 = false;
        if (i10 == 1) {
            if (C9794c.h(C9794c.p(list, value, j(), C10243d.HOME), (a.c) null, 1, (Object) null).e() == a.C1069a.FULL) {
                z10 = true;
            }
            dVar = new c.d.b(z10);
        } else if (i10 == 2) {
            if (C9794c.j(C9794c.p(list, value, j(), C10243d.CLICK_AND_COLLECT), str, (String) null, (a.c) null, 4, (Object) null).e() == a.C1069a.FULL) {
                z10 = true;
            }
            dVar = new c.d.a(z10, str);
        } else {
            throw new t();
        }
        return dVar;
    }

    public C10243d f() {
        C10243d q10 = this.f73627b.q();
        if (q10 == null) {
            q10 = C10243d.HOME;
        }
        return (q10 != C10243d.CLICK_AND_COLLECT || this.f73626a.K()) ? q10 : C10243d.HOME;
    }

    public boolean j() {
        UserPostalCodeAddress l10 = this.f73627b.l();
        String d10 = l10 != null ? l10.d() : null;
        return !(d10 == null || d10.length() == 0);
    }
}
