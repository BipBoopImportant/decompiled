package H9;

import K9.C6604c;
import K9.C6608f;
import K9.C6618p;
import K9.C6621t;
import K9.C6622u;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.b;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import xa.C8965f;
import xa.C8971l;

final class T implements C8965f {

    /* renamed from: a  reason: collision with root package name */
    private final C6531e f36526a;

    /* renamed from: b  reason: collision with root package name */
    private final int f36527b;

    /* renamed from: c  reason: collision with root package name */
    private final C6528b f36528c;

    /* renamed from: d  reason: collision with root package name */
    private final long f36529d;

    /* renamed from: e  reason: collision with root package name */
    private final long f36530e;

    T(C6531e eVar, int i10, C6528b bVar, long j10, long j11, String str, String str2) {
        this.f36526a = eVar;
        this.f36527b = i10;
        this.f36528c = bVar;
        this.f36529d = j10;
        this.f36530e = j11;
    }

    static T a(C6531e eVar, int i10, C6528b bVar) {
        boolean z10;
        if (!eVar.e()) {
            return null;
        }
        C6622u a10 = C6621t.b().a();
        if (a10 == null) {
            z10 = true;
        } else if (!a10.F()) {
            return null;
        } else {
            z10 = a10.J();
            I t10 = eVar.t(bVar);
            if (t10 != null) {
                if (!(t10.t() instanceof C6604c)) {
                    return null;
                }
                C6604c cVar = (C6604c) t10.t();
                if (cVar.J() && !cVar.c()) {
                    C6608f b10 = b(t10, cVar, i10);
                    if (b10 == null) {
                        return null;
                    }
                    t10.E();
                    z10 = b10.U();
                }
            }
        }
        return new T(eVar, i10, bVar, z10 ? System.currentTimeMillis() : 0, z10 ? SystemClock.elapsedRealtime() : 0, (String) null, (String) null);
    }

    private static C6608f b(I i10, C6604c cVar, int i11) {
        int[] B10;
        int[] F10;
        C6608f H10 = cVar.H();
        if (H10 == null || !H10.J() || ((B10 = H10.B()) != null ? !b.a(B10, i11) : !((F10 = H10.F()) == null || !b.a(F10, i11))) || i10.q() >= H10.x()) {
            return null;
        }
        return H10;
    }

    public final void onComplete(C8971l lVar) {
        I t10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j10;
        long j11;
        if (this.f36526a.e()) {
            C6622u a10 = C6621t.b().a();
            if ((a10 == null || a10.F()) && (t10 = this.f36526a.t(this.f36528c)) != null && (t10.t() instanceof C6604c)) {
                C6604c cVar = (C6604c) t10.t();
                boolean z10 = true;
                int i15 = 0;
                boolean z11 = this.f36529d > 0;
                int z12 = cVar.z();
                int i16 = 100;
                if (a10 != null) {
                    boolean J10 = z11 & a10.J();
                    int x10 = a10.x();
                    int B10 = a10.B();
                    i12 = a10.U();
                    if (cVar.J() && !cVar.c()) {
                        C6608f b10 = b(t10, cVar, this.f36527b);
                        if (b10 != null) {
                            if (!b10.U() || this.f36529d <= 0) {
                                z10 = false;
                            }
                            B10 = b10.x();
                            J10 = z10;
                        } else {
                            return;
                        }
                    }
                    i11 = x10;
                    i10 = B10;
                } else {
                    i12 = 0;
                    i10 = 100;
                    i11 = 5000;
                }
                C6531e eVar = this.f36526a;
                if (lVar.q()) {
                    i13 = 0;
                } else {
                    if (!lVar.o()) {
                        Exception l10 = lVar.l();
                        if (l10 instanceof com.google.android.gms.common.api.b) {
                            Status a11 = ((com.google.android.gms.common.api.b) l10).a();
                            i16 = a11.F();
                            ConnectionResult x11 = a11.x();
                            if (x11 != null) {
                                i13 = x11.x();
                                i15 = i16;
                            }
                        } else {
                            i15 = CheckoutActivity.RESULT_CANCELED;
                            i13 = -1;
                        }
                    }
                    i15 = i16;
                    i13 = -1;
                }
                if (z11) {
                    long j12 = this.f36529d;
                    long j13 = this.f36530e;
                    long currentTimeMillis = System.currentTimeMillis();
                    i14 = (int) (SystemClock.elapsedRealtime() - j13);
                    j10 = currentTimeMillis;
                    j11 = j12;
                } else {
                    j11 = 0;
                    j10 = 0;
                    i14 = -1;
                }
                eVar.E(new C6618p(this.f36527b, i15, i13, j11, j10, (String) null, (String) null, z12, i14), i12, (long) i11, i10);
            }
        }
    }
}
