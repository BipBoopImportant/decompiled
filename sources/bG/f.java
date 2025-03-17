package Bg;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\n\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR$\u0010 \u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00128V@VX\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u001b\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LBg/f;", "LBg/e;", "Landroid/content/SharedPreferences;", "preferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "key", "LXH/N;", "h", "(Ljava/lang/String;)V", "b", "()V", "g", "LBg/d;", "event", "c", "(LBg/d;)V", "", "d", "(LBg/d;)I", "a", "Landroid/content/SharedPreferences;", "", "Ljava/util/Map;", "counter", "e", "()I", "appStartCount", "value", "f", "(I)V", "dialogCount", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {

    /* renamed from: c  reason: collision with root package name */
    public static final a f58917c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f58918d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f58919a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<d, Integer> f58920b = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LBg/f$a;", "", "<init>", "()V", "", "APP_START_COUNT", "Ljava/lang/String;", "DIALOG_TRIGGER_COUNT", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public f(SharedPreferences sharedPreferences) {
        C17542s.j(sharedPreferences, "preferences");
        this.f58919a = sharedPreferences;
    }

    private final void h(String str) {
        SharedPreferences.Editor edit = this.f58919a.edit();
        edit.putInt(str, this.f58919a.getInt(str, 0) + 1);
        edit.apply();
    }

    public int a() {
        return this.f58919a.getInt("dialog_trigger_count", 0);
    }

    public void b() {
        h("app_start_count");
    }

    public void c(d dVar) {
        C17542s.j(dVar, "event");
        Map<d, Integer> map = this.f58920b;
        Integer num = map.get(dVar);
        map.put(dVar, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
    }

    public int d(d dVar) {
        C17542s.j(dVar, "event");
        Integer num = this.f58920b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int e() {
        return this.f58919a.getInt("app_start_count", 0);
    }

    public void f(int i10) {
        SharedPreferences.Editor edit = this.f58919a.edit();
        edit.putInt("dialog_trigger_count", i10);
        edit.apply();
    }

    public void g() {
        h("dialog_trigger_count");
    }
}
