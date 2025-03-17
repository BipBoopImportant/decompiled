package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a+\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007\"\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000b\"\u0014\u0010\u001a\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f\"\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013¨\u0006\u001d"}, d2 = {"", "initialValue", "visibilityThreshold", "Lm0/a;", "Lm0/m;", "a", "(FF)Lm0/a;", "Lm0/m;", "positiveInfinityBounds1D", "Lm0/n;", "b", "Lm0/n;", "positiveInfinityBounds2D", "Lm0/o;", "c", "Lm0/o;", "positiveInfinityBounds3D", "Lm0/p;", "d", "Lm0/p;", "positiveInfinityBounds4D", "e", "negativeInfinityBounds1D", "f", "negativeInfinityBounds2D", "g", "negativeInfinityBounds3D", "h", "negativeInfinityBounds4D", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.b  reason: case insensitive filesystem */
public final class C5532b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C5554m f25705a = r.a(Float.POSITIVE_INFINITY);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C5556n f25706b = r.b(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C5558o f25707c = r.c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C5560p f25708d = r.d(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C5554m f25709e = r.a(Float.NEGATIVE_INFINITY);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C5556n f25710f = r.b(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C5558o f25711g = r.c(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final C5560p f25712h = r.d(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final C5530a<Float, C5554m> a(float f10, float f11) {
        return new C5530a(Float.valueOf(f10), B0.f(C17536l.f144385a), Float.valueOf(f11), (String) null, 8, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C5530a b(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.01f;
        }
        return a(f10, f11);
    }
}
