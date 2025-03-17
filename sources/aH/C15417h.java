package AH;

import NH.d;
import NH.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\r"}, d2 = {"LAH/h;", "LNH/d;", "", "LAH/c;", "", "developmentMode", "<init>", "(Z)V", "g", "Z", "()Z", "h", "a", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: AH.h  reason: case insensitive filesystem */
public final class C15417h extends d<Object, C15412c> {

    /* renamed from: h  reason: collision with root package name */
    public static final a f132967h = new a((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    private static final h f132968i = new h("Before");

    /* renamed from: j  reason: collision with root package name */
    private static final h f132969j = new h("State");
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final h f132970k = new h("Monitoring");
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final h f132971l = new h("Engine");
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final h f132972m = new h("Receive");

    /* renamed from: g  reason: collision with root package name */
    private final boolean f132973g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"LAH/h$a;", "", "<init>", "()V", "LNH/h;", "Monitoring", "LNH/h;", "b", "()LNH/h;", "Engine", "a", "Receive", "c", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: AH.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return C15417h.f132971l;
        }

        public final h b() {
            return C15417h.f132970k;
        }

        public final h c() {
            return C15417h.f132972m;
        }

        private a() {
        }
    }

    public C15417h(boolean z10) {
        super(f132968i, f132969j, f132970k, f132971l, f132972m);
        this.f132973g = z10;
    }

    public boolean g() {
        return this.f132973g;
    }
}
