package androidx.navigation.fragment;

import GJ.C15768k;
import XH.C16796C;
import XH.C16807N;
import XH.C16818i;
import XH.v;
import YH.C16877v;
import YH.X;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Q;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5220x;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.L;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import x4.C;
import x4.C8948l;
import x4.I;
import x4.K;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004QR=?B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010#\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u00100J1\u00103\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f012\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00132\u0006\u0010,\u001a\u000208H\u0016¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001f0B8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010CR,\u0010J\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f0F0E8\u0000X\u0004¢\u0006\f\n\u0004\b6\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020K8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010LR \u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020K0N8\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010O¨\u0006S"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator;", "Lx4/I;", "Landroidx/navigation/fragment/FragmentNavigator$c;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "containerId", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V", "level", "", "y", "(I)Z", "Lx4/l;", "entry", "Landroidx/fragment/app/o;", "fragment", "LXH/N;", "t", "(Lx4/l;Landroidx/fragment/app/o;)V", "Lx4/C;", "navOptions", "Lx4/I$a;", "navigatorExtras", "z", "(Lx4/l;Lx4/C;Lx4/I$a;)V", "Landroidx/fragment/app/Q;", "v", "(Lx4/l;Lx4/C;)Landroidx/fragment/app/Q;", "", "id", "isPop", "deduplicate", "q", "(Ljava/lang/String;ZZ)V", "Lx4/K;", "state", "f", "(Lx4/K;)V", "s", "(Landroidx/fragment/app/o;Lx4/l;Lx4/K;)V", "popUpTo", "savedState", "j", "(Lx4/l;Z)V", "u", "()Landroidx/navigation/fragment/FragmentNavigator$c;", "", "entries", "e", "(Ljava/util/List;Lx4/C;Lx4/I$a;)V", "backStackEntry", "g", "(Lx4/l;)V", "Landroid/os/Bundle;", "i", "()Landroid/os/Bundle;", "h", "(Landroid/os/Bundle;)V", "c", "Landroid/content/Context;", "d", "Landroidx/fragment/app/FragmentManager;", "I", "", "Ljava/util/Set;", "savedIds", "", "LXH/v;", "Ljava/util/List;", "x", "()Ljava/util/List;", "pendingOps", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/v;", "fragmentObserver", "Lkotlin/Function1;", "LnI/l;", "fragmentViewObserver", "a", "b", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@I.b("fragment")
public class FragmentNavigator extends I<c> {

