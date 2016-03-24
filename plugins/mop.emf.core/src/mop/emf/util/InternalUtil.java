package mop.emf.util;

import java.lang.reflect.Field;

public class InternalUtil {
	public static Object getField(Object obj, String f) {
		try {
			Field field = obj.getClass().getField(f);
			return field.get(obj);
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IllegalStateException("Problems getting field " + f);
		}
	}
}
