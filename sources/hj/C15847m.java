package HJ;

import GJ.C15768k;
import HJ.C15846l;
import YH.C16858b;
import YH.C16860d;
import YH.C16877v;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17974j;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198BX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010#¨\u0006%"}, d2 = {"LHJ/m;", "LHJ/l;", "Ljava/util/regex/Matcher;", "matcher", "", "input", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "next", "()LHJ/l;", "a", "Ljava/util/regex/Matcher;", "b", "Ljava/lang/CharSequence;", "LHJ/k;", "c", "LHJ/k;", "getGroups", "()LHJ/k;", "groups", "", "", "d", "Ljava/util/List;", "groupValues_", "Ljava/util/regex/MatchResult;", "e", "()Ljava/util/regex/MatchResult;", "matchResult", "LtI/j;", "()LtI/j;", "range", "getValue", "()Ljava/lang/String;", "value", "()Ljava/util/List;", "groupValues", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: HJ.m  reason: case insensitive filesystem */
final class C15847m implements C15846l {

    /* renamed from: a  reason: collision with root package name */
    private final Matcher f135336a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f135337b;

    /* renamed from: c  reason: collision with root package name */
    private final C15845k f135338c = new b(this);

    /* renamed from: d  reason: collision with root package name */
    private List<String> f135339d;

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"HJ/m$a", "LYH/d;", "", "", "index", "k", "(I)Ljava/lang/String;", "a", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: HJ.m$a */
    public static final class a extends C16860d<String> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15847m f135340b;

        a(C15847m mVar) {
            this.f135340b = mVar;
        }

        public int a() {
            return this.f135340b.e().groupCount() + 1;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return contains((String) obj);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return m((String) obj);
        }

        /* renamed from: k */
        public String get(int i10) {
            String group = this.f135340b.e().group(i10);
            return group == null ? "" : group;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return p((String) obj);
        }

        public /* bridge */ int m(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int p(String str) {
            return super.lastIndexOf(str);
        }

        public /* bridge */ boolean contains(String str) {
            return super.contains(str);
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"HJ/m$b", "", "LYH/b;", "LHJ/j;", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "index", "p", "(I)LHJ/j;", "a", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: HJ.m$b */
    public static final class b extends C16858b<C15844j> implements C15845k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15847m f135341a;

        b(C15847m mVar) {
            this.f135341a = mVar;
        }

        /* access modifiers changed from: private */
        public static final C15844j q(b bVar, int i10) {
            return bVar.p(i10);
        }

        public int a() {
            return this.f135341a.e().groupCount() + 1;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj == null ? true : obj instanceof C15844j)) {
                return false;
            }
            return m((C15844j) obj);
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator<C15844j> iterator() {
            return C15768k.S(C16877v.h0(C16877v.o(this)), new C15848n(this)).iterator();
        }

        public /* bridge */ boolean m(C15844j jVar) {
            return super.contains(jVar);
        }

        public C15844j p(int i10) {
            C17974j d10 = C15851q.h(this.f135341a.e(), i10);
            if (d10.i().intValue() < 0) {
                return null;
            }
            String group = this.f135341a.e().group(i10);
            C17542s.i(group, "group(...)");
            return new C15844j(group, d10);
        }
    }

    public C15847m(Matcher matcher, CharSequence charSequence) {
        C17542s.j(matcher, "matcher");
        C17542s.j(charSequence, "input");
        this.f135336a = matcher;
        this.f135337b = charSequence;
    }

    /* access modifiers changed from: private */
    public final MatchResult e() {
        return this.f135336a;
    }

    public C15846l.b a() {
        return C15846l.a.a(this);
    }

    public List<String> b() {
        if (this.f135339d == null) {
            this.f135339d = new a(this);
        }
        List<String> list = this.f135339d;
        C17542s.g(list);
        return list;
    }

    public C17974j c() {
        return C15851q.g(e());
    }

    public C15845k getGroups() {
        return this.f135338c;
    }

    public String getValue() {
        String group = e().group();
        C17542s.i(group, "group(...)");
        return group;
    }

    public C15846l next() {
        int end = e().end() + (e().end() == e().start() ? 1 : 0);
        if (end > this.f135337b.length()) {
            return null;
        }
        Matcher matcher = this.f135336a.pattern().matcher(this.f135337b);
        C17542s.i(matcher, "matcher(...)");
        return C15851q.e(matcher, end, this.f135337b);
    }
}
