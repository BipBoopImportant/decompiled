package n0;

import android.os.Build;
import android.view.View;
import c2.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011JR\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014ø\u0001\u0001\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Ln0/W;", "", "Landroid/view/View;", "view", "", "useTextDefault", "Lc2/k;", "size", "Lc2/h;", "cornerRadius", "elevation", "clippingEnabled", "Lc2/d;", "density", "", "initialZoom", "Ln0/V;", "a", "(Landroid/view/View;ZJFFZLc2/d;F)Ln0/V;", "b", "()Z", "canUpdateZoom", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface W {

    /* renamed from: a  reason: collision with root package name */
    public static final a f26384a = a.f26385a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln0/W$a;", "", "<init>", "()V", "Ln0/W;", "a", "()Ln0/W;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f26385a = new a();

        private a() {
        }

        public final W a() {
            if (C5588K.d(0, 1, (Object) null)) {
                return Build.VERSION.SDK_INT == 28 ? X.f26386b : Y.f26389b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    V a(View view, boolean z10, long j10, float f10, float f11, boolean z11, d dVar, float f12);

    boolean b();
}
