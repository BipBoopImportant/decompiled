package NF;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.ImageView;
import com.squareup.picasso.C14194e;
import com.squareup.picasso.t;
import com.sugarcube.common.R;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import nI.r;

@Metadata(d1 = {"\u0000J\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a]\u0010\b\u001a\u0004\u0018\u00018\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001ap\u0010\f\u001a\u0004\u0018\u00018\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012*\u0010\u0007\u001a&\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00000\nH@¢\u0006\u0004\b\f\u0010\r\u001a\u0001\u0010\u0013\u001a\u0004\u0018\u00018\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u000e*\u00020\u0000\"\b\b\u0003\u0010\u000f*\u00020\u0000\"\b\b\u0004\u0010\u0003*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012\b\u0010\u0010\u001a\u0004\u0018\u00018\u00022\b\u0010\u0011\u001a\u0004\u0018\u00018\u00032&\u0010\u0007\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00040\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u001d\u001a\u00020\u001c*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0015\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"", "T1", "T2", "R", "p1", "p2", "Lkotlin/Function2;", "block", "c", "(Ljava/lang/Object;Ljava/lang/Object;LnI/p;)Ljava/lang/Object;", "Lkotlin/Function3;", "LdI/e;", "d", "(Ljava/lang/Object;Ljava/lang/Object;LnI/q;LdI/e;)Ljava/lang/Object;", "T3", "T4", "p3", "p4", "Lkotlin/Function4;", "b", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LnI/r;)Ljava/lang/Object;", "Lcom/squareup/picasso/t;", "Landroid/net/Uri;", "imageUri", "Landroid/widget/ImageView;", "imageView", "", "retryCount", "LXH/N;", "a", "(Lcom/squareup/picasso/t;Landroid/net/Uri;Landroid/widget/ImageView;I)V", "", "squareMeters", "e", "(D)D", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: NF.e  reason: case insensitive filesystem */
public final class C13291e {

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"NF/e$a", "Lcom/squareup/picasso/e;", "LXH/N;", "onSuccess", "()V", "Ljava/lang/Exception;", "e", "a", "(Ljava/lang/Exception;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NF.e$a */
    public static final class a implements C14194e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f112476a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Uri f112477b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f112478c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ double f112479d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ t f112480e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ImageView f112481f;

        a(int i10, Uri uri, long j10, double d10, t tVar, ImageView imageView) {
            this.f112476a = i10;
            this.f112477b = uri;
            this.f112478c = j10;
            this.f112479d = d10;
            this.f112480e = tVar;
            this.f112481f = imageView;
        }

        /* access modifiers changed from: private */
        public static final void c(t tVar, Uri uri, ImageView imageView, int i10) {
            C13291e.a(tVar, uri, imageView, i10 - 1);
        }

        public void a(Exception exc) {
            if (this.f112476a > 0) {
                Uri uri = this.f112477b;
                Log.v(AnyKt.SUGARCUBE_TAG, "Error loading image from " + uri);
                new Handler(Looper.getMainLooper()).postDelayed(new C13290d(this.f112480e, this.f112477b, this.f112481f, this.f112476a), this.f112478c * ((long) Math.pow(this.f112479d, (double) (this.f112476a + -1))));
                return;
            }
            Uri uri2 = this.f112477b;
            Log.v(AnyKt.SUGARCUBE_TAG, "Error loading image from " + uri2 + ": Retry count reached zero");
        }

        public void onSuccess() {
        }
    }

    public static final void a(t tVar, Uri uri, ImageView imageView, int i10) {
        C17542s.j(tVar, "<this>");
        C17542s.j(uri, "imageUri");
        C17542s.j(imageView, "imageView");
        tVar.l(uri).i(R.drawable.sc_ic_placeholder).e(imageView, new a(i10, uri, 1000, 2.0d, tVar, imageView));
    }

    public static final <T1, T2, T3, T4, R> R b(T1 t12, T2 t22, T3 t32, T4 t42, r<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> rVar) {
        C17542s.j(rVar, "block");
        if (t12 == null || t22 == null || t32 == null || t42 == null) {
            return null;
        }
        return rVar.l(t12, t22, t32, t42);
    }

    public static final <T1, T2, R> R c(T1 t12, T2 t22, p<? super T1, ? super T2, ? extends R> pVar) {
        C17542s.j(pVar, "block");
        if (t12 == null || t22 == null) {
            return null;
        }
        return pVar.invoke(t12, t22);
    }

    public static final <T1, T2, R> Object d(T1 t12, T2 t22, q<? super T1, ? super T2, ? super C17164e<? super R>, ? extends Object> qVar, C17164e<? super R> eVar) {
        if (t12 == null || t22 == null) {
            return null;
        }
        return qVar.invoke(t12, t22, eVar);
    }

    public static final double e(double d10) {
        return d10 * 10.7639d;
    }
}
