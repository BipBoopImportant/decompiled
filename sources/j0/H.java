package j0;

import XH.C16801H;
import YH.C16870n;
import k0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0019\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J \u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001f\u001a\u00020\u0003H\u0001¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\fR\u0016\u0010%\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lj0/H;", "V", "Lj0/u;", "", "initialCapacity", "<init>", "(I)V", "LXH/N;", "n", "capacity", "m", "l", "()V", "", "key", "j", "(J)I", "hash1", "k", "(I)I", "g", "i", "newCapacity", "r", "value", "s", "(JLjava/lang/Object;)V", "o", "(JLjava/lang/Object;)Ljava/lang/Object;", "p", "(J)Ljava/lang/Object;", "index", "q", "(I)Ljava/lang/Object;", "h", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class H<V> extends C5464u<V> {

    /* renamed from: f  reason: collision with root package name */
    private int f24523f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    private final void g() {
        if (this.f24654d <= 8 || Long.compareUnsigned(C16801H.b(C16801H.b((long) this.f24655e) * 32), C16801H.b(C16801H.b((long) this.f24654d) * 25)) > 0) {
            r(Y.e(this.f24654d));
        } else {
            i();
        }
    }

    private final void i() {
        long[] jArr;
        int i10;
        int i11;
        long[] jArr2 = this.f24651a;
        int i12 = this.f24654d;
        long[] jArr3 = this.f24652b;
        Object[] objArr = this.f24653c;
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
                    int k10 = k(i18);
                    int i19 = i18 & i12;
                    if (((k10 - i19) & i12) / 8 == ((i13 - i19) & i12) / 8) {
                        jArr2[i15] = (((long) (i17 & 127)) << i16) | ((~(255 << i16)) & jArr2[i15]);
                        jArr2[C16870n.m0(jArr2)] = (jArr2[c10] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i20 = k10 >> 3;
                        long j11 = jArr2[i20];
                        int i21 = (k10 & 7) << 3;
                        if (((j11 >> i21) & 255) == 128) {
                            int i22 = i13;
                            jArr = jArr3;
                            jArr2[i20] = (j11 & (~(255 << i21))) | (((long) (i17 & 127)) << i21);
                            jArr2[i15] = (jArr2[i15] & (~(255 << i16))) | (128 << i16);
                            jArr[k10] = jArr[i22];
                            jArr[i22] = 0;
                            objArr[k10] = objArr[i22];
                            objArr[i22] = null;
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
                            jArr[i14] = jArr[k10];
                            jArr[k10] = jArr[i24];
                            jArr[i24] = jArr[i14];
                            objArr[i14] = objArr[k10];
                            objArr[k10] = objArr[i24];
                            objArr[i24] = objArr[i14];
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
        l();
    }

    private final int j(long j10) {
        int hashCode = Long.hashCode(j10) * -862048943;
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f24654d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f24651a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-((long) i17)) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (long) i12;
            int i18 = i15;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & -9187201950435737472L; j14 != 0; j14 &= j14 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i14) & i13;
                if (this.f24652b[numberOfTrailingZeros] == j10) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & -9187201950435737472L) != 0) {
                int k10 = k(i11);
                if (this.f24523f == 0 && ((this.f24651a[k10 >> 3] >> ((k10 & 7) << 3)) & 255) != 254) {
                    g();
                    k10 = k(i11);
                }
                this.f24655e++;
                int i19 = this.f24523f;
                long[] jArr2 = this.f24651a;
                int i20 = k10 >> 3;
                long j15 = jArr2[i20];
                int i21 = (k10 & 7) << 3;
                this.f24523f = i19 - (((j15 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f24654d;
                long j16 = ((~(255 << i21)) & j15) | (j12 << i21);
                jArr2[i20] = j16;
                jArr2[(((k10 - 7) & i22) + (i22 & 7)) >> 3] = j16;
                return k10;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    private final int k(int i10) {
        int i11 = this.f24654d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f24651a;
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

    private final void l() {
        this.f24523f = Y.c(d()) - this.f24655e;
    }

    private final void m(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = Y.f24573a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C16870n.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f24651a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        l();
    }

    private final void n(int i10) {
        int max = i10 > 0 ? Math.max(7, Y.f(i10)) : 0;
        this.f24654d = max;
        m(max);
        this.f24652b = new long[max];
        this.f24653c = new Object[max];
    }

    private final void r(int i10) {
        long[] jArr;
        H h10 = this;
        long[] jArr2 = h10.f24651a;
        long[] jArr3 = h10.f24652b;
        Object[] objArr = h10.f24653c;
        int i11 = h10.f24654d;
        n(i10);
        long[] jArr4 = h10.f24651a;
        long[] jArr5 = h10.f24652b;
        Object[] objArr2 = h10.f24653c;
        int i12 = h10.f24654d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                long j10 = jArr3[i13];
                int hashCode = Long.hashCode(j10) * -862048943;
                int i14 = hashCode ^ (hashCode << 16);
                int k10 = h10.k(i14 >>> 7);
                long j11 = (long) (i14 & 127);
                int i15 = k10 >> 3;
                int i16 = (k10 & 7) << 3;
                jArr = jArr2;
                long j12 = (jArr4[i15] & (~(255 << i16))) | (j11 << i16);
                jArr4[i15] = j12;
                jArr4[(((k10 - 7) & i12) + (i12 & 7)) >> 3] = j12;
                jArr5[k10] = j10;
                objArr2[k10] = objArr[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            h10 = this;
            jArr2 = jArr;
        }
    }

    public final void h() {
        this.f24655e = 0;
        long[] jArr = this.f24651a;
        if (jArr != Y.f24573a) {
            C16870n.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f24651a;
            int i10 = this.f24654d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        C16870n.x(this.f24653c, null, 0, this.f24654d);
        l();
    }

    public final V o(long j10, V v10) {
        int j11 = j(j10);
        V[] vArr = this.f24653c;
        V v11 = vArr[j11];
        this.f24652b[j11] = j10;
        vArr[j11] = v10;
        return v11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0064, code lost:
        if (((r5 & ((~r5) << 6)) & -9187201950435737472L) == 0) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0066, code lost:
        r11 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V p(long r16) {
        /*
            r15 = this;
            r0 = r15
            int r1 = java.lang.Long.hashCode(r16)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f24654d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
        L_0x0014:
            long[] r5 = r0.f24651a
            int r6 = r1 >> 3
            r7 = r1 & 7
            int r7 = r7 << 3
            r8 = r5[r6]
            long r8 = r8 >>> r7
            int r6 = r6 + 1
            r10 = r5[r6]
            int r5 = 64 - r7
            long r5 = r10 << r5
            long r10 = (long) r7
            long r10 = -r10
            r7 = 63
            long r10 = r10 >> r7
            long r5 = r5 & r10
            long r5 = r5 | r8
            long r7 = (long) r2
            r9 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r7 = r7 * r9
            long r7 = r7 ^ r5
            long r9 = r7 - r9
            long r7 = ~r7
            long r7 = r7 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
        L_0x0040:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x005d
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r1
            r11 = r11 & r3
            long[] r12 = r0.f24652b
            r13 = r12[r11]
            int r12 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x0057
            goto L_0x0067
        L_0x0057:
            r11 = 1
            long r11 = r7 - r11
            long r7 = r7 & r11
            goto L_0x0040
        L_0x005d:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x0070
            r11 = -1
        L_0x0067:
            if (r11 < 0) goto L_0x006e
            java.lang.Object r1 = r15.q(r11)
            return r1
        L_0x006e:
            r1 = 0
            return r1
        L_0x0070:
            int r4 = r4 + 8
            int r1 = r1 + r4
            r1 = r1 & r3
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.H.p(long):java.lang.Object");
    }

    public final V q(int i10) {
        this.f24655e--;
        long[] jArr = this.f24651a;
        int i11 = this.f24654d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        V[] vArr = this.f24653c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        return v10;
    }

    public final void s(long j10, V v10) {
        int j11 = j(j10);
        this.f24652b[j11] = j10;
        this.f24653c[j11] = v10;
    }

    public H(int i10) {
        super((DefaultConstructorMarker) null);
        if (!(i10 >= 0)) {
            d.a("Capacity must be a positive value.");
        }
        n(Y.g(i10));
    }
}
