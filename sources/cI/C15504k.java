package CI;

import AI.C15429j;
import DI.C15538I;
import FI.C15685a;
import FI.C15686b;
import FI.C15687c;
import GI.C15712F;
import XH.t;
import YH.C16877v;
import fI.C17221b;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.C17642l;
import tJ.C17989i;
import tJ.C17993m;
import tJ.C17994n;
import uI.C18064m;

/* renamed from: CI.k  reason: case insensitive filesystem */
public final class C15504k extends C15429j {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f133529k = {P.h(new G(C15504k.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};

    /* renamed from: h  reason: collision with root package name */
    private final a f133530h;

    /* renamed from: i  reason: collision with root package name */
    private C17631a<b> f133531i;

    /* renamed from: j  reason: collision with root package name */
    private final C17989i f133532j;

    /* renamed from: CI.k$a */
    public enum a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    /* renamed from: CI.k$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C15538I f133533a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f133534b;

        public b(C15538I i10, boolean z10) {
            C17542s.j(i10, "ownerModuleDescriptor");
            this.f133533a = i10;
            this.f133534b = z10;
        }

        public final C15538I a() {
            return this.f133533a;
        }

        public final boolean b() {
            return this.f133534b;
        }
    }

    /* renamed from: CI.k$c */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f133535a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                CI.k$a[] r0 = CI.C15504k.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                CI.k$a r1 = CI.C15504k.a.FROM_DEPENDENCIES     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                CI.k$a r1 = CI.C15504k.a.FROM_CLASS_LOADER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                CI.k$a r1 = CI.C15504k.a.FALLBACK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f133535a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: CI.C15504k.c.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15504k(C17994n nVar, a aVar) {
        super(nVar);
        C17542s.j(nVar, "storageManager");
        C17542s.j(aVar, "kind");
        this.f133530h = aVar;
        this.f133532j = nVar.d(new C15501h(this, nVar));
        int i10 = c.f133535a[aVar.ordinal()];
        if (i10 == 1) {
            return;
        }
        if (i10 == 2) {
            f(false);
        } else if (i10 == 3) {
            f(true);
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public static final C15514u J0(C15504k kVar, C17994n nVar) {
        C15712F s10 = kVar.s();
        C17542s.i(s10, "getBuiltInsModule(...)");
        return new C15514u(s10, nVar, new C15503j(kVar));
    }

    /* access modifiers changed from: private */
    public static final b K0(C15504k kVar) {
        C17631a<b> aVar = kVar.f133531i;
        if (aVar != null) {
            b invoke = aVar.invoke();
            kVar.f133531i = null;
            return invoke;
        }
        throw new AssertionError("JvmBuiltins instance has not been initialized properly");
    }

    /* access modifiers changed from: private */
    public static final b O0(C15538I i10, boolean z10) {
        return new b(i10, z10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public List<C15686b> w() {
        Iterable<C15686b> w10 = super.w();
        C17542s.i(w10, "getClassDescriptorFactories(...)");
        C17994n V10 = V();
        C17542s.i(V10, "getStorageManager(...)");
        C15712F s10 = s();
        C17542s.i(s10, "getBuiltInsModule(...)");
        return C16877v.U0(w10, new C15500g(V10, s10, (C17642l) null, 4, (DefaultConstructorMarker) null));
    }

    public final C15514u M0() {
        return (C15514u) C17993m.a(this.f133532j, this, f133529k[0]);
    }

    /* access modifiers changed from: protected */
    public C15687c N() {
        return M0();
    }

    public final void N0(C15538I i10, boolean z10) {
        C17542s.j(i10, "moduleDescriptor");
        P0(new C15502i(i10, z10));
    }

    public final void P0(C17631a<b> aVar) {
        C17542s.j(aVar, "computation");
        this.f133531i = aVar;
    }

    /* access modifiers changed from: protected */
    public C15685a g() {
        return M0();
    }
}
