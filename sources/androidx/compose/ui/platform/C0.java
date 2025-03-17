package androidx.compose.ui.platform;

import N1.D;
import N1.G;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U1.e;
import Y1.a;
import Y1.k;
import Y1.o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.g1;
import r1.g;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bA\b\u0002\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b8\u0010?\u001a\u0004\b@\u0010A\"\u0004\b/\u0010BR(\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b-\u0010\"\u001a\u0004\bC\u0010$\"\u0004\bD\u0010&R*\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\b'\u0010HR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR(\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bM\u0010\"\u001a\u0004\bU\u0010$\"\u0004\b!\u0010&R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010V\u001a\u0004\bW\u0010X\"\u0004\bO\u0010YR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\bI\u0010^\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006_"}, d2 = {"Landroidx/compose/ui/platform/C0;", "", "Lp1/v0;", "color", "Lc2/v;", "fontSize", "LS1/C;", "fontWeight", "LS1/x;", "fontStyle", "LS1/y;", "fontSynthesis", "LS1/m;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "LY1/a;", "baselineShift", "LY1/o;", "textGeometricTransform", "LU1/e;", "localeList", "background", "LY1/k;", "textDecoration", "Lp1/g1;", "shadow", "<init>", "(JJLS1/C;LS1/x;LS1/y;LS1/m;Ljava/lang/String;JLY1/a;LY1/o;LU1/e;JLY1/k;Lp1/g1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LN1/G;", "m", "()LN1/G;", "a", "J", "getColor-0d7_KjU", "()J", "c", "(J)V", "b", "getFontSize-XSAIIZE", "e", "LS1/C;", "getFontWeight", "()LS1/C;", "h", "(LS1/C;)V", "d", "LS1/x;", "getFontStyle-4Lr2A7w", "()LS1/x;", "f", "(LS1/x;)V", "LS1/y;", "getFontSynthesis-ZQGJjVo", "()LS1/y;", "g", "(LS1/y;)V", "LS1/m;", "getFontFamily", "()LS1/m;", "setFontFamily", "(LS1/m;)V", "Ljava/lang/String;", "getFontFeatureSettings", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "getLetterSpacing-XSAIIZE", "i", "LY1/a;", "getBaselineShift-5SSeXJ0", "()LY1/a;", "(LY1/a;)V", "j", "LY1/o;", "getTextGeometricTransform", "()LY1/o;", "l", "(LY1/o;)V", "k", "LU1/e;", "getLocaleList", "()LU1/e;", "setLocaleList", "(LU1/e;)V", "getBackground-0d7_KjU", "LY1/k;", "getTextDecoration", "()LY1/k;", "(LY1/k;)V", "n", "Lp1/g1;", "getShadow", "()Lp1/g1;", "(Lp1/g1;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class C0 {

    /* renamed from: a  reason: collision with root package name */
    private long f19157a;

    /* renamed from: b  reason: collision with root package name */
    private long f19158b;

    /* renamed from: c  reason: collision with root package name */
    private C f19159c;

    /* renamed from: d  reason: collision with root package name */
    private C4830x f19160d;

    /* renamed from: e  reason: collision with root package name */
    private C4831y f19161e;

    /* renamed from: f  reason: collision with root package name */
    private C4820m f19162f;

    /* renamed from: g  reason: collision with root package name */
    private String f19163g;

    /* renamed from: h  reason: collision with root package name */
    private long f19164h;

    /* renamed from: i  reason: collision with root package name */
    private a f19165i;

    /* renamed from: j  reason: collision with root package name */
    private o f19166j;

    /* renamed from: k  reason: collision with root package name */
    private e f19167k;

    /* renamed from: l  reason: collision with root package name */
    private long f19168l;

    /* renamed from: m  reason: collision with root package name */
    private k f19169m;

    /* renamed from: n  reason: collision with root package name */
    private g1 f19170n;

    public /* synthetic */ C0(long j10, long j11, C c10, C4830x xVar, C4831y yVar, C4820m mVar, String str, long j12, a aVar, o oVar, e eVar, long j13, k kVar, g1 g1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, c10, xVar, yVar, mVar, str, j12, aVar, oVar, eVar, j13, kVar, g1Var);
    }

    public final void a(long j10) {
        this.f19168l = j10;
    }

    public final void b(a aVar) {
        this.f19165i = aVar;
    }

    public final void c(long j10) {
        this.f19157a = j10;
    }

    public final void d(String str) {
        this.f19163g = str;
    }

    public final void e(long j10) {
        this.f19158b = j10;
    }

    public final void f(C4830x xVar) {
        this.f19160d = xVar;
    }

    public final void g(C4831y yVar) {
        this.f19161e = yVar;
    }

    public final void h(C c10) {
        this.f19159c = c10;
    }

    public final void i(long j10) {
        this.f19164h = j10;
    }

    public final void j(g1 g1Var) {
        this.f19170n = g1Var;
    }

    public final void k(k kVar) {
        this.f19169m = kVar;
    }

    public final void l(o oVar) {
        this.f19166j = oVar;
    }

    public final G m() {
        return new G(this.f19157a, this.f19158b, this.f19159c, this.f19160d, this.f19161e, this.f19162f, this.f19163g, this.f19164h, this.f19165i, this.f19166j, this.f19167k, this.f19168l, this.f19169m, this.f19170n, (D) null, (g) null, 49152, (DefaultConstructorMarker) null);
    }

    private C0(long j10, long j11, C c10, C4830x xVar, C4831y yVar, C4820m mVar, String str, long j12, a aVar, o oVar, e eVar, long j13, k kVar, g1 g1Var) {
        this.f19157a = j10;
        this.f19158b = j11;
        this.f19159c = c10;
        this.f19160d = xVar;
        this.f19161e = yVar;
        this.f19162f = mVar;
        this.f19163g = str;
        this.f19164h = j12;
        this.f19165i = aVar;
        this.f19166j = oVar;
        this.f19167k = eVar;
        this.f19168l = j13;
        this.f19169m = kVar;
        this.f19170n = g1Var;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C0(long r20, long r22, S1.C r24, S1.C4830x r25, S1.C4831y r26, S1.C4820m r27, java.lang.String r28, long r29, Y1.a r31, Y1.o r32, U1.e r33, long r34, Y1.k r36, p1.g1 r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            r19 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            p1.v0$a r1 = p1.C5747v0.f27350b
            long r1 = r1.i()
            goto L_0x000f
        L_0x000d:
            r1 = r20
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            c2.v$a r3 = c2.v.f23057b
            long r3 = r3.a()
            goto L_0x001c
        L_0x001a:
            r3 = r22
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r24
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r25
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r26
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r27
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r28
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            c2.v$a r11 = c2.v.f23057b
            long r11 = r11.a()
            goto L_0x0051
        L_0x004f:
            r11 = r29
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r31
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r32
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r33
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            p1.v0$a r6 = p1.C5747v0.f27350b
            long r16 = r6.i()
            goto L_0x0076
        L_0x0074:
            r16 = r34
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r36
        L_0x007e:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0084
            r0 = 0
            goto L_0x0086
        L_0x0084:
            r0 = r37
        L_0x0086:
            r18 = 0
            r39 = r18
            r20 = r19
            r21 = r1
            r23 = r3
            r25 = r5
            r26 = r7
            r27 = r8
            r28 = r9
            r29 = r10
            r30 = r11
            r32 = r13
            r33 = r14
            r34 = r15
            r35 = r16
            r37 = r6
            r38 = r0
            r20.<init>(r21, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r37, r38, r39)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C0.<init>(long, long, S1.C, S1.x, S1.y, S1.m, java.lang.String, long, Y1.a, Y1.o, U1.e, long, Y1.k, p1.g1, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
