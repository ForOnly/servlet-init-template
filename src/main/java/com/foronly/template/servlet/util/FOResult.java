package com.foronly.template.servlet.util;

import com.foronly.template.servlet.constant.CommonConstants;
import com.foronly.template.servlet.enums.RequestResult;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * foronly平台统一返回结果封装
 * </p>
 *
 * @author li_cang_long
 * @since 2023/03/22 15:02
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class FOResult<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private int code;

	@Getter
	@Setter
	private RequestResult type;

	@Getter
	@Setter
	private String msg;

	@Getter
	@Setter
	private T data;

	public static <T> FOResult<T> ok() {
		return restResult(null, CommonConstants.SUCCESS, "ok", RequestResult.SUCCESS);
	}

	public static <T> FOResult<T> ok(T data) {
		return restResult(data, CommonConstants.SUCCESS, "ok", RequestResult.SUCCESS);
	}

	public static <T> FOResult<T> ok(T data, String msg) {
		return restResult(data, CommonConstants.SUCCESS, msg, RequestResult.SUCCESS);
	}

	public static FOResult<?> ok(String msg) {
		return restResult(null, CommonConstants.SUCCESS, msg, RequestResult.SUCCESS);
	}

	public static <T> FOResult<T> failed() {
		return restResult(null, CommonConstants.FAIL, "error", RequestResult.FAIL);
	}

	public static FOResult<?> failed(String msg) {
		return restResult(null, CommonConstants.FAIL, msg, RequestResult.FAIL);
	}

	public static <T> FOResult<T> failed(T data) {
		return restResult(data, CommonConstants.FAIL, "error", RequestResult.FAIL);
	}

	public static <T> FOResult<T> failed(T data, String msg) {
		return restResult(data, CommonConstants.FAIL, msg, RequestResult.FAIL);
	}

	public static <T> FOResult<T> restResult(T data, int code, String msg, RequestResult type) {
		FOResult<T> apiResult = new FOResult<>();
		apiResult.setCode(code);
		apiResult.setData(data);
		apiResult.setMsg(msg);
		apiResult.setType(type);
		return apiResult;
	}

}
