package UA;

import HJ.C15854t;
import XH.t;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import np.C11664a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LUA/b;", "", "<init>", "()V", "Lnp/a;", "", "c", "(Lnp/a;)Ljava/lang/String;", "Lnp/a$a;", "b", "(Lnp/a$a;)Ljava/lang/String;", "rawValue", "e", "(Ljava/lang/String;)Lnp/a$a;", "", "d", "(Ljava/lang/String;)Ljava/util/List;", "fees", "f", "(Ljava/util/List;)Ljava/lang/String;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UA.b  reason: case insensitive filesystem */
public final class C13713b {

    /* renamed from: a  reason: collision with root package name */
    public static final C13713b f116992a = new C13713b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: UA.b$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f116993a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                np.a$a[] r0 = np.C11664a.C2303a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                np.a$a r1 = np.C11664a.C2303a.ECO     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                np.a$a r1 = np.C11664a.C2303a.WEEE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f116993a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: UA.C13713b.a.<clinit>():void");
        }
    }

    private C13713b() {
    }

    private final String b(C11664a.C2303a aVar) {
        int i10 = a.f116993a[aVar.ordinal()];
        if (i10 == 1) {
            return "eco";
        }
        if (i10 == 2) {
            return "weee";
        }
        throw new t();
    }

    private final String c(C11664a aVar) {
        String b10 = b(aVar.b());
        double a10 = aVar.a();
        return b10 + "," + a10;
    }

    private final C11664a.C2303a e(String str) {
        if (C17542s.e(str, "eco")) {
            return C11664a.C2303a.ECO;
        }
        if (C17542s.e(str, "weee")) {
            return C11664a.C2303a.WEEE;
        }
        throw new IllegalArgumentException("EnvironmentalFee type " + str + " cannot be parsed");
    }

    /* access modifiers changed from: private */
    public static final CharSequence g(C11664a aVar) {
        C17542s.j(aVar, "it");
        return f116992a.c(aVar);
    }

    public final List<C11664a> d(String str) {
        C17542s.j(str, "rawValue");
        if (str.length() == 0) {
            return C16877v.n();
        }
        Iterable<String> Y02 = C15854t.Y0(str, new String[]{";"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(C16877v.y(Y02, 10));
        for (String Y03 : Y02) {
            List Y04 = C15854t.Y0(Y03, new String[]{","}, false, 0, 6, (Object) null);
            arrayList.add(new C11664a(f116992a.e((String) Y04.get(0)), Double.parseDouble((String) Y04.get(1))));
        }
        return arrayList;
    }

    public final String f(List<C11664a> list) {
        C17542s.j(list, "fees");
        return C16877v.G0(list, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new C13712a(), 30, (Object) null);
    }
}
