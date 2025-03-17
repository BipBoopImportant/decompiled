package androidx.fragment.app;

import YH.C16877v;
import android.view.View;
import androidx.core.app.A;
import androidx.transition.FragmentTransitionSupport;
import j0.C5445a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0004\u0018\u00010\b*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u000f\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0007¢\u0006\u0004\b \u0010!R\u0016\u0010#\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0016\u0010$\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006%"}, d2 = {"Landroidx/fragment/app/S;", "", "<init>", "()V", "Landroidx/fragment/app/U;", "c", "()Landroidx/fragment/app/U;", "Lj0/a;", "", "value", "b", "(Lj0/a;Ljava/lang/String;)Ljava/lang/String;", "Landroid/view/View;", "namedViews", "LXH/N;", "d", "(Lj0/a;Lj0/a;)V", "Landroidx/fragment/app/o;", "inFragment", "outFragment", "", "isPop", "sharedElements", "isStart", "a", "(Landroidx/fragment/app/o;Landroidx/fragment/app/o;ZLj0/a;Z)V", "", "views", "", "visibility", "e", "(Ljava/util/List;I)V", "f", "()Z", "Landroidx/fragment/app/U;", "PLATFORM_IMPL", "SUPPORT_IMPL", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class S {

    /* renamed from: a  reason: collision with root package name */
    public static final S f21955a;

    /* renamed from: b  reason: collision with root package name */
    public static final U f21956b = new T();

    /* renamed from: c  reason: collision with root package name */
    public static final U f21957c;

    static {
        S s10 = new S();
        f21955a = s10;
        f21957c = s10.c();
    }

    private S() {
    }

    public static final void a(C5187o oVar, C5187o oVar2, boolean z10, C5445a<String, View> aVar, boolean z11) {
        C17542s.j(oVar, "inFragment");
        C17542s.j(oVar2, "outFragment");
        C17542s.j(aVar, "sharedElements");
        A enterTransitionCallback = z10 ? oVar2.getEnterTransitionCallback() : oVar.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(aVar.size());
            for (Map.Entry<String, View> value : aVar.entrySet()) {
                arrayList.add((View) value.getValue());
            }
            ArrayList arrayList2 = new ArrayList(aVar.size());
            for (Map.Entry<String, View> key : aVar.entrySet()) {
                arrayList2.add((String) key.getKey());
            }
            if (z11) {
                enterTransitionCallback.g(arrayList2, arrayList, (List<View>) null);
            } else {
                enterTransitionCallback.f(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    public static final String b(C5445a<String, String> aVar, String str) {
        C17542s.j(aVar, "<this>");
        C17542s.j(str, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : aVar.entrySet()) {
            if (C17542s.e(next.getValue(), str)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry key : linkedHashMap.entrySet()) {
            arrayList.add((String) key.getKey());
        }
        return (String) C16877v.y0(arrayList);
    }

    private final U c() {
        Class<FragmentTransitionSupport> cls = FragmentTransitionSupport.class;
        try {
            C17542s.h(cls, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void d(C5445a<String, String> aVar, C5445a<String, View> aVar2) {
        C17542s.j(aVar, "<this>");
        C17542s.j(aVar2, "namedViews");
        int size = aVar.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!aVar2.containsKey(aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    public static final void e(List<? extends View> list, int i10) {
        C17542s.j(list, "views");
        for (View visibility : list) {
            visibility.setVisibility(i10);
        }
    }

    public static final boolean f() {
        return (f21956b == null && f21957c == null) ? false : true;
    }
}
