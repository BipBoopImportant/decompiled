package ia;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ia.t5  reason: case insensitive filesystem */
public final class C8358t5 implements C8338q5 {

    /* renamed from: a  reason: collision with root package name */
    final List f53824a;

    public C8358t5(Context context, C8351s5 s5Var) {
        ArrayList arrayList = new ArrayList();
        this.f53824a = arrayList;
        if (s5Var.c()) {
            arrayList.add(new D5(context, s5Var));
        }
    }

    public final void a(C8331p5 p5Var) {
        for (C8338q5 a10 : this.f53824a) {
            a10.a(p5Var);
        }
    }
}
