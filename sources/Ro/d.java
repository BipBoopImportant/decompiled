package Ro;

import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.v;
import XH.y;
import YH.C16877v;
import YH.X;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import tI.C17978n;
import up.C12071a;
import up.C12072b;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001:\u000556789B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\fJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\fJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020&0/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u0006:"}, d2 = {"LRo/d;", "Landroidx/lifecycle/f0;", "LBp/b;", "submitUserConsentFormUseCase", "LBp/a;", "loadUserConsentFormUseCase", "LSl/b;", "getLinksUseCase", "<init>", "(LBp/b;LBp/a;LSl/b;)V", "LXH/N;", "D", "()V", "", "Lup/a;", "", "entries", "E", "(Ljava/util/Map;)V", "LRo/d$a;", "optionsState", "I", "(LRo/d$a;)V", "LRo/d$c;", "submitState", "J", "(LRo/d$c;)V", "F", "G", "LRo/d$d;", "consentEntry", "H", "(LRo/d$d;)V", "m", "LBp/b;", "n", "LBp/a;", "LTJ/B;", "LRo/d$e;", "o", "LTJ/B;", "_state", "LTJ/g;", "", "p", "LTJ/g;", "privacyPolicyFlow", "LTJ/P;", "q", "LTJ/P;", "getState", "()LTJ/P;", "state", "e", "c", "b", "a", "d", "consent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Bp.b f86900m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Bp.a f86901n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C16505B<e> f86902o;

    /* renamed from: p  reason: collision with root package name */
    private final C16532g<String> f86903p;

    /* renamed from: q  reason: collision with root package name */
    private final C16519P<e> f86904q;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LRo/d$a;", "", "<init>", "()V", "b", "a", "c", "LRo/d$a$a;", "LRo/d$a$b;", "LRo/d$a$c;", "consent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRo/d$a$a;", "LRo/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "consent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ro.d$a$a  reason: collision with other inner class name */
        public static final class C1795a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C1795a f86905a = new C1795a();

            private C1795a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1795a);
            }

            public int hashCode() {
                return -1231564200;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRo/d$a$b;", "LRo/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "consent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f86906a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -601551476;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRo/d$a$c;", "LRo/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "consent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f86907a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -1219962381;
            }

            public String toString() {
                return "Ready";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LRo/d$b;", "", "a", "b", "LRo/d$b$a;", "LRo/d$b$b;", "consent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRo/d$b$a;", "LRo/d$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "consent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f86908a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1551688746;
            }

            public String toString() {
                return "ALL";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRo/d$b$b;", "LRo/d$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "consent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ro.d$b$b  reason: collision with other inner class name */
        public static final class C1796b implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1796b f86909a = new C1796b();

            private C1796b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1796b);
            }

            public int hashCode() {
                return -649788075;
            }

            public String toString() {
                return "SELECTION";
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LRo/d$c;", "", "<init>", "()V", "b", "d", "a", "c", "e", "LRo/d$c$a;", "LRo/d$c$b;", "LRo/d$c$c;", "LRo/d$c$d;", "LRo/d$c$e;", "consent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRo/d$c$a;", "LRo/d$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "consent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final a f86910a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -799712490;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRo/d$c$b;", "LRo/d$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "consent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final b f86911a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 2091081418;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRo/d$c$c;", "LRo/d$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "consent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ro.d$c$c  reason: collision with other inner class name */
        public static final class C1797c extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final C1797c f86912a = new C1797c();

            private C1797c() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1797c);
            }

            public int hashCode() {
                return -788110671;
            }

            public String toString() {
                return "Ready";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LRo/d$c$d;", "LRo/d$c;", "LRo/d$b;", "selection", "<init>", "(LRo/d$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LRo/d$b;", "()LRo/d$b;", "consent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ro.d$c$d  reason: collision with other inner class name */
        public static final class C1798d extends c {

            /* renamed from: a  reason: collision with root package name */
            private final b f86913a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1798d(b bVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(bVar, "selection");
                this.f86913a = bVar;
            }

            public final b a() {
                return this.f86913a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1798d) && C17542s.e(this.f86913a, ((C1798d) obj).f86913a);
            }

            public int hashCode() {
                return this.f86913a.hashCode();
            }

            public String toString() {
                b bVar = this.f86913a;
                return "Submitting(selection=" + bVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LRo/d$c$e;", "LRo/d$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "consent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final e f86914a = new e();

            private e() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -112738927;
            }

            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010!\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b \u0010\u0019R\u0011\u0010#\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010\fR\u0011\u0010%\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b$\u0010\fR\u0011\u0010'\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b&\u0010\f¨\u0006("}, d2 = {"LRo/d$d;", "", "Lup/b;", "consent", "", "isChecked", "<init>", "(Lup/b;Z)V", "a", "(Lup/b;Z)LRo/d$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lup/b;", "c", "()Lup/b;", "b", "Z", "j", "()Z", "LIC/e;", "g", "()LIC/e;", "title", "f", "subtitle", "d", "enabled", "h", "titleTestTag", "e", "subTitleTestTag", "i", "toggleTestTag", "consent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ro.d$d  reason: collision with other inner class name */
    public static final class C1799d {

        /* renamed from: a  reason: collision with root package name */
        private final C12072b f86915a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f86916b;

        public C1799d(C12072b bVar, boolean z10) {
            C17542s.j(bVar, "consent");
            this.f86915a = bVar;
            this.f86916b = z10;
        }

        public static /* synthetic */ C1799d b(C1799d dVar, C12072b bVar, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = dVar.f86915a;
            }
            if ((i10 & 2) != 0) {
                z10 = dVar.f86916b;
            }
            return dVar.a(bVar, z10);
        }

        public final C1799d a(C12072b bVar, boolean z10) {
            C17542s.j(bVar, "consent");
            return new C1799d(bVar, z10);
        }

        public final C12072b c() {
            return this.f86915a;
        }

        public final boolean d() {
            return this.f86915a.b().c();
        }

        public final String e() {
            String b10 = this.f86915a.b().b();
            return "TOGGLE_SUBTITLE_BASE_TAG" + b10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1799d)) {
                return false;
            }
            C1799d dVar = (C1799d) obj;
            return C17542s.e(this.f86915a, dVar.f86915a) && this.f86916b == dVar.f86916b;
        }

        public final C13023e f() {
            C12071a b10 = this.f86915a.b();
            if (C17542s.e(b10, C12071a.b.f103980e)) {
                return C13026h.a(Oo.b.f84649g5);
            }
            if (C17542s.e(b10, C12071a.c.f103981e)) {
                return C13026h.a(Oo.b.f84671i5);
            }
            if (C17542s.e(b10, C12071a.d.f103982e)) {
                return C13026h.a(Oo.b.f84627e5);
            }
            if (C17542s.e(b10, C12071a.e.f103983e)) {
                return C13026h.a(Oo.b.f84693k5);
            }
            throw new t();
        }

        public final C13023e g() {
            C12071a b10 = this.f86915a.b();
            if (C17542s.e(b10, C12071a.b.f103980e)) {
                return C13026h.a(Oo.b.f84660h5);
            }
            if (C17542s.e(b10, C12071a.c.f103981e)) {
                return C13026h.a(Oo.b.f84682j5);
            }
            if (C17542s.e(b10, C12071a.d.f103982e)) {
                return C13026h.a(Oo.b.f84638f5);
            }
            if (C17542s.e(b10, C12071a.e.f103983e)) {
                return C13026h.a(Oo.b.f84704l5);
            }
            throw new t();
        }

        public final String h() {
            String b10 = this.f86915a.b().b();
            return "TOGGLE_TITLE_BASE_TAG" + b10;
        }

        public int hashCode() {
            return (this.f86915a.hashCode() * 31) + Boolean.hashCode(this.f86916b);
        }

        public final String i() {
            String b10 = this.f86915a.b().b();
            return "TOGGLE_BASE_TAG" + b10;
        }

        public final boolean j() {
            return this.f86916b;
        }

        public String toString() {
            C12072b bVar = this.f86915a;
            boolean z10 = this.f86916b;
            return "UIConsentEntry(consent=" + bVar + ", isChecked=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010\u0010R\u0011\u0010&\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0011\u0010*\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b)\u0010%R\u0011\u0010,\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b+\u0010%¨\u0006-"}, d2 = {"LRo/d$e;", "", "LRo/d$a;", "optionsState", "LRo/d$c;", "submitState", "", "LRo/d$d;", "entries", "", "policyUrl", "<init>", "(LRo/d$a;LRo/d$c;Ljava/util/List;Ljava/lang/String;)V", "a", "(LRo/d$a;LRo/d$c;Ljava/util/List;Ljava/lang/String;)LRo/d$e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LRo/d$a;", "getOptionsState", "()LRo/d$a;", "b", "LRo/d$c;", "e", "()LRo/d$c;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Ljava/lang/String;", "g", "()Z", "isLoadingConsentOptions", "h", "isSubmittingAll", "i", "isSubmittingSelection", "f", "userInteractionEnabled", "consent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private final a f86917a;

        /* renamed from: b  reason: collision with root package name */
        private final c f86918b;

        /* renamed from: c  reason: collision with root package name */
        private final List<C1799d> f86919c;

        /* renamed from: d  reason: collision with root package name */
        private final String f86920d;

        public e() {
            this((a) null, (c) null, (List) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ e b(e eVar, a aVar, c cVar, List<C1799d> list, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar = eVar.f86917a;
            }
            if ((i10 & 2) != 0) {
                cVar = eVar.f86918b;
            }
            if ((i10 & 4) != 0) {
                list = eVar.f86919c;
            }
            if ((i10 & 8) != 0) {
                str = eVar.f86920d;
            }
            return eVar.a(aVar, cVar, list, str);
        }

        public final e a(a aVar, c cVar, List<C1799d> list, String str) {
            C17542s.j(aVar, "optionsState");
            C17542s.j(cVar, "submitState");
            C17542s.j(list, "entries");
            return new e(aVar, cVar, list, str);
        }

        public final List<C1799d> c() {
            return this.f86919c;
        }

        public final String d() {
            return this.f86920d;
        }

        public final c e() {
            return this.f86918b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C17542s.e(this.f86917a, eVar.f86917a) && C17542s.e(this.f86918b, eVar.f86918b) && C17542s.e(this.f86919c, eVar.f86919c) && C17542s.e(this.f86920d, eVar.f86920d);
        }

        public final boolean f() {
            c cVar = this.f86918b;
            if (C17542s.e(cVar, c.a.f86910a) || C17542s.e(cVar, c.C1797c.f86912a)) {
                return true;
            }
            if (C17542s.e(cVar, c.b.f86911a) || (cVar instanceof c.C1798d) || C17542s.e(cVar, c.e.f86914a)) {
                return false;
            }
            throw new t();
        }

        public final boolean g() {
            return !C17542s.e(this.f86917a, a.c.f86907a);
        }

        public final boolean h() {
            c cVar = this.f86918b;
            return (cVar instanceof c.C1798d) && C17542s.e(((c.C1798d) cVar).a(), b.a.f86908a);
        }

        public int hashCode() {
            int hashCode = ((((this.f86917a.hashCode() * 31) + this.f86918b.hashCode()) * 31) + this.f86919c.hashCode()) * 31;
            String str = this.f86920d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final boolean i() {
            c cVar = this.f86918b;
            return (cVar instanceof c.C1798d) && C17542s.e(((c.C1798d) cVar).a(), b.C1796b.f86909a);
        }

        public String toString() {
            a aVar = this.f86917a;
            c cVar = this.f86918b;
            List<C1799d> list = this.f86919c;
            String str = this.f86920d;
            return "UIState(optionsState=" + aVar + ", submitState=" + cVar + ", entries=" + list + ", policyUrl=" + str + ")";
        }

        public e(a aVar, c cVar, List<C1799d> list, String str) {
            C17542s.j(aVar, "optionsState");
            C17542s.j(cVar, "submitState");
            C17542s.j(list, "entries");
            this.f86917a = aVar;
            this.f86918b = cVar;
            this.f86919c = list;
            this.f86920d = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(a aVar, c cVar, List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? a.b.f86906a : aVar, (i10 & 2) != 0 ? c.b.f86911a : cVar, (i10 & 4) != 0 ? C16877v.n() : list, (i10 & 8) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ro/d$f", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f86921a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(N.a aVar, d dVar) {
            super(aVar);
            this.f86921a = dVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            d dVar = this.f86921a;
            qv.e eVar = qv.e.DEBUG;
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
                    String a10 = C11818a.a("Unable to fetch consent entries", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = dVar.getClass().getName();
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
            this.f86921a.I(a.C1795a.f86905a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.consent.impl.presentation.ConsentViewModel$getConsentSnapshot$2", f = "ConsentViewModel.kt", l = {78}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f86922c;

        /* renamed from: d  reason: collision with root package name */
        Object f86923d;

        /* renamed from: e  reason: collision with root package name */
        Object f86924e;

        /* renamed from: f  reason: collision with root package name */
        Object f86925f;

        /* renamed from: g  reason: collision with root package name */
        Object f86926g;

        /* renamed from: h  reason: collision with root package name */
        Object f86927h;

        /* renamed from: i  reason: collision with root package name */
        Object f86928i;

        /* renamed from: j  reason: collision with root package name */
        int f86929j;

        /* renamed from: k  reason: collision with root package name */
        int f86930k;

        /* renamed from: l  reason: collision with root package name */
        int f86931l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d f86932m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(d dVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f86932m = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f86932m, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x006e A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0086 A[LOOP:0: B:12:0x0080->B:14:0x0086, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00aa  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r14.f86931l
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0037
                if (r1 != r3) goto L_0x002f
                int r1 = r14.f86929j
                java.lang.Object r4 = r14.f86928i
                Ro.d$e r4 = (Ro.d.e) r4
                java.lang.Object r5 = r14.f86927h
                Ro.d$a r5 = (Ro.d.a) r5
                java.lang.Object r6 = r14.f86926g
                Ro.d$c r6 = (Ro.d.c) r6
                java.lang.Object r7 = r14.f86925f
                Ro.d$e r7 = (Ro.d.e) r7
                java.lang.Object r7 = r14.f86924e
                java.lang.Object r8 = r14.f86923d
                Ro.d r8 = (Ro.d) r8
                java.lang.Object r9 = r14.f86922c
                TJ.B r9 = (TJ.C16505B) r9
                XH.y.b(r15)
            L_0x002b:
                r11 = r7
                r12 = r8
                r13 = r9
                goto L_0x006f
            L_0x002f:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0037:
                XH.y.b(r15)
                Ro.d r15 = r14.f86932m
                TJ.B r15 = r15.f86902o
                Ro.d r1 = r14.f86932m
                r9 = r15
                r8 = r1
                r1 = r2
            L_0x0045:
                java.lang.Object r7 = r9.getValue()
                r4 = r7
                Ro.d$e r4 = (Ro.d.e) r4
                Ro.d$a$c r5 = Ro.d.a.c.f86907a
                Ro.d$c$c r6 = Ro.d.c.C1797c.f86912a
                Bp.a r15 = r8.f86901n
                r14.f86922c = r9
                r14.f86923d = r8
                r14.f86924e = r7
                r14.f86925f = r4
                r14.f86926g = r6
                r14.f86927h = r5
                r14.f86928i = r4
                r14.f86929j = r1
                r14.f86930k = r2
                r14.f86931l = r3
                java.lang.Object r15 = r15.a(r14)
                if (r15 != r0) goto L_0x002b
                return r0
            L_0x006f:
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                java.util.ArrayList r7 = new java.util.ArrayList
                r8 = 10
                int r8 = YH.C16877v.y(r15, r8)
                r7.<init>(r8)
                java.util.Iterator r15 = r15.iterator()
            L_0x0080:
                boolean r8 = r15.hasNext()
                if (r8 == 0) goto L_0x0099
                java.lang.Object r8 = r15.next()
                up.b r8 = (up.C12072b) r8
                Ro.d$d r9 = new Ro.d$d
                boolean r10 = r8.a()
                r9.<init>(r8, r10)
                r7.add(r9)
                goto L_0x0080
            L_0x0099:
                r9 = 8
                r10 = 0
                r8 = 0
                Ro.d$e r15 = Ro.d.e.b(r4, r5, r6, r7, r8, r9, r10)
                boolean r15 = r13.e(r11, r15)
                if (r15 == 0) goto L_0x00aa
                XH.N r15 = XH.C16807N.f139792a
                return r15
            L_0x00aa:
                r8 = r12
                r9 = r13
                goto L_0x0045
            */
            throw new UnsupportedOperationException("Method not decompiled: Ro.d.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ro/d$h", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f86933a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(N.a aVar, d dVar) {
            super(aVar);
            this.f86933a = dVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            d dVar = this.f86933a;
            qv.e eVar = qv.e.DEBUG;
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
                    String a10 = C11818a.a("Unable to fetch consent entries", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = dVar.getClass().getName();
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
            this.f86933a.J(c.a.f86910a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.consent.impl.presentation.ConsentViewModel$internalSubmit$2", f = "ConsentViewModel.kt", l = {131}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f86934c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f86935d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map<C12071a, Boolean> f86936e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(d dVar, Map<C12071a, Boolean> map, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f86935d = dVar;
            this.f86936e = map;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f86935d, this.f86936e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f86934c;
            if (i10 == 0) {
                y.b(obj);
                Bp.b i11 = this.f86935d.f86900m;
                Map<C12071a, Boolean> map = this.f86936e;
                this.f86934c = 1;
                if (i11.a(map, true, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f86935d.J(c.e.f86914a);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f86937a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f86938a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.consent.impl.presentation.ConsentViewModel$special$$inlined$map$1$2", f = "ConsentViewModel.kt", l = {50}, m = "emit")
            /* renamed from: Ro.d$j$a$a  reason: collision with other inner class name */
            public static final class C1800a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f86939c;

                /* renamed from: d  reason: collision with root package name */
                int f86940d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f86941e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1800a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f86941e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f86939c = obj;
                    this.f86940d |= Integer.MIN_VALUE;
                    return this.f86941e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f86938a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Ro.d.j.a.C1800a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Ro.d$j$a$a r0 = (Ro.d.j.a.C1800a) r0
                    int r1 = r0.f86940d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f86940d = r1
                    goto L_0x0018
                L_0x0013:
                    Ro.d$j$a$a r0 = new Ro.d$j$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f86939c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f86940d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004f
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f86938a
                    java.util.List r5 = (java.util.List) r5
                    java.lang.Object r5 = YH.C16877v.y0(r5)
                    Sl.h r5 = (Sl.h) r5
                    if (r5 == 0) goto L_0x0045
                    java.lang.String r5 = r5.c()
                    goto L_0x0046
                L_0x0045:
                    r5 = 0
                L_0x0046:
                    r0.f86940d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004f
                    return r1
                L_0x004f:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Ro.d.j.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public j(C16532g gVar) {
            this.f86937a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f86937a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LRo/d$e;", "state", "", "privacyPolicy", "<anonymous>", "(LRo/d$e;Ljava/lang/String;)LRo/d$e;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.consent.impl.presentation.ConsentViewModel$state$1", f = "ConsentViewModel.kt", l = {}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements q<e, String, C17164e<? super e>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f86942c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f86943d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f86944e;

        k(C17164e<? super k> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(e eVar, String str, C17164e<? super e> eVar2) {
            k kVar = new k(eVar2);
            kVar.f86943d = eVar;
            kVar.f86944e = str;
            return kVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f86942c == 0) {
                y.b(obj);
                return e.b((e) this.f86943d, (a) null, (c) null, (List) null, (String) this.f86944e, 7, (Object) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRo/d$e;", "it", "LXH/N;", "<anonymous>", "(LRo/d$e;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.consent.impl.presentation.ConsentViewModel$state$2", f = "ConsentViewModel.kt", l = {}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements p<e, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f86945c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f86946d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f86947e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(d dVar, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f86947e = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            l lVar = new l(this.f86947e, eVar);
            lVar.f86946d = obj;
            return lVar;
        }

        /* renamed from: i */
        public final Object invoke(e eVar, C17164e<? super C16807N> eVar2) {
            return ((l) create(eVar, eVar2)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f86945c == 0) {
                y.b(obj);
                e eVar = (e) this.f86946d;
                d dVar = this.f86947e;
                qv.e eVar2 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar2, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("ConsentViewModel: emitting state: " + eVar, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = dVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar2, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public d(Bp.b bVar, Bp.a aVar, Sl.b bVar2) {
        C17542s.j(bVar, "submitUserConsentFormUseCase");
        C17542s.j(aVar, "loadUserConsentFormUseCase");
        C17542s.j(bVar2, "getLinksUseCase");
        this.f86900m = bVar;
        this.f86901n = aVar;
        C16505B<e> a10 = C16521S.a(new e((a) null, (c) null, (List) null, (String) null, 15, (DefaultConstructorMarker) null));
        this.f86902o = a10;
        j jVar = new j(bVar2.a(Sl.g.PrivacyPolicy));
        this.f86903p = jVar;
        this.f86904q = C16534i.c0(C16534i.R(C16534i.n(a10, jVar, new k((C17164e<? super k>) null)), new l(this, (C17164e<? super l>) null)), g0.a(this), ip.f.a(), a10.getValue());
        D();
    }

    private final void D() {
        F0 unused = C16314k.d(g0.a(this), new f(N.f137593c0, this), (T) null, new g(this, (C17164e<? super g>) null), 2, (Object) null);
    }

    private final void E(Map<C12071a, Boolean> map) {
        F0 unused = C16314k.d(g0.a(this), new h(N.f137593c0, this), (T) null, new i(this, map, (C17164e<? super i>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void I(a aVar) {
        e value;
        C16505B<e> b10 = this.f86902o;
        do {
            value = b10.getValue();
        } while (!b10.e(value, e.b(value, aVar, (c) null, (List) null, (String) null, 14, (Object) null)));
    }

    /* access modifiers changed from: private */
    public final void J(c cVar) {
        e value;
        C16505B<e> b10 = this.f86902o;
        do {
            value = b10.getValue();
        } while (!b10.e(value, e.b(value, (a) null, cVar, (List) null, (String) null, 13, (Object) null)));
    }

    public final void F() {
        e value;
        e eVar;
        ArrayList arrayList;
        C16505B<e> b10 = this.f86902o;
        do {
            value = b10.getValue();
            eVar = value;
            Iterable<C1799d> c10 = eVar.c();
            arrayList = new ArrayList(C16877v.y(c10, 10));
            for (C1799d b11 : c10) {
                arrayList.add(C1799d.b(b11, (C12072b) null, true, 1, (Object) null));
            }
        } while (!b10.e(value, e.b(eVar, (a) null, (c) null, arrayList, (String) null, 11, (Object) null)));
        Iterable<C1799d> c11 = this.f86904q.getValue().c();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(c11, 10)), 16));
        for (C1799d c12 : c11) {
            v a10 = C16796C.a(c12.c().b(), Boolean.TRUE);
            linkedHashMap.put(a10.c(), a10.d());
        }
        J(new c.C1798d(b.a.f86908a));
        E(linkedHashMap);
    }

    public final void G() {
        Iterable<C1799d> c10 = this.f86904q.getValue().c();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(c10, 10)), 16));
        for (C1799d dVar : c10) {
            v a10 = C16796C.a(dVar.c().b(), Boolean.valueOf(dVar.j()));
            linkedHashMap.put(a10.c(), a10.d());
        }
        J(new c.C1798d(b.C1796b.f86909a));
        E(linkedHashMap);
    }

    public final void H(C1799d dVar) {
        e value;
        e eVar;
        List w12;
        C17542s.j(dVar, "consentEntry");
        C16505B<e> b10 = this.f86902o;
        do {
            value = b10.getValue();
            eVar = value;
            w12 = C16877v.w1(eVar.c());
            Iterator<C1799d> it = eVar.c().iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                } else if (C17542s.e(it.next().c(), dVar.c())) {
                    break;
                } else {
                    i10++;
                }
            }
            w12.set(i10, C1799d.b(dVar, (C12072b) null, !dVar.j(), 1, (Object) null));
        } while (!b10.e(value, e.b(eVar, (a) null, (c) null, C16877v.t1(w12), (String) null, 11, (Object) null)));
    }

    public final C16519P<e> getState() {
        return this.f86904q;
    }
}
