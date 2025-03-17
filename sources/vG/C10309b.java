package vg;

import HJ.C15850p;
import HJ.C15854t;
import XH.C16807N;
import XH.C16814e;
import android.widget.ImageView;
import com.sugarcube.core.logger.DslKt;
import ds.C11239c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import vg.g;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0015\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0019\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lvg/b;", "Lds/c;", "<init>", "()V", "", "e", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/widget/ImageView;", "imageView", "Lvg/g$b;", "imageSize", "Lvg/g;", "imageSettings", "Lvg/c;", "d", "(Landroid/widget/ImageView;Lvg/g$b;Lvg/g;)Lvg/c;", "imageUrl", "Lkotlin/Function1;", "Lvg/g$a;", "LXH/N;", "editBlock", "a", "(Landroid/widget/ImageView;Ljava/lang/String;Lvg/g$b;LnI/l;)V", "", "imageResource", "c", "(Landroid/widget/ImageView;ILnI/l;)V", "b", "(Landroid/widget/ImageView;)V", "imageloader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
/* renamed from: vg.b  reason: case insensitive filesystem */
public final class C10309b implements C11239c {

    /* renamed from: a  reason: collision with root package name */
    public static final C10309b f77164a = new C10309b();

    private C10309b() {
    }

    private final c d(ImageView imageView, g.b bVar, g gVar) {
        return new C10308a(imageView, bVar, gVar);
    }

    private final String e(String str) {
        if (new C15850p("^(http|https)://.*$").i(str)) {
            return str;
        }
        if (C15854t.v0(str)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Image url is blank");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = str.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalArgumentException, str4);
                str2 = str4;
                str3 = str5;
            }
        }
        return "https://shop.static.ingka.ikea.com" + str;
    }

    public void a(ImageView imageView, String str, g.b bVar, C17642l<? super g.a, C16807N> lVar) {
        C17542s.j(imageView, "imageView");
        C17542s.j(str, "imageUrl");
        C17542s.j(bVar, "imageSize");
        C17542s.j(lVar, "editBlock");
        d(imageView, bVar, new g.a(lVar).e()).b(e(str));
    }

    public void b(ImageView imageView) {
        C17542s.j(imageView, "imageView");
        C10308a.f77156g.a(imageView);
    }

    public void c(ImageView imageView, int i10, C17642l<? super g.a, C16807N> lVar) {
        C17542s.j(imageView, "imageView");
        C17542s.j(lVar, "editBlock");
        d(imageView, g.b.XL, new g.a(lVar).e()).a(i10);
    }
}
