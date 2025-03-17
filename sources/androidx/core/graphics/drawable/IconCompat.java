package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f21156k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f21157a;

    /* renamed from: b  reason: collision with root package name */
    Object f21158b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f21159c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f21160d;

    /* renamed from: e  reason: collision with root package name */
    public int f21161e;

    /* renamed from: f  reason: collision with root package name */
    public int f21162f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f21163g;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f21164h;

    /* renamed from: i  reason: collision with root package name */
    public String f21165i;

    /* renamed from: j  reason: collision with root package name */
    public String f21166j;

    static class a {
        static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", (Class[]) null).invoke(obj, (Object[]) null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", (Class[]) null).invoke(obj, (Object[]) null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", (Class[]) null).invoke(obj, (Object[]) null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", (Class[]) null).invoke(obj, (Object[]) null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        static Icon e(IconCompat iconCompat, Context context) {
            Icon icon;
            switch (iconCompat.f21157a) {
                case -1:
                    return (Icon) iconCompat.f21158b;
                case 1:
                    icon = Icon.createWithBitmap((Bitmap) iconCompat.f21158b);
                    break;
                case 2:
                    icon = Icon.createWithResource(iconCompat.h(), iconCompat.f21161e);
                    break;
                case 3:
                    icon = Icon.createWithData((byte[]) iconCompat.f21158b, iconCompat.f21161e, iconCompat.f21162f);
                    break;
                case 4:
                    icon = Icon.createWithContentUri((String) iconCompat.f21158b);
                    break;
                case 5:
                    icon = b.a((Bitmap) iconCompat.f21158b);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        icon = d.a(iconCompat.j());
                        break;
                    } else if (context != null) {
                        InputStream k10 = iconCompat.k(context);
                        if (k10 != null) {
                            icon = b.a(BitmapFactory.decodeStream(k10));
                            break;
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.j());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.j());
                    }
                default:
                    throw new IllegalArgumentException("Unknown type");
            }
            ColorStateList colorStateList = iconCompat.f21163g;
            if (colorStateList != null) {
                icon.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f21164h;
            if (mode != IconCompat.f21156k) {
                icon.setTintMode(mode);
            }
            return icon;
        }
    }

    static class b {
        static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f21157a = -1;
        this.f21159c = null;
        this.f21160d = null;
        this.f21161e = 0;
        this.f21162f = 0;
        this.f21163g = null;
        this.f21164h = f21156k;
        this.f21165i = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z10) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = (float) min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        H2.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f21158b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Bitmap bitmap) {
        H2.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f21158b = bitmap;
        return iconCompat;
    }

    public static IconCompat d(Context context, int i10) {
        H2.c.c(context);
        return e(context.getResources(), context.getPackageName(), i10);
    }

    public static IconCompat e(Resources resources, String str, int i10) {
        H2.c.c(str);
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f21161e = i10;
            if (resources != null) {
                try {
                    iconCompat.f21158b = resources.getResourceName(i10);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f21158b = str;
            }
            iconCompat.f21166j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    private static String q(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap f() {
        int i10 = this.f21157a;
        if (i10 == -1) {
            Object obj = this.f21158b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i10 == 1) {
            return (Bitmap) this.f21158b;
        } else {
            if (i10 == 5) {
                return a((Bitmap) this.f21158b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int g() {
        int i10 = this.f21157a;
        if (i10 == -1) {
            return a.a(this.f21158b);
        }
        if (i10 == 2) {
            return this.f21161e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String h() {
        int i10 = this.f21157a;
        if (i10 == -1) {
            return a.b(this.f21158b);
        }
        if (i10 == 2) {
            String str = this.f21166j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f21158b).split(":", -1)[0] : this.f21166j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int i() {
        int i10 = this.f21157a;
        return i10 == -1 ? a.c(this.f21158b) : i10;
    }

    public Uri j() {
        int i10 = this.f21157a;
        if (i10 == -1) {
            return a.d(this.f21158b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f21158b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream k(Context context) {
        Uri j10 = j();
        String scheme = j10.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(j10);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + j10, e10);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f21158b));
            } catch (FileNotFoundException e11) {
                Log.w("IconCompat", "Unable to load image from path: " + j10, e11);
                return null;
            }
        }
    }

    public void l() {
        this.f21164h = PorterDuff.Mode.valueOf(this.f21165i);
        switch (this.f21157a) {
            case -1:
                Parcelable parcelable = this.f21160d;
                if (parcelable != null) {
                    this.f21158b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = this.f21160d;
                if (parcelable2 != null) {
                    this.f21158b = parcelable2;
                    return;
                }
                byte[] bArr = this.f21159c;
                this.f21158b = bArr;
                this.f21157a = 3;
                this.f21161e = 0;
                this.f21162f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f21159c, Charset.forName("UTF-16"));
                this.f21158b = str;
                if (this.f21157a == 2 && this.f21166j == null) {
                    this.f21166j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f21158b = this.f21159c;
                return;
            default:
                return;
        }
    }

    public void m(boolean z10) {
        this.f21165i = this.f21164h.name();
        switch (this.f21157a) {
            case -1:
                if (!z10) {
                    this.f21160d = (Parcelable) this.f21158b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 1:
            case 5:
                if (z10) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f21158b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f21159c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f21160d = (Parcelable) this.f21158b;
                return;
            case 2:
                this.f21159c = ((String) this.f21158b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f21159c = (byte[]) this.f21158b;
                return;
            case 4:
            case 6:
                this.f21159c = this.f21158b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
    }

    public Bundle n() {
        Bundle bundle = new Bundle();
        switch (this.f21157a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f21158b);
                break;
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f21158b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f21158b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f21158b);
                break;
            default:
                throw new IllegalArgumentException("Invalid icon");
        }
        bundle.putInt("type", this.f21157a);
        bundle.putInt("int1", this.f21161e);
        bundle.putInt("int2", this.f21162f);
        bundle.putString("string1", this.f21166j);
        ColorStateList colorStateList = this.f21163g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f21164h;
        if (mode != f21156k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    public Icon o() {
        return p((Context) null);
    }

    public Icon p(Context context) {
        return a.e(this, context);
    }

    public String toString() {
        if (this.f21157a == -1) {
            return String.valueOf(this.f21158b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(q(this.f21157a));
        switch (this.f21157a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f21158b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f21158b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f21166j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", new Object[]{Integer.valueOf(g())}));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f21161e);
                if (this.f21162f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f21162f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f21158b);
                break;
        }
        if (this.f21163g != null) {
            sb2.append(" tint=");
            sb2.append(this.f21163g);
        }
        if (this.f21164h != f21156k) {
            sb2.append(" mode=");
            sb2.append(this.f21164h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    IconCompat(int i10) {
        this.f21159c = null;
        this.f21160d = null;
        this.f21161e = 0;
        this.f21162f = 0;
        this.f21163g = null;
        this.f21164h = f21156k;
        this.f21165i = null;
        this.f21157a = i10;
    }
}
