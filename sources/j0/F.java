package j0;

import XH.C16801H;
import YH.C16870n;
import k0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u0015\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\u000bR\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lj0/F;", "Lj0/q;", "", "initialCapacity", "<init>", "(I)V", "LXH/N;", "n", "capacity", "m", "l", "()V", "index", "s", "element", "j", "(I)I", "hash1", "k", "g", "i", "newCapacity", "t", "", "f", "(I)Z", "q", "o", "elements", "r", "(Lj0/q;)Z", "p", "(Lj0/q;)V", "h", "e", "I", "growthLimit", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class F extends C5461q {

    /* renamed from: e  reason: collision with root package name */
    private int f24521e;

    public F() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    private final void g() {
        if (this.f24641c <= 8 || Long.compareUnsigned(C16801H.b(C16801H.b((long) this.f24642d) * 32), C16801H.b(C16801H.b((long) this.f24641c) * 25)) > 0) {
            t(Y.e(this.f24641c));
        } else {
            i();
        }
    }

    private final void i() {
        int i10;
        long[] jArr = this.f24639a;
        int i11 = this.f24641c;
        int[] iArr = this.f24640b;
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
                    int hashCode = Integer.hashCode(iArr[i12]) * -862048943;
                    int i16 = hashCode ^ (hashCode << 16);
                    int i17 = i16 >>> 7;
                    int k10 = k(i17);
                    int i18 = i17 & i11;
                    if (((k10 - i18) & i11) / 8 == ((i12 - i18) & i11) / 8) {
                        jArr[i14] = (((long) (i16 & 127)) << i15) | ((~(255 << i15)) & jArr[i14]);
                        jArr[C16870n.m0(jArr)] = (jArr[c10] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i19 = k10 >> 3;
                        long j11 = jArr[i19];
                        int i20 = (k10 & 7) << 3;
                        if (((j11 >> i20) & 255) == 128) {
                            int i21 = i12;
                            jArr[i19] = (((long) (i16 & 127)) << i20) | (j11 & (~(255 << i20)));
                            jArr[i14] = (jArr[i14] & (~(255 << i15))) | (128 << i15);
                            iArr[k10] = iArr[i21];
                            iArr[i21] = 0;
                            i10 = i21;
                            i13 = i10;
                        } else {
                            int i22 = i12;
                            jArr[i19] = (((long) (i16 & 127)) << i20) | (j11 & (~(255 << i20)));
                            if (i13 == -1) {
                                i13 = Y.b(jArr, i22 + 1, i11);
                            }
                            iArr[i13] = iArr[k10];
                            iArr[k10] = iArr[i22];
                            iArr[i22] = iArr[i13];
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
        l();
    }

    private final int j(int i10) {
        int hashCode = Integer.hashCode(i10) * -862048943;
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f24641c;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f24639a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-((long) i18)) >> 63)) | (jArr[i17] >>> i18);
            long j11 = (long) i13;
            int i19 = i16;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & -9187201950435737472L; j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                if (this.f24640b[numberOfTrailingZeros] == i10) {
                    return numberOfTrailingZeros;
                }
            }
            int i20 = i10;
            if ((((~j10) << 6) & j10 & -9187201950435737472L) != 0) {
                int k10 = k(i12);
                if (this.f24521e == 0 && ((this.f24639a[k10 >> 3] >> ((k10 & 7) << 3)) & 255) != 254) {
                    g();
                    k10 = k(i12);
                }
                this.f24642d++;
                int i21 = this.f24521e;
                long[] jArr2 = this.f24639a;
                int i22 = k10 >> 3;
                long j14 = jArr2[i22];
                int i23 = (k10 & 7) << 3;
                this.f24521e = i21 - (((j14 >> i23) & 255) == 128 ? 1 : 0);
                int i24 = this.f24641c;
                long j15 = ((~(255 << i23)) & j14) | (j11 << i23);
                jArr2[i22] = j15;
                jArr2[(((k10 - 7) & i24) + (i24 & 7)) >> 3] = j15;
                return k10;
            }
            i16 = i19 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final int k(int i10) {
        int i11 = this.f24641c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f24639a;
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
        this.f24521e = Y.c(b()) - this.f24642d;
    }

    private final void m(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = Y.f24573a;
        } else {
            jArr = new long[(((i10 + 15) & -8) >> 3)];
            C16870n.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f24639a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        l();
    }

    private final void n(int i10) {
        int max = i10 > 0 ? Math.max(7, Y.f(i10)) : 0;
        this.f24641c = max;
        m(max);
        this.f24640b = new int[max];
    }

    private final void s(int i10) {
        this.f24642d--;
        long[] jArr = this.f24639a;
        int i11 = this.f24641c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    private final void t(int i10) {
        long[] jArr = this.f24639a;
        int[] iArr = this.f24640b;
        int i11 = this.f24641c;
        n(i10);
        long[] jArr2 = this.f24639a;
        int[] iArr2 = this.f24640b;
        int i12 = this.f24641c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int hashCode = Integer.hashCode(i14) * -862048943;
                int i15 = hashCode ^ (hashCode << 16);
                int k10 = k(i15 >>> 7);
                long j10 = (long) (i15 & 127);
                int i16 = k10 >> 3;
                int i17 = (k10 & 7) << 3;
                long j11 = (jArr2[i16] & (~(255 << i17))) | (j10 << i17);
                jArr2[i16] = j11;
                jArr2[(((k10 - 7) & i12) + (i12 & 7)) >> 3] = j11;
                iArr2[k10] = i14;
            }
        }
    }

    public final boolean f(int i10) {
        int i11 = this.f24642d;
        this.f24640b[j(i10)] = i10;
        return this.f24642d != i11;
    }

    public final void h() {
        this.f24642d = 0;
        long[] jArr = this.f24639a;
        if (jArr != Y.f24573a) {
            C16870n.z(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f24639a;
            int i10 = this.f24641c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        l();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0061, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0063, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f24641c
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L_0x0013:
            long[] r4 = r13.f24639a
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
            int[] r11 = r13.f24640b
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
            if (r4 == 0) goto L_0x006a
            r10 = -1
        L_0x0064:
            if (r10 < 0) goto L_0x0069
            r13.s(r10)
        L_0x0069:
            return
        L_0x006a:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.F.o(int):void");
    }

    public final void p(C5461q qVar) {
        C17542s.j(qVar, "elements");
        int[] iArr = qVar.f24640b;
        long[] jArr = qVar.f24639a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            o(iArr[(i10 << 3) + i12]);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0067, code lost:
        if (((r6 & ((~r6) << 6)) & -9187201950435737472L) == 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0069, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f24641c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L_0x0016:
            long[] r6 = r0.f24639a
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
            if (r10 == 0) goto L_0x0060
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.f24640b
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L_0x0059
            goto L_0x006a
        L_0x0059:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L_0x0042
        L_0x0060:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0073
            r10 = -1
        L_0x006a:
            if (r10 < 0) goto L_0x006d
            r4 = r11
        L_0x006d:
            if (r4 == 0) goto L_0x0072
            r0.s(r10)
        L_0x0072:
            return r4
        L_0x0073:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.F.q(int):boolean");
    }

    public final boolean r(C5461q qVar) {
        C17542s.j(qVar, "elements");
        int i10 = this.f24642d;
        p(qVar);
        return i10 != this.f24642d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public F(int i10) {
        super((DefaultConstructorMarker) null);
        if (!(i10 >= 0)) {
            d.a("Capacity must be a positive value.");
        }
        n(Y.g(i10));
    }
}
