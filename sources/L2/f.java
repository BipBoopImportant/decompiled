package l2;

import java.util.Iterator;

public class f extends C5518b implements Iterable<C5520d> {

    private static class a implements Iterator<C5520d> {

        /* renamed from: a  reason: collision with root package name */
        f f25471a;

        /* renamed from: b  reason: collision with root package name */
        int f25472b = 0;

        a(f fVar) {
            this.f25471a = fVar;
        }

        /* renamed from: a */
        public C5520d next() {
            C5520d dVar = (C5520d) this.f25471a.f25463f.get(this.f25472b);
            this.f25472b++;
            return dVar;
        }

        public boolean hasNext() {
            return this.f25472b < this.f25471a.size();
        }
    }

    public f(char[] cArr) {
        super(cArr);
    }

    public static f m0(char[] cArr) {
        return new f(cArr);
    }

    public String K() {
        StringBuilder sb2 = new StringBuilder(m() + "{ ");
        Iterator<C5519c> it = this.f25463f.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            C5519c next = it.next();
            if (!z10) {
                sb2.append(", ");
            } else {
                z10 = false;
            }
            sb2.append(next.K());
        }
        sb2.append(" }");
        return sb2.toString();
    }

    public Iterator<C5520d> iterator() {
        return new a(this);
    }

    /* renamed from: n0 */
    public f clone() {
        return (f) super.clone();
    }
}
