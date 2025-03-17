package cG;

import android.widget.PopupWindow;
import com.sugarcube.decorate.v1.internal.v1.tooltip.DecorateToolbarTooltipObject;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0003R\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"LcG/c;", "", "<init>", "()V", "", "anchorViewId", "Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject;", "tooltip", "LXH/N;", "d", "(ILcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject;)V", "e", "(I)Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject;", "c", "a", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "tooltipsMap", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cG.c  reason: case insensitive filesystem */
public final class C17060c {

    /* renamed from: a  reason: collision with root package name */
    public static final C17060c f141229a = new C17060c();

    /* renamed from: b  reason: collision with root package name */
    private static ConcurrentHashMap<Integer, DecorateToolbarTooltipObject> f141230b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static final int f141231c = 8;

    private C17060c() {
    }

    public final void a() {
        Collection<DecorateToolbarTooltipObject> values = f141230b.values();
        C17542s.i(values, "<get-values>(...)");
        for (DecorateToolbarTooltipObject f10 : values) {
            f10.f();
        }
    }

    public final void b() {
        Collection<DecorateToolbarTooltipObject> values = f141230b.values();
        C17542s.i(values, "<get-values>(...)");
        for (DecorateToolbarTooltipObject decorateToolbarTooltipObject : values) {
            PopupWindow g10 = decorateToolbarTooltipObject.g();
            if (g10 != null && g10.isShowing()) {
                decorateToolbarTooltipObject.f();
            }
        }
    }

    public final DecorateToolbarTooltipObject c(int i10) {
        return f141230b.get(Integer.valueOf(i10));
    }

    public final void d(int i10, DecorateToolbarTooltipObject decorateToolbarTooltipObject) {
        C17542s.j(decorateToolbarTooltipObject, "tooltip");
        f141230b.put(Integer.valueOf(i10), decorateToolbarTooltipObject);
    }

    public final DecorateToolbarTooltipObject e(int i10) {
        return f141230b.remove(Integer.valueOf(i10));
    }
}
