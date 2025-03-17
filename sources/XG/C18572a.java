package xG;

import OE.q;
import TJ.C16505B;
import TJ.C16515L;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import pG.C17741b;
import pG.C17742c;
import pG.C17744e;
import xG.C18571D;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H@¢\u0006\u0004\b\u001c\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H@¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\fH@¢\u0006\u0004\b\u001e\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u001f\u0010.R \u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000f0'8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010)R#\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000f0+8\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010.R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000f0'8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u0010)R#\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000f0+8\u0006¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u0010.¨\u0006:"}, d2 = {"LxG/a;", "Landroidx/lifecycle/f0;", "LpG/b;", "catalogSearchUseCase", "LpG/e;", "fetchRecentSearchTermsUseCase", "LpG/c;", "fetchSearchSuggestionsUseCase", "LOE/q;", "sugarcube", "<init>", "(LpG/b;LpG/e;LpG/c;LOE/q;)V", "LXH/N;", "k", "(LdI/e;)Ljava/lang/Object;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "data", "F", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LxG/D;", "newState", "H", "(LxG/D;)V", "", "searchTerm", "C", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "j", "G", "i", "m", "LpG/b;", "n", "LpG/e;", "o", "LpG/c;", "p", "LOE/q;", "LTJ/B;", "q", "LTJ/B;", "_uiState", "LTJ/P;", "r", "LTJ/P;", "()LTJ/P;", "uiState", "s", "_searchSuggestions", "t", "E", "searchSuggestions", "u", "_recentSearchTerms", "v", "D", "recentSearchTerms", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xG.a  reason: case insensitive filesystem */
public final class C18572a extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C17741b f152049m;

    /* renamed from: n  reason: collision with root package name */
    private final C17744e f152050n;

    /* renamed from: o  reason: collision with root package name */
    private final C17742c f152051o;

    /* renamed from: p  reason: collision with root package name */
    private final q f152052p;

    /* renamed from: q  reason: collision with root package name */
    private final C16505B<C18571D> f152053q;

    /* renamed from: r  reason: collision with root package name */
    private final C16519P<C18571D> f152054r;

    /* renamed from: s  reason: collision with root package name */
    private final C16505B<List<String>> f152055s;

    /* renamed from: t  reason: collision with root package name */
    private final C16519P<List<String>> f152056t;

    /* renamed from: u  reason: collision with root package name */
    private final C16505B<List<String>> f152057u;

    /* renamed from: v  reason: collision with root package name */
    private final C16519P<List<String>> f152058v;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.CatalogSearchViewModel", f = "CatalogSearchViewModel.kt", l = {118, 119}, m = "clearRecentSearchTerms")
    /* renamed from: xG.a$a  reason: collision with other inner class name */
    static final class C4321a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f152059c;

        /* renamed from: d  reason: collision with root package name */
        Object f152060d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f152061e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C18572a f152062f;

        /* renamed from: g  reason: collision with root package name */
        int f152063g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4321a(C18572a aVar, C17164e<? super C4321a> eVar) {
            super(eVar);
            this.f152062f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f152061e = obj;
            this.f152063g |= Integer.MIN_VALUE;
            return this.f152062f.i(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.CatalogSearchViewModel", f = "CatalogSearchViewModel.kt", l = {70, 74, 75, 76}, m = "fetchItems")
    /* renamed from: xG.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f152064c;

        /* renamed from: d  reason: collision with root package name */
        Object f152065d;

        /* renamed from: e  reason: collision with root package name */
        Object f152066e;

        /* renamed from: f  reason: collision with root package name */
        Object f152067f;

        /* renamed from: g  reason: collision with root package name */
        Object f152068g;

        /* renamed from: h  reason: collision with root package name */
        Object f152069h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f152070i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C18572a f152071j;

        /* renamed from: k  reason: collision with root package name */
        int f152072k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C18572a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f152071j = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f152070i = obj;
            this.f152072k |= Integer.MIN_VALUE;
            return this.f152071j.j((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.CatalogSearchViewModel", f = "CatalogSearchViewModel.kt", l = {111, 111}, m = "fetchRecentSearch")
    /* renamed from: xG.a$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f152073c;

        /* renamed from: d  reason: collision with root package name */
        Object f152074d;

        /* renamed from: e  reason: collision with root package name */
        Object f152075e;

        /* renamed from: f  reason: collision with root package name */
        Object f152076f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f152077g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C18572a f152078h;

        /* renamed from: i  reason: collision with root package name */
        int f152079i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C18572a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f152078h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f152077g = obj;
            this.f152079i |= Integer.MIN_VALUE;
            return this.f152078h.k(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.CatalogSearchViewModel", f = "CatalogSearchViewModel.kt", l = {59, 59}, m = "fetchSuggestions")
    /* renamed from: xG.a$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f152080c;

        /* renamed from: d  reason: collision with root package name */
        Object f152081d;

        /* renamed from: e  reason: collision with root package name */
        Object f152082e;

        /* renamed from: f  reason: collision with root package name */
        Object f152083f;

        /* renamed from: g  reason: collision with root package name */
        Object f152084g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f152085h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C18572a f152086i;

        /* renamed from: j  reason: collision with root package name */
        int f152087j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C18572a aVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f152086i = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f152085h = obj;
            this.f152087j |= Integer.MIN_VALUE;
            return this.f152086i.C((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.CatalogSearchViewModel", f = "CatalogSearchViewModel.kt", l = {97, 101}, m = "loadMore")
    /* renamed from: xG.a$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f152088c;

        /* renamed from: d  reason: collision with root package name */
        Object f152089d;

        /* renamed from: e  reason: collision with root package name */
        Object f152090e;

        /* renamed from: f  reason: collision with root package name */
        Object f152091f;

        /* renamed from: g  reason: collision with root package name */
        Object f152092g;

        /* renamed from: h  reason: collision with root package name */
        Object f152093h;

        /* renamed from: i  reason: collision with root package name */
        Object f152094i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f152095j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C18572a f152096k;

        /* renamed from: l  reason: collision with root package name */
        int f152097l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C18572a aVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f152096k = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f152095j = obj;
            this.f152097l |= Integer.MIN_VALUE;
            return this.f152096k.G((String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTJ/h;", "", "", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.search.CatalogSearchViewModel$recentSearchTerms$1", f = "CatalogSearchViewModel.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: xG.a$f */
    static final class f extends l implements p<C16533h<? super List<? extends String>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f152098c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C18572a f152099d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C18572a aVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f152099d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f152099d, eVar);
        }

        public final Object invoke(C16533h<? super List<String>> hVar, C17164e<? super C16807N> eVar) {
            return ((f) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f152098c;
            if (i10 == 0) {
                y.b(obj);
                C18572a aVar = this.f152099d;
                this.f152098c = 1;
                if (aVar.k(this) == f10) {
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

    public C18572a(C17741b bVar, C17744e eVar, C17742c cVar, q qVar) {
        C17542s.j(bVar, "catalogSearchUseCase");
        C17542s.j(eVar, "fetchRecentSearchTermsUseCase");
        C17542s.j(cVar, "fetchSearchSuggestionsUseCase");
        C17542s.j(qVar, "sugarcube");
        this.f152049m = bVar;
        this.f152050n = eVar;
        this.f152051o = cVar;
        this.f152052p = qVar;
        C16505B<C18571D> a10 = C16521S.a(C18571D.b.f152044a);
        this.f152053q = a10;
        this.f152054r = a10;
        C16505B<List<String>> a11 = C16521S.a(C16877v.n());
        this.f152055s = a11;
        this.f152056t = C16534i.c(a11);
        C16505B<List<String>> a12 = C16521S.a(C16877v.n());
        this.f152057u = a12;
        this.f152058v = C16534i.c0(C16534i.S(a12, new f(this, (C17164e<? super f>) null)), g0.a(this), C16515L.a.b(C16515L.f138570a, 5000, 0, 2, (Object) null), C16877v.n());
    }

    private final Object F(List<CachedCatalogItem> list, C17164e<? super C16807N> eVar) {
        H(new C18571D.c(list, false, this.f152052p.getCountry(), this.f152052p.getLanguage(), 2, (DefaultConstructorMarker) null));
        Object k10 = k(eVar);
        return k10 == C17187b.f() ? k10 : C16807N.f139792a;
    }

    private final void H(C18571D d10) {
        this.f152053q.setValue(d10);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(dI.C17164e<? super XH.C16807N> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof xG.C18572a.c
            if (r0 == 0) goto L_0x0013
            r0 = r9
            xG.a$c r0 = (xG.C18572a.c) r0
            int r1 = r0.f152079i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f152079i = r1
            goto L_0x0018
        L_0x0013:
            xG.a$c r0 = new xG.a$c
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f152077g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f152079i
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0050
            if (r3 == r5) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            java.lang.Object r9 = r0.f152075e
            TJ.B r9 = (TJ.C16505B) r9
            java.lang.Object r9 = r0.f152074d
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r0.f152073c
            xG.a r9 = (xG.C18572a) r9
            XH.y.b(r1)
            goto L_0x0083
        L_0x0038:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0040:
            java.lang.Object r9 = r0.f152075e
            TJ.B r9 = (TJ.C16505B) r9
            java.lang.Object r3 = r0.f152074d
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r5 = r0.f152073c
            xG.a r5 = (xG.C18572a) r5
            XH.y.b(r1)
            goto L_0x006b
        L_0x0050:
            XH.y.b(r1)
            TJ.B<java.util.List<java.lang.String>> r1 = r8.f152057u
            pG.e r3 = r8.f152050n
            r0.f152073c = r8
            r0.f152074d = r9
            r0.f152075e = r1
            r0.f152079i = r5
            java.lang.Object r3 = r3.b(r0)
            if (r3 != r2) goto L_0x0066
            return r2
        L_0x0066:
            r5 = r8
            r7 = r3
            r3 = r9
            r9 = r1
            r1 = r7
        L_0x006b:
            r6 = r1
            java.util.List r6 = (java.util.List) r6
            java.util.List r6 = HK.C15864d.W(r6)
            r0.f152073c = r5
            r0.f152074d = r3
            r0.f152075e = r9
            r0.f152076f = r1
            r0.f152079i = r4
            java.lang.Object r9 = r9.emit(r6, r0)
            if (r9 != r2) goto L_0x0083
            return r2
        L_0x0083:
            XH.N r9 = XH.C16807N.f139792a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xG.C18572a.k(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object C(java.lang.String r9, dI.C17164e<? super XH.C16807N> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof xG.C18572a.d
            if (r0 == 0) goto L_0x0013
            r0 = r10
            xG.a$d r0 = (xG.C18572a.d) r0
            int r1 = r0.f152087j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f152087j = r1
            goto L_0x0018
        L_0x0013:
            xG.a$d r0 = new xG.a$d
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r1 = r0.f152085h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f152087j
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0058
            if (r3 == r5) goto L_0x0044
            if (r3 != r4) goto L_0x003c
            java.lang.Object r9 = r0.f152083f
            TJ.B r9 = (TJ.C16505B) r9
            java.lang.Object r9 = r0.f152082e
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r0.f152081d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.f152080c
            xG.a r9 = (xG.C18572a) r9
            XH.y.b(r1)
            goto L_0x008f
        L_0x003c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0044:
            java.lang.Object r9 = r0.f152083f
            TJ.B r9 = (TJ.C16505B) r9
            java.lang.Object r10 = r0.f152082e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r3 = r0.f152081d
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r0.f152080c
            xG.a r5 = (xG.C18572a) r5
            XH.y.b(r1)
            goto L_0x0075
        L_0x0058:
            XH.y.b(r1)
            TJ.B<java.util.List<java.lang.String>> r1 = r8.f152055s
            pG.c r3 = r8.f152051o
            r0.f152080c = r8
            r0.f152081d = r9
            r0.f152082e = r10
            r0.f152083f = r1
            r0.f152087j = r5
            java.lang.Object r3 = r3.a(r9, r0)
            if (r3 != r2) goto L_0x0070
            return r2
        L_0x0070:
            r5 = r8
            r7 = r3
            r3 = r9
            r9 = r1
            r1 = r7
        L_0x0075:
            r6 = r1
            java.util.List r6 = (java.util.List) r6
            java.util.List r6 = HK.C15864d.W(r6)
            r0.f152080c = r5
            r0.f152081d = r3
            r0.f152082e = r10
            r0.f152083f = r9
            r0.f152084g = r1
            r0.f152087j = r4
            java.lang.Object r9 = r9.emit(r6, r0)
            if (r9 != r2) goto L_0x008f
            return r2
        L_0x008f:
            XH.N r9 = XH.C16807N.f139792a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xG.C18572a.C(java.lang.String, dI.e):java.lang.Object");
    }

    public final C16519P<List<String>> D() {
        return this.f152058v;
    }

    public final C16519P<List<String>> E() {
        return this.f152056t;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object G(java.lang.String r21, dI.C17164e<? super XH.C16807N> r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = r2 instanceof xG.C18572a.e
            if (r3 == 0) goto L_0x0019
            r3 = r2
            xG.a$e r3 = (xG.C18572a.e) r3
            int r4 = r3.f152097l
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f152097l = r4
            goto L_0x001e
        L_0x0019:
            xG.a$e r3 = new xG.a$e
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f152095j
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f152097l
            r7 = 2
            r9 = 1
            if (r6 == 0) goto L_0x0077
            if (r6 == r9) goto L_0x0053
            if (r6 != r7) goto L_0x004b
            java.lang.Object r1 = r3.f152094i
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r3.f152093h
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r3.f152091f
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r3.f152090e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f152089d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f152088c
            xG.a r1 = (xG.C18572a) r1
            XH.y.b(r4)
            goto L_0x0102
        L_0x004b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0053:
            java.lang.Object r1 = r3.f152092g
            xG.D$c r1 = (xG.C18571D.c) r1
            java.lang.Object r1 = r3.f152091f
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r3.f152090e
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r6 = r3.f152089d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r10 = r3.f152088c
            xG.a r10 = (xG.C18572a) r10
            XH.y.b(r4)
            XH.x r4 = (XH.x) r4
            java.lang.Object r4 = r4.j()
            r19 = r4
            r4 = r1
            r1 = r6
            r6 = r19
            goto L_0x00ca
        L_0x0077:
            XH.y.b(r4)
            TJ.P<xG.D> r4 = r0.f152054r
            java.lang.Object r4 = r4.getValue()
            boolean r6 = r4 instanceof xG.C18571D.c
            if (r6 == 0) goto L_0x0088
            r6 = r4
            xG.D$c r6 = (xG.C18571D.c) r6
            goto L_0x0089
        L_0x0088:
            r6 = 0
        L_0x0089:
            if (r6 == 0) goto L_0x0094
            java.util.List r4 = r6.b()
            if (r4 != 0) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            r10 = r4
            goto L_0x009d
        L_0x0094:
            java.util.List r10 = YH.C16877v.n()
            r19 = r10
            r10 = r4
            r4 = r19
        L_0x009d:
            xG.D$c r15 = new xG.D$c
            r16 = 12
            r17 = 0
            r13 = 1
            r14 = 0
            r18 = 0
            r11 = r15
            r12 = r4
            r8 = r15
            r15 = r18
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r0.H(r8)
            pG.b r8 = r0.f152049m
            r3.f152088c = r0
            r3.f152089d = r1
            r3.f152090e = r2
            r3.f152091f = r4
            r3.f152092g = r6
            r3.f152093h = r10
            r3.f152097l = r9
            java.lang.Object r6 = r8.a(r1, r3)
            if (r6 != r5) goto L_0x00c9
            return r5
        L_0x00c9:
            r10 = r0
        L_0x00ca:
            boolean r8 = XH.x.h(r6)
            if (r8 == 0) goto L_0x0105
            boolean r8 = XH.x.g(r6)
            if (r8 == 0) goto L_0x00d8
            r8 = 0
            goto L_0x00d9
        L_0x00d8:
            r8 = r6
        L_0x00d9:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L_0x00e1
            java.util.List r8 = YH.C16877v.n()
        L_0x00e1:
            r9 = r4
            java.util.Collection r9 = (java.util.Collection) r9
            r11 = r8
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.List r9 = YH.C16877v.V0(r9, r11)
            r3.f152088c = r10
            r3.f152089d = r1
            r3.f152090e = r2
            r3.f152091f = r4
            r3.f152092g = r6
            r3.f152093h = r8
            r3.f152094i = r9
            r3.f152097l = r7
            java.lang.Object r1 = r10.F(r9, r3)
            if (r1 != r5) goto L_0x0102
            return r5
        L_0x0102:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x0105:
            xG.D$a r1 = new xG.D$a
            r2 = 0
            r3 = 0
            r1.<init>(r2, r9, r3)
            r10.H(r1)
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xG.C18572a.G(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(dI.C17164e<? super XH.C16807N> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof xG.C18572a.C4321a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            xG.a$a r0 = (xG.C18572a.C4321a) r0
            int r1 = r0.f152063g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f152063g = r1
            goto L_0x0018
        L_0x0013:
            xG.a$a r0 = new xG.a$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f152061e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f152063g
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0048
            if (r3 == r5) goto L_0x003c
            if (r3 != r4) goto L_0x0034
            java.lang.Object r7 = r0.f152060d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f152059c
            xG.a r7 = (xG.C18572a) r7
            XH.y.b(r1)
            goto L_0x0068
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003c:
            java.lang.Object r7 = r0.f152060d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r3 = r0.f152059c
            xG.a r3 = (xG.C18572a) r3
            XH.y.b(r1)
            goto L_0x005b
        L_0x0048:
            XH.y.b(r1)
            pG.e r1 = r6.f152050n
            r0.f152059c = r6
            r0.f152060d = r7
            r0.f152063g = r5
            java.lang.Object r1 = r1.a(r0)
            if (r1 != r2) goto L_0x005a
            return r2
        L_0x005a:
            r3 = r6
        L_0x005b:
            r0.f152059c = r3
            r0.f152060d = r7
            r0.f152063g = r4
            java.lang.Object r7 = r3.k(r0)
            if (r7 != r2) goto L_0x0068
            return r2
        L_0x0068:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xG.C18572a.i(dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: dI.e<? super XH.N>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0106 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.lang.String r11, dI.C17164e<? super XH.C16807N> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof xG.C18572a.b
            if (r0 == 0) goto L_0x0013
            r0 = r12
            xG.a$b r0 = (xG.C18572a.b) r0
            int r1 = r0.f152072k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f152072k = r1
            goto L_0x0018
        L_0x0013:
            xG.a$b r0 = new xG.a$b
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r1 = r0.f152070i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f152072k
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x009c
            if (r3 == r7) goto L_0x0085
            if (r3 == r6) goto L_0x006a
            if (r3 == r5) goto L_0x004f
            if (r3 != r4) goto L_0x0047
            java.lang.Object r11 = r0.f152069h
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = r0.f152068g
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = r0.f152066e
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r11 = r0.f152065d
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r0.f152064c
            xG.a r11 = (xG.C18572a) r11
            XH.y.b(r1)
            goto L_0x011f
        L_0x0047:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004f:
            java.lang.Object r11 = r0.f152069h
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r0.f152068g
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r3 = r0.f152067f
            java.lang.Object r5 = r0.f152066e
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r6 = r0.f152065d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.f152064c
            xG.a r7 = (xG.C18572a) r7
            XH.y.b(r1)
            goto L_0x010a
        L_0x006a:
            java.lang.Object r11 = r0.f152069h
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r0.f152068g
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r3 = r0.f152067f
            java.lang.Object r6 = r0.f152066e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r7 = r0.f152065d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.f152064c
            xG.a r8 = (xG.C18572a) r8
            XH.y.b(r1)
            goto L_0x00ec
        L_0x0085:
            java.lang.Object r11 = r0.f152066e
            r12 = r11
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r11 = r0.f152065d
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r3 = r0.f152064c
            xG.a r3 = (xG.C18572a) r3
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r1 = r1.j()
            goto L_0x00b6
        L_0x009c:
            XH.y.b(r1)
            xG.D$b r1 = xG.C18571D.b.f152044a
            r10.H(r1)
            pG.b r1 = r10.f152049m
            r0.f152064c = r10
            r0.f152065d = r11
            r0.f152066e = r12
            r0.f152072k = r7
            java.lang.Object r1 = r1.e(r11, r0)
            if (r1 != r2) goto L_0x00b5
            return r2
        L_0x00b5:
            r3 = r10
        L_0x00b6:
            boolean r8 = XH.x.h(r1)
            r9 = 0
            if (r8 == 0) goto L_0x0122
            boolean r7 = XH.x.g(r1)
            if (r7 == 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r9 = r1
        L_0x00c5:
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L_0x00ce
            java.util.List r7 = YH.C16877v.n()
            goto L_0x00cf
        L_0x00ce:
            r7 = r9
        L_0x00cf:
            pG.e r8 = r3.f152050n
            r0.f152064c = r3
            r0.f152065d = r11
            r0.f152066e = r12
            r0.f152067f = r1
            r0.f152068g = r7
            r0.f152069h = r9
            r0.f152072k = r6
            java.lang.Object r6 = r8.c(r11, r0)
            if (r6 != r2) goto L_0x00e6
            return r2
        L_0x00e6:
            r6 = r12
            r8 = r3
            r12 = r7
            r7 = r11
            r3 = r1
            r11 = r9
        L_0x00ec:
            TJ.B<java.util.List<java.lang.String>> r1 = r8.f152055s
            java.util.List r9 = YH.C16877v.n()
            r0.f152064c = r8
            r0.f152065d = r7
            r0.f152066e = r6
            r0.f152067f = r3
            r0.f152068g = r12
            r0.f152069h = r11
            r0.f152072k = r5
            java.lang.Object r1 = r1.emit(r9, r0)
            if (r1 != r2) goto L_0x0107
            return r2
        L_0x0107:
            r5 = r6
            r6 = r7
            r7 = r8
        L_0x010a:
            r0.f152064c = r7
            r0.f152065d = r6
            r0.f152066e = r5
            r0.f152067f = r3
            r0.f152068g = r12
            r0.f152069h = r11
            r0.f152072k = r4
            java.lang.Object r11 = r7.F(r12, r0)
            if (r11 != r2) goto L_0x011f
            return r2
        L_0x011f:
            XH.N r11 = XH.C16807N.f139792a
            return r11
        L_0x0122:
            xG.D$a r11 = new xG.D$a
            r12 = 0
            r11.<init>(r12, r7, r9)
            r3.H(r11)
            XH.N r11 = XH.C16807N.f139792a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: xG.C18572a.j(java.lang.String, dI.e):java.lang.Object");
    }

    public final C16519P<C18571D> m() {
        return this.f152054r;
    }
}
