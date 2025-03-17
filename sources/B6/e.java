package B6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Marker;

public class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f33233c = new e("COMPOSITION");

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f33234a;

    /* renamed from: b  reason: collision with root package name */
    private f f33235b;

    public e(String... strArr) {
        this.f33234a = Arrays.asList(strArr);
    }

    private boolean b() {
        List<String> list = this.f33234a;
        return list.get(list.size() - 1).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.f33234a.add(str);
        return eVar;
    }

    public boolean c(String str, int i10) {
        if (i10 >= this.f33234a.size()) {
            return false;
        }
        boolean z10 = i10 == this.f33234a.size() - 1;
        String str2 = this.f33234a.get(i10);
        if (!str2.equals("**")) {
            return (z10 || (i10 == this.f33234a.size() + -2 && b())) && (str2.equals(str) || str2.equals(Marker.ANY_MARKER));
        } else if (!z10 && this.f33234a.get(i10 + 1).equals(str)) {
            return i10 == this.f33234a.size() + -2 || (i10 == this.f33234a.size() + -3 && b());
        } else {
            if (z10) {
                return true;
            }
            int i11 = i10 + 1;
            if (i11 < this.f33234a.size() - 1) {
                return false;
            }
            return this.f33234a.get(i11).equals(str);
        }
    }

    public f d() {
        return this.f33235b;
    }

    public int e(String str, int i10) {
        if (f(str)) {
            return 0;
        }
        if (!this.f33234a.get(i10).equals("**")) {
            return 1;
        }
        return (i10 != this.f33234a.size() - 1 && this.f33234a.get(i10 + 1).equals(str)) ? 2 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f33234a.equals(eVar.f33234a)) {
            return false;
        }
        f fVar = this.f33235b;
        f fVar2 = eVar.f33235b;
        return fVar != null ? fVar.equals(fVar2) : fVar2 == null;
    }

    public boolean g(String str, int i10) {
        if (f(str)) {
            return true;
        }
        if (i10 >= this.f33234a.size()) {
            return false;
        }
        return this.f33234a.get(i10).equals(str) || this.f33234a.get(i10).equals("**") || this.f33234a.get(i10).equals(Marker.ANY_MARKER);
    }

    public boolean h(String str, int i10) {
        return "__container".equals(str) || i10 < this.f33234a.size() - 1 || this.f33234a.get(i10).equals("**");
    }

    public int hashCode() {
        int hashCode = this.f33234a.hashCode() * 31;
        f fVar = this.f33235b;
        return hashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public e i(f fVar) {
        e eVar = new e(this);
        eVar.f33235b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f33234a);
        sb2.append(",resolved=");
        sb2.append(this.f33235b != null);
        sb2.append('}');
        return sb2.toString();
    }

    private e(e eVar) {
        this.f33234a = new ArrayList(eVar.f33234a);
        this.f33235b = eVar.f33235b;
    }
}
