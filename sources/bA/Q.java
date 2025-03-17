package Ba;

import android.os.Parcelable;

public final class Q implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r34) {
        /*
            r33 = this;
            r0 = r34
            int r1 = L9.b.C(r34)
            java.util.ArrayList r2 = com.google.android.gms.common.util.b.c()
            java.util.ArrayList r3 = com.google.android.gms.common.util.b.c()
            java.util.ArrayList r4 = com.google.android.gms.common.util.b.c()
            java.util.ArrayList r5 = com.google.android.gms.common.util.b.c()
            java.util.ArrayList r6 = com.google.android.gms.common.util.b.c()
            java.util.ArrayList r7 = com.google.android.gms.common.util.b.c()
            r8 = 0
            r9 = 0
            r22 = r2
            r24 = r3
            r27 = r4
            r29 = r5
            r30 = r6
            r31 = r7
            r11 = r8
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r23 = r20
            r25 = r23
            r26 = r25
            r32 = r26
            r21 = r9
            r28 = r21
        L_0x0047:
            int r2 = r34.dataPosition()
            if (r2 >= r1) goto L_0x00e8
            int r2 = L9.b.u(r34)
            int r3 = L9.b.m(r2)
            switch(r3) {
                case 2: goto L_0x00e2;
                case 3: goto L_0x00dc;
                case 4: goto L_0x00d6;
                case 5: goto L_0x00d0;
                case 6: goto L_0x00ca;
                case 7: goto L_0x00c4;
                case 8: goto L_0x00bf;
                case 9: goto L_0x00ba;
                case 10: goto L_0x00b5;
                case 11: goto L_0x00b0;
                case 12: goto L_0x00ab;
                case 13: goto L_0x00a4;
                case 14: goto L_0x0099;
                case 15: goto L_0x0092;
                case 16: goto L_0x008d;
                case 17: goto L_0x0088;
                case 18: goto L_0x0081;
                case 19: goto L_0x007c;
                case 20: goto L_0x0075;
                case 21: goto L_0x006e;
                case 22: goto L_0x0067;
                case 23: goto L_0x005c;
                default: goto L_0x0058;
            }
        L_0x0058:
            L9.b.B(r0, r2)
            goto L_0x0047
        L_0x005c:
            android.os.Parcelable$Creator<Da.c> r3 = Da.c.CREATOR
            android.os.Parcelable r2 = L9.b.f(r0, r2, r3)
            r32 = r2
            Da.c r32 = (Da.c) r32
            goto L_0x0047
        L_0x0067:
            android.os.Parcelable$Creator<Da.g> r3 = Da.g.CREATOR
            java.util.ArrayList r31 = L9.b.k(r0, r2, r3)
            goto L_0x0047
        L_0x006e:
            android.os.Parcelable$Creator<Da.e> r3 = Da.e.CREATOR
            java.util.ArrayList r30 = L9.b.k(r0, r2, r3)
            goto L_0x0047
        L_0x0075:
            android.os.Parcelable$Creator<Da.g> r3 = Da.g.CREATOR
            java.util.ArrayList r29 = L9.b.k(r0, r2, r3)
            goto L_0x0047
        L_0x007c:
            boolean r28 = L9.b.n(r0, r2)
            goto L_0x0047
        L_0x0081:
            android.os.Parcelable$Creator<Da.b> r3 = Da.b.CREATOR
            java.util.ArrayList r27 = L9.b.k(r0, r2, r3)
            goto L_0x0047
        L_0x0088:
            java.lang.String r26 = L9.b.g(r0, r2)
            goto L_0x0047
        L_0x008d:
            java.lang.String r25 = L9.b.g(r0, r2)
            goto L_0x0047
        L_0x0092:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r3 = com.google.android.gms.maps.model.LatLng.CREATOR
            java.util.ArrayList r24 = L9.b.k(r0, r2, r3)
            goto L_0x0047
        L_0x0099:
            android.os.Parcelable$Creator<Da.f> r3 = Da.f.CREATOR
            android.os.Parcelable r2 = L9.b.f(r0, r2, r3)
            r23 = r2
            Da.f r23 = (Da.f) r23
            goto L_0x0047
        L_0x00a4:
            android.os.Parcelable$Creator<Da.h> r3 = Da.h.CREATOR
            java.util.ArrayList r22 = L9.b.k(r0, r2, r3)
            goto L_0x0047
        L_0x00ab:
            int r21 = L9.b.w(r0, r2)
            goto L_0x0047
        L_0x00b0:
            java.lang.String r20 = L9.b.g(r0, r2)
            goto L_0x0047
        L_0x00b5:
            java.lang.String r19 = L9.b.g(r0, r2)
            goto L_0x0047
        L_0x00ba:
            java.lang.String r18 = L9.b.g(r0, r2)
            goto L_0x0047
        L_0x00bf:
            java.lang.String r17 = L9.b.g(r0, r2)
            goto L_0x0047
        L_0x00c4:
            java.lang.String r16 = L9.b.g(r0, r2)
            goto L_0x0047
        L_0x00ca:
            java.lang.String r15 = L9.b.g(r0, r2)
            goto L_0x0047
        L_0x00d0:
            java.lang.String r14 = L9.b.g(r0, r2)
            goto L_0x0047
        L_0x00d6:
            java.lang.String r13 = L9.b.g(r0, r2)
            goto L_0x0047
        L_0x00dc:
            java.lang.String r12 = L9.b.g(r0, r2)
            goto L_0x0047
        L_0x00e2:
            java.lang.String r11 = L9.b.g(r0, r2)
            goto L_0x0047
        L_0x00e8:
            L9.b.l(r0, r1)
            Ba.f r0 = new Ba.f
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ba.Q.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6382f[i10];
    }
}
