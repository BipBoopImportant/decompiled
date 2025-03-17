package j0;

import java.util.NoSuchElementException;
import k0.C5489a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0019\u0010\fR\u001c\u0010\u001d\u001a\u00020\u001a8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u0012\u0004\b\u001c\u0010\u0004R$\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001e8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u0012\u0004\b \u0010\u0004R\u001c\u0010%\u001a\u00020\"8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\u000b\u0010#\u0012\u0004\b$\u0010\u0004R\u001c\u0010)\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b&\u0010'\u0012\u0004\b(\u0010\u0004R\u001c\u0010+\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\u000e\u0010'\u0012\u0004\b*\u0010\u0004R\u0011\u0010,\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0013R\u0011\u0010.\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0013\u0001\u0001/¨\u00060"}, d2 = {"Lj0/Q;", "K", "", "<init>", "()V", "", "g", "()Z", "h", "key", "", "c", "(Ljava/lang/Object;)I", "defaultValue", "e", "(Ljava/lang/Object;I)I", "a", "(Ljava/lang/Object;)Z", "hashCode", "()I", "other", "equals", "", "toString", "()Ljava/lang/String;", "b", "", "[J", "getMetadata$annotations", "metadata", "", "[Ljava/lang/Object;", "getKeys$annotations", "keys", "", "[I", "getValues$annotations", "values", "d", "I", "get_capacity$collection$annotations", "_capacity", "get_size$collection$annotations", "_size", "capacity", "f", "size", "Lj0/K;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Q<K> {

    /* renamed from: a  reason: collision with root package name */
    public long[] f24551a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f24552b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f24553c;

    /* renamed from: d  reason: collision with root package name */
    public int f24554d;

    /* renamed from: e  reason: collision with root package name */
    public int f24555e;

    public /* synthetic */ Q(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(K k10) {
        return b(k10) >= 0;
    }

    public final int b(K k10) {
        int i10 = 0;
        int hashCode = (k10 != null ? k10.hashCode() : 0) * -862048943;
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f24554d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f24551a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-((long) i17)) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & -9187201950435737472L; j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (C17542s.e(this.f24552b[numberOfTrailingZeros], k10)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & -9187201950435737472L) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    public final int c(K k10) {
        int b10 = b(k10);
        if (b10 >= 0) {
            return this.f24553c[b10];
        }
        throw new NoSuchElementException("There is no key " + k10 + " in the map");
    }

    public final int d() {
        return this.f24554d;
    }

    public final int e(K k10, int i10) {
        int b10 = b(k10);
        return b10 >= 0 ? this.f24553c[b10] : i10;
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
            boolean r3 = r1 instanceof j0.Q
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            j0.Q r1 = (j0.Q) r1
            int r3 = r1.f()
            int r5 = r18.f()
            if (r3 == r5) goto L_0x001b
            return r4
        L_0x001b:
            java.lang.Object[] r3 = r0.f24552b
            int[] r5 = r0.f24553c
            long[] r6 = r0.f24551a
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
        throw new UnsupportedOperationException("Method not decompiled: j0.Q.equals(java.lang.Object):boolean");
    }

    public final int f() {
        return this.f24555e;
    }

    public final boolean g() {
        return this.f24555e == 0;
    }

    public final boolean h() {
        return this.f24555e != 0;
    }

    public int hashCode() {
        Object[] objArr = this.f24552b;
        int[] iArr = this.f24553c;
        long[] jArr = this.f24551a;
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
                            Object obj = objArr[i15];
                            i12 += Integer.hashCode(iArr[i15]) ^ (obj != null ? obj.hashCode() : 0);
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
        Object[] objArr = this.f24552b;
        int[] iArr = this.f24553c;
        long[] jArr = this.f24551a;
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
                            Object obj = objArr[i14];
                            int i15 = iArr[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(i15);
                            i11++;
                            if (i11 < this.f24555e) {
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

    private Q() {
        this.f24551a = Y.f24573a;
        this.f24552b = C5489a.f24992c;
        this.f24553c = r.a();
    }
}
