package oE;

import android.os.Process;
import java.lang.Thread;
import oE.C14886i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: oE.e  reason: case insensitive filesystem */
public class C14882e implements Thread.UncaughtExceptionHandler {

    /* renamed from: b  reason: collision with root package name */
    private static C14882e f130033b;

    /* renamed from: a  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f130034a = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: oE.e$a */
    class a implements C14886i.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Throwable f130035a;

        a(Throwable th2) {
            this.f130035a = th2;
        }

        public void a(C14886i iVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("$ae_crashed_reason", this.f130035a.toString());
                iVar.P("$ae_crashed", jSONObject, true);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: oE.e$b */
    class b implements C14886i.c {
        b() {
        }

        public void a(C14886i iVar) {
            iVar.m();
        }
    }

    public C14882e() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static void a() {
        if (f130033b == null) {
            synchronized (C14882e.class) {
                try {
                    if (f130033b == null) {
                        f130033b = new C14882e();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void b() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    public void uncaughtException(Thread thread, Throwable th2) {
        C14886i.i(new a(th2));
        C14886i.i(new b());
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f130034a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } else {
            b();
        }
    }
}
