package HJ;

import GJ.C15765h;
import GJ.C15768k;
import YH.C16877v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import tI.C17978n;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 \u00122\u00060\u0001j\u0002`\u0002:\u0001+B\u0011\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\"\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b$\u0010\u001fJ%\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070&2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010%\u001a\u00020\u0013¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"LHJ/p;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/regex/Pattern;", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "", "pattern", "(Ljava/lang/String;)V", "LHJ/r;", "option", "(Ljava/lang/String;LHJ/r;)V", "", "input", "", "i", "(Ljava/lang/CharSequence;)Z", "b", "", "startIndex", "LHJ/l;", "c", "(Ljava/lang/CharSequence;I)LHJ/l;", "LGJ/h;", "e", "(Ljava/lang/CharSequence;I)LGJ/h;", "h", "(Ljava/lang/CharSequence;)LHJ/l;", "replacement", "j", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "transform", "k", "(Ljava/lang/CharSequence;LnI/l;)Ljava/lang/String;", "l", "limit", "", "m", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "a", "Ljava/util/regex/Pattern;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: HJ.p  reason: case insensitive filesystem */
public final class C15850p implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f135346b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f135347a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LHJ/p$a;", "", "<init>", "()V", "", "flags", "b", "(I)I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: HJ.p$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final int b(int i10) {
            return (i10 & 2) != 0 ? i10 | 64 : i10;
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: HJ.p$b */
    /* synthetic */ class b extends C17540p implements C17642l<C15846l, C15846l> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f135348a = new b();

        b() {
            super(1, C15846l.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        /* renamed from: t */
        public final C15846l invoke(C15846l lVar) {
            C17542s.j(lVar, "p0");
            return lVar.next();
        }
    }

    public C15850p(Pattern pattern) {
        C17542s.j(pattern, "nativePattern");
        this.f135347a = pattern;
    }

    public static /* synthetic */ C15846l d(C15850p pVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return pVar.c(charSequence, i10);
    }

    public static /* synthetic */ C15765h f(C15850p pVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return pVar.e(charSequence, i10);
    }

    /* access modifiers changed from: private */
    public static final C15846l g(C15850p pVar, CharSequence charSequence, int i10) {
        return pVar.c(charSequence, i10);
    }

    public final boolean b(CharSequence charSequence) {
        C17542s.j(charSequence, "input");
        return this.f135347a.matcher(charSequence).find();
    }

    public final C15846l c(CharSequence charSequence, int i10) {
        C17542s.j(charSequence, "input");
        Matcher matcher = this.f135347a.matcher(charSequence);
        C17542s.i(matcher, "matcher(...)");
        return C15851q.e(matcher, i10, charSequence);
    }

    public final C15765h<C15846l> e(CharSequence charSequence, int i10) {
        C17542s.j(charSequence, "input");
        if (i10 >= 0 && i10 <= charSequence.length()) {
            return C15768k.s(new C15849o(this, charSequence, i10), b.f135348a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i10 + ", input length: " + charSequence.length());
    }

    public final C15846l h(CharSequence charSequence) {
        C17542s.j(charSequence, "input");
        Matcher matcher = this.f135347a.matcher(charSequence);
        C17542s.i(matcher, "matcher(...)");
        return C15851q.f(matcher, charSequence);
    }

    public final boolean i(CharSequence charSequence) {
        C17542s.j(charSequence, "input");
        return this.f135347a.matcher(charSequence).matches();
    }

    public final String j(CharSequence charSequence, String str) {
        C17542s.j(charSequence, "input");
        C17542s.j(str, "replacement");
        String replaceAll = this.f135347a.matcher(charSequence).replaceAll(str);
        C17542s.i(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String k(CharSequence charSequence, C17642l<? super C15846l, ? extends CharSequence> lVar) {
        C17542s.j(charSequence, "input");
        C17542s.j(lVar, "transform");
        int i10 = 0;
        C15846l d10 = d(this, charSequence, 0, 2, (Object) null);
        if (d10 == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(charSequence, i10, d10.c().i().intValue());
            sb2.append((CharSequence) lVar.invoke(d10));
            i10 = d10.c().m().intValue() + 1;
            d10 = d10.next();
            if (i10 >= length) {
                break;
            }
        } while (d10 != null);
        if (i10 < length) {
            sb2.append(charSequence, i10, length);
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "toString(...)");
        return sb3;
    }

    public final String l(CharSequence charSequence, String str) {
        C17542s.j(charSequence, "input");
        C17542s.j(str, "replacement");
        String replaceFirst = this.f135347a.matcher(charSequence).replaceFirst(str);
        C17542s.i(replaceFirst, "replaceFirst(...)");
        return replaceFirst;
    }

    public final List<String> m(CharSequence charSequence, int i10) {
        C17542s.j(charSequence, "input");
        C15829J.T0(i10);
        Matcher matcher = this.f135347a.matcher(charSequence);
        if (i10 == 1 || !matcher.find()) {
            return C16877v.e(charSequence.toString());
        }
        int i11 = 10;
        if (i10 > 0) {
            i11 = C17978n.i(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = i10 - 1;
        int i13 = 0;
        do {
            arrayList.add(charSequence.subSequence(i13, matcher.start()).toString());
            i13 = matcher.end();
            if ((i12 >= 0 && arrayList.size() == i12) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i13, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i13, matcher.start()).toString());
            i13 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i13, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.f135347a.toString();
        C17542s.i(pattern, "toString(...)");
        return pattern;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15850p(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            kotlin.jvm.internal.C17542s.i(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: HJ.C15850p.<init>(java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15850p(java.lang.String r2, HJ.C15852r r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            HJ.p$a r0 = f135346b
            int r3 = r3.b()
            int r3 = r0.b(r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(...)"
            kotlin.jvm.internal.C17542s.i(r2, r3)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: HJ.C15850p.<init>(java.lang.String, HJ.r):void");
    }
}
