package KB;

import GB.C12916a;
import GB.C12917b;
import HB.C12962b;
import HJ.C15854t;
import IB.C13018a;
import IJ.C15906b;
import IJ.C15908d;
import IJ.C15909e;
import QJ.C16304f;
import QJ.M;
import QJ.Q;
import QJ.T;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.x;
import XH.y;
import YH.C16877v;
import am.h;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ep.C11256b;
import fp.C11279a;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\f0\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"LKB/b;", "LIB/a;", "LHB/b;", "storeDetailsRepository", "Lam/h;", "timeProvider", "Lep/b;", "localizedDateTimeFormatter", "LQJ/M;", "ioDispatcher", "<init>", "(LHB/b;Lam/h;Lep/b;LQJ/M;)V", "", "LGB/a;", "openingHours", "LIB/a$a$a;", "e", "(Ljava/util/List;)Ljava/util/List;", "Ljava/time/LocalDateTime;", "currentTime", "openingTime", "closingTime", "", "f", "(Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)Ljava/lang/Boolean;", "", "storeIds", "LTJ/g;", "LIB/a$a;", "a", "(Ljava/util/List;)LTJ/g;", "LHB/b;", "b", "Lam/h;", "c", "LQJ/M;", "Ljava/time/format/DateTimeFormatter;", "d", "Ljava/time/format/DateTimeFormatter;", "timeFormatter", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: KB.b  reason: case insensitive filesystem */
public final class C13130b implements C13018a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C12962b f111507a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final h f111508b;

    /* renamed from: c  reason: collision with root package name */
    private final M f111509c;

    /* renamed from: d  reason: collision with root package name */
    private final DateTimeFormatter f111510d;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: KB.b$a */
    public static final class a implements C16532g<List<? extends C13018a.C2677a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f111511a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C13130b f111512b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: KB.b$a$a  reason: collision with other inner class name */
        public static final class C2715a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f111513a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C13130b f111514b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.store.impl.data.usecase.GetAmenityOpeningHoursUseCaseImpl$invoke$$inlined$map$1$2", f = "GetAmenityOpeningHoursUseCaseImpl.kt", l = {50}, m = "emit")
            /* renamed from: KB.b$a$a$a  reason: collision with other inner class name */
            public static final class C2716a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f111515c;

                /* renamed from: d  reason: collision with root package name */
                int f111516d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2715a f111517e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2716a(C2715a aVar, C17164e eVar) {
                    super(eVar);
                    this.f111517e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f111515c = obj;
                    this.f111516d |= Integer.MIN_VALUE;
                    return this.f111517e.emit((Object) null, this);
                }
            }

            public C2715a(C16533h hVar, C13130b bVar) {
                this.f111513a = hVar;
                this.f111514b = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r9, dI.C17164e r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof KB.C13130b.a.C2715a.C2716a
                    if (r0 == 0) goto L_0x0013
                    r0 = r10
                    KB.b$a$a$a r0 = (KB.C13130b.a.C2715a.C2716a) r0
                    int r1 = r0.f111516d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f111516d = r1
                    goto L_0x0018
                L_0x0013:
                    KB.b$a$a$a r0 = new KB.b$a$a$a
                    r0.<init>(r8, r10)
                L_0x0018:
                    java.lang.Object r10 = r0.f111515c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f111516d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r10)
                    goto L_0x007b
                L_0x0029:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L_0x0031:
                    XH.y.b(r10)
                    TJ.h r10 = r8.f111513a
                    XH.v r9 = (XH.v) r9
                    java.lang.Object r9 = r9.a()
                    java.util.List r9 = (java.util.List) r9
                    java.lang.Iterable r9 = (java.lang.Iterable) r9
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r4 = YH.C16877v.y(r9, r4)
                    r2.<init>(r4)
                    java.util.Iterator r9 = r9.iterator()
                L_0x004f:
                    boolean r4 = r9.hasNext()
                    if (r4 == 0) goto L_0x0072
                    java.lang.Object r4 = r9.next()
                    GB.b r4 = (GB.C12917b) r4
                    IB.a$a r5 = new IB.a$a
                    java.lang.String r6 = r4.a()
                    KB.b r7 = r8.f111514b
                    java.util.List r4 = r4.b()
                    java.util.List r4 = r7.e(r4)
                    r5.<init>(r6, r4)
                    r2.add(r5)
                    goto L_0x004f
                L_0x0072:
                    r0.f111516d = r3
                    java.lang.Object r9 = r10.emit(r2, r0)
                    if (r9 != r1) goto L_0x007b
                    return r1
                L_0x007b:
                    XH.N r9 = XH.C16807N.f139792a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: KB.C13130b.a.C2715a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, C13130b bVar) {
            this.f111511a = gVar;
            this.f111512b = bVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f111511a.collect(new C2715a(hVar, this.f111512b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTJ/h;", "", "LGB/b;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.store.impl.data.usecase.GetAmenityOpeningHoursUseCaseImpl$invoke$1", f = "GetAmenityOpeningHoursUseCaseImpl.kt", l = {42, 43}, m = "invokeSuspend")
    /* renamed from: KB.b$b  reason: collision with other inner class name */
    static final class C2717b extends l implements p<C16533h<? super List<? extends C12917b>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111518c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f111519d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<String> f111520e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C13130b f111521f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.store.impl.data.usecase.GetAmenityOpeningHoursUseCaseImpl$invoke$1$1", f = "GetAmenityOpeningHoursUseCaseImpl.kt", l = {62, 62}, m = "invokeSuspend")
        /* renamed from: KB.b$b$a */
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f111522c;

            /* renamed from: d  reason: collision with root package name */
            Object f111523d;

            /* renamed from: e  reason: collision with root package name */
            Object f111524e;

            /* renamed from: f  reason: collision with root package name */
            Object f111525f;

            /* renamed from: g  reason: collision with root package name */
            Object f111526g;

            /* renamed from: h  reason: collision with root package name */
            Object f111527h;

            /* renamed from: i  reason: collision with root package name */
            Object f111528i;

            /* renamed from: j  reason: collision with root package name */
            Object f111529j;

            /* renamed from: k  reason: collision with root package name */
            int f111530k;

            /* renamed from: l  reason: collision with root package name */
            int f111531l;

            /* renamed from: m  reason: collision with root package name */
            int f111532m;

            /* renamed from: n  reason: collision with root package name */
            private /* synthetic */ Object f111533n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ List<String> f111534o;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ C16533h<List<C12917b>> f111535p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ C13130b f111536q;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LGB/b;", "<anonymous>", "(LQJ/Q;)LGB/b;"}, k = 3, mv = {2, 1, 0})
            @f(c = "com.ingka.ikea.store.impl.data.usecase.GetAmenityOpeningHoursUseCaseImpl$invoke$1$1$results$1$1", f = "GetAmenityOpeningHoursUseCaseImpl.kt", l = {47}, m = "invokeSuspend")
            /* renamed from: KB.b$b$a$a  reason: collision with other inner class name */
            static final class C2718a extends l implements p<Q, C17164e<? super C12917b>, Object> {

                /* renamed from: c  reason: collision with root package name */
                Object f111537c;

                /* renamed from: d  reason: collision with root package name */
                Object f111538d;

                /* renamed from: e  reason: collision with root package name */
                Object f111539e;

                /* renamed from: f  reason: collision with root package name */
                Object f111540f;

                /* renamed from: g  reason: collision with root package name */
                Object f111541g;

                /* renamed from: h  reason: collision with root package name */
                int f111542h;

                /* renamed from: i  reason: collision with root package name */
                int f111543i;

                /* renamed from: j  reason: collision with root package name */
                int f111544j;

                /* renamed from: k  reason: collision with root package name */
                private /* synthetic */ Object f111545k;

                /* renamed from: l  reason: collision with root package name */
                final /* synthetic */ C13130b f111546l;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ String f111547m;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2718a(C13130b bVar, String str, C17164e<? super C2718a> eVar) {
                    super(2, eVar);
                    this.f111546l = bVar;
                    this.f111547m = str;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    C2718a aVar = new C2718a(this.f111546l, this.f111547m, eVar);
                    aVar.f111545k = obj;
                    return aVar;
                }

                public final Object invoke(Q q10, C17164e<? super C12917b> eVar) {
                    return ((C2718a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Q q10;
                    Object obj2;
                    Object obj3;
                    Object f10 = C17187b.f();
                    int i10 = this.f111544j;
                    if (i10 == 0) {
                        y.b(obj);
                        q10 = (Q) this.f111545k;
                        C13130b bVar = this.f111546l;
                        String str = this.f111547m;
                        x.a aVar = x.f139812b;
                        C12962b c10 = bVar.f111507a;
                        LocalDate localDate = bVar.f111508b.d().toLocalDate();
                        C17542s.i(localDate, "toLocalDate(...)");
                        this.f111545k = q10;
                        this.f111537c = q10;
                        this.f111538d = bVar;
                        this.f111539e = str;
                        this.f111540f = q10;
                        this.f111541g = localDate;
                        this.f111542h = 0;
                        this.f111543i = 0;
                        this.f111544j = 1;
                        obj3 = c10.b(str, localDate, this);
                        if (obj3 == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        LocalDate localDate2 = (LocalDate) this.f111541g;
                        Q q11 = (Q) this.f111540f;
                        String str2 = (String) this.f111539e;
                        C13130b bVar2 = (C13130b) this.f111538d;
                        Q q12 = (Q) this.f111537c;
                        q10 = (Q) this.f111545k;
                        try {
                            y.b(obj);
                            obj3 = obj;
                        } catch (CancellationException e10) {
                            throw e10;
                        } catch (Throwable th2) {
                            x.a aVar2 = x.f139812b;
                            obj2 = x.b(y.a(th2));
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = x.b((C12917b) obj3);
                    String str3 = this.f111547m;
                    Throwable e11 = x.e(obj2);
                    if (e11 == null) {
                        return (C12917b) obj2;
                    }
                    e eVar = e.WARN;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str4 = null;
                    String str5 = null;
                    for (C11819b bVar3 : arrayList) {
                        if (str4 == null) {
                            String a10 = C11818a.a("Failed to getAmenityOpeningHours for store: " + str3, e11);
                            if (a10 == null) {
                                break;
                            }
                            str4 = C11820c.a(a10);
                        }
                        String str6 = str4;
                        if (str5 == null) {
                            String name = q10.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str7 = str5;
                        bVar3.a(eVar, str7, false, e11, str6);
                        str4 = str6;
                        str5 = str7;
                    }
                    return null;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List<String> list, C16533h<? super List<C12917b>> hVar, C13130b bVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f111534o = list;
                this.f111535p = hVar;
                this.f111536q = bVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f111534o, this.f111535p, this.f111536q, eVar);
                aVar.f111533n = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Q q10;
                Collection collection;
                Iterable iterable;
                C13130b bVar;
                Iterable iterable2;
                Collection collection2;
                Iterator it;
                C16533h<List<C12917b>> hVar;
                int i10;
                int i11;
                Object f10 = C17187b.f();
                int i12 = this.f111532m;
                if (i12 == 0) {
                    y.b(obj);
                    q10 = (Q) this.f111533n;
                    Iterable iterable3 = this.f111534o;
                    C13130b bVar2 = this.f111536q;
                    collection = new ArrayList(C16877v.y(iterable3, 10));
                    Iterator it2 = iterable3.iterator();
                    while (it2.hasNext()) {
                        collection.add(C16314k.b(q10, (C17168i) null, (T) null, new C2718a(bVar2, (String) it2.next(), (C17164e<? super C2718a>) null), 3, (Object) null));
                    }
                    hVar = this.f111535p;
                    this.f111533n = q10;
                    this.f111522c = collection;
                    this.f111523d = iterable3;
                    this.f111524e = bVar2;
                    this.f111525f = iterable3;
                    this.f111526g = collection;
                    this.f111527h = it2;
                    this.f111528i = hVar;
                    this.f111530k = 0;
                    this.f111531l = 0;
                    this.f111532m = 1;
                    Object a10 = C16304f.a(collection, this);
                    if (a10 == f10) {
                        return f10;
                    }
                    iterable2 = iterable3;
                    iterable = iterable2;
                    bVar = bVar2;
                    obj = a10;
                    i11 = 0;
                    i10 = 0;
                    collection2 = collection;
                    it = it2;
                } else if (i12 == 1) {
                    i11 = this.f111531l;
                    i10 = this.f111530k;
                    hVar = (C16533h) this.f111528i;
                    it = (Iterator) this.f111527h;
                    collection2 = (Collection) this.f111526g;
                    iterable2 = (Iterable) this.f111525f;
                    bVar = (C13130b) this.f111524e;
                    iterable = (Iterable) this.f111523d;
                    collection = (List) this.f111522c;
                    q10 = (Q) this.f111533n;
                    y.b(obj);
                } else if (i12 == 2) {
                    C16533h hVar2 = (C16533h) this.f111528i;
                    Iterator it3 = (Iterator) this.f111527h;
                    Collection collection3 = (Collection) this.f111526g;
                    Iterable iterable4 = (Iterable) this.f111525f;
                    C13130b bVar3 = (C13130b) this.f111524e;
                    Iterable iterable5 = (Iterable) this.f111523d;
                    List list = (List) this.f111522c;
                    Q q11 = (Q) this.f111533n;
                    y.b(obj);
                    return C16807N.f139792a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List t02 = C16877v.t0((Iterable) obj);
                this.f111533n = q10;
                this.f111522c = collection;
                this.f111523d = iterable;
                this.f111524e = bVar;
                this.f111525f = iterable2;
                this.f111526g = collection2;
                this.f111527h = it;
                this.f111528i = hVar;
                this.f111529j = obj;
                this.f111530k = i10;
                this.f111531l = i11;
                this.f111532m = 2;
                if (hVar.emit(t02, this) == f10) {
                    return f10;
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2717b(List<String> list, C13130b bVar, C17164e<? super C2717b> eVar) {
            super(2, eVar);
            this.f111520e = list;
            this.f111521f = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C2717b bVar = new C2717b(this.f111520e, this.f111521f, eVar);
            bVar.f111519d = obj;
            return bVar;
        }

        public final Object invoke(C16533h<? super List<C12917b>> hVar, C17164e<? super C16807N> eVar) {
            return ((C2717b) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f111518c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0026
                if (r1 == r3) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                java.lang.Object r0 = r6.f111519d
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r7)
                goto L_0x0052
            L_0x0016:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001e:
                java.lang.Object r1 = r6.f111519d
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r7)
                goto L_0x003d
            L_0x0026:
                XH.y.b(r7)
                java.lang.Object r7 = r6.f111519d
                r1 = r7
                TJ.h r1 = (TJ.C16533h) r1
                java.util.List r7 = YH.C16877v.n()
                r6.f111519d = r1
                r6.f111518c = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L_0x003d
                return r0
            L_0x003d:
                KB.b$b$a r7 = new KB.b$b$a
                java.util.List<java.lang.String> r3 = r6.f111520e
                KB.b r4 = r6.f111521f
                r5 = 0
                r7.<init>(r3, r1, r4, r5)
                r6.f111519d = r1
                r6.f111518c = r2
                java.lang.Object r7 = QJ.S.f(r7, r6)
                if (r7 != r0) goto L_0x0052
                return r0
            L_0x0052:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: KB.C13130b.C2717b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C13130b(C12962b bVar, h hVar, C11256b bVar2, M m10) {
        C17542s.j(bVar, "storeDetailsRepository");
        C17542s.j(hVar, "timeProvider");
        C17542s.j(bVar2, "localizedDateTimeFormatter");
        C17542s.j(m10, "ioDispatcher");
        this.f111507a = bVar;
        this.f111508b = hVar;
        this.f111509c = m10;
        this.f111510d = bVar2.d();
    }

    /* access modifiers changed from: private */
    public final List<C13018a.C2677a.C2678a> e(List<C12916a> list) {
        LocalDateTime d10 = this.f111508b.d();
        Iterable<C12916a> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C12916a aVar : iterable) {
            C12916a.C2641a f10 = aVar.f();
            Boolean f11 = f(d10, aVar.d(), aVar.a());
            String a10 = C13129a.a(aVar, this.f111510d);
            LocalDateTime a11 = aVar.a();
            String format = a11 != null ? a11.format(this.f111510d) : null;
            boolean z10 = (aVar.e() == null || aVar.b() == null) ? false : true;
            LocalDateTime d11 = aVar.d();
            LocalDateTime c10 = aVar.c();
            LocalDateTime c11 = aVar.c();
            arrayList.add(new C13018a.C2677a.C2678a(f10, f11, z10, a10, format, d11, c10, c11 != null ? c11.format(this.f111510d) : null));
        }
        return arrayList;
    }

    private final Boolean f(LocalDateTime localDateTime, LocalDateTime localDateTime2, LocalDateTime localDateTime3) {
        if (localDateTime2 == null || localDateTime3 == null) {
            return null;
        }
        return Boolean.valueOf(C11279a.a(localDateTime, localDateTime2, localDateTime3));
    }

    public C16532g<List<C13018a.C2677a>> a(List<String> list) {
        C17542s.j(list, "storeIds");
        C16532g H10 = C16534i.H(new C2717b(list, this, (C17164e<? super C2717b>) null));
        C15906b.a aVar = C15906b.f135496b;
        return C16534i.L(C16534i.s(new a(i.b(H10, C15906b.K(C15908d.s(1, C15909e.MINUTES))), this)), this.f111509c);
    }
}
