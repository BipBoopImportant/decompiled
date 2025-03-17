package com.google.firebase.sessions;

import IJ.C15906b;
import Oc.f;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.firebase.sessions.c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0007\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u0003R\u001a\u0010\u0013\u001a\u00020\u000f8\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/Messenger;", "a", "(Landroid/content/Intent;)Landroid/os/Messenger;", "LXH/N;", "onCreate", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onDestroy", "Landroid/os/HandlerThread;", "Landroid/os/HandlerThread;", "getHandlerThread$com_google_firebase_firebase_sessions", "()Landroid/os/HandlerThread;", "handlerThread", "Lcom/google/firebase/sessions/SessionLifecycleService$b;", "b", "Lcom/google/firebase/sessions/SessionLifecycleService$b;", "messageHandler", "c", "Landroid/os/Messenger;", "messenger", "d", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionLifecycleService extends Service {

    /* renamed from: d  reason: collision with root package name */
    public static final a f68853d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final HandlerThread f68854a = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: b  reason: collision with root package name */
    private b f68855b;

    /* renamed from: c  reason: collision with root package name */
    private Messenger f68856c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService$a;", "", "<init>", "()V", "", "BACKGROUNDED", "I", "CLIENT_BOUND", "", "CLIENT_CALLBACK_MESSENGER", "Ljava/lang/String;", "FOREGROUNDED", "SESSION_UPDATED", "SESSION_UPDATE_EXTRA", "TAG", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\nR\u0016\u0010\u001f\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0016\u0010!\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 R$\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00100\"j\b\u0012\u0004\u0012\u00020\u0010`#8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010$¨\u0006&"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService$b;", "Landroid/os/Handler;", "Landroid/os/Looper;", "looper", "<init>", "(Landroid/os/Looper;)V", "Landroid/os/Message;", "msg", "LXH/N;", "d", "(Landroid/os/Message;)V", "b", "c", "g", "()V", "a", "Landroid/os/Messenger;", "client", "f", "(Landroid/os/Messenger;)V", "", "sessionId", "h", "(Landroid/os/Messenger;Ljava/lang/String;)V", "", "foregroundTimeMs", "", "e", "(J)Z", "handleMessage", "Z", "hasForegrounded", "J", "lastMsgTimeMs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "boundClients", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private boolean f68857a;

        /* renamed from: b  reason: collision with root package name */
        private long f68858b;

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList<Messenger> f68859c = new ArrayList<>();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Looper looper) {
            super(looper);
            C17542s.j(looper, "looper");
        }

        private final void a() {
            Log.d("SessionLifecycleService", "Broadcasting new session");
            b.f68862a.a().a(c.f68864f.a().c());
            for (Messenger messenger : new ArrayList(this.f68859c)) {
                C17542s.i(messenger, "it");
                f(messenger);
            }
        }

        private final void b(Message message) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.f68858b = message.getWhen();
        }

        private final void c(Message message) {
            this.f68859c.add(message.replyTo);
            Messenger messenger = message.replyTo;
            C17542s.i(messenger, "msg.replyTo");
            f(messenger);
            Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.f68859c.size());
        }

        private final void d(Message message) {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + '.');
            if (!this.f68857a) {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.f68857a = true;
                g();
            } else if (e(message.getWhen())) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                g();
            }
            this.f68858b = message.getWhen();
        }

        private final boolean e(long j10) {
            return j10 - this.f68858b > C15906b.K(f.f62094c.c().c());
        }

        private final void f(Messenger messenger) {
            if (this.f68857a) {
                h(messenger, c.f68864f.a().c().b());
                return;
            }
            String a10 = a.f68860a.a().a();
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session.");
            if (a10 != null) {
                h(messenger, a10);
            }
        }

        private final void g() {
            c.b bVar = c.f68864f;
            bVar.a().a();
            Log.d("SessionLifecycleService", "Generated new session.");
            a();
            a.f68860a.a().b(bVar.a().c().b());
        }

        private final void h(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message obtain = Message.obtain((Handler) null, 3, 0, 0);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.f68859c.remove(messenger);
            } catch (Exception e10) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e10);
            }
        }

        public void handleMessage(Message message) {
            C17542s.j(message, "msg");
            if (this.f68858b > message.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + message.getWhen() + " which is older than " + this.f68858b + '.');
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                d(message);
            } else if (i10 == 2) {
                b(message);
            } else if (i10 != 4) {
                Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + message);
                super.handleMessage(message);
            } else {
                c(message);
            }
        }
    }

    private final Messenger a(Intent intent) {
        return Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
    }

    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger a10 = a(intent);
        if (a10 != null) {
            Message obtain = Message.obtain((Handler) null, 4, 0, 0);
            obtain.replyTo = a10;
            b bVar = this.f68855b;
            if (bVar != null) {
                bVar.sendMessage(obtain);
            }
        }
        Messenger messenger = this.f68856c;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f68854a.start();
        Looper looper = this.f68854a.getLooper();
        C17542s.i(looper, "handlerThread.looper");
        this.f68855b = new b(looper);
        this.f68856c = new Messenger(this.f68855b);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f68854a.quit();
    }
}
