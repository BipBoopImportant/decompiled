package me.saket.telephoto.zoomable;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pK.C17756a;
import pK.C17762g;
import pK.C17763h;
import rK.C17871f;
import tI.C17978n;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\n\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Lme/saket/telephoto/zoomable/a;", "", "LpK/a;", "baseZoom", "LpK/g;", "userZoom", "<init>", "(JFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "e", "()F", "LE1/h0;", "f", "()J", "LpK/h;", "range", "leewayPercentForMinZoom", "leewayPercentForMaxZoom", "a", "(LpK/h;FF)Lme/saket/telephoto/zoomable/a;", "", "i", "(LpK/h;)Z", "h", "c", "(JF)Lme/saket/telephoto/zoomable/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "b", "F", "g", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C3526a f144586c = new C3526a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f144587a;

    /* renamed from: b  reason: collision with root package name */
    private final float f144588b;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ \u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\f8\u0006XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Lme/saket/telephoto/zoomable/a$a;", "", "<init>", "()V", "LpK/a;", "baseZoom", "LpK/h;", "range", "Lme/saket/telephoto/zoomable/a;", "d", "(JLpK/h;)Lme/saket/telephoto/zoomable/a;", "c", "", "finalZoom", "a", "(JF)Lme/saket/telephoto/zoomable/a;", "LE1/h0;", "b", "(JJ)Lme/saket/telephoto/zoomable/a;", "ZoomDeltaEpsilon", "F", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: me.saket.telephoto.zoomable.a$a  reason: collision with other inner class name */
    public static final class C3526a {
        public /* synthetic */ C3526a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(long j10, float f10) {
            return new a(j10, C17762g.a(f10 / C17871f.f(j10)), (DefaultConstructorMarker) null);
        }

        public final a b(long j10, long j11) {
            return new a(j10, C17762g.a(C17871f.f(j11) / C17871f.f(j10)), (DefaultConstructorMarker) null);
        }

        public final a c(long j10, C17763h hVar) {
            C17542s.j(hVar, "range");
            return new a(j10, C17762g.a(hVar.a(j10) / C17756a.c(j10)), (DefaultConstructorMarker) null);
        }

        public final a d(long j10, C17763h hVar) {
            C17542s.j(hVar, "range");
            return new a(j10, C17762g.a(hVar.b(j10) / C17756a.c(j10)), (DefaultConstructorMarker) null);
        }

        private C3526a() {
        }
    }

    public /* synthetic */ a(long j10, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, f10);
    }

    public static /* synthetic */ a b(a aVar, C17763h hVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = f10;
        }
        return aVar.a(hVar, f10, f11);
    }

    public static /* synthetic */ a d(a aVar, long j10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = aVar.f144587a;
        }
        if ((i10 & 2) != 0) {
            f10 = aVar.f144588b;
        }
        return aVar.c(j10, f10);
    }

    private final float e() {
        return C17871f.f(f());
    }

    public final a a(C17763h hVar, float f10, float f11) {
        C17542s.j(hVar, "range");
        C3526a aVar = f144586c;
        float f12 = aVar.d(this.f144587a, hVar).f144588b;
        float f13 = aVar.c(this.f144587a, hVar).f144588b;
        float f14 = (float) 1;
        return d(this, 0, C17762g.a(C17978n.l(this.f144588b, f12 * (f14 - f10), f13 * (f14 + f11))), 1, (Object) null);
    }

    public final a c(long j10, float f10) {
        return new a(j10, f10, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17756a.b(this.f144587a, aVar.f144587a) && C17762g.b(this.f144588b, aVar.f144588b);
    }

    public final long f() {
        return C17871f.u(this.f144587a, this.f144588b);
    }

    public final float g() {
        return this.f144588b;
    }

    public final boolean h(C17763h hVar) {
        C17542s.j(hVar, "range");
        return f144586c.c(this.f144587a, hVar).e() - e() < 0.001f;
    }

    public int hashCode() {
        return (C17756a.d(this.f144587a) * 31) + C17762g.c(this.f144588b);
    }

    public final boolean i(C17763h hVar) {
        C17542s.j(hVar, "range");
        return e() - f144586c.d(this.f144587a, hVar).e() < 0.001f;
    }

    public String toString() {
        String e10 = C17756a.e(this.f144587a);
        String d10 = C17762g.d(this.f144588b);
        return "ContentZoomFactor(baseZoom=" + e10 + ", userZoom=" + d10 + ")";
    }

    private a(long j10, float f10) {
        this.f144587a = j10;
        this.f144588b = f10;
    }
}
