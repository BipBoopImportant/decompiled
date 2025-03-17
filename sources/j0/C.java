package j0;

import XH.C16801H;
import YH.C16870n;
import k0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J \u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u000bR\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lj0/C;", "Lj0/k;", "", "initialCapacity", "<init>", "(I)V", "LXH/N;", "o", "capacity", "n", "m", "()V", "key", "l", "(I)I", "hash1", "k", "h", "j", "newCapacity", "p", "value", "q", "(II)V", "i", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C extends C5455k {

    /* renamed from: f  reason: collision with root package name */
    private int f24519f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void h() {
        if (this.f24627d <= 8 || Long.compareUnsigned(C16801H.b(C16801H.b((long) this.f24628e) * 32), C16801H.b(C16801H.b((long) this.f24627d) * 25)) > 0) {
            p(Y.e(this.f24627d));
        } else {
            j();
        }
    }

    private final void j() {
        int[] iArr;
        int i10;
        int i11;
        long[] jArr = this.f24624a;
        int i12 = this.f24627d;
        int[] iArr2 = this.f24625b;
        int[] iArr3 = this.f24626c;
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
                    int k10 = k(i18);
                    int i19 = i18 & i12;
                    if (((k10 - i19) & i12) / 8 == ((i13 - i19) & i12) / 8) {
                        jArr[i15] = (((long) (i17 & 127)) << i16) | ((~(255 << i16)) & jArr[i15]);
                        jArr[C16870n.m0(jArr)] = (jArr[c10] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i20 = k10 >> 3;
                        long j11 = jArr[i20];
                        int i21 = (k10 & 7) << 3;
                        if (((j11 >> i21) & 255) == 128) {
                            int i22 = i13;
                            iArr = iArr2;
                            jArr[i20] = (j11 & (~(255 << i21))) | (((long) (i17 & 127)) << i21);
                            jArr[i15] = (jArr[i15] & (~(255 << i16))) | (128 << i16);
                            iArr[k10] = iArr[i22];
                            iArr[i22] = 0;
                            iArr3[k10] = iArr3[i22];
                            iArr3[i22] = 0;
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
                            iArr[i14] = iArr[k10];
                            iArr[k10] = iArr[i24];
                            iArr[i24] = iArr[i14];
                            iArr3[i14] = iArr3[k10];
                            iArr3[k10] = iArr3[i24];
                            iArr3[i24] = iArr3[i14];
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
        int i11 = this.f24627d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f24624a;
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

    private final int l(int i10) {
        int hashCode = Integer.hashCode(i10) * -862048943;
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f24627d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f24624a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-((long) i18)) >> 63)) | (jArr[i17] >>> i18);
            long j11 = (long) i13;
            int i19 = i16;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & -9187201950435737472L; j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                if (this.f24625b[numberOfTrailingZeros] == i10) {
                    return numberOfTrailingZeros;
                }
            }
            int i20 = i10;
            if ((((~j10) << 6) & j10 & -9187201950435737472L) != 0) {
                int k10 = k(i12);
                if (this.f24519f == 0 && ((this.f24624a[k10 >> 3] >> ((k10 & 7) << 3)) & 255) != 254) {
                    h();
                    k10 = k(i12);
                }
                this.f24628e++;
                int i21 = this.f24519f;
                long[] jArr2 = this.f24624a;
                int i22 = k10 >> 3;
                long j14 = jArr2[i22];
                int i23 = (k10 & 7) << 3;
                this.f24519f = i21 - (((j14 >> i23) & 255) == 128 ? 1 : 0);
                int i24 = this.f24627d;
                long j15 = ((~(255 << i23)) & j14) | (j11 << i23);
                jArr2[i22] = j15;
                jArr2[(((k10 - 7) & i24) + (i24 & 7)) >> 3] = j15;
                return ~k10;
            }
            i16 = i19 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final void m() {
        this.f24519f = Y.c(d()) - this.f24628e;
    }

    private final void n(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = Y.f24573a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C16870n.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f24624a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        m();
    }

    private final void o(int i10) {
        int max = i10 > 0 ? Math.max(7, Y.f(i10)) : 0;
        this.f24627d = max;
        n(max);
        this.f24625b = new int[max];
        this.f24626c = new int[max];
    }

    private final void p(int i10) {
        long[] jArr;
        C c10 = this;
        long[] jArr2 = c10.f24624a;
        int[] iArr = c10.f24625b;
        int[] iArr2 = c10.f24626c;
        int i11 = c10.f24627d;
        o(i10);
        long[] jArr3 = c10.f24624a;
        int[] iArr3 = c10.f24625b;
        int[] iArr4 = c10.f24626c;
        int i12 = c10.f24627d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int hashCode = Integer.hashCode(i14) * -862048943;
                int i15 = hashCode ^ (hashCode << 16);
                int k10 = c10.k(i15 >>> 7);
                long j10 = (long) (i15 & 127);
                int i16 = k10 >> 3;
                int i17 = (k10 & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i16] & (~(255 << i17))) | (j10 << i17);
                jArr3[i16] = j11;
                jArr3[(((k10 - 7) & i12) + (i12 & 7)) >> 3] = j11;
                iArr3[k10] = i14;
                iArr4[k10] = iArr2[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            c10 = this;
            jArr2 = jArr;
        }
    }

    public final void i() {
        this.f24628e = 0;
        long[] jArr = this.f24624a;
        if (jArr != Y.f24573a) {
            C16870n.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f24624a;
            int i10 = this.f24627d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        m();
    }

    public final void q(int i10, int i11) {
        int l10 = l(i10);
        if (l10 < 0) {
            l10 = ~l10;
        }
        this.f24625b[l10] = i10;
        this.f24626c[l10] = i11;
    }

    public C(int i10) {
        super((DefaultConstructorMarker) null);
        if (!(i10 >= 0)) {
            d.a("Capacity must be a positive value.");
        }
        o(Y.g(i10));
    }
}
