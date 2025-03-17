package L1;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17970f;
import tI.C17978n;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u000f¨\u0006\u001c"}, d2 = {"LL1/h;", "", "", "current", "LtI/f;", "range", "", "steps", "<init>", "(FLtI/f;I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "b", "()F", "LtI/f;", "c", "()LtI/f;", "I", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f8931d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final h f8932e = new h(0.0f, C17978n.c(0.0f, 0.0f), 0, 4, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final float f8933a;

    /* renamed from: b  reason: collision with root package name */
    private final C17970f<Float> f8934b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8935c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LL1/h$a;", "", "<init>", "()V", "LL1/h;", "Indeterminate", "LL1/h;", "a", "()LL1/h;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return h.f8932e;
        }

        private a() {
        }
    }

    public h(float f10, C17970f<Float> fVar, int i10) {
        this.f8933a = f10;
        this.f8934b = fVar;
        this.f8935c = i10;
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final float b() {
        return this.f8933a;
    }

    public final C17970f<Float> c() {
        return this.f8934b;
    }

    public final int d() {
        return this.f8935c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f8933a == hVar.f8933a && C17542s.e(this.f8934b, hVar.f8934b) && this.f8935c == hVar.f8935c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f8933a) * 31) + this.f8934b.hashCode()) * 31) + this.f8935c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f8933a + ", range=" + this.f8934b + ", steps=" + this.f8935c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(float f10, C17970f fVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, fVar, (i11 & 4) != 0 ? 0 : i10);
    }
}
