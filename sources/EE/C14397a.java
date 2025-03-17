package eE;

import androidx.work.C7032a;
import androidx.work.C7036e;
import androidx.work.C7037f;
import androidx.work.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b\u001e\u0010%R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010#R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b&\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"LeE/a;", "LeE/c;", "", "workName", "Landroidx/work/a;", "backOffPolicy", "", "backOffTimeInMillis", "Landroidx/work/e;", "constraints", "initialDelayInMillis", "Landroidx/work/f;", "inputData", "Landroidx/work/H;", "expeditedWorkPolicy", "<init>", "(Ljava/lang/String;Landroidx/work/a;JLandroidx/work/e;JLandroidx/work/f;Landroidx/work/H;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "e", "c", "Landroidx/work/a;", "()Landroidx/work/a;", "d", "J", "()J", "Landroidx/work/e;", "()Landroidx/work/e;", "f", "g", "Landroidx/work/f;", "()Landroidx/work/f;", "h", "Landroidx/work/H;", "a", "()Landroidx/work/H;", "workscheduler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eE.a  reason: case insensitive filesystem */
public final class C14397a implements C14399c {

    /* renamed from: b  reason: collision with root package name */
    private final String f126610b;

    /* renamed from: c  reason: collision with root package name */
    private final C7032a f126611c;

    /* renamed from: d  reason: collision with root package name */
    private final long f126612d;

    /* renamed from: e  reason: collision with root package name */
    private final C7036e f126613e;

    /* renamed from: f  reason: collision with root package name */
    private final long f126614f;

    /* renamed from: g  reason: collision with root package name */
    private final C7037f f126615g;

    /* renamed from: h  reason: collision with root package name */
    private final H f126616h;

    public C14397a(String str, C7032a aVar, long j10, C7036e eVar, long j11, C7037f fVar, H h10) {
        C17542s.j(str, "workName");
        C17542s.j(aVar, "backOffPolicy");
        C17542s.j(eVar, "constraints");
        C17542s.j(fVar, "inputData");
        this.f126610b = str;
        this.f126611c = aVar;
        this.f126612d = j10;
        this.f126613e = eVar;
        this.f126614f = j11;
        this.f126615g = fVar;
        this.f126616h = h10;
    }

    public H a() {
        return this.f126616h;
    }

    public C7032a b() {
        return this.f126611c;
    }

    public C7036e c() {
        return this.f126613e;
    }

    public long d() {
        return this.f126612d;
    }

    public String e() {
        return this.f126610b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14397a)) {
            return false;
        }
        C14397a aVar = (C14397a) obj;
        return C17542s.e(this.f126610b, aVar.f126610b) && this.f126611c == aVar.f126611c && this.f126612d == aVar.f126612d && C17542s.e(this.f126613e, aVar.f126613e) && this.f126614f == aVar.f126614f && C17542s.e(this.f126615g, aVar.f126615g) && this.f126616h == aVar.f126616h;
    }

    public C7037f f() {
        return this.f126615g;
    }

    public long g() {
        return this.f126614f;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f126610b.hashCode() * 31) + this.f126611c.hashCode()) * 31) + Long.hashCode(this.f126612d)) * 31) + this.f126613e.hashCode()) * 31) + Long.hashCode(this.f126614f)) * 31) + this.f126615g.hashCode()) * 31;
        H h10 = this.f126616h;
        return hashCode + (h10 == null ? 0 : h10.hashCode());
    }

    public String toString() {
        String str = this.f126610b;
        C7032a aVar = this.f126611c;
        long j10 = this.f126612d;
        C7036e eVar = this.f126613e;
        long j11 = this.f126614f;
        C7037f fVar = this.f126615g;
        H h10 = this.f126616h;
        return "OneTimeWorkParams(workName=" + str + ", backOffPolicy=" + aVar + ", backOffTimeInMillis=" + j10 + ", constraints=" + eVar + ", initialDelayInMillis=" + j11 + ", inputData=" + fVar + ", expeditedWorkPolicy=" + h10 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C14397a(java.lang.String r9, androidx.work.C7032a r10, long r11, androidx.work.C7036e r13, long r14, androidx.work.C7037f r16, androidx.work.H r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r8 = this;
            r0 = r18 & 2
            if (r0 == 0) goto L_0x000b
            eE.c$a r0 = eE.C14399c.f126626a
            androidx.work.a r0 = r0.a()
            goto L_0x000c
        L_0x000b:
            r0 = r10
        L_0x000c:
            r1 = r18 & 4
            if (r1 == 0) goto L_0x0013
            r1 = 10000(0x2710, double:4.9407E-320)
            goto L_0x0014
        L_0x0013:
            r1 = r11
        L_0x0014:
            r3 = r18 & 8
            if (r3 == 0) goto L_0x001f
            eE.c$a r3 = eE.C14399c.f126626a
            androidx.work.e r3 = r3.b()
            goto L_0x0020
        L_0x001f:
            r3 = r13
        L_0x0020:
            r4 = r18 & 16
            if (r4 == 0) goto L_0x0027
            r4 = 0
            goto L_0x0028
        L_0x0027:
            r4 = r14
        L_0x0028:
            r6 = r18 & 32
            if (r6 == 0) goto L_0x0033
            eE.c$a r6 = eE.C14399c.f126626a
            androidx.work.f r6 = r6.c()
            goto L_0x0035
        L_0x0033:
            r6 = r16
        L_0x0035:
            r7 = r18 & 64
            if (r7 == 0) goto L_0x003b
            r7 = 0
            goto L_0x003d
        L_0x003b:
            r7 = r17
        L_0x003d:
            r10 = r8
            r11 = r9
            r12 = r0
            r13 = r1
            r15 = r3
            r16 = r4
            r18 = r6
            r19 = r7
            r10.<init>(r11, r12, r13, r15, r16, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eE.C14397a.<init>(java.lang.String, androidx.work.a, long, androidx.work.e, long, androidx.work.f, androidx.work.H, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
