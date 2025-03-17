package Ac;

import android.util.Log;

class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f58675a;

    private c() {
    }

    public static synchronized c c() {
        c cVar;
        synchronized (c.class) {
            try {
                if (f58675a == null) {
                    f58675a = new c();
                }
                cVar = f58675a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        Log.d("FirebasePerformance", str);
    }

    /* access modifiers changed from: package-private */
    public void b(String str) {
        Log.e("FirebasePerformance", str);
    }

    /* access modifiers changed from: package-private */
    public void d(String str) {
        Log.i("FirebasePerformance", str);
    }

    /* access modifiers changed from: package-private */
    public void e(String str) {
        Log.w("FirebasePerformance", str);
    }
}
