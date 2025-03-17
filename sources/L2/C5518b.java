package l2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: l2.b  reason: case insensitive filesystem */
public class C5518b extends C5519c {

    /* renamed from: f  reason: collision with root package name */
    ArrayList<C5519c> f25463f = new ArrayList<>();

    public C5518b(char[] cArr) {
        super(cArr);
    }

    public void L(C5519c cVar) {
        this.f25463f.add(cVar);
        if (g.f25473d) {
            PrintStream printStream = System.out;
            printStream.println("added element " + cVar + " to " + this);
        }
    }

    /* renamed from: M */
    public C5518b clone() {
        C5518b bVar = (C5518b) super.clone();
        ArrayList<C5519c> arrayList = new ArrayList<>(this.f25463f.size());
        Iterator<C5519c> it = this.f25463f.iterator();
        while (it.hasNext()) {
            C5519c b10 = it.next().clone();
            b10.E(bVar);
            arrayList.add(b10);
        }
        bVar.f25463f = arrayList;
        return bVar;
    }

    public C5519c O(int i10) {
        if (i10 >= 0 && i10 < this.f25463f.size()) {
            return this.f25463f.get(i10);
        }
        throw new h("no element at index " + i10, this);
    }

    public C5519c P(String str) {
        Iterator<C5519c> it = this.f25463f.iterator();
        while (it.hasNext()) {
            C5520d dVar = (C5520d) it.next();
            if (dVar.j().equals(str)) {
                return dVar.r0();
            }
        }
        throw new h("no element for key <" + str + ">", this);
    }

    public C5517a Q(String str) {
        C5519c P10 = P(str);
        if (P10 instanceof C5517a) {
            return (C5517a) P10;
        }
        throw new h("no array found for key <" + str + ">, found [" + P10.A() + "] : " + P10, this);
    }

    public C5517a R(String str) {
        C5519c a02 = a0(str);
        if (a02 instanceof C5517a) {
            return (C5517a) a02;
        }
        return null;
    }

    public float S(int i10) {
        C5519c O10 = O(i10);
        if (O10 != null) {
            return O10.p();
        }
        throw new h("no float at index " + i10, this);
    }

    public float T(String str) {
        C5519c P10 = P(str);
        if (P10 != null) {
            return P10.p();
        }
        throw new h("no float found for key <" + str + ">, found [" + P10.A() + "] : " + P10, this);
    }

    public float V(String str) {
        C5519c a02 = a0(str);
        if (a02 instanceof e) {
            return a02.p();
        }
        return Float.NaN;
    }

    public int W(String str) {
        C5519c P10 = P(str);
        if (P10 != null) {
            return P10.r();
        }
        throw new h("no int found for key <" + str + ">, found [" + P10.A() + "] : " + P10, this);
    }

    public f X(String str) {
        C5519c P10 = P(str);
        if (P10 instanceof f) {
            return (f) P10;
        }
        throw new h("no object found for key <" + str + ">, found [" + P10.A() + "] : " + P10, this);
    }

    public f Y(String str) {
        C5519c a02 = a0(str);
        if (a02 instanceof f) {
            return (f) a02;
        }
        return null;
    }

    public C5519c Z(int i10) {
        if (i10 < 0 || i10 >= this.f25463f.size()) {
            return null;
        }
        return this.f25463f.get(i10);
    }

    public C5519c a0(String str) {
        Iterator<C5519c> it = this.f25463f.iterator();
        while (it.hasNext()) {
            C5520d dVar = (C5520d) it.next();
            if (dVar.j().equals(str)) {
                return dVar.r0();
            }
        }
        return null;
    }

    public String b0(int i10) {
        C5519c O10 = O(i10);
        if (O10 instanceof i) {
            return O10.j();
        }
        throw new h("no string at index " + i10, this);
    }

    public String c0(String str) {
        C5519c P10 = P(str);
        if (P10 instanceof i) {
            return P10.j();
        }
        String A10 = P10 != null ? P10.A() : null;
        throw new h("no string found for key <" + str + ">, found [" + A10 + "] : " + P10, this);
    }

    public void clear() {
        this.f25463f.clear();
    }

    public String d0(int i10) {
        C5519c Z10 = Z(i10);
        if (Z10 instanceof i) {
            return Z10.j();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5518b)) {
            return false;
        }
        return this.f25463f.equals(((C5518b) obj).f25463f);
    }

    public String g0(String str) {
        C5519c a02 = a0(str);
        if (a02 instanceof i) {
            return a02.j();
        }
        return null;
    }

    public int getInt(int i10) {
        C5519c O10 = O(i10);
        if (O10 != null) {
            return O10.r();
        }
        throw new h("no int at index " + i10, this);
    }

    public boolean h0(String str) {
        Iterator<C5519c> it = this.f25463f.iterator();
        while (it.hasNext()) {
            C5519c next = it.next();
            if ((next instanceof C5520d) && ((C5520d) next).j().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f25463f, Integer.valueOf(super.hashCode())});
    }

    public ArrayList<String> i0() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<C5519c> it = this.f25463f.iterator();
        while (it.hasNext()) {
            C5519c next = it.next();
            if (next instanceof C5520d) {
                arrayList.add(((C5520d) next).j());
            }
        }
        return arrayList;
    }

    public void j0(String str, C5519c cVar) {
        Iterator<C5519c> it = this.f25463f.iterator();
        while (it.hasNext()) {
            C5520d dVar = (C5520d) it.next();
            if (dVar.j().equals(str)) {
                dVar.s0(cVar);
                return;
            }
        }
        this.f25463f.add((C5520d) C5520d.m0(str, cVar));
    }

    public void k0(String str, float f10) {
        j0(str, new e(f10));
    }

    public void l0(String str, String str2) {
        i iVar = new i(str2.toCharArray());
        iVar.I(0);
        iVar.G((long) (str2.length() - 1));
        j0(str, iVar);
    }

    public int size() {
        return this.f25463f.size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<C5519c> it = this.f25463f.iterator();
        while (it.hasNext()) {
            C5519c next = it.next();
            if (sb2.length() > 0) {
                sb2.append("; ");
            }
            sb2.append(next);
        }
        return super.toString() + " = <" + sb2 + " >";
    }
}
