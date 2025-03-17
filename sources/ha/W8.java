package ha;

import android.os.Parcelable;

public final class W8 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v7, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v8, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v9, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v10, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v11, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v12, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r21) {
        /*
            r20 = this;
            r0 = r21
            int r1 = L9.b.C(r21)
            r2 = 0
            r3 = 0
            r6 = r2
            r7 = r6
            r8 = r7
            r9 = r8
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r5 = r3
            r10 = r5
        L_0x001b:
            int r2 = r21.dataPosition()
            if (r2 >= r1) goto L_0x00b6
            int r2 = L9.b.u(r21)
            int r3 = L9.b.m(r2)
            switch(r3) {
                case 1: goto L_0x00b0;
                case 2: goto L_0x00aa;
                case 3: goto L_0x00a4;
                case 4: goto L_0x009e;
                case 5: goto L_0x0093;
                case 6: goto L_0x008e;
                case 7: goto L_0x0084;
                case 8: goto L_0x007a;
                case 9: goto L_0x0070;
                case 10: goto L_0x0066;
                case 11: goto L_0x005c;
                case 12: goto L_0x0051;
                case 13: goto L_0x0046;
                case 14: goto L_0x003b;
                case 15: goto L_0x0030;
                default: goto L_0x002c;
            }
        L_0x002c:
            L9.b.B(r0, r2)
            goto L_0x001b
        L_0x0030:
            android.os.Parcelable$Creator<ha.N8> r3 = ha.N8.CREATOR
            android.os.Parcelable r2 = L9.b.f(r0, r2, r3)
            r19 = r2
            ha.N8 r19 = (ha.N8) r19
            goto L_0x001b
        L_0x003b:
            android.os.Parcelable$Creator<ha.M8> r3 = ha.M8.CREATOR
            android.os.Parcelable r2 = L9.b.f(r0, r2, r3)
            r18 = r2
            ha.M8 r18 = (ha.M8) r18
            goto L_0x001b
        L_0x0046:
            android.os.Parcelable$Creator<ha.K8> r3 = ha.K8.CREATOR
            android.os.Parcelable r2 = L9.b.f(r0, r2, r3)
            r17 = r2
            ha.K8 r17 = (ha.K8) r17
            goto L_0x001b
        L_0x0051:
            android.os.Parcelable$Creator<ha.P8> r3 = ha.P8.CREATOR
            android.os.Parcelable r2 = L9.b.f(r0, r2, r3)
            r16 = r2
            ha.P8 r16 = (ha.P8) r16
            goto L_0x001b
        L_0x005c:
            android.os.Parcelable$Creator<ha.T8> r3 = ha.T8.CREATOR
            android.os.Parcelable r2 = L9.b.f(r0, r2, r3)
            r15 = r2
            ha.T8 r15 = (ha.T8) r15
            goto L_0x001b
        L_0x0066:
            android.os.Parcelable$Creator<ha.U8> r3 = ha.U8.CREATOR
            android.os.Parcelable r2 = L9.b.f(r0, r2, r3)
            r14 = r2
            ha.U8 r14 = (ha.U8) r14
            goto L_0x001b
        L_0x0070:
            android.os.Parcelable$Creator<ha.S8> r3 = ha.S8.CREATOR
            android.os.Parcelable r2 = L9.b.f(r0, r2, r3)
            r13 = r2
            ha.S8 r13 = (ha.S8) r13
            goto L_0x001b
        L_0x007a:
            android.os.Parcelable$Creator<ha.R8> r3 = ha.R8.CREATOR
            android.os.Parcelable r2 = L9.b.f(r0, r2, r3)
            r12 = r2
            ha.R8 r12 = (ha.R8) r12
            goto L_0x001b
        L_0x0084:
            android.os.Parcelable$Creator<ha.O8> r3 = ha.O8.CREATOR
            android.os.Parcelable r2 = L9.b.f(r0, r2, r3)
            r11 = r2
            ha.O8 r11 = (ha.O8) r11
            goto L_0x001b
        L_0x008e:
            int r10 = L9.b.w(r0, r2)
            goto L_0x001b
        L_0x0093:
            android.os.Parcelable$Creator r3 = android.graphics.Point.CREATOR
            java.lang.Object[] r2 = L9.b.j(r0, r2, r3)
            r9 = r2
            android.graphics.Point[] r9 = (android.graphics.Point[]) r9
            goto L_0x001b
        L_0x009e:
            byte[] r8 = L9.b.b(r0, r2)
            goto L_0x001b
        L_0x00a4:
            java.lang.String r7 = L9.b.g(r0, r2)
            goto L_0x001b
        L_0x00aa:
            java.lang.String r6 = L9.b.g(r0, r2)
            goto L_0x001b
        L_0x00b0:
            int r5 = L9.b.w(r0, r2)
            goto L_0x001b
        L_0x00b6:
            L9.b.l(r0, r1)
            ha.V8 r0 = new ha.V8
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ha.W8.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new V8[i10];
    }
}
