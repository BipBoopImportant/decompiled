package N1;

import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U1.e;
import Y1.f;
import Y1.h;
import Y1.j;
import Y1.k;
import Y1.l;
import Y1.n;
import Y1.o;
import Y1.q;
import Y1.s;
import androidx.recyclerview.widget.RecyclerView;
import c2.v;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.network.models.UploadKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5728l0;
import p1.C5747v0;
import p1.g1;
import r1.g;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b'\b\u0007\u0018\u0000 `2\u00020\u0001:\u0001PB%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nB\u0002\b\u0016\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010+\u001a\u00020\r\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00101\u001a\u000200\u0012\b\b\u0002\u00103\u001a\u000202\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b\b\u00106J\u000f\u00107\u001a\u00020\u0002H\u0007¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0004H\u0007¢\u0006\u0004\b9\u0010:J\u001b\u0010<\u001a\u00020\u00002\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b<\u0010=J \u0002\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\r2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00105\u001a\u0004\u0018\u000104H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0004H\u0007¢\u0006\u0004\b@\u0010AJ\u0002\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\r2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u00105\u001a\u0004\u0018\u000104ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001a\u0010E\u001a\u00020D2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bE\u0010FJ\u0015\u0010G\u001a\u00020D2\u0006\u0010;\u001a\u00020\u0000¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\u00020D2\u0006\u0010;\u001a\u00020\u0000¢\u0006\u0004\bI\u0010HJ\u000f\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020JH\u0000¢\u0006\u0004\bM\u0010LJ\u000f\u0010N\u001a\u00020\u0017H\u0016¢\u0006\u0004\bN\u0010OR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u00108R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\bB\u0010S\u001a\u0004\bT\u0010:R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0013\u0010\\\u001a\u0004\u0018\u00010Y8F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0017\u0010\f\u001a\u00020\u000b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0011\u0010b\u001a\u00020_8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0017\u0010\u000e\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bc\u0010^R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bl\u0010OR\u0017\u0010\u0019\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bm\u0010^R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\br\u0010sR\u0017\u0010 \u001a\u00020\u000b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bt\u0010^R\u0013\u0010\"\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0013\u0010$\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0013\u0010&\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0017\u0010(\u001a\u00020'8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b{\u0010LR\u0017\u0010*\u001a\u00020)8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b|\u0010LR\u0017\u0010+\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b}\u0010^R\u0013\u0010-\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b~\u0010R\u0015\u0010/\u001a\u0004\u0018\u00010.8F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0018\u00103\u001a\u0002028Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0001\u0010LR\u0018\u00101\u001a\u0002008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0001\u0010LR\u0015\u00105\u001a\u0004\u0018\u0001048F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0001"}, d2 = {"LN1/Y;", "", "LN1/G;", "spanStyle", "LN1/y;", "paragraphStyle", "LN1/E;", "platformStyle", "<init>", "(LN1/G;LN1/y;LN1/E;)V", "(LN1/G;LN1/y;)V", "Lp1/v0;", "color", "Lc2/v;", "fontSize", "LS1/C;", "fontWeight", "LS1/x;", "fontStyle", "LS1/y;", "fontSynthesis", "LS1/m;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "LY1/a;", "baselineShift", "LY1/o;", "textGeometricTransform", "LU1/e;", "localeList", "background", "LY1/k;", "textDecoration", "Lp1/g1;", "shadow", "Lr1/g;", "drawStyle", "LY1/j;", "textAlign", "LY1/l;", "textDirection", "lineHeight", "LY1/q;", "textIndent", "LY1/h;", "lineHeightStyle", "LY1/f;", "lineBreak", "LY1/e;", "hyphens", "LY1/s;", "textMotion", "(JJLS1/C;LS1/x;LS1/y;LS1/m;Ljava/lang/String;JLY1/a;LY1/o;LU1/e;JLY1/k;Lp1/g1;Lr1/g;IIJLY1/q;LN1/E;LY1/h;IILY1/s;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "N", "()LN1/G;", "M", "()LN1/y;", "other", "J", "(LN1/Y;)LN1/Y;", "K", "(JJLS1/C;LS1/x;LS1/y;LS1/m;Ljava/lang/String;JLY1/a;LY1/o;LU1/e;JLY1/k;Lp1/g1;Lr1/g;IIJLY1/q;LY1/h;IILN1/E;LY1/s;)LN1/Y;", "I", "(LN1/y;)LN1/Y;", "b", "(JJLS1/C;LS1/x;LS1/y;LS1/m;Ljava/lang/String;JLY1/a;LY1/o;LU1/e;JLY1/k;Lp1/g1;Lr1/g;IIJLY1/q;LN1/E;LY1/h;IILY1/s;)LN1/Y;", "", "equals", "(Ljava/lang/Object;)Z", "G", "(LN1/Y;)Z", "F", "", "hashCode", "()I", "H", "toString", "()Ljava/lang/String;", "a", "LN1/G;", "y", "LN1/y;", "v", "c", "LN1/E;", "w", "()LN1/E;", "Lp1/l0;", "g", "()Lp1/l0;", "brush", "h", "()J", "", "d", "()F", "alpha", "l", "o", "()LS1/C;", "m", "()LS1/x;", "n", "()LS1/y;", "j", "()LS1/m;", "k", "q", "f", "()LY1/a;", "C", "()LY1/o;", "u", "()LU1/e;", "e", "A", "()LY1/k;", "x", "()Lp1/g1;", "i", "()Lr1/g;", "z", "B", "s", "D", "()LY1/q;", "t", "()LY1/h;", "p", "r", "E", "()LY1/s;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Y {

    /* renamed from: d  reason: collision with root package name */
    public static final a f9422d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final Y f9423e = new Y(0, 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (q) null, (E) null, (h) null, 0, 0, (s) null, 16777215, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final G f9424a;

    /* renamed from: b  reason: collision with root package name */
    private final C4689y f9425b;

    /* renamed from: c  reason: collision with root package name */
    private final E f9426c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LN1/Y$a;", "", "<init>", "()V", "LN1/Y;", "Default", "LN1/Y;", "a", "()LN1/Y;", "getDefault$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Y a() {
            return Y.f9423e;
        }

        private a() {
        }
    }

    public /* synthetic */ Y(long j10, long j11, C c10, C4830x xVar, C4831y yVar, C4820m mVar, String str, long j12, Y1.a aVar, o oVar, e eVar, long j13, k kVar, g1 g1Var, g gVar, int i10, int i11, long j14, q qVar, E e10, h hVar, int i12, int i13, s sVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, c10, xVar, yVar, mVar, str, j12, aVar, oVar, eVar, j13, kVar, g1Var, gVar, i10, i11, j14, qVar, e10, hVar, i12, i13, sVar);
    }

    public static /* synthetic */ Y L(Y y10, long j10, long j11, C c10, C4830x xVar, C4831y yVar, C4820m mVar, String str, long j12, Y1.a aVar, o oVar, e eVar, long j13, k kVar, g1 g1Var, g gVar, int i10, int i11, long j14, q qVar, h hVar, int i12, int i13, E e10, s sVar, int i14, Object obj) {
        int i15 = i14;
        return y10.K((i15 & 1) != 0 ? C5747v0.f27350b.i() : j10, (i15 & 2) != 0 ? v.f23057b.a() : j11, (i15 & 4) != 0 ? null : c10, (i15 & 8) != 0 ? null : xVar, (i15 & 16) != 0 ? null : yVar, (i15 & 32) != 0 ? null : mVar, (i15 & 64) != 0 ? null : str, (i15 & 128) != 0 ? v.f23057b.a() : j12, (i15 & 256) != 0 ? null : aVar, (i15 & 512) != 0 ? null : oVar, (i15 & 1024) != 0 ? null : eVar, (i15 & RecyclerView.n.FLAG_MOVED) != 0 ? C5747v0.f27350b.i() : j13, (i15 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : kVar, (i15 & 8192) != 0 ? null : g1Var, (i15 & 16384) != 0 ? null : gVar, (i15 & 32768) != 0 ? j.f14783b.g() : i10, (i15 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? l.f14797b.f() : i11, (i15 & 131072) != 0 ? v.f23057b.a() : j14, (i15 & 262144) != 0 ? null : qVar, (i15 & ImageMetadata.LENS_APERTURE) != 0 ? null : hVar, (i15 & ImageMetadata.SHADING_MODE) != 0 ? f.f14748b.b() : i12, (i15 & UploadKt.MAX_CHUNK_SIZE) != 0 ? Y1.e.f14743b.c() : i13, (i15 & 4194304) != 0 ? null : e10, (i15 & 8388608) != 0 ? null : sVar);
    }

    public static /* synthetic */ Y c(Y y10, long j10, long j11, C c10, C4830x xVar, C4831y yVar, C4820m mVar, String str, long j12, Y1.a aVar, o oVar, e eVar, long j13, k kVar, g1 g1Var, g gVar, int i10, int i11, long j14, q qVar, E e10, h hVar, int i12, int i13, s sVar, int i14, Object obj) {
        Y y11 = y10;
        int i15 = i14;
        return y10.b((i15 & 1) != 0 ? y11.f9424a.g() : j10, (i15 & 2) != 0 ? y11.f9424a.k() : j11, (i15 & 4) != 0 ? y11.f9424a.n() : c10, (i15 & 8) != 0 ? y11.f9424a.l() : xVar, (i15 & 16) != 0 ? y11.f9424a.m() : yVar, (i15 & 32) != 0 ? y11.f9424a.i() : mVar, (i15 & 64) != 0 ? y11.f9424a.j() : str, (i15 & 128) != 0 ? y11.f9424a.o() : j12, (i15 & 256) != 0 ? y11.f9424a.e() : aVar, (i15 & 512) != 0 ? y11.f9424a.u() : oVar, (i15 & 1024) != 0 ? y11.f9424a.p() : eVar, (i15 & RecyclerView.n.FLAG_MOVED) != 0 ? y11.f9424a.d() : j13, (i15 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? y11.f9424a.s() : kVar, (i15 & 8192) != 0 ? y11.f9424a.r() : g1Var, (i15 & 16384) != 0 ? y11.f9424a.h() : gVar, (i15 & 32768) != 0 ? y11.f9425b.h() : i10, (i15 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? y11.f9425b.i() : i11, (i15 & 131072) != 0 ? y11.f9425b.e() : j14, (i15 & 262144) != 0 ? y11.f9425b.j() : qVar, (i15 & ImageMetadata.LENS_APERTURE) != 0 ? y11.f9426c : e10, (i15 & ImageMetadata.SHADING_MODE) != 0 ? y11.f9425b.f() : hVar, (i15 & UploadKt.MAX_CHUNK_SIZE) != 0 ? y11.f9425b.d() : i12, (i15 & 4194304) != 0 ? y11.f9425b.c() : i13, (i15 & 8388608) != 0 ? y11.f9425b.k() : sVar);
    }

    public final k A() {
        return this.f9424a.s();
    }

    public final int B() {
        return this.f9425b.i();
    }

    public final o C() {
        return this.f9424a.u();
    }

    public final q D() {
        return this.f9425b.j();
    }

    public final s E() {
        return this.f9425b.k();
    }

    public final boolean F(Y y10) {
        return this == y10 || this.f9424a.w(y10.f9424a);
    }

    public final boolean G(Y y10) {
        return this == y10 || (C17542s.e(this.f9425b, y10.f9425b) && this.f9424a.v(y10.f9424a));
    }

    public final int H() {
        int x10 = ((this.f9424a.x() * 31) + this.f9425b.hashCode()) * 31;
        E e10 = this.f9426c;
        return x10 + (e10 != null ? e10.hashCode() : 0);
    }

    public final Y I(C4689y yVar) {
        return new Y(N(), M().l(yVar));
    }

    public final Y J(Y y10) {
        return (y10 == null || C17542s.e(y10, f9423e)) ? this : new Y(N().y(y10.N()), M().l(y10.M()));
    }

    public final Y K(long j10, long j11, C c10, C4830x xVar, C4831y yVar, C4820m mVar, String str, long j12, Y1.a aVar, o oVar, e eVar, long j13, k kVar, g1 g1Var, g gVar, int i10, int i11, long j14, q qVar, h hVar, int i12, int i13, E e10, s sVar) {
        C c11 = null;
        G b10 = H.b(this.f9424a, j10, (C5728l0) null, Float.NaN, j11, c10, xVar, yVar, mVar, str, j12, aVar, oVar, eVar, j13, kVar, g1Var, e10 != null ? e10.b() : null, gVar);
        C4689y yVar2 = this.f9425b;
        if (e10 != null) {
            c11 = e10.a();
        }
        C4689y a10 = C4690z.a(yVar2, i10, i11, j14, qVar, c11, hVar, i12, i13, sVar);
        return (this.f9424a == b10 && this.f9425b == a10) ? this : new Y(b10, a10);
    }

    public final C4689y M() {
        return this.f9425b;
    }

    public final G N() {
        return this.f9424a;
    }

    public final Y b(long j10, long j11, C c10, C4830x xVar, C4831y yVar, C4820m mVar, String str, long j12, Y1.a aVar, o oVar, e eVar, long j13, k kVar, g1 g1Var, g gVar, int i10, int i11, long j14, q qVar, E e10, h hVar, int i12, int i13, s sVar) {
        long j15 = j10;
        E e11 = e10;
        n t10 = C5747v0.q(j15, this.f9424a.g()) ? this.f9424a.t() : n.f14805a.b(j15);
        C c11 = null;
        G g10 = r5;
        G g11 = new G(t10, j11, c10, xVar, yVar, mVar, str, j12, aVar, oVar, eVar, j13, kVar, g1Var, e11 != null ? e10.b() : null, gVar, (DefaultConstructorMarker) null);
        if (e11 != null) {
            c11 = e10.a();
        }
        return new Y(g10, new C4689y(i10, i11, j14, qVar, c11, hVar, i12, i13, sVar, (DefaultConstructorMarker) null), e11);
    }

    public final float d() {
        return this.f9424a.c();
    }

    public final long e() {
        return this.f9424a.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y10 = (Y) obj;
        return C17542s.e(this.f9424a, y10.f9424a) && C17542s.e(this.f9425b, y10.f9425b) && C17542s.e(this.f9426c, y10.f9426c);
    }

    public final Y1.a f() {
        return this.f9424a.e();
    }

    public final C5728l0 g() {
        return this.f9424a.f();
    }

    public final long h() {
        return this.f9424a.g();
    }

    public int hashCode() {
        int hashCode = ((this.f9424a.hashCode() * 31) + this.f9425b.hashCode()) * 31;
        E e10 = this.f9426c;
        return hashCode + (e10 != null ? e10.hashCode() : 0);
    }

    public final g i() {
        return this.f9424a.h();
    }

    public final C4820m j() {
        return this.f9424a.i();
    }

    public final String k() {
        return this.f9424a.j();
    }

    public final long l() {
        return this.f9424a.k();
    }

    public final C4830x m() {
        return this.f9424a.l();
    }

    public final C4831y n() {
        return this.f9424a.m();
    }

    public final C o() {
        return this.f9424a.n();
    }

    public final int p() {
        return this.f9425b.c();
    }

    public final long q() {
        return this.f9424a.o();
    }

    public final int r() {
        return this.f9425b.d();
    }

    public final long s() {
        return this.f9425b.e();
    }

    public final h t() {
        return this.f9425b.f();
    }

    public String toString() {
        return "TextStyle(color=" + C5747v0.x(h()) + ", brush=" + g() + ", alpha=" + d() + ", fontSize=" + v.j(l()) + ", fontWeight=" + o() + ", fontStyle=" + m() + ", fontSynthesis=" + n() + ", fontFamily=" + j() + ", fontFeatureSettings=" + k() + ", letterSpacing=" + v.j(q()) + ", baselineShift=" + f() + ", textGeometricTransform=" + C() + ", localeList=" + u() + ", background=" + C5747v0.x(e()) + ", textDecoration=" + A() + ", shadow=" + x() + ", drawStyle=" + i() + ", textAlign=" + j.m(z()) + ", textDirection=" + l.l(B()) + ", lineHeight=" + v.j(s()) + ", textIndent=" + D() + ", platformStyle=" + this.f9426c + ", lineHeightStyle=" + t() + ", lineBreak=" + f.n(r()) + ", hyphens=" + Y1.e.i(p()) + ", textMotion=" + E() + ')';
    }

    public final e u() {
        return this.f9424a.p();
    }

    public final C4689y v() {
        return this.f9425b;
    }

    public final E w() {
        return this.f9426c;
    }

    public final g1 x() {
        return this.f9424a.r();
    }

    public final G y() {
        return this.f9424a;
    }

    public final int z() {
        return this.f9425b.h();
    }

    public Y(G g10, C4689y yVar, E e10) {
        this.f9424a = g10;
        this.f9425b = yVar;
        this.f9426c = e10;
    }

    public Y(G g10, C4689y yVar) {
        this(g10, yVar, Z.b(g10.q(), yVar.g()));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Y(long r31, long r33, S1.C r35, S1.C4830x r36, S1.C4831y r37, S1.C4820m r38, java.lang.String r39, long r40, Y1.a r42, Y1.o r43, U1.e r44, long r45, Y1.k r47, p1.g1 r48, r1.g r49, int r50, int r51, long r52, Y1.q r54, N1.E r55, Y1.h r56, int r57, int r58, Y1.s r59, int r60, kotlin.jvm.internal.DefaultConstructorMarker r61) {
        /*
            r30 = this;
            r0 = r60
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            p1.v0$a r1 = p1.C5747v0.f27350b
            long r1 = r1.i()
            goto L_0x000f
        L_0x000d:
            r1 = r31
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            c2.v$a r3 = c2.v.f23057b
            long r3 = r3.a()
            goto L_0x001c
        L_0x001a:
            r3 = r33
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r35
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r36
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r37
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r38
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r39
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            c2.v$a r11 = c2.v.f23057b
            long r11 = r11.a()
            goto L_0x0051
        L_0x004f:
            r11 = r40
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r42
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r43
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r44
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            p1.v0$a r6 = p1.C5747v0.f27350b
            long r16 = r6.i()
            goto L_0x0076
        L_0x0074:
            r16 = r45
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r47
        L_0x007e:
            r18 = r6
            r6 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0086
            r6 = 0
            goto L_0x0088
        L_0x0086:
            r6 = r48
        L_0x0088:
            r19 = r6
            r6 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0090
            r6 = 0
            goto L_0x0092
        L_0x0090:
            r6 = r49
        L_0x0092:
            r20 = 32768(0x8000, float:4.5918E-41)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00a0
            Y1.j$a r20 = Y1.j.f14783b
            int r20 = r20.g()
            goto L_0x00a2
        L_0x00a0:
            r20 = r50
        L_0x00a2:
            r21 = 65536(0x10000, float:9.18355E-41)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00af
            Y1.l$a r21 = Y1.l.f14797b
            int r21 = r21.f()
            goto L_0x00b1
        L_0x00af:
            r21 = r51
        L_0x00b1:
            r22 = 131072(0x20000, float:1.83671E-40)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00be
            c2.v$a r22 = c2.v.f23057b
            long r22 = r22.a()
            goto L_0x00c0
        L_0x00be:
            r22 = r52
        L_0x00c0:
            r24 = 262144(0x40000, float:3.67342E-40)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00c9
            r24 = 0
            goto L_0x00cb
        L_0x00c9:
            r24 = r54
        L_0x00cb:
            r25 = 524288(0x80000, float:7.34684E-40)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00d4
            r25 = 0
            goto L_0x00d6
        L_0x00d4:
            r25 = r55
        L_0x00d6:
            r26 = 1048576(0x100000, float:1.469368E-39)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00df
            r26 = 0
            goto L_0x00e1
        L_0x00df:
            r26 = r56
        L_0x00e1:
            r27 = 2097152(0x200000, float:2.938736E-39)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00ee
            Y1.f$a r27 = Y1.f.f14748b
            int r27 = r27.b()
            goto L_0x00f0
        L_0x00ee:
            r27 = r57
        L_0x00f0:
            r28 = 4194304(0x400000, float:5.877472E-39)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x00fd
            Y1.e$a r28 = Y1.e.f14743b
            int r28 = r28.c()
            goto L_0x00ff
        L_0x00fd:
            r28 = r58
        L_0x00ff:
            r29 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r29
            if (r0 == 0) goto L_0x0107
            r0 = 0
            goto L_0x0109
        L_0x0107:
            r0 = r59
        L_0x0109:
            r29 = 0
            r61 = r29
            r31 = r30
            r32 = r1
            r34 = r3
            r36 = r5
            r37 = r7
            r38 = r8
            r39 = r9
            r40 = r10
            r41 = r11
            r43 = r13
            r44 = r14
            r45 = r15
            r46 = r16
            r48 = r18
            r49 = r19
            r50 = r6
            r51 = r20
            r52 = r21
            r53 = r22
            r55 = r24
            r56 = r25
            r57 = r26
            r58 = r27
            r59 = r28
            r60 = r0
            r31.<init>(r32, r34, r36, r37, r38, r39, r40, r41, r43, r44, r45, r46, r48, r49, r50, r51, r52, r53, r55, r56, r57, r58, r59, r60, r61)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.Y.<init>(long, long, S1.C, S1.x, S1.y, S1.m, java.lang.String, long, Y1.a, Y1.o, U1.e, long, Y1.k, p1.g1, r1.g, int, int, long, Y1.q, N1.E, Y1.h, int, int, Y1.s, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private Y(long r26, long r28, S1.C r30, S1.C4830x r31, S1.C4831y r32, S1.C4820m r33, java.lang.String r34, long r35, Y1.a r37, Y1.o r38, U1.e r39, long r40, Y1.k r42, p1.g1 r43, r1.g r44, int r45, int r46, long r47, Y1.q r49, N1.E r50, Y1.h r51, int r52, int r53, Y1.s r54) {
        /*
            r25 = this;
            r0 = r50
            N1.G r15 = new N1.G
            r23 = 0
            if (r0 == 0) goto L_0x000f
            N1.D r1 = r50.b()
            r20 = r1
            goto L_0x0011
        L_0x000f:
            r20 = r23
        L_0x0011:
            r22 = 0
            r1 = r15
            r2 = r26
            r4 = r28
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r13 = r37
            r14 = r38
            r24 = r15
            r15 = r39
            r16 = r40
            r18 = r42
            r19 = r43
            r21 = r44
            r1.<init>((long) r2, (long) r4, (S1.C) r6, (S1.C4830x) r7, (S1.C4831y) r8, (S1.C4820m) r9, (java.lang.String) r10, (long) r11, (Y1.a) r13, (Y1.o) r14, (U1.e) r15, (long) r16, (Y1.k) r18, (p1.g1) r19, (N1.D) r20, (r1.g) r21, (kotlin.jvm.internal.DefaultConstructorMarker) r22)
            N1.y r1 = new N1.y
            if (r0 == 0) goto L_0x003f
            N1.C r23 = r50.a()
        L_0x003f:
            r2 = 0
            r26 = r1
            r27 = r45
            r28 = r46
            r29 = r47
            r31 = r49
            r32 = r23
            r33 = r51
            r34 = r52
            r35 = r53
            r36 = r54
            r37 = r2
            r26.<init>(r27, r28, r29, r31, r32, r33, r34, r35, r36, r37)
            r2 = r25
            r3 = r24
            r2.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.Y.<init>(long, long, S1.C, S1.x, S1.y, S1.m, java.lang.String, long, Y1.a, Y1.o, U1.e, long, Y1.k, p1.g1, r1.g, int, int, long, Y1.q, N1.E, Y1.h, int, int, Y1.s):void");
    }
}
