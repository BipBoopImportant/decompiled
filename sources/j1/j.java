package J1;

import U0.C4889m;
import U0.C4895p;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "id", "", "b", "(ILU0/m;I)Ljava/lang/String;", "", "", "formatArgs", "c", "(I[Ljava/lang/Object;LU0/m;I)Ljava/lang/String;", "count", "a", "(II[Ljava/lang/Object;LU0/m;I)Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {
    public static final String a(int i10, int i11, Object[] objArr, C4889m mVar, int i12) {
        if (C4895p.J()) {
            C4895p.S(523207213, i12, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = i.a(mVar, 0).getQuantityString(i10, i11, Arrays.copyOf(objArr, objArr.length));
        if (C4895p.J()) {
            C4895p.R();
        }
        return quantityString;
    }

    public static final String b(int i10, C4889m mVar, int i11) {
        if (C4895p.J()) {
            C4895p.S(1223887937, i11, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = i.a(mVar, 0).getString(i10);
        if (C4895p.J()) {
            C4895p.R();
        }
        return string;
    }

    public static final String c(int i10, Object[] objArr, C4889m mVar, int i11) {
        if (C4895p.J()) {
            C4895p.S(2071230100, i11, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = i.a(mVar, 0).getString(i10, Arrays.copyOf(objArr, objArr.length));
        if (C4895p.J()) {
            C4895p.R();
        }
        return string;
    }
}
