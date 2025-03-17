package Hj;

import Wj.c;
import Wj.f;
import Wj.h;
import android.view.View;
import androidx.lifecycle.C5215s;
import com.ingka.ikea.app.scannerbase.googlevision.CameraPreview;
import com.ingka.ikea.app.scannerbase.googlevision.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ug.C10272a;
import ug.j;
import ya.b;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"LHj/y;", "", "Lug/j;", "enabledFeaturesFactory", "<init>", "(Lug/j;)V", "Landroidx/lifecycle/s;", "lifecycleCoroutineScope", "Landroid/view/View;", "viewport", "Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreview;", "preview", "Lcom/ingka/ikea/app/scannerbase/googlevision/a;", "overlay", "Lya/b$b;", "Lza/a;", "detectorProcessor", "LWj/c;", "a", "(Landroidx/lifecycle/s;Landroid/view/View;Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreview;Lcom/ingka/ikea/app/scannerbase/googlevision/a;Lya/b$b;)LWj/c;", "Lug/j;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final j f81329a;

    public y(j jVar) {
        C17542s.j(jVar, "enabledFeaturesFactory");
        this.f81329a = jVar;
    }

    public final c a(C5215s sVar, View view, CameraPreview cameraPreview, a aVar, b.C0937b<za.a> bVar) {
        C17542s.j(sVar, "lifecycleCoroutineScope");
        C17542s.j(view, "viewport");
        C17542s.j(cameraPreview, "preview");
        C17542s.j(aVar, "overlay");
        C17542s.j(bVar, "detectorProcessor");
        c cVar = new c(bVar);
        C10272a b10 = this.f81329a.b();
        if (b10.b()) {
            cVar.b(new Wj.a(view, cameraPreview, aVar, b10.c()));
        }
        cVar.b(new h(view, cameraPreview));
        cVar.b(new f(sVar));
        return cVar;
    }
}
