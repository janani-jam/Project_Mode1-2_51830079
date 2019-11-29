package com.custapp.model.persistence;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Demo {
 public static void main(String[] args) {
	BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder(12);
	System.out.println(bCryptPasswordEncoder.encode("jam123"));
	System.out.println(bCryptPasswordEncoder.encode("bhaa123"));
	System.out.println(bCryptPasswordEncoder.encode("boo123"));
	System.out.println(bCryptPasswordEncoder.encode("gowsy123"));
}
}
