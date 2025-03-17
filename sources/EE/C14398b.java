package eE;

import androidx.work.C7032a;
import androidx.work.C7036e;
import androidx.work.C7037f;
import androidx.work.H;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b\u001c\u0010&R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b#\u0010)R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001f\u0010,R\u001a\u0010\r\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b*\u0010)R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010-\u001a\u0004\b'\u0010.R\u001c\u00104\u001a\u0004\u0018\u00010/8\u0016X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"LeE/b;", "LeE/c;", "", "workName", "Ljava/time/Duration;", "repeatInterval", "flexInterval", "Landroidx/work/a;", "backOffPolicy", "", "backOffTimeInMillis", "Landroidx/work/e;", "constraints", "initialDelayInMillis", "Landroidx/work/f;", "inputData", "<init>", "(Ljava/lang/String;Ljava/time/Duration;Ljava/time/Duration;Landroidx/work/a;JLandroidx/work/e;JLandroidx/work/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "e", "c", "Ljava/time/Duration;", "i", "()Ljava/time/Duration;", "d", "h", "Landroidx/work/a;", "()Landroidx/work/a;", "f", "J", "()J", "g", "Landroidx/work/e;", "()Landroidx/work/e;", "Landroidx/work/f;", "()Landroidx/work/f;", "Landroidx/work/H;", "j", "Landroidx/work/H;", "a", "()Landroidx/work/H;", "expeditedWorkPolicy", "workscheduler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eE.b  reason: case insensitive filesystem */
public final class C14398b implements C14399c {

    /* renamed from: b  reason: collision with root package name */
    private final String f126617b;

    /* renamed from: c  reason: collision with root package name */
    private final Duration f126618c;

    /* renamed from: d  reason: collision with root package name */
    private final Duration f126619d;

    /* renamed from: e  reason: collision with root package name */
    private final C7032a f126620e;

    /* renamed from: f  reason: collision with root package name */
    private final long f126621f;

    /* renamed from: g  reason: collision with root package name */
    private final C7036e f126622g;

    /* renamed from: h  reason: collision with root package name */
    private final long f126623h;

    /* renamed from: i  reason: collision with root package name */
    private final C7037f f126624i;

    /* renamed from: j  reason: collision with root package name */
    private final H f126625j;

    public C14398b(String str, Duration duration, Duration duration2, C7032a aVar, long j10, C7036e eVar, long j11, C7037f fVar) {
        C17542s.j(str, "workName");
        C17542s.j(duration, "repeatInterval");
        C17542s.j(duration2, "flexInterval");
        C17542s.j(aVar, "backOffPolicy");
        C17542s.j(eVar, "constraints");
        C17542s.j(fVar, "inputData");
        this.f126617b = str;
        this.f126618c = duration;
        this.f126619d = duration2;
        this.f126620e = aVar;
        this.f126621f = j10;
        this.f126622g = eVar;
        this.f126623h = j11;
        this.f126624i = fVar;
    }

    public H a() {
        return this.f126625j;
    }

    public C7032a b() {
        return this.f126620e;
    }

    public C7036e c() {
        return this.f126622g;
    }

    public long d() {
        return this.f126621f;
    }

    public String e() {
        return this.f126617b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14398b)) {
            return false;
        }
        C14398b bVar = (C14398b) obj;
        return C17542s.e(this.f126617b, bVar.f126617b) && C17542s.e(this.f126618c, bVar.f126618c) && C17542s.e(this.f126619d, bVar.f126619d) && this.f126620e == bVar.f126620e && this.f126621f == bVar.f126621f && C17542s.e(this.f126622g, bVar.f126622g) && this.f126623h == bVar.f126623h && C17542s.e(this.f126624i, bVar.f126624i);
    }

    public C7037f f() {
        return this.f126624i;
    }

    public long g() {
        return this.f126623h;
    }

    public final Duration h() {
        return this.f126619d;
    }

    public int hashCode() {
        return (((((((((((((this.f126617b.hashCode() * 31) + this.f126618c.hashCode()) * 31) + this.f126619d.hashCode()) * 31) + this.f126620e.hashCode()) * 31) + Long.hashCode(this.f126621f)) * 31) + this.f126622g.hashCode()) * 31) + Long.hashCode(this.f126623h)) * 31) + this.f126624i.hashCode();
    }

    public final Duration i() {
        return this.f126618c;
    }

    public String toString() {
        String str = this.f126617b;
        Duration duration = this.f126618c;
        Duration duration2 = this.f126619d;
        C7032a aVar = this.f126620e;
        long j10 = this.f126621f;
        C7036e eVar = this.f126622g;
        long j11 = this.f126623h;
        C7037f fVar = this.f126624i;
        return "PeriodicWorkParams(workName=" + str + ", repeatInterval=" + duration + ", flexInterval=" + duration2 + ", backOffPolicy=" + aVar + ", backOffTimeInMillis=" + j10 + ", constraints=" + eVar + ", initialDelayInMillis=" + j11 + ", inputData=" + fVar + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C14398b(java.lang.String r14, java.time.Duration r15, java.time.Duration r16, androidx.work.C7032a r17, long r18, androidx.work.C7036e r20, long r21, androidx.work.C7037f r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 8
            if (r1 == 0) goto L_0x000e
            eE.c$a r1 = eE.C14399c.f126626a
            androidx.work.a r1 = r1.a()
            r6 = r1
            goto L_0x0010
        L_0x000e:
            r6 = r17
        L_0x0010:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0018
            r1 = 10000(0x2710, double:4.9407E-320)
            r7 = r1
            goto L_0x001a
        L_0x0018:
            r7 = r18
        L_0x001a:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0026
            eE.c$a r1 = eE.C14399c.f126626a
            androidx.work.e r1 = r1.b()
            r9 = r1
            goto L_0x0028
        L_0x0026:
            r9 = r20
        L_0x0028:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0030
            r1 = 0
            r10 = r1
            goto L_0x0032
        L_0x0030:
            r10 = r21
        L_0x0032:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003e
            eE.c$a r0 = eE.C14399c.f126626a
            androidx.work.f r0 = r0.c()
            r12 = r0
            goto L_0x0040
        L_0x003e:
            r12 = r23
        L_0x0040:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r2.<init>(r3, r4, r5, r6, r7, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eE.C14398b.<init>(java.lang.String, java.time.Duration, java.time.Duration, androidx.work.a, long, androidx.work.e, long, androidx.work.f, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
