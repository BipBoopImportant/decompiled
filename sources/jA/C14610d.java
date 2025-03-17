package jA;

import HJ.C15854t;
import TJ.C16519P;
import XH.t;
import android.app.Activity;
import cA.C14018a;
import com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import java.util.ArrayList;
import java.util.Iterator;
import kA.C14662c;
import kA.C14667h;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lA.C14742a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import t7.C8837b;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001,B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H@¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H@¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H@¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\fH@¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u001bH@¢\u0006\u0004\b+\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010/R\"\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f008\u0016X\u0004¢\u0006\f\n\u0004\b+\u00101\u001a\u0004\b,\u00102¨\u00063"}, d2 = {"LjA/d;", "LjA/c;", "LcA/a;", "engineAnalytics", "LjA/a;", "sessionCredentialLocalDataSource", "LkA/c;", "auth0Wrapper", "<init>", "(LcA/a;LjA/a;LkA/c;)V", "", "throwable", "", "i", "(Ljava/lang/Throwable;)Ljava/lang/String;", "Lcom/ingka/ikea/session/impl/usertoken/model/CiamSessionCredentials;", "newCredentials", "j", "(Lcom/ingka/ikea/session/impl/usertoken/model/CiamSessionCredentials;)Ljava/lang/String;", "Landroid/app/Activity;", "activity", "LkA/h$a$a;", "type", "", "k", "(Landroid/app/Activity;LkA/h$a$a;LdI/e;)Ljava/lang/Object;", "error", "LXH/N;", "g", "(Ljava/lang/Throwable;LkA/h$a$a;)V", "credentials", "h", "(Lcom/ingka/ikea/session/impl/usertoken/model/CiamSessionCredentials;LkA/h$a$a;)Z", "success", "l", "(ZLkA/h$a$a;)V", "e", "(Landroid/app/Activity;LdI/e;)Ljava/lang/Object;", "c", "getToken", "()Ljava/lang/String;", "b", "(LdI/e;)Ljava/lang/Object;", "d", "a", "LcA/a;", "LjA/a;", "LkA/c;", "LTJ/P;", "LTJ/P;", "()LTJ/P;", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jA.d  reason: case insensitive filesystem */
public final class C14610d implements C14609c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f127798e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C14018a f127799a;

    /* renamed from: b  reason: collision with root package name */
    private final C14607a f127800b;

    /* renamed from: c  reason: collision with root package name */
    private final C14662c f127801c;

    /* renamed from: d  reason: collision with root package name */
    private final C16519P<CiamSessionCredentials> f127802d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LjA/d$a;", "", "<init>", "()V", "", "AUDIENCE", "Ljava/lang/String;", "SCOPE", "REDIRECT_URI", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jA.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jA.d$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f127803a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                kA.h$a$a[] r0 = kA.C14667h.a.C3170a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kA.h$a$a r1 = kA.C14667h.a.C3170a.LOGIN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kA.h$a$a r1 = kA.C14667h.a.C3170a.SIGN_UP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f127803a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jA.C14610d.b.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.session.impl.usertoken.UserSessionOrchestratorImpl", f = "UserSessionOrchestrator.kt", l = {119}, m = "clearCredentials")
    /* renamed from: jA.d$c */
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f127804c;

        /* renamed from: d  reason: collision with root package name */
        Object f127805d;

        /* renamed from: e  reason: collision with root package name */
        Object f127806e;

        /* renamed from: f  reason: collision with root package name */
        Object f127807f;

        /* renamed from: g  reason: collision with root package name */
        Object f127808g;

        /* renamed from: h  reason: collision with root package name */
        Object f127809h;

        /* renamed from: i  reason: collision with root package name */
        Object f127810i;

        /* renamed from: j  reason: collision with root package name */
        Object f127811j;

        /* renamed from: k  reason: collision with root package name */
        Object f127812k;

        /* renamed from: l  reason: collision with root package name */
        Object f127813l;

        /* renamed from: m  reason: collision with root package name */
        Object f127814m;

        /* renamed from: n  reason: collision with root package name */
        Object f127815n;

        /* renamed from: o  reason: collision with root package name */
        Object f127816o;

        /* renamed from: p  reason: collision with root package name */
        int f127817p;

        /* renamed from: q  reason: collision with root package name */
        int f127818q;

        /* renamed from: r  reason: collision with root package name */
        int f127819r;

        /* renamed from: s  reason: collision with root package name */
        int f127820s;

        /* renamed from: t  reason: collision with root package name */
        /* synthetic */ Object f127821t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ C14610d f127822u;

        /* renamed from: v  reason: collision with root package name */
        int f127823v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C14610d dVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f127822u = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f127821t = obj;
            this.f127823v |= Integer.MIN_VALUE;
            return this.f127822u.d(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.session.impl.usertoken.UserSessionOrchestratorImpl", f = "UserSessionOrchestrator.kt", l = {163}, m = "openAuth0")
    /* renamed from: jA.d$d  reason: collision with other inner class name */
    static final class C3150d extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f127824c;

        /* renamed from: d  reason: collision with root package name */
        Object f127825d;

        /* renamed from: e  reason: collision with root package name */
        Object f127826e;

        /* renamed from: f  reason: collision with root package name */
        Object f127827f;

        /* renamed from: g  reason: collision with root package name */
        Object f127828g;

        /* renamed from: h  reason: collision with root package name */
        Object f127829h;

        /* renamed from: i  reason: collision with root package name */
        Object f127830i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f127831j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C14610d f127832k;

        /* renamed from: l  reason: collision with root package name */
        int f127833l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3150d(C14610d dVar, C17164e<? super C3150d> eVar) {
            super(eVar);
            this.f127832k = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f127831j = obj;
            this.f127833l |= Integer.MIN_VALUE;
            return this.f127832k.k((Activity) null, (C14667h.a.C3170a) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.session.impl.usertoken.UserSessionOrchestratorImpl", f = "UserSessionOrchestrator.kt", l = {106}, m = "refreshToken")
    /* renamed from: jA.d$e */
    static final class e extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f127834c;

        /* renamed from: d  reason: collision with root package name */
        Object f127835d;

        /* renamed from: e  reason: collision with root package name */
        Object f127836e;

        /* renamed from: f  reason: collision with root package name */
        Object f127837f;

        /* renamed from: g  reason: collision with root package name */
        Object f127838g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f127839h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C14610d f127840i;

        /* renamed from: j  reason: collision with root package name */
        int f127841j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C14610d dVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f127840i = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f127839h = obj;
            this.f127841j |= Integer.MIN_VALUE;
            return this.f127840i.b(this);
        }
    }

    public C14610d(C14018a aVar, C14607a aVar2, C14662c cVar) {
        C17542s.j(aVar, "engineAnalytics");
        C17542s.j(aVar2, "sessionCredentialLocalDataSource");
        C17542s.j(cVar, "auth0Wrapper");
        this.f127799a = aVar;
        this.f127800b = aVar2;
        this.f127801c = cVar;
        aVar.d(C14742a.a(aVar2.a().getValue()), false);
        this.f127802d = aVar2.a();
    }

    private final void g(Throwable th2, C14667h.a.C3170a aVar) {
        qv.e eVar = qv.e.WARN;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Failure to log in " + aVar, th2);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = C14610d.class.getName();
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
        if (th2 instanceof C8837b) {
            int i10 = b.f127803a[aVar.ordinal()];
            if (i10 == 1) {
                this.f127799a.g(((C8837b) th2).a());
            } else if (i10 == 2) {
                this.f127799a.b(((C8837b) th2).a());
            } else {
                throw new t();
            }
        } else if (aVar == C14667h.a.C3170a.SIGN_UP) {
            this.f127799a.b("open_signup_failed");
        }
    }

    private final boolean h(CiamSessionCredentials ciamSessionCredentials, C14667h.a.C3170a aVar) {
        boolean c10 = this.f127800b.c(ciamSessionCredentials);
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Success " + aVar + " and saved credentials, it's: " + c10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = C14610d.class.getName();
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
        l(c10, aVar);
        return c10;
    }

    private final String i(Throwable th2) {
        boolean z10;
        char c10;
        Throwable th3 = th2;
        String str = null;
        C8837b bVar = th3 instanceof C8837b ? (C8837b) th3 : null;
        Class<C14610d> cls = C14610d.class;
        int i10 = 2;
        if (bVar != null) {
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar2 : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a("Failed to refresh token with error: " + bVar.b(), bVar);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar2.a(eVar, str5, false, bVar, str4);
                str2 = str4;
                str3 = str5;
                eVar = eVar;
                i10 = 2;
            }
            this.f127799a.h(String.valueOf(bVar.c()));
            return "";
        }
        qv.e eVar2 = qv.e.WARN;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        Iterator it = qv.d.f102012a.a().iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str6 = null;
        String str7 = null;
        for (C11819b bVar3 : arrayList2) {
            if (str6 == null) {
                String a11 = C11818a.a("Failed to refresh token", th3);
                if (a11 == null) {
                    return "";
                }
                str6 = C11820c.a(a11);
            }
            String str8 = str6;
            if (str7 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                c10 = 2;
                String o13 = C15854t.o1(C15854t.s1(name2, '$', str, 2, str), '.', str, 2, str);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
            } else {
                c10 = 2;
            }
            String str9 = str7;
            char c11 = c10;
            bVar3.a(eVar2, str9, z10, th2, str8);
            str6 = str8;
            str7 = str9;
            z10 = z10;
            str = null;
        }
        return "";
    }

    private final String j(CiamSessionCredentials ciamSessionCredentials) {
        char c10;
        char c11;
        String str;
        String str2;
        String a10 = ciamSessionCredentials.a();
        String str3 = DslKt.INDICATOR_BACKGROUND;
        Class<C14610d> cls = C14610d.class;
        if (a10 == null || a10.length() == 0) {
            String str4 = str3;
            this.f127799a.c();
            IllegalStateException illegalStateException = new IllegalStateException("SessionCredentials were invalid");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar : arrayList) {
                if (str5 == null) {
                    String a11 = C11818a.a((String) null, illegalStateException);
                    if (a11 == null) {
                        break;
                    }
                    str5 = C11820c.a(a11);
                }
                if (str6 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    c11 = 2;
                    c10 = '$';
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str4) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    c11 = 2;
                    c10 = '$';
                }
                char c12 = c11;
                char c13 = c10;
                bVar.a(eVar, str6, false, illegalStateException, str5);
            }
            return "";
        }
        boolean c14 = this.f127800b.c(ciamSessionCredentials);
        qv.e eVar2 = qv.e.DEBUG;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : qv.d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str7 = null;
        String str8 = null;
        for (C11819b bVar2 : arrayList2) {
            if (str7 == null) {
                String a12 = C11818a.a("Saved: " + c14, (Throwable) null);
                if (a12 == null) {
                    break;
                }
                str7 = C11820c.a(a12);
            }
            if (str8 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                str2 = a10;
                str = str3;
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
            } else {
                str2 = a10;
                str = str3;
            }
            qv.e eVar3 = eVar2;
            bVar2.a(eVar2, str8, false, (Throwable) null, str7);
            a10 = str2;
            str3 = str;
        }
        String str9 = a10;
        this.f127799a.e();
        return str9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: kA.h$a$a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(android.app.Activity r10, kA.C14667h.a.C3170a r11, dI.C17164e<? super java.lang.Boolean> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof jA.C14610d.C3150d
            if (r0 == 0) goto L_0x0014
            r0 = r12
            jA.d$d r0 = (jA.C14610d.C3150d) r0
            int r1 = r0.f127833l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f127833l = r1
        L_0x0012:
            r7 = r0
            goto L_0x001a
        L_0x0014:
            jA.d$d r0 = new jA.d$d
            r0.<init>(r9, r12)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r7.f127831j
            java.lang.Object r8 = eI.C17187b.f()
            int r1 = r7.f127833l
            r2 = 1
            if (r1 == 0) goto L_0x0056
            if (r1 != r2) goto L_0x004e
            java.lang.Object r10 = r7.f127830i
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            java.lang.Object r10 = r7.f127829h
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r7.f127828g
            kotlin.jvm.internal.V r10 = (kotlin.jvm.internal.V) r10
            java.lang.Object r10 = r7.f127827f
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r7.f127826e
            r11 = r10
            kA.h$a$a r11 = (kA.C14667h.a.C3170a) r11
            java.lang.Object r10 = r7.f127825d
            android.app.Activity r10 = (android.app.Activity) r10
            java.lang.Object r10 = r7.f127824c
            jA.d r10 = (jA.C14610d) r10
            XH.y.b(r0)
            XH.x r0 = (XH.x) r0
            java.lang.Object r12 = r0.j()
            goto L_0x0092
        L_0x004e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0056:
            XH.y.b(r0)
            kA.c r1 = r9.f127801c
            kotlin.jvm.internal.V r0 = kotlin.jvm.internal.V.f144353a
            java.lang.String r3 = r10.getPackageName()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r5 = "https://accounts.ikea.com/android/%s/callback"
            java.lang.String r6 = java.lang.String.format(r5, r4)
            java.lang.String r4 = "format(...)"
            kotlin.jvm.internal.C17542s.i(r6, r4)
            r7.f127824c = r9
            r7.f127825d = r10
            r7.f127826e = r11
            r7.f127827f = r12
            r7.f127828g = r0
            r7.f127829h = r5
            r7.f127830i = r3
            r7.f127833l = r2
            java.lang.String r4 = "https://retail.api.ikea.com"
            java.lang.String r5 = "openid offline_access"
            r2 = r10
            r3 = r11
            java.lang.Object r12 = r1.c(r2, r3, r4, r5, r6, r7)
            if (r12 != r8) goto L_0x0091
            return r8
        L_0x0091:
            r10 = r9
        L_0x0092:
            java.lang.Throwable r0 = XH.x.e(r12)
            if (r0 != 0) goto L_0x00a3
            com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials r12 = (com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials) r12
            boolean r10 = r10.h(r12, r11)
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r10)
            goto L_0x00ab
        L_0x00a3:
            r10.g(r0, r11)
            r10 = 0
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r10)
        L_0x00ab:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: jA.C14610d.k(android.app.Activity, kA.h$a$a, dI.e):java.lang.Object");
    }

    private final void l(boolean z10, C14667h.a.C3170a aVar) {
        if (z10) {
            this.f127799a.d(C14742a.a(a().getValue()), false);
            int i10 = b.f127803a[aVar.ordinal()];
            if (i10 == 1) {
                this.f127799a.a();
            } else if (i10 == 2) {
                this.f127799a.f();
            } else {
                throw new t();
            }
        } else {
            int i11 = b.f127803a[aVar.ordinal()];
            if (i11 == 1) {
                this.f127799a.g("save_credentials_failed");
            } else if (i11 == 2) {
                this.f127799a.b("save_credentials_failed");
            } else {
                throw new t();
            }
        }
    }

    public C16519P<CiamSessionCredentials> a() {
        return this.f127802d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(dI.C17164e<? super java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof jA.C14610d.e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            jA.d$e r0 = (jA.C14610d.e) r0
            int r1 = r0.f127841j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f127841j = r1
            goto L_0x0018
        L_0x0013:
            jA.d$e r0 = new jA.d$e
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f127839h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f127841j
            r4 = 1
            if (r3 == 0) goto L_0x004b
            if (r3 != r4) goto L_0x0043
            java.lang.Object r7 = r0.f127838g
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f127837f
            com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials r7 = (com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials) r7
            java.lang.Object r7 = r0.f127836e
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f127835d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f127834c
            jA.d r7 = (jA.C14610d) r7
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r0 = r1.j()
            goto L_0x0077
        L_0x0043:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x004b:
            XH.y.b(r1)
            TJ.P r1 = r6.a()
            java.lang.Object r1 = r1.getValue()
            com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials r1 = (com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials) r1
            if (r1 == 0) goto L_0x0089
            java.lang.String r3 = r1.f()
            if (r3 != 0) goto L_0x0061
            goto L_0x0089
        L_0x0061:
            kA.c r5 = r6.f127801c
            r0.f127834c = r6
            r0.f127835d = r7
            r0.f127836e = r3
            r0.f127837f = r1
            r0.f127838g = r3
            r0.f127841j = r4
            java.lang.Object r0 = r5.a(r3, r0)
            if (r0 != r2) goto L_0x0076
            return r2
        L_0x0076:
            r7 = r6
        L_0x0077:
            java.lang.Throwable r1 = XH.x.e(r0)
            if (r1 != 0) goto L_0x0084
            com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials r0 = (com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials) r0
            java.lang.String r7 = r7.j(r0)
            goto L_0x0088
        L_0x0084:
            java.lang.String r7 = r7.i(r1)
        L_0x0088:
            return r7
        L_0x0089:
            java.lang.String r7 = ""
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jA.C14610d.b(dI.e):java.lang.Object");
    }

    public Object c(Activity activity, C17164e<? super Boolean> eVar) {
        return k(activity, C14667h.a.C3170a.SIGN_UP, eVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(dI.C17164e<? super XH.C16807N> r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            boolean r2 = r1 instanceof jA.C14610d.c
            if (r2 == 0) goto L_0x0017
            r2 = r1
            jA.d$c r2 = (jA.C14610d.c) r2
            int r3 = r2.f127823v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f127823v = r3
            goto L_0x001c
        L_0x0017:
            jA.d$c r2 = new jA.d$c
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f127821t
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f127823v
            java.lang.String r6 = "|"
            java.lang.String r7 = "b"
            java.lang.String r8 = "m"
            java.lang.String r9 = "main"
            java.lang.String r10 = "Kt"
            java.lang.Class<jA.d> r13 = jA.C14610d.class
            r15 = 1
            r11 = 0
            if (r5 == 0) goto L_0x0079
            if (r5 != r15) goto L_0x0071
            java.lang.Object r1 = r2.f127815n
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r2.f127814m
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r2.f127813l
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f127812k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f127811j
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r2.f127810i
            jA.d r1 = (jA.C14610d) r1
            java.lang.Object r1 = r2.f127809h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f127808g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f127807f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f127806e
            com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials r1 = (com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials) r1
            java.lang.Object r1 = r2.f127805d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f127804c
            jA.d r1 = (jA.C14610d) r1
            XH.y.b(r3)
            r23 = r7
            r24 = r8
            r25 = r13
            goto L_0x0189
        L_0x0071:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0079:
            XH.y.b(r3)
            qv.e r3 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x008f:
            boolean r16 = r5.hasNext()
            if (r16 == 0) goto L_0x00a6
            java.lang.Object r12 = r5.next()
            r14 = r12
            qv.b r14 = (qv.C11819b) r14
            boolean r14 = r14.b(r3, r11)
            if (r14 == 0) goto L_0x008f
            r15.add(r12)
            goto L_0x008f
        L_0x00a6:
            java.util.Iterator r5 = r15.iterator()
            r16 = r15
            r12 = 0
            r14 = 0
        L_0x00ae:
            boolean r17 = r5.hasNext()
            if (r17 == 0) goto L_0x013f
            java.lang.Object r22 = r5.next()
            r16 = r22
            qv.b r16 = (qv.C11819b) r16
            r11 = 0
            r23 = r7
            if (r12 != 0) goto L_0x00d5
            java.lang.String r7 = "clearCredentials"
            java.lang.String r7 = qv.C11818a.a(r7, r11)
            if (r7 != 0) goto L_0x00d1
            r24 = r8
            r25 = r13
            r7 = r22
            goto L_0x0147
        L_0x00d1:
            java.lang.String r12 = qv.C11820c.a(r7)
        L_0x00d5:
            if (r14 != 0) goto L_0x0122
            java.lang.String r7 = r13.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r24 = r8
            r25 = r13
            r8 = 0
            r11 = 2
            r14 = 36
            java.lang.String r13 = HJ.C15854t.s1(r7, r14, r8, r11, r8)
            r14 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r14, r8, r11, r8)
            int r8 = r13.length()
            if (r8 != 0) goto L_0x00f7
            goto L_0x00fb
        L_0x00f7:
            java.lang.String r7 = HJ.C15854t.P0(r13, r10)
        L_0x00fb:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            r11 = 1
            boolean r8 = HJ.C15854t.b0(r8, r9, r11)
            if (r8 == 0) goto L_0x010d
            r8 = r24
            goto L_0x010f
        L_0x010d:
            r8 = r23
        L_0x010f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r8)
            r11.append(r6)
            r11.append(r7)
            java.lang.String r14 = r11.toString()
            goto L_0x0126
        L_0x0122:
            r24 = r8
            r25 = r13
        L_0x0126:
            r19 = 0
            r17 = r3
            r18 = r14
            r7 = 0
            r20 = r7
            r21 = r12
            r16.a(r17, r18, r19, r20, r21)
            r16 = r22
            r7 = r23
            r8 = r24
            r13 = r25
            r11 = 0
            goto L_0x00ae
        L_0x013f:
            r23 = r7
            r24 = r8
            r25 = r13
            r7 = r16
        L_0x0147:
            TJ.P r8 = r26.a()
            java.lang.Object r8 = r8.getValue()
            com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials r8 = (com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials) r8
            if (r8 == 0) goto L_0x0188
            java.lang.String r11 = r8.f()
            if (r11 == 0) goto L_0x0188
            kA.c r13 = r0.f127801c
            r2.f127804c = r0
            r2.f127805d = r1
            r2.f127806e = r8
            r2.f127807f = r11
            r2.f127808g = r11
            r2.f127809h = r11
            r2.f127810i = r0
            r2.f127811j = r3
            r2.f127812k = r12
            r2.f127813l = r14
            r2.f127814m = r15
            r2.f127815n = r5
            r2.f127816o = r7
            r1 = 0
            r2.f127817p = r1
            r2.f127818q = r1
            r2.f127819r = r1
            r2.f127820s = r1
            r1 = 1
            r2.f127823v = r1
            java.lang.Object r1 = r13.b(r11, r2)
            if (r1 != r4) goto L_0x0188
            return r4
        L_0x0188:
            r1 = r0
        L_0x0189:
            jA.a r2 = r1.f127800b
            r2.b()
            cA.a r1 = r1.f127799a
            aA.b r2 = aA.C13910b.GUEST
            r3 = 1
            r1.d(r2, r3)
            qv.e r1 = qv.e.DEBUG
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x01a9:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = r2.next()
            r5 = r4
            qv.b r5 = (qv.C11819b) r5
            r7 = 0
            boolean r5 = r5.b(r1, r7)
            if (r5 == 0) goto L_0x01a9
            r3.add(r4)
            goto L_0x01a9
        L_0x01c1:
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
            r8 = 0
        L_0x01c7:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0244
            java.lang.Object r4 = r2.next()
            r16 = r4
            qv.b r16 = (qv.C11819b) r16
            r4 = 0
            if (r8 != 0) goto L_0x01e6
            java.lang.String r5 = "finished clearCredentials"
            java.lang.String r5 = qv.C11818a.a(r5, r4)
            if (r5 != 0) goto L_0x01e1
            goto L_0x0244
        L_0x01e1:
            java.lang.String r5 = qv.C11820c.a(r5)
            r8 = r5
        L_0x01e6:
            if (r3 != 0) goto L_0x022f
            java.lang.String r3 = r25.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r5 = 36
            r7 = 2
            r11 = 0
            java.lang.String r12 = HJ.C15854t.s1(r3, r5, r11, r7, r11)
            r13 = 46
            java.lang.String r12 = HJ.C15854t.o1(r12, r13, r11, r7, r11)
            int r14 = r12.length()
            if (r14 != 0) goto L_0x0204
            goto L_0x0208
        L_0x0204:
            java.lang.String r3 = HJ.C15854t.P0(r12, r10)
        L_0x0208:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            java.lang.String r12 = r12.getName()
            r14 = 1
            boolean r12 = HJ.C15854t.b0(r12, r9, r14)
            if (r12 == 0) goto L_0x021a
            r12 = r24
            goto L_0x021c
        L_0x021a:
            r12 = r23
        L_0x021c:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r12)
            r15.append(r6)
            r15.append(r3)
            java.lang.String r3 = r15.toString()
            goto L_0x0236
        L_0x022f:
            r5 = 36
            r7 = 2
            r11 = 0
            r13 = 46
            r14 = 1
        L_0x0236:
            r19 = 0
            r17 = r1
            r18 = r3
            r20 = r4
            r21 = r8
            r16.a(r17, r18, r19, r20, r21)
            goto L_0x01c7
        L_0x0244:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jA.C14610d.d(dI.e):java.lang.Object");
    }

    public Object e(Activity activity, C17164e<? super Boolean> eVar) {
        return k(activity, C14667h.a.C3170a.LOGIN, eVar);
    }

    public String getToken() {
        CiamSessionCredentials value = a().getValue();
        if (value == null || !value.h()) {
            return "";
        }
        String a10 = value.a();
        C17542s.g(a10);
        return a10;
    }
}
