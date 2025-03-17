package H9;

import G9.C6521b;
import K9.C6604c;
import K9.C6611i;
import K9.C6613k;
import K9.C6620s;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Set;

/* renamed from: H9.l  reason: case insensitive filesystem */
public final class C6538l implements a.f, ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final String f36595a;

    /* renamed from: b  reason: collision with root package name */
    private final String f36596b;

    /* renamed from: c  reason: collision with root package name */
    private final ComponentName f36597c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f36598d;

    /* renamed from: e  reason: collision with root package name */
    private final C6530d f36599e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f36600f;

    /* renamed from: g  reason: collision with root package name */
    private final C6539m f36601g;

    /* renamed from: h  reason: collision with root package name */
    private IBinder f36602h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f36603i;

    /* renamed from: j  reason: collision with root package name */
    private String f36604j;

    /* renamed from: k  reason: collision with root package name */
    private String f36605k;

    private final void s() {
        if (Thread.currentThread() != this.f36600f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    public final void a(String str) {
        s();
        this.f36604j = str;
        k();
    }

    public final void b(C6613k kVar, Set<Scope> set) {
    }

    public final boolean c() {
        s();
        return this.f36603i;
    }

    public final String d() {
        String str = this.f36595a;
        if (str != null) {
            return str;
        }
        C6620s.l(this.f36597c);
        return this.f36597c.getPackageName();
    }

    public final void e(C6604c.e eVar) {
    }

    public final boolean f() {
        return false;
    }

    public final boolean g() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h() {
        this.f36603i = false;
        this.f36602h = null;
        this.f36599e.onConnectionSuspended(1);
    }

    public final Set<Scope> i() {
        return Collections.emptySet();
    }

    public final void j(C6604c.C0599c cVar) {
        s();
        String.valueOf(this.f36602h);
        if (l()) {
            try {
                a("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f36597c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f36595a).setAction(this.f36596b);
            }
            boolean bindService = this.f36598d.bindService(intent, this, C6611i.a());
            this.f36603i = bindService;
            if (!bindService) {
                this.f36602h = null;
                this.f36601g.onConnectionFailed(new ConnectionResult(16));
            }
            String.valueOf(this.f36602h);
        } catch (SecurityException e10) {
            this.f36603i = false;
            this.f36602h = null;
            throw e10;
        }
    }

    public final void k() {
        s();
        String.valueOf(this.f36602h);
        try {
            this.f36598d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f36603i = false;
        this.f36602h = null;
    }

    public final boolean l() {
        s();
        return this.f36602h != null;
    }

    public final int m() {
        return 0;
    }

    public final C6521b[] n() {
        return new C6521b[0];
    }

    public final String o() {
        return this.f36604j;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f36600f.post(new W(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f36600f.post(new V(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q(IBinder iBinder) {
        this.f36603i = false;
        this.f36602h = iBinder;
        String.valueOf(iBinder);
        this.f36599e.onConnected(new Bundle());
    }

    public final void r(String str) {
        this.f36605k = str;
    }
}
