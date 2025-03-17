package fs;

import C7.i;
import E7.v;
import Q7.e;
import a8.g;
import android.graphics.drawable.PictureDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfs/c;", "LQ7/e;", "La8/g;", "Landroid/graphics/drawable/PictureDrawable;", "<init>", "()V", "LE7/v;", "toTranscode", "LC7/i;", "options", "a", "(LE7/v;LC7/i;)LE7/v;", "imageloader-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements e<g, PictureDrawable> {
    public v<PictureDrawable> a(v<g> vVar, i iVar) {
        C17542s.j(vVar, "toTranscode");
        C17542s.j(iVar, "options");
        g gVar = vVar.get();
        C17542s.i(gVar, "get(...)");
        return new K7.c(new PictureDrawable(gVar.r()));
    }
}
