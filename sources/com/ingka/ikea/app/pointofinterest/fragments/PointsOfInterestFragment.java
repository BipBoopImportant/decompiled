package com.ingka.ikea.app.pointofinterest.fragments;

import Ar.j;
import HJ.C15854t;
import Mh.b;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import YH.C16877v;
import YH.X;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.MapView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ingka.ikea.app.pointofinterest.fragments.d;
import com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView;
import com.ingka.ikea.googlemaps.presentation.BaseMapFragment;
import com.sugarcube.app.base.data.source.CatalogRepository;
import com.sugarcube.core.logger.DslKt;
import dl.C11208m;
import dl.C11209n;
import dl.C11212q;
import jC.C14617d;
import jC.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import lg.C10024a;
import lg.C10025b;
import ll.C11549a;
import nI.C17631a;
import nl.C11652b;
import oa.C8619c;
import oa.C8622f;
import oa.i;
import qa.h;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import tI.C17978n;
import u2.C6012a;

@Metadata(d1 = {"\u0000É\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001p\b&\u0018\u00002\u00020\u0001:\u0001|B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00192\b\b\u0002\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\bJ\u0017\u0010%\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010\u0003J%\u0010,\u001a\u00020+2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b0\u00101J+\u00109\u001a\u0002082\u0006\u00103\u001a\u0002022\b\u00105\u001a\u0004\u0018\u0001042\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b9\u0010:J!\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u0002082\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020 2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0004H\u0016¢\u0006\u0004\bB\u0010\u0003R\"\u0010J\u001a\u00020C8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\\\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b[\u0010YR\u0018\u0010_\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\"\u0010i\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020f0d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001f\u0010o\u001a\u0006\u0012\u0002\b\u00030j8BX\u0002¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010u\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\bt\u0010\u0018R\u0014\u0010w\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\bv\u0010\bR\u0018\u0010{\u001a\u0006\u0012\u0002\b\u00030x8&X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006}"}, d2 = {"Lcom/ingka/ikea/app/pointofinterest/fragments/PointsOfInterestFragment;", "Lcom/ingka/ikea/googlemaps/presentation/BaseMapFragment;", "<init>", "()V", "LXH/N;", "c2", "LIh/a;", "a2", "()LIh/a;", "LMh/b;", "previousState", "LMh/b$a;", "state", "o2", "(LMh/b;LMh/b$a;)V", "r2", "(LMh/b$a;)V", "LMh/b$b;", "errorState", "l2", "(LMh/b$b;)V", "j2", "LLg/d;", "R1", "()LLg/d;", "", "bottomSheetHeight", "u2", "(I)V", "P1", "()I", "target", "", "animate", "s2", "(IZ)V", "i2", "Z1", "(Z)V", "Q1", "Lll/a;", "shape", "backgroundColor", "Lnl/b;", "S1", "(Lll/a;Ljava/lang/Integer;)Lnl/b;", "LJh/a;", "button", "e2", "(LJh/a;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onDestroyView", "LAr/j;", "F0", "LAr/j;", "W1", "()LAr/j;", "setFeedback$pointofinterest_release", "(LAr/j;)V", "feedback", "G0", "LLg/d;", "_delegateAdapter", "Landroid/animation/AnimatorSet;", "H0", "Landroid/animation/AnimatorSet;", "showContentAnimator", "Lcom/ingka/ikea/app/pointofinterest/fragments/b;", "I0", "Lcom/ingka/ikea/app/pointofinterest/fragments/b;", "sheetHeightAnimator", "J0", "LMh/b;", "K0", "I", "sheetWrapContentHeight", "L0", "mapBottomPadding", "M0", "LIh/a;", "_binding", "Landroidx/recyclerview/widget/RecyclerView$p;", "N0", "Landroidx/recyclerview/widget/RecyclerView$p;", "itemDecoration", "", "Lqa/h;", "LMh/a;", "O0", "Ljava/util/Map;", "markerMap", "LOh/a;", "P0", "LXH/o;", "Y1", "()LOh/a;", "viewModel", "com/ingka/ikea/app/pointofinterest/fragments/PointsOfInterestFragment$b", "Q0", "Lcom/ingka/ikea/app/pointofinterest/fragments/PointsOfInterestFragment$b;", "bottomSheetCallback", "V1", "delegateAdapter", "U1", "binding", "LLh/c;", "X1", "()LLh/c;", "pointsOfInterestSource", "a", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class PointsOfInterestFragment extends BaseMapFragment {

    /* renamed from: F0  reason: collision with root package name */
    public j f72054F0;

    /* renamed from: G0  reason: collision with root package name */
    private Lg.d f72055G0;
    /* access modifiers changed from: private */

    /* renamed from: H0  reason: collision with root package name */
    public AnimatorSet f72056H0;

    /* renamed from: I0  reason: collision with root package name */
    private b f72057I0;

    /* renamed from: J0  reason: collision with root package name */
    private Mh.b f72058J0;

    /* renamed from: K0  reason: collision with root package name */
    private int f72059K0 = -1;

    /* renamed from: L0  reason: collision with root package name */
    private int f72060L0;
    /* access modifiers changed from: private */

    /* renamed from: M0  reason: collision with root package name */
    public Ih.a f72061M0;

    /* renamed from: N0  reason: collision with root package name */
    private RecyclerView.p f72062N0;
    /* access modifiers changed from: private */

    /* renamed from: O0  reason: collision with root package name */
    public Map<h, Mh.a> f72063O0 = X.j();

    /* renamed from: P0  reason: collision with root package name */
    private final C16824o f72064P0;

    /* renamed from: Q0  reason: collision with root package name */
    private final b f72065Q0;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/app/pointofinterest/fragments/PointsOfInterestFragment$a;", "Loa/f;", "<init>", "(Lcom/ingka/ikea/app/pointofinterest/fragments/PointsOfInterestFragment;)V", "Loa/c;", "map", "LXH/N;", "a", "(Loa/c;)V", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements C8622f {
        public a() {
        }

        /* access modifiers changed from: private */
        public static final boolean c(a aVar, PointsOfInterestFragment pointsOfInterestFragment, h hVar) {
            String str;
            int i10;
            h hVar2 = hVar;
            C17542s.j(hVar2, "selectedMarker");
            qv.e eVar = qv.e.DEBUG;
            ArrayList arrayList = new ArrayList();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            String str2 = null;
            String str3 = null;
            while (true) {
                boolean hasNext = it.hasNext();
                str = DslKt.INDICATOR_BACKGROUND;
                i10 = 2;
                if (!hasNext) {
                    break;
                }
                C11819b bVar = (C11819b) it.next();
                if (str2 == null) {
                    String a10 = C11818a.a("Marker clicked: " + hVar2, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = aVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                        str = DslKt.INDICATOR_MAIN;
                    }
                    str3 = str + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, (Throwable) null, str4);
                str3 = str5;
                str2 = str4;
            }
            Mh.a aVar2 = (Mh.a) pointsOfInterestFragment.f72063O0.get(hVar2);
            if (aVar2 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Selected marker not in list...");
                qv.e eVar2 = qv.e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str6 = null;
                String str7 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str6 == null) {
                        String a11 = C11818a.a((String) null, illegalStateException);
                        if (a11 == null) {
                            return false;
                        }
                        str6 = C11820c.a(a11);
                    }
                    if (str7 == null) {
                        String name2 = aVar.getClass().getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar2.a(eVar2, str7, false, illegalStateException, str6);
                    i10 = 2;
                }
                return false;
            }
            pointsOfInterestFragment.Y1().L(aVar2.a());
            return true;
        }

        public void a(C8619c cVar) {
            String str;
            Class<a> cls;
            PointsOfInterestFragment pointsOfInterestFragment;
            C8619c cVar2 = cVar;
            C17542s.j(cVar2, "map");
            PointsOfInterestFragment pointsOfInterestFragment2 = PointsOfInterestFragment.this;
            qv.e eVar = qv.e.DEBUG;
            ArrayList arrayList = new ArrayList();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            String str2 = null;
            String str3 = null;
            while (true) {
                boolean hasNext = it.hasNext();
                str = DslKt.INDICATOR_BACKGROUND;
                cls = a.class;
                if (!hasNext) {
                    break;
                }
                C11819b bVar = (C11819b) it.next();
                if (str2 == null) {
                    String a10 = C11818a.a("Map ready callback, isUserLocationAllowed: " + pointsOfInterestFragment2.a1(), (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    pointsOfInterestFragment = pointsOfInterestFragment2;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                        str = DslKt.INDICATOR_MAIN;
                    }
                    str3 = str + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    pointsOfInterestFragment = pointsOfInterestFragment2;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, (Throwable) null, str4);
                str3 = str5;
                str2 = str4;
                pointsOfInterestFragment2 = pointsOfInterestFragment;
            }
            if (PointsOfInterestFragment.this.f72061M0 == null) {
                qv.e eVar2 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str6 = null;
                String str7 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str7 == null) {
                        String a11 = C11818a.a("View has been destroyed. Abort", (Throwable) null);
                        if (a11 != null) {
                            str7 = C11820c.a(a11);
                        } else {
                            return;
                        }
                    }
                    if (str6 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar2.a(eVar2, str6, false, (Throwable) null, str7);
                }
                return;
            }
            PointsOfInterestFragment.this.h1(cVar2);
            PointsOfInterestFragment.this.j1(cVar2, false);
            i g10 = cVar.g();
            g10.j(false);
            g10.e(true);
            g10.d(false);
            g10.b(false);
            g10.a(true);
            PointsOfInterestFragment.this.Y1().H().postValue(Boolean.valueOf(PointsOfInterestFragment.this.a1()));
            cVar2.H(new c(this, PointsOfInterestFragment.this));
            PointsOfInterestFragment.this.k1();
            Ih.a unused = PointsOfInterestFragment.this.a2();
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/ingka/ikea/app/pointofinterest/fragments/PointsOfInterestFragment$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", "", "newState", "LXH/N;", "c", "(Landroid/view/View;I)V", "", "slideOffset", "b", "(Landroid/view/View;F)V", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends BottomSheetBehavior.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PointsOfInterestFragment f72067a;

        b(PointsOfInterestFragment pointsOfInterestFragment) {
            this.f72067a = pointsOfInterestFragment;
        }

        public void b(View view, float f10) {
            C17542s.j(view, "bottomSheet");
        }

        public void c(View view, int i10) {
            C17542s.j(view, "bottomSheet");
            PointsOfInterestFragment.v2(this.f72067a, 0, 1, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "LXH/N;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PointsOfInterestFragment f72068a;

        public c(PointsOfInterestFragment pointsOfInterestFragment) {
            this.f72068a = pointsOfInterestFragment;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f72068a.f72056H0 = null;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f72069c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f72069c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f72069c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f72070c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar) {
            super(0);
            this.f72070c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f72070c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f72071c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C16824o oVar) {
            super(0);
            this.f72071c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f72071c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f72072c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f72073d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar, C16824o oVar) {
            super(0);
            this.f72072c = aVar;
            this.f72073d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f72072c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f72073d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    public PointsOfInterestFragment() {
        Kh.f fVar = new Kh.f(this);
        C16824o a10 = C16825p.a(s.NONE, new e(new d(this)));
        this.f72064P0 = W.b(this, P.b(Oh.a.class), new f(a10), new g((C17631a) null, a10), fVar);
        this.f72065Q0 = new b(this);
    }

    private final int P1() {
        Ih.a U12 = U1();
        int c10 = d.h(this, Hh.a.f60979c);
        int c11 = d.h(this, Hh.a.f60977a);
        if (V1().e().isEmpty()) {
            return c10;
        }
        int max = Math.max(U12.f61112b.getMeasuredHeight(), c10);
        U12.f61112b.measure(View.MeasureSpec.makeMeasureSpec(U12.getRoot().getWidth(), CatalogRepository.FETCH_FLAG_SDB), View.MeasureSpec.makeMeasureSpec(Math.min(ip.h.a(((float) (U12.getRoot().getHeight() - Z().a().getHeight())) * 0.6666667f), c11), Integer.MIN_VALUE));
        int max2 = Math.max(U12.f61112b.getMeasuredHeight(), c10);
        U12.f61112b.measure(View.MeasureSpec.makeMeasureSpec(U12.getRoot().getWidth(), CatalogRepository.FETCH_FLAG_SDB), View.MeasureSpec.makeMeasureSpec(max, CatalogRepository.FETCH_FLAG_SDB));
        LinearLayout linearLayout = U12.f61112b;
        C17542s.i(linearLayout, "bottomSheet");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = max;
            linearLayout.setLayoutParams(layoutParams);
            this.f72059K0 = max2;
            return max2;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    private final void Q1() {
        AnimatorSet animatorSet = this.f72056H0;
        if (animatorSet != null) {
            animatorSet.end();
            animatorSet.removeAllListeners();
            this.f72056H0 = null;
        }
    }

    private final Lg.d R1() {
        return new Lg.d((Lg.a<?>[]) new Lg.a[]{new C11212q(), new C11208m(), new C11209n(), new Jh.b()});
    }

    private final C11652b S1(C11549a aVar, Integer num) {
        C11652b bVar = new C11652b(C6012a.c(requireContext(), C10025b.f75264f), aVar, num);
        bVar.setVisible(true, false);
        return bVar;
    }

    static /* synthetic */ C11652b T1(PointsOfInterestFragment pointsOfInterestFragment, C11549a aVar, Integer num, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                aVar = C11549a.b.f99204a;
            }
            if ((i10 & 2) != 0) {
                num = null;
            }
            return pointsOfInterestFragment.S1(aVar, num);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createShimmer");
    }

    private final Ih.a U1() {
        Ih.a aVar = this.f72061M0;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final Lg.d V1() {
        Lg.d dVar = this.f72055G0;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final Oh.a<?> Y1() {
        return (Oh.a) this.f72064P0.getValue();
    }

    private final void Z1(boolean z10) {
        Ih.a U12 = U1();
        Q1();
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{d.f(U12), d.g(U12)});
            animatorSet.addListener(new c(this));
            animatorSet.start();
            this.f72056H0 = animatorSet;
            return;
        }
        U12.f61118h.setForeground((Drawable) null);
        U12.f61118h.setVisibility(8);
        U12.f61116f.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public final Ih.a a2() {
        Ih.a U12 = U1();
        F<Mh.b> I10 = Y1().I();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(I10, viewLifecycleOwner, new Kh.i(U12, this));
        return U12;
    }

    /* access modifiers changed from: private */
    public static final C16807N b2(Ih.a aVar, PointsOfInterestFragment pointsOfInterestFragment, Mh.b bVar) {
        C17542s.j(bVar, "state");
        HorizontalProgressView horizontalProgressView = aVar.f61120j;
        C17542s.i(horizontalProgressView, "progress");
        boolean z10 = bVar instanceof b.c;
        horizontalProgressView.setVisibility(z10 ? 0 : 8);
        if (!z10) {
            if (bVar instanceof b.C1039b) {
                pointsOfInterestFragment.l2((b.C1039b) bVar);
            } else if (bVar instanceof b.a) {
                pointsOfInterestFragment.o2(pointsOfInterestFragment.f72058J0, (b.a) bVar);
            } else {
                throw new t();
            }
        }
        pointsOfInterestFragment.f72058J0 = bVar;
        return C16807N.f139792a;
    }

    private final void c2() {
        Y1().H().observe(getViewLifecycleOwner(), new d.b(new Kh.g(this)));
    }

    /* access modifiers changed from: private */
    public static final C16807N d2(PointsOfInterestFragment pointsOfInterestFragment, Boolean bool) {
        FloatingActionButton floatingActionButton = pointsOfInterestFragment.U1().f61117g;
        C17542s.i(floatingActionButton, "findMe");
        floatingActionButton.setVisibility(bool.booleanValue() ? 0 : 8);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f2(Ih.a aVar, q qVar) {
        C17542s.j(qVar, "$this$systemUi");
        FloatingActionButton floatingActionButton = aVar.f61115e;
        C17542s.i(floatingActionButton, "close");
        qVar.e(floatingActionButton, C14617d.Margin);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void g2(PointsOfInterestFragment pointsOfInterestFragment, View view) {
        pointsOfInterestFragment.V0();
    }

    /* access modifiers changed from: private */
    public static final void h2(PointsOfInterestFragment pointsOfInterestFragment, View view) {
        C5191t activity = pointsOfInterestFragment.getActivity();
        if (activity != null) {
            activity.finish();
            activity.overridePendingTransition(C10024a.f75255g, C10024a.f75257i);
        }
    }

    private final Ih.a i2() {
        Ih.a U12 = U1();
        U12.f61118h.setForeground(T1(this, (C11549a) null, -1, 1, (Object) null));
        U12.f61116f.setVisibility(4);
        return U12;
    }

    private final void j2() {
        FrameLayout frameLayout = U1().f61114d;
        frameLayout.setOnClickListener(new Kh.h(this, frameLayout));
    }

    /* access modifiers changed from: private */
    public static final void k2(PointsOfInterestFragment pointsOfInterestFragment, FrameLayout frameLayout, View view) {
        BottomSheetBehavior d10 = d.i(pointsOfInterestFragment.U1());
        int i10 = 4;
        if (d10.v0() == 4) {
            frameLayout.setContentDescription(pointsOfInterestFragment.getString(Oo.b.f84676j));
            i10 = 3;
        } else {
            frameLayout.setContentDescription(pointsOfInterestFragment.getString(Oo.b.f84720n));
        }
        d10.X0(i10);
    }

    private final void l2(b.C1039b bVar) {
        bVar.a().a(new Kh.j(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N m2(PointsOfInterestFragment pointsOfInterestFragment, ip.d dVar, boolean z10) {
        C17542s.j(dVar, "$this$handle");
        j.a.r(pointsOfInterestFragment.W1(), pointsOfInterestFragment.U1().getRoot(), Oo.b.f84812v3, Oo.b.f84750p7, -2, (View) null, new Kh.b(pointsOfInterestFragment), 16, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n2(PointsOfInterestFragment pointsOfInterestFragment) {
        pointsOfInterestFragment.Y1().K();
        return C16807N.f139792a;
    }

    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r5v5, types: [dl.d$b] */
    /* JADX WARNING: type inference failed for: r5v6, types: [dl.d$b] */
    /* JADX WARNING: type inference failed for: r5v7, types: [dl.d$a] */
    /* JADX WARNING: type inference failed for: r5v8, types: [dl.d$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void o2(Mh.b r13, Mh.b.a r14) {
        /*
            r12 = this;
            boolean r13 = r13 instanceof Mh.b.a
            java.util.List r0 = r14.b()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r1 = 10
            int r1 = YH.C16877v.y(r0, r1)
            r2.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x009d
            java.lang.Object r1 = r0.next()
            boolean r3 = r1 instanceof Jh.a
            if (r3 == 0) goto L_0x0098
            Jh.a r1 = (Jh.a) r1
            boolean r3 = r1 instanceof Jh.a.b
            java.lang.String r4 = "getString(...)"
            if (r3 == 0) goto L_0x005e
            dl.d$a r3 = new dl.d$a
            int r5 = r1.b()
            java.lang.String r8 = r12.getString(r5)
            kotlin.jvm.internal.C17542s.i(r8, r4)
            Kh.k r9 = new Kh.k
            r9.<init>(r12, r1)
            r10 = 3
            r11 = 0
            r6 = 0
            r7 = 0
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.Integer r1 = r1.a()
            if (r1 == 0) goto L_0x005c
            int r1 = r1.intValue()
            android.content.Context r4 = r12.requireContext()
            android.graphics.drawable.Drawable r1 = u2.C6012a.e(r4, r1)
            r3.g(r1)
        L_0x005c:
            r1 = r3
            goto L_0x0098
        L_0x005e:
            boolean r3 = r1 instanceof Jh.a.C1016a
            if (r3 == 0) goto L_0x0092
            dl.d$b r3 = new dl.d$b
            int r5 = r1.b()
            java.lang.String r8 = r12.getString(r5)
            kotlin.jvm.internal.C17542s.i(r8, r4)
            Kh.l r9 = new Kh.l
            r9.<init>(r12, r1)
            r10 = 3
            r11 = 0
            r6 = 0
            r7 = 0
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.Integer r1 = r1.a()
            if (r1 == 0) goto L_0x005c
            int r1 = r1.intValue()
            android.content.Context r4 = r12.requireContext()
            android.graphics.drawable.Drawable r1 = u2.C6012a.e(r4, r1)
            r3.g(r1)
            goto L_0x005c
        L_0x0092:
            XH.t r13 = new XH.t
            r13.<init>()
            throw r13
        L_0x0098:
            r2.add(r1)
            goto L_0x0017
        L_0x009d:
            Lg.d r1 = r12.V1()
            r5 = 4
            r6 = 0
            r3 = 1
            r4 = 0
            Lg.d.q(r1, r2, r3, r4, r5, r6)
            Ih.a r0 = r12.U1()
            androidx.recyclerview.widget.RecyclerView r0 = r0.f61116f
            androidx.recyclerview.widget.RecyclerView$q r0 = r0.getLayoutManager()
            if (r0 == 0) goto L_0x00b8
            r1 = 0
            r0.X1(r1)
        L_0x00b8:
            r12.r2(r14)
            int r14 = r12.P1()
            r12.u2(r14)
            r12.s1(r13)
            r0 = 1
            r12.s2(r14, r0)
            r13 = r13 ^ r0
            r12.Z1(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.pointofinterest.fragments.PointsOfInterestFragment.o2(Mh.b, Mh.b$a):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N p2(PointsOfInterestFragment pointsOfInterestFragment, Jh.a aVar, int i10) {
        pointsOfInterestFragment.e2(aVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q2(PointsOfInterestFragment pointsOfInterestFragment, Jh.a aVar, int i10) {
        pointsOfInterestFragment.e2(aVar);
        return C16807N.f139792a;
    }

    private final void r2(b.a aVar) {
        C8619c Z02 = Z0();
        if (Z02 != null) {
            for (Map.Entry<h, Mh.a> key : this.f72063O0.entrySet()) {
                ((h) key.getKey()).d();
            }
            Iterable a10 = aVar.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(a10, 10)), 16));
            for (Object next : a10) {
                Mh.a aVar2 = (Mh.a) next;
                linkedHashMap.put(O0(Z02, d.j(aVar2.b()), aVar2.c()), next);
            }
            this.f72063O0 = linkedHashMap;
        }
    }

    private final void s2(int i10, boolean z10) {
        LinearLayout linearLayout = U1().f61112b;
        C17542s.i(linearLayout, "bottomSheet");
        if (i10 != linearLayout.getMeasuredHeight()) {
            b bVar = this.f72057I0;
            if (bVar == null || i10 != bVar.d()) {
                b bVar2 = this.f72057I0;
                if (bVar2 != null) {
                    bVar2.c();
                }
                if (z10) {
                    this.f72057I0 = new b(linearLayout, i10, new Kh.c(this)).e();
                    return;
                }
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = i10;
                    linearLayout.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N t2(PointsOfInterestFragment pointsOfInterestFragment) {
        pointsOfInterestFragment.f72057I0 = null;
        return C16807N.f139792a;
    }

    private final void u2(int i10) {
        int dimensionPixelOffset = d.i(U1()).v0() == 3 ? i10 - getResources().getDimensionPixelOffset(Hh.a.f60980d) : getResources().getDimensionPixelOffset(Hh.a.f60978b);
        if (dimensionPixelOffset >= 0 && dimensionPixelOffset != this.f72060L0) {
            C8619c Z02 = Z0();
            if (Z02 != null) {
                Z02.O(0, Z().a().getHeight(), 0, dimensionPixelOffset);
            }
            this.f72060L0 = dimensionPixelOffset;
        }
    }

    static /* synthetic */ void v2(PointsOfInterestFragment pointsOfInterestFragment, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                i10 = pointsOfInterestFragment.f72059K0;
            }
            pointsOfInterestFragment.u2(i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMapPadding");
    }

    /* access modifiers changed from: private */
    public static final i0.c w2(PointsOfInterestFragment pointsOfInterestFragment) {
        return Oh.a.f62726r.a(pointsOfInterestFragment.X1());
    }

    public final j W1() {
        j jVar = this.f72054F0;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public abstract Lh.c<?> X1();

    /* access modifiers changed from: protected */
    public void e2(Jh.a aVar) {
        C17542s.j(aVar, "button");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Ih.a c10 = Ih.a.c(layoutInflater);
        this.f72061M0 = c10;
        CoordinatorLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        for (Map.Entry<h, Mh.a> key : this.f72063O0.entrySet()) {
            ((h) key.getKey()).d();
        }
        this.f72063O0 = X.j();
        this.f72058J0 = null;
        b bVar = this.f72057I0;
        if (bVar != null) {
            bVar.c();
            this.f72057I0 = null;
        }
        Q1();
        Ih.a aVar = this.f72061M0;
        if (aVar != null) {
            d.i(aVar).F0(this.f72065Q0);
            aVar.f61116f.setAdapter((RecyclerView.h) null);
            RecyclerView.p pVar = this.f72062N0;
            if (pVar != null) {
                aVar.f61116f.k1(pVar);
            }
        }
        this.f72055G0 = null;
        this.f72062N0 = null;
        this.f72061M0 = null;
        super.onDestroyView();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C17542s.j(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            C5191t activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Not implemented yet");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
        }
        return true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        this.f72055G0 = R1();
        RecyclerView recyclerView = U1().f61116f;
        recyclerView.setAdapter(V1());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator((RecyclerView.n) null);
        this.f72059K0 = d.h(this, Hh.a.f60979c);
        boolean z10 = getResources().getConfiguration().orientation == 2;
        Ih.a U12 = U1();
        d.i(U12).c0(this.f72065Q0);
        d.i(U12).X0(z10 ? 4 : 3);
        if (bundle == null) {
            i2();
        } else {
            Z1(false);
        }
        MapView mapView = U1().f61119i;
        mapView.b(bundle);
        mapView.a(new a());
        i1(mapView);
        Ih.a U13 = U1();
        b(new Kh.a(U13));
        U13.f61117g.setOnClickListener(new Kh.d(this));
        U13.f61115e.setOnClickListener(new Kh.e(this));
        Context context = getContext();
        if (context != null && Xo.c.b(context)) {
            j2();
        }
        c2();
    }
}
