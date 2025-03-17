package ab;

import bb.C9421a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import java.util.Locale;

/* renamed from: ab.a  reason: case insensitive filesystem */
public class C9403a extends b {
    public C9403a(int i10) {
        super(new Status(i10, String.format(Locale.getDefault(), "Install Error(%d): %s", new Object[]{Integer.valueOf(i10), C9421a.a(i10)})));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
