package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class y {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f44774a = new HashMap();
    @SuppressLint({"UnknownNullness"})

    /* renamed from: b  reason: collision with root package name */
    public View f44775b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<C7026l> f44776c = new ArrayList<>();

    @Deprecated
    public y() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f44775b == yVar.f44775b && this.f44774a.equals(yVar.f44774a);
    }

    public int hashCode() {
        return (this.f44775b.hashCode() * 31) + this.f44774a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f44775b + "\n") + "    values:";
        for (String next : this.f44774a.keySet()) {
            str = str + "    " + next + ": " + this.f44774a.get(next) + "\n";
        }
        return str;
    }

    public y(View view) {
        this.f44775b = view;
    }
}
