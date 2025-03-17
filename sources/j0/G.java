package j0;

import XH.C16801H;
import YH.C16870n;
import k0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J \u0010\u0018\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a¨\u0006\u001c"}, d2 = {"Lj0/G;", "Lj0/s;", "", "initialCapacity", "<init>", "(I)V", "LXH/N;", "l", "capacity", "k", "j", "()V", "", "key", "i", "(J)I", "hash1", "h", "(I)I", "f", "g", "newCapacity", "m", "value", "n", "(JI)V", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class G extends C5462s {

    /* renamed from: f  reason: collision with root package name */
    private int f24522f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void f() {
        if (this.f24648d <= 8 || Long.compareUnsigned(C16801H.b(C16801H.b((long) this.f24649e) * 32), C16801H.b(C16801H.b((long) this.f24648d) * 25)) > 0) {
            m(Y.e(this.f24648d));
        } else {
            g();
        }
    }

    private final void g() {
        long[] jArr;
        int i10;
        int i11;
        long[] jArr2 = this.f24645a;
        int i12 = this.f24648d;
        long[] jArr3 = this.f24646b;
        int[] iArr = this.f24647c;
        Y.a(jArr2, i12);
        char c10 = 0;
        int i13 = 0;
        int i14 = -1;
        while (i13 != i12) {
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = (jArr2[i15] >> i16) & 255;
            if (j10 == 128) {
                i14 = i13;
                i13++;
            } else {
                if (j10 == 254) {
                    int hashCode = Long.hashCode(jArr3[i13]) * -862048943;
                    int i17 = hashCode ^ (hashCode << 16);
                    int i18 = i17 >>> 7;
                    int h10 = h(i18);
                    int i19 = i18 & i12;
                    if (((h10 - i19) & i12) / 8 == ((i13 - i19) & i12) / 8) {
                        jArr2[i15] = (((long) (i17 & 127)) << i16) | ((~(255 << i16)) & jArr2[i15]);
                        jArr2[C16870n.m0(jArr2)] = (jArr2[c10] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i20 = h10 >> 3;
                        long j11 = jArr2[i20];
                        int i21 = (h10 & 7) << 3;
                        if (((j11 >> i21) & 255) == 128) {
                            int i22 = i13;
                            jArr = jArr3;
                            jArr2[i20] = (j11 & (~(255 << i21))) | (((long) (i17 & 127)) << i21);
                            jArr2[i15] = (jArr2[i15] & (~(255 << i16))) | (128 << i16);
                            jArr[h10] = jArr[i22];
                            jArr[i22] = 0;
                            iArr[h10] = iArr[i22];
                            iArr[i22] = 0;
                            i10 = i22;
                            i14 = i10;
                            i11 = i12;
                        } else {
                            int i23 = i12;
                            jArr = jArr3;
                            int i24 = i13;
                            jArr2[i20] = (((long) (i17 & 127)) << i21) | (j11 & (~(255 << i21)));
                            if (i14 == -1) {
                                i11 = i23;
                                i14 = Y.b(jArr2, i24 + 1, i11);
                            } else {
                                i11 = i23;
                            }
                            jArr[i14] = jArr[h10];
                            jArr[h10] = jArr[i24];
                            jArr[i24] = jArr[i14];
                            iArr[i14] = iArr[h10];
                            iArr[h10] = iArr[i24];
                            iArr[i24] = iArr[i14];
                            i10 = i24 - 1;
                        }
                        c10 = 0;
                        jArr2[C16870n.m0(jArr2)] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i13 = i10 + 1;
                        i12 = i11;
                        jArr3 = jArr;
                    }
                }
                i13++;
            }
        }
        j();
    }

    private final int h(int i10) {
        int i11 = this.f24648d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f24645a;
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

    private final int i(long j10) {
        int hashCode = Long.hashCode(j10) * -862048943;
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f24648d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f24645a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-((long) i17)) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (long) i12;
            int i18 = i15;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & -9187201950435737472L; j14 != 0; j14 &= j14 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                if (this.f24646b[numberOfTrailingZeros] == j10) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & -9187201950435737472L) != 0) {
                int h10 = h(i11);
                if (this.f24522f == 0 && ((this.f24645a[h10 >> 3] >> ((h10 & 7) << 3)) & 255) != 254) {
                    f();
                    h10 = h(i11);
                }
                this.f24649e++;
                int i19 = this.f24522f;
                long[] jArr2 = this.f24645a;
                int i20 = h10 >> 3;
                long j15 = jArr2[i20];
                int i21 = (h10 & 7) << 3;
                this.f24522f = i19 - (((j15 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f24648d;
                long j16 = ((~(255 << i21)) & j15) | (j12 << i21);
                jArr2[i20] = j16;
                jArr2[(((h10 - 7) & i22) + (i22 & 7)) >> 3] = j16;
                return ~h10;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final void j() {
        this.f24522f = Y.c(c()) - this.f24649e;
    }

    private final void k(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = Y.f24573a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C16870n.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f24645a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        j();
    }

    private final void l(int i10) {
        int max = i10 > 0 ? Math.max(7, Y.f(i10)) : 0;
        this.f24648d = max;
        k(max);
        this.f24646b = new long[max];
        this.f24647c = new int[max];
    }

    private final void m(int i10) {
        long[] jArr;
        G g10 = this;
        long[] jArr2 = g10.f24645a;
        long[] jArr3 = g10.f24646b;
        int[] iArr = g10.f24647c;
        int i11 = g10.f24648d;
        l(i10);
        long[] jArr4 = g10.f24645a;
        long[] jArr5 = g10.f24646b;
        int[] iArr2 = g10.f24647c;
        int i12 = g10.f24648d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j10 = jArr3[i13];
                int hashCode = Long.hashCode(j10) * -862048943;
                int i14 = hashCode ^ (hashCode << 16);
                int h10 = g10.h(i14 >>> 7);
                long j11 = (long) (i14 & 127);
                int i15 = h10 >> 3;
                int i16 = (h10 & 7) << 3;
                jArr = jArr2;
                long j12 = (jArr4[i15] & (~(255 << i16))) | (j11 << i16);
                jArr4[i15] = j12;
                jArr4[(((h10 - 7) & i12) + (i12 & 7)) >> 3] = j12;
                jArr5[h10] = j10;
                iArr2[h10] = iArr[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            g10 = this;
            jArr2 = jArr;
        }
    }

    public final void n(long j10, int i10) {
        int i11 = i(j10);
        if (i11 < 0) {
            i11 = ~i11;
        }
        this.f24646b[i11] = j10;
        this.f24647c[i11] = i10;
    }

    public G(int i10) {
        super((DefaultConstructorMarker) null);
        if (!(i10 >= 0)) {
            d.a("Capacity must be a positive value.");
        }
        l(Y.g(i10));
    }
}
