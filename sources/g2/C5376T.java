package g2;

import E1.H;
import YH.C16877v;
import android.graphics.Matrix;
import androidx.compose.ui.layout.a;
import c2.C5267b;
import c2.d;
import c2.s;
import c2.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m2.h;
import m2.j;
import o1.C5668h;
import o1.C5673m;
import o1.C5674n;
import p1.C5702H;
import p1.C5747v0;
import p1.C5749w0;
import p1.V0;
import p2.e;
import r1.f;
import r1.k;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018Jb\u0010\"\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J;\u0010,\u001a\u00020\u000f2\n\u0010&\u001a\u00060$j\u0002`%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010 \u001a\u00020)2\u0006\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010-J;\u00105\u001a\u00020\u000f*\u00020.2\u0006\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u001f2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u0016H\u0002¢\u0006\u0004\b5\u00106J.\u0010<\u001a\u00020\u000f*\u00020.2\u0006\u00107\u001a\u0002012\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0002ø\u0001\u0000¢\u0006\u0004\b<\u0010=Jh\u0010@\u001a\u00020?2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u00020\u000f2\n\u0010&\u001a\u00060$j\u0002`%¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u0010EJ/\u0010H\u001a\u00020\u000f*\u00020.2\b\b\u0002\u0010F\u001a\u00020\u00162\b\b\u0002\u0010G\u001a\u00020\u00162\b\b\u0002\u00104\u001a\u00020\u0016¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\u000f¢\u0006\u0004\bJ\u0010EJ5\u0010M\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00168\u0002XD¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010,R\u0017\u0010\u001e\u001a\u00020T8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001e\u0010[\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bY\u0010Z\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"Lg2/T;", "Lg2/L;", "Lc2/d;", "density", "<init>", "(Lc2/d;)V", "", "optimizationLevel", "Lg2/q;", "constraintSet", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LXH/N;", "J", "(ILg2/q;Ljava/util/List;J)V", "Lg2/f;", "source", "Lg2/V;", "invalidateOnConstraintsCallback", "", "K", "(JLg2/f;Lg2/V;)Z", "Lc2/t;", "layoutDirection", "constraintSetStart", "constraintSetEnd", "Lg2/b0;", "transition", "", "progress", "remeasure", "M", "(JLc2/t;Lg2/q;Lg2/q;Lg2/b0;Ljava/util/List;IFZ)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "json", "", "location", "", "types", "count", "F", "(Ljava/lang/StringBuilder;[F[I[II)V", "Lr1/f;", "parentWidth", "parentHeight", "Lm2/j;", "startFrame", "drawPath", "drawKeyPositions", "E", "(Lr1/f;FFLm2/j;ZZ)V", "frame", "Lp1/V0;", "pathEffect", "Lp1/v0;", "color", "D", "(Lr1/f;Lm2/j;Lp1/V0;J)V", "compositionSource", "Lc2/r;", "L", "(JLc2/t;Lg2/q;Lg2/q;Lg2/b0;Ljava/util/List;IFLg2/f;Lg2/V;)J", "G", "(Ljava/lang/StringBuilder;)V", "e", "()V", "drawBounds", "drawPaths", "C", "(Lr1/f;ZZZ)V", "B", "start", "end", "I", "(Lg2/q;Lg2/q;Lc2/t;Lg2/b0;F)V", "l", "Z", "DEBUG", "m", "lastProgressInInterpolation", "Lm2/h;", "n", "Lm2/h;", "H", "()Lm2/h;", "o", "Lc2/b;", "oldConstraints", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g2.T  reason: case insensitive filesystem */
public final class C5376T extends C5369L {

    /* renamed from: l  reason: collision with root package name */
    private final boolean f23618l;

    /* renamed from: m  reason: collision with root package name */
    private float f23619m;

    /* renamed from: n  reason: collision with root package name */
    private final h f23620n;

    /* renamed from: o  reason: collision with root package name */
    private C5267b f23621o;

    public C5376T(d dVar) {
        super(dVar);
        this.f23620n = new h(new C5375S(dVar));
    }

    private final void D(f fVar, j jVar, V0 v02, long j10) {
        j jVar2 = jVar;
        if (jVar.n()) {
            f.q1(fVar, j10, C5668h.a((float) jVar2.f26227b, (float) jVar2.f26228c), C5674n.a((float) jVar.y(), (float) jVar.k()), 0.0f, new k(3.0f, 0.0f, 0, 0, v02, 14, (DefaultConstructorMarker) null), (C5749w0) null, 0, 104, (Object) null);
            return;
        }
        Matrix matrix = new Matrix();
        if (!Float.isNaN(jVar2.f26235j)) {
            matrix.preRotate(jVar2.f26235j, jVar.e(), jVar.f());
        }
        float f10 = 1.0f;
        float f11 = Float.isNaN(jVar2.f26239n) ? 1.0f : jVar2.f26239n;
        if (!Float.isNaN(jVar2.f26240o)) {
            f10 = jVar2.f26240o;
        }
        matrix.preScale(f11, f10, jVar.e(), jVar.f());
        int i10 = jVar2.f26227b;
        int i11 = jVar2.f26228c;
        int i12 = jVar2.f26229d;
        int i13 = jVar2.f26230e;
        float[] fArr = {(float) i10, (float) i11, (float) i12, (float) i11, (float) i12, (float) i13, (float) i10, (float) i13};
        matrix.mapPoints(fArr);
        f fVar2 = fVar;
        long j11 = j10;
        V0 v03 = v02;
        f.u0(fVar2, j11, C5668h.a(fArr[0], fArr[1]), C5668h.a(fArr[2], fArr[3]), 3.0f, 0, v03, 0.0f, (C5749w0) null, 0, 464, (Object) null);
        f.u0(fVar2, j11, C5668h.a(fArr[2], fArr[3]), C5668h.a(fArr[4], fArr[5]), 3.0f, 0, v03, 0.0f, (C5749w0) null, 0, 464, (Object) null);
        f.u0(fVar2, j11, C5668h.a(fArr[4], fArr[5]), C5668h.a(fArr[6], fArr[7]), 3.0f, 0, v03, 0.0f, (C5749w0) null, 0, 464, (Object) null);
        f.u0(fVar, j10, C5668h.a(fArr[6], fArr[7]), C5668h.a(fArr[0], fArr[1]), 3.0f, 0, v02, 0.0f, (C5749w0) null, 0, 464, (Object) null);
    }

    private final void E(f fVar, float f10, float f11, j jVar, boolean z10, boolean z11) {
        new U(23.0f).a(C5702H.d(fVar.I1().e()), this.f23620n.y(jVar.f26226a.f27468o), 1000, (int) f10, (int) f11, z10, z11);
    }

    private final void F(StringBuilder sb2, float[] fArr, int[] iArr, int[] iArr2, int i10) {
        if (i10 != 0) {
            sb2.append("keyTypes : [");
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = iArr[i11];
                StringBuilder sb3 = new StringBuilder();
                sb3.append(' ');
                sb3.append(i12);
                sb3.append(',');
                sb2.append(sb3.toString());
            }
            sb2.append("],\n");
            sb2.append("keyPos : [");
            int i13 = i10 * 2;
            for (int i14 = 0; i14 < i13; i14++) {
                float f10 = fArr[i14];
                StringBuilder sb4 = new StringBuilder();
                sb4.append(' ');
                sb4.append(f10);
                sb4.append(',');
                sb2.append(sb4.toString());
            }
            sb2.append("],\n ");
            sb2.append("keyFrames : [");
            for (int i15 = 0; i15 < i10; i15++) {
                int i16 = iArr2[i15];
                StringBuilder sb5 = new StringBuilder();
                sb5.append(' ');
                sb5.append(i16);
                sb5.append(',');
                sb2.append(sb5.toString());
            }
            sb2.append("],\n ");
        }
    }

    private final void J(int i10, C5393q qVar, List<? extends H> list, long j10) {
        String str;
        Object a10;
        s().u();
        qVar.a(s(), list);
        C5388l.l(s(), list);
        s().a(r());
        ArrayList<e> w12 = r().w1();
        int size = w12.size();
        for (int i11 = 0; i11 < size; i11++) {
            w12.get(i11).D0(true);
        }
        d(j10);
        r().g2();
        if (this.f23618l) {
            r().G0("ConstraintLayout");
            ArrayList<e> w13 = r().w1();
            int size2 = w13.size();
            for (int i12 = 0; i12 < size2; i12++) {
                e eVar = w13.get(i12);
                Object s10 = eVar.s();
                H h10 = s10 instanceof H ? (H) s10 : null;
                if (h10 == null || (a10 = a.a(h10)) == null || (str = a10.toString()) == null) {
                    str = "NOTAG";
                }
                eVar.G0(str);
            }
        }
        r().c2(i10);
        r().X1(0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    private final boolean K(long j10, C5382f fVar, V v10) {
        if (this.f23620n.H() || m().isEmpty()) {
            return true;
        }
        C5267b bVar = this.f23621o;
        if (bVar != null && v10 != null) {
            C17542s.g(bVar);
            if (v10.a(bVar.r(), j10)) {
                return true;
            }
        } else if ((C5267b.i(j10) && !s().v(C5267b.k(j10))) || (C5267b.j(j10) && !s().w(C5267b.l(j10)))) {
            return true;
        }
        return fVar == C5382f.Content;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: E1.H} */
    /* JADX WARNING: type inference failed for: r2v4, types: [g2.I] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void M(long r14, c2.t r16, g2.C5393q r17, g2.C5393q r18, g2.b0 r19, java.util.List<? extends E1.H> r20, int r21, float r22, boolean r23) {
        /*
            r13 = this;
            r6 = r13
            r7 = r19
            r8 = r22
            r6.f23619m = r8
            r9 = 0
            if (r23 == 0) goto L_0x009c
            m2.h r0 = r6.f23620n
            r0.m()
            r13.z()
            g2.X r0 = r13.s()
            boolean r1 = c2.C5267b.j(r14)
            if (r1 == 0) goto L_0x0025
            int r1 = c2.C5267b.l(r14)
            m2.d r1 = m2.d.b(r1)
            goto L_0x0031
        L_0x0025:
            m2.d r1 = m2.d.h()
            int r2 = c2.C5267b.n(r14)
            m2.d r1 = r1.o(r2)
        L_0x0031:
            r0.E(r1)
            g2.X r0 = r13.s()
            boolean r1 = c2.C5267b.i(r14)
            if (r1 == 0) goto L_0x0047
            int r1 = c2.C5267b.k(r14)
            m2.d r1 = m2.d.b(r1)
            goto L_0x0053
        L_0x0047:
            m2.d r1 = m2.d.h()
            int r2 = c2.C5267b.m(r14)
            m2.d r1 = r1.o(r2)
        L_0x0053:
            r0.m(r1)
            g2.X r0 = r13.s()
            r10 = r14
            r0.I(r14)
            g2.X r0 = r13.s()
            c2.t r1 = c2.t.Rtl
            r12 = 1
            r2 = r16
            if (r2 != r1) goto L_0x006b
            r1 = r12
            goto L_0x006c
        L_0x006b:
            r1 = r9
        L_0x006c:
            r0.z(r1)
            r0 = r13
            r1 = r21
            r2 = r17
            r3 = r20
            r4 = r14
            r0.J(r1, r2, r3, r4)
            m2.h r0 = r6.f23620n
            p2.f r1 = r13.r()
            r0.N(r1, r9)
            r0 = r13
            r1 = r21
            r2 = r18
            r0.J(r1, r2, r3, r4)
            m2.h r0 = r6.f23620n
            p2.f r1 = r13.r()
            r0.N(r1, r12)
            if (r7 == 0) goto L_0x00a5
            m2.h r0 = r6.f23620n
            r7.c(r0)
            goto L_0x00a5
        L_0x009c:
            g2.X r0 = r13.s()
            r1 = r20
            g2.C5388l.l(r0, r1)
        L_0x00a5:
            m2.h r0 = r6.f23620n
            p2.f r1 = r13.r()
            int r1 = r1.Y()
            p2.f r2 = r13.r()
            int r2 = r2.x()
            r0.G(r1, r2, r8)
            p2.f r0 = r13.r()
            m2.h r1 = r6.f23620n
            int r1 = r1.w()
            r0.o1(r1)
            p2.f r0 = r13.r()
            m2.h r1 = r6.f23620n
            int r1 = r1.v()
            r0.P0(r1)
            p2.f r0 = r13.r()
            java.util.ArrayList r0 = r0.w1()
            int r1 = r0.size()
        L_0x00e0:
            r2 = 0
            if (r9 >= r1) goto L_0x0123
            java.lang.Object r3 = r0.get(r9)
            p2.e r3 = (p2.e) r3
            java.lang.Object r4 = r3.s()
            boolean r5 = r4 instanceof E1.H
            if (r5 == 0) goto L_0x00f4
            r2 = r4
            E1.H r2 = (E1.H) r2
        L_0x00f4:
            if (r2 != 0) goto L_0x00f7
            goto L_0x0120
        L_0x00f7:
            m2.h r4 = r6.f23620n
            m2.j r3 = r4.u(r3)
            if (r3 != 0) goto L_0x0100
            goto L_0x0120
        L_0x0100:
            java.util.Map r4 = r13.q()
            c2.b$a r5 = c2.C5267b.f23024b
            int r7 = r3.y()
            int r8 = r3.k()
            long r7 = r5.c(r7, r8)
            E1.a0 r5 = r2.i0(r7)
            r4.put(r2, r5)
            java.util.Map r4 = r13.m()
            r4.put(r2, r3)
        L_0x0120:
            int r9 = r9 + 1
            goto L_0x00e0
        L_0x0123:
            g2.J r0 = r13.p()
            if (r0 == 0) goto L_0x012d
            g2.I r2 = r0.j()
        L_0x012d:
            g2.I r0 = g2.C5366I.BOUNDS
            if (r2 != r0) goto L_0x0134
            r13.e()
        L_0x0134:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.C5376T.M(long, c2.t, g2.q, g2.q, g2.b0, java.util.List, int, float, boolean):void");
    }

    /* access modifiers changed from: private */
    public static final float N(d dVar, float f10) {
        return dVar.H1(c2.h.B(f10));
    }

    public final void B() {
        this.f23620n.m();
        m().clear();
    }

    public final void C(f fVar, boolean z10, boolean z11, boolean z12) {
        V0 a10 = V0.f27254a.a(new float[]{10.0f, 10.0f}, 0.0f);
        ArrayList<e> w12 = r().w1();
        int size = w12.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = w12.get(i10);
            j B10 = this.f23620n.B(eVar);
            j s10 = this.f23620n.s(eVar);
            if (z10) {
                C5747v0.a aVar = C5747v0.f27350b;
                f fVar2 = fVar;
                V0 v02 = a10;
                D(fVar2, B10, v02, aVar.b());
                D(fVar2, s10, v02, aVar.b());
                fVar.I1().c().d(2.0f, 2.0f);
                try {
                    D(fVar, B10, a10, aVar.j());
                    D(fVar, s10, a10, aVar.j());
                } finally {
                    fVar.I1().c().d(-2.0f, -2.0f);
                }
            }
            E(fVar, C5673m.l(fVar.b()), C5673m.i(fVar.b()), B10, z11, z12);
        }
    }

    public final void G(StringBuilder sb2) {
        sb2.append("  root: {");
        sb2.append("interpolated: { left:  0,");
        sb2.append("  top:  0,");
        sb2.append("  right:   " + r().Y() + " ,");
        sb2.append("  bottom:  " + r().x() + " ,");
        sb2.append(" } }");
    }

    public final h H() {
        return this.f23620n;
    }

    public final void I(C5393q qVar, C5393q qVar2, t tVar, b0 b0Var, float f10) {
        B();
        s().z(tVar == t.Rtl);
        qVar.a(s(), C16877v.n());
        qVar.g(this.f23620n, 0);
        s().a(r());
        this.f23620n.N(r(), 0);
        qVar.a(s(), C16877v.n());
        qVar2.g(this.f23620n, 1);
        s().a(r());
        this.f23620n.N(r(), 1);
        this.f23620n.G(0, 0, f10);
        b0Var.b(this.f23620n);
    }

    public final long L(long j10, t tVar, C5393q qVar, C5393q qVar2, b0 b0Var, List<? extends H> list, int i10, float f10, C5382f fVar, V v10) {
        C5367J p10;
        C5367J p11;
        boolean K10 = K(j10, fVar, v10);
        if (this.f23619m != f10 || ((((p10 = p()) == null || p10.l() != Integer.MIN_VALUE) && ((p11 = p()) == null || p11.h() != Integer.MIN_VALUE)) || K10)) {
            M(j10, tVar, qVar, qVar2, b0Var, list, i10, f10, K10);
        }
        this.f23621o = C5267b.a(j10);
        return s.a(r().Y(), r().x());
    }

    public void e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{ ");
        G(sb2);
        int[] iArr = new int[50];
        int[] iArr2 = new int[50];
        float[] fArr = new float[100];
        ArrayList<e> w12 = r().w1();
        int size = w12.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = w12.get(i10);
            j A10 = this.f23620n.A(eVar.f27468o);
            j r10 = this.f23620n.r(eVar.f27468o);
            j t10 = this.f23620n.t(eVar.f27468o);
            float[] z10 = this.f23620n.z(eVar.f27468o);
            int x10 = this.f23620n.x(eVar.f27468o, fArr, iArr, iArr2);
            sb2.append(' ' + eVar.f27468o + ": {");
            sb2.append(" interpolated : ");
            t10.p(sb2, true);
            sb2.append(", start : ");
            A10.o(sb2);
            sb2.append(", end : ");
            r10.o(sb2);
            F(sb2, fArr, iArr, iArr2, x10);
            sb2.append(" path : [");
            for (float f10 : z10) {
                sb2.append(' ' + f10 + " ,");
            }
            sb2.append(" ] ");
            sb2.append("}, ");
        }
        sb2.append(" }");
        C5367J p10 = p();
        if (p10 != null) {
            p10.i(sb2.toString());
        }
    }
}
