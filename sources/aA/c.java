package Aa;

import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.FaceParcel;

public final class c implements Parcelable.Creator<FaceParcel> {
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r24) {
        /*
            r23 = this;
            r0 = r24
            int r1 = L9.b.C(r24)
            r2 = 0
            r3 = 0
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r5 = 0
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8 = r2
            r9 = r8
            r10 = r3
            r11 = r10
            r12 = r11
            r13 = r12
            r18 = r13
            r19 = r18
            r20 = r19
            r14 = r4
            r15 = r14
            r16 = r15
            r17 = r5
            r21 = r17
            r22 = r6
        L_0x0024:
            int r2 = r24.dataPosition()
            if (r2 >= r1) goto L_0x0090
            int r2 = L9.b.u(r24)
            int r3 = L9.b.m(r2)
            switch(r3) {
                case 1: goto L_0x008b;
                case 2: goto L_0x0086;
                case 3: goto L_0x0081;
                case 4: goto L_0x007c;
                case 5: goto L_0x0077;
                case 6: goto L_0x0072;
                case 7: goto L_0x006d;
                case 8: goto L_0x0068;
                case 9: goto L_0x005d;
                case 10: goto L_0x0058;
                case 11: goto L_0x0053;
                case 12: goto L_0x004e;
                case 13: goto L_0x0043;
                case 14: goto L_0x003e;
                case 15: goto L_0x0039;
                default: goto L_0x0035;
            }
        L_0x0035:
            L9.b.B(r0, r2)
            goto L_0x0024
        L_0x0039:
            float r22 = L9.b.s(r0, r2)
            goto L_0x0024
        L_0x003e:
            float r16 = L9.b.s(r0, r2)
            goto L_0x0024
        L_0x0043:
            android.os.Parcelable$Creator<Aa.a> r3 = Aa.a.CREATOR
            java.lang.Object[] r2 = L9.b.j(r0, r2, r3)
            r21 = r2
            Aa.a[] r21 = (Aa.a[]) r21
            goto L_0x0024
        L_0x004e:
            float r20 = L9.b.s(r0, r2)
            goto L_0x0024
        L_0x0053:
            float r19 = L9.b.s(r0, r2)
            goto L_0x0024
        L_0x0058:
            float r18 = L9.b.s(r0, r2)
            goto L_0x0024
        L_0x005d:
            android.os.Parcelable$Creator<com.google.android.gms.vision.face.internal.client.LandmarkParcel> r3 = com.google.android.gms.vision.face.internal.client.LandmarkParcel.CREATOR
            java.lang.Object[] r2 = L9.b.j(r0, r2, r3)
            r17 = r2
            com.google.android.gms.vision.face.internal.client.LandmarkParcel[] r17 = (com.google.android.gms.vision.face.internal.client.LandmarkParcel[]) r17
            goto L_0x0024
        L_0x0068:
            float r15 = L9.b.s(r0, r2)
            goto L_0x0024
        L_0x006d:
            float r14 = L9.b.s(r0, r2)
            goto L_0x0024
        L_0x0072:
            float r13 = L9.b.s(r0, r2)
            goto L_0x0024
        L_0x0077:
            float r12 = L9.b.s(r0, r2)
            goto L_0x0024
        L_0x007c:
            float r11 = L9.b.s(r0, r2)
            goto L_0x0024
        L_0x0081:
            float r10 = L9.b.s(r0, r2)
            goto L_0x0024
        L_0x0086:
            int r9 = L9.b.w(r0, r2)
            goto L_0x0024
        L_0x008b:
            int r8 = L9.b.w(r0, r2)
            goto L_0x0024
        L_0x0090:
            L9.b.l(r0, r1)
            com.google.android.gms.vision.face.internal.client.FaceParcel r0 = new com.google.android.gms.vision.face.internal.client.FaceParcel
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Aa.c.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new FaceParcel[i10];
    }
}
