package N1;

import Y1.e;
import Y1.f;
import Y1.h;
import Y1.j;
import Y1.l;
import Y1.q;
import Y1.s;
import c2.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018Jr\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010 R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010 R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b1\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b,\u0010 R\u001d\u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b(\u0010 R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b'\u00106\u001a\u0004\b7\u00108\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"LN1/y;", "", "LY1/j;", "textAlign", "LY1/l;", "textDirection", "Lc2/v;", "lineHeight", "LY1/q;", "textIndent", "LN1/C;", "platformStyle", "LY1/h;", "lineHeightStyle", "LY1/f;", "lineBreak", "LY1/e;", "hyphens", "LY1/s;", "textMotion", "<init>", "(IIJLY1/q;LN1/C;LY1/h;IILY1/s;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "l", "(LN1/y;)LN1/y;", "a", "(IIJLY1/q;LN1/C;LY1/h;IILY1/s;)LN1/y;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "h", "b", "i", "c", "J", "e", "()J", "d", "LY1/q;", "j", "()LY1/q;", "LN1/C;", "g", "()LN1/C;", "f", "LY1/h;", "()LY1/h;", "LY1/s;", "k", "()LY1/s;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: N1.y  reason: case insensitive filesystem */
public final class C4689y {

    /* renamed from: a  reason: collision with root package name */
    private final int f9507a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9508b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9509c;

    /* renamed from: d  reason: collision with root package name */
    private final q f9510d;

    /* renamed from: e  reason: collision with root package name */
    private final C f9511e;

    /* renamed from: f  reason: collision with root package name */
    private final h f9512f;

    /* renamed from: g  reason: collision with root package name */
    private final int f9513g;

    /* renamed from: h  reason: collision with root package name */
    private final int f9514h;

    /* renamed from: i  reason: collision with root package name */
    private final s f9515i;

    public /* synthetic */ C4689y(int i10, int i11, long j10, q qVar, C c10, h hVar, int i12, int i13, s sVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, j10, qVar, c10, hVar, i12, i13, sVar);
    }

    public static /* synthetic */ C4689y b(C4689y yVar, int i10, int i11, long j10, q qVar, C c10, h hVar, int i12, int i13, s sVar, int i14, Object obj) {
        C4689y yVar2 = yVar;
        int i15 = i14;
        return yVar.a((i15 & 1) != 0 ? yVar2.f9507a : i10, (i15 & 2) != 0 ? yVar2.f9508b : i11, (i15 & 4) != 0 ? yVar2.f9509c : j10, (i15 & 8) != 0 ? yVar2.f9510d : qVar, (i15 & 16) != 0 ? yVar2.f9511e : c10, (i15 & 32) != 0 ? yVar2.f9512f : hVar, (i15 & 64) != 0 ? yVar2.f9513g : i12, (i15 & 128) != 0 ? yVar2.f9514h : i13, (i15 & 256) != 0 ? yVar2.f9515i : sVar);
    }

    public final C4689y a(int i10, int i11, long j10, q qVar, C c10, h hVar, int i12, int i13, s sVar) {
        return new C4689y(i10, i11, j10, qVar, c10, hVar, i12, i13, sVar, (DefaultConstructorMarker) null);
    }

    public final int c() {
        return this.f9514h;
    }

    public final int d() {
        return this.f9513g;
    }

    public final long e() {
        return this.f9509c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4689y)) {
            return false;
        }
        C4689y yVar = (C4689y) obj;
        return j.k(this.f9507a, yVar.f9507a) && l.j(this.f9508b, yVar.f9508b) && v.e(this.f9509c, yVar.f9509c) && C17542s.e(this.f9510d, yVar.f9510d) && C17542s.e(this.f9511e, yVar.f9511e) && C17542s.e(this.f9512f, yVar.f9512f) && f.i(this.f9513g, yVar.f9513g) && e.g(this.f9514h, yVar.f9514h) && C17542s.e(this.f9515i, yVar.f9515i);
    }

    public final h f() {
        return this.f9512f;
    }

    public final C g() {
        return this.f9511e;
    }

    public final int h() {
        return this.f9507a;
    }

    public int hashCode() {
        int l10 = ((((j.l(this.f9507a) * 31) + l.k(this.f9508b)) * 31) + v.i(this.f9509c)) * 31;
        q qVar = this.f9510d;
        int i10 = 0;
        int hashCode = (l10 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        C c10 = this.f9511e;
        int hashCode2 = (hashCode + (c10 != null ? c10.hashCode() : 0)) * 31;
        h hVar = this.f9512f;
        int hashCode3 = (((((hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31) + f.m(this.f9513g)) * 31) + e.h(this.f9514h)) * 31;
        s sVar = this.f9515i;
        if (sVar != null) {
            i10 = sVar.hashCode();
        }
        return hashCode3 + i10;
    }

    public final int i() {
        return this.f9508b;
    }

    public final q j() {
        return this.f9510d;
    }

    public final s k() {
        return this.f9515i;
    }

    public final C4689y l(C4689y yVar) {
        if (yVar == null) {
            return this;
        }
        return C4690z.a(this, yVar.f9507a, yVar.f9508b, yVar.f9509c, yVar.f9510d, yVar.f9511e, yVar.f9512f, yVar.f9513g, yVar.f9514h, yVar.f9515i);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + j.m(this.f9507a) + ", textDirection=" + l.l(this.f9508b) + ", lineHeight=" + v.j(this.f9509c) + ", textIndent=" + this.f9510d + ", platformStyle=" + this.f9511e + ", lineHeightStyle=" + this.f9512f + ", lineBreak=" + f.n(this.f9513g) + ", hyphens=" + e.i(this.f9514h) + ", textMotion=" + this.f9515i + ')';
    }

    private C4689y(int i10, int i11, long j10, q qVar, C c10, h hVar, int i12, int i13, s sVar) {
        this.f9507a = i10;
        this.f9508b = i11;
        this.f9509c = j10;
        this.f9510d = qVar;
        this.f9511e = c10;
        this.f9512f = hVar;
        this.f9513g = i12;
        this.f9514h = i13;
        this.f9515i = sVar;
        if (!v.e(j10, v.f23057b.a()) && v.h(j10) < 0.0f) {
            throw new IllegalStateException(("lineHeight can't be negative (" + v.h(j10) + ')').toString());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C4689y(int r12, int r13, long r14, Y1.q r16, N1.C r17, Y1.h r18, int r19, int r20, Y1.s r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            Y1.j$a r1 = Y1.j.f14783b
            int r1 = r1.g()
            goto L_0x000e
        L_0x000d:
            r1 = r12
        L_0x000e:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0019
            Y1.l$a r2 = Y1.l.f14797b
            int r2 = r2.f()
            goto L_0x001a
        L_0x0019:
            r2 = r13
        L_0x001a:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0025
            c2.v$a r3 = c2.v.f23057b
            long r3 = r3.a()
            goto L_0x0026
        L_0x0025:
            r3 = r14
        L_0x0026:
            r5 = r0 & 8
            r6 = 0
            if (r5 == 0) goto L_0x002d
            r5 = r6
            goto L_0x002f
        L_0x002d:
            r5 = r16
        L_0x002f:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0035
            r7 = r6
            goto L_0x0037
        L_0x0035:
            r7 = r17
        L_0x0037:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x003d
            r8 = r6
            goto L_0x003f
        L_0x003d:
            r8 = r18
        L_0x003f:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x004a
            Y1.f$a r9 = Y1.f.f14748b
            int r9 = r9.b()
            goto L_0x004c
        L_0x004a:
            r9 = r19
        L_0x004c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0057
            Y1.e$a r10 = Y1.e.f14743b
            int r10 = r10.c()
            goto L_0x0059
        L_0x0057:
            r10 = r20
        L_0x0059:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r6 = r21
        L_0x0060:
            r0 = 0
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r3
            r17 = r5
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r6
            r23 = r0
            r12.<init>(r13, r14, r15, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.C4689y.<init>(int, int, long, Y1.q, N1.C, Y1.h, int, int, Y1.s, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
