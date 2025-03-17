package x4;

import C4.j;
import com.google.android.libraries.places.api.model.PlaceTypes;
import fK.z;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import uI.C18055d;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001:\u0001#B[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0011BW\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0014BQ\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010 R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010$R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010$R\u0017\u0010\t\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b#\u0010 R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b%\u0010 R\u0017\u0010\u000b\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b&\u0010 R\u0017\u0010\f\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b)\u0010 R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010-\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\b*\u0010\"R0\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\f\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001b\u0010/\u001a\u0004\b+\u00100R(\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010-\u001a\u0004\u0018\u00010\u00018\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\b,\u00102¨\u00063"}, d2 = {"Lx4/C;", "", "", "singleTop", "restoreState", "", "popUpToId", "popUpToInclusive", "popUpToSaveState", "enterAnim", "exitAnim", "popEnterAnim", "popExitAnim", "<init>", "(ZZIZZIIII)V", "", "popUpToRoute", "(ZZLjava/lang/String;ZZIIII)V", "LuI/d;", "popUpToRouteClass", "(ZZLuI/d;ZZIIII)V", "popUpToRouteObject", "(ZZLjava/lang/Object;ZZIIII)V", "j", "()Z", "l", "i", "k", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Z", "b", "c", "I", "e", "d", "f", "g", "h", "<set-?>", "Ljava/lang/String;", "LuI/d;", "()LuI/d;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f57395a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f57396b;

    /* renamed from: c  reason: collision with root package name */
    private final int f57397c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f57398d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f57399e;

    /* renamed from: f  reason: collision with root package name */
    private final int f57400f;

    /* renamed from: g  reason: collision with root package name */
    private final int f57401g;

    /* renamed from: h  reason: collision with root package name */
    private final int f57402h;

    /* renamed from: i  reason: collision with root package name */
    private final int f57403i;

    /* renamed from: j  reason: collision with root package name */
    private String f57404j;

    /* renamed from: k  reason: collision with root package name */
    private C18055d<?> f57405k;

    /* renamed from: l  reason: collision with root package name */
    private Object f57406l;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J+\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\u00020\u00002\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u0019\u001a\u00020\u0000\"\b\b\u0000\u0010\u0018*\u00020\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00002\b\b\u0001\u0010 \u001a\u00020\n¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010#\u001a\u00020\u00002\b\b\u0001\u0010\"\u001a\u00020\n¢\u0006\u0004\b#\u0010\u001dJ\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010'R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u001c\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010.R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010'R\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u0010(R\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u0010(¨\u00064"}, d2 = {"Lx4/C$a;", "", "<init>", "()V", "", "singleTop", "d", "(Z)Lx4/C$a;", "restoreState", "m", "", "destinationId", "inclusive", "saveState", "g", "(IZZ)Lx4/C$a;", "", "route", "i", "(Ljava/lang/String;ZZ)Lx4/C$a;", "LuI/d;", "klass", "j", "(LuI/d;ZZ)Lx4/C$a;", "T", "h", "(Ljava/lang/Object;ZZ)Lx4/C$a;", "enterAnim", "b", "(I)Lx4/C$a;", "exitAnim", "c", "popEnterAnim", "e", "popExitAnim", "f", "Lx4/C;", "a", "()Lx4/C;", "Z", "I", "popUpToId", "Ljava/lang/String;", "popUpToRoute", "LuI/d;", "popUpToRouteClass", "Ljava/lang/Object;", "popUpToRouteObject", "popUpToInclusive", "popUpToSaveState", "k", "l", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f57407a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f57408b;

        /* renamed from: c  reason: collision with root package name */
        private int f57409c = -1;

        /* renamed from: d  reason: collision with root package name */
        private String f57410d;

        /* renamed from: e  reason: collision with root package name */
        private C18055d<?> f57411e;

        /* renamed from: f  reason: collision with root package name */
        private Object f57412f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f57413g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f57414h;

        /* renamed from: i  reason: collision with root package name */
        private int f57415i = -1;

        /* renamed from: j  reason: collision with root package name */
        private int f57416j = -1;

        /* renamed from: k  reason: collision with root package name */
        private int f57417k = -1;

        /* renamed from: l  reason: collision with root package name */
        private int f57418l = -1;

        public static /* synthetic */ a k(a aVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return aVar.g(i10, z10, z11);
        }

        public static /* synthetic */ a l(a aVar, String str, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return aVar.i(str, z10, z11);
        }

        public final C a() {
            String str = this.f57410d;
            if (str != null) {
                return new C(this.f57407a, this.f57408b, str, this.f57413g, this.f57414h, this.f57415i, this.f57416j, this.f57417k, this.f57418l);
            }
            C18055d<?> dVar = this.f57411e;
            if (dVar != null) {
                return new C(this.f57407a, this.f57408b, dVar, this.f57413g, this.f57414h, this.f57415i, this.f57416j, this.f57417k, this.f57418l);
            }
            Object obj = this.f57412f;
            if (obj != null) {
                boolean z10 = this.f57407a;
                boolean z11 = this.f57408b;
                C17542s.g(obj);
                return new C(z10, z11, obj, this.f57413g, this.f57414h, this.f57415i, this.f57416j, this.f57417k, this.f57418l);
            }
            return new C(this.f57407a, this.f57408b, this.f57409c, this.f57413g, this.f57414h, this.f57415i, this.f57416j, this.f57417k, this.f57418l);
        }

        public final a b(int i10) {
            this.f57415i = i10;
            return this;
        }

        public final a c(int i10) {
            this.f57416j = i10;
            return this;
        }

        public final a d(boolean z10) {
            this.f57407a = z10;
            return this;
        }

        public final a e(int i10) {
            this.f57417k = i10;
            return this;
        }

        public final a f(int i10) {
            this.f57418l = i10;
            return this;
        }

        public final a g(int i10, boolean z10, boolean z11) {
            this.f57409c = i10;
            this.f57410d = null;
            this.f57413g = z10;
            this.f57414h = z11;
            return this;
        }

        public final <T> a h(T t10, boolean z10, boolean z11) {
            C17542s.j(t10, PlaceTypes.ROUTE);
            this.f57412f = t10;
            g(j.g(z.e(P.b(t10.getClass()))), z10, z11);
            return this;
        }

        public final a i(String str, boolean z10, boolean z11) {
            this.f57410d = str;
            this.f57409c = -1;
            this.f57413g = z10;
            this.f57414h = z11;
            return this;
        }

        public final a j(C18055d<?> dVar, boolean z10, boolean z11) {
            C17542s.j(dVar, "klass");
            this.f57411e = dVar;
            this.f57409c = -1;
            this.f57413g = z10;
            this.f57414h = z11;
            return this;
        }

        public final a m(boolean z10) {
            this.f57408b = z10;
            return this;
        }
    }

    public C(boolean z10, boolean z11, int i10, boolean z12, boolean z13, int i11, int i12, int i13, int i14) {
        this.f57395a = z10;
        this.f57396b = z11;
        this.f57397c = i10;
        this.f57398d = z12;
        this.f57399e = z13;
        this.f57400f = i11;
        this.f57401g = i12;
        this.f57402h = i13;
        this.f57403i = i14;
    }

    public final int a() {
        return this.f57400f;
    }

    public final int b() {
        return this.f57401g;
    }

    public final int c() {
        return this.f57402h;
    }

    public final int d() {
        return this.f57403i;
    }

    public final int e() {
        return this.f57397c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return this.f57395a == c10.f57395a && this.f57396b == c10.f57396b && this.f57397c == c10.f57397c && C17542s.e(this.f57404j, c10.f57404j) && C17542s.e(this.f57405k, c10.f57405k) && C17542s.e(this.f57406l, c10.f57406l) && this.f57398d == c10.f57398d && this.f57399e == c10.f57399e && this.f57400f == c10.f57400f && this.f57401g == c10.f57401g && this.f57402h == c10.f57402h && this.f57403i == c10.f57403i;
    }

    public final String f() {
        return this.f57404j;
    }

    public final C18055d<?> g() {
        return this.f57405k;
    }

    public final Object h() {
        return this.f57406l;
    }

    public int hashCode() {
        int i10 = (((((j() ? 1 : 0) * true) + (l() ? 1 : 0)) * 31) + this.f57397c) * 31;
        String str = this.f57404j;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        C18055d<?> dVar = this.f57405k;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Object obj = this.f57406l;
        if (obj != null) {
            i11 = obj.hashCode();
        }
        return ((((((((((((hashCode2 + i11) * 31) + (i() ? 1 : 0)) * 31) + (k() ? 1 : 0)) * 31) + this.f57400f) * 31) + this.f57401g) * 31) + this.f57402h) * 31) + this.f57403i;
    }

    public final boolean i() {
        return this.f57398d;
    }

    public final boolean j() {
        return this.f57395a;
    }

    public final boolean k() {
        return this.f57399e;
    }

    public final boolean l() {
        return this.f57396b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C.class.getSimpleName());
        sb2.append("(");
        if (this.f57395a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f57396b) {
            sb2.append("restoreState ");
        }
        String str = this.f57404j;
        if (!((str == null && this.f57397c == -1) || str == null)) {
            sb2.append("popUpTo(");
            String str2 = this.f57404j;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                C18055d<?> dVar = this.f57405k;
                if (dVar != null) {
                    sb2.append(dVar);
                } else {
                    Object obj = this.f57406l;
                    if (obj != null) {
                        sb2.append(obj);
                    } else {
                        sb2.append("0x");
                        sb2.append(Integer.toHexString(this.f57397c));
                    }
                }
            }
            if (this.f57398d) {
                sb2.append(" inclusive");
            }
            if (this.f57399e) {
                sb2.append(" saveState");
            }
            sb2.append(")");
        }
        if (!(this.f57400f == -1 && this.f57401g == -1 && this.f57402h == -1 && this.f57403i == -1)) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(this.f57400f));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(this.f57401g));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(this.f57402h));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(this.f57403i));
            sb2.append(")");
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "sb.toString()");
        return sb3;
    }

    public C(boolean z10, boolean z11, String str, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, v.f57671k.a(str).hashCode(), z12, z13, i10, i11, i12, i13);
        this.f57404j = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C(boolean z10, boolean z11, C18055d<?> dVar, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, j.g(z.e(dVar)), z12, z13, i10, i11, i12, i13);
        C17542s.g(dVar);
        this.f57405k = dVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C(boolean z10, boolean z11, Object obj, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, j.g(z.e(P.b(obj.getClass()))), z12, z13, i10, i11, i12, i13);
        C17542s.j(obj, "popUpToRouteObject");
        this.f57406l = obj;
    }
}
