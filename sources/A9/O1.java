package a9;

import H2.l;
import android.app.Activity;
import androidx.fragment.app.C5187o;
import kotlin.jvm.internal.C17542s;

public final class O1 implements l<String> {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f42169a;

    /* renamed from: b  reason: collision with root package name */
    public final C5187o f42170b;

    /* renamed from: c  reason: collision with root package name */
    public final String f42171c;

    public O1(Activity activity, String str, int i10) {
        str = (i10 & 4) != 0 ? null : str;
        C17542s.j(activity, "activity");
        this.f42169a = activity;
        this.f42170b = null;
        this.f42171c = str;
    }

    public final Object get() {
        StringBuilder sb2;
        Object obj;
        if (this.f42170b != null) {
            sb2 = new StringBuilder("[handleScreenChanged]: Was called for activity: [");
            sb2.append(this.f42169a);
            sb2.append("] and fragment [");
            obj = this.f42170b;
        } else if (this.f42171c != null) {
            sb2 = new StringBuilder("[handleScreenChanged]: Was called for activity: [");
            sb2.append(this.f42169a);
            sb2.append("] and page title [");
            sb2.append(this.f42171c);
            sb2.append(']');
            return sb2.toString();
        } else {
            sb2 = new StringBuilder("[handleScreenChanged]: Was called for activity: [");
            obj = this.f42169a;
        }
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }
}
