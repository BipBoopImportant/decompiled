package Mg;

import HJ.C15854t;
import QJ.F0;
import QJ.M;
import QJ.N;
import QJ.Q;
import QJ.S;
import QJ.T;
import QJ.b1;
import TJ.C16532g;
import XH.C16807N;
import XH.y;
import com.ingka.ikea.app.localhistory.LocalHistoryDatabase;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH@¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0015\u001a\u00020\u0014H@¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00100\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\bH@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fH@¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fH@¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\fH@¢\u0006\u0004\b$\u0010\"J'\u0010%\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\bH@¢\u0006\u0004\b(\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0014\u0010-\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u0014\u00101\u001a\u00020.8BX\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"LMg/c;", "LMg/b;", "Lcom/ingka/ikea/app/localhistory/LocalHistoryDatabase;", "database", "LQJ/M;", "defaultDispatcher", "<init>", "(Lcom/ingka/ikea/app/localhistory/LocalHistoryDatabase;LQJ/M;)V", "", "itemNo", "productImage", "productName", "LXH/N;", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LTJ/g;", "", "LPg/a;", "b", "()LTJ/g;", "", "limit", "g", "(ILdI/e;)Ljava/lang/Object;", "LPg/b;", "a", "(I)LTJ/g;", "f", "()V", "c", "string", "h", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "i", "(LdI/e;)Ljava/lang/Object;", "m", "n", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "searchPhrase", "d", "Lcom/ingka/ikea/app/localhistory/LocalHistoryDatabase;", "LQJ/M;", "LQJ/Q;", "LQJ/Q;", "coroutineScope", "", "l", "()J", "lowestTimeStamp", "localhistory_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LocalHistoryDatabase f61898a;

    /* renamed from: b  reason: collision with root package name */
    private final M f61899b;

    /* renamed from: c  reason: collision with root package name */
    private final Q f61900c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.localhistory.LocalHistoryRepositoryImpl", f = "LocalHistoryRepository.kt", l = {165, 173}, m = "addLocalRecentProduct")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f61901c;

        /* renamed from: d  reason: collision with root package name */
        Object f61902d;

        /* renamed from: e  reason: collision with root package name */
        Object f61903e;

        /* renamed from: f  reason: collision with root package name */
        Object f61904f;

        /* renamed from: g  reason: collision with root package name */
        Object f61905g;

        /* renamed from: h  reason: collision with root package name */
        Object f61906h;

        /* renamed from: i  reason: collision with root package name */
        Object f61907i;

        /* renamed from: j  reason: collision with root package name */
        Object f61908j;

        /* renamed from: k  reason: collision with root package name */
        Object f61909k;

        /* renamed from: l  reason: collision with root package name */
        Object f61910l;

        /* renamed from: m  reason: collision with root package name */
        Object f61911m;

        /* renamed from: n  reason: collision with root package name */
        Object f61912n;

        /* renamed from: o  reason: collision with root package name */
        Object f61913o;

        /* renamed from: p  reason: collision with root package name */
        int f61914p;

        /* renamed from: q  reason: collision with root package name */
        int f61915q;

        /* renamed from: r  reason: collision with root package name */
        int f61916r;

        /* renamed from: s  reason: collision with root package name */
        int f61917s;

        /* renamed from: t  reason: collision with root package name */
        int f61918t;

        /* renamed from: u  reason: collision with root package name */
        /* synthetic */ Object f61919u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ c f61920v;

        /* renamed from: w  reason: collision with root package name */
        int f61921w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f61920v = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f61919u = obj;
            this.f61921w |= Integer.MIN_VALUE;
            return this.f61920v.k((String) null, (String) null, (String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Mg/c$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f61922a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(N.a aVar, c cVar) {
            super(aVar);
            this.f61922a = cVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            c cVar = this.f61922a;
            qv.e eVar = qv.e.ERROR;
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
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.localhistory.LocalHistoryRepositoryImpl$addLocalRecentProductAsync$2", f = "LocalHistoryRepository.kt", l = {155}, m = "invokeSuspend")
    /* renamed from: Mg.c$c  reason: collision with other inner class name */
    static final class C1038c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f61923c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f61924d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f61925e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f61926f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f61927g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1038c(c cVar, String str, String str2, String str3, C17164e<? super C1038c> eVar) {
            super(2, eVar);
            this.f61924d = cVar;
            this.f61925e = str;
            this.f61926f = str2;
            this.f61927g = str3;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C1038c(this.f61924d, this.f61925e, this.f61926f, this.f61927g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C1038c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f61923c;
            if (i10 == 0) {
                y.b(obj);
                c cVar = this.f61924d;
                String str = this.f61925e;
                String str2 = this.f61926f;
                String str3 = this.f61927g;
                this.f61923c = 1;
                if (cVar.k(str, str2, str3, this) == f10) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.localhistory.LocalHistoryRepositoryImpl", f = "LocalHistoryRepository.kt", l = {178, 181}, m = "addLocalRecentSearch")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f61928c;

        /* renamed from: d  reason: collision with root package name */
        Object f61929d;

        /* renamed from: e  reason: collision with root package name */
        Object f61930e;

        /* renamed from: f  reason: collision with root package name */
        Object f61931f;

        /* renamed from: g  reason: collision with root package name */
        Object f61932g;

        /* renamed from: h  reason: collision with root package name */
        Object f61933h;

        /* renamed from: i  reason: collision with root package name */
        Object f61934i;

        /* renamed from: j  reason: collision with root package name */
        Object f61935j;

        /* renamed from: k  reason: collision with root package name */
        Object f61936k;

        /* renamed from: l  reason: collision with root package name */
        Object f61937l;

        /* renamed from: m  reason: collision with root package name */
        Object f61938m;

        /* renamed from: n  reason: collision with root package name */
        int f61939n;

        /* renamed from: o  reason: collision with root package name */
        int f61940o;

        /* renamed from: p  reason: collision with root package name */
        int f61941p;

        /* renamed from: q  reason: collision with root package name */
        int f61942q;

        /* renamed from: r  reason: collision with root package name */
        int f61943r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f61944s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ c f61945t;

        /* renamed from: u  reason: collision with root package name */
        int f61946u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f61945t = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f61944s = obj;
            this.f61946u |= Integer.MIN_VALUE;
            return this.f61945t.d((String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Mg/c$e", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f61947a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(N.a aVar, c cVar) {
            super(aVar);
            this.f61947a = cVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            c cVar = this.f61947a;
            qv.e eVar = qv.e.ERROR;
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
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.localhistory.LocalHistoryRepositoryImpl$removeRecentSearchHistoryAsync$2", f = "LocalHistoryRepository.kt", l = {120}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f61948c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f61949d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f61949d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f61949d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f61948c;
            if (i10 == 0) {
                y.b(obj);
                c cVar = this.f61949d;
                this.f61948c = 1;
                if (cVar.m(this) == f10) {
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

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Mg/c$g", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f61950a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(N.a aVar, c cVar) {
            super(aVar);
            this.f61950a = cVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            c cVar = this.f61950a;
            qv.e eVar = qv.e.ERROR;
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
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.localhistory.LocalHistoryRepositoryImpl$removeRecentlyViewedHistoryAsync$2", f = "LocalHistoryRepository.kt", l = {130}, m = "invokeSuspend")
    static final class h extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f61951c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f61952d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f61952d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f61952d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f61951c;
            if (i10 == 0) {
                y.b(obj);
                c cVar = this.f61952d;
                this.f61951c = 1;
                if (cVar.n(this) == f10) {
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

    public c(LocalHistoryDatabase localHistoryDatabase, M m10) {
        C17542s.j(localHistoryDatabase, "database");
        C17542s.j(m10, "defaultDispatcher");
        this.f61898a = localHistoryDatabase;
        this.f61899b = m10;
        this.f61900c = S.a(m10.plus(b1.b((F0) null, 1, (Object) null)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x022e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(java.lang.String r25, java.lang.String r26, java.lang.String r27, dI.C17164e<? super XH.C16807N> r28) {
        /*
            r24 = this;
            r0 = r24
            r1 = r28
            boolean r2 = r1 instanceof Mg.c.a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            Mg.c$a r2 = (Mg.c.a) r2
            int r3 = r2.f61921w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f61921w = r3
            goto L_0x001c
        L_0x0017:
            Mg.c$a r2 = new Mg.c$a
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f61919u
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f61921w
            r6 = 1
            r7 = 2
            if (r5 == 0) goto L_0x00d3
            if (r5 == r6) goto L_0x0069
            if (r5 != r7) goto L_0x0061
            java.lang.Object r1 = r2.f61912n
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r2.f61911m
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r2.f61910l
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f61909k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f61908j
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r2.f61907i
            Mg.c r1 = (Mg.c) r1
            java.lang.Object r1 = r2.f61906h
            Mg.c r1 = (Mg.c) r1
            java.lang.Object r1 = r2.f61905g
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f61904f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f61903e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f61902d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f61901c
            Mg.c r1 = (Mg.c) r1
            XH.y.b(r3)
            goto L_0x022f
        L_0x0061:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0069:
            int r1 = r2.f61918t
            int r5 = r2.f61917s
            int r6 = r2.f61916r
            int r8 = r2.f61915q
            int r9 = r2.f61914p
            java.lang.Object r10 = r2.f61913o
            java.lang.Object r11 = r2.f61912n
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r2.f61911m
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r13 = r2.f61910l
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r2.f61909k
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r2.f61908j
            qv.e r15 = (qv.e) r15
            java.lang.Object r7 = r2.f61907i
            Mg.c r7 = (Mg.c) r7
            r25 = r1
            java.lang.Object r1 = r2.f61906h
            Mg.c r1 = (Mg.c) r1
            r26 = r1
            java.lang.Object r1 = r2.f61905g
            dI.e r1 = (dI.C17164e) r1
            r27 = r1
            java.lang.Object r1 = r2.f61904f
            java.lang.String r1 = (java.lang.String) r1
            r28 = r1
            java.lang.Object r1 = r2.f61903e
            java.lang.String r1 = (java.lang.String) r1
            r16 = r1
            java.lang.Object r1 = r2.f61902d
            java.lang.String r1 = (java.lang.String) r1
            r17 = r1
            java.lang.Object r1 = r2.f61901c
            Mg.c r1 = (Mg.c) r1
            XH.y.b(r3)
            r3 = r1
            r18 = r5
            r19 = r6
            r20 = r8
            r0 = r11
            r6 = r13
            r11 = r15
            r8 = r16
            r5 = r26
            r1 = r27
            r16 = r4
            r15 = r10
            r4 = r12
            r10 = r14
            r12 = r7
            r14 = r9
            r7 = r17
            r17 = r25
            r9 = r28
            goto L_0x01e5
        L_0x00d3:
            XH.y.b(r3)
            qv.e r15 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00e9:
            boolean r5 = r3.hasNext()
            r7 = 0
            if (r5 == 0) goto L_0x0101
            java.lang.Object r5 = r3.next()
            r8 = r5
            qv.b r8 = (qv.C11819b) r8
            boolean r7 = r8.b(r15, r7)
            if (r7 == 0) goto L_0x00e9
            r12.add(r5)
            goto L_0x00e9
        L_0x0101:
            java.util.Iterator r11 = r12.iterator()
            r3 = 0
            r13 = r3
            r14 = r13
            r5 = r12
        L_0x0109:
            boolean r8 = r11.hasNext()
            if (r8 == 0) goto L_0x0122
            java.lang.Object r5 = r11.next()
            r18 = r5
            qv.b r18 = (qv.C11819b) r18
            r8 = 0
            if (r14 != 0) goto L_0x0128
            java.lang.String r9 = "Insert new product"
            java.lang.String r9 = qv.C11818a.a(r9, r8)
            if (r9 != 0) goto L_0x0124
        L_0x0122:
            r10 = r5
            goto L_0x0185
        L_0x0124:
            java.lang.String r14 = qv.C11820c.a(r9)
        L_0x0128:
            if (r13 != 0) goto L_0x0176
            java.lang.Class<Mg.c> r9 = Mg.c.class
            java.lang.String r9 = r9.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            r10 = 36
            r13 = 2
            java.lang.String r10 = HJ.C15854t.s1(r9, r10, r3, r13, r3)
            r7 = 46
            java.lang.String r7 = HJ.C15854t.o1(r10, r7, r3, r13, r3)
            int r10 = r7.length()
            if (r10 != 0) goto L_0x0147
            goto L_0x014d
        L_0x0147:
            java.lang.String r9 = "Kt"
            java.lang.String r9 = HJ.C15854t.P0(r7, r9)
        L_0x014d:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            java.lang.String r10 = "main"
            boolean r7 = HJ.C15854t.b0(r7, r10, r6)
            if (r7 == 0) goto L_0x0160
            java.lang.String r7 = "m"
            goto L_0x0162
        L_0x0160:
            java.lang.String r7 = "b"
        L_0x0162:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            java.lang.String r7 = "|"
            r10.append(r7)
            r10.append(r9)
            java.lang.String r13 = r10.toString()
        L_0x0176:
            r21 = 0
            r19 = r15
            r20 = r13
            r22 = r8
            r23 = r14
            r18.a(r19, r20, r21, r22, r23)
            r7 = 0
            goto L_0x0109
        L_0x0185:
            com.ingka.ikea.app.localhistory.LocalHistoryDatabase r3 = r0.f61898a
            Ng.a r3 = r3.d()
            Pg.a r5 = new Pg.a
            long r20 = java.lang.System.currentTimeMillis()
            r17 = r5
            r18 = r25
            r19 = r26
            r22 = r27
            r17.<init>(r18, r19, r20, r22)
            r2.f61901c = r0
            r7 = r25
            r2.f61902d = r7
            r8 = r26
            r2.f61903e = r8
            r9 = r27
            r2.f61904f = r9
            r2.f61905g = r1
            r2.f61906h = r0
            r2.f61907i = r0
            r2.f61908j = r15
            r2.f61909k = r14
            r2.f61910l = r13
            r2.f61911m = r12
            r2.f61912n = r11
            r2.f61913o = r10
            r6 = 0
            r2.f61914p = r6
            r2.f61915q = r6
            r2.f61916r = r6
            r2.f61917s = r6
            r2.f61918t = r6
            r6 = 1
            r2.f61921w = r6
            java.lang.Object r3 = r3.c(r5, r2)
            if (r3 != r4) goto L_0x01d1
            return r4
        L_0x01d1:
            r3 = r0
            r5 = r3
            r16 = r4
            r4 = r12
            r6 = r13
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r12 = r5
            r0 = r11
            r11 = r15
            r15 = r10
            r10 = r14
            r14 = 0
        L_0x01e5:
            com.ingka.ikea.app.localhistory.LocalHistoryDatabase r13 = r3.f61898a
            Ng.a r13 = r13.d()
            r25 = r13
            r21 = r14
            long r13 = r3.l()
            r2.f61901c = r3
            r2.f61902d = r7
            r2.f61903e = r8
            r2.f61904f = r9
            r2.f61905g = r1
            r2.f61906h = r5
            r2.f61907i = r12
            r2.f61908j = r11
            r2.f61909k = r10
            r2.f61910l = r6
            r2.f61911m = r4
            r2.f61912n = r0
            r2.f61913o = r15
            r9 = r21
            r2.f61914p = r9
            r8 = r20
            r2.f61915q = r8
            r6 = r19
            r2.f61916r = r6
            r5 = r18
            r2.f61917s = r5
            r0 = r17
            r2.f61918t = r0
            r0 = 2
            r2.f61921w = r0
            r0 = r25
            java.lang.Object r0 = r0.e(r13, r2)
            r1 = r16
            if (r0 != r1) goto L_0x022f
            return r1
        L_0x022f:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Mg.c.k(java.lang.String, java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    private final long l() {
        return System.currentTimeMillis() - TimeUnit.DAYS.toMillis(90);
    }

    public C16532g<List<Pg.b>> a(int i10) {
        return this.f61898a.e().b(i10);
    }

    public C16532g<List<Pg.a>> b() {
        return this.f61898a.d().a();
    }

    public void c() {
        F0 unused = C16314k.d(this.f61900c, new g(N.f137593c0, this), (T) null, new h(this, (C17164e<? super h>) null), 2, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01fb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(java.lang.String r25, dI.C17164e<? super XH.C16807N> r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            boolean r3 = r2 instanceof Mg.c.d
            if (r3 == 0) goto L_0x0019
            r3 = r2
            Mg.c$d r3 = (Mg.c.d) r3
            int r4 = r3.f61946u
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f61946u = r4
            goto L_0x001e
        L_0x0019:
            Mg.c$d r3 = new Mg.c$d
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f61944s
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f61946u
            r7 = 1
            r8 = 2
            if (r6 == 0) goto L_0x00bb
            if (r6 == r7) goto L_0x0063
            if (r6 != r8) goto L_0x005b
            java.lang.Object r1 = r3.f61937l
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r3.f61936k
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r3.f61935j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f61934i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f61933h
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r3.f61932g
            Mg.c r1 = (Mg.c) r1
            java.lang.Object r1 = r3.f61931f
            Mg.c r1 = (Mg.c) r1
            java.lang.Object r1 = r3.f61930e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f61929d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f61928c
            Mg.c r1 = (Mg.c) r1
            XH.y.b(r4)
            goto L_0x01fc
        L_0x005b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0063:
            int r1 = r3.f61943r
            int r2 = r3.f61942q
            int r6 = r3.f61941p
            int r7 = r3.f61940o
            int r9 = r3.f61939n
            java.lang.Object r10 = r3.f61938m
            java.lang.Object r11 = r3.f61937l
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r3.f61936k
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r13 = r3.f61935j
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r3.f61934i
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r3.f61933h
            qv.e r15 = (qv.e) r15
            java.lang.Object r8 = r3.f61932g
            Mg.c r8 = (Mg.c) r8
            r25 = r1
            java.lang.Object r1 = r3.f61931f
            Mg.c r1 = (Mg.c) r1
            r26 = r1
            java.lang.Object r1 = r3.f61930e
            dI.e r1 = (dI.C17164e) r1
            r16 = r1
            java.lang.Object r1 = r3.f61929d
            java.lang.String r1 = (java.lang.String) r1
            r17 = r1
            java.lang.Object r1 = r3.f61928c
            Mg.c r1 = (Mg.c) r1
            XH.y.b(r4)
            r4 = r1
            r18 = r2
            r0 = r13
            r2 = r16
            r1 = r17
            r17 = r25
            r16 = r5
            r13 = r10
            r5 = r14
            r10 = r7
            r14 = r11
            r11 = r8
            r8 = r15
            r15 = r12
            r12 = r9
            r9 = r6
            r6 = r26
            goto L_0x01ba
        L_0x00bb:
            XH.y.b(r4)
            qv.e r15 = qv.e.DEBUG
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00d1:
            boolean r6 = r4.hasNext()
            r8 = 0
            if (r6 == 0) goto L_0x00e9
            java.lang.Object r6 = r4.next()
            r9 = r6
            qv.b r9 = (qv.C11819b) r9
            boolean r8 = r9.b(r15, r8)
            if (r8 == 0) goto L_0x00d1
            r12.add(r6)
            goto L_0x00d1
        L_0x00e9:
            java.util.Iterator r11 = r12.iterator()
            r4 = 0
            r13 = r4
            r14 = r13
            r6 = r12
        L_0x00f1:
            boolean r9 = r11.hasNext()
            if (r9 == 0) goto L_0x010a
            java.lang.Object r6 = r11.next()
            r18 = r6
            qv.b r18 = (qv.C11819b) r18
            r9 = 0
            if (r14 != 0) goto L_0x0110
            java.lang.String r10 = "Insert new searchPhrase"
            java.lang.String r10 = qv.C11818a.a(r10, r9)
            if (r10 != 0) goto L_0x010c
        L_0x010a:
            r10 = r6
            goto L_0x016e
        L_0x010c:
            java.lang.String r14 = qv.C11820c.a(r10)
        L_0x0110:
            if (r13 != 0) goto L_0x015e
            java.lang.Class<Mg.c> r10 = Mg.c.class
            java.lang.String r10 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r10)
            r13 = 36
            r8 = 2
            java.lang.String r13 = HJ.C15854t.s1(r10, r13, r4, r8, r4)
            r9 = 46
            java.lang.String r9 = HJ.C15854t.o1(r13, r9, r4, r8, r4)
            int r8 = r9.length()
            if (r8 != 0) goto L_0x012f
            goto L_0x0135
        L_0x012f:
            java.lang.String r8 = "Kt"
            java.lang.String r10 = HJ.C15854t.P0(r9, r8)
        L_0x0135:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "main"
            boolean r8 = HJ.C15854t.b0(r8, r9, r7)
            if (r8 == 0) goto L_0x0148
            java.lang.String r8 = "m"
            goto L_0x014a
        L_0x0148:
            java.lang.String r8 = "b"
        L_0x014a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "|"
            r9.append(r8)
            r9.append(r10)
            java.lang.String r13 = r9.toString()
        L_0x015e:
            r21 = 0
            r19 = r15
            r20 = r13
            r8 = 0
            r22 = r8
            r23 = r14
            r18.a(r19, r20, r21, r22, r23)
            r8 = 0
            goto L_0x00f1
        L_0x016e:
            com.ingka.ikea.app.localhistory.LocalHistoryDatabase r4 = r0.f61898a
            Ng.c r4 = r4.e()
            Pg.b r6 = new Pg.b
            long r8 = java.lang.System.currentTimeMillis()
            r6.<init>(r1, r8)
            r3.f61928c = r0
            r3.f61929d = r1
            r3.f61930e = r2
            r3.f61931f = r0
            r3.f61932g = r0
            r3.f61933h = r15
            r3.f61934i = r14
            r3.f61935j = r13
            r3.f61936k = r12
            r3.f61937l = r11
            r3.f61938m = r10
            r8 = 0
            r3.f61939n = r8
            r3.f61940o = r8
            r3.f61941p = r8
            r3.f61942q = r8
            r3.f61943r = r8
            r3.f61946u = r7
            java.lang.Object r4 = r4.e(r6, r3)
            if (r4 != r5) goto L_0x01a7
            return r5
        L_0x01a7:
            r4 = r0
            r6 = r4
            r16 = r5
            r9 = r8
            r17 = r9
            r18 = r17
            r5 = r14
            r14 = r11
            r0 = r13
            r11 = r6
            r13 = r10
            r10 = r18
            r8 = r15
            r15 = r12
            r12 = r10
        L_0x01ba:
            com.ingka.ikea.app.localhistory.LocalHistoryDatabase r7 = r4.f61898a
            Ng.c r7 = r7.e()
            r19 = r9
            r20 = r10
            long r9 = r4.l()
            r3.f61928c = r4
            r3.f61929d = r1
            r3.f61930e = r2
            r3.f61931f = r6
            r3.f61932g = r11
            r3.f61933h = r8
            r3.f61934i = r5
            r3.f61935j = r0
            r3.f61936k = r15
            r3.f61937l = r14
            r3.f61938m = r13
            r3.f61939n = r12
            r8 = r20
            r3.f61940o = r8
            r6 = r19
            r3.f61941p = r6
            r2 = r18
            r3.f61942q = r2
            r8 = r17
            r3.f61943r = r8
            r0 = 2
            r3.f61946u = r0
            java.lang.Object r0 = r7.d(r9, r3)
            r1 = r16
            if (r0 != r1) goto L_0x01fc
            return r1
        L_0x01fc:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Mg.c.d(java.lang.String, dI.e):java.lang.Object");
    }

    public void e(String str, String str2, String str3) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "productImage");
        C17542s.j(str3, "productName");
        F0 unused = C16314k.d(this.f61900c, new b(N.f137593c0, this), (T) null, new C1038c(this, str, str2, str3, (C17164e<? super C1038c>) null), 2, (Object) null);
    }

    public void f() {
        F0 unused = C16314k.d(this.f61900c, new e(N.f137593c0, this), (T) null, new f(this, (C17164e<? super f>) null), 2, (Object) null);
    }

    public Object g(int i10, C17164e<? super List<Pg.a>> eVar) {
        return this.f61898a.d().b(i10, eVar);
    }

    public Object h(String str, C17164e<? super C16807N> eVar) {
        Object c10 = this.f61898a.e().c(str, eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public Object i(C17164e<? super C16807N> eVar) {
        this.f61898a.clearAllTables();
        return C16807N.f139792a;
    }

    public Object m(C17164e<? super C16807N> eVar) {
        Object a10 = this.f61898a.e().a(eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public Object n(C17164e<? super C16807N> eVar) {
        Object d10 = this.f61898a.d().d(eVar);
        return d10 == C17187b.f() ? d10 : C16807N.f139792a;
    }
}
