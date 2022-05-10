package com.stream;

import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		
		Optional<String> opt = Optional.of("PWC");
		if(opt.isPresent()) {
			System.out.println("data is avbl");
		}
		else {
			opt.ifPresent(s->System.out.println(s.length()));
		}
	}

}
