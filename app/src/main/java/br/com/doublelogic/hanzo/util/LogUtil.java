package br.com.doublelogic.hanzo.util;

/**
 * Created by diegoalvessaidsimao on 21/09/15.
 */
public  class LogUtil {

     public static String getTag(Class<?> clazz) {
        return "Hanzo " + clazz.getSimpleName();
    }

}
