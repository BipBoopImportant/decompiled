package j0;

import XH.C16801H;
import YH.C16870n;
import k0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001e¨\u0006 "}, d2 = {"Lj0/I;", "Lj0/w;", "", "initialCapacity", "<init>", "(I)V", "LXH/N;", "k", "capacity", "j", "i", "()V", "index", "n", "", "element", "g", "(J)I", "hash1", "h", "(I)I", "e", "f", "newCapacity", "o", "l", "(J)V", "", "m", "(J)Z", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class I extends C5466w {

    /* renamed from: e  reason: collision with root package name */
    private int f24524e;

    public I(int i10) {
        super((DefaultConstructorMarker) null);
        if (!(i10 >= 0)) {
            d.a("Capacity must be a positive value.");
        }
        k(Y.g(i10));
    }

    private final void e() {
        if (this.f24659c <= 8 || Long.compareUnsigned(C16801H.b(C16801H.b((long) this.f24660d) * 32), C16801H.b(C16801H.b((long) this.f24659c) * 25)) > 0) {
            o(Y.e(this.f24659c));
        } else {
            f();
        }
    }

    private final void f() {
        int i10;
        long[] jArr = this.f24657a;
        int i11 = this.f24659c;
        long[] jArr2 = this.f24658b;
        Y.a(jArr, i11);
        char c10 = 0;
        int i12 = 0;
        int i13 = -1;
        while (i12 != i11) {
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = (jArr[i14] >> i15) & 255;
            if (j10 == 128) {
                i13 = i12;
                i12++;
            } else {
                if (j10 == 254) {
                    int hashCode = Long.hashCode(jArr2[i12]) * -862048943;
                    int i16 = hashCode ^ (hashCode << 16);
                    int i17 = i16 >>> 7;
                    int h10 = h(i17);
                    int i18 = i17 & i11;
                    if (((h10 - i18) & i11) / 8 == ((i12 - i18) & i11) / 8) {
                        jArr[i14] = (((long) (i16 & 127)) << i15) | ((~(255 << i15)) & jArr[i14]);
                        jArr[C16870n.m0(jArr)] = (jArr[c10] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i19 = h10 >> 3;
                        long j11 = jArr[i19];
                        int i20 = (h10 & 7) << 3;
                        if (((j11 >> i20) & 255) == 128) {
                            int i21 = i12;
                            jArr[i19] = (((long) (i16 & 127)) << i20) | (j11 & (~(255 << i20)));
                            jArr[i14] = (jArr[i14] & (~(255 << i15))) | (128 << i15);
                            jArr2[h10] = jArr2[i21];
                            jArr2[i21] = 0;
                            i10 = i21;
                            i13 = i10;
                        } else {
                            int i22 = i12;
                            jArr[i19] = (((long) (i16 & 127)) << i20) | (j11 & (~(255 << i20)));
                            if (i13 == -1) {
                                i13 = Y.b(jArr, i22 + 1, i11);
                            }
                            jArr2[i13] = jArr2[h10];
                            jArr2[h10] = jArr2[i22];
                            jArr2[i22] = jArr2[i13];
                            i10 = i22 - 1;
                        }
                        jArr[C16870n.m0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i12 = i10 + 1;
                        c10 = 0;
                    }
                }
                i12++;
            }
        }
        i();
    }

    private final int g(long j10) {
        int hashCode = Long.hashCode(j10) * -862048943;
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f24659c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f24657a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-((long) i17)) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (long) i12;
            int i18 = i15;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & -9187201950435737472L; j14 != 0; j14 &= j14 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                if (this.f24658b[numberOfTrailingZeros] == j10) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & -9187201950435737472L) != 0) {
                int h10 = h(i11);
                if (this.f24524e == 0 && ((this.f24657a[h10 >> 3] >> ((h10 & 7) << 3)) & 255) != 254) {
                    e();
                    h10 = h(i11);
                }
                this.f24660d++;
                int i19 = this.f24524e;
                long[] jArr2 = this.f24657a;
                int i20 = h10 >> 3;
                long j15 = jArr2[i20];
                int i21 = (h10 & 7) << 3;
                this.f24524e = i19 - (((j15 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f24659c;
                long j16 = ((~(255 << i21)) & j15) | (j12 << i21);
                jArr2[i20] = j16;
                jArr2[(((h10 - 7) & i22) + (i22 & 7)) >> 3] = j16;
                return h10;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final int h(int i10) {
        int i11 = this.f24659c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f24657a;
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

    private final void i() {
        this.f24524e = Y.c(b()) - this.f24660d;
    }

    private final void j(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = Y.f24573a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C16870n.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f24657a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        i();
    }

    private final void k(int i10) {
        int max = i10 > 0 ? Math.max(7, Y.f(i10)) : 0;
        this.f24659c = max;
        j(max);
        this.f24658b = new long[max];
    }

    private final void n(int i10) {
        this.f24660d--;
        long[] jArr = this.f24657a;
        int i11 = this.f24659c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    private final void o(int i10) {
        long[] jArr = this.f24657a;
        long[] jArr2 = this.f24658b;
        int i11 = this.f24659c;
        k(i10);
        long[] jArr3 = this.f24657a;
        long[] jArr4 = this.f24658b;
        int i12 = this.f24659c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j10 = jArr2[i13];
                int hashCode = Long.hashCode(j10) * -862048943;
                int i14 = hashCode ^ (hashCode << 16);
                int h10 = h(i14 >>> 7);
                long j11 = (long) (i14 & 127);
                int i15 = h10 >> 3;
                int i16 = (h10 & 7) << 3;
                long j12 = (jArr3[i15] & (~(255 << i16))) | (j11 << i16);
                jArr3[i15] = j12;
                jArr3[(((h10 - 7) & i12) + (i12 & 7)) >> 3] = j12;
                jArr4[h10] = j10;
            }
        }
    }

    public final void l(long j10) {
        this.f24658b[g(j10)] = j10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0066, code lost:
        if (((r6 & ((~r6) << 6)) & -9187201950435737472L) == 0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0068, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = java.lang.Long.hashCode(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f24659c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L_0x0016:
            long[] r6 = r0.f24657a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L_0x0042:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x005f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.f24658b
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L_0x0059
            goto L_0x0069
        L_0x0059:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L_0x0042
        L_0x005f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0072
            r10 = -1
        L_0x0069:
            if (r10 < 0) goto L_0x006c
            r4 = r11
        L_0x006c:
            if (r4 == 0) goto L_0x0071
            r0.n(r10)
        L_0x0071:
            return r4
        L_0x0072:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.I.m(long):boolean");
    }
}
