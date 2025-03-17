package hD;

import HJ.C15854t;
import QJ.C16320n;
import QJ.C16324p;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.v;
import XH.x;
import cD.C14031c;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import kD.C14674a;
import kD.h;
import kD.i;
import kD.l;
import kD.m;
import kD.n;
import kD.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LcD/c;", "", "forceRefresh", "LkD/h;", "c", "(LcD/c;ZLdI/e;)Ljava/lang/Object;", "LkD/l;", "state", "hadProfilePrior", "LXH/N;", "d", "(LcD/c;LkD/l;Z)V", "useraccount-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: hD.e  reason: case insensitive filesystem */
public final class C14533e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hD.e$a */
    static final class a implements C17642l<Throwable, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14031c f127475a;

        a(C14031c cVar) {
            this.f127475a = cVar;
        }

        public final void a(Throwable th2) {
            C14031c cVar = this.f127475a;
            if (th2 == null) {
                th2 = new Throwable();
            }
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
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = cVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"hD/e$b", "Lkotlin/Function1;", "LkD/l;", "LXH/N;", "Lcom/ingka/ikea/useraccount/model/StateListener;", "state", "a", "(LkD/l;)V", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hD.e$b */
    public static final class b implements C17642l<l, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14031c f127476a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f127477b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16320n<h> f127478c;

        b(C14031c cVar, boolean z10, C16320n<? super h> nVar) {
            this.f127476a = cVar;
            this.f127477b = z10;
            this.f127478c = nVar;
        }

        public void a(l lVar) {
            C17542s.j(lVar, "state");
            if ((lVar instanceof m) || (lVar instanceof C14674a) || (lVar instanceof p) || (lVar instanceof i) || (lVar instanceof n) || (lVar instanceof kD.d)) {
                C14533e.d(this.f127476a, lVar, this.f127477b);
                if (this.f127478c.c()) {
                    C16320n<h> nVar = this.f127478c;
                    x.a aVar = x.f139812b;
                    nVar.resumeWith(x.b(this.f127476a.getProfile().getValue()));
                }
            } else if (!(lVar instanceof kD.e)) {
                throw new t();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((l) obj);
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final Object c(C14031c cVar, boolean z10, C17164e<? super h> eVar) {
        boolean z11 = true;
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        if (cVar.getProfile().getValue() == null) {
            z11 = false;
        }
        cVar.b(z10, new b(cVar, z11, pVar));
        pVar.K(new a(cVar));
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return w10;
    }

    /* access modifiers changed from: private */
    public static final void d(C14031c cVar, l lVar, boolean z10) {
        v vVar;
        l lVar2 = lVar;
        if (lVar2 instanceof m) {
            vVar = C16796C.a("Success", null);
        } else if (lVar2 instanceof kD.e) {
            vVar = C16796C.a("Loading", null);
        } else if (lVar2 instanceof kD.d) {
            kD.d dVar = (kD.d) lVar2;
            vVar = C16796C.a("HttpFailure code: " + dVar.b() + " message: " + dVar.a(), null);
        } else if (lVar2 instanceof i) {
            vVar = C16796C.a("ProfileIncomplete", null);
        } else if (lVar2 instanceof n) {
            n nVar = (n) lVar2;
            vVar = C16796C.a("UnspecifiedFailure: " + nVar.a(), nVar.b());
        } else if (lVar2 instanceof p) {
            vVar = C16796C.a("UserNotLoggedIn", null);
        } else if (lVar2 instanceof C14674a) {
            vVar = C16796C.a("EmailVerificationNeeded", null);
        } else {
            throw new t();
        }
        String str = (String) vVar.a();
        Throwable th2 = (Throwable) vVar.b();
        boolean z11 = cVar.getProfile().getValue() != null;
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Profile state= " + str + " hasProfile= before:" + z10 + " now:" + z11, th2);
                if (a10 != null) {
                    str2 = C11820c.a(a10);
                } else {
                    return;
                }
            } else {
                boolean z12 = z10;
            }
            String str4 = str2;
            if (str3 == null) {
                String name = cVar.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, th2, str4);
            str2 = str4;
            str3 = str5;
        }
    }
}
