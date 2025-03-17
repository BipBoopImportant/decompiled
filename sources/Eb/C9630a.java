package eb;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import gb.C9720a;
import java.util.Locale;

/* renamed from: eb.a  reason: case insensitive filesystem */
public class C9630a extends b {
    public C9630a(int i10) {
        super(new Status(i10, String.format(Locale.getDefault(), "Review Error(%d): %s", new Object[]{Integer.valueOf(i10), C9720a.a(i10)})));
    }
}
