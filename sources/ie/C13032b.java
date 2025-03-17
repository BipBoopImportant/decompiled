package IE;

import java.util.ArrayList;
import java.util.List;

/* renamed from: IE.b  reason: case insensitive filesystem */
public class C13032b {

    /* renamed from: a  reason: collision with root package name */
    protected final List<String> f110951a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    protected final List<String> f110952b = new ArrayList();

    public void a(String str, Object... objArr) {
        this.f110951a.add(String.format(str, objArr));
    }

    public String b(String str, Object... objArr) {
        String format = String.format(str, objArr);
        this.f110952b.add(format);
        return format;
    }

    public void c(C13032b bVar) {
        this.f110951a.addAll(bVar.f110951a);
        this.f110952b.addAll(bVar.f110952b);
    }

    public List<String> d() {
        ArrayList arrayList = new ArrayList(this.f110951a);
        arrayList.addAll(this.f110952b);
        return arrayList;
    }
}
