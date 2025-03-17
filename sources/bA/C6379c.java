package Ba;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: Ba.c  reason: case insensitive filesystem */
public final class C6379c extends a {
    public static final Parcelable.Creator<C6379c> CREATOR = new L();

    /* renamed from: a  reason: collision with root package name */
    ArrayList f33297a;

    /* renamed from: b  reason: collision with root package name */
    boolean f33298b;

    /* renamed from: c  reason: collision with root package name */
    boolean f33299c;

    /* renamed from: d  reason: collision with root package name */
    int f33300d;

    private C6379c() {
        this.f33298b = true;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 1, this.f33297a, false);
        c.c(parcel, 2, this.f33298b);
        c.c(parcel, 3, this.f33299c);
        c.n(parcel, 4, this.f33300d);
        c.b(parcel, a10);
    }

    C6379c(ArrayList arrayList, boolean z10, boolean z11, int i10) {
        this.f33297a = arrayList;
        this.f33298b = z10;
        this.f33299c = z11;
        this.f33300d = i10;
    }
}
