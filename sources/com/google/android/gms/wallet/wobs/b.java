package com.google.android.gms.wallet.wobs;

import android.os.Parcelable;

public final class b implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r31) {
        /*
            r30 = this;
            r0 = r31
            int r1 = L9.b.C(r31)
            java.util.ArrayList r2 = com.google.android.gms.common.util.b.c()
            java.util.ArrayList r3 = com.google.android.gms.common.util.b.c()
            java.util.ArrayList r4 = com.google.android.gms.common.util.b.c()
            java.util.ArrayList r5 = com.google.android.gms.common.util.b.c()
            java.util.ArrayList r6 = com.google.android.gms.common.util.b.c()
            java.util.ArrayList r7 = com.google.android.gms.common.util.b.c()
            r8 = 0
            r9 = 0
            r20 = r2
            r22 = r3
            r25 = r4
            r27 = r5
            r28 = r6
            r29 = r7
            r19 = r8
            r26 = r19
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r21 = r18
            r23 = r21
            r24 = r23
        L_0x0041:
            int r2 = r31.dataPosition()
            if (r2 >= r1) goto L_0x00c9
            int r2 = L9.b.u(r31)
            int r3 = L9.b.m(r2)
            switch(r3) {
                case 2: goto L_0x00c3;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00b8;
                case 5: goto L_0x00b3;
                case 6: goto L_0x00ae;
                case 7: goto L_0x00a9;
                case 8: goto L_0x00a4;
                case 9: goto L_0x009f;
                case 10: goto L_0x009a;
                case 11: goto L_0x0093;
                case 12: goto L_0x0088;
                case 13: goto L_0x0081;
                case 14: goto L_0x007c;
                case 15: goto L_0x0077;
                case 16: goto L_0x0070;
                case 17: goto L_0x006b;
                case 18: goto L_0x0064;
                case 19: goto L_0x005d;
                case 20: goto L_0x0056;
                default: goto L_0x0052;
            }
        L_0x0052:
            L9.b.B(r0, r2)
            goto L_0x0041
        L_0x0056:
            android.os.Parcelable$Creator<Da.g> r3 = Da.g.CREATOR
            java.util.ArrayList r29 = L9.b.k(r0, r2, r3)
            goto L_0x0041
        L_0x005d:
            android.os.Parcelable$Creator<Da.e> r3 = Da.e.CREATOR
            java.util.ArrayList r28 = L9.b.k(r0, r2, r3)
            goto L_0x0041
        L_0x0064:
            android.os.Parcelable$Creator<Da.g> r3 = Da.g.CREATOR
            java.util.ArrayList r27 = L9.b.k(r0, r2, r3)
            goto L_0x0041
        L_0x006b:
            boolean r26 = L9.b.n(r0, r2)
            goto L_0x0041
        L_0x0070:
            android.os.Parcelable$Creator<Da.b> r3 = Da.b.CREATOR
            java.util.ArrayList r25 = L9.b.k(r0, r2, r3)
            goto L_0x0041
        L_0x0077:
            java.lang.String r24 = L9.b.g(r0, r2)
            goto L_0x0041
        L_0x007c:
            java.lang.String r23 = L9.b.g(r0, r2)
            goto L_0x0041
        L_0x0081:
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r3 = com.google.android.gms.maps.model.LatLng.CREATOR
            java.util.ArrayList r22 = L9.b.k(r0, r2, r3)
            goto L_0x0041
        L_0x0088:
            android.os.Parcelable$Creator<Da.f> r3 = Da.f.CREATOR
            android.os.Parcelable r2 = L9.b.f(r0, r2, r3)
            r21 = r2
            Da.f r21 = (Da.f) r21
            goto L_0x0041
        L_0x0093:
            android.os.Parcelable$Creator<Da.h> r3 = Da.h.CREATOR
            java.util.ArrayList r20 = L9.b.k(r0, r2, r3)
            goto L_0x0041
        L_0x009a:
            int r19 = L9.b.w(r0, r2)
            goto L_0x0041
        L_0x009f:
            java.lang.String r18 = L9.b.g(r0, r2)
            goto L_0x0041
        L_0x00a4:
            java.lang.String r17 = L9.b.g(r0, r2)
            goto L_0x0041
        L_0x00a9:
            java.lang.String r16 = L9.b.g(r0, r2)
            goto L_0x0041
        L_0x00ae:
            java.lang.String r15 = L9.b.g(r0, r2)
            goto L_0x0041
        L_0x00b3:
            java.lang.String r14 = L9.b.g(r0, r2)
            goto L_0x0041
        L_0x00b8:
            java.lang.String r13 = L9.b.g(r0, r2)
            goto L_0x0041
        L_0x00bd:
            java.lang.String r12 = L9.b.g(r0, r2)
            goto L_0x0041
        L_0x00c3:
            java.lang.String r11 = L9.b.g(r0, r2)
            goto L_0x0041
        L_0x00c9:
            L9.b.l(r0, r1)
            com.google.android.gms.wallet.wobs.CommonWalletObject r0 = new com.google.android.gms.wallet.wobs.CommonWalletObject
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.wobs.b.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new CommonWalletObject[i10];
    }
}
