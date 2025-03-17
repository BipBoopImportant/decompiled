package Uc;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import c1.c;
import com.google.android.gms.maps.MapView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import nI.q;
import oa.C8619c;
import qa.h;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"LUc/k;", "Loa/c$b;", "Lcom/google/android/gms/maps/MapView;", "mapView", "Lkotlin/Function1;", "Lqa/h;", "LUc/w1;", "markerNodeFinder", "<init>", "(Lcom/google/android/gms/maps/MapView;LnI/l;)V", "marker", "Landroid/view/View;", "a", "(Lqa/h;)Landroid/view/View;", "b", "Lcom/google/android/gms/maps/MapView;", "LnI/l;", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Uc.k  reason: case insensitive filesystem */
public final class C9311k implements C8619c.b {

    /* renamed from: a  reason: collision with root package name */
    private final MapView f64323a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<h, w1> f64324b;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Uc.k$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q<h, C4889m, Integer, C16807N> f64325a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f64326b;

        a(q<? super h, ? super C4889m, ? super Integer, C16807N> qVar, h hVar) {
            this.f64325a = qVar;
            this.f64326b = hVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1508359207, i10, -1, "com.google.maps.android.compose.ComposeInfoWindowAdapter.getInfoContents.<anonymous>.<anonymous> (ComposeInfoWindowAdapter.kt:49)");
                }
                this.f64325a.invoke(this.f64326b, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Uc.k$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q<h, C4889m, Integer, C16807N> f64327a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f64328b;

        b(q<? super h, ? super C4889m, ? super Integer, C16807N> qVar, h hVar) {
            this.f64327a = qVar;
            this.f64328b = hVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-742372995, i10, -1, "com.google.maps.android.compose.ComposeInfoWindowAdapter.getInfoWindow.<anonymous>.<anonymous> (ComposeInfoWindowAdapter.kt:62)");
                }
                this.f64327a.invoke(this.f64328b, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public C9311k(MapView mapView, C17642l<? super h, w1> lVar) {
        C17542s.j(mapView, "mapView");
        C17542s.j(lVar, "markerNodeFinder");
        this.f64323a = mapView;
        this.f64324b = lVar;
    }

    public View a(h hVar) {
        q<h, C4889m, Integer, C16807N> e10;
        C17542s.j(hVar, "marker");
        w1 invoke = this.f64324b.invoke(hVar);
        if (invoke == null || (e10 = invoke.e()) == null) {
            return null;
        }
        Context context = this.f64323a.getContext();
        C17542s.i(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(c.c(1508359207, true, new a(e10, hVar)));
        com.google.maps.android.compose.b.c(this.f64323a, composeView, (C17642l) null, invoke.d(), 2, (Object) null);
        return composeView;
    }

    public View b(h hVar) {
        q<h, C4889m, Integer, C16807N> f10;
        C17542s.j(hVar, "marker");
        w1 invoke = this.f64324b.invoke(hVar);
        if (invoke == null || (f10 = invoke.f()) == null) {
            return null;
        }
        Context context = this.f64323a.getContext();
        C17542s.i(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(c.c(-742372995, true, new b(f10, hVar)));
        com.google.maps.android.compose.b.c(this.f64323a, composeView, (C17642l) null, invoke.d(), 2, (Object) null);
        return composeView;
    }
}
