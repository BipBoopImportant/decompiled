package fs;

import XH.C16807N;
import android.widget.ImageView;
import ds.C11239c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import vg.C10309b;
import vg.g;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lfs/a;", "Lds/c;", "<init>", "()V", "Landroid/widget/ImageView;", "imageView", "", "imageUrl", "Lvg/g$b;", "imageSize", "Lkotlin/Function1;", "Lvg/g$a;", "LXH/N;", "editBlock", "a", "(Landroid/widget/ImageView;Ljava/lang/String;Lvg/g$b;LnI/l;)V", "", "imageResource", "c", "(Landroid/widget/ImageView;ILnI/l;)V", "b", "(Landroid/widget/ImageView;)V", "imageloader-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fs.a  reason: case insensitive filesystem */
public final class C11282a implements C11239c {
    public void a(ImageView imageView, String str, g.b bVar, C17642l<? super g.a, C16807N> lVar) {
        C17542s.j(imageView, "imageView");
        C17542s.j(str, "imageUrl");
        C17542s.j(bVar, "imageSize");
        C17542s.j(lVar, "editBlock");
        C10309b.f77164a.a(imageView, str, bVar, lVar);
    }

    public void b(ImageView imageView) {
        C17542s.j(imageView, "imageView");
        C10309b.f77164a.b(imageView);
    }

    public void c(ImageView imageView, int i10, C17642l<? super g.a, C16807N> lVar) {
        C17542s.j(imageView, "imageView");
        C17542s.j(lVar, "editBlock");
        C10309b.f77164a.c(imageView, i10, lVar);
    }
}
