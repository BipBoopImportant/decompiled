package lC;

import android.graphics.drawable.Drawable;
import dI.C17164e;
import jC.C14615b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J.\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0012\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LlC/l;", "", "Landroid/graphics/drawable/Drawable;", "drawable", "LjC/b;", "default", "", "applyResult", "b", "(Landroid/graphics/drawable/Drawable;LjC/b;ZLdI/e;)Ljava/lang/Object;", "", "getHeight", "()I", "height", "c", "()LjC/b;", "a", "(LjC/b;)V", "iconColor", "systemui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Object a(l lVar, Drawable drawable, C14615b bVar, boolean z10, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    bVar = C14615b.e.f127859b;
                }
                if ((i10 & 4) != 0) {
                    z10 = false;
                }
                return lVar.b(drawable, bVar, z10, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: suggestIconColor");
        }
    }

    void a(C14615b bVar);

    Object b(Drawable drawable, C14615b bVar, boolean z10, C17164e<? super C14615b> eVar);

    C14615b c();

    int getHeight();
}
