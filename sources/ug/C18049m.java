package uG;

import JG.C15929K;
import KJ.C15987c;
import MG.C16038g;
import NG.C16093b;
import OG.l0;
import OG.s0;
import OG.t0;
import OG.u0;
import OG.v0;
import PG.C16186d;
import SG.C16415m;
import TJ.C16505B;
import UG.C16569f;
import VG.C16653f;
import XG.C16793h;
import XH.x;
import YG.l;
import YH.C16877v;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.source.QuickFilterRepository;
import com.sugarcube.core.network.models.QuickFilter;
import com.sugarcube.core.network.models.RoomType;
import com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.browse.BrowseViewModel;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kG.C17497c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pG.C17740a;
import pG.C17741b;
import sG.r;
import uG.C18048l;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0019\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u001b\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u001f\u0010\u0017J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020 H\u0002¢\u0006\u0004\b%\u0010#J\u0018\u0010&\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b&\u0010\u0017J\u0018\u0010'\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b'\u0010\u0017J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048BX\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"LuG/m;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/ui/catalog/browse/BrowseViewModel;", "LpG/a;", "catalogBrowseUseCase", "Lcom/sugarcube/app/base/data/source/QuickFilterRepository;", "quickFilterRepository", "LpG/b;", "catalogSearchUseCase", "LNG/b;", "decorateStateHolder", "<init>", "(LpG/a;Lcom/sugarcube/app/base/data/source/QuickFilterRepository;LpG/b;LNG/b;)V", "LuG/l;", "newState", "LXH/N;", "m", "(LuG/l;)V", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "LXH/x;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "f", "(Lcom/sugarcube/core/network/models/RoomType;LdI/e;)Ljava/lang/Object;", "data", "j", "(Ljava/util/List;Lcom/sugarcube/core/network/models/RoomType;LdI/e;)Ljava/lang/Object;", "g", "newItems", "i", "(Ljava/util/List;)V", "e", "", "isLoading", "k", "(Z)V", "isPaging", "l", "fetchItems", "loadMore", "Lcom/sugarcube/core/network/models/QuickFilter;", "filter", "applyFilter", "(Lcom/sugarcube/core/network/models/QuickFilter;)V", "a", "LpG/a;", "b", "Lcom/sugarcube/app/base/data/source/QuickFilterRepository;", "c", "LpG/b;", "d", "LNG/b;", "LTJ/B;", "LOG/l0;", "h", "()LTJ/B;", "uiState", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uG.m  reason: case insensitive filesystem */
public final class C18049m implements BrowseViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final C17740a f147725a;

    /* renamed from: b  reason: collision with root package name */
    private final QuickFilterRepository f147726b;

    /* renamed from: c  reason: collision with root package name */
    private final C17741b f147727c;

    /* renamed from: d  reason: collision with root package name */
    private final C16093b f147728d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.browse.BrowseViewModelImpl", f = "BrowseViewModel.kt", l = {149}, m = "fetchFilters")
    /* renamed from: uG.m$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f147729c;

        /* renamed from: d  reason: collision with root package name */
        Object f147730d;

        /* renamed from: e  reason: collision with root package name */
        Object f147731e;

        /* renamed from: f  reason: collision with root package name */
        Object f147732f;

        /* renamed from: g  reason: collision with root package name */
        Object f147733g;

        /* renamed from: h  reason: collision with root package name */
        Object f147734h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f147735i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C18049m f147736j;

        /* renamed from: k  reason: collision with root package name */
        int f147737k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C18049m mVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f147736j = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f147735i = obj;
            this.f147737k |= Integer.MIN_VALUE;
            return this.f147736j.e((RoomType) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.browse.BrowseViewModelImpl", f = "BrowseViewModel.kt", l = {74, 76, 80}, m = "fetchItems")
    /* renamed from: uG.m$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f147738c;

        /* renamed from: d  reason: collision with root package name */
        Object f147739d;

        /* renamed from: e  reason: collision with root package name */
        Object f147740e;

        /* renamed from: f  reason: collision with root package name */
        Object f147741f;

        /* renamed from: g  reason: collision with root package name */
        Object f147742g;

        /* renamed from: h  reason: collision with root package name */
        Object f147743h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f147744i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C18049m f147745j;

        /* renamed from: k  reason: collision with root package name */
        int f147746k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C18049m mVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f147745j = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f147744i = obj;
            this.f147746k |= Integer.MIN_VALUE;
            return this.f147745j.fetchItems((RoomType) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.browse.BrowseViewModelImpl", f = "BrowseViewModel.kt", l = {90, 92}, m = "fetchItemsBasedOnFilter-gIAlu-s")
    /* renamed from: uG.m$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f147747c;

        /* renamed from: d  reason: collision with root package name */
        Object f147748d;

        /* renamed from: e  reason: collision with root package name */
        Object f147749e;

        /* renamed from: f  reason: collision with root package name */
        Object f147750f;

        /* renamed from: g  reason: collision with root package name */
        Object f147751g;

        /* renamed from: h  reason: collision with root package name */
        Object f147752h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f147753i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C18049m f147754j;

        /* renamed from: k  reason: collision with root package name */
        int f147755k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C18049m mVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f147754j = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f147753i = obj;
            this.f147755k |= Integer.MIN_VALUE;
            Object b10 = this.f147754j.f((RoomType) null, this);
            return b10 == C17187b.f() ? b10 : x.a(b10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.browse.BrowseViewModelImpl", f = "BrowseViewModel.kt", l = {129, 131}, m = "fetchMoreItemsBasedOnFilter-gIAlu-s")
    /* renamed from: uG.m$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f147756c;

        /* renamed from: d  reason: collision with root package name */
        Object f147757d;

        /* renamed from: e  reason: collision with root package name */
        Object f147758e;

        /* renamed from: f  reason: collision with root package name */
        Object f147759f;

        /* renamed from: g  reason: collision with root package name */
        Object f147760g;

        /* renamed from: h  reason: collision with root package name */
        Object f147761h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f147762i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C18049m f147763j;

        /* renamed from: k  reason: collision with root package name */
        int f147764k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C18049m mVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f147763j = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f147762i = obj;
            this.f147764k |= Integer.MIN_VALUE;
            Object c10 = this.f147763j.g((RoomType) null, this);
            return c10 == C17187b.f() ? c10 : x.a(c10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.browse.BrowseViewModelImpl", f = "BrowseViewModel.kt", l = {97}, m = "handleSuccess")
    /* renamed from: uG.m$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f147765c;

        /* renamed from: d  reason: collision with root package name */
        Object f147766d;

        /* renamed from: e  reason: collision with root package name */
        Object f147767e;

        /* renamed from: f  reason: collision with root package name */
        Object f147768f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f147769g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C18049m f147770h;

        /* renamed from: i  reason: collision with root package name */
        int f147771i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C18049m mVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f147770h = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f147769g = obj;
            this.f147771i |= Integer.MIN_VALUE;
            return this.f147770h.j((List<CachedCatalogItem>) null, (RoomType) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.browse.BrowseViewModelImpl", f = "BrowseViewModel.kt", l = {115}, m = "loadMore")
    /* renamed from: uG.m$f */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f147772c;

        /* renamed from: d  reason: collision with root package name */
        Object f147773d;

        /* renamed from: e  reason: collision with root package name */
        Object f147774e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f147775f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C18049m f147776g;

        /* renamed from: h  reason: collision with root package name */
        int f147777h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C18049m mVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f147776g = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f147775f = obj;
            this.f147777h |= Integer.MIN_VALUE;
            return this.f147776g.loadMore((RoomType) null, this);
        }
    }

    public C18049m(C17740a aVar, QuickFilterRepository quickFilterRepository, C17741b bVar, C16093b bVar2) {
        C17542s.j(aVar, "catalogBrowseUseCase");
        C17542s.j(quickFilterRepository, "quickFilterRepository");
        C17542s.j(bVar, "catalogSearchUseCase");
        C17542s.j(bVar2, "decorateStateHolder");
        this.f147725a = aVar;
        this.f147726b = quickFilterRepository;
        this.f147727c = bVar;
        this.f147728d = bVar2;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [uG.l, java.lang.Object] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(com.sugarcube.core.network.models.RoomType r25, dI.C17164e<? super XH.C16807N> r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            boolean r2 = r1 instanceof uG.C18049m.a
            if (r2 == 0) goto L_0x0018
            r2 = r1
            uG.m$a r2 = (uG.C18049m.a) r2
            int r3 = r2.f147737k
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.f147737k = r3
        L_0x0016:
            r7 = r2
            goto L_0x001e
        L_0x0018:
            uG.m$a r2 = new uG.m$a
            r2.<init>(r0, r1)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r2 = r7.f147735i
            java.lang.Object r10 = eI.C17187b.f()
            int r3 = r7.f147737k
            r4 = 1
            if (r3 == 0) goto L_0x0050
            if (r3 != r4) goto L_0x0048
            java.lang.Object r1 = r7.f147734h
            uG.l r1 = (uG.C18048l) r1
            java.lang.Object r1 = r7.f147733g
            uG.l$b r1 = (uG.C18048l.b) r1
            java.lang.Object r1 = r7.f147732f
            uG.l$b r1 = (uG.C18048l.b) r1
            java.lang.Object r3 = r7.f147731e
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r3 = r7.f147730d
            com.sugarcube.core.network.models.RoomType r3 = (com.sugarcube.core.network.models.RoomType) r3
            java.lang.Object r3 = r7.f147729c
            uG.m r3 = (uG.C18049m) r3
            XH.y.b(r2)
            r12 = r1
            goto L_0x0093
        L_0x0048:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0050:
            XH.y.b(r2)
            TJ.B r2 = r24.h()
            java.lang.Object r2 = r2.getValue()
            OG.l0 r2 = (OG.l0) r2
            uG.l r2 = r2.d()
            boolean r3 = r2 instanceof uG.C18048l.b
            if (r3 == 0) goto L_0x006a
            r3 = r2
            uG.l$b r3 = (uG.C18048l.b) r3
        L_0x0068:
            r11 = r3
            goto L_0x006c
        L_0x006a:
            r3 = 0
            goto L_0x0068
        L_0x006c:
            if (r11 != 0) goto L_0x0071
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x0071:
            com.sugarcube.app.base.data.source.QuickFilterRepository r3 = r0.f147726b
            r7.f147729c = r0
            r5 = r25
            r7.f147730d = r5
            r7.f147731e = r1
            r7.f147732f = r11
            r7.f147733g = r11
            r7.f147734h = r2
            r7.f147737k = r4
            r1 = 0
            r6 = 0
            r8 = 6
            r9 = 0
            r4 = r25
            r5 = r1
            java.lang.Object r2 = com.sugarcube.app.base.data.source.QuickFilterRepositorySource.getQuickFilters$default(r3, r4, r5, r6, r7, r8, r9)
            if (r2 != r10) goto L_0x0091
            return r10
        L_0x0091:
            r3 = r0
            r12 = r11
        L_0x0093:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            KJ.f r18 = KJ.C15985a.l(r2)
            r22 = 479(0x1df, float:6.71E-43)
            r23 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            uG.l$b r1 = uG.C18048l.b.b(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r3.m(r1)
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uG.C18049m.e(com.sugarcube.core.network.models.RoomType, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(com.sugarcube.core.network.models.RoomType r8, dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof uG.C18049m.c
            if (r0 == 0) goto L_0x0013
            r0 = r9
            uG.m$c r0 = (uG.C18049m.c) r0
            int r1 = r0.f147755k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f147755k = r1
            goto L_0x0018
        L_0x0013:
            uG.m$c r0 = new uG.m$c
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f147753i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f147755k
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0075
            if (r3 == r5) goto L_0x0053
            if (r3 != r4) goto L_0x004b
            java.lang.Object r8 = r0.f147752h
            uG.l r8 = (uG.C18048l) r8
            java.lang.Object r8 = r0.f147751g
            uG.l$b r8 = (uG.C18048l.b) r8
            java.lang.Object r8 = r0.f147750f
            uG.l$b r8 = (uG.C18048l.b) r8
            java.lang.Object r8 = r0.f147749e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f147748d
            com.sugarcube.core.network.models.RoomType r8 = (com.sugarcube.core.network.models.RoomType) r8
            java.lang.Object r8 = r0.f147747c
            uG.m r8 = (uG.C18049m) r8
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r8 = r1.j()
            goto L_0x00e4
        L_0x004b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0053:
            java.lang.Object r8 = r0.f147752h
            uG.l r8 = (uG.C18048l) r8
            java.lang.Object r8 = r0.f147751g
            uG.l$b r8 = (uG.C18048l.b) r8
            java.lang.Object r8 = r0.f147750f
            uG.l$b r8 = (uG.C18048l.b) r8
            java.lang.Object r8 = r0.f147749e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f147748d
            com.sugarcube.core.network.models.RoomType r8 = (com.sugarcube.core.network.models.RoomType) r8
            java.lang.Object r8 = r0.f147747c
            uG.m r8 = (uG.C18049m) r8
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r8 = r1.j()
            goto L_0x00cc
        L_0x0075:
            XH.y.b(r1)
            TJ.B r1 = r7.h()
            java.lang.Object r1 = r1.getValue()
            OG.l0 r1 = (OG.l0) r1
            uG.l r1 = r1.d()
            boolean r3 = r1 instanceof uG.C18048l.b
            if (r3 == 0) goto L_0x008e
            r3 = r1
            uG.l$b r3 = (uG.C18048l.b) r3
            goto L_0x008f
        L_0x008e:
            r3 = 0
        L_0x008f:
            if (r3 != 0) goto L_0x00a3
            XH.x$a r8 = XH.x.f139812b
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "Invalid State"
            r8.<init>(r9)
            java.lang.Object r8 = XH.y.a(r8)
            java.lang.Object r8 = XH.x.b(r8)
            return r8
        L_0x00a3:
            com.sugarcube.core.network.models.QuickFilter r6 = r3.g()
            if (r6 == 0) goto L_0x00cd
            pG.b r4 = r7.f147727c
            com.sugarcube.core.network.models.QuickFilter r6 = r3.g()
            java.lang.String r6 = r6.getLabel()
            if (r6 != 0) goto L_0x00b7
            java.lang.String r6 = ""
        L_0x00b7:
            r0.f147747c = r7
            r0.f147748d = r8
            r0.f147749e = r9
            r0.f147750f = r3
            r0.f147751g = r3
            r0.f147752h = r1
            r0.f147755k = r5
            java.lang.Object r8 = r4.e(r6, r0)
            if (r8 != r2) goto L_0x00cc
            return r2
        L_0x00cc:
            return r8
        L_0x00cd:
            pG.a r5 = r7.f147725a
            r0.f147747c = r7
            r0.f147748d = r8
            r0.f147749e = r9
            r0.f147750f = r3
            r0.f147751g = r3
            r0.f147752h = r1
            r0.f147755k = r4
            java.lang.Object r8 = r5.c(r8, r0)
            if (r8 != r2) goto L_0x00e4
            return r2
        L_0x00e4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: uG.C18049m.f(com.sugarcube.core.network.models.RoomType, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(com.sugarcube.core.network.models.RoomType r8, dI.C17164e<? super XH.x<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof uG.C18049m.d
            if (r0 == 0) goto L_0x0013
            r0 = r9
            uG.m$d r0 = (uG.C18049m.d) r0
            int r1 = r0.f147764k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f147764k = r1
            goto L_0x0018
        L_0x0013:
            uG.m$d r0 = new uG.m$d
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f147762i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f147764k
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0075
            if (r3 == r5) goto L_0x0053
            if (r3 != r4) goto L_0x004b
            java.lang.Object r8 = r0.f147761h
            uG.l r8 = (uG.C18048l) r8
            java.lang.Object r8 = r0.f147760g
            uG.l$b r8 = (uG.C18048l.b) r8
            java.lang.Object r8 = r0.f147759f
            uG.l$b r8 = (uG.C18048l.b) r8
            java.lang.Object r8 = r0.f147758e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f147757d
            com.sugarcube.core.network.models.RoomType r8 = (com.sugarcube.core.network.models.RoomType) r8
            java.lang.Object r8 = r0.f147756c
            uG.m r8 = (uG.C18049m) r8
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r8 = r1.j()
            goto L_0x00e4
        L_0x004b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0053:
            java.lang.Object r8 = r0.f147761h
            uG.l r8 = (uG.C18048l) r8
            java.lang.Object r8 = r0.f147760g
            uG.l$b r8 = (uG.C18048l.b) r8
            java.lang.Object r8 = r0.f147759f
            uG.l$b r8 = (uG.C18048l.b) r8
            java.lang.Object r8 = r0.f147758e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f147757d
            com.sugarcube.core.network.models.RoomType r8 = (com.sugarcube.core.network.models.RoomType) r8
            java.lang.Object r8 = r0.f147756c
            uG.m r8 = (uG.C18049m) r8
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r8 = r1.j()
            goto L_0x00cc
        L_0x0075:
            XH.y.b(r1)
            TJ.B r1 = r7.h()
            java.lang.Object r1 = r1.getValue()
            OG.l0 r1 = (OG.l0) r1
            uG.l r1 = r1.d()
            boolean r3 = r1 instanceof uG.C18048l.b
            if (r3 == 0) goto L_0x008e
            r3 = r1
            uG.l$b r3 = (uG.C18048l.b) r3
            goto L_0x008f
        L_0x008e:
            r3 = 0
        L_0x008f:
            if (r3 != 0) goto L_0x00a3
            XH.x$a r8 = XH.x.f139812b
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "Invalid State"
            r8.<init>(r9)
            java.lang.Object r8 = XH.y.a(r8)
            java.lang.Object r8 = XH.x.b(r8)
            return r8
        L_0x00a3:
            com.sugarcube.core.network.models.QuickFilter r6 = r3.g()
            if (r6 == 0) goto L_0x00cd
            pG.b r4 = r7.f147727c
            com.sugarcube.core.network.models.QuickFilter r6 = r3.g()
            java.lang.String r6 = r6.getLabel()
            if (r6 != 0) goto L_0x00b7
            java.lang.String r6 = ""
        L_0x00b7:
            r0.f147756c = r7
            r0.f147757d = r8
            r0.f147758e = r9
            r0.f147759f = r3
            r0.f147760g = r3
            r0.f147761h = r1
            r0.f147764k = r5
            java.lang.Object r8 = r4.a(r6, r0)
            if (r8 != r2) goto L_0x00cc
            return r2
        L_0x00cc:
            return r8
        L_0x00cd:
            pG.a r5 = r7.f147725a
            r0.f147756c = r7
            r0.f147757d = r8
            r0.f147758e = r9
            r0.f147759f = r3
            r0.f147760g = r3
            r0.f147761h = r1
            r0.f147764k = r4
            java.lang.Object r8 = r5.d(r8, r0)
            if (r8 != r2) goto L_0x00e4
            return r2
        L_0x00e4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: uG.C18049m.g(com.sugarcube.core.network.models.RoomType, dI.e):java.lang.Object");
    }

    private final C16505B<l0> h() {
        return this.f147728d.a();
    }

    private final void i(List<CachedCatalogItem> list) {
        C18048l d10 = h().getValue().d();
        C18048l.b bVar = d10 instanceof C18048l.b ? (C18048l.b) d10 : null;
        if (bVar != null) {
            m(C18048l.b.b(bVar, C16877v.V0(bVar.e(), list), false, false, (String) null, (String) null, (C15987c) null, (QuickFilter) null, false, 0, 506, (Object) null));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem> r19, com.sugarcube.core.network.models.RoomType r20, dI.C17164e<? super XH.C16807N> r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof uG.C18049m.e
            if (r3 == 0) goto L_0x0019
            r3 = r2
            uG.m$e r3 = (uG.C18049m.e) r3
            int r4 = r3.f147771i
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f147771i = r4
            goto L_0x001e
        L_0x0019:
            uG.m$e r3 = new uG.m$e
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f147769g
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f147771i
            r7 = 1
            if (r6 == 0) goto L_0x0047
            if (r6 != r7) goto L_0x003f
            java.lang.Object r1 = r3.f147768f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f147767e
            com.sugarcube.core.network.models.RoomType r1 = (com.sugarcube.core.network.models.RoomType) r1
            java.lang.Object r1 = r3.f147766d
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r3.f147765c
            uG.m r2 = (uG.C18049m) r2
            XH.y.b(r4)
            goto L_0x005f
        L_0x003f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0047:
            XH.y.b(r4)
            r3.f147765c = r0
            r4 = r19
            r3.f147766d = r4
            r3.f147767e = r1
            r3.f147768f = r2
            r3.f147771i = r7
            java.lang.Object r1 = r0.e(r1, r3)
            if (r1 != r5) goto L_0x005d
            return r5
        L_0x005d:
            r2 = r0
            r1 = r4
        L_0x005f:
            TJ.B r3 = r2.h()
            java.lang.Object r3 = r3.getValue()
            OG.l0 r3 = (OG.l0) r3
            uG.l r3 = r3.d()
            boolean r4 = r3 instanceof uG.C18048l.b
            if (r4 == 0) goto L_0x0075
            uG.l$b r3 = (uG.C18048l.b) r3
        L_0x0073:
            r6 = r3
            goto L_0x0077
        L_0x0075:
            r3 = 0
            goto L_0x0073
        L_0x0077:
            if (r6 == 0) goto L_0x008c
            r16 = 376(0x178, float:5.27E-43)
            r17 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r7 = r1
            uG.l$b r3 = uG.C18048l.b.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r3 != 0) goto L_0x009f
        L_0x008c:
            uG.l$b r3 = new uG.l$b
            r16 = 510(0x1fe, float:7.15E-43)
            r17 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r6 = r3
            r7 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x009f:
            r2.m(r3)
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uG.C18049m.j(java.util.List, com.sugarcube.core.network.models.RoomType, dI.e):java.lang.Object");
    }

    private final void k(boolean z10) {
        C18048l d10 = h().getValue().d();
        C18048l.b bVar = d10 instanceof C18048l.b ? (C18048l.b) d10 : null;
        if (bVar == null) {
            bVar = new C18048l.b((List) null, false, false, (String) null, (String) null, (C15987c) null, (QuickFilter) null, false, 0, 511, (DefaultConstructorMarker) null);
        }
        m(C18048l.b.b(bVar, (List) null, z10, false, (String) null, (String) null, (C15987c) null, (QuickFilter) null, false, 0, 381, (Object) null));
    }

    private final void l(boolean z10) {
        C18048l d10 = h().getValue().d();
        C18048l.b bVar = d10 instanceof C18048l.b ? (C18048l.b) d10 : null;
        if (bVar == null) {
            bVar = new C18048l.b((List) null, false, false, (String) null, (String) null, (C15987c) null, (QuickFilter) null, false, 0, 511, (DefaultConstructorMarker) null);
        }
        m(C18048l.b.b(bVar, (List) null, false, z10, (String) null, (String) null, (C15987c) null, (QuickFilter) null, false, 0, 377, (Object) null));
    }

    private final void m(C18048l lVar) {
        C16505B<l0> h10 = h();
        C16505B<l0> b10 = h10;
        b10.setValue(l0.b(h().getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (r) null, lVar, (C16569f) null, (u0) null, (t0) null, (l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134213631, (Object) null));
    }

    public void applyFilter(QuickFilter quickFilter) {
        QuickFilter quickFilter2 = quickFilter;
        C17542s.j(quickFilter2, "filter");
        C18048l d10 = h().getValue().d();
        C18048l.b bVar = d10 instanceof C18048l.b ? (C18048l.b) d10 : null;
        if (bVar != null && !bVar.h()) {
            m(C18048l.b.b(bVar, (List) null, false, false, (String) null, (String) null, (C15987c) null, C17542s.e(bVar.g(), quickFilter2) ? null : quickFilter2, false, 0, 447, (Object) null));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: dI.e<? super XH.N>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0097 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object fetchItems(com.sugarcube.core.network.models.RoomType r10, dI.C17164e<? super XH.C16807N> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof uG.C18049m.b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            uG.m$b r0 = (uG.C18049m.b) r0
            int r1 = r0.f147746k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f147746k = r1
            goto L_0x0018
        L_0x0013:
            uG.m$b r0 = new uG.m$b
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f147744i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f147746k
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0073
            if (r3 == r6) goto L_0x0062
            if (r3 == r5) goto L_0x004c
            if (r3 != r4) goto L_0x0044
            java.lang.Object r10 = r0.f147743h
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = r0.f147742g
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = r0.f147740e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f147739d
            com.sugarcube.core.network.models.RoomType r10 = (com.sugarcube.core.network.models.RoomType) r10
            java.lang.Object r10 = r0.f147738c
            uG.m r10 = (uG.C18049m) r10
            XH.y.b(r1)
            goto L_0x00c9
        L_0x0044:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x004c:
            java.lang.Object r10 = r0.f147740e
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r0.f147739d
            com.sugarcube.core.network.models.RoomType r11 = (com.sugarcube.core.network.models.RoomType) r11
            java.lang.Object r3 = r0.f147738c
            uG.m r3 = (uG.C18049m) r3
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r1 = r1.j()
            goto L_0x009b
        L_0x0062:
            java.lang.Object r10 = r0.f147740e
            r11 = r10
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r10 = r0.f147739d
            com.sugarcube.core.network.models.RoomType r10 = (com.sugarcube.core.network.models.RoomType) r10
            java.lang.Object r3 = r0.f147738c
            uG.m r3 = (uG.C18049m) r3
            XH.y.b(r1)
            goto L_0x0089
        L_0x0073:
            XH.y.b(r1)
            r9.k(r6)
            r0.f147738c = r9
            r0.f147739d = r10
            r0.f147740e = r11
            r0.f147746k = r6
            java.lang.Object r1 = r9.e(r10, r0)
            if (r1 != r2) goto L_0x0088
            return r2
        L_0x0088:
            r3 = r9
        L_0x0089:
            r0.f147738c = r3
            r0.f147739d = r10
            r0.f147740e = r11
            r0.f147746k = r5
            java.lang.Object r1 = r3.f(r10, r0)
            if (r1 != r2) goto L_0x0098
            return r2
        L_0x0098:
            r8 = r11
            r11 = r10
            r10 = r8
        L_0x009b:
            boolean r5 = XH.x.h(r1)
            r7 = 0
            if (r5 == 0) goto L_0x00cc
            boolean r5 = XH.x.g(r1)
            if (r5 == 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r7 = r1
        L_0x00aa:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L_0x00b3
            java.util.List r5 = YH.C16877v.n()
            goto L_0x00b4
        L_0x00b3:
            r5 = r7
        L_0x00b4:
            r0.f147738c = r3
            r0.f147739d = r11
            r0.f147740e = r10
            r0.f147741f = r1
            r0.f147742g = r5
            r0.f147743h = r7
            r0.f147746k = r4
            java.lang.Object r10 = r3.j(r5, r11, r0)
            if (r10 != r2) goto L_0x00c9
            return r2
        L_0x00c9:
            XH.N r10 = XH.C16807N.f139792a
            return r10
        L_0x00cc:
            uG.l$a r10 = new uG.l$a
            r11 = 0
            r10.<init>(r11, r6, r7)
            r3.m(r10)
            XH.N r10 = XH.C16807N.f139792a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: uG.C18049m.fetchItems(com.sugarcube.core.network.models.RoomType, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object loadMore(com.sugarcube.core.network.models.RoomType r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof uG.C18049m.f
            if (r0 == 0) goto L_0x0013
            r0 = r7
            uG.m$f r0 = (uG.C18049m.f) r0
            int r1 = r0.f147777h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f147777h = r1
            goto L_0x0018
        L_0x0013:
            uG.m$f r0 = new uG.m$f
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f147775f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f147777h
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r6 = r0.f147774e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f147773d
            com.sugarcube.core.network.models.RoomType r6 = (com.sugarcube.core.network.models.RoomType) r6
            java.lang.Object r6 = r0.f147772c
            uG.m r6 = (uG.C18049m) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r7 = r1.j()
            goto L_0x0059
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            XH.y.b(r1)
            r5.l(r4)
            r0.f147772c = r5
            r0.f147773d = r6
            r0.f147774e = r7
            r0.f147777h = r4
            java.lang.Object r7 = r5.g(r6, r0)
            if (r7 != r2) goto L_0x0058
            return r2
        L_0x0058:
            r6 = r5
        L_0x0059:
            boolean r0 = XH.x.h(r7)
            r1 = 0
            if (r0 == 0) goto L_0x0073
            boolean r0 = XH.x.g(r7)
            if (r0 == 0) goto L_0x0067
            r7 = r1
        L_0x0067:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L_0x006f
            java.util.List r7 = YH.C16877v.n()
        L_0x006f:
            r6.i(r7)
            goto L_0x007c
        L_0x0073:
            uG.l$a r7 = new uG.l$a
            r0 = 0
            r7.<init>(r0, r4, r1)
            r6.m(r7)
        L_0x007c:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uG.C18049m.loadMore(com.sugarcube.core.network.models.RoomType, dI.e):java.lang.Object");
    }
}
