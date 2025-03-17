package Ec;

import Gc.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.l;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0981a();

    /* renamed from: a  reason: collision with root package name */
    private final String f60178a;

    /* renamed from: b  reason: collision with root package name */
    private final l f60179b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f60180c;

    /* renamed from: Ec.a$a  reason: collision with other inner class name */
    class C0981a implements Parcelable.Creator<a> {
        C0981a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0981a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0981a aVar) {
        this(parcel);
    }

    public static k[] b(List<a> list) {
        if (list.isEmpty()) {
            return null;
        }
        k[] kVarArr = new k[list.size()];
        k a10 = list.get(0).a();
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            k a11 = list.get(i10).a();
            if (z10 || !list.get(i10).g()) {
                kVarArr[i10] = a11;
            } else {
                kVarArr[0] = a11;
                kVarArr[i10] = a10;
                z10 = true;
            }
        }
        if (!z10) {
            kVarArr[0] = a10;
        }
        return kVarArr;
    }

    public static a c(String str) {
        a aVar = new a(str.replace("-", ""), new com.google.firebase.perf.util.a());
        aVar.i(j());
        return aVar;
    }

    public static boolean j() {
        com.google.firebase.perf.config.a g10 = com.google.firebase.perf.config.a.g();
        return g10.K() && Math.random() < g10.D();
    }

    public k a() {
        k.c G10 = k.o().G(this.f60178a);
        if (this.f60180c) {
            G10.E(Gc.l.GAUGES_AND_SYSTEM_EVENTS);
        }
        return (k) G10.g();
    }

    public l d() {
        return this.f60179b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.f60180c;
    }

    public boolean f() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f60179b.c()) > com.google.firebase.perf.config.a.g().A();
    }

    public boolean g() {
        return this.f60180c;
    }

    public String h() {
        return this.f60178a;
    }

    public void i(boolean z10) {
        this.f60180c = z10;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f60178a);
        parcel.writeByte(this.f60180c ? (byte) 1 : 0);
        parcel.writeParcelable(this.f60179b, 0);
    }

    public a(String str, com.google.firebase.perf.util.a aVar) {
        this.f60180c = false;
        this.f60178a = str;
        this.f60179b = aVar.a();
    }

    private a(Parcel parcel) {
        boolean z10 = false;
        this.f60180c = false;
        this.f60178a = parcel.readString();
        this.f60180c = parcel.readByte() != 0 ? true : z10;
        this.f60179b = (l) parcel.readParcelable(l.class.getClassLoader());
    }
}
