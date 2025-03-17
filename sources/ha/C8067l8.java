package ha;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ha.l8  reason: case insensitive filesystem */
public final class C8067l8 implements C8037i8 {

    /* renamed from: a  reason: collision with root package name */
    final List f52648a;

    public C8067l8(Context context, C8057k8 k8Var) {
        ArrayList arrayList = new ArrayList();
        this.f52648a = arrayList;
        if (k8Var.c()) {
            arrayList.add(new B8(context, k8Var));
        }
    }

    public final void a(C8027h8 h8Var) {
        for (C8037i8 a10 : this.f52648a) {
            a10.a(h8Var);
        }
    }
}
