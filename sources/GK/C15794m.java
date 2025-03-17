package GK;

import HJ.C15850p;
import HJ.C15854t;
import HK.C15861a;
import HK.C15864d;
import MK.c;
import YH.C16877v;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u0000 (2\u00020\u0001:\u0001\u001bBQ\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0006\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b\u0007\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\b\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b\n\u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b\u000b\u0010%R\u0017\u0010\f\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b\f\u0010%R\u0017\u0010\r\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b\r\u0010%¨\u0006)"}, d2 = {"LGK/m;", "", "", "name", "value", "", "expiresAt", "domain", "path", "", "secure", "httpOnly", "persistent", "hostOnly", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "forObsoleteRfc2965", "f", "(Z)Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "b", "g", "c", "J", "()J", "d", "Z", "()Z", "h", "i", "j", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.m  reason: case insensitive filesystem */
public final class C15794m {

    /* renamed from: j  reason: collision with root package name */
    public static final a f135061j = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f135062k = Pattern.compile("(\\d{2,4})[^\\d]*");
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f135063l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f135064m = Pattern.compile("(\\d{1,2})[^\\d]*");
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f135065n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    private final String f135066a;

    /* renamed from: b  reason: collision with root package name */
    private final String f135067b;

    /* renamed from: c  reason: collision with root package name */
    private final long f135068c;

    /* renamed from: d  reason: collision with root package name */
    private final String f135069d;

