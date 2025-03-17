package Di;

import Ar.j;
import Cr.a;
import Oo.b;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LDi/b;", "LDi/a;", "LAr/j;", "feedback", "LCr/a;", "fileProviderService", "<init>", "(LAr/j;LCr/a;)V", "Landroid/content/Context;", "context", "", "fileName", "", "byteArray", "Landroid/view/View;", "errorSnackbarView", "LXH/N;", "a", "(Landroid/content/Context;Ljava/lang/String;[BLandroid/view/View;)V", "LAr/j;", "b", "LCr/a;", "c", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Di.b  reason: case insensitive filesystem */
public final class C10658b implements C10657a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f79776c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f79777d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final j f79778a;

    /* renamed from: b  reason: collision with root package name */
    private final Cr.a f79779b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDi/b$a;", "", "<init>", "()V", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Di.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Di/b$b", "LCr/a$a;", "", "a", "[B", "b", "()[B", "byteArray", "", "Ljava/lang/String;", "()Ljava/lang/String;", "mimeType", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Di.b$b  reason: collision with other inner class name */
    public static final class C1489b implements a.C1481a {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f79780a;

        /* renamed from: b  reason: collision with root package name */
        private final String f79781b = "application/pdf";

        C1489b(byte[] bArr) {
            this.f79780a = bArr;
        }

        public String a() {
            return this.f79781b;
        }

        public byte[] b() {
            return this.f79780a;
        }
    }

    public C10658b(j jVar, Cr.a aVar) {
        C17542s.j(jVar, "feedback");
        C17542s.j(aVar, "fileProviderService");
        this.f79778a = jVar;
        this.f79779b = aVar;
    }

    public void a(Context context, String str, byte[] bArr, View view) {
        C17542s.j(context, "context");
        C17542s.j(str, "fileName");
        C17542s.j(bArr, "byteArray");
        Intent a10 = this.f79779b.a(context, str, new C1489b(bArr), a.c.INVOICE, a.b.C1483b.f79667a);
        if (a10.resolveActivity(context.getPackageManager()) == null) {
            j.a.r(this.f79778a, view, b.f84440M2, 0, 0, (View) null, (C17631a) null, 60, (Object) null);
            return;
        }
        context.startActivity(a10);
    }
}
