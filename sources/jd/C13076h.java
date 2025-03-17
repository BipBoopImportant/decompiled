package JD;

import GD.C12933f;
import GD.k;
import HD.C12991a;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import hx.C14544b;
import hx.C14545c;
import ix.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import tf.C10253a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001b¨\u0006\u001c"}, d2 = {"LJD/h;", "LJD/g;", "Lhx/b;", "prepaidCardRepository", "LHD/a;", "prepaidCardToUiModelMapper", "Ltf/a;", "killSwitchRepository", "<init>", "(Lhx/b;LHD/a;Ltf/a;)V", "Lhx/c;", "state", "LGD/f;", "d", "(Lhx/c;)LGD/f;", "", "LGD/k;", "card", "c", "(Ljava/util/List;LGD/k;)Ljava/util/List;", "LTJ/g;", "invoke", "()LTJ/g;", "a", "Lhx/b;", "b", "LHD/a;", "Ltf/a;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: JD.h  reason: case insensitive filesystem */
public final class C13076h implements C13075g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C14544b f111248a;

    /* renamed from: b  reason: collision with root package name */
    private final C12991a f111249b;

    /* renamed from: c  reason: collision with root package name */
    private final C10253a f111250c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.wallet.impl.usecase.GetPrepaidCardsUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetPrepaidCardsUseCase.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: JD.h$a */
    public static final class a extends l implements q<C16533h<? super C12933f>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111251c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f111252d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f111253e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C13076h f111254f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, C13076h hVar) {
            super(3, eVar);
            this.f111254f = hVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C12933f> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            a aVar = new a(eVar, this.f111254f);
            aVar.f111252d = hVar;
            aVar.f111253e = bool;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f111251c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f111252d;
                C16532g bVar = ((Boolean) this.f111253e).booleanValue() ? new b(this.f111254f.f111248a.b(), this.f111254f) : C16534i.J(C12933f.a.f110362a);
                this.f111251c = 1;
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
    /* renamed from: JD.h$b */
    public static final class b implements C16532g<C12933f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f111255a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C13076h f111256b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: JD.h$b$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f111257a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C13076h f111258b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.wallet.impl.usecase.GetPrepaidCardsUseCaseImpl$invoke$lambda$0$$inlined$map$1$2", f = "GetPrepaidCardsUseCase.kt", l = {50}, m = "emit")
            /* renamed from: JD.h$b$a$a  reason: collision with other inner class name */
            public static final class C2698a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f111259c;

                /* renamed from: d  reason: collision with root package name */
                int f111260d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f111261e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2698a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f111261e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f111259c = obj;
                    this.f111260d |= Integer.MIN_VALUE;
                    return this.f111261e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C13076h hVar2) {
                this.f111257a = hVar;
                this.f111258b = hVar2;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof JD.C13076h.b.a.C2698a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    JD.h$b$a$a r0 = (JD.C13076h.b.a.C2698a) r0
                    int r1 = r0.f111260d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f111260d = r1
                    goto L_0x0018
                L_0x0013:
                    JD.h$b$a$a r0 = new JD.h$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f111259c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f111260d
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
                    TJ.h r6 = r4.f111257a
                    hx.c r5 = (hx.C14545c) r5
                    JD.h r2 = r4.f111258b
                    GD.f r5 = r2.d(r5)
                    r0.f111260d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: JD.C13076h.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar, C13076h hVar) {
            this.f111255a = gVar;
            this.f111256b = hVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f111255a.collect(new a(hVar, this.f111256b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C13076h(C14544b bVar, C12991a aVar, C10253a aVar2) {
        C17542s.j(bVar, "prepaidCardRepository");
        C17542s.j(aVar, "prepaidCardToUiModelMapper");
        C17542s.j(aVar2, "killSwitchRepository");
        this.f111248a = bVar;
        this.f111249b = aVar;
        this.f111250c = aVar2;
    }

    private final List<k> c(List<? extends k> list, k kVar) {
        Collection collection = list;
        if (collection.isEmpty()) {
            collection = C16877v.e(kVar);
        }
        return (List) collection;
    }

    /* access modifiers changed from: private */
    public final C12933f d(C14545c cVar) {
        Iterable<c> c10 = cVar.c();
        C12991a aVar = this.f111249b;
        ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
        for (c a10 : c10) {
            arrayList.add(aVar.a(a10));
        }
        if (cVar instanceof C14545c.a) {
            return new C12933f.b(c(arrayList, k.b.C2650b.f110411a), ((C14545c.a) cVar).a());
        }
        if (cVar instanceof C14545c.b) {
            return new C12933f.d(c(arrayList, k.b.d.f110421a));
        }
        if (cVar instanceof C14545c.C3141c) {
            return new C12933f.c(c(arrayList, k.b.a.f110408a));
        }
        throw new t();
    }

    public C16532g<C12933f> invoke() {
        return C16534i.g0(this.f111250c.z(), new a((C17164e) null, this));
    }
}
