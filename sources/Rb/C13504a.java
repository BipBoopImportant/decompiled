package RB;

import EB.C12832d;
import FB.C12860a;
import FB.C12864e;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import com.ingka.ikea.store.datalayer.StorageType;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import yB.C15281a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LRB/a;", "", "LFB/a;", "localStoreSelectionRepository", "LyB/a;", "getProfileStoreUseCase", "LFB/e;", "storeSelectionMemoryRepository", "<init>", "(LFB/a;LyB/a;LFB/e;)V", "Lcom/ingka/ikea/store/datalayer/StorageType;", "storage", "", "a", "(Lcom/ingka/ikea/store/datalayer/StorageType;LdI/e;)Ljava/lang/Object;", "LFB/a;", "b", "LyB/a;", "c", "LFB/e;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: RB.a  reason: case insensitive filesystem */
public final class C13504a {

    /* renamed from: a  reason: collision with root package name */
    private final C12860a f115115a;

    /* renamed from: b  reason: collision with root package name */
    private final C15281a f115116b;

    /* renamed from: c  reason: collision with root package name */
    private final C12864e f115117c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: RB.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C2823a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f115118a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.ingka.ikea.store.datalayer.StorageType[] r0 = com.ingka.ikea.store.datalayer.StorageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.store.datalayer.StorageType r1 = com.ingka.ikea.store.datalayer.StorageType.PROFILE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.store.datalayer.StorageType r1 = com.ingka.ikea.store.datalayer.StorageType.LOCAL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.store.datalayer.StorageType r1 = com.ingka.ikea.store.datalayer.StorageType.NO_STORAGE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f115118a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: RB.C13504a.C2823a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: RB.a$b */
    public static final class b implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f115119a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: RB.a$b$a  reason: collision with other inner class name */
        public static final class C2824a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f115120a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.store.storepicker.impl.usecase.GetSelectedStoreIdUseCase$invoke$$inlined$map$1$2", f = "GetSelectedStoreIdUseCase.kt", l = {50}, m = "emit")
            /* renamed from: RB.a$b$a$a  reason: collision with other inner class name */
            public static final class C2825a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f115121c;

                /* renamed from: d  reason: collision with root package name */
                int f115122d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2824a f115123e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2825a(C2824a aVar, C17164e eVar) {
                    super(eVar);
                    this.f115123e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f115121c = obj;
                    this.f115122d |= Integer.MIN_VALUE;
                    return this.f115123e.emit((Object) null, this);
                }
            }

            public C2824a(C16533h hVar) {
                this.f115120a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof RB.C13504a.b.C2824a.C2825a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    RB.a$b$a$a r0 = (RB.C13504a.b.C2824a.C2825a) r0
                    int r1 = r0.f115122d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f115122d = r1
                    goto L_0x0018
                L_0x0013:
                    RB.a$b$a$a r0 = new RB.a$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f115121c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f115122d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f115120a
                    EB.d r5 = (EB.C12832d) r5
                    if (r5 == 0) goto L_0x003f
                    java.lang.String r5 = r5.e()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    r0.f115122d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: RB.C13504a.b.C2824a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar) {
            this.f115119a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f115119a.collect(new C2824a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C13504a(C12860a aVar, C15281a aVar2, C12864e eVar) {
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(aVar2, "getProfileStoreUseCase");
        C17542s.j(eVar, "storeSelectionMemoryRepository");
        this.f115115a = aVar;
        this.f115116b = aVar2;
        this.f115117c = eVar;
    }

    public final Object a(StorageType storageType, C17164e<? super String> eVar) {
        C16532g<C12832d> gVar;
        int i10 = C2823a.f115118a[storageType.ordinal()];
        if (i10 == 1) {
            gVar = this.f115116b.invoke();
        } else if (i10 == 2) {
            gVar = this.f115115a.b();
        } else if (i10 == 3) {
            gVar = this.f115117c.b();
        } else {
            throw new t();
        }
        return C16534i.D(C16534i.e0(new b(gVar), 1), eVar);
    }
}
