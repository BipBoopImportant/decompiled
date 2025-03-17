package androidx.work.impl.background.systemalarm;

import QJ.F0;
import QJ.M;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.C7055y;
import androidx.work.impl.background.systemalarm.g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import l5.C8528y;
import o5.C8601b;
import o5.C8604e;
import o5.C8605f;
import o5.C8606g;
import q5.n;
import s5.C8731m;
import s5.C8739u;
import t5.C8797H;
import t5.C8804O;

public class f implements C8604e, C8804O.a {

    /* renamed from: o  reason: collision with root package name */
    private static final String f45238o = C7055y.i("DelayMetCommandHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f45239a;

    /* renamed from: b  reason: collision with root package name */
    private final int f45240b;

    /* renamed from: c  reason: collision with root package name */
    private final C8731m f45241c;

    /* renamed from: d  reason: collision with root package name */
    private final g f45242d;

    /* renamed from: e  reason: collision with root package name */
    private final C8605f f45243e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f45244f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private int f45245g = 0;

    /* renamed from: h  reason: collision with root package name */
    private final Executor f45246h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f45247i;

    /* renamed from: j  reason: collision with root package name */
    private PowerManager.WakeLock f45248j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f45249k = false;

    /* renamed from: l  reason: collision with root package name */
    private final C8528y f45250l;

    /* renamed from: m  reason: collision with root package name */
    private final M f45251m;

    /* renamed from: n  reason: collision with root package name */
    private volatile F0 f45252n;

    f(Context context, int i10, g gVar, C8528y yVar) {
        this.f45239a = context;
        this.f45240b = i10;
        this.f45242d = gVar;
        this.f45241c = yVar.a();
        this.f45250l = yVar;
        n v10 = gVar.g().v();
        this.f45246h = gVar.f().c();
        this.f45247i = gVar.f().a();
        this.f45251m = gVar.f().b();
        this.f45243e = new C8605f(v10);
    }

    private void e() {
        synchronized (this.f45244f) {
            try {
                if (this.f45252n != null) {
                    this.f45252n.i((CancellationException) null);
                }
                this.f45242d.h().b(this.f45241c);
                PowerManager.WakeLock wakeLock = this.f45248j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    C7055y e10 = C7055y.e();
                    String str = f45238o;
                    e10.a(str, "Releasing wakelock " + this.f45248j + "for WorkSpec " + this.f45241c);
                    this.f45248j.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public void h() {
        if (this.f45245g == 0) {
            this.f45245g = 1;
            C7055y e10 = C7055y.e();
            String str = f45238o;
            e10.a(str, "onAllConstraintsMet for " + this.f45241c);
            if (this.f45242d.e().r(this.f45250l)) {
                this.f45242d.h().a(this.f45241c, 600000, this);
            } else {
                e();
            }
        } else {
            C7055y e11 = C7055y.e();
            String str2 = f45238o;
            e11.a(str2, "Already started work for " + this.f45241c);
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        String b10 = this.f45241c.b();
        if (this.f45245g < 2) {
            this.f45245g = 2;
            C7055y e10 = C7055y.e();
            String str = f45238o;
            e10.a(str, "Stopping work for WorkSpec " + b10);
            this.f45247i.execute(new g.b(this.f45242d, b.f(this.f45239a, this.f45241c), this.f45240b));
            if (this.f45242d.e().k(this.f45241c.b())) {
                C7055y e11 = C7055y.e();
                e11.a(str, "WorkSpec " + b10 + " needs to be rescheduled");
                this.f45247i.execute(new g.b(this.f45242d, b.e(this.f45239a, this.f45241c), this.f45240b));
                return;
            }
            C7055y e12 = C7055y.e();
            e12.a(str, "Processor does not have WorkSpec " + b10 + ". No need to reschedule");
            return;
        }
        C7055y e13 = C7055y.e();
        String str2 = f45238o;
        e13.a(str2, "Already stopped work for " + b10);
    }

    public void a(C8731m mVar) {
        C7055y e10 = C7055y.e();
        String str = f45238o;
        e10.a(str, "Exceeded time limits on execution for " + mVar);
        this.f45246h.execute(new d(this));
    }

    public void d(C8739u uVar, C8601b bVar) {
        if (bVar instanceof C8601b.a) {
            this.f45246h.execute(new e(this));
        } else {
            this.f45246h.execute(new d(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        String b10 = this.f45241c.b();
        Context context = this.f45239a;
        this.f45248j = C8797H.b(context, b10 + " (" + this.f45240b + ")");
        C7055y e10 = C7055y.e();
        String str = f45238o;
        e10.a(str, "Acquiring wakelock " + this.f45248j + "for WorkSpec " + b10);
        this.f45248j.acquire();
        C8739u i10 = this.f45242d.g().w().f().i(b10);
        if (i10 == null) {
            this.f45246h.execute(new d(this));
            return;
        }
        boolean l10 = i10.l();
        this.f45249k = l10;
        if (!l10) {
            C7055y e11 = C7055y.e();
            e11.a(str, "No constraints for " + b10);
            this.f45246h.execute(new e(this));
            return;
        }
        this.f45252n = C8606g.d(this.f45243e, i10, this.f45251m, this);
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z10) {
        C7055y e10 = C7055y.e();
        String str = f45238o;
        e10.a(str, "onExecuted " + this.f45241c + ", " + z10);
        e();
        if (z10) {
            this.f45247i.execute(new g.b(this.f45242d, b.e(this.f45239a, this.f45241c), this.f45240b));
        }
        if (this.f45249k) {
            this.f45247i.execute(new g.b(this.f45242d, b.a(this.f45239a), this.f45240b));
        }
    }
}
