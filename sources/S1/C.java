package S1;

import YH.C16877v;
import com.adjust.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"LS1/C;", "", "", "weight", "<init>", "(I)V", "other", "E", "(LS1/C;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "F", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C implements Comparable<C> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13316b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final C f13317c;

    /* renamed from: d  reason: collision with root package name */
    private static final C f13318d;

    /* renamed from: e  reason: collision with root package name */
    private static final C f13319e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C f13320f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C f13321g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final C f13322h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final C f13323i;

    /* renamed from: j  reason: collision with root package name */
    private static final C f13324j;

    /* renamed from: k  reason: collision with root package name */
    private static final C f13325k;

    /* renamed from: l  reason: collision with root package name */
    private static final C f13326l;

    /* renamed from: m  reason: collision with root package name */
    private static final C f13327m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final C f13328n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final C f13329o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final C f13330p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final C f13331q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final C f13332r;

    /* renamed from: s  reason: collision with root package name */
    private static final C f13333s;

    /* renamed from: t  reason: collision with root package name */
    private static final C f13334t;

    /* renamed from: u  reason: collision with root package name */
    private static final List<C> f13335u;

    /* renamed from: a  reason: collision with root package name */
    private final int f13336a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR \u0010\u001f\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\b¨\u0006\""}, d2 = {"LS1/C$a;", "", "<init>", "()V", "LS1/C;", "W400", "LS1/C;", "f", "()LS1/C;", "getW400$annotations", "W500", "g", "getW500$annotations", "W600", "h", "getW600$annotations", "W700", "i", "getW700$annotations", "Light", "b", "getLight$annotations", "Normal", "d", "getNormal$annotations", "Medium", "c", "getMedium$annotations", "SemiBold", "e", "getSemiBold$annotations", "Bold", "a", "getBold$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C a() {
            return C.f13332r;
        }

        public final C b() {
            return C.f13328n;
        }

        public final C c() {
            return C.f13330p;
        }

        public final C d() {
            return C.f13329o;
        }

        public final C e() {
            return C.f13331q;
        }

        public final C f() {
            return C.f13320f;
        }

        public final C g() {
            return C.f13321g;
        }

        public final C h() {
            return C.f13322h;
        }

        public final C i() {
            return C.f13323i;
        }

        private a() {
        }
    }

    static {
        C c10 = new C(100);
        f13317c = c10;
        C c11 = new C(200);
        f13318d = c11;
        C c12 = new C(300);
        f13319e = c12;
        C c13 = new C(Constants.MINIMAL_ERROR_STATUS_CODE);
        f13320f = c13;
        C c14 = new C(500);
        f13321g = c14;
        C c15 = new C(600);
        f13322h = c15;
        C c16 = new C(700);
        f13323i = c16;
        C c17 = new C(800);
        f13324j = c17;
        C c18 = new C(900);
        f13325k = c18;
        f13326l = c10;
        f13327m = c11;
        f13328n = c12;
        f13329o = c13;
        f13330p = c14;
        f13331q = c15;
        f13332r = c16;
        f13333s = c17;
        f13334t = c18;
        f13335u = C16877v.q(c10, c11, c12, c13, c14, c15, c16, c17, c18);
    }

    public C(int i10) {
        this.f13336a = i10;
        if (1 > i10 || i10 >= 1001) {
            throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i10).toString());
        }
    }

    /* renamed from: E */
    public int compareTo(C c10) {
        return C17542s.l(this.f13336a, c10.f13336a);
    }

    public final int F() {
        return this.f13336a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C) && this.f13336a == ((C) obj).f13336a;
    }

    public int hashCode() {
        return this.f13336a;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f13336a + ')';
    }
}
