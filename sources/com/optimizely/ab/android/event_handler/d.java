package com.optimizely.ab.android.event_handler;

import android.content.Context;
import android.util.Pair;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import yE.C15300c;
import yE.C15302e;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f122290a;

    /* renamed from: b  reason: collision with root package name */
    private final c f122291b;

    /* renamed from: c  reason: collision with root package name */
    private final b f122292c;

    /* renamed from: d  reason: collision with root package name */
    private final Logger f122293d;

    /* renamed from: e  reason: collision with root package name */
    private final C15302e f122294e;

    d(Context context, C15302e eVar, c cVar, b bVar, Logger logger) {
        this.f122290a = context;
        this.f122294e = eVar;
        this.f122291b = cVar;
        this.f122292c = bVar;
        this.f122293d = logger;
    }

    private boolean b(a aVar) {
        if (this.f122292c.c(aVar)) {
            C15300c.a();
            C15300c.b(new Pair(aVar.b().toString(), aVar.a()));
            return true;
        } else if (this.f122291b.e(aVar)) {
            return false;
        } else {
            this.f122293d.error("Unable to send or store event {}", (Object) aVar);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        List<Pair<Long, a>> b10 = this.f122291b.b();
        Iterator<Pair<Long, a>> it = b10.iterator();
        while (it.hasNext()) {
            Pair next = it.next();
            if (this.f122292c.c((a) next.second)) {
                it.remove();
                if (!this.f122291b.d(((Long) next.first).longValue())) {
                    this.f122293d.warn("Unable to delete an event from local storage that was sent to successfully");
                }
            }
        }
        return b10.isEmpty();
    }

    /* JADX INFO: finally extract failed */
    public boolean c(String str, String str2) {
        try {
            boolean b10 = b(new a(new URL(str), str2));
            this.f122291b.a();
            return b10;
        } catch (MalformedURLException e10) {
            this.f122293d.error("Received a malformed URL in event handler service", (Throwable) e10);
            this.f122291b.a();
            return false;
        } catch (Throwable th2) {
            this.f122291b.a();
            throw th2;
        }
    }
}
