package com.google.firebase.perf.session;

import Ec.c;
import Gc.d;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.application.b;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Keep
public class SessionManager extends b {
    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final a appStateMonitor;
    private final Set<WeakReference<Ec.b>> clients;
    private final GaugeManager gaugeManager;
    private Ec.a perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), Ec.a.c(UUID.randomUUID().toString()), a.b());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setApplicationContext$0(Context context, Ec.a aVar) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (aVar.e()) {
            this.gaugeManager.logGaugeMetadata(aVar.h(), d.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(d dVar) {
        if (this.perfSession.e()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.h(), dVar);
        }
    }

    private void startOrStopCollectingGauges(d dVar) {
        if (this.perfSession.e()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, dVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        d dVar = d.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(dVar);
        startOrStopCollectingGauges(dVar);
    }

    public void onUpdateAppState(d dVar) {
        super.onUpdateAppState(dVar);
        if (!this.appStateMonitor.f()) {
            if (dVar == d.FOREGROUND) {
                updatePerfSession(Ec.a.c(UUID.randomUUID().toString()));
            } else if (this.perfSession.f()) {
                updatePerfSession(Ec.a.c(UUID.randomUUID().toString()));
            } else {
                startOrStopCollectingGauges(dVar);
            }
        }
    }

    public final Ec.a perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<Ec.b> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new c(this, context, this.perfSession));
    }

    public void setPerfSession(Ec.a aVar) {
        this.perfSession = aVar;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.f()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<Ec.b> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(Ec.a aVar) {
        if (aVar.h() != this.perfSession.h()) {
            this.perfSession = aVar;
            synchronized (this.clients) {
                try {
                    Iterator<WeakReference<Ec.b>> it = this.clients.iterator();
                    while (it.hasNext()) {
                        Ec.b bVar = (Ec.b) it.next().get();
                        if (bVar != null) {
                            bVar.a(aVar);
                        } else {
                            it.remove();
                        }
                    }
                } finally {
                    while (true) {
                    }
                }
            }
            logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.a());
            startOrStopCollectingGauges(this.appStateMonitor.a());
        }
    }

    public SessionManager(GaugeManager gaugeManager2, Ec.a aVar, a aVar2) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager2;
        this.perfSession = aVar;
        this.appStateMonitor = aVar2;
        registerForAppState();
    }
}