    /* renamed from: e  reason: collision with root package name */
    private final String f135070e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f135071f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f135072g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f135073h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f135074i;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010 \u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b \u0010!J%\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0$2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&R\u001c\u0010)\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010+\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u001c\u0010,\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u001c\u0010-\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010*¨\u0006."}, d2 = {"LGK/m$a;", "", "<init>", "()V", "", "urlHost", "domain", "", "b", "(Ljava/lang/String;Ljava/lang/String;)Z", "s", "", "pos", "limit", "", "g", "(Ljava/lang/String;II)J", "input", "invert", "a", "(Ljava/lang/String;IIZ)I", "h", "(Ljava/lang/String;)J", "f", "(Ljava/lang/String;)Ljava/lang/String;", "LGK/v;", "url", "setCookie", "LGK/m;", "c", "(LGK/v;Ljava/lang/String;)LGK/m;", "currentTimeMillis", "d", "(JLGK/v;Ljava/lang/String;)LGK/m;", "LGK/u;", "headers", "", "e", "(LGK/v;LGK/u;)Ljava/util/List;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.m$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (((charAt < ' ' && charAt != 9) || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        private final boolean b(String str, String str2) {
            if (C17542s.e(str, str2)) {
                return true;
            }
            return C15854t.G(str, str2, false, 2, (Object) null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !C15864d.i(str);
        }

        private final String f(String str) {
            if (!C15854t.G(str, ".", false, 2, (Object) null)) {
                String e10 = C15861a.e(C15854t.O0(str, "."));
                if (e10 != null) {
                    return e10;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        private final long g(String str, int i10, int i11) {
            String str2 = str;
            int i12 = i11;
            int a10 = a(str2, i10, i12, false);
            Matcher matcher = C15794m.f135065n.matcher(str2);
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            while (a10 < i12) {
                int a11 = a(str2, a10 + 1, i12, true);
                matcher.region(a10, a11);
                if (i14 == -1 && matcher.usePattern(C15794m.f135065n).matches()) {
                    String group = matcher.group(1);
                    C17542s.i(group, "matcher.group(1)");
                    i14 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    C17542s.i(group2, "matcher.group(2)");
                    i17 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    C17542s.i(group3, "matcher.group(3)");
                    i18 = Integer.parseInt(group3);
                } else if (i15 == -1 && matcher.usePattern(C15794m.f135064m).matches()) {
                    String group4 = matcher.group(1);
                    C17542s.i(group4, "matcher.group(1)");
                    i15 = Integer.parseInt(group4);
                } else if (i16 == -1 && matcher.usePattern(C15794m.f135063l).matches()) {
                    String group5 = matcher.group(1);
                    C17542s.i(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    C17542s.i(locale, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
                    String lowerCase = group5.toLowerCase(locale);
                    C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = C15794m.f135063l.pattern();
                    C17542s.i(pattern, "MONTH_PATTERN.pattern()");
                    i16 = C15854t.s0(pattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i13 == -1 && matcher.usePattern(C15794m.f135062k).matches()) {
                    String group6 = matcher.group(1);
                    C17542s.i(group6, "matcher.group(1)");
                    i13 = Integer.parseInt(group6);
                }
                a10 = a(str2, a11 + 1, i12, false);
            }
            if (70 <= i13 && i13 < 100) {
                i13 += 1900;
            }
            if (i13 >= 0 && i13 < 70) {
                i13 += 2000;
            }
            if (i13 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (i16 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (1 > i15 || i15 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (i14 < 0 || i14 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (i17 < 0 || i17 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (i18 < 0 || i18 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            } else {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(C15864d.f135361f);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, i13);
                gregorianCalendar.set(2, i16 - 1);
                gregorianCalendar.set(5, i15);
                gregorianCalendar.set(11, i14);
                gregorianCalendar.set(12, i17);
                gregorianCalendar.set(13, i18);
                gregorianCalendar.set(14, 0);
                return gregorianCalendar.getTimeInMillis();
            }
        }

        private final long h(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e10) {
                if (new C15850p("-?\\d+").i(str)) {
                    return C15854t.W(str, "-", false, 2, (Object) null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public final C15794m c(C15803v vVar, String str) {
            C17542s.j(vVar, "url");
            C17542s.j(str, "setCookie");
            return d(System.currentTimeMillis(), vVar, str);
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0110  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0113  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0133 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0134  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final GK.C15794m d(long r26, GK.C15803v r28, java.lang.String r29) {
            /*
                r25 = this;
                r0 = r25
                r7 = r29
                java.lang.String r1 = "url"
                r8 = r28
                kotlin.jvm.internal.C17542s.j(r8, r1)
                java.lang.String r1 = "setCookie"
                kotlin.jvm.internal.C17542s.j(r7, r1)
                r5 = 6
                r6 = 0
                r2 = 59
                r3 = 0
                r4 = 0
                r1 = r29
                int r9 = HK.C15864d.r(r1, r2, r3, r4, r5, r6)
                r5 = 2
                r2 = 61
                r4 = r9
                int r1 = HK.C15864d.r(r1, r2, r3, r4, r5, r6)
                r2 = 0
                if (r1 != r9) goto L_0x0028
                return r2
            L_0x0028:
                r3 = 0
                r4 = 1
                java.lang.String r11 = HK.C15864d.b0(r7, r3, r1, r4, r2)
                int r5 = r11.length()
                if (r5 != 0) goto L_0x0035
                goto L_0x003c
            L_0x0035:
                int r5 = HK.C15864d.y(r11)
                r6 = -1
                if (r5 == r6) goto L_0x003d
            L_0x003c:
                return r2
            L_0x003d:
                int r1 = r1 + r4
                java.lang.String r12 = HK.C15864d.a0(r7, r1, r9)
                int r1 = HK.C15864d.y(r12)
                if (r1 == r6) goto L_0x0049
                return r2
            L_0x0049:
                int r9 = r9 + r4
                int r1 = r29.length()
                r5 = -1
                r10 = r2
                r22 = r10
                r17 = r3
                r18 = r17
                r19 = r18
                r20 = r4
                r15 = r5
                r23 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x0061:
                if (r9 >= r1) goto L_0x00d1
                r2 = 59
                int r2 = HK.C15864d.p(r7, r2, r9, r1)
                r13 = 61
                int r13 = HK.C15864d.p(r7, r13, r9, r2)
                java.lang.String r9 = HK.C15864d.a0(r7, r9, r13)
                if (r13 >= r2) goto L_0x007c
                int r13 = r13 + 1
                java.lang.String r13 = HK.C15864d.a0(r7, r13, r2)
                goto L_0x007e
            L_0x007c:
                java.lang.String r13 = ""
            L_0x007e:
                java.lang.String r14 = "expires"
                boolean r14 = HJ.C15854t.H(r9, r14, r4)
                if (r14 == 0) goto L_0x0091
                int r9 = r13.length()     // Catch:{ IllegalArgumentException -> 0x00cd }
                long r23 = r0.g(r13, r3, r9)     // Catch:{ IllegalArgumentException -> 0x00cd }
            L_0x008e:
                r19 = r4
                goto L_0x00cd
            L_0x0091:
                java.lang.String r14 = "max-age"
                boolean r14 = HJ.C15854t.H(r9, r14, r4)
                if (r14 == 0) goto L_0x009e
                long r15 = r0.h(r13)     // Catch:{  }
                goto L_0x008e
            L_0x009e:
                java.lang.String r14 = "domain"
                boolean r14 = HJ.C15854t.H(r9, r14, r4)
                if (r14 == 0) goto L_0x00ad
                java.lang.String r10 = r0.f(r13)     // Catch:{ IllegalArgumentException -> 0x00cd }
                r20 = r3
                goto L_0x00cd
            L_0x00ad:
                java.lang.String r14 = "path"
                boolean r14 = HJ.C15854t.H(r9, r14, r4)
                if (r14 == 0) goto L_0x00b8
                r22 = r13
                goto L_0x00cd
            L_0x00b8:
                java.lang.String r13 = "secure"
                boolean r13 = HJ.C15854t.H(r9, r13, r4)
                if (r13 == 0) goto L_0x00c3
                r17 = r4
                goto L_0x00cd
            L_0x00c3:
                java.lang.String r13 = "httponly"
                boolean r9 = HJ.C15854t.H(r9, r13, r4)
                if (r9 == 0) goto L_0x00cd
                r18 = r4
            L_0x00cd:
                int r9 = r2 + 1
                r2 = 0
                goto L_0x0061
            L_0x00d1:
                r1 = -9223372036854775808
                int r4 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r4 != 0) goto L_0x00d9
            L_0x00d7:
                r13 = r1
                goto L_0x010a
            L_0x00d9:
                int r1 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x0108
                r1 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
                int r1 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r1 > 0) goto L_0x00eb
                r1 = 1000(0x3e8, float:1.401E-42)
                long r1 = (long) r1
                long r15 = r15 * r1
                goto L_0x00f0
            L_0x00eb:
                r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x00f0:
                long r15 = r26 + r15
                int r1 = (r15 > r26 ? 1 : (r15 == r26 ? 0 : -1))
                if (r1 < 0) goto L_0x0102
                r1 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r4 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r4 <= 0) goto L_0x0100
                goto L_0x00d7
            L_0x0100:
                r13 = r15
                goto L_0x010a
            L_0x0102:
                r1 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                goto L_0x00d7
            L_0x0108:
                r13 = r23
            L_0x010a:
                java.lang.String r1 = r28.i()
                if (r10 != 0) goto L_0x0113
                r15 = r1
                r2 = 0
                goto L_0x011d
            L_0x0113:
                boolean r2 = r0.b(r1, r10)
                if (r2 != 0) goto L_0x011b
                r2 = 0
                return r2
            L_0x011b:
                r2 = 0
                r15 = r10
            L_0x011d:
                int r1 = r1.length()
                int r4 = r15.length()
                if (r1 == r4) goto L_0x0134
                okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f145440e
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r1 = r1.c()
                java.lang.String r1 = r1.c(r15)
                if (r1 != 0) goto L_0x0134
                return r2
            L_0x0134:
                java.lang.String r1 = "/"
                r4 = r22
                if (r4 == 0) goto L_0x0145
                r5 = 2
                boolean r2 = HJ.C15854t.W(r4, r1, r3, r5, r2)
                if (r2 != 0) goto L_0x0142
                goto L_0x0145
            L_0x0142:
                r16 = r4
                goto L_0x0161
            L_0x0145:
                java.lang.String r2 = r28.d()
                r9 = 6
                r10 = 0
                r6 = 47
                r7 = 0
                r8 = 0
                r5 = r2
                int r4 = HJ.C15854t.y0(r5, r6, r7, r8, r9, r10)
                if (r4 == 0) goto L_0x015f
                java.lang.String r1 = r2.substring(r3, r4)
                java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C17542s.i(r1, r2)
            L_0x015f:
                r16 = r1
            L_0x0161:
                GK.m r1 = new GK.m
                r21 = 0
                r10 = r1
                r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20, r21)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: GK.C15794m.a.d(long, GK.v, java.lang.String):GK.m");
        }

        public final List<C15794m> e(C15803v vVar, C15802u uVar) {
            C17542s.j(vVar, "url");
            C17542s.j(uVar, "headers");
            List<String> x10 = uVar.x("Set-Cookie");
            int size = x10.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                C15794m c10 = c(vVar, x10.get(i10));
                if (c10 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c10);
                }
            }
            if (arrayList == null) {
                return C16877v.n();
            }
            List<C15794m> unmodifiableList = Collections.unmodifiableList(arrayList);
            C17542s.i(unmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return unmodifiableList;
        }

        private a() {
        }
    }

    public /* synthetic */ C15794m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }

    public final String e() {
        return this.f135066a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C15794m) {
            C15794m mVar = (C15794m) obj;
            return C17542s.e(mVar.f135066a, this.f135066a) && C17542s.e(mVar.f135067b, this.f135067b) && mVar.f135068c == this.f135068c && C17542s.e(mVar.f135069d, this.f135069d) && C17542s.e(mVar.f135070e, this.f135070e) && mVar.f135071f == this.f135071f && mVar.f135072g == this.f135072g && mVar.f135073h == this.f135073h && mVar.f135074i == this.f135074i;
        }
    }

    public final String f(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f135066a);
        sb2.append('=');
        sb2.append(this.f135067b);
        if (this.f135073h) {
            if (this.f135068c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(c.b(new Date(this.f135068c)));
            }
        }
        if (!this.f135074i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f135069d);
        }
        sb2.append("; path=");
        sb2.append(this.f135070e);
        if (this.f135071f) {
            sb2.append("; secure");
        }
        if (this.f135072g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "toString()");
        return sb3;
    }

    public final String g() {
        return this.f135067b;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.f135066a.hashCode()) * 31) + this.f135067b.hashCode()) * 31) + Long.hashCode(this.f135068c)) * 31) + this.f135069d.hashCode()) * 31) + this.f135070e.hashCode()) * 31) + Boolean.hashCode(this.f135071f)) * 31) + Boolean.hashCode(this.f135072g)) * 31) + Boolean.hashCode(this.f135073h)) * 31) + Boolean.hashCode(this.f135074i);
    }

    public String toString() {
        return f(false);
    }

    private C15794m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f135066a = str;
        this.f135067b = str2;
        this.f135068c = j10;
        this.f135069d = str3;
        this.f135070e = str4;
        this.f135071f = z10;
        this.f135072g = z11;
        this.f135073h = z12;
        this.f135074i = z13;
    }
}
