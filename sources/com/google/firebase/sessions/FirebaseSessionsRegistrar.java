package com.google.firebase.sessions;

import Fb.f;
import Hc.h;
import Jb.b;
import Kb.C9128c;
import Kb.C9129d;
import Kb.E;
import Kb.q;
import Mc.B;
import Mc.C9148g;
import Mc.F;
import Mc.G;
import Mc.J;
import Mc.k;
import Mc.m;
import Mc.n;
import Mc.o;
import Mc.p;
import Mc.r;
import Mc.x;
import QJ.M;
import YH.C16877v;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import dI.C17168i;
import j9.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mc.C10036b;
import nI.C17631a;
import nc.e;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LKb/c;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a((DefaultConstructorMarker) null);
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final E<M> backgroundDispatcher;
    private static final E<M> blockingDispatcher;
    private static final E<f> firebaseApp;
    private static final E<e> firebaseInstallationsApi;
    private static final E<F> sessionLifecycleServiceBinder;
    private static final E<Oc.f> sessionsSettings;
    private static final E<j> transportFactory;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\"\u0010\n\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\r0\r0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u000f0\u000f0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00110\u00110\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00130\u00130\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00150\u00150\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;", "", "<init>", "()V", "", "LIBRARY_NAME", "Ljava/lang/String;", "LKb/E;", "LQJ/M;", "kotlin.jvm.PlatformType", "backgroundDispatcher", "LKb/E;", "blockingDispatcher", "LFb/f;", "firebaseApp", "Lnc/e;", "firebaseInstallationsApi", "LMc/F;", "sessionLifecycleServiceBinder", "LOc/f;", "sessionsSettings", "Lj9/j;", "transportFactory", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        E<f> b10 = E.b(f.class);
        C17542s.i(b10, "unqualified(FirebaseApp::class.java)");
        firebaseApp = b10;
        E<e> b11 = E.b(e.class);
        C17542s.i(b11, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = b11;
        Class<M> cls = M.class;
        E<M> a10 = E.a(Jb.a.class, cls);
        C17542s.i(a10, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = a10;
        E<M> a11 = E.a(b.class, cls);
        C17542s.i(a11, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = a11;
        E<j> b12 = E.b(j.class);
        C17542s.i(b12, "unqualified(TransportFactory::class.java)");
        transportFactory = b12;
        E<Oc.f> b13 = E.b(Oc.f.class);
        C17542s.i(b13, "unqualified(SessionsSettings::class.java)");
        sessionsSettings = b13;
        E<F> b14 = E.b(F.class);
        C17542s.i(b14, "unqualified(SessionLifec…erviceBinder::class.java)");
        sessionLifecycleServiceBinder = b14;
    }

    /* access modifiers changed from: private */
    public static final k getComponents$lambda$0(C9129d dVar) {
        Object b10 = dVar.b(firebaseApp);
        C17542s.i(b10, "container[firebaseApp]");
        Object b11 = dVar.b(sessionsSettings);
        C17542s.i(b11, "container[sessionsSettings]");
        Object b12 = dVar.b(backgroundDispatcher);
        C17542s.i(b12, "container[backgroundDispatcher]");
        Object b13 = dVar.b(sessionLifecycleServiceBinder);
        C17542s.i(b13, "container[sessionLifecycleServiceBinder]");
        return new k((f) b10, (Oc.f) b11, (C17168i) b12, (F) b13);
    }

    /* access modifiers changed from: private */
    public static final c getComponents$lambda$1(C9129d dVar) {
        return new c(J.f61758a, (C17631a) null, 2, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final b getComponents$lambda$2(C9129d dVar) {
        Object b10 = dVar.b(firebaseApp);
        C17542s.i(b10, "container[firebaseApp]");
        Object b11 = dVar.b(firebaseInstallationsApi);
        C17542s.i(b11, "container[firebaseInstallationsApi]");
        Object b12 = dVar.b(sessionsSettings);
        C17542s.i(b12, "container[sessionsSettings]");
        C10036b<j> g10 = dVar.g(transportFactory);
        C17542s.i(g10, "container.getProvider(transportFactory)");
        C9148g gVar = new C9148g(g10);
        Object b13 = dVar.b(backgroundDispatcher);
        C17542s.i(b13, "container[backgroundDispatcher]");
        return new B((f) b10, (e) b11, (Oc.f) b12, gVar, (C17168i) b13);
    }

    /* access modifiers changed from: private */
    public static final Oc.f getComponents$lambda$3(C9129d dVar) {
        Object b10 = dVar.b(firebaseApp);
        C17542s.i(b10, "container[firebaseApp]");
        Object b11 = dVar.b(blockingDispatcher);
        C17542s.i(b11, "container[blockingDispatcher]");
        Object b12 = dVar.b(backgroundDispatcher);
        C17542s.i(b12, "container[backgroundDispatcher]");
        Object b13 = dVar.b(firebaseInstallationsApi);
        C17542s.i(b13, "container[firebaseInstallationsApi]");
        return new Oc.f((f) b10, (C17168i) b11, (C17168i) b12, (e) b13);
    }

    /* access modifiers changed from: private */
    public static final a getComponents$lambda$4(C9129d dVar) {
        Context k10 = ((f) dVar.b(firebaseApp)).k();
        C17542s.i(k10, "container[firebaseApp].applicationContext");
        Object b10 = dVar.b(backgroundDispatcher);
        C17542s.i(b10, "container[backgroundDispatcher]");
        return new x(k10, (C17168i) b10);
    }

    /* access modifiers changed from: private */
    public static final F getComponents$lambda$5(C9129d dVar) {
        Object b10 = dVar.b(firebaseApp);
        C17542s.i(b10, "container[firebaseApp]");
        return new G((f) b10);
    }

    public List<C9128c<? extends Object>> getComponents() {
        C9128c.b<k> h10 = C9128c.e(k.class).h(LIBRARY_NAME);
        E<f> e10 = firebaseApp;
        C9128c.b<k> b10 = h10.b(q.k(e10));
        E<Oc.f> e11 = sessionsSettings;
        C9128c.b<k> b11 = b10.b(q.k(e11));
        E<M> e12 = backgroundDispatcher;
        C9128c<k> d10 = b11.b(q.k(e12)).b(q.k(sessionLifecycleServiceBinder)).f(new m()).e().d();
        C9128c<c> d11 = C9128c.e(c.class).h("session-generator").f(new n()).d();
        C9128c.b<b> b12 = C9128c.e(b.class).h("session-publisher").b(q.k(e10));
        E<e> e13 = firebaseInstallationsApi;
        return C16877v.q(d10, d11, b12.b(q.k(e13)).b(q.k(e11)).b(q.m(transportFactory)).b(q.k(e12)).f(new o()).d(), C9128c.e(Oc.f.class).h("sessions-settings").b(q.k(e10)).b(q.k(blockingDispatcher)).b(q.k(e12)).b(q.k(e13)).f(new p()).d(), C9128c.e(a.class).h("sessions-datastore").b(q.k(e10)).b(q.k(e12)).f(new Mc.q()).d(), C9128c.e(F.class).h("sessions-service-binder").b(q.k(e10)).f(new r()).d(), h.b(LIBRARY_NAME, "2.0.8"));
    }
}
