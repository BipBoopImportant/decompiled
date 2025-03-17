package JJ;

import HJ.C15840f;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\t\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\u0006*\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "", "dst", "", "dstOffset", "count", "LXH/N;", "d", "(J[BII)V", "", "index", "c", "(Ljava/lang/String;I)V", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
/* renamed from: JJ.d  reason: case insensitive filesystem */
class C15971d extends C15970c {
    /* access modifiers changed from: private */
    public static final void c(String str, int i10) {
        if (str.charAt(i10) != '-') {
            throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i10 + ", but was '" + str.charAt(i10) + '\'').toString());
        }
    }

    /* access modifiers changed from: private */
    public static final void d(long j10, byte[] bArr, int i10, int i11) {
        int i12 = i10 + (i11 * 2);
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = C15840f.i()[(int) (255 & j10)];
            bArr[i12 - 1] = (byte) i14;
            i12 -= 2;
            bArr[i12] = (byte) (i14 >> 8);
            j10 >>= 8;
        }
    }
}
