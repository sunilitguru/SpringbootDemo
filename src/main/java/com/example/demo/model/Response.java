package com.example.demo.model;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.annotation.CreatedDate;

import com.example.demo.entity.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {

	@JsonProperty("Statuscode")
	private Integer statuscode;

	@JsonProperty("Message")
	private String message;

	@JsonProperty("Data")
	private T data;
	@CreatedDate
	@JsonProperty("TimeStamp")
	private Date timeStamp;

	public Integer getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(Integer statuscode) {
		this.statuscode = statuscode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "Response [statuscode=" + statuscode + ", message=" + message + ", data=" + data + ", timeStamp="
				+ timeStamp + "]";
	}

	public Optional<User> setData(Optional<User> user_status) {
		return user_status;

	}

}
