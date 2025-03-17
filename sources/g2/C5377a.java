package g2;

import android.util.Log;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lg2/a;", "", "<init>", "()V", "", "index", "", "a", "(I)Ljava/lang/String;", "b", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g2.a  reason: case insensitive filesystem */
public final class C5377a {

    /* renamed from: a  reason: collision with root package name */
    public static final C5377a f23650a = new C5377a();

    private C5377a() {
    }

    public final String a(int i10) {
        if (i10 == 0) {
            return "top";
        }
        if (i10 == 1) {
            return "bottom";
        }
        Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
        return "top";
    }

    public final String b(int i10) {
        if (i10 == -2) {
            return "start";
        }
        if (i10 == -1) {
            return "end";
        }
        if (i10 == 0) {
            return "left";
        }
        if (i10 == 1) {
            return "right";
        }
        Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
        return "start";
    }
}
