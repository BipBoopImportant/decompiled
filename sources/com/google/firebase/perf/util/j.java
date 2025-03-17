package com.google.firebase.perf.util;

import Ac.a;
import Bc.f;
import com.google.firebase.perf.metrics.Trace;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private static final a f68671a = a.e();

    public static Trace a(Trace trace, f.a aVar) {
        if (aVar.d() > 0) {
            trace.putMetric(b.FRAMES_TOTAL.toString(), (long) aVar.d());
        }
        if (aVar.c() > 0) {
            trace.putMetric(b.FRAMES_SLOW.toString(), (long) aVar.c());
        }
        if (aVar.b() > 0) {
            trace.putMetric(b.FRAMES_FROZEN.toString(), (long) aVar.b());
        }
        a aVar2 = f68671a;
        aVar2.a("Screen trace: " + trace.e() + " _fr_tot:" + aVar.d() + " _fr_slo:" + aVar.c() + " _fr_fzn:" + aVar.b());
        return trace;
    }
}
