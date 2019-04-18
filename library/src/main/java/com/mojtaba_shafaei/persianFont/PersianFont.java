package com.mojtaba_shafaei.persianFont;

import static com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.IRANSANS_BLACK;
import static com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.IRANSANS_BOLD;
import static com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.IRANSANS_LIGHT;
import static com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.IRANSANS_MEDIUM;
import static com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.IRANSANS_NORMAL;
import static com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.IRAN_SANS_ULTRA_LIGHT;
import static com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.YEKAN_BLACK;
import static com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.YEKAN_BOLD;
import static com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.YEKAN_EXTRA_BLACK;
import static com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.YEKAN_EXTRA_BOLD;
import static com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.YEKAN_LIGHT;
import static com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.YEKAN_MEDIUM;
import static com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.YEKAN_REGULAR;
import static com.mojtaba_shafaei.persianFont.PersianFont.FontEnum.YEKAN_THIN;

import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;

/**
 * Created by mojtaba on 8/22/17.
 */

public class PersianFont {

private static HashMap<FontEnum, Typeface> cache = new HashMap<>();

//<editor-fold desc="iran sans">
public static Typeface IRAN_SANS_ULTRA_LIGHT(Context context) {
  Typeface lvTypeface = cache.get(IRAN_SANS_ULTRA_LIGHT);
  if (lvTypeface == null) {
    lvTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANSansMobile_UltraLight.ttf");
    cache.put(IRAN_SANS_ULTRA_LIGHT, lvTypeface);
  }
  return lvTypeface;
}

public static Typeface IRANSANS_LIGHT(Context context) {
  Typeface lvTypeface = cache.get(IRANSANS_LIGHT);
  if (lvTypeface == null) {
    lvTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANSansMobile_Light.ttf");
    cache.put(IRANSANS_LIGHT, lvTypeface);
  }
  return lvTypeface;
}

public static Typeface IRANSANS_NORMAL(Context context) {
  Typeface lvTypeface = cache.get(IRANSANS_NORMAL);
  if (lvTypeface == null) {
    lvTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANSansMobile.ttf");
    cache.put(IRANSANS_NORMAL, lvTypeface);
  }
  return lvTypeface;
}

public static Typeface IRANSANS_MEDIUM(Context context) {
  Typeface lvTypeface = cache.get(IRANSANS_MEDIUM);
  if (lvTypeface == null) {
    lvTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANSansMobile_Medium.ttf");
    cache.put(IRANSANS_MEDIUM, lvTypeface);
  }
  return lvTypeface;
}

public static Typeface IRANSANS_BOLD(Context context) {
  Typeface lvTypeface = cache.get(IRANSANS_BOLD);
  if (lvTypeface == null) {
    lvTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANSansMobile_Bold.ttf");
    cache.put(IRANSANS_BOLD, lvTypeface);
  }
  return lvTypeface;
}

public static Typeface IRANSANS_BLACK(Context context) {
  Typeface lvTypeface = cache.get(IRANSANS_BLACK);
  if (lvTypeface == null) {
    lvTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANSansMobile_Black.ttf");
    cache.put(IRANSANS_BLACK, lvTypeface);
  }
  return lvTypeface;
}
//</editor-fold>

public static Typeface YEKAN_REGULAR(Context context) {
  Typeface lvTypeface = cache.get(YEKAN_REGULAR);
  if (lvTypeface == null) {
    lvTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileRegular.ttf");
    cache.put(YEKAN_REGULAR, lvTypeface);
  }
  return lvTypeface;
}

public static Typeface YEKAN_LIGHT(Context context) {
  Typeface lvTypeface = cache.get(YEKAN_LIGHT);
  if (lvTypeface == null) {
    lvTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileLight.ttf");
    cache.put(YEKAN_LIGHT, lvTypeface);
  }
  return lvTypeface;
}

public static Typeface YEKAN_BOLD(Context context) {
  Typeface lvTypeface = cache.get(YEKAN_BOLD);
  if (lvTypeface == null) {
    lvTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileBold.ttf");
    cache.put(YEKAN_BOLD, lvTypeface);
  }
  return lvTypeface;
}

public static Typeface YEKAN_BLACK(Context context) {
  Typeface lvTypeface = cache.get(YEKAN_BLACK);
  if (lvTypeface == null) {
    lvTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileBlack.ttf");
    cache.put(YEKAN_BLACK, lvTypeface);
  }
  return lvTypeface;
}

public static Typeface YEKAN_EXTRA_BLACK(Context context) {
  Typeface lvTypeface = cache.get(YEKAN_EXTRA_BLACK);
  if (lvTypeface == null) {
    lvTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileExtraBlack.ttf");
    cache.put(YEKAN_EXTRA_BLACK, lvTypeface);
  }
  return lvTypeface;
}

public static Typeface YEKAN_EXTRA_BOLD(Context context) {
  Typeface lvTypeface = cache.get(YEKAN_EXTRA_BOLD);
  if (lvTypeface == null) {
    lvTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileExtraBold.ttf");
    cache.put(YEKAN_EXTRA_BOLD, lvTypeface);
  }
  return lvTypeface;
}

public static Typeface YEKAN_MEDIUM(Context context) {
  Typeface lvTypeface = cache.get(YEKAN_MEDIUM);
  if (lvTypeface == null) {
    lvTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileMedium.ttf");
    cache.put(YEKAN_MEDIUM, lvTypeface);
  }
  return lvTypeface;
}

public static Typeface YEKAN_THIN(Context context) {
  Typeface lvTypeface = cache.get(YEKAN_THIN);
  if (lvTypeface == null) {
    lvTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileThin.ttf");
    cache.put(YEKAN_THIN, lvTypeface);
  }
  return lvTypeface;
}

public static Typeface get(Context context, FontEnum type) {
  switch (type) {
    case IRAN_SANS_ULTRA_LIGHT:
      return IRAN_SANS_ULTRA_LIGHT(context);

    case IRANSANS_LIGHT:
      return IRANSANS_LIGHT(context);

    case IRANSANS_NORMAL:
      return IRANSANS_NORMAL(context);

    case IRANSANS_MEDIUM:
      return IRANSANS_MEDIUM(context);

    case IRANSANS_BOLD:
      return IRANSANS_BOLD(context);

    case IRANSANS_BLACK:
      return IRANSANS_BLACK(context);

    case YEKAN_REGULAR:
      return YEKAN_REGULAR(context);

    case YEKAN_LIGHT:
      return YEKAN_LIGHT(context);

    case YEKAN_BOLD:
      return YEKAN_BOLD(context);

    case YEKAN_BLACK:
      return YEKAN_BLACK(context);

    case YEKAN_EXTRA_BLACK:
      return YEKAN_EXTRA_BLACK(context);

    case YEKAN_EXTRA_BOLD:
      return YEKAN_EXTRA_BOLD(context);

    case YEKAN_MEDIUM:
      return YEKAN_MEDIUM(context);

    case YEKAN_THIN:
      return YEKAN_THIN(context);

    default:
      return IRANSANS_NORMAL(context);
  }
}

public enum FontEnum {
  IRAN_SANS_ULTRA_LIGHT, IRANSANS_LIGHT, IRANSANS_NORMAL, IRANSANS_MEDIUM, IRANSANS_BOLD, IRANSANS_BLACK
  //
  , YEKAN_REGULAR, YEKAN_LIGHT, YEKAN_BOLD, YEKAN_BLACK, YEKAN_EXTRA_BLACK, YEKAN_EXTRA_BOLD, YEKAN_MEDIUM, YEKAN_THIN
}
}
