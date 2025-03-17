package j0;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0018\u001a\u00020\u00158\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u0012\u0004\b\u0017\u0010\u0003R\u001c\u0010\u001a\u001a\u00020\u00158\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\n\u0010\u0016\u0012\u0004\b\u0019\u0010\u0003R\u001c\u0010\u001f\u001a\u00020\u001b8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u0003R\u001c\u0010#\u001a\u00020\t8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010\u0003R\u001c\u0010%\u001a\u00020\t8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\u0005\u0010!\u0012\u0004\b$\u0010\u0003R\u0011\u0010&\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\rR\u0011\u0010'\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\r\u0001\u0001(¨\u0006)"}, d2 = {"Lj0/s;", "", "<init>", "()V", "", "e", "()Z", "", "key", "", "b", "(J)I", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "a", "", "[J", "getMetadata$annotations", "metadata", "getKeys$annotations", "keys", "", "c", "[I", "getValues$annotations", "values", "d", "I", "get_capacity$collection$annotations", "_capacity", "get_size$collection$annotations", "_size", "capacity", "size", "Lj0/G;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j0.s  reason: case insensitive filesystem */
public abstract class C5462s {

    /* renamed from: a  reason: collision with root package name */
    public long[] f24645a;

    /* renamed from: b  reason: collision with root package name */
    public long[] f24646b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f24647c;

    /* renamed from: d  reason: collision with root package name */
    public int f24648d;

    /* renamed from: e  reason: collision with root package name */
    public int f24649e;

    public /* synthetic */ C5462s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int a(long j10) {
        int hashCode = Long.hashCode(j10) * -862048943;
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f24648d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f24645a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-((long) i16)) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (((long) i11) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & -9187201950435737472L; j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                if (this.f24646b[numberOfTrailingZeros] == j10) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j11 & ((~j11) << 6) & -9187201950435737472L) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    public final int b(long j10) {
        int a10 = a(j10);
        if (a10 >= 0) {
            return this.f24647c[a10];
        }
        throw new NoSuchElementException("Cannot find value for key " + j10);
    }

    public final int c() {
        return this.f24648d;
    }

    public final int d() {
        return this.f24649e;
    }

    public final boolean e() {
        return this.f24649e == 0;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof j0.C5462s
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            j0.s r1 = (j0.C5462s) r1
            int r3 = r1.d()
            int r5 = r18.d()
            if (r3 == r5) goto L_0x001b
            return r4
        L_0x001b:
            long[] r3 = r0.f24646b
            int[] r5 = r0.f24647c
            long[] r6 = r0.f24645a
            int r7 = r6.length
            int r7 = r7 + -2
            if (r7 < 0) goto L_0x006a
            r8 = r4
        L_0x0027:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x0065
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L_0x0041:
            if (r13 >= r11) goto L_0x0063
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x005e
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r13
            r12 = r3[r14]
            r14 = r5[r14]
            int r12 = r1.b(r12)
            if (r14 == r12) goto L_0x005b
            return r4
        L_0x005b:
            r12 = 8
            goto L_0x005f
        L_0x005e:
            r15 = r13
        L_0x005f:
            long r9 = r9 >> r12
            int r13 = r15 + 1
            goto L_0x0041
        L_0x0063:
            if (r11 != r12) goto L_0x006a
        L_0x0065:
            if (r8 == r7) goto L_0x006a
            int r8 = r8 + 1
            goto L_0x0027
        L_0x006a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C5462s.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        long[] jArr = this.f24646b;
        int[] iArr = this.f24647c;
        long[] jArr2 = this.f24645a;
        int length = jArr2.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j10 = jArr2[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            long j11 = jArr[i15];
                            i12 += Integer.hashCode(iArr[i15]) ^ Long.hashCode(j11);
                        }
                        j10 >>= 8;
                    }
                    if (i13 != 8) {
                        return i12;
                    }
                }
                if (i11 == length) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    public String toString() {
        int i10;
        int i11;
        if (e()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        long[] jArr = this.f24646b;
        int[] iArr = this.f24647c;
        long[] jArr2 = this.f24645a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j10 = jArr2[i12];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j10) < 128) {
                            int i16 = (i12 << 3) + i15;
                            i11 = i12;
                            long j11 = jArr[i16];
                            int i17 = iArr[i16];
                            sb2.append(j11);
                            sb2.append("=");
                            sb2.append(i17);
                            i13++;
                            if (i13 < this.f24649e) {
                                sb2.append(',');
                                sb2.append(' ');
                            }
                        } else {
                            i11 = i12;
                        }
                        j10 >>= 8;
                        i15++;
                        i12 = i11;
                    }
                    int i18 = i12;
                    if (i14 != 8) {
                        break;
                    }
                    i10 = i18;
                } else {
                    i10 = i12;
                }
                if (i10 == length) {
                    break;
                }
                i12 = i10 + 1;
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C17542s.i(sb3, "s.append('}').toString()");
        return sb3;
    }

    private C5462s() {
        this.f24645a = Y.f24573a;
        this.f24646b = C5467x.a();
        this.f24647c = r.a();
    }
}
