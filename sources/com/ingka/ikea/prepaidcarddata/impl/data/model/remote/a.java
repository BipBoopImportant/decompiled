package com.ingka.ikea.prepaidcarddata.impl.data.model.remote;

import HJ.C15854t;
import XH.t;
import com.sugarcube.core.logger.DslKt;
import fI.C17220a;
import fI.C17221b;
import ix.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/a;", "", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "GIFT_CARD", "REFUND_CARD", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum a {
    GIFT_CARD("GIFT_CARD"),
    REFUND_CARD("REFUND_CARD");
    
    public static final C2984a Companion = null;
    private final String type;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/a$a;", "", "<init>", "()V", "", "type", "Lix/d;", "a", "(Ljava/lang/String;)Lix/d;", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.prepaidcarddata.impl.data.model.remote.a$a  reason: collision with other inner class name */
    public static final class C2984a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.prepaidcarddata.impl.data.model.remote.a$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C2985a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f119371a = null;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    com.ingka.ikea.prepaidcarddata.impl.data.model.remote.a[] r0 = com.ingka.ikea.prepaidcarddata.impl.data.model.remote.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.ingka.ikea.prepaidcarddata.impl.data.model.remote.a r1 = com.ingka.ikea.prepaidcarddata.impl.data.model.remote.a.GIFT_CARD     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.ingka.ikea.prepaidcarddata.impl.data.model.remote.a r1 = com.ingka.ikea.prepaidcarddata.impl.data.model.remote.a.REFUND_CARD     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f119371a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.prepaidcarddata.impl.data.model.remote.a.C2984a.C2985a.<clinit>():void");
            }
        }

        public /* synthetic */ C2984a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(String str) {
            T t10;
            String str2 = str;
            Iterator<T> it = a.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (C15854t.H(((a) t10).j(), str2, true)) {
                    break;
                }
            }
            a aVar = (a) t10;
            if (aVar == null) {
                aVar = a.REFUND_CARD;
                C2984a aVar2 = a.Companion;
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown redemption card type returned " + str2);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str3 = null;
                String str4 = null;
                for (C11819b bVar : arrayList) {
                    if (str3 == null) {
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 == null) {
                            break;
                        }
                        str3 = C11820c.a(a10);
                    }
                    String str5 = str3;
                    if (str4 == null) {
                        String name = aVar2.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str6 = str4;
                    bVar.a(eVar, str6, false, illegalArgumentException, str5);
                    str3 = str5;
                    str4 = str6;
                }
            }
            int i10 = C2985a.f119371a[aVar.ordinal()];
            if (i10 == 1) {
                return d.GIFT_CARD;
            }
            if (i10 == 2) {
                return d.REFUND_CARD;
            }
            throw new t();
        }

        private C2984a() {
        }
    }

    static {
        a[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new C2984a((DefaultConstructorMarker) null);
    }

    private a(String str) {
        this.type = str;
    }

    public static C17220a<a> b() {
        return $ENTRIES;
    }

    public final String j() {
        return this.type;
    }
}
