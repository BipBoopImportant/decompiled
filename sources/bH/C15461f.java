package BH;

import NH.d;
import NH.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qH.C17777b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\r"}, d2 = {"LBH/f;", "LNH/d;", "LBH/d;", "LqH/b;", "", "developmentMode", "<init>", "(Z)V", "g", "Z", "()Z", "h", "a", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: BH.f  reason: case insensitive filesystem */
public final class C15461f extends d<C15459d, C17777b> {

    /* renamed from: h  reason: collision with root package name */
    public static final a f133245h = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final h f133246i = new h("Receive");
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final h f133247j = new h("Parse");
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final h f133248k = new h("Transform");

    /* renamed from: l  reason: collision with root package name */
    private static final h f133249l = new h("State");

    /* renamed from: m  reason: collision with root package name */
    private static final h f133250m = new h("After");

    /* renamed from: g  reason: collision with root package name */
    private final boolean f133251g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"LBH/f$a;", "", "<init>", "()V", "LNH/h;", "Receive", "LNH/h;", "b", "()LNH/h;", "Parse", "a", "Transform", "c", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: BH.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return C15461f.f133247j;
        }

        public final h b() {
            return C15461f.f133246i;
        }

        public final h c() {
            return C15461f.f133248k;
        }

        private a() {
        }
    }

    public C15461f(boolean z10) {
        super(f133246i, f133247j, f133248k, f133249l, f133250m);
        this.f133251g = z10;
    }

    public boolean g() {
        return this.f133251g;
    }
}
