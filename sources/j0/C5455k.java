package j0;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0018\u0010\nR\u001c\u0010\u001c\u001a\u00020\u00198\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u0012\u0004\b\u001b\u0010\u0003R\u001c\u0010 \u001a\u00020\u001d8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u0012\u0004\b\u001f\u0010\u0003R\u001c\u0010\"\u001a\u00020\u001d8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\t\u0010\u001e\u0012\u0004\b!\u0010\u0003R\u001c\u0010&\u001a\u00020\u00078\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b#\u0010$\u0012\u0004\b%\u0010\u0003R\u001c\u0010(\u001a\u00020\u00078\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\f\u0010$\u0012\u0004\b'\u0010\u0003R\u0011\u0010)\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010\u0011R\u0011\u0010+\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010\u0011\u0001\u0001,¨\u0006-"}, d2 = {"Lj0/k;", "", "<init>", "()V", "", "g", "()Z", "", "key", "c", "(I)I", "defaultValue", "e", "(II)I", "a", "(I)Z", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "b", "", "[J", "getMetadata$annotations", "metadata", "", "[I", "getKeys$annotations", "keys", "getValues$annotations", "values", "d", "I", "get_capacity$collection$annotations", "_capacity", "get_size$collection$annotations", "_size", "capacity", "f", "size", "Lj0/C;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j0.k  reason: case insensitive filesystem */
public abstract class C5455k {

    /* renamed from: a  reason: collision with root package name */
    public long[] f24624a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f24625b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f24626c;

    /* renamed from: d  reason: collision with root package name */
    public int f24627d;

    /* renamed from: e  reason: collision with root package name */
    public int f24628e;

    public /* synthetic */ C5455k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(int i10) {
        return b(i10) >= 0;
    }

    public final int b(int i10) {
        int hashCode = Integer.hashCode(i10) * -862048943;
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f24627d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f24624a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-((long) i17)) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & -9187201950435737472L; j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f24625b[numberOfTrailingZeros] == i10) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & -9187201950435737472L) != 0) {
                return -1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final int c(int i10) {
        int b10 = b(i10);
        if (b10 >= 0) {
            return this.f24626c[b10];
        }
        throw new NoSuchElementException("Cannot find value for key " + i10);
    }

    public final int d() {
        return this.f24627d;
    }

    public final int e(int i10, int i11) {
        int b10 = b(i10);
        return b10 >= 0 ? this.f24626c[b10] : i11;
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
            boolean r3 = r1 instanceof j0.C5455k
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            j0.k r1 = (j0.C5455k) r1
            int r3 = r1.f()
            int r5 = r18.f()
            if (r3 == r5) goto L_0x001b
            return r4
        L_0x001b:
            int[] r3 = r0.f24625b
            int[] r5 = r0.f24626c
            long[] r6 = r0.f24624a
            int r7 = r6.length
            int r7 = r7 + -2
            if (r7 < 0) goto L_0x0065
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
            if (r11 == 0) goto L_0x0060
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L_0x0041:
            if (r13 >= r11) goto L_0x005e
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x005a
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r15 = r1.c(r15)
            if (r14 == r15) goto L_0x005a
            return r4
        L_0x005a:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L_0x0041
        L_0x005e:
            if (r11 != r12) goto L_0x0065
        L_0x0060:
            if (r8 == r7) goto L_0x0065
            int r8 = r8 + 1
            goto L_0x0027
        L_0x0065:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C5455k.equals(java.lang.Object):boolean");
    }

    public final int f() {
        return this.f24628e;
    }

    public final boolean g() {
        return this.f24628e == 0;
    }

    public int hashCode() {
        int[] iArr = this.f24625b;
        int[] iArr2 = this.f24626c;
        long[] jArr = this.f24624a;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr[i15];
                            i12 += Integer.hashCode(iArr2[i15]) ^ Integer.hashCode(i16);
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
        if (g()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        int[] iArr = this.f24625b;
        int[] iArr2 = this.f24626c;
        long[] jArr = this.f24624a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr[i14];
                            int i16 = iArr2[i14];
                            sb2.append(i15);
                            sb2.append("=");
                            sb2.append(i16);
                            i11++;
                            if (i11 < this.f24628e) {
                                sb2.append(',');
                                sb2.append(' ');
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C17542s.i(sb3, "s.append('}').toString()");
        return sb3;
    }

    private C5455k() {
        this.f24624a = Y.f24573a;
        this.f24625b = r.a();
        this.f24626c = r.a();
    }
}
