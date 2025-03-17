package qk;

import FB.C12860a;
import QJ.C16304f;
import QJ.M;
import QJ.Q;
import QJ.S;
import QJ.T;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.v;
import XH.x;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import jB.C14613b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import pk.s;
import tu.C11995a;
import yu.C12517b;
import zk.C12529b;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 ¨\u0006!"}, d2 = {"Lqk/b;", "", "LjB/b;", "shoppingListRepository", "Lru/c;", "wayfindingIntegration", "Ltu/a;", "wayfindingRepository", "LFB/a;", "localStoreSelectionRepository", "LQJ/M;", "ioDispatcher", "<init>", "(LjB/b;Lru/c;Ltu/a;LFB/a;LQJ/M;)V", "Lyu/b;", "Lzk/b$a;", "d", "(Lyu/b;)Lzk/b$a;", "", "listId", "LTJ/g;", "", "Lpk/s$o;", "e", "(Ljava/lang/String;)LTJ/g;", "a", "LjB/b;", "b", "Lru/c;", "c", "Ltu/a;", "LFB/a;", "LQJ/M;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qk.b  reason: case insensitive filesystem */
public final class C11789b {

    /* renamed from: a  reason: collision with root package name */
    private final C14613b f101434a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ru.c f101435b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C11995a f101436c;

    /* renamed from: d  reason: collision with root package name */
    private final C12860a f101437d;

