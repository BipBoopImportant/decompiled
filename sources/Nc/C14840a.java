package nC;

import android.graphics.Bitmap;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JJ\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LnC/a;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "left", "top", "right", "bottom", "", "luminanceThreshold", "LnC/d;", "a", "(Landroid/graphics/Bitmap;IIIIFLdI/e;)Ljava/lang/Object;", "systemui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nC.a  reason: case insensitive filesystem */
public interface C14840a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nC.a$a  reason: collision with other inner class name */
    public static final class C3189a {
        public static /* synthetic */ Object a(C14840a aVar, Bitmap bitmap, int i10, int i11, int i12, int i13, float f10, C17164e eVar, int i14, Object obj) {
            if (obj == null) {
                return aVar.a(bitmap, (i14 & 2) != 0 ? 0 : i10, (i14 & 4) != 0 ? 0 : i11, (i14 & 8) != 0 ? bitmap.getWidth() : i12, (i14 & 16) != 0 ? bitmap.getHeight() : i13, (i14 & 32) != 0 ? 0.5f : f10, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isRegionDark");
        }
    }

    Object a(Bitmap bitmap, int i10, int i11, int i12, int i13, float f10, C17164e<? super C14843d> eVar);
}
