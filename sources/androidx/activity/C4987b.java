package androidx.activity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0010B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/activity/b;", "", "", "touchX", "touchY", "progress", "", "swipeEdge", "<init>", "(FFFI)V", "Landroid/window/BackEvent;", "backEvent", "(Landroid/window/BackEvent;)V", "", "toString", "()Ljava/lang/String;", "a", "F", "getTouchX", "()F", "b", "getTouchY", "c", "d", "I", "()I", "e", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.activity.b  reason: case insensitive filesystem */
public final class C4987b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f15258e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final float f15259a;

    /* renamed from: b  reason: collision with root package name */
    private final float f15260b;

    /* renamed from: c  reason: collision with root package name */
    private final float f15261c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15262d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/activity/b$a;", "", "<init>", "()V", "", "EDGE_LEFT", "I", "EDGE_RIGHT", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.activity.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4987b(float f10, float f11, float f12, int i10) {
        this.f15259a = f10;
        this.f15260b = f11;
        this.f15261c = f12;
        this.f15262d = i10;
    }

    public final float a() {
        return this.f15261c;
    }

    public final int b() {
        return this.f15262d;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f15259a + ", touchY=" + this.f15260b + ", progress=" + this.f15261c + ", swipeEdge=" + this.f15262d + '}';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4987b(android.window.BackEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            androidx.activity.a r0 = androidx.activity.C4986a.f15257a
            float r1 = r0.c(r5)
            float r2 = r0.d(r5)
            float r3 = r0.a(r5)
            int r5 = r0.b(r5)
            r4.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.C4987b.<init>(android.window.BackEvent):void");
    }
}
