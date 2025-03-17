package U2;

import R2.f;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import YH.C16877v;
import android.content.Context;
import android.content.SharedPreferences;
import dI.C17164e;
import eI.C17187b;
import java.io.IOException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010#\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001eB\u0001\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015Bw\b\u0017\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012$\b\u0002\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e¢\u0006\u0004\b\u0014\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00028\u0000H@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0000H@¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0017H@¢\u0006\u0004\b\u001e\u0010\u001fR0\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R6\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u001b\u0010'\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001c\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"LU2/a;", "T", "LR2/f;", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "produceSharedPreferences", "", "", "keysToMigrate", "Lkotlin/Function2;", "LdI/e;", "", "", "shouldRunMigration", "Lkotlin/Function3;", "LU2/c;", "migrate", "Landroid/content/Context;", "context", "name", "<init>", "(LnI/a;Ljava/util/Set;LnI/p;LnI/q;Landroid/content/Context;Ljava/lang/String;)V", "(LnI/a;Ljava/util/Set;LnI/p;LnI/q;)V", "LXH/N;", "d", "(Landroid/content/Context;Ljava/lang/String;)V", "currentData", "a", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "c", "b", "(LdI/e;)Ljava/lang/Object;", "LnI/p;", "LnI/q;", "Landroid/content/Context;", "Ljava/lang/String;", "e", "LXH/o;", "()Landroid/content/SharedPreferences;", "sharedPrefs", "", "f", "Ljava/util/Set;", "keySet", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final p<T, C17164e<? super Boolean>, Object> f14219a;

    /* renamed from: b  reason: collision with root package name */
    private final q<c, T, C17164e<? super T>, Object> f14220b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f14221c;

    /* renamed from: d  reason: collision with root package name */
    private final String f14222d;

    /* renamed from: e  reason: collision with root package name */
    private final C16824o f14223e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<String> f14224f;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    /* renamed from: U2.a$a  reason: collision with other inner class name */
    static final class C0207a extends l implements p<T, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f14225c;

        C0207a(C17164e<? super C0207a> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C0207a(eVar);
        }

        /* renamed from: i */
        public final Object invoke(T t10, C17164e<? super Boolean> eVar) {
            return ((C0207a) create(t10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f14225c == 0) {
                y.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LU2/a$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "name", "", "a", "(Landroid/content/Context;Ljava/lang/String;)Z", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f14226a = new b();

        private b() {
        }

        public static final boolean a(Context context, String str) {
            C17542s.j(context, "context");
            C17542s.j(str, "name");
            return context.deleteSharedPreferences(str);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.android.kt", l = {151}, m = "shouldMigrate")
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f14227c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f14228d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a<T> f14229e;

        /* renamed from: f  reason: collision with root package name */
        int f14230f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a<T> aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f14229e = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f14228d = obj;
            this.f14230f |= Integer.MIN_VALUE;
            return this.f14229e.a(null, this);
        }
    }

    private a(C17631a<? extends SharedPreferences> aVar, Set<String> set, p<? super T, ? super C17164e<? super Boolean>, ? extends Object> pVar, q<? super c, ? super T, ? super C17164e<? super T>, ? extends Object> qVar, Context context, String str) {
        Set<String> set2;
        this.f14219a = pVar;
        this.f14220b = qVar;
        this.f14221c = context;
        this.f14222d = str;
        this.f14223e = C16825p.b(aVar);
        if (set == b.a()) {
            set2 = null;
        } else {
            set2 = C16877v.x1(set);
        }
        this.f14224f = set2;
    }

    private final void d(Context context, String str) {
        b.a(context, str);
    }

    private final SharedPreferences e() {
        return (SharedPreferences) this.f14223e.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (r5.isEmpty() == false) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(T r5, dI.C17164e<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof U2.a.c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            U2.a$c r0 = (U2.a.c) r0
            int r1 = r0.f14230f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f14230f = r1
            goto L_0x0018
        L_0x0013:
            U2.a$c r0 = new U2.a$c
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f14228d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f14230f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.f14227c
            U2.a r5 = (U2.a) r5
            XH.y.b(r6)
            goto L_0x0046
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            XH.y.b(r6)
            nI.p<T, dI.e<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f14219a
            r0.f14227c = r4
            r0.f14230f = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r5 = r4
        L_0x0046:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 != 0) goto L_0x0054
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r0)
            return r5
        L_0x0054:
            java.util.Set<java.lang.String> r6 = r5.f14224f
            if (r6 != 0) goto L_0x006e
            android.content.SharedPreferences r5 = r5.e()
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            kotlin.jvm.internal.C17542s.i(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x006c
            goto L_0x0098
        L_0x006c:
            r3 = r0
            goto L_0x0098
        L_0x006e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            android.content.SharedPreferences r5 = r5.e()
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0082
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0082
            goto L_0x006c
        L_0x0082:
            java.util.Iterator r6 = r6.iterator()
        L_0x0086:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x006c
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L_0x0086
        L_0x0098:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.a.a(java.lang.Object, dI.e):java.lang.Object");
    }

    public Object b(C17164e<? super C16807N> eVar) {
        Context context;
        String str;
        SharedPreferences.Editor edit = e().edit();
        Set<String> set = this.f14224f;
        if (set == null) {
            edit.clear();
        } else {
            for (String remove : set) {
                edit.remove(remove);
            }
        }
        if (edit.commit()) {
            if (!(!e().getAll().isEmpty() || (context = this.f14221c) == null || (str = this.f14222d) == null)) {
                d(context, str);
            }
            Set<String> set2 = this.f14224f;
            if (set2 != null) {
                set2.clear();
            }
            return C16807N.f139792a;
        }
        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
    }

    public Object c(T t10, C17164e<? super T> eVar) {
        return this.f14220b.invoke(new c(e(), this.f14224f), t10, eVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(C17631a aVar, Set<String> set, p pVar, q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? b.a() : set, (i10 & 4) != 0 ? new C0207a((C17164e<? super C0207a>) null) : pVar, qVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(C17631a<? extends SharedPreferences> aVar, Set<String> set, p<? super T, ? super C17164e<? super Boolean>, ? extends Object> pVar, q<? super c, ? super T, ? super C17164e<? super T>, ? extends Object> qVar) {
        this(aVar, set, pVar, qVar, (Context) null, (String) null);
        C17542s.j(aVar, "produceSharedPreferences");
        C17542s.j(set, "keysToMigrate");
        C17542s.j(pVar, "shouldRunMigration");
        C17542s.j(qVar, "migrate");
    }
}
