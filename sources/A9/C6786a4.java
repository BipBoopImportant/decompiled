package a9;

import android.content.Context;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.a4  reason: case insensitive filesystem */
public final class C6786a4 {

    /* renamed from: a  reason: collision with root package name */
    public final C6883m5 f42452a = new C6883m5();

    public final boolean a(Context context) {
        C17542s.j(context, "context");
        C6883m5 m5Var = this.f42452a;
        if (m5Var == null) {
            return true;
        }
        Context applicationContext = context.getApplicationContext();
        C17542s.i(applicationContext, "context.applicationContext");
        return m5Var.a(applicationContext);
    }
}
