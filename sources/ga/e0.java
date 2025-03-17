package ga;

import java.util.Arrays;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f51390a;

    /* renamed from: b  reason: collision with root package name */
    private final c0 f51391b;

    /* renamed from: c  reason: collision with root package name */
    private c0 f51392c;

    /* synthetic */ e0(String str, d0 d0Var) {
        c0 c0Var = new c0((b0) null);
        this.f51391b = c0Var;
        this.f51392c = c0Var;
        str.getClass();
        this.f51390a = str;
    }

    public final e0 a(String str, Object obj) {
        c0 c0Var = new c0((b0) null);
        this.f51392c.f51389c = c0Var;
        this.f51392c = c0Var;
        c0Var.f51388b = obj;
        c0Var.f51387a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f51390a);
        sb2.append('{');
        c0 c0Var = this.f51391b.f51389c;
        String str = "";
        while (c0Var != null) {
            Object obj = c0Var.f51388b;
            sb2.append(str);
            String str2 = c0Var.f51387a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append(deepToString, 1, deepToString.length() - 1);
            }
            c0Var = c0Var.f51389c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
