package U;

import android.graphics.Matrix;
import androidx.camera.core.n;
import hd.C9774a;
import java.util.Map;
import xa.C8965f;
import xa.C8971l;

public final /* synthetic */ class b implements C8965f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f13713a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f13714b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C9774a f13715c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Map f13716d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ n f13717e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f13718f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Matrix f13719g;

    public /* synthetic */ b(c cVar, Map map, C9774a aVar, Map map2, n nVar, int i10, Matrix matrix) {
        this.f13713a = cVar;
        this.f13714b = map;
        this.f13715c = aVar;
        this.f13716d = map2;
        this.f13717e = nVar;
        this.f13718f = i10;
        this.f13719g = matrix;
    }

    public final void onComplete(C8971l lVar) {
        this.f13713a.j(this.f13714b, this.f13715c, this.f13716d, this.f13717e, this.f13718f, this.f13719g, lVar);
    }
}
