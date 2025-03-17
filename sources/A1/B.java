package A1;

import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5667g;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014Bw\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJz\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b+\u0010*R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b5\u0010*R\u001d\u0010\r\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010*R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b8\u00100R\u001d\u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u00109\u001a\u0004\b:\u0010;R\u001d\u0010\u0012\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b<\u0010*R$\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b7\u0010=\u0012\u0004\b>\u0010\u001cR(\u0010\u0018\u001a\u00020\u00068\u0000@\u0000X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b8\u0010(\u001a\u0004\b6\u0010*\"\u0004\b@\u0010AR*\u0010H\u001a\u00020B2\u0006\u0010C\u001a\u00020B8\u0006@BX\u000e¢\u0006\u0012\n\u0004\b<\u0010D\u0012\u0004\bG\u0010\u001c\u001a\u0004\bE\u0010FR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158GX\u0004¢\u0006\f\u0012\u0004\bJ\u0010\u001c\u001a\u0004\b1\u0010IR\u0017\u0010M\u001a\u00020\b8F¢\u0006\f\u0012\u0004\bL\u0010\u001c\u001a\u0004\bK\u00100\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"LA1/B;", "", "LA1/A;", "id", "", "uptimeMillis", "Lo1/g;", "position", "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "isInitiallyConsumed", "LA1/P;", "type", "scrollDelta", "<init>", "(JJJZFJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "LA1/f;", "historical", "originalEventPosition", "(JJJZFJJZZILjava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "LXH/N;", "a", "()V", "currentTime", "currentPosition", "currentPressed", "previousTime", "b", "(JJJZJJZILjava/util/List;J)LA1/B;", "d", "(JJJZFJJZILjava/util/List;J)LA1/B;", "", "toString", "()Ljava/lang/String;", "J", "f", "()J", "o", "c", "h", "Z", "i", "()Z", "e", "F", "j", "()F", "getPreviousUptimeMillis", "g", "k", "l", "I", "n", "()I", "m", "Ljava/util/List;", "get_historical$annotations", "_historical", "setOriginalEventPosition-k-4lQ0M$ui_release", "(J)V", "LA1/e;", "<set-?>", "LA1/e;", "getConsumed", "()LA1/e;", "getConsumed$annotations", "consumed", "()Ljava/util/List;", "getHistorical$annotations", "p", "isConsumed$annotations", "isConsumed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class B {

    /* renamed from: a  reason: collision with root package name */
    private final long f4306a;

    /* renamed from: b  reason: collision with root package name */
    private final long f4307b;

    /* renamed from: c  reason: collision with root package name */
    private final long f4308c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f4309d;

    /* renamed from: e  reason: collision with root package name */
    private final float f4310e;

    /* renamed from: f  reason: collision with root package name */
    private final long f4311f;

    /* renamed from: g  reason: collision with root package name */
    private final long f4312g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f4313h;

    /* renamed from: i  reason: collision with root package name */
    private final int f4314i;

    /* renamed from: j  reason: collision with root package name */
    private final long f4315j;

    /* renamed from: k  reason: collision with root package name */
    private List<C4339f> f4316k;

    /* renamed from: l  reason: collision with root package name */
    private long f4317l;

    /* renamed from: m  reason: collision with root package name */
    private C4338e f4318m;

    public /* synthetic */ B(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15);
    }

    public static /* synthetic */ B c(B b10, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List list, long j15, int i11, Object obj) {
        B b11 = b10;
        int i12 = i11;
        return b10.b((i12 & 1) != 0 ? b11.f4306a : j10, (i12 & 2) != 0 ? b11.f4307b : j11, (i12 & 4) != 0 ? b11.f4308c : j12, (i12 & 8) != 0 ? b11.f4309d : z10, (i12 & 16) != 0 ? b11.f4311f : j13, (i12 & 32) != 0 ? b11.f4312g : j14, (i12 & 64) != 0 ? b11.f4313h : z11, (i12 & 128) != 0 ? b11.f4314i : i10, list, (i12 & 512) != 0 ? b11.f4315j : j15);
    }

    public final void a() {
        this.f4318m.c(true);
        this.f4318m.d(true);
    }

    public final B b(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List<C4339f> list, long j15) {
        return d(j10, j11, j12, z10, this.f4310e, j13, j14, z11, i10, list, j15);
    }

    public final B d(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, List<C4339f> list, long j15) {
        long j16 = j10;
        B b10 = r1;
        B b11 = new B(j10, j11, j12, z10, f10, j13, j14, z11, false, i10, list, j15, this.f4317l, (DefaultConstructorMarker) null);
        B b12 = b10;
        b12.f4318m = this.f4318m;
        return b12;
    }

    public final List<C4339f> e() {
        List<C4339f> list = this.f4316k;
        return list == null ? C16877v.n() : list;
    }

    public final long f() {
        return this.f4306a;
    }

    public final long g() {
        return this.f4317l;
    }

    public final long h() {
        return this.f4308c;
    }

    public final boolean i() {
        return this.f4309d;
    }

    public final float j() {
        return this.f4310e;
    }

    public final long k() {
        return this.f4312g;
    }

    public final boolean l() {
        return this.f4313h;
    }

    public final long m() {
        return this.f4315j;
    }

    public final int n() {
        return this.f4314i;
    }

    public final long o() {
        return this.f4307b;
    }

    public final boolean p() {
        return this.f4318m.a() || this.f4318m.b();
    }

    public String toString() {
        return "PointerInputChange(id=" + A.f(this.f4306a) + ", uptimeMillis=" + this.f4307b + ", position=" + C5667g.t(this.f4308c) + ", pressed=" + this.f4309d + ", pressure=" + this.f4310e + ", previousUptimeMillis=" + this.f4311f + ", previousPosition=" + C5667g.t(this.f4312g) + ", previousPressed=" + this.f4313h + ", isConsumed=" + p() + ", type=" + P.i(this.f4314i) + ", historical=" + e() + ",scrollDelta=" + C5667g.t(this.f4315j) + ')';
    }

    public /* synthetic */ B(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, (List<C4339f>) list, j15, j16);
    }

    private B(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.f4306a = j10;
        this.f4307b = j11;
        this.f4308c = j12;
        this.f4309d = z10;
        this.f4310e = f10;
        this.f4311f = j13;
        this.f4312g = j14;
        this.f4313h = z11;
        this.f4314i = i10;
        this.f4315j = j15;
        this.f4317l = C5667g.f26701b.c();
        boolean z13 = z12;
        this.f4318m = new C4338e(z13, z13);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ B(long r22, long r24, long r26, boolean r28, float r29, long r30, long r32, boolean r34, boolean r35, int r36, long r37, int r39, kotlin.jvm.internal.DefaultConstructorMarker r40) {
        /*
            r21 = this;
            r0 = r39
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x000f
            A1.P$a r1 = A1.P.f4356a
            int r1 = r1.d()
            r17 = r1
            goto L_0x0011
        L_0x000f:
            r17 = r36
        L_0x0011:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x001e
            o1.g$a r0 = o1.C5667g.f26701b
            long r0 = r0.c()
            r18 = r0
            goto L_0x0020
        L_0x001e:
            r18 = r37
        L_0x0020:
            r20 = 0
            r2 = r21
            r3 = r22
            r5 = r24
            r7 = r26
            r9 = r28
            r10 = r29
            r11 = r30
            r13 = r32
            r15 = r34
            r16 = r35
            r2.<init>(r3, r5, r7, r9, r10, r11, r13, r15, r16, r17, r18, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.B.<init>(long, long, long, boolean, float, long, long, boolean, boolean, int, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private B(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List<C4339f> list, long j15, long j16) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15, (DefaultConstructorMarker) null);
        this.f4316k = list;
        this.f4317l = j16;
    }
}
