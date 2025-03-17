package androidx.compose.material.ripple;

import N0.j;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/ripple/a;", "", "<init>", "()V", "LN0/j;", "indicationInstance", "Landroidx/compose/material/ripple/RippleHostView;", "rippleHostView", "LXH/N;", "d", "(LN0/j;Landroidx/compose/material/ripple/RippleHostView;)V", "b", "(LN0/j;)Landroidx/compose/material/ripple/RippleHostView;", "a", "(Landroidx/compose/material/ripple/RippleHostView;)LN0/j;", "c", "(LN0/j;)V", "", "Ljava/util/Map;", "indicationToHostMap", "hostToIndicationMap", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<j, RippleHostView> f18634a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<RippleHostView, j> f18635b = new LinkedHashMap();

    public final j a(RippleHostView rippleHostView) {
        return this.f18635b.get(rippleHostView);
    }

    public final RippleHostView b(j jVar) {
        return this.f18634a.get(jVar);
    }

    public final void c(j jVar) {
        RippleHostView rippleHostView = this.f18634a.get(jVar);
        if (rippleHostView != null) {
            j remove = this.f18635b.remove(rippleHostView);
        }
        this.f18634a.remove(jVar);
    }

    public final void d(j jVar, RippleHostView rippleHostView) {
        this.f18634a.put(jVar, rippleHostView);
        this.f18635b.put(rippleHostView, jVar);
    }
}
