package com.yaml_oauth2.practice.datamodel;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

	private String id;
	private String name;
	private String email;
	private String password;
}
