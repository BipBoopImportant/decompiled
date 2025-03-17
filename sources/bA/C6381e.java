package Ba;

import K9.C6620s;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: Ba.e  reason: case insensitive filesystem */
public final class C6381e extends L9.a {
    public static final Parcelable.Creator<C6381e> CREATOR = new P();

    /* renamed from: a  reason: collision with root package name */
    ArrayList f33304a;

    /* renamed from: b  reason: collision with root package name */
    String f33305b;

    /* renamed from: c  reason: collision with root package name */
    String f33306c;

    /* renamed from: d  reason: collision with root package name */
    ArrayList f33307d;

    /* renamed from: e  reason: collision with root package name */
    boolean f33308e;

    /* renamed from: f  reason: collision with root package name */
    String f33309f;

    @Deprecated
    /* renamed from: Ba.e$a */
    public final class a {
        /* synthetic */ a(O o10) {
        }

        public C6381e a() {
            return C6381e.this;
        }
    }

    C6381e() {
    }

    @Deprecated
    public static a B() {
        return new a((O) null);
    }

    public static C6381e x(String str) {
        a B10 = B();
        C6381e.this.f33309f = (String) C6620s.m(str, "isReadyToPayRequestJson cannot be null!");
        return B10.a();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 2, this.f33304a, false);
        c.u(parcel, 4, this.f33305b, false);
        c.u(parcel, 5, this.f33306c, false);
        c.p(parcel, 6, this.f33307d, false);
        c.c(parcel, 7, this.f33308e);
        c.u(parcel, 8, this.f33309f, false);
        c.b(parcel, a10);
    }

    C6381e(ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z10, String str3) {
        this.f33304a = arrayList;
        this.f33305b = str;
        this.f33306c = str2;
        this.f33307d = arrayList2;
        this.f33308e = z10;
        this.f33309f = str3;
    }
}
