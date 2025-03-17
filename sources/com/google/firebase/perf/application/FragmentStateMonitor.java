package com.google.firebase.perf.application;

import Ac.a;
import Bc.f;
import Fc.k;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.g;
import com.google.firebase.perf.util.j;
import java.util.WeakHashMap;

public class FragmentStateMonitor extends FragmentManager.m {

    /* renamed from: g  reason: collision with root package name */
    private static final a f68496g = a.e();

    /* renamed from: b  reason: collision with root package name */
    private final WeakHashMap<C5187o, Trace> f68497b = new WeakHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final com.google.firebase.perf.util.a f68498c;

    /* renamed from: d  reason: collision with root package name */
    private final k f68499d;

    /* renamed from: e  reason: collision with root package name */
    private final a f68500e;

    /* renamed from: f  reason: collision with root package name */
    private final c f68501f;

    public FragmentStateMonitor(com.google.firebase.perf.util.a aVar, k kVar, a aVar2, c cVar) {
        this.f68498c = aVar;
        this.f68499d = kVar;
        this.f68500e = aVar2;
        this.f68501f = cVar;
    }

    public String a(C5187o oVar) {
        return "_st_" + oVar.getClass().getSimpleName();
    }

    public void onFragmentPaused(FragmentManager fragmentManager, C5187o oVar) {
        super.onFragmentPaused(fragmentManager, oVar);
        a aVar = f68496g;
        aVar.b("FragmentMonitor %s.onFragmentPaused ", oVar.getClass().getSimpleName());
        if (!this.f68497b.containsKey(oVar)) {
            aVar.k("FragmentMonitor: missed a fragment trace from %s", oVar.getClass().getSimpleName());
            return;
        }
        Trace trace = this.f68497b.get(oVar);
        this.f68497b.remove(oVar);
        g<f.a> f10 = this.f68501f.f(oVar);
        if (!f10.d()) {
            aVar.k("onFragmentPaused: recorder failed to trace %s", oVar.getClass().getSimpleName());
            return;
        }
        j.a(trace, f10.c());
        trace.stop();
    }

    public void onFragmentResumed(FragmentManager fragmentManager, C5187o oVar) {
        super.onFragmentResumed(fragmentManager, oVar);
        f68496g.b("FragmentMonitor %s.onFragmentResumed", oVar.getClass().getSimpleName());
        Trace trace = new Trace(a(oVar), this.f68499d, this.f68498c, this.f68500e);
        trace.start();
        trace.putAttribute("Parent_fragment", oVar.getParentFragment() == null ? "No parent" : oVar.getParentFragment().getClass().getSimpleName());
        if (oVar.getActivity() != null) {
            trace.putAttribute("Hosting_activity", oVar.getActivity().getClass().getSimpleName());
        }
        this.f68497b.put(oVar, trace);
        this.f68501f.d(oVar);
    }
}
