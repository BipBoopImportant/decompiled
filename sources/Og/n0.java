package OG;

import HJ.C15854t;
import JG.C15929K;
import JG.C15930a;
import KJ.C15985a;
import KJ.C15987c;
import MG.C16033b;
import MG.C16038g;
import PG.C16186d;
import QG.C16219E;
import SG.C16415m;
import TJ.C16505B;
import UG.C16569f;
import VG.C16653f;
import XG.C16793h;
import XH.t;
import YG.l;
import YH.g0;
import android.util.Log;
import com.sugarcube.core.logger.Priority;
import java.util.List;
import kG.C17497c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mG.C17596a;
import nG.C17621a;
import sG.r;
import uG.C18048l;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\f\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u0011\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0013\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0015\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u0019\u0010\u0016\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0014\u001a#\u0010\u0019\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a#\u0010\u001c\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u0014\u001a!\u0010!\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u001a!\u0010$\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010#\u001a\u00020\u0002H\u0000¢\u0006\u0004\b$\u0010\u0006¨\u0006%"}, d2 = {"LTJ/B;", "LOG/l0;", "", "shouldShow", "LXH/N;", "i", "(LTJ/B;Z)V", "", "LmG/a;", "multiviewInformation", "", "selectedViewportIndex", "e", "(LTJ/B;Ljava/util/List;I)V", "LQG/E$e;", "buttonId", "isLoading", "d", "(LTJ/B;LQG/E$e;Z)V", "h", "(LTJ/B;)V", "b", "c", "LJG/a;", "dialog", "g", "(LTJ/B;LJG/a;)V", "LMG/b;", "j", "(LTJ/B;LMG/b;)V", "a", "", "updatedZoom", "k", "(LTJ/B;F)V", "isVisible", "f", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n0 {
    public static final void a(C16505B<l0> b10) {
        C16505B<l0> b11 = b10;
        C17542s.j(b11, "<this>");
        b11.setValue(l0.b(b10.getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134217471, (Object) null));
    }

    public static final void b(C16505B<l0> b10) {
        C16505B<l0> b11 = b10;
        C17542s.j(b11, "<this>");
        b11.setValue(l0.b(b10.getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (r) null, (C18048l) null, (C16569f) null, (u0) null, b10.getValue().l().a(false), (l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134184959, (Object) null));
    }

    public static final void c(C16505B<l0> b10) {
        C16505B<l0> b11 = b10;
        C17542s.j(b11, "<this>");
        u0 b12 = u0.b(b10.getValue().p(), (C17621a.d) null, (C17621a.C3532a) null, (C17621a.c) null, (C17621a.b) null, (C17621a) null, 15, (Object) null);
        t0 t0Var = r1;
        t0 t0Var2 = new t0(false, 1, (DefaultConstructorMarker) null);
        b11.setValue(l0.b(b10.getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (r) null, (C18048l) null, (C16569f) null, b12, t0Var, (l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134158303, (Object) null));
        a(b10);
        b(b10);
    }

    public static final void d(C16505B<l0> b10, C16219E.e eVar, boolean z10) {
        C16505B<l0> b11 = b10;
        C16219E.e eVar2 = eVar;
        C17542s.j(b11, "<this>");
        C17542s.j(eVar2, "buttonId");
        b11.setValue(l0.b(b10.getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, C16793h.b(b10.getValue().t(), false, C15985a.j(z10 ? g0.l(b10.getValue().t().d(), eVar2) : g0.j(b10.getValue().t().d(), eVar2)), 1, (Object) null), (C16186d) null, (r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134217215, (Object) null));
    }

    public static final void e(C16505B<l0> b10, List<C17596a> list, int i10) {
        C16505B<l0> b11 = b10;
        List<C17596a> list2 = list;
        C17542s.j(b11, "<this>");
        C17542s.j(list2, "multiviewInformation");
        C16653f fVar = r2;
        C16653f fVar2 = new C16653f(C15985a.h(list2), i10);
        b11.setValue(l0.b(b10.getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, fVar, (C16793h) null, (C16186d) null, (r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134217471, (Object) null));
    }

    public static final void f(C16505B<l0> b10, boolean z10) {
        C16505B<l0> b11 = b10;
        C17542s.j(b11, "<this>");
        b11.setValue(l0.b(b10.getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, C16186d.b(b10.getValue().x(), z10, 0.0f, 2, (Object) null), (r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134216703, (Object) null));
    }

    public static final void g(C16505B<l0> b10, C15930a aVar) {
        C16505B<l0> b11 = b10;
        C15930a aVar2 = aVar;
        C17542s.j(b11, "<this>");
        Priority priority = Priority.DEBUG;
        String str = "Setting dialog to " + aVar2;
        if (str == null) {
            str = "";
        }
        int i10 = m0.f136821a[priority.ordinal()];
        if (i10 == 1) {
            String name = b10.getClass().getName();
            C17542s.g(name);
            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o12.length() != 0) {
                name = C15854t.P0(o12, "Kt");
            }
            Log.v(name, str + " " + "");
        } else if (i10 == 2) {
            String name2 = b10.getClass().getName();
            C17542s.g(name2);
            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o13.length() != 0) {
                name2 = C15854t.P0(o13, "Kt");
            }
            Log.d(name2, str + " " + "");
        } else if (i10 == 3) {
            String name3 = b10.getClass().getName();
            C17542s.g(name3);
            String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o14.length() != 0) {
                name3 = C15854t.P0(o14, "Kt");
            }
            Log.i(name3, str + " " + "");
        } else if (i10 == 4) {
            String name4 = b10.getClass().getName();
            C17542s.g(name4);
            String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o15.length() != 0) {
                name4 = C15854t.P0(o15, "Kt");
            }
            Log.w(name4, str + " " + "");
        } else if (i10 == 5) {
            String name5 = b10.getClass().getName();
            C17542s.g(name5);
            String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o16.length() != 0) {
                name5 = C15854t.P0(o16, "Kt");
            }
            Log.e(name5, str + " " + "");
        } else {
            throw new t();
        }
        C15929K k10 = r2;
        C15929K k11 = new C15929K(aVar2);
        b11.setValue(l0.b(b10.getValue(), false, false, (s0) null, k10, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134217719, (Object) null));
    }

    public static final void h(C16505B<l0> b10) {
        C16505B<l0> b11 = b10;
        C17542s.j(b11, "<this>");
        b11.setValue(l0.b(b10.getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (r) null, (C18048l) null, (C16569f) null, (u0) null, b10.getValue().l().a(true), (l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134184959, (Object) null));
    }

    public static final void i(C16505B<l0> b10, boolean z10) {
        C16505B<l0> b11 = b10;
        C17542s.j(b11, "<this>");
        if (b10.getValue().B() != z10) {
            b11.setValue(l0.b(b10.getValue(), false, z10, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134217725, (Object) null));
        }
    }

    public static final void j(C16505B<l0> b10, C16033b bVar) {
        C16505B<l0> b11 = b10;
        C16033b bVar2 = bVar;
        C17542s.j(b11, "<this>");
        b11.setValue(l0.b(b10.getValue(), false, false, (s0) null, (C15929K) null, new C16038g(bVar2, bVar2 != null), (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, (C16186d) null, (r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134217711, (Object) null));
    }

    public static final void k(C16505B<l0> b10, float f10) {
        C16505B<l0> b11 = b10;
        C17542s.j(b11, "<this>");
        b11.setValue(l0.b(b10.getValue(), false, false, (s0) null, (C15929K) null, (C16038g) null, (C16415m) null, false, (v0) null, (C16653f) null, (C16793h) null, C16186d.b(b10.getValue().x(), false, f10, 1, (Object) null), (r) null, (C18048l) null, (C16569f) null, (u0) null, (t0) null, (l) null, (C17497c) null, false, false, false, false, false, false, (C15987c) null, (C15987c) null, false, 134216703, (Object) null));
    }
}
