package S9;

import android.content.Context;

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static final c f39929b = new c();

    /* renamed from: a  reason: collision with root package name */
    private b f39930a = null;

    public static b a(Context context) {
        return f39929b.b(context);
    }

    public final synchronized b b(Context context) {
        try {
            if (this.f39930a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f39930a = new b(context);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f39930a;
    }
}
