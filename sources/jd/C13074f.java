package JD;

import GD.C12933f;
import GD.k;
import HD.C12993c;
import Jq.c;
import Jq.d;
import Qq.g;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;
import tf.C10253a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001c¨\u0006\u001d"}, d2 = {"LJD/f;", "LJD/e;", "LJq/c;", "familyRewardsRepository", "LHD/c;", "rewardToUiModelMapper", "Ltf/a;", "killSwitchRepository", "<init>", "(LJq/c;LHD/c;Ltf/a;)V", "LJq/d;", "LQq/k;", "resource", "LGD/f;", "d", "(LJq/d;)LGD/f;", "reward", "", "LGD/k$c;", "c", "(LQq/k;)Ljava/util/List;", "LTJ/g;", "invoke", "()LTJ/g;", "a", "LJq/c;", "b", "LHD/c;", "Ltf/a;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: JD.f  reason: case insensitive filesystem */
public final class C13074f implements C13073e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f111234a;

    /* renamed from: b  reason: collision with root package name */
    private final C12993c f111235b;

    /* renamed from: c  reason: collision with root package name */
    private final C10253a f111236c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.wallet.impl.usecase.GetClaimedRewardCardsUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetClaimedRewardCardsUseCase.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: JD.f$a */
    public static final class a extends l implements q<C16533h<? super C12933f>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111237c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f111238d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f111239e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C13074f f111240f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, C13074f fVar) {
            super(3, eVar);
            this.f111240f = fVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C12933f> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            a aVar = new a(eVar, this.f111240f);
            aVar.f111238d = hVar;
            aVar.f111239e = bool;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f111237c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f111238d;
                C16532g bVar = ((Boolean) this.f111239e).booleanValue() ? new b(this.f111240f.f111234a.f((c.a) null), this.f111240f) : C16534i.J(C12933f.a.f110362a);
                this.f111237c = 1;
                if (C16534i.x(hVar, bVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: JD.f$b */
    public static final class b implements C16532g<C12933f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f111241a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C13074f f111242b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: JD.f$b$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f111243a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C13074f f111244b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.wallet.impl.usecase.GetClaimedRewardCardsUseCaseImpl$invoke$lambda$0$$inlined$map$1$2", f = "GetClaimedRewardCardsUseCase.kt", l = {50}, m = "emit")
            /* renamed from: JD.f$b$a$a  reason: collision with other inner class name */
            public static final class C2697a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f111245c;

                /* renamed from: d  reason: collision with root package name */
                int f111246d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f111247e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2697a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f111247e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f111245c = obj;
                    this.f111246d |= Integer.MIN_VALUE;
                    return this.f111247e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C13074f fVar) {
                this.f111243a = hVar;
                this.f111244b = fVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof JD.C13074f.b.a.C2697a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    JD.f$b$a$a r0 = (JD.C13074f.b.a.C2697a) r0
                    int r1 = r0.f111246d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f111246d = r1
                    goto L_0x0018
                L_0x0013:
                    JD.f$b$a$a r0 = new JD.f$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f111245c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f111246d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f111243a
                    Jq.d r5 = (Jq.d) r5
                    JD.f r2 = r4.f111244b
                    GD.f r5 = r2.d(r5)
                    r0.f111246d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: JD.C13074f.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar, C13074f fVar) {
            this.f111241a = gVar;
            this.f111242b = fVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f111241a.collect(new a(hVar, this.f111242b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C13074f(c cVar, C12993c cVar2, C10253a aVar) {
        C17542s.j(cVar, "familyRewardsRepository");
        C17542s.j(cVar2, "rewardToUiModelMapper");
        C17542s.j(aVar, "killSwitchRepository");
        this.f111234a = cVar;
        this.f111235b = cVar2;
        this.f111236c = aVar;
    }

    private final List<k.c> c(Qq.k kVar) {
        C12993c cVar = this.f111235b;
        ArrayList arrayList = new ArrayList();
        for (g.b a10 : kVar.f()) {
            k.c a11 = cVar.a(a10);
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final C12933f d(Jq.d<Qq.k> dVar) {
        C12933f cVar;
        List<k.c> list;
        List<k.c> list2;
        if (dVar instanceof d.a) {
            return new C12933f.b((List) null, (Throwable) null, 3, (DefaultConstructorMarker) null);
        }
        if (dVar instanceof d.c) {
            Qq.k kVar = (Qq.k) ((d.c) dVar).a();
            if (kVar == null || (list2 = c(kVar)) == null) {
                list2 = C16877v.n();
            }
            cVar = new C12933f.d(list2);
        } else if (dVar instanceof d.b) {
            d.b bVar = (d.b) dVar;
            Qq.k kVar2 = (Qq.k) bVar.a();
            if (kVar2 == null || (list = c(kVar2)) == null) {
                list = C16877v.n();
            }
            return new C12933f.b(list, bVar.b());
        } else if (dVar instanceof d.C1628d) {
            cVar = new C12933f.c(c((Qq.k) ((d.C1628d) dVar).a()));
        } else {
            throw new t();
        }
        return cVar;
    }

    public C16532g<C12933f> invoke() {
        return C16534i.g0(this.f111236c.y(), new a((C17164e) null, this));
    }
}