    /* renamed from: j  reason: collision with root package name */
    private static final b f43439j = new b((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private final Context f43440c;

    /* renamed from: d  reason: collision with root package name */
    private final FragmentManager f43441d;

    /* renamed from: e  reason: collision with root package name */
    private final int f43442e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<String> f43443f = new LinkedHashSet();

    /* renamed from: g  reason: collision with root package name */
    private final List<v<String, Boolean>> f43444g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final C5218v f43445h = new A4.d(this);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final C17642l<C8948l, C5218v> f43446i = new i(this);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003R.\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00068\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$a;", "Landroidx/lifecycle/f0;", "<init>", "()V", "LXH/N;", "onCleared", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function0;", "m", "Ljava/lang/ref/WeakReference;", "C", "()Ljava/lang/ref/WeakReference;", "D", "(Ljava/lang/ref/WeakReference;)V", "completeTransition", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends f0 {

        /* renamed from: m  reason: collision with root package name */
        public WeakReference<C17631a<C16807N>> f43447m;

        public final WeakReference<C17631a<C16807N>> C() {
            WeakReference<C17631a<C16807N>> weakReference = this.f43447m;
            if (weakReference != null) {
                return weakReference;
            }
            C17542s.z("completeTransition");
            return null;
        }

        public final void D(WeakReference<C17631a<C16807N>> weakReference) {
            C17542s.j(weakReference, "<set-?>");
            this.f43447m = weakReference;
        }

        /* access modifiers changed from: protected */
        public void onCleared() {
            super.onCleared();
            C17631a aVar = C().get();
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$b;", "", "<init>", "()V", "", "KEY_SAVED_IDS", "Ljava/lang/String;", "TAG", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$c;", "Lx4/v;", "Lx4/I;", "fragmentNavigator", "<init>", "(Lx4/I;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "LXH/N;", "J", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "className", "S", "(Ljava/lang/String;)Landroidx/navigation/fragment/FragmentNavigator$c;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "m", "Ljava/lang/String;", "_className", "R", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class c extends x4.v {

        /* renamed from: m  reason: collision with root package name */
        private String f43448m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(I<? extends c> i10) {
            super((I<? extends x4.v>) i10);
            C17542s.j(i10, "fragmentNavigator");
        }

        public void J(Context context, AttributeSet attributeSet) {
            C17542s.j(context, "context");
            C17542s.j(attributeSet, "attrs");
            super.J(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, A4.g.f32692c);
            C17542s.i(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = obtainAttributes.getString(A4.g.f32693d);
            if (string != null) {
                S(string);
            }
            C16807N n10 = C16807N.f139792a;
            obtainAttributes.recycle();
        }

        public final String R() {
            String str = this.f43448m;
            if (str != null) {
                C17542s.h(str, "null cannot be cast to non-null type kotlin.String");
                return str;
            }
            throw new IllegalStateException("Fragment class was not set");
        }

        public final c S(String str) {
            C17542s.j(str, "className");
            this.f43448m = str;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof c)) {
                return false;
            }
            return super.equals(obj) && C17542s.e(this.f43448m, ((c) obj).f43448m);
        }

        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this.f43448m;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.f43448m;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "sb.toString()");
            return sb3;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\u0018\u00002\u00020\u0001R0\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\t8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$d;", "Lx4/I$a;", "Ljava/util/LinkedHashMap;", "Landroid/view/View;", "", "Lkotlin/collections/LinkedHashMap;", "a", "Ljava/util/LinkedHashMap;", "_sharedElements", "", "()Ljava/util/Map;", "sharedElements", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements I.a {

        /* renamed from: a  reason: collision with root package name */
        private final LinkedHashMap<View, String> f43449a;

        public final Map<View, String> a() {
            return X.x(this.f43449a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LXH/v;", "", "", "it", "a", "(LXH/v;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<v<? extends String, ? extends Boolean>, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f43450c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(1);
            this.f43450c = str;
        }

        /* renamed from: a */
        public final Boolean invoke(v<String, Boolean> vVar) {
            C17542s.j(vVar, "it");
            return Boolean.valueOf(C17542s.e(vVar.c(), this.f43450c));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8948l f43451c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ K f43452d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ FragmentNavigator f43453e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5187o f43454f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C8948l lVar, K k10, FragmentNavigator fragmentNavigator, C5187o oVar) {
            super(0);
            this.f43451c = lVar;
            this.f43452d = k10;
            this.f43453e = fragmentNavigator;
            this.f43454f = oVar;
        }

        public final void invoke() {
            K k10 = this.f43452d;
            FragmentNavigator fragmentNavigator = this.f43453e;
            C5187o oVar = this.f43454f;
            for (C8948l lVar : k10.c().getValue()) {
                if (fragmentNavigator.y(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + lVar + " due to fragment " + oVar + " viewmodel being cleared");
                }
                k10.e(lVar);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll3/a;", "Landroidx/navigation/fragment/FragmentNavigator$a;", "a", "(Ll3/a;)Landroidx/navigation/fragment/FragmentNavigator$a;"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17642l<l3.a, a> {

        /* renamed from: c  reason: collision with root package name */
        public static final g f43455c = new g();

        g() {
            super(1);
        }

        /* renamed from: a */
        public final a invoke(l3.a aVar) {
            C17542s.j(aVar, "$this$initializer");
            return new a();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/y;", "kotlin.jvm.PlatformType", "owner", "LXH/N;", "a", "(Landroidx/lifecycle/y;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17642l<C5221y, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FragmentNavigator f43456c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5187o f43457d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f43458e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(FragmentNavigator fragmentNavigator, C5187o oVar, C8948l lVar) {
            super(1);
            this.f43456c = fragmentNavigator;
            this.f43457d = oVar;
            this.f43458e = lVar;
        }

        public final void a(C5221y yVar) {
            Iterable x10 = this.f43456c.x();
            C5187o oVar = this.f43457d;
            boolean z10 = false;
            if (!(x10 instanceof Collection) || !((Collection) x10).isEmpty()) {
                Iterator it = x10.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C17542s.e(((v) it.next()).c(), oVar.getTag())) {
                            z10 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (yVar != null && !z10) {
                r lifecycle = this.f43457d.getViewLifecycleOwner().getLifecycle();
                if (lifecycle.d().b(r.b.CREATED)) {
                    lifecycle.c((C5220x) this.f43456c.f43446i.invoke(this.f43458e));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5221y) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx4/l;", "entry", "Landroidx/lifecycle/v;", "b", "(Lx4/l;)Landroidx/lifecycle/v;"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements C17642l<C8948l, C5218v> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FragmentNavigator f43459c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(FragmentNavigator fragmentNavigator) {
            super(1);
            this.f43459c = fragmentNavigator;
        }

        /* access modifiers changed from: private */
        public static final void c(FragmentNavigator fragmentNavigator, C8948l lVar, C5221y yVar, r.a aVar) {
            C17542s.j(fragmentNavigator, "this$0");
            C17542s.j(lVar, "$entry");
            C17542s.j(yVar, "owner");
            C17542s.j(aVar, "event");
            if (aVar == r.a.ON_RESUME && fragmentNavigator.b().b().getValue().contains(lVar)) {
                if (fragmentNavigator.y(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + lVar + " due to fragment " + yVar + " view lifecycle reaching RESUMED");
                }
                fragmentNavigator.b().e(lVar);
            }
            if (aVar == r.a.ON_DESTROY) {
                if (fragmentNavigator.y(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + lVar + " due to fragment " + yVar + " view lifecycle reaching DESTROYED");
                }
                fragmentNavigator.b().e(lVar);
            }
        }

        /* renamed from: b */
        public final C5218v invoke(C8948l lVar) {
            C17542s.j(lVar, "entry");
            return new b(this.f43459c, lVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LXH/v;", "", "", "it", "a", "(LXH/v;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class j extends C17544u implements C17642l<v<? extends String, ? extends Boolean>, String> {

        /* renamed from: c  reason: collision with root package name */
        public static final j f43460c = new j();

        j() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(v<String, Boolean> vVar) {
            C17542s.j(vVar, "it");
            return vVar.c();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f43461a;

        k(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f43461a = lVar;
        }

        public final C16818i<?> c() {
            return this.f43461a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f43461a.invoke(obj);
        }
    }

    public FragmentNavigator(Context context, FragmentManager fragmentManager, int i10) {
        C17542s.j(context, "context");
        C17542s.j(fragmentManager, "fragmentManager");
        this.f43440c = context;
        this.f43441d = fragmentManager;
        this.f43442e = i10;
    }

    /* access modifiers changed from: private */
    public static final void A(K k10, FragmentNavigator fragmentNavigator, FragmentManager fragmentManager, C5187o oVar) {
        Object obj;
        C17542s.j(k10, "$state");
        C17542s.j(fragmentNavigator, "this$0");
        C17542s.j(fragmentManager, "<anonymous parameter 0>");
        C17542s.j(oVar, "fragment");
        List value = k10.b().getValue();
        ListIterator listIterator = value.listIterator(value.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (C17542s.e(((C8948l) obj).f(), oVar.getTag())) {
                break;
            }
        }
        C8948l lVar = (C8948l) obj;
        if (fragmentNavigator.y(2)) {
            Log.v("FragmentNavigator", "Attaching fragment " + oVar + " associated with entry " + lVar + " to FragmentManager " + fragmentNavigator.f43441d);
        }
        if (lVar != null) {
            fragmentNavigator.t(lVar, oVar);
            fragmentNavigator.s(oVar, lVar, k10);
        }
    }

    private final void q(String str, boolean z10, boolean z11) {
        if (z11) {
            C16877v.L(this.f43444g, new e(str));
        }
        this.f43444g.add(C16796C.a(str, Boolean.valueOf(z10)));
    }

    static /* synthetic */ void r(FragmentNavigator fragmentNavigator, String str, boolean z10, boolean z11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = true;
            }
            fragmentNavigator.q(str, z10, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPendingOps");
    }

    private final void t(C8948l lVar, C5187o oVar) {
        oVar.getViewLifecycleOwnerLiveData().observe(oVar, new k(new h(this, oVar, lVar)));
        oVar.getLifecycle().c(this.f43445h);
    }

    private final Q v(C8948l lVar, C c10) {
        x4.v e10 = lVar.e();
        C17542s.h(e10, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle c11 = lVar.c();
        String R10 = ((c) e10).R();
        int i10 = 0;
        if (R10.charAt(0) == '.') {
            R10 = this.f43440c.getPackageName() + R10;
        }
        C5187o instantiate = this.f43441d.E0().instantiate(this.f43440c.getClassLoader(), R10);
        C17542s.i(instantiate, "fragmentManager.fragment…t.classLoader, className)");
        instantiate.setArguments(c11);
        Q s10 = this.f43441d.s();
        C17542s.i(s10, "fragmentManager.beginTransaction()");
        int a10 = c10 != null ? c10.a() : -1;
        int b10 = c10 != null ? c10.b() : -1;
        int c12 = c10 != null ? c10.c() : -1;
        int d10 = c10 != null ? c10.d() : -1;
        if (!(a10 == -1 && b10 == -1 && c12 == -1 && d10 == -1)) {
            if (a10 == -1) {
                a10 = 0;
            }
            if (b10 == -1) {
                b10 = 0;
            }
            if (c12 == -1) {
                c12 = 0;
            }
            if (d10 != -1) {
                i10 = d10;
            }
            s10.y(a10, b10, c12, i10);
        }
        s10.t(this.f43442e, instantiate, lVar.f());
        s10.A(instantiate);
        s10.B(true);
        return s10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: x4.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: x4.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: x4.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: x4.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: x4.l} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void w(androidx.navigation.fragment.FragmentNavigator r5, androidx.lifecycle.C5221y r6, androidx.lifecycle.r.a r7) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            androidx.lifecycle.r$a r0 = androidx.lifecycle.r.a.ON_DESTROY
            if (r7 != r0) goto L_0x007b
            r7 = r6
            androidx.fragment.app.o r7 = (androidx.fragment.app.C5187o) r7
            x4.K r0 = r5.b()
            TJ.P r0 = r0.c()
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0029:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0046
            java.lang.Object r2 = r0.next()
            r3 = r2
            x4.l r3 = (x4.C8948l) r3
            java.lang.String r3 = r3.f()
            java.lang.String r4 = r7.getTag()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r4)
            if (r3 == 0) goto L_0x0029
            r1 = r2
            goto L_0x0029
        L_0x0046:
            x4.l r1 = (x4.C8948l) r1
            if (r1 == 0) goto L_0x007b
            r7 = 2
            boolean r7 = r5.y(r7)
            if (r7 == 0) goto L_0x0074
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Marking transition complete for entry "
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = " due to fragment "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = " lifecycle reaching DESTROYED"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "FragmentNavigator"
            android.util.Log.v(r7, r6)
        L_0x0074:
            x4.K r5 = r5.b()
            r5.e(r1)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.FragmentNavigator.w(androidx.navigation.fragment.FragmentNavigator, androidx.lifecycle.y, androidx.lifecycle.r$a):void");
    }

    /* access modifiers changed from: private */
    public final boolean y(int i10) {
        return Log.isLoggable("FragmentManager", i10) || Log.isLoggable("FragmentNavigator", i10);
    }

    private final void z(C8948l lVar, C c10, I.a aVar) {
        boolean isEmpty = b().b().getValue().isEmpty();
        if (c10 == null || isEmpty || !c10.l() || !this.f43443f.remove(lVar.f())) {
            Q v10 = v(lVar, c10);
            if (!isEmpty) {
                C8948l lVar2 = (C8948l) C16877v.K0(b().b().getValue());
                if (lVar2 != null) {
                    r(this, lVar2.f(), false, false, 6, (Object) null);
                }
                r(this, lVar.f(), false, false, 6, (Object) null);
                v10.i(lVar.f());
            }
            if (aVar instanceof d) {
                for (Map.Entry next : ((d) aVar).a().entrySet()) {
                    v10.h((View) next.getKey(), (String) next.getValue());
                }
            }
            v10.j();
            if (y(2)) {
                Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + lVar);
            }
            b().l(lVar);
            return;
        }
        this.f43441d.F1(lVar.f());
        b().l(lVar);
    }

    public void e(List<C8948l> list, C c10, I.a aVar) {
        C17542s.j(list, "entries");
        if (this.f43441d.b1()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        for (C8948l z10 : list) {
            z(z10, c10, aVar);
        }
    }

    public void f(K k10) {
        C17542s.j(k10, "state");
        super.f(k10);
        if (y(2)) {
            Log.v("FragmentNavigator", "onAttach");
        }
        this.f43441d.m(new A4.e(k10, this));
        this.f43441d.n(new FragmentNavigator$onAttach$2(k10, this));
    }

    public void g(C8948l lVar) {
        C17542s.j(lVar, "backStackEntry");
        if (this.f43441d.b1()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        Q v10 = v(lVar, (C) null);
        List value = b().b().getValue();
        if (value.size() > 1) {
            C8948l lVar2 = (C8948l) C16877v.z0(value, C16877v.p(value) - 1);
            if (lVar2 != null) {
                r(this, lVar2.f(), false, false, 6, (Object) null);
            }
            r(this, lVar.f(), true, false, 4, (Object) null);
            this.f43441d.r1(lVar.f(), 1);
            r(this, lVar.f(), false, false, 2, (Object) null);
            v10.i(lVar.f());
        }
        v10.j();
        b().f(lVar);
    }

    public void h(Bundle bundle) {
        C17542s.j(bundle, "savedState");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            this.f43443f.clear();
            C16877v.E(this.f43443f, stringArrayList);
        }
    }

    public Bundle i() {
        if (this.f43443f.isEmpty()) {
            return null;
        }
        return D2.d.b(C16796C.a("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.f43443f)));
    }

    public void j(C8948l lVar, boolean z10) {
        C17542s.j(lVar, "popUpTo");
        if (this.f43441d.b1()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List value = b().b().getValue();
        int indexOf = value.indexOf(lVar);
        List subList = value.subList(indexOf, value.size());
        C8948l lVar2 = (C8948l) C16877v.w0(value);
        C8948l lVar3 = (C8948l) C16877v.z0(value, indexOf - 1);
        if (lVar3 != null) {
            r(this, lVar3.f(), false, false, 6, (Object) null);
        }
        Iterable iterable = subList;
        ArrayList<C8948l> arrayList = new ArrayList<>();
        for (Object next : iterable) {
            C8948l lVar4 = (C8948l) next;
            if (C15768k.B(C15768k.S(C16877v.h0(this.f43444g), j.f43460c), lVar4.f()) || !C17542s.e(lVar4.f(), lVar2.f())) {
                arrayList.add(next);
            }
        }
        for (C8948l f10 : arrayList) {
            r(this, f10.f(), true, false, 4, (Object) null);
        }
        if (z10) {
            for (C8948l lVar5 : C16877v.Z0(iterable)) {
                if (C17542s.e(lVar5, lVar2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + lVar5);
                } else {
                    this.f43441d.K1(lVar5.f());
                    this.f43443f.add(lVar5.f());
                }
            }
        } else {
            this.f43441d.r1(lVar.f(), 1);
        }
        if (y(2)) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + lVar + " with savedState " + z10);
        }
        b().i(lVar, z10);
    }

    public final void s(C5187o oVar, C8948l lVar, K k10) {
        C17542s.j(oVar, "fragment");
        C17542s.j(lVar, "entry");
        C17542s.j(k10, "state");
        j0 viewModelStore = oVar.getViewModelStore();
        C17542s.i(viewModelStore, "fragment.viewModelStore");
        l3.c cVar = new l3.c();
        Class cls = a.class;
        cVar.a(P.b(cls), g.f43455c);
        ((a) new i0(viewModelStore, cVar.b(), a.C0407a.f25486b).a(cls)).D(new WeakReference(new f(lVar, k10, this, oVar)));
    }

    /* renamed from: u */
    public c a() {
        return new c(this);
    }

    public final List<v<String, Boolean>> x() {
        return this.f43444g;
    }
}
