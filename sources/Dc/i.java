package dc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface i extends IInterface {

    public static abstract class a extends Binder implements i {

        /* renamed from: dc.i$a$a  reason: collision with other inner class name */
        private static class C1238a implements i {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f72389a;

            C1238a(IBinder iBinder) {
                this.f72389a = iBinder;
            }

            public IBinder asBinder() {
                return this.f72389a;
            }

            public void k3(h hVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    obtain.writeStrongInterface(hVar);
                    obtain.writeString(str);
                    this.f72389a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static i I3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof i)) ? new C1238a(iBinder) : (i) queryLocalInterface;
        }
    }

    void k3(h hVar, String str);
}
