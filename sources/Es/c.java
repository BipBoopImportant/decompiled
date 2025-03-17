package es;

import HJ.C15854t;
import XH.C16807N;
import YH.C16877v;
import android.widget.ImageView;
import com.sugarcube.core.logger.DslKt;
import ds.C11239c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lg.C10027d;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import u2.C6012a;
import vg.C10309b;
import vg.g;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a/\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/widget/ImageView;", "", "imageUrl", "LXH/N;", "e", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "g", "Lkotlin/Function1;", "Lvg/g$a;", "block", "d", "(Landroid/widget/ImageView;Ljava/lang/String;LnI/l;)V", "", "resId", "c", "(Landroid/widget/ImageView;I)V", "imageloader_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    private static final void c(ImageView imageView, int i10) {
        C11239c.a.c(C10309b.f77164a, imageView, i10, (C17642l) null, 4, (Object) null);
    }

    private static final void d(ImageView imageView, String str, C17642l<? super g.a, C16807N> lVar) {
        C11239c.a.d(C10309b.f77164a, imageView, str, (g.b) null, lVar, 4, (Object) null);
    }

    public static final void e(ImageView imageView, String str) {
        C17542s.j(imageView, "<this>");
        if (str == null || str.length() == 0) {
            c(imageView, C10027d.f75287r);
        } else {
            d(imageView, str, new C11260a(imageView));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(ImageView imageView, g.a aVar) {
        C17542s.j(aVar, "$this$load");
        aVar.g(C6012a.e(imageView.getContext(), C10027d.f75287r));
        return C16807N.f139792a;
    }

    public static final void g(ImageView imageView, String str) {
        String str2;
        ImageView imageView2 = imageView;
        String str3 = str;
        C17542s.j(imageView2, "<this>");
        e eVar = e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str4 = null;
        String str5 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str2 = DslKt.INDICATOR_BACKGROUND;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str4 == null) {
                String a10 = C11818a.a("imageUrlNoTransition triggered for " + str3, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str4 = C11820c.a(a10);
            }
            String str6 = str4;
            if (str5 == null) {
                String name = imageView.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str2 = DslKt.INDICATOR_MAIN;
                }
                str5 = str2 + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str7 = str5;
            bVar.a(eVar, str7, false, (Throwable) null, str6);
            str4 = str6;
            str5 = str7;
        }
        if (str3 == null || str.length() == 0) {
            e eVar2 = e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str8 = null;
            String str9 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str8 == null) {
                    String a11 = C11818a.a("imageUrl is empty", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str8 = C11820c.a(a11);
                }
                if (str9 == null) {
                    String name2 = imageView.getClass().getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str9, false, (Throwable) null, str8);
            }
            c(imageView2, C10027d.f75287r);
            return;
        }
        d(imageView2, str3, new b(imageView2));
    }

    /* access modifiers changed from: private */
    public static final C16807N h(ImageView imageView, g.a aVar) {
        C17542s.j(aVar, "$this$load");
        aVar.g(C6012a.e(imageView.getContext(), C10027d.f75287r));
        aVar.h(C16877v.e(g.d.b.f77189a));
        aVar.i(g.e.b.f77194a);
        return C16807N.f139792a;
    }
}
