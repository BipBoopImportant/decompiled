package com.sugarcube.app.base.external.entrypoint;

import U0.C4889m;
import XH.C16807N;
import android.net.Uri;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\f\rJ4\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H§\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase;", "", "Landroidx/compose/ui/d;", "modifier", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model;", "latestSpace", "Lkotlin/Function1;", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$a;", "LXH/N;", "onAction", "invoke", "(Landroidx/compose/ui/d;Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model;LnI/l;LU0/m;I)V", "a", "Model", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface GetMembershipListsCardUseCase {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$a;", "", "<init>", "()V", "c", "d", "a", "b", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$a$a;", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$a$b;", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$a$c;", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$a$d;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$a$a;", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$a;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase$a$a  reason: collision with other inner class name */
        public static final class C3032a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Uri f123096a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3032a(Uri uri) {
                super((DefaultConstructorMarker) null);
                C17542s.j(uri, "uri");
                this.f123096a = uri;
            }

            public Uri a() {
                return this.f123096a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3032a) && C17542s.e(this.f123096a, ((C3032a) obj).f123096a);
            }

            public int hashCode() {
                return this.f123096a.hashCode();
            }

            public String toString() {
                Uri uri = this.f123096a;
                return "LatestSpace(uri=" + uri + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$a$b;", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$a;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Uri f123097a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Uri uri) {
                super((DefaultConstructorMarker) null);
                C17542s.j(uri, "uri");
                this.f123097a = uri;
            }

            public Uri a() {
                return this.f123097a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f123097a, ((b) obj).f123097a);
            }

            public int hashCode() {
                return this.f123097a.hashCode();
            }

            public String toString() {
                Uri uri = this.f123097a;
                return "SavedRooms(uri=" + uri + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$a$c;", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$a;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Uri f123098a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(Uri uri) {
                super((DefaultConstructorMarker) null);
                C17542s.j(uri, "uri");
                this.f123098a = uri;
            }

            public Uri a() {
                return this.f123098a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f123098a, ((c) obj).f123098a);
            }

            public int hashCode() {
                return this.f123098a.hashCode();
            }

            public String toString() {
                Uri uri = this.f123098a;
                return "StartScan(uri=" + uri + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$a$d;", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$a;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Uri f123099a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(Uri uri) {
                super((DefaultConstructorMarker) null);
                C17542s.j(uri, "uri");
                this.f123099a = uri;
            }

            public Uri a() {
                return this.f123099a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && C17542s.e(this.f123099a, ((d) obj).f123099a);
            }

            public int hashCode() {
                return this.f123099a.hashCode();
            }

            public String toString() {
                Uri uri = this.f123099a;
                return "TryShowroom(uri=" + uri + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    void invoke(d dVar, Model model, C17642l<? super a, C16807N> lVar, C4889m mVar, int i10);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model;", "", "b", "a", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model$a;", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model$b;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Model {

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0013\b\b\u0018\u0000 %2\u00020\u0001:\u0001\u0017BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0017\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model$a;", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model;", "", "titleRes", "descriptionRes", "backgroundImageRes", "Landroid/net/Uri;", "backgroundVideo", "primaryButtonTextRes", "secondaryButtonTextRes", "", "isInverted", "<init>", "(IIILandroid/net/Uri;ILjava/lang/Integer;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "f", "b", "c", "d", "Landroid/net/Uri;", "()Landroid/net/Uri;", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "g", "Z", "()Z", "h", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Model {

            /* renamed from: h  reason: collision with root package name */
            public static final C3031a f123080h = new C3031a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final int f123081a;

            /* renamed from: b  reason: collision with root package name */
            private final int f123082b;

            /* renamed from: c  reason: collision with root package name */
            private final int f123083c;

            /* renamed from: d  reason: collision with root package name */
            private final Uri f123084d;

            /* renamed from: e  reason: collision with root package name */
            private final int f123085e;

            /* renamed from: f  reason: collision with root package name */
            private final Integer f123086f;

            /* renamed from: g  reason: collision with root package name */
            private final boolean f123087g;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model$a$a;", "", "<init>", "()V", "", "ENTRY_CARD_PRIMARY_BUTTON_TEST_TAG", "Ljava/lang/String;", "ENTRY_CARD_SECONDARY_BUTTON_TEST_TAG", "ENTRY_CARD_VIDEO_PLAY_PAUSE_BUTTON_TEST_TAG", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase$Model$a$a  reason: collision with other inner class name */
            public static final class C3031a {
                public /* synthetic */ C3031a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private C3031a() {
                }
            }

            public a(int i10, int i11, int i12, Uri uri, int i13, Integer num, boolean z10) {
                this.f123081a = i10;
                this.f123082b = i11;
                this.f123083c = i12;
                this.f123084d = uri;
                this.f123085e = i13;
                this.f123086f = num;
                this.f123087g = z10;
            }

            public final int a() {
                return this.f123083c;
            }

            public final Uri b() {
                return this.f123084d;
            }

            public final int c() {
                return this.f123082b;
            }

            public final int d() {
                return this.f123085e;
            }

            public final Integer e() {
                return this.f123086f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f123081a == aVar.f123081a && this.f123082b == aVar.f123082b && this.f123083c == aVar.f123083c && C17542s.e(this.f123084d, aVar.f123084d) && this.f123085e == aVar.f123085e && C17542s.e(this.f123086f, aVar.f123086f) && this.f123087g == aVar.f123087g;
            }

            public final int f() {
                return this.f123081a;
            }

            public final boolean g() {
                return this.f123087g;
            }

            public int hashCode() {
                int hashCode = ((((Integer.hashCode(this.f123081a) * 31) + Integer.hashCode(this.f123082b)) * 31) + Integer.hashCode(this.f123083c)) * 31;
                Uri uri = this.f123084d;
                int i10 = 0;
                int hashCode2 = (((hashCode + (uri == null ? 0 : uri.hashCode())) * 31) + Integer.hashCode(this.f123085e)) * 31;
                Integer num = this.f123086f;
                if (num != null) {
                    i10 = num.hashCode();
                }
                return ((hashCode2 + i10) * 31) + Boolean.hashCode(this.f123087g);
            }

            public String toString() {
                int i10 = this.f123081a;
                int i11 = this.f123082b;
                int i12 = this.f123083c;
                Uri uri = this.f123084d;
                int i13 = this.f123085e;
                Integer num = this.f123086f;
                boolean z10 = this.f123087g;
                return "Entry(titleRes=" + i10 + ", descriptionRes=" + i11 + ", backgroundImageRes=" + i12 + ", backgroundVideo=" + uri + ", primaryButtonTextRes=" + i13 + ", secondaryButtonTextRes=" + num + ", isInverted=" + z10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\b\u0018\u0000 #2\u00020\u0001:\u0001\u0017BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001a\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0017\u0010\u000f¨\u0006$"}, d2 = {"Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model$b;", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model;", "", "title", "update", "Landroid/net/Uri;", "roomImage", "", "showProgress", "ready", "sceneUuid", "compositionUuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;ZZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "g", "c", "Landroid/net/Uri;", "()Landroid/net/Uri;", "d", "Z", "e", "()Z", "h", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements Model {

            /* renamed from: h  reason: collision with root package name */
            public static final a f123088h = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f123089a;

            /* renamed from: b  reason: collision with root package name */
            private final String f123090b;

            /* renamed from: c  reason: collision with root package name */
            private final Uri f123091c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f123092d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f123093e;

            /* renamed from: f  reason: collision with root package name */
            private final String f123094f;

            /* renamed from: g  reason: collision with root package name */
            private final String f123095g;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model$b$a;", "", "<init>", "()V", "", "LATEST_SPACE_LOADING_INDICATOR_TEST_TAG", "Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private a() {
                }
            }

            public b(String str, String str2, Uri uri, boolean z10, boolean z11, String str3, String str4) {
                C17542s.j(str, "title");
                C17542s.j(str2, "update");
                C17542s.j(uri, "roomImage");
                C17542s.j(str3, "sceneUuid");
                this.f123089a = str;
                this.f123090b = str2;
                this.f123091c = uri;
                this.f123092d = z10;
                this.f123093e = z11;
                this.f123094f = str3;
                this.f123095g = str4;
            }

            public final String a() {
                return this.f123095g;
            }

            public final boolean b() {
                return this.f123093e;
            }

            public final Uri c() {
                return this.f123091c;
            }

            public final String d() {
                return this.f123094f;
            }

            public final boolean e() {
                return this.f123092d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f123089a, bVar.f123089a) && C17542s.e(this.f123090b, bVar.f123090b) && C17542s.e(this.f123091c, bVar.f123091c) && this.f123092d == bVar.f123092d && this.f123093e == bVar.f123093e && C17542s.e(this.f123094f, bVar.f123094f) && C17542s.e(this.f123095g, bVar.f123095g);
            }

            public final String f() {
                return this.f123089a;
            }

            public final String g() {
                return this.f123090b;
            }

            public int hashCode() {
                int hashCode = ((((((((((this.f123089a.hashCode() * 31) + this.f123090b.hashCode()) * 31) + this.f123091c.hashCode()) * 31) + Boolean.hashCode(this.f123092d)) * 31) + Boolean.hashCode(this.f123093e)) * 31) + this.f123094f.hashCode()) * 31;
                String str = this.f123095g;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                String str = this.f123089a;
                String str2 = this.f123090b;
                Uri uri = this.f123091c;
                boolean z10 = this.f123092d;
                boolean z11 = this.f123093e;
                String str3 = this.f123094f;
                String str4 = this.f123095g;
                return "LatestSpace(title=" + str + ", update=" + str2 + ", roomImage=" + uri + ", showProgress=" + z10 + ", ready=" + z11 + ", sceneUuid=" + str3 + ", compositionUuid=" + str4 + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ b(String str, String str2, Uri uri, boolean z10, boolean z11, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, uri, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? true : z11, str3, (i10 & 64) != 0 ? null : str4);
            }
        }
    }
}
