package com.example.testt.datamodels;

import com.google.gson.annotations.SerializedName;

public class ListLogbookResponse{

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private String status;

	public String getMessage(){
		return message;
	}

	public String getStatus(){
		return status;
	}
}