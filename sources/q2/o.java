package q2;

import h2.C5414d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p2.C5757b;
import p2.e;
import p2.f;

public class o {

    /* renamed from: g  reason: collision with root package name */
    static int f27813g;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<e> f27814a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    int f27815b;

    /* renamed from: c  reason: collision with root package name */
    boolean f27816c = false;

    /* renamed from: d  reason: collision with root package name */
    int f27817d;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<a> f27818e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f27819f = -1;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        WeakReference<e> f27820a;

        /* renamed from: b  reason: collision with root package name */
        int f27821b;

        /* renamed from: c  reason: collision with root package name */
        int f27822c;

        /* renamed from: d  reason: collision with root package name */
        int f27823d;

        /* renamed from: e  reason: collision with root package name */
        int f27824e;

        /* renamed from: f  reason: collision with root package name */
        int f27825f;

        /* renamed from: g  reason: collision with root package name */
        int f27826g;

        a(e eVar, C5414d dVar, int i10) {
            this.f27820a = new WeakReference<>(eVar);
            this.f27821b = dVar.y(eVar.f27428O);
            this.f27822c = dVar.y(eVar.f27429P);
            this.f27823d = dVar.y(eVar.f27430Q);
            this.f27824e = dVar.y(eVar.f27431R);
            this.f27825f = dVar.y(eVar.f27432S);
            this.f27826g = i10;
        }
    }

    public o(int i10) {
        int i11 = f27813g;
        f27813g = i11 + 1;
        this.f27815b = i11;
        this.f27817d = i10;
    }

    private String e() {
        int i10 = this.f27817d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    private int j(C5414d dVar, ArrayList<e> arrayList, int i10) {
        int y10;
        int y11;
        f fVar = (f) arrayList.get(0).L();
        dVar.E();
        fVar.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).g(dVar, false);
        }
        if (i10 == 0 && fVar.f27503W0 > 0) {
            C5757b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.f27504X0 > 0) {
            C5757b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.A();
        } catch (Exception e10) {
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f27818e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f27818e.add(new a(arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            y10 = dVar.y(fVar.f27428O);
            y11 = dVar.y(fVar.f27430Q);
            dVar.E();
        } else {
            y10 = dVar.y(fVar.f27429P);
            y11 = dVar.y(fVar.f27431R);
            dVar.E();
        }
        return y11 - y10;
    }

    public boolean a(e eVar) {
        if (this.f27814a.contains(eVar)) {
            return false;
        }
        this.f27814a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f27814a.size();
        if (this.f27819f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f27819f == oVar.f27815b) {
                    g(this.f27817d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f27815b;
    }

    public int d() {
        return this.f27817d;
    }

    public int f(C5414d dVar, int i10) {
        if (this.f27814a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f27814a, i10);
    }

    public void g(int i10, o oVar) {
        Iterator<e> it = this.f27814a.iterator();
        while (it.hasNext()) {
            e next = it.next();
            oVar.a(next);
            if (i10 == 0) {
                next.f27421I0 = oVar.c();
            } else {
                next.f27423J0 = oVar.c();
            }
        }
        this.f27819f = oVar.f27815b;
    }

    public void h(boolean z10) {
        this.f27816c = z10;
    }

    public void i(int i10) {
        this.f27817d = i10;
    }

    public String toString() {
        String str = e() + " [" + this.f27815b + "] <";
        Iterator<e> it = this.f27814a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().t();
        }
        return str + " >";
    }
}
