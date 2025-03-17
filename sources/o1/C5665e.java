package o1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\bJ-\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lo1/e;", "", "", "left", "top", "right", "bottom", "<init>", "(FFFF)V", "LXH/N;", "e", "g", "", "toString", "()Ljava/lang/String;", "a", "F", "b", "()F", "i", "(F)V", "d", "k", "c", "j", "h", "", "f", "()Z", "isEmpty", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: o1.e  reason: case insensitive filesystem */
public final class C5665e {

    /* renamed from: a  reason: collision with root package name */
    private float f26697a;

    /* renamed from: b  reason: collision with root package name */
    private float f26698b;

    /* renamed from: c  reason: collision with root package name */
    private float f26699c;

    /* renamed from: d  reason: collision with root package name */
    private float f26700d;

    public C5665e(float f10, float f11, float f12, float f13) {
        this.f26697a = f10;
        this.f26698b = f11;
        this.f26699c = f12;
        this.f26700d = f13;
    }

    public final float a() {
        return this.f26700d;
    }

    public final float b() {
        return this.f26697a;
    }

    public final float c() {
        return this.f26699c;
    }

    public final float d() {
        return this.f26698b;
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f26697a = Math.max(f10, this.f26697a);
        this.f26698b = Math.max(f11, this.f26698b);
        this.f26699c = Math.min(f12, this.f26699c);
        this.f26700d = Math.min(f13, this.f26700d);
    }

    public final boolean f() {
        return this.f26697a >= this.f26699c || this.f26698b >= this.f26700d;
    }

    public final void g(float f10, float f11, float f12, float f13) {
        this.f26697a = f10;
        this.f26698b = f11;
        this.f26699c = f12;
        this.f26700d = f13;
    }

    public final void h(float f10) {
        this.f26700d = f10;
    }

    public final void i(float f10) {
        this.f26697a = f10;
    }

    public final void j(float f10) {
        this.f26699c = f10;
    }

    public final void k(float f10) {
        this.f26698b = f10;
    }

    public String toString() {
        return "MutableRect(" + C5663c.a(this.f26697a, 1) + ", " + C5663c.a(this.f26698b, 1) + ", " + C5663c.a(this.f26699c, 1) + ", " + C5663c.a(this.f26700d, 1) + ')';
    }
}
