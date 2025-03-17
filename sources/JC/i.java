package jC;

import android.graphics.Bitmap;
import c2.p;
import dI.C17164e;
import jC.C14615b;
import kotlin.Metadata;
import lC.C14755g;
import lC.l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LjC/i;", "", "", "alpha", "Lp1/v0;", "d", "(F)J", "defaultAspectRatio", "", "imageWidth", "c", "(FI)F", "Landroid/graphics/Bitmap;", "bitmap", "Lc2/p;", "region", "LjC/b$d;", "e", "(Landroid/graphics/Bitmap;Lc2/p;LdI/e;)Ljava/lang/Object;", "LlC/l;", "a", "()LlC/l;", "statusBar", "LlC/g;", "b", "()LlC/g;", "navigationBar", "systemui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ long a(i iVar, float f10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    f10 = 1.0f;
                }
                return iVar.d(f10);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: statusBarScrim-vNxB06k");
        }
    }

    l a();

    C14755g b();

    float c(float f10, int i10);

    long d(float f10);

    Object e(Bitmap bitmap, p pVar, C17164e<? super C14615b.d> eVar);
}
