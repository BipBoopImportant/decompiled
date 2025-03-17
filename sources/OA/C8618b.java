package oa;

import K9.C6620s;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import pa.C8640a;
import qa.m;

/* renamed from: oa.b  reason: case insensitive filesystem */
public final class C8618b {

    /* renamed from: a  reason: collision with root package name */
    private static C8640a f55335a;

    public static C8617a a(CameraPosition cameraPosition) {
        C6620s.m(cameraPosition, "cameraPosition must not be null");
        try {
            return new C8617a(g().N0(cameraPosition));
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public static C8617a b(LatLng latLng) {
        C6620s.m(latLng, "latLng must not be null");
        try {
            return new C8617a(g().d2(latLng));
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public static C8617a c(LatLngBounds latLngBounds, int i10, int i11, int i12) {
        C6620s.m(latLngBounds, "bounds must not be null");
        try {
            return new C8617a(g().J0(latLngBounds, i10, i11, i12));
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public static C8617a d(LatLng latLng, float f10) {
        C6620s.m(latLng, "latLng must not be null");
        try {
            return new C8617a(g().l1(latLng, f10));
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public static C8617a e(float f10) {
        try {
            return new C8617a(g().h1(f10));
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public static void f(C8640a aVar) {
        f55335a = (C8640a) C6620s.l(aVar);
    }

    private static C8640a g() {
        return (C8640a) C6620s.m(f55335a, "CameraUpdateFactory is not initialized");
    }
}
