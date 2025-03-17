package androidx.lifecycle;

import P4.d;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16796C;
import YH.X;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0002\"%B\u001f\b\u0016\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u001e\u001a\u00020\u001d\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b \u0010\u001bR\"\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100!8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010#R$\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030'0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010#R(\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010*0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010#R\u0014\u0010.\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010-¨\u0006/"}, d2 = {"Landroidx/lifecycle/U;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "T", "key", "", "hasInitialValue", "initialValue", "Landroidx/lifecycle/K;", "h", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/K;", "LP4/d$c;", "k", "()LP4/d$c;", "e", "(Ljava/lang/String;)Z", "g", "(Ljava/lang/String;)Landroidx/lifecycle/K;", "LTJ/P;", "i", "(Ljava/lang/String;Ljava/lang/Object;)LTJ/P;", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "LXH/N;", "m", "(Ljava/lang/String;Ljava/lang/Object;)V", "j", "", "a", "Ljava/util/Map;", "regular", "b", "savedStateProviders", "Landroidx/lifecycle/U$b;", "c", "liveDatas", "LTJ/B;", "d", "flows", "LP4/d$c;", "savedStateProvider", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class U {

    /* renamed from: f  reason: collision with root package name */
    public static final a f22208f = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Class<? extends Object>[] f22209g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f22210a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, d.c> f22211b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, b<?>> f22212c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, C16505B<Object>> f22213d;

    /* renamed from: e  reason: collision with root package name */
    private final d.c f22214e;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u000f0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/U$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "restoredState", "defaultState", "Landroidx/lifecycle/U;", "a", "(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/U;", "value", "", "b", "(Ljava/lang/Object;)Z", "", "Ljava/lang/Class;", "ACCEPTABLE_CLASSES", "[Ljava/lang/Class;", "", "KEYS", "Ljava/lang/String;", "VALUES", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final U a(Bundle bundle, Bundle bundle2) {
            if (bundle != null) {
                ClassLoader classLoader = U.class.getClassLoader();
                C17542s.g(classLoader);
                bundle.setClassLoader(classLoader);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    throw new IllegalStateException("Invalid bundle passed as restored state");
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = parcelableArrayList.get(i10);
                    C17542s.h(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
                }
                return new U(linkedHashMap);
            } else if (bundle2 == null) {
                return new U();
            } else {
                HashMap hashMap = new HashMap();
                for (String next : bundle2.keySet()) {
                    C17542s.i(next, "key");
                    hashMap.put(next, bundle2.get(next));
                }
                return new U(hashMap);
            }
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : U.f22209g) {
                C17542s.g(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public U(Map<String, ? extends Object> map) {
        C17542s.j(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f22210a = linkedHashMap;
        this.f22211b = new LinkedHashMap();
        this.f22212c = new LinkedHashMap();
        this.f22213d = new LinkedHashMap();
        this.f22214e = new T(this);
        linkedHashMap.putAll(map);
    }

    private final <T> K<T> h(String str, boolean z10, T t10) {
        b bVar;
        b<?> bVar2 = this.f22212c.get(str);
        K<T> k10 = bVar2 instanceof K ? bVar2 : null;
        if (k10 != null) {
            return k10;
        }
        if (this.f22210a.containsKey(str)) {
            bVar = new b(this, str, this.f22210a.get(str));
        } else if (z10) {
            this.f22210a.put(str, t10);
            bVar = new b(this, str, t10);
        } else {
            bVar = new b(this, str);
        }
        this.f22212c.put(str, bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    public static final Bundle l(U u10) {
        C17542s.j(u10, "this$0");
        for (Map.Entry next : X.x(u10.f22211b).entrySet()) {
            u10.m((String) next.getKey(), ((d.c) next.getValue()).b());
        }
        Set<String> keySet = u10.f22210a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String next2 : keySet) {
            arrayList.add(next2);
            arrayList2.add(u10.f22210a.get(next2));
        }
        return D2.d.b(C16796C.a("keys", arrayList), C16796C.a("values", arrayList2));
    }

    public final boolean e(String str) {
        C17542s.j(str, "key");
        return this.f22210a.containsKey(str);
    }

    public final <T> T f(String str) {
        C17542s.j(str, "key");
        try {
            return this.f22210a.get(str);
        } catch (ClassCastException unused) {
            j(str);
            return null;
        }
    }

    public final <T> K<T> g(String str) {
        C17542s.j(str, "key");
        K<T> h10 = h(str, false, (Object) null);
        C17542s.h(h10, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return h10;
    }

    public final <T> C16519P<T> i(String str, T t10) {
        C17542s.j(str, "key");
        Map<String, C16505B<Object>> map = this.f22213d;
        C16505B<Object> b10 = map.get(str);
        if (b10 == null) {
            if (!this.f22210a.containsKey(str)) {
                this.f22210a.put(str, t10);
            }
            b10 = C16521S.a(this.f22210a.get(str));
            this.f22213d.put(str, b10);
            map.put(str, b10);
        }
        C16519P<T> c10 = C16534i.c(b10);
        C17542s.h(c10, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return c10;
    }

    public final <T> T j(String str) {
        C17542s.j(str, "key");
        T remove = this.f22210a.remove(str);
        b remove2 = this.f22212c.remove(str);
        if (remove2 != null) {
            remove2.b();
        }
        this.f22213d.remove(str);
        return remove;
    }

    public final d.c k() {
        return this.f22214e;
    }

    public final <T> void m(String str, T t10) {
        C17542s.j(str, "key");
        if (f22208f.b(t10)) {
            b<?> bVar = this.f22212c.get(str);
            K k10 = bVar instanceof K ? bVar : null;
            if (k10 != null) {
                k10.setValue(t10);
            } else {
                this.f22210a.put(str, t10);
            }
            C16505B b10 = this.f22213d.get(str);
            if (b10 != null) {
                b10.setValue(t10);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't put value with type ");
        C17542s.g(t10);
        sb2.append(t10.getClass());
        sb2.append(" into saved state");
        throw new IllegalArgumentException(sb2.toString());
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/U$b;", "T", "Landroidx/lifecycle/K;", "Landroidx/lifecycle/U;", "handle", "", "key", "value", "<init>", "(Landroidx/lifecycle/U;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/U;Ljava/lang/String;)V", "LXH/N;", "setValue", "(Ljava/lang/Object;)V", "b", "()V", "c", "Ljava/lang/String;", "d", "Landroidx/lifecycle/U;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b<T> extends K<T> {

        /* renamed from: c  reason: collision with root package name */
        private String f22215c;

        /* renamed from: d  reason: collision with root package name */
        private U f22216d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(U u10, String str, T t10) {
            super(t10);
            C17542s.j(str, "key");
            this.f22215c = str;
            this.f22216d = u10;
        }

        public final void b() {
            this.f22216d = null;
        }

        public void setValue(T t10) {
            U u10 = this.f22216d;
            if (u10 != null) {
                u10.f22210a.put(this.f22215c, t10);
                C16505B b10 = (C16505B) u10.f22213d.get(this.f22215c);
                if (b10 != null) {
                    b10.setValue(t10);
                }
            }
            super.setValue(t10);
        }

        public b(U u10, String str) {
            C17542s.j(str, "key");
            this.f22215c = str;
            this.f22216d = u10;
        }
    }

    public U() {
        this.f22210a = new LinkedHashMap();
        this.f22211b = new LinkedHashMap();
        this.f22212c = new LinkedHashMap();
        this.f22213d = new LinkedHashMap();
        this.f22214e = new T(this);
    }
}
