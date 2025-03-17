package Cr;

import Cr.a;
import XH.t;
import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LCr/a$c;", "Landroid/content/Context;", "context", "Ljava/io/File;", "a", "(LCr/a$c;Landroid/content/Context;)Ljava/io/File;", "IKEA_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f79669a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                Cr.a$c[] r0 = Cr.a.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Cr.a$c r1 = Cr.a.c.OTHER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Cr.a$c r1 = Cr.a.c.INVOICE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f79669a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Cr.c.a.<clinit>():void");
        }
    }

    public static final File a(a.c cVar, Context context) {
        File file;
        C17542s.j(cVar, "<this>");
        C17542s.j(context, "context");
        int i10 = a.f79669a[cVar.ordinal()];
        if (i10 == 1) {
            file = context.getCacheDir();
        } else if (i10 == 2) {
            file = context.getCacheDir();
        } else {
            throw new t();
        }
        return new File(file, cVar.b());
    }
}
