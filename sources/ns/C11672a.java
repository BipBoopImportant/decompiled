package ns;

import IC.C13023e;
import XH.C16796C;
import YH.X;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ms.C11593a;
import os.C11714a;
import pv.C11781a;
import pv.C11783c;
import pv.C11784d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0012B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ:\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lns/a;", "Los/a;", "Lpv/a;", "localNotification", "Lms/a;", "communicationPostNotificationFeature", "Landroid/content/Context;", "context", "<init>", "(Lpv/a;Lms/a;Landroid/content/Context;)V", "", "uri", "LIC/e;", "title", "body", "imageUrl", "purpose", "LXH/N;", "a", "(Ljava/lang/String;LIC/e;LIC/e;Ljava/lang/String;Ljava/lang/String;)V", "Lpv/a;", "b", "Lms/a;", "c", "Landroid/content/Context;", "d", "communicationpost-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ns.a  reason: case insensitive filesystem */
public final class C11672a implements C11714a {

    /* renamed from: d  reason: collision with root package name */
    public static final C2316a f100073d = new C2316a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C11781a f100074a;

    /* renamed from: b  reason: collision with root package name */
    private final C11593a f100075b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f100076c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lns/a$a;", "", "<init>", "()V", "", "GENERAL_MESSAGE_ID", "I", "communicationpost-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ns.a$a  reason: collision with other inner class name */
    public static final class C2316a {
        public /* synthetic */ C2316a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2316a() {
        }
    }

    public C11672a(C11781a aVar, C11593a aVar2, Context context) {
        C17542s.j(aVar, "localNotification");
        C17542s.j(aVar2, "communicationPostNotificationFeature");
        C17542s.j(context, "context");
        this.f100074a = aVar;
        this.f100075b = aVar2;
        this.f100076c = context;
    }

    public void a(String str, C13023e eVar, C13023e eVar2, String str2, String str3) {
        C17542s.j(str, "uri");
        C17542s.j(eVar, "title");
        C17542s.j(eVar2, "body");
        C17542s.j(str3, "purpose");
        this.f100074a.b(PendingIntent.getActivity(this.f100076c, 5678, new Intent("android.intent.action.VIEW", Uri.parse(str)), 201326592), new C11784d(eVar.b(this.f100076c), eVar2.b(this.f100076c), str2, "5678", str3, C11783c.CommunicationPost, this.f100075b.e(X.f(C16796C.a("purpose", str3)))), this.f100075b.h());
    }
}
