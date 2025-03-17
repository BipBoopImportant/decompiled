package mm;

import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import Rx.b;
import XH.t;
import Zx.c;
import am.d;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.s;
import com.ingka.ikea.backinstock.notification.BackInStockNotificationFeature;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import lm.C11550a;
import lm.b;
import mf.C10040b;
import pm.C11759a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import rm.C11832a;
import ug.j;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001BC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u0014J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010'J0\u0010-\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001eH@¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010/\u001a\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u00107R\u0014\u00109\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0014¨\u0006:"}, d2 = {"Lmm/f;", "Llm/a;", "Landroid/content/Context;", "applicationContext", "Lpm/a;", "backInStockPushNotificationsRepository", "Lrm/a;", "backInStockDataStore", "LZx/c;", "pushNotificationRepository", "Lcom/ingka/ikea/backinstock/notification/BackInStockNotificationFeature;", "backInStockNotificationFeature", "Lug/j;", "enabledFeaturesFactory", "Lam/d;", "deviceIntentProvider", "<init>", "(Landroid/content/Context;Lpm/a;Lrm/a;LZx/c;Lcom/ingka/ikea/backinstock/notification/BackInStockNotificationFeature;Lug/j;Lam/d;)V", "", "g", "()Z", "context", "Landroid/content/Intent;", "c", "(Landroid/content/Context;)Landroid/content/Intent;", "b", "Llm/b;", "backInStockError", "Llm/a$c;", "fulfilmentOption", "", "productTitle", "LIC/e;", "a", "(Llm/b;Llm/a$c;Ljava/lang/String;)LIC/e;", "d", "acknowledged", "LXH/N;", "e", "(Z)V", "Llm/a$a;", "contactType", "itemNo", "itemType", "", "f", "(Llm/a$c;Llm/a$a;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "Lpm/a;", "Lrm/a;", "LZx/c;", "Lcom/ingka/ikea/backinstock/notification/BackInStockNotificationFeature;", "Lug/j;", "Lam/d;", "h", "debugSimulatePushRegistrationFailure", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mm.f  reason: case insensitive filesystem */
public final class C11584f implements C11550a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f99609a;

    /* renamed from: b  reason: collision with root package name */
    private final C11759a f99610b;

    /* renamed from: c  reason: collision with root package name */
    private final C11832a f99611c;

    /* renamed from: d  reason: collision with root package name */
    private final c f99612d;

    /* renamed from: e  reason: collision with root package name */
    private final BackInStockNotificationFeature f99613e;

    /* renamed from: f  reason: collision with root package name */
    private final j f99614f;

    /* renamed from: g  reason: collision with root package name */
    private final d f99615g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.backinstock.notification.BackInStockNotification", f = "BackInStockNotification.kt", l = {171, 174}, m = "subscribeForNotification")
    /* renamed from: mm.f$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f99616c;

        /* renamed from: d  reason: collision with root package name */
        Object f99617d;

        /* renamed from: e  reason: collision with root package name */
        Object f99618e;

        /* renamed from: f  reason: collision with root package name */
        Object f99619f;

        /* renamed from: g  reason: collision with root package name */
        Object f99620g;

        /* renamed from: h  reason: collision with root package name */
        Object f99621h;

        /* renamed from: i  reason: collision with root package name */
        Object f99622i;

        /* renamed from: j  reason: collision with root package name */
        Object f99623j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f99624k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C11584f f99625l;

        /* renamed from: m  reason: collision with root package name */
        int f99626m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C11584f fVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f99625l = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f99624k = obj;
            this.f99626m |= Integer.MIN_VALUE;
            return this.f99625l.f((C11550a.c) null, (C11550a.C2253a) null, (String) null, (String) null, this);
        }
    }

    public C11584f(Context context, C11759a aVar, C11832a aVar2, c cVar, BackInStockNotificationFeature backInStockNotificationFeature, j jVar, d dVar) {
        C17542s.j(context, "applicationContext");
        C17542s.j(aVar, "backInStockPushNotificationsRepository");
        C17542s.j(aVar2, "backInStockDataStore");
        C17542s.j(cVar, "pushNotificationRepository");
        C17542s.j(backInStockNotificationFeature, "backInStockNotificationFeature");
        C17542s.j(jVar, "enabledFeaturesFactory");
        C17542s.j(dVar, "deviceIntentProvider");
        this.f99609a = context;
        this.f99610b = aVar;
        this.f99611c = aVar2;
        this.f99612d = cVar;
        this.f99613e = backInStockNotificationFeature;
        this.f99614f = jVar;
        this.f99615g = dVar;
    }

    private final boolean h() {
        return this.f99614f.a().k();
    }

    public C13023e a(b bVar, C11550a.c cVar, String str) {
        C17542s.j(bVar, "backInStockError");
        C17542s.j(cVar, "fulfilmentOption");
        C17542s.j(str, "productTitle");
        if (C17542s.e(bVar, b.d.f99218a)) {
            if (cVar instanceof C11550a.c.C2255a) {
                return C13026h.b(C10040b.f75367j, ((C11550a.c.C2255a) cVar).c());
            }
            if (cVar instanceof C11550a.c.b) {
                return C13026h.b(C10040b.f75367j, ((C11550a.c.b) cVar).c());
            }
            if (cVar instanceof C11550a.c.C2258c) {
                return C13026h.a(C10040b.f75362e);
            }
            throw new t();
        } else if (C17542s.e(bVar, b.c.f99217a)) {
            if (cVar instanceof C11550a.c.C2255a) {
                return C13026h.b(C10040b.f75366i, ((C11550a.c.C2255a) cVar).c());
            }
            if (cVar instanceof C11550a.c.b) {
                return C13026h.b(C10040b.f75366i, ((C11550a.c.b) cVar).c());
            }
            if (cVar instanceof C11550a.c.C2258c) {
                return C13026h.a(C10040b.f75361d);
            }
            throw new t();
        } else if (C17542s.e(bVar, b.C2260b.f99216a)) {
            if (cVar instanceof C11550a.c.b) {
                return C13026h.b(C10040b.f75359b, str, ((C11550a.c.b) cVar).c());
            }
            if (cVar instanceof C11550a.c.C2255a) {
                return C13026h.b(C10040b.f75358a, ((C11550a.c.C2255a) cVar).c());
            }
            if (cVar instanceof C11550a.c.C2258c) {
                return C13026h.a(C10040b.f75360c);
            }
            throw new t();
        } else if (C17542s.e(bVar, b.f.f99220a)) {
            return C13026h.a(C10040b.f75365h);
        } else {
            if (C17542s.e(bVar, b.a.f99215a)) {
                return C13026h.a(C10040b.f75370m);
            }
            if (C17542s.e(bVar, b.e.f99219a)) {
                return C13026h.a(Oo.b.f84398I0);
            }
            throw new t();
        }
    }

    public boolean b() {
        c cVar = this.f99612d;
        return cVar.g() && !cVar.a() && !h();
    }

    public Intent c(Context context) {
        C17542s.j(context, "context");
        s g10 = s.g(context);
        C17542s.i(g10, "from(...)");
        return !g10.a() ? this.f99615g.b() : this.f99615g.a(b.a.a(this.f99613e, (Map) null, 1, (Object) null).a());
    }

    public boolean d() {
        return !this.f99611c.b() || !g();
    }

    public void e(boolean z10) {
        this.f99611c.a(z10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: lm.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: dI.e<? super java.lang.Integer>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(lm.C11550a.c r11, lm.C11550a.C2253a r12, java.lang.String r13, java.lang.String r14, dI.C17164e<? super java.lang.Integer> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof mm.C11584f.a
            if (r0 == 0) goto L_0x0014
            r0 = r15
            mm.f$a r0 = (mm.C11584f.a) r0
            int r1 = r0.f99626m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f99626m = r1
        L_0x0012:
            r7 = r0
            goto L_0x001a
        L_0x0014:
            mm.f$a r0 = new mm.f$a
            r0.<init>(r10, r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r7.f99624k
            java.lang.Object r8 = eI.C17187b.f()
            int r1 = r7.f99626m
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0083
            if (r1 == r3) goto L_0x0057
            if (r1 != r2) goto L_0x004f
            java.lang.Object r11 = r7.f99623j
            lm.a$a r11 = (lm.C11550a.C2253a) r11
            java.lang.Object r11 = r7.f99622i
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r7.f99621h
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r11 = r7.f99620g
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r7.f99619f
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r7.f99618e
            lm.a$a r11 = (lm.C11550a.C2253a) r11
            java.lang.Object r12 = r7.f99617d
            lm.a$c r12 = (lm.C11550a.c) r12
            java.lang.Object r12 = r7.f99616c
            mm.f r12 = (mm.C11584f) r12
            XH.y.b(r0)
            goto L_0x00db
        L_0x004f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0057:
            java.lang.Object r11 = r7.f99622i
            r12 = r11
            lm.a$a r12 = (lm.C11550a.C2253a) r12
            java.lang.Object r11 = r7.f99621h
            r15 = r11
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r11 = r7.f99620g
            r14 = r11
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r11 = r7.f99619f
            r13 = r11
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r11 = r7.f99618e
            lm.a$a r11 = (lm.C11550a.C2253a) r11
            java.lang.Object r1 = r7.f99617d
            lm.a$c r1 = (lm.C11550a.c) r1
            java.lang.Object r3 = r7.f99616c
            mm.f r3 = (mm.C11584f) r3
            XH.y.b(r0)
            r9 = r12
            r12 = r11
            r11 = r1
            r1 = r0
            r0 = r15
            r15 = r14
            r14 = r13
            r13 = r9
            goto L_0x00b5
        L_0x0083:
            XH.y.b(r0)
            boolean r0 = r12 instanceof lm.C11550a.C2253a.C2254a
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = ""
            r3 = r10
            r4 = r13
            r5 = r14
            r6 = r0
            r13 = r12
            goto L_0x00bd
        L_0x0092:
            boolean r0 = r12 instanceof lm.C11550a.C2253a.b
            if (r0 == 0) goto L_0x00f7
            Zx.c r0 = r10.f99612d
            r7.f99616c = r10
            r7.f99617d = r11
            r7.f99618e = r12
            r7.f99619f = r13
            r7.f99620g = r14
            r7.f99621h = r15
            r7.f99622i = r12
            r7.f99626m = r3
            java.lang.Object r0 = r0.d(r7)
            if (r0 != r8) goto L_0x00af
            return r8
        L_0x00af:
            r3 = r10
            r1 = r0
            r0 = r15
            r15 = r14
            r14 = r13
            r13 = r12
        L_0x00b5:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00f4
            r4 = r14
            r5 = r15
            r15 = r0
            r6 = r1
        L_0x00bd:
            pm.a r1 = r3.f99610b
            r7.f99616c = r3
            r7.f99617d = r11
            r7.f99618e = r12
            r7.f99619f = r4
            r7.f99620g = r5
            r7.f99621h = r15
            r7.f99622i = r6
            r7.f99623j = r13
            r7.f99626m = r2
            r2 = r11
            r3 = r12
            java.lang.Object r11 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r11 != r8) goto L_0x00da
            return r8
        L_0x00da:
            r11 = r12
        L_0x00db:
            boolean r12 = r11 instanceof lm.C11550a.C2253a.b
            if (r12 == 0) goto L_0x00e3
            int r11 = mf.C10040b.f75381x
            goto L_0x00e9
        L_0x00e3:
            boolean r11 = r11 instanceof lm.C11550a.C2253a.C2254a
            if (r11 == 0) goto L_0x00ee
            int r11 = mf.C10040b.f75378u
        L_0x00e9:
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.b.e(r11)
            return r11
        L_0x00ee:
            XH.t r11 = new XH.t
            r11.<init>()
            throw r11
        L_0x00f4:
            lm.b$e r11 = lm.b.e.f99219a
            throw r11
        L_0x00f7:
            XH.t r11 = new XH.t
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mm.C11584f.f(lm.a$c, lm.a$a, java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    public boolean g() {
        Iterator it;
        s g10 = s.g(this.f99609a);
        C17542s.i(g10, "from(...)");
        char c10 = '$';
        Class<C11584f> cls = C11584f.class;
        if (!g10.a()) {
            e eVar = e.DEBUG;
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
                    String a10 = C11818a.a("Notifications disabled for package", (Throwable) null);
                    if (a10 == null) {
                        return false;
                    }
                    str = C11820c.a(a10);
                }
                if (str2 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str2, false, (Throwable) null, str);
                c10 = '$';
            }
            return false;
        }
        NotificationChannel i10 = g10.i(b.a.a(this.f99613e, (Map) null, 1, (Object) null).a());
        Integer valueOf = i10 != null ? Integer.valueOf(i10.getImportance()) : null;
        e eVar2 = e.DEBUG;
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : qv.d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str3 = null;
        String str4 = null;
        for (Iterator it2 = arrayList2.iterator(); it2.hasNext(); it2 = it) {
            C11819b bVar2 = (C11819b) it2.next();
            if (str3 == null) {
                String a11 = C11818a.a("Notification channel importance: " + valueOf, (Throwable) null);
                if (a11 == null) {
                    break;
                }
                str3 = C11820c.a(a11);
            }
            if (str4 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                it = it2;
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
            } else {
                it = it2;
            }
            bVar2.a(eVar2, str4, false, (Throwable) null, str3);
        }
        return valueOf == null || valueOf.intValue() != 0;
    }
}
