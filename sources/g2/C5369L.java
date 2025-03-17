package g2;

import E1.C4469b;
import E1.H;
import E1.a0;
import HJ.C15854t;
import N1.E;
import N1.Y;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.h;
import Y1.k;
import Y1.o;
import Y1.q;
import Y1.s;
import android.util.Log;
import c2.C5267b;
import c2.t;
import c2.v;
import c2.w;
import j0.C5456l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m2.C5574b;
import m2.j;
import n0.C5603i;
import nI.C17642l;
import nI.p;
import o1.C5668h;
import o1.C5673m;
import p1.C5747v0;
import p1.C5749w0;
import p1.C5751x0;
import p1.V0;
import p1.g1;
import p2.e;
import p2.f;
import p2.l;
import q2.b;
import r1.g;
import s0.C5857c;
import tI.C17978n;

@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JO\u0010\u0013\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\t0\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!J&\u0010&\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010%\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'J3\u0010,\u001a\u00020+2\"\u0010*\u001a\u001e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0(j\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"`)H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00182\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0018H\u0016¢\u0006\u0004\b4\u00105J>\u0010?\u001a\u00020>2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u0010=\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0018H\u0000¢\u0006\u0004\bA\u00105J\u001a\u0010B\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0004ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\u0018*\u00020D2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0018H\u0016¢\u0006\u0004\bG\u00105J\u001b\u0010K\u001a\u00020\u0018*\u00020H2\u0006\u0010J\u001a\u00020IH\u0007¢\u0006\u0004\bK\u0010LJ\u0019\u0010N\u001a\u00020\u0018*\u00020M2\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0018H\u0007¢\u0006\u0004\bP\u0010QJ\u0015\u0010R\u001a\u00020\u00182\u0006\u00109\u001a\u000208¢\u0006\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010TR$\u0010Z\u001a\u0004\u0018\u0001008\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bG\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u00103R\u001a\u0010_\u001a\u00020[8\u0004X\u0004¢\u0006\f\n\u0004\b2\u0010\\\u001a\u0004\b]\u0010^R&\u0010e\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020a0`8\u0004X\u0004¢\u0006\f\n\u0004\bB\u0010b\u001a\u0004\bc\u0010dR&\u0010f\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150`8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010bR&\u0010i\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020g0`8\u0004X\u0004¢\u0006\f\n\u0004\b\u0019\u0010b\u001a\u0004\bh\u0010dR\u001a\u0010n\u001a\u00020j8\u0004X\u0004¢\u0006\f\n\u0004\bP\u0010k\u001a\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010oR\u0014\u0010q\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010oR\"\u0010J\u001a\u00020I8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR&\u0010|\u001a\u0012\u0012\u0004\u0012\u00020x0wj\b\u0012\u0004\u0012\u00020x`y8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0011\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0013\u0010\u0001\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0001\u0010~\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0001"}, d2 = {"Lg2/L;", "Lq2/b$b;", "Lg2/y;", "Lc2/d;", "density", "<init>", "(Lc2/d;)V", "Lp2/e$b;", "dimensionBehaviour", "", "dimension", "matchConstraintDefaultDimension", "measureStrategy", "", "otherDimensionResolved", "currentDimensionResolved", "rootMaxConstraint", "", "outConstraints", "v", "(Lp2/e$b;IIIZZI[I)Z", "", "Lq2/b$a;", "measure", "LXH/N;", "f", "([Ljava/lang/Integer;Lq2/b$a;)V", "Lp2/e;", "constraintWidget", "Lc2/b;", "constraints", "Lj0/l;", "u", "(Lp2/e;J)J", "", "str", "Lp1/v0;", "defaultColor", "j", "(Ljava/lang/String;J)J", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "params", "LN1/Y;", "t", "(Ljava/util/HashMap;)LN1/Y;", "a", "(Lp2/e;Lq2/b$a;)V", "Lg2/J;", "layoutReceiver", "c", "(Lg2/J;)V", "e", "()V", "Lc2/t;", "layoutDirection", "Lg2/q;", "constraintSet", "", "LE1/H;", "measurables", "optimizationLevel", "Lc2/r;", "y", "(JLc2/t;Lg2/q;Ljava/util/List;I)J", "z", "d", "(J)V", "LE1/a0$a;", "x", "(LE1/a0$a;Ljava/util/List;)V", "b", "Ls0/c;", "", "forcedScaleFactor", "i", "(Ls0/c;FLU0/m;I)V", "Lr1/f;", "h", "(Lr1/f;F)V", "g", "(LU0/m;I)V", "w", "(Lg2/q;)V", "Ljava/lang/String;", "computedLayoutResult", "Lg2/J;", "p", "()Lg2/J;", "setLayoutInformationReceiver", "layoutInformationReceiver", "Lp2/f;", "Lp2/f;", "r", "()Lp2/f;", "root", "", "LE1/a0;", "Ljava/util/Map;", "q", "()Ljava/util/Map;", "placeables", "lastMeasures", "Lm2/j;", "m", "frameCache", "Lg2/X;", "Lg2/X;", "s", "()Lg2/X;", "state", "[I", "widthConstraintsHolder", "heightConstraintsHolder", "F", "l", "()F", "setForcedScaleFactor", "(F)V", "Ljava/util/ArrayList;", "Lm2/b$a;", "Lkotlin/collections/ArrayList;", "k", "Ljava/util/ArrayList;", "designElements", "o", "()I", "layoutCurrentWidth", "n", "layoutCurrentHeight", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g2.L  reason: case insensitive filesystem */
public class C5369L implements b.C0446b, C5401y {

