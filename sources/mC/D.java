package Mc;

import Nc.b;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import bI.C17035a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u00010\b\u0000\u0018\u0000 42\u00020\u0001:\u0002\"%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\b¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"LMc/D;", "", "LdI/i;", "backgroundDispatcher", "<init>", "(LdI/i;)V", "", "messageCode", "LXH/N;", "n", "(I)V", "", "Landroid/os/Message;", "messages", "LQJ/F0;", "o", "(Ljava/util/List;)LQJ/F0;", "msg", "p", "(Landroid/os/Message;)V", "m", "", "j", "()Ljava/util/List;", "msgCode", "l", "(Ljava/util/List;I)Landroid/os/Message;", "LMc/F;", "sessionLifecycleServiceBinder", "i", "(LMc/F;)V", "k", "()V", "h", "a", "LdI/i;", "Landroid/os/Messenger;", "b", "Landroid/os/Messenger;", "service", "", "c", "Z", "serviceBound", "Ljava/util/concurrent/LinkedBlockingDeque;", "d", "Ljava/util/concurrent/LinkedBlockingDeque;", "queuedMessages", "Mc/D$d", "e", "LMc/D$d;", "serviceConnection", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class D {

    /* renamed from: f  reason: collision with root package name */
    public static final b f61740f = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17168i f61741a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Messenger f61742b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f61743c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final LinkedBlockingDeque<Message> f61744d = new LinkedBlockingDeque<>(20);

    /* renamed from: e  reason: collision with root package name */
    private final d f61745e = new d(this);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"LMc/D$a;", "Landroid/os/Handler;", "LdI/i;", "backgroundDispatcher", "<init>", "(LdI/i;)V", "", "sessionId", "LXH/N;", "a", "(Ljava/lang/String;)V", "Landroid/os/Message;", "msg", "handleMessage", "(Landroid/os/Message;)V", "LdI/i;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final C17168i f61746a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", f = "SessionLifecycleClient.kt", l = {74}, m = "invokeSuspend")
        /* renamed from: Mc.D$a$a  reason: collision with other inner class name */
        static final class C1029a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f61747c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f61748d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1029a(String str, C17164e<? super C1029a> eVar) {
                super(2, eVar);
                this.f61748d = str;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C1029a(this.f61748d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C1029a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f61747c;
                if (i10 == 0) {
                    y.b(obj);
                    Nc.a aVar = Nc.a.f61986a;
                    this.f61747c = 1;
                    obj = aVar.c(this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str = this.f61748d;
                for (Nc.b bVar : ((Map) obj).values()) {
                    bVar.c(new b.C1041b(str));
                    Log.d("SessionLifecycleClient", "Notified " + bVar.b() + " of new session " + str);
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17168i iVar) {
            super(Looper.getMainLooper());
            C17542s.j(iVar, "backgroundDispatcher");
            this.f61746a = iVar;
        }

        private final void a(String str) {
            Log.d("SessionLifecycleClient", "Session update received.");
            F0 unused = C16314k.d(S.a(this.f61746a), (C17168i) null, (T) null, new C1029a(str, (C17164e<? super C1029a>) null), 3, (Object) null);
        }

        public void handleMessage(Message message) {
            String str;
            C17542s.j(message, "msg");
            if (message.what == 3) {
                Bundle data = message.getData();
                if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                    str = "";
                }
                a(str);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
            super.handleMessage(message);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LMc/D$b;", "", "<init>", "()V", "", "MAX_QUEUED_MESSAGES", "I", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", l = {151}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f61749c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ D f61750d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<Message> f61751e;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class a<T> implements Comparator {
            public final int compare(T t10, T t11) {
                return C17035a.e(Long.valueOf(((Message) t10).getWhen()), Long.valueOf(((Message) t11).getWhen()));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(D d10, List<Message> list, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f61750d = d10;
            this.f61751e = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f61750d, this.f61751e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f61749c;
            if (i10 == 0) {
                y.b(obj);
                Nc.a aVar = Nc.a.f61986a;
                this.f61749c = 1;
                obj = aVar.c(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
            } else {
                Iterable values = map.values();
                if (!(values instanceof Collection) || !((Collection) values).isEmpty()) {
                    Iterator it = values.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((Nc.b) it.next()).a()) {
                            D d10 = this.f61750d;
                            for (Message e10 : C16877v.g1(C16877v.t0(C16877v.t(this.f61750d.l(this.f61751e, 2), this.f61750d.l(this.f61751e, 1))), new a())) {
                                d10.p(e10);
                            }
                        }
                    }
                }
                Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Mc/D$d", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "className", "Landroid/os/IBinder;", "serviceBinder", "LXH/N;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ D f61752a;

        d(D d10) {
            this.f61752a = d10;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + this.f61752a.f61744d.size());
            this.f61752a.f61742b = new Messenger(iBinder);
            this.f61752a.f61743c = true;
            D d10 = this.f61752a;
            F0 unused = d10.o(d10.j());
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            this.f61752a.f61742b = null;
            this.f61752a.f61743c = false;
        }
    }

    public D(C17168i iVar) {
        C17542s.j(iVar, "backgroundDispatcher");
        this.f61741a = iVar;
    }

    /* access modifiers changed from: private */
    public final List<Message> j() {
        ArrayList arrayList = new ArrayList();
        this.f61744d.drainTo(arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.os.Message} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Message l(java.util.List<android.os.Message> r7, int r8) {
        /*
            r6 = this;
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x000b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r7.next()
            r2 = r1
            android.os.Message r2 = (android.os.Message) r2
            int r2 = r2.what
            if (r2 != r8) goto L_0x000b
            r0.add(r1)
            goto L_0x000b
        L_0x0020:
            java.util.Iterator r7 = r0.iterator()
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto L_0x002c
            r7 = 0
            goto L_0x0057
        L_0x002c:
            java.lang.Object r8 = r7.next()
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x0038
        L_0x0036:
            r7 = r8
            goto L_0x0057
        L_0x0038:
            r0 = r8
            android.os.Message r0 = (android.os.Message) r0
            long r0 = r0.getWhen()
        L_0x003f:
            java.lang.Object r2 = r7.next()
            r3 = r2
            android.os.Message r3 = (android.os.Message) r3
            long r3 = r3.getWhen()
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0050
            r8 = r2
            r0 = r3
        L_0x0050:
            boolean r2 = r7.hasNext()
            if (r2 != 0) goto L_0x003f
            goto L_0x0036
        L_0x0057:
            android.os.Message r7 = (android.os.Message) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Mc.D.l(java.util.List, int):android.os.Message");
    }

    private final void m(Message message) {
        if (this.f61744d.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + this.f61744d.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    private final void n(int i10) {
        List<Message> j10 = j();
        Message obtain = Message.obtain((Handler) null, i10, 0, 0);
        C17542s.i(obtain, "obtain(null, messageCode, 0, 0)");
        j10.add(obtain);
        o(j10);
    }

    /* access modifiers changed from: private */
    public final F0 o(List<Message> list) {
        return C16314k.d(S.a(this.f61741a), (C17168i) null, (T) null, new c(this, list, (C17164e<? super c>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void p(Message message) {
        if (this.f61742b != null) {
            try {
                Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                Messenger messenger = this.f61742b;
                if (messenger != null) {
                    messenger.send(message);
                }
            } catch (RemoteException e10) {
                Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e10);
                m(message);
            }
        } else {
            m(message);
        }
    }

    public final void h() {
        n(2);
    }

    public final void i(F f10) {
        C17542s.j(f10, "sessionLifecycleServiceBinder");
        f10.a(new Messenger(new a(this.f61741a)), this.f61745e);
    }

    public final void k() {
        n(1);
    }
}
