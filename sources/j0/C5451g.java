package j0;

import kotlin.Metadata;
import mI.C17604b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u0001\b\u0001\u00020\u0007¨\u0006\u000b"}, d2 = {"Lj0/g;", "", "", "first", "second", "a", "(FF)J", "", "packedValue", "b", "(J)J", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
/* renamed from: j0.g  reason: case insensitive filesystem */
public final class C5451g {
    public static long a(float f10, float f11) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f10);
        return b((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static long b(long j10) {
        return j10;
    }
}
