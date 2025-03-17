package m5;

import androidx.work.C7033b;
import androidx.work.C7055y;
import androidx.work.L;
import java.util.HashMap;
import java.util.Map;
import l5.C8525v;
import s5.C8739u;

/* renamed from: m5.a  reason: case insensitive filesystem */
public class C8549a {

    /* renamed from: e  reason: collision with root package name */
    static final String f54972e = C7055y.i("DelayedWorkTracker");

    /* renamed from: a  reason: collision with root package name */
    final C8525v f54973a;

    /* renamed from: b  reason: collision with root package name */
    private final L f54974b;

    /* renamed from: c  reason: collision with root package name */
    private final C7033b f54975c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Runnable> f54976d = new HashMap();

    /* renamed from: m5.a$a  reason: collision with other inner class name */
    class C0875a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C8739u f54977a;

        C0875a(C8739u uVar) {
            this.f54977a = uVar;
        }

        public void run() {
            C7055y e10 = C7055y.e();
            String str = C8549a.f54972e;
            e10.a(str, "Scheduling work " + this.f54977a.f55910a);
            C8549a.this.f54973a.c(this.f54977a);
        }
    }

    public C8549a(C8525v vVar, L l10, C7033b bVar) {
        this.f54973a = vVar;
        this.f54974b = l10;
        this.f54975c = bVar;
    }

    public void a(C8739u uVar, long j10) {
        Runnable remove = this.f54976d.remove(uVar.f55910a);
        if (remove != null) {
            this.f54974b.a(remove);
        }
        C0875a aVar = new C0875a(uVar);
        this.f54976d.put(uVar.f55910a, aVar);
        this.f54974b.b(j10 - this.f54975c.a(), aVar);
    }

    public void b(String str) {
        Runnable remove = this.f54976d.remove(str);
        if (remove != null) {
            this.f54974b.a(remove);
        }
    }
}
