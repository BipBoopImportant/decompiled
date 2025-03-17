package wK;

import c2.h;
import c2.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C5834E;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0016\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"LwK/R1;", "", "Lc2/h;", "width", "height", "Ls0/E;", "padding", "Lc2/v;", "fontSize", "lineHeight", "<init>", "(FFLs0/E;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "e", "()F", "b", "c", "Ls0/E;", "d", "()Ls0/E;", "J", "()J", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class R1 {

    /* renamed from: a  reason: collision with root package name */
    private final float f150043a;

    /* renamed from: b  reason: collision with root package name */
    private final float f150044b;

    /* renamed from: c  reason: collision with root package name */
    private final C5834E f150045c;

    /* renamed from: d  reason: collision with root package name */
    private final long f150046d;

    /* renamed from: e  reason: collision with root package name */
    private final long f150047e;

    public /* synthetic */ R1(float f10, float f11, C5834E e10, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, e10, j10, j11);
    }

    public final long a() {
        return this.f150046d;
    }

    public final float b() {
        return this.f150044b;
    }

    public final long c() {
        return this.f150047e;
    }

    public final C5834E d() {
        return this.f150045c;
    }

    public final float e() {
        return this.f150043a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R1)) {
            return false;
        }
        R1 r12 = (R1) obj;
        return h.D(this.f150043a, r12.f150043a) && h.D(this.f150044b, r12.f150044b) && C17542s.e(this.f150045c, r12.f150045c) && v.e(this.f150046d, r12.f150046d) && v.e(this.f150047e, r12.f150047e);
    }

    public int hashCode() {
        return (((((((h.E(this.f150043a) * 31) + h.E(this.f150044b)) * 31) + this.f150045c.hashCode()) * 31) + v.i(this.f150046d)) * 31) + v.i(this.f150047e);
    }

    public String toString() {
        String F10 = h.F(this.f150043a);
        String F11 = h.F(this.f150044b);
        C5834E e10 = this.f150045c;
        String j10 = v.j(this.f150046d);
        String j11 = v.j(this.f150047e);
        return "ComponentSizes(width=" + F10 + ", height=" + F11 + ", padding=" + e10 + ", fontSize=" + j10 + ", lineHeight=" + j11 + ")";
    }

    private R1(float f10, float f11, C5834E e10, long j10, long j11) {
        C17542s.j(e10, "padding");
        this.f150043a = f10;
        this.f150044b = f11;
        this.f150045c = e10;
        this.f150046d = j10;
        this.f150047e = j11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ R1(float r9, float r10, s0.C5834E r11, long r12, long r14, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 1
            if (r0 == 0) goto L_0x000b
            c2.h$a r0 = c2.h.f23031b
            float r0 = r0.c()
            goto L_0x000c
        L_0x000b:
            r0 = r9
        L_0x000c:
            r1 = r16 & 2
            if (r1 == 0) goto L_0x0017
            c2.h$a r1 = c2.h.f23031b
            float r1 = r1.c()
            goto L_0x0018
        L_0x0017:
            r1 = r10
        L_0x0018:
            r2 = r16 & 4
            if (r2 == 0) goto L_0x0024
            r2 = 3
            r3 = 0
            r4 = 0
            s0.E r2 = androidx.compose.foundation.layout.D.c(r4, r4, r2, r3)
            goto L_0x0025
        L_0x0024:
            r2 = r11
        L_0x0025:
            r3 = r16 & 8
            if (r3 == 0) goto L_0x0030
            c2.v$a r3 = c2.v.f23057b
            long r3 = r3.a()
            goto L_0x0031
        L_0x0030:
            r3 = r12
        L_0x0031:
            r5 = r16 & 16
            if (r5 == 0) goto L_0x003c
            c2.v$a r5 = c2.v.f23057b
            long r5 = r5.a()
            goto L_0x003d
        L_0x003c:
            r5 = r14
        L_0x003d:
            r7 = 0
            r9 = r8
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r15 = r5
            r17 = r7
            r9.<init>(r10, r11, r12, r13, r15, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.R1.<init>(float, float, s0.E, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
