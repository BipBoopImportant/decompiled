package fH;

import android.content.Context;
import dH.C17158b;
import java.util.Set;
import mH.C17601d;

/* renamed from: fH.a  reason: case insensitive filesystem */
public final class C17219a {

    /* renamed from: fH.a$a  reason: collision with other inner class name */
    public interface C3490a {
        Set<Boolean> c();
    }

    public static boolean a(Context context) {
        Set<Boolean> c10 = ((C3490a) C17158b.b(context, C3490a.class)).c();
        C17601d.d(c10.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (c10.isEmpty()) {
            return true;
        }
        return c10.iterator().next().booleanValue();
    }
}
