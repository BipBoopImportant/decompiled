package WK;

import HJ.C15854t;
import WK.C16770e;
import XK.C16835b;
import com.sugarcube.core.logger.DslKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000J\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u0016*\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010!\u001a\u00020\n*\u00020\u001f2\u0006\u0010 \u001a\u00020\nH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\u00020\n*\u00020\u000f2\u0006\u0010#\u001a\u00020\nH\u0000¢\u0006\u0004\b$\u0010%\"\u001a\u0010)\u001a\u00020\u001b8\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(\"\u001a\u0010-\u001a\u00020\n8\u0000XD¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"", "size", "offset", "byteCount", "LXH/N;", "b", "(JJJ)V", "", "j", "(S)S", "", "h", "(I)I", "i", "(J)J", "", "a", "aOffset", "bOffset", "", "([BI[BII)Z", "", "", "k", "(B)Ljava/lang/String;", "l", "(I)Ljava/lang/String;", "LWK/e$a;", "unsafeCursor", "g", "(LWK/e$a;)LWK/e$a;", "LWK/h;", "position", "e", "(LWK/h;I)I", "sizeParam", "f", "([BI)I", "LWK/e$a;", "d", "()LWK/e$a;", "DEFAULT__new_UnsafeCursor", "I", "c", "()I", "DEFAULT__ByteString_size", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.b  reason: case insensitive filesystem */
public final class C16767b {

    /* renamed from: a  reason: collision with root package name */
    private static final C16770e.a f139638a = new C16770e.a();

    /* renamed from: b  reason: collision with root package name */
    private static final int f139639b = -1234567890;

    public static final boolean a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        C17542s.j(bArr, "a");
        C17542s.j(bArr2, DslKt.INDICATOR_BACKGROUND);
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final int c() {
        return f139639b;
    }

    public static final C16770e.a d() {
        return f139638a;
    }

    public static final int e(C16773h hVar, int i10) {
        C17542s.j(hVar, "<this>");
        return i10 == f139639b ? hVar.W() : i10;
    }

    public static final int f(byte[] bArr, int i10) {
        C17542s.j(bArr, "<this>");
        return i10 == f139639b ? bArr.length : i10;
    }

    public static final C16770e.a g(C16770e.a aVar) {
        C17542s.j(aVar, "unsafeCursor");
        return aVar == f139638a ? new C16770e.a() : aVar;
    }

    public static final int h(int i10) {
        return ((i10 & 255) << 24) | ((-16777216 & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final long i(long j10) {
        return ((j10 & 255) << 56) | ((-72057594037927936L & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    public static final short j(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static final String k(byte b10) {
        return C15854t.x(new char[]{C16835b.f()[(b10 >> 4) & 15], C16835b.f()[b10 & 15]});
    }

    public static final String l(int i10) {
        int i11 = 0;
        if (i10 == 0) {
            return "0";
        }
        char[] cArr = {C16835b.f()[(i10 >> 28) & 15], C16835b.f()[(i10 >> 24) & 15], C16835b.f()[(i10 >> 20) & 15], C16835b.f()[(i10 >> 16) & 15], C16835b.f()[(i10 >> 12) & 15], C16835b.f()[(i10 >> 8) & 15], C16835b.f()[(i10 >> 4) & 15], C16835b.f()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return C15854t.y(cArr, i11, 8);
    }
}
