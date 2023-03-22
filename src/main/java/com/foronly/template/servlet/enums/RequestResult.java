package com.foronly.template.servlet.enums;

/**
 * <p>
 * foronly统一请求结果的文字描述
 * </p>
 *
 * @author li_cang_long
 * @since 2023/03/22 15:02
 */
public enum RequestResult {
	SUCCESS("SUCCESS"),
	FAIL("FAIL");

	private String type;

	RequestResult(String type) {
		this.type = type;
	}

}
