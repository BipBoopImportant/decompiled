package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface m extends IInterface {

    /* renamed from: c  reason: collision with root package name */
    public static final String f44355c = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    public static abstract class a extends Binder implements m {

        /* renamed from: androidx.room.m$a$a  reason: collision with other inner class name */
        private static class C0761a implements m {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f44356a;

            C0761a(IBinder iBinder) {
                this.f44356a = iBinder;
            }

            public void Q(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(m.f44355c);
                    obtain.writeStringArray(strArr);
                    this.f44356a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f44356a;
            }
        }

        public a() {
            attachInterface(this, m.f44355c);
        }

        public static m I3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(m.f44355c);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof m)) ? new C0761a(iBinder) : (m) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = m.f44355c;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                Q(parcel.createStringArray());
                return true;
            }
        }
    }

    void Q(String[] strArr);
}
