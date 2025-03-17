package hk;

import HJ.C15854t;
import Oo.b;
import XH.t;
import android.content.Context;
import android.content.Intent;
import com.sugarcube.core.logger.DslKt;
import hk.g;
import ip.o;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lhk/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lhk/g$a;", "shareable", "Landroid/content/Intent;", "c", "(Landroid/content/Context;Lhk/g$a;)Landroid/content/Intent;", "Lhk/g$b;", "b", "(Landroid/content/Context;Lhk/g$b;)Landroid/content/Intent;", "Lhk/g;", "a", "(Landroid/content/Context;Lhk/g;)Landroid/content/Intent;", "shareprovider_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hk.a  reason: case insensitive filesystem */
public final class C11366a {

    /* renamed from: a  reason: collision with root package name */
    public static final C11366a f98057a = new C11366a();

    private C11366a() {
    }

    private final Intent b(Context context, g.b bVar) {
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar2 : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Share link: " + bVar.b(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = C11366a.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar2.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        String string = bVar.d() ? context.getString(b.f84773r8, new Object[]{bVar.b()}) : context.getString(b.f84784s8, new Object[]{bVar.c(), bVar.b()});
        C17542s.g(string);
        String string2 = context.getString(b.f84806u8, new Object[]{bVar.c()});
        C17542s.i(string2, "getString(...)");
        return f.k(string2, string);
    }

    private final Intent c(Context context, g.a aVar) {
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Share product: " + aVar.d() + ", link: " + aVar.b(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = C11366a.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        String string = context.getString(b.f84806u8, new Object[]{aVar.d()});
        C17542s.i(string, "getString(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(b.f84817v8, new Object[]{aVar.d()}));
        sb2.append(10);
        sb2.append(10);
        sb2.append(context.getString(b.f84795t8));
        String c10 = aVar.c();
        if (c10 != null) {
            sb2.append(10);
            sb2.append(10);
            sb2.append(o.a(c10));
        }
        sb2.append(10);
        sb2.append(10);
        sb2.append(aVar.b());
        String sb3 = sb2.toString();
        C17542s.i(sb3, "toString(...)");
        return f.k(string, sb3);
    }

    public final Intent a(Context context, g gVar) {
        C17542s.j(context, "context");
        C17542s.j(gVar, "shareable");
        if (gVar instanceof g.a) {
            return c(context, (g.a) gVar);
        }
        if (gVar instanceof g.b) {
            return b(context, (g.b) gVar);
        }
        throw new t();
    }
}
