package Wv;

import Iq.g;
import KJ.C15987c;
import Sv.f;
import TJ.C16532g;
import TJ.C16534i;
import Wv.a;
import XH.C16807N;
import XH.t;
import Yv.C6737e;
import Yv.k;
import Yv.o;
import Yv.s;
import Yv.w;
import Yv.y;
import aA.C13910b;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.K;
import nI.q;
import nI.r;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001:\u0001 BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0012H\u0002¢\u0006\u0004\b\u001f\u0010\u0015J\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)¨\u0006*"}, d2 = {"LWv/b;", "LWv/a;", "LYv/k;", "getFamilyRewardsCarouselStateUseCase", "LYv/s;", "getLatestPurchaseUseCase", "LYv/w;", "getLatestShoppingListUseCase", "LYv/y;", "getMemberDiscountProductsUseCase", "LYv/o;", "getKreativActionStateUseCase", "LYv/e;", "getBenefitsContentUseCase", "LSv/f;", "overviewListContentFactory", "<init>", "(LYv/k;LYv/s;LYv/w;LYv/y;LYv/o;LYv/e;LSv/f;)V", "LTJ/g;", "LWv/a$a;", "e", "()LTJ/g;", "LaA/b;", "userState", "f", "(LaA/b;)LTJ/g;", "LYv/k$a;", "", "g", "(LYv/k$a;)Z", "LWv/b$a;", "d", "a", "LYv/k;", "b", "LYv/s;", "c", "LYv/w;", "LYv/y;", "LYv/o;", "LYv/e;", "LSv/f;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final k f40560a;

    /* renamed from: b  reason: collision with root package name */
    private final s f40561b;

    /* renamed from: c  reason: collision with root package name */
    private final w f40562c;

    /* renamed from: d  reason: collision with root package name */
    private final y f40563d;

    /* renamed from: e  reason: collision with root package name */
    private final o f40564e;

    /* renamed from: f  reason: collision with root package name */
    private final C6737e f40565f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final f f40566g;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006\""}, d2 = {"LWv/b$a;", "", "LYv/k$a;", "familyRewards", "LYv/o$a;", "kreativ", "LYv/w$a;", "shoppingList", "LYv/s$a;", "purchaseHistory", "<init>", "(LYv/k$a;LYv/o$a;LYv/w$a;LYv/s$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LYv/k$a;", "()LYv/k$a;", "b", "LYv/o$a;", "()LYv/o$a;", "c", "LYv/w$a;", "d", "()LYv/w$a;", "LYv/s$a;", "()LYv/s$a;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final k.a f40567a;

        /* renamed from: b  reason: collision with root package name */
        private final o.a f40568b;

        /* renamed from: c  reason: collision with root package name */
        private final w.a f40569c;

        /* renamed from: d  reason: collision with root package name */
        private final s.a f40570d;

        public a(k.a aVar, o.a aVar2, w.a aVar3, s.a aVar4) {
            C17542s.j(aVar, "familyRewards");
            C17542s.j(aVar2, "kreativ");
            C17542s.j(aVar3, "shoppingList");
            C17542s.j(aVar4, "purchaseHistory");
            this.f40567a = aVar;
            this.f40568b = aVar2;
            this.f40569c = aVar3;
            this.f40570d = aVar4;
        }

        public final k.a a() {
            return this.f40567a;
        }

        public final o.a b() {
            return this.f40568b;
        }

        public final s.a c() {
            return this.f40570d;
        }

        public final w.a d() {
            return this.f40569c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f40567a, aVar.f40567a) && C17542s.e(this.f40568b, aVar.f40568b) && C17542s.e(this.f40569c, aVar.f40569c) && C17542s.e(this.f40570d, aVar.f40570d);
        }

        public int hashCode() {
            return (((((this.f40567a.hashCode() * 31) + this.f40568b.hashCode()) * 31) + this.f40569c.hashCode()) * 31) + this.f40570d.hashCode();
        }

        public String toString() {
            k.a aVar = this.f40567a;
            o.a aVar2 = this.f40568b;
            w.a aVar3 = this.f40569c;
            s.a aVar4 = this.f40570d;
            return "ActionStates(familyRewards=" + aVar + ", kreativ=" + aVar2 + ", shoppingList=" + aVar3 + ", purchaseHistory=" + aVar4 + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Wv.b$b  reason: collision with other inner class name */
    public /* synthetic */ class C0673b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40571a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                aA.b[] r0 = aA.C13910b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                aA.b r1 = aA.C13910b.GUEST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                aA.b r1 = aA.C13910b.REGULAR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                aA.b r1 = aA.C13910b.FAMILY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f40571a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Wv.b.C0673b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"LYv/k$a;", "rewardsCarousel", "LYv/o$a;", "kreativState", "LYv/w$a;", "latestShoppingListState", "LYv/s$a;", "latestPurchase", "LWv/b$a;", "<anonymous>", "(LYv/k$a;LYv/o$a;LYv/w$a;LYv/s$a;)LWv/b$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.membership.impl.orchestrator.OverviewOrchestratorImpl$getCombinedActionsFlow$1", f = "OverviewOrchestrator.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements nI.s<k.a, o.a, w.a, s.a, C17164e<? super a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40572c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f40573d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f40574e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f40575f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f40576g;

        c(C17164e<? super c> eVar) {
            super(5, eVar);
        }

        /* renamed from: i */
        public final Object z(k.a aVar, o.a aVar2, w.a aVar3, s.a aVar4, C17164e<? super a> eVar) {
            c cVar = new c(eVar);
            cVar.f40573d = aVar;
            cVar.f40574e = aVar2;
            cVar.f40575f = aVar3;
            cVar.f40576g = aVar4;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f40572c == 0) {
                XH.y.b(obj);
                return new a((k.a) this.f40573d, (o.a) this.f40574e, (w.a) this.f40575f, (s.a) this.f40576g);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LYv/y$a;", "discountProducts", "LYv/e$a;", "benefits", "LWv/a$a;", "<anonymous>", "(LYv/y$a;LYv/e$a;)LWv/a$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.membership.impl.orchestrator.OverviewOrchestratorImpl$getGuestContentFlow$1", f = "OverviewOrchestrator.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements q<y.a, C6737e.a, C17164e<? super a.C0672a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40577c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f40578d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f40579e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f40580f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ K f40581g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, K k10, C17164e<? super d> eVar) {
            super(3, eVar);
            this.f40580f = bVar;
            this.f40581g = k10;
        }

        /* renamed from: i */
        public final Object invoke(y.a aVar, C6737e.a aVar2, C17164e<? super a.C0672a> eVar) {
            d dVar = new d(this.f40580f, this.f40581g, eVar);
            dVar.f40578d = aVar;
            dVar.f40579e = aVar2;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f40577c == 0) {
                XH.y.b(obj);
                y.a aVar = (y.a) this.f40578d;
                C6737e.a aVar2 = (C6737e.a) this.f40579e;
                C15987c<Sv.e> b10 = this.f40580f.f40566g.b(aVar2, aVar);
                K k10 = this.f40581g;
                k10.f144344a = k10.f144344a || (!(aVar instanceof y.a.b) && !(aVar2 instanceof C6737e.a.c));
                return new a.C0672a(b10, this.f40581g.f144344a);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LWv/b$a;", "actions", "LYv/y$a;", "discountProducts", "LYv/e$a;", "benefits", "LWv/a$a;", "<anonymous>", "(LWv/b$a;LYv/y$a;LYv/e$a;)LWv/a$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.membership.impl.orchestrator.OverviewOrchestratorImpl$getMemberContentFlow$1", f = "OverviewOrchestrator.kt", l = {}, m = "invokeSuspend")
    static final class e extends l implements r<a, y.a, C6737e.a, C17164e<? super a.C0672a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40582c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f40583d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f40584e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f40585f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f40586g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C13910b f40587h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ K f40588i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, C13910b bVar2, K k10, C17164e<? super e> eVar) {
            super(4, eVar);
            this.f40586g = bVar;
            this.f40587h = bVar2;
            this.f40588i = k10;
        }

        /* renamed from: i */
        public final Object l(a aVar, y.a aVar2, C6737e.a aVar3, C17164e<? super a.C0672a> eVar) {
            e eVar2 = new e(this.f40586g, this.f40587h, this.f40588i, eVar);
            eVar2.f40583d = aVar;
            eVar2.f40584e = aVar2;
            eVar2.f40585f = aVar3;
            return eVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f40582c == 0) {
                XH.y.b(obj);
                a aVar = (a) this.f40583d;
                y.a aVar2 = (y.a) this.f40584e;
                C6737e.a aVar3 = (C6737e.a) this.f40585f;
                C15987c<Sv.e> c10 = this.f40586g.f40566g.c(aVar3, aVar.a(), aVar.b(), aVar.d(), aVar.c(), aVar2, this.f40587h);
                K k10 = this.f40588i;
                k10.f144344a = k10.f144344a || (this.f40586g.g(aVar.a()) && !(aVar.b() instanceof o.a.d) && !(aVar.d() instanceof w.a.b) && !(aVar2 instanceof y.a.b) && !(aVar3 instanceof C6737e.a.c));
                return new a.C0672a(c10, this.f40588i.f144344a);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public b(k kVar, s sVar, w wVar, y yVar, o oVar, C6737e eVar, f fVar) {
        C17542s.j(kVar, "getFamilyRewardsCarouselStateUseCase");
        C17542s.j(sVar, "getLatestPurchaseUseCase");
        C17542s.j(wVar, "getLatestShoppingListUseCase");
        C17542s.j(yVar, "getMemberDiscountProductsUseCase");
        C17542s.j(oVar, "getKreativActionStateUseCase");
        C17542s.j(eVar, "getBenefitsContentUseCase");
        C17542s.j(fVar, "overviewListContentFactory");
        this.f40560a = kVar;
        this.f40561b = sVar;
        this.f40562c = wVar;
        this.f40563d = yVar;
        this.f40564e = oVar;
        this.f40565f = eVar;
        this.f40566g = fVar;
    }

    private final C16532g<a> d() {
        return C16534i.l(this.f40560a.invoke(), this.f40564e.invoke(), this.f40562c.invoke(), this.f40561b.invoke(), new c((C17164e<? super c>) null));
    }

    private final C16532g<a.C0672a> e() {
        return C16534i.n(this.f40563d.invoke(), this.f40565f.invoke(), new d(this, new K(), (C17164e<? super d>) null));
    }

    private final C16532g<a.C0672a> f(C13910b bVar) {
        return C16534i.m(d(), this.f40563d.invoke(), this.f40565f.invoke(), new e(this, bVar, new K(), (C17164e<? super e>) null));
    }

    /* access modifiers changed from: private */
    public final boolean g(k.a aVar) {
        if (aVar instanceof k.a.C0706a) {
            return true;
        }
        if (aVar instanceof k.a.b) {
            return !(((k.a.b) aVar).a() instanceof g.c);
        }
        throw new t();
    }

    public C16532g<a.C0672a> a(C13910b bVar) {
        C16532g<a.C0672a> gVar;
        C17542s.j(bVar, "userState");
        int i10 = C0673b.f40571a[bVar.ordinal()];
        if (i10 == 1) {
            gVar = e();
        } else if (i10 == 2 || i10 == 3) {
            gVar = f(bVar);
        } else {
            throw new t();
        }
        return C16534i.s(gVar);
    }
}
