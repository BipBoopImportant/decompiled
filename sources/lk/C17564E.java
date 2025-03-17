package lK;

import XH.C16820k;
import XH.t;
import com.optimizely.ab.config.FeatureVariable;
import fK.C17251d;
import java.util.Iterator;
import kK.C17513b;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aA\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000e\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"T", "LkK/b;", "mode", "LkK/c;", "json", "LlK/X;", "lexer", "LfK/d;", "deserializer", "", "a", "(LkK/b;LkK/c;LlK/X;LfK/d;)Ljava/util/Iterator;", "LlK/a;", "suggested", "b", "(LlK/a;LkK/b;)LkK/b;", "", "c", "(LlK/a;)Z", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.E  reason: case insensitive filesystem */
public final class C17564E {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lK.E$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f144417a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                kK.b[] r0 = kK.C17513b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kK.b r1 = kK.C17513b.WHITESPACE_SEPARATED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kK.b r1 = kK.C17513b.ARRAY_WRAPPED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kK.b r1 = kK.C17513b.AUTO_DETECT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f144417a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lK.C17564E.a.<clinit>():void");
        }
    }

    public static final <T> Iterator<T> a(C17513b bVar, C17514c cVar, X x10, C17251d<? extends T> dVar) {
        C17542s.j(bVar, "mode");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(x10, "lexer");
        C17542s.j(dVar, "deserializer");
        int i10 = a.f144417a[b(x10, bVar).ordinal()];
        if (i10 == 1) {
            return new C17565F(cVar, x10, dVar);
        }
        if (i10 == 2) {
            return new C17563D(cVar, x10, dVar);
        }
        if (i10 != 3) {
            throw new t();
        }
        throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.");
    }

    private static final C17513b b(C17570a aVar, C17513b bVar) {
        int i10 = a.f144417a[bVar.ordinal()];
        if (i10 == 1) {
            return C17513b.WHITESPACE_SEPARATED;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return c(aVar) ? C17513b.ARRAY_WRAPPED : C17513b.WHITESPACE_SEPARATED;
            }
            throw new t();
        } else if (c(aVar)) {
            return C17513b.ARRAY_WRAPPED;
        } else {
            String c10 = C17571b.c((byte) 8);
            int i11 = aVar.f144471a;
            int i12 = i11 - 1;
            C17570a.z(aVar, "Expected " + c10 + ", but had '" + ((i11 == aVar.D().length() || i12 < 0) ? "EOF" : String.valueOf(aVar.D().charAt(i12))) + "' instead", i12, (String) null, 4, (Object) null);
            throw new C16820k();
        }
    }

    private static final boolean c(C17570a aVar) {
        if (aVar.H() != 8) {
            return false;
        }
        aVar.l((byte) 8);
        return true;
    }
}
