package m6;

import QJ.C0;
import T5.r;
import X5.C6722g;
import X5.C6723h;
import X5.C6724i;
import X5.s;
import Z5.o;
import dI.C17164e;
import dI.C17169j;
import k6.C8450q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\rB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lm6/d;", "LX5/i;", "LX5/s;", "source", "Lk6/q;", "options", "", "useViewBoundsAsIntrinsicSize", "renderToBitmap", "scaleToDensity", "<init>", "(LX5/s;Lk6/q;ZZZ)V", "LX5/g;", "a", "(LdI/e;)Ljava/lang/Object;", "LX5/s;", "b", "Lk6/q;", "c", "Z", "getUseViewBoundsAsIntrinsicSize", "()Z", "d", "getRenderToBitmap", "e", "getScaleToDensity", "coil-svg_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: m6.d  reason: case insensitive filesystem */
public final class C8556d implements C6724i {

    /* renamed from: a  reason: collision with root package name */
    private final s f55007a;

    /* renamed from: b  reason: collision with root package name */
    private final C8450q f55008b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f55009c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f55010d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f55011e;

    public C8556d(s sVar, C8450q qVar, boolean z10, boolean z11, boolean z12) {
        this.f55007a = sVar;
        this.f55008b = qVar;
        this.f55009c = z10;
        this.f55010d = z11;
        this.f55011e = z12;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X5.C6722g c(m6.C8556d r17) {
        /*
            r1 = r17
            r2 = 2
            r3 = 0
            r4 = 3
            r5 = 1
            X5.s r0 = r1.f55007a
            WK.g r6 = r0.k3()
            n6.b r8 = n6.C8584d.a(r6)     // Catch:{ all -> 0x001a }
            if (r6 == 0) goto L_0x0018
            r6.close()     // Catch:{ all -> 0x0016 }
            goto L_0x0018
        L_0x0016:
            r0 = move-exception
            goto L_0x0029
        L_0x0018:
            r0 = 0
            goto L_0x0029
        L_0x001a:
            r0 = move-exception
            r8 = r0
            if (r6 == 0) goto L_0x0027
            r6.close()     // Catch:{ all -> 0x0022 }
            goto L_0x0027
        L_0x0022:
            r0 = move-exception
            r6 = r0
            XH.C16816g.a(r8, r6)
        L_0x0027:
            r0 = r8
            r8 = 0
        L_0x0029:
            if (r0 != 0) goto L_0x00f1
            float[] r0 = r8.d()
            boolean r6 = r1.f55009c
            if (r6 == 0) goto L_0x0040
            if (r0 == 0) goto L_0x0040
            r6 = r0[r2]
            r9 = r0[r3]
            float r6 = r6 - r9
            r9 = r0[r4]
            r10 = r0[r5]
            float r9 = r9 - r10
            goto L_0x0048
        L_0x0040:
            float r6 = r8.getWidth()
            float r9 = r8.getHeight()
        L_0x0048:
            boolean r10 = r1.f55011e
            r11 = 0
            if (r10 == 0) goto L_0x006d
            k6.q r10 = r1.f55008b
            l6.h r10 = r10.k()
            boolean r10 = l6.i.b(r10)
            if (r10 == 0) goto L_0x006d
            k6.q r10 = r1.f55008b
            android.content.Context r10 = r10.c()
            float r10 = n6.C8586f.a(r10)
            int r12 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r12 <= 0) goto L_0x0068
            float r6 = r6 * r10
        L_0x0068:
            int r12 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r12 <= 0) goto L_0x006d
            float r9 = r9 * r10
        L_0x006d:
            int r10 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            r12 = 512(0x200, float:7.175E-43)
            if (r10 <= 0) goto L_0x0078
            int r13 = pI.C17752b.e(r6)
            goto L_0x0079
        L_0x0078:
            r13 = r12
        L_0x0079:
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 <= 0) goto L_0x0081
            int r12 = pI.C17752b.e(r9)
        L_0x0081:
            k6.q r15 = r1.f55008b
            l6.h r15 = r15.k()
            k6.q r7 = r1.f55008b
            l6.f r7 = r7.j()
            k6.q r4 = r1.f55008b
            l6.h r4 = k6.C8442i.e(r4)
            long r12 = X5.C6723h.b(r13, r12, r15, r7, r4)
            int r4 = r6.p.c(r12)
            int r7 = r6.p.d(r12)
            if (r10 <= 0) goto L_0x00ca
            if (r14 <= 0) goto L_0x00ca
            float r4 = (float) r4
            float r7 = (float) r7
            k6.q r10 = r1.f55008b
            l6.f r10 = r10.j()
            float r4 = X5.C6723h.e(r6, r9, r4, r7, r10)
            float r7 = r4 * r6
            int r7 = (int) r7
            float r4 = r4 * r9
            int r4 = (int) r4
            if (r0 != 0) goto L_0x00c5
            r0 = 4
            float[] r0 = new float[r0]
            r0[r3] = r11
            r0[r5] = r11
            r0[r2] = r6
            r2 = 3
            r0[r2] = r9
            r8.c(r0)
        L_0x00c5:
            r16 = r7
            r7 = r4
            r4 = r16
        L_0x00ca:
            java.lang.String r0 = "100%"
            r8.a(r0)
            r8.b(r0)
            k6.q r0 = r1.f55008b
            r8.e(r0)
            T5.n r0 = r8.f(r4, r7)
            boolean r2 = r1.f55010d
            if (r2 == 0) goto L_0x00e9
            r2 = 0
            r4 = 3
            android.graphics.Bitmap r0 = T5.u.g(r0, r3, r3, r4, r2)
            T5.a r0 = T5.u.d(r0, r3, r5, r2)
        L_0x00e9:
            X5.g r2 = new X5.g
            boolean r1 = r1.f55010d
            r2.<init>(r0, r1)
            return r2
        L_0x00f1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.C8556d.c(m6.d):X5.g");
    }

    public Object a(C17164e<? super C6722g> eVar) {
        return C0.b(C17169j.f142968a, new C8555c(this), eVar);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lm6/d$a;", "LX5/i$a;", "", "useViewBoundsAsIntrinsicSize", "renderToBitmap", "scaleToDensity", "<init>", "(ZZZ)V", "LZ5/o;", "result", "b", "(LZ5/o;)Z", "Lk6/q;", "options", "LT5/r;", "imageLoader", "LX5/i;", "a", "(LZ5/o;Lk6/q;LT5/r;)LX5/i;", "Z", "getUseViewBoundsAsIntrinsicSize", "()Z", "getRenderToBitmap", "c", "getScaleToDensity", "coil-svg_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: m6.d$a */
    public static final class a implements C6724i.a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f55012a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f55013b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f55014c;

        public a(boolean z10, boolean z11, boolean z12) {
            this.f55012a = z10;
            this.f55013b = z11;
            this.f55014c = z12;
        }

        private final boolean b(o oVar) {
            return C17542s.e(oVar.b(), "image/svg+xml") || C8553a.a(C6723h.f40673a, oVar.c().k3());
        }

        public C6724i a(o oVar, C8450q qVar, r rVar) {
            if (!b(oVar)) {
                return null;
            }
            return new C8556d(oVar.c(), qVar, this.f55012a, this.f55013b, this.f55014c);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? false : z12);
        }
    }
}
