package HJ;

import XH.C16797D;
import XH.C16799F;
import XH.C16801H;
import XH.C16804K;
import XH.C16820k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0015\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"", "LXH/D;", "a", "(Ljava/lang/String;)B", "LXH/K;", "j", "(Ljava/lang/String;)S", "LXH/F;", "d", "(Ljava/lang/String;)I", "LXH/H;", "g", "(Ljava/lang/String;)J", "b", "(Ljava/lang/String;)LXH/D;", "", "radix", "c", "(Ljava/lang/String;I)LXH/D;", "k", "(Ljava/lang/String;)LXH/K;", "l", "(Ljava/lang/String;I)LXH/K;", "e", "(Ljava/lang/String;)LXH/F;", "f", "(Ljava/lang/String;I)LXH/F;", "h", "(Ljava/lang/String;)LXH/H;", "i", "(Ljava/lang/String;I)LXH/H;", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: HJ.N  reason: case insensitive filesystem */
public final class C15833N {
    public static final byte a(String str) {
        C17542s.j(str, "<this>");
        C16797D b10 = b(str);
        if (b10 != null) {
            return b10.v();
        }
        C15824E.s(str);
        throw new C16820k();
    }

    public static final C16797D b(String str) {
        C17542s.j(str, "<this>");
        return c(str, 10);
    }

    public static final C16797D c(String str, int i10) {
        C17542s.j(str, "<this>");
        C16799F f10 = f(str, i10);
        if (f10 == null) {
            return null;
        }
        int v10 = f10.v();
        if (Integer.compareUnsigned(v10, C16799F.b(255)) > 0) {
            return null;
        }
        return C16797D.a(C16797D.b((byte) v10));
    }

    public static final int d(String str) {
        C17542s.j(str, "<this>");
        C16799F e10 = e(str);
        if (e10 != null) {
            return e10.v();
        }
        C15824E.s(str);
        throw new C16820k();
    }

    public static final C16799F e(String str) {
        C17542s.j(str, "<this>");
        return f(str, 10);
    }

    public static final C16799F f(String str, int i10) {
        int i11;
        C17542s.j(str, "<this>");
        C15835a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        if (C17542s.l(charAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i11 = 0;
        }
        int b10 = C16799F.b(i10);
        int i13 = 119304647;
        while (i11 < length) {
            int b11 = C15836b.b(str.charAt(i11), i10);
            if (b11 < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i12, i13) > 0) {
                if (i13 == 119304647) {
                    i13 = Integer.divideUnsigned(-1, b10);
                    if (Integer.compareUnsigned(i12, i13) > 0) {
                    }
                }
                return null;
            }
            int b12 = C16799F.b(i12 * b10);
            int b13 = C16799F.b(C16799F.b(b11) + b12);
            if (Integer.compareUnsigned(b13, b12) < 0) {
                return null;
            }
            i11++;
            i12 = b13;
        }
        return C16799F.a(i12);
    }

    public static final long g(String str) {
        C17542s.j(str, "<this>");
        C16801H h10 = h(str);
        if (h10 != null) {
            return h10.B();
        }
        C15824E.s(str);
        throw new C16820k();
    }

    public static final C16801H h(String str) {
        C17542s.j(str, "<this>");
        return i(str, 10);
    }

    public static final C16801H i(String str, int i10) {
        String str2 = str;
        int i11 = i10;
        C17542s.j(str2, "<this>");
        C15835a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str2.charAt(0);
        if (C17542s.l(charAt, 48) < 0) {
            i12 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long b10 = C16801H.b((long) i11);
        long j10 = 0;
        long j11 = 512409557603043100L;
        while (i12 < length) {
            int b11 = C15836b.b(str2.charAt(i12), i11);
            if (b11 < 0) {
                return null;
            }
            if (Long.compareUnsigned(j10, j11) > 0) {
                if (j11 == 512409557603043100L) {
                    j11 = Long.divideUnsigned(-1, b10);
                    if (Long.compareUnsigned(j10, j11) > 0) {
                    }
                }
                return null;
            }
            long b12 = C16801H.b(j10 * b10);
            long b13 = C16801H.b(C16801H.b(((long) C16799F.b(b11)) & 4294967295L) + b12);
            if (Long.compareUnsigned(b13, b12) < 0) {
                return null;
            }
            i12++;
            j10 = b13;
        }
        return C16801H.a(j10);
    }

    public static final short j(String str) {
        C17542s.j(str, "<this>");
        C16804K k10 = k(str);
        if (k10 != null) {
            return k10.v();
        }
        C15824E.s(str);
        throw new C16820k();
    }

    public static final C16804K k(String str) {
        C17542s.j(str, "<this>");
        return l(str, 10);
    }

    public static final C16804K l(String str, int i10) {
        C17542s.j(str, "<this>");
        C16799F f10 = f(str, i10);
        if (f10 == null) {
            return null;
        }
        int v10 = f10.v();
        if (Integer.compareUnsigned(v10, C16799F.b(65535)) > 0) {
            return null;
        }
        return C16804K.a(C16804K.b((short) v10));
    }
}
