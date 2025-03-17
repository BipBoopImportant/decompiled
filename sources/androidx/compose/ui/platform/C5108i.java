package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/i;", "Landroidx/compose/ui/platform/h;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "originalTimeoutMillis", "", "containsIcons", "containsText", "containsControls", "a", "(JZZZ)J", "Landroid/view/accessibility/AccessibilityManager;", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.i  reason: case insensitive filesystem */
public final class C5108i implements C5105h {

    /* renamed from: b  reason: collision with root package name */
    private static final a f19506b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f19507c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityManager f19508a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/i$a;", "", "<init>", "()V", "", "FlagContentControls", "I", "FlagContentIcons", "FlagContentText", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.i$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C5108i(Context context) {
        Object systemService = context.getSystemService("accessibility");
        C17542s.h(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f19508a = (AccessibilityManager) systemService;
    }

    public long a(long j10, boolean z10, boolean z11, boolean z12) {
        if (j10 >= 2147483647L) {
            return j10;
        }
        if (z11) {
            z10 |= true;
        }
        if (z12) {
            z10 |= true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int a10 = X.f19361a.a(this.f19508a, (int) j10, z10 ? 1 : 0);
            if (a10 != Integer.MAX_VALUE) {
                return (long) a10;
            }
        } else if (!z12 || !this.f19508a.isTouchExplorationEnabled()) {
            return j10;
        }
        return Long.MAX_VALUE;
    }
}
