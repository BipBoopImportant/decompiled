package ea;

import android.os.Parcelable;

public final class P implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = L9.b.C(r10)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r7 = r6
            r8 = r7
            r4 = r2
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
            if (r2 == r3) goto L_0x003b
            r3 = 4
            if (r2 == r3) goto L_0x0031
            r3 = 6
            if (r2 == r3) goto L_0x002c
            L9.b.B(r10, r1)
            goto L_0x000b
        L_0x002c:
            java.lang.String r8 = L9.b.g(r10, r1)
            goto L_0x000b
        L_0x0031:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = L9.b.f(r10, r1, r2)
            r7 = r1
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
            goto L_0x000b
        L_0x003b:
            android.os.IBinder r6 = L9.b.v(r10, r1)
            goto L_0x000b
        L_0x0040:
            android.os.IBinder r5 = L9.b.v(r10, r1)
            goto L_0x000b
        L_0x0045:
            int r4 = L9.b.w(r10, r1)
            goto L_0x000b
        L_0x004a:
            L9.b.l(r10, r0)
            ea.O r10 = new ea.O
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.P.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new O[i10];
    }
}
