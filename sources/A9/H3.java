package a9;

import G8.f;
import XH.C16807N;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.q;

public abstract class H3<V extends View> implements R5 {

    /* renamed from: a  reason: collision with root package name */
    public final f f42032a;

    /* renamed from: b  reason: collision with root package name */
    public int f42033b;

    /* renamed from: c  reason: collision with root package name */
    public int f42034c;

    /* renamed from: d  reason: collision with root package name */
    public long f42035d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference<V> f42036e;

    /* renamed from: f  reason: collision with root package name */
    public q<? super Integer, ? super Integer, ? super Long, C16807N> f42037f;

    public H3(V v10, f fVar) {
        C17542s.j(v10, "view");
        C17542s.j(fVar, "debouncer");
        this.f42032a = fVar;
        this.f42036e = new WeakReference<>(v10);
    }

    public abstract int a();

    public final <T> T b(C17642l<? super V, ? extends T> lVar) {
        C17542s.j(lVar, "body");
        View view = (View) this.f42036e.get();
        if (view != null) {
            return lVar.invoke(view);
        }
        return null;
    }

    public abstract int c();
}
