package Gb;

import Ib.a;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import mc.C10036b;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final C10036b<a> f60579a;

    /* renamed from: b  reason: collision with root package name */
    private final String f60580b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f60581c = null;

    public c(Context context, C10036b<a> bVar, String str) {
        this.f60579a = bVar;
        this.f60580b = str;
    }

    private void a(a.c cVar) {
        this.f60579a.get().b(cVar);
    }

    private void b(List<b> list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i10 = i();
        for (b next : list) {
            while (arrayDeque.size() >= i10) {
                k(((a.c) arrayDeque.pollFirst()).f60995b);
            }
            a.c f10 = next.f(this.f60580b);
            a(f10);
            arrayDeque.offer(f10);
        }
    }

    private static List<b> c(List<Map<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> b10 : list) {
            arrayList.add(b.b(b10));
        }
        return arrayList;
    }

    private boolean d(List<b> list, b bVar) {
        String c10 = bVar.c();
        String e10 = bVar.e();
        for (b next : list) {
            if (next.c().equals(c10) && next.e().equals(e10)) {
                return true;
            }
        }
        return false;
    }

    private List<a.c> f() {
        return this.f60579a.get().g(this.f60580b, "");
    }

    private ArrayList<b> g(List<b> list, List<b> list2) {
        ArrayList<b> arrayList = new ArrayList<>();
        for (b next : list) {
            if (!d(list2, next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private ArrayList<a.c> h(List<b> list, List<b> list2) {
        ArrayList<a.c> arrayList = new ArrayList<>();
        for (b next : list) {
            if (!d(list2, next)) {
                arrayList.add(next.f(this.f60580b));
            }
        }
        return arrayList;
    }

    private int i() {
        if (this.f60581c == null) {
            this.f60581c = Integer.valueOf(this.f60579a.get().f(this.f60580b));
        }
        return this.f60581c.intValue();
    }

    private void k(String str) {
        this.f60579a.get().clearConditionalUserProperty(str, (String) null, (Bundle) null);
    }

    private void l(Collection<a.c> collection) {
        for (a.c cVar : collection) {
            k(cVar.f60995b);
        }
    }

    private void n(List<b> list) {
        if (list.isEmpty()) {
            j();
            return;
        }
        List<b> e10 = e();
        l(h(e10, list));
        b(g(list, e10));
    }

    private void o() {
        if (this.f60579a.get() == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public List<b> e() {
        o();
        List<a.c> f10 = f();
        ArrayList arrayList = new ArrayList();
        for (a.c a10 : f10) {
            arrayList.add(b.a(a10));
        }
        return arrayList;
    }

    public void j() {
        o();
        l(f());
    }

    public void m(List<Map<String, String>> list) {
        o();
        if (list != null) {
            n(c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }
}
