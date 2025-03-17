package R6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LR6/b;", "", "<init>", "()V", "", "stackSize", "", "stack", "", "", "pathNames", "pathIndices", "", "a", "(I[I[Ljava/lang/String;[I)Ljava/util/List;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f39694a = new b();

    private b() {
    }

    public final List<Object> a(int i10, int[] iArr, String[] strArr, int[] iArr2) {
        String str;
        C17542s.j(iArr, "stack");
        C17542s.j(strArr, "pathNames");
        C17542s.j(iArr2, "pathIndices");
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                arrayList.add(Integer.valueOf(iArr2[i11]));
            } else if ((i12 == 3 || i12 == 4 || i12 == 5) && (str = strArr[i11]) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
