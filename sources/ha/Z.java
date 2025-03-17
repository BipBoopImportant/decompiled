package ha;

import java.util.Map;

final class Z extends L {

    /* renamed from: a  reason: collision with root package name */
    private final Object f52391a;

    /* renamed from: b  reason: collision with root package name */
    private int f52392b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C7959b0 f52393c;

    Z(C7959b0 b0Var, int i10) {
        this.f52393c = b0Var;
        Object[] objArr = b0Var.f52427c;
        objArr.getClass();
        this.f52391a = objArr[i10];
        this.f52392b = i10;
    }

    private final void a() {
        int i10 = this.f52392b;
        if (i10 != -1 && i10 < this.f52393c.size()) {
            Object obj = this.f52391a;
            C7959b0 b0Var = this.f52393c;
            int i11 = this.f52392b;
            Object[] objArr = b0Var.f52427c;
            objArr.getClass();
            if (r.a(obj, objArr[i11])) {
                return;
            }
        }
        this.f52392b = this.f52393c.u(this.f52391a);
    }

    public final Object getKey() {
        return this.f52391a;
    }

    public final Object getValue() {
        Map m10 = this.f52393c.m();
        if (m10 != null) {
            return m10.get(this.f52391a);
        }
        a();
        int i10 = this.f52392b;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = this.f52393c.f52428d;
        objArr.getClass();
        return objArr[i10];
    }

    public final Object setValue(Object obj) {
        Map m10 = this.f52393c.m();
        if (m10 != null) {
            return m10.put(this.f52391a, obj);
        }
        a();
        int i10 = this.f52392b;
        if (i10 == -1) {
            this.f52393c.put(this.f52391a, obj);
            return null;
        }
        Object[] objArr = this.f52393c.f52428d;
        objArr.getClass();
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }
}
