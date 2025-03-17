package Zj;

import HJ.C15854t;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import YH.X;
import android.content.Context;
import android.content.SharedPreferences;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001c2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b%\u0010&R\u001c\u0010)\u001a\n '*\u0004\u0018\u00010\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u001b\u0010-\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"LZj/g;", "LZj/h;", "Landroid/content/Context;", "context", "", "fileName", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "name", "value", "LXH/N;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "", "e", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "", "b", "(Ljava/lang/String;Ljava/lang/Long;)V", "g", "(Ljava/lang/String;)Ljava/lang/String;", "defaultValue", "h", "(Ljava/lang/String;Z)Z", "d", "(Ljava/lang/String;J)J", "remove", "(Ljava/lang/String;)V", "", "map", "c", "(Ljava/lang/String;Ljava/util/Map;)V", "f", "(Ljava/lang/String;)Ljava/util/Map;", "clear", "()V", "Landroid/content/SharedPreferences;", "j", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "applicationContext", "LXH/o;", "k", "()Landroid/content/SharedPreferences;", "sharedPreferences", "securestorage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class g implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f89921a;

    /* renamed from: b  reason: collision with root package name */
    private final C16824o f89922b;

    public g(Context context, String str) {
        C17542s.j(context, "context");
        C17542s.j(str, "fileName");
        this.f89921a = context.getApplicationContext();
        this.f89922b = C16825p.b(new f(this, str));
    }

    private final SharedPreferences k() {
        return (SharedPreferences) this.f89922b.getValue();
    }

    /* access modifiers changed from: private */
    public static final SharedPreferences l(g gVar, String str) {
        Context context = gVar.f89921a;
        C17542s.i(context, "applicationContext");
        return gVar.j(context, "com.ingka.ikea.app.securestorage." + str);
    }

    public void a(String str, String str2) {
        C17542s.j(str, "name");
        if (str2 == null) {
            k().edit().remove(str).apply();
        } else {
            k().edit().putString(str, str2).apply();
        }
    }

    public void b(String str, Long l10) {
        C17542s.j(str, "name");
        if (l10 == null) {
            k().edit().remove(str).apply();
        } else {
            k().edit().putLong(str, l10.longValue()).apply();
        }
    }

    public void c(String str, Map<String, String> map) {
        C17542s.j(str, "name");
        C17542s.j(map, "map");
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            sb2.append(key + ":" + value + ",");
        }
        a(str, sb2.toString());
    }

    public void clear() {
        k().edit().clear().apply();
    }

    public long d(String str, long j10) {
        C17542s.j(str, "name");
        if (!k().contains(str)) {
            return j10;
        }
        try {
            return k().getLong(str, j10);
        } catch (ClassCastException unused) {
            e eVar = e.DEBUG;
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
                    String a10 = C11818a.a("Failed to retrieve long for key: " + str, (Throwable) null);
                    if (a10 == null) {
                        return j10;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, (Throwable) null, str4);
                str2 = str4;
                str3 = str5;
            }
            return j10;
        }
    }

    public void e(String str, Boolean bool) {
        C17542s.j(str, "name");
        if (bool == null) {
            k().edit().remove(str).apply();
        } else {
            k().edit().putBoolean(str, bool.booleanValue()).apply();
        }
    }

    public Map<String, String> f(String str) {
        String Q10;
        C17542s.j(str, "name");
        String g10 = g(str);
        if (g10 == null || (Q10 = C15854t.Q(g10, "\n", "", false, 4, (Object) null)) == null) {
            return X.j();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!C15854t.v0(Q10)) {
            for (String str2 : C15854t.d0(Q10, ",", false, 2, (Object) null) ? C15854t.Y0(Q10, new String[]{","}, false, 0, 6, (Object) null) : C16877v.e(Q10)) {
                if (C15854t.d0(str2, ":", false, 2, (Object) null)) {
                    List Y02 = C15854t.Y0(str2, new String[]{":"}, false, 0, 6, (Object) null);
                    linkedHashMap.put(Y02.get(0), Y02.get(1));
                }
            }
        }
        return linkedHashMap;
    }

    public String g(String str) {
        C17542s.j(str, "name");
        if (!k().contains(str)) {
            return null;
        }
        try {
            return k().getString(str, (String) null);
        } catch (ClassCastException unused) {
            e eVar = e.DEBUG;
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
                    String a10 = C11818a.a("Failed to retrieve string for key: " + str, (Throwable) null);
                    if (a10 == null) {
                        return null;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, (Throwable) null, str4);
                str2 = str4;
                str3 = str5;
            }
            return null;
        }
    }

    public boolean h(String str, boolean z10) {
        C17542s.j(str, "name");
        if (!k().contains(str)) {
            return z10;
        }
        try {
            return k().getBoolean(str, z10);
        } catch (ClassCastException unused) {
            IllegalStateException illegalStateException = new IllegalStateException("Failed to retrieve boolean for name: " + str);
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
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        return z10;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalStateException, str4);
                str2 = str4;
                str3 = str5;
            }
            return z10;
        }
    }

    public SharedPreferences j(Context context, String str) {
        C17542s.j(context, "context");
        C17542s.j(str, "fileName");
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        C17542s.i(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public void remove(String str) {
        C17542s.j(str, "name");
        k().edit().remove(str).apply();
    }
}
