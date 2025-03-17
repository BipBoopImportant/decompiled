package com.google.maps.android.compose;

import U0.r;
import Uc.C1;
import android.content.Context;
import androidx.compose.ui.platform.AbstractComposeView;
import com.google.android.gms.maps.MapView;
import com.google.maps.android.compose.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/android/gms/maps/MapView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function1;", "Landroid/view/View;", "LXH/N;", "onAddedToWindow", "LU0/r;", "parentContext", "b", "(Lcom/google/android/gms/maps/MapView;Landroidx/compose/ui/platform/AbstractComposeView;LnI/l;LU0/r;)V", "Lcom/google/maps/android/compose/a;", "d", "(Lcom/google/android/gms/maps/MapView;Landroidx/compose/ui/platform/AbstractComposeView;LU0/r;)Lcom/google/maps/android/compose/a;", "Lcom/google/maps/android/compose/NoDrawContainerView;", "a", "(Lcom/google/android/gms/maps/MapView;)Lcom/google/maps/android/compose/NoDrawContainerView;", "maps-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/maps/android/compose/b$a", "Lcom/google/maps/android/compose/a;", "LXH/N;", "b", "()V", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NoDrawContainerView f69185a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AbstractComposeView f69186b;

        a(NoDrawContainerView noDrawContainerView, AbstractComposeView abstractComposeView) {
            this.f69185a = noDrawContainerView;
            this.f69186b = abstractComposeView;
        }

        public void b() {
            this.f69185a.removeView(this.f69186b);
        }

        public void close() {
            a.C1190a.a(this);
        }
    }

    private static final NoDrawContainerView a(MapView mapView) {
        NoDrawContainerView noDrawContainerView = (NoDrawContainerView) mapView.findViewById(C1.f64150a);
        if (noDrawContainerView != null) {
            return noDrawContainerView;
        }
        Context context = mapView.getContext();
        C17542s.i(context, "getContext(...)");
        NoDrawContainerView noDrawContainerView2 = new NoDrawContainerView(context);
        noDrawContainerView2.setId(C1.f64150a);
        mapView.addView(noDrawContainerView2);
        return noDrawContainerView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        jI.C17416c.a(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(com.google.android.gms.maps.MapView r1, androidx.compose.ui.platform.AbstractComposeView r2, nI.C17642l<? super android.view.View, XH.C16807N> r3, U0.r r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "parentContext"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            com.google.maps.android.compose.a r1 = d(r1, r2, r4)
            if (r3 == 0) goto L_0x0022
            r3.invoke(r2)     // Catch:{ all -> 0x001b }
            XH.N r2 = XH.C16807N.f139792a     // Catch:{ all -> 0x001b }
            goto L_0x0022
        L_0x001b:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001d }
        L_0x001d:
            r3 = move-exception
            jI.C17416c.a(r1, r2)
            throw r3
        L_0x0022:
            r2 = 0
            jI.C17416c.a(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.b.b(com.google.android.gms.maps.MapView, androidx.compose.ui.platform.AbstractComposeView, nI.l, U0.r):void");
    }

    public static /* synthetic */ void c(MapView mapView, AbstractComposeView abstractComposeView, C17642l lVar, r rVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        b(mapView, abstractComposeView, lVar, rVar);
    }

    public static final a d(MapView mapView, AbstractComposeView abstractComposeView, r rVar) {
        C17542s.j(mapView, "<this>");
        C17542s.j(abstractComposeView, "view");
        C17542s.j(rVar, "parentContext");
        NoDrawContainerView a10 = a(mapView);
        a10.addView(abstractComposeView);
        abstractComposeView.setParentCompositionContext(rVar);
        return new a(a10, abstractComposeView);
    }
}
