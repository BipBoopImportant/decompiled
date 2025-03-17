package tF;

import U0.C4889m;
import U0.C4895p;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LtF/p;", "", "a", "(LtF/p;LU0/m;I)Ljava/lang/String;", "Landroid/content/res/Resources;", "res", "b", "(LtF/p;Landroid/content/res/Resources;)Ljava/lang/String;", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: tF.i  reason: case insensitive filesystem */
public final class C15084i {
    public static final String a(C15091p pVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-226210079, i10, -1, "com.sugarcube.app.base.ui.dialog.displayString (DialogUIModel.kt:66)");
        }
        Resources resources = ((Context) mVar.Q(AndroidCompositionLocals_androidKt.g())).getResources();
        C17542s.g(resources);
        String b10 = b(pVar, resources);
        if (C4895p.J()) {
            C4895p.R();
        }
        return b10;
    }

    public static final String b(C15091p pVar, Resources resources) {
        C17542s.j(resources, "res");
        Integer num = null;
        if ((pVar != null ? pVar.a() : null) != null) {
            return pVar.a();
        }
        if (pVar != null) {
            num = pVar.c();
        }
        if (num == null) {
            return "";
        }
        if (pVar.b() != null) {
            int intValue = pVar.c().intValue();
            Object[] array = pVar.b().toArray(new Object[0]);
            String string = resources.getString(intValue, Arrays.copyOf(array, array.length));
            C17542s.g(string);
            return string;
        }
        String string2 = resources.getString(pVar.c().intValue());
        C17542s.g(string2);
        return string2;
    }
}
