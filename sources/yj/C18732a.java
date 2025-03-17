package yJ;

import java.util.ArrayList;

/* renamed from: yJ.a  reason: case insensitive filesystem */
public final class C18732a extends ArrayList<m> implements C18743l {
    public C18732a(int i10) {
        super(i10);
    }

    public /* bridge */ int a() {
        return super.size();
    }

    public /* bridge */ boolean b(m mVar) {
        return super.contains(mVar);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        return b((m) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof m)) {
            return -1;
        }
        return j((m) obj);
    }

    public /* bridge */ int j(m mVar) {
        return super.indexOf(mVar);
    }

    public /* bridge */ int k(m mVar) {
        return super.lastIndexOf(mVar);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof m)) {
            return -1;
        }
        return k((m) obj);
    }

    public /* bridge */ boolean m(m mVar) {
        return super.remove(mVar);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        return m((m) obj);
    }

    public final /* bridge */ int size() {
        return a();
    }
}
