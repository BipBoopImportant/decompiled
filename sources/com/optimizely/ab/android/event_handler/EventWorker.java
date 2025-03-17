package com.optimizely.ab.android.event_handler;

import CE.C12699f;
import android.content.Context;
import androidx.work.C7037f;
import androidx.work.C7054x;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import org.slf4j.LoggerFactory;
import wE.C15187b;
import yE.C15299b;
import yE.C15302e;

public class EventWorker extends Worker {

    /* renamed from: a  reason: collision with root package name */
    public d f122279a;

    public EventWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C15302e eVar = new C15302e(context);
        Context context2 = context;
        this.f122279a = new d(context2, eVar, c.c(context, "1", LoggerFactory.getLogger((Class<?>) c.class)), new b(new C15299b(eVar, LoggerFactory.getLogger((Class<?>) C15299b.class)), LoggerFactory.getLogger((Class<?>) b.class)), LoggerFactory.getLogger((Class<?>) d.class));
    }

    public static C7037f d(String str, String str2) {
        try {
            return e(str, C15187b.a(str2));
        } catch (Exception unused) {
            return f(str, str2);
        }
    }

    public static C7037f e(String str, String str2) {
        return new C7037f.a().i("url", str).i("bodyCompressed", str2).a();
    }

    public static C7037f f(String str, String str2) {
        return new C7037f.a().i("url", str).i("body", str2).a();
    }

    public static C7037f g(C12699f fVar) {
        String b10 = fVar.b();
        String a10 = fVar.a();
        return a10.length() < 9240 ? f(b10, a10) : d(b10, a10);
    }

    public static C7037f h(C12699f fVar, Long l10) {
        C7037f g10 = g(fVar);
        return l10.longValue() > 0 ? new C7037f.a().c(g10).h("retryInterval", l10.longValue()).a() : g10;
    }

    public C7054x.a b() {
        C7037f inputData = getInputData();
        String k10 = k(inputData);
        String i10 = i(inputData);
        return j(inputData) > 0 ? l(k10, i10) ? this.f122279a.c(k10, i10) : this.f122279a.a() ? C7054x.a.c() : C7054x.a.b() : C7054x.a.c();
    }

    public String i(C7037f fVar) {
        String g10 = fVar.g("body");
        if (g10 != null) {
            return g10;
        }
        try {
            return C15187b.c(fVar.g("bodyCompressed"));
        } catch (Exception unused) {
            return null;
        }
    }

    public long j(C7037f fVar) {
        return fVar.f("retryInterval", -1);
    }

    public String k(C7037f fVar) {
        return fVar.g("url");
    }

    public boolean l(String str, String str2) {
        return str != null && !str.isEmpty() && str2 != null && !str2.isEmpty();
    }
}
