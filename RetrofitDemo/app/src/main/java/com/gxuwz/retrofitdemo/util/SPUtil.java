package com.gxuwz.retrofitdemo.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

import com.gxuwz.retrofitdemo.config.Constant;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 磁盘缓存管理工具
 */
public class SPUtil {

	public static String PREFERENCE_NAME = Constant.FLASH_CALENDAR_SHARED;

	public static SharedPreferences getSharedPreferences(Context context) {
		return context == null ? null : context.getSharedPreferences(
				PREFERENCE_NAME, Context.MODE_PRIVATE);
	}

	/**
	 * put string preferences
	 * 
	 * @param context
	 * @param key
	 *            The name of the preference to modify
	 * @param value
	 *            The new value for the preference
	 * @return True if the new values were successfully written to persistent
	 *         storage.
	 */
	public static boolean putString(Context context, String key, String value) {
		SharedPreferences settings = context.getSharedPreferences(
				PREFERENCE_NAME, Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = settings.edit();
		editor.putString(key, value);
		return editor.commit();
	}

	/**
	 * get string preferences
	 * 
	 * @param context
	 * @param key
	 *            The name of the preference to retrieve
	 * @return The preference value if it exists, or null. Throws
	 *         ClassCastException if there is a preference with this name that
	 *         is not a string
	 * @see #getString(Context, String, String)
	 */
	public static String getString(Context context, String key) {
		return getString(context, key, null);
	}

	/**
	 * get string preferences
	 * 
	 * @param context
	 * @param key
	 *            The name of the preference to retrieve
	 * @param defaultValue
	 *            Value to return if this preference does not exist
	 * @return The preference value if it exists, or defValue. Throws
	 *         ClassCastException if there is a preference with this name that
	 *         is not a string
	 */
	public static String getString(Context context, String key,
			String defaultValue) {
		SharedPreferences settings = context.getSharedPreferences(
				PREFERENCE_NAME, Context.MODE_PRIVATE);
		return settings.getString(key, defaultValue);
	}

	/**
	 * put int preferences
	 * 
	 * @param context
	 * @param key
	 *            The name of the preference to modify
	 * @param value
	 *            The new value for the preference
	 * @return True if the new values were successfully written to persistent
	 *         storage.
	 */
	public static boolean putInt(Context context, String key, int value) {
		SharedPreferences settings = context.getSharedPreferences(
				PREFERENCE_NAME, Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = settings.edit();
		editor.putInt(key, value);
		return editor.commit();
	}

	/**
	 * get int preferences
	 * 
	 * @param context
	 * @param key
	 *            The name of the preference to retrieve
	 * @return The preference value if it exists, or -1. Throws
	 *         ClassCastException if there is a preference with this name that
	 *         is not a int
	 * @see #getInt(Context, String, int)
	 */
	public static int getInt(Context context, String key) {
		return getInt(context, key, -1);
	}

	/**
	 * get int preferences
	 * 
	 * @param context
	 * @param key
	 *            The name of the preference to retrieve
	 * @param defaultValue
	 *            Value to return if this preference does not exist
	 * @return The preference value if it exists, or defValue. Throws
	 *         ClassCastException if there is a preference with this name that
	 *         is not a int
	 */
	public static int getInt(Context context, String key, int defaultValue) {
		SharedPreferences settings = context.getSharedPreferences(
				PREFERENCE_NAME, Context.MODE_PRIVATE);
		return settings.getInt(key, defaultValue);
	}

	/**
	 * put long preferences
	 * 
	 * @param context
	 * @param key
	 *            The name of the preference to modify
	 * @param value
	 *            The new value for the preference
	 * @return True if the new values were successfully written to persistent
	 *         storage.
	 */
	public static boolean putLong(Context context, String key, long value) {
		SharedPreferences settings = context.getSharedPreferences(
				PREFERENCE_NAME, Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = settings.edit();
		editor.putLong(key, value);
		return editor.commit();
	}

	/**
	 * get long preferences
	 * 
	 * @param context
	 * @param key
	 *            The name of the preference to retrieve
	 * @return The preference value if it exists, or -1. Throws
	 *         ClassCastException if there is a preference with this name that
	 *         is not a long
	 * @see #getLong(Context, String, long)
	 */
	public static long getLong(Context context, String key) {
		return getLong(context, key, -1);
	}

	/**
	 * get long preferences
	 * 
	 * @param context
	 * @param key
	 *            The name of the preference to retrieve
	 * @param defaultValue
	 *            Value to return if this preference does not exist
	 * @return The preference value if it exists, or defValue. Throws
	 *         ClassCastException if there is a preference with this name that
	 *         is not a long
	 */
	public static long getLong(Context context, String key, long defaultValue) {
		SharedPreferences settings = context.getSharedPreferences(
				PREFERENCE_NAME, Context.MODE_PRIVATE);
		return settings.getLong(key, defaultValue);
	}

	/**
	 * put float preferences
	 * 
	 * @param context
	 * @param key
	 *            The name of the preference to modify
	 * @param value
	 *            The new value for the preference
	 * @return True if the new values were successfully written to persistent
	 *         storage.
	 */
	public static boolean putFloat(Context context, String key, float value) {
		SharedPreferences settings = context.getSharedPreferences(
				PREFERENCE_NAME, Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = settings.edit();
		editor.putFloat(key, value);
		return editor.commit();
	}

	/**
	 * get float preferences
	 * 
	 * @param context
	 * @param key
	 *            The name of the preference to retrieve
	 * @return The preference value if it exists, or -1. Throws
	 *         ClassCastException if there is a preference with this name that
	 *         is not a float
	 * @see #getFloat(Context, String, float)
	 */
	public static float getFloat(Context context, String key) {
		return getFloat(context, key, -1);
	}

	/**
	 * get float preferences
	 * 
	 * @param context
	 * @param key
	 *            The name of the preference to retrieve
	 * @param defaultValue
	 *            Value to return if this preference does not exist
	 * @return The preference value if it exists, or defValue. Throws
	 *         ClassCastException if there is a preference with this name that
	 *         is not a float
	 */
	public static float getFloat(Context context, String key, float defaultValue) {
		SharedPreferences settings = context.getSharedPreferences(
				PREFERENCE_NAME, Context.MODE_PRIVATE);
		return settings.getFloat(key, defaultValue);
	}

	/**
	 * put boolean preferences
	 * 
	 * @param context
	 * @param key
	 *            The name of the preference to modify
	 * @param value
	 *            The new value for the preference
	 * @return True if the new values were successfully written to persistent
	 *         storage.
	 */
	public static boolean putBoolean(Context context, String key, boolean value) {
		SharedPreferences settings = context.getSharedPreferences(
				PREFERENCE_NAME, Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = settings.edit();
		editor.putBoolean(key, value);
		return editor.commit();
	}

	/**
	 * get boolean preferences, default is false
	 * 
	 * @param context
	 * @param key
	 *            The name of the preference to retrieve
	 * @return The preference value if it exists, or false. Throws
	 *         ClassCastException if there is a preference with this name that
	 *         is not a boolean
	 * @see #getBoolean(Context, String, boolean)
	 */
	public static boolean getBoolean(Context context, String key) {
		return getBoolean(context, key, false);
	}

	/**
	 * get boolean preferences
	 * 
	 * @param context
	 * @param key
	 *            The name of the preference to retrieve
	 * @param defaultValue
	 *            Value to return if this preference does not exist
	 * @return The preference value if it exists, or defValue. Throws
	 *         ClassCastException if there is a preference with this name that
	 *         is not a boolean
	 */
	public static boolean getBoolean(Context context, String key,
			boolean defaultValue) {
		SharedPreferences settings = context.getSharedPreferences(
				PREFERENCE_NAME, Context.MODE_PRIVATE);
		return settings.getBoolean(key, defaultValue);
	}

	/**
	 * 
	 * <b>@Description:<b>base64保存图片<br/>
	 * <b>@param context
	 * <b>@param key
	 * <b>@param obj<b>void<br/>
	 * <b>@Author:<b>ccy<br/>
	 * <b>@Since:<b>2014-7-25-下午5:47:09<br/>
	 */
	public static boolean saveBitmap(Context context, String key, Bitmap obj) {
		try {
			boolean flag = false;
			SharedPreferences.Editor sharedata = context.getSharedPreferences("shared_obj_", 0).edit();
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			obj.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
			String imageString = new String(Base64.encode(byteArrayOutputStream.toByteArray(), Base64.DEFAULT));
			sharedata.putString(key, imageString);
			flag = sharedata.commit();
			byteArrayOutputStream.close();
			return flag;
		} catch (Exception e) {
			e.printStackTrace();
//			LogUtil.e("json", "保存Bitmap失败");
			return false;
		}
	}

	/**
	 * 
	 * <b>@Description:<b>读取bitmap<br/>
	 * <b>@param context
	 * <b>@param key
	 * <b>@return<b>Bitmap<br/>
	 * <b>@Author:<b>ccy<br/>
	 * <b>@Since:<b>2014-7-25-下午5:46:57<br/>
	 */
	public static synchronized Bitmap readBitmap(Context context, String key) {
		try {
			SharedPreferences sharedPreferences = context.getSharedPreferences("shared_obj_", 0);
			String string = sharedPreferences.getString(key, "");
			byte[] imageBytes = Base64.decode(string.getBytes(), Base64.DEFAULT);
			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageBytes);
			return BitmapFactory.decodeStream(byteArrayInputStream);
		} catch (Exception e) {
			e.printStackTrace();
//			LogUtil.e("json", "读取Bitmap失败");
			return null;
		}
		
	}

	/**
	 * 
	 * <b>@Description:<b>必须实现序列接口<br/>
	 * <b>@param context
	 * <b>@param key
	 * <b>@param obj<b>void<br/>
	 * <b>@Author:<b>ccy<br/>
	 * <b>@Since:<b>2014-7-25-下午5:46:46<br/>
	 */
	public static boolean saveObjectExt(Context context, String key,Serializable obj) {
		try {
			// 保存对象
			SharedPreferences.Editor sharedata = context.getSharedPreferences("shared_obj_", 0).edit();
			sharedata.putString(key, getObjBase64Str(obj));
			return sharedata.commit();
		} catch (Exception e) {
			e.printStackTrace();
//			LogUtil.e("json", "保存Bitmap失败");
			return false;
		}
	}

	/**
	 * 
	 * <b>@Description:<b>读取一个对象<br/>
	 * <b>@param context
	 * <b>@param key
	 * <b>@return<b>Object<br/>
	 * <b>@Author:<b>ccy<br/>
	 * <b>@Since:<b>2014-7-25-下午5:46:32<br/>
	 */
	public static synchronized Object readObjectExt(Context context, String key) {
		try {
			SharedPreferences sharedPreferences = context.getSharedPreferences("shared_obj_", 0);
			String base64Str = sharedPreferences.getString(key, "");
			byte[] objBytes = Base64.decode(base64Str.getBytes(),Base64.DEFAULT);
			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(objBytes);
			ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
			objectInputStream.close();
			return objectInputStream.readObject();
		} catch (Exception e) {
			e.printStackTrace();
//			LogUtil.e("json", "读取对象失败");
			return null;
		}
	}

	/**
	 * 
	 * <b>@Description:<b>得到一个对象的base64字符串<br/>
	 * <b>@param obj <b>@return<b>String<br/>
	 * <b>@Author:<b>ccy<br/>
	 * <b>@Since:<b>2014-7-25-下午5:14:19<br/>
	 */
	public static String getObjBase64Str(Serializable obj) {
		try {
			// 实例化一个ByteArrayOutputStream对象，用来装载压缩后的字节文件。
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			// 然后将得到的字符数据装载到ObjectOutputStream
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
			// writeObject 方法负责写入特定类的对象的状态，以便相应的 readObject 方法可以还原它
			objectOutputStream.writeObject(obj);
			// 最后，用Base64.encode将字节文件转换成Base64编码保存在String中
			String objBase64Str = new String(Base64.encode(byteArrayOutputStream.toByteArray(), Base64.DEFAULT));
			// 关闭objectOutputStream
			objectOutputStream.close();
			return objBase64Str;
		} catch (Exception e) {
			e.printStackTrace();
//			LogUtil.e("json", "对象转换base64字符串失败");
			return null;
		}
	}

	/**
	 * 
	 * <b>@Description:<b>根据key来删除<br/>
	 * <b>@param context
	 * <b>@param key
	 * <b>@return<b>boolean<br/>
	 * <b>@Author:<b>ccy<br/>
	 * <b>@Since:<b>2014-8-21-上午11:48:12<br/>
	 */
	public static boolean removeKey(Context context, String key){
		try {
			SharedPreferences settings = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
			SharedPreferences.Editor editor = settings.edit();
			editor.remove(key);
			editor.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
