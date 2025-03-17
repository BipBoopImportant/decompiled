package j0;

import XH.C16801H;
import YH.C16870n;
import k0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0007J \u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lj0/N;", "K", "V", "Lj0/X;", "", "initialCapacity", "<init>", "(I)V", "LXH/N;", "o", "capacity", "n", "m", "()V", "hash1", "k", "(I)I", "h", "j", "newCapacity", "r", "key", "value", "s", "(Ljava/lang/Object;Ljava/lang/Object;)V", "p", "(Ljava/lang/Object;)Ljava/lang/Object;", "index", "q", "(I)Ljava/lang/Object;", "i", "l", "(Ljava/lang/Object;)I", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class N<K, V> extends X<K, V> {

    /* renamed from: f  reason: collision with root package name */
    private int f24528f;

    public N() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    private final void h() {
        if (this.f24571d <= 8 || Long.compareUnsigned(C16801H.b(C16801H.b((long) this.f24572e) * 32), C16801H.b(C16801H.b((long) this.f24571d) * 25)) > 0) {
            r(Y.e(this.f24571d));
        } else {
            j();
        }
    }

    private final void j() {
        Object[] objArr;
        int i10;
        int i11;
        long[] jArr = this.f24568a;
        int i12 = this.f24571d;
        Object[] objArr2 = this.f24569b;
        Object[] objArr3 = this.f24570c;
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
                        jArr[C16870n.m0(jArr)] = jArr[i13];
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
                            objArr3[k10] = objArr3[i23];
                            objArr3[i23] = null;
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
                            objArr3[i15] = objArr3[k10];
                            objArr3[k10] = objArr3[i25];
                            objArr3[i25] = objArr3[i15];
                            i10 = i25 - 1;
                        }
                        i13 = 0;
                        jArr[C16870n.m0(jArr)] = jArr[0];
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
        int i11 = this.f24571d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f24568a;
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
        this.f24528f = Y.c(d()) - this.f24572e;
    }

    private final void n(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = Y.f24573a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C16870n.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f24568a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        m();
    }

    private final void o(int i10) {
        int max = i10 > 0 ? Math.max(7, Y.f(i10)) : 0;
        this.f24571d = max;
        n(max);
        this.f24569b = new Object[max];
        this.f24570c = new Object[max];
    }

    private final void r(int i10) {
        int i11;
        long[] jArr = this.f24568a;
        Object[] objArr = this.f24569b;
        Object[] objArr2 = this.f24570c;
        int i12 = this.f24571d;
        o(i10);
        long[] jArr2 = this.f24568a;
        Object[] objArr3 = this.f24569b;
        Object[] objArr4 = this.f24570c;
        int i13 = this.f24571d;
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
                objArr3[k10] = obj;
                objArr4[k10] = objArr2[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final void i() {
        this.f24572e = 0;
        long[] jArr = this.f24568a;
        if (jArr != Y.f24573a) {
            C16870n.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f24568a;
            int i10 = this.f24571d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        C16870n.x(this.f24570c, null, 0, this.f24571d);
        C16870n.x(this.f24569b, null, 0, this.f24571d);
        m();
    }

    public final int l(K k10) {
        K k11 = k10;
        int hashCode = (k11 != null ? k10.hashCode() : 0) * -862048943;
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f24571d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f24568a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-((long) i17)) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (long) i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & -9187201950435737472L; j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (C17542s.e(this.f24569b[numberOfTrailingZeros], k11)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & -9187201950435737472L) != 0) {
                int k12 = k(i11);
                if (this.f24528f == 0 && ((this.f24568a[k12 >> 3] >> ((k12 & 7) << 3)) & 255) != 254) {
                    h();
                    k12 = k(i11);
                }
                this.f24572e++;
                int i19 = this.f24528f;
                long[] jArr2 = this.f24568a;
                int i20 = k12 >> 3;
                long j14 = jArr2[i20];
                int i21 = (k12 & 7) << 3;
                this.f24528f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f24571d;
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

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0069, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V p(K r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L_0x0008
            int r1 = r14.hashCode()
            goto L_0x0009
        L_0x0008:
            r1 = r0
        L_0x0009:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f24571d
            int r1 = r1 >>> 7
        L_0x0016:
            r1 = r1 & r3
            long[] r4 = r13.f24568a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L_0x0043:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0062
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f24569b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r14)
            if (r11 == 0) goto L_0x005c
            goto L_0x006c
        L_0x005c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L_0x0043
        L_0x0062:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0075
            r10 = -1
        L_0x006c:
            if (r10 < 0) goto L_0x0073
            java.lang.Object r14 = r13.q(r10)
            return r14
        L_0x0073:
            r14 = 0
            return r14
        L_0x0075:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.N.p(java.lang.Object):java.lang.Object");
    }

    public final V q(int i10) {
        this.f24572e--;
        long[] jArr = this.f24568a;
        int i11 = this.f24571d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f24569b[i10] = null;
        V[] vArr = this.f24570c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        return v10;
    }

    public final void s(K k10, V v10) {
        int l10 = l(k10);
        if (l10 < 0) {
            l10 = ~l10;
        }
        this.f24569b[l10] = k10;
        this.f24570c[l10] = v10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public N(int i10) {
        super((DefaultConstructorMarker) null);
        if (!(i10 >= 0)) {
            d.a("Capacity must be a positive value.");
        }
        o(Y.g(i10));
    }
}
