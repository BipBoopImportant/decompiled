package E9;

import android.os.Parcelable;

public final class g implements Parcelable.Creator<f> {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r13) {
        /*
            r12 = this;
            int r0 = L9.b.C(r13)
            r1 = 0
            r2 = 1
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r11 = r9
            r10 = r2
        L_0x000e:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L_0x0055
            int r1 = L9.b.u(r13)
            int r2 = L9.b.m(r1)
            switch(r2) {
                case 2: goto L_0x004b;
                case 3: goto L_0x0046;
                case 4: goto L_0x0041;
                case 5: goto L_0x003c;
                case 6: goto L_0x0037;
                case 7: goto L_0x0032;
                case 8: goto L_0x002d;
                case 9: goto L_0x0023;
                default: goto L_0x001f;
            }
        L_0x001f:
            L9.b.B(r13, r1)
            goto L_0x000e
        L_0x0023:
            android.os.Parcelable$Creator<ta.a> r2 = ta.a.CREATOR
            java.lang.Object[] r1 = L9.b.j(r13, r1, r2)
            r11 = r1
            ta.a[] r11 = (ta.a[]) r11
            goto L_0x000e
        L_0x002d:
            boolean r10 = L9.b.n(r13, r1)
            goto L_0x000e
        L_0x0032:
            byte[][] r9 = L9.b.c(r13, r1)
            goto L_0x000e
        L_0x0037:
            int[] r8 = L9.b.d(r13, r1)
            goto L_0x000e
        L_0x003c:
            java.lang.String[] r7 = L9.b.h(r13, r1)
            goto L_0x000e
        L_0x0041:
            int[] r6 = L9.b.d(r13, r1)
            goto L_0x000e
        L_0x0046:
            byte[] r5 = L9.b.b(r13, r1)
            goto L_0x000e
        L_0x004b:
            android.os.Parcelable$Creator<com.google.android.gms.internal.clearcut.y2> r2 = com.google.android.gms.internal.clearcut.y2.CREATOR
            android.os.Parcelable r1 = L9.b.f(r13, r1, r2)
            r4 = r1
            com.google.android.gms.internal.clearcut.y2 r4 = (com.google.android.gms.internal.clearcut.y2) r4
            goto L_0x000e
        L_0x0055:
            L9.b.l(r13, r0)
            E9.f r13 = new E9.f
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: E9.g.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