    /* renamed from: a  reason: collision with root package name */
    private String f23513a = "";

    /* renamed from: b  reason: collision with root package name */
    private C5367J f23514b;

    /* renamed from: c  reason: collision with root package name */
    private final f f23515c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<H, a0> f23516d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Integer[]> f23517e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<H, j> f23518f;

    /* renamed from: g  reason: collision with root package name */
    private final X f23519g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f23520h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f23521i;

    /* renamed from: j  reason: collision with root package name */
    private float f23522j;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<C5574b.a> f23523k;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g2.L$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23524a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                p2.e$b[] r0 = p2.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p2.e$b r1 = p2.e.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                p2.e$b r1 = p2.e.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                p2.e$b r1 = p2.e.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                p2.e$b r1 = p2.e.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f23524a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g2.C5369L.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g2.L$b */
    static final class b extends C17544u implements C17642l<String, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f23525c = new b();

        b() {
            super(1);
        }

        public final void a(String str) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g2.L$c */
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5369L f23526c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f23527d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5369L l10, int i10) {
            super(2);
            this.f23526c = l10;
            this.f23527d = i10;
        }

        public final void a(C4889m mVar, int i10) {
            this.f23526c.g(mVar, M0.a(this.f23527d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/f;", "LXH/N;", "a", "(Lr1/f;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g2.L$d */
    static final class d extends C17544u implements C17642l<r1.f, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5369L f23528c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f23529d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C5369L l10, float f10) {
            super(1);
            this.f23528c = l10;
            this.f23529d = f10;
        }

        public final void a(r1.f fVar) {
            this.f23528c.h(fVar, this.f23529d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r1.f) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g2.L$e */
    static final class e extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5369L f23530c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5857c f23531d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f23532e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f23533f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C5369L l10, C5857c cVar, float f10, int i10) {
            super(2);
            this.f23530c = l10;
            this.f23531d = cVar;
            this.f23532e = f10;
            this.f23533f = i10;
        }

        public final void a(C4889m mVar, int i10) {
            this.f23530c.i(this.f23531d, this.f23532e, mVar, M0.a(this.f23533f | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public C5369L(c2.d dVar) {
        f fVar = new f(0, 0);
        fVar.b2(this);
        this.f23515c = fVar;
        this.f23516d = new LinkedHashMap();
        this.f23517e = new LinkedHashMap();
        this.f23518f = new LinkedHashMap();
        this.f23519g = new X(dVar);
        this.f23520h = new int[2];
        this.f23521i = new int[2];
        this.f23522j = Float.NaN;
        this.f23523k = new ArrayList<>();
    }

    private final void f(Integer[] numArr, b.a aVar) {
        numArr[0] = Integer.valueOf(aVar.f27767e);
        numArr[1] = Integer.valueOf(aVar.f27768f);
        numArr[2] = Integer.valueOf(aVar.f27769g);
    }

    private final long j(String str, long j10) {
        if (str != null && C15854t.e1(str, '#', false, 2, (Object) null)) {
            String substring = str.substring(1);
            C17542s.i(substring, "this as java.lang.String).substring(startIndex)");
            if (substring.length() == 6) {
                substring = "FF" + substring;
            }
            try {
                return C5751x0.b((int) Long.parseLong(substring, 16));
            } catch (Exception unused) {
            }
        }
        return j10;
    }

    static /* synthetic */ long k(C5369L l10, String str, long j10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                j10 = C5747v0.f27350b.a();
            }
            return l10.j(str, j10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getColor-wrIjXm8");
    }

    private final Y t(HashMap<String, String> hashMap) {
        HashMap<String, String> hashMap2 = hashMap;
        String str = hashMap2.get("size");
        long a10 = v.f23057b.a();
        if (str != null) {
            a10 = w.h(Float.parseFloat(str));
        }
        return new Y(k(this, hashMap2.get("color"), 0, 2, (Object) null), a10, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (U1.e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (q) null, (E) null, (h) null, 0, 0, (s) null, 16777212, (DefaultConstructorMarker) null);
    }

    private final long u(p2.e eVar, long j10) {
        Object s10 = eVar.s();
        String str = eVar.f27468o;
        int i10 = 0;
        if (eVar instanceof l) {
            int i11 = C5267b.j(j10) ? 1073741824 : C5267b.h(j10) ? Integer.MIN_VALUE : 0;
            if (C5267b.i(j10)) {
                i10 = 1073741824;
            } else if (C5267b.g(j10)) {
                i10 = Integer.MIN_VALUE;
            }
            l lVar = (l) eVar;
            lVar.G1(i11, C5267b.l(j10), i10, C5267b.k(j10));
            return C5456l.b(lVar.B1(), lVar.A1());
        } else if (s10 instanceof H) {
            a0 i02 = ((H) s10).i0(j10);
            this.f23516d.put(s10, i02);
            return C5456l.b(i02.E0(), i02.z0());
        } else {
            Log.w("CCL", "Nothing to measure for widget: " + str);
            return C5456l.b(0, 0);
        }
    }

    private final boolean v(e.b bVar, int i10, int i11, int i12, boolean z10, boolean z11, int i13, int[] iArr) {
        int i14 = a.f23524a[bVar.ordinal()];
        if (i14 == 1) {
            iArr[0] = i10;
            iArr[1] = i10;
        } else if (i14 == 2) {
            iArr[0] = 0;
            iArr[1] = i13;
            return true;
        } else if (i14 == 3) {
            if (C5388l.f23730a) {
                Log.d("CCL", "Measure strategy " + i12);
                Log.d("CCL", "DW " + i11);
                Log.d("CCL", "ODR " + z10);
                Log.d("CCL", "IRH " + z11);
            }
            boolean z12 = z11 || ((i12 == b.a.f27761l || i12 == b.a.f27762m) && (i12 == b.a.f27762m || i11 != 1 || z10));
            if (C5388l.f23730a) {
                Log.d("CCL", "UD " + z12);
            }
            iArr[0] = z12 ? i10 : 0;
            if (!z12) {
                i10 = i13;
            }
            iArr[1] = i10;
            if (!z12) {
                return true;
            }
        } else if (i14 == 4) {
            iArr[0] = i13;
            iArr[1] = i13;
        } else {
            throw new IllegalStateException((bVar + " is not supported").toString());
        }
        return false;
    }

    public void a(p2.e eVar, b.a aVar) {
        String str;
        boolean z10;
        e.b bVar;
        p2.e eVar2 = eVar;
        b.a aVar2 = aVar;
        String str2 = eVar2.f27468o;
        if (C5388l.f23730a) {
            Log.d("CCL", "Measuring " + str2 + " with: " + C5388l.p(eVar) + 10);
        }
        Integer[] numArr = this.f23517e.get(str2);
        String str3 = "CCL";
        boolean z11 = false;
        v(aVar2.f27763a, aVar2.f27765c, eVar2.f27484w, aVar2.f27772j, (numArr != null ? numArr[1].intValue() : 0) == eVar.x(), eVar.p0(), C5267b.l(this.f23519g.H()), this.f23520h);
        v(aVar2.f27764b, aVar2.f27766d, eVar2.f27486x, aVar2.f27772j, (numArr != null ? numArr[0].intValue() : 0) == eVar.Y(), eVar.q0(), C5267b.k(this.f23519g.H()), this.f23521i);
        int[] iArr = this.f23520h;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int[] iArr2 = this.f23521i;
        long a10 = c2.c.a(i10, i11, iArr2[0], iArr2[1]);
        int i12 = aVar2.f27772j;
        if (!(i12 != b.a.f27761l && i12 != b.a.f27762m && aVar2.f27763a == (bVar = e.b.MATCH_CONSTRAINT) && eVar2.f27484w == 0 && aVar2.f27764b == bVar && eVar2.f27486x == 0)) {
            if (C5388l.f23730a) {
                str = str3;
                Log.d(str, "Measuring " + str2 + " with " + C5267b.q(a10));
            } else {
                str = str3;
            }
            long u10 = u(eVar2, a10);
            eVar2.c1(false);
            if (C5388l.f23730a) {
                Log.d(str, str2 + " is size " + C5456l.e(u10) + ' ' + C5456l.f(u10));
            }
            Integer valueOf = Integer.valueOf(C5456l.e(u10));
            Integer valueOf2 = Integer.valueOf(eVar2.f27490z);
            Integer num = null;
            if (valueOf2.intValue() <= 0) {
                valueOf2 = null;
            }
            Integer valueOf3 = Integer.valueOf(eVar2.f27404A);
            if (valueOf3.intValue() <= 0) {
                valueOf3 = null;
            }
            int intValue = ((Number) C17978n.p(valueOf, valueOf2, valueOf3)).intValue();
            Integer valueOf4 = Integer.valueOf(C5456l.f(u10));
            Integer valueOf5 = Integer.valueOf(eVar2.f27408C);
            if (valueOf5.intValue() <= 0) {
                valueOf5 = null;
            }
            Integer valueOf6 = Integer.valueOf(eVar2.f27410D);
            if (valueOf6.intValue() > 0) {
                num = valueOf6;
            }
            int intValue2 = ((Number) C17978n.p(valueOf4, valueOf5, num)).intValue();
            if (intValue != C5456l.e(u10)) {
                a10 = c2.c.a(intValue, intValue, C5267b.m(a10), C5267b.k(a10));
                z10 = true;
            } else {
                z10 = false;
            }
            if (intValue2 != C5456l.f(u10)) {
                a10 = c2.c.a(C5267b.n(a10), C5267b.l(a10), intValue2, intValue2);
                z10 = true;
            }
            if (z10) {
                if (C5388l.f23730a) {
                    Log.d(str, "Remeasuring coerced " + str2 + " with " + C5267b.q(a10));
                }
                u(eVar2, a10);
                eVar2.c1(false);
            }
        }
        a0 a0Var = this.f23516d.get(eVar.s());
        aVar2.f27767e = a0Var != null ? a0Var.E0() : eVar.Y();
        aVar2.f27768f = a0Var != null ? a0Var.z0() : eVar.x();
        int n02 = (a0Var == null || !this.f23519g.q(eVar2)) ? Integer.MIN_VALUE : a0Var.n0(C4469b.a());
        aVar2.f27770h = n02 != Integer.MIN_VALUE;
        aVar2.f27769g = n02;
        Map<String, Integer[]> map = this.f23517e;
        Integer[] numArr2 = map.get(str2);
        if (numArr2 == null) {
            numArr2 = new Integer[]{0, 0, Integer.MIN_VALUE};
            map.put(str2, numArr2);
        }
        f(numArr2, aVar2);
        if (!(aVar2.f27767e == aVar2.f27765c && aVar2.f27768f == aVar2.f27766d)) {
            z11 = true;
        }
        aVar2.f27771i = z11;
    }

    public void b() {
    }

    public final void c(C5367J j10) {
        this.f23514b = j10;
        if (j10 != null) {
            j10.i(this.f23513a);
        }
    }

    /* access modifiers changed from: protected */
    public final void d(long j10) {
        this.f23515c.o1(C5267b.l(j10));
        this.f23515c.P0(C5267b.k(j10));
        this.f23522j = Float.NaN;
        C5367J j11 = this.f23514b;
        float f10 = 1.0f;
        if (j11 != null && (j11 == null || j11.l() != Integer.MIN_VALUE)) {
            C5367J j12 = this.f23514b;
            C17542s.g(j12);
            int l10 = j12.l();
            if (l10 > this.f23515c.Y()) {
                this.f23522j = ((float) this.f23515c.Y()) / ((float) l10);
            } else {
                this.f23522j = 1.0f;
            }
            this.f23515c.o1(l10);
        }
        C5367J j13 = this.f23514b;
        if (j13 == null) {
            return;
        }
        if (j13 == null || j13.h() != Integer.MIN_VALUE) {
            C5367J j14 = this.f23514b;
            C17542s.g(j14);
            int h10 = j14.h();
            if (Float.isNaN(this.f23522j)) {
                this.f23522j = 1.0f;
            }
            if (h10 > this.f23515c.x()) {
                f10 = ((float) this.f23515c.x()) / ((float) h10);
            }
            if (f10 < this.f23522j) {
                this.f23522j = f10;
            }
            this.f23515c.P0(h10);
        }
    }

    public void e() {
        p2.e eVar;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{ ");
        sb2.append("  root: {");
        sb2.append("interpolated: { left:  0,");
        sb2.append("  top:  0,");
        sb2.append("  right:   " + this.f23515c.Y() + " ,");
        sb2.append("  bottom:  " + this.f23515c.x() + " ,");
        sb2.append(" } }");
        Iterator<p2.e> it = this.f23515c.w1().iterator();
        while (it.hasNext()) {
            p2.e next = it.next();
            Object s10 = next.s();
            if (s10 instanceof H) {
                j jVar = null;
                if (next.f27468o == null) {
                    H h10 = (H) s10;
                    Object a10 = androidx.compose.ui.layout.a.a(h10);
                    if (a10 == null) {
                        a10 = C5391o.a(h10);
                    }
                    next.f27468o = a10 != null ? a10.toString() : null;
                }
                j jVar2 = this.f23518f.get(s10);
                if (!(jVar2 == null || (eVar = jVar2.f26226a) == null)) {
                    jVar = eVar.f27466n;
                }
                if (jVar != null) {
                    sb2.append(' ' + next.f27468o + ": {");
                    sb2.append(" interpolated : ");
                    jVar.p(sb2, true);
                    sb2.append("}, ");
                }
            } else if (next instanceof p2.h) {
                sb2.append(' ' + next.f27468o + ": {");
                p2.h hVar = (p2.h) next;
                if (hVar.w1() == 0) {
                    sb2.append(" type: 'hGuideline', ");
                } else {
                    sb2.append(" type: 'vGuideline', ");
                }
                sb2.append(" interpolated: ");
                sb2.append(" { left: " + hVar.Z() + ", top: " + hVar.a0() + ", right: " + (hVar.Z() + hVar.Y()) + ", bottom: " + (hVar.a0() + hVar.x()) + " }");
                sb2.append("}, ");
            }
        }
        sb2.append(" }");
        String sb3 = sb2.toString();
        this.f23513a = sb3;
        C5367J j10 = this.f23514b;
        if (j10 != null) {
            j10.i(sb3);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d9, code lost:
        r24 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e9, code lost:
        r24 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(U0.C4889m r28, int r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r29
            r2 = 1750959258(0x685d849a, float:4.1843562E24)
            r3 = r28
            U0.m r15 = r3.k(r2)
            r14 = 6
            r3 = r1 & 6
            r4 = 2
            if (r3 != 0) goto L_0x001e
            boolean r3 = r15.F(r0)
            if (r3 == 0) goto L_0x001b
            r3 = 4
            goto L_0x001c
        L_0x001b:
            r3 = r4
        L_0x001c:
            r3 = r3 | r1
            goto L_0x001f
        L_0x001e:
            r3 = r1
        L_0x001f:
            r5 = r3 & 3
            if (r5 != r4) goto L_0x002f
            boolean r4 = r15.l()
            if (r4 != 0) goto L_0x002a
            goto L_0x002f
        L_0x002a:
            r15.L()
            goto L_0x0316
        L_0x002f:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x003b
            r4 = -1
            java.lang.String r5 = "androidx.constraintlayout.compose.Measurer.createDesignElements (ConstraintLayout.kt:2120)"
            U0.C4895p.S(r2, r3, r4, r5)
        L_0x003b:
            java.util.ArrayList<m2.b$a> r2 = r0.f23523k
            int r13 = r2.size()
            r12 = 0
            r11 = r12
        L_0x0043:
            if (r11 >= r13) goto L_0x030d
            java.lang.Object r3 = r2.get(r11)
            m2.b$a r3 = (m2.C5574b.a) r3
            java.lang.String r4 = r3.a()
            g2.x r5 = g2.C5400x.f23760a
            java.util.HashMap r5 = r5.a()
            java.lang.String r6 = r3.c()
            java.lang.Object r5 = r5.get(r6)
            nI.r r5 = (nI.r) r5
            if (r5 == 0) goto L_0x007f
            r6 = -209368134(0xfffffffff3854bba, float:-2.1121564E31)
            r15.W(r6)
            java.util.HashMap r3 = r3.b()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r5.l(r4, r3, r15, r6)
            r15.P()
            r23 = r11
            r24 = r12
            r25 = r13
            r26 = r14
            goto L_0x0303
        L_0x007f:
            r5 = -209229285(0xfffffffff3876a1b, float:-2.145728E31)
            r15.W(r5)
            java.lang.String r5 = r3.c()
            if (r5 == 0) goto L_0x0098
            int r6 = r5.hashCode()
            r7 = 8
            java.lang.String r8 = "backgroundColor"
            java.lang.String r9 = "text"
            switch(r6) {
                case -1377687758: goto L_0x0274;
                case -1031434259: goto L_0x0221;
                case 97739: goto L_0x0130;
                case 3556653: goto L_0x00dd;
                case 100313435: goto L_0x00a2;
                default: goto L_0x0098;
            }
        L_0x0098:
            r23 = r11
            r24 = r12
            r25 = r13
            r26 = r14
            goto L_0x02f7
        L_0x00a2:
            java.lang.String r3 = "image"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x00ab
            goto L_0x0098
        L_0x00ab:
            r3 = -207223709(0xfffffffff3a60463, float:-2.6306465E31)
            r15.W(r3)
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r5 = androidx.compose.ui.layout.a.b(r3, r4)
            r3 = 17301567(0x108003f, float:2.4979432E-38)
            t1.c r3 = J1.e.c(r3, r15, r14)
            r16 = 48
            r17 = 120(0x78, float:1.68E-43)
            java.lang.String r4 = "Placeholder Image"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = r15
            r23 = r11
            r11 = r16
            r12 = r17
            n0.C5583F.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.P()
            r25 = r13
            r26 = r14
        L_0x00d9:
            r24 = 0
            goto L_0x0300
        L_0x00dd:
            r23 = r11
            boolean r5 = r5.equals(r9)
            if (r5 != 0) goto L_0x00ed
            r25 = r13
            r26 = r14
        L_0x00e9:
            r24 = 0
            goto L_0x02f7
        L_0x00ed:
            r5 = -207913738(0xfffffffff39b7cf6, float:-2.4638077E31)
            r15.W(r5)
            java.util.HashMap r5 = r3.b()
            java.lang.Object r5 = r5.get(r9)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x0100
            r5 = r9
        L_0x0100:
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r4 = androidx.compose.ui.layout.a.b(r6, r4)
            java.util.HashMap r3 = r3.b()
            N1.Y r6 = r0.t(r3)
            r16 = 0
            r17 = 504(0x1f8, float:7.06E-43)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r15
            r25 = r13
            r13 = r16
            r26 = r14
            r14 = r17
            B0.C4360d.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.P()
            goto L_0x00d9
        L_0x0130:
            r23 = r11
            r25 = r13
            r26 = r14
            java.lang.String r6 = "box"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x013f
            goto L_0x00e9
        L_0x013f:
            r5 = -208521400(0xfffffffff3923748, float:-2.316884E31)
            r15.W(r5)
            java.util.HashMap r5 = r3.b()
            java.lang.Object r5 = r5.get(r9)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x0153
            java.lang.String r5 = ""
        L_0x0153:
            java.util.HashMap r6 = r3.b()
            java.lang.Object r6 = r6.get(r8)
            java.lang.String r6 = (java.lang.String) r6
            p1.v0$a r8 = p1.C5747v0.f27350b
            long r8 = r8.e()
            long r17 = r0.j(r6, r8)
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r16 = androidx.compose.ui.layout.a.b(r6, r4)
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c r8 = r8.o()
            r14 = 0
            E1.I r8 = androidx.compose.foundation.layout.C5077h.h(r8, r14)
            int r9 = U0.C4883j.a(r15, r14)
            U0.y r10 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r12 = r11.a()
            U0.f r13 = r15.m()
            if (r13 != 0) goto L_0x019d
            U0.C4883j.c()
        L_0x019d:
            r15.I()
            boolean r13 = r15.i()
            if (r13 == 0) goto L_0x01aa
            r15.p(r12)
            goto L_0x01ad
        L_0x01aa:
            r15.t()
        L_0x01ad:
            U0.m r12 = U0.F1.a(r15)
            nI.p r13 = r11.c()
            U0.F1.c(r12, r8, r13)
            nI.p r8 = r11.e()
            U0.F1.c(r12, r10, r8)
            nI.p r8 = r11.b()
            boolean r10 = r12.i()
            if (r10 != 0) goto L_0x01d7
            java.lang.Object r10 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r13)
            if (r10 != 0) goto L_0x01e5
        L_0x01d7:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12.u(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.w(r9, r8)
        L_0x01e5:
            nI.p r8 = r11.d()
            U0.F1.c(r12, r4, r8)
            androidx.compose.foundation.layout.j r4 = androidx.compose.foundation.layout.C5079j.f18125a
            float r4 = (float) r7
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.i(r6, r4)
            java.util.HashMap r3 = r3.b()
            N1.Y r6 = r0.t(r3)
            r13 = 48
            r16 = 504(0x1f8, float:7.06E-43)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r15
            r24 = r14
            r14 = r16
            B0.C4360d.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.x()
            r15.P()
            goto L_0x0300
        L_0x0221:
            r23 = r11
            r24 = r12
            r25 = r13
            r26 = r14
            java.lang.String r6 = "textfield"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0233
            goto L_0x02f7
        L_0x0233:
            r5 = -207560958(0xfffffffff3a0df02, float:-2.5491047E31)
            r15.W(r5)
            java.util.HashMap r3 = r3.b()
            java.lang.Object r3 = r3.get(r9)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0246
            r3 = r9
        L_0x0246:
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r5 = androidx.compose.ui.layout.a.b(r5, r4)
            g2.L$b r4 = g2.C5369L.b.f23525c
            r21 = 0
            r22 = 65528(0xfff8, float:9.1824E-41)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r28 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r20 = 48
            r19 = r28
            B0.C4359c.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r28.P()
            r15 = r28
            goto L_0x0300
        L_0x0274:
            r23 = r11
            r24 = r12
            r25 = r13
            r26 = r14
            r28 = r15
            java.lang.String r6 = "button"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x028a
            r15 = r28
            goto L_0x02f7
        L_0x028a:
            r5 = -209212359(0xfffffffff387ac39, float:-2.1498205E31)
            r15 = r28
            r15.W(r5)
            java.util.HashMap r5 = r3.b()
            java.lang.Object r5 = r5.get(r9)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x029f
            r5 = r9
        L_0x029f:
            java.util.HashMap r6 = r3.b()
            java.lang.Object r6 = r6.get(r8)
            java.lang.String r6 = (java.lang.String) r6
            p1.v0$a r8 = p1.C5747v0.f27350b
            long r8 = r8.e()
            long r17 = r0.j(r6, r8)
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r4 = androidx.compose.ui.layout.a.b(r6, r4)
            r6 = 20
            A0.f r6 = A0.g.a(r6)
            androidx.compose.ui.d r16 = m1.e.a(r4, r6)
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            float r6 = (float) r7
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.i(r4, r6)
            java.util.HashMap r3 = r3.b()
            N1.Y r6 = r0.t(r3)
            r13 = 0
            r14 = 504(0x1f8, float:7.06E-43)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r15
            B0.C4360d.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.P()
            goto L_0x0300
        L_0x02f7:
            r3 = -206910826(0xfffffffff3aaca96, float:-2.706297E31)
            r15.W(r3)
            r15.P()
        L_0x0300:
            r15.P()
        L_0x0303:
            int r11 = r23 + 1
            r12 = r24
            r13 = r25
            r14 = r26
            goto L_0x0043
        L_0x030d:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0316
            U0.C4895p.R()
        L_0x0316:
            U0.Y0 r2 = r15.n()
            if (r2 == 0) goto L_0x0324
            g2.L$c r3 = new g2.L$c
            r3.<init>(r0, r1)
            r2.a(r3)
        L_0x0324:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.C5369L.g(U0.m, int):void");
    }

    public final void h(r1.f fVar, float f10) {
        float o10 = ((float) o()) * f10;
        float n10 = ((float) n()) * f10;
        float l10 = (C5673m.l(fVar.b()) - o10) / 2.0f;
        float i10 = (C5673m.i(fVar.b()) - n10) / 2.0f;
        C5747v0.a aVar = C5747v0.f27350b;
        float f11 = l10 + o10;
        r1.f fVar2 = fVar;
        long j10 = aVar.j();
        r1.f.u0(fVar2, j10, C5668h.a(l10, i10), C5668h.a(f11, i10), 0.0f, 0, (V0) null, 0.0f, (C5749w0) null, 0, 504, (Object) null);
        float f12 = f11;
        float f13 = i10 + n10;
        float f14 = f12;
        r1.f.u0(fVar2, j10, C5668h.a(f12, i10), C5668h.a(f12, f13), 0.0f, 0, (V0) null, 0.0f, (C5749w0) null, 0, 504, (Object) null);
        float f15 = f13;
        r1.f.u0(fVar, j10, C5668h.a(f14, f15), C5668h.a(l10, f15), 0.0f, 0, (V0) null, 0.0f, (C5749w0) null, 0, 504, (Object) null);
        r1.f.u0(fVar, j10, C5668h.a(l10, f15), C5668h.a(l10, i10), 0.0f, 0, (V0) null, 0.0f, (C5749w0) null, 0, 504, (Object) null);
        float f16 = (float) 1;
        float f17 = l10 + f16;
        float f18 = i10 + f16;
        float f19 = o10 + f17;
        r1.f fVar3 = fVar;
        long a10 = aVar.a();
        r1.f.u0(fVar3, a10, C5668h.a(f17, f18), C5668h.a(f19, f18), 0.0f, 0, (V0) null, 0.0f, (C5749w0) null, 0, 504, (Object) null);
        float f20 = n10 + f18;
        r1.f.u0(fVar3, a10, C5668h.a(f19, f18), C5668h.a(f19, f20), 0.0f, 0, (V0) null, 0.0f, (C5749w0) null, 0, 504, (Object) null);
        r1.f.u0(fVar3, a10, C5668h.a(f19, f20), C5668h.a(f17, f20), 0.0f, 0, (V0) null, 0.0f, (C5749w0) null, 0, 504, (Object) null);
        r1.f.u0(fVar3, a10, C5668h.a(f17, f20), C5668h.a(f17, f18), 0.0f, 0, (V0) null, 0.0f, (C5749w0) null, 0, 504, (Object) null);
    }

    public final void i(C5857c cVar, float f10, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(2126574786);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.c(f10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(this) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2126574786, i11, -1, "androidx.constraintlayout.compose.Measurer.drawDebugBounds (ConstraintLayout.kt:2069)");
            }
            androidx.compose.ui.d e10 = cVar.e(androidx.compose.ui.d.f18749a);
            boolean F10 = ((i11 & 112) == 32) | k10.F(this);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new d(this, f10);
                k10.u(D10);
            }
            C5603i.a(e10, (C17642l) D10, k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new e(this, cVar, f10, i10));
        }
    }

    public final float l() {
        return this.f23522j;
    }

    /* access modifiers changed from: protected */
    public final Map<H, j> m() {
        return this.f23518f;
    }

    public final int n() {
        return this.f23515c.x();
    }

    public final int o() {
        return this.f23515c.Y();
    }

    /* access modifiers changed from: protected */
    public final C5367J p() {
        return this.f23514b;
    }

    /* access modifiers changed from: protected */
    public final Map<H, a0> q() {
        return this.f23516d;
    }

    /* access modifiers changed from: protected */
    public final f r() {
        return this.f23515c;
    }

    /* access modifiers changed from: protected */
    public final X s() {
        return this.f23519g;
    }

    public final void w(C5393q qVar) {
        if (qVar instanceof C5365H) {
            ((C5365H) qVar).p(this.f23523k);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: g2.I} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: g2.I} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: g2.I} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: g2.I} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: E1.H} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: g2.I} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(E1.a0.a r13, java.util.List<? extends E1.H> r14) {
        /*
            r12 = this;
            java.util.Map<E1.H, m2.j> r0 = r12.f23518f
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0037
            p2.f r0 = r12.f23515c
            java.util.ArrayList r0 = r0.w1()
            int r2 = r0.size()
            r3 = r1
        L_0x0014:
            if (r3 >= r2) goto L_0x0037
            java.lang.Object r4 = r0.get(r3)
            p2.e r4 = (p2.e) r4
            java.lang.Object r5 = r4.s()
            boolean r6 = r5 instanceof E1.H
            if (r6 == 0) goto L_0x0034
            m2.j r6 = new m2.j
            m2.j r4 = r4.f27466n
            m2.j r4 = r4.v()
            r6.<init>((m2.j) r4)
            java.util.Map<E1.H, m2.j> r4 = r12.f23518f
            r4.put(r5, r6)
        L_0x0034:
            int r3 = r3 + 1
            goto L_0x0014
        L_0x0037:
            int r0 = r14.size()
        L_0x003b:
            r2 = 0
            if (r1 >= r0) goto L_0x00c7
            java.lang.Object r3 = r14.get(r1)
            E1.H r3 = (E1.H) r3
            java.util.Map<E1.H, m2.j> r4 = r12.f23518f
            boolean r4 = r4.containsKey(r3)
            if (r4 != 0) goto L_0x007f
            java.util.Map<E1.H, m2.j> r4 = r12.f23518f
            java.util.Set r4 = r4.keySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0058:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x007a
            java.lang.Object r5 = r4.next()
            r6 = r5
            E1.H r6 = (E1.H) r6
            java.lang.Object r7 = androidx.compose.ui.layout.a.a(r6)
            if (r7 == 0) goto L_0x0058
            java.lang.Object r6 = androidx.compose.ui.layout.a.a(r6)
            java.lang.Object r7 = androidx.compose.ui.layout.a.a(r3)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r7)
            if (r6 == 0) goto L_0x0058
            r2 = r5
        L_0x007a:
            E1.H r2 = (E1.H) r2
            if (r2 != 0) goto L_0x0080
            goto L_0x00c3
        L_0x007f:
            r2 = r3
        L_0x0080:
            java.util.Map<E1.H, m2.j> r4 = r12.f23518f
            java.lang.Object r4 = r4.get(r2)
            r7 = r4
            m2.j r7 = (m2.j) r7
            if (r7 != 0) goto L_0x008c
            return
        L_0x008c:
            java.util.Map<E1.H, E1.a0> r4 = r12.f23516d
            java.lang.Object r2 = r4.get(r2)
            r6 = r2
            E1.a0 r6 = (E1.a0) r6
            if (r6 != 0) goto L_0x0098
            return
        L_0x0098:
            java.util.Map<E1.H, m2.j> r2 = r12.f23518f
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L_0x00bb
            c2.b$a r2 = c2.C5267b.f23024b
            int r4 = r6.E0()
            int r5 = r6.z0()
            long r4 = r2.c(r4, r5)
            E1.a0 r6 = r3.i0(r4)
            r10 = 4
            r11 = 0
            r8 = 0
            r5 = r13
            g2.C5388l.o(r5, r6, r7, r8, r10, r11)
            goto L_0x00c3
        L_0x00bb:
            r10 = 4
            r11 = 0
            r8 = 0
            r5 = r13
            g2.C5388l.o(r5, r6, r7, r8, r10, r11)
        L_0x00c3:
            int r1 = r1 + 1
            goto L_0x003b
        L_0x00c7:
            g2.J r13 = r12.f23514b
            if (r13 == 0) goto L_0x00cf
            g2.I r2 = r13.j()
        L_0x00cf:
            g2.I r13 = g2.C5366I.BOUNDS
            if (r2 != r13) goto L_0x00d6
            r12.e()
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.C5369L.x(E1.a0$a, java.util.List):void");
    }

    public final long y(long j10, t tVar, C5393q qVar, List<? extends H> list, int i10) {
        String str;
        Object a10;
        List<? extends H> list2 = list;
        if (list.isEmpty()) {
            return c2.s.a(C5267b.n(j10), C5267b.m(j10));
        }
        this.f23519g.E(C5267b.j(j10) ? m2.d.b(C5267b.l(j10)) : m2.d.h().o(C5267b.n(j10)));
        this.f23519g.m(C5267b.i(j10) ? m2.d.b(C5267b.k(j10)) : m2.d.h().o(C5267b.m(j10)));
        this.f23519g.f26161f.E().a(this.f23519g, this.f23515c, 0);
        boolean z10 = true;
        this.f23519g.f26161f.C().a(this.f23519g, this.f23515c, 1);
        long j11 = j10;
        this.f23519g.I(j10);
        X x10 = this.f23519g;
        if (tVar != t.Rtl) {
            z10 = false;
        }
        x10.z(z10);
        z();
        if (qVar.b(list)) {
            this.f23519g.u();
            qVar.a(this.f23519g, list2);
            C5388l.l(this.f23519g, list2);
            this.f23519g.a(this.f23515c);
        } else {
            C5388l.l(this.f23519g, list2);
        }
        d(j10);
        this.f23515c.g2();
        if (C5388l.f23730a) {
            this.f23515c.G0("ConstraintLayout");
            ArrayList<p2.e> w12 = this.f23515c.w1();
            int size = w12.size();
            for (int i11 = 0; i11 < size; i11++) {
                p2.e eVar = w12.get(i11);
                Object s10 = eVar.s();
                H h10 = s10 instanceof H ? (H) s10 : null;
                if (h10 == null || (a10 = androidx.compose.ui.layout.a.a(h10)) == null || (str = a10.toString()) == null) {
                    str = "NOTAG";
                }
                eVar.G0(str);
            }
            Log.d("CCL", "ConstraintLayout is asked to measure with " + C5267b.q(j10));
            Log.d("CCL", C5388l.p(this.f23515c));
            ArrayList<p2.e> w13 = this.f23515c.w1();
            int size2 = w13.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Log.d("CCL", C5388l.p(w13.get(i12)));
            }
        }
        this.f23515c.c2(i10);
        f fVar = this.f23515c;
        fVar.X1(fVar.P1(), 0, 0, 0, 0, 0, 0, 0, 0);
        if (C5388l.f23730a) {
            Log.d("CCL", "ConstraintLayout is at the end " + this.f23515c.Y() + ' ' + this.f23515c.x());
        }
        return c2.s.a(this.f23515c.Y(), this.f23515c.x());
    }

    public final void z() {
        this.f23516d.clear();
        this.f23517e.clear();
        this.f23518f.clear();
    }
}
