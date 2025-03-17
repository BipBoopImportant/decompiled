package j0;

import java.util.NoSuchElementException;
import k0.C5489a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\u00020\u001c8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u0012\u0004\b\u001e\u0010\u0004R$\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020 8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\u0011\u0010!\u0012\u0004\b\"\u0010\u0004R\u001c\u0010'\u001a\u00020$8\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\u001a\u0010%\u0012\u0004\b&\u0010\u0004R\u001c\u0010*\u001a\u00020\u00128\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b\n\u0010(\u0012\u0004\b)\u0010\u0004R\u001c\u0010-\u001a\u00020\u00128\u0000@\u0000X\u000e¢\u0006\f\n\u0004\b+\u0010(\u0012\u0004\b,\u0010\u0004R\u0011\u0010.\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b+\u0010\u0014R\u0011\u00100\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b/\u0010\u0014\u0001\u00011¨\u00062"}, d2 = {"Lj0/P;", "K", "", "<init>", "()V", "", "h", "()Z", "key", "", "d", "(Ljava/lang/Object;)F", "defaultValue", "f", "(Ljava/lang/Object;F)F", "a", "(Ljava/lang/Object;)Z", "b", "", "hashCode", "()I", "other", "equals", "", "toString", "()Ljava/lang/String;", "c", "(Ljava/lang/Object;)I", "", "[J", "getMetadata$annotations", "metadata", "", "[Ljava/lang/Object;", "getKeys$annotations", "keys", "", "[F", "getValues$annotations", "values", "I", "get_capacity$collection$annotations", "_capacity", "e", "get_size$collection$annotations", "_size", "capacity", "g", "size", "Lj0/J;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class P<K> {

    /* renamed from: a  reason: collision with root package name */
    public long[] f24546a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f24547b;

    /* renamed from: c  reason: collision with root package name */
    public float[] f24548c;

    /* renamed from: d  reason: collision with root package name */
    public int f24549d;

    /* renamed from: e  reason: collision with root package name */
    public int f24550e;

    public /* synthetic */ P(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(K k10) {
        return c(k10) >= 0;
    }

    public final boolean b(K k10) {
        return c(k10) >= 0;
    }

    public final int c(K k10) {
        int i10 = 0;
        int hashCode = (k10 != null ? k10.hashCode() : 0) * -862048943;
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f24549d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f24546a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-((long) i17)) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & -9187201950435737472L; j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (C17542s.e(this.f24547b[numberOfTrailingZeros], k10)) {
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

    public final float d(K k10) {
        int c10 = c(k10);
        if (c10 >= 0) {
            return this.f24548c[c10];
        }
        throw new NoSuchElementException("There is no key " + k10 + " in the map");
    }

    public final int e() {
        return this.f24549d;
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
            boolean r3 = r1 instanceof j0.P
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            j0.P r1 = (j0.P) r1
            int r3 = r1.g()
            int r5 = r18.g()
            if (r3 == r5) goto L_0x001b
            return r4
        L_0x001b:
            java.lang.Object[] r3 = r0.f24547b
            float[] r5 = r0.f24548c
            long[] r6 = r0.f24546a
            int r7 = r6.length
            int r7 = r7 + -2
            if (r7 < 0) goto L_0x0068
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
            if (r11 == 0) goto L_0x0063
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L_0x0041:
            if (r13 >= r11) goto L_0x0061
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x005d
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            float r15 = r1.d(r15)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 != 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            return r4
        L_0x005d:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L_0x0041
        L_0x0061:
            if (r11 != r12) goto L_0x0068
        L_0x0063:
            if (r8 == r7) goto L_0x0068
            int r8 = r8 + 1
            goto L_0x0027
        L_0x0068:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.P.equals(java.lang.Object):boolean");
    }

    public final float f(K k10, float f10) {
        int c10 = c(k10);
        return c10 >= 0 ? this.f24548c[c10] : f10;
    }

    public final int g() {
        return this.f24550e;
    }

    public final boolean h() {
        return this.f24550e == 0;
    }

    public int hashCode() {
        Object[] objArr = this.f24547b;
        float[] fArr = this.f24548c;
        long[] jArr = this.f24546a;
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
                            i12 += Float.hashCode(fArr[i15]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (h()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        Object[] objArr = this.f24547b;
        float[] fArr = this.f24548c;
        long[] jArr = this.f24546a;
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
                            float f10 = fArr[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(f10);
                            i11++;
                            if (i11 < this.f24550e) {
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

    private P() {
        this.f24546a = Y.f24573a;
        this.f24547b = C5489a.f24992c;
        this.f24548c = C5453i.a();
    }
}
