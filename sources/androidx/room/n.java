package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.m;

public interface n extends IInterface {

    /* renamed from: d  reason: collision with root package name */
    public static final String f44357d = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    public static abstract class a extends Binder implements n {

        /* renamed from: androidx.room.n$a$a  reason: collision with other inner class name */
        private static class C0762a implements n {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f44358a;

            C0762a(IBinder iBinder) {
                this.f44358a = iBinder;
            }

            public void C3(m mVar, int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(n.f44357d);
                    obtain.writeStrongInterface(mVar);
                    obtain.writeInt(i10);
                    this.f44358a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f44358a;
            }

            public int f2(m mVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(n.f44357d);
                    obtain.writeStrongInterface(mVar);
                    obtain.writeString(str);
                    this.f44358a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void m1(int i10, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(n.f44357d);
                    obtain.writeInt(i10);
                    obtain.writeStringArray(strArr);
                    this.f44358a.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, n.f44357d);
        }

        public static n I3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(n.f44357d);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof n)) ? new C0762a(iBinder) : (n) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = n.f44357d;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                int f22 = f2(m.a.I3(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(f22);
            } else if (i10 == 2) {
                C3(m.a.I3(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else if (i10 != 3) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                m1(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    void C3(m mVar, int i10);

    int f2(m mVar, String str);

    void m1(int i10, String[] strArr);
}
