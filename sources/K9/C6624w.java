package K9;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: K9.w  reason: case insensitive filesystem */
public class C6624w extends a {
    public static final Parcelable.Creator<C6624w> CREATOR = new B();

    /* renamed from: a  reason: collision with root package name */
    private final int f37937a;

    /* renamed from: b  reason: collision with root package name */
    private List f37938b;

    public C6624w(int i10, List list) {
        this.f37937a = i10;
        this.f37938b = list;
    }

    public final List B() {
        return this.f37938b;
    }

    public final void F(C6618p pVar) {
        if (this.f37938b == null) {
            this.f37938b = new ArrayList();
        }
        this.f37938b.add(pVar);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f37937a);
        c.y(parcel, 2, this.f37938b, false);
        c.b(parcel, a10);
    }

    public final int x() {
        return this.f37937a;
    }
}
