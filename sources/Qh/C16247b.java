package QH;

import RH.j;
import RH.k;
import RH.n;
import RH.s;
import SH.C16416a;
import SH.g;
import TH.C16492f;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\b\u001a\u00020\u0007*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000f\u001a\u00020\u000e*\u00060\nj\u0002`\u000b2\u0006\u0010\u0003\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0016\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u0019\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ljava/nio/charset/CharsetEncoder;", "Lio/ktor/utils/io/charsets/CharsetEncoder;", "", "input", "", "fromIndex", "toIndex", "LRH/k;", "c", "(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;II)LRH/k;", "Ljava/nio/charset/CharsetDecoder;", "Lio/ktor/utils/io/charsets/CharsetDecoder;", "LRH/n;", "max", "", "a", "(Ljava/nio/charset/CharsetDecoder;LRH/n;I)Ljava/lang/String;", "", "g", "(LRH/n;)J", "LRH/s;", "dst", "e", "(Ljava/nio/charset/CharsetEncoder;LRH/s;)I", "destination", "f", "(Ljava/nio/charset/CharsetEncoder;LRH/s;Ljava/lang/CharSequence;II)I", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: QH.b  reason: case insensitive filesystem */
public final class C16247b {
    public static final String a(CharsetDecoder charsetDecoder, n nVar, int i10) {
        C17542s.j(charsetDecoder, "<this>");
        C17542s.j(nVar, "input");
        StringBuilder sb2 = new StringBuilder((int) Math.min((long) i10, g(nVar)));
        C16246a.a(charsetDecoder, nVar, sb2, i10);
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public static /* synthetic */ String b(CharsetDecoder charsetDecoder, n nVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return a(charsetDecoder, nVar, i10);
    }

    public static final k c(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11) {
        C17542s.j(charsetEncoder, "<this>");
        C17542s.j(charSequence, "input");
        j jVar = new j((C16492f) null, 1, (DefaultConstructorMarker) null);
        try {
            f(charsetEncoder, jVar, charSequence, i10, i11);
            return jVar.t0();
        } catch (Throwable th2) {
            jVar.J();
            throw th2;
        }
    }

    public static /* synthetic */ k d(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return c(charsetEncoder, charSequence, i10, i11);
    }

    private static final int e(CharsetEncoder charsetEncoder, s sVar) {
        C16416a d10 = g.d(sVar, 1, (C16416a) null);
        int i10 = 1;
        int i11 = 0;
        while (true) {
            try {
                int g10 = d10.g() - d10.k();
                i10 = C16246a.e(charsetEncoder, d10) ? 0 : i10 + 1;
                i11 += g10 - (d10.g() - d10.k());
                if (i10 <= 0) {
                    return i11;
                }
                d10 = g.d(sVar, 1, d10);
            } finally {
                sVar.d();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public static final int f(CharsetEncoder charsetEncoder, s sVar, CharSequence charSequence, int i10, int i11) {
        C17542s.j(charsetEncoder, "<this>");
        C17542s.j(sVar, "destination");
        C17542s.j(charSequence, "input");
        if (i10 >= i11) {
            return 0;
        }
        C16416a d10 = g.d(sVar, 1, (C16416a) null);
        int i12 = 0;
        while (true) {
            try {
                int g10 = d10.g() - d10.k();
                int f10 = C16246a.f(charsetEncoder, charSequence, i10, i11, d10);
                if (f10 >= 0) {
                    i10 += f10;
                    i12 += g10 - (d10.g() - d10.k());
                    int i13 = i10 >= i11 ? 0 : f10 == 0 ? 8 : 1;
                    if (i13 > 0) {
                        d10 = g.d(sVar, i13, d10);
                    } else {
                        sVar.d();
                        return i12 + e(charsetEncoder, sVar);
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                sVar.d();
                throw th2;
            }
        }
    }

    public static final long g(n nVar) {
        C17542s.j(nVar, "<this>");
        return nVar instanceof k ? nVar.i0() : Math.max(nVar.i0(), 16);
    }
}
