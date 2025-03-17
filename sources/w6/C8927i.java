package w6;

import B6.c;
import B6.d;
import B6.h;
import E6.e;
import I6.i;
import android.graphics.Rect;
import j0.C5468y;
import j0.c0;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: w6.i  reason: case insensitive filesystem */
public class C8927i {

    /* renamed from: a  reason: collision with root package name */
    private final D f57247a = new D();

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<String> f57248b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private Map<String, List<e>> f57249c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, v> f57250d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, c> f57251e;

    /* renamed from: f  reason: collision with root package name */
    private List<h> f57252f;

    /* renamed from: g  reason: collision with root package name */
    private c0<d> f57253g;

    /* renamed from: h  reason: collision with root package name */
    private C5468y<e> f57254h;

    /* renamed from: i  reason: collision with root package name */
    private List<e> f57255i;

    /* renamed from: j  reason: collision with root package name */
    private Rect f57256j;

    /* renamed from: k  reason: collision with root package name */
    private float f57257k;

    /* renamed from: l  reason: collision with root package name */
    private float f57258l;

    /* renamed from: m  reason: collision with root package name */
    private float f57259m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f57260n;

    /* renamed from: o  reason: collision with root package name */
    private int f57261o = 0;

    public void a(String str) {
        I6.d.c(str);
        this.f57248b.add(str);
    }

    public Rect b() {
        return this.f57256j;
    }

    public c0<d> c() {
        return this.f57253g;
    }

    public float d() {
        return (float) ((long) ((e() / this.f57259m) * 1000.0f));
    }

    public float e() {
        return this.f57258l - this.f57257k;
    }

    public float f() {
        return this.f57258l;
    }

    public Map<String, c> g() {
        return this.f57251e;
    }

    public float h(float f10) {
        return i.i(this.f57257k, this.f57258l, f10);
    }

    public float i() {
        return this.f57259m;
    }

    public Map<String, v> j() {
        return this.f57250d;
    }

    public List<e> k() {
        return this.f57255i;
    }

    public h l(String str) {
        int size = this.f57252f.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = this.f57252f.get(i10);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f57261o;
    }

    public D n() {
        return this.f57247a;
    }

    public List<e> o(String str) {
        return this.f57249c.get(str);
    }

    public float p() {
        return this.f57257k;
    }

    public boolean q() {
        return this.f57260n;
    }

    public void r(int i10) {
        this.f57261o += i10;
    }

    public void s(Rect rect, float f10, float f11, float f12, List<e> list, C5468y<e> yVar, Map<String, List<e>> map, Map<String, v> map2, c0<d> c0Var, Map<String, c> map3, List<h> list2) {
        this.f57256j = rect;
        this.f57257k = f10;
        this.f57258l = f11;
        this.f57259m = f12;
        this.f57255i = list;
        this.f57254h = yVar;
        this.f57249c = map;
        this.f57250d = map2;
        this.f57253g = c0Var;
        this.f57251e = map3;
        this.f57252f = list2;
    }

    public e t(long j10) {
        return this.f57254h.d(j10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (e z10 : this.f57255i) {
            sb2.append(z10.z("\t"));
        }
        return sb2.toString();
    }

    public void u(boolean z10) {
        this.f57260n = z10;
    }

    public void v(boolean z10) {
        this.f57247a.b(z10);
    }
}
