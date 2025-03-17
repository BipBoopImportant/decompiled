package jK;

import YH.C16870n;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0002\b\u0005\u001a;\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aq\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00040\u00042\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "T", "", "serialName", "", "values", "Lkotlinx/serialization/KSerializer;", "b", "(Ljava/lang/String;[Ljava/lang/Enum;)Lkotlinx/serialization/KSerializer;", "names", "", "entryAnnotations", "classAnnotations", "a", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class J {
    public static final <T extends Enum<T>> KSerializer<T> a(String str, T[] tArr, String[] strArr, Annotation[][] annotationArr, Annotation[] annotationArr2) {
        C17542s.j(str, "serialName");
        C17542s.j(tArr, "values");
        C17542s.j(strArr, "names");
        C17542s.j(annotationArr, "entryAnnotations");
        G g10 = new G(str, tArr.length);
        if (annotationArr2 != null) {
            for (Annotation x10 : annotationArr2) {
                g10.x(x10);
            }
        }
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = tArr[i10];
            int i12 = i11 + 1;
            String str2 = (String) C16870n.p0(strArr, i11);
            if (str2 == null) {
                str2 = t10.name();
            }
            J0.q(g10, str2, false, 2, (Object) null);
            Annotation[] annotationArr3 = (Annotation[]) C16870n.p0(annotationArr, i11);
            if (annotationArr3 != null) {
                for (Annotation w10 : annotationArr3) {
                    g10.w(w10);
                }
            }
            i10++;
            i11 = i12;
        }
        return new I(str, tArr, g10);
    }

    public static final <T extends Enum<T>> KSerializer<T> b(String str, T[] tArr) {
        C17542s.j(str, "serialName");
        C17542s.j(tArr, "values");
        return new I(str, tArr);
    }
}
