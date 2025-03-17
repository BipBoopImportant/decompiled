package com.sugarcube.app.base.ui.gallery;

import XH.C16818i;
import androidx.lifecycle.L;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\t\"*\u0010\b\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0001\u0010\u0003\"\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/h;", "a", "Lcom/sugarcube/app/base/ui/gallery/h;", "()Lcom/sugarcube/app/base/ui/gallery/h;", "b", "(Lcom/sugarcube/app/base/ui/gallery/h;)V", "getGalleryHomeFragmentTab$annotations", "()V", "GalleryHomeFragmentTab", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static h f124340a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.gallery.a$a  reason: collision with other inner class name */
    static final class C3052a implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f124341a;

        C3052a(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f124341a = lVar;
        }

        public final C16818i<?> c() {
            return this.f124341a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f124341a.invoke(obj);
        }
    }

    public static final h a() {
        return f124340a;
    }

    public static final void b(h hVar) {
        f124340a = hVar;
    }
}
