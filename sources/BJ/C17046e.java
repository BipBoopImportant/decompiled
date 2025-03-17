package bJ;

import ZI.C17004a;
import java.util.Arrays;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: bJ.e  reason: case insensitive filesystem */
public final class C17046e extends C17004a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f141177h = new a((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final C17046e f141178i;

    /* renamed from: j  reason: collision with root package name */
    public static final C17046e f141179j;

    /* renamed from: k  reason: collision with root package name */
    public static final C17046e f141180k = new C17046e(new int[0]);

    /* renamed from: g  reason: collision with root package name */
    private final boolean f141181g;

    /* renamed from: bJ.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C17046e eVar = new C17046e(2, 1, 0);
        f141178i = eVar;
        f141179j = eVar.m();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17046e(int[] iArr, boolean z10) {
        super(Arrays.copyOf(iArr, iArr.length));
        C17542s.j(iArr, "versionArray");
        this.f141181g = z10;
    }

    private final boolean i(C17046e eVar) {
        if ((a() == 1 && b() == 0) || a() == 0) {
            return false;
        }
        return !l(eVar);
    }

    private final boolean l(C17046e eVar) {
        if (a() > eVar.a()) {
            return true;
        }
        return a() >= eVar.a() && b() > eVar.b();
    }

    public final boolean h(C17046e eVar) {
        C17542s.j(eVar, "metadataVersionFromLanguageVersion");
        if (a() == 2 && b() == 0) {
            C17046e eVar2 = f141178i;
            if (eVar2.a() == 1 && eVar2.b() == 8) {
                return true;
            }
        }
        return i(eVar.k(this.f141181g));
    }

    public final boolean j() {
        return this.f141181g;
    }

    public final C17046e k(boolean z10) {
        C17046e eVar = z10 ? f141178i : f141179j;
        return eVar.l(this) ? eVar : this;
    }

    public final C17046e m() {
        return (a() == 1 && b() == 9) ? new C17046e(2, 0, 0) : new C17046e(a(), b() + 1, 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17046e(int... iArr) {
        this(iArr, false);
        C17542s.j(iArr, "numbers");
    }
}
