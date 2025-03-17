package I0;

import I0.J0;
import U0.C4889m;
import U0.C4895p;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i1.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"LI0/J0;", "string", "", "a", "(ILU0/m;I)Ljava/lang/String;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class K0 {
    public static final String a(int i10, C4889m mVar, int i11) {
        if (C4895p.J()) {
            C4895p.S(-726638443, i11, -1, "androidx.compose.material.getString (Strings.android.kt:24)");
        }
        mVar.Q(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) mVar.Q(AndroidCompositionLocals_androidKt.g())).getResources();
        J0.a aVar = J0.f7334a;
        String string = J0.i(i10, aVar.e()) ? resources.getString(j.f24374h) : J0.i(i10, aVar.a()) ? resources.getString(j.f24367a) : J0.i(i10, aVar.b()) ? resources.getString(j.f24368b) : J0.i(i10, aVar.c()) ? resources.getString(j.f24369c) : J0.i(i10, aVar.d()) ? resources.getString(j.f24371e) : J0.i(i10, aVar.g()) ? resources.getString(j.f24377k) : J0.i(i10, aVar.f()) ? resources.getString(j.f24376j) : "";
        if (C4895p.J()) {
            C4895p.R();
        }
        return string;
    }
}
