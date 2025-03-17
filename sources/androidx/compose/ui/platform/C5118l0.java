package androidx.compose.ui.platform;

import P4.d;
import P4.f;
import U0.p1;
import XH.C16807N;
import XH.C16818i;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import f1.C5306h;
import f1.C5308j;
import g1.C5352u;
import i1.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0013\u0018\u00010\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u0011*\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00190\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroid/view/View;", "view", "LP4/f;", "owner", "Landroidx/compose/ui/platform/j0;", "b", "(Landroid/view/View;LP4/f;)Landroidx/compose/ui/platform/j0;", "", "id", "savedStateRegistryOwner", "c", "(Ljava/lang/String;LP4/f;)Landroidx/compose/ui/platform/j0;", "", "value", "", "f", "(Ljava/lang/Object;)Z", "Landroid/os/Bundle;", "", "", "h", "(Landroid/os/Bundle;)Ljava/util/Map;", "g", "(Ljava/util/Map;)Landroid/os/Bundle;", "", "Ljava/lang/Class;", "a", "[Ljava/lang/Class;", "AcceptableClasses", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.l0  reason: case insensitive filesystem */
public final class C5118l0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<? extends Object>[] f19513a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.l0$a */
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f19514c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f19515d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f19516e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z10, d dVar, String str) {
            super(0);
            this.f19514c = z10;
            this.f19515d = dVar;
            this.f19516e = str;
        }

        public final void invoke() {
            if (this.f19514c) {
                this.f19515d.j(this.f19516e);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.l0$b */
    static final class b extends C17544u implements C17642l<Object, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f19517c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(C5118l0.f(obj));
        }
    }

    public static final C5112j0 b(View view, f fVar) {
        ViewParent parent = view.getParent();
        C17542s.h(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(i.f24336H);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return c(str, fVar);
    }

    public static final C5112j0 c(String str, f fVar) {
        boolean z10;
        String str2 = C5306h.class.getSimpleName() + ':' + str;
        d savedStateRegistry = fVar.getSavedStateRegistry();
        Bundle b10 = savedStateRegistry.b(str2);
        C5306h a10 = C5308j.a(b10 != null ? h(b10) : null, b.f19517c);
        try {
            savedStateRegistry.h(str2, new C5115k0(a10));
            z10 = true;
        } catch (IllegalArgumentException unused) {
            z10 = false;
        }
        return new C5112j0(a10, new a(z10, savedStateRegistry, str2));
    }

    /* access modifiers changed from: private */
    public static final Bundle d(C5306h hVar) {
        return g(hVar.d());
    }

    /* access modifiers changed from: private */
    public static final boolean f(Object obj) {
        if (obj instanceof C5352u) {
            C5352u uVar = (C5352u) obj;
            if (uVar.c() != p1.k() && uVar.c() != p1.s() && uVar.c() != p1.p()) {
                return false;
            }
            Object value = uVar.getValue();
            if (value == null) {
                return true;
            }
            return f(value);
        } else if ((obj instanceof C16818i) && (obj instanceof Serializable)) {
            return false;
        } else {
            for (Class<? extends Object> isInstance : f19513a) {
                if (isInstance.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    private static final Bundle g(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
        }
        return bundle;
    }

    private static final Map<String, List<Object>> h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            C17542s.h(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
