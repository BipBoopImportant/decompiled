package IJ;

import HJ.C15854t;
import IJ.C15906b;
import YH.U;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import org.slf4j.Marker;
import pI.C17752b;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0016\u001a\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0016\u001a\u001f\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0016\u001a\u0017\u0010\"\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u0016¨\u0006#"}, d2 = {"", "LIJ/e;", "unit", "LIJ/b;", "s", "(ILIJ/e;)J", "", "t", "(JLIJ/e;)J", "", "r", "(DLIJ/e;)J", "", "value", "", "strictIso", "p", "(Ljava/lang/String;Z)J", "q", "(Ljava/lang/String;)J", "nanos", "o", "(J)J", "millis", "n", "normalNanos", "l", "normalMillis", "j", "normalValue", "unitDiscriminator", "i", "(JI)J", "m", "k", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: IJ.d  reason: case insensitive filesystem */
public final class C15908d {
    /* access modifiers changed from: private */
    public static final long i(long j10, int i10) {
        return C15906b.D((j10 << 1) + ((long) i10));
    }

    /* access modifiers changed from: private */
    public static final long j(long j10) {
        return C15906b.D((j10 << 1) + 1);
    }

    /* access modifiers changed from: private */
    public static final long k(long j10) {
        return (-4611686018426L > j10 || j10 >= 4611686018427L) ? j(C17978n.o(j10, -4611686018427387903L, 4611686018427387903L)) : l(n(j10));
    }

    /* access modifiers changed from: private */
    public static final long l(long j10) {
        return C15906b.D(j10 << 1);
    }

    /* access modifiers changed from: private */
    public static final long m(long j10) {
        return (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? j(o(j10)) : l(j10);
    }

    /* access modifiers changed from: private */
    public static final long n(long j10) {
        return j10 * ((long) 1000000);
    }

    /* access modifiers changed from: private */
    public static final long o(long j10) {
        return j10 / ((long) 1000000);
    }

    /* access modifiers changed from: private */
    public static final long p(String str, boolean z10) {
        long j10;
        long j11;
        int i10;
        String str2 = str;
        int length = str.length();
        if (length != 0) {
            C15906b.a aVar = C15906b.f135496b;
            long c10 = aVar.c();
            char charAt = str2.charAt(0);
            boolean z11 = true;
            int i11 = (charAt == '+' || charAt == '-') ? 1 : 0;
            boolean z12 = i11 > 0;
            boolean z13 = z12 && C15854t.e1(str2, '-', false, 2, (Object) null);
            if (length > i11) {
                char c11 = ':';
                String str3 = "No components";
                char c12 = '0';
                if (str2.charAt(i11) == 'P') {
                    int i12 = i11 + 1;
                    if (i12 != length) {
                        C15909e eVar = null;
                        boolean z14 = false;
                        while (i12 < length) {
                            if (str2.charAt(i12) != 'T') {
                                int i13 = i12;
                                while (true) {
                                    if (i13 >= str.length()) {
                                        break;
                                    }
                                    char charAt2 = str2.charAt(i13);
                                    if (c12 > charAt2 || charAt2 >= c11) {
                                        if (!C15854t.c0("+-.", charAt2, false, 2, (Object) null)) {
                                            break;
                                        }
                                    }
                                    i13++;
                                    c11 = ':';
                                    c12 = '0';
                                }
                                C17542s.h(str2, "null cannot be cast to non-null type java.lang.String");
                                String substring = str2.substring(i12, i13);
                                C17542s.i(substring, "substring(...)");
                                if (substring.length() != 0) {
                                    int length2 = i12 + substring.length();
                                    if (length2 < 0 || length2 >= str.length()) {
                                        throw new IllegalArgumentException("Missing unit for value " + substring);
                                    }
                                    char charAt3 = str2.charAt(length2);
                                    int i14 = length2 + 1;
                                    C15909e d10 = C15911g.d(charAt3, z14);
                                    if (eVar == null || eVar.compareTo(d10) > 0) {
                                        int r02 = C15854t.r0(substring, '.', 0, false, 6, (Object) null);
                                        if (d10 != C15909e.SECONDS || r02 <= 0) {
                                            i10 = i14;
                                            c10 = C15906b.a0(c10, t(q(substring), d10));
                                        } else {
                                            C17542s.h(substring, "null cannot be cast to non-null type java.lang.String");
                                            String substring2 = substring.substring(0, r02);
                                            C17542s.i(substring2, "substring(...)");
                                            i10 = i14;
                                            long a02 = C15906b.a0(c10, t(q(substring2), d10));
                                            C17542s.h(substring, "null cannot be cast to non-null type java.lang.String");
                                            String substring3 = substring.substring(r02);
                                            C17542s.i(substring3, "substring(...)");
                                            c10 = C15906b.a0(a02, r(Double.parseDouble(substring3), d10));
                                        }
                                        i12 = i10;
                                        eVar = d10;
                                        c11 = ':';
                                        c12 = '0';
                                        z11 = true;
                                    } else {
                                        throw new IllegalArgumentException("Unexpected order of duration components");
                                    }
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else if (z14 || (i12 = i12 + 1) == length) {
                                throw new IllegalArgumentException();
                            } else {
                                z14 = z11;
                            }
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else if (!z10) {
                    String str4 = "substring(...)";
                    String str5 = "Unexpected order of duration components";
                    long j12 = c10;
                    String str6 = str3;
                    if (C15854t.K(str, i11, "Infinity", 0, Math.max(length - i11, 8), true)) {
                        c10 = aVar.a();
                    } else {
                        boolean z15 = !z12;
                        if (z12 && str2.charAt(i11) == '(' && C15854t.H1(str) == ')') {
                            i11++;
                            length--;
                            if (i11 != length) {
                                j10 = j12;
                                z15 = true;
                            } else {
                                throw new IllegalArgumentException(str6);
                            }
                        } else {
                            j10 = j12;
                        }
                        C15909e eVar2 = null;
                        boolean z16 = false;
                        while (i11 < length) {
                            if (z16 && z15) {
                                while (i11 < str.length() && str2.charAt(i11) == ' ') {
                                    i11++;
                                }
                            }
                            int i15 = i11;
                            while (true) {
                                if (i15 >= str.length()) {
                                    break;
                                }
                                char charAt4 = str2.charAt(i15);
                                if (('0' > charAt4 || charAt4 >= ':') && charAt4 != '.') {
                                    break;
                                }
                                i15++;
                            }
                            C17542s.h(str2, "null cannot be cast to non-null type java.lang.String");
                            String substring4 = str2.substring(i11, i15);
                            C17542s.i(substring4, str4);
                            if (substring4.length() != 0) {
                                int length3 = i11 + substring4.length();
                                int i16 = length3;
                                while (i16 < str.length() && 'a' <= (r9 = str2.charAt(i16)) && r9 < '{') {
                                    i16++;
                                }
                                C17542s.h(str2, "null cannot be cast to non-null type java.lang.String");
                                String substring5 = str2.substring(length3, i16);
                                C17542s.i(substring5, str4);
                                int length4 = length3 + substring5.length();
                                C15909e e10 = C15911g.e(substring5);
                                if (eVar2 == null || eVar2.compareTo(e10) > 0) {
                                    String str7 = str5;
                                    int r03 = C15854t.r0(substring4, '.', 0, false, 6, (Object) null);
                                    if (r03 > 0) {
                                        C17542s.h(substring4, "null cannot be cast to non-null type java.lang.String");
                                        String substring6 = substring4.substring(0, r03);
                                        C17542s.i(substring6, str4);
                                        long a03 = C15906b.a0(j11, t(Long.parseLong(substring6), e10));
                                        C17542s.h(substring4, "null cannot be cast to non-null type java.lang.String");
                                        String substring7 = substring4.substring(r03);
                                        C17542s.i(substring7, str4);
                                        j11 = C15906b.a0(a03, r(Double.parseDouble(substring7), e10));
                                        length4 = length4;
                                        if (length4 < length) {
                                            throw new IllegalArgumentException("Fractional component must be last");
                                        }
                                    } else {
                                        j11 = C15906b.a0(j11, t(Long.parseLong(substring4), e10));
                                    }
                                    str5 = str7;
                                    eVar2 = e10;
                                    z16 = true;
                                } else {
                                    throw new IllegalArgumentException(str5);
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                        c10 = j11;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
                return z13 ? C15906b.e0(c10) : c10;
            }
            throw new IllegalArgumentException("No components");
        }
        throw new IllegalArgumentException("The string is empty");
    }

    private static final long q(String str) {
        int length = str.length();
        int i10 = (length <= 0 || !C15854t.c0("+-", str.charAt(0), false, 2, (Object) null)) ? 0 : 1;
        if (length - i10 > 16) {
            C17974j jVar = new C17974j(i10, C15854t.m0(str));
            if (!(jVar instanceof Collection) || !((Collection) jVar).isEmpty()) {
                Iterator it = jVar.iterator();
                while (it.hasNext()) {
                    char charAt = str.charAt(((U) it).c());
                    if ('0' <= charAt) {
                        if (charAt >= ':') {
                        }
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (C15854t.W(str, Marker.ANY_NON_NULL_MARKER, false, 2, (Object) null)) {
            str = C15854t.E1(str, 1);
        }
        return Long.parseLong(str);
    }

    public static final long r(double d10, C15909e eVar) {
        C17542s.j(eVar, "unit");
        double a10 = C15910f.a(d10, eVar, C15909e.NANOSECONDS);
        if (!Double.isNaN(a10)) {
            long f10 = C17752b.f(a10);
            return (-4611686018426999999L > f10 || f10 >= 4611686018427000000L) ? k(C17752b.f(C15910f.a(d10, eVar, C15909e.MILLISECONDS))) : l(f10);
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.");
    }

    public static final long s(int i10, C15909e eVar) {
        C17542s.j(eVar, "unit");
        return eVar.compareTo(C15909e.SECONDS) <= 0 ? l(C15910f.c((long) i10, eVar, C15909e.NANOSECONDS)) : t((long) i10, eVar);
    }

    public static final long t(long j10, C15909e eVar) {
        C17542s.j(eVar, "unit");
        C15909e eVar2 = C15909e.NANOSECONDS;
        long c10 = C15910f.c(4611686018426999999L, eVar2, eVar);
        return ((-c10) > j10 || j10 > c10) ? j(C17978n.o(C15910f.b(j10, eVar, C15909e.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : l(C15910f.c(j10, eVar, eVar2));
    }
}
