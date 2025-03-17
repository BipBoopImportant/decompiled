package P9;

import G9.C6521b;
import K9.C6619q;
import K9.C6620s;
import L9.c;
import O9.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class a extends L9.a {
    public static final Parcelable.Creator<a> CREATOR = new f();

    /* renamed from: e  reason: collision with root package name */
    private static final Comparator f39441e = e.f39448a;

    /* renamed from: a  reason: collision with root package name */
    private final List f39442a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f39443b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39444c;

    /* renamed from: d  reason: collision with root package name */
    private final String f39445d;

    public a(List list, boolean z10, String str, String str2) {
        C6620s.l(list);
        this.f39442a = list;
        this.f39443b = z10;
        this.f39444c = str;
        this.f39445d = str2;
    }

    static a F(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(f39441e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((h) it.next()).d());
        }
        return new a(new ArrayList(treeSet), z10, (String) null, (String) null);
    }

    public static a x(f fVar) {
        return F(fVar.a(), true);
    }

    public List<C6521b> B() {
        return this.f39442a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f39443b == aVar.f39443b && C6619q.b(this.f39442a, aVar.f39442a) && C6619q.b(this.f39444c, aVar.f39444c) && C6619q.b(this.f39445d, aVar.f39445d);
    }

    public final int hashCode() {
        return C6619q.c(Boolean.valueOf(this.f39443b), this.f39442a, this.f39444c, this.f39445d);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.y(parcel, 1, B(), false);
        c.c(parcel, 2, this.f39443b);
        c.u(parcel, 3, this.f39444c, false);
        c.u(parcel, 4, this.f39445d, false);
        c.b(parcel, a10);
    }
}
