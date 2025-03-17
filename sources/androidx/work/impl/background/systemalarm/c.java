package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.C7033b;
import androidx.work.C7055y;
import androidx.work.impl.background.systemalarm.g;
import java.util.ArrayList;
import java.util.List;
import o5.C8605f;
import s5.C8739u;
import s5.z;

class c {

    /* renamed from: f  reason: collision with root package name */
    private static final String f45230f = C7055y.i("ConstraintsCmdHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f45231a;

    /* renamed from: b  reason: collision with root package name */
    private final C7033b f45232b;

    /* renamed from: c  reason: collision with root package name */
    private final int f45233c;

    /* renamed from: d  reason: collision with root package name */
    private final g f45234d;

    /* renamed from: e  reason: collision with root package name */
    private final C8605f f45235e;

    c(Context context, C7033b bVar, int i10, g gVar) {
        this.f45231a = context;
        this.f45232b = bVar;
        this.f45233c = i10;
        this.f45234d = gVar;
        this.f45235e = new C8605f(gVar.g().v());
    }

    /* access modifiers changed from: package-private */
    public void a() {
        List<C8739u> e10 = this.f45234d.g().w().f().e();
        ConstraintProxy.a(this.f45231a, e10);
        ArrayList<C8739u> arrayList = new ArrayList<>(e10.size());
        long a10 = this.f45232b.a();
        for (C8739u next : e10) {
            if (a10 >= next.c() && (!next.l() || this.f45235e.a(next))) {
                arrayList.add(next);
            }
        }
        for (C8739u uVar : arrayList) {
            String str = uVar.f55910a;
            Intent c10 = b.c(this.f45231a, z.a(uVar));
            C7055y e11 = C7055y.e();
            String str2 = f45230f;
            e11.a(str2, "Creating a delay_met command for workSpec with id (" + str + ")");
            this.f45234d.f().a().execute(new g.b(this.f45234d, c10, this.f45233c));
        }
    }
}
