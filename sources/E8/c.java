package E8;

import XH.C16807N;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0002,*B\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010!J/\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00102\u0006\u0010\n\u001a\u00020\t2\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0010¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b$\u0010%J\u001d\u0010&\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J!\u00104\u001a\u00020\r2\u0012\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t02\"\u00020\t¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\r¢\u0006\u0004\b6\u00107J!\u0010:\u001a\u00020\r2\u0006\u00109\u001a\u0002082\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b:\u0010;R\u001c\u0010>\u001a\n <*\u0004\u0018\u000108088\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010=R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u001c0?8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010@R\u0014\u0010D\u001a\u00020B8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010C¨\u0006E"}, d2 = {"LE8/c;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "Landroid/content/Context;", "applicationContext", "LE8/a;", "oldPrefsMigration", "<init>", "(Landroid/content/Context;LE8/a;)V", "(Landroid/content/Context;)V", "LE8/b;", "key", "", "value", "LXH/N;", "l", "(LE8/b;Ljava/lang/String;)V", "", "m", "(LE8/b;Ljava/util/Set;)V", "", "j", "(LE8/b;I)V", "", "k", "(LE8/b;J)V", "", "i", "(LE8/b;F)V", "", "h", "(LE8/b;Z)V", "defValue", "f", "(LE8/b;Ljava/lang/String;)Ljava/lang/String;", "g", "(LE8/b;Ljava/util/Set;)Ljava/util/Set;", "d", "(LE8/b;I)I", "e", "(LE8/b;J)J", "c", "(LE8/b;F)F", "b", "(LE8/b;Z)Z", "a", "(LE8/b;)Z", "LE8/c$b;", "listener", "n", "(LE8/c$b;)V", "", "keys", "o", "([LE8/b;)V", "p", "()V", "Landroid/content/SharedPreferences;", "sharedPreferences", "onSharedPreferenceChanged", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "sharedPref", "", "Ljava/util/Map;", "listeners", "LD8/c;", "LD8/c;", "logger", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: d  reason: collision with root package name */
    public static final a f35251d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f35252a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<b, Boolean> f35253b;

    /* renamed from: c  reason: collision with root package name */
    private final D8.c f35254c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LE8/c$a;", "", "<init>", "()V", "", "CS_SHARED_PREFS_FILE_NAME", "Ljava/lang/String;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LE8/c$b;", "", "LE8/b;", "key", "LXH/N;", "o", "(LE8/b;)V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        void o(b bVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        this(context, new a());
        C17542s.j(context, "applicationContext");
    }

    public final boolean a(b bVar) {
        C17542s.j(bVar, "key");
        return this.f35252a.contains(bVar.name());
    }

    public final boolean b(b bVar, boolean z10) {
        C17542s.j(bVar, "key");
        return this.f35252a.getBoolean(bVar.name(), z10);
    }

    public final float c(b bVar, float f10) {
        C17542s.j(bVar, "key");
        return this.f35252a.getFloat(bVar.name(), f10);
    }

    public final int d(b bVar, int i10) {
        C17542s.j(bVar, "key");
        return this.f35252a.getInt(bVar.name(), i10);
    }

    public final long e(b bVar, long j10) {
        C17542s.j(bVar, "key");
        return this.f35252a.getLong(bVar.name(), j10);
    }

    public final String f(b bVar, String str) {
        C17542s.j(bVar, "key");
        return this.f35252a.getString(bVar.name(), str);
    }

    public final Set<String> g(b bVar, Set<String> set) {
        C17542s.j(bVar, "key");
        return this.f35252a.getStringSet(bVar.name(), set);
    }

    public final void h(b bVar, boolean z10) {
        C17542s.j(bVar, "key");
        this.f35252a.edit().putBoolean(bVar.name(), z10).apply();
    }

    public final void i(b bVar, float f10) {
        C17542s.j(bVar, "key");
        this.f35252a.edit().putFloat(bVar.name(), f10).apply();
    }

    public final void j(b bVar, int i10) {
        C17542s.j(bVar, "key");
        this.f35252a.edit().putInt(bVar.name(), i10).apply();
    }

    public final void k(b bVar, long j10) {
        C17542s.j(bVar, "key");
        this.f35252a.edit().putLong(bVar.name(), j10).apply();
    }

    public final void l(b bVar, String str) {
        C17542s.j(bVar, "key");
        this.f35252a.edit().putString(bVar.name(), str).apply();
    }

    public final void m(b bVar, Set<String> set) {
        C17542s.j(bVar, "key");
        this.f35252a.edit().putStringSet(bVar.name(), set).apply();
    }

    public final void n(b bVar) {
        C17542s.j(bVar, "listener");
        synchronized (this.f35253b) {
            this.f35253b.put(bVar, Boolean.TRUE);
            C16807N n10 = C16807N.f139792a;
        }
    }

    public final void o(b... bVarArr) {
        C17542s.j(bVarArr, "keys");
        SharedPreferences.Editor edit = this.f35252a.edit();
        for (b name : bVarArr) {
            edit.remove(name.name());
        }
        edit.apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        r3.f35254c.m(r4, "ConcurrentModificationException during PreferenceStore listener call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        r0 = r3.f35254c;
        r0.m(r4, "Key '" + r5 + "' is not a preference store entry");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSharedPreferenceChanged(android.content.SharedPreferences r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "sharedPreferences"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            if (r5 == 0) goto L_0x0054
            E8.b r4 = E8.b.valueOf(r5)     // Catch:{ IllegalArgumentException -> 0x002f, ConcurrentModificationException -> 0x002d }
            java.util.Map<E8.c$b, java.lang.Boolean> r0 = r3.f35253b     // Catch:{ IllegalArgumentException -> 0x002f, ConcurrentModificationException -> 0x002d }
            monitor-enter(r0)     // Catch:{ IllegalArgumentException -> 0x002f, ConcurrentModificationException -> 0x002d }
            java.util.Map<E8.c$b, java.lang.Boolean> r1 = r3.f35253b     // Catch:{ all -> 0x0031 }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x0031 }
            java.util.HashSet r1 = YH.C16877v.r1(r1)     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ IllegalArgumentException -> 0x002f, ConcurrentModificationException -> 0x002d }
            java.util.Iterator r0 = r1.iterator()     // Catch:{ IllegalArgumentException -> 0x002f, ConcurrentModificationException -> 0x002d }
        L_0x001d:
            boolean r1 = r0.hasNext()     // Catch:{ IllegalArgumentException -> 0x002f, ConcurrentModificationException -> 0x002d }
            if (r1 == 0) goto L_0x0054
            java.lang.Object r1 = r0.next()     // Catch:{ IllegalArgumentException -> 0x002f, ConcurrentModificationException -> 0x002d }
            E8.c$b r1 = (E8.c.b) r1     // Catch:{ IllegalArgumentException -> 0x002f, ConcurrentModificationException -> 0x002d }
            r1.o(r4)     // Catch:{ IllegalArgumentException -> 0x002f, ConcurrentModificationException -> 0x002d }
            goto L_0x001d
        L_0x002d:
            r4 = move-exception
            goto L_0x0034
        L_0x002f:
            r4 = move-exception
            goto L_0x003c
        L_0x0031:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ IllegalArgumentException -> 0x002f, ConcurrentModificationException -> 0x002d }
            throw r4     // Catch:{ IllegalArgumentException -> 0x002f, ConcurrentModificationException -> 0x002d }
        L_0x0034:
            D8.c r5 = r3.f35254c
            java.lang.String r0 = "ConcurrentModificationException during PreferenceStore listener call"
            r5.m(r4, r0)
            goto L_0x0054
        L_0x003c:
            D8.c r0 = r3.f35254c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Key '"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = "' is not a preference store entry"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.m(r4, r5)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E8.c.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }

    public final void p() {
        SharedPreferences.Editor edit = this.f35252a.edit();
        b[] values = b.values();
        ArrayList<b> arrayList = new ArrayList<>();
        for (b bVar : values) {
            if (bVar.b()) {
                arrayList.add(bVar);
            }
        }
        for (b name : arrayList) {
            edit.remove(name.name());
        }
        edit.apply();
    }

    public c(Context context, a aVar) {
        C17542s.j(context, "applicationContext");
        C17542s.j(aVar, "oldPrefsMigration");
        SharedPreferences sharedPreferences = context.getSharedPreferences("CONTENTSQUARE_SHARED_PREFS", 0);
        this.f35252a = sharedPreferences;
        this.f35253b = new WeakHashMap();
        this.f35254c = new D8.c("PreferencesStore");
        C17542s.i(sharedPreferences, "sharedPref");
        aVar.f(context, sharedPreferences);
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }
}
