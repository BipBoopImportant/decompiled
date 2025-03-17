package com.ingka.ikea.app.scannerbase.googlevision;

import android.graphics.Rect;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/scannerbase/googlevision/a;", "", "", "Lcom/ingka/ikea/app/scannerbase/googlevision/a$a;", "barcodes", "LXH/N;", "a", "(Ljava/util/List;)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/app/scannerbase/googlevision/a$a;", "", "Landroid/graphics/Rect;", "bounds", "", "isHighlighted", "<init>", "(Landroid/graphics/Rect;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "b", "Z", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.app.scannerbase.googlevision.a$a  reason: collision with other inner class name */
    public static final class C2047a {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f92344a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f92345b;

        public C2047a(Rect rect, boolean z10) {
            C17542s.j(rect, "bounds");
            this.f92344a = rect;
            this.f92345b = z10;
        }

        public final Rect a() {
            return this.f92344a;
        }

        public final boolean b() {
            return this.f92345b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2047a)) {
                return false;
            }
            C2047a aVar = (C2047a) obj;
            return C17542s.e(this.f92344a, aVar.f92344a) && this.f92345b == aVar.f92345b;
        }

        public int hashCode() {
            return (this.f92344a.hashCode() * 31) + Boolean.hashCode(this.f92345b);
        }

        public String toString() {
            Rect rect = this.f92344a;
            boolean z10 = this.f92345b;
            return "Barcode(bounds=" + rect + ", isHighlighted=" + z10 + ")";
        }
    }

    void a(List<C2047a> list);
}
