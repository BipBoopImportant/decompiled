package com.sugarcube.app.base.ui.gallery;

import QJ.F0;
import QJ.Q;
import QJ.T;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16511H;
import TJ.C16532g;
import XH.C16807N;
import XH.y;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.data.model.Design;
import com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0004J!\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\u0004J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010\u0004R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/b;", "Landroidx/lifecycle/f0;", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "<init>", "()V", "Lcom/sugarcube/app/base/ui/gallery/b$a;", "event", "LXH/N;", "i", "(Lcom/sugarcube/app/base/ui/gallery/b$a;)V", "onNewScanClicked", "Lcom/sugarcube/app/base/data/model/Design;", "design", "", "furnitureIds", "onNewDesignClicked", "(Lcom/sugarcube/app/base/data/model/Design;Ljava/lang/String;)V", "Lcom/sugarcube/app/base/data/database/Scene;", "scene", "onRetryUploadClicked", "(Lcom/sugarcube/app/base/data/database/Scene;)V", "Ljava/util/UUID;", "uuid", "onSceneDesignExistingClicked", "(Ljava/util/UUID;)V", "onSceneSelected", "Lcom/sugarcube/app/base/ui/gallery/h;", "tab", "onNeedHelpClicked", "(Lcom/sugarcube/app/base/ui/gallery/h;)V", "openHelpCenter", "onSignUpClicked", "onLoginClicked", "onDesignOnWebClicked", "type", "onJumpClicked", "(Ljava/lang/String;)V", "onPrivacyPolicyConsentContinueClicked", "onPullRefresh", "LTJ/A;", "m", "LTJ/A;", "_event", "LTJ/g;", "n", "LTJ/g;", "C", "()LTJ/g;", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends f0 implements GalleryHomeContentAdapter.OnInteractionsListener {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C16504A<a> f124354m;

    /* renamed from: n  reason: collision with root package name */
    private final C16532g<a> f124355n;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/b$a;", "", "<init>", "()V", "f", "e", "i", "j", "k", "d", "m", "l", "c", "a", "b", "g", "h", "Lcom/sugarcube/app/base/ui/gallery/b$a$a;", "Lcom/sugarcube/app/base/ui/gallery/b$a$b;", "Lcom/sugarcube/app/base/ui/gallery/b$a$c;", "Lcom/sugarcube/app/base/ui/gallery/b$a$d;", "Lcom/sugarcube/app/base/ui/gallery/b$a$e;", "Lcom/sugarcube/app/base/ui/gallery/b$a$f;", "Lcom/sugarcube/app/base/ui/gallery/b$a$g;", "Lcom/sugarcube/app/base/ui/gallery/b$a$h;", "Lcom/sugarcube/app/base/ui/gallery/b$a$i;", "Lcom/sugarcube/app/base/ui/gallery/b$a$j;", "Lcom/sugarcube/app/base/ui/gallery/b$a$k;", "Lcom/sugarcube/app/base/ui/gallery/b$a$l;", "Lcom/sugarcube/app/base/ui/gallery/b$a$m;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/b$a$a;", "Lcom/sugarcube/app/base/ui/gallery/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.ui.gallery.b$a$a  reason: collision with other inner class name */
        public static final class C3053a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C3053a f124356a = new C3053a();

            private C3053a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C3053a);
            }

            public int hashCode() {
                return 1782471082;
            }

            public String toString() {
                return "OnDesignOnWebClicked";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/b$a$b;", "Lcom/sugarcube/app/base/ui/gallery/b$a;", "", "type", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.ui.gallery.b$a$b  reason: collision with other inner class name */
        public static final class C3054b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final String f124357a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3054b(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "type");
                this.f124357a = str;
            }

            public final String a() {
                return this.f124357a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3054b) && C17542s.e(this.f124357a, ((C3054b) obj).f124357a);
            }

            public int hashCode() {
                return this.f124357a.hashCode();
            }

            public String toString() {
                String str = this.f124357a;
                return "OnJumpClicked(type=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/b$a$c;", "Lcom/sugarcube/app/base/ui/gallery/b$a;", "Lcom/sugarcube/app/base/ui/gallery/h;", "tab", "<init>", "(Lcom/sugarcube/app/base/ui/gallery/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/ui/gallery/h;", "()Lcom/sugarcube/app/base/ui/gallery/h;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final h f124358a;

            public c(h hVar) {
                super((DefaultConstructorMarker) null);
                this.f124358a = hVar;
            }

            public final h a() {
                return this.f124358a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f124358a, ((c) obj).f124358a);
            }

            public int hashCode() {
                h hVar = this.f124358a;
                if (hVar == null) {
                    return 0;
                }
                return hVar.hashCode();
            }

            public String toString() {
                h hVar = this.f124358a;
                return "OnLoginClicked(tab=" + hVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/b$a$d;", "Lcom/sugarcube/app/base/ui/gallery/b$a;", "Lcom/sugarcube/app/base/ui/gallery/h;", "tab", "<init>", "(Lcom/sugarcube/app/base/ui/gallery/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/ui/gallery/h;", "()Lcom/sugarcube/app/base/ui/gallery/h;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d extends a {

            /* renamed from: a  reason: collision with root package name */
            private final h f124359a;

            public d(h hVar) {
                super((DefaultConstructorMarker) null);
                this.f124359a = hVar;
            }

            public final h a() {
                return this.f124359a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && C17542s.e(this.f124359a, ((d) obj).f124359a);
            }

            public int hashCode() {
                h hVar = this.f124359a;
                if (hVar == null) {
                    return 0;
                }
                return hVar.hashCode();
            }

            public String toString() {
                h hVar = this.f124359a;
                return "OnNeedHelpClicked(tab=" + hVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/b$a$e;", "Lcom/sugarcube/app/base/ui/gallery/b$a;", "Lcom/sugarcube/app/base/data/model/Design;", "design", "", "furnitureIds", "<init>", "(Lcom/sugarcube/app/base/data/model/Design;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/model/Design;", "()Lcom/sugarcube/app/base/data/model/Design;", "b", "Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Design f124360a;

            /* renamed from: b  reason: collision with root package name */
            private final String f124361b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(Design design, String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(design, "design");
                this.f124360a = design;
                this.f124361b = str;
            }

            public final Design a() {
                return this.f124360a;
            }

            public final String b() {
                return this.f124361b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return C17542s.e(this.f124360a, eVar.f124360a) && C17542s.e(this.f124361b, eVar.f124361b);
            }

            public int hashCode() {
                int hashCode = this.f124360a.hashCode() * 31;
                String str = this.f124361b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                Design design = this.f124360a;
                String str = this.f124361b;
                return "OnNewDesignClicked(design=" + design + ", furnitureIds=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/b$a$f;", "Lcom/sugarcube/app/base/ui/gallery/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class f extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final f f124362a = new f();

            private f() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return 1758846340;
            }

            public String toString() {
                return "OnNewScanClicked";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/b$a$g;", "Lcom/sugarcube/app/base/ui/gallery/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class g extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final g f124363a = new g();

            private g() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return 598401382;
            }

            public String toString() {
                return "OnPrivacyPolicyConsentContinueClicked";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/b$a$h;", "Lcom/sugarcube/app/base/ui/gallery/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class h extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final h f124364a = new h();

            private h() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public int hashCode() {
                return 314550972;
            }

            public String toString() {
                return "OnPullRefresh";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/b$a$i;", "Lcom/sugarcube/app/base/ui/gallery/b$a;", "Lcom/sugarcube/app/base/data/database/Scene;", "scene", "<init>", "(Lcom/sugarcube/app/base/data/database/Scene;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/database/Scene;", "()Lcom/sugarcube/app/base/data/database/Scene;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class i extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Scene f124365a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public i(Scene scene) {
                super((DefaultConstructorMarker) null);
                C17542s.j(scene, "scene");
                this.f124365a = scene;
            }

            public final Scene a() {
                return this.f124365a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && C17542s.e(this.f124365a, ((i) obj).f124365a);
            }

            public int hashCode() {
                return this.f124365a.hashCode();
            }

            public String toString() {
                Scene scene = this.f124365a;
                return "OnRetryUploadClicked(scene=" + scene + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/b$a$j;", "Lcom/sugarcube/app/base/ui/gallery/b$a;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class j extends a {

            /* renamed from: a  reason: collision with root package name */
            private final UUID f124366a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public j(UUID uuid) {
                super((DefaultConstructorMarker) null);
                C17542s.j(uuid, "uuid");
                this.f124366a = uuid;
            }

            public final UUID a() {
                return this.f124366a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && C17542s.e(this.f124366a, ((j) obj).f124366a);
            }

            public int hashCode() {
                return this.f124366a.hashCode();
            }

            public String toString() {
                UUID uuid = this.f124366a;
                return "OnSceneDesignExistingClicked(uuid=" + uuid + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/b$a$k;", "Lcom/sugarcube/app/base/ui/gallery/b$a;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class k extends a {

            /* renamed from: a  reason: collision with root package name */
            private final UUID f124367a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public k(UUID uuid) {
                super((DefaultConstructorMarker) null);
                C17542s.j(uuid, "uuid");
                this.f124367a = uuid;
            }

            public final UUID a() {
                return this.f124367a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && C17542s.e(this.f124367a, ((k) obj).f124367a);
            }

            public int hashCode() {
                return this.f124367a.hashCode();
            }

            public String toString() {
                UUID uuid = this.f124367a;
                return "OnSceneSelected(uuid=" + uuid + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/b$a$l;", "Lcom/sugarcube/app/base/ui/gallery/b$a;", "Lcom/sugarcube/app/base/ui/gallery/h;", "tab", "<init>", "(Lcom/sugarcube/app/base/ui/gallery/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/ui/gallery/h;", "()Lcom/sugarcube/app/base/ui/gallery/h;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class l extends a {

            /* renamed from: a  reason: collision with root package name */
            private final h f124368a;

            public l(h hVar) {
                super((DefaultConstructorMarker) null);
                this.f124368a = hVar;
            }

            public final h a() {
                return this.f124368a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && C17542s.e(this.f124368a, ((l) obj).f124368a);
            }

            public int hashCode() {
                h hVar = this.f124368a;
                if (hVar == null) {
                    return 0;
                }
                return hVar.hashCode();
            }

            public String toString() {
                h hVar = this.f124368a;
                return "OnSignUpClicked(tab=" + hVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/b$a$m;", "Lcom/sugarcube/app/base/ui/gallery/b$a;", "Lcom/sugarcube/app/base/ui/gallery/h;", "tab", "<init>", "(Lcom/sugarcube/app/base/ui/gallery/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/ui/gallery/h;", "()Lcom/sugarcube/app/base/ui/gallery/h;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class m extends a {

            /* renamed from: a  reason: collision with root package name */
            private final h f124369a;

            public m(h hVar) {
                super((DefaultConstructorMarker) null);
                this.f124369a = hVar;
            }

            public final h a() {
                return this.f124369a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && C17542s.e(this.f124369a, ((m) obj).f124369a);
            }

            public int hashCode() {
                h hVar = this.f124369a;
                if (hVar == null) {
                    return 0;
                }
                return hVar.hashCode();
            }

            public String toString() {
                h hVar = this.f124369a;
                return "OpenHelpCenter(tab=" + hVar + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.gallery.GalleryInteractionsViewModel$emitEvent$1", f = "GalleryInteractionsViewModel.kt", l = {59}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.gallery.b$b  reason: collision with other inner class name */
    static final class C3055b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f124370c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f124371d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f124372e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3055b(b bVar, a aVar, C17164e<? super C3055b> eVar) {
            super(2, eVar);
            this.f124371d = bVar;
            this.f124372e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C3055b(this.f124371d, this.f124372e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C3055b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124370c;
            if (i10 == 0) {
                y.b(obj);
                C16504A h10 = this.f124371d.f124354m;
                a aVar = this.f124372e;
                this.f124370c = 1;
                if (h10.emit(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public b() {
        C16504A<a> b10 = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);
        this.f124354m = b10;
        this.f124355n = b10;
    }

    private final void i(a aVar) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C3055b(this, aVar, (C17164e<? super C3055b>) null), 3, (Object) null);
    }

    public final C16532g<a> C() {
        return this.f124355n;
    }

    public void onDesignOnWebClicked() {
        i(a.C3053a.f124356a);
    }

    public void onJumpClicked(String str) {
        C17542s.j(str, "type");
        i(new a.C3054b(str));
    }

    public void onLoginClicked(h hVar) {
        i(new a.c(hVar));
    }

    public void onNeedHelpClicked(h hVar) {
        i(new a.d(hVar));
    }

    public void onNewDesignClicked(Design design, String str) {
        C17542s.j(design, "design");
        i(new a.e(design, str));
    }

    public void onNewScanClicked() {
        i(a.f.f124362a);
    }

    public void onPrivacyPolicyConsentContinueClicked() {
        i(a.g.f124363a);
    }

    public void onPullRefresh() {
        i(a.h.f124364a);
    }

    public void onRetryUploadClicked(Scene scene) {
        C17542s.j(scene, "scene");
        i(new a.i(scene));
    }

    public void onSceneDesignExistingClicked(UUID uuid) {
        C17542s.j(uuid, "uuid");
        i(new a.j(uuid));
    }

    public void onSceneSelected(UUID uuid) {
        C17542s.j(uuid, "uuid");
        i(new a.k(uuid));
    }

    public void onSignUpClicked(h hVar) {
        i(new a.l(hVar));
    }

    public void openHelpCenter(h hVar) {
        i(new a.m(hVar));
    }
}