    /* renamed from: e  reason: collision with root package name */
    private final M f101438e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qk.b$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f101439a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                yu.b$a$b$a[] r0 = yu.C12517b.a.C2559b.C2560a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                yu.b$a$b$a r1 = yu.C12517b.a.C2559b.C2560a.SELF_SERVE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                yu.b$a$b$a r1 = yu.C12517b.a.C2559b.C2560a.FULL_SERVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                yu.b$a$b$a r1 = yu.C12517b.a.C2559b.C2560a.MARKETHALL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                yu.b$a$b$a r1 = yu.C12517b.a.C2559b.C2560a.SHOWROOM     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f101439a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qk.C11789b.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.CheckWayfindingAvailabilityUseCase$invoke$$inlined$flatMapLatest$1", f = "CheckWayfindingAvailabilityUseCase.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: qk.b$b  reason: collision with other inner class name */
    public static final class C2392b extends l implements q<C16533h<? super String>, String, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101440c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f101441d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f101442e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11789b f101443f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2392b(C17164e eVar, C11789b bVar) {
            super(3, eVar);
            this.f101443f = bVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super String> hVar, String str, C17164e<? super C16807N> eVar) {
            C2392b bVar = new C2392b(eVar, this.f101443f);
            bVar.f101441d = hVar;
            bVar.f101442e = str;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f101440c;
            if (i10 == 0) {
                y.b(obj);
                h hVar = new h(this.f101443f.f101435b.a(), this.f101443f, (String) this.f101442e);
                this.f101440c = 1;
                if (C16534i.x((C16533h) this.f101441d, hVar, this) == f10) {
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
    /* renamed from: qk.b$c */
    public static final class c implements C16532g<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101444a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qk.b$c$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101445a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.CheckWayfindingAvailabilityUseCase$invoke$$inlined$map$1$2", f = "CheckWayfindingAvailabilityUseCase.kt", l = {50}, m = "emit")
            /* renamed from: qk.b$c$a$a  reason: collision with other inner class name */
            public static final class C2393a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101446c;

                /* renamed from: d  reason: collision with root package name */
                int f101447d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f101448e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2393a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101448e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101446c = obj;
                    this.f101447d |= Integer.MIN_VALUE;
                    return this.f101448e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f101445a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof qk.C11789b.c.a.C2393a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    qk.b$c$a$a r0 = (qk.C11789b.c.a.C2393a) r0
                    int r1 = r0.f101447d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101447d = r1
                    goto L_0x0018
                L_0x0013:
                    qk.b$c$a$a r0 = new qk.b$c$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f101446c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101447d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0066
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f101445a
                    java.util.List r6 = (java.util.List) r6
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r4 = YH.C16877v.y(r6, r4)
                    r2.<init>(r4)
                    java.util.Iterator r6 = r6.iterator()
                L_0x0049:
                    boolean r4 = r6.hasNext()
                    if (r4 == 0) goto L_0x005d
                    java.lang.Object r4 = r6.next()
                    gB.g r4 = (gB.C14505g) r4
                    java.lang.String r4 = r4.b()
                    r2.add(r4)
                    goto L_0x0049
                L_0x005d:
                    r0.f101447d = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L_0x0066
                    return r1
                L_0x0066:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: qk.C11789b.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f101444a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101444a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qk.b$d */
    public static final class d implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101449a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qk.b$d$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101450a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.CheckWayfindingAvailabilityUseCase$invoke$$inlined$map$2$2", f = "CheckWayfindingAvailabilityUseCase.kt", l = {50}, m = "emit")
            /* renamed from: qk.b$d$a$a  reason: collision with other inner class name */
            public static final class C2394a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101451c;

                /* renamed from: d  reason: collision with root package name */
                int f101452d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f101453e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2394a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101453e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101451c = obj;
                    this.f101452d |= Integer.MIN_VALUE;
                    return this.f101453e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f101450a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof qk.C11789b.d.a.C2394a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    qk.b$d$a$a r0 = (qk.C11789b.d.a.C2394a) r0
                    int r1 = r0.f101452d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101452d = r1
                    goto L_0x0018
                L_0x0013:
                    qk.b$d$a$a r0 = new qk.b$d$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f101451c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101452d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f101450a
                    EB.d r5 = (EB.C12832d) r5
                    java.lang.String r5 = r5.e()
                    r0.f101452d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: qk.C11789b.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar) {
            this.f101449a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101449a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qk.b$e */
    public static final class e implements C16532g<List<? extends s.o>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101454a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qk.b$e$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101455a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.CheckWayfindingAvailabilityUseCase$invoke$$inlined$map$3$2", f = "CheckWayfindingAvailabilityUseCase.kt", l = {50}, m = "emit")
            /* renamed from: qk.b$e$a$a  reason: collision with other inner class name */
            public static final class C2395a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101456c;

                /* renamed from: d  reason: collision with root package name */
                int f101457d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f101458e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2395a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101458e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101456c = obj;
                    this.f101457d |= Integer.MIN_VALUE;
                    return this.f101458e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f101455a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof qk.C11789b.e.a.C2395a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    qk.b$e$a$a r0 = (qk.C11789b.e.a.C2395a) r0
                    int r1 = r0.f101457d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101457d = r1
                    goto L_0x0018
                L_0x0013:
                    qk.b$e$a$a r0 = new qk.b$e$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f101456c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101457d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f101455a
                    XH.v r5 = (XH.v) r5
                    java.lang.Object r5 = r5.c()
                    r0.f101457d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: qk.C11789b.e.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public e(C16532g gVar) {
            this.f101454a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101454a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "itemNumbers", "storeId", "LXH/v;", "<anonymous>", "(Ljava/util/List;Ljava/lang/String;)LXH/v;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.CheckWayfindingAvailabilityUseCase$invoke$4", f = "CheckWayfindingAvailabilityUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: qk.b$f */
    static final class f extends l implements q<List<? extends String>, String, C17164e<? super v<? extends List<? extends String>, ? extends String>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101459c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101460d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f101461e;

        f(C17164e<? super f> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(List<String> list, String str, C17164e<? super v<? extends List<String>, String>> eVar) {
            f fVar = new f(eVar);
            fVar.f101460d = list;
            fVar.f101461e = str;
            return fVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101459c == 0) {
                y.b(obj);
                return C16796C.a((List) this.f101460d, (String) this.f101461e);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0006\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u001e\u0010\u0004\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u001a\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LXH/v;", "", "Lpk/s$o;", "", "accumulator", "value", "<anonymous>", "(LXH/v;LXH/v;)LXH/v;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.CheckWayfindingAvailabilityUseCase$invoke$5", f = "CheckWayfindingAvailabilityUseCase.kt", l = {79}, m = "invokeSuspend")
    /* renamed from: qk.b$g */
    static final class g extends l implements q<v<? extends List<? extends s.o>, ? extends List<? extends String>>, v<? extends List<? extends String>, ? extends String>, C17164e<? super v<? extends List<? extends s.o>, ? extends List<? extends String>>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f101462c;

        /* renamed from: d  reason: collision with root package name */
        Object f101463d;

        /* renamed from: e  reason: collision with root package name */
        Object f101464e;

        /* renamed from: f  reason: collision with root package name */
        Object f101465f;

        /* renamed from: g  reason: collision with root package name */
        Object f101466g;

        /* renamed from: h  reason: collision with root package name */
        int f101467h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f101468i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f101469j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C11789b f101470k;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "", "Lpk/s$o;", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.CheckWayfindingAvailabilityUseCase$invoke$5$newData$1", f = "CheckWayfindingAvailabilityUseCase.kt", l = {90}, m = "invokeSuspend")
        /* renamed from: qk.b$g$a */
        static final class a extends l implements p<Q, C17164e<? super List<? extends s.o>>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f101471c;

            /* renamed from: d  reason: collision with root package name */
            Object f101472d;

            /* renamed from: e  reason: collision with root package name */
            Object f101473e;

            /* renamed from: f  reason: collision with root package name */
            Object f101474f;

            /* renamed from: g  reason: collision with root package name */
            Object f101475g;

            /* renamed from: h  reason: collision with root package name */
            Object f101476h;

            /* renamed from: i  reason: collision with root package name */
            int f101477i;

            /* renamed from: j  reason: collision with root package name */
            int f101478j;

            /* renamed from: k  reason: collision with root package name */
            int f101479k;

            /* renamed from: l  reason: collision with root package name */
            private /* synthetic */ Object f101480l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ List<String> f101481m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ C11789b f101482n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ String f101483o;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "LXH/v;", "Lyu/b;", "", "<anonymous>", "(LQJ/Q;)LXH/v;"}, k = 3, mv = {2, 1, 0})
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.CheckWayfindingAvailabilityUseCase$invoke$5$newData$1$1$1", f = "CheckWayfindingAvailabilityUseCase.kt", l = {83}, m = "invokeSuspend")
            /* renamed from: qk.b$g$a$a  reason: collision with other inner class name */
            static final class C2396a extends l implements p<Q, C17164e<? super v<? extends C12517b, ? extends String>>, Object> {

                /* renamed from: c  reason: collision with root package name */
                Object f101484c;

                /* renamed from: d  reason: collision with root package name */
                Object f101485d;

                /* renamed from: e  reason: collision with root package name */
                Object f101486e;

                /* renamed from: f  reason: collision with root package name */
                Object f101487f;

                /* renamed from: g  reason: collision with root package name */
                Object f101488g;

                /* renamed from: h  reason: collision with root package name */
                int f101489h;

                /* renamed from: i  reason: collision with root package name */
                int f101490i;

                /* renamed from: j  reason: collision with root package name */
                int f101491j;

                /* renamed from: k  reason: collision with root package name */
                private /* synthetic */ Object f101492k;

                /* renamed from: l  reason: collision with root package name */
                final /* synthetic */ String f101493l;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ C11789b f101494m;

                /* renamed from: n  reason: collision with root package name */
                final /* synthetic */ String f101495n;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2396a(String str, C11789b bVar, String str2, C17164e<? super C2396a> eVar) {
                    super(2, eVar);
                    this.f101493l = str;
                    this.f101494m = bVar;
                    this.f101495n = str2;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    C2396a aVar = new C2396a(this.f101493l, this.f101494m, this.f101495n, eVar);
                    aVar.f101492k = obj;
                    return aVar;
                }

                public final Object invoke(Q q10, C17164e<? super v<C12517b, String>> eVar) {
                    return ((C2396a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object obj2;
                    Object f10 = C17187b.f();
                    int i10 = this.f101491j;
                    if (i10 == 0) {
                        y.b(obj);
                        Q q10 = (Q) this.f101492k;
                        C11789b bVar = this.f101494m;
                        String str = this.f101495n;
                        String str2 = this.f101493l;
                        x.a aVar = x.f139812b;
                        C11995a c10 = bVar.f101436c;
                        this.f101492k = q10;
                        this.f101484c = q10;
                        this.f101485d = bVar;
                        this.f101486e = str;
                        this.f101487f = str2;
                        this.f101488g = q10;
                        this.f101489h = 0;
                        this.f101490i = 0;
                        this.f101491j = 1;
                        obj = c10.a(str, str2, this);
                        if (obj == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        Q q11 = (Q) this.f101488g;
                        String str3 = (String) this.f101487f;
                        String str4 = (String) this.f101486e;
                        C11789b bVar2 = (C11789b) this.f101485d;
                        Q q12 = (Q) this.f101484c;
                        Q q13 = (Q) this.f101492k;
                        try {
                            y.b(obj);
                        } catch (CancellationException e10) {
                            throw e10;
                        } catch (Throwable th2) {
                            x.a aVar2 = x.f139812b;
                            obj2 = x.b(y.a(th2));
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = x.b((C12517b) obj);
                    if (x.g(obj2)) {
                        obj2 = null;
                    }
                    return C16796C.a(obj2, this.f101493l);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List<String> list, C11789b bVar, String str, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f101481m = list;
                this.f101482n = bVar;
                this.f101483o = str;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f101481m, this.f101482n, this.f101483o, eVar);
                aVar.f101480l = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super List<s.o>> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f101479k;
                if (i10 == 0) {
                    y.b(obj);
                    Q q10 = (Q) this.f101480l;
                    Iterable iterable = this.f101481m;
                    C11789b bVar = this.f101482n;
                    String str = this.f101483o;
                    ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C16314k.b(q10, (C17168i) null, (T) null, new C2396a((String) it.next(), bVar, str, (C17164e<? super C2396a>) null), 3, (Object) null));
                    }
                    this.f101480l = q10;
                    this.f101471c = iterable;
                    this.f101472d = bVar;
                    this.f101473e = str;
                    this.f101474f = iterable;
                    this.f101475g = arrayList;
                    this.f101476h = it;
                    this.f101477i = 0;
                    this.f101478j = 0;
                    this.f101479k = 1;
                    obj = C16304f.a(arrayList, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    Iterator it2 = (Iterator) this.f101476h;
                    Collection collection = (Collection) this.f101475g;
                    Iterable iterable2 = (Iterable) this.f101474f;
                    String str2 = (String) this.f101473e;
                    C11789b bVar2 = (C11789b) this.f101472d;
                    Iterable iterable3 = (Iterable) this.f101471c;
                    Q q11 = (Q) this.f101480l;
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C11789b bVar3 = this.f101482n;
                String str3 = this.f101483o;
                ArrayList arrayList2 = new ArrayList();
                for (v vVar : (Iterable) obj) {
                    C12517b bVar4 = (C12517b) vVar.a();
                    s.o oVar = bVar4 != null ? new s.o((String) vVar.b(), bVar3.d(bVar4), bVar4.b().b().a().b(), str3) : null;
                    if (oVar != null) {
                        arrayList2.add(oVar);
                    }
                }
                return arrayList2;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C11789b bVar, C17164e<? super g> eVar) {
            super(3, eVar);
            this.f101470k = bVar;
        }

        /* renamed from: i */
        public final Object invoke(v<? extends List<s.o>, ? extends List<String>> vVar, v<? extends List<String>, String> vVar2, C17164e<? super v<? extends List<s.o>, ? extends List<String>>> eVar) {
            g gVar = new g(this.f101470k, eVar);
            gVar.f101468i = vVar;
            gVar.f101469j = vVar2;
            return gVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            List list;
            List list2;
            List list3;
            Object f10 = C17187b.f();
            int i10 = this.f101467h;
            if (i10 == 0) {
                y.b(obj);
                v vVar = (v) this.f101468i;
                v vVar2 = (v) this.f101469j;
                List list4 = (List) vVar2.a();
                String str = (String) vVar2.b();
                if (str == null) {
                    return new v(C16877v.n(), C16877v.n());
                }
                List list5 = (List) vVar.a();
                List list6 = (List) vVar.b();
                List R02 = C16877v.R0(list4, C16877v.y1(list6));
                if (R02.isEmpty()) {
                    return vVar;
                }
                a aVar = new a(R02, this.f101470k, str, (C17164e<? super a>) null);
                this.f101468i = vVar;
                this.f101469j = vVar2;
                this.f101462c = list4;
                this.f101463d = str;
                this.f101464e = list5;
                this.f101465f = list6;
                this.f101466g = R02;
                this.f101467h = 1;
                obj = S.f(aVar, this);
                if (obj == f10) {
                    return f10;
                }
                list = list4;
                list2 = list5;
                list3 = list6;
            } else if (i10 == 1) {
                List list7 = (List) this.f101466g;
                list3 = (List) this.f101465f;
                list2 = (List) this.f101464e;
                String str2 = (String) this.f101463d;
                list = (List) this.f101462c;
                v vVar3 = (v) this.f101469j;
                v vVar4 = (v) this.f101468i;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List m02 = C16877v.m0(C16877v.V0(list, list3));
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object next : C16877v.V0(list2, (List) obj)) {
                if (hashSet.add(((s.o) next).b())) {
                    arrayList.add(next);
                }
            }
            return C16796C.a(arrayList, m02);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qk.b$h */
    public static final class h implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101496a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C11789b f101497b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f101498c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qk.b$h$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101499a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C11789b f101500b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f101501c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.CheckWayfindingAvailabilityUseCase$invoke$lambda$4$$inlined$map$1$2", f = "CheckWayfindingAvailabilityUseCase.kt", l = {51, 50}, m = "emit")
            /* renamed from: qk.b$h$a$a  reason: collision with other inner class name */
            public static final class C2397a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101502c;

                /* renamed from: d  reason: collision with root package name */
                int f101503d;

                /* renamed from: e  reason: collision with root package name */
                Object f101504e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ a f101505f;

                /* renamed from: g  reason: collision with root package name */
                Object f101506g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2397a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101505f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101502c = obj;
                    this.f101503d |= Integer.MIN_VALUE;
                    return this.f101505f.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C11789b bVar, String str) {
                this.f101499a = hVar;
                this.f101500b = bVar;
                this.f101501c = str;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, dI.C17164e r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof qk.C11789b.h.a.C2397a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    qk.b$h$a$a r0 = (qk.C11789b.h.a.C2397a) r0
                    int r1 = r0.f101503d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101503d = r1
                    goto L_0x0018
                L_0x0013:
                    qk.b$h$a$a r0 = new qk.b$h$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f101502c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101503d
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L_0x0041
                    if (r2 == r4) goto L_0x0035
                    if (r2 != r3) goto L_0x002d
                    XH.y.b(r9)
                    goto L_0x0083
                L_0x002d:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0035:
                    java.lang.Object r8 = r0.f101506g
                    TJ.h r8 = (TJ.C16533h) r8
                    java.lang.Object r2 = r0.f101504e
                    qk.b$h$a r2 = (qk.C11789b.h.a) r2
                    XH.y.b(r9)
                    goto L_0x0067
                L_0x0041:
                    XH.y.b(r9)
                    TJ.h r9 = r7.f101499a
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L_0x0074
                    qk.b r8 = r7.f101500b
                    ru.c r8 = r8.f101435b
                    java.lang.String r2 = r7.f101501c
                    r0.f101504e = r7
                    r0.f101506g = r9
                    r0.f101503d = r4
                    java.lang.Object r8 = r8.b(r2, r0)
                    if (r8 != r1) goto L_0x0063
                    return r1
                L_0x0063:
                    r2 = r7
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L_0x0067:
                    java.lang.Boolean r9 = (java.lang.Boolean) r9
                    boolean r9 = r9.booleanValue()
                    if (r9 != 0) goto L_0x0071
                    r9 = r8
                    goto L_0x0074
                L_0x0071:
                    java.lang.String r9 = r2.f101501c
                    goto L_0x0076
                L_0x0074:
                    r8 = r9
                    r9 = r5
                L_0x0076:
                    r0.f101504e = r5
                    r0.f101506g = r5
                    r0.f101503d = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L_0x0083
                    return r1
                L_0x0083:
                    XH.N r8 = XH.C16807N.f139792a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: qk.C11789b.h.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public h(C16532g gVar, C11789b bVar, String str) {
            this.f101496a = gVar;
            this.f101497b = bVar;
            this.f101498c = str;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101496a.collect(new a(hVar, this.f101497b, this.f101498c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C11789b(C14613b bVar, ru.c cVar, C11995a aVar, C12860a aVar2, M m10) {
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(cVar, "wayfindingIntegration");
        C17542s.j(aVar, "wayfindingRepository");
        C17542s.j(aVar2, "localStoreSelectionRepository");
        C17542s.j(m10, "ioDispatcher");
        this.f101434a = bVar;
        this.f101435b = cVar;
        this.f101436c = aVar;
        this.f101437d = aVar2;
        this.f101438e = m10;
    }

    /* access modifiers changed from: private */
    public final C12529b.a d(C12517b bVar) {
        int i10 = a.f101439a[bVar.b().b().a().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return C12529b.a.DISPLAY;
        }
        if (i10 == 3 || i10 == 4) {
            return C12529b.a.SALES;
        }
        throw new t();
    }

    public final C16532g<List<s.o>> e(String str) {
        C17542s.j(str, "listId");
        return C16534i.L(C16534i.s(new e(C16534i.Y(C16534i.n(C16534i.s(new c(this.f101434a.m(str))), C16534i.g0(new d(C16534i.A(this.f101437d.b())), new C2392b((C17164e) null, this)), new f((C17164e<? super f>) null)), new v(C16877v.n(), C16877v.n()), new g(this, (C17164e<? super g>) null)))), this.f101438e);
    }
}
