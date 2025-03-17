package ha;

import android.os.Parcelable;

public final class b9 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = L9.b.C(r11)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x000c:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0058
            int r1 = L9.b.u(r11)
            int r2 = L9.b.m(r1)
            switch(r2) {
                case 1: goto L_0x004e;
                case 2: goto L_0x0049;
                case 3: goto L_0x0044;
                case 4: goto L_0x003a;
                case 5: goto L_0x0030;
                case 6: goto L_0x002b;
                case 7: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            L9.b.B(r11, r1)
            goto L_0x000c
        L_0x0021:
            android.os.Parcelable$Creator<ha.I8> r2 = ha.I8.CREATOR
            java.lang.Object[] r1 = L9.b.j(r11, r1, r2)
            r9 = r1
            ha.I8[] r9 = (ha.I8[]) r9
            goto L_0x000c
        L_0x002b:
            java.lang.String[] r8 = L9.b.h(r11, r1)
            goto L_0x000c
        L_0x0030:
            android.os.Parcelable$Creator<ha.O8> r2 = ha.O8.CREATOR
            java.lang.Object[] r1 = L9.b.j(r11, r1, r2)
            r7 = r1
            ha.O8[] r7 = (ha.O8[]) r7
            goto L_0x000c
        L_0x003a:
            android.os.Parcelable$Creator<ha.R8> r2 = ha.R8.CREATOR
            java.lang.Object[] r1 = L9.b.j(r11, r1, r2)
            r6 = r1
            ha.R8[] r6 = (ha.R8[]) r6
            goto L_0x000c
        L_0x0044:
            java.lang.String r5 = L9.b.g(r11, r1)
            goto L_0x000c
        L_0x0049:
            java.lang.String r4 = L9.b.g(r11, r1)
            goto L_0x000c
        L_0x004e:
            android.os.Parcelable$Creator<ha.Q8> r2 = ha.Q8.CREATOR
            android.os.Parcelable r1 = L9.b.f(r11, r1, r2)
            r3 = r1
            ha.Q8 r3 = (ha.Q8) r3
            goto L_0x000c
        L_0x0058:
            L9.b.l(r11, r0)
            ha.M8 r11 = new ha.M8
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ha.b9.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new M8[i10];
    }
}
