package androidx.room;

import HJ.C15854t;
import android.content.Context;
import androidx.room.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0004*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0004*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/room/w;", "", "<init>", "()V", "T", "C", "Ljava/lang/Class;", "klass", "", "suffix", "b", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "Landroidx/room/x;", "Landroid/content/Context;", "context", "Landroidx/room/x$a;", "c", "(Landroid/content/Context;Ljava/lang/Class;)Landroidx/room/x$a;", "name", "a", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/x$a;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f44412a = new w();

    private w() {
    }

    public static final <T extends x> x.a<T> a(Context context, Class<T> cls, String str) {
        C17542s.j(context, "context");
        C17542s.j(cls, "klass");
        if (!(str == null || C15854t.v0(str))) {
            return new x.a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    public static final <T, C> T b(Class<C> cls, String str) {
        String str2;
        C17542s.j(cls, "klass");
        C17542s.j(str, "suffix");
        Package packageR = cls.getPackage();
        C17542s.g(packageR);
        String name = packageR.getName();
        String canonicalName = cls.getCanonicalName();
        C17542s.g(canonicalName);
        C17542s.i(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            C17542s.i(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str3 = canonicalName;
        String str4 = C15854t.P(str3, '.', '_', false, 4, (Object) null) + str;
        try {
            if (name.length() == 0) {
                str2 = str4;
            } else {
                str2 = name + '.' + str4;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            C17542s.h(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return cls2.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + str4 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    public static final <T extends x> x.a<T> c(Context context, Class<T> cls) {
        C17542s.j(context, "context");
        C17542s.j(cls, "klass");
        return new x.a<>(context, cls, (String) null);
    }
}
