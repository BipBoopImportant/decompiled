package l2;

import java.util.ArrayList;
import java.util.Objects;

/* renamed from: l2.d  reason: case insensitive filesystem */
public class C5520d extends C5518b {

    /* renamed from: g  reason: collision with root package name */
    private static ArrayList<String> f25469g;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f25469g = arrayList;
        arrayList.add("ConstraintSets");
        f25469g.add("Variables");
        f25469g.add("Generate");
        f25469g.add("Transitions");
        f25469g.add("KeyFrames");
        f25469g.add("KeyAttributes");
        f25469g.add("KeyPositions");
        f25469g.add("KeyCycles");
    }

    public C5520d(char[] cArr) {
        super(cArr);
    }

    public static C5519c m0(String str, C5519c cVar) {
        C5520d dVar = new C5520d(str.toCharArray());
        dVar.I(0);
        dVar.G((long) (str.length() - 1));
        dVar.s0(cVar);
        return dVar;
    }

    public static C5519c n0(char[] cArr) {
        return new C5520d(cArr);
    }

    /* access modifiers changed from: protected */
    public String K() {
        if (this.f25463f.size() > 0) {
            return m() + j() + ": " + this.f25463f.get(0).K();
        }
        return m() + j() + ": <> ";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5520d) || Objects.equals(q0(), ((C5520d) obj).q0())) {
            return super.equals(obj);
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String q0() {
        return j();
    }

    public C5519c r0() {
        if (this.f25463f.size() > 0) {
            return this.f25463f.get(0);
        }
        return null;
    }

    public void s0(C5519c cVar) {
        if (this.f25463f.size() > 0) {
            this.f25463f.set(0, cVar);
        } else {
            this.f25463f.add(cVar);
        }
    }
}
