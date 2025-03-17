package com.google.firebase.crashlytics.ndk;

import Tb.F;
import java.io.File;

final class f {

    /* renamed from: a  reason: collision with root package name */
    public final c f68247a;

    /* renamed from: b  reason: collision with root package name */
    public final File f68248b;

    /* renamed from: c  reason: collision with root package name */
    public final File f68249c;

    /* renamed from: d  reason: collision with root package name */
    public final File f68250d;

    /* renamed from: e  reason: collision with root package name */
    public final File f68251e;

    /* renamed from: f  reason: collision with root package name */
    public final File f68252f;

    /* renamed from: g  reason: collision with root package name */
    public final File f68253g;

    static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public c f68254a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public File f68255b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public File f68256c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public File f68257d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public File f68258e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public File f68259f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public File f68260g;

        b() {
        }

        /* access modifiers changed from: package-private */
        public b h(File file) {
            this.f68258e = file;
            return this;
        }

        /* access modifiers changed from: package-private */
        public f i() {
            return new f(this);
        }

        /* access modifiers changed from: package-private */
        public b j(File file) {
            this.f68259f = file;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b k(File file) {
            this.f68256c = file;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b l(c cVar) {
            this.f68254a = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b m(File file) {
            this.f68260g = file;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b n(File file) {
            this.f68257d = file;
            return this;
        }
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final File f68261a;

        /* renamed from: b  reason: collision with root package name */
        public final F.a f68262b;

        c(File file, F.a aVar) {
            this.f68261a = file;
            this.f68262b = aVar;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            File file = this.f68261a;
            return (file != null && file.exists()) || this.f68262b != null;
        }
    }

    private f(b bVar) {
        this.f68247a = bVar.f68254a;
        this.f68248b = bVar.f68255b;
        this.f68249c = bVar.f68256c;
        this.f68250d = bVar.f68257d;
        this.f68251e = bVar.f68258e;
        this.f68252f = bVar.f68259f;
        this.f68253g = bVar.f68260g;
    }
}
