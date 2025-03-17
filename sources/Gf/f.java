package Gf;

import Es.a;
import QJ.Q;
import TJ.C16505B;
import TJ.C16515L;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.optimizely.ab.config.FeatureVariable;
import dI.C17164e;
import eI.C17187b;
import hn.e;
import is.C11414a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;
import nI.r;
import qe.C10188a;
import qe.C10189b;
import xf.C10395f;
import xf.h;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0004\b!\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u00140.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002040*8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u0010,R\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002040.8\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00102R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020:0.8\u0006¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b<\u00102R#\u0010A\u001a\b\u0012\u0004\u0012\u00020>0.8\u0006¢\u0006\u0012\n\u0004\b?\u00100\u0012\u0004\b@\u0010\u001a\u001a\u0004\b\"\u00102¨\u0006B"}, d2 = {"LGf/f;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lhn/e;", "suggestRepo", "LFf/b;", "searchHintsUseCase", "LMg/b;", "localHistoryRepository", "LGf/e;", "searchViewModelUiMapperV2", "Lqe/a;", "alertMessageIntegration", "Lis/a;", "inboxIntegration", "Lxf/f;", "searchAnalytics", "<init>", "(Landroidx/lifecycle/U;Lhn/e;LFf/b;LMg/b;LGf/e;Lqe/a;Lis/a;Lxf/f;)V", "", "text", "LXH/N;", "I", "(Ljava/lang/String;)V", "F", "()V", "string", "Lxf/h;", "component", "G", "(Ljava/lang/String;Lxf/h;)V", "itemNo", "H", "m", "Lhn/e;", "n", "LMg/b;", "o", "LGf/e;", "p", "Lxf/f;", "LTJ/B;", "q", "LTJ/B;", "_inputText", "LTJ/P;", "r", "LTJ/P;", "C", "()LTJ/P;", "inputText", "", "s", "_isLoading", "t", "E", "isLoading", "LGf/j;", "u", "D", "topAppBarUiState", "LGf/d;", "v", "getUiState$annotations", "uiState", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final e f60702m;

    /* renamed from: n  reason: collision with root package name */
    private final Mg.b f60703n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final e f60704o;

    /* renamed from: p  reason: collision with root package name */
    private final C10395f f60705p;

    /* renamed from: q  reason: collision with root package name */
    private final C16505B<String> f60706q;

    /* renamed from: r  reason: collision with root package name */
    private final C16519P<String> f60707r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C16505B<Boolean> f60708s;

    /* renamed from: t  reason: collision with root package name */
    private final C16519P<Boolean> f60709t;

    /* renamed from: u  reason: collision with root package name */
    private final C16519P<j> f60710u;

    /* renamed from: v  reason: collision with root package name */
    private final C16519P<d> f60711v;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f60712a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                xf.h[] r0 = xf.h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xf.h r1 = xf.h.AUTOCOMPLETE_TEXT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                xf.h r1 = xf.h.AUTOCOMPLETE_CATEGORY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                xf.h r1 = xf.h.RECENTLY_SEARCHED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                xf.h r1 = xf.h.REGULAR     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                xf.h r1 = xf.h.COMMON_SEARCH_TERM     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f60712a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Gf.f.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqe/b;", "alertMessage", "LEs/a;", "inboxState", "LGf/j;", "<anonymous>", "(Lqe/b;LEs/a;)LGf/j;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.browseandsearch.searchv2.SearchViewModelV2$topAppBarUiState$1", f = "SearchViewModelV2.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements q<C10189b, Es.a, C17164e<? super j>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f60713c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f60714d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f60715e;

        b(C17164e<? super b> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C10189b bVar, Es.a aVar, C17164e<? super j> eVar) {
            b bVar2 = new b(eVar);
            bVar2.f60714d = bVar;
            bVar2.f60715e = aVar;
            return bVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f60713c == 0) {
                y.b(obj);
                return new j((C10189b) this.f60714d, (Es.a) this.f60715e);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "searchHints", "LPg/b;", "recentSearches", "inputText", "LGf/d;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)LGf/d;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.browseandsearch.searchv2.SearchViewModelV2$uiState$1", f = "SearchViewModelV2.kt", l = {82, 85}, m = "invokeSuspend")
    static final class c extends l implements r<List<? extends String>, List<? extends Pg.b>, String, C17164e<? super d>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f60716c;

        /* renamed from: d  reason: collision with root package name */
        int f60717d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f60718e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f60719f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f60720g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f60721h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, C17164e<? super c> eVar) {
            super(4, eVar);
            this.f60721h = fVar;
        }

        /* renamed from: i */
        public final Object l(List<String> list, List<Pg.b> list2, String str, C17164e<? super d> eVar) {
            c cVar = new c(this.f60721h, eVar);
            cVar.f60718e = list;
            cVar.f60719f = list2;
            cVar.f60720g = str;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.List} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r9.f60717d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x003d
                if (r1 == r3) goto L_0x002b
                if (r1 != r2) goto L_0x0023
                java.lang.Object r0 = r9.f60716c
                nn.h r0 = (nn.C11662h) r0
                java.lang.Object r0 = r9.f60720g
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r9.f60719f
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r9.f60718e
                java.util.List r0 = (java.util.List) r0
                XH.y.b(r10)
                goto L_0x009b
            L_0x0023:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x002b:
                java.lang.Object r1 = r9.f60720g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r3 = r9.f60719f
                java.util.List r3 = (java.util.List) r3
                java.lang.Object r4 = r9.f60718e
                java.util.List r4 = (java.util.List) r4
                XH.y.b(r10)
                r7 = r1
                r6 = r3
                goto L_0x0072
            L_0x003d:
                XH.y.b(r10)
                java.lang.Object r10 = r9.f60718e
                r4 = r10
                java.util.List r4 = (java.util.List) r4
                java.lang.Object r10 = r9.f60719f
                java.util.List r10 = (java.util.List) r10
                java.lang.Object r1 = r9.f60720g
                java.lang.String r1 = (java.lang.String) r1
                Gf.f r5 = r9.f60721h
                TJ.B r5 = r5.f60708s
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r3)
                r5.setValue(r6)
                Gf.f r5 = r9.f60721h
                hn.e r5 = r5.f60702m
                r9.f60718e = r4
                r9.f60719f = r10
                r9.f60720g = r1
                r9.f60717d = r3
                java.lang.Object r3 = r5.a(r1, r9)
                if (r3 != r0) goto L_0x006f
                return r0
            L_0x006f:
                r6 = r10
                r7 = r1
                r10 = r3
            L_0x0072:
                r5 = r10
                nn.h r5 = (nn.C11662h) r5
                Gf.f r10 = r9.f60721h
                TJ.B r10 = r10.f60708s
                r1 = 0
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r1)
                r10.setValue(r1)
                Gf.f r10 = r9.f60721h
                Gf.e r3 = r10.f60704o
                r9.f60718e = r4
                r9.f60719f = r6
                r9.f60720g = r7
                r9.f60716c = r5
                r9.f60717d = r2
                r8 = r9
                java.lang.Object r10 = r3.b(r4, r5, r6, r7, r8)
                if (r10 != r0) goto L_0x009b
                return r0
            L_0x009b:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: Gf.f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public f(U u10, e eVar, Ff.b bVar, Mg.b bVar2, e eVar2, C10188a aVar, C11414a aVar2, C10395f fVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(eVar, "suggestRepo");
        C17542s.j(bVar, "searchHintsUseCase");
        C17542s.j(bVar2, "localHistoryRepository");
        C17542s.j(eVar2, "searchViewModelUiMapperV2");
        C17542s.j(aVar, "alertMessageIntegration");
        C17542s.j(aVar2, "inboxIntegration");
        C17542s.j(fVar, "searchAnalytics");
        this.f60702m = eVar;
        this.f60703n = bVar2;
        this.f60704o = eVar2;
        this.f60705p = fVar;
        C16505B<String> a10 = C16521S.a("");
        this.f60706q = a10;
        this.f60707r = C16534i.c(a10);
        C16505B<Boolean> a11 = C16521S.a(Boolean.FALSE);
        this.f60708s = a11;
        this.f60709t = C16534i.c(a11);
        C16532g<R> n10 = C16534i.n(aVar.a(), aVar2.getState(), new b((C17164e<? super b>) null));
        Q a12 = g0.a(this);
        C16515L a13 = ip.f.a();
        String str = (String) u10.f("inboxUnreadCount");
        Integer valueOf = str != null ? Integer.valueOf(Integer.parseInt(str)) : null;
        this.f60710u = C16534i.c0(n10, a12, a13, new j((C10189b) null, ((valueOf != null && valueOf.intValue() == 0) || valueOf == null) ? a.b.f80780a : new a.C1544a(valueOf.intValue()), 1, (DefaultConstructorMarker) null));
        this.f60711v = C16534i.c0(C16534i.m(bVar.a(), bVar2.a(8), C16534i.q(a10, 300), new c(this, (C17164e<? super c>) null)), g0.a(this), ip.f.a(), new d((List) null, 1, (DefaultConstructorMarker) null));
    }

    public final C16519P<String> C() {
        return this.f60707r;
    }

    public final C16519P<j> D() {
        return this.f60710u;
    }

    public final C16519P<Boolean> E() {
        return this.f60709t;
    }

    public final void F() {
        this.f60703n.f();
    }

    public final void G(String str, h hVar) {
        C17542s.j(str, FeatureVariable.STRING_TYPE);
        C17542s.j(hVar, "component");
        int i10 = a.f60712a[hVar.ordinal()];
        if (i10 == 1) {
            this.f60705p.f(str);
        } else if (i10 == 2) {
            this.f60705p.a(str);
        } else if (i10 == 3) {
            this.f60705p.e(str);
        } else if (i10 == 4) {
            this.f60705p.b(str);
        } else if (i10 == 5) {
            this.f60705p.d(str);
        } else {
            throw new t();
        }
    }

    public final void H(String str) {
        C17542s.j(str, "itemNo");
        this.f60705p.c(str);
    }

    public final void I(String str) {
        C17542s.j(str, "text");
        this.f60706q.setValue(str);
    }

    public final C16519P<d> m() {
        return this.f60711v;
    }
}
