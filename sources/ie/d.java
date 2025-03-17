package IE;

import java.util.List;

public class d extends C13032b {
    public static C13032b e() {
        return f((List<e>) null);
    }

    public static C13032b f(List<e> list) {
        return (list == null || list.contains(e.INCLUDE_REASONS)) ? new C13032b() : new d();
    }

    public String b(String str, Object... objArr) {
        return String.format(str, objArr);
    }

    public void c(C13032b bVar) {
        this.f110951a.addAll(bVar.f110951a);
    }
}
