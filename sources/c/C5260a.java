package c;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.a  reason: case insensitive filesystem */
public interface C5260a extends IInterface {

    /* renamed from: g  reason: collision with root package name */
    public static final String f22962g = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: c.a$a  reason: collision with other inner class name */
    public static abstract class C0357a extends Binder implements C5260a {

        /* renamed from: c.a$a$a  reason: collision with other inner class name */
        private static class C0358a implements C5260a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f22963a;

            C0358a(IBinder iBinder) {
                this.f22963a = iBinder;
            }

            public IBinder asBinder() {
                return this.f22963a;
            }

            public void y3(String str, int i10, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C5260a.f22962g);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    b.b(obtain, notification, 0);
                    this.f22963a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static C5260a I3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C5260a.f22962g);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C5260a)) ? new C0358a(iBinder) : (C5260a) queryLocalInterface;
        }
    }

    /* renamed from: c.a$b */
    public static class b {
        /* access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t10, int i10) {
            if (t10 != null) {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void y3(String str, int i10, String str2, Notification notification);
}
