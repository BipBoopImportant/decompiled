package androidx.lifecycle;

import android.app.Application;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l3.a;
import mI.C17603a;
import n3.g;
import uI.C18055d;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0005\u0018\u001e\u001c\u0015!B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0004\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\u0010J(\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001c\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 ¨\u0006\""}, d2 = {"Landroidx/lifecycle/i0;", "", "Ll3/g;", "impl", "<init>", "(Ll3/g;)V", "Landroidx/lifecycle/j0;", "store", "Landroidx/lifecycle/i0$c;", "factory", "Ll3/a;", "defaultCreationExtras", "(Landroidx/lifecycle/j0;Landroidx/lifecycle/i0$c;Ll3/a;)V", "Landroidx/lifecycle/k0;", "owner", "(Landroidx/lifecycle/k0;)V", "(Landroidx/lifecycle/k0;Landroidx/lifecycle/i0$c;)V", "Landroidx/lifecycle/f0;", "T", "LuI/d;", "modelClass", "d", "(LuI/d;)Landroidx/lifecycle/f0;", "Ljava/lang/Class;", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/f0;", "", "key", "c", "(Ljava/lang/String;LuI/d;)Landroidx/lifecycle/f0;", "b", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/f0;", "Ll3/g;", "e", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class i0 {

    /* renamed from: b  reason: collision with root package name */
    public static final b f22291b = new b((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final a.b<String> f22292c = g.a.f26585a;

    /* renamed from: a  reason: collision with root package name */
    private final l3.g f22293a;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/i0$b;", "", "<init>", "()V", "Landroidx/lifecycle/k0;", "owner", "Landroidx/lifecycle/i0$c;", "factory", "Ll3/a;", "extras", "Landroidx/lifecycle/i0;", "b", "(Landroidx/lifecycle/k0;Landroidx/lifecycle/i0$c;Ll3/a;)Landroidx/lifecycle/i0;", "Landroidx/lifecycle/j0;", "store", "a", "(Landroidx/lifecycle/j0;Landroidx/lifecycle/i0$c;Ll3/a;)Landroidx/lifecycle/i0;", "Ll3/a$b;", "", "VIEW_MODEL_KEY", "Ll3/a$b;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ i0 c(b bVar, k0 k0Var, c cVar, l3.a aVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = g.f26584a.d(k0Var);
            }
            if ((i10 & 4) != 0) {
                aVar = g.f26584a.c(k0Var);
            }
            return bVar.b(k0Var, cVar, aVar);
        }

        public final i0 a(j0 j0Var, c cVar, l3.a aVar) {
            C17542s.j(j0Var, PlaceTypes.STORE);
            C17542s.j(cVar, "factory");
            C17542s.j(aVar, "extras");
            return new i0(j0Var, cVar, aVar);
        }

        public final i0 b(k0 k0Var, c cVar, l3.a aVar) {
            C17542s.j(k0Var, "owner");
            C17542s.j(cVar, "factory");
            C17542s.j(aVar, "extras");
            return new i0(k0Var.getViewModelStore(), cVar, aVar);
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\nJ/\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\fø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/i0$c;", "", "Landroidx/lifecycle/f0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/f0;", "Ll3/a;", "extras", "(Ljava/lang/Class;Ll3/a;)Landroidx/lifecycle/f0;", "LuI/d;", "(LuI/d;Ll3/a;)Landroidx/lifecycle/f0;", "d", "a", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface c {

        /* renamed from: d  reason: collision with root package name */
        public static final a f22298d = a.f22299a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/i0$c$a;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f22299a = new a();

            private a() {
            }
        }

        <T extends f0> T create(Class<T> cls) {
            C17542s.j(cls, "modelClass");
            return g.f26584a.f();
        }

        <T extends f0> T create(Class<T> cls, l3.a aVar) {
            C17542s.j(cls, "modelClass");
            C17542s.j(aVar, "extras");
            return create(cls);
        }

        <T extends f0> T create(C18055d<T> dVar, l3.a aVar) {
            C17542s.j(dVar, "modelClass");
            C17542s.j(aVar, "extras");
            return create(C17603a.b(dVar), aVar);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\fJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/i0$d;", "Landroidx/lifecycle/i0$c;", "<init>", "()V", "Landroidx/lifecycle/f0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/f0;", "Ll3/a;", "extras", "(Ljava/lang/Class;Ll3/a;)Landroidx/lifecycle/f0;", "LuI/d;", "(LuI/d;Ll3/a;)Landroidx/lifecycle/f0;", "a", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f22300a = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static d f22301b;

        /* renamed from: c  reason: collision with root package name */
        public static final a.b<String> f22302c = g.a.f26585a;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048GX\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/i0$d$a;", "", "<init>", "()V", "Landroidx/lifecycle/i0$d;", "a", "()Landroidx/lifecycle/i0$d;", "getInstance$annotations", "instance", "Ll3/a$b;", "", "VIEW_MODEL_KEY", "Ll3/a$b;", "_instance", "Landroidx/lifecycle/i0$d;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a() {
                if (d.f22301b == null) {
                    d.f22301b = new d();
                }
                d a10 = d.f22301b;
                C17542s.g(a10);
                return a10;
            }

            private a() {
            }
        }

        public <T extends f0> T create(Class<T> cls) {
            C17542s.j(cls, "modelClass");
            return n3.d.f26579a.a(cls);
        }

        public <T extends f0> T create(Class<T> cls, l3.a aVar) {
            C17542s.j(cls, "modelClass");
            C17542s.j(aVar, "extras");
            return create(cls);
        }

        public <T extends f0> T create(C18055d<T> dVar, l3.a aVar) {
            C17542s.j(dVar, "modelClass");
            C17542s.j(aVar, "extras");
            return create(C17603a.b(dVar), aVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/i0$e;", "", "<init>", "()V", "Landroidx/lifecycle/f0;", "viewModel", "LXH/N;", "a", "(Landroidx/lifecycle/f0;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class e {
        public void a(f0 f0Var) {
            C17542s.j(f0Var, "viewModel");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, c cVar) {
        this(j0Var, cVar, (l3.a) null, 4, (DefaultConstructorMarker) null);
        C17542s.j(j0Var, PlaceTypes.STORE);
        C17542s.j(cVar, "factory");
    }

    public <T extends f0> T a(Class<T> cls) {
        C17542s.j(cls, "modelClass");
        return d(C17603a.e(cls));
    }

    public <T extends f0> T b(String str, Class<T> cls) {
        C17542s.j(str, "key");
        C17542s.j(cls, "modelClass");
        return this.f22293a.a(C17603a.e(cls), str);
    }

    public final <T extends f0> T c(String str, C18055d<T> dVar) {
        C17542s.j(str, "key");
        C17542s.j(dVar, "modelClass");
        return this.f22293a.a(dVar, str);
    }

    public final <T extends f0> T d(C18055d<T> dVar) {
        C17542s.j(dVar, "modelClass");
        return l3.g.b(this.f22293a, dVar, (String) null, 2, (Object) null);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ/\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/i0$a;", "Landroidx/lifecycle/i0$d;", "Landroid/app/Application;", "application", "", "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "Landroidx/lifecycle/f0;", "T", "Ljava/lang/Class;", "modelClass", "app", "e", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/f0;", "Ll3/a;", "extras", "create", "(Ljava/lang/Class;Ll3/a;)Landroidx/lifecycle/f0;", "(Ljava/lang/Class;)Landroidx/lifecycle/f0;", "Landroid/app/Application;", "f", "b", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class a extends d {

        /* renamed from: f  reason: collision with root package name */
        public static final b f22294f = new b((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static a f22295g;

        /* renamed from: h  reason: collision with root package name */
        public static final a.b<Application> f22296h = new C0344a();

        /* renamed from: e  reason: collision with root package name */
        private final Application f22297e;

        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/i0$a$a", "Ll3/a$b;", "Landroid/app/Application;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.lifecycle.i0$a$a  reason: collision with other inner class name */
        public static final class C0344a implements a.b<Application> {
            C0344a() {
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/i0$a$b;", "", "<init>", "()V", "Landroid/app/Application;", "application", "Landroidx/lifecycle/i0$a;", "a", "(Landroid/app/Application;)Landroidx/lifecycle/i0$a;", "Ll3/a$b;", "APPLICATION_KEY", "Ll3/a$b;", "_instance", "Landroidx/lifecycle/i0$a;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Application application) {
                C17542s.j(application, "application");
                if (a.f22295g == null) {
                    a.f22295g = new a(application);
                }
                a c10 = a.f22295g;
                C17542s.g(c10);
                return c10;
            }

            private b() {
            }
        }

        private a(Application application, int i10) {
            this.f22297e = application;
        }

        private final <T extends f0> T e(Class<T> cls, Application application) {
            if (!C5199b.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            try {
                T t10 = (f0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                C17542s.i(t10, "{\n                try {\n…          }\n            }");
                return t10;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        public <T extends f0> T create(Class<T> cls, l3.a aVar) {
            C17542s.j(cls, "modelClass");
            C17542s.j(aVar, "extras");
            if (this.f22297e != null) {
                return create(cls);
            }
            Application application = (Application) aVar.a(f22296h);
            if (application != null) {
                return e(cls, application);
            }
            if (!C5199b.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public a() {
            this((Application) null, 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            C17542s.j(application, "application");
        }

        public <T extends f0> T create(Class<T> cls) {
            C17542s.j(cls, "modelClass");
            Application application = this.f22297e;
            if (application != null) {
                return e(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    private i0(l3.g gVar) {
        this.f22293a = gVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(j0 j0Var, c cVar, l3.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j0Var, cVar, (i10 & 4) != 0 ? a.C0407a.f25486b : aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, c cVar, l3.a aVar) {
        this(new l3.g(j0Var, cVar, aVar));
        C17542s.j(j0Var, PlaceTypes.STORE);
        C17542s.j(cVar, "factory");
        C17542s.j(aVar, "defaultCreationExtras");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0(androidx.lifecycle.k0 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            androidx.lifecycle.j0 r0 = r4.getViewModelStore()
            n3.g r1 = n3.g.f26584a
            androidx.lifecycle.i0$c r2 = r1.d(r4)
            l3.a r4 = r1.c(r4)
            r3.<init>(r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.i0.<init>(androidx.lifecycle.k0):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, c cVar) {
        this(k0Var.getViewModelStore(), cVar, g.f26584a.c(k0Var));
        C17542s.j(k0Var, "owner");
        C17542s.j(cVar, "factory");
    }
}
