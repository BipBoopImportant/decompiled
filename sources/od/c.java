package Od;

import HJ.C15854t;
import IE.e;
import Nd.a;
import Nd.c;
import Od.d;
import XH.C16796C;
import XH.t;
import XH.v;
import YH.C16877v;
import YH.X;
import android.content.Context;
import com.optimizely.ab.d;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import xE.C15211a;
import xE.C15216f;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0001DB5\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020 0\u00182\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0011H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010%J1\u0010-\u001a\u00020,2\u0006\u0010(\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010\u00162\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u0016H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\u00112\u0006\u00100\u001a\u00020/2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b1\u00102J)\u00108\u001a\u00028\u0000\"\b\b\u0000\u00104*\u0002032\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020,H\u0016¢\u0006\u0004\b8\u00109J?\u0010=\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u00162\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00190\u00182\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b?\u0010@J/\u0010D\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010A\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bD\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010IR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u0010JR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010KR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010NR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010PR\"\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00190R8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010VR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010ZR\u0014\u0010^\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006_"}, d2 = {"LOd/c;", "LOd/a;", "LNd/c;", "Landroid/content/Context;", "context", "LxE/f;", "optimizelyManager", "LOd/d;", "decisionResultCreator", "LPd/a;", "abTestingAnalytics", "LIl/a;", "appConfigApi", "<init>", "(Landroid/content/Context;LxE/f;LOd/d;LPd/a;LIl/a;)V", "LOd/d$a$b;", "failure", "LXH/N;", "n", "(LOd/d$a$b;)V", "", "totalPrice", "", "transactionId", "", "", "i", "(DLjava/lang/String;)Ljava/util/Map;", "LOd/d$a$a;", "data", "o", "(LOd/d$a$a;)V", "", "value", "j", "(I)Ljava/util/Map;", "l", "()V", "b", "stop", "appVersion", "marketCode", "userId", "userType", "", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "LNd/b;", "parameter", "d", "(LNd/b;Ljava/lang/Object;)V", "LNd/a$a;", "T", "LNd/a;", "abTest", "bucketUser", "c", "(LNd/a;Z)LNd/a$a;", "eventName", "customAttributes", "eventTags", "f", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "e", "(Ljava/lang/String;I)V", "uniqueItemsSold", "LNd/c$b;", "purchaseMethod", "a", "(DILjava/lang/String;LNd/c$b;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "LxE/f;", "LOd/d;", "LPd/a;", "LIl/a;", "Lcom/optimizely/ab/d;", "Lcom/optimizely/ab/d;", "userContext", "Ljava/lang/String;", "_user", "", "h", "Ljava/util/Map;", "defaultUserAttributes", "Z", "isInitializing", "", "LOd/g;", "Ljava/util/List;", "queuedEvents", "k", "()Ljava/lang/String;", "user", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements a, Nd.c {

    /* renamed from: k  reason: collision with root package name */
    public static final a f62125k = new a((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    private static final List<e> f62126l;

    /* renamed from: m  reason: collision with root package name */
    private static final List<e> f62127m;

    /* renamed from: a  reason: collision with root package name */
    private final Context f62128a;

    /* renamed from: b  reason: collision with root package name */
    private final C15216f f62129b;

    /* renamed from: c  reason: collision with root package name */
    private final d f62130c;

    /* renamed from: d  reason: collision with root package name */
    private final Pd.a f62131d;

    /* renamed from: e  reason: collision with root package name */
    private final Il.a f62132e;

    /* renamed from: f  reason: collision with root package name */
    private d f62133f;

    /* renamed from: g  reason: collision with root package name */
    private String f62134g;

    /* renamed from: h  reason: collision with root package name */
    private Map<String, Object> f62135h = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f62136i;

    /* renamed from: j  reason: collision with root package name */
    private final List<g> f62137j = new ArrayList();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"LOd/c$a;", "", "<init>", "()V", "", "DEFAULT_PARAM_APP_VERSION", "Ljava/lang/String;", "DEFAULT_PARAM_MARKET", "DEFAULT_PARAM_PLATFORM", "DEFAULT_PARAM_USER_TYPE", "ANDROID", "", "LIE/e;", "noBucketingOptions", "Ljava/util/List;", "bucketedOptions", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f62138a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                Nd.c$b[] r0 = Nd.c.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nd.c$b r1 = Nd.c.b.ONLINE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Nd.c$b r1 = Nd.c.b.SHOP_GO     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f62138a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Od.c.b.<clinit>():void");
        }
    }

    static {
        e eVar = e.DISABLE_DECISION_EVENT;
        e eVar2 = e.INCLUDE_REASONS;
        f62126l = C16877v.q(eVar, eVar2);
        f62127m = C16877v.e(eVar2);
    }

    public c(Context context, C15216f fVar, d dVar, Pd.a aVar, Il.a aVar2) {
        C17542s.j(context, "context");
        C17542s.j(fVar, "optimizelyManager");
        C17542s.j(dVar, "decisionResultCreator");
        C17542s.j(aVar, "abTestingAnalytics");
        C17542s.j(aVar2, "appConfigApi");
        this.f62128a = context;
        this.f62129b = fVar;
        this.f62130c = dVar;
        this.f62131d = aVar;
        this.f62132e = aVar2;
    }

    private final Map<String, Object> i(double d10, String str) {
        return X.m(C16796C.a("revenue", Integer.valueOf((int) (d10 * ((double) 100)))), C16796C.a("transactionId", str));
    }

    private final Map<String, Integer> j(int i10) {
        return X.f(C16796C.a("value", Integer.valueOf(i10)));
    }

    private final String k() {
        String str = this.f62134g;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void l() {
        Iterator<g> it = this.f62137j.iterator();
        while (it.hasNext()) {
            g next = it.next();
            f(next.b(), next.c(), next.a());
            it.remove();
        }
    }

    /* access modifiers changed from: private */
    public static final void m(C15216f fVar, c cVar, C15211a aVar) {
        String str;
        int i10;
        c cVar2 = cVar;
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        d dVar = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            i10 = 2;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("initialized", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = fVar.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str3 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str3 = str5;
            str2 = str4;
        }
        if (!aVar.i()) {
            qv.e eVar2 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str6 = null;
            String str7 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str6 == null) {
                    String a11 = C11818a.a("You probably haven't added the optimizelyDebugKey in developerKeys.gradle", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str6 = C11820c.a(a11);
                }
                if (str7 == null) {
                    String name2 = fVar.getClass().getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str7, false, (Throwable) null, str6);
                i10 = 2;
            }
        }
        cVar2.f62136i = false;
        C15211a aVar2 = aVar.i() ? aVar : null;
        if (aVar2 != null) {
            dVar = aVar2.a(cVar.k(), cVar2.f62135h);
        }
        cVar2.f62133f = dVar;
        cVar.l();
    }

    private final void n(d.a.b bVar) {
        char c10;
        char c11;
        d.a.b bVar2 = bVar;
        Class<c> cls = c.class;
        if (bVar2 instanceof d.a.b.c) {
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar3 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Retrieved decision was considered invalid, is it enabled?  " + ((d.a.b.c) bVar2).a(), (Throwable) null);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar3.a(eVar, str4, false, (Throwable) null, str3);
                str2 = str4;
                str = str3;
            }
        } else if (C17542s.e(bVar2, d.a.b.C1053d.f62145a)) {
            qv.e eVar2 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar4 : arrayList2) {
                if (str5 == null) {
                    String a11 = C11818a.a("No OptimizelyUserContext available, check initiation order", (Throwable) null);
                    if (a11 != null) {
                        str5 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                if (str6 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar4.a(eVar2, str6, false, (Throwable) null, str5);
            }
        } else if (bVar2 instanceof d.a.b.C1051a) {
            qv.e eVar3 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : qv.d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar5 : arrayList3) {
                if (str7 == null) {
                    String a12 = C11818a.a(((d.a.b.C1051a) bVar2).a(), (Throwable) null);
                    if (a12 != null) {
                        str7 = C11820c.a(a12);
                    } else {
                        return;
                    }
                }
                if (str8 == null) {
                    String name3 = cls.getName();
                    C17542s.g(name3);
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name3;
                }
                bVar5.a(eVar3, str8, false, (Throwable) null, str7);
            }
        } else if (C17542s.e(bVar2, d.a.b.C1052b.f62143a)) {
            qv.e eVar4 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList4 = new ArrayList<>();
            for (Object next4 : qv.d.f102012a.a()) {
                if (((C11819b) next4).b(eVar4, false)) {
                    arrayList4.add(next4);
                }
            }
            String str9 = null;
            String str10 = null;
            for (C11819b bVar6 : arrayList4) {
                if (str9 == null) {
                    String a13 = C11818a.a("Experiment contained illegal variant key", (Throwable) null);
                    if (a13 != null) {
                        str9 = C11820c.a(a13);
                    } else {
                        return;
                    }
                }
                if (str10 == null) {
                    String name4 = cls.getName();
                    C17542s.g(name4);
                    c11 = 2;
                    c10 = '$';
                    String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o15.length() != 0) {
                        name4 = C15854t.P0(o15, "Kt");
                    }
                    str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name4;
                } else {
                    c11 = 2;
                    c10 = '$';
                }
                char c12 = c11;
                char c13 = c10;
                bVar6.a(eVar4, str10, false, (Throwable) null, str9);
            }
        } else {
            throw new t();
        }
    }

    private final void o(d.a.C1050a aVar) {
        this.f62131d.b(aVar.a(), aVar.b(), aVar.c());
    }

    public void a(double d10, int i10, String str, c.b bVar) {
        v vVar;
        C17542s.j(str, "transactionId");
        C17542s.j(bVar, "purchaseMethod");
        int i11 = b.f62138a[bVar.ordinal()];
        if (i11 == 1) {
            vVar = C16796C.a("purchase", "items_sold");
        } else if (i11 == 2) {
            vVar = C16796C.a("shopgo_purchase", "shopgo_items_sold");
        } else {
            throw new t();
        }
        String str2 = (String) vVar.a();
        c.a.a(this, str2, (Map) null, i(this.f62132e.s().a() * d10, str), 2, (Object) null);
        String i12 = this.f62132e.i();
        c.a.a(this, str2 + "_" + i12, (Map) null, i(d10, str), 2, (Object) null);
        c.a.a(this, (String) vVar.b(), (Map) null, j(i10), 2, (Object) null);
    }

    public void b() {
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
                String a10 = C11818a.a("initialize", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = c.class.getName();
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
        this.f62136i = true;
        C15216f fVar = this.f62129b;
        fVar.o(this.f62128a, (Integer) null, new b(fVar, this));
    }

    public <T extends a.C1042a> T c(Nd.a aVar, boolean z10) {
        C17542s.j(aVar, "abTest");
        List<e> list = f62127m;
        if (!z10) {
            list = null;
        }
        if (list == null) {
            list = f62126l;
        }
        d.a a10 = this.f62130c.a(this.f62133f, aVar, list);
        if (a10 instanceof d.a.c) {
            if (z10) {
                o(((d.a.c) a10).a());
            }
            T b10 = aVar.b(((d.a.c) a10).a().c());
            C17542s.h(b10, "null cannot be cast to non-null type T of com.ingka.ikea.abtesting.impl.ABTestingTool.getVariant");
            return b10;
        } else if (a10 instanceof d.a.b) {
            n((d.a.b) a10);
            T b11 = aVar.b((String) null);
            C17542s.h(b11, "null cannot be cast to non-null type T of com.ingka.ikea.abtesting.impl.ABTestingTool.getVariant");
            return b11;
        } else {
            throw new t();
        }
    }

    public void d(Nd.b bVar, Object obj) {
        C17542s.j(bVar, "parameter");
        C17542s.j(obj, "value");
        this.f62135h.put(bVar.b(), obj);
        com.optimizely.ab.d dVar = this.f62133f;
        if (dVar != null) {
            dVar.g(bVar.b(), obj);
        }
    }

    public void e(String str, int i10) {
        C17542s.j(str, "eventName");
        c.a.a(this, str, (Map) null, j(i10), 2, (Object) null);
    }

    public void f(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        String str2;
        String str3;
        String str4 = str;
        Map<String, ? extends Object> map3 = map;
        Map<String, ? extends Object> map4 = map2;
        C17542s.j(str4, "eventName");
        C17542s.j(map3, "customAttributes");
        C17542s.j(map4, "eventTags");
        O o10 = new O();
        o10.f144348a = map4;
        boolean z10 = this.f62136i;
        String str5 = DslKt.INDICATOR_BACKGROUND;
        String str6 = DslKt.INDICATOR_MAIN;
        Class<c> cls = c.class;
        if (z10) {
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar : arrayList) {
                if (str7 == null) {
                    String a10 = C11818a.a("initializing, queue event", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str7 = C11820c.a(a10);
                }
                if (str8 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    str3 = str5;
                    str2 = str6;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str2 : str3) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str3 = str5;
                    str2 = str6;
                }
                bVar.a(eVar, str8, false, (Throwable) null, str7);
                str5 = str3;
                str6 = str2;
            }
            this.f62137j.add(new g(str4, map3, (Map) o10.f144348a));
            return;
        }
        String str9 = str5;
        String str10 = str6;
        com.optimizely.ab.d dVar = this.f62133f;
        if (dVar != null) {
            Map<String, Object> z11 = X.z(this.f62135h);
            z11.putAll(map3);
            dVar.h(str4, (Map) o10.f144348a);
            qv.e eVar2 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str11 = null;
            String str12 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str11 == null) {
                    String a11 = C11818a.a("Send optimizely event. eventName: " + str4 + ", eventTags: " + o10.f144348a, (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str11 = C11820c.a(a11);
                }
                if (str12 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str12 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str10 : str9) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str12, false, (Throwable) null, str11);
            }
            Object obj = ((Map) o10.f144348a).get("$opt_event_properties");
            if (obj != null) {
                Map c10 = X.c();
                c10.putAll((Map) o10.f144348a);
                c10.remove("$opt_event_properties");
                c10.put(C15854t.Q("$opt_event_properties", "$", "", false, 4, (Object) null), obj);
                o10.f144348a = X.b(c10);
            }
            this.f62131d.a(str4, X.s((Map) o10.f144348a, z11));
            return;
        }
        qv.e eVar3 = qv.e.DEBUG;
        ArrayList<C11819b> arrayList3 = new ArrayList<>();
        for (Object next3 : qv.d.f102012a.a()) {
            if (((C11819b) next3).b(eVar3, false)) {
                arrayList3.add(next3);
            }
        }
        String str13 = null;
        String str14 = null;
        for (C11819b bVar3 : arrayList3) {
            if (str13 == null) {
                String a12 = C11818a.a("client not valid, cannot track event", (Throwable) null);
                if (a12 != null) {
                    str13 = C11820c.a(a12);
                } else {
                    return;
                }
            }
            if (str14 == null) {
                String name3 = cls.getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str14 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str10 : str9) + DslKt.INDICATOR_SEPARATOR + name3;
            }
            bVar3.a(eVar3, str14, false, (Throwable) null, str13);
        }
    }

    public boolean g(String str, String str2, String str3, String str4) {
        C17542s.j(str, "appVersion");
        C17542s.j(str3, "userId");
        C17542s.j(str4, "userType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("app_version", str);
        linkedHashMap.put("platform", "android");
        linkedHashMap.put("user_type", str4);
        if (str2 != null) {
            linkedHashMap.put("market", str2);
        }
        boolean z10 = !C17542s.e(this.f62135h, linkedHashMap) || !C17542s.e(this.f62134g, str3);
        if (z10) {
            this.f62134g = str3;
            this.f62135h = linkedHashMap;
        }
        return z10;
    }

    public void stop() {
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
                String a10 = C11818a.a("stop", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = c.class.getName();
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
        this.f62136i = false;
        this.f62137j.clear();
        this.f62129b.x(this.f62128a);
        this.f62134g = null;
        this.f62133f = null;
        this.f62135h = new LinkedHashMap();
    }
}
