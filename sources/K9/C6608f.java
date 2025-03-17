package K9;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: K9.f  reason: case insensitive filesystem */
public class C6608f extends a {
    public static final Parcelable.Creator<C6608f> CREATOR = new p0();

    /* renamed from: a  reason: collision with root package name */
    private final C6622u f37841a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f37842b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f37843c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f37844d;

    /* renamed from: e  reason: collision with root package name */
    private final int f37845e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f37846f;

    public C6608f(C6622u uVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f37841a = uVar;
        this.f37842b = z10;
        this.f37843c = z11;
        this.f37844d = iArr;
        this.f37845e = i10;
        this.f37846f = iArr2;
    }

    public int[] B() {
        return this.f37844d;
    }

    public int[] F() {
        return this.f37846f;
    }

    public boolean J() {
        return this.f37842b;
    }

    public boolean U() {
        return this.f37843c;
    }

    public final C6622u t0() {
        return this.f37841a;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f37841a, i10, false);
        c.c(parcel, 2, J());
        c.c(parcel, 3, U());
        c.o(parcel, 4, B(), false);
        c.n(parcel, 5, x());
        c.o(parcel, 6, F(), false);
        c.b(parcel, a10);
    }

    public int x() {
        return this.f37845e;
    }
}
