package E;

import O.A;
import O.B;
import android.graphics.Bitmap;
import androidx.camera.core.n;

/* renamed from: E.v  reason: case insensitive filesystem */
public class C4438v implements A<B<n>, Bitmap> {
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bb A[Catch:{ all -> 0x0023 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00be A[Catch:{ all -> 0x0023 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap apply(O.B<androidx.camera.core.n> r10) {
        /*
            r9 = this;
            r0 = 35
            r1 = 0
            r2 = 0
            int r3 = r10.e()     // Catch:{ UnsupportedOperationException -> 0x0026 }
            if (r3 != r0) goto L_0x0075
            java.lang.Object r3 = r10.c()     // Catch:{ UnsupportedOperationException -> 0x0026 }
            androidx.camera.core.n r3 = (androidx.camera.core.n) r3     // Catch:{ UnsupportedOperationException -> 0x0026 }
            int r4 = r10.f()     // Catch:{ UnsupportedOperationException -> 0x0026 }
            int r4 = r4 % 180
            r5 = 1
            if (r4 == 0) goto L_0x001b
            r4 = r5
            goto L_0x001c
        L_0x001b:
            r4 = r1
        L_0x001c:
            if (r4 == 0) goto L_0x0029
            int r6 = r3.getHeight()     // Catch:{ UnsupportedOperationException -> 0x0026 }
            goto L_0x002d
        L_0x0023:
            r10 = move-exception
            goto L_0x00dc
        L_0x0026:
            r3 = move-exception
            goto L_0x00b5
        L_0x0029:
            int r6 = r3.getWidth()     // Catch:{ UnsupportedOperationException -> 0x0026 }
        L_0x002d:
            if (r4 == 0) goto L_0x0034
            int r4 = r3.getWidth()     // Catch:{ UnsupportedOperationException -> 0x0026 }
            goto L_0x0038
        L_0x0034:
            int r4 = r3.getHeight()     // Catch:{ UnsupportedOperationException -> 0x0026 }
        L_0x0038:
            androidx.camera.core.q r7 = new androidx.camera.core.q     // Catch:{ UnsupportedOperationException -> 0x0026 }
            r8 = 2
            androidx.camera.core.impl.t0 r4 = androidx.camera.core.o.a(r6, r4, r5, r8)     // Catch:{ UnsupportedOperationException -> 0x0026 }
            r7.<init>(r4)     // Catch:{ UnsupportedOperationException -> 0x0026 }
            int r4 = r3.getWidth()     // Catch:{ UnsupportedOperationException -> 0x006a, all -> 0x0066 }
            int r5 = r3.getHeight()     // Catch:{ UnsupportedOperationException -> 0x006a, all -> 0x0066 }
            int r4 = r4 * r5
            int r4 = r4 * 4
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r4)     // Catch:{ UnsupportedOperationException -> 0x006a, all -> 0x0066 }
            int r5 = r10.f()     // Catch:{ UnsupportedOperationException -> 0x006a, all -> 0x0066 }
            androidx.camera.core.n r4 = androidx.camera.core.ImageProcessingUtil.g(r3, r7, r4, r5, r1)     // Catch:{ UnsupportedOperationException -> 0x006a, all -> 0x0066 }
            r3.close()     // Catch:{ UnsupportedOperationException -> 0x006a, all -> 0x0066 }
            if (r4 == 0) goto L_0x006d
            android.graphics.Bitmap r2 = N.b.b(r4)     // Catch:{ UnsupportedOperationException -> 0x006a, all -> 0x0066 }
            r4.close()     // Catch:{ UnsupportedOperationException -> 0x006a, all -> 0x0066 }
            goto L_0x0094
        L_0x0066:
            r10 = move-exception
            r2 = r7
            goto L_0x00dc
        L_0x006a:
            r3 = move-exception
            r2 = r7
            goto L_0x00b5
        L_0x006d:
            C.V r3 = new C.V     // Catch:{ UnsupportedOperationException -> 0x006a, all -> 0x0066 }
            java.lang.String r4 = "Can't covert YUV to RGB"
            r3.<init>(r1, r4, r2)     // Catch:{ UnsupportedOperationException -> 0x006a, all -> 0x0066 }
            throw r3     // Catch:{ UnsupportedOperationException -> 0x006a, all -> 0x0066 }
        L_0x0075:
            int r3 = r10.e()     // Catch:{ UnsupportedOperationException -> 0x0026 }
            r4 = 256(0x100, float:3.59E-43)
            if (r3 != r4) goto L_0x009a
            java.lang.Object r3 = r10.c()     // Catch:{ UnsupportedOperationException -> 0x0026 }
            androidx.camera.core.n r3 = (androidx.camera.core.n) r3     // Catch:{ UnsupportedOperationException -> 0x0026 }
            android.graphics.Bitmap r4 = N.b.b(r3)     // Catch:{ UnsupportedOperationException -> 0x0026 }
            r3.close()     // Catch:{ UnsupportedOperationException -> 0x0026 }
            int r3 = r10.f()     // Catch:{ UnsupportedOperationException -> 0x0026 }
            android.graphics.Bitmap r10 = N.b.l(r4, r3)     // Catch:{ UnsupportedOperationException -> 0x0026 }
            r7 = r2
            r2 = r10
        L_0x0094:
            if (r7 == 0) goto L_0x0099
            r7.close()
        L_0x0099:
            return r2
        L_0x009a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ UnsupportedOperationException -> 0x0026 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ UnsupportedOperationException -> 0x0026 }
            r4.<init>()     // Catch:{ UnsupportedOperationException -> 0x0026 }
            java.lang.String r5 = "Invalid postview image format : "
            r4.append(r5)     // Catch:{ UnsupportedOperationException -> 0x0026 }
            int r5 = r10.e()     // Catch:{ UnsupportedOperationException -> 0x0026 }
            r4.append(r5)     // Catch:{ UnsupportedOperationException -> 0x0026 }
            java.lang.String r4 = r4.toString()     // Catch:{ UnsupportedOperationException -> 0x0026 }
            r3.<init>(r4)     // Catch:{ UnsupportedOperationException -> 0x0026 }
            throw r3     // Catch:{ UnsupportedOperationException -> 0x0026 }
        L_0x00b5:
            int r10 = r10.e()     // Catch:{ all -> 0x0023 }
            if (r10 != r0) goto L_0x00be
            java.lang.String r10 = "YUV"
            goto L_0x00c0
        L_0x00be:
            java.lang.String r10 = "JPEG"
        L_0x00c0:
            C.V r0 = new C.V     // Catch:{ all -> 0x0023 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0023 }
            r4.<init>()     // Catch:{ all -> 0x0023 }
            java.lang.String r5 = "Can't convert "
            r4.append(r5)     // Catch:{ all -> 0x0023 }
            r4.append(r10)     // Catch:{ all -> 0x0023 }
            java.lang.String r10 = " to bitmap"
            r4.append(r10)     // Catch:{ all -> 0x0023 }
            java.lang.String r10 = r4.toString()     // Catch:{ all -> 0x0023 }
            r0.<init>(r1, r10, r3)     // Catch:{ all -> 0x0023 }
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x00dc:
            if (r2 == 0) goto L_0x00e1
            r2.close()
        L_0x00e1:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: E.C4438v.apply(O.B):android.graphics.Bitmap");
    }
}
