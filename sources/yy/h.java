package Yy;

import TJ.C16532g;
import TJ.C16533h;
import W2.f;
import W2.i;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\f\u0010\u0010¨\u0006\u0013"}, d2 = {"LYy/h;", "LYy/g;", "LR2/h;", "LW2/f;", "dataStore", "<init>", "(LR2/h;)V", "", "applied", "LXH/N;", "b", "(ZLdI/e;)Ljava/lang/Object;", "a", "LR2/h;", "LTJ/g;", "LTJ/g;", "()LTJ/g;", "isCoWorkerDiscountApplied", "c", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f118246c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final R2.h<f> f118247a;

    /* renamed from: b  reason: collision with root package name */
    private final C16532g<Boolean> f118248b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LYy/h$a;", "", "<init>", "()V", "", "KEY_COWORKER_DISCOUNT_APPLIED", "Ljava/lang/String;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f118249a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f118250a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCoWorkerDiscountLocalDataSourceImpl$special$$inlined$map$1$2", f = "ScanAndGoCoWorkerDiscountLocalDataSource.kt", l = {50}, m = "emit")
            /* renamed from: Yy.h$b$a$a  reason: collision with other inner class name */
            public static final class C2943a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f118251c;

                /* renamed from: d  reason: collision with root package name */
                int f118252d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f118253e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2943a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f118253e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f118251c = obj;
                    this.f118252d |= Integer.MIN_VALUE;
                    return this.f118253e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f118250a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Yy.h.b.a.C2943a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Yy.h$b$a$a r0 = (Yy.h.b.a.C2943a) r0
                    int r1 = r0.f118252d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f118252d = r1
                    goto L_0x0018
                L_0x0013:
                    Yy.h$b$a$a r0 = new Yy.h$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f118251c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f118252d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004b
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f118250a
                    W2.f r5 = (W2.f) r5
                    java.lang.String r2 = "ScanAndGoCoWorkerDiscountLocalDataSource.Key.CoWorkerDiscount.Applied"
                    W2.f$a r2 = W2.h.a(r2)
                    java.lang.Object r5 = r5.b(r2)
                    r0.f118252d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Yy.h.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar) {
            this.f118249a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f118249a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCoWorkerDiscountLocalDataSourceImpl$update$2", f = "ScanAndGoCoWorkerDiscountLocalDataSource.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118254c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f118255d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f118256e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f118256e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f118256e, eVar);
            cVar.f118255d = obj;
            return cVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((c) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f118254c == 0) {
                y.b(obj);
                ((W2.c) this.f118255d).j(W2.h.a("ScanAndGoCoWorkerDiscountLocalDataSource.Key.CoWorkerDiscount.Applied"), kotlin.coroutines.jvm.internal.b.a(this.f118256e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public h(R2.h<f> hVar) {
        C17542s.j(hVar, "dataStore");
        this.f118247a = hVar;
        this.f118248b = new b(hVar.getData());
    }

    public C16532g<Boolean> a() {
        return this.f118248b;
    }

    public Object b(boolean z10, C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.f118247a, new c(z10, (C17164e<? super c>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }
}
