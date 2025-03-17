package q1;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;
import p1.C5751x0;
import q1.C5775b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000  2\u00020\u0001:\u0002\u0011\u0016B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lq1/h;", "", "Lq1/c;", "source", "destination", "transformSource", "transformDestination", "Lq1/n;", "renderIntent", "", "transform", "<init>", "(Lq1/c;Lq1/c;Lq1/c;Lq1/c;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "intent", "(Lq1/c;Lq1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lp1/v0;", "color", "a", "(J)J", "Lq1/c;", "getSource", "()Lq1/c;", "b", "getDestination", "c", "d", "e", "I", "getRenderIntent-uksYyKA", "()I", "f", "[F", "g", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: q1.h  reason: case insensitive filesystem */
public class C5781h {

    /* renamed from: g  reason: collision with root package name */
    public static final a f27688g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C5776c f27689a;

    /* renamed from: b  reason: collision with root package name */
    private final C5776c f27690b;

    /* renamed from: c  reason: collision with root package name */
    private final C5776c f27691c;

    /* renamed from: d  reason: collision with root package name */
    private final C5776c f27692d;

    /* renamed from: e  reason: collision with root package name */
    private final int f27693e;

    /* renamed from: f  reason: collision with root package name */
    private final float[] f27694f;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lq1/h$a;", "", "<init>", "()V", "Lq1/c;", "source", "destination", "Lq1/n;", "intent", "", "b", "(Lq1/c;Lq1/c;I)[F", "Lq1/h;", "c", "(Lq1/c;)Lq1/h;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: q1.h$a */
    public static final class a {

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0010ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"q1/h$a$a", "Lq1/h;", "Lp1/v0;", "color", "a", "(J)J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: q1.h$a$a  reason: collision with other inner class name */
        public static final class C0445a extends C5781h {
            C0445a(C5776c cVar, int i10) {
                super(cVar, cVar, i10, (DefaultConstructorMarker) null);
            }

            public long a(long j10) {
                return j10;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final float[] b(C5776c cVar, C5776c cVar2, int i10) {
            if (!C5787n.e(i10, C5787n.f27716a.a())) {
                return null;
            }
            long g10 = cVar.g();
            C5775b.a aVar = C5775b.f27655a;
            boolean e10 = C5775b.e(g10, aVar.b());
            boolean e11 = C5775b.e(cVar2.g(), aVar.b());
            if (e10 && e11) {
                return null;
            }
            if (!e10 && !e11) {
                return null;
            }
            if (!e10) {
                cVar = cVar2;
            }
            C17542s.h(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            x xVar = (x) cVar;
            float[] c10 = e10 ? xVar.R().c() : C5784k.f27699a.c();
            float[] c11 = e11 ? xVar.R().c() : C5784k.f27699a.c();
            return new float[]{c10[0] / c11[0], c10[1] / c11[1], c10[2] / c11[2]};
        }

        public final C5781h c(C5776c cVar) {
            return new C0445a(cVar, C5787n.f27716a.c());
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lq1/h$b;", "Lq1/h;", "Lq1/x;", "mSource", "mDestination", "Lq1/n;", "intent", "<init>", "(Lq1/x;Lq1/x;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "source", "destination", "", "b", "(Lq1/x;Lq1/x;I)[F", "Lp1/v0;", "color", "a", "(J)J", "h", "Lq1/x;", "i", "j", "[F", "mTransform", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: q1.h$b */
    public static final class b extends C5781h {

        /* renamed from: h  reason: collision with root package name */
        private final x f27695h;

        /* renamed from: i  reason: collision with root package name */
        private final x f27696i;

        /* renamed from: j  reason: collision with root package name */
        private final float[] f27697j;

        public /* synthetic */ b(x xVar, x xVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(xVar, xVar2, i10);
        }

        private final float[] b(x xVar, x xVar2, int i10) {
            if (C5777d.f(xVar.R(), xVar2.R())) {
                return C5777d.l(xVar2.K(), xVar.Q());
            }
            float[] Q10 = xVar.Q();
            float[] K10 = xVar2.K();
            float[] c10 = xVar.R().c();
            float[] c11 = xVar2.R().c();
            z R10 = xVar.R();
            C5784k kVar = C5784k.f27699a;
            if (!C5777d.f(R10, kVar.b())) {
                float[] b10 = C5774a.f27650b.a().b();
                float[] c12 = kVar.c();
                float[] copyOf = Arrays.copyOf(c12, c12.length);
                C17542s.i(copyOf, "copyOf(this, size)");
                Q10 = C5777d.l(C5777d.e(b10, c10, copyOf), xVar.Q());
            }
            if (!C5777d.f(xVar2.R(), kVar.b())) {
                float[] b11 = C5774a.f27650b.a().b();
                float[] c13 = kVar.c();
                float[] copyOf2 = Arrays.copyOf(c13, c13.length);
                C17542s.i(copyOf2, "copyOf(this, size)");
                K10 = C5777d.k(C5777d.l(C5777d.e(b11, c11, copyOf2), xVar2.Q()));
            }
            if (C5787n.e(i10, C5787n.f27716a.a())) {
                Q10 = C5777d.m(new float[]{c10[0] / c11[0], c10[1] / c11[1], c10[2] / c11[2]}, Q10);
            }
            return C5777d.l(K10, Q10);
        }

        public long a(long j10) {
            float v10 = C5747v0.v(j10);
            float u10 = C5747v0.u(j10);
            float s10 = C5747v0.s(j10);
            float r10 = C5747v0.r(j10);
            float a10 = (float) this.f27695h.I().a((double) v10);
            float a11 = (float) this.f27695h.I().a((double) u10);
            float a12 = (float) this.f27695h.I().a((double) s10);
            float[] fArr = this.f27697j;
            return C5751x0.a((float) this.f27696i.M().a((double) ((fArr[0] * a10) + (fArr[3] * a11) + (fArr[6] * a12))), (float) this.f27696i.M().a((double) ((fArr[1] * a10) + (fArr[4] * a11) + (fArr[7] * a12))), (float) this.f27696i.M().a((double) ((fArr[2] * a10) + (fArr[5] * a11) + (fArr[8] * a12))), r10, this.f27696i);
        }

        private b(x xVar, x xVar2, int i10) {
            super(xVar, xVar2, xVar, xVar2, i10, (float[]) null, (DefaultConstructorMarker) null);
            this.f27695h = xVar;
            this.f27696i = xVar2;
            this.f27697j = b(xVar, xVar2, i10);
        }
    }

    public /* synthetic */ C5781h(C5776c cVar, C5776c cVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, i10);
    }

    public long a(long j10) {
        float v10 = C5747v0.v(j10);
        float u10 = C5747v0.u(j10);
        float s10 = C5747v0.s(j10);
        float r10 = C5747v0.r(j10);
        long j11 = this.f27691c.j(v10, u10, s10);
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        float m10 = this.f27691c.m(v10, u10, s10);
        float[] fArr = this.f27694f;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            m10 *= fArr[2];
        }
        float f10 = intBitsToFloat;
        return this.f27692d.n(f10, intBitsToFloat2, m10, r10, this.f27690b);
    }

    public /* synthetic */ C5781h(C5776c cVar, C5776c cVar2, C5776c cVar3, C5776c cVar4, int i10, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, cVar3, cVar4, i10, fArr);
    }

    private C5781h(C5776c cVar, C5776c cVar2, C5776c cVar3, C5776c cVar4, int i10, float[] fArr) {
        this.f27689a = cVar;
        this.f27690b = cVar2;
        this.f27691c = cVar3;
        this.f27692d = cVar4;
        this.f27693e = i10;
        this.f27694f = fArr;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C5781h(q1.C5776c r13, q1.C5776c r14, int r15) {
        /*
            r12 = this;
            long r0 = r13.g()
            q1.b$a r2 = q1.C5775b.f27655a
            long r3 = r2.b()
            boolean r0 = q1.C5775b.e(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L_0x001e
            q1.k r0 = q1.C5784k.f27699a
            q1.z r0 = r0.b()
            q1.c r0 = q1.C5777d.d(r13, r0, r3, r1, r3)
            r7 = r0
            goto L_0x001f
        L_0x001e:
            r7 = r13
        L_0x001f:
            long r4 = r14.g()
            long r8 = r2.b()
            boolean r0 = q1.C5775b.e(r4, r8)
            if (r0 == 0) goto L_0x0039
            q1.k r0 = q1.C5784k.f27699a
            q1.z r0 = r0.b()
            q1.c r0 = q1.C5777d.d(r14, r0, r3, r1, r3)
            r8 = r0
            goto L_0x003a
        L_0x0039:
            r8 = r14
        L_0x003a:
            q1.h$a r0 = f27688g
            float[] r10 = r0.b(r13, r14, r15)
            r11 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.C5781h.<init>(q1.c, q1.c, int):void");
    }
}
