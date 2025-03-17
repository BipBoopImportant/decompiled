package K9;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

final class t0 implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v0 f37921a;

    /* synthetic */ t0(v0 v0Var, u0 u0Var) {
        this.f37921a = v0Var;
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f37921a.f37929g) {
                try {
                    r0 r0Var = (r0) message.obj;
                    s0 s0Var = (s0) this.f37921a.f37929g.get(r0Var);
                    if (s0Var != null && s0Var.i()) {
                        if (s0Var.j()) {
                            s0Var.g("GmsClientSupervisor");
                        }
                        this.f37921a.f37929g.remove(r0Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        } else if (i10 != 1) {
            return false;
        } else {
            synchronized (this.f37921a.f37929g) {
                try {
                    r0 r0Var2 = (r0) message.obj;
                    s0 s0Var2 = (s0) this.f37921a.f37929g.get(r0Var2);
                    if (s0Var2 != null && s0Var2.a() == 3) {
                        String valueOf = String.valueOf(r0Var2);
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                        ComponentName b10 = s0Var2.b();
                        if (b10 == null) {
                            b10 = r0Var2.a();
                        }
                        if (b10 == null) {
                            String c10 = r0Var2.c();
                            C6620s.l(c10);
                            b10 = new ComponentName(c10, "unknown");
                        }
                        s0Var2.onServiceDisconnected(b10);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
    }
}
