package B1;

import B1.c;
import D1.a;
import c2.y;
import c2.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5667g;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0003R\u001a\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u0012\u0004\b\u0014\u0010\u0003R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R(\u0010\u001e\u001a\u00020\u00068\u0000@\u0000X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001c\u0010\u001dR\"\u0010!\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u001d\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"LB1/d;", "", "<init>", "()V", "", "timeMillis", "Lo1/g;", "position", "LXH/N;", "a", "(JJ)V", "Lc2/y;", "b", "()J", "maximumVelocity", "c", "(J)J", "f", "LB1/c$a;", "LB1/c$a;", "getStrategy$annotations", "strategy", "LB1/c;", "LB1/c;", "xVelocityTracker", "yVelocityTracker", "d", "J", "g", "(J)V", "currentPointerPositionAccumulator", "e", "h", "lastMoveEventTimeStamp", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final c.a f5171a;

    /* renamed from: b  reason: collision with root package name */
    private final c f5172b;

    /* renamed from: c  reason: collision with root package name */
    private final c f5173c;

    /* renamed from: d  reason: collision with root package name */
    private long f5174d;

    /* renamed from: e  reason: collision with root package name */
    private long f5175e;

    public d() {
        c.a aVar = e.h() ? c.a.Impulse : c.a.Lsq2;
        this.f5171a = aVar;
        this.f5172b = new c(false, aVar, 1, (DefaultConstructorMarker) null);
        this.f5173c = new c(false, aVar, 1, (DefaultConstructorMarker) null);
        this.f5174d = C5667g.f26701b.c();
    }

    public final void a(long j10, long j11) {
        this.f5172b.a(j10, C5667g.m(j11));
        this.f5173c.a(j10, C5667g.n(j11));
    }

    public final long b() {
        return c(z.a(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    public final long c(long j10) {
        if (!(y.h(j10) > 0.0f && y.i(j10) > 0.0f)) {
            a.b("maximumVelocity should be a positive value. You specified=" + y.n(j10));
        }
        return z.a(this.f5172b.d(y.h(j10)), this.f5173c.d(y.i(j10)));
    }

    public final long d() {
        return this.f5174d;
    }

    public final long e() {
        return this.f5175e;
    }

    public final void f() {
        this.f5172b.e();
        this.f5173c.e();
        this.f5175e = 0;
    }

    public final void g(long j10) {
        this.f5174d = j10;
    }

    public final void h(long j10) {
        this.f5175e = j10;
    }
}
