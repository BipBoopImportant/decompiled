package Uh;

import HJ.C15854t;
import YH.C16877v;
import Zl.a;
import Zl.b;
import android.content.UriMatcher;
import android.net.Uri;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0017"}, d2 = {"LUh/a;", "LZl/a;", "LZw/a;", "pipNavigation", "<init>", "(LZw/a;)V", "Landroid/net/Uri;", "", "c", "(Landroid/net/Uri;)Ljava/lang/String;", "path", "d", "(Ljava/lang/String;)Ljava/lang/String;", "uri", "b", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "a", "(Landroid/net/Uri;)Z", "LZw/a;", "Landroid/content/UriMatcher;", "Landroid/content/UriMatcher;", "uriMatcher", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Zl.a {

    /* renamed from: d  reason: collision with root package name */
    public static final C1121a f64489d = new C1121a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f64490e = 8;

    /* renamed from: b  reason: collision with root package name */
    private final Zw.a f64491b;

    /* renamed from: c  reason: collision with root package name */
    private final UriMatcher f64492c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"LUh/a$a;", "", "<init>", "()V", "", "PRODUCT_PATH_DELIMITER", "C", "ART_PREFIX", "SPR_PREFIX", "", "PRODUCT_NO_LENGTH", "I", "LEGACY_MATCH", "NEW_FORMAT_MATCH", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Uh.a$a  reason: collision with other inner class name */
    public static final class C1121a {
        public /* synthetic */ C1121a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1121a() {
        }
    }

    public a(Zw.a aVar) {
        C17542s.j(aVar, "pipNavigation");
        this.f64491b = aVar;
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("pip", "/*", 1);
        uriMatcher.addURI("www.ikea.com", "/ikeaapp/pip", 1);
        uriMatcher.addURI("www.ikea.com", "/*/*/p/*/", 1);
        this.f64492c = uriMatcher;
    }

    private final String c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            return d(lastPathSegment);
        }
        return null;
    }

    private final String d(String str) {
        String str2;
        String str3;
        boolean z10 = false;
        String str4 = (String) C16877v.I0(C15854t.X0(str, new char[]{'-'}, false, 0, 6, (Object) null));
        StringBuilder sb2 = new StringBuilder();
        int length = str4.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str4.charAt(i10);
            if (Character.isDigit(charAt) || Character.valueOf(charAt).equals('a') || Character.valueOf(charAt).equals('s')) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        if (sb3 == null) {
            return null;
        }
        try {
            if (sb3.length() == 0) {
                return null;
            }
            if (sb3.length() < 8) {
                return null;
            }
            if (sb3.charAt(0) == 'a' || sb3.charAt(0) == 's') {
                z10 = true;
            }
            if (z10) {
                str3 = sb3.substring(1);
                C17542s.i(str3, "substring(...)");
            } else {
                str3 = sb3;
            }
            String.valueOf(Integer.parseInt(str3));
            if (z10) {
                sb3 = sb3.substring(1);
                C17542s.i(sb3, "substring(...)");
            }
            return sb3;
        } catch (NumberFormatException e10) {
            String str5 = "Could not parse a productNo from " + str;
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str6 = null;
            String str7 = null;
            for (C11819b bVar : arrayList) {
                if (str6 == null) {
                    String a10 = C11818a.a((String) null, e10);
                    if (a10 == null) {
                        return null;
                    }
                    str6 = C11820c.a(a10);
                }
                String str8 = str6;
                if (str7 == null) {
                    if (str5 == null) {
                        str2 = a.class.getName();
                        C17542s.g(str2);
                        String o12 = C15854t.o1(C15854t.s1(str2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            str2 = C15854t.P0(o12, "Kt");
                        }
                    } else {
                        str2 = str5;
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + str2;
                }
                String str9 = str7;
                bVar.a(eVar, str9, false, e10, str8);
                str6 = str8;
                str7 = str9;
            }
            return null;
        }
    }

    public boolean a(Uri uri) {
        C17542s.j(uri, "uri");
        return b.a(this.f64492c, uri);
    }

    public Object b(Uri uri, C17164e<? super Uri> eVar) {
        String c10 = c(uri);
        if (c10 == null) {
            c10 = uri.getQueryParameter("itemNo");
        }
        T t10 = null;
        if (c10 == null) {
            return a.C1929a.b(Zl.a.f89961a, (Integer) null, uri.toString(), 1, (Object) null);
        }
        String queryParameter = uri.getQueryParameter("sourceComponent");
        Iterator<T> it = Interaction$Component.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C17542s.e(((Interaction$Component) next).getValue(), queryParameter)) {
                t10 = next;
                break;
            }
        }
        Interaction$Component interaction$Component = (Interaction$Component) t10;
        if (interaction$Component == null) {
            interaction$Component = Interaction$Component.WEB_LINK;
        }
        return this.f64491b.b(c10, interaction$Component);
    }
}
