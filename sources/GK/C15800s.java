package GK;

import GK.C15803v;
import HK.C15864d;
import WK.C16770e;
import WK.C16771f;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0002\u0012\u0010B%\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001a"}, d2 = {"LGK/s;", "LGK/C;", "", "", "encodedNames", "encodedValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "LWK/f;", "sink", "", "countBytes", "", "i", "(LWK/f;Z)J", "LGK/x;", "b", "()LGK/x;", "a", "()J", "LXH/N;", "h", "(LWK/f;)V", "Ljava/util/List;", "c", "d", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.s  reason: case insensitive filesystem */
public final class C15800s extends C15775C {

    /* renamed from: d  reason: collision with root package name */
    public static final b f135091d = new b((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final C15805x f135092e = C15805x.f135130e.a("application/x-www-form-urlencoded");

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f135093b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f135094c;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0014"}, d2 = {"LGK/s$a;", "", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/nio/charset/Charset;)V", "", "name", "value", "a", "(Ljava/lang/String;Ljava/lang/String;)LGK/s$a;", "b", "LGK/s;", "c", "()LGK/s;", "Ljava/nio/charset/Charset;", "", "Ljava/util/List;", "names", "values", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.s$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Charset f135095a;

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f135096b;

        /* renamed from: c  reason: collision with root package name */
        private final List<String> f135097c;

        public a() {
            this((Charset) null, 1, (DefaultConstructorMarker) null);
        }

        public final a a(String str, String str2) {
            String str3 = str;
            C17542s.j(str3, "name");
            C17542s.j(str2, "value");
            C15803v.b bVar = C15803v.f135109k;
            this.f135096b.add(C15803v.b.b(bVar, str3, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f135095a, 91, (Object) null));
            this.f135097c.add(C15803v.b.b(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f135095a, 91, (Object) null));
            return this;
        }

        public final a b(String str, String str2) {
            String str3 = str;
            C17542s.j(str3, "name");
            C17542s.j(str2, "value");
            C15803v.b bVar = C15803v.f135109k;
            this.f135096b.add(C15803v.b.b(bVar, str3, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f135095a, 83, (Object) null));
            this.f135097c.add(C15803v.b.b(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f135095a, 83, (Object) null));
            return this;
        }

        public final C15800s c() {
            return new C15800s(this.f135096b, this.f135097c);
        }

        public a(Charset charset) {
            this.f135095a = charset;
            this.f135096b = new ArrayList();
            this.f135097c = new ArrayList();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Charset charset, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LGK/s$b;", "", "<init>", "()V", "LGK/x;", "CONTENT_TYPE", "LGK/x;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.s$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C15800s(List<String> list, List<String> list2) {
        C17542s.j(list, "encodedNames");
        C17542s.j(list2, "encodedValues");
        this.f135093b = C15864d.W(list);
        this.f135094c = C15864d.W(list2);
    }

    private final long i(C16771f fVar, boolean z10) {
        C16770e eVar;
        if (z10) {
            eVar = new C16770e();
        } else {
            C17542s.g(fVar);
            eVar = fVar.p();
        }
        int size = this.f135093b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                eVar.Z1(38);
            }
            eVar.D0(this.f135093b.get(i10));
            eVar.Z1(61);
            eVar.D0(this.f135094c.get(i10));
        }
        if (!z10) {
            return 0;
        }
        long size2 = eVar.size();
        eVar.c();
        return size2;
    }

    public long a() {
        return i((C16771f) null, true);
    }

    public C15805x b() {
        return f135092e;
    }

    public void h(C16771f fVar) {
        C17542s.j(fVar, "sink");
        i(fVar, false);
    }
}
