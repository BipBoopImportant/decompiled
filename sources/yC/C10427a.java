package yc;

import Fb.f;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.config.a;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.c;
import j9.j;
import mc.C10036b;
import nc.e;

/* renamed from: yc.a  reason: case insensitive filesystem */
public class C10427a {

    /* renamed from: a  reason: collision with root package name */
    private final f f77886a;

    /* renamed from: b  reason: collision with root package name */
    private final e f77887b;

    /* renamed from: c  reason: collision with root package name */
    private final C10036b<c> f77888c;

    /* renamed from: d  reason: collision with root package name */
    private final C10036b<j> f77889d;

    public C10427a(f fVar, e eVar, C10036b<c> bVar, C10036b<j> bVar2) {
        this.f77886a = fVar;
        this.f77887b = eVar;
        this.f77888c = bVar;
        this.f77889d = bVar2;
    }

    /* access modifiers changed from: package-private */
    public a a() {
        return a.g();
    }

    /* access modifiers changed from: package-private */
    public f b() {
        return this.f77886a;
    }

    /* access modifiers changed from: package-private */
    public e c() {
        return this.f77887b;
    }

    /* access modifiers changed from: package-private */
    public C10036b<c> d() {
        return this.f77888c;
    }

    /* access modifiers changed from: package-private */
    public RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }

    /* access modifiers changed from: package-private */
    public SessionManager f() {
        return SessionManager.getInstance();
    }

    /* access modifiers changed from: package-private */
    public C10036b<j> g() {
        return this.f77889d;
    }
}
