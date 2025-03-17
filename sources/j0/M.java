package j0;

import XH.C16801H;
import YH.C16870n;
import k0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J \u0010\u0019\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lj0/M;", "K", "Lj0/V;", "", "initialCapacity", "<init>", "(I)V", "LXH/N;", "n", "capacity", "m", "l", "()V", "key", "k", "(Ljava/lang/Object;)I", "hash1", "j", "(I)I", "h", "i", "newCapacity", "o", "", "value", "p", "(Ljava/lang/Object;J)V", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class M<K> extends V<K> {

    /* renamed from: f  reason: collision with root package name */
    private int f24527f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void h() {
        if (this.f24565d <= 8 || Long.compareUnsigned(C16801H.b(C16801H.b((long) this.f24566e) * 32), C16801H.b(C16801H.b((long) this.f24565d) * 25)) > 0) {
            o(Y.e(this.f24565d));
        } else {
            i();
        }
    }

    private final void i() {
        Object[] objArr;
        int i10;
        int i11;
        long[] jArr = this.f24562a;
        int i12 = this.f24565d;
        Object[] objArr2 = this.f24563b;
        long[] jArr2 = this.f24564c;
        Y.a(jArr, i12);
        int i13 = 0;
        int i14 = 0;
        int i15 = -1;
        while (i14 != i12) {
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = (jArr[i16] >> i17) & 255;
            if (j10 == 128) {
                i15 = i14;
                i14++;
            } else {
                if (j10 == 254) {
                    Object obj = objArr2[i14];
                    int hashCode = (obj != null ? obj.hashCode() : i13) * -862048943;
                    int i18 = hashCode ^ (hashCode << 16);
                    int i19 = i18 >>> 7;
                    int j11 = j(i19);
                    int i20 = i19 & i12;
                    if (((j11 - i20) & i12) / 8 == ((i14 - i20) & i12) / 8) {
                        jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                        jArr[C16870n.m0(jArr)] = (jArr[i13] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i21 = j11 >> 3;
                        long j12 = jArr[i21];
                        int i22 = (j11 & 7) << 3;
                        if (((j12 >> i22) & 255) == 128) {
                            int i23 = i14;
                            objArr = objArr2;
                            jArr[i21] = (j12 & (~(255 << i22))) | (((long) (i18 & 127)) << i22);
                            jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                            objArr[j11] = objArr[i23];
                            objArr[i23] = null;
                            jArr2[j11] = jArr2[i23];
                            jArr2[i23] = 0;
                            i10 = i23;
                            i15 = i10;
                            i11 = i12;
                        } else {
                            int i24 = i12;
                            objArr = objArr2;
                            int i25 = i14;
                            jArr[i21] = (((long) (i18 & 127)) << i22) | (j12 & (~(255 << i22)));
                            if (i15 == -1) {
                                i11 = i24;
                                i15 = Y.b(jArr, i25 + 1, i11);
                            } else {
                                i11 = i24;
                            }
                            objArr[i15] = objArr[j11];
                            objArr[j11] = objArr[i25];
                            objArr[i25] = objArr[i15];
                            jArr2[i15] = jArr2[j11];
                            jArr2[j11] = jArr2[i25];
                            jArr2[i25] = jArr2[i15];
                            i10 = i25 - 1;
                        }
                        i13 = 0;
                        jArr[C16870n.m0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i14 = i10 + 1;
                        i12 = i11;
                        objArr2 = objArr;
                    }
                }
                i14++;
            }
        }
        l();
    }

    private final int j(int i10) {
        int i11 = this.f24565d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f24562a;
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

    private final int k(K k10) {
        K k11 = k10;
        int hashCode = (k11 != null ? k10.hashCode() : 0) * -862048943;
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f24565d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f24562a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-((long) i17)) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (long) i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & -9187201950435737472L; j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (C17542s.e(this.f24563b[numberOfTrailingZeros], k11)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & -9187201950435737472L) != 0) {
                int j14 = j(i11);
                if (this.f24527f == 0 && ((this.f24562a[j14 >> 3] >> ((j14 & 7) << 3)) & 255) != 254) {
                    h();
                    j14 = j(i11);
                }
                this.f24566e++;
                int i19 = this.f24527f;
                long[] jArr2 = this.f24562a;
                int i20 = j14 >> 3;
                long j15 = jArr2[i20];
                int i21 = (j14 & 7) << 3;
                this.f24527f = i19 - (((j15 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f24565d;
                long j16 = ((~(255 << i21)) & j15) | (j11 << i21);
                jArr2[i20] = j16;
                jArr2[(((j14 - 7) & i22) + (i22 & 7)) >> 3] = j16;
                return ~j14;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final void l() {
        this.f24527f = Y.c(d()) - this.f24566e;
    }

    private final void m(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = Y.f24573a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C16870n.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f24562a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        l();
    }

    private final void n(int i10) {
        int max = i10 > 0 ? Math.max(7, Y.f(i10)) : 0;
        this.f24565d = max;
        m(max);
        this.f24563b = new Object[max];
        this.f24564c = new long[max];
    }

    private final void o(int i10) {
        int i11;
        long[] jArr = this.f24562a;
        Object[] objArr = this.f24563b;
        long[] jArr2 = this.f24564c;
        int i12 = this.f24565d;
        n(i10);
        long[] jArr3 = this.f24562a;
        Object[] objArr2 = this.f24563b;
        long[] jArr4 = this.f24564c;
        int i13 = this.f24565d;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int hashCode = (obj != null ? obj.hashCode() : 0) * -862048943;
                int i15 = hashCode ^ (hashCode << 16);
                int j10 = j(i15 >>> 7);
                i11 = i14;
                long j11 = (long) (i15 & 127);
                int i16 = j10 >> 3;
                int i17 = (j10 & 7) << 3;
                long j12 = (j11 << i17) | (jArr3[i16] & (~(255 << i17)));
                jArr3[i16] = j12;
                jArr3[(((j10 - 7) & i13) + (i13 & 7)) >> 3] = j12;
                objArr2[j10] = obj;
                jArr4[j10] = jArr2[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final void p(K k10, long j10) {
        int k11 = k(k10);
        if (k11 < 0) {
            k11 = ~k11;
        }
        this.f24563b[k11] = k10;
        this.f24564c[k11] = j10;
    }

    public M(int i10) {
        super((DefaultConstructorMarker) null);
        if (!(i10 >= 0)) {
            d.a("Capacity must be a positive value.");
        }
        n(Y.g(i10));
    }
}
