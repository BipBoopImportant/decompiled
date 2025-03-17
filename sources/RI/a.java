package ri;

import HJ.C15854t;
import Ln.g;
import Ln.h;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.S;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import XH.C16807N;
import XH.y;
import com.ingka.ikea.app.providers.cart.db.CartItemDatabase;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH¤@¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0013\u0010\u000eJ\u0019\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001e8\u0004X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u000e\u001a\u0004\b!\u0010\"R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R0\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001e8\u0004@\u0004X\u000e¢\u0006\u0018\n\u0004\b+\u0010 \u0012\u0004\b/\u0010\u000e\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010.R\u001f\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002070%8\u0006¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b\u0018\u0010)R\u0014\u0010=\u001a\u00020:8BX\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lri/a;", "LLn/h;", "Lcom/ingka/ikea/app/providers/cart/db/CartItemDatabase;", "database", "LQJ/M;", "cartCoroutineDispatcher", "<init>", "(Lcom/ingka/ikea/app/providers/cart/db/CartItemDatabase;LQJ/M;)V", "", "guestToken", "LXH/N;", "t", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "l", "()V", "", "isLoggedIn", "i", "(ZLjava/lang/String;LdI/e;)Ljava/lang/Object;", "o", "LLn/g;", "cartHolder", "u", "(LLn/g;)V", "a", "Lcom/ingka/ikea/app/providers/cart/db/CartItemDatabase;", "q", "()Lcom/ingka/ikea/app/providers/cart/db/CartItemDatabase;", "b", "LQJ/M;", "LTJ/B;", "c", "LTJ/B;", "s", "()LTJ/B;", "get_isUpdatingCart$annotations", "_isUpdatingCart", "LTJ/g;", "d", "LTJ/g;", "k", "()LTJ/g;", "isUpdatingCart", "e", "r", "set_cartData", "(LTJ/B;)V", "get_cartData$annotations", "_cartData", "LTJ/P;", "f", "LTJ/P;", "m", "()LTJ/P;", "cartData", "", "g", "cartQuantity", "LQJ/Q;", "p", "()LQJ/Q;", "cartCoroutineScope", "cart-data-layer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a implements h {

    /* renamed from: a  reason: collision with root package name */
    private final CartItemDatabase f76469a;

    /* renamed from: b  reason: collision with root package name */
    private final M f76470b;

    /* renamed from: c  reason: collision with root package name */
    private final C16505B<Boolean> f76471c;

    /* renamed from: d  reason: collision with root package name */
    private final C16532g<Boolean> f76472d;

    /* renamed from: e  reason: collision with root package name */
    private C16505B<g> f76473e;

    /* renamed from: f  reason: collision with root package name */
    private final C16519P<g> f76474f;

    /* renamed from: g  reason: collision with root package name */
    private final C16532g<Integer> f76475g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.providers.cart.repo.CartRepositoryBase$fetchCartAsync$2", f = "CartRepositoryBase.kt", l = {85}, m = "invokeSuspend")
    /* renamed from: ri.a$a  reason: collision with other inner class name */
    static final class C1408a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f76476c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f76477d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f76478e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1408a(a aVar, C17164e<? super C1408a> eVar) {
            super(2, eVar);
            this.f76478e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C1408a aVar = new C1408a(this.f76478e, eVar);
            aVar.f76477d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C1408a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Q q10;
            Object f10 = C17187b.f();
            int i10 = this.f76476c;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f76477d;
                try {
                    a aVar = this.f76478e;
                    this.f76477d = q11;
                    this.f76476c = 1;
                    if (aVar.h(this) == f10) {
                        return f10;
                    }
                } catch (Throwable unused) {
                    q10 = q11;
                    e eVar = e.DEBUG;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar : arrayList) {
                        if (str == null) {
                            String a10 = C11818a.a("Unable to fetch cart async", (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = q10.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str4 = str2;
                        bVar.a(eVar, str4, false, (Throwable) null, str3);
                        str = str3;
                        str2 = str4;
                    }
                    return C16807N.f139792a;
                }
            } else if (i10 == 1) {
                q10 = (Q) this.f76477d;
                try {
                    y.b(obj);
                } catch (Throwable unused2) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.providers.cart.repo.CartRepositoryBase$updateCart$2", f = "CartRepositoryBase.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f76479c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f76480d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f76481e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f76482f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, g gVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f76481e = aVar;
            this.f76482f = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f76481e, this.f76482f, eVar);
            bVar.f76480d = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f76479c == 0) {
                y.b(obj);
                Q q10 = (Q) this.f76480d;
                e eVar = e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                List<Ln.d> list = null;
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("Replace cart items", (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = q10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                pi.a c10 = this.f76481e.q().c();
                g gVar = this.f76482f;
                if (gVar != null) {
                    list = gVar.d();
                }
                c10.e(list);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public a(CartItemDatabase cartItemDatabase, M m10) {
        C17542s.j(cartItemDatabase, "database");
        C17542s.j(m10, "cartCoroutineDispatcher");
        this.f76469a = cartItemDatabase;
        this.f76470b = m10;
        C16505B<Boolean> a10 = C16521S.a(Boolean.FALSE);
        this.f76471c = a10;
        this.f76472d = a10;
        C16505B<g> a11 = C16521S.a(null);
        this.f76473e = a11;
        this.f76474f = a11;
        this.f76475g = cartItemDatabase.c().c();
    }

    private final Q p() {
        return S.a(this.f76470b);
    }

    public final C16532g<Integer> a() {
        return this.f76475g;
    }

    public final Object i(boolean z10, String str, C17164e<? super C16807N> eVar) {
        e eVar2 = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar2, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Handle logged in state change, isLoggedIn: " + z10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar2, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        if (z10) {
            Object t10 = t(str, eVar);
            return t10 == C17187b.f() ? t10 : C16807N.f139792a;
        }
        l();
        return C16807N.f139792a;
    }

    public final C16532g<Boolean> k() {
        return this.f76472d;
    }

    public final void l() {
        Boolean value;
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Clear local cart", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        u((g) null);
        C16505B<Boolean> b10 = this.f76471c;
        do {
            value = b10.getValue();
            value.booleanValue();
        } while (!b10.e(value, Boolean.FALSE));
    }

    public final C16519P<g> m() {
        return this.f76474f;
    }

    /* access modifiers changed from: protected */
    public final void o() {
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Fetch cart async", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        F0 unused = C16314k.d(p(), (C17168i) null, (T) null, new C1408a(this, (C17164e<? super C1408a>) null), 3, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final CartItemDatabase q() {
        return this.f76469a;
    }

    /* access modifiers changed from: protected */
    public final C16505B<g> r() {
        return this.f76473e;
    }

    /* access modifiers changed from: protected */
    public final C16505B<Boolean> s() {
        return this.f76471c;
    }

    /* access modifiers changed from: protected */
    public abstract Object t(String str, C17164e<? super C16807N> eVar);

    /* access modifiers changed from: protected */
    public void u(g gVar) {
        g value;
        C16505B<g> b10 = this.f76473e;
        do {
            value = b10.getValue();
            g gVar2 = value;
        } while (!b10.e(value, gVar));
        F0 unused = C16314k.d(p(), (C17168i) null, (T) null, new b(this, gVar, (C17164e<? super b>) null), 3, (Object) null);
    }
}
