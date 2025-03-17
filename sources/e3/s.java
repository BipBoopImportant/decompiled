package E3;

import android.media.MediaCodec;
import y3.e;

public class s extends e {

    /* renamed from: a  reason: collision with root package name */
    public final t f34820a;

    /* renamed from: b  reason: collision with root package name */
    public final String f34821b;

    /* renamed from: c  reason: collision with root package name */
    public final int f34822c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s(java.lang.Throwable r4, E3.t r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder failed: "
            r0.append(r1)
            r1 = 0
            if (r5 != 0) goto L_0x000f
            r2 = r1
            goto L_0x0011
        L_0x000f:
            java.lang.String r2 = r5.f34823a
        L_0x0011:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f34820a = r5
            boolean r5 = r4 instanceof android.media.MediaCodec.CodecException
            if (r5 == 0) goto L_0x0028
            r5 = r4
            android.media.MediaCodec$CodecException r5 = (android.media.MediaCodec.CodecException) r5
            java.lang.String r1 = r5.getDiagnosticInfo()
        L_0x0028:
            r3.f34821b = r1
            int r5 = t3.N.f29462a
            r0 = 23
            if (r5 < r0) goto L_0x0035
            int r4 = a(r4)
            goto L_0x0039
        L_0x0035:
            int r4 = t3.N.Z(r1)
        L_0x0039:
            r3.f34822c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.s.<init>(java.lang.Throwable, E3.t):void");
    }

    private static int a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getErrorCode();
        }
        return 0;
    }
}
