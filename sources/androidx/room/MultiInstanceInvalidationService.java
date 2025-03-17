package androidx.room;

import XH.C16807N;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.n;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u00118\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "a", "I", "c", "()I", "d", "(I)V", "maxClientId", "", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "clientNames", "Landroid/os/RemoteCallbackList;", "Landroidx/room/m;", "Landroid/os/RemoteCallbackList;", "()Landroid/os/RemoteCallbackList;", "callbackList", "Landroidx/room/n$a;", "Landroidx/room/n$a;", "binder", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a  reason: collision with root package name */
    private int f44253a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, String> f44254b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final RemoteCallbackList<m> f44255c = new b(this);

    /* renamed from: d  reason: collision with root package name */
    private final n.a f44256d = new a(this);

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"androidx/room/MultiInstanceInvalidationService$a", "Landroidx/room/n$a;", "Landroidx/room/m;", "callback", "", "name", "", "f2", "(Landroidx/room/m;Ljava/lang/String;)I", "clientId", "LXH/N;", "C3", "(Landroidx/room/m;I)V", "", "tables", "m1", "(I[Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends n.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiInstanceInvalidationService f44257a;

        a(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f44257a = multiInstanceInvalidationService;
        }

        public void C3(m mVar, int i10) {
            C17542s.j(mVar, "callback");
            RemoteCallbackList<m> a10 = this.f44257a.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f44257a;
            synchronized (a10) {
                multiInstanceInvalidationService.a().unregister(mVar);
                String remove = multiInstanceInvalidationService.b().remove(Integer.valueOf(i10));
            }
        }

        public int f2(m mVar, String str) {
            C17542s.j(mVar, "callback");
            int i10 = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList<m> a10 = this.f44257a.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f44257a;
            synchronized (a10) {
                try {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() + 1);
                    int c10 = multiInstanceInvalidationService.c();
                    if (multiInstanceInvalidationService.a().register(mVar, Integer.valueOf(c10))) {
                        multiInstanceInvalidationService.b().put(Integer.valueOf(c10), str);
                        i10 = c10;
                    } else {
                        multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() - 1);
                        multiInstanceInvalidationService.c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i10;
        }

        public void m1(int i10, String[] strArr) {
            C17542s.j(strArr, "tables");
            RemoteCallbackList<m> a10 = this.f44257a.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f44257a;
            synchronized (a10) {
                String str = multiInstanceInvalidationService.b().get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.a().beginBroadcast();
                int i11 = 0;
                while (i11 < beginBroadcast) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.a().getBroadcastCookie(i11);
                        C17542s.h(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str2 = multiInstanceInvalidationService.b().get(num);
                        if (i10 != intValue && C17542s.e(str, str2)) {
                            try {
                                multiInstanceInvalidationService.a().getBroadcastItem(i11).Q(strArr);
                            } catch (RemoteException e10) {
                                Log.w("ROOM", "Error invoking a remote callback", e10);
                            }
                        }
                        i11++;
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService.a().finishBroadcast();
                        throw th2;
                    }
                }
                multiInstanceInvalidationService.a().finishBroadcast();
                C16807N n10 = C16807N.f139792a;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/room/MultiInstanceInvalidationService$b", "Landroid/os/RemoteCallbackList;", "Landroidx/room/m;", "callback", "", "cookie", "LXH/N;", "a", "(Landroidx/room/m;Ljava/lang/Object;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends RemoteCallbackList<m> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiInstanceInvalidationService f44258a;

        b(MultiInstanceInvalidationService multiInstanceInvalidationService) {
            this.f44258a = multiInstanceInvalidationService;
        }

        /* renamed from: a */
        public void onCallbackDied(m mVar, Object obj) {
            C17542s.j(mVar, "callback");
            C17542s.j(obj, "cookie");
            this.f44258a.b().remove((Integer) obj);
        }
    }

    public final RemoteCallbackList<m> a() {
        return this.f44255c;
    }

    public final Map<Integer, String> b() {
        return this.f44254b;
    }

    public final int c() {
        return this.f44253a;
    }

    public final void d(int i10) {
        this.f44253a = i10;
    }

    public IBinder onBind(Intent intent) {
        C17542s.j(intent, "intent");
        return this.f44256d;
    }
}
