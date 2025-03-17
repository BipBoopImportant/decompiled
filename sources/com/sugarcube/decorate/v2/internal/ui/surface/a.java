package com.sugarcube.decorate.v2.internal.ui.surface;

import RF.k;
import SG.C16404b;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.core.network.models.QuickFilter;
import com.sugarcube.core.network.models.RoomType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mG.C17596a;
import rG.C17847a;

@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001::\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001:>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvw¨\u0006x"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "", "<init>", "()V", "I", "H", "d", "g", "t", "v", "u", "O", "K", "L", "r", "n", "J", "C", "q", "b0", "V", "M", "c0", "a0", "E", "x", "s", "R", "T", "U", "F", "e0", "G", "W", "j", "Q", "P", "Z", "D", "N", "h", "d0", "z", "B", "i", "p", "a", "b", "e", "f", "A", "o", "S", "y", "w", "l", "k", "m", "Y", "X", "f0", "c", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$a;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$b;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$c;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$d;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$e;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$f;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$g;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$h;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$i;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$j;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$k;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$l;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$m;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$n;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$o;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$p;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$q;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$r;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$s;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$t;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$u;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$v;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$w;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$x;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$y;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$z;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$A;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$B;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$C;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$D;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$E;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$F;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$G;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$H;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$I;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$J;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$K;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$L;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$M;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$N;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$O;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$P;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$Q;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$R;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$S;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$T;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$U;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$V;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$W;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$X;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$Y;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$Z;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$a0;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$b0;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$c0;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$d0;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$e0;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$f0;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$A;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "", "rating", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class A extends a {

        /* renamed from: a  reason: collision with root package name */
        private final int f142581a;

        public A(int i10) {
            super((DefaultConstructorMarker) null);
            this.f142581a = i10;
        }

        public final int a() {
            return this.f142581a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof A) && this.f142581a == ((A) obj).f142581a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f142581a);
        }

        public String toString() {
            int i10 = this.f142581a;
            return "OnFeedbackProvided(rating=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$B;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class B extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final B f142582a = new B();

        private B() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof B);
        }

        public int hashCode() {
            return 2101400526;
        }

        public String toString() {
            return "OnFetchCartItems";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$C;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C f142583a = new C();

        private C() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C);
        }

        public int hashCode() {
            return -1632445611;
        }

        public String toString() {
            return "OnFlip";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$D;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "<init>", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "()Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class D extends a {

        /* renamed from: a  reason: collision with root package name */
        private final CachedCatalogItem f142584a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public D(CachedCatalogItem cachedCatalogItem) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cachedCatalogItem, "item");
            this.f142584a = cachedCatalogItem;
        }

        public final CachedCatalogItem a() {
            return this.f142584a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof D) && C17542s.e(this.f142584a, ((D) obj).f142584a);
        }

        public int hashCode() {
            return this.f142584a.hashCode();
        }

        public String toString() {
            CachedCatalogItem cachedCatalogItem = this.f142584a;
            return "OnGoesWellWithSelected(item=" + cachedCatalogItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$E;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class E extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final E f142585a = new E();

        private E() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof E);
        }

        public int hashCode() {
            return -836387188;
        }

        public String toString() {
            return "OnGoesWithToggled";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$F;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class F extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final F f142586a = new F();

        private F() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof F);
        }

        public int hashCode() {
            return 861612061;
        }

        public String toString() {
            return "OnHideWallColorPicker";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$G;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class G extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final G f142587a = new G();

        private G() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof G);
        }

        public int hashCode() {
            return -529070791;
        }

        public String toString() {
            return "OnItemList";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$H;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class H extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final H f142588a = new H();

        private H() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof H);
        }

        public int hashCode() {
            return 380655707;
        }

        public String toString() {
            return "OnItemListDone";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$I;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "LRF/k;", "item", "<init>", "(LRF/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LRF/k;", "()LRF/k;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class I extends a {

        /* renamed from: a  reason: collision with root package name */
        private final k f142589a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public I(k kVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(kVar, "item");
            this.f142589a = kVar;
        }

        public final k a() {
            return this.f142589a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof I) && C17542s.e(this.f142589a, ((I) obj).f142589a);
        }

        public int hashCode() {
            return this.f142589a.hashCode();
        }

        public String toString() {
            k kVar = this.f142589a;
            return "OnItemListItemClick(item=" + kVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$J;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class J extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final J f142590a = new J();

        private J() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof J);
        }

        public int hashCode() {
            return -919262041;
        }

        public String toString() {
            return "OnMirror";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$K;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class K extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final K f142591a = new K();

        private K() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof K);
        }

        public int hashCode() {
            return -1632233799;
        }

        public String toString() {
            return "OnMove";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$L;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class L extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final L f142592a = new L();

        private L() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof L);
        }

        public int hashCode() {
            return -1811313856;
        }

        public String toString() {
            return "OnMoveBack";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$M;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class M extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final M f142593a = new M();

        private M() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof M);
        }

        public int hashCode() {
            return -892909701;
        }

        public String toString() {
            return "OnProductInfoToggled";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$N;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "<init>", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "()Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class N extends a {

        /* renamed from: a  reason: collision with root package name */
        private final CachedCatalogItem f142594a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public N(CachedCatalogItem cachedCatalogItem) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cachedCatalogItem, "item");
            this.f142594a = cachedCatalogItem;
        }

        public final CachedCatalogItem a() {
            return this.f142594a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof N) && C17542s.e(this.f142594a, ((N) obj).f142594a);
        }

        public int hashCode() {
            return this.f142594a.hashCode();
        }

        public String toString() {
            CachedCatalogItem cachedCatalogItem = this.f142594a;
            return "OnProductSelected(item=" + cachedCatalogItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$O;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class O extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final O f142595a = new O();

        private O() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof O);
        }

        public int hashCode() {
            return -770531773;
        }

        public String toString() {
            return "OnRotate";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$P;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class P extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final P f142596a = new P();

        private P() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof P);
        }

        public int hashCode() {
            return 795106405;
        }

        public String toString() {
            return "OnRotateDone";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$Q;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "", "rotationValue", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Q extends a {

        /* renamed from: a  reason: collision with root package name */
        private final float f142597a;

        public Q(float f10) {
            super((DefaultConstructorMarker) null);
            this.f142597a = f10;
        }

        public final float a() {
            return this.f142597a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Q) && Float.compare(this.f142597a, ((Q) obj).f142597a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f142597a);
        }

        public String toString() {
            float f10 = this.f142597a;
            return "OnRotationApplied(rotationValue=" + f10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$R;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class R extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final R f142598a = new R();

        private R() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof R);
        }

        public int hashCode() {
            return -1632068507;
        }

        public String toString() {
            return "OnSave";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$S;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "", "saveOnExit", "<init>", "(Ljava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class S extends a {

        /* renamed from: a  reason: collision with root package name */
        private final Boolean f142599a;

        public S() {
            this((Boolean) null, 1, (DefaultConstructorMarker) null);
        }

        public final Boolean a() {
            return this.f142599a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof S) && C17542s.e(this.f142599a, ((S) obj).f142599a);
        }

        public int hashCode() {
            Boolean bool = this.f142599a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            Boolean bool = this.f142599a;
            return "OnSaveOrDiscardOrCancel(saveOnExit=" + bool + ")";
        }

        public S(Boolean bool) {
            super((DefaultConstructorMarker) null);
            this.f142599a = bool;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ S(Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : bool);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$T;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class T extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final T f142600a = new T();

        private T() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof T);
        }

        public int hashCode() {
            return 945672695;
        }

        public String toString() {
            return "OnShare";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$U;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class U extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final U f142601a = new U();

        private U() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof U);
        }

        public int hashCode() {
            return -1733714686;
        }

        public String toString() {
            return "OnShowWallColorPicker";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$V;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class V extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final V f142602a = new V();

        private V() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof V);
        }

        public int hashCode() {
            return 1080607087;
        }

        public String toString() {
            return "OnSideViews";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$W;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class W extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final W f142603a = new W();

        private W() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof W);
        }

        public int hashCode() {
            return 1121969468;
        }

        public String toString() {
            return "OnStatusHide";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$X;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class X extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final X f142604a = new X();

        private X() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof X);
        }

        public int hashCode() {
            return 1558174882;
        }

        public String toString() {
            return "OnStripeCollapsed";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$Y;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Y extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final Y f142605a = new Y();

        private Y() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Y);
        }

        public int hashCode() {
            return -1949487858;
        }

        public String toString() {
            return "OnStripeExpanded";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$Z;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "<init>", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "()Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Z extends a {

        /* renamed from: a  reason: collision with root package name */
        private final CachedCatalogItem f142606a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Z(CachedCatalogItem cachedCatalogItem) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cachedCatalogItem, "item");
            this.f142606a = cachedCatalogItem;
        }

        public final CachedCatalogItem a() {
            return this.f142606a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Z) && C17542s.e(this.f142606a, ((Z) obj).f142606a);
        }

        public int hashCode() {
            return this.f142606a.hashCode();
        }

        public String toString() {
            CachedCatalogItem cachedCatalogItem = this.f142606a;
            return "OnSwapSelected(item=" + cachedCatalogItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$a;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "", "attempted", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$a  reason: collision with other inner class name */
    public static final class C3476a extends a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f142607a;

        public C3476a(boolean z10) {
            super((DefaultConstructorMarker) null);
            this.f142607a = z10;
        }

        public final boolean a() {
            return this.f142607a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3476a) && this.f142607a == ((C3476a) obj).f142607a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f142607a);
        }

        public String toString() {
            boolean z10 = this.f142607a;
            return "AuthenticationAttempted(attempted=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$a0;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a0 extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final a0 f142608a = new a0();

        private a0() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a0);
        }

        public int hashCode() {
            return 2141678229;
        }

        public String toString() {
            return "OnSwapToggled";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$b;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$b  reason: case insensitive filesystem */
    public static final class C17122b extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C17122b f142609a = new C17122b();

        private C17122b() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C17122b);
        }

        public int hashCode() {
            return 563437408;
        }

        public String toString() {
            return "AuthenticationStarted";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$b0;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b0 extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b0 f142610a = new b0();

        private b0() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b0);
        }

        public int hashCode() {
            return -640673358;
        }

        public String toString() {
            return "OnTopView";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$c;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "b", "c", "a", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$c$a;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$c$b;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$c$c;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$c  reason: case insensitive filesystem */
    public static abstract class C17123c extends a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$c$a;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$c;", "Lcom/sugarcube/core/network/models/QuickFilter;", "filter", "<init>", "(Lcom/sugarcube/core/network/models/QuickFilter;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/core/network/models/QuickFilter;", "()Lcom/sugarcube/core/network/models/QuickFilter;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$c$a  reason: collision with other inner class name */
        public static final class C3477a extends C17123c {

            /* renamed from: a  reason: collision with root package name */
            private final QuickFilter f142611a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3477a(QuickFilter quickFilter) {
                super((DefaultConstructorMarker) null);
                C17542s.j(quickFilter, "filter");
                this.f142611a = quickFilter;
            }

            public final QuickFilter a() {
                return this.f142611a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3477a) && C17542s.e(this.f142611a, ((C3477a) obj).f142611a);
            }

            public int hashCode() {
                return this.f142611a.hashCode();
            }

            public String toString() {
                QuickFilter quickFilter = this.f142611a;
                return "ApplyFilter(filter=" + quickFilter + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$c$b;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$c;", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "<init>", "(Lcom/sugarcube/core/network/models/RoomType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/core/network/models/RoomType;", "()Lcom/sugarcube/core/network/models/RoomType;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$c$b */
        public static final class b extends C17123c {

            /* renamed from: a  reason: collision with root package name */
            private final RoomType f142612a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(RoomType roomType) {
                super((DefaultConstructorMarker) null);
                C17542s.j(roomType, "roomType");
                this.f142612a = roomType;
            }

            public final RoomType a() {
                return this.f142612a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f142612a == ((b) obj).f142612a;
            }

            public int hashCode() {
                return this.f142612a.hashCode();
            }

            public String toString() {
                RoomType roomType = this.f142612a;
                return "FetchItems(roomType=" + roomType + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$c$c;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$c;", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "<init>", "(Lcom/sugarcube/core/network/models/RoomType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/core/network/models/RoomType;", "()Lcom/sugarcube/core/network/models/RoomType;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$c$c  reason: collision with other inner class name */
        public static final class C3478c extends C17123c {

            /* renamed from: a  reason: collision with root package name */
            private final RoomType f142613a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3478c(RoomType roomType) {
                super((DefaultConstructorMarker) null);
                C17542s.j(roomType, "roomType");
                this.f142613a = roomType;
            }

            public final RoomType a() {
                return this.f142613a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3478c) && this.f142613a == ((C3478c) obj).f142613a;
            }

            public int hashCode() {
                return this.f142613a.hashCode();
            }

            public String toString() {
                RoomType roomType = this.f142613a;
                return "LoadMore(roomType=" + roomType + ")";
            }
        }

        public /* synthetic */ C17123c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C17123c() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$c0;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c0 extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final c0 f142614a = new c0();

        private c0() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c0);
        }

        public int hashCode() {
            return -1801326790;
        }

        public String toString() {
            return "OnVariantsToggled";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$d;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$d  reason: case insensitive filesystem */
    public static final class C17124d extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C17124d f142615a = new C17124d();

        private C17124d() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C17124d);
        }

        public int hashCode() {
            return -1715232583;
        }

        public String toString() {
            return "OnAdd";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$d0;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "LmG/a;", "multiviewInformation", "<init>", "(LmG/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LmG/a;", "()LmG/a;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d0 extends a {

        /* renamed from: a  reason: collision with root package name */
        private final C17596a f142616a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d0(C17596a aVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(aVar, "multiviewInformation");
            this.f142616a = aVar;
        }

        public final C17596a a() {
            return this.f142616a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && C17542s.e(this.f142616a, ((d0) obj).f142616a);
        }

        public int hashCode() {
            return this.f142616a.hashCode();
        }

        public String toString() {
            C17596a aVar = this.f142616a;
            return "OnViewportSelected(multiviewInformation=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$e;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "LrG/a;", "item", "<init>", "(LrG/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LrG/a;", "()LrG/a;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$e  reason: case insensitive filesystem */
    public static final class C17125e extends a {

        /* renamed from: a  reason: collision with root package name */
        private final C17847a f142617a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17125e(C17847a aVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(aVar, "item");
            this.f142617a = aVar;
        }

        public final C17847a a() {
            return this.f142617a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17125e) && C17542s.e(this.f142617a, ((C17125e) obj).f142617a);
        }

        public int hashCode() {
            return this.f142617a.hashCode();
        }

        public String toString() {
            C17847a aVar = this.f142617a;
            return "OnAddItemToBag(item=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$e0;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "LSG/b;", "color", "<init>", "(LSG/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LSG/b;", "()LSG/b;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e0 extends a {

        /* renamed from: a  reason: collision with root package name */
        private final C16404b f142618a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e0(C16404b bVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(bVar, "color");
            this.f142618a = bVar;
        }

        public final C16404b a() {
            return this.f142618a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e0) && C17542s.e(this.f142618a, ((e0) obj).f142618a);
        }

        public int hashCode() {
            return this.f142618a.hashCode();
        }

        public String toString() {
            C16404b bVar = this.f142618a;
            return "OnWallColorSelected(color=" + bVar + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$f;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "", "LrG/a;", "items", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$f  reason: case insensitive filesystem */
    public static final class C17126f extends a {

        /* renamed from: a  reason: collision with root package name */
        private final List<C17847a> f142619a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17126f(List<C17847a> list) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "items");
            this.f142619a = list;
        }

        public final List<C17847a> a() {
            return this.f142619a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17126f) && C17542s.e(this.f142619a, ((C17126f) obj).f142619a);
        }

        public int hashCode() {
            return this.f142619a.hashCode();
        }

        public String toString() {
            List<C17847a> list = this.f142619a;
            return "OnAddItemsToBag(items=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$f0;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "a", "b", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$f0$a;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$f0$b;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class f0 extends a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$f0$a;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$f0;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "cachedCatalogItem", "<init>", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "()Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$f0$a  reason: collision with other inner class name */
        public static final class C3479a extends f0 {

            /* renamed from: a  reason: collision with root package name */
            private final CachedCatalogItem f142620a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3479a(CachedCatalogItem cachedCatalogItem) {
                super((DefaultConstructorMarker) null);
                C17542s.j(cachedCatalogItem, "cachedCatalogItem");
                this.f142620a = cachedCatalogItem;
            }

            public final CachedCatalogItem a() {
                return this.f142620a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3479a) && C17542s.e(this.f142620a, ((C3479a) obj).f142620a);
            }

            public int hashCode() {
                return this.f142620a.hashCode();
            }

            public String toString() {
                CachedCatalogItem cachedCatalogItem = this.f142620a;
                return "Fetch(cachedCatalogItem=" + cachedCatalogItem + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$f0$b;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$f0;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "", "isIncompatible", "<init>", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "()Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "b", "Z", "()Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends f0 {

            /* renamed from: a  reason: collision with root package name */
            private final CachedCatalogItem f142621a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f142622b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(CachedCatalogItem cachedCatalogItem, boolean z10) {
                super((DefaultConstructorMarker) null);
                C17542s.j(cachedCatalogItem, "item");
                this.f142621a = cachedCatalogItem;
                this.f142622b = z10;
            }

            public final CachedCatalogItem a() {
                return this.f142621a;
            }

            public final boolean b() {
                return this.f142622b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f142621a, bVar.f142621a) && this.f142622b == bVar.f142622b;
            }

            public int hashCode() {
                return (this.f142621a.hashCode() * 31) + Boolean.hashCode(this.f142622b);
            }

            public String toString() {
                CachedCatalogItem cachedCatalogItem = this.f142621a;
                boolean z10 = this.f142622b;
                return "OnVariantSelected(item=" + cachedCatalogItem + ", isIncompatible=" + z10 + ")";
            }
        }

        public /* synthetic */ f0(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private f0() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$g;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$g  reason: case insensitive filesystem */
    public static final class C17127g extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C17127g f142623a = new C17127g();

        private C17127g() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C17127g);
        }

        public int hashCode() {
            return 1342446164;
        }

        public String toString() {
            return "OnAddToBag";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$h;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "<init>", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "()Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$h  reason: case insensitive filesystem */
    public static final class C17128h extends a {

        /* renamed from: a  reason: collision with root package name */
        private final CachedCatalogItem f142624a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17128h(CachedCatalogItem cachedCatalogItem) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cachedCatalogItem, "item");
            this.f142624a = cachedCatalogItem;
        }

        public final CachedCatalogItem a() {
            return this.f142624a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17128h) && C17542s.e(this.f142624a, ((C17128h) obj).f142624a);
        }

        public int hashCode() {
            return this.f142624a.hashCode();
        }

        public String toString() {
            CachedCatalogItem cachedCatalogItem = this.f142624a;
            return "OnBedDisclaimerClicked(item=" + cachedCatalogItem + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$i;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$i  reason: case insensitive filesystem */
    public static final class C17129i extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C17129i f142625a = new C17129i();

        private C17129i() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C17129i);
        }

        public int hashCode() {
            return 1374510962;
        }

        public String toString() {
            return "OnCartMessageShown";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$j;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$j  reason: case insensitive filesystem */
    public static final class C17130j extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C17130j f142626a = new C17130j();

        private C17130j() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C17130j);
        }

        public int hashCode() {
            return -651887961;
        }

        public String toString() {
            return "OnClearSelection";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$k;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$k  reason: case insensitive filesystem */
    public static final class C17131k extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C17131k f142627a = new C17131k();

        private C17131k() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C17131k);
        }

        public int hashCode() {
            return 1018472122;
        }

        public String toString() {
            return "OnCloseBrowse";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$l;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$l  reason: case insensitive filesystem */
    public static final class C17132l extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C17132l f142628a = new C17132l();

        private C17132l() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C17132l);
        }

        public int hashCode() {
            return -1840265392;
        }

        public String toString() {
            return "OnCloseCart";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$m;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$m  reason: case insensitive filesystem */
    public static final class C17133m extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C17133m f142629a = new C17133m();

        private C17133m() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C17133m);
        }

        public int hashCode() {
            return 1422332238;
        }

        public String toString() {
            return "OnCloseMultiView";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$n;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$n  reason: case insensitive filesystem */
    public static final class C17134n extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C17134n f142630a = new C17134n();

        private C17134n() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C17134n);
        }

        public int hashCode() {
            return -1180809581;
        }

        public String toString() {
            return "OnDelete";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$o;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "", "title", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$o  reason: case insensitive filesystem */
    public static final class C17135o extends a {

        /* renamed from: a  reason: collision with root package name */
        private final String f142631a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17135o(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "title");
            this.f142631a = str;
        }

        public final String a() {
            return this.f142631a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17135o) && C17542s.e(this.f142631a, ((C17135o) obj).f142631a);
        }

        public int hashCode() {
            return this.f142631a.hashCode();
        }

        public String toString() {
            String str = this.f142631a;
            return "OnDesignNameUpdated(title=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$p;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$p  reason: case insensitive filesystem */
    public static final class C17136p extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C17136p f142632a = new C17136p();

        private C17136p() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C17136p);
        }

        public int hashCode() {
            return -1845715879;
        }

        public String toString() {
            return "OnDialogDismissed";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$q;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$q  reason: case insensitive filesystem */
    public static final class C17137q extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C17137q f142633a = new C17137q();

        private C17137q() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C17137q);
        }

        public int hashCode() {
            return -1772269326;
        }

        public String toString() {
            return "OnDollHouseView";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$r;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$r  reason: case insensitive filesystem */
    public static final class C17138r extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C17138r f142634a = new C17138r();

        private C17138r() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C17138r);
        }

        public int hashCode() {
            return -155581661;
        }

        public String toString() {
            return "OnDuplicate";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$s;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$s  reason: case insensitive filesystem */
    public static final class C17139s extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C17139s f142635a = new C17139s();

        private C17139s() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C17139s);
        }

        public int hashCode() {
            return 933041342;
        }

        public String toString() {
            return "OnErase";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$t;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$t  reason: case insensitive filesystem */
    public static final class C17140t extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C17140t f142636a = new C17140t();

        private C17140t() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C17140t);
        }

        public int hashCode() {
            return 1166613856;
        }

        public String toString() {
            return "OnEraseDone";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$u;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$u  reason: case insensitive filesystem */
    public static final class C17141u extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C17141u f142637a = new C17141u();

        private C17141u() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C17141u);
        }

        public int hashCode() {
            return -1207871903;
        }

        public String toString() {
            return "OnEraseHideAll";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$v;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$v  reason: case insensitive filesystem */
    public static final class C17142v extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C17142v f142638a = new C17142v();

        private C17142v() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C17142v);
        }

        public int hashCode() {
            return -53200186;
        }

        public String toString() {
            return "OnEraseShowAll";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$w;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "", "fatal", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$w  reason: case insensitive filesystem */
    public static final class C17143w extends a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f142639a;

        public C17143w(boolean z10) {
            super((DefaultConstructorMarker) null);
            this.f142639a = z10;
        }

        public final boolean a() {
            return this.f142639a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17143w) && this.f142639a == ((C17143w) obj).f142639a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f142639a);
        }

        public String toString() {
            boolean z10 = this.f142639a;
            return "OnErrorAcknowledged(fatal=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$x;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$x  reason: case insensitive filesystem */
    public static final class C17144x extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C17144x f142640a = new C17144x();

        private C17144x() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C17144x);
        }

        public int hashCode() {
            return -1632463866;
        }

        public String toString() {
            return "OnExit";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$y;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "", "exit", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$y  reason: case insensitive filesystem */
    public static final class C17145y extends a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f142641a;

        public C17145y(boolean z10) {
            super((DefaultConstructorMarker) null);
            this.f142641a = z10;
        }

        public final boolean a() {
            return this.f142641a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17145y) && this.f142641a == ((C17145y) obj).f142641a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f142641a);
        }

        public String toString() {
            boolean z10 = this.f142641a;
            return "OnExitOrCancel(exit=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/a$z;", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.decorate.v2.internal.ui.surface.a$z  reason: case insensitive filesystem */
    public static final class C17146z extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C17146z f142642a = new C17146z();

        private C17146z() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C17146z);
        }

        public int hashCode() {
            return 1282129084;
        }

        public String toString() {
            return "OnFeedbackDismissed";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
