package ea;

import android.os.Parcelable;

public final class U implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r12) {
        /*
            r11 = this;
            int r0 = L9.b.C(r12)
            r1 = 0
            r2 = 1
            r5 = r1
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r4 = r2
        L_0x000d:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L_0x004f
            int r1 = L9.b.u(r12)
            int r2 = L9.b.m(r1)
            switch(r2) {
                case 1: goto L_0x004a;
                case 2: goto L_0x0040;
                case 3: goto L_0x003b;
                case 4: goto L_0x0031;
                case 5: goto L_0x002c;
                case 6: goto L_0x0027;
                case 7: goto L_0x001e;
                case 8: goto L_0x0022;
                default: goto L_0x001e;
            }
        L_0x001e:
            L9.b.B(r12, r1)
            goto L_0x000d
        L_0x0022:
            java.lang.String r10 = L9.b.g(r12, r1)
            goto L_0x000d
        L_0x0027:
            android.os.IBinder r9 = L9.b.v(r12, r1)
            goto L_0x000d
        L_0x002c:
            android.os.IBinder r7 = L9.b.v(r12, r1)
            goto L_0x000d
        L_0x0031:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = L9.b.f(r12, r1, r2)
            r8 = r1
            android.app.PendingIntent r8 = (android.app.PendingIntent) r8
            goto L_0x000d
        L_0x003b:
            android.os.IBinder r6 = L9.b.v(r12, r1)
            goto L_0x000d
        L_0x0040:
            android.os.Parcelable$Creator<ea.Q> r2 = ea.Q.CREATOR
            android.os.Parcelable r1 = L9.b.f(r12, r1, r2)
            r5 = r1
            ea.Q r5 = (ea.Q) r5
            goto L_0x000d
        L_0x004a:
            int r4 = L9.b.w(r12, r1)
            goto L_0x000d
        L_0x004f:
            L9.b.l(r12, r0)
            ea.T r12 = new ea.T
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.U.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new T[i10];
    }
}
