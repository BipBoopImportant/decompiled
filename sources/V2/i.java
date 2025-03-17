package V2;

import U2.c;
import W2.f;
import W2.h;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.content.SharedPreferences;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a3\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a9\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00102\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\" \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "produceSharedPreferences", "", "", "keysToMigrate", "LU2/a;", "LW2/f;", "a", "(LnI/a;Ljava/util/Set;)LU2/a;", "Lkotlin/Function3;", "LU2/c;", "LdI/e;", "", "c", "()LnI/q;", "Lkotlin/Function2;", "", "d", "(Ljava/util/Set;)LnI/p;", "Ljava/util/Set;", "b", "()Ljava/util/Set;", "MIGRATE_ALL_KEYS", "datastore-preferences_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f14610a = new LinkedHashSet();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LU2/c;", "sharedPrefs", "LW2/f;", "currentData", "<anonymous>", "(LU2/c;LW2/f;)LW2/f;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements q<c, W2.f, C17164e<? super W2.f>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f14611c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f14612d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f14613e;

        a(C17164e<? super a> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(c cVar, W2.f fVar, C17164e<? super W2.f> eVar) {
            a aVar = new a(eVar);
            aVar.f14612d = cVar;
            aVar.f14613e = fVar;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f14611c == 0) {
                y.b(obj);
                c cVar = (c) this.f14612d;
                W2.f fVar = (W2.f) this.f14613e;
                Iterable<f.a> keySet = fVar.a().keySet();
                ArrayList arrayList = new ArrayList(C16877v.y(keySet, 10));
                for (f.a a10 : keySet) {
                    arrayList.add(a10.a());
                }
                Map<String, Object> a11 = cVar.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry next : a11.entrySet()) {
                    if (!arrayList.contains((String) next.getKey())) {
                        linkedHashMap.put(next.getKey(), next.getValue());
                    }
                }
                W2.c c10 = fVar.c();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Boolean) {
                        c10.j(h.a(str), value);
                    } else if (value instanceof Float) {
                        c10.j(h.d(str), value);
                    } else if (value instanceof Integer) {
                        c10.j(h.e(str), value);
                    } else if (value instanceof Long) {
                        c10.j(h.f(str), value);
                    } else if (value instanceof String) {
                        c10.j(h.g(str), value);
                    } else if (value instanceof Set) {
                        f.a<Set<String>> h10 = h.h(str);
                        C17542s.h(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                        c10.j(h10, (Set) value);
                    }
                }
                return c10.d();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/f;", "prefs", "", "<anonymous>", "(LW2/f;)Z"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<W2.f, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f14614c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f14615d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Set<String> f14616e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Set<String> set, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f14616e = set;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f14616e, eVar);
            bVar.f14615d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(W2.f fVar, C17164e<? super Boolean> eVar) {
            return ((b) create(fVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f14614c == 0) {
                y.b(obj);
                Iterable<f.a> keySet = ((W2.f) this.f14615d).a().keySet();
                ArrayList arrayList = new ArrayList(C16877v.y(keySet, 10));
                for (f.a a10 : keySet) {
                    arrayList.add(a10.a());
                }
                boolean z10 = true;
                if (this.f14616e != i.b()) {
                    Iterable iterable = this.f14616e;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!arrayList.contains((String) it.next())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    z10 = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final U2.a<W2.f> a(C17631a<? extends SharedPreferences> aVar, Set<String> set) {
        C17542s.j(aVar, "produceSharedPreferences");
        C17542s.j(set, "keysToMigrate");
        if (set != f14610a) {
            return new U2.a<>(aVar, set, d(set), c());
        }
        return new U2.a((C17631a) aVar, (Set) null, (p) d(set), (q) c(), 2, (DefaultConstructorMarker) null);
    }

    public static final Set<String> b() {
        return f14610a;
    }

    private static final q<c, W2.f, C17164e<? super W2.f>, Object> c() {
        return new a((C17164e<? super a>) null);
    }

    private static final p<W2.f, C17164e<? super Boolean>, Object> d(Set<String> set) {
        return new b(set, (C17164e<? super b>) null);
    }
}
