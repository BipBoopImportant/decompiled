package K9;

import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class q0 implements Parcelable.Creator {
    static void a(C6609g gVar, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, gVar.f37850a);
        c.n(parcel, 2, gVar.f37851b);
        c.n(parcel, 3, gVar.f37852c);
        c.u(parcel, 4, gVar.f37853d, false);
        c.m(parcel, 5, gVar.f37854e, false);
        c.x(parcel, 6, gVar.f37855f, i10, false);
        c.e(parcel, 7, gVar.f37856g, false);
        c.t(parcel, 8, gVar.f37857h, i10, false);
        c.x(parcel, 10, gVar.f37858i, i10, false);
        c.x(parcel, 11, gVar.f37859j, i10, false);
        c.c(parcel, 12, gVar.f37860k);
        c.n(parcel, 13, gVar.f37861l);
        c.c(parcel, 14, gVar.f37862m);
        c.u(parcel, 15, gVar.x(), false);
        c.b(parcel, a10);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r23) {
        /*
            r22 = this;
            r0 = r23
            int r1 = L9.b.C(r23)
            com.google.android.gms.common.api.Scope[] r2 = K9.C6609g.f37848o
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            G9.b[] r4 = K9.C6609g.f37849p
            r5 = 0
            r6 = 0
            r13 = r2
            r14 = r3
            r16 = r4
            r17 = r16
            r11 = r5
            r12 = r11
            r15 = r12
            r21 = r15
            r8 = r6
            r9 = r8
            r10 = r9
            r18 = r10
            r19 = r18
            r20 = r19
        L_0x0025:
            int r2 = r23.dataPosition()
            if (r2 >= r1) goto L_0x0096
            int r2 = L9.b.u(r23)
            int r3 = L9.b.m(r2)
            switch(r3) {
                case 1: goto L_0x0091;
                case 2: goto L_0x008c;
                case 3: goto L_0x0087;
                case 4: goto L_0x0082;
                case 5: goto L_0x007d;
                case 6: goto L_0x0073;
                case 7: goto L_0x006e;
                case 8: goto L_0x0064;
                case 9: goto L_0x0036;
                case 10: goto L_0x0059;
                case 11: goto L_0x004e;
                case 12: goto L_0x0049;
                case 13: goto L_0x0044;
                case 14: goto L_0x003f;
                case 15: goto L_0x003a;
                default: goto L_0x0036;
            }
        L_0x0036:
            L9.b.B(r0, r2)
            goto L_0x0025
        L_0x003a:
            java.lang.String r21 = L9.b.g(r0, r2)
            goto L_0x0025
        L_0x003f:
            boolean r20 = L9.b.n(r0, r2)
            goto L_0x0025
        L_0x0044:
            int r19 = L9.b.w(r0, r2)
            goto L_0x0025
        L_0x0049:
            boolean r18 = L9.b.n(r0, r2)
            goto L_0x0025
        L_0x004e:
            android.os.Parcelable$Creator<G9.b> r3 = G9.C6521b.CREATOR
            java.lang.Object[] r2 = L9.b.j(r0, r2, r3)
            r17 = r2
            G9.b[] r17 = (G9.C6521b[]) r17
            goto L_0x0025
        L_0x0059:
            android.os.Parcelable$Creator<G9.b> r3 = G9.C6521b.CREATOR
            java.lang.Object[] r2 = L9.b.j(r0, r2, r3)
            r16 = r2
            G9.b[] r16 = (G9.C6521b[]) r16
            goto L_0x0025
        L_0x0064:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = L9.b.f(r0, r2, r3)
            r15 = r2
            android.accounts.Account r15 = (android.accounts.Account) r15
            goto L_0x0025
        L_0x006e:
            android.os.Bundle r14 = L9.b.a(r0, r2)
            goto L_0x0025
        L_0x0073:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r2 = L9.b.j(r0, r2, r3)
            r13 = r2
            com.google.android.gms.common.api.Scope[] r13 = (com.google.android.gms.common.api.Scope[]) r13
            goto L_0x0025
        L_0x007d:
            android.os.IBinder r12 = L9.b.v(r0, r2)
            goto L_0x0025
        L_0x0082:
            java.lang.String r11 = L9.b.g(r0, r2)
            goto L_0x0025
        L_0x0087:
            int r10 = L9.b.w(r0, r2)
            goto L_0x0025
        L_0x008c:
            int r9 = L9.b.w(r0, r2)
            goto L_0x0025
        L_0x0091:
            int r8 = L9.b.w(r0, r2)
            goto L_0x0025
        L_0x0096:
            L9.b.l(r0, r1)
            K9.g r0 = new K9.g
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K9.q0.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new C6609g[i10];
    }
}
