package mop.emf.util;

import java.lang.reflect.Field;
import java.util.HashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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

	@SuppressWarnings("unchecked")
	public static Object getExtraData(EObject obj, String key, Object defaultValue) {
		HashMap<Object, Object> data = (HashMap<Object, Object>) getField(obj, "fData");
		if ( ! data.containsKey(key) ) {
			data.put(key, defaultValue);
		}
		return data.get(key);
	}
	
	
}
