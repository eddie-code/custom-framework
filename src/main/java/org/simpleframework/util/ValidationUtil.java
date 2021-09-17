package org.simpleframework.util;

import java.util.Collection;
import java.util.Map;


/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package org.simpleframework.util
 * @ClassName ValidationUtil
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-17 10:43
 * @modified by
 */
public class ValidationUtil {
    /**
     * String是否为null或""
     *
     * @param obj String
     * @return 是否为空
     */
    public static boolean isEmpty(String obj) {
        return (obj == null || "".equals(obj));
    }

    /**
     * Array是否为null或者size为0
     *
     * @param obj Array
     * @return 是否为空
     */
    public static boolean isEmpty(Object[] obj) {
        return obj == null || obj.length == 0;
    }
    /**
     * Collection是否为null或size为0
     *
     * @param obj Collection
     * @return 是否为空
     */
    public static boolean isEmpty(Collection<?> obj){
        return obj == null || obj.isEmpty();
    }
    /**
     * Map是否为null或size为0
     *
     * @param obj Map
     * @return 是否为空
     */
    public static boolean isEmpty(Map<?, ?> obj) {
        return obj == null || obj.isEmpty();
    }
}