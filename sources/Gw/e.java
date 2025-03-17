package gw;

import HJ.C15854t;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import YH.X;
import Zj.g;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.sugarcube.core.logger.DslKt;
import cw.f;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import nI.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f0\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f0\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010\"\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\"\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*R&\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010*R&\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010*R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007018\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u00102R\"\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010*R\"\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f0\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u00105R\"\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f0\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00105¨\u00069"}, d2 = {"Lgw/e;", "Lgw/d;", "LZj/g;", "storage", "<init>", "(LZj/g;)V", "", "", "", "m", "()Ljava/util/Map;", "LTJ/B;", "", "Lcw/a;", "l", "()LTJ/B;", "LTJ/g;", "Lcw/b;", "c", "()LTJ/g;", "Lcw/f;", "a", "Lfw/c;", "newMessages", "LXH/N;", "e", "(Lfw/c;)V", "d", "()V", "f", "i", "id", "", "reset", "h", "(Ljava/lang/String;Z)V", "Lcw/e;", "type", "g", "(Lcw/e;)V", "LZj/g;", "b", "LTJ/B;", "alertMessages", "commercialMessages", "", "currentTime", "displayedCount", "displayCountWhatsNew", "", "Ljava/util/Map;", "messageReceivedHistory", "whatsNewMessages", "LTJ/g;", "currentWhatsNewMessages", "j", "currentCommercialMessages", "messagecenter-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final g f73474a;

    /* renamed from: b  reason: collision with root package name */
    private final C16505B<List<cw.a>> f73475b = C16521S.a(null);

    /* renamed from: c  reason: collision with root package name */
    private final C16505B<List<cw.b>> f73476c;

    /* renamed from: d  reason: collision with root package name */
    private final C16505B<Long> f73477d;

    /* renamed from: e  reason: collision with root package name */
    private final C16505B<Map<String, Integer>> f73478e;

    /* renamed from: f  reason: collision with root package name */
    private final C16505B<Map<String, Integer>> f73479f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, String> f73480g;

    /* renamed from: h  reason: collision with root package name */
    private final C16505B<List<f>> f73481h;

    /* renamed from: i  reason: collision with root package name */
    private final C16532g<List<f>> f73482i;

    /* renamed from: j  reason: collision with root package name */
    private final C16532g<List<cw.b>> f73483j;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f73484a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                cw.e[] r0 = cw.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                cw.e r1 = cw.e.ALERT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                cw.e r1 = cw.e.COMMERCIAL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                cw.e r1 = cw.e.WHATS_NEW     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f73484a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gw.e.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lcw/b;", "messages", "", "time", "", "", "", "displayCountMap", "<anonymous>", "(Ljava/util/List;JLjava/util/Map;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.messagecenter.impl.data.source.MessageLocalSourceImpl$currentCommercialMessages$1", f = "MessageLocalSource.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements r<List<? extends cw.b>, Long, Map<String, ? extends Integer>, C17164e<? super List<? extends cw.b>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73485c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f73486d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ long f73487e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f73488f;

        b(C17164e<? super b> eVar) {
            super(4, eVar);
        }

        public final Object i(List<cw.b> list, long j10, Map<String, Integer> map, C17164e<? super List<cw.b>> eVar) {
            b bVar = new b(eVar);
            bVar.f73486d = list;
            bVar.f73487e = j10;
            bVar.f73488f = map;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f73485c == 0) {
                y.b(obj);
                List list = (List) this.f73486d;
                long j10 = this.f73487e;
                Map map = (Map) this.f73488f;
                if (list == null) {
                    return null;
                }
                Iterable<cw.b> iterable = list;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (cw.b bVar : iterable) {
                    Integer num = (Integer) map.get(bVar.f());
                    arrayList.add(cw.b.b(bVar, (String) null, (String) null, 0, (String) null, (cw.c) null, (Long) null, (Long) null, (List) null, (List) null, false, false, num != null ? num.intValue() : 0, 2047, (Object) null));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object next : arrayList) {
                    cw.b bVar2 = (cw.b) next;
                    Long h10 = bVar2.h();
                    if ((h10 != null ? h10.longValue() : Long.MIN_VALUE) <= j10) {
                        Long d10 = bVar2.d();
                        if ((d10 != null ? d10.longValue() : Long.MAX_VALUE) >= j10) {
                            arrayList2.add(next);
                        }
                    }
                }
                return arrayList2;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i((List) obj, ((Number) obj2).longValue(), (Map) obj3, (C17164e) obj4);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcw/f;", "messages", "", "", "", "displayCountMap", "<anonymous>", "(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.messagecenter.impl.data.source.MessageLocalSourceImpl$currentWhatsNewMessages$1", f = "MessageLocalSource.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements q<List<? extends f>, Map<String, ? extends Integer>, C17164e<? super List<? extends f>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73489c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f73490d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f73491e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f73492f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar, C17164e<? super c> eVar2) {
            super(3, eVar2);
            this.f73492f = eVar;
        }

        /* renamed from: i */
        public final Object invoke(List<f> list, Map<String, Integer> map, C17164e<? super List<f>> eVar) {
            c cVar = new c(this.f73492f, eVar);
            cVar.f73490d = list;
            cVar.f73491e = map;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f73489c == 0) {
                y.b(obj);
                List list = (List) this.f73490d;
                Map map = (Map) this.f73491e;
                ArrayList arrayList = null;
                if (list != null) {
                    Iterable<f> iterable = list;
                    e eVar = this.f73492f;
                    ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
                    for (f fVar : iterable) {
                        String str = (String) eVar.f73480g.get(fVar.e());
                        Long f10 = str != null ? kotlin.coroutines.jvm.internal.b.f(Long.parseLong(str)) : null;
                        if (f10 == null) {
                            eVar.f73480g.put(fVar.e(), String.valueOf(fVar.j()));
                        }
                        Integer num = (Integer) map.get(fVar.e());
                        arrayList2.add(f.b(fVar, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, num != null ? num.intValue() : 0, f10 != null ? f10.longValue() : fVar.j(), (String) null, (String) null, 1663, (Object) null));
                    }
                    arrayList = arrayList2;
                }
                e eVar2 = this.f73492f;
                eVar2.f73474a.c("MessageReceived", eVar2.f73480g);
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public e(g gVar) {
        C17542s.j(gVar, PlaceTypes.STORAGE);
        this.f73474a = gVar;
        C16505B<List<cw.b>> a10 = C16521S.a(null);
        this.f73476c = a10;
        C16505B<Long> a11 = C16521S.a(Long.valueOf(System.currentTimeMillis()));
        this.f73477d = a11;
        C16505B<Map<String, Integer>> a12 = C16521S.a(m());
        this.f73478e = a12;
        C16505B<Map<String, Integer>> a13 = C16521S.a(m());
        this.f73479f = a13;
        this.f73480g = X.z(gVar.f("MessageReceived"));
        C16505B<List<f>> a14 = C16521S.a(null);
        this.f73481h = a14;
        this.f73482i = C16534i.s(C16534i.n(a14, a13, new c(this, (C17164e<? super c>) null)));
        this.f73483j = C16534i.s(C16534i.m(a10, a11, a12, new b((C17164e<? super b>) null)));
    }

    private final Map<String, Integer> m() {
        Map<String, String> f10 = this.f73474a.f("MessagesDisplayed");
        LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(f10.size()));
        for (Map.Entry entry : f10.entrySet()) {
            linkedHashMap.put(entry.getKey(), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
        }
        return linkedHashMap;
    }

    public C16532g<List<f>> a() {
        return this.f73482i;
    }

    public C16532g<List<cw.b>> c() {
        return this.f73483j;
    }

    public void d() {
        List<cw.a> value;
        List<cw.b> value2;
        List<f> value3;
        C16505B<List<cw.a>> b10 = this.f73475b;
        do {
            value = b10.getValue();
            List list = value;
        } while (!b10.e(value, null));
        C16505B<List<cw.b>> b11 = this.f73476c;
        do {
            value2 = b11.getValue();
            List list2 = value2;
        } while (!b11.e(value2, null));
        C16505B<List<f>> b12 = this.f73481h;
        do {
            value3 = b12.getValue();
            List list3 = value3;
        } while (!b12.e(value3, null));
    }

    public void e(fw.c cVar) {
        List<cw.a> value;
        List<cw.b> value2;
        List<f> value3;
        C17542s.j(cVar, "newMessages");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, true)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Updating messages: " + cVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = e.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, true, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        C16505B<List<cw.a>> b10 = this.f73475b;
        do {
            value = b10.getValue();
            List list = value;
        } while (!b10.e(value, cVar.a()));
        C16505B<List<cw.b>> b11 = this.f73476c;
        do {
            value2 = b11.getValue();
            List list2 = value2;
        } while (!b11.e(value2, cVar.b()));
        C16505B<List<f>> b12 = this.f73481h;
        do {
            value3 = b12.getValue();
            List list3 = value3;
        } while (!b12.e(value3, cVar.c()));
    }

    public void f() {
        this.f73474a.clear();
        d();
    }

    public void g(cw.e eVar) {
        C17542s.j(eVar, "type");
        int i10 = a.f73484a[eVar.ordinal()];
        if (i10 == 1) {
            return;
        }
        if (i10 == 2) {
            this.f73478e.setValue(m());
        } else if (i10 == 3) {
            this.f73479f.setValue(m());
        } else {
            throw new t();
        }
    }

    public void h(String str, boolean z10) {
        C17542s.j(str, "id");
        Map<String, String> z11 = X.z(this.f73474a.f("MessagesDisplayed"));
        if (z10) {
            z11.put(str, "0");
        } else {
            String str2 = z11.get(str);
            z11.put(str, String.valueOf((str2 != null ? Integer.parseInt(str2) : 0) + 1));
        }
        this.f73474a.c("MessagesDisplayed", z11);
    }

    public void i() {
        Long value;
        C16505B<Long> b10 = this.f73477d;
        do {
            value = b10.getValue();
            value.longValue();
        } while (!b10.e(value, Long.valueOf(System.currentTimeMillis())));
    }

    /* renamed from: l */
    public C16505B<List<cw.a>> b() {
        return this.f73475b;
    }
}
