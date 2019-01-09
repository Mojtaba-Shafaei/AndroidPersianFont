package com.mojtaba_shafaei.persianFont;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.IntDef;
import android.support.v4.util.ArrayMap;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by mojtaba on 8/22/17.
 */

public class PersianFont {

private final static ArrayMap<Integer, Typeface> cache = new ArrayMap<>();

public static final int IRAN_SANS_ULTRA_LIGHT = 1;
public static final int IRANSANS_LIGHT = 2;
public static final int IRANSANS_NORMAL = 3;
public static final int IRANSANS_MEDIUM = 4;
public static final int IRANSANS_BOLD = 5;
public static final int IRANSANS_BLACK = 6;

public static final int YEKAN_REGULAR = 10;
public static final int YEKAN_LIGHT = 11;
public static final int YEKAN_BOLD = 12;
public static final int YEKAN_BLACK = 13;
public static final int YEKAN_EXTRA_BLACK = 14;
public static final int YEKAN_EXTRA_BOLD = 15;
public static final int YEKAN_MEDIUM = 16;
public static final int YEKAN_THIN = 17;

////////////////////////////////////
@Retention(RetentionPolicy.SOURCE)
@Documented
@IntDef({
  IRAN_SANS_ULTRA_LIGHT
  , IRANSANS_LIGHT
  , IRANSANS_NORMAL
  , IRANSANS_MEDIUM
  , IRANSANS_BOLD
  , IRANSANS_BLACK
  //
  , YEKAN_REGULAR
  , YEKAN_LIGHT
  , YEKAN_BOLD
  , YEKAN_BLACK
  , YEKAN_EXTRA_BLACK
  , YEKAN_EXTRA_BOLD
  , YEKAN_MEDIUM
  , YEKAN_THIN})
public @interface FontEnum {

}
////////////////////////////////////

//<editor-fold desc="iran sans">
public static Typeface IRAN_SANS_ULTRA_LIGHT(Context context) {
if (!cache.containsKey(IRAN_SANS_ULTRA_LIGHT)) {
cache.put(IRAN_SANS_ULTRA_LIGHT, Typeface
                                   .createFromAsset(context.getAssets(), "fonts/" + "IRANSansMobile_UltraLight.ttf"));
}
return cache.get(IRAN_SANS_ULTRA_LIGHT);
}

public static Typeface IRANSANS_LIGHT(Context context) {
if (!cache.containsKey(IRANSANS_LIGHT)) {
cache.put(IRANSANS_LIGHT,
  Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANSansMobile_Light.ttf"));
}
return cache.get(IRANSANS_LIGHT);
}

public static Typeface IRANSANS_NORMAL(Context context) {
if (!cache.containsKey(IRANSANS_NORMAL)) {
cache.put(IRANSANS_NORMAL,
  Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANSansMobile.ttf"));
}
return cache.get(IRANSANS_NORMAL);
}

public static Typeface IRANSANS_MEDIUM(Context context) {
if (!cache.containsKey(IRANSANS_MEDIUM)) {
cache.put(IRANSANS_MEDIUM,
  Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANSansMobile_Medium.ttf"));
}
return cache.get(IRANSANS_MEDIUM);
}

public static Typeface IRANSANS_BOLD(Context context) {
if (!cache.containsKey(IRANSANS_BOLD)) {
cache.put(IRANSANS_BOLD,
  Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANSansMobile_Bold.ttf"));
}
return cache.get(IRANSANS_BOLD);
}

public static Typeface IRANSANS_BLACK(Context context) {
if (!cache.containsKey(IRANSANS_BLACK)) {
cache.put(IRANSANS_BLACK,
  Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANSansMobile_Black.ttf"));
}
return cache.get(IRANSANS_BLACK);
}
//</editor-fold>

public static Typeface YEKAN_REGULAR(Context context) {
if (!cache.containsKey(YEKAN_REGULAR)) {
cache.put(YEKAN_REGULAR,
  Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileRegular.ttf"));
}
return cache.get(YEKAN_REGULAR);
}

public static Typeface YEKAN_LIGHT(Context context) {
if (!cache.containsKey(YEKAN_LIGHT)) {
cache.put(YEKAN_LIGHT,
  Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileLight.ttf"));
}
return cache.get(YEKAN_LIGHT);
}

public static Typeface YEKAN_BOLD(Context context) {
if (!cache.containsKey(YEKAN_BOLD)) {
cache.put(YEKAN_BOLD,
  Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileBold.ttf"));
}
return cache.get(YEKAN_BOLD);
}

public static Typeface YEKAN_BLACK(Context context) {
if (!cache.containsKey(YEKAN_BLACK)) {
cache.put(YEKAN_BLACK,
  Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileBlack.ttf"));
}
return cache.get(YEKAN_BLACK);
}

public static Typeface YEKAN_EXTRA_BLACK(Context context) {
if (!cache.containsKey(YEKAN_EXTRA_BLACK)) {
cache.put(YEKAN_EXTRA_BLACK,
  Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileExtraBlack.ttf"));
}
return cache.get(YEKAN_EXTRA_BLACK);
}

public static Typeface YEKAN_EXTRA_BOLD(Context context) {
if (!cache.containsKey(YEKAN_EXTRA_BOLD)) {
cache.put(YEKAN_EXTRA_BOLD,
  Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileExtraBold.ttf"));
}
return cache.get(YEKAN_EXTRA_BOLD);
}

public static Typeface YEKAN_MEDIUM(Context context) {
if (!cache.containsKey(YEKAN_MEDIUM)) {
cache.put(YEKAN_MEDIUM,
  Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileMedium.ttf"));
}
return cache.get(YEKAN_MEDIUM);
}

public static Typeface YEKAN_THIN(Context context) {
if (!cache.containsKey(YEKAN_THIN)) {
cache.put(YEKAN_THIN,
  Typeface.createFromAsset(context.getAssets(), "fonts/" + "IRANYekanMobileThin.ttf"));
}
return cache.get(YEKAN_THIN);
}

public static Typeface get(Context context, @FontEnum int type) {
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
}
