package d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d.a  reason: case insensitive filesystem */
public interface C5268a extends IInterface {

    /* renamed from: h  reason: collision with root package name */
    public static final String f23081h = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: d.a$a  reason: collision with other inner class name */
    public static abstract class C0361a extends Binder implements C5268a {

        /* renamed from: d.a$a$a  reason: collision with other inner class name */
        private static class C0362a implements C5268a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f23082a;

            C0362a(IBinder iBinder) {
                this.f23082a = iBinder;
            }

            public IBinder asBinder() {
                return this.f23082a;
            }
        }

        public C0361a() {
            attachInterface(this, C5268a.f23081h);
        }

        public static C5268a I3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C5268a.f23081h);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C5268a)) ? new C0362a(iBinder) : (C5268a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = C5268a.f23081h;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                y1(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
                return true;
            }
        }
    }

    /* renamed from: d.a$b */
    public static class b {
        /* access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void y1(int i10, Bundle bundle);
}
