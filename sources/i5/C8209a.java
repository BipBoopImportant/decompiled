package i5;

import YH.C16877v;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d5.C7744b;
import d5.g;
import d5.h;
import d5.j;
import f5.C7845a;
import f5.C7847c;
import f5.C7848d;
import f5.k;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u001bB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000b\u001a\u00020\n2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00152\b\u0010\t\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\"¨\u0006#"}, d2 = {"Li5/a;", "", "Ld5/j;", "verificationMode", "<init>", "(Ld5/j;)V", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "first", "second", "", "c", "(Ljava/util/List;Ljava/util/List;)Z", "b", "(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDisplayFeature;)Z", "sidecarDisplayFeatures", "Landroidx/window/sidecar/SidecarDeviceState;", "deviceState", "Lf5/a;", "f", "(Ljava/util/List;Landroidx/window/sidecar/SidecarDeviceState;)Ljava/util/List;", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "extensionInfo", "state", "Lf5/k;", "e", "(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarDeviceState;)Lf5/k;", "a", "(Landroidx/window/sidecar/SidecarDeviceState;Landroidx/window/sidecar/SidecarDeviceState;)Z", "d", "(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Z", "feature", "g", "(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDeviceState;)Lf5/a;", "Ld5/j;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i5.a  reason: case insensitive filesystem */
public final class C8209a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0856a f53140b = new C0856a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final String f53141c = C8209a.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final j f53142a;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Li5/a$a;", "", "<init>", "()V", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "info", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "c", "(Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Ljava/util/List;", "Landroidx/window/sidecar/SidecarDeviceState;", "sidecarDeviceState", "", "b", "(Landroidx/window/sidecar/SidecarDeviceState;)I", "a", "posture", "LXH/N;", "d", "(Landroidx/window/sidecar/SidecarDeviceState;I)V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i5.a$a  reason: collision with other inner class name */
    public static final class C0856a {
        public /* synthetic */ C0856a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final int a(SidecarDeviceState sidecarDeviceState) {
            C17542s.j(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object invoke = SidecarDeviceState.class.getMethod("getPosture", (Class[]) null).invoke(sidecarDeviceState, (Object[]) null);
                    C17542s.h(invoke, "null cannot be cast to non-null type kotlin.Int");
                    return ((Integer) invoke).intValue();
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public final int b(SidecarDeviceState sidecarDeviceState) {
            C17542s.j(sidecarDeviceState, "sidecarDeviceState");
            int a10 = a(sidecarDeviceState);
            if (a10 < 0 || a10 > 4) {
                return 0;
            }
            return a10;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final List<SidecarDisplayFeature> c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            C17542s.j(sidecarWindowLayoutInfo, "info");
            try {
                List<SidecarDisplayFeature> list = sidecarWindowLayoutInfo.displayFeatures;
                return list == null ? C16877v.n() : list;
            } catch (NoSuchFieldError unused) {
                try {
                    Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", (Class[]) null).invoke(sidecarWindowLayoutInfo, (Object[]) null);
                    C17542s.h(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                    return (List) invoke;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return C16877v.n();
                }
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void d(SidecarDeviceState sidecarDeviceState, int i10) {
            C17542s.j(sidecarDeviceState, "sidecarDeviceState");
            try {
                sidecarDeviceState.posture = i10;
            } catch (NoSuchFieldError unused) {
                try {
                    SidecarDeviceState.class.getMethod("setPosture", new Class[]{Integer.TYPE}).invoke(sidecarDeviceState, new Object[]{Integer.valueOf(i10)});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                }
            }
        }

        private C0856a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/window/sidecar/SidecarDisplayFeature;", "", "a", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i5.a$b */
    static final class b extends C17544u implements C17642l<SidecarDisplayFeature, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f53143c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            C17542s.j(sidecarDisplayFeature, "$this$require");
            boolean z10 = true;
            if (!(sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2)) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/window/sidecar/SidecarDisplayFeature;", "", "a", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i5.a$c */
    static final class c extends C17544u implements C17642l<SidecarDisplayFeature, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f53144c = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            C17542s.j(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/window/sidecar/SidecarDisplayFeature;", "", "a", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i5.a$d */
    static final class d extends C17544u implements C17642l<SidecarDisplayFeature, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f53145c = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            C17542s.j(sidecarDisplayFeature, "$this$require");
            boolean z10 = true;
            if (!(sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0)) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/window/sidecar/SidecarDisplayFeature;", "", "a", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i5.a$e */
    static final class e extends C17544u implements C17642l<SidecarDisplayFeature, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f53146c = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            C17542s.j(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
        }
    }

    public C8209a() {
        this((j) null, 1, (DefaultConstructorMarker) null);
    }

    private final boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (C17542s.e(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return C17542s.e(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    private final boolean c(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!b(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (C17542s.e(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        C0856a aVar = f53140b;
        return aVar.b(sidecarDeviceState) == aVar.b(sidecarDeviceState2);
    }

    public final boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (C17542s.e(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        C0856a aVar = f53140b;
        return c(aVar.c(sidecarWindowLayoutInfo), aVar.c(sidecarWindowLayoutInfo2));
    }

    public final k e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        C17542s.j(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new k(C16877v.n());
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        C0856a aVar = f53140b;
        aVar.d(sidecarDeviceState2, aVar.b(sidecarDeviceState));
        return new k(f(aVar.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final List<C7845a> f(List<SidecarDisplayFeature> list, SidecarDeviceState sidecarDeviceState) {
        C17542s.j(list, "sidecarDisplayFeatures");
        C17542s.j(sidecarDeviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        for (SidecarDisplayFeature g10 : list) {
            C7845a g11 = g(g10, sidecarDeviceState);
            if (g11 != null) {
                arrayList.add(g11);
            }
        }
        return arrayList;
    }

    public final C7845a g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        C7848d.b bVar;
        C7847c.C0840c cVar;
        C17542s.j(sidecarDisplayFeature, "feature");
        C17542s.j(sidecarDeviceState, "deviceState");
        h.a aVar = h.f50745a;
        String str = f53141c;
        C17542s.i(str, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) h.a.b(aVar, sidecarDisplayFeature, str, this.f53142a, (g) null, 4, (Object) null).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.f53143c).c("Feature bounds must not be 0", c.f53144c).c("TYPE_FOLD must have 0 area", d.f53145c).c("Feature be pinned to either left or top", e.f53146c).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            bVar = C7848d.b.f51129b.a();
        } else if (type != 2) {
            return null;
        } else {
            bVar = C7848d.b.f51129b.b();
        }
        int b10 = f53140b.b(sidecarDeviceState);
        if (b10 == 0 || b10 == 1) {
            return null;
        }
        if (b10 == 2) {
            cVar = C7847c.C0840c.f51123d;
        } else if (b10 == 3) {
            cVar = C7847c.C0840c.f51122c;
        } else if (b10 == 4) {
            return null;
        } else {
            cVar = C7847c.C0840c.f51122c;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        C17542s.i(rect, "feature.rect");
        return new C7848d(new C7744b(rect), bVar, cVar);
    }

    public C8209a(j jVar) {
        C17542s.j(jVar, "verificationMode");
        this.f53142a = jVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8209a(j jVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? j.QUIET : jVar);
    }
}
