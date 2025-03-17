package JI;

import cJ.C17066c;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import mI.C17603a;

public final class k {
    public static final C15966g a(Annotation[] annotationArr, C17066c cVar) {
        Annotation annotation;
        C17542s.j(annotationArr, "<this>");
        C17542s.j(cVar, "fqName");
        int length = annotationArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i10];
            if (C17542s.e(C15965f.e(C17603a.b(C17603a.a(annotation))).a(), cVar)) {
                break;
            }
            i10++;
        }
        if (annotation != null) {
            return new C15966g(annotation);
        }
        return null;
    }

    public static final List<C15966g> b(Annotation[] annotationArr) {
        C17542s.j(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation gVar : annotationArr) {
            arrayList.add(new C15966g(gVar));
        }
        return arrayList;
    }
}
