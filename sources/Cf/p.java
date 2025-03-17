package cf;

import HJ.C15854t;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import Sl.g;
import Sl.h;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import YH.C16877v;
import aA.C13909a;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import bI.C17035a;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ip.C11410b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kf.C9977a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010 R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020(0\"8\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R \u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0.8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u000205098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b\u0016\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010\u0014R\u001d\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\"8F¢\u0006\u0006\u001a\u0004\bA\u0010&¨\u0006C"}, d2 = {"Lcf/p;", "Landroidx/lifecycle/f0;", "LCx/b;", "publisherTokenManager", "Lcf/t;", "checkIfAllowedPublisherModeUseCase", "LSl/b;", "getMarketLinksUseCase", "LaA/a;", "sessionManager", "<init>", "(LCx/b;Lcf/t;LSl/b;LaA/a;)V", "LXH/N;", "M", "()V", "", "url", "L", "(Ljava/lang/String;)V", "K", "I", "J", "m", "LCx/b;", "n", "Lcf/t;", "o", "LSl/b;", "p", "LaA/a;", "Lip/b;", "q", "Lip/b;", "_openUrl", "Landroidx/lifecycle/F;", "r", "Landroidx/lifecycle/F;", "G", "()Landroidx/lifecycle/F;", "openUrl", "Lkf/a;", "s", "_errors", "t", "F", "errors", "Landroidx/lifecycle/K;", "", "Lcf/k;", "u", "Landroidx/lifecycle/K;", "_sections", "LTJ/B;", "Lcf/E;", "v", "LTJ/B;", "_uiState", "LTJ/P;", "w", "LTJ/P;", "()LTJ/P;", "uiState", "", "x", "numberOfClicksOnVersionCode", "H", "sections", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Cx.b f65720m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final t f65721n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Sl.b f65722o;

    /* renamed from: p  reason: collision with root package name */
    private final C13909a f65723p;

    /* renamed from: q  reason: collision with root package name */
    private final C11410b<String> f65724q;

    /* renamed from: r  reason: collision with root package name */
    private final F<String> f65725r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C11410b<C9977a> f65726s;

    /* renamed from: t  reason: collision with root package name */
    private final F<C9977a> f65727t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final K<List<k>> f65728u = new K<>();
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C16505B<E> f65729v;

    /* renamed from: w  reason: collision with root package name */
    private final C16519P<E> f65730w;

    /* renamed from: x  reason: collision with root package name */
    private int f65731x;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.auth.legal.AboutViewModel$2", f = "AboutViewModel.kt", l = {166, 207}, m = "invokeSuspend")
    static final class a extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f65732c;

        /* renamed from: d  reason: collision with root package name */
        Object f65733d;

        /* renamed from: e  reason: collision with root package name */
        Object f65734e;

        /* renamed from: f  reason: collision with root package name */
        int f65735f;

        /* renamed from: g  reason: collision with root package name */
        int f65736g;

        /* renamed from: h  reason: collision with root package name */
        private /* synthetic */ Object f65737h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p f65738i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: cf.p$a$a  reason: collision with other inner class name */
        static final class C1159a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f65739a;

            C1159a(p pVar) {
                this.f65739a = pVar;
            }

            /* renamed from: c */
            public final Object emit(String str, C17164e<? super C16807N> eVar) {
                if (str != null) {
                    this.f65739a.M();
                }
                return C16807N.f139792a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f65740a;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    Sl.g[] r0 = Sl.g.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Sl.g r1 = Sl.g.EULA     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    Sl.g r1 = Sl.g.FamilyTermsAndConditions     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    Sl.g r1 = Sl.g.GeneralTerms     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    Sl.g r1 = Sl.g.Impressum     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    Sl.g r1 = Sl.g.OrderTerms     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    Sl.g r1 = Sl.g.PrivacyPolicy     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    Sl.g r1 = Sl.g.ShopAndGoTerms     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    f65740a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: cf.p.a.b.<clinit>():void");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class c<T> implements Comparator {
            public final int compare(T t10, T t11) {
                return C17035a.e(Integer.valueOf(((k) t10).a()), Integer.valueOf(((k) t11).a()));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f65738i = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f65738i, eVar);
            aVar.f65737h = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Q q10;
            List list;
            Collection collection;
            Object obj3;
            Object f10 = C17187b.f();
            int i10 = this.f65736g;
            if (i10 == 0) {
                y.b(obj);
                q10 = (Q) this.f65737h;
                list = new ArrayList();
                list.add(F.f65708a);
                list.add(C9460A.f65697a);
                list.add(v.f65760a);
                Sl.b i11 = this.f65738i.f65722o;
                g[] gVarArr = {g.EULA, g.FamilyTermsAndConditions, g.GeneralTerms, g.Impressum, g.OrderTerms, g.PrivacyPolicy, g.ShopAndGoTerms};
                C16532g<List<h>> a10 = i11.a(gVarArr);
                this.f65737h = q10;
                this.f65732c = list;
                this.f65733d = gVarArr;
                this.f65736g = 1;
                obj2 = C16534i.D(a10, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                g[] gVarArr2 = (g[]) this.f65733d;
                list = (List) this.f65732c;
                q10 = (Q) this.f65737h;
                y.b(obj);
                obj2 = obj;
            } else if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                List list2 = (List) this.f65734e;
                List list3 = (List) this.f65733d;
                List list4 = (List) this.f65732c;
                Q q11 = (Q) this.f65737h;
                y.b(obj);
                throw new C16820k();
            }
            List<h> list5 = (List) obj2;
            boolean z10 = false;
            if (list5 != null) {
                collection = new ArrayList();
                for (h hVar : list5) {
                    switch (b.f65740a[hVar.b().ordinal()]) {
                        case 1:
                            obj3 = new w(hVar.c(), hVar.a());
                            break;
                        case 2:
                            obj3 = new x(hVar.c(), hVar.a());
                            break;
                        case 3:
                            obj3 = new y(hVar.c(), hVar.a());
                            break;
                        case 4:
                            obj3 = new z(hVar.c(), hVar.a());
                            break;
                        case 5:
                            obj3 = new C9461B(hVar.c(), hVar.a());
                            break;
                        case 6:
                            obj3 = new C9462C(hVar.c(), hVar.a());
                            break;
                        case 7:
                            obj3 = new C9463D(hVar.c(), hVar.a());
                            break;
                        default:
                            e eVar = e.WARN;
                            ArrayList<C11819b> arrayList = new ArrayList<>();
                            for (Object next : qv.d.f102012a.a()) {
                                if (((C11819b) next).b(eVar, z10)) {
                                    arrayList.add(next);
                                }
                            }
                            String str = null;
                            String str2 = null;
                            String str3 = null;
                            for (C11819b bVar : arrayList) {
                                if (str2 == null) {
                                    String a11 = C11818a.a("About section not handling LinkType: " + hVar.b(), (Throwable) null);
                                    if (a11 == null) {
                                        obj3 = str;
                                        break;
                                    } else {
                                        str2 = C11820c.a(a11);
                                    }
                                }
                                String str4 = str2;
                                if (str3 == null) {
                                    String name = q10.getClass().getName();
                                    C17542s.g(name);
                                    String o12 = C15854t.o1(C15854t.s1(name, '$', str, 2, str), '.', str, 2, str);
                                    if (o12.length() != 0) {
                                        name = C15854t.P0(o12, "Kt");
                                    }
                                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                                }
                                String str5 = str3;
                                bVar.a(eVar, str5, false, (Throwable) null, str4);
                                str2 = str4;
                                str3 = str5;
                                str = str;
                            }
                            obj3 = str;
                    }
                    if (obj3 != null) {
                        collection.add(obj3);
                    }
                    z10 = false;
                }
            } else {
                collection = C16877v.n();
            }
            list.addAll(collection);
            if (list.size() > 1) {
                C16877v.C(list, new c());
            }
            this.f65738i.f65728u.postValue(list);
            C16519P<String> b10 = this.f65738i.f65720m.b();
            C1159a aVar = new C1159a(this.f65738i);
            this.f65737h = q10;
            this.f65732c = list;
            this.f65733d = collection;
            this.f65734e = list;
            this.f65735f = 0;
            this.f65736g = 2;
            if (b10.collect(aVar, this) == f10) {
                return f10;
            }
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"cf/p$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f65741a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(N.a aVar, p pVar) {
            super(aVar);
            this.f65741a = pVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            p pVar = this.f65741a;
            e eVar = e.WARN;
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
                    String a10 = C11818a.a("Something went wrong", (Throwable) null);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = pVar.getClass().getName();
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
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.auth.legal.AboutViewModel$onVersionClicked$3", f = "AboutViewModel.kt", l = {250}, m = "invokeSuspend")
    static final class c extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f65742c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f65743d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f65744e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(p pVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f65744e = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f65744e, eVar);
            cVar.f65743d = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Q q10;
            Q q11;
            char c10;
            Object f10 = C17187b.f();
            int i10 = this.f65742c;
            if (i10 == 0) {
                y.b(obj);
                Q q12 = (Q) this.f65743d;
                t h10 = this.f65744e.f65721n;
                this.f65743d = q12;
                this.f65742c = 1;
                obj2 = h10.a(this);
                if (obj2 == f10) {
                    return f10;
                }
                q10 = q12;
            } else if (i10 == 1) {
                q10 = (Q) this.f65743d;
                y.b(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            char c11 = '$';
            if (((Boolean) obj2).booleanValue()) {
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
                        String a10 = C11818a.a("User is a co-worker, enabling publisher mode", (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    if (str2 == null) {
                        String name = q10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, c11, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar, str2, false, (Throwable) null, str);
                    c11 = '$';
                }
                this.f65744e.f65729v.setValue(E.b((E) this.f65744e.f65729v.getValue(), (String) null, true, 1, (Object) null));
            } else {
                e eVar2 = e.DEBUG;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str3 = null;
                String str4 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str3 == null) {
                        String a11 = C11818a.a("Can't enable publisher mode. User is not a publisher", (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str3 = C11820c.a(a11);
                    }
                    if (str4 == null) {
                        String name2 = q10.getClass().getName();
                        C17542s.g(name2);
                        c10 = '$';
                        q11 = q10;
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                    } else {
                        q11 = q10;
                        c10 = '$';
                    }
                    char c12 = c10;
                    bVar2.a(eVar2, str4, false, (Throwable) null, str3);
                    q10 = q11;
                }
                this.f65744e.f65729v.setValue(E.b((E) this.f65744e.f65729v.getValue(), "Can't enable publisher mode. User is not a publisher", false, 2, (Object) null));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"cf/p$d", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f65745a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(N.a aVar, p pVar) {
            super(aVar);
            this.f65745a = pVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            this.f65745a.f65726s.postValue(C9977a.b.f75068c);
        }
    }

    public p(Cx.b bVar, t tVar, Sl.b bVar2, C13909a aVar) {
        C17542s.j(bVar, "publisherTokenManager");
        C17542s.j(tVar, "checkIfAllowedPublisherModeUseCase");
        C17542s.j(bVar2, "getMarketLinksUseCase");
        C17542s.j(aVar, "sessionManager");
        this.f65720m = bVar;
        this.f65721n = tVar;
        this.f65722o = bVar2;
        this.f65723p = aVar;
        C11410b<String> bVar3 = new C11410b<>();
        this.f65724q = bVar3;
        this.f65725r = bVar3;
        C11410b<C9977a> bVar4 = new C11410b<>();
        this.f65726s = bVar4;
        this.f65727t = bVar4;
        C16505B<E> a10 = C16521S.a(new E((String) null, false, 3, (DefaultConstructorMarker) null));
        this.f65729v = a10;
        this.f65730w = C16534i.c(a10);
        F0 unused = C16314k.d(g0.a(this), new d(N.f137593c0, this), (T) null, new a(this, (C17164e<? super a>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void M() {
        C16505B<E> b10 = this.f65729v;
        b10.setValue(b10.getValue().a("Publisher mode enabled.", false));
    }

    public final F<C9977a> F() {
        return this.f65727t;
    }

    public final F<String> G() {
        return this.f65725r;
    }

    public final F<List<k>> H() {
        return this.f65728u;
    }

    public final void I() {
        C16505B<E> b10 = this.f65729v;
        b10.setValue(E.b(b10.getValue(), (String) null, false, 1, (Object) null));
    }

    public final void J() {
        C16505B<E> b10 = this.f65729v;
        b10.setValue(E.b(b10.getValue(), (String) null, false, 2, (Object) null));
    }

    public final void K() {
        if (this.f65723p.isLoggedIn()) {
            int i10 = this.f65731x + 1;
            this.f65731x = i10;
            if (i10 == 10) {
                this.f65731x = 0;
                C16505B<E> b10 = this.f65729v;
                b10.setValue(E.b(b10.getValue(), (String) null, false, 1, (Object) null));
                if (this.f65720m.d()) {
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
                            String a10 = C11818a.a("Disabling publisher mode", (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = p.class.getName();
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
                    this.f65720m.a();
                    C16505B<E> b11 = this.f65729v;
                    b11.setValue(E.b(b11.getValue(), "Publisher mode disabled.", false, 2, (Object) null));
                    return;
                }
                F0 unused = C16314k.d(g0.a(this), new b(N.f137593c0, this), (T) null, new c(this, (C17164e<? super c>) null), 2, (Object) null);
            }
        }
    }

    public final void L(String str) {
        C17542s.j(str, "url");
        if (str.length() == 0) {
            this.f65726s.postValue(C9977a.C1360a.f75067c);
        } else {
            this.f65724q.e(str);
        }
    }

    public final C16519P<E> m() {
        return this.f65730w;
    }
}
