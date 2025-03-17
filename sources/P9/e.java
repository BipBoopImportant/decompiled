package P9;

import G9.C6521b;
import android.os.Parcelable;
import java.util.Comparator;

public final /* synthetic */ class e implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ e f39448a = new e();

    private /* synthetic */ e() {
    }

    public final int compare(Object obj, Object obj2) {
        C6521b bVar = (C6521b) obj;
        C6521b bVar2 = (C6521b) obj2;
        Parcelable.Creator<a> creator = a.CREATOR;
        return !bVar.x().equals(bVar2.x()) ? bVar.x().compareTo(bVar2.x()) : (bVar.B() > bVar2.B() ? 1 : (bVar.B() == bVar2.B() ? 0 : -1));
    }
}
