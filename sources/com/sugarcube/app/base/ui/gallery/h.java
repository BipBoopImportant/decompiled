package com.sugarcube.app.base.ui.gallery;

import OE.n;
import YH.g0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00102\u00020\u0001:\u0004\u000b\u000e\u0010\tB!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\f\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/h;", "", "", "deeplinkKey", "", "displayResId", "analyticValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "I", "c", "()I", "d", "Lcom/sugarcube/app/base/ui/gallery/h$b;", "Lcom/sugarcube/app/base/ui/gallery/h$c;", "Lcom/sugarcube/app/base/ui/gallery/h$d;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f124414d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f124415a;

    /* renamed from: b  reason: collision with root package name */
    private final int f124416b;

    /* renamed from: c  reason: collision with root package name */
    private final String f124417c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/h$a;", "", "<init>", "()V", "", "key", "Lcom/sugarcube/app/base/ui/gallery/h;", "a", "(Ljava/lang/String;)Lcom/sugarcube/app/base/ui/gallery/h;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(String str) {
            Object obj;
            C17542s.j(str, "key");
            Iterator it = g0.h(b.f124418e, c.f124419e, d.f124420e).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C17542s.e(((h) obj).b(), str)) {
                    break;
                }
            }
            return (h) obj;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/h$b;", "Lcom/sugarcube/app/base/ui/gallery/h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends h {

        /* renamed from: e  reason: collision with root package name */
        public static final b f124418e = new b();

        private b() {
            super("designs", n.f113298V4, "Designs", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -167833529;
        }

        public String toString() {
            return "DESIGNS";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/h$c;", "Lcom/sugarcube/app/base/ui/gallery/h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends h {

        /* renamed from: e  reason: collision with root package name */
        public static final c f124419e = new c();

        private c() {
            super("scans", n.f113304W4, "Scans", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1510750773;
        }

        public String toString() {
            return "SCAN";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/h$d;", "Lcom/sugarcube/app/base/ui/gallery/h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends h {

        /* renamed from: e  reason: collision with root package name */
        public static final d f124420e = new d();

        private d() {
            super("showrooms", n.f113310X4, "Showrooms", (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -1626833043;
        }

        public String toString() {
            return "SHOWROOMS";
        }
    }

    public /* synthetic */ h(String str, int i10, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, str2);
    }

    public final String a() {
        return this.f124417c;
    }

    public final String b() {
        return this.f124415a;
    }

    public final int c() {
        return this.f124416b;
    }

    private h(String str, int i10, String str2) {
        this.f124415a = str;
        this.f124416b = i10;
        this.f124417c = str2;
    }
}
