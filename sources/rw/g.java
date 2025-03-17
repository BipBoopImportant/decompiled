package rw;

import HJ.C15854t;
import YH.C16877v;
import android.net.Uri;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/net/Uri$Builder;", "", "key", "value", "a", "(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;", "Landroid/net/Uri;", "prefixMessage", "LXH/N;", "d", "(Landroid/net/Uri;Ljava/lang/String;)V", "b", "(Landroid/net/Uri;)Ljava/lang/String;", "", "c", "(Ljava/lang/String;)Ljava/util/List;", "navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    public static final Uri.Builder a(Uri.Builder builder, String str, String str2) {
        C17542s.j(builder, "<this>");
        C17542s.j(str, "key");
        if (str2 == null) {
            return builder;
        }
        Uri.Builder appendQueryParameter = builder.appendQueryParameter(str, str2);
        C17542s.i(appendQueryParameter, "appendQueryParameter(...)");
        return appendQueryParameter;
    }

    private static final String b(Uri uri) {
        String uri2 = uri.toString();
        C17542s.g(uri2);
        if (C15854t.c0(uri2, '?', false, 2, (Object) null)) {
            return C15854t.k1(uri2, '?', (String) null, 2, (Object) null);
        }
        return null;
    }

    private static final List<String> c(String str) {
        List X02;
        if (str == null || (X02 = C15854t.X0(str, new char[]{'&'}, false, 0, 6, (Object) null)) == null) {
            return C16877v.n();
        }
        Iterable<String> iterable = X02;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (String X03 : iterable) {
            arrayList.add((String) C16877v.y0(C15854t.X0(X03, new char[]{'='}, false, 0, 6, (Object) null)));
        }
        return arrayList;
    }

    public static final void d(Uri uri, String str) {
        String str2;
        List<String> list;
        String str3 = str;
        C17542s.j(uri, "<this>");
        C17542s.j(str3, "prefixMessage");
        String b10 = b(uri);
        List<String> c10 = c(b10);
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
                String a10 = C11818a.a(str3 + ": " + c.a(uri) + ", with queryParameterNames: " + c10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str4 = C11820c.a(a10);
            }
            String str6 = str4;
            if (str5 == null) {
                String name = uri.getClass().getName();
                C17542s.g(name);
                list = c10;
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str2 = DslKt.INDICATOR_MAIN;
                }
                str5 = str2 + DslKt.INDICATOR_SEPARATOR + name;
            } else {
                list = c10;
            }
            String str7 = str5;
            bVar.a(eVar, str7, false, (Throwable) null, str6);
            str5 = str7;
            str4 = str6;
            c10 = list;
            Uri uri2 = uri;
        }
        e eVar2 = e.DEBUG;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, true)) {
                arrayList2.add(next2);
            }
        }
        String str8 = null;
        String str9 = null;
        for (C11819b bVar2 : arrayList2) {
            if (str9 == null) {
                String a11 = C11818a.a(str3 + ", query: " + b10, (Throwable) null);
                if (a11 != null) {
                    str9 = C11820c.a(a11);
                } else {
                    return;
                }
            }
            if (str8 == null) {
                String name2 = uri.getClass().getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name2;
            }
            bVar2.a(eVar2, str8, true, (Throwable) null, str9);
        }
    }
}
