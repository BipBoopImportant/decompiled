package RH;

import HJ.C15838d;
import QH.C16246a;
import QH.C16247b;
import SH.C16416a;
import SH.C16418c;
import SH.f;
import SH.g;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\f\u001a\u00020\u000b*\u00020\u00062\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0002\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u0017\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u0019\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LRH/k;", "", "n", "", "b", "(LRH/k;I)[B", "LRH/n;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "max", "", "d", "(LRH/n;Ljava/nio/charset/Charset;I)Ljava/lang/String;", "bytesCount", "f", "(LRH/n;ILjava/nio/charset/Charset;)Ljava/lang/String;", "LRH/s;", "", "text", "fromIndex", "toIndex", "LXH/N;", "h", "(LRH/s;Ljava/lang/CharSequence;IILjava/nio/charset/Charset;)V", "j", "(LRH/s;Ljava/lang/CharSequence;II)V", "size", "", "a", "(I)Ljava/lang/Void;", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class w {
    public static final Void a(int i10) {
        throw new EOFException("Premature end of stream: expected " + i10 + " bytes");
    }

    public static final byte[] b(k kVar, int i10) {
        C17542s.j(kVar, "<this>");
        if (i10 == 0) {
            return g.f138269a;
        }
        byte[] bArr = new byte[i10];
        o.b(kVar, bArr, 0, i10);
        return bArr;
    }

    public static /* synthetic */ byte[] c(k kVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            long i02 = kVar.i0();
            if (i02 <= 2147483647L) {
                i10 = (int) i02;
            } else {
                throw new IllegalArgumentException("Unable to convert to a ByteArray: packet is too big");
            }
        }
        return b(kVar, i10);
    }

    public static final String d(n nVar, Charset charset, int i10) {
        C17542s.j(nVar, "<this>");
        C17542s.j(charset, "charset");
        CharsetDecoder newDecoder = charset.newDecoder();
        C17542s.i(newDecoder, "charset.newDecoder()");
        return C16247b.a(newDecoder, nVar, i10);
    }

    public static /* synthetic */ String e(n nVar, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = C15838d.f135279b;
        }
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return d(nVar, charset, i10);
    }

    public static final String f(n nVar, int i10, Charset charset) {
        C17542s.j(nVar, "<this>");
        C17542s.j(charset, "charset");
        CharsetDecoder newDecoder = charset.newDecoder();
        C17542s.i(newDecoder, "charset.newDecoder()");
        return C16246a.b(newDecoder, nVar, i10);
    }

    public static /* synthetic */ String g(n nVar, int i10, Charset charset, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charset = C15838d.f135279b;
        }
        return f(nVar, i10, charset);
    }

    public static final void h(s sVar, CharSequence charSequence, int i10, int i11, Charset charset) {
        C17542s.j(sVar, "<this>");
        C17542s.j(charSequence, "text");
        C17542s.j(charset, "charset");
        if (charset == C15838d.f135279b) {
            j(sVar, charSequence, i10, i11);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        C17542s.i(newEncoder, "charset.newEncoder()");
        C16247b.f(newEncoder, sVar, charSequence, i10, i11);
    }

    public static /* synthetic */ void i(s sVar, CharSequence charSequence, int i10, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        if ((i12 & 8) != 0) {
            charset = C15838d.f135279b;
        }
        h(sVar, charSequence, i10, i11, charset);
    }

    private static final void j(s sVar, CharSequence charSequence, int i10, int i11) {
        C16416a d10 = g.d(sVar, 1, (C16416a) null);
        while (true) {
            try {
                int b10 = f.b(d10.h(), charSequence, i10, i11, d10.k(), d10.g());
                short a10 = C16418c.a(b10) & 65535;
                i10 += a10;
                d10.a(C16418c.b(b10) & 65535);
                int i12 = (a10 != 0 || i10 >= i11) ? i10 < i11 ? 1 : 0 : 8;
                if (i12 > 0) {
                    d10 = g.d(sVar, i12, d10);
                } else {
                    return;
                }
            } finally {
                sVar.d();
            }
        }
    }
}
