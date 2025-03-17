package Mc;

import Fb.f;
import XH.C16807N;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LMc/G;", "LMc/F;", "LFb/f;", "firebaseApp", "<init>", "(LFb/f;)V", "Landroid/content/Context;", "appContext", "Landroid/content/ServiceConnection;", "serviceConnection", "", "b", "(Landroid/content/Context;Landroid/content/ServiceConnection;)Ljava/lang/Object;", "Landroid/os/Messenger;", "callback", "LXH/N;", "a", "(Landroid/os/Messenger;Landroid/content/ServiceConnection;)V", "LFb/f;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class G implements F {

    /* renamed from: b  reason: collision with root package name */
    private static final a f61753b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final f f61754a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LMc/G$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public G(f fVar) {
        C17542s.j(fVar, "firebaseApp");
        this.f61754a = fVar;
    }

    private final Object b(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return C16807N.f139792a;
        } catch (IllegalArgumentException e10) {
            return Integer.valueOf(Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e10));
        }
    }

    public void a(Messenger messenger, ServiceConnection serviceConnection) {
        boolean z10;
        C17542s.j(messenger, "callback");
        C17542s.j(serviceConnection, "serviceConnection");
        Context applicationContext = this.f61754a.k().getApplicationContext();
        C17542s.i(applicationContext, "firebaseApp.applicationContext.applicationContext");
        Intent intent = new Intent(applicationContext, SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", messenger);
        intent.setPackage(applicationContext.getPackageName());
        try {
            z10 = applicationContext.bindService(intent, serviceConnection, 65);
        } catch (SecurityException e10) {
            Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e10);
            z10 = false;
        }
        if (!z10) {
            b(applicationContext, serviceConnection);
            Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
        }
    }
}
