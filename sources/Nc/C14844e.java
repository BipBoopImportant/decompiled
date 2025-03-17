package nC;

import QJ.C16311i0;
import QJ.M;
import android.graphics.Bitmap;
import dI.C17164e;
import jC.C14615b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JL\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LnC/e;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "left", "top", "right", "bottom", "LQJ/M;", "dispatcher", "LjC/b$d;", "a", "(Landroid/graphics/Bitmap;IIIILQJ/M;LdI/e;)Ljava/lang/Object;", "systemui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nC.e  reason: case insensitive filesystem */
public interface C14844e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nC.e$a */
    public static final class a {
        public static /* synthetic */ Object a(C14844e eVar, Bitmap bitmap, int i10, int i11, int i12, int i13, M m10, C17164e eVar2, int i14, Object obj) {
            if (obj == null) {
                return eVar.a(bitmap, (i14 & 2) != 0 ? 0 : i10, (i14 & 4) != 0 ? 0 : i11, (i14 & 8) != 0 ? bitmap.getWidth() : i12, (i14 & 16) != 0 ? bitmap.getHeight() : i13, (i14 & 32) != 0 ? C16311i0.a() : m10, eVar2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forBitmap");
        }
    }

    Object a(Bitmap bitmap, int i10, int i11, int i12, int i13, M m10, C17164e<? super C14615b.d> eVar);
}
