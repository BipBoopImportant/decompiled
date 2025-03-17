package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: b.b  reason: case insensitive filesystem */
public interface C5250b extends IInterface {

    /* renamed from: f  reason: collision with root package name */
    public static final String f22930f = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* renamed from: b.b$a */
    public static abstract class a extends Binder implements C5250b {

        /* renamed from: b.b$a$a  reason: collision with other inner class name */
        private static class C0354a implements C5250b {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f22931a;

            C0354a(IBinder iBinder) {
                this.f22931a = iBinder;
            }

            public boolean A2(C5249a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C5250b.f22930f);
                    obtain.writeStrongInterface(aVar);
                    boolean z10 = false;
                    this.f22931a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean S0(C5249a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C5250b.f22930f);
                    obtain.writeStrongInterface(aVar);
                    boolean z10 = false;
                    C0355b.d(obtain, bundle, 0);
                    this.f22931a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f22931a;
            }

            public boolean k2(C5249a aVar, Uri uri, Bundle bundle, List<Bundle> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C5250b.f22930f);
                    obtain.writeStrongInterface(aVar);
                    boolean z10 = false;
                    C0355b.d(obtain, uri, 0);
                    C0355b.d(obtain, bundle, 0);
                    C0355b.c(obtain, list, 0);
                    this.f22931a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean t2(long j10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C5250b.f22930f);
                    obtain.writeLong(j10);
                    boolean z10 = false;
                    this.f22931a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static C5250b I3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C5250b.f22930f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C5250b)) ? new C0354a(iBinder) : (C5250b) queryLocalInterface;
        }
    }

    /* renamed from: b.b$b  reason: collision with other inner class name */
    public static class C0355b {
        /* access modifiers changed from: private */
        public static <T extends Parcelable> void c(Parcel parcel, List<T> list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                d(parcel, (Parcelable) list.get(i11), i10);
            }
        }

        /* access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t10, int i10) {
            if (t10 != null) {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
                return;
            }
            parcel.writeInt(0);
        }
    }

    boolean A2(C5249a aVar);

    boolean S0(C5249a aVar, Bundle bundle);

    boolean k2(C5249a aVar, Uri uri, Bundle bundle, List<Bundle> list);

    boolean t2(long j10);
}
