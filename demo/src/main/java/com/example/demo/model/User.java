package com.example.demo.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
	private int id;
	private String name;
	private String email;
}
