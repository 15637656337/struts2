package com.zhiyou100.action;

//import java.net.URLEncoder;

public class HelloWorldAction {
	/*private String msg;
	private String username;
	
  	public String getMessage() {
		return msg;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String execute() throws Exception {
		username=URLEncoder.encode("智游","UTF-8");
		msg="我的第一个struts2文件";
  		return "success";
  	}*/
	private String savepath;

	public String getSavepath() {
		return savepath;
	}

	public void setSavepath(String savepath) {
		this.savepath = savepath;
	}
	
	public String execute() {
		return "success";
	}
}
