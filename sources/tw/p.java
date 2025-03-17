package tw;

import GK.C15773A;
import GK.C15776D;
import GK.C15777E;
import GK.C15804w;
import GK.C15805x;
import HJ.C15854t;
import QJ.Q;
import XH.C16807N;
import XH.y;
import aA.C13909a;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0015"}, d2 = {"Ltw/p;", "LGK/w;", "LaA/a;", "sessionManager", "Ltw/a;", "tokenHeaders", "<init>", "(LaA/a;Ltw/a;)V", "", "httpCode", "", "b", "(I)Z", "LGK/w$a;", "chain", "LGK/D;", "intercept", "(LGK/w$a;)LGK/D;", "a", "LaA/a;", "Ltw/a;", "networkservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p implements C15804w {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C13909a f56786a;

    /* renamed from: b  reason: collision with root package name */
    private final a f56787b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.networkservice.TokenInterceptor$intercept$2", f = "TokenInterceptor.kt", l = {46}, m = "invokeSuspend")
    static final class a extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f56788c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f56789d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f56789d = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f56789d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f56788c;
            if (i10 == 0) {
                y.b(obj);
                C13909a a10 = this.f56789d.f56786a;
                this.f56788c = 1;
                if (C13909a.C2951a.a(a10, true, false, this, 2, (Object) null) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.networkservice.TokenInterceptor$intercept$5", f = "TokenInterceptor.kt", l = {78}, m = "invokeSuspend")
    static final class b extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f56790c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f56791d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p pVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f56791d = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f56791d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f56790c;
            if (i10 == 0) {
                y.b(obj);
                C13909a a10 = this.f56791d.f56786a;
                this.f56790c = 1;
                if (C13909a.C2951a.a(a10, true, false, this, 2, (Object) null) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.networkservice.TokenInterceptor$intercept$refreshedToken$1", f = "TokenInterceptor.kt", l = {73}, m = "invokeSuspend")
    static final class c extends l implements nI.p<Q, C17164e<? super String>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f56792c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f56793d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(p pVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f56793d = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f56793d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super String> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f56792c;
            if (i10 == 0) {
                y.b(obj);
                C13909a a10 = this.f56793d.f56786a;
                this.f56792c = 1;
                obj = a10.b(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public p(C13909a aVar, a aVar2) {
        C17542s.j(aVar, "sessionManager");
        C17542s.j(aVar2, "tokenHeaders");
        this.f56786a = aVar;
        this.f56787b = aVar2;
    }

    private final boolean b(int i10) {
        return i10 == 401;
    }

    public C15776D intercept(C15804w.a aVar) {
        Iterator it;
        String str;
        String str2;
        C15804w.a aVar2 = aVar;
        C17542s.j(aVar2, "chain");
        String h10 = this.f56786a.h();
        int length = h10.length();
        String str3 = DslKt.INDICATOR_BACKGROUND;
        String str4 = DslKt.INDICATOR_MAIN;
        Class<p> cls = p.class;
        if (length == 0) {
            if (this.f56786a.isLoggedIn()) {
                IllegalStateException illegalStateException = new IllegalStateException();
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str5 = null;
                String str6 = null;
                for (C11819b bVar : arrayList) {
                    if (str5 == null) {
                        String a10 = C11818a.a("Token is empty, but user is logged in. Logging out..", illegalStateException);
                        if (a10 == null) {
                            break;
                        }
                        str5 = C11820c.a(a10);
                    }
                    if (str6 == null) {
                        String name = cls.getName();
                        C17542s.g(name);
                        str2 = str3;
                        str = str4;
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str : str2) + DslKt.INDICATOR_SEPARATOR + name;
                    } else {
                        str2 = str3;
                        str = str4;
                    }
                    bVar.a(eVar, str6, false, illegalStateException, str5);
                    str3 = str2;
                    str4 = str;
                }
                Object unused = C16312j.b((C17168i) null, new a(this, (C17164e<? super a>) null), 1, (Object) null);
            }
            return new C15776D.a().p(C15773A.HTTP_2).m("Missing token").b(C15777E.f134826b.c("{ \"message\": \"Missing token\" }", C15805x.f135130e.b("application/json"))).r(aVar.t()).g(403).c();
        }
        String str7 = str3;
        String str8 = str4;
        C15776D b10 = aVar2.b(this.f56787b.a(aVar.t(), h10));
        if (!b(b10.g())) {
            return b10;
        }
        e eVar2 = e.DEBUG;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str9 = null;
        String str10 = null;
        for (C11819b bVar2 : arrayList2) {
            if (str9 == null) {
                String a11 = C11818a.a("Request forbidden or unauthorized", (Throwable) null);
                if (a11 == null) {
                    break;
                }
                str9 = C11820c.a(a11);
            }
            if (str10 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str8 : str7) + DslKt.INDICATOR_SEPARATOR + name2;
            }
            bVar2.a(eVar2, str10, false, (Throwable) null, str9);
        }
        String str11 = (String) C16312j.b((C17168i) null, new c(this, (C17164e<? super c>) null), 1, (Object) null);
        if (C15854t.v0(str11)) {
            e eVar3 = e.WARN;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str12 = null;
            String str13 = null;
            for (C11819b bVar3 : arrayList3) {
                if (str12 == null) {
                    String a12 = C11818a.a("Refreshing token failed, lets logout.", (Throwable) null);
                    if (a12 == null) {
                        break;
                    }
                    str12 = C11820c.a(a12);
                }
                if (str13 == null) {
                    String name3 = cls.getName();
                    C17542s.g(name3);
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str13 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str8 : str7) + DslKt.INDICATOR_SEPARATOR + name3;
                }
                bVar3.a(eVar3, str13, false, (Throwable) null, str12);
            }
            Object unused2 = C16312j.b((C17168i) null, new b(this, (C17164e<? super b>) null), 1, (Object) null);
            return b10;
        }
        e eVar4 = e.DEBUG;
        ArrayList arrayList4 = new ArrayList();
        for (Object next4 : d.f102012a.a()) {
            if (((C11819b) next4).b(eVar4, false)) {
                arrayList4.add(next4);
            }
        }
        Iterator it2 = arrayList4.iterator();
        String str14 = null;
        String str15 = null;
        while (it2.hasNext()) {
            C11819b bVar4 = (C11819b) it2.next();
            if (str14 == null) {
                String a13 = C11818a.a("Token refreshed, fire request again.", (Throwable) null);
                if (a13 == null) {
                    break;
                }
                str14 = C11820c.a(a13);
            }
            if (str15 == null) {
                String name4 = cls.getName();
                C17542s.g(name4);
                it = it2;
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                str15 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str8 : str7) + DslKt.INDICATOR_SEPARATOR + name4;
            } else {
                it = it2;
            }
            bVar4.a(eVar4, str15, false, (Throwable) null, str14);
            it2 = it;
        }
        C15777E c10 = b10.c();
        if (c10 != null) {
            c10.close();
        }
        return aVar2.b(this.f56787b.a(b10.z(), str11));
    }
}
