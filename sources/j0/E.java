package j0;

import XH.C16801H;
import YH.C16870n;
import k0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J \u0010\u0017\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001d\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001e\u0010\u001cJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\fR\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lj0/E;", "V", "Lj0/o;", "", "initialCapacity", "<init>", "(I)V", "LXH/N;", "o", "capacity", "n", "m", "()V", "key", "k", "(I)I", "hash1", "l", "h", "j", "newCapacity", "s", "value", "t", "(ILjava/lang/Object;)V", "p", "(ILjava/lang/Object;)Ljava/lang/Object;", "q", "(I)Ljava/lang/Object;", "index", "r", "i", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class E<V> extends C5459o<V> {

    /* renamed from: f  reason: collision with root package name */
    private int f24520f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void h() {
        if (this.f24636d <= 8 || Long.compareUnsigned(C16801H.b(C16801H.b((long) this.f24637e) * 32), C16801H.b(C16801H.b((long) this.f24636d) * 25)) > 0) {
            s(Y.e(this.f24636d));
        } else {
            j();
        }
    }

    private final void j() {
        int[] iArr;
        int i10;
        int i11;
        long[] jArr = this.f24633a;
        int i12 = this.f24636d;
        int[] iArr2 = this.f24634b;
        Object[] objArr = this.f24635c;
        Y.a(jArr, i12);
        char c10 = 0;
        int i13 = 0;
        int i14 = -1;
        while (i13 != i12) {
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = (jArr[i15] >> i16) & 255;
            if (j10 == 128) {
                i14 = i13;
                i13++;
            } else {
                if (j10 == 254) {
                    int hashCode = Integer.hashCode(iArr2[i13]) * -862048943;
                    int i17 = hashCode ^ (hashCode << 16);
                    int i18 = i17 >>> 7;
                    int l10 = l(i18);
                    int i19 = i18 & i12;
                    if (((l10 - i19) & i12) / 8 == ((i13 - i19) & i12) / 8) {
                        jArr[i15] = (((long) (i17 & 127)) << i16) | ((~(255 << i16)) & jArr[i15]);
                        jArr[C16870n.m0(jArr)] = (jArr[c10] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i20 = l10 >> 3;
                        long j11 = jArr[i20];
                        int i21 = (l10 & 7) << 3;
                        if (((j11 >> i21) & 255) == 128) {
                            int i22 = i13;
                            iArr = iArr2;
                            jArr[i20] = (j11 & (~(255 << i21))) | (((long) (i17 & 127)) << i21);
                            jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                            iArr[l10] = iArr[i22];
                            iArr[i22] = 0;
                            objArr[l10] = objArr[i22];
                            objArr[i22] = null;
                            i10 = i22;
                            i14 = i10;
                            i11 = i12;
                        } else {
                            int i23 = i12;
                            iArr = iArr2;
                            int i24 = i13;
                            jArr[i20] = (((long) (i17 & 127)) << i21) | (j11 & (~(255 << i21)));
                            if (i14 == -1) {
                                i11 = i23;
                                i14 = Y.b(jArr, i24 + 1, i11);
                            } else {
                                i11 = i23;
                            }
                            iArr[i14] = iArr[l10];
                            iArr[l10] = iArr[i24];
                            iArr[i24] = iArr[i14];
                            objArr[i14] = objArr[l10];
                            objArr[l10] = objArr[i24];
                            objArr[i24] = objArr[i14];
                            i10 = i24 - 1;
                        }
                        c10 = 0;
                        jArr[C16870n.m0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i13 = i10 + 1;
                        i12 = i11;
                        iArr2 = iArr;
                    }
                }
                i13++;
            }
        }
        m();
    }

    private final int k(int i10) {
        int hashCode = Integer.hashCode(i10) * -862048943;
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f24636d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f24633a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-((long) i18)) >> 63)) | (jArr[i17] >>> i18);
            long j11 = (long) i13;
            int i19 = i16;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & -9187201950435737472L; j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                if (this.f24634b[numberOfTrailingZeros] == i10) {
                    return numberOfTrailingZeros;
                }
            }
            int i20 = i10;
            if ((((~j10) << 6) & j10 & -9187201950435737472L) != 0) {
                int l10 = l(i12);
                if (this.f24520f == 0 && ((this.f24633a[l10 >> 3] >> ((l10 & 7) << 3)) & 255) != 254) {
                    h();
                    l10 = l(i12);
                }
                this.f24637e++;
                int i21 = this.f24520f;
                long[] jArr2 = this.f24633a;
                int i22 = l10 >> 3;
                long j14 = jArr2[i22];
                int i23 = (l10 & 7) << 3;
                this.f24520f = i21 - (((j14 >> i23) & 255) == 128 ? 1 : 0);
                int i24 = this.f24636d;
                long j15 = ((~(255 << i23)) & j14) | (j11 << i23);
                jArr2[i22] = j15;
                jArr2[(((l10 - 7) & i24) + (i24 & 7)) >> 3] = j15;
                return l10;
            }
            i16 = i19 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final int l(int i10) {
        int i11 = this.f24636d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f24633a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-((long) i15)) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & -9187201950435737472L;
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final void m() {
        this.f24520f = Y.c(d()) - this.f24637e;
    }

    private final void n(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = Y.f24573a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C16870n.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f24633a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        m();
    }

    private final void o(int i10) {
        int max = i10 > 0 ? Math.max(7, Y.f(i10)) : 0;
        this.f24636d = max;
        n(max);
        this.f24634b = new int[max];
        this.f24635c = new Object[max];
    }

    private final void s(int i10) {
        long[] jArr;
        E e10 = this;
        long[] jArr2 = e10.f24633a;
        int[] iArr = e10.f24634b;
        Object[] objArr = e10.f24635c;
        int i11 = e10.f24636d;
        o(i10);
        long[] jArr3 = e10.f24633a;
        int[] iArr2 = e10.f24634b;
        Object[] objArr2 = e10.f24635c;
        int i12 = e10.f24636d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int hashCode = Integer.hashCode(i14) * -862048943;
                int i15 = hashCode ^ (hashCode << 16);
                int l10 = e10.l(i15 >>> 7);
                long j10 = (long) (i15 & 127);
                int i16 = l10 >> 3;
                int i17 = (l10 & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i16] & (~(255 << i17))) | (j10 << i17);
                jArr3[i16] = j11;
                jArr3[(((l10 - 7) & i12) + (i12 & 7)) >> 3] = j11;
                iArr2[l10] = i14;
                objArr2[l10] = objArr[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            e10 = this;
            jArr2 = jArr;
        }
    }

    public final void i() {
        this.f24637e = 0;
        long[] jArr = this.f24633a;
        if (jArr != Y.f24573a) {
            C16870n.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f24633a;
            int i10 = this.f24636d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        C16870n.x(this.f24635c, null, 0, this.f24636d);
        m();
    }

    public final V p(int i10, V v10) {
        int k10 = k(i10);
        V[] vArr = this.f24635c;
        V v11 = vArr[k10];
        this.f24634b[k10] = i10;
        vArr[k10] = v10;
        return v11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0061, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0063, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V q(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f24636d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L_0x0013:
            long[] r4 = r13.f24633a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L_0x003f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x005a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f24634b
            r11 = r11[r10]
            if (r11 != r14) goto L_0x0054
            goto L_0x0064
        L_0x0054:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L_0x003f
        L_0x005a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x006d
            r10 = -1
        L_0x0064:
            if (r10 < 0) goto L_0x006b
            java.lang.Object r14 = r13.r(r10)
            return r14
        L_0x006b:
            r14 = 0
            return r14
        L_0x006d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.E.q(int):java.lang.Object");
    }

    public final V r(int i10) {
        this.f24637e--;
        long[] jArr = this.f24633a;
        int i11 = this.f24636d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        V[] vArr = this.f24635c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        return v10;
    }

    public final void t(int i10, V v10) {
        int k10 = k(i10);
        this.f24634b[k10] = i10;
        this.f24635c[k10] = v10;
    }

    public E(int i10) {
        super((DefaultConstructorMarker) null);
        if (!(i10 >= 0)) {
            d.a("Capacity must be a positive value.");
        }
        o(Y.g(i10));
    }
}
