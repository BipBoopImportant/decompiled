package j0;

import XH.C16801H;
import YH.C16870n;
import k0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J \u0010\u0018\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001e\u0010\u0006R\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lj0/K;", "K", "Lj0/Q;", "", "initialCapacity", "<init>", "(I)V", "LXH/N;", "o", "capacity", "n", "m", "()V", "key", "l", "(Ljava/lang/Object;)I", "hash1", "k", "(I)I", "i", "j", "newCapacity", "r", "value", "s", "(Ljava/lang/Object;I)V", "default", "p", "(Ljava/lang/Object;II)I", "index", "q", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class K<K> extends Q<K> {

    /* renamed from: f  reason: collision with root package name */
    private int f24526f;

    public K() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    private final void i() {
        if (this.f24554d <= 8 || Long.compareUnsigned(C16801H.b(C16801H.b((long) this.f24555e) * 32), C16801H.b(C16801H.b((long) this.f24554d) * 25)) > 0) {
            r(Y.e(this.f24554d));
        } else {
            j();
        }
    }

    private final void j() {
        Object[] objArr;
        int i10;
        int i11;
        long[] jArr = this.f24551a;
        int i12 = this.f24554d;
        Object[] objArr2 = this.f24552b;
        int[] iArr = this.f24553c;
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
                    int k10 = k(i19);
                    int i20 = i19 & i12;
                    if (((k10 - i20) & i12) / 8 == ((i14 - i20) & i12) / 8) {
                        jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                        jArr[C16870n.m0(jArr)] = (jArr[i13] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i21 = k10 >> 3;
                        long j11 = jArr[i21];
                        int i22 = (k10 & 7) << 3;
                        if (((j11 >> i22) & 255) == 128) {
                            int i23 = i14;
                            objArr = objArr2;
                            jArr[i21] = (j11 & (~(255 << i22))) | (((long) (i18 & 127)) << i22);
                            jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                            objArr[k10] = objArr[i23];
                            objArr[i23] = null;
                            iArr[k10] = iArr[i23];
                            iArr[i23] = 0;
                            i10 = i23;
                            i15 = i10;
                            i11 = i12;
                        } else {
                            int i24 = i12;
                            objArr = objArr2;
                            int i25 = i14;
                            jArr[i21] = (((long) (i18 & 127)) << i22) | (j11 & (~(255 << i22)));
                            if (i15 == -1) {
                                i11 = i24;
                                i15 = Y.b(jArr, i25 + 1, i11);
                            } else {
                                i11 = i24;
                            }
                            objArr[i15] = objArr[k10];
                            objArr[k10] = objArr[i25];
                            objArr[i25] = objArr[i15];
                            iArr[i15] = iArr[k10];
                            iArr[k10] = iArr[i25];
                            iArr[i25] = iArr[i15];
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
        m();
    }

    private final int k(int i10) {
        int i11 = this.f24554d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f24551a;
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

    private final int l(K k10) {
        K k11 = k10;
        int hashCode = (k11 != null ? k10.hashCode() : 0) * -862048943;
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f24554d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f24551a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-((long) i17)) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (long) i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & -9187201950435737472L; j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (C17542s.e(this.f24552b[numberOfTrailingZeros], k11)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & -9187201950435737472L) != 0) {
                int k12 = k(i11);
                if (this.f24526f == 0 && ((this.f24551a[k12 >> 3] >> ((k12 & 7) << 3)) & 255) != 254) {
                    i();
                    k12 = k(i11);
                }
                this.f24555e++;
                int i19 = this.f24526f;
                long[] jArr2 = this.f24551a;
                int i20 = k12 >> 3;
                long j14 = jArr2[i20];
                int i21 = (k12 & 7) << 3;
                this.f24526f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f24554d;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((k12 - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~k12;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final void m() {
        this.f24526f = Y.c(d()) - this.f24555e;
    }

    private final void n(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = Y.f24573a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C16870n.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f24551a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        m();
    }

    private final void o(int i10) {
        int max = i10 > 0 ? Math.max(7, Y.f(i10)) : 0;
        this.f24554d = max;
        n(max);
        this.f24552b = new Object[max];
        this.f24553c = new int[max];
    }

    private final void r(int i10) {
        int i11;
        long[] jArr = this.f24551a;
        Object[] objArr = this.f24552b;
        int[] iArr = this.f24553c;
        int i12 = this.f24554d;
        o(i10);
        long[] jArr2 = this.f24551a;
        Object[] objArr2 = this.f24552b;
        int[] iArr2 = this.f24553c;
        int i13 = this.f24554d;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int hashCode = (obj != null ? obj.hashCode() : 0) * -862048943;
                int i15 = hashCode ^ (hashCode << 16);
                int k10 = k(i15 >>> 7);
                i11 = i14;
                long j10 = (long) (i15 & 127);
                int i16 = k10 >> 3;
                int i17 = (k10 & 7) << 3;
                long j11 = (j10 << i17) | (jArr2[i16] & (~(255 << i17)));
                jArr2[i16] = j11;
                jArr2[(((k10 - 7) & i13) + (i13 & 7)) >> 3] = j11;
                objArr2[k10] = obj;
                iArr2[k10] = iArr[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final int p(K k10, int i10, int i11) {
        int l10 = l(k10);
        if (l10 < 0) {
            l10 = ~l10;
        } else {
            i11 = this.f24553c[l10];
        }
        this.f24552b[l10] = k10;
        this.f24553c[l10] = i10;
        return i11;
    }

    public final void q(int i10) {
        this.f24555e--;
        long[] jArr = this.f24551a;
        int i11 = this.f24554d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f24552b[i10] = null;
    }

    public final void s(K k10, int i10) {
        int l10 = l(k10);
        if (l10 < 0) {
            l10 = ~l10;
        }
        this.f24552b[l10] = k10;
        this.f24553c[l10] = i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public K(int i10) {
        super((DefaultConstructorMarker) null);
        if (!(i10 >= 0)) {
            d.a("Capacity must be a positive value.");
        }
        o(Y.g(i10));
    }
}
