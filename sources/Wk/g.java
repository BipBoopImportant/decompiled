package Wk;

import HJ.C15854t;
import QJ.C16310i;
import QJ.F0;
import QJ.M;
import QJ.N;
import QJ.Q;
import QJ.S;
import QJ.T;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.ingka.ikea.app.stockinfo.db.StockInfoDatabase;
import com.ingka.ikea.app.stockinfo.local.StockModel;
import com.ingka.ikea.app.stockinfo.local.b;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001 B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH@¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH@¢\u0006\u0004\b\u0016\u0010\u0017J4\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH@¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000b0\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0016¢\u0006\u0004\b \u0010!J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\"\u001a\u00020\u0011H@¢\u0006\u0004\b#\u0010$J \u0010%\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H@¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010+R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010+R\u0014\u0010/\u001a\u00020,8BX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"LWk/g;", "LWk/d;", "Lcom/ingka/ikea/app/stockinfo/db/StockInfoDatabase;", "database", "LVk/e;", "stockInfoRemoteDataSource", "LQJ/M;", "dbDispatcher", "networkDispatcher", "<init>", "(Lcom/ingka/ikea/app/stockinfo/db/StockInfoDatabase;LVk/e;LQJ/M;LQJ/M;)V", "", "Lcom/ingka/ikea/app/stockinfo/local/a;", "stockHolders", "LXH/N;", "q", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "", "storeId", "itemNos", "n", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "o", "(Ljava/lang/String;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/app/stockinfo/local/StockModel;", "stockModelsList", "r", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LTJ/g;", "LWk/f;", "c", "(Ljava/lang/String;Ljava/util/List;)LTJ/g;", "a", "(Ljava/lang/String;Ljava/util/List;)V", "itemNo", "d", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "e", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "b", "()V", "Lcom/ingka/ikea/app/stockinfo/db/StockInfoDatabase;", "LVk/e;", "LQJ/M;", "LQJ/Q;", "p", "()LQJ/Q;", "coroutineScope", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements d {

    /* renamed from: e  reason: collision with root package name */
    public static final a f88924e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final long f88925f = TimeUnit.MINUTES.toMillis(5);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final StockInfoDatabase f88926a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Vk.e f88927b;

    /* renamed from: c  reason: collision with root package name */
    private final M f88928c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final M f88929d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LWk/g$a;", "", "<init>", "()V", "", "STOCK_REFRESH_TIMEOUT_OUT", "J", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Wk/g$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f88930a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(N.a aVar, g gVar) {
            super(aVar);
            this.f88930a = gVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            g gVar = this.f88930a;
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
                    String a10 = C11818a.a("Unable delete all stock info.", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = gVar.getClass().getName();
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
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.stockinfo.repo.StockRepository$deleteAllStockInfo$3", f = "StockRepository.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f88931c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f88932d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f88932d = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f88932d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f88931c == 0) {
                y.b(obj);
                this.f88932d.f88926a.a().a();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.stockinfo.repo.StockRepository", f = "StockRepository.kt", l = {253}, m = "fetchFromCloudIfNeeded")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f88933c;

        /* renamed from: d  reason: collision with root package name */
        Object f88934d;

        /* renamed from: e  reason: collision with root package name */
        Object f88935e;

        /* renamed from: f  reason: collision with root package name */
        Object f88936f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f88937g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g f88938h;

        /* renamed from: i  reason: collision with root package name */
        int f88939i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f88938h = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f88937g = obj;
            this.f88939i |= Integer.MIN_VALUE;
            return this.f88938h.o((String) null, (List<String>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "", "", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.stockinfo.repo.StockRepository$fetchFromCloudIfNeeded$itemNosToUpdate$1", f = "StockRepository.kt", l = {}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super List<? extends String>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f88940c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f88941d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f88942e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<String> f88943f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g gVar, String str, List<String> list, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f88941d = gVar;
            this.f88942e = str;
            this.f88943f = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f88941d, this.f88942e, this.f88943f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super List<String>> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f88940c == 0) {
                y.b(obj);
                return this.f88941d.n(this.f88942e, this.f88943f);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Wk/g$f", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f88944a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(N.a aVar, g gVar) {
            super(aVar);
            this.f88944a = gVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            g gVar = this.f88944a;
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
                    String a10 = C11818a.a("Failed to fetch data.", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = gVar.getClass().getName();
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
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.stockinfo.repo.StockRepository$fetchStockAndStoreInDatabase$2", f = "StockRepository.kt", l = {82, 87}, m = "invokeSuspend")
    /* renamed from: Wk.g$g  reason: collision with other inner class name */
    static final class C1891g extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f88945c;

        /* renamed from: d  reason: collision with root package name */
        Object f88946d;

        /* renamed from: e  reason: collision with root package name */
        Object f88947e;

        /* renamed from: f  reason: collision with root package name */
        Object f88948f;

        /* renamed from: g  reason: collision with root package name */
        Object f88949g;

        /* renamed from: h  reason: collision with root package name */
        Object f88950h;

        /* renamed from: i  reason: collision with root package name */
        Object f88951i;

        /* renamed from: j  reason: collision with root package name */
        Object f88952j;

        /* renamed from: k  reason: collision with root package name */
        Object f88953k;

        /* renamed from: l  reason: collision with root package name */
        int f88954l;

        /* renamed from: m  reason: collision with root package name */
        int f88955m;

        /* renamed from: n  reason: collision with root package name */
        int f88956n;

        /* renamed from: o  reason: collision with root package name */
        int f88957o;

        /* renamed from: p  reason: collision with root package name */
        int f88958p;

        /* renamed from: q  reason: collision with root package name */
        int f88959q;

        /* renamed from: r  reason: collision with root package name */
        private /* synthetic */ Object f88960r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ g f88961s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ String f88962t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ List<String> f88963u;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "", "Lcom/ingka/ikea/app/stockinfo/local/StockModel;", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.stockinfo.repo.StockRepository$fetchStockAndStoreInDatabase$2$stockModelsList$1", f = "StockRepository.kt", l = {84}, m = "invokeSuspend")
        /* renamed from: Wk.g$g$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super List<? extends StockModel>>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f88964c;

            /* renamed from: d  reason: collision with root package name */
            Object f88965d;

            /* renamed from: e  reason: collision with root package name */
            Object f88966e;

            /* renamed from: f  reason: collision with root package name */
            Object f88967f;

            /* renamed from: g  reason: collision with root package name */
            Object f88968g;

            /* renamed from: h  reason: collision with root package name */
            Object f88969h;

            /* renamed from: i  reason: collision with root package name */
            Object f88970i;

            /* renamed from: j  reason: collision with root package name */
            Object f88971j;

            /* renamed from: k  reason: collision with root package name */
            Object f88972k;

            /* renamed from: l  reason: collision with root package name */
            int f88973l;

            /* renamed from: m  reason: collision with root package name */
            int f88974m;

            /* renamed from: n  reason: collision with root package name */
            int f88975n;

            /* renamed from: o  reason: collision with root package name */
            int f88976o;

            /* renamed from: p  reason: collision with root package name */
            int f88977p;

            /* renamed from: q  reason: collision with root package name */
            int f88978q;

            /* renamed from: r  reason: collision with root package name */
            private /* synthetic */ Object f88979r;

            /* renamed from: s  reason: collision with root package name */
            final /* synthetic */ g f88980s;

            /* renamed from: t  reason: collision with root package name */
            final /* synthetic */ String f88981t;

            /* renamed from: u  reason: collision with root package name */
            final /* synthetic */ List<String> f88982u;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar, String str, List<String> list, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f88980s = gVar;
                this.f88981t = str;
                this.f88982u = list;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f88980s, this.f88981t, this.f88982u, eVar);
                aVar.f88979r = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super List<StockModel>> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.ArrayList} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.util.ArrayList} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.ArrayList} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: qv.b} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.util.ArrayList} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.ArrayList} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r20) {
                /*
                    r19 = this;
                    r0 = r19
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f88978q
                    r3 = 1
                    if (r2 == 0) goto L_0x0040
                    if (r2 != r3) goto L_0x0038
                    java.lang.Object r1 = r0.f88971j
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r1 = r0.f88970i
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.lang.Object r1 = r0.f88969h
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.Object r1 = r0.f88968g
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.Object r1 = r0.f88967f
                    qv.e r1 = (qv.e) r1
                    java.lang.Object r1 = r0.f88966e
                    QJ.Q r1 = (QJ.Q) r1
                    java.lang.Object r1 = r0.f88965d
                    java.util.List r1 = (java.util.List) r1
                    java.lang.Object r1 = r0.f88964c
                    QJ.Q r1 = (QJ.Q) r1
                    java.lang.Object r1 = r0.f88979r
                    QJ.Q r1 = (QJ.Q) r1
                    XH.y.b(r20)
                    r2 = r20
                    goto L_0x0143
                L_0x0038:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0040:
                    XH.y.b(r20)
                    java.lang.Object r2 = r0.f88979r
                    QJ.Q r2 = (QJ.Q) r2
                    java.util.List<java.lang.String> r4 = r0.f88982u
                    qv.e r11 = qv.e.DEBUG
                    qv.d r5 = qv.d.f102012a
                    java.util.List r5 = r5.a()
                    java.lang.Iterable r5 = (java.lang.Iterable) r5
                    java.util.ArrayList r12 = new java.util.ArrayList
                    r12.<init>()
                    java.util.Iterator r5 = r5.iterator()
                L_0x005c:
                    boolean r6 = r5.hasNext()
                    r13 = 0
                    if (r6 == 0) goto L_0x0074
                    java.lang.Object r6 = r5.next()
                    r7 = r6
                    qv.b r7 = (qv.C11819b) r7
                    boolean r7 = r7.b(r11, r13)
                    if (r7 == 0) goto L_0x005c
                    r12.add(r6)
                    goto L_0x005c
                L_0x0074:
                    java.util.Iterator r14 = r12.iterator()
                    r15 = 0
                    r7 = r12
                    r5 = r15
                    r6 = r5
                L_0x007c:
                    boolean r8 = r14.hasNext()
                    if (r8 == 0) goto L_0x0112
                    java.lang.Object r16 = r14.next()
                    r7 = r16
                    qv.b r7 = (qv.C11819b) r7
                    r9 = 0
                    if (r5 != 0) goto L_0x00ac
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    java.lang.String r10 = "Fetch stock for products: "
                    r8.append(r10)
                    r8.append(r4)
                    java.lang.String r8 = r8.toString()
                    java.lang.String r8 = qv.C11818a.a(r8, r9)
                    if (r8 != 0) goto L_0x00a8
                    r7 = r16
                    goto L_0x0112
                L_0x00a8:
                    java.lang.String r5 = qv.C11820c.a(r8)
                L_0x00ac:
                    r17 = r5
                    if (r6 != 0) goto L_0x00fe
                    java.lang.Class r5 = r2.getClass()
                    java.lang.String r5 = r5.getName()
                    kotlin.jvm.internal.C17542s.g(r5)
                    r6 = 36
                    r8 = 2
                    java.lang.String r6 = HJ.C15854t.s1(r5, r6, r15, r8, r15)
                    r10 = 46
                    java.lang.String r6 = HJ.C15854t.o1(r6, r10, r15, r8, r15)
                    int r8 = r6.length()
                    if (r8 != 0) goto L_0x00cf
                    goto L_0x00d5
                L_0x00cf:
                    java.lang.String r5 = "Kt"
                    java.lang.String r5 = HJ.C15854t.P0(r6, r5)
                L_0x00d5:
                    java.lang.Thread r6 = java.lang.Thread.currentThread()
                    java.lang.String r6 = r6.getName()
                    java.lang.String r8 = "main"
                    boolean r6 = HJ.C15854t.b0(r6, r8, r3)
                    if (r6 == 0) goto L_0x00e8
                    java.lang.String r6 = "m"
                    goto L_0x00ea
                L_0x00e8:
                    java.lang.String r6 = "b"
                L_0x00ea:
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    r8.append(r6)
                    java.lang.String r6 = "|"
                    r8.append(r6)
                    r8.append(r5)
                    java.lang.String r6 = r8.toString()
                L_0x00fe:
                    r18 = r6
                    r8 = 0
                    r5 = r7
                    r6 = r11
                    r7 = r18
                    r10 = r17
                    r5.a(r6, r7, r8, r9, r10)
                    r7 = r16
                    r5 = r17
                    r6 = r18
                    goto L_0x007c
                L_0x0112:
                    Wk.g r8 = r0.f88980s
                    Vk.e r8 = r8.f88927b
                    java.lang.String r9 = r0.f88981t
                    java.util.List<java.lang.String> r10 = r0.f88982u
                    r0.f88979r = r2
                    r0.f88964c = r2
                    r0.f88965d = r4
                    r0.f88966e = r2
                    r0.f88967f = r11
                    r0.f88968g = r5
                    r0.f88969h = r6
                    r0.f88970i = r12
                    r0.f88971j = r14
                    r0.f88972k = r7
                    r0.f88973l = r13
                    r0.f88974m = r13
                    r0.f88975n = r13
                    r0.f88976o = r13
                    r0.f88977p = r13
                    r0.f88978q = r3
                    java.lang.Object r2 = r8.a(r9, r10, r0)
                    if (r2 != r1) goto L_0x0143
                    return r1
                L_0x0143:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: Wk.g.C1891g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1891g(g gVar, String str, List<String> list, C17164e<? super C1891g> eVar) {
            super(2, eVar);
            this.f88961s = gVar;
            this.f88962t = str;
            this.f88963u = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C1891g gVar = new C1891g(this.f88961s, this.f88962t, this.f88963u, eVar);
            gVar.f88960r = obj;
            return gVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C1891g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f88959q
                r3 = 1
                r4 = 2
                r5 = 0
                if (r2 == 0) goto L_0x004c
                if (r2 == r3) goto L_0x0042
                if (r2 != r4) goto L_0x003a
                java.lang.Object r1 = r0.f88952j
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f88951i
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f88950h
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f88949g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f88948f
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f88947e
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f88946d
                QJ.Q r1 = (QJ.Q) r1
                java.lang.Object r1 = r0.f88945c
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r0.f88960r
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r19)
                goto L_0x0169
            L_0x003a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0042:
                java.lang.Object r2 = r0.f88960r
                QJ.Q r2 = (QJ.Q) r2
                XH.y.b(r19)
                r6 = r19
                goto L_0x006f
            L_0x004c:
                XH.y.b(r19)
                java.lang.Object r2 = r0.f88960r
                QJ.Q r2 = (QJ.Q) r2
                Wk.g r6 = r0.f88961s
                QJ.M r6 = r6.f88929d
                Wk.g$g$a r7 = new Wk.g$g$a
                Wk.g r8 = r0.f88961s
                java.lang.String r9 = r0.f88962t
                java.util.List<java.lang.String> r10 = r0.f88963u
                r7.<init>(r8, r9, r10, r5)
                r0.f88960r = r2
                r0.f88959q = r3
                java.lang.Object r6 = QJ.C16310i.g(r6, r7, r0)
                if (r6 != r1) goto L_0x006f
                return r1
            L_0x006f:
                java.util.List r6 = (java.util.List) r6
                qv.e r13 = qv.e.DEBUG
                qv.d r7 = qv.d.f102012a
                java.util.List r7 = r7.a()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x0084:
                boolean r8 = r7.hasNext()
                r15 = 0
                if (r8 == 0) goto L_0x009c
                java.lang.Object r8 = r7.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                boolean r9 = r9.b(r13, r15)
                if (r9 == 0) goto L_0x0084
                r14.add(r8)
                goto L_0x0084
            L_0x009c:
                java.util.Iterator r12 = r14.iterator()
                r7 = r5
                r8 = r7
                r9 = r14
            L_0x00a3:
                boolean r10 = r12.hasNext()
                if (r10 == 0) goto L_0x013a
                java.lang.Object r16 = r12.next()
                r9 = r16
                qv.b r9 = (qv.C11819b) r9
                r11 = 0
                if (r7 != 0) goto L_0x00d4
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r15 = "Stock fetched: "
                r10.append(r15)
                r10.append(r6)
                java.lang.String r10 = r10.toString()
                java.lang.String r10 = qv.C11818a.a(r10, r11)
                if (r10 != 0) goto L_0x00d0
                r3 = r12
                r9 = r16
                goto L_0x013b
            L_0x00d0:
                java.lang.String r7 = qv.C11820c.a(r10)
            L_0x00d4:
                r15 = r7
                if (r8 != 0) goto L_0x0124
                java.lang.Class r7 = r2.getClass()
                java.lang.String r7 = r7.getName()
                kotlin.jvm.internal.C17542s.g(r7)
                r8 = 36
                java.lang.String r8 = HJ.C15854t.s1(r7, r8, r5, r4, r5)
                r10 = 46
                java.lang.String r8 = HJ.C15854t.o1(r8, r10, r5, r4, r5)
                int r10 = r8.length()
                if (r10 != 0) goto L_0x00f5
                goto L_0x00fb
            L_0x00f5:
                java.lang.String r7 = "Kt"
                java.lang.String r7 = HJ.C15854t.P0(r8, r7)
            L_0x00fb:
                java.lang.Thread r8 = java.lang.Thread.currentThread()
                java.lang.String r8 = r8.getName()
                java.lang.String r10 = "main"
                boolean r8 = HJ.C15854t.b0(r8, r10, r3)
                if (r8 == 0) goto L_0x010e
                java.lang.String r8 = "m"
                goto L_0x0110
            L_0x010e:
                java.lang.String r8 = "b"
            L_0x0110:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r8)
                java.lang.String r8 = "|"
                r10.append(r8)
                r10.append(r7)
                java.lang.String r8 = r10.toString()
            L_0x0124:
                r17 = r8
                r10 = 0
                r7 = r9
                r8 = r13
                r9 = r17
                r3 = r12
                r12 = r15
                r7.a(r8, r9, r10, r11, r12)
                r12 = r3
                r7 = r15
                r9 = r16
                r8 = r17
                r3 = 1
                r15 = 0
                goto L_0x00a3
            L_0x013a:
                r3 = r12
            L_0x013b:
                Wk.g r5 = r0.f88961s
                java.lang.String r10 = r0.f88962t
                java.util.List<java.lang.String> r11 = r0.f88963u
                r0.f88960r = r2
                r0.f88945c = r6
                r0.f88946d = r2
                r0.f88947e = r2
                r0.f88948f = r13
                r0.f88949g = r7
                r0.f88950h = r8
                r0.f88951i = r14
                r0.f88952j = r3
                r0.f88953k = r9
                r2 = 0
                r0.f88954l = r2
                r0.f88955m = r2
                r0.f88956n = r2
                r0.f88957o = r2
                r0.f88958p = r2
                r0.f88959q = r4
                java.lang.Object r2 = r5.r(r10, r6, r11, r0)
                if (r2 != r1) goto L_0x0169
                return r1
            L_0x0169:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Wk.g.C1891g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.stockinfo.repo.StockRepository", f = "StockRepository.kt", l = {100, 107, 117}, m = "fetchStockStatusForAllStores")
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f88983c;

        /* renamed from: d  reason: collision with root package name */
        Object f88984d;

        /* renamed from: e  reason: collision with root package name */
        Object f88985e;

        /* renamed from: f  reason: collision with root package name */
        Object f88986f;

        /* renamed from: g  reason: collision with root package name */
        Object f88987g;

        /* renamed from: h  reason: collision with root package name */
        Object f88988h;

        /* renamed from: i  reason: collision with root package name */
        Object f88989i;

        /* renamed from: j  reason: collision with root package name */
        Object f88990j;

        /* renamed from: k  reason: collision with root package name */
        Object f88991k;

        /* renamed from: l  reason: collision with root package name */
        int f88992l;

        /* renamed from: m  reason: collision with root package name */
        int f88993m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f88994n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ g f88995o;

        /* renamed from: p  reason: collision with root package name */
        int f88996p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(g gVar, C17164e<? super h> eVar) {
            super(eVar);
            this.f88995o = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f88994n = obj;
            this.f88996p |= Integer.MIN_VALUE;
            return this.f88995o.d((String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.stockinfo.repo.StockRepository$fetchStockStatusForAllStores$2", f = "StockRepository.kt", l = {}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f88997c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f88998d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f88999e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(g gVar, String str, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f88998d = gVar;
            this.f88999e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f88998d, this.f88999e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f88997c == 0) {
                y.b(obj);
                this.f88998d.f88926a.a().d(this.f88999e);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "", "Lcom/ingka/ikea/app/stockinfo/local/StockModel;", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.stockinfo.repo.StockRepository$fetchStockStatusForAllStores$stockModelsList$1", f = "StockRepository.kt", l = {101}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super List<? extends StockModel>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f89000c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f89001d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f89002e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(g gVar, String str, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f89001d = gVar;
            this.f89002e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new j(this.f89001d, this.f89002e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super List<StockModel>> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f89000c;
            if (i10 == 0) {
                y.b(obj);
                Vk.e k10 = this.f89001d.f88927b;
                String str = this.f89002e;
                this.f89000c = 1;
                obj = k10.b(str, this);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.stockinfo.repo.StockRepository", f = "StockRepository.kt", l = {131, 136}, m = "getStockStatusForSingleProduct")
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f89003c;

        /* renamed from: d  reason: collision with root package name */
        Object f89004d;

        /* renamed from: e  reason: collision with root package name */
        Object f89005e;

        /* renamed from: f  reason: collision with root package name */
        Object f89006f;

        /* renamed from: g  reason: collision with root package name */
        Object f89007g;

        /* renamed from: h  reason: collision with root package name */
        Object f89008h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f89009i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ g f89010j;

        /* renamed from: k  reason: collision with root package name */
        int f89011k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(g gVar, C17164e<? super k> eVar) {
            super(eVar);
            this.f89010j = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f89009i = obj;
            this.f89011k |= Integer.MIN_VALUE;
            return this.f89010j.e((String) null, (String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Wk/g$l", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class l extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f89012a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(N.a aVar, g gVar) {
            super(aVar);
            this.f89012a = gVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            g gVar = this.f89012a;
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
                    String a10 = C11818a.a("Failed to fetch data.", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = gVar.getClass().getName();
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
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class m implements C16532g<List<? extends f>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f89013a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f89014b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f89015a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f89016b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.stockinfo.repo.StockRepository$getStockStatusFromDatabaseFlow$$inlined$map$1$2", f = "StockRepository.kt", l = {50}, m = "emit")
            /* renamed from: Wk.g$m$a$a  reason: collision with other inner class name */
            public static final class C1892a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f89017c;

                /* renamed from: d  reason: collision with root package name */
                int f89018d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f89019e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1892a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f89019e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f89017c = obj;
                    this.f89018d |= Integer.MIN_VALUE;
                    return this.f89019e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, List list) {
                this.f89015a = hVar;
                this.f89016b = list;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, dI.C17164e r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof Wk.g.m.a.C1892a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    Wk.g$m$a$a r0 = (Wk.g.m.a.C1892a) r0
                    int r1 = r0.f89018d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f89018d = r1
                    goto L_0x0018
                L_0x0013:
                    Wk.g$m$a$a r0 = new Wk.g$m$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f89017c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f89018d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r9)
                    goto L_0x0069
                L_0x0029:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0031:
                    XH.y.b(r9)
                    TJ.h r9 = r7.f89015a
                    java.util.List r8 = (java.util.List) r8
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r8 = r8.iterator()
                L_0x0043:
                    boolean r4 = r8.hasNext()
                    if (r4 == 0) goto L_0x0060
                    java.lang.Object r4 = r8.next()
                    r5 = r4
                    Wk.f r5 = (Wk.f) r5
                    java.util.List r6 = r7.f89016b
                    java.lang.String r5 = r5.f()
                    boolean r5 = r6.contains(r5)
                    if (r5 == 0) goto L_0x0043
                    r2.add(r4)
                    goto L_0x0043
                L_0x0060:
                    r0.f89018d = r3
                    java.lang.Object r8 = r9.emit(r2, r0)
                    if (r8 != r1) goto L_0x0069
                    return r1
                L_0x0069:
                    XH.N r8 = XH.C16807N.f139792a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: Wk.g.m.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public m(C16532g gVar, List list) {
            this.f89013a = gVar;
            this.f89014b = list;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f89013a.collect(new a(hVar, this.f89014b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.stockinfo.repo.StockRepository$getStockStatusFromDatabaseFlow$2", f = "StockRepository.kt", l = {59}, m = "invokeSuspend")
    static final class n extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f89020c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f89021d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f89022e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<String> f89023f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(g gVar, String str, List<String> list, C17164e<? super n> eVar) {
            super(2, eVar);
            this.f89021d = gVar;
            this.f89022e = str;
            this.f89023f = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new n(this.f89021d, this.f89022e, this.f89023f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((n) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f89020c;
            if (i10 == 0) {
                y.b(obj);
                g gVar = this.f89021d;
                String str = this.f89022e;
                List<String> list = this.f89023f;
                this.f89020c = 1;
                if (gVar.o(str, list, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.stockinfo.repo.StockRepository$insertStockObjects$2", f = "StockRepository.kt", l = {}, m = "invokeSuspend")
    static final class o extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f89024c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<com.ingka.ikea.app.stockinfo.local.a> f89025d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f89026e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(List<com.ingka.ikea.app.stockinfo.local.a> list, g gVar, C17164e<? super o> eVar) {
            super(2, eVar);
            this.f89025d = list;
            this.f89026e = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new o(this.f89025d, this.f89026e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((o) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f89024c == 0) {
                y.b(obj);
                g gVar = this.f89026e;
                for (com.ingka.ikea.app.stockinfo.local.a aVar : this.f89025d) {
                    if (!(aVar.b() instanceof b.c)) {
                        return C16807N.f139792a;
                    }
                    f a10 = ((b.c) aVar.b()).a();
                    ArrayList arrayList = new ArrayList();
                    for (b.a aVar2 : aVar.a()) {
                        f f10 = gVar.f88926a.a().f(aVar2.h(), aVar2.e());
                        boolean z10 = true;
                        boolean z11 = f10 == null || System.currentTimeMillis() > f10.c() + g.f88925f;
                        f fVar = null;
                        String m10 = f10 != null ? f10.m() : null;
                        if (!(m10 == null || m10.length() == 0)) {
                            z10 = false;
                        }
                        if (z11 || z10) {
                            fVar = new f(System.currentTimeMillis(), aVar2.h(), aVar2.e(), aVar2.f(), aVar2.g(), a10.k(), a10.n(), a10.h(), aVar2.d(), aVar2.i(), aVar2.c(), aVar2.a(), aVar2.b(), a10.j(), "", "");
                        }
                        if (fVar != null) {
                            arrayList.add(fVar);
                        }
                    }
                    Tk.b a11 = gVar.f88926a.a();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(a10);
                    arrayList2.addAll(arrayList);
                    a11.g(arrayList2);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.stockinfo.repo.StockRepository$updateDatabase$2", f = "StockRepository.kt", l = {275}, m = "invokeSuspend")
    static final class p extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f89027c;

        /* renamed from: d  reason: collision with root package name */
        Object f89028d;

        /* renamed from: e  reason: collision with root package name */
        Object f89029e;

        /* renamed from: f  reason: collision with root package name */
        Object f89030f;

        /* renamed from: g  reason: collision with root package name */
        Object f89031g;

        /* renamed from: h  reason: collision with root package name */
        int f89032h;

        /* renamed from: i  reason: collision with root package name */
        int f89033i;

        /* renamed from: j  reason: collision with root package name */
        int f89034j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ List<StockModel> f89035k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ g f89036l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f89037m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ List<String> f89038n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(List<StockModel> list, g gVar, String str, List<String> list2, C17164e<? super p> eVar) {
            super(2, eVar);
            this.f89035k = list;
            this.f89036l = gVar;
            this.f89037m = str;
            this.f89038n = list2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new p(this.f89035k, this.f89036l, this.f89037m, this.f89038n, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((p) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f89034j;
            if (i10 == 0) {
                y.b(obj);
                if (this.f89035k.isEmpty()) {
                    this.f89036l.f88926a.a().c(this.f89037m, this.f89038n);
                } else {
                    Iterable iterable = this.f89035k;
                    ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((StockModel) it.next()).convertToStockHolder());
                    }
                    g gVar = this.f89036l;
                    this.f89027c = arrayList;
                    this.f89028d = iterable;
                    this.f89029e = iterable;
                    this.f89030f = arrayList;
                    this.f89031g = it;
                    this.f89032h = 0;
                    this.f89033i = 0;
                    this.f89034j = 1;
                    if (gVar.q(arrayList, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                Iterator it2 = (Iterator) this.f89031g;
                Collection collection = (Collection) this.f89030f;
                Iterable iterable2 = (Iterable) this.f89029e;
                Iterable iterable3 = (Iterable) this.f89028d;
                List list = (List) this.f89027c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public g(StockInfoDatabase stockInfoDatabase, Vk.e eVar, M m10, M m11) {
        C17542s.j(stockInfoDatabase, "database");
        C17542s.j(eVar, "stockInfoRemoteDataSource");
        C17542s.j(m10, "dbDispatcher");
        C17542s.j(m11, "networkDispatcher");
        this.f88926a = stockInfoDatabase;
        this.f88927b = eVar;
        this.f88928c = m10;
        this.f88929d = m11;
    }

    /* access modifiers changed from: private */
    public final List<String> n(String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            f f10 = this.f88926a.a().f(str, next);
            boolean z10 = false;
            boolean z11 = f10 != null;
            if (f10 != null && System.currentTimeMillis() > f10.c() + f88925f) {
                z10 = true;
            }
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar, false)) {
                    arrayList2.add(next2);
                }
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList2) {
                if (str3 == null) {
                    String a10 = C11818a.a("Check stock for item: " + next + ", is present: " + z11 + ", hasExpired: " + z10, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = g.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', str2, 2, str2), '.', str2, 2, str2);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str6 = str4;
                bVar.a(eVar, str6, false, (Throwable) null, str5);
                str3 = str5;
                str4 = str6;
                str2 = str2;
            }
            if (!z11 || z10) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.String r7, java.util.List<java.lang.String> r8, dI.C17164e<? super XH.C16807N> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof Wk.g.d
            if (r0 == 0) goto L_0x0013
            r0 = r9
            Wk.g$d r0 = (Wk.g.d) r0
            int r1 = r0.f88939i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f88939i = r1
            goto L_0x0018
        L_0x0013:
            Wk.g$d r0 = new Wk.g$d
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f88937g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f88939i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r7 = r0.f88936f
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f88935e
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r0.f88934d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.f88933c
            Wk.g r8 = (Wk.g) r8
            XH.y.b(r1)
            goto L_0x005e
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0041:
            XH.y.b(r1)
            QJ.M r1 = r6.f88928c
            Wk.g$e r3 = new Wk.g$e
            r5 = 0
            r3.<init>(r6, r7, r8, r5)
            r0.f88933c = r6
            r0.f88934d = r7
            r0.f88935e = r8
            r0.f88936f = r9
            r0.f88939i = r4
            java.lang.Object r1 = QJ.C16310i.g(r1, r3, r0)
            if (r1 != r2) goto L_0x005d
            return r2
        L_0x005d:
            r8 = r6
        L_0x005e:
            java.util.List r1 = (java.util.List) r1
            r9 = r1
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x006c
            r8.a(r7, r1)
        L_0x006c:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Wk.g.o(java.lang.String, java.util.List, dI.e):java.lang.Object");
    }

    private final Q p() {
        return S.a(this.f88928c);
    }

    /* access modifiers changed from: private */
    public final Object q(List<com.ingka.ikea.app.stockinfo.local.a> list, C17164e<? super C16807N> eVar) {
        Object g10 = C16310i.g(this.f88928c, new o(list, this, (C17164e<? super o>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final Object r(String str, List<StockModel> list, List<String> list2, C17164e<? super C16807N> eVar) {
        Object g10 = C16310i.g(this.f88928c, new p(list, this, str, list2, (C17164e<? super p>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    public void a(String str, List<String> list) {
        C17542s.j(str, "storeId");
        C17542s.j(list, "itemNos");
        F0 unused = C16314k.d(p(), new f(N.f137593c0, this), (T) null, new C1891g(this, str, list, (C17164e<? super C1891g>) null), 2, (Object) null);
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
                String a10 = C11818a.a("deleteAllStockInfo", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = g.class.getName();
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
        F0 unused = C16314k.d(p(), new b(N.f137593c0, this), (T) null, new c(this, (C17164e<? super c>) null), 2, (Object) null);
    }

    public C16532g<List<f>> c(String str, List<String> list) {
        C17542s.j(str, "storeId");
        C17542s.j(list, "itemNos");
        if (list.isEmpty()) {
            return C16534i.J(C16877v.n());
        }
        F0 unused = C16314k.d(p(), new l(N.f137593c0, this), (T) null, new n(this, str, list, (C17164e<? super n>) null), 2, (Object) null);
        return new m(this.f88926a.a().e(str), list);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: dI.e<? super java.util.List<com.ingka.ikea.app.stockinfo.local.a>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(java.lang.String r10, dI.C17164e<? super java.util.List<com.ingka.ikea.app.stockinfo.local.a>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof Wk.g.h
            if (r0 == 0) goto L_0x0013
            r0 = r11
            Wk.g$h r0 = (Wk.g.h) r0
            int r1 = r0.f88996p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f88996p = r1
            goto L_0x0018
        L_0x0013:
            Wk.g$h r0 = new Wk.g$h
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f88994n
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f88996p
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x0082
            if (r3 == r7) goto L_0x0071
            if (r3 == r6) goto L_0x005d
            if (r3 != r5) goto L_0x0055
            java.lang.Object r10 = r0.f88991k
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r10 = r0.f88990j
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r10 = r0.f88989i
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r10 = r0.f88988h
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r10 = r0.f88987g
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r0.f88986f
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = r0.f88985e
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r11 = r0.f88984d
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r0.f88983c
            Wk.g r11 = (Wk.g) r11
            XH.y.b(r1)
            goto L_0x0108
        L_0x0055:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x005d:
            java.lang.Object r10 = r0.f88986f
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = r0.f88985e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f88984d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f88983c
            Wk.g r10 = (Wk.g) r10
            XH.y.b(r1)
            goto L_0x00bc
        L_0x0071:
            java.lang.Object r10 = r0.f88985e
            r11 = r10
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r10 = r0.f88984d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r3 = r0.f88983c
            Wk.g r3 = (Wk.g) r3
            XH.y.b(r1)
            goto L_0x009c
        L_0x0082:
            XH.y.b(r1)
            QJ.M r1 = r9.f88929d
            Wk.g$j r3 = new Wk.g$j
            r3.<init>(r9, r10, r4)
            r0.f88983c = r9
            r0.f88984d = r10
            r0.f88985e = r11
            r0.f88996p = r7
            java.lang.Object r1 = QJ.C16310i.g(r1, r3, r0)
            if (r1 != r2) goto L_0x009b
            return r2
        L_0x009b:
            r3 = r9
        L_0x009c:
            java.util.List r1 = (java.util.List) r1
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L_0x00c1
            QJ.M r5 = r3.f88928c
            Wk.g$i r7 = new Wk.g$i
            r7.<init>(r3, r10, r4)
            r0.f88983c = r3
            r0.f88984d = r10
            r0.f88985e = r11
            r0.f88986f = r1
            r0.f88996p = r6
            java.lang.Object r10 = QJ.C16310i.g(r5, r7, r0)
            if (r10 != r2) goto L_0x00bc
            return r2
        L_0x00bc:
            java.util.List r10 = YH.C16877v.n()
            return r10
        L_0x00c1:
            r4 = r1
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = YH.C16877v.y(r4, r7)
            r6.<init>(r7)
            java.util.Iterator r7 = r4.iterator()
        L_0x00d3:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00e7
            java.lang.Object r8 = r7.next()
            com.ingka.ikea.app.stockinfo.local.StockModel r8 = (com.ingka.ikea.app.stockinfo.local.StockModel) r8
            com.ingka.ikea.app.stockinfo.local.a r8 = r8.convertToStockHolder()
            r6.add(r8)
            goto L_0x00d3
        L_0x00e7:
            r0.f88983c = r3
            r0.f88984d = r10
            r0.f88985e = r11
            r0.f88986f = r1
            r0.f88987g = r6
            r0.f88988h = r4
            r0.f88989i = r4
            r0.f88990j = r6
            r0.f88991k = r7
            r10 = 0
            r0.f88992l = r10
            r0.f88993m = r10
            r0.f88996p = r5
            java.lang.Object r10 = r3.q(r6, r0)
            if (r10 != r2) goto L_0x0107
            return r2
        L_0x0107:
            r10 = r6
        L_0x0108:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Wk.g.d(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: dI.e<? super com.ingka.ikea.app.stockinfo.local.a>} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b4, code lost:
        r10 = r10.convertToStockHolder();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(java.lang.String r10, java.lang.String r11, dI.C17164e<? super com.ingka.ikea.app.stockinfo.local.a> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof Wk.g.k
            if (r0 == 0) goto L_0x0013
            r0 = r12
            Wk.g$k r0 = (Wk.g.k) r0
            int r1 = r0.f89011k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f89011k = r1
            goto L_0x0018
        L_0x0013:
            Wk.g$k r0 = new Wk.g$k
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r1 = r0.f89009i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f89011k
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x006b
            if (r3 == r6) goto L_0x004e
            if (r3 != r5) goto L_0x0046
            java.lang.Object r10 = r0.f89008h
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r0.f89007g
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = r0.f89006f
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r11 = r0.f89005e
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r0.f89004d
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r0.f89003c
            Wk.g r11 = (Wk.g) r11
            XH.y.b(r1)
            goto L_0x00ac
        L_0x0046:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x004e:
            java.lang.Object r10 = r0.f89007g
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r0.f89006f
            r12 = r11
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r11 = r0.f89005e
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r3 = r0.f89004d
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r6 = r0.f89003c
            Wk.g r6 = (Wk.g) r6
            XH.y.b(r1)
            r8 = r1
            r1 = r10
            r10 = r3
            r3 = r8
            goto L_0x0094
        L_0x006b:
            XH.y.b(r1)
            int r1 = r10.length()
            if (r1 != 0) goto L_0x007a
            com.ingka.ikea.app.stockinfo.local.a r10 = new com.ingka.ikea.app.stockinfo.local.a
            r10.<init>(r7, r7, r4, r7)
            return r10
        L_0x007a:
            java.util.List r1 = YH.C16877v.e(r11)
            Vk.e r3 = r9.f88927b
            r0.f89003c = r9
            r0.f89004d = r10
            r0.f89005e = r11
            r0.f89006f = r12
            r0.f89007g = r1
            r0.f89011k = r6
            java.lang.Object r3 = r3.a(r10, r1, r0)
            if (r3 != r2) goto L_0x0093
            return r2
        L_0x0093:
            r6 = r9
        L_0x0094:
            java.util.List r3 = (java.util.List) r3
            r0.f89003c = r6
            r0.f89004d = r10
            r0.f89005e = r11
            r0.f89006f = r12
            r0.f89007g = r1
            r0.f89008h = r3
            r0.f89011k = r5
            java.lang.Object r10 = r6.r(r10, r3, r1, r0)
            if (r10 != r2) goto L_0x00ab
            return r2
        L_0x00ab:
            r10 = r3
        L_0x00ac:
            java.lang.Object r10 = YH.C16877v.y0(r10)
            com.ingka.ikea.app.stockinfo.local.StockModel r10 = (com.ingka.ikea.app.stockinfo.local.StockModel) r10
            if (r10 == 0) goto L_0x00ba
            com.ingka.ikea.app.stockinfo.local.a r10 = r10.convertToStockHolder()
            if (r10 != 0) goto L_0x00bf
        L_0x00ba:
            com.ingka.ikea.app.stockinfo.local.a r10 = new com.ingka.ikea.app.stockinfo.local.a
            r10.<init>(r7, r7, r4, r7)
        L_0x00bf:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Wk.g.e(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ g(com.ingka.ikea.app.stockinfo.db.StockInfoDatabase r1, Vk.e r2, QJ.M r3, QJ.M r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0011
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor()
            java.lang.String r6 = "newSingleThreadExecutor(...)"
            kotlin.jvm.internal.C17542s.i(r3, r6)
            QJ.v0 r3 = QJ.C16340x0.c(r3)
        L_0x0011:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0019
            QJ.M r4 = QJ.C16311i0.b()
        L_0x0019:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Wk.g.<init>(com.ingka.ikea.app.stockinfo.db.StockInfoDatabase, Vk.e, QJ.M, QJ.M, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
