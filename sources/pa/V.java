package pa;

import T9.b;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import fa.a;
import fa.c;
import fa.d;
import fa.l;
import qa.g;
import qa.i;

public final class V extends a implements C8641b {
    V(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    public final void B1(B b10) {
        Parcel J32 = J3();
        l.d(J32, b10);
        K3(31, J32);
    }

    public final void B2(float f10) {
        Parcel J32 = J3();
        J32.writeFloat(f10);
        K3(92, J32);
    }

    public final void C2(G g10) {
        Parcel J32 = J3();
        l.d(J32, g10);
        K3(107, J32);
    }

    public final void D1(boolean z10) {
        Parcel J32 = J3();
        int i10 = l.f51215b;
        J32.writeInt(z10 ? 1 : 0);
        K3(41, J32);
    }

    public final void E(b bVar, int i10, S s10) {
        Parcel J32 = J3();
        l.d(J32, bVar);
        J32.writeInt(i10);
        l.d(J32, s10);
        K3(7, J32);
    }

    public final void E0(d0 d0Var) {
        Parcel J32 = J3();
        l.d(J32, d0Var);
        K3(98, J32);
    }

    public final void F0(int i10) {
        Parcel J32 = J3();
        J32.writeInt(i10);
        K3(16, J32);
    }

    public final void F1(C8642c cVar) {
        Parcel J32 = J3();
        l.d(J32, cVar);
        K3(24, J32);
    }

    public final void I(LatLngBounds latLngBounds) {
        Parcel J32 = J3();
        l.c(J32, latLngBounds);
        K3(95, J32);
    }

    public final void K(b bVar) {
        Parcel J32 = J3();
        l.d(J32, bVar);
        K3(4, J32);
    }

    public final boolean K1(boolean z10) {
        Parcel J32 = J3();
        int i10 = l.f51215b;
        J32.writeInt(z10 ? 1 : 0);
        Parcel I32 = I3(20, J32);
        boolean e10 = l.e(I32);
        I32.recycle();
        return e10;
    }

    public final void S1(h0 h0Var) {
        Parcel J32 = J3();
        l.d(J32, h0Var);
        K3(96, J32);
    }

    public final void T0(int i10) {
        Parcel J32 = J3();
        J32.writeInt(i10);
        K3(113, J32);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final pa.C8644e T2() {
        /*
            r4 = this;
            r0 = 25
            android.os.Parcel r1 = r4.J3()
            android.os.Parcel r0 = r4.I3(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof pa.C8644e
            if (r3 == 0) goto L_0x0020
            r1 = r2
            pa.e r1 = (pa.C8644e) r1
            goto L_0x0026
        L_0x0020:
            pa.O r2 = new pa.O
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.V.T2():pa.e");
    }

    public final void W1(l0 l0Var) {
        Parcel J32 = J3();
        l.d(J32, l0Var);
        K3(83, J32);
    }

    public final void W2(C8647h hVar) {
        Parcel J32 = J3();
        l.d(J32, hVar);
        K3(45, J32);
    }

    public final void Y1(r rVar) {
        Parcel J32 = J3();
        l.d(J32, rVar);
        K3(28, J32);
    }

    public final void Y2(C8658t tVar) {
        Parcel J32 = J3();
        l.d(J32, tVar);
        K3(42, J32);
    }

    public final void Z1(int i10, int i11, int i12, int i13) {
        Parcel J32 = J3();
        J32.writeInt(i10);
        J32.writeInt(i11);
        J32.writeInt(i12);
        J32.writeInt(i13);
        K3(39, J32);
    }

    public final void a0(C8653n nVar) {
        Parcel J32 = J3();
        l.d(J32, nVar);
        K3(84, J32);
    }

    public final d b0(i iVar) {
        Parcel J32 = J3();
        l.c(J32, iVar);
        Parcel I32 = I3(11, J32);
        d J33 = c.J3(I32.readStrongBinder());
        I32.recycle();
        return J33;
    }

    public final void clear() {
        K3(14, J3());
    }

    public final void d3(C8660v vVar) {
        Parcel J32 = J3();
        l.d(J32, vVar);
        K3(29, J32);
    }

    public final void e1() {
        K3(8, J3());
    }

    public final void e2(C8651l lVar) {
        Parcel J32 = J3();
        l.d(J32, lVar);
        K3(86, J32);
    }

    public final void g1(D d10) {
        Parcel J32 = J3();
        l.d(J32, d10);
        K3(37, J32);
    }

    public final void k0(M m10) {
        Parcel J32 = J3();
        l.d(J32, m10);
        K3(87, J32);
    }

    public final void k1(f0 f0Var) {
        Parcel J32 = J3();
        l.d(J32, f0Var);
        K3(97, J32);
    }

    public final void l2(b0 b0Var) {
        Parcel J32 = J3();
        l.d(J32, b0Var);
        K3(99, J32);
    }

    public final boolean m0(g gVar) {
        Parcel J32 = J3();
        l.c(J32, gVar);
        Parcel I32 = I3(91, J32);
        boolean e10 = l.e(I32);
        I32.recycle();
        return e10;
    }

    public final void m3(boolean z10) {
        Parcel J32 = J3();
        int i10 = l.f51215b;
        J32.writeInt(z10 ? 1 : 0);
        K3(22, J32);
    }

    public final void n1(I i10) {
        Parcel J32 = J3();
        l.d(J32, i10);
        K3(80, J32);
    }

    public final void o0(X x10) {
        Parcel J32 = J3();
        l.d(J32, x10);
        K3(33, J32);
    }

    public final CameraPosition p() {
        Parcel I32 = I3(1, J3());
        CameraPosition cameraPosition = (CameraPosition) l.a(I32, CameraPosition.CREATOR);
        I32.recycle();
        return cameraPosition;
    }

    public final void p2(C8649j jVar) {
        Parcel J32 = J3();
        l.d(J32, jVar);
        K3(32, J32);
    }

    public final void q3(K k10) {
        Parcel J32 = J3();
        l.d(J32, k10);
        K3(85, J32);
    }

    public final void s1(b bVar) {
        Parcel J32 = J3();
        l.d(J32, bVar);
        K3(5, J32);
    }

    public final void s3(b bVar, S s10) {
        Parcel J32 = J3();
        l.d(J32, bVar);
        l.d(J32, s10);
        K3(6, J32);
    }

    public final void u0(j0 j0Var) {
        Parcel J32 = J3();
        l.d(J32, j0Var);
        K3(89, J32);
    }

    public final void u1(C8664z zVar) {
        Parcel J32 = J3();
        l.d(J32, zVar);
        K3(30, J32);
    }

    public final void w1(String str) {
        Parcel J32 = J3();
        J32.writeString(str);
        K3(61, J32);
    }

    public final void x0(float f10) {
        Parcel J32 = J3();
        J32.writeFloat(f10);
        K3(93, J32);
    }

    public final void y2(boolean z10) {
        Parcel J32 = J3();
        int i10 = l.f51215b;
        J32.writeInt(z10 ? 1 : 0);
        K3(18, J32);
    }
}
