package d;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import d.C5268a;

@SuppressLint({"BanParcelableUsage"})
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final boolean f23083a = false;

    /* renamed from: b  reason: collision with root package name */
    final Handler f23084b = null;

    /* renamed from: c  reason: collision with root package name */
    C5268a f23085c;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* renamed from: d.b$b  reason: collision with other inner class name */
    class C0363b extends C5268a.C0361a {
        C0363b() {
        }

        public void y1(int i10, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f23084b;
            if (handler != null) {
                handler.post(new c(i10, bundle));
            } else {
                bVar.a(i10, bundle);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final int f23087a;

        /* renamed from: b  reason: collision with root package name */
        final Bundle f23088b;

        c(int i10, Bundle bundle) {
            this.f23087a = i10;
            this.f23088b = bundle;
        }

        public void run() {
            b.this.a(this.f23087a, this.f23088b);
        }
    }

    b(Parcel parcel) {
        this.f23085c = C5268a.C0361a.I3(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    public void a(int i10, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f23085c == null) {
                    this.f23085c = new C0363b();
                }
                parcel.writeStrongBinder(this.f23085c.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
