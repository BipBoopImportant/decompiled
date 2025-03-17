package q5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C7055y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u5.C8878b;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lq5/l;", "Lq5/e;", "", "Landroid/content/Context;", "context", "Lu5/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Lu5/b;)V", "l", "()Ljava/lang/Boolean;", "Landroid/content/Intent;", "intent", "LXH/N;", "k", "(Landroid/content/Intent;)V", "Landroid/content/IntentFilter;", "j", "()Landroid/content/IntentFilter;", "intentFilter", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l extends e<Boolean> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Context context, C8878b bVar) {
        super(context, bVar);
        C17542s.j(context, "context");
        C17542s.j(bVar, "taskExecutor");
    }

    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    public void k(Intent intent) {
        C17542s.j(intent, "intent");
        if (intent.getAction() != null) {
            C7055y e10 = C7055y.e();
            String a10 = m.f55532a;
            e10.a(a10, "Received " + intent.getAction());
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1181163412) {
                    if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        g(Boolean.TRUE);
                    }
                } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    g(Boolean.FALSE);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L_0x003c;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean e() {
        /*
            r5 = this;
            android.content.Context r0 = r5.d()
            r1 = 0
            android.content.IntentFilter r2 = r5.j()
            android.content.Intent r0 = r0.registerReceiver(r1, r2)
            r1 = 1
            if (r0 == 0) goto L_0x003d
            java.lang.String r2 = r0.getAction()
            if (r2 != 0) goto L_0x0017
            goto L_0x003d
        L_0x0017:
            java.lang.String r0 = r0.getAction()
            r2 = 0
            if (r0 == 0) goto L_0x003c
            int r3 = r0.hashCode()
            r4 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r3 == r4) goto L_0x0036
            r4 = -730838620(0xffffffffd47049a4, float:-4.12811054E12)
            if (r3 == r4) goto L_0x002d
            goto L_0x003c
        L_0x002d:
            java.lang.String r3 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x003d
            goto L_0x003c
        L_0x0036:
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r0 = r0.equals(r1)
        L_0x003c:
            r1 = r2
        L_0x003d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.l.e():java.lang.Boolean");
    }
}
