package com.service;

import org.springframework.stereotype.Service;

@Service("xxx")//bean생성 id="xxx"

public class OneService {

	public void one() {
		System.out.println("OneService");
	}
		}
