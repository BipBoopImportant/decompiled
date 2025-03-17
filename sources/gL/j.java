package Gl;

import HJ.C15854t;
import QJ.M;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.v;
import XH.y;
import YH.C16877v;
import android.annotation.SuppressLint;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.q;
import ow.f;
import uI.C18055d;
import x4.C8948l;
import x4.C8951o;
import x4.v;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\r*\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\r*\u00020\u00192\u0006\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0!2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R!\u0010/\u001a\b\u0012\u0004\u0012\u00020*0\u000f8BX\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R%\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003000\u000f8BX\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.¨\u00064"}, d2 = {"LGl/j;", "", "", "Low/f;", "navigationTabItems", "LGl/a;", "visibilityExceptions", "Low/a;", "bottomNavEnabledRouteProviders", "LQJ/M;", "defaultDispatcher", "<init>", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;LQJ/M;)V", "", "currentNavBarVisible", "", "Lx4/l;", "newBackStack", "n", "(ZLjava/util/List;)Z", "currentBackStack", "m", "(ZLjava/util/List;Ljava/util/List;)Z", "l", "(Ljava/util/List;Z)Z", "Lx4/v;", "k", "(Lx4/v;)Z", "default", "j", "(Lx4/v;Z)Z", "Lx4/o;", "navController", "LTJ/g;", "g", "(Lx4/o;)LTJ/g;", "a", "Ljava/util/Set;", "b", "c", "d", "LQJ/M;", "", "e", "LXH/o;", "h", "()Ljava/util/List;", "bottomNavEnabledStringRoots", "LuI/d;", "f", "i", "bottomNavEnabledTypeSafeRoutes", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final Set<f> f81165a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<a> f81166b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<ow.a> f81167c;

    /* renamed from: d  reason: collision with root package name */
    private final M f81168d;

    /* renamed from: e  reason: collision with root package name */
    private final C16824o f81169e = C16825p.b(new h(this));

    /* renamed from: f  reason: collision with root package name */
    private final C16824o f81170f = C16825p.b(new i(this));

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f81171a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Gl.j$a$a  reason: collision with other inner class name */
        public static final class C1578a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f81172a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.welcomescreen.bottomnavigation.BottomNavigationViewVisibilityHandler$getBottomNavBarVisibility$$inlined$map$1$2", f = "BottomNavigationViewVisibilityHandler.kt", l = {50}, m = "emit")
            /* renamed from: Gl.j$a$a$a  reason: collision with other inner class name */
            public static final class C1579a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f81173c;

                /* renamed from: d  reason: collision with root package name */
                int f81174d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1578a f81175e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1579a(C1578a aVar, C17164e eVar) {
                    super(eVar);
                    this.f81175e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f81173c = obj;
                    this.f81174d |= Integer.MIN_VALUE;
                    return this.f81175e.emit((Object) null, this);
                }
            }

            public C1578a(C16533h hVar) {
                this.f81172a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Gl.j.a.C1578a.C1579a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Gl.j$a$a$a r0 = (Gl.j.a.C1578a.C1579a) r0
                    int r1 = r0.f81174d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f81174d = r1
                    goto L_0x0018
                L_0x0013:
                    Gl.j$a$a$a r0 = new Gl.j$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f81173c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f81174d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f81172a
                    XH.v r5 = (XH.v) r5
                    java.lang.Object r5 = r5.d()
                    r0.f81174d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Gl.j.a.C1578a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f81171a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f81171a.collect(new C1578a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00002\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LXH/v;", "", "Lx4/l;", "", "acc", "newBackStack", "<anonymous>", "(LXH/v;Ljava/util/List;)LXH/v;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.welcomescreen.bottomnavigation.BottomNavigationViewVisibilityHandler$getBottomNavBarVisibility$1", f = "BottomNavigationViewVisibilityHandler.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements q<v<? extends List<? extends C8948l>, ? extends Boolean>, List<? extends C8948l>, C17164e<? super v<? extends List<? extends C8948l>, ? extends Boolean>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81176c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f81177d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f81178e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f81179f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar, C17164e<? super b> eVar) {
            super(3, eVar);
            this.f81179f = jVar;
        }

        /* renamed from: i */
        public final Object invoke(v<? extends List<C8948l>, Boolean> vVar, List<C8948l> list, C17164e<? super v<? extends List<C8948l>, Boolean>> eVar) {
            b bVar = new b(this.f81179f, eVar);
            bVar.f81177d = vVar;
            bVar.f81178e = list;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z10;
            C17187b.f();
            if (this.f81176c == 0) {
                y.b(obj);
                v vVar = (v) this.f81177d;
                List list = (List) this.f81178e;
                boolean booleanValue = ((Boolean) vVar.d()).booleanValue();
                List list2 = (List) vVar.c();
                if (list.size() > list2.size()) {
                    z10 = this.f81179f.n(booleanValue, list);
                } else if (list.isEmpty()) {
                    return C16796C.a(list, kotlin.coroutines.jvm.internal.b.a(true));
                } else {
                    z10 = this.f81179f.m(booleanValue, list2, list);
                }
                return C16796C.a(list, kotlin.coroutines.jvm.internal.b.a(z10));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public j(Set<f> set, Set<a> set2, Set<ow.a> set3, M m10) {
        C17542s.j(set, "navigationTabItems");
        C17542s.j(set2, "visibilityExceptions");
        C17542s.j(set3, "bottomNavEnabledRouteProviders");
        C17542s.j(m10, "defaultDispatcher");
        this.f81165a = set;
        this.f81166b = set2;
        this.f81167c = set3;
        this.f81168d = m10;
    }

    /* access modifiers changed from: private */
    public static final List e(j jVar) {
        Iterable<ow.a> iterable = jVar.f81167c;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (ow.a b10 : iterable) {
            arrayList.add(b10.b());
        }
        Collection A10 = C16877v.A(arrayList);
        Iterable<f> iterable2 = jVar.f81165a;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
        for (f a10 : iterable2) {
            arrayList2.add(a10.a());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next : arrayList2) {
            if (((String) next).length() > 0) {
                arrayList3.add(next);
            }
        }
        return C16877v.V0(A10, arrayList3);
    }

    /* access modifiers changed from: private */
    public static final List f(j jVar) {
        Iterable<ow.a> iterable = jVar.f81167c;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (ow.a a10 : iterable) {
            arrayList.add(a10.a());
        }
        Collection A10 = C16877v.A(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (f c10 : jVar.f81165a) {
            Object c11 = c10.c();
            C18055d b10 = c11 != null ? P.b(c11.getClass()) : null;
            if (b10 != null) {
                arrayList2.add(b10);
            }
        }
        return C16877v.V0(A10, arrayList2);
    }

    private final List<String> h() {
        return (List) this.f81169e.getValue();
    }

    private final List<C18055d<?>> i() {
        return (List) this.f81170f.getValue();
    }

    private final boolean j(x4.v vVar, boolean z10) {
        String C10 = vVar.C();
        if (C10 == null) {
            return z10;
        }
        Iterable<String> h10 = h();
        if (!(h10 instanceof Collection) || !((Collection) h10).isEmpty()) {
            for (String W10 : h10) {
                if (C15854t.W(C10, W10, false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean k(x4.v vVar) {
        v.a aVar = x4.v.f57671k;
        Iterable<C18055d> i10 = i();
        if ((i10 instanceof Collection) && ((Collection) i10).isEmpty()) {
            return false;
        }
        for (C18055d d10 : i10) {
            if (aVar.d(vVar, d10)) {
                return true;
            }
        }
        return false;
    }

    private final boolean l(List<C8948l> list, boolean z10) {
        x4.v e10;
        C8948l lVar = (C8948l) C16877v.K0(list);
        if (lVar == null || (e10 = lVar.e()) == null) {
            return z10;
        }
        return k(e10) || j(e10, z10);
    }

    /* access modifiers changed from: private */
    public final boolean m(boolean z10, List<C8948l> list, List<C8948l> list2) {
        Boolean bool;
        Iterator<a> it = this.f81166b.iterator();
        while (true) {
            if (!it.hasNext()) {
                bool = null;
                break;
            }
            bool = it.next().a(list2, (C8948l) C16877v.K0(list));
            if (bool != null) {
                break;
            }
        }
        return bool != null ? bool.booleanValue() : z10 || l(list2, z10);
    }

    /* access modifiers changed from: private */
    public final boolean n(boolean z10, List<C8948l> list) {
        if (z10) {
            return l(list, z10);
        }
        for (a b10 : this.f81166b) {
            Boolean b11 = b10.b(list);
            if (b11 != null) {
                return b11.booleanValue();
            }
        }
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    public final C16532g<Boolean> g(C8951o oVar) {
        C17542s.j(oVar, "navController");
        return C16534i.L(new a(C16534i.Y(oVar.G(), C16796C.a(oVar.G().getValue(), Boolean.TRUE), new b(this, (C17164e<? super b>) null))), this.f81168d);
    }
}
