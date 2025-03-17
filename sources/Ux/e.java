package Ux;

import HJ.C15854t;
import QJ.C16310i;
import QJ.M;
import QJ.Q;
import XH.C16807N;
import XH.x;
import XH.y;
import com.google.firebase.messaging.FirebaseMessaging;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17170k;
import eI.C17187b;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import xa.C8971l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006H@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LUx/e;", "LUx/b;", "LQJ/M;", "defaultDispatcher", "<init>", "(LQJ/M;)V", "Lkotlin/Function1;", "LXH/x;", "", "LXH/N;", "onResult", "f", "(LnI/l;)V", "b", "()V", "failureReasonHandler", "a", "(LnI/l;LdI/e;)Ljava/lang/Object;", "LQJ/M;", "pushnotification-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final M f117138a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.pushnotification.impl.firebase.FirebaseIntegrationImpl$getFirebaseMessagingToken$2", f = "FirebaseIntegrationImpl.kt", l = {39}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super String>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f117139c;

        /* renamed from: d  reason: collision with root package name */
        Object f117140d;

        /* renamed from: e  reason: collision with root package name */
        int f117141e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f117142f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f117143g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ux.e$a$a  reason: collision with other inner class name */
        static final class C2884a implements C17642l<x<? extends String>, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17164e<String> f117144a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17642l<String, C16807N> f117145b;

            C2884a(C17164e<? super String> eVar, C17642l<? super String, C16807N> lVar) {
                this.f117144a = eVar;
                this.f117145b = lVar;
            }

            public final void a(Object obj) {
                String str;
                if (x.h(obj)) {
                    this.f117144a.resumeWith(obj);
                    return;
                }
                C17642l<String, C16807N> lVar = this.f117145b;
                Throwable e10 = x.e(obj);
                if (e10 == null || (str = e10.getMessage()) == null) {
                    str = "Unknown reason";
                }
                lVar.invoke(str);
                this.f117144a.resumeWith(x.b((Object) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((x) obj).j());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, C17642l<? super String, C16807N> lVar, C17164e<? super a> eVar2) {
            super(2, eVar2);
            this.f117142f = eVar;
            this.f117143g = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f117142f, this.f117143g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super String> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f117141e;
            if (i10 == 0) {
                y.b(obj);
                e eVar = this.f117142f;
                C17642l<String, C16807N> lVar = this.f117143g;
                this.f117139c = eVar;
                this.f117140d = lVar;
                this.f117141e = 1;
                C17170k kVar = new C17170k(C17187b.c(this));
                eVar.f(new C2884a(kVar, lVar));
                obj = kVar.a();
                if (obj == C17187b.f()) {
                    h.c(this);
                }
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C17642l lVar2 = (C17642l) this.f117140d;
                e eVar2 = (e) this.f117139c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public e(M m10) {
        C17542s.j(m10, "defaultDispatcher");
        this.f117138a = m10;
    }

    /* access modifiers changed from: private */
    public final void f(C17642l<? super x<String>, C16807N> lVar) {
        String str;
        char c10;
        String str2;
        C17642l<? super x<String>, C16807N> lVar2 = lVar;
        String str3 = DslKt.INDICATOR_BACKGROUND;
        String str4 = DslKt.INDICATOR_MAIN;
        Class<e> cls = e.class;
        try {
            C17542s.g(FirebaseMessaging.q().t().c(new c(lVar2)));
        } catch (IOException e10) {
            String str5 = str3;
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str6 = null;
            String str7 = null;
            for (C11819b bVar : arrayList) {
                if (str6 == null) {
                    String a10 = C11818a.a("Unable to get fcm token", e10);
                    if (a10 == null) {
                        break;
                    }
                    str6 = C11820c.a(a10);
                }
                if (str7 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    c10 = '$';
                    str = str4;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str : str5) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str = str4;
                    c10 = '$';
                }
                char c11 = c10;
                bVar.a(eVar, str7, false, e10, str6);
                str4 = str;
            }
            x.a aVar = x.f139812b;
            lVar2.invoke(x.a(x.b(y.a(e10))));
        } catch (Throwable th2) {
            qv.e eVar2 = qv.e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str8 = null;
            String str9 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str8 == null) {
                    String a11 = C11818a.a("Unexpected exception. Unable to get fcm token", th2);
                    if (a11 == null) {
                        break;
                    }
                    str8 = C11820c.a(a11);
                }
                if (str9 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    str2 = str3;
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str4 : str2) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    str2 = str3;
                }
                String str10 = str9;
                bVar2.a(eVar2, str10, false, th2, str8);
                str9 = str10;
                eVar2 = eVar2;
                str3 = str2;
            }
            x.a aVar2 = x.f139812b;
            lVar2.invoke(x.a(x.b(y.a(th2))));
        }
    }

    /* access modifiers changed from: private */
    public static final void g(C17642l lVar, C8971l lVar2) {
        C17542s.j(lVar2, "task");
        f.b(lVar2, new d(lVar));
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17642l lVar, x xVar) {
        lVar.invoke(xVar);
        return C16807N.f139792a;
    }

    public Object a(C17642l<? super String, C16807N> lVar, C17164e<? super String> eVar) {
        return C16310i.g(this.f117138a, new a(this, lVar, (C17164e<? super a>) null), eVar);
    }

    public void b() {
        FirebaseMessaging.q().n();
    }
}
