package h;

import android.content.Context;
import android.content.Intent;
import g.C5312a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lh/d;", "Lh/a;", "Landroid/content/Intent;", "Lg/a;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "a", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;", "", "resultCode", "intent", "b", "(ILandroid/content/Intent;)Lg/a;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: h.d  reason: case insensitive filesystem */
public final class C5406d extends C5403a<Intent, C5312a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23768a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh/d$a;", "", "<init>", "()V", "", "EXTRA_ACTIVITY_OPTIONS_BUNDLE", "Ljava/lang/String;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: h.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: a */
    public Intent createIntent(Context context, Intent intent) {
        C17542s.j(context, "context");
        C17542s.j(intent, "input");
        return intent;
    }

    /* renamed from: b */
    public C5312a parseResult(int i10, Intent intent) {
        return new C5312a(i10, intent);
    }
}
