package S;

import C.C4417z;
import androidx.camera.core.impl.o1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class a {
    private static C4417z a(List<C4417z> list) {
        if (list.isEmpty()) {
            return null;
        }
        C4417z zVar = list.get(0);
        Integer valueOf = Integer.valueOf(zVar.b());
        Integer valueOf2 = Integer.valueOf(zVar.a());
        for (int i10 = 1; i10 < list.size(); i10++) {
            C4417z zVar2 = list.get(i10);
            valueOf = c(valueOf, Integer.valueOf(zVar2.b()));
            valueOf2 = b(valueOf2, Integer.valueOf(zVar2.a()));
            if (valueOf == null || valueOf2 == null) {
                return null;
            }
        }
        return new C4417z(valueOf.intValue(), valueOf2.intValue());
    }

    private static Integer b(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (!num2.equals(0) && !num.equals(num2)) {
            return null;
        }
        return num;
    }

    private static Integer c(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0)) {
            return num;
        }
        if (num.equals(2) && !num2.equals(1)) {
            return num2;
        }
        if ((!num2.equals(2) || num.equals(1)) && !num.equals(num2)) {
            return null;
        }
        return num;
    }

    public static C4417z d(Set<o1<?>> set) {
        ArrayList arrayList = new ArrayList();
        for (o1<?> G10 : set) {
            arrayList.add(G10.G());
        }
        return a(arrayList);
    }
}
