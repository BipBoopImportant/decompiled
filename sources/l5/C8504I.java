package l5;

import XH.C16796C;
import XH.v;
import YH.X;
import android.content.Context;
import androidx.work.C7055y;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Ll5/I;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LXH/N;", "d", "(Landroid/content/Context;)V", "Ljava/io/File;", "c", "(Landroid/content/Context;)Ljava/io/File;", "", "e", "(Landroid/content/Context;)Ljava/util/Map;", "b", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l5.I  reason: case insensitive filesystem */
public final class C8504I {

    /* renamed from: a  reason: collision with root package name */
    public static final C8504I f54623a = new C8504I();

    private C8504I() {
    }

    private final File c(Context context) {
        return new File(C8505a.f54714a.a(context), "androidx.work.workdb");
    }

    public static final void d(Context context) {
        String str;
        C17542s.j(context, "context");
        C8504I i10 = f54623a;
        if (i10.b(context).exists()) {
            C7055y.e().a(J.f54624a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry next : i10.e(context).entrySet()) {
                File file = (File) next.getKey();
                File file2 = (File) next.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        C7055y.e().k(J.f54624a, "Over-writing contents of " + file2);
                    }
                    if (file.renameTo(file2)) {
                        str = "Migrated " + file + "to " + file2;
                    } else {
                        str = "Renaming " + file + " to " + file2 + " failed";
                    }
                    C7055y.e().a(J.f54624a, str);
                }
            }
        }
    }

    public final File a(Context context) {
        C17542s.j(context, "context");
        return c(context);
    }

    public final File b(Context context) {
        C17542s.j(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        C17542s.i(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final Map<File, File> e(Context context) {
        C17542s.j(context, "context");
        File b10 = b(context);
        File a10 = a(context);
        String[] a11 = J.f54625b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(a11.length), 16));
        for (String str : a11) {
            v a12 = C16796C.a(new File(b10.getPath() + str), new File(a10.getPath() + str));
            linkedHashMap.put(a12.c(), a12.d());
        }
        return X.r(linkedHashMap, C16796C.a(b10, a10));
    }
}
