package M8;

import YH.C16877v;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001:\u0001\u0016BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0017R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b)\u0010(R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b$\u0010(¨\u0006*"}, d2 = {"LM8/a;", "", "", "shouldCollectQueryParams", "shouldCollectResponseBody", "shouldCollectRequestBody", "shouldCollectStandardHeaders", "", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$BodyAttributePath;", "bodyAttributes", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CustomHeader;", "customHeaders", "", "matchingBodyContents", "<init>", "(ZZZZLjava/util/List;Ljava/util/List;Ljava/util/List;)V", "encrypted", "LM8/e;", "type", "b", "(ZLM8/e;)Ljava/util/List;", "c", "a", "()Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "g", "f", "d", "h", "Ljava/util/List;", "getBodyAttributes", "()Ljava/util/List;", "getCustomHeaders", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f38621a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f38622b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f38623c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f38624d;

    /* renamed from: e  reason: collision with root package name */
    private final List<JsonConfig.ApiErrorsV2.BodyAttributePath> f38625e;

    /* renamed from: f  reason: collision with root package name */
    private final List<JsonConfig.ApiErrorsV2.CustomHeader> f38626f;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f38627g;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u001b\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010!¨\u0006%"}, d2 = {"LM8/a$a;", "", "<init>", "()V", "", "collect", "LXH/N;", "e", "(Z)V", "g", "f", "h", "", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$BodyAttributePath;", "attributes", "a", "(Ljava/util/List;)V", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CustomHeader;", "headers", "b", "", "matchingBodyContent", "c", "(Ljava/lang/String;)V", "LM8/a;", "d", "()LM8/a;", "Z", "shouldCollectQueryParams", "shouldCollectResponseBody", "shouldCollectRequestBody", "shouldCollectStandardHeaders", "", "Ljava/util/Set;", "bodyAttributes", "customHeaders", "matchingBodyContents", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: M8.a$a  reason: collision with other inner class name */
    public static final class C0608a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f38628a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f38629b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f38630c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f38631d;

        /* renamed from: e  reason: collision with root package name */
        private final Set<JsonConfig.ApiErrorsV2.BodyAttributePath> f38632e = new LinkedHashSet();

        /* renamed from: f  reason: collision with root package name */
        private final Set<JsonConfig.ApiErrorsV2.CustomHeader> f38633f = new LinkedHashSet();

        /* renamed from: g  reason: collision with root package name */
        private final Set<String> f38634g = new LinkedHashSet();

        public final void a(List<JsonConfig.ApiErrorsV2.BodyAttributePath> list) {
            C17542s.j(list, "attributes");
            this.f38632e.addAll(list);
        }

        public final void b(List<JsonConfig.ApiErrorsV2.CustomHeader> list) {
            C17542s.j(list, "headers");
            this.f38633f.addAll(list);
        }

        public final void c(String str) {
            C17542s.j(str, "matchingBodyContent");
            this.f38634g.add(str);
        }

        public final a d() {
            return new a(this.f38628a, this.f38629b, this.f38630c, this.f38631d, C16877v.t1(this.f38632e), C16877v.t1(this.f38633f), C16877v.t1(this.f38634g));
        }

        public final void e(boolean z10) {
            if (z10) {
                this.f38628a = true;
            }
        }

        public final void f(boolean z10) {
            if (z10) {
                this.f38630c = true;
            }
        }

        public final void g(boolean z10) {
            if (z10) {
                this.f38629b = true;
            }
        }

        public final void h(boolean z10) {
            if (z10) {
                this.f38631d = true;
            }
        }
    }

    public a(boolean z10, boolean z11, boolean z12, boolean z13, List<JsonConfig.ApiErrorsV2.BodyAttributePath> list, List<JsonConfig.ApiErrorsV2.CustomHeader> list2, List<String> list3) {
        C17542s.j(list, "bodyAttributes");
        C17542s.j(list2, "customHeaders");
        C17542s.j(list3, "matchingBodyContents");
        this.f38621a = z10;
        this.f38622b = z11;
        this.f38623c = z12;
        this.f38624d = z13;
        this.f38625e = list;
        this.f38626f = list2;
        this.f38627g = list3;
    }

    public final boolean a() {
        List<JsonConfig.ApiErrorsV2.CustomHeader> list = this.f38626f;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((JsonConfig.ApiErrorsV2.CustomHeader) it.next()).a()) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        List<JsonConfig.ApiErrorsV2.BodyAttributePath> list2 = this.f38625e;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((JsonConfig.ApiErrorsV2.BodyAttributePath) it2.next()).a()) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return this.f38622b || this.f38623c || this.f38621a;
    }

    public final List<JsonConfig.ApiErrorsV2.BodyAttributePath> b(boolean z10, e eVar) {
        C17542s.j(eVar, "type");
        List<JsonConfig.ApiErrorsV2.BodyAttributePath> list = this.f38625e;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            JsonConfig.ApiErrorsV2.BodyAttributePath bodyAttributePath = (JsonConfig.ApiErrorsV2.BodyAttributePath) next;
            if (bodyAttributePath.a() == z10 && (C17542s.e(bodyAttributePath.d(), e.REQUEST_RESPONSE.b()) || C17542s.e(bodyAttributePath.d(), eVar.b()))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final List<JsonConfig.ApiErrorsV2.CustomHeader> c(boolean z10, e eVar) {
        C17542s.j(eVar, "type");
        List<JsonConfig.ApiErrorsV2.CustomHeader> list = this.f38626f;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            JsonConfig.ApiErrorsV2.CustomHeader customHeader = (JsonConfig.ApiErrorsV2.CustomHeader) next;
            if (customHeader.a() == z10 && (C17542s.e(customHeader.c(), e.REQUEST_RESPONSE.b()) || C17542s.e(customHeader.c(), eVar.b()))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final List<String> d() {
        return this.f38627g;
    }

    public final boolean e() {
        return this.f38621a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f38621a == aVar.f38621a && this.f38622b == aVar.f38622b && this.f38623c == aVar.f38623c && this.f38624d == aVar.f38624d && C17542s.e(this.f38625e, aVar.f38625e) && C17542s.e(this.f38626f, aVar.f38626f) && C17542s.e(this.f38627g, aVar.f38627g);
    }

    public final boolean f() {
        return this.f38623c;
    }

    public final boolean g() {
        return this.f38622b;
    }

    public final boolean h() {
        return this.f38624d;
    }

    public int hashCode() {
        boolean z10 = this.f38621a;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i10 = (z10 ? 1 : 0) * true;
        boolean z12 = this.f38622b;
        if (z12) {
            z12 = true;
        }
        int i11 = (i10 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.f38623c;
        if (z13) {
            z13 = true;
        }
        int i12 = (i11 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.f38624d;
        if (!z14) {
            z11 = z14;
        }
        int hashCode = this.f38625e.hashCode();
        return this.f38627g.hashCode() + ((this.f38626f.hashCode() + ((hashCode + ((i12 + (z11 ? 1 : 0)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "AggregatedRules(shouldCollectQueryParams=" + this.f38621a + ", shouldCollectResponseBody=" + this.f38622b + ", shouldCollectRequestBody=" + this.f38623c + ", shouldCollectStandardHeaders=" + this.f38624d + ", bodyAttributes=" + this.f38625e + ", customHeaders=" + this.f38626f + ", matchingBodyContents=" + this.f38627g + ')';
    }
}
