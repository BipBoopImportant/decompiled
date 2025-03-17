package com.ingka.ikea.core.remotemodel.product;

import HJ.C15854t;
import com.ingka.ikea.core.model.product.Badge;
import com.sugarcube.core.logger.DslKt;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import op.C11692c;
import pp.C11768b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001d2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003\u0014\u001e\u0012B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0016\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/BadgeRemote;", "Lpp/b;", "Lcom/ingka/ikea/core/model/product/Badge;", "", "seen0", "", "type", "text", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/remotemodel/product/BadgeRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lcom/ingka/ikea/core/model/product/Badge;", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getType$annotations", "()V", "getText", "getText$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BadgeRemote implements C11768b<Badge> {
    public static final b Companion = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95251a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95252b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/BadgeRemote$a;", "", "", "badgeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "TOP_SELLER", "LIMITED_EDITION", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        TOP_SELLER("TOP_SELLER"),
        LIMITED_EDITION("LIMITED_EDITION");
        
        public static final C2119a Companion = null;
        private final String badgeType;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/BadgeRemote$a$a;", "", "<init>", "()V", "", "remote", "Lop/c;", "a", "(Ljava/lang/String;)Lop/c;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.core.remotemodel.product.BadgeRemote$a$a  reason: collision with other inner class name */
        public static final class C2119a {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.core.remotemodel.product.BadgeRemote$a$a$a  reason: collision with other inner class name */
            public /* synthetic */ class C2120a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f95253a = null;

                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                static {
                    /*
                        com.ingka.ikea.core.remotemodel.product.BadgeRemote$a[] r0 = com.ingka.ikea.core.remotemodel.product.BadgeRemote.a.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        com.ingka.ikea.core.remotemodel.product.BadgeRemote$a r1 = com.ingka.ikea.core.remotemodel.product.BadgeRemote.a.TOP_SELLER     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        com.ingka.ikea.core.remotemodel.product.BadgeRemote$a r1 = com.ingka.ikea.core.remotemodel.product.BadgeRemote.a.LIMITED_EDITION     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        f95253a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.remotemodel.product.BadgeRemote.a.C2119a.C2120a.<clinit>():void");
                }
            }

            public /* synthetic */ C2119a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C11692c a(String str) {
                T t10;
                Iterator<T> it = a.j().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (C17542s.e(((a) t10).b(), str)) {
                        break;
                    }
                }
                a aVar = (a) t10;
                int i10 = aVar == null ? -1 : C2120a.f95253a[aVar.ordinal()];
                if (i10 == 1) {
                    return C11692c.TOP_SELLER;
                }
                if (i10 == 2) {
                    return C11692c.LIMITED_EDITION;
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Badge type " + str + " not supported");
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
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 == null) {
                            return null;
                        }
                        str2 = C11820c.a(a10);
                    }
                    String str4 = str2;
                    if (str3 == null) {
                        String name = C2119a.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str5 = str3;
                    bVar.a(eVar, str5, false, illegalArgumentException, str4);
                    str2 = str4;
                    str3 = str5;
                }
                return null;
            }

            private C2119a() {
            }
        }

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new C2119a((DefaultConstructorMarker) null);
        }

        private a(String str) {
            this.badgeType = str;
        }

        public static C17220a<a> j() {
            return $ENTRIES;
        }

        public final String b() {
            return this.badgeType;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/BadgeRemote$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/BadgeRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        private b() {
        }

        public final KSerializer<BadgeRemote> serializer() {
            return BadgeRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BadgeRemote(int i10, String str, String str2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, BadgeRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95251a = str;
        this.f95252b = str2;
    }

    public static final /* synthetic */ void b(BadgeRemote badgeRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, badgeRemote.f95251a);
        dVar.B(serialDescriptor, 1, y02, badgeRemote.f95252b);
    }

    public Badge a() {
        C11692c a10 = a.Companion.a(this.f95251a);
        if (a10 == null) {
            return null;
        }
        String str = this.f95252b;
        if (str != null) {
            return new Badge(a10, str);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
