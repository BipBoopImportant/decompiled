package aB;

import Ah.C9045a;
import HJ.C15854t;
import L6.b;
import M6.w;
import TA.C13671a;
import TA.C13673c;
import XH.t;
import aB.C13914d;
import com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import fI.C17221b;
import gB.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0006GLJEBQB+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH@¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u001c\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010%\u001a\u00020 2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020 2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000eH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020 2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000eH\u0002¢\u0006\u0004\b-\u0010(J!\u0010.\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000eH\u0002¢\u0006\u0004\b.\u0010/J%\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000eH\u0002¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020 2\u0006\u00102\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b3\u00104J+\u00109\u001a\u00020 \"\b\b\u0000\u00106*\u000205*\b\u0012\u0004\u0012\u00028\u0000072\u0006\u00108\u001a\u00020#H\u0002¢\u0006\u0004\b9\u0010:J%\u0010<\u001a\u00020 2\u0006\u0010;\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0002¢\u0006\u0004\b<\u0010=J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH@¢\u0006\u0004\b>\u0010?J\u0018\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u00020\fH@¢\u0006\u0004\bB\u0010CJ \u0010E\u001a\u00020 2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010D\u001a\u00020\fH@¢\u0006\u0004\bE\u0010FJ\u0018\u0010G\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fH@¢\u0006\u0004\bG\u0010CJ\u0018\u0010J\u001a\u00020\u00112\u0006\u0010I\u001a\u00020HH@¢\u0006\u0004\bJ\u0010KJ\u0018\u0010L\u001a\u00020 2\u0006\u0010I\u001a\u00020HH@¢\u0006\u0004\bL\u0010KJ\u0018\u0010M\u001a\u00020 2\u0006\u0010I\u001a\u00020HH@¢\u0006\u0004\bM\u0010KJ\u001a\u0010O\u001a\u00020\u00112\b\u0010N\u001a\u0004\u0018\u00010\fH@¢\u0006\u0004\bO\u0010CR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010SR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010T¨\u0006U"}, d2 = {"LaB/b;", "LaB/a;", "LL6/b;", "apolloClient", "LTA/c;", "shoppingListDevAnalytics", "LIl/a;", "appConfigApi", "Ltw/g;", "networkParameters", "<init>", "(LL6/b;LTA/c;LIl/a;Ltw/g;)V", "", "listId", "", "LBh/a;", "itemsToAdd", "LbB/f;", "o", "(Ljava/lang/String;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LM6/o;", "errors", "errorCode", "LaB/b$a;", "q", "(Ljava/util/List;Ljava/lang/String;)LaB/b$a;", "LaB/b$a$b;", "addItemException", "r", "(Ljava/util/List;LaB/b$a$b;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LAh/a;", "fragment", "LXH/N;", "k", "(LAh/a;)V", "LTA/a;", "apiAnalytics", "l", "(Ljava/util/List;LTA/a;)V", "m", "(Ljava/util/List;)V", "error", "LaB/d;", "p", "(Ljava/lang/String;)LaB/d;", "n", "t", "(Ljava/util/List;)Ljava/lang/String;", "u", "(Ljava/util/List;)Ljava/util/List;", "reason", "w", "(Ljava/lang/String;LTA/a;)V", "LM6/w$a;", "D", "LM6/g;", "analytics", "v", "(LM6/g;LTA/a;)V", "message", "s", "(Ljava/lang/String;Ljava/util/List;)V", "i", "(LdI/e;)Ljava/lang/Object;", "listName", "LbB/b;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "newName", "c", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "d", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/SyncEventModel;", "syncEventModel", "e", "(Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/SyncEventModel;LdI/e;)Ljava/lang/Object;", "f", "g", "shoppingBagId", "h", "LL6/b;", "b", "LTA/c;", "LIl/a;", "Ltw/g;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: aB.b  reason: case insensitive filesystem */
public final class C13912b implements C13911a {

    /* renamed from: a  reason: collision with root package name */
    private final b f118452a;

    /* renamed from: b  reason: collision with root package name */
    private final C13673c f118453b;

    /* renamed from: c  reason: collision with root package name */
    private final Il.a f118454c;

    /* renamed from: d  reason: collision with root package name */
    private final tw.g f118455d;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0007\nB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"LaB/b$a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "errorCode", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "LaB/b$a$a;", "LaB/b$a$b;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aB.b$a */
    public static abstract class a extends Exception {

        /* renamed from: a  reason: collision with root package name */
        private final String f118456a;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LaB/b$a$a;", "LaB/b$a;", "", "errorCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: aB.b$a$a  reason: collision with other inner class name */
        public static final class C2952a extends a {

            /* renamed from: b  reason: collision with root package name */
            private final String f118457b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2952a(String str) {
                super(str, (DefaultConstructorMarker) null);
                C17542s.j(str, "errorCode");
                this.f118457b = str;
            }

            public String a() {
                return this.f118457b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2952a) && C17542s.e(this.f118457b, ((C2952a) obj).f118457b);
            }

            public int hashCode() {
                return this.f118457b.hashCode();
            }

            public String toString() {
                String str = this.f118457b;
                return "Failed(errorCode=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LaB/b$a$b;", "LaB/b$a;", "", "errorCode", "", "invalidItems", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "c", "Ljava/util/List;", "()Ljava/util/List;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: aB.b$a$b  reason: collision with other inner class name */
        public static final class C2953b extends a {

            /* renamed from: b  reason: collision with root package name */
            private final String f118458b;

            /* renamed from: c  reason: collision with root package name */
            private final List<String> f118459c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2953b(String str, List<String> list) {
                super(str, (DefaultConstructorMarker) null);
                C17542s.j(str, "errorCode");
                C17542s.j(list, "invalidItems");
                this.f118458b = str;
                this.f118459c = list;
            }

            public String a() {
                return this.f118458b;
            }

            public final List<String> b() {
                return this.f118459c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2953b)) {
                    return false;
                }
                C2953b bVar = (C2953b) obj;
                return C17542s.e(this.f118458b, bVar.f118458b) && C17542s.e(this.f118459c, bVar.f118459c);
            }

            public int hashCode() {
                return (this.f118458b.hashCode() * 31) + this.f118459c.hashCode();
            }

            public String toString() {
                String str = this.f118458b;
                List<String> list = this.f118459c;
                return "InvalidItems(errorCode=" + str + ", invalidItems=" + list + ")";
            }
        }

        public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public String a() {
            return this.f118456a;
        }

        private a(String str) {
            this.f118456a = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LaB/b$b;", "", "", "code", "errorMessage", "", "itemNos", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "b", "getErrorMessage", "c", "Ljava/util/List;", "getItemNos", "()Ljava/util/List;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aB.b$b  reason: collision with other inner class name */
    private static final class C2954b extends Throwable {

        /* renamed from: a  reason: collision with root package name */
        private final String f118460a;

        /* renamed from: b  reason: collision with root package name */
        private final String f118461b;

        /* renamed from: c  reason: collision with root package name */
        private final List<String> f118462c;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C2954b(java.lang.String r12, java.lang.String r13, java.util.List<java.lang.String> r14) {
            /*
                r11 = this;
                java.lang.String r0 = "itemNos"
                kotlin.jvm.internal.C17542s.j(r14, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                if (r12 == 0) goto L_0x0020
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ",code: "
                r1.append(r2)
                r1.append(r12)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x0020:
                if (r13 == 0) goto L_0x0036
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ",message: "
                r1.append(r2)
                r1.append(r13)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x0036:
                r1 = r14
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L_0x0068
                r2 = r14
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                aB.c r8 = new aB.c
                r8.<init>()
                r9 = 30
                r10 = 0
                java.lang.String r3 = ";"
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                java.lang.String r1 = YH.C16877v.G0(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = ",items: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.append(r1)
            L_0x0068:
                java.lang.String r0 = r0.toString()
                r11.<init>(r0)
                r11.f118460a = r12
                r11.f118461b = r13
                r11.f118462c = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: aB.C13912b.C2954b.<init>(java.lang.String, java.lang.String, java.util.List):void");
        }

        /* access modifiers changed from: private */
        public static final CharSequence b(String str) {
            C17542s.j(str, "it");
            return str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"LaB/b$c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "S1", "S2", "S3", "S4", "S5", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aB.b$c */
    public enum c {
        S1("S1"),
        S2("S2"),
        S3("S3"),
        S4("S4"),
        S5("S5");
        
        private final String value;

        static {
            c[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private c(String str) {
            this.value = str;
        }

        public final String b() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"LaB/b$d;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "ILLEGAL_QUANTITY", "INTERNAL_ERROR", "INVALID_ITEM_NUMBER", "INVALID_LANGUAGE_ID", "INVALID_STORE_ID", "ITEM_NUMBER_NOT_UNIQUE", "LIST_NOT_FOUND", "ITEM_NUMBER_NOT_FOUND", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aB.b$d */
    private enum d {
        ILLEGAL_QUANTITY("ILLEGAL_QUANTITY"),
        INTERNAL_ERROR("INTERNAL_ERROR"),
        INVALID_ITEM_NUMBER("INVALID_ITEM_NUMBER"),
        INVALID_LANGUAGE_ID("INVALID_LANGUAGE_ID"),
        INVALID_STORE_ID("INVALID_STORE_ID"),
        ITEM_NUMBER_NOT_UNIQUE("ITEM_NUMBER_NOT_UNIQUE"),
        LIST_NOT_FOUND("LIST_NOT_FOUND"),
        ITEM_NUMBER_NOT_FOUND("ITEM_NUMBER_NOT_FOUND");
        
        private final String code;

        static {
            d[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private d(String str) {
            this.code = str;
        }

        public final String b() {
            return this.code;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LaB/b$e;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "EMPTY_NAME", "MAX_NAME_LENGTH", "NAME_CONFLICT", "MAX_CREATE_LIMIT", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aB.b$e */
    private enum e {
        EMPTY_NAME("EMPTY_NAME"),
        MAX_NAME_LENGTH("MAX_NAME_LENGTH"),
        NAME_CONFLICT("NAME_CONFLICT"),
        MAX_CREATE_LIMIT("MAX_CREATE_LIMIT");
        
        private final String code;

        static {
            e[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private e(String str) {
            this.code = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LaB/b$f;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "ITEM_NUMBER_NOT_FOUND", "INTERNAL_ERROR", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aB.b$f */
    private enum f {
        ITEM_NUMBER_NOT_FOUND("ITEM_NUMBER_NOT_FOUND"),
        INTERNAL_ERROR("INTERNAL_ERROR");
        
        private final String code;

        static {
            f[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private f(String str) {
            this.code = str;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aB.b$g */
    public /* synthetic */ class g {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f118468a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f118469b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f118470c;

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|(2:37|38)|39|41) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|(2:5|6)|7|9|10|11|12|13|(2:15|16)|17|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x008a */
        static {
            /*
                aB.b$f[] r0 = aB.C13912b.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                aB.b$f r2 = aB.C13912b.f.ITEM_NUMBER_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                aB.b$f r3 = aB.C13912b.f.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f118468a = r0
                aB.b$d[] r0 = aB.C13912b.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                aB.b$d r3 = aB.C13912b.d.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                aB.b$d r3 = aB.C13912b.d.ITEM_NUMBER_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                r3 = 3
                aB.b$d r4 = aB.C13912b.d.ILLEGAL_QUANTITY     // Catch:{ NoSuchFieldError -> 0x003b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                r4 = 4
                aB.b$d r5 = aB.C13912b.d.INVALID_ITEM_NUMBER     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                aB.b$d r5 = aB.C13912b.d.INVALID_LANGUAGE_ID     // Catch:{ NoSuchFieldError -> 0x004d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r6 = 5
                r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                aB.b$d r5 = aB.C13912b.d.INVALID_STORE_ID     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r6 = 6
                r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                aB.b$d r5 = aB.C13912b.d.ITEM_NUMBER_NOT_UNIQUE     // Catch:{ NoSuchFieldError -> 0x005f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r6 = 7
                r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                aB.b$d r5 = aB.C13912b.d.LIST_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r6 = 8
                r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                f118469b = r0
                aB.b$e[] r0 = aB.C13912b.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                aB.b$e r5 = aB.C13912b.e.EMPTY_NAME     // Catch:{ NoSuchFieldError -> 0x007a }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                aB.b$e r1 = aB.C13912b.e.MAX_NAME_LENGTH     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                aB.b$e r1 = aB.C13912b.e.NAME_CONFLICT     // Catch:{ NoSuchFieldError -> 0x008a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008a }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008a }
            L_0x008a:
                aB.b$e r1 = aB.C13912b.e.MAX_CREATE_LIMIT     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                f118470c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: aB.C13912b.g.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListEndpointImpl", f = "ShoppingListEndpointImpl.kt", l = {138, 149}, m = "addItem")
    /* renamed from: aB.b$h */
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f118471c;

        /* renamed from: d  reason: collision with root package name */
        Object f118472d;

        /* renamed from: e  reason: collision with root package name */
        Object f118473e;

        /* renamed from: f  reason: collision with root package name */
        Object f118474f;

        /* renamed from: g  reason: collision with root package name */
        Object f118475g;

        /* renamed from: h  reason: collision with root package name */
        Object f118476h;

        /* renamed from: i  reason: collision with root package name */
        Object f118477i;

        /* renamed from: j  reason: collision with root package name */
        Object f118478j;

        /* renamed from: k  reason: collision with root package name */
        Object f118479k;

        /* renamed from: l  reason: collision with root package name */
        Object f118480l;

        /* renamed from: m  reason: collision with root package name */
        Object f118481m;

        /* renamed from: n  reason: collision with root package name */
        Object f118482n;

        /* renamed from: o  reason: collision with root package name */
        int f118483o;

        /* renamed from: p  reason: collision with root package name */
        int f118484p;

        /* renamed from: q  reason: collision with root package name */
        int f118485q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f118486r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ C13912b f118487s;

        /* renamed from: t  reason: collision with root package name */
        int f118488t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C13912b bVar, C17164e<? super h> eVar) {
            super(eVar);
            this.f118487s = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118486r = obj;
            this.f118488t |= Integer.MIN_VALUE;
            return this.f118487s.e((SyncEventModel) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListEndpointImpl", f = "ShoppingListEndpointImpl.kt", l = {95}, m = "createShoppingList")
    /* renamed from: aB.b$i */
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f118489c;

        /* renamed from: d  reason: collision with root package name */
        Object f118490d;

        /* renamed from: e  reason: collision with root package name */
        Object f118491e;

        /* renamed from: f  reason: collision with root package name */
        Object f118492f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f118493g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C13912b f118494h;

        /* renamed from: i  reason: collision with root package name */
        int f118495i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C13912b bVar, C17164e<? super i> eVar) {
            super(eVar);
            this.f118494h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118493g = obj;
            this.f118495i |= Integer.MIN_VALUE;
            return this.f118494h.a((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListEndpointImpl", f = "ShoppingListEndpointImpl.kt", l = {114}, m = "deleteShoppingList")
    /* renamed from: aB.b$j */
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f118496c;

        /* renamed from: d  reason: collision with root package name */
        Object f118497d;

        /* renamed from: e  reason: collision with root package name */
        Object f118498e;

        /* renamed from: f  reason: collision with root package name */
        Object f118499f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f118500g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C13912b f118501h;

        /* renamed from: i  reason: collision with root package name */
        int f118502i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C13912b bVar, C17164e<? super j> eVar) {
            super(eVar);
            this.f118501h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118500g = obj;
            this.f118502i |= Integer.MIN_VALUE;
            return this.f118501h.d((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListEndpointImpl", f = "ShoppingListEndpointImpl.kt", l = {167}, m = "doAddItemMutation")
    /* renamed from: aB.b$k */
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f118503c;

        /* renamed from: d  reason: collision with root package name */
        Object f118504d;

        /* renamed from: e  reason: collision with root package name */
        Object f118505e;

        /* renamed from: f  reason: collision with root package name */
        Object f118506f;

        /* renamed from: g  reason: collision with root package name */
        Object f118507g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f118508h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C13912b f118509i;

        /* renamed from: j  reason: collision with root package name */
        int f118510j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C13912b bVar, C17164e<? super k> eVar) {
            super(eVar);
            this.f118509i = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118508h = obj;
            this.f118510j |= Integer.MIN_VALUE;
            return this.f118509i.o((String) null, (List<Bh.a>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListEndpointImpl", f = "ShoppingListEndpointImpl.kt", l = {306}, m = "getShoppingListWithItems")
    /* renamed from: aB.b$l */
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f118511c;

        /* renamed from: d  reason: collision with root package name */
        Object f118512d;

        /* renamed from: e  reason: collision with root package name */
        Object f118513e;

        /* renamed from: f  reason: collision with root package name */
        Object f118514f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f118515g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C13912b f118516h;

        /* renamed from: i  reason: collision with root package name */
        int f118517i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(C13912b bVar, C17164e<? super l> eVar) {
            super(eVar);
            this.f118516h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118515g = obj;
            this.f118517i |= Integer.MIN_VALUE;
            return this.f118516h.h((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListEndpointImpl", f = "ShoppingListEndpointImpl.kt", l = {66}, m = "getShoppingListsAndItems")
    /* renamed from: aB.b$m */
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f118518c;

        /* renamed from: d  reason: collision with root package name */
        Object f118519d;

        /* renamed from: e  reason: collision with root package name */
        Object f118520e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f118521f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C13912b f118522g;

        /* renamed from: h  reason: collision with root package name */
        int f118523h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(C13912b bVar, C17164e<? super m> eVar) {
            super(eVar);
            this.f118522g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118521f = obj;
            this.f118523h |= Integer.MIN_VALUE;
            return this.f118522g.i(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListEndpointImpl", f = "ShoppingListEndpointImpl.kt", l = {220}, m = "handleInvalidItems")
    /* renamed from: aB.b$n */
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f118524c;

        /* renamed from: d  reason: collision with root package name */
        Object f118525d;

        /* renamed from: e  reason: collision with root package name */
        Object f118526e;

        /* renamed from: f  reason: collision with root package name */
        Object f118527f;

        /* renamed from: g  reason: collision with root package name */
        Object f118528g;

        /* renamed from: h  reason: collision with root package name */
        Object f118529h;

        /* renamed from: i  reason: collision with root package name */
        Object f118530i;

        /* renamed from: j  reason: collision with root package name */
        Object f118531j;

        /* renamed from: k  reason: collision with root package name */
        Object f118532k;

        /* renamed from: l  reason: collision with root package name */
        Object f118533l;

        /* renamed from: m  reason: collision with root package name */
        int f118534m;

        /* renamed from: n  reason: collision with root package name */
        int f118535n;

        /* renamed from: o  reason: collision with root package name */
        /* synthetic */ Object f118536o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ C13912b f118537p;

        /* renamed from: q  reason: collision with root package name */
        int f118538q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(C13912b bVar, C17164e<? super n> eVar) {
            super(eVar);
            this.f118537p = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118536o = obj;
            this.f118538q |= Integer.MIN_VALUE;
            return this.f118537p.r((List<Bh.a>) null, (a.C2953b) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListEndpointImpl", f = "ShoppingListEndpointImpl.kt", l = {246}, m = "removeItem")
    /* renamed from: aB.b$o */
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f118539c;

        /* renamed from: d  reason: collision with root package name */
        Object f118540d;

        /* renamed from: e  reason: collision with root package name */
        Object f118541e;

        /* renamed from: f  reason: collision with root package name */
        Object f118542f;

        /* renamed from: g  reason: collision with root package name */
        Object f118543g;

        /* renamed from: h  reason: collision with root package name */
        Object f118544h;

        /* renamed from: i  reason: collision with root package name */
        Object f118545i;

        /* renamed from: j  reason: collision with root package name */
        Object f118546j;

        /* renamed from: k  reason: collision with root package name */
        Object f118547k;

        /* renamed from: l  reason: collision with root package name */
        Object f118548l;

        /* renamed from: m  reason: collision with root package name */
        Object f118549m;

        /* renamed from: n  reason: collision with root package name */
        Object f118550n;

        /* renamed from: o  reason: collision with root package name */
        int f118551o;

        /* renamed from: p  reason: collision with root package name */
        int f118552p;

        /* renamed from: q  reason: collision with root package name */
        int f118553q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f118554r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ C13912b f118555s;

        /* renamed from: t  reason: collision with root package name */
        int f118556t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(C13912b bVar, C17164e<? super o> eVar) {
            super(eVar);
            this.f118555s = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118554r = obj;
            this.f118556t |= Integer.MIN_VALUE;
            return this.f118555s.f((SyncEventModel) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListEndpointImpl", f = "ShoppingListEndpointImpl.kt", l = {104}, m = "renameShoppingList")
    /* renamed from: aB.b$p */
    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f118557c;

        /* renamed from: d  reason: collision with root package name */
        Object f118558d;

        /* renamed from: e  reason: collision with root package name */
        Object f118559e;

        /* renamed from: f  reason: collision with root package name */
        Object f118560f;

        /* renamed from: g  reason: collision with root package name */
        Object f118561g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f118562h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C13912b f118563i;

        /* renamed from: j  reason: collision with root package name */
        int f118564j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(C13912b bVar, C17164e<? super p> eVar) {
            super(eVar);
            this.f118563i = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118562h = obj;
            this.f118564j |= Integer.MIN_VALUE;
            return this.f118563i.c((String) null, (String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListEndpointImpl", f = "ShoppingListEndpointImpl.kt", l = {279}, m = "updateItem")
    /* renamed from: aB.b$q */
    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f118565c;

        /* renamed from: d  reason: collision with root package name */
        Object f118566d;

        /* renamed from: e  reason: collision with root package name */
        Object f118567e;

        /* renamed from: f  reason: collision with root package name */
        Object f118568f;

        /* renamed from: g  reason: collision with root package name */
        Object f118569g;

        /* renamed from: h  reason: collision with root package name */
        Object f118570h;

        /* renamed from: i  reason: collision with root package name */
        Object f118571i;

        /* renamed from: j  reason: collision with root package name */
        Object f118572j;

        /* renamed from: k  reason: collision with root package name */
        Object f118573k;

        /* renamed from: l  reason: collision with root package name */
        Object f118574l;

        /* renamed from: m  reason: collision with root package name */
        Object f118575m;

        /* renamed from: n  reason: collision with root package name */
        Object f118576n;

        /* renamed from: o  reason: collision with root package name */
        int f118577o;

        /* renamed from: p  reason: collision with root package name */
        int f118578p;

        /* renamed from: q  reason: collision with root package name */
        int f118579q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f118580r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ C13912b f118581s;

        /* renamed from: t  reason: collision with root package name */
        int f118582t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(C13912b bVar, C17164e<? super q> eVar) {
            super(eVar);
            this.f118581s = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118580r = obj;
            this.f118582t |= Integer.MIN_VALUE;
            return this.f118581s.g((SyncEventModel) null, this);
        }
    }

    public C13912b(b bVar, C13673c cVar, Il.a aVar, tw.g gVar) {
        C17542s.j(bVar, "apolloClient");
        C17542s.j(cVar, "shoppingListDevAnalytics");
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(gVar, "networkParameters");
        this.f118452a = bVar;
        this.f118453b = cVar;
        this.f118454c = aVar;
        this.f118455d = gVar;
    }

    private final void k(C9045a aVar) {
        C9045a.C0961a a10;
        if (aVar == null || (a10 = aVar.a()) == null || a10.a() == null) {
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a11 = C11818a.a("No userId in response", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str = C11820c.a(a11);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = C13912b.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            throw C13914d.b.f118584a;
        }
    }

    private final void l(List<M6.o> list, C13671a aVar) {
        String t10 = t(list);
        if (t10 == null || t10.length() == 0) {
            w("200", aVar);
        } else {
            w(t10, aVar);
            throw p(t10);
        }
    }

    private final void m(List<M6.o> list) {
        Throwable th2;
        String t10 = t(list);
        if (t10 != null && t10.length() != 0) {
            try {
                int i10 = g.f118468a[f.valueOf(t10).ordinal()];
                if (i10 == 1) {
                    th2 = C13914d.a.f118583a;
                } else if (i10 != 2) {
                    throw new t();
                } else {
                    th2 = C13914d.b.f118584a;
                }
            } catch (IllegalArgumentException e10) {
                qv.e eVar = qv.e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("Unknown error code: " + t10, e10);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = C13912b.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, e10, str3);
                    str = str3;
                    str2 = str4;
                }
                th2 = C13914d.b.f118584a;
            }
            throw th2;
        }
    }

    private final void n(List<M6.o> list) {
        Throwable th2;
        String t10 = t(list);
        if (t10 != null && t10.length() != 0) {
            try {
                int i10 = g.f118470c[e.valueOf(t10).ordinal()];
                if (i10 == 1) {
                    th2 = j.a.f127291a;
                } else if (i10 == 2) {
                    th2 = j.b.f127292a;
                } else if (i10 == 3) {
                    th2 = j.d.f127294a;
                } else if (i10 != 4) {
                    throw new t();
                } else {
                    th2 = j.c.f127293a;
                }
            } catch (IllegalArgumentException unused) {
                th2 = j.e.f127295a;
            }
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089 A[Catch:{ a -> 0x0178 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a8 A[Catch:{ a -> 0x0178 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.String r12, java.util.List<Bh.a> r13, dI.C17164e<? super bB.f> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof aB.C13912b.k
            if (r0 == 0) goto L_0x0013
            r0 = r14
            aB.b$k r0 = (aB.C13912b.k) r0
            int r1 = r0.f118510j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f118510j = r1
            goto L_0x0018
        L_0x0013:
            aB.b$k r0 = new aB.b$k
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f118508h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f118510j
            r4 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r12 = r0.f118507g
            yh.a r12 = (yh.C10477a) r12
            java.lang.Object r12 = r0.f118506f
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f118505e
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r0.f118504d
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.f118503c
            aB.b r12 = (aB.C13912b) r12
            XH.y.b(r1)     // Catch:{ a -> 0x0178 }
            goto L_0x007c
        L_0x003d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0045:
            XH.y.b(r1)
            yh.a r1 = new yh.a
            Bh.b r3 = new Bh.b
            tw.g r5 = r11.f118455d
            java.lang.String r6 = r5.a()
            r9 = 6
            r10 = 0
            r7 = 0
            r8 = 0
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            M6.y$c r5 = new M6.y$c
            r5.<init>(r12)
            r1.<init>(r3, r5, r13)
            L6.b r3 = r11.f118452a     // Catch:{ a -> 0x0178 }
            L6.a r3 = r3.l(r1)     // Catch:{ a -> 0x0178 }
            r0.f118503c = r11     // Catch:{ a -> 0x0178 }
            r0.f118504d = r12     // Catch:{ a -> 0x0178 }
            r0.f118505e = r13     // Catch:{ a -> 0x0178 }
            r0.f118506f = r14     // Catch:{ a -> 0x0178 }
            r0.f118507g = r1     // Catch:{ a -> 0x0178 }
            r0.f118510j = r4     // Catch:{ a -> 0x0178 }
            java.lang.Object r1 = r3.a(r0)     // Catch:{ a -> 0x0178 }
            if (r1 != r2) goto L_0x007b
            return r2
        L_0x007b:
            r12 = r11
        L_0x007c:
            M6.g r1 = (M6.g) r1     // Catch:{ a -> 0x0178 }
            TA.a r13 = TA.C13671a.ADD_ITEM     // Catch:{ a -> 0x0178 }
            r12.v(r1, r13)     // Catch:{ a -> 0x0178 }
            D r13 = r1.f38571c     // Catch:{ a -> 0x0178 }
            yh.a$c r13 = (yh.C10477a.c) r13     // Catch:{ a -> 0x0178 }
            if (r13 == 0) goto L_0x00a8
            yh.a$a r13 = r13.a()     // Catch:{ a -> 0x0178 }
            Ah.t r13 = r13.b()     // Catch:{ a -> 0x0178 }
            Il.a r14 = r12.f118454c     // Catch:{ a -> 0x0178 }
            Rl.g r14 = r14.u()     // Catch:{ a -> 0x0178 }
            Il.a r0 = r12.f118454c     // Catch:{ a -> 0x0178 }
            boolean r0 = r0.m()     // Catch:{ a -> 0x0178 }
            Il.a r12 = r12.f118454c     // Catch:{ a -> 0x0178 }
            kp.d r12 = r12.s()     // Catch:{ a -> 0x0178 }
            bB.f r12 = ZA.C13872b.n(r13, r14, r0, r12)     // Catch:{ a -> 0x0178 }
            return r12
        L_0x00a8:
            java.util.List<M6.o> r13 = r1.f38572d     // Catch:{ a -> 0x0178 }
            java.lang.String r13 = r12.t(r13)     // Catch:{ a -> 0x0178 }
            if (r13 == 0) goto L_0x00bf
            int r14 = r13.length()     // Catch:{ a -> 0x0178 }
            if (r14 != 0) goto L_0x00b7
            goto L_0x00bf
        L_0x00b7:
            java.util.List<M6.o> r14 = r1.f38572d     // Catch:{ a -> 0x0178 }
            aB.b$a r12 = r12.q(r14, r13)     // Catch:{ a -> 0x0178 }
            goto L_0x0177
        L_0x00bf:
            qv.e r12 = qv.e.WARN     // Catch:{ a -> 0x0178 }
            qv.d r13 = qv.d.f102012a     // Catch:{ a -> 0x0178 }
            java.util.List r13 = r13.a()     // Catch:{ a -> 0x0178 }
            java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch:{ a -> 0x0178 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ a -> 0x0178 }
            r14.<init>()     // Catch:{ a -> 0x0178 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ a -> 0x0178 }
        L_0x00d2:
            boolean r0 = r13.hasNext()     // Catch:{ a -> 0x0178 }
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r0 = r13.next()     // Catch:{ a -> 0x0178 }
            r2 = r0
            qv.b r2 = (qv.C11819b) r2     // Catch:{ a -> 0x0178 }
            r3 = 0
            boolean r2 = r2.b(r12, r3)     // Catch:{ a -> 0x0178 }
            if (r2 == 0) goto L_0x00d2
            r14.add(r0)     // Catch:{ a -> 0x0178 }
            goto L_0x00d2
        L_0x00ea:
            java.util.Iterator r13 = r14.iterator()     // Catch:{ a -> 0x0178 }
            r14 = 0
            r0 = r14
            r2 = r0
        L_0x00f1:
            boolean r3 = r13.hasNext()     // Catch:{ a -> 0x0178 }
            if (r3 == 0) goto L_0x0175
            java.lang.Object r3 = r13.next()     // Catch:{ a -> 0x0178 }
            r5 = r3
            qv.b r5 = (qv.C11819b) r5     // Catch:{ a -> 0x0178 }
            r9 = 0
            if (r0 != 0) goto L_0x011e
            java.util.List<M6.o> r0 = r1.f38572d     // Catch:{ a -> 0x0178 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ a -> 0x0178 }
            r3.<init>()     // Catch:{ a -> 0x0178 }
            java.lang.String r6 = "Unknown error: "
            r3.append(r6)     // Catch:{ a -> 0x0178 }
            r3.append(r0)     // Catch:{ a -> 0x0178 }
            java.lang.String r0 = r3.toString()     // Catch:{ a -> 0x0178 }
            java.lang.String r0 = qv.C11818a.a(r0, r9)     // Catch:{ a -> 0x0178 }
            if (r0 == 0) goto L_0x0175
            java.lang.String r0 = qv.C11820c.a(r0)     // Catch:{ a -> 0x0178 }
        L_0x011e:
            if (r2 != 0) goto L_0x016c
            java.lang.Class<aB.b> r2 = aB.C13912b.class
            java.lang.String r2 = r2.getName()     // Catch:{ a -> 0x0178 }
            kotlin.jvm.internal.C17542s.g(r2)     // Catch:{ a -> 0x0178 }
            r3 = 36
            r6 = 2
            java.lang.String r3 = HJ.C15854t.s1(r2, r3, r14, r6, r14)     // Catch:{ a -> 0x0178 }
            r7 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r7, r14, r6, r14)     // Catch:{ a -> 0x0178 }
            int r6 = r3.length()     // Catch:{ a -> 0x0178 }
            if (r6 != 0) goto L_0x013d
            goto L_0x0143
        L_0x013d:
            java.lang.String r2 = "Kt"
            java.lang.String r2 = HJ.C15854t.P0(r3, r2)     // Catch:{ a -> 0x0178 }
        L_0x0143:
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ a -> 0x0178 }
            java.lang.String r3 = r3.getName()     // Catch:{ a -> 0x0178 }
            java.lang.String r6 = "main"
            boolean r3 = HJ.C15854t.b0(r3, r6, r4)     // Catch:{ a -> 0x0178 }
            if (r3 == 0) goto L_0x0156
            java.lang.String r3 = "m"
            goto L_0x0158
        L_0x0156:
            java.lang.String r3 = "b"
        L_0x0158:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ a -> 0x0178 }
            r6.<init>()     // Catch:{ a -> 0x0178 }
            r6.append(r3)     // Catch:{ a -> 0x0178 }
            java.lang.String r3 = "|"
            r6.append(r3)     // Catch:{ a -> 0x0178 }
            r6.append(r2)     // Catch:{ a -> 0x0178 }
            java.lang.String r2 = r6.toString()     // Catch:{ a -> 0x0178 }
        L_0x016c:
            r8 = 0
            r6 = r12
            r7 = r2
            r10 = r0
            r5.a(r6, r7, r8, r9, r10)     // Catch:{ a -> 0x0178 }
            goto L_0x00f1
        L_0x0175:
            aB.d$b r12 = aB.C13914d.b.f118584a     // Catch:{ a -> 0x0178 }
        L_0x0177:
            throw r12     // Catch:{ a -> 0x0178 }
        L_0x0178:
            aB.d$b r12 = aB.C13914d.b.f118584a
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: aB.C13912b.o(java.lang.String, java.util.List, dI.e):java.lang.Object");
    }

    private final C13914d p(String str) {
        try {
            switch (g.f118469b[d.valueOf(str).ordinal()]) {
                case 1:
                    return C13914d.b.f118584a;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return C13914d.a.f118583a;
                default:
                    throw new t();
            }
        } catch (IllegalArgumentException e10) {
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a("Unknown error code: " + str, e10);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = C13912b.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, e10, str4);
                str2 = str4;
                str3 = str5;
            }
            return C13914d.a.f118583a;
        }
    }

    private final a q(List<M6.o> list, String str) {
        return C17542s.e(str, d.INVALID_ITEM_NUMBER.b()) ? new a.C2953b(str, u(list)) : new a.C2952a(str);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(java.util.List<Bh.a> r10, aB.C13912b.a.C2953b r11, java.lang.String r12, dI.C17164e<? super bB.f> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof aB.C13912b.n
            if (r0 == 0) goto L_0x0013
            r0 = r13
            aB.b$n r0 = (aB.C13912b.n) r0
            int r1 = r0.f118538q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f118538q = r1
            goto L_0x0018
        L_0x0013:
            aB.b$n r0 = new aB.b$n
            r0.<init>(r9, r13)
        L_0x0018:
            java.lang.Object r1 = r0.f118536o
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f118538q
            r4 = 1
            if (r3 == 0) goto L_0x005b
            if (r3 != r4) goto L_0x0053
            java.lang.Object r10 = r0.f118533l
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r10 = r0.f118532k
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r10 = r0.f118531j
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r10 = r0.f118530i
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r10 = r0.f118529h
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = r0.f118528g
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f118527f
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f118526e
            aB.b$a$b r10 = (aB.C13912b.a.C2953b) r10
            java.lang.Object r10 = r0.f118525d
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = r0.f118524c
            aB.b r10 = (aB.C13912b) r10
            XH.y.b(r1)     // Catch:{ a -> 0x0051 }
            goto L_0x00b4
        L_0x0051:
            r11 = move-exception
            goto L_0x00b8
        L_0x0053:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x005b:
            XH.y.b(r1)
            r1 = r10
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ a -> 0x0089 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ a -> 0x0089 }
            r3.<init>()     // Catch:{ a -> 0x0089 }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ a -> 0x0089 }
        L_0x006a:
            boolean r6 = r5.hasNext()     // Catch:{ a -> 0x0089 }
            if (r6 == 0) goto L_0x008c
            java.lang.Object r6 = r5.next()     // Catch:{ a -> 0x0089 }
            r7 = r6
            Bh.a r7 = (Bh.a) r7     // Catch:{ a -> 0x0089 }
            java.util.List r8 = r11.b()     // Catch:{ a -> 0x0089 }
            java.lang.String r7 = r7.a()     // Catch:{ a -> 0x0089 }
            boolean r7 = r8.contains(r7)     // Catch:{ a -> 0x0089 }
            if (r7 != 0) goto L_0x006a
            r3.add(r6)     // Catch:{ a -> 0x0089 }
            goto L_0x006a
        L_0x0089:
            r11 = move-exception
            r10 = r9
            goto L_0x00b8
        L_0x008c:
            boolean r6 = r3.isEmpty()     // Catch:{ a -> 0x0089 }
            if (r6 != 0) goto L_0x00b5
            r0.f118524c = r9     // Catch:{ a -> 0x0089 }
            r0.f118525d = r10     // Catch:{ a -> 0x0089 }
            r0.f118526e = r11     // Catch:{ a -> 0x0089 }
            r0.f118527f = r12     // Catch:{ a -> 0x0089 }
            r0.f118528g = r13     // Catch:{ a -> 0x0089 }
            r0.f118529h = r3     // Catch:{ a -> 0x0089 }
            r0.f118530i = r1     // Catch:{ a -> 0x0089 }
            r0.f118531j = r1     // Catch:{ a -> 0x0089 }
            r0.f118532k = r3     // Catch:{ a -> 0x0089 }
            r0.f118533l = r5     // Catch:{ a -> 0x0089 }
            r10 = 0
            r0.f118534m = r10     // Catch:{ a -> 0x0089 }
            r0.f118535n = r10     // Catch:{ a -> 0x0089 }
            r0.f118538q = r4     // Catch:{ a -> 0x0089 }
            java.lang.Object r1 = r9.o(r12, r3, r0)     // Catch:{ a -> 0x0089 }
            if (r1 != r2) goto L_0x00b4
            return r2
        L_0x00b4:
            return r1
        L_0x00b5:
            aB.d$a r10 = aB.C13914d.a.f118583a     // Catch:{ a -> 0x0089 }
            throw r10     // Catch:{ a -> 0x0089 }
        L_0x00b8:
            java.lang.String r11 = r11.a()
            aB.d r10 = r10.p(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: aB.C13912b.r(java.util.List, aB.b$a$b, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r2 = r2.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void s(java.lang.String r13, java.util.List<M6.o> r14) {
        /*
            r12 = this;
            r0 = r14
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00dd
            aB.b$b r0 = new aB.b$b
            java.lang.String r1 = r12.t(r14)
            java.lang.Object r2 = YH.C16877v.y0(r14)
            M6.o r2 = (M6.o) r2
            r7 = 0
            if (r2 == 0) goto L_0x0025
            java.util.Map r2 = r2.a()
            if (r2 == 0) goto L_0x0025
            java.lang.String r3 = "message"
            java.lang.Object r2 = r2.get(r3)
            goto L_0x0026
        L_0x0025:
            r2 = r7
        L_0x0026:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x002d
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x002e
        L_0x002d:
            r2 = r7
        L_0x002e:
            java.util.List r14 = r12.u(r14)
            r0.<init>(r1, r2, r14)
            qv.e r14 = qv.e.WARN
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0048:
            boolean r3 = r1.hasNext()
            r8 = 0
            if (r3 == 0) goto L_0x0060
            java.lang.Object r3 = r1.next()
            r4 = r3
            qv.b r4 = (qv.C11819b) r4
            boolean r4 = r4.b(r14, r8)
            if (r4 == 0) goto L_0x0048
            r2.add(r3)
            goto L_0x0048
        L_0x0060:
            java.util.Iterator r9 = r2.iterator()
            r1 = r7
            r2 = r1
        L_0x0066:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x00dd
            java.lang.Object r3 = r9.next()
            qv.b r3 = (qv.C11819b) r3
            if (r1 != 0) goto L_0x0080
            java.lang.String r1 = qv.C11818a.a(r13, r0)
            if (r1 != 0) goto L_0x007c
            goto L_0x00dd
        L_0x007c:
            java.lang.String r1 = qv.C11820c.a(r1)
        L_0x0080:
            r10 = r1
            if (r2 != 0) goto L_0x00d0
            java.lang.Class<aB.b> r1 = aB.C13912b.class
            java.lang.String r1 = r1.getName()
            kotlin.jvm.internal.C17542s.g(r1)
            r2 = 36
            r4 = 2
            java.lang.String r2 = HJ.C15854t.s1(r1, r2, r7, r4, r7)
            r5 = 46
            java.lang.String r2 = HJ.C15854t.o1(r2, r5, r7, r4, r7)
            int r4 = r2.length()
            if (r4 != 0) goto L_0x00a0
            goto L_0x00a6
        L_0x00a0:
            java.lang.String r1 = "Kt"
            java.lang.String r1 = HJ.C15854t.P0(r2, r1)
        L_0x00a6:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = "main"
            r5 = 1
            boolean r2 = HJ.C15854t.b0(r2, r4, r5)
            if (r2 == 0) goto L_0x00ba
            java.lang.String r2 = "m"
            goto L_0x00bc
        L_0x00ba:
            java.lang.String r2 = "b"
        L_0x00bc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "|"
            r4.append(r2)
            r4.append(r1)
            java.lang.String r2 = r4.toString()
        L_0x00d0:
            r11 = r2
            r1 = r3
            r2 = r14
            r3 = r11
            r4 = r8
            r5 = r0
            r6 = r10
            r1.a(r2, r3, r4, r5, r6)
            r1 = r10
            r2 = r11
            goto L_0x0066
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aB.C13912b.s(java.lang.String, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r3 = (r3 = (M6.o) YH.C16877v.y0(r3)).a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String t(java.util.List<M6.o> r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0018
            java.lang.Object r3 = YH.C16877v.y0(r3)
            M6.o r3 = (M6.o) r3
            if (r3 == 0) goto L_0x0018
            java.util.Map r3 = r3.a()
            if (r3 == 0) goto L_0x0018
            java.lang.String r1 = "code"
            java.lang.Object r3 = r3.get(r1)
            goto L_0x0019
        L_0x0018:
            r3 = r0
        L_0x0019:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L_0x0020
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aB.C13912b.t(java.util.List):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r5 = (r5 = (M6.o) YH.C16877v.y0(r5)).a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> u(java.util.List<M6.o> r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x0018
            java.lang.Object r5 = YH.C16877v.y0(r5)
            M6.o r5 = (M6.o) r5
            if (r5 == 0) goto L_0x0018
            java.util.Map r5 = r5.a()
            if (r5 == 0) goto L_0x0018
            java.lang.String r1 = "data"
            java.lang.Object r5 = r5.get(r1)
            goto L_0x0019
        L_0x0018:
            r5 = r0
        L_0x0019:
            boolean r1 = r5 instanceof java.util.Map
            if (r1 == 0) goto L_0x0020
            java.util.Map r5 = (java.util.Map) r5
            goto L_0x0021
        L_0x0020:
            r5 = r0
        L_0x0021:
            if (r5 != 0) goto L_0x0028
            java.util.List r5 = YH.C16877v.n()
            return r5
        L_0x0028:
            java.lang.String r1 = "itemNos"
            java.lang.Object r5 = r5.get(r1)
            boolean r1 = r5 instanceof java.util.List
            if (r1 == 0) goto L_0x0035
            java.util.List r5 = (java.util.List) r5
            goto L_0x0036
        L_0x0035:
            r5 = r0
        L_0x0036:
            if (r5 == 0) goto L_0x005b
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0043:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x005f
            java.lang.Object r2 = r5.next()
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x0054
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0055
        L_0x0054:
            r2 = r0
        L_0x0055:
            if (r2 == 0) goto L_0x0043
            r1.add(r2)
            goto L_0x0043
        L_0x005b:
            java.util.List r1 = YH.C16877v.n()
        L_0x005f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: aB.C13912b.u(java.util.List):java.util.List");
    }

    private final <D extends w.a> void v(M6.g<D> gVar, C13671a aVar) {
        String t10 = t(gVar.f38572d);
        if (t10 != null && t10.length() != 0) {
            w(t10, aVar);
        } else if (gVar.f38571c == null) {
            w("Data is null", aVar);
        } else {
            w("200", aVar);
        }
    }

    private final void w(String str, C13671a aVar) {
        this.f118453b.a(str, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, dI.C17164e<? super bB.b> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof aB.C13912b.i
            if (r0 == 0) goto L_0x0013
            r0 = r7
            aB.b$i r0 = (aB.C13912b.i) r0
            int r1 = r0.f118495i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f118495i = r1
            goto L_0x0018
        L_0x0013:
            aB.b$i r0 = new aB.b$i
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f118493g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f118495i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r6 = r0.f118492f
            yh.b r6 = (yh.C10478b) r6
            java.lang.Object r6 = r0.f118491e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f118490d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f118489c
            aB.b r6 = (aB.C13912b) r6
            XH.y.b(r1)
            goto L_0x0061
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            XH.y.b(r1)
            yh.b r1 = new yh.b
            r1.<init>(r6)
            L6.b r3 = r5.f118452a
            L6.a r3 = r3.l(r1)
            r0.f118489c = r5
            r0.f118490d = r6
            r0.f118491e = r7
            r0.f118492f = r1
            r0.f118495i = r4
            java.lang.Object r1 = r3.a(r0)
            if (r1 != r2) goto L_0x0060
            return r2
        L_0x0060:
            r6 = r5
        L_0x0061:
            M6.g r1 = (M6.g) r1
            java.util.List<M6.o> r7 = r1.f38572d
            r6.n(r7)
            D r6 = r1.f38571c
            yh.b$c r6 = (yh.C10478b.c) r6
            if (r6 == 0) goto L_0x0089
            yh.b$b r6 = r6.a()
            if (r6 == 0) goto L_0x0089
            java.lang.String r7 = r6.a()
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r6 = 0
        L_0x0080:
            if (r6 == 0) goto L_0x0089
            bB.b r6 = ZA.C13872b.l(r6)
            if (r6 == 0) goto L_0x0089
            return r6
        L_0x0089:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Unable to create list, no id returned"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: aB.C13912b.a(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        r6 = r6.a();
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.String r6, java.lang.String r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof aB.C13912b.p
            if (r0 == 0) goto L_0x0013
            r0 = r8
            aB.b$p r0 = (aB.C13912b.p) r0
            int r1 = r0.f118564j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f118564j = r1
            goto L_0x0018
        L_0x0013:
            aB.b$p r0 = new aB.b$p
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f118562h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f118564j
            r4 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r6 = r0.f118561g
            yh.f r6 = (yh.C10482f) r6
            java.lang.Object r6 = r0.f118560f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f118559e
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f118558d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f118557c
            aB.b r6 = (aB.C13912b) r6
            XH.y.b(r1)
            goto L_0x0067
        L_0x003d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0045:
            XH.y.b(r1)
            yh.f r1 = new yh.f
            r1.<init>(r6, r7)
            L6.b r3 = r5.f118452a
            L6.a r3 = r3.l(r1)
            r0.f118557c = r5
            r0.f118558d = r6
            r0.f118559e = r7
            r0.f118560f = r8
            r0.f118561g = r1
            r0.f118564j = r4
            java.lang.Object r1 = r3.a(r0)
            if (r1 != r2) goto L_0x0066
            return r2
        L_0x0066:
            r6 = r5
        L_0x0067:
            M6.g r1 = (M6.g) r1
            java.util.List<M6.o> r7 = r1.f38572d
            r6.n(r7)
            D r6 = r1.f38571c
            yh.f$b r6 = (yh.C10482f.b) r6
            if (r6 == 0) goto L_0x007f
            yh.f$c r6 = r6.a()
            if (r6 == 0) goto L_0x007f
            java.lang.String r6 = r6.a()
            goto L_0x0080
        L_0x007f:
            r6 = 0
        L_0x0080:
            if (r6 == 0) goto L_0x008b
            int r6 = r6.length()
            if (r6 == 0) goto L_0x008b
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x008b:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Unable to rename list, no id returned"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: aB.C13912b.c(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(java.lang.String r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof aB.C13912b.j
            if (r0 == 0) goto L_0x0013
            r0 = r7
            aB.b$j r0 = (aB.C13912b.j) r0
            int r1 = r0.f118502i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f118502i = r1
            goto L_0x0018
        L_0x0013:
            aB.b$j r0 = new aB.b$j
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f118500g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f118502i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r6 = r0.f118499f
            yh.e r6 = (yh.C10481e) r6
            java.lang.Object r6 = r0.f118498e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f118497d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f118496c
            aB.b r6 = (aB.C13912b) r6
            XH.y.b(r1)
            goto L_0x0061
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            XH.y.b(r1)
            yh.e r1 = new yh.e
            r1.<init>(r6)
            L6.b r3 = r5.f118452a
            L6.a r3 = r3.l(r1)
            r0.f118496c = r5
            r0.f118497d = r6
            r0.f118498e = r7
            r0.f118499f = r1
            r0.f118502i = r4
            java.lang.Object r1 = r3.a(r0)
            if (r1 != r2) goto L_0x0060
            return r2
        L_0x0060:
            r6 = r5
        L_0x0061:
            M6.g r1 = (M6.g) r1
            java.util.List<M6.o> r7 = r1.f38572d
            r6.n(r7)
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: aB.C13912b.d(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r36, dI.C17164e<? super bB.f> r37) {
        /*
            r35 = this;
            r1 = r35
            r2 = r37
            boolean r0 = r2 instanceof aB.C13912b.h
            if (r0 == 0) goto L_0x0018
            r0 = r2
            aB.b$h r0 = (aB.C13912b.h) r0
            int r3 = r0.f118488t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r0.f118488t = r3
        L_0x0016:
            r3 = r0
            goto L_0x001e
        L_0x0018:
            aB.b$h r0 = new aB.b$h
            r0.<init>(r1, r2)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r3.f118486r
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r3.f118488t
            r6 = 1
            r7 = 2
            if (r5 == 0) goto L_0x00c1
            if (r5 == r6) goto L_0x006b
            if (r5 != r7) goto L_0x0063
            java.lang.Object r2 = r3.f118482n
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r2 = r3.f118481m
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = r3.f118480l
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r2 = r3.f118479k
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = r3.f118478j
            aB.b$a r2 = (aB.C13912b.a) r2
            java.lang.Object r2 = r3.f118477i
            aB.b$a r2 = (aB.C13912b.a) r2
            java.lang.Object r2 = r3.f118476h
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r3.f118475g
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r3.f118474f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r3.f118473e
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r3.f118472d
            com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r2 = (com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel) r2
            java.lang.Object r2 = r3.f118471c
            aB.b r2 = (aB.C13912b) r2
            XH.y.b(r0)
            goto L_0x02dd
        L_0x0063:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x006b:
            int r2 = r3.f118485q
            int r5 = r3.f118484p
            int r6 = r3.f118483o
            java.lang.Object r8 = r3.f118482n
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r3.f118481m
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r10 = r3.f118480l
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r11 = r3.f118479k
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r12 = r3.f118478j
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r12 = r3.f118477i
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r3.f118476h
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r3.f118475g
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r14 = r3.f118474f
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r3.f118473e
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r7 = r3.f118472d
            com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r7 = (com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel) r7
            r36 = r2
            java.lang.Object r2 = r3.f118471c
            aB.b r2 = (aB.C13912b) r2
            XH.y.b(r0)     // Catch:{ a -> 0x00af }
            r20 = r36
            r34 = r7
            r7 = r4
            r4 = r34
            goto L_0x0266
        L_0x00af:
            r0 = move-exception
            r1 = r0
            r0 = r2
            r21 = r4
            r4 = r7
            r2 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r9
            r9 = r8
            r8 = r6
            r6 = r5
            r5 = r36
            goto L_0x02a8
        L_0x00c1:
            XH.y.b(r0)
            java.lang.String r14 = r36.d()
            java.util.List r12 = r36.c()
            java.lang.String r0 = "|"
            java.lang.String r5 = "b"
            java.lang.String r7 = "m"
            java.lang.String r8 = "main"
            java.lang.String r9 = "Kt"
            java.lang.Class<aB.b> r13 = aB.C13912b.class
            if (r12 == 0) goto L_0x02f1
            r10 = r12
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r6 = r10.iterator()
        L_0x00e6:
            boolean r19 = r6.hasNext()
            if (r19 == 0) goto L_0x021f
            java.lang.Object r19 = r6.next()
            r15 = r19
            com.ingka.ikea.shoppinglist.datalayer.impl.network.model.ShoppingBagRequestItem r15 = (com.ingka.ikea.shoppinglist.datalayer.impl.network.model.ShoppingBagRequestItem) r15
            r19 = r5
            java.lang.String r5 = r15.a()
            java.lang.String r21 = r15.b()
            java.lang.Integer r21 = HJ.C15854t.t(r21)
            if (r5 == 0) goto L_0x0124
            int r22 = r5.length()
            if (r22 != 0) goto L_0x010b
            goto L_0x0124
        L_0x010b:
            if (r21 == 0) goto L_0x0124
            Bh.a r15 = new Bh.a
            r22 = r7
            int r7 = r21.intValue()
            r15.<init>(r5, r7)
            r21 = r4
            r29 = r6
            r30 = r10
            r33 = r12
            r32 = r13
            goto L_0x020a
        L_0x0124:
            r22 = r7
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r21 = r4
            java.lang.String r4 = "Invalid item to add: "
            r7.append(r4)
            r7.append(r15)
            java.lang.String r4 = r7.toString()
            r5.<init>(r4)
            qv.e r4 = qv.e.ERROR
            qv.d r7 = qv.d.f102012a
            java.util.List r7 = r7.a()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0151:
            boolean r23 = r7.hasNext()
            if (r23 == 0) goto L_0x0175
            r29 = r6
            java.lang.Object r6 = r7.next()
            r23 = r7
            r7 = r6
            qv.b r7 = (qv.C11819b) r7
            r30 = r10
            r10 = 0
            boolean r7 = r7.b(r4, r10)
            if (r7 == 0) goto L_0x016e
            r15.add(r6)
        L_0x016e:
            r7 = r23
            r6 = r29
            r10 = r30
            goto L_0x0151
        L_0x0175:
            r29 = r6
            r30 = r10
            java.util.Iterator r6 = r15.iterator()
            r7 = 0
            r10 = 0
        L_0x017f:
            boolean r15 = r6.hasNext()
            if (r15 == 0) goto L_0x0196
            java.lang.Object r15 = r6.next()
            r23 = r15
            qv.b r23 = (qv.C11819b) r23
            r15 = 0
            if (r7 != 0) goto L_0x01a0
            java.lang.String r7 = qv.C11818a.a(r15, r5)
            if (r7 != 0) goto L_0x019c
        L_0x0196:
            r33 = r12
            r32 = r13
            goto L_0x0209
        L_0x019c:
            java.lang.String r7 = qv.C11820c.a(r7)
        L_0x01a0:
            if (r10 != 0) goto L_0x01ee
            java.lang.String r10 = r13.getName()
            kotlin.jvm.internal.C17542s.g(r10)
            r31 = r6
            r33 = r12
            r32 = r13
            r6 = 2
            r13 = 36
            java.lang.String r12 = HJ.C15854t.s1(r10, r13, r15, r6, r15)
            r13 = 46
            java.lang.String r12 = HJ.C15854t.o1(r12, r13, r15, r6, r15)
            int r6 = r12.length()
            if (r6 != 0) goto L_0x01c3
            goto L_0x01c7
        L_0x01c3:
            java.lang.String r10 = HJ.C15854t.P0(r12, r9)
        L_0x01c7:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r12 = 1
            boolean r6 = HJ.C15854t.b0(r6, r8, r12)
            if (r6 == 0) goto L_0x01d9
            r6 = r22
            goto L_0x01db
        L_0x01d9:
            r6 = r19
        L_0x01db:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r6)
            r12.append(r0)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            goto L_0x01f4
        L_0x01ee:
            r31 = r6
            r33 = r12
            r32 = r13
        L_0x01f4:
            r26 = 0
            r24 = r4
            r25 = r10
            r27 = r5
            r28 = r7
            r23.a(r24, r25, r26, r27, r28)
            r6 = r31
            r13 = r32
            r12 = r33
            goto L_0x017f
        L_0x0209:
            r15 = 0
        L_0x020a:
            if (r15 == 0) goto L_0x020f
            r11.add(r15)
        L_0x020f:
            r5 = r19
            r4 = r21
            r7 = r22
            r6 = r29
            r10 = r30
            r13 = r32
            r12 = r33
            goto L_0x00e6
        L_0x021f:
            r21 = r4
            r29 = r6
            r30 = r10
            r33 = r12
            r3.f118471c = r1     // Catch:{ a -> 0x02a4 }
            r4 = r36
            r3.f118472d = r4     // Catch:{ a -> 0x029a }
            r3.f118473e = r2     // Catch:{ a -> 0x029a }
            r3.f118474f = r14     // Catch:{ a -> 0x029a }
            r3.f118475g = r11     // Catch:{ a -> 0x029a }
            r5 = r33
            r3.f118476h = r5     // Catch:{ a -> 0x0292 }
            r3.f118477i = r11     // Catch:{ a -> 0x0292 }
            r12 = r30
            r3.f118478j = r12     // Catch:{ a -> 0x028c }
            r3.f118479k = r12     // Catch:{ a -> 0x028c }
            r3.f118480l = r11     // Catch:{ a -> 0x028c }
            r3.f118481m = r12     // Catch:{ a -> 0x028c }
            r6 = r29
            r3.f118482n = r6     // Catch:{ a -> 0x027a }
            r7 = 0
            r3.f118483o = r7     // Catch:{ a -> 0x027a }
            r3.f118484p = r7     // Catch:{ a -> 0x027a }
            r3.f118485q = r7     // Catch:{ a -> 0x027a }
            r0 = 1
            r3.f118488t = r0     // Catch:{ a -> 0x027a }
            java.lang.Object r0 = r1.o(r14, r11, r3)     // Catch:{ a -> 0x027a }
            r7 = r21
            if (r0 != r7) goto L_0x025a
            return r7
        L_0x025a:
            r15 = r2
            r8 = r6
            r10 = r11
            r13 = r10
            r9 = r12
            r11 = r9
            r6 = 0
            r20 = 0
            r2 = r1
            r12 = r5
            r5 = 0
        L_0x0266:
            bB.f r0 = (bB.f) r0     // Catch:{ a -> 0x026a }
            goto L_0x02df
        L_0x026a:
            r0 = move-exception
            r1 = r0
            r0 = r2
            r21 = r7
            r2 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r9
            r9 = r8
            r8 = r6
            r6 = r5
            r5 = r20
            goto L_0x02a8
        L_0x027a:
            r0 = move-exception
            r7 = r21
        L_0x027d:
            r13 = r5
            r9 = r6
            r10 = r11
            r15 = r14
            r5 = 0
            r6 = 0
            r8 = 0
            r14 = r10
            r11 = r12
            r34 = r1
            r1 = r0
            r0 = r34
            goto L_0x02a8
        L_0x028c:
            r0 = move-exception
            r7 = r21
            r6 = r29
            goto L_0x027d
        L_0x0292:
            r0 = move-exception
            r7 = r21
            r6 = r29
            r12 = r30
            goto L_0x027d
        L_0x029a:
            r0 = move-exception
        L_0x029b:
            r7 = r21
            r6 = r29
            r12 = r30
            r5 = r33
            goto L_0x027d
        L_0x02a4:
            r0 = move-exception
            r4 = r36
            goto L_0x029b
        L_0x02a8:
            boolean r7 = r1 instanceof aB.C13912b.a.C2952a
            if (r7 != 0) goto L_0x02e6
            boolean r7 = r1 instanceof aB.C13912b.a.C2953b
            if (r7 == 0) goto L_0x02e0
            r7 = r1
            aB.b$a$b r7 = (aB.C13912b.a.C2953b) r7
            r3.f118471c = r0
            r3.f118472d = r4
            r3.f118473e = r2
            r3.f118474f = r15
            r3.f118475g = r14
            r3.f118476h = r13
            r3.f118477i = r1
            r3.f118478j = r1
            r3.f118479k = r11
            r3.f118480l = r10
            r3.f118481m = r12
            r3.f118482n = r9
            r3.f118483o = r8
            r3.f118484p = r6
            r3.f118485q = r5
            r1 = 2
            r3.f118488t = r1
            java.lang.Object r0 = r0.r(r14, r7, r15, r3)
            r1 = r21
            if (r0 != r1) goto L_0x02dd
            return r1
        L_0x02dd:
            bB.f r0 = (bB.f) r0
        L_0x02df:
            return r0
        L_0x02e0:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x02e6:
            aB.b$a$a r1 = (aB.C13912b.a.C2952a) r1
            java.lang.String r1 = r1.a()
            aB.d r0 = r0.p(r1)
            throw r0
        L_0x02f1:
            r19 = r5
            r22 = r7
            r32 = r13
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No items to add"
            r7.<init>(r1)
            qv.e r10 = qv.e.ERROR
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0311:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0329
            java.lang.Object r3 = r1.next()
            r4 = r3
            qv.b r4 = (qv.C11819b) r4
            r5 = 0
            boolean r4 = r4.b(r10, r5)
            if (r4 == 0) goto L_0x0311
            r2.add(r3)
            goto L_0x0311
        L_0x0329:
            java.util.Iterator r11 = r2.iterator()
            r1 = 0
            r15 = 0
        L_0x032f:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x03ab
            java.lang.Object r2 = r11.next()
            qv.b r2 = (qv.C11819b) r2
            r12 = 0
            if (r15 != 0) goto L_0x0349
            java.lang.String r3 = qv.C11818a.a(r12, r7)
            if (r3 == 0) goto L_0x03ab
            java.lang.String r3 = qv.C11820c.a(r3)
            r15 = r3
        L_0x0349:
            if (r1 != 0) goto L_0x0393
            java.lang.String r1 = r32.getName()
            kotlin.jvm.internal.C17542s.g(r1)
            r13 = 2
            r14 = 36
            java.lang.String r3 = HJ.C15854t.s1(r1, r14, r12, r13, r12)
            r6 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r6, r12, r13, r12)
            int r4 = r3.length()
            if (r4 != 0) goto L_0x0366
            goto L_0x036a
        L_0x0366:
            java.lang.String r1 = HJ.C15854t.P0(r3, r9)
        L_0x036a:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r5 = 1
            boolean r3 = HJ.C15854t.b0(r3, r8, r5)
            if (r3 == 0) goto L_0x037c
            r3 = r22
            goto L_0x037e
        L_0x037c:
            r3 = r19
        L_0x037e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r0)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L_0x0390:
            r16 = r1
            goto L_0x039a
        L_0x0393:
            r5 = 1
            r6 = 46
            r13 = 2
            r14 = 36
            goto L_0x0390
        L_0x039a:
            r4 = 0
            r1 = r2
            r2 = r10
            r3 = r16
            r17 = r5
            r5 = r7
            r18 = r6
            r6 = r15
            r1.a(r2, r3, r4, r5, r6)
            r1 = r16
            goto L_0x032f
        L_0x03ab:
            aB.d$a r0 = aB.C13914d.a.f118583a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aB.C13912b.e(com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r13, dI.C17164e<? super XH.C16807N> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof aB.C13912b.o
            if (r0 == 0) goto L_0x0013
            r0 = r14
            aB.b$o r0 = (aB.C13912b.o) r0
            int r1 = r0.f118556t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f118556t = r1
            goto L_0x0018
        L_0x0013:
            aB.b$o r0 = new aB.b$o
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f118554r
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f118556t
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0062
            if (r3 != r4) goto L_0x005a
            java.lang.Object r13 = r0.f118550n
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r13 = r0.f118549m
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r13 = r0.f118548l
            java.util.Collection r13 = (java.util.Collection) r13
            java.lang.Object r13 = r0.f118547k
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r13 = r0.f118546j
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r13 = r0.f118545i
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = r0.f118544h
            yh.d r13 = (yh.C10480d) r13
            java.lang.Object r13 = r0.f118543g
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = r0.f118542f
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r0.f118541e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f118540d
            com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r13 = (com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel) r13
            java.lang.Object r13 = r0.f118539c
            aB.b r13 = (aB.C13912b) r13
            XH.y.b(r1)     // Catch:{ a -> 0x00eb }
            goto L_0x00c9
        L_0x005a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0062:
            XH.y.b(r1)
            java.lang.String r1 = r13.d()
            java.util.List r3 = r13.c()
            r6 = 0
            if (r3 == 0) goto L_0x00ee
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r3.iterator()
        L_0x007b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0091
            java.lang.Object r9 = r8.next()
            com.ingka.ikea.shoppinglist.datalayer.impl.network.model.ShoppingBagRequestItem r9 = (com.ingka.ikea.shoppinglist.datalayer.impl.network.model.ShoppingBagRequestItem) r9
            java.lang.String r9 = r9.a()
            if (r9 == 0) goto L_0x007b
            r7.add(r9)
            goto L_0x007b
        L_0x0091:
            yh.d r9 = new yh.d
            M6.y$c r10 = new M6.y$c
            r10.<init>(r1)
            r9.<init>(r10, r7)
            L6.b r10 = r12.f118452a     // Catch:{ a -> 0x00eb }
            L6.a r10 = r10.l(r9)     // Catch:{ a -> 0x00eb }
            r0.f118539c = r12     // Catch:{ a -> 0x00eb }
            r0.f118540d = r13     // Catch:{ a -> 0x00eb }
            r0.f118541e = r14     // Catch:{ a -> 0x00eb }
            r0.f118542f = r1     // Catch:{ a -> 0x00eb }
            r0.f118543g = r7     // Catch:{ a -> 0x00eb }
            r0.f118544h = r9     // Catch:{ a -> 0x00eb }
            r0.f118545i = r7     // Catch:{ a -> 0x00eb }
            r0.f118546j = r3     // Catch:{ a -> 0x00eb }
            r0.f118547k = r3     // Catch:{ a -> 0x00eb }
            r0.f118548l = r7     // Catch:{ a -> 0x00eb }
            r0.f118549m = r3     // Catch:{ a -> 0x00eb }
            r0.f118550n = r8     // Catch:{ a -> 0x00eb }
            r0.f118551o = r6     // Catch:{ a -> 0x00eb }
            r0.f118552p = r6     // Catch:{ a -> 0x00eb }
            r0.f118553q = r6     // Catch:{ a -> 0x00eb }
            r0.f118556t = r4     // Catch:{ a -> 0x00eb }
            java.lang.Object r1 = r10.a(r0)     // Catch:{ a -> 0x00eb }
            if (r1 != r2) goto L_0x00c8
            return r2
        L_0x00c8:
            r13 = r12
        L_0x00c9:
            M6.g r1 = (M6.g) r1     // Catch:{ a -> 0x00eb }
            TA.a r14 = TA.C13671a.DELETE_ITEM     // Catch:{ a -> 0x00eb }
            r13.v(r1, r14)     // Catch:{ a -> 0x00eb }
            java.util.List<M6.o> r14 = r1.f38572d     // Catch:{ a -> 0x00eb }
            r13.m(r14)     // Catch:{ a -> 0x00eb }
            D r14 = r1.f38571c     // Catch:{ a -> 0x00eb }
            yh.d$b r14 = (yh.C10480d.b) r14     // Catch:{ a -> 0x00eb }
            if (r14 == 0) goto L_0x00e5
            yh.d$c r14 = r14.a()     // Catch:{ a -> 0x00eb }
            if (r14 == 0) goto L_0x00e5
            Ah.a r5 = r14.a()     // Catch:{ a -> 0x00eb }
        L_0x00e5:
            r13.k(r5)     // Catch:{ a -> 0x00eb }
            XH.N r13 = XH.C16807N.f139792a
            return r13
        L_0x00eb:
            aB.d$b r13 = aB.C13914d.b.f118584a
            throw r13
        L_0x00ee:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "No items to remove"
            r13.<init>(r14)
            qv.e r14 = qv.e.ERROR
            qv.d r0 = qv.d.f102012a
            java.util.List r0 = r0.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0108:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x011f
            java.lang.Object r2 = r0.next()
            r3 = r2
            qv.b r3 = (qv.C11819b) r3
            boolean r3 = r3.b(r14, r6)
            if (r3 == 0) goto L_0x0108
            r1.add(r2)
            goto L_0x0108
        L_0x011f:
            java.util.Iterator r0 = r1.iterator()
            r1 = r5
            r2 = r1
        L_0x0125:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0196
            java.lang.Object r3 = r0.next()
            r6 = r3
            qv.b r6 = (qv.C11819b) r6
            if (r1 != 0) goto L_0x013f
            java.lang.String r1 = qv.C11818a.a(r5, r13)
            if (r1 != 0) goto L_0x013b
            goto L_0x0196
        L_0x013b:
            java.lang.String r1 = qv.C11820c.a(r1)
        L_0x013f:
            if (r2 != 0) goto L_0x018d
            java.lang.Class<aB.b> r2 = aB.C13912b.class
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r3 = 36
            r7 = 2
            java.lang.String r3 = HJ.C15854t.s1(r2, r3, r5, r7, r5)
            r8 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r8, r5, r7, r5)
            int r7 = r3.length()
            if (r7 != 0) goto L_0x015e
            goto L_0x0164
        L_0x015e:
            java.lang.String r2 = "Kt"
            java.lang.String r2 = HJ.C15854t.P0(r3, r2)
        L_0x0164:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r7 = "main"
            boolean r3 = HJ.C15854t.b0(r3, r7, r4)
            if (r3 == 0) goto L_0x0177
            java.lang.String r3 = "m"
            goto L_0x0179
        L_0x0177:
            java.lang.String r3 = "b"
        L_0x0179:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r3 = "|"
            r7.append(r3)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
        L_0x018d:
            r9 = 0
            r7 = r14
            r8 = r2
            r10 = r13
            r11 = r1
            r6.a(r7, r8, r9, r10, r11)
            goto L_0x0125
        L_0x0196:
            XH.N r13 = XH.C16807N.f139792a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: aB.C13912b.f(com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x021d A[Catch:{ a -> 0x022b }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0222 A[Catch:{ a -> 0x022b }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r35, dI.C17164e<? super XH.C16807N> r36) {
        /*
            r34 = this;
            r0 = r34
            r1 = r36
            boolean r2 = r1 instanceof aB.C13912b.q
            if (r2 == 0) goto L_0x0017
            r2 = r1
            aB.b$q r2 = (aB.C13912b.q) r2
            int r3 = r2.f118582t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f118582t = r3
            goto L_0x001c
        L_0x0017:
            aB.b$q r2 = new aB.b$q
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f118580r
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f118582t
            r6 = 1
            if (r5 == 0) goto L_0x0066
            if (r5 != r6) goto L_0x005e
            java.lang.Object r1 = r2.f118576n
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r2.f118575m
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r2.f118574l
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r1 = r2.f118573k
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r2.f118572j
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r2.f118571i
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r2.f118570h
            yh.g r1 = (yh.C10483g) r1
            java.lang.Object r1 = r2.f118569g
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r2.f118568f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f118567e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f118566d
            com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r1 = (com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel) r1
            java.lang.Object r1 = r2.f118565c
            aB.b r1 = (aB.C13912b) r1
            XH.y.b(r3)     // Catch:{ a -> 0x022b }
            goto L_0x0207
        L_0x005e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0066:
            XH.y.b(r3)
            java.lang.String r3 = r35.d()
            java.util.List r5 = r35.c()
            java.lang.String r8 = "|"
            java.lang.String r9 = "b"
            java.lang.String r10 = "m"
            java.lang.String r11 = "main"
            java.lang.String r12 = "Kt"
            java.lang.Class<aB.b> r15 = aB.C13912b.class
            if (r5 == 0) goto L_0x022e
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r14 = r5.iterator()
        L_0x008a:
            boolean r20 = r14.hasNext()
            if (r20 == 0) goto L_0x01bf
            java.lang.Object r20 = r14.next()
            r7 = r20
            com.ingka.ikea.shoppinglist.datalayer.impl.network.model.ShoppingBagRequestItem r7 = (com.ingka.ikea.shoppinglist.datalayer.impl.network.model.ShoppingBagRequestItem) r7
            java.lang.String r13 = r7.a()
            java.lang.String r21 = r7.b()
            java.lang.Integer r21 = HJ.C15854t.t(r21)
            if (r13 == 0) goto L_0x00c6
            int r22 = r13.length()
            if (r22 != 0) goto L_0x00ad
            goto L_0x00c6
        L_0x00ad:
            if (r21 == 0) goto L_0x00c6
            Bh.e r7 = new Bh.e
            r22 = r9
            int r9 = r21.intValue()
            r7.<init>(r13, r9)
            r29 = r4
            r33 = r5
            r21 = r10
            r30 = r14
            r32 = r15
            goto L_0x01ac
        L_0x00c6:
            r22 = r9
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r21 = r10
            java.lang.String r10 = "Invalid item to update: "
            r13.append(r10)
            r13.append(r7)
            java.lang.String r7 = r13.toString()
            r9.<init>(r7)
            qv.e r7 = qv.e.ERROR
            qv.d r10 = qv.d.f102012a
            java.util.List r10 = r10.a()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00f3:
            boolean r23 = r10.hasNext()
            if (r23 == 0) goto L_0x0117
            r29 = r4
            java.lang.Object r4 = r10.next()
            r23 = r10
            r10 = r4
            qv.b r10 = (qv.C11819b) r10
            r30 = r14
            r14 = 0
            boolean r10 = r10.b(r7, r14)
            if (r10 == 0) goto L_0x0110
            r13.add(r4)
        L_0x0110:
            r10 = r23
            r4 = r29
            r14 = r30
            goto L_0x00f3
        L_0x0117:
            r29 = r4
            r30 = r14
            java.util.Iterator r4 = r13.iterator()
            r10 = 0
            r13 = 0
        L_0x0121:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto L_0x0138
            java.lang.Object r14 = r4.next()
            r23 = r14
            qv.b r23 = (qv.C11819b) r23
            r14 = 0
            if (r10 != 0) goto L_0x0142
            java.lang.String r10 = qv.C11818a.a(r14, r9)
            if (r10 != 0) goto L_0x013e
        L_0x0138:
            r33 = r5
            r32 = r15
            goto L_0x01ab
        L_0x013e:
            java.lang.String r10 = qv.C11820c.a(r10)
        L_0x0142:
            if (r13 != 0) goto L_0x0190
            java.lang.String r13 = r15.getName()
            kotlin.jvm.internal.C17542s.g(r13)
            r31 = r4
            r33 = r5
            r32 = r15
            r4 = 36
            r15 = 2
            java.lang.String r5 = HJ.C15854t.s1(r13, r4, r14, r15, r14)
            r4 = 46
            java.lang.String r5 = HJ.C15854t.o1(r5, r4, r14, r15, r14)
            int r4 = r5.length()
            if (r4 != 0) goto L_0x0165
            goto L_0x0169
        L_0x0165:
            java.lang.String r13 = HJ.C15854t.P0(r5, r12)
        L_0x0169:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            r5 = 1
            boolean r4 = HJ.C15854t.b0(r4, r11, r5)
            if (r4 == 0) goto L_0x017b
            r4 = r21
            goto L_0x017d
        L_0x017b:
            r4 = r22
        L_0x017d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r8)
            r5.append(r13)
            java.lang.String r13 = r5.toString()
            goto L_0x0196
        L_0x0190:
            r31 = r4
            r33 = r5
            r32 = r15
        L_0x0196:
            r26 = 0
            r24 = r7
            r25 = r13
            r27 = r9
            r28 = r10
            r23.a(r24, r25, r26, r27, r28)
            r4 = r31
            r15 = r32
            r5 = r33
            goto L_0x0121
        L_0x01ab:
            r7 = 0
        L_0x01ac:
            if (r7 == 0) goto L_0x01b1
            r6.add(r7)
        L_0x01b1:
            r10 = r21
            r9 = r22
            r4 = r29
            r14 = r30
            r15 = r32
            r5 = r33
            goto L_0x008a
        L_0x01bf:
            r29 = r4
            r33 = r5
            r30 = r14
            yh.g r4 = new yh.g
            M6.y$c r5 = new M6.y$c
            r5.<init>(r3)
            r4.<init>(r5, r6)
            L6.b r5 = r0.f118452a     // Catch:{ a -> 0x022b }
            L6.a r5 = r5.l(r4)     // Catch:{ a -> 0x022b }
            r2.f118565c = r0     // Catch:{ a -> 0x022b }
            r7 = r35
            r2.f118566d = r7     // Catch:{ a -> 0x022b }
            r2.f118567e = r1     // Catch:{ a -> 0x022b }
            r2.f118568f = r3     // Catch:{ a -> 0x022b }
            r2.f118569g = r6     // Catch:{ a -> 0x022b }
            r2.f118570h = r4     // Catch:{ a -> 0x022b }
            r2.f118571i = r6     // Catch:{ a -> 0x022b }
            r1 = r33
            r2.f118572j = r1     // Catch:{ a -> 0x022b }
            r2.f118573k = r1     // Catch:{ a -> 0x022b }
            r2.f118574l = r6     // Catch:{ a -> 0x022b }
            r2.f118575m = r1     // Catch:{ a -> 0x022b }
            r1 = r30
            r2.f118576n = r1     // Catch:{ a -> 0x022b }
            r1 = 0
            r2.f118577o = r1     // Catch:{ a -> 0x022b }
            r2.f118578p = r1     // Catch:{ a -> 0x022b }
            r2.f118579q = r1     // Catch:{ a -> 0x022b }
            r1 = 1
            r2.f118582t = r1     // Catch:{ a -> 0x022b }
            java.lang.Object r3 = r5.a(r2)     // Catch:{ a -> 0x022b }
            r1 = r29
            if (r3 != r1) goto L_0x0206
            return r1
        L_0x0206:
            r1 = r0
        L_0x0207:
            r2 = r3
            M6.g r2 = (M6.g) r2     // Catch:{ a -> 0x022b }
            java.util.List<M6.o> r4 = r2.f38572d     // Catch:{ a -> 0x022b }
            TA.a r5 = TA.C13671a.UPDATE_ITEM     // Catch:{ a -> 0x022b }
            r1.l(r4, r5)     // Catch:{ a -> 0x022b }
            D r2 = r2.f38571c     // Catch:{ a -> 0x022b }
            yh.g$b r2 = (yh.C10483g.b) r2     // Catch:{ a -> 0x022b }
            if (r2 == 0) goto L_0x0222
            yh.g$c r2 = r2.a()     // Catch:{ a -> 0x022b }
            if (r2 == 0) goto L_0x0222
            Ah.a r7 = r2.a()     // Catch:{ a -> 0x022b }
            goto L_0x0223
        L_0x0222:
            r7 = 0
        L_0x0223:
            r1.k(r7)     // Catch:{ a -> 0x022b }
            M6.g r3 = (M6.g) r3     // Catch:{ a -> 0x022b }
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x022b:
            aB.d$b r1 = aB.C13914d.b.f118584a
            throw r1
        L_0x022e:
            r22 = r9
            r21 = r10
            r32 = r15
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "No items to update"
            r1.<init>(r2)
            qv.e r9 = qv.e.ERROR
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x024e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0266
            java.lang.Object r4 = r2.next()
            r5 = r4
            qv.b r5 = (qv.C11819b) r5
            r6 = 0
            boolean r5 = r5.b(r9, r6)
            if (r5 == 0) goto L_0x024e
            r3.add(r4)
            goto L_0x024e
        L_0x0266:
            java.util.Iterator r10 = r3.iterator()
            r2 = 0
            r14 = 0
        L_0x026c:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x02eb
            java.lang.Object r3 = r10.next()
            qv.b r3 = (qv.C11819b) r3
            r13 = 0
            if (r14 != 0) goto L_0x0288
            java.lang.String r4 = qv.C11818a.a(r13, r1)
            if (r4 != 0) goto L_0x0283
            goto L_0x02eb
        L_0x0283:
            java.lang.String r4 = qv.C11820c.a(r4)
            r14 = r4
        L_0x0288:
            if (r2 != 0) goto L_0x02d2
            java.lang.String r2 = r32.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r7 = 2
            r15 = 36
            java.lang.String r4 = HJ.C15854t.s1(r2, r15, r13, r7, r13)
            r6 = 46
            java.lang.String r4 = HJ.C15854t.o1(r4, r6, r13, r7, r13)
            int r5 = r4.length()
            if (r5 != 0) goto L_0x02a5
            goto L_0x02a9
        L_0x02a5:
            java.lang.String r2 = HJ.C15854t.P0(r4, r12)
        L_0x02a9:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            r5 = 1
            boolean r4 = HJ.C15854t.b0(r4, r11, r5)
            if (r4 == 0) goto L_0x02bb
            r4 = r21
            goto L_0x02bd
        L_0x02bb:
            r4 = r22
        L_0x02bd:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r8)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
        L_0x02cf:
            r17 = r2
            goto L_0x02d8
        L_0x02d2:
            r6 = 46
            r7 = 2
            r15 = 36
            goto L_0x02cf
        L_0x02d8:
            r5 = 0
            r2 = r3
            r3 = r9
            r4 = r17
            r16 = 1
            r18 = r6
            r6 = r1
            r19 = r7
            r7 = r14
            r2.a(r3, r4, r5, r6, r7)
            r2 = r17
            goto L_0x026c
        L_0x02eb:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: aB.C13912b.g(com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088 A[Catch:{ a -> 0x0178 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b1 A[Catch:{ a -> 0x0178 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ec A[Catch:{ a -> 0x0178 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010b A[Catch:{ a -> 0x0178 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h(java.lang.String r13, dI.C17164e<? super bB.f> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof aB.C13912b.l
            if (r0 == 0) goto L_0x0013
            r0 = r14
            aB.b$l r0 = (aB.C13912b.l) r0
            int r1 = r0.f118517i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f118517i = r1
            goto L_0x0018
        L_0x0013:
            aB.b$l r0 = new aB.b$l
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f118515g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f118517i
            java.lang.String r4 = "Unable to fetch list and items"
            r5 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r5) goto L_0x003b
            java.lang.Object r13 = r0.f118514f
            yh.c r13 = (yh.C10479c) r13
            java.lang.Object r13 = r0.f118513e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f118512d
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r0.f118511c
            aB.b r14 = (aB.C13912b) r14
            XH.y.b(r1)     // Catch:{ a -> 0x0178 }
            goto L_0x007b
        L_0x003b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0043:
            XH.y.b(r1)
            if (r13 == 0) goto L_0x017e
            int r1 = r13.length()
            if (r1 == 0) goto L_0x017e
            yh.c r1 = new yh.c     // Catch:{ a -> 0x0178 }
            Bh.b r3 = new Bh.b     // Catch:{ a -> 0x0178 }
            tw.g r6 = r12.f118455d     // Catch:{ a -> 0x0178 }
            java.lang.String r7 = r6.a()     // Catch:{ a -> 0x0178 }
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ a -> 0x0178 }
            r1.<init>(r13, r3)     // Catch:{ a -> 0x0178 }
            L6.b r3 = r12.f118452a     // Catch:{ a -> 0x0178 }
            L6.a r3 = r3.n(r1)     // Catch:{ a -> 0x0178 }
            r0.f118511c = r12     // Catch:{ a -> 0x0178 }
            r0.f118512d = r13     // Catch:{ a -> 0x0178 }
            r0.f118513e = r14     // Catch:{ a -> 0x0178 }
            r0.f118514f = r1     // Catch:{ a -> 0x0178 }
            r0.f118517i = r5     // Catch:{ a -> 0x0178 }
            java.lang.Object r1 = r3.a(r0)     // Catch:{ a -> 0x0178 }
            if (r1 != r2) goto L_0x007a
            return r2
        L_0x007a:
            r14 = r12
        L_0x007b:
            M6.g r1 = (M6.g) r1     // Catch:{ a -> 0x0178 }
            TA.a r0 = TA.C13671a.FETCH_LIST_ITEMS     // Catch:{ a -> 0x0178 }
            r14.v(r1, r0)     // Catch:{ a -> 0x0178 }
            java.util.List<M6.o> r0 = r1.f38572d     // Catch:{ a -> 0x0178 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ a -> 0x0178 }
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r0.isEmpty()     // Catch:{ a -> 0x0178 }
            if (r0 == 0) goto L_0x008f
            goto L_0x00ab
        L_0x008f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ a -> 0x0178 }
            r0.<init>()     // Catch:{ a -> 0x0178 }
            java.lang.String r2 = "failed to fetch list: "
            r0.append(r2)     // Catch:{ a -> 0x0178 }
            r0.append(r13)     // Catch:{ a -> 0x0178 }
            java.lang.String r13 = r0.toString()     // Catch:{ a -> 0x0178 }
            java.util.List<M6.o> r0 = r1.f38572d     // Catch:{ a -> 0x0178 }
            if (r0 != 0) goto L_0x00a8
            java.util.List r0 = YH.C16877v.n()     // Catch:{ a -> 0x0178 }
        L_0x00a8:
            r14.s(r13, r0)     // Catch:{ a -> 0x0178 }
        L_0x00ab:
            D r13 = r1.f38571c     // Catch:{ a -> 0x0178 }
            yh.c$b r13 = (yh.C10479c.b) r13     // Catch:{ a -> 0x0178 }
            if (r13 == 0) goto L_0x00d3
            yh.c$c r13 = r13.a()     // Catch:{ a -> 0x0178 }
            if (r13 != 0) goto L_0x00b8
            goto L_0x00d3
        L_0x00b8:
            Ah.t r13 = r13.a()     // Catch:{ a -> 0x0178 }
            Il.a r0 = r14.f118454c     // Catch:{ a -> 0x0178 }
            Rl.g r0 = r0.u()     // Catch:{ a -> 0x0178 }
            Il.a r1 = r14.f118454c     // Catch:{ a -> 0x0178 }
            boolean r1 = r1.m()     // Catch:{ a -> 0x0178 }
            Il.a r14 = r14.f118454c     // Catch:{ a -> 0x0178 }
            kp.d r14 = r14.s()     // Catch:{ a -> 0x0178 }
            bB.f r13 = ZA.C13872b.n(r13, r0, r1, r14)     // Catch:{ a -> 0x0178 }
            return r13
        L_0x00d3:
            qv.e r13 = qv.e.WARN     // Catch:{ a -> 0x0178 }
            qv.d r14 = qv.d.f102012a     // Catch:{ a -> 0x0178 }
            java.util.List r14 = r14.a()     // Catch:{ a -> 0x0178 }
            java.lang.Iterable r14 = (java.lang.Iterable) r14     // Catch:{ a -> 0x0178 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ a -> 0x0178 }
            r0.<init>()     // Catch:{ a -> 0x0178 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ a -> 0x0178 }
        L_0x00e6:
            boolean r1 = r14.hasNext()     // Catch:{ a -> 0x0178 }
            if (r1 == 0) goto L_0x00fe
            java.lang.Object r1 = r14.next()     // Catch:{ a -> 0x0178 }
            r2 = r1
            qv.b r2 = (qv.C11819b) r2     // Catch:{ a -> 0x0178 }
            r3 = 0
            boolean r2 = r2.b(r13, r3)     // Catch:{ a -> 0x0178 }
            if (r2 == 0) goto L_0x00e6
            r0.add(r1)     // Catch:{ a -> 0x0178 }
            goto L_0x00e6
        L_0x00fe:
            java.util.Iterator r14 = r0.iterator()     // Catch:{ a -> 0x0178 }
            r0 = 0
            r1 = r0
            r2 = r1
        L_0x0105:
            boolean r3 = r14.hasNext()     // Catch:{ a -> 0x0178 }
            if (r3 == 0) goto L_0x0175
            java.lang.Object r3 = r14.next()     // Catch:{ a -> 0x0178 }
            r6 = r3
            qv.b r6 = (qv.C11819b) r6     // Catch:{ a -> 0x0178 }
            r10 = 0
            if (r1 != 0) goto L_0x011f
            java.lang.String r1 = qv.C11818a.a(r4, r10)     // Catch:{ a -> 0x0178 }
            if (r1 == 0) goto L_0x0175
            java.lang.String r1 = qv.C11820c.a(r1)     // Catch:{ a -> 0x0178 }
        L_0x011f:
            if (r2 != 0) goto L_0x016d
            java.lang.Class<aB.b> r2 = aB.C13912b.class
            java.lang.String r2 = r2.getName()     // Catch:{ a -> 0x0178 }
            kotlin.jvm.internal.C17542s.g(r2)     // Catch:{ a -> 0x0178 }
            r3 = 36
            r7 = 2
            java.lang.String r3 = HJ.C15854t.s1(r2, r3, r0, r7, r0)     // Catch:{ a -> 0x0178 }
            r8 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r8, r0, r7, r0)     // Catch:{ a -> 0x0178 }
            int r7 = r3.length()     // Catch:{ a -> 0x0178 }
            if (r7 != 0) goto L_0x013e
            goto L_0x0144
        L_0x013e:
            java.lang.String r2 = "Kt"
            java.lang.String r2 = HJ.C15854t.P0(r3, r2)     // Catch:{ a -> 0x0178 }
        L_0x0144:
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ a -> 0x0178 }
            java.lang.String r3 = r3.getName()     // Catch:{ a -> 0x0178 }
            java.lang.String r7 = "main"
            boolean r3 = HJ.C15854t.b0(r3, r7, r5)     // Catch:{ a -> 0x0178 }
            if (r3 == 0) goto L_0x0157
            java.lang.String r3 = "m"
            goto L_0x0159
        L_0x0157:
            java.lang.String r3 = "b"
        L_0x0159:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ a -> 0x0178 }
            r7.<init>()     // Catch:{ a -> 0x0178 }
            r7.append(r3)     // Catch:{ a -> 0x0178 }
            java.lang.String r3 = "|"
            r7.append(r3)     // Catch:{ a -> 0x0178 }
            r7.append(r2)     // Catch:{ a -> 0x0178 }
            java.lang.String r2 = r7.toString()     // Catch:{ a -> 0x0178 }
        L_0x016d:
            r9 = 0
            r7 = r13
            r8 = r2
            r11 = r1
            r6.a(r7, r8, r9, r10, r11)     // Catch:{ a -> 0x0178 }
            goto L_0x0105
        L_0x0175:
            aB.d$a r13 = aB.C13914d.a.f118583a     // Catch:{ a -> 0x0178 }
            throw r13     // Catch:{ a -> 0x0178 }
        L_0x0178:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r4)
            throw r13
        L_0x017e:
            TA.b r13 = TA.C13672b.MISSING_BAG_ID
            java.lang.String r13 = r13.b()
            TA.a r14 = TA.C13671a.FETCH_LIST_ITEMS
            r12.w(r13, r14)
            aB.d$a r13 = aB.C13914d.a.f118583a
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: aB.C13912b.h(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d A[Catch:{ a -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097 A[Catch:{ a -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f3 A[Catch:{ a -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0112 A[Catch:{ a -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object i(dI.C17164e<? super java.util.List<bB.f>> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof aB.C13912b.m
            if (r0 == 0) goto L_0x0013
            r0 = r13
            aB.b$m r0 = (aB.C13912b.m) r0
            int r1 = r0.f118523h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f118523h = r1
            goto L_0x0018
        L_0x0013:
            aB.b$m r0 = new aB.b$m
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r1 = r0.f118521f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f118523h
            java.lang.String r4 = "Unable to fetch lists and items"
            r5 = 1
            if (r3 == 0) goto L_0x0042
            if (r3 != r5) goto L_0x003a
            java.lang.Object r13 = r0.f118520e
            yh.h r13 = (yh.C10484h) r13
            java.lang.Object r13 = r0.f118519d
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f118518c
            aB.b r13 = (aB.C13912b) r13
            XH.y.b(r1)     // Catch:{ a -> 0x0037 }
            goto L_0x0070
        L_0x0037:
            r13 = move-exception
            goto L_0x017e
        L_0x003a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0042:
            XH.y.b(r1)
            yh.h r1 = new yh.h
            Bh.b r3 = new Bh.b
            tw.g r6 = r12.f118455d
            java.lang.String r7 = r6.a()
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            r1.<init>(r3)
            L6.b r3 = r12.f118452a     // Catch:{ a -> 0x0037 }
            L6.a r3 = r3.n(r1)     // Catch:{ a -> 0x0037 }
            r0.f118518c = r12     // Catch:{ a -> 0x0037 }
            r0.f118519d = r13     // Catch:{ a -> 0x0037 }
            r0.f118520e = r1     // Catch:{ a -> 0x0037 }
            r0.f118523h = r5     // Catch:{ a -> 0x0037 }
            java.lang.Object r1 = r3.a(r0)     // Catch:{ a -> 0x0037 }
            if (r1 != r2) goto L_0x006f
            return r2
        L_0x006f:
            r13 = r12
        L_0x0070:
            M6.g r1 = (M6.g) r1     // Catch:{ a -> 0x0037 }
            TA.a r0 = TA.C13671a.FETCH_LISTS     // Catch:{ a -> 0x0037 }
            r13.v(r1, r0)     // Catch:{ a -> 0x0037 }
            java.util.List<M6.o> r0 = r1.f38572d     // Catch:{ a -> 0x0037 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ a -> 0x0037 }
            if (r0 == 0) goto L_0x0091
            boolean r0 = r0.isEmpty()     // Catch:{ a -> 0x0037 }
            if (r0 == 0) goto L_0x0084
            goto L_0x0091
        L_0x0084:
            java.lang.String r0 = "failed to fetch lists"
            java.util.List<M6.o> r2 = r1.f38572d     // Catch:{ a -> 0x0037 }
            if (r2 != 0) goto L_0x008e
            java.util.List r2 = YH.C16877v.n()     // Catch:{ a -> 0x0037 }
        L_0x008e:
            r13.s(r0, r2)     // Catch:{ a -> 0x0037 }
        L_0x0091:
            D r0 = r1.f38571c     // Catch:{ a -> 0x0037 }
            yh.h$b r0 = (yh.C10484h.b) r0     // Catch:{ a -> 0x0037 }
            if (r0 == 0) goto L_0x00da
            java.util.List r0 = r0.a()     // Catch:{ a -> 0x0037 }
            if (r0 != 0) goto L_0x009e
            goto L_0x00da
        L_0x009e:
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ a -> 0x0037 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ a -> 0x0037 }
            r2 = 10
            int r2 = YH.C16877v.y(r0, r2)     // Catch:{ a -> 0x0037 }
            r1.<init>(r2)     // Catch:{ a -> 0x0037 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ a -> 0x0037 }
        L_0x00af:
            boolean r2 = r0.hasNext()     // Catch:{ a -> 0x0037 }
            if (r2 == 0) goto L_0x00d9
            java.lang.Object r2 = r0.next()     // Catch:{ a -> 0x0037 }
            yh.h$c r2 = (yh.C10484h.c) r2     // Catch:{ a -> 0x0037 }
            Ah.t r2 = r2.a()     // Catch:{ a -> 0x0037 }
            Il.a r3 = r13.f118454c     // Catch:{ a -> 0x0037 }
            Rl.g r3 = r3.u()     // Catch:{ a -> 0x0037 }
            Il.a r5 = r13.f118454c     // Catch:{ a -> 0x0037 }
            boolean r5 = r5.m()     // Catch:{ a -> 0x0037 }
            Il.a r6 = r13.f118454c     // Catch:{ a -> 0x0037 }
            kp.d r6 = r6.s()     // Catch:{ a -> 0x0037 }
            bB.f r2 = ZA.C13872b.n(r2, r3, r5, r6)     // Catch:{ a -> 0x0037 }
            r1.add(r2)     // Catch:{ a -> 0x0037 }
            goto L_0x00af
        L_0x00d9:
            return r1
        L_0x00da:
            qv.e r13 = qv.e.WARN     // Catch:{ a -> 0x0037 }
            qv.d r0 = qv.d.f102012a     // Catch:{ a -> 0x0037 }
            java.util.List r0 = r0.a()     // Catch:{ a -> 0x0037 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ a -> 0x0037 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ a -> 0x0037 }
            r1.<init>()     // Catch:{ a -> 0x0037 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ a -> 0x0037 }
        L_0x00ed:
            boolean r2 = r0.hasNext()     // Catch:{ a -> 0x0037 }
            if (r2 == 0) goto L_0x0105
            java.lang.Object r2 = r0.next()     // Catch:{ a -> 0x0037 }
            r3 = r2
            qv.b r3 = (qv.C11819b) r3     // Catch:{ a -> 0x0037 }
            r6 = 0
            boolean r3 = r3.b(r13, r6)     // Catch:{ a -> 0x0037 }
            if (r3 == 0) goto L_0x00ed
            r1.add(r2)     // Catch:{ a -> 0x0037 }
            goto L_0x00ed
        L_0x0105:
            java.util.Iterator r0 = r1.iterator()     // Catch:{ a -> 0x0037 }
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x010c:
            boolean r6 = r0.hasNext()     // Catch:{ a -> 0x0037 }
            if (r6 == 0) goto L_0x017b
            java.lang.Object r6 = r0.next()     // Catch:{ a -> 0x0037 }
            qv.b r6 = (qv.C11819b) r6     // Catch:{ a -> 0x0037 }
            r10 = 0
            if (r2 != 0) goto L_0x0125
            java.lang.String r2 = qv.C11818a.a(r4, r10)     // Catch:{ a -> 0x0037 }
            if (r2 == 0) goto L_0x017b
            java.lang.String r2 = qv.C11820c.a(r2)     // Catch:{ a -> 0x0037 }
        L_0x0125:
            if (r3 != 0) goto L_0x0173
            java.lang.Class<aB.b> r3 = aB.C13912b.class
            java.lang.String r3 = r3.getName()     // Catch:{ a -> 0x0037 }
            kotlin.jvm.internal.C17542s.g(r3)     // Catch:{ a -> 0x0037 }
            r7 = 36
            r8 = 2
            java.lang.String r7 = HJ.C15854t.s1(r3, r7, r1, r8, r1)     // Catch:{ a -> 0x0037 }
            r9 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r9, r1, r8, r1)     // Catch:{ a -> 0x0037 }
            int r8 = r7.length()     // Catch:{ a -> 0x0037 }
            if (r8 != 0) goto L_0x0144
            goto L_0x014a
        L_0x0144:
            java.lang.String r3 = "Kt"
            java.lang.String r3 = HJ.C15854t.P0(r7, r3)     // Catch:{ a -> 0x0037 }
        L_0x014a:
            java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ a -> 0x0037 }
            java.lang.String r7 = r7.getName()     // Catch:{ a -> 0x0037 }
            java.lang.String r8 = "main"
            boolean r7 = HJ.C15854t.b0(r7, r8, r5)     // Catch:{ a -> 0x0037 }
            if (r7 == 0) goto L_0x015d
            java.lang.String r7 = "m"
            goto L_0x015f
        L_0x015d:
            java.lang.String r7 = "b"
        L_0x015f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ a -> 0x0037 }
            r8.<init>()     // Catch:{ a -> 0x0037 }
            r8.append(r7)     // Catch:{ a -> 0x0037 }
            java.lang.String r7 = "|"
            r8.append(r7)     // Catch:{ a -> 0x0037 }
            r8.append(r3)     // Catch:{ a -> 0x0037 }
            java.lang.String r3 = r8.toString()     // Catch:{ a -> 0x0037 }
        L_0x0173:
            r9 = 0
            r7 = r13
            r8 = r3
            r11 = r2
            r6.a(r7, r8, r9, r10, r11)     // Catch:{ a -> 0x0037 }
            goto L_0x010c
        L_0x017b:
            aB.d$a r13 = aB.C13914d.a.f118583a     // Catch:{ a -> 0x0037 }
            throw r13     // Catch:{ a -> 0x0037 }
        L_0x017e:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r4, r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aB.C13912b.i(dI.e):java.lang.Object");
    }
}
