package x2;

import E2.k;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.util.List;

public class m extends n {
    private Font h(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : Constants.MINIMAL_ERROR_STATUS_CODE, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int j10 = j(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int j11 = j(fontStyle, font2.getStyle());
            if (j11 < j10) {
                font = font2;
                j10 = j11;
            }
        }
        return font;
    }

    private static FontFamily i(CancellationSignal cancellationSignal, k.b[] bVarArr, ContentResolver contentResolver) {
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (k.b bVar : bVarArr) {
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(bVar.d(), "r", cancellationSignal);
                if (openFileDescriptor != null) {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(bVar.e()).setSlant(bVar.f() ? 1 : 0).setTtcIndex(bVar.c()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } else if (openFileDescriptor == null) {
                }
                openFileDescriptor.close();
            } catch (IOException e10) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
        throw th;
    }

    private static int j(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: w2.e$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: w2.e$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: w2.e$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: w2.e$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: w2.e$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: w2.e$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: w2.e$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: w2.e$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: w2.e$d[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d A[SYNTHETIC, Splitter:B:16:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x000a A[Catch:{ Exception -> 0x0042 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(android.content.Context r7, w2.C6211e.c r8, android.content.res.Resources r9, int r10) {
        /*
            r6 = this;
            r7 = 0
            w2.e$d[] r8 = r8.a()     // Catch:{ Exception -> 0x0042 }
            int r0 = r8.length     // Catch:{ Exception -> 0x0042 }
            r1 = 0
            r2 = r7
        L_0x0008:
            if (r1 >= r0) goto L_0x004a
            r3 = r8[r1]     // Catch:{ Exception -> 0x0042 }
            android.graphics.fonts.Font$Builder r4 = new android.graphics.fonts.Font$Builder     // Catch:{ IOException -> 0x0047 }
            int r5 = r3.b()     // Catch:{ IOException -> 0x0047 }
            r4.<init>(r9, r5)     // Catch:{ IOException -> 0x0047 }
            int r5 = r3.e()     // Catch:{ IOException -> 0x0047 }
            android.graphics.fonts.Font$Builder r4 = r4.setWeight(r5)     // Catch:{ IOException -> 0x0047 }
            boolean r5 = r3.f()     // Catch:{ IOException -> 0x0047 }
            android.graphics.fonts.Font$Builder r4 = r4.setSlant(r5)     // Catch:{ IOException -> 0x0047 }
            int r5 = r3.c()     // Catch:{ IOException -> 0x0047 }
            android.graphics.fonts.Font$Builder r4 = r4.setTtcIndex(r5)     // Catch:{ IOException -> 0x0047 }
            java.lang.String r3 = r3.d()     // Catch:{ IOException -> 0x0047 }
            android.graphics.fonts.Font$Builder r3 = r4.setFontVariationSettings(r3)     // Catch:{ IOException -> 0x0047 }
            android.graphics.fonts.Font r3 = r3.build()     // Catch:{ IOException -> 0x0047 }
            if (r2 != 0) goto L_0x0044
            android.graphics.fonts.FontFamily$Builder r4 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ IOException -> 0x0047 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0047 }
            r2 = r4
            goto L_0x0047
        L_0x0042:
            r8 = move-exception
            goto L_0x0067
        L_0x0044:
            r2.addFont(r3)     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            int r1 = r1 + 1
            goto L_0x0008
        L_0x004a:
            if (r2 != 0) goto L_0x004d
            return r7
        L_0x004d:
            android.graphics.fonts.FontFamily r8 = r2.build()     // Catch:{ Exception -> 0x0042 }
            android.graphics.Typeface$CustomFallbackBuilder r9 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch:{ Exception -> 0x0042 }
            r9.<init>(r8)     // Catch:{ Exception -> 0x0042 }
            android.graphics.fonts.Font r8 = r6.h(r8, r10)     // Catch:{ Exception -> 0x0042 }
            android.graphics.fonts.FontStyle r8 = r8.getStyle()     // Catch:{ Exception -> 0x0042 }
            android.graphics.Typeface$CustomFallbackBuilder r8 = r9.setStyle(r8)     // Catch:{ Exception -> 0x0042 }
            android.graphics.Typeface r7 = r8.build()     // Catch:{ Exception -> 0x0042 }
            return r7
        L_0x0067:
            java.lang.String r9 = "TypefaceCompatApi29Impl"
            java.lang.String r10 = "Font load failed"
            android.util.Log.w(r9, r10, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.m.a(android.content.Context, w2.e$c, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i10) {
        try {
            FontFamily i11 = i(cancellationSignal, bVarArr, context.getContentResolver());
            if (i11 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(i11).setStyle(h(i11, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, List<k.b[]> list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily i11 = i(cancellationSignal, list.get(0), contentResolver);
            if (i11 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(i11);
            for (int i12 = 1; i12 < list.size(); i12++) {
                FontFamily i13 = i(cancellationSignal, list.get(i12), contentResolver);
                if (i13 != null) {
                    customFallbackBuilder.addCustomFallback(i13);
                }
            }
            return customFallbackBuilder.setStyle(h(i11, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public k.b g(k.b[] bVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
