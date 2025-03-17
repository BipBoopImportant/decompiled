package Hc;

import Kb.C9128c;
import Kb.q;
import android.content.Context;

public class h {

    public interface a<T> {
        String a(T t10);
    }

    public static C9128c<?> b(String str, String str2) {
        return C9128c.l(f.a(str, str2), f.class);
    }

    public static C9128c<?> c(String str, a<Context> aVar) {
        return C9128c.m(f.class).b(q.l(Context.class)).f(new g(str, aVar)).d();
    }
}
