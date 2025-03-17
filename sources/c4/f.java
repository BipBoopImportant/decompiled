package C4;

import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import x4.C8940d;
import x4.F;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00072\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ;\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00072\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u0016\u0010\"\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010 ¨\u0006#"}, d2 = {"LC4/f;", "T", "", "Lkotlinx/serialization/KSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "path", "(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)V", "LXH/N;", "a", "(Ljava/lang/String;)V", "name", "value", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "", "index", "Lx4/F;", "type", "LC4/f$a;", "f", "(ILx4/F;)LC4/f$a;", "e", "()Ljava/lang/String;", "d", "(ILjava/lang/String;Lx4/F;)V", "", "c", "(ILjava/lang/String;Lx4/F;Ljava/util/List;)V", "Lkotlinx/serialization/KSerializer;", "Ljava/lang/String;", "pathArgs", "queryArgs", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final KSerializer<T> f33703a;

    /* renamed from: b  reason: collision with root package name */
    private final String f33704b;

    /* renamed from: c  reason: collision with root package name */
    private String f33705c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f33706d = "";

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LC4/f$a;", "", "<init>", "(Ljava/lang/String;I)V", "PATH", "QUERY", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum a {
        PATH,
        QUERY
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f33707a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                C4.f$a[] r0 = C4.f.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                C4.f$a r1 = C4.f.a.PATH     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                C4.f$a r1 = C4.f.a.QUERY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f33707a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: C4.f.b.<clinit>():void");
        }
    }

    public f(KSerializer<T> kSerializer) {
        C17542s.j(kSerializer, "serializer");
        this.f33703a = kSerializer;
        this.f33704b = kSerializer.getDescriptor().i();
    }

    private final void a(String str) {
        this.f33705c += '/' + str;
    }

    private final void b(String str, String str2) {
        this.f33706d += (this.f33706d.length() == 0 ? "?" : "&") + str + '=' + str2;
    }

    private final a f(int i10, F<Object> f10) {
        return ((f10 instanceof C8940d) || this.f33703a.getDescriptor().j(i10)) ? a.QUERY : a.PATH;
    }

    public final void c(int i10, String str, F<Object> f10, List<String> list) {
        C17542s.j(str, "name");
        C17542s.j(f10, "type");
        C17542s.j(list, "value");
        int i11 = b.f33707a[f(i10, f10).ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                for (String b10 : list) {
                    b(str, b10);
                }
            }
        } else if (list.size() == 1) {
            a((String) C16877v.w0(list));
        } else {
            throw new IllegalArgumentException(("Expected one value for argument " + str + ", found " + list.size() + "values instead.").toString());
        }
    }

    public final void d(int i10, String str, F<Object> f10) {
        C17542s.j(str, "name");
        C17542s.j(f10, "type");
        int i11 = b.f33707a[f(i10, f10).ordinal()];
        if (i11 == 1) {
            a('{' + str + '}');
        } else if (i11 == 2) {
            b(str, '{' + str + '}');
        }
    }

    public final String e() {
        return this.f33704b + this.f33705c + this.f33706d;
    }

    public f(String str, KSerializer<T> kSerializer) {
        C17542s.j(str, "path");
        C17542s.j(kSerializer, "serializer");
        this.f33703a = kSerializer;
        this.f33704b = str;
    }
}
