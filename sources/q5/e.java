package q5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C7055y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u5.C8878b;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lq5/e;", "T", "Lq5/h;", "Landroid/content/Context;", "context", "Lu5/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Lu5/b;)V", "Landroid/content/Intent;", "intent", "LXH/N;", "k", "(Landroid/content/Intent;)V", "h", "()V", "i", "Landroid/content/BroadcastReceiver;", "f", "Landroid/content/BroadcastReceiver;", "broadcastReceiver", "Landroid/content/IntentFilter;", "j", "()Landroid/content/IntentFilter;", "intentFilter", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class e<T> extends h<T> {

    /* renamed from: f  reason: collision with root package name */
    private final BroadcastReceiver f55517f = new a(this);

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"q5/e$a", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "LXH/N;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e<T> f55518a;

        a(e<T> eVar) {
            this.f55518a = eVar;
        }

        public void onReceive(Context context, Intent intent) {
            C17542s.j(context, "context");
            C17542s.j(intent, "intent");
            this.f55518a.k(intent);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context, C8878b bVar) {
        super(context, bVar);
        C17542s.j(context, "context");
        C17542s.j(bVar, "taskExecutor");
    }

    public void h() {
        C7055y e10 = C7055y.e();
        String a10 = f.f55519a;
        e10.a(a10, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f55517f, j());
    }

    public void i() {
        C7055y e10 = C7055y.e();
        String a10 = f.f55519a;
        e10.a(a10, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f55517f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent intent);
}
