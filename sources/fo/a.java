package Fo;

import HJ.C15854t;
import Oo.b;
import YC.C13858c;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Patterns;
import android.widget.Toast;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.d;
import androidx.browser.customtabs.e;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J!\u0010\u001a\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\nJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#¨\u0006%"}, d2 = {"LFo/a;", "LEo/a;", "<init>", "()V", "Landroid/content/Context;", "context", "", "uriString", "LXH/N;", "h", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/net/Uri;", "uri", "", "i", "(Landroid/content/Context;Landroid/net/Uri;)Z", "f", "(Landroid/content/Context;)Ljava/lang/String;", "Landroid/content/Intent;", "intent", "g", "(Landroid/content/Context;Landroid/content/Intent;)Z", "d", "(Landroid/content/Context;)V", "c", "url", "a", "b", "(Landroid/content/Context;)Z", "Ljava/lang/String;", "packageNameToUseCache", "Landroidx/browser/customtabs/c;", "Landroidx/browser/customtabs/c;", "customTabsClient", "Landroidx/browser/customtabs/e;", "Landroidx/browser/customtabs/e;", "connection", "chrometabs-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Eo.a {

    /* renamed from: a  reason: collision with root package name */
    private String f80996a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public c f80997b;

    /* renamed from: c  reason: collision with root package name */
    private e f80998c;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Fo/a$a", "Landroidx/browser/customtabs/e;", "Landroid/content/ComponentName;", "name", "Landroidx/browser/customtabs/c;", "client", "LXH/N;", "a", "(Landroid/content/ComponentName;Landroidx/browser/customtabs/c;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "chrometabs-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fo.a$a  reason: collision with other inner class name */
    public static final class C1566a extends e {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f80999b;

        C1566a(a aVar) {
            this.f80999b = aVar;
        }

        public void a(ComponentName componentName, c cVar) {
            C17542s.j(componentName, "name");
            C17542s.j(cVar, "client");
            qv.e eVar = qv.e.DEBUG;
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
                    String a10 = C11818a.a("onCustomTabsServiceConnected", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = C1566a.class.getName();
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
            cVar.h(0);
            this.f80999b.f80997b = cVar;
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C17542s.j(componentName, "name");
            qv.e eVar = qv.e.DEBUG;
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
                    String a10 = C11818a.a("onServiceDisconnected", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = C1566a.class.getName();
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
            this.f80999b.f80997b = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bd, code lost:
        if (r6.contains(r11) != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r3 = r3.activityInfo;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String f(android.content.Context r11) {
        /*
            r10 = this;
            java.lang.String r0 = r10.f80996a
            if (r0 == 0) goto L_0x000e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x000b
            goto L_0x000e
        L_0x000b:
            java.lang.String r11 = r10.f80996a
            return r11
        L_0x000e:
            android.content.pm.PackageManager r0 = r11.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "http://www.example.com"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r3 = "android.intent.action.VIEW"
            r1.<init>(r3, r2)
            r2 = 0
            android.content.pm.ResolveInfo r3 = r0.resolveActivity(r1, r2)
            r4 = 0
            if (r3 == 0) goto L_0x002e
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            if (r3 == 0) goto L_0x002e
            java.lang.String r3 = r3.packageName
            goto L_0x002f
        L_0x002e:
            r3 = r4
        L_0x002f:
            java.util.List r5 = r0.queryIntentActivities(r1, r2)
            java.lang.String r6 = "queryIntentActivities(...)"
            kotlin.jvm.internal.C17542s.i(r5, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0041:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x006c
            java.lang.Object r7 = r5.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r9 = "androidx.customtabs.action.CustomTabsService"
            r8.setAction(r9)
            android.content.pm.ActivityInfo r9 = r7.activityInfo
            java.lang.String r9 = r9.packageName
            r8.setPackage(r9)
            android.content.pm.ResolveInfo r8 = r0.resolveService(r8, r2)
            if (r8 == 0) goto L_0x0041
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            java.lang.String r7 = r7.packageName
            r6.add(r7)
            goto L_0x0041
        L_0x006c:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0075
            java.lang.String r4 = ""
            goto L_0x00c0
        L_0x0075:
            int r0 = r6.size()
            r5 = 1
            if (r0 != r5) goto L_0x0084
            java.lang.Object r11 = r6.get(r2)
            r4 = r11
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x00c0
        L_0x0084:
            if (r3 == 0) goto L_0x009b
            int r0 = r3.length()
            if (r0 != 0) goto L_0x008d
            goto L_0x009b
        L_0x008d:
            boolean r11 = r10.g(r11, r1)
            if (r11 != 0) goto L_0x009b
            boolean r11 = r6.contains(r3)
            if (r11 == 0) goto L_0x009b
            r4 = r3
            goto L_0x00c0
        L_0x009b:
            java.lang.String r11 = "com.android.chrome"
            boolean r0 = r6.contains(r11)
            if (r0 == 0) goto L_0x00a5
        L_0x00a3:
            r4 = r11
            goto L_0x00c0
        L_0x00a5:
            java.lang.String r11 = "com.chrome.beta"
            boolean r0 = r6.contains(r11)
            if (r0 == 0) goto L_0x00ae
            goto L_0x00a3
        L_0x00ae:
            java.lang.String r11 = "com.chrome.dev"
            boolean r0 = r6.contains(r11)
            if (r0 == 0) goto L_0x00b7
            goto L_0x00a3
        L_0x00b7:
            java.lang.String r11 = "com.google.android.apps.chrome"
            boolean r0 = r6.contains(r11)
            if (r0 == 0) goto L_0x00c0
            goto L_0x00a3
        L_0x00c0:
            r10.f80996a = r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Fo.a.f(android.content.Context):java.lang.String");
    }

    private final boolean g(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            C17542s.i(queryIntentActivities, "queryIntentActivities(...)");
            Iterable<ResolveInfo> iterable = queryIntentActivities;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (ResolveInfo resolveInfo : iterable) {
                    IntentFilter intentFilter = resolveInfo.filter;
                    if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException e10) {
            qv.e eVar = qv.e.ERROR;
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
                    String a10 = C11818a.a("Runtime exception while getting specialized handlers", e10);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = a.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, e10, str3);
                str = str3;
                str2 = str4;
            }
            return false;
        }
    }

    private final void h(Context context, String str) {
        Uri parse = Uri.parse(str);
        C17542s.i(parse, "parse(...)");
        if (!i(context, parse)) {
            Toast.makeText(context, context.getString(b.f84440M2), 1).show();
        }
    }

    private final boolean i(Context context, Uri uri) {
        try {
            Intent addFlags = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE").addFlags(268435456);
            C17542s.i(addFlags, "addFlags(...)");
            context.startActivity(addFlags);
            return true;
        } catch (ActivityNotFoundException e10) {
            qv.e eVar = qv.e.DEBUG;
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
                    String a10 = C11818a.a("Could not open url, no browser found.", e10);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = a.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, e10, str3);
                str = str3;
                str2 = str4;
            }
            return false;
        }
    }

    public void a(Context context, String str) {
        Uri uri;
        char c10;
        String str2;
        Context context2 = context;
        String str3 = str;
        C17542s.j(str3, "url");
        String str4 = DslKt.INDICATOR_BACKGROUND;
        char c11 = '$';
        Class<a> cls = a.class;
        if (context2 == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to open url, no context");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar : arrayList) {
                if (str5 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 != null) {
                        str5 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str6 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, c11, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str4) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str7 = str6;
                bVar.a(eVar, str7, false, illegalArgumentException, str5);
                str6 = str7;
                c11 = '$';
            }
        } else if (!Patterns.WEB_URL.matcher(str3).matches()) {
            qv.e eVar2 = qv.e.DEBUG;
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
                    String a11 = C11818a.a("Invalid url: " + str3, (Throwable) null);
                    if (a11 != null) {
                        str8 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                if (str9 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str4) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str9, false, (Throwable) null, str8);
            }
        } else if (b(context)) {
            qv.e eVar3 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str10 = null;
            String str11 = null;
            for (C11819b bVar3 : arrayList3) {
                if (str10 == null) {
                    String a12 = C11818a.a("Chrome custom tab url: " + str3, (Throwable) null);
                    if (a12 == null) {
                        break;
                    }
                    str10 = C11820c.a(a12);
                }
                if (str11 == null) {
                    String name3 = cls.getName();
                    C17542s.g(name3);
                    str2 = str4;
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name3;
                } else {
                    str2 = str4;
                }
                bVar3.a(eVar3, str11, false, (Throwable) null, str10);
                str4 = str2;
            }
            String str12 = str4;
            d.C0230d dVar = new d.C0230d();
            dVar.j(true);
            dVar.i(2);
            if (C13858c.b(context)) {
                dVar.b(2);
            } else {
                dVar.b(1);
            }
            androidx.browser.customtabs.d a13 = dVar.a();
            C17542s.i(a13, "build(...)");
            a13.f16598a.setPackage("com.android.chrome");
            try {
                a13.a(context2, Uri.parse(str));
            } catch (ActivityNotFoundException e10) {
                Uri parse = Uri.parse(str);
                qv.e eVar4 = qv.e.WARN;
                ArrayList<C11819b> arrayList4 = new ArrayList<>();
                for (Object next4 : qv.d.f102012a.a()) {
                    if (((C11819b) next4).b(eVar4, false)) {
                        arrayList4.add(next4);
                    }
                }
                String str13 = null;
                String str14 = null;
                for (C11819b bVar4 : arrayList4) {
                    if (str13 == null) {
                        String a14 = C11818a.a("Unable to open in Chrome, uri: " + parse + ", url: " + str3, e10);
                        if (a14 == null) {
                            break;
                        }
                        str13 = C11820c.a(a14);
                    }
                    if (str14 == null) {
                        String name4 = cls.getName();
                        C17542s.g(name4);
                        c10 = '$';
                        uri = parse;
                        String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o15.length() != 0) {
                            name4 = C15854t.P0(o15, "Kt");
                        }
                        str14 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str12) + DslKt.INDICATOR_SEPARATOR + name4;
                    } else {
                        uri = parse;
                        c10 = '$';
                    }
                    char c12 = c10;
                    bVar4.a(eVar4, str14, false, e10, str13);
                    Context context3 = context;
                    parse = uri;
                    str3 = str;
                }
                h(context, str);
            }
        } else {
            h(context, str);
        }
    }

    public boolean b(Context context) {
        C17542s.j(context, "context");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.android.chrome", 0);
            C17542s.i(applicationInfo, "getApplicationInfo(...)");
            return applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException e10) {
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Chrome is not installed", e10);
                    if (a10 == null) {
                        return false;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = a.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, e10, str3);
                str = str3;
                str2 = str4;
            }
            return false;
        }
    }

    public void c(Context context) {
        C17542s.j(context, "context");
        e eVar = this.f80998c;
        if (eVar != null) {
            context.unbindService(eVar);
            this.f80998c = null;
            this.f80997b = null;
        }
    }

    public void d(Context context) {
        C17542s.j(context, "context");
        String f10 = f(context);
        if (f10 == null || f10.length() == 0) {
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("No package found to handle custom tabs", (Throwable) null);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = a.class.getName();
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
            return;
        }
        C1566a aVar = new C1566a(this);
        this.f80998c = aVar;
        if (!c.a(context, f(context), aVar)) {
            this.f80998c = null;
        }
    }
}
