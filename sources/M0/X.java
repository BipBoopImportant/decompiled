package m0;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.L;
import U0.M;
import XH.C16807N;
import com.google.ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.C17536l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import m0.W;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001ae\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0007*\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "label", "Lm0/W;", "c", "(Ljava/lang/String;LU0/m;II)Lm0/W;", "T", "Lm0/q;", "V", "initialValue", "targetValue", "Lm0/z0;", "typeConverter", "Lm0/V;", "animationSpec", "LU0/A1;", "b", "(Lm0/W;Ljava/lang/Object;Ljava/lang/Object;Lm0/z0;Lm0/V;Ljava/lang/String;LU0/m;II)LU0/A1;", "", "a", "(Lm0/W;FFLm0/V;Ljava/lang/String;LU0/m;II)LU0/A1;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class X {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lm0/q;", "V", "LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T f25663c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ W.a<T, V> f25664d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ T f25665e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ V<T> f25666f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(T t10, W.a<T, V> aVar, T t11, V<T> v10) {
            super(0);
            this.f25663c = t10;
            this.f25664d = aVar;
            this.f25665e = t11;
            this.f25666f = v10;
        }

        public final void invoke() {
            if (!C17542s.e(this.f25663c, this.f25664d.d()) || !C17542s.e(this.f25665e, this.f25664d.i())) {
                this.f25664d.v(this.f25663c, this.f25665e, this.f25666f);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lm0/q;", "V", "LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ W f25667c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ W.a<T, V> f25668d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"m0/X$b$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ W f25669a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ W.a f25670b;

            public a(W w10, W.a aVar) {
                this.f25669a = w10;
                this.f25670b = aVar;
            }

            public void b() {
                this.f25669a.j(this.f25670b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(W w10, W.a<T, V> aVar) {
            super(1);
            this.f25667c = w10;
            this.f25668d = aVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f25667c.f(this.f25668d);
            return new a(this.f25667c, this.f25668d);
        }
    }

    public static final A1<Float> a(W w10, float f10, float f11, V<Float> v10, String str, C4889m mVar, int i10, int i11) {
        int i12 = i10;
        String str2 = (i11 & 8) != 0 ? "FloatAnimation" : str;
        if (C4895p.J()) {
            C4895p.S(-644770905, i12, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)");
        }
        int i13 = i12 & 1022;
        int i14 = i12 << 3;
        A1<Float> b10 = b(w10, Float.valueOf(f10), Float.valueOf(f11), B0.f(C17536l.f144385a), v10, str2, mVar, i13 | (57344 & i14) | (i14 & ImageMetadata.JPEG_GPS_COORDINATES), 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        return b10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: m0.W$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: m0.W$a} */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, V extends m0.C5562q> U0.A1<T> b(m0.W r7, T r8, T r9, m0.z0<T, V> r10, m0.V<T> r11, java.lang.String r12, U0.C4889m r13, int r14, int r15) {
        /*
            r15 = r15 & 16
            if (r15 == 0) goto L_0x0006
            java.lang.String r12 = "ValueAnimation"
        L_0x0006:
            r6 = r12
            boolean r12 = U0.C4895p.J()
            if (r12 == 0) goto L_0x0016
            r12 = -1
            java.lang.String r15 = "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)"
            r0 = -1062847727(0xffffffffc0a63b11, float:-5.1947103)
            U0.C4895p.S(r0, r14, r12, r15)
        L_0x0016:
            java.lang.Object r12 = r13.D()
            U0.m$a r15 = U0.C4889m.f14007a
            java.lang.Object r0 = r15.a()
            if (r12 != r0) goto L_0x0030
            m0.W$a r12 = new m0.W$a
            r0 = r12
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r2, r3, r4, r5, r6)
            r13.u(r12)
        L_0x0030:
            m0.W$a r12 = (m0.W.a) r12
            r10 = r14 & 112(0x70, float:1.57E-43)
            r10 = r10 ^ 48
            r0 = 32
            r1 = 1
            r2 = 0
            if (r10 <= r0) goto L_0x0042
            boolean r10 = r13.F(r8)
            if (r10 != 0) goto L_0x0046
        L_0x0042:
            r10 = r14 & 48
            if (r10 != r0) goto L_0x0048
        L_0x0046:
            r10 = r1
            goto L_0x0049
        L_0x0048:
            r10 = r2
        L_0x0049:
            r0 = r14 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r0 <= r3) goto L_0x0057
            boolean r0 = r13.F(r9)
            if (r0 != 0) goto L_0x005b
        L_0x0057:
            r0 = r14 & 384(0x180, float:5.38E-43)
            if (r0 != r3) goto L_0x005d
        L_0x005b:
            r0 = r1
            goto L_0x005e
        L_0x005d:
            r0 = r2
        L_0x005e:
            r10 = r10 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r14
            r0 = r0 ^ 24576(0x6000, float:3.4438E-41)
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r0 <= r3) goto L_0x006f
            boolean r0 = r13.F(r11)
            if (r0 != 0) goto L_0x0075
        L_0x006f:
            r14 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r14 != r3) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r1 = r2
        L_0x0075:
            r10 = r10 | r1
            java.lang.Object r14 = r13.D()
            if (r10 != 0) goto L_0x0082
            java.lang.Object r10 = r15.a()
            if (r14 != r10) goto L_0x008a
        L_0x0082:
            m0.X$a r14 = new m0.X$a
            r14.<init>(r8, r12, r9, r11)
            r13.u(r14)
        L_0x008a:
            nI.a r14 = (nI.C17631a) r14
            U0.P.i(r14, r13, r2)
            boolean r8 = r13.F(r7)
            java.lang.Object r9 = r13.D()
            if (r8 != 0) goto L_0x009f
            java.lang.Object r8 = r15.a()
            if (r9 != r8) goto L_0x00a7
        L_0x009f:
            m0.X$b r9 = new m0.X$b
            r9.<init>(r7, r12)
            r13.u(r9)
        L_0x00a7:
            nI.l r9 = (nI.C17642l) r9
            r7 = 6
            U0.P.c(r12, r9, r13, r7)
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x00b6
            U0.C4895p.R()
        L_0x00b6:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.X.b(m0.W, java.lang.Object, java.lang.Object, m0.z0, m0.V, java.lang.String, U0.m, int, int):U0.A1");
    }

    public static final W c(String str, C4889m mVar, int i10, int i11) {
        if ((i11 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (C4895p.J()) {
            C4895p.S(1013651573, i10, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object D10 = mVar.D();
        if (D10 == C4889m.f14007a.a()) {
            D10 = new W(str);
            mVar.u(D10);
        }
        W w10 = (W) D10;
        w10.k(mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        return w10;
    }
}
