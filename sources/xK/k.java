package XK;

import WK.C16762E;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b5\n\u0002\u0010!\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0019\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b%\u0010(R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b)\u0010.R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010.R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b2\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00105R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=R\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b!\u0010ER\u0016\u0010G\u001a\u0004\u0018\u00010\b8@X\u0004¢\u0006\u0006\u001a\u0004\b,\u00105R\u0016\u0010H\u001a\u0004\u0018\u00010\b8@X\u0004¢\u0006\u0006\u001a\u0004\b/\u00105R\u0016\u0010I\u001a\u0004\u0018\u00010\b8@X\u0004¢\u0006\u0006\u001a\u0004\b*\u00105¨\u0006J"}, d2 = {"LXK/k;", "", "LWK/E;", "canonicalPath", "", "isDirectory", "", "comment", "", "crc", "compressedSize", "size", "", "compressionMethod", "offset", "dosLastModifiedAtDate", "dosLastModifiedAtTime", "ntfsLastModifiedAtFiletime", "ntfsLastAccessedAtFiletime", "ntfsCreatedAtFiletime", "extendedLastModifiedAtSeconds", "extendedLastAccessedAtSeconds", "extendedCreatedAtSeconds", "<init>", "(LWK/E;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)LXK/k;", "LWK/E;", "b", "()LWK/E;", "Z", "k", "()Z", "c", "Ljava/lang/String;", "getComment", "()Ljava/lang/String;", "d", "J", "getCrc", "()J", "e", "f", "j", "g", "I", "()I", "h", "i", "getDosLastModifiedAtDate", "getDosLastModifiedAtTime", "Ljava/lang/Long;", "getNtfsLastModifiedAtFiletime", "()Ljava/lang/Long;", "l", "getNtfsLastAccessedAtFiletime", "m", "getNtfsCreatedAtFiletime", "n", "Ljava/lang/Integer;", "getExtendedLastModifiedAtSeconds", "()Ljava/lang/Integer;", "o", "getExtendedLastAccessedAtSeconds", "p", "getExtendedCreatedAtSeconds", "", "q", "Ljava/util/List;", "()Ljava/util/List;", "children", "lastAccessedAtMillis", "lastModifiedAtMillis", "createdAtMillis", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final C16762E f140301a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f140302b;

    /* renamed from: c  reason: collision with root package name */
    private final String f140303c;

    /* renamed from: d  reason: collision with root package name */
    private final long f140304d;

    /* renamed from: e  reason: collision with root package name */
    private final long f140305e;

    /* renamed from: f  reason: collision with root package name */
    private final long f140306f;

    /* renamed from: g  reason: collision with root package name */
    private final int f140307g;

    /* renamed from: h  reason: collision with root package name */
    private final long f140308h;

    /* renamed from: i  reason: collision with root package name */
    private final int f140309i;

    /* renamed from: j  reason: collision with root package name */
    private final int f140310j;

    /* renamed from: k  reason: collision with root package name */
    private final Long f140311k;

    /* renamed from: l  reason: collision with root package name */
    private final Long f140312l;

    /* renamed from: m  reason: collision with root package name */
    private final Long f140313m;

    /* renamed from: n  reason: collision with root package name */
    private final Integer f140314n;

    /* renamed from: o  reason: collision with root package name */
    private final Integer f140315o;

    /* renamed from: p  reason: collision with root package name */
    private final Integer f140316p;

    /* renamed from: q  reason: collision with root package name */
    private final List<C16762E> f140317q;

    public k(C16762E e10, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        C17542s.j(e10, "canonicalPath");
        C17542s.j(str, "comment");
        this.f140301a = e10;
        this.f140302b = z10;
        this.f140303c = str;
        this.f140304d = j10;
        this.f140305e = j11;
        this.f140306f = j12;
        this.f140307g = i10;
        this.f140308h = j13;
        this.f140309i = i11;
        this.f140310j = i12;
        this.f140311k = l10;
        this.f140312l = l11;
        this.f140313m = l12;
        this.f140314n = num;
        this.f140315o = num2;
        this.f140316p = num3;
        this.f140317q = new ArrayList();
    }

    public final k a(Integer num, Integer num2, Integer num3) {
        return new k(this.f140301a, this.f140302b, this.f140303c, this.f140304d, this.f140305e, this.f140306f, this.f140307g, this.f140308h, this.f140309i, this.f140310j, this.f140311k, this.f140312l, this.f140313m, num, num2, num3);
    }

    public final C16762E b() {
        return this.f140301a;
    }

    public final List<C16762E> c() {
        return this.f140317q;
    }

    public final long d() {
        return this.f140305e;
    }

    public final int e() {
        return this.f140307g;
    }

    public final Long f() {
        Long l10 = this.f140313m;
        if (l10 != null) {
            return Long.valueOf(p.g(l10.longValue()));
        }
        Integer num = this.f140316p;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long g() {
        Long l10 = this.f140312l;
        if (l10 != null) {
            return Long.valueOf(p.g(l10.longValue()));
        }
        Integer num = this.f140315o;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long h() {
        Long l10 = this.f140311k;
        if (l10 != null) {
            return Long.valueOf(p.g(l10.longValue()));
        }
        Integer num = this.f140314n;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        int i10 = this.f140310j;
        if (i10 != -1) {
            return p.f(this.f140309i, i10);
        }
        return null;
    }

    public final long i() {
        return this.f140308h;
    }

    public final long j() {
        return this.f140306f;
    }

    public final boolean k() {
        return this.f140302b;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ k(WK.C16762E r20, boolean r21, java.lang.String r22, long r23, long r25, long r27, int r29, long r30, int r32, int r33, java.lang.Long r34, java.lang.Long r35, java.lang.Long r36, java.lang.Integer r37, java.lang.Integer r38, java.lang.Integer r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r19 = this;
            r0 = r40
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r21
        L_0x000a:
            r2 = r0 & 4
            if (r2 == 0) goto L_0x0011
            java.lang.String r2 = ""
            goto L_0x0013
        L_0x0011:
            r2 = r22
        L_0x0013:
            r3 = r0 & 8
            r4 = -1
            if (r3 == 0) goto L_0x001b
            r6 = r4
            goto L_0x001d
        L_0x001b:
            r6 = r23
        L_0x001d:
            r3 = r0 & 16
            if (r3 == 0) goto L_0x0023
            r8 = r4
            goto L_0x0025
        L_0x0023:
            r8 = r25
        L_0x0025:
            r3 = r0 & 32
            if (r3 == 0) goto L_0x002b
            r10 = r4
            goto L_0x002d
        L_0x002b:
            r10 = r27
        L_0x002d:
            r3 = r0 & 64
            r12 = -1
            if (r3 == 0) goto L_0x0034
            r3 = r12
            goto L_0x0036
        L_0x0034:
            r3 = r29
        L_0x0036:
            r13 = r0 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r4 = r30
        L_0x003d:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0043
            r13 = r12
            goto L_0x0045
        L_0x0043:
            r13 = r32
        L_0x0045:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r12 = r33
        L_0x004c:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x0052
            r14 = 0
            goto L_0x0054
        L_0x0052:
            r14 = r34
        L_0x0054:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x005a
            r15 = 0
            goto L_0x005c
        L_0x005a:
            r15 = r35
        L_0x005c:
            r41 = r15
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0064
            r15 = 0
            goto L_0x0066
        L_0x0064:
            r15 = r36
        L_0x0066:
            r16 = r15
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x006e
            r15 = 0
            goto L_0x0070
        L_0x006e:
            r15 = r37
        L_0x0070:
            r17 = r15
            r15 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x0078
            r15 = 0
            goto L_0x007a
        L_0x0078:
            r15 = r38
        L_0x007a:
            r18 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r18
            if (r0 == 0) goto L_0x0083
            r0 = 0
            goto L_0x0085
        L_0x0083:
            r0 = r39
        L_0x0085:
            r21 = r19
            r22 = r20
            r23 = r1
            r24 = r2
            r25 = r6
            r27 = r8
            r29 = r10
            r31 = r3
            r32 = r4
            r34 = r13
            r35 = r12
            r36 = r14
            r37 = r41
            r38 = r16
            r39 = r17
            r40 = r15
            r41 = r0
            r21.<init>(r22, r23, r24, r25, r27, r29, r31, r32, r34, r35, r36, r37, r38, r39, r40, r41)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: XK.k.<init>(WK.E, boolean, java.lang.String, long, long, long, int, long, int, int, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
