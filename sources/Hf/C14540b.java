package hF;

import XH.C16796C;
import YH.X;
import com.sugarcube.core.analytics.Capture;
import com.sugarcube.core.analytics.Event;
import fI.C17221b;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"LhF/b;", "", "", "LhF/d;", "Lcom/sugarcube/core/analytics/Event;", "trackMap", "<init>", "(Ljava/lang/String;ILjava/util/Map;)V", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "Room", "ScanningTips", "Permission", "Snap", "Pano", "PanoPreview", "Init", "Align", "Scan", "Step", "Tutorial", "Results", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hF.b  reason: case insensitive filesystem */
public enum C14540b {
    Room(X.m(r2, r4, r5, C16796C.a(r6, Capture.SelectRoom.Exit))),
    ScanningTips(X.m(C16796C.a(r1, Capture.ScanningTips.Start), C16796C.a(r3, Capture.ScanningTips.End), C16796C.a(r6, Capture.ScanningTips.Exit), C16796C.a(C14542d.LearnMore, Capture.ScanningTips.LearnMore), C16796C.a(C14542d.KitchenPlanner, Capture.ScanningTips.KitchenPlanner), C16796C.a(C14542d.GoBack, Capture.ScanningTips.GoBack))),
    Permission(X.m(r2, r4, C16796C.a(r5, Capture.SelectRoom.Start))),
    Snap(X.m(C16796C.a(r1, Capture.Snap.Start), C16796C.a(r3, Capture.Snap.End), C16796C.a(r6, Capture.Snap.Exit), C16796C.a(r5, Capture.Snap.Continue))),
    Pano(X.m(C16796C.a(r1, Capture.Pano.Start), C16796C.a(r3, Capture.Pano.End), C16796C.a(r6, Capture.Pano.Exit), C16796C.a(C14542d.Target, Capture.Pano.Target), C16796C.a(r5, Capture.Pano.Continue))),
    PanoPreview(X.m(C16796C.a(r1, Capture.PanoPreview.Start), C16796C.a(r3, Capture.PanoPreview.End), C16796C.a(r6, Capture.PanoPreview.Exit), C16796C.a(r5, Capture.PanoPreview.Continue), C16796C.a(C14542d.Retry, Capture.PanoPreview.Retry))),
    Init(X.m(C16796C.a(r1, Capture.Init.Start), C16796C.a(r3, Capture.Init.End), C16796C.a(r6, Capture.Init.Exit), C16796C.a(r5, Capture.Init.Continue))),
    Align(X.m(C16796C.a(r1, Capture.Align.Start), C16796C.a(r3, Capture.Align.End), C16796C.a(r6, Capture.Align.Exit), C16796C.a(r5, Capture.Align.Continue))),
    Scan(X.m(C16796C.a(r1, Capture.Scan.Start), C16796C.a(r3, Capture.Scan.End), C16796C.a(r6, Capture.Scan.Exit))),
    Step(X.m(C16796C.a(r1, Capture.Step.Start), C16796C.a(r3, Capture.Step.End), C16796C.a(r6, Capture.Step.Exit))),
    Tutorial(X.m(C16796C.a(r1, Capture.Tutorial.Start), C16796C.a(r3, Capture.Tutorial.End), C16796C.a(r6, Capture.Tutorial.Exit), C16796C.a(C14542d.Next, Capture.Tutorial.Next))),
    Results(X.m(C16796C.a(r1, Capture.End.Start), C16796C.a(r3, Capture.End.End), C16796C.a(r6, Capture.End.Exit), C16796C.a(C14542d.Login, Capture.End.Login), C16796C.a(C14542d.Signup, Capture.End.Signup), C16796C.a(C14542d.MaybeLater, Capture.End.MaybeLater), C16796C.a(C14542d.GoToRooms, Capture.End.GoToRooms)));
    
    private final Map<C14542d, Event> trackMap;

    static {
        C14540b[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C14540b(Map<C14542d, ? extends Event> map) {
        this.trackMap = map;
    }

    public final Map<C14542d, Event> b() {
        return this.trackMap;
    }
}
