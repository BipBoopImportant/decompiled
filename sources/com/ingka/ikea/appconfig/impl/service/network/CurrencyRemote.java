package com.ingka.ikea.appconfig.impl.service.network;

import HJ.C15854t;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kp.C11522d;
import pp.C11768b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b6\b\b\u0018\u0000 g2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001chB±\u0001\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b#\u0010$J'\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u00100R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u00107\u0012\u0004\b<\u0010:\u001a\u0004\b;\u00100R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u00107\u0012\u0004\b>\u0010:\u001a\u0004\b=\u00100R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u00107\u0012\u0004\b@\u0010:\u001a\u0004\b?\u00100R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u00107\u0012\u0004\bB\u0010:\u001a\u0004\bA\u00100R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bC\u00107\u0012\u0004\bE\u0010:\u001a\u0004\bD\u00100R\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bF\u00107\u0012\u0004\bH\u0010:\u001a\u0004\bG\u00100R\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\bI\u0010J\u0012\u0004\bM\u0010:\u001a\u0004\bK\u0010LR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u0010:\u001a\u0004\bP\u0010QR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\bW\u0010:\u001a\u0004\bU\u0010VR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bX\u00107\u0012\u0004\bZ\u0010:\u001a\u0004\bY\u00100R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b[\u00107\u0012\u0004\b]\u0010:\u001a\u0004\b\\\u00100R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b^\u00107\u0012\u0004\b`\u0010:\u001a\u0004\b_\u00100R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\ba\u00107\u0012\u0004\bc\u0010:\u001a\u0004\bb\u00100R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\bd\u0010T\u0012\u0004\bf\u0010:\u001a\u0004\be\u0010V¨\u0006i"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/CurrencyRemote;", "Lpp/b;", "Lkp/d;", "", "seen0", "", "symbol", "decimalSymbol", "code", "negativeFormat", "positiveFormat", "digitGroupSymbol", "integerSymbol", "nbrFractionDigits", "", "showFractionDigitsOnInteger", "", "conversionRate", "decimalVerticalAlignment", "decimalSign", "currencyVerticalAlignment", "currencyPosition", "analyticsConversionRate", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;LjK/T0;)V", "Lkp/d$a;", "a", "()Lkp/d$a;", "Lkp/d$b;", "b", "()Lkp/d$b;", "alignment", "Lkp/d$c;", "c", "(Ljava/lang/String;)Lkp/d$c;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/appconfig/impl/service/network/CurrencyRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "d", "()Lkp/d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSymbol", "getSymbol$annotations", "()V", "getDecimalSymbol", "getDecimalSymbol$annotations", "getCode", "getCode$annotations", "getNegativeFormat", "getNegativeFormat$annotations", "getPositiveFormat", "getPositiveFormat$annotations", "f", "getDigitGroupSymbol", "getDigitGroupSymbol$annotations", "g", "getIntegerSymbol", "getIntegerSymbol$annotations", "h", "Ljava/lang/Integer;", "getNbrFractionDigits", "()Ljava/lang/Integer;", "getNbrFractionDigits$annotations", "i", "Ljava/lang/Boolean;", "getShowFractionDigitsOnInteger", "()Ljava/lang/Boolean;", "getShowFractionDigitsOnInteger$annotations", "j", "Ljava/lang/Double;", "getConversionRate", "()Ljava/lang/Double;", "getConversionRate$annotations", "k", "getDecimalVerticalAlignment", "getDecimalVerticalAlignment$annotations", "l", "getDecimalSign", "getDecimalSign$annotations", "m", "getCurrencyVerticalAlignment", "getCurrencyVerticalAlignment$annotations", "n", "getCurrencyPosition", "getCurrencyPosition$annotations", "o", "getAnalyticsConversionRate", "getAnalyticsConversionRate$annotations", "Companion", "$serializer", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CurrencyRemote implements C11768b<C11522d> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f92898a;

    /* renamed from: b  reason: collision with root package name */
    private final String f92899b;

    /* renamed from: c  reason: collision with root package name */
    private final String f92900c;

    /* renamed from: d  reason: collision with root package name */
    private final String f92901d;

    /* renamed from: e  reason: collision with root package name */
    private final String f92902e;

    /* renamed from: f  reason: collision with root package name */
    private final String f92903f;

    /* renamed from: g  reason: collision with root package name */
    private final String f92904g;

    /* renamed from: h  reason: collision with root package name */
    private final Integer f92905h;

    /* renamed from: i  reason: collision with root package name */
    private final Boolean f92906i;

    /* renamed from: j  reason: collision with root package name */
    private final Double f92907j;

    /* renamed from: k  reason: collision with root package name */
    private final String f92908k;

    /* renamed from: l  reason: collision with root package name */
    private final String f92909l;

    /* renamed from: m  reason: collision with root package name */
    private final String f92910m;

    /* renamed from: n  reason: collision with root package name */
    private final String f92911n;

    /* renamed from: o  reason: collision with root package name */
    private final Double f92912o;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/CurrencyRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/impl/service/network/CurrencyRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "BOTTOM", "Ljava/lang/String;", "TOP", "COMMA", "DOT", "LEADING", "TRAILING", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CurrencyRemote> serializer() {
            return CurrencyRemote$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    public /* synthetic */ CurrencyRemote(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Boolean bool, Double d10, String str8, String str9, String str10, String str11, Double d11, T0 t02) {
        if (32767 != (i10 & 32767)) {
            E0.b(i10, 32767, CurrencyRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f92898a = str;
        this.f92899b = str2;
        this.f92900c = str3;
        this.f92901d = str4;
        this.f92902e = str5;
        this.f92903f = str6;
        this.f92904g = str7;
        this.f92905h = num;
        this.f92906i = bool;
        this.f92907j = d10;
        this.f92908k = str8;
        this.f92909l = str9;
        this.f92910m = str10;
        this.f92911n = str11;
        this.f92912o = d11;
    }

    private final C11522d.a a() {
        String str = this.f92911n;
        return C17542s.e(str, "LEADING") ? C11522d.a.LEADING : C17542s.e(str, "TRAILING") ? C11522d.a.TRAILING : C11522d.a.LEADING;
    }

    private final C11522d.b b() {
        String str = this.f92909l;
        return C17542s.e(str, "COMMA") ? C11522d.b.COMMA : C17542s.e(str, "DOT") ? C11522d.b.DOT : C11522d.b.COMMA;
    }

    private final C11522d.c c(String str) {
        return C17542s.e(str, "BOTTOM") ? C11522d.c.BOTTOM : C17542s.e(str, "TOP") ? C11522d.c.TOP : C11522d.c.TOP;
    }

    public static final /* synthetic */ void e(CurrencyRemote currencyRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, currencyRemote.f92898a);
        dVar.B(serialDescriptor, 1, y02, currencyRemote.f92899b);
        dVar.B(serialDescriptor, 2, y02, currencyRemote.f92900c);
        dVar.B(serialDescriptor, 3, y02, currencyRemote.f92901d);
        dVar.B(serialDescriptor, 4, y02, currencyRemote.f92902e);
        dVar.B(serialDescriptor, 5, y02, currencyRemote.f92903f);
        dVar.B(serialDescriptor, 6, y02, currencyRemote.f92904g);
        dVar.B(serialDescriptor, 7, X.f144073a, currencyRemote.f92905h);
        dVar.B(serialDescriptor, 8, C17457i.f144111a, currencyRemote.f92906i);
        C17438C c10 = C17438C.f144010a;
        dVar.B(serialDescriptor, 9, c10, currencyRemote.f92907j);
        dVar.B(serialDescriptor, 10, y02, currencyRemote.f92908k);
        dVar.B(serialDescriptor, 11, y02, currencyRemote.f92909l);
        dVar.B(serialDescriptor, 12, y02, currencyRemote.f92910m);
        dVar.B(serialDescriptor, 13, y02, currencyRemote.f92911n);
        dVar.B(serialDescriptor, 14, c10, currencyRemote.f92912o);
    }

    public C11522d d() {
        Double d10;
        C11522d.c cVar;
        C11522d.b bVar;
        C11522d.c cVar2;
        double d11;
        C11522d.a aVar;
        Double d12;
        Iterator it;
        String str = this.f92898a;
        if (str != null) {
            String str2 = this.f92899b;
            if (str2 != null) {
                String str3 = this.f92900c;
                if (str3 != null) {
                    String str4 = this.f92901d;
                    if (str4 != null) {
                        String str5 = this.f92902e;
                        if (str5 != null) {
                            String str6 = this.f92903f;
                            if (str6 != null) {
                                String str7 = this.f92904g;
                                if (str7 != null) {
                                    Integer num = this.f92905h;
                                    if (num != null) {
                                        int intValue = num.intValue();
                                        Boolean bool = this.f92906i;
                                        if (bool != null) {
                                            boolean booleanValue = bool.booleanValue();
                                            Double d13 = this.f92907j;
                                            C11522d.c c10 = c(this.f92908k);
                                            C11522d.b b10 = b();
                                            C11522d.c c11 = c(this.f92910m);
                                            C11522d.a a10 = a();
                                            Double d14 = this.f92912o;
                                            if (d14 != null) {
                                                d10 = d13;
                                                cVar = c10;
                                                bVar = b10;
                                                cVar2 = c11;
                                                d11 = d14.doubleValue();
                                                aVar = a10;
                                            } else {
                                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Missing analyticsConversionRate");
                                                e eVar = e.ERROR;
                                                aVar = a10;
                                                ArrayList arrayList = new ArrayList();
                                                Iterator it2 = d.f102012a.a().iterator();
                                                while (true) {
                                                    cVar2 = c11;
                                                    if (!it2.hasNext()) {
                                                        break;
                                                    }
                                                    C11522d.b bVar2 = b10;
                                                    Object next = it2.next();
                                                    C11522d.c cVar3 = c10;
                                                    if (((C11819b) next).b(eVar, false)) {
                                                        arrayList.add(next);
                                                    }
                                                    c11 = cVar2;
                                                    b10 = bVar2;
                                                    c10 = cVar3;
                                                }
                                                cVar = c10;
                                                bVar = b10;
                                                Iterator it3 = arrayList.iterator();
                                                String str8 = null;
                                                String str9 = null;
                                                String str10 = null;
                                                while (it3.hasNext()) {
                                                    C11819b bVar3 = (C11819b) it3.next();
                                                    if (str9 == null) {
                                                        String a11 = C11818a.a(str8, illegalArgumentException);
                                                        if (a11 == null) {
                                                            break;
                                                        }
                                                        str9 = C11820c.a(a11);
                                                    }
                                                    if (str10 == null) {
                                                        String name = CurrencyRemote.class.getName();
                                                        C17542s.g(name);
                                                        it = it3;
                                                        d12 = d13;
                                                        String str11 = name;
                                                        String o12 = C15854t.o1(C15854t.s1(name, '$', str8, 2, str8), '.', str8, 2, str8);
                                                        String P02 = o12.length() == 0 ? str11 : C15854t.P0(o12, "Kt");
                                                        str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + P02;
                                                    } else {
                                                        d12 = d13;
                                                        it = it3;
                                                    }
                                                    bVar3.a(eVar, str10, false, illegalArgumentException, str9);
                                                    it3 = it;
                                                    d13 = d12;
                                                    str8 = null;
                                                }
                                                d10 = d13;
                                                d11 = 1.0d;
                                            }
                                            return new C11522d(str, str2, str3, str4, str5, str6, str7, intValue, booleanValue, d10, cVar, bVar, cVar2, aVar, d11);
                                        }
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrencyRemote)) {
            return false;
        }
        CurrencyRemote currencyRemote = (CurrencyRemote) obj;
        return C17542s.e(this.f92898a, currencyRemote.f92898a) && C17542s.e(this.f92899b, currencyRemote.f92899b) && C17542s.e(this.f92900c, currencyRemote.f92900c) && C17542s.e(this.f92901d, currencyRemote.f92901d) && C17542s.e(this.f92902e, currencyRemote.f92902e) && C17542s.e(this.f92903f, currencyRemote.f92903f) && C17542s.e(this.f92904g, currencyRemote.f92904g) && C17542s.e(this.f92905h, currencyRemote.f92905h) && C17542s.e(this.f92906i, currencyRemote.f92906i) && C17542s.e(this.f92907j, currencyRemote.f92907j) && C17542s.e(this.f92908k, currencyRemote.f92908k) && C17542s.e(this.f92909l, currencyRemote.f92909l) && C17542s.e(this.f92910m, currencyRemote.f92910m) && C17542s.e(this.f92911n, currencyRemote.f92911n) && C17542s.e(this.f92912o, currencyRemote.f92912o);
    }

    public int hashCode() {
        String str = this.f92898a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f92899b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f92900c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f92901d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f92902e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f92903f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f92904g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.f92905h;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f92906i;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d10 = this.f92907j;
        int hashCode10 = (hashCode9 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str8 = this.f92908k;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f92909l;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f92910m;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f92911n;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Double d11 = this.f92912o;
        if (d11 != null) {
            i10 = d11.hashCode();
        }
        return hashCode14 + i10;
    }

    public String toString() {
        String str = this.f92898a;
        String str2 = this.f92899b;
        String str3 = this.f92900c;
        String str4 = this.f92901d;
        String str5 = this.f92902e;
        String str6 = this.f92903f;
        String str7 = this.f92904g;
        Integer num = this.f92905h;
        Boolean bool = this.f92906i;
        Double d10 = this.f92907j;
        String str8 = this.f92908k;
        String str9 = this.f92909l;
        String str10 = this.f92910m;
        String str11 = this.f92911n;
        Double d11 = this.f92912o;
        return "CurrencyRemote(symbol=" + str + ", decimalSymbol=" + str2 + ", code=" + str3 + ", negativeFormat=" + str4 + ", positiveFormat=" + str5 + ", digitGroupSymbol=" + str6 + ", integerSymbol=" + str7 + ", nbrFractionDigits=" + num + ", showFractionDigitsOnInteger=" + bool + ", conversionRate=" + d10 + ", decimalVerticalAlignment=" + str8 + ", decimalSign=" + str9 + ", currencyVerticalAlignment=" + str10 + ", currencyPosition=" + str11 + ", analyticsConversionRate=" + d11 + ")";
    }
}
