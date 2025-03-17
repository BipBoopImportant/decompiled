package K9;

import android.os.Parcelable;

public final class V implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = L9.b.C(r10)
            r1 = 0
            r2 = 0
            r4 = r1
            r7 = r4
            r8 = r7
            r5 = r2
            r6 = r5
        L_0x000b:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L_0x004a
            int r1 = L9.b.u(r10)
            int r2 = L9.b.m(r1)
            r3 = 1
            if (r2 == r3) goto L_0x0045
            r3 = 2
            if (r2 == r3) goto L_0x0040
            r3 = 3
            if (r2 == r3) goto L_0x0036
            r3 = 4
            if (r2 == r3) goto L_0x0031
            r3 = 5
            if (r2 == r3) goto L_0x002c
            L9.b.B(r10, r1)
            goto L_0x000b
        L_0x002c:
            boolean r8 = L9.b.n(r10, r1)
            goto L_0x000b
        L_0x0031:
            boolean r7 = L9.b.n(r10, r1)
            goto L_0x000b
        L_0x0036:
            android.os.Parcelable$Creator<com.google.android.gms.common.ConnectionResult> r2 = com.google.android.gms.common.ConnectionResult.CREATOR
            android.os.Parcelable r1 = L9.b.f(r10, r1, r2)
            r6 = r1
            com.google.android.gms.common.ConnectionResult r6 = (com.google.android.gms.common.ConnectionResult) r6
            goto L_0x000b
        L_0x0040:
            android.os.IBinder r5 = L9.b.v(r10, r1)
            goto L_0x000b
        L_0x0045:
            int r4 = L9.b.w(r10, r1)
            goto L_0x000b
        L_0x004a:
            L9.b.l(r10, r0)
            K9.U r10 = new K9.U
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: K9.V.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new U[i10];
    }
}
