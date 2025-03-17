package Rn;

import HJ.C15854t;
import YH.C16877v;
import com.sugarcube.core.logger.DslKt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import tv.C11996a;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\u0006\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u000e\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"", "text", "fromDateTime", "toDateTime", "fromPresentationPattern", "toPresentationPattern", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "source", "Ljava/text/SimpleDateFormat;", "dateTimeFormat", "Ljava/util/Date;", "b", "(Ljava/lang/String;Ljava/text/SimpleDateFormat;)Ljava/util/Date;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "cardNetworks", "Ltv/b;", "d", "(Ljava/util/List;)Ljava/util/List;", "paymentMethods", "Ltv/a;", "e", "onlinecheckout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    public static final String a(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder();
        if (str != null && !C15854t.v0(str)) {
            sb2.append(str);
        }
        String c10 = c(str2, str3, str4, str5);
        if (c10 != null && !C15854t.v0(c10)) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(c10);
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "toString(...)");
        return sb3;
    }

    public static final Date b(String str, SimpleDateFormat simpleDateFormat) {
        C17542s.j(simpleDateFormat, "dateTimeFormat");
        if (str == null) {
            return null;
        }
        try {
            return simpleDateFormat.parse(str);
        } catch (ParseException e10) {
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a("Invalid from date: " + str, e10);
                    if (a10 == null) {
                        return null;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "convertToDate";
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, e10, str4);
                str2 = str4;
                str3 = str5;
            }
            return null;
        }
    }

    private static final String c(String str, String str2, String str3, String str4) {
        Date b10;
        if (str == null || str3 == null) {
            return null;
        }
        Zo.b bVar = Zo.b.f90092a;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS", bVar.d());
        Date b11 = b(str, simpleDateFormat);
        if (b11 == null) {
            return null;
        }
        String format = new SimpleDateFormat(str3, bVar.d()).format(b11);
        if (str4 == null || (b10 = b(str2, simpleDateFormat)) == null) {
            return format;
        }
        String format2 = String.format("%s-%s", Arrays.copyOf(new Object[]{format, new SimpleDateFormat(str4, bVar.d()).format(b10)}, 2));
        C17542s.i(format2, "format(...)");
        return format2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<tv.C11997b> d(java.util.List<java.lang.String> r14) {
        /*
            if (r14 == 0) goto L_0x0112
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x000d:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0116
            java.lang.Object r1 = r14.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            switch(r2) {
                case -523338370: goto L_0x0062;
                case -477649710: goto L_0x0055;
                case 659166281: goto L_0x0048;
                case 922718783: goto L_0x003b;
                case 923340961: goto L_0x002e;
                case 1969436105: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x006a
        L_0x0021:
            java.lang.String r2 = "CARD_NETWORK_JCB"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x002a
            goto L_0x006a
        L_0x002a:
            tv.b r1 = tv.C11997b.JCB
            goto L_0x010b
        L_0x002e:
            java.lang.String r2 = "CARD_NETWORK_VISA"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0037
            goto L_0x006a
        L_0x0037:
            tv.b r1 = tv.C11997b.VISA
            goto L_0x010b
        L_0x003b:
            java.lang.String r2 = "CARD_NETWORK_AMEX"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0044
            goto L_0x006a
        L_0x0044:
            tv.b r1 = tv.C11997b.AMEX
            goto L_0x010b
        L_0x0048:
            java.lang.String r2 = "CARD_NETWORK_DISCOVER"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0051
            goto L_0x006a
        L_0x0051:
            tv.b r1 = tv.C11997b.DISCOVER
            goto L_0x010b
        L_0x0055:
            java.lang.String r2 = "CARD_NETWORK_MASTERCARD"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x005e
            goto L_0x006a
        L_0x005e:
            tv.b r1 = tv.C11997b.MASTERCARD
            goto L_0x010b
        L_0x0062:
            java.lang.String r2 = "CARD_NETWORK_INTERAC"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0109
        L_0x006a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid card network: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            qv.e r1 = qv.e.ERROR
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0093:
            boolean r5 = r3.hasNext()
            r9 = 0
            if (r5 == 0) goto L_0x00ab
            java.lang.Object r5 = r3.next()
            r6 = r5
            qv.b r6 = (qv.C11819b) r6
            boolean r6 = r6.b(r1, r9)
            if (r6 == 0) goto L_0x0093
            r4.add(r5)
            goto L_0x0093
        L_0x00ab:
            java.util.Iterator r10 = r4.iterator()
            r11 = 0
            r3 = r11
            r4 = r3
        L_0x00b2:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x0107
            java.lang.Object r5 = r10.next()
            qv.b r5 = (qv.C11819b) r5
            if (r3 != 0) goto L_0x00cb
            java.lang.String r3 = qv.C11818a.a(r11, r2)
            if (r3 != 0) goto L_0x00c7
            goto L_0x0107
        L_0x00c7:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x00cb:
            r12 = r3
            if (r4 != 0) goto L_0x00fa
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "main"
            r6 = 1
            boolean r3 = HJ.C15854t.b0(r3, r4, r6)
            if (r3 == 0) goto L_0x00e2
            java.lang.String r3 = "m"
            goto L_0x00e4
        L_0x00e2:
            java.lang.String r3 = "b"
        L_0x00e4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "|"
            r4.append(r3)
            java.lang.String r3 = "getCardNetworks"
            r4.append(r3)
            java.lang.String r4 = r4.toString()
        L_0x00fa:
            r13 = r4
            r3 = r5
            r4 = r1
            r5 = r13
            r6 = r9
            r7 = r2
            r8 = r12
            r3.a(r4, r5, r6, r7, r8)
            r3 = r12
            r4 = r13
            goto L_0x00b2
        L_0x0107:
            r1 = r11
            goto L_0x010b
        L_0x0109:
            tv.b r1 = tv.C11997b.INTERAC
        L_0x010b:
            if (r1 == 0) goto L_0x000d
            r0.add(r1)
            goto L_0x000d
        L_0x0112:
            java.util.List r0 = YH.C16877v.n()
        L_0x0116:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Rn.b.d(java.util.List):java.util.List");
    }

    public static final List<C11996a> e(List<String> list) {
        C11996a aVar;
        if (list == null) {
            return C16877v.n();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (C17542s.e(str, "PAYMENT_METHOD_CARD")) {
                aVar = C11996a.PAN_ONLY;
            } else if (C17542s.e(str, "PAYMENT_METHOD_TOKENIZED_CARD")) {
                aVar = C11996a.CRYPTOGRAM_3DS;
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid payment method: " + str);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList2.add(next);
                    }
                }
                String str2 = null;
                String str3 = null;
                for (C11819b bVar : arrayList2) {
                    if (str2 == null) {
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 == null) {
                            break;
                        }
                        str2 = C11820c.a(a10);
                    }
                    String str4 = str2;
                    if (str3 == null) {
                        str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "getPaymentMethods";
                    }
                    String str5 = str3;
                    bVar.a(eVar, str5, false, illegalArgumentException, str4);
                    str2 = str4;
                    str3 = str5;
                }
                aVar = null;
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
